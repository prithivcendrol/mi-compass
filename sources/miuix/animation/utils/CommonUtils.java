package miuix.animation.utils;

import android.animation.ArgbEvaluator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import miuix.animation.IAnimTarget;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;

public class CommonUtils {
    private static final Class<?>[] BUILT_IN = {String.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Short.TYPE, Short.class, Float.TYPE, Float.class, Double.TYPE, Double.class};
    public static final String TAG = "miuix_anim";
    public static final int UNIT_SECOND = 1000;
    public static final ArgbEvaluator sArgbEvaluator = new ArgbEvaluator();
    private static ArrayMap<String, Long> sTimeStatArray = new ArrayMap<>();
    private static float sTouchSlop;

    private static class OnPreDrawTask implements ViewTreeObserver.OnPreDrawListener {
        Runnable mTask;
        WeakReference<View> mView;

        OnPreDrawTask(Runnable runnable) {
            this.mTask = runnable;
        }

        public boolean onPreDraw() {
            View view = this.mView.get();
            if (view != null) {
                Runnable runnable = this.mTask;
                if (runnable != null) {
                    runnable.run();
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            this.mTask = null;
            return true;
        }

        public void start(View view) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.mView = new WeakReference<>(view);
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    private CommonUtils() {
    }

    public static <T> void addTo(Collection<T> collection, Collection<T> collection2) {
        for (T next : collection) {
            if (!collection2.contains(next)) {
                collection2.add(next);
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Log.w(TAG, "close " + closeable + " failed", e);
            }
        }
    }

    public static Bitmap compressImage(Bitmap bitmap, int i, int i2) {
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap2 = null;
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i2;
            bitmap2 = BitmapFactory.decodeStream(parseToInputStream(byteArrayOutputStream), (Rect) null, options);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder();
            }
        } catch (Exception e2) {
            Log.w(TAG, "TintDrawable.compressImage failed, " + e2);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                Log.i(TAG, "IO close fail, " + e4);
            }
            throw th;
        }
        return bitmap2;
        sb.append("IO close fail, ");
        sb.append(e);
        Log.i(TAG, sb.toString());
        return bitmap2;
    }

    public static double getDistance(float f, float f2, float f3, float f4) {
        return Math.sqrt(Math.pow((double) (f3 - f), 2.0d) + Math.pow((double) (f4 - f2), 2.0d));
    }

    public static <T> T getLocal(ThreadLocal<T> threadLocal, Class cls) {
        T t = threadLocal.get();
        if (t != null || cls == null) {
            return t;
        }
        T acquire = ObjectPool.acquire(cls, new Object[0]);
        threadLocal.set(acquire);
        return acquire;
    }

    public static void getRect(IAnimTarget iAnimTarget, RectF rectF) {
        rectF.left = iAnimTarget.getValue(ViewProperty.f7495X);
        rectF.top = iAnimTarget.getValue(ViewProperty.f7496Y);
        rectF.right = rectF.left + iAnimTarget.getValue(ViewProperty.WIDTH);
        rectF.bottom = rectF.top + iAnimTarget.getValue(ViewProperty.HEIGHT);
    }

    public static float getSize(IAnimTarget iAnimTarget, FloatProperty floatProperty) {
        if (floatProperty == ViewProperty.f7495X) {
            floatProperty = ViewProperty.WIDTH;
        } else if (floatProperty == ViewProperty.f7496Y) {
            floatProperty = ViewProperty.HEIGHT;
        } else if (!(floatProperty == ViewProperty.WIDTH || floatProperty == ViewProperty.HEIGHT)) {
            floatProperty = null;
        }
        if (floatProperty == null) {
            return 0.0f;
        }
        return iAnimTarget.getValue(floatProperty);
    }

    public static float getTouchSlop(View view) {
        if (sTouchSlop == 0.0f && view != null) {
            sTouchSlop = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        }
        return sTouchSlop;
    }

    public static boolean hasFlags(long j, long j2) {
        return (j & j2) != 0;
    }

    public static <T> boolean inArray(T[] tArr, T t) {
        if (!(t == null || tArr == null || tArr.length <= 0)) {
            for (T equals : tArr) {
                if (equals.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean isArrayEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean isBuiltInClass(Class<?> cls) {
        return inArray(BUILT_IN, cls);
    }

    public static <K, V> StringBuilder mapToString(Map<K, V> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                sb.append(10);
                sb.append(str);
                sb.append(next.getKey());
                sb.append('=');
                sb.append(next.getValue());
            }
            sb.append(10);
        }
        sb.append('}');
        return sb;
    }

    public static String mapsToString(Map[] mapArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i = 0;
        while (true) {
            int length = mapArr.length;
            sb.append(10);
            if (i < length) {
                sb.append(i);
                sb.append('.');
                sb.append(mapToString(mapArr[i], "    "));
                i++;
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    @SafeVarargs
    public static <T> T[] mergeArray(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return tArr2;
        }
        if (tArr2 == null) {
            return tArr;
        }
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, newInstance, 0, tArr.length);
        System.arraycopy(tArr2, 0, newInstance, tArr.length, tArr2.length);
        return (Object[]) newInstance;
    }

    public static ByteArrayInputStream parseToInputStream(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public static String readProp(String str) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        IOException e;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
                try {
                    Log.i(TAG, "readProp failed", e);
                    closeQuietly(bufferedReader);
                    closeQuietly(inputStreamReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(bufferedReader);
                    closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                closeQuietly(bufferedReader);
                closeQuietly(inputStreamReader);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                closeQuietly(bufferedReader);
                closeQuietly(inputStreamReader);
                return readLine;
            } catch (IOException e3) {
                e = e3;
                Log.i(TAG, "readProp failed", e);
                closeQuietly(bufferedReader);
                closeQuietly(inputStreamReader);
                return "";
            }
        } catch (IOException e4) {
            inputStreamReader = null;
            e = e4;
            bufferedReader = null;
            Log.i(TAG, "readProp failed", e);
            closeQuietly(bufferedReader);
            closeQuietly(inputStreamReader);
            return "";
        } catch (Throwable th3) {
            inputStreamReader = null;
            th = th3;
            bufferedReader = null;
            closeQuietly(bufferedReader);
            closeQuietly(inputStreamReader);
            throw th;
        }
    }

    public static void runOnPreDraw(View view, Runnable runnable) {
        if (view != null) {
            new OnPreDrawTask(runnable).start(view);
        }
    }

    public static void timeStatBegin(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    sTimeStatArray.put(str, Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    public static void timeStatClear() {
        sTimeStatArray.clear();
    }

    public static long timeStatEnd(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - (sTimeStatArray.get(str) != null ? currentTimeMillis : 0);
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("打印当前用时： TAG = " + str + " 用时为 " + j, new Object[0]);
        }
        return j;
    }

    public static float toFloatValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        throw new IllegalArgumentException("toFloat failed, value is " + obj);
    }

    public static int[] toIntArray(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = (int) fArr[i];
        }
        return iArr;
    }

    public static int toIntValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        throw new IllegalArgumentException("toFloat failed, value is " + obj);
    }
}
