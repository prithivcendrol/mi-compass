package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.p008os.C0574a;
import androidx.core.view.C0685f;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1049n;
import androidx.lifecycle.C1063w;
import p063k.C1774g;

/* renamed from: androidx.core.app.g */
public class C0499g extends Activity implements C1048m, C0685f.C0686a {

    /* renamed from: d */
    private C1774g<Class<Object>, Object> f2480d = new C1774g<>();

    /* renamed from: e */
    private C1049n f2481e = new C1049n(this);

    /* renamed from: P */
    private static boolean m2092P(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
            case 2:
                return C0574a.m2384c();
            case 3:
                return Build.VERSION.SDK_INT >= 29;
            case 4:
                return Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final boolean mo2557O(String[] strArr) {
        return !m2092P(strArr);
    }

    /* renamed from: c */
    public C1035g mo252c() {
        return this.f2481e;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0685f.m2714d(decorView, keyEvent)) {
            return C0685f.m2715e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0685f.m2714d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo562j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1063w.m4284g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f2481e.mo3796j(C1035g.C1038c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
