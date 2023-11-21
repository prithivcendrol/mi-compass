package miuix.animation.internal;

import android.os.Process;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolUtil {
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 30;
    private static final int KEEP_POOL_SIZE;
    public static final int MAX_SPLIT_COUNT;
    private static final ThreadPoolExecutor sCacheThread;
    /* access modifiers changed from: private */
    public static final Executor sSingleThread = Executors.newSingleThreadExecutor(getThreadFactory("WorkThread"));
    public static int sThreadPriority = -2;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int i = (availableProcessors * 2) + 1;
        MAX_SPLIT_COUNT = i;
        int i2 = availableProcessors < 4 ? 0 : (availableProcessors / 2) + 1;
        KEEP_POOL_SIZE = i2;
        sCacheThread = new ThreadPoolExecutor(i2, i + 3, 30, TimeUnit.SECONDS, new SynchronousQueue(), getThreadFactory("AnimThread"), new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ThreadPoolUtil.sSingleThread.execute(runnable);
            }
        });
    }

    public static void getSplitCount(int i, int[] iArr) {
        int max = Math.max(i / AnimTask.MAX_SINGLE_TASK_SIZE, 1);
        int i2 = MAX_SPLIT_COUNT;
        if (max > i2) {
            max = i2;
        }
        iArr[0] = max;
        iArr[1] = (int) Math.ceil((double) (((float) i) / ((float) max)));
    }

    private static ThreadFactory getThreadFactory(final String str) {
        return new ThreadFactory() {
            final AtomicInteger threadNumber = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, str + "-" + this.threadNumber.getAndIncrement()) {
                    public void run() {
                        Process.setThreadPriority(ThreadPoolUtil.sThreadPriority);
                        super.run();
                    }
                };
            }
        };
    }

    public static void post(Runnable runnable) {
        sCacheThread.execute(runnable);
    }

    public static void setThreadPriority(int i) {
        sThreadPriority = i;
    }
}
