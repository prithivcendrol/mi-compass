package miuix.animation.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import miuix.animation.Folme;

public class ObjectPool {
    private static final long DELAY = 5000;
    private static final int MAX_POOL_SIZE = 10;
    private static final ConcurrentHashMap<Class<?>, Cache> sCacheMap = new ConcurrentHashMap<>();
    private static volatile Handler sMainHandler;

    private static class Cache {
        final ConcurrentHashMap<Object, Boolean> mCacheRecord;
        final ConcurrentLinkedQueue<Object> pool;
        final Runnable shrinkTask;

        private Cache() {
            this.pool = new ConcurrentLinkedQueue<>();
            this.mCacheRecord = new ConcurrentHashMap<>();
            this.shrinkTask = new Runnable() {
                public void run() {
                    Cache.this.shrink();
                }
            };
        }

        /* access modifiers changed from: package-private */
        public <T> T acquireObject(Class<T> cls, Object... objArr) {
            T poll = this.pool.poll();
            if (poll == null) {
                return cls != null ? ObjectPool.createObject(cls, objArr) : poll;
            }
            this.mCacheRecord.remove(Integer.valueOf(System.identityHashCode(poll)));
            return poll;
        }

        /* access modifiers changed from: package-private */
        public void releaseObject(Object obj) {
            if (this.mCacheRecord.putIfAbsent(Integer.valueOf(System.identityHashCode(obj)), Boolean.TRUE) == null) {
                this.pool.add(obj);
                Handler mainHandler = ObjectPool.getMainHandler();
                if (mainHandler != null) {
                    mainHandler.removeCallbacks(this.shrinkTask);
                    if (this.pool.size() > 10) {
                        mainHandler.postDelayed(this.shrinkTask, ObjectPool.DELAY);
                        return;
                    }
                    return;
                }
                Log.w(CommonUtils.TAG, "ObjectPool.releaseObject handler is null! looper: " + Looper.myLooper());
                this.shrinkTask.run();
            }
        }

        /* access modifiers changed from: package-private */
        public void shrink() {
            Object poll;
            while (this.pool.size() > 10 && (poll = this.pool.poll()) != null) {
                this.mCacheRecord.remove(Integer.valueOf(System.identityHashCode(poll)));
            }
        }
    }

    public interface IPoolObject {
        void clear();
    }

    static {
        createMainHandler(Folme.getLooper());
    }

    private ObjectPool() {
    }

    public static <T> T acquire(Class<T> cls, Object... objArr) {
        return getObjectCache(cls, true).acquireObject(cls, objArr);
    }

    public static void createMainHandler(Looper looper) {
        if (looper != null) {
            sMainHandler = new Handler(looper);
        }
    }

    /* access modifiers changed from: private */
    public static Object createObject(Class<?> cls, Object... objArr) {
        try {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (i < length) {
                Constructor constructor = declaredConstructors[i];
                if (constructor.getParameterTypes().length != objArr.length) {
                    i++;
                } else {
                    constructor.setAccessible(true);
                    return constructor.newInstance(objArr);
                }
            }
            return null;
        } catch (Exception e) {
            Log.w(CommonUtils.TAG, "ObjectPool.createObject failed, clz = " + cls, e);
            return null;
        }
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    private static Cache getObjectCache(Class<?> cls, boolean z) {
        ConcurrentHashMap<Class<?>, Cache> concurrentHashMap = sCacheMap;
        Cache cache = concurrentHashMap.get(cls);
        if (cache != null || !z) {
            return cache;
        }
        Cache cache2 = new Cache();
        Cache putIfAbsent = concurrentHashMap.putIfAbsent(cls, cache2);
        return putIfAbsent != null ? putIfAbsent : cache2;
    }

    public static void release(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (obj instanceof IPoolObject) {
                ((IPoolObject) obj).clear();
            } else if (obj instanceof Collection) {
                ((Collection) obj).clear();
            } else if (obj instanceof Map) {
                ((Map) obj).clear();
            }
            Cache objectCache = getObjectCache(cls, false);
            if (objectCache != null) {
                objectCache.releaseObject(obj);
            }
        }
    }
}
