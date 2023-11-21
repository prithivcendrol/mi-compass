package miuix.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;

@Keep
class ExtendedVibrator implements C2404i {
    private static final String TAG = "ExtendedVibrator";

    static {
        initialize();
    }

    private ExtendedVibrator() {
    }

    private static void initialize() {
        if (PlatformConstants.VERSION < 0) {
            Log.w(TAG, "MiuiHapticFeedbackConstants not found.");
            return;
        }
        HapticCompat.registerProvider(new ExtendedVibrator());
        Log.i(TAG, "setup ExtendedVibrator success.");
    }

    public boolean performHapticFeedback(View view, int i) {
        if (i == C2403h.f9366e) {
            return view.performHapticFeedback(2);
        }
        return false;
    }
}
