package miuix.view;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miuix.core.util.SystemProperties;

public class HapticCompat {

    /* renamed from: a */
    public static String f9346a = SystemProperties.get("sys.haptic.version", "1.0");

    /* renamed from: b */
    private static List<C2404i> f9347b = new ArrayList();

    /* renamed from: c */
    private static final Executor f9348c = Executors.newSingleThreadExecutor();

    /* renamed from: miuix.view.HapticCompat$a */
    private static class C2395a implements Runnable {

        /* renamed from: d */
        private final WeakReference<View> f9349d;

        /* renamed from: e */
        private final int f9350e;

        public C2395a(View view, int i) {
            this.f9349d = new WeakReference<>(view);
            this.f9350e = i;
        }

        public void run() {
            View view = this.f9349d.get();
            if (view != null && view.isAttachedToWindow()) {
                try {
                    HapticCompat.performHapticFeedback(view, this.f9350e);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        m10232d("miuix.view.LinearVibrator", "miuix.view.ExtendedVibrator");
    }

    /* renamed from: a */
    private static boolean m10229a(int i) {
        int i2 = C2403h.f9364c;
        if (i >= i2 && i <= C2403h.f9365d) {
            return true;
        }
        Log.e("HapticCompat", String.format("Illegal haptic version 1 feedback constant, should be in range [0x%08x..0x%08x]", new Object[]{Integer.valueOf(i2), Integer.valueOf(C2403h.f9365d)}));
        return false;
    }

    /* renamed from: b */
    private static boolean m10230b(int i) {
        int i2 = C2403h.f9382u;
        if (i >= i2 && i <= C2403h.f9383v) {
            return true;
        }
        Log.e("HapticCompat", String.format("Illegal haptic version 2 feedback constant, should be in range [0x%08x..0x%08x]", new Object[]{Integer.valueOf(i2), Integer.valueOf(C2403h.f9383v)}));
        return false;
    }

    /* renamed from: c */
    public static boolean m10231c(String str) {
        return f9346a.equals(str);
    }

    /* renamed from: d */
    private static void m10232d(String... strArr) {
        for (String str : strArr) {
            Log.i("HapticCompat", "loading provider: " + str);
            try {
                Class.forName(str, true, HapticCompat.class.getClassLoader());
            } catch (ClassNotFoundException e) {
                Log.w("HapticCompat", String.format("load provider %s failed.", new Object[]{str}), e);
            }
        }
    }

    /* renamed from: e */
    public static boolean m10233e(View view, int i, int i2) {
        if (m10231c("2.0")) {
            if (!m10230b(i)) {
                return false;
            }
            return performHapticFeedback(view, i);
        } else if (!m10231c("1.0")) {
            Log.e("HapticCompat", "Unexpected haptic version: " + f9346a);
            return false;
        } else if (!m10229a(i2)) {
            return false;
        } else {
            return performHapticFeedback(view, i2);
        }
    }

    @Keep
    public static boolean performHapticFeedback(View view, int i) {
        if (view == null) {
            Log.e("HapticCompat", "performHapticFeedback: view is null!");
            return false;
        } else if (i < 268435456) {
            Log.i("HapticCompat", String.format("perform haptic: 0x%08x", new Object[]{Integer.valueOf(i)}));
            return view.performHapticFeedback(i);
        } else {
            int i2 = C2403h.f9363b;
            if (i > i2) {
                Log.w("HapticCompat", String.format("illegal feedback constant, should be in range [0x%08x..0x%08x]", new Object[]{268435456, Integer.valueOf(i2)}));
                return false;
            }
            for (C2404i performHapticFeedback : f9347b) {
                if (performHapticFeedback.performHapticFeedback(view, i)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Keep
    public static void performHapticFeedbackAsync(View view, int i) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            performHapticFeedback(view, i);
        } else {
            f9348c.execute(new C2395a(view, i));
        }
    }

    @Keep
    public static void performHapticFeedbackAsync(View view, int i, int i2) {
        if (m10231c("2.0")) {
            if (m10230b(i)) {
                performHapticFeedbackAsync(view, i);
            }
        } else if (!m10231c("1.0")) {
            Log.e("HapticCompat", "Unexpected haptic version: " + f9346a);
        } else if (m10229a(i2)) {
            performHapticFeedbackAsync(view, i2);
        }
    }

    @Keep
    static void registerProvider(C2404i iVar) {
        f9347b.add(iVar);
    }
}
