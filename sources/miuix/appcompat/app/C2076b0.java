package miuix.appcompat.app;

import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* renamed from: miuix.appcompat.app.b0 */
public interface C2076b0 {
    /* renamed from: a */
    static boolean m8270a(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).mo7383k(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static boolean m8271b(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).mo7382h(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m8272c(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    static boolean m8273g(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).mo7379d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static boolean m8274i(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    static boolean m8275j(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    static boolean m8276l(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).mo7381f(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    static void m8277m(FragmentManager fragmentManager, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0)) {
                ((C2076b0) next).onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }

    /* renamed from: n */
    static boolean m8278n(FragmentManager fragmentManager, int i, int i2, KeyEvent keyEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).onKeyMultiple(i, i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    static boolean m8279o(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next.mo3287n0() && !next.mo3290o0() && next.mo3304s0() && (next instanceof C2076b0) && ((C2076b0) next).mo7380e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    boolean mo7379d(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: e */
    boolean mo7380e(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: f */
    boolean mo7381f(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: h */
    boolean mo7382h(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: k */
    boolean mo7383k(KeyEvent keyEvent) {
        return false;
    }

    boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
    }
}
