package miuix.animation.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LogUtils {
    private static final String COMMA = ", ";
    public static final boolean MORE_LOG_ENABLE = false;
    private static volatile boolean sIsLogEnabled;
    private static final Handler sLogHandler;
    /* access modifiers changed from: private */
    public static final Map<Integer, String> sTag = new ConcurrentHashMap();
    private static final HandlerThread sThread;

    static {
        HandlerThread handlerThread = new HandlerThread("LogThread");
        sThread = handlerThread;
        handlerThread.start();
        sLogHandler = new Handler(handlerThread.getLooper()) {
            public void handleMessage(Message message) {
                if (message.what == 0) {
                    Log.d((String) LogUtils.sTag.get(Integer.valueOf(message.arg1)), "thread log, " + ((String) message.obj));
                }
                message.obj = null;
            }
        };
    }

    private LogUtils() {
    }

    public static void debug(String str, Object... objArr) {
        if (sIsLogEnabled) {
            if (objArr.length > 0) {
                StringBuilder sb = new StringBuilder(COMMA);
                int length = sb.length();
                for (Object obj : objArr) {
                    if (sb.length() > length) {
                        sb.append(COMMA);
                    }
                    sb.append(obj);
                }
                str = str + sb.toString();
            }
            Log.i(CommonUtils.TAG, str);
        }
    }

    public static void getLogEnableInfo() {
        String str = "";
        try {
            String readProp = CommonUtils.readProp("log.tag.folme.level");
            if (readProp != null) {
                str = readProp;
            }
        } catch (Exception e) {
            Log.i(CommonUtils.TAG, "can not access property log.tag.folme.level, no log", e);
        }
        sIsLogEnabled = str.equals("D");
    }

    public static String getStackTrace(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return Arrays.toString(Arrays.asList(stackTrace).subList(3, Math.min(stackTrace.length, i + 4)).toArray());
    }

    public static boolean isLogEnabled() {
        return sIsLogEnabled;
    }

    public static void logThread(String str, String str2) {
        Message obtainMessage = sLogHandler.obtainMessage(0);
        obtainMessage.obj = str2;
        int hashCode = str.hashCode();
        obtainMessage.arg1 = hashCode;
        sTag.put(Integer.valueOf(hashCode), str);
        obtainMessage.sendToTarget();
    }
}
