package miuix.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import miui.util.HapticFeedbackUtil;
import p063k.C1775h;

@Keep
class LinearVibrator implements C2404i {
    private static final String TAG = "LinearVibrator";
    private final C1775h<Integer> mIds = new C1775h<>();

    static {
        initialize();
    }

    private LinearVibrator() {
        buildIds();
    }

    private void buildIds() {
        this.mIds.mo6175a(C2403h.f9367f, 268435456);
        this.mIds.mo6175a(C2403h.f9368g, 268435457);
        this.mIds.mo6175a(C2403h.f9369h, 268435458);
        this.mIds.mo6175a(C2403h.f9370i, 268435459);
        this.mIds.mo6175a(C2403h.f9371j, 268435460);
        this.mIds.mo6175a(C2403h.f9372k, 268435461);
        this.mIds.mo6175a(C2403h.f9373l, 268435462);
        this.mIds.mo6175a(C2403h.f9374m, 268435463);
        this.mIds.mo6175a(C2403h.f9375n, 268435464);
        this.mIds.mo6175a(C2403h.f9376o, 268435465);
        int i = PlatformConstants.VERSION;
        if (i >= 2) {
            this.mIds.mo6175a(C2403h.f9377p, 268435466);
            this.mIds.mo6175a(C2403h.f9378q, 268435467);
            this.mIds.mo6175a(C2403h.f9379r, 268435468);
            if (i >= 3) {
                this.mIds.mo6175a(C2403h.f9380s, 268435469);
                if (i >= 4) {
                    this.mIds.mo6175a(C2403h.f9381t, 268435470);
                    if (i >= 5) {
                        this.mIds.mo6175a(C2403h.f9384w, 268435471);
                        this.mIds.mo6175a(C2403h.f9385x, 268435472);
                        this.mIds.mo6175a(C2403h.f9386y, 268435473);
                        this.mIds.mo6175a(C2403h.f9387z, 268435474);
                        this.mIds.mo6175a(C2403h.f9356A, 268435475);
                        this.mIds.mo6175a(C2403h.f9357B, 268435476);
                        this.mIds.mo6175a(C2403h.f9358C, 268435477);
                        this.mIds.mo6175a(C2403h.f9359D, 268435478);
                        this.mIds.mo6175a(C2403h.f9360E, 268435479);
                        this.mIds.mo6175a(C2403h.f9361F, 268435480);
                    }
                }
            }
        }
    }

    private static void initialize() {
        boolean z;
        if (PlatformConstants.VERSION < 1) {
            Log.w(TAG, "MiuiHapticFeedbackConstants not found or not compatible for LinearVibrator.");
            return;
        }
        try {
            z = HapticFeedbackUtil.isSupportLinearMotorVibrate();
        } catch (Throwable th) {
            Log.w(TAG, "MIUI Haptic Implementation is not available", th);
            z = false;
        }
        if (!z) {
            Log.w(TAG, "linear motor is not supported in this platform.");
            return;
        }
        HapticCompat.registerProvider(new LinearVibrator());
        Log.i(TAG, "setup LinearVibrator success.");
    }

    /* access modifiers changed from: package-private */
    public int obtainFeedBack(int i) {
        int g = this.mIds.mo6181g(i);
        if (g >= 0) {
            return this.mIds.mo6185k(g).intValue();
        }
        return -1;
    }

    public boolean performHapticFeedback(View view, int i) {
        String format;
        int g = this.mIds.mo6181g(i);
        if (g < 0) {
            format = String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", new Object[]{Integer.valueOf(i), C2403h.m10248b(i), Integer.valueOf(PlatformConstants.VERSION)});
        } else {
            int intValue = this.mIds.mo6185k(g).intValue();
            if (HapticFeedbackUtil.isSupportLinearMotorVibrate(intValue)) {
                return view.performHapticFeedback(intValue);
            }
            format = String.format("unsupported feedback: 0x%08x. platform version: %d", new Object[]{Integer.valueOf(intValue), Integer.valueOf(PlatformConstants.VERSION)});
        }
        Log.w(TAG, format);
        return false;
    }

    public boolean supportLinearMotor(int i) {
        String format;
        int g = this.mIds.mo6181g(i);
        if (g < 0) {
            format = String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", new Object[]{Integer.valueOf(i), C2403h.m10248b(i), Integer.valueOf(PlatformConstants.VERSION)});
        } else {
            int intValue = this.mIds.mo6185k(g).intValue();
            if (HapticFeedbackUtil.isSupportLinearMotorVibrate(intValue)) {
                return HapticFeedbackUtil.isSupportLinearMotorVibrate(intValue);
            }
            format = String.format("unsupported feedback: 0x%08x. platform version: %d", new Object[]{Integer.valueOf(intValue), Integer.valueOf(PlatformConstants.VERSION)});
        }
        Log.w(TAG, format);
        return false;
    }
}
