package p080m4;

import android.content.Context;
import android.os.Build;
import android.p006os.VibrationAttributes;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miui.util.HapticFeedbackUtil;
import miuix.view.PlatformConstants;

/* renamed from: m4.a */
public class C1963a {

    /* renamed from: b */
    private static boolean f7391b;

    /* renamed from: c */
    private static boolean f7392c;

    /* renamed from: d */
    private static boolean f7393d;

    /* renamed from: e */
    private static boolean f7394e;

    /* renamed from: f */
    private static boolean f7395f;

    /* renamed from: g */
    private static boolean f7396g;

    /* renamed from: h */
    private static boolean f7397h = true;

    /* renamed from: i */
    private static boolean f7398i = true;

    /* renamed from: j */
    private static boolean f7399j = true;

    /* renamed from: k */
    private static boolean f7400k = true;

    /* renamed from: l */
    private static final Executor f7401l = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    private HapticFeedbackUtil f7402a;

    static {
        Class<String> cls = String.class;
        if (PlatformConstants.VERSION >= 1) {
            try {
                f7391b = HapticFeedbackUtil.isSupportLinearMotorVibrate();
            } catch (Throwable th) {
                Log.w("HapticFeedbackCompat", "MIUI Haptic Implementation is not available", th);
                f7391b = false;
            }
            if (f7391b) {
                Class<HapticFeedbackUtil> cls2 = HapticFeedbackUtil.class;
                try {
                    cls2.getMethod("performHapticFeedback", new Class[]{Integer.TYPE, Double.TYPE, cls});
                    f7392c = true;
                } catch (Throwable th2) {
                    Log.w("HapticFeedbackCompat", "Not support haptic with reason", th2);
                    f7392c = false;
                }
                Class<HapticFeedbackUtil> cls3 = HapticFeedbackUtil.class;
                try {
                    cls3.getMethod("isSupportExtHapticFeedback", new Class[]{Integer.TYPE});
                    f7394e = true;
                } catch (Throwable unused) {
                    f7394e = false;
                }
                Class<HapticFeedbackUtil> cls4 = HapticFeedbackUtil.class;
                try {
                    cls4.getMethod("performExtHapticFeedback", new Class[]{Integer.TYPE, Boolean.TYPE});
                    f7395f = true;
                } catch (Throwable unused2) {
                    f7395f = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("stop", new Class[0]);
                    f7396g = true;
                } catch (Throwable unused3) {
                    f7396g = false;
                }
                Class<HapticFeedbackUtil> cls5 = HapticFeedbackUtil.class;
                try {
                    cls5.getMethod("performExtHapticFeedback", new Class[]{Integer.TYPE, Double.TYPE, cls});
                    f7393d = true;
                } catch (Throwable th3) {
                    Log.w("HapticFeedbackCompat", "Not support ext haptic with reason", th3);
                    f7393d = false;
                }
            }
        }
        if (PlatformConstants.romHapticVersion >= 1.2d && Build.VERSION.SDK_INT >= 30) {
            Class<HapticFeedbackUtil> cls6 = HapticFeedbackUtil.class;
            try {
                cls6.getMethod("performExtHapticFeedback", new Class[]{VibrationAttributes.class, Integer.TYPE});
            } catch (Exception unused4) {
            }
            Class<HapticFeedbackUtil> cls7 = HapticFeedbackUtil.class;
            try {
                cls7.getMethod("performExtHapticFeedback", new Class[]{VibrationAttributes.class, Integer.TYPE, Boolean.TYPE});
            } catch (Exception unused5) {
            }
            Class<HapticFeedbackUtil> cls8 = HapticFeedbackUtil.class;
            try {
                Class cls9 = Integer.TYPE;
                cls8.getMethod("performHapticFeedback", new Class[]{VibrationAttributes.class, cls9, Boolean.TYPE, cls9});
            } catch (Exception unused6) {
            }
            Class<HapticFeedbackUtil> cls10 = HapticFeedbackUtil.class;
            try {
                cls10.getMethod("performHapticFeedback", new Class[]{VibrationAttributes.class, Integer.TYPE, Double.TYPE, cls});
            } catch (Exception unused7) {
            }
        }
    }

    public C1963a(Context context) {
        this(context, true);
    }

    @Deprecated
    public C1963a(Context context, boolean z) {
        if (PlatformConstants.VERSION < 1) {
            Log.w("HapticFeedbackCompat", "MiuiHapticFeedbackConstants not found or not compatible for LinearVibrator.");
        } else if (!f7391b) {
            Log.w("HapticFeedbackCompat", "linear motor is not supported in this platform.");
        } else {
            this.f7402a = new HapticFeedbackUtil(context, z);
        }
    }

    /* renamed from: a */
    public boolean mo6600a(int i) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f7402a;
        if (hapticFeedbackUtil != null) {
            return hapticFeedbackUtil.performExtHapticFeedback(i);
        }
        return false;
    }

    /* renamed from: b */
    public void mo6601b() {
        HapticFeedbackUtil hapticFeedbackUtil = this.f7402a;
        if (hapticFeedbackUtil == null) {
            return;
        }
        if (f7396g) {
            hapticFeedbackUtil.stop();
        } else {
            hapticFeedbackUtil.release();
        }
    }

    /* renamed from: c */
    public boolean mo6602c() {
        return f7391b;
    }
}
