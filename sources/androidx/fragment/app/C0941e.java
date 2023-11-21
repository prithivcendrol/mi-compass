package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0090f;
import androidx.lifecycle.C1041h0;
import androidx.lifecycle.C1043i0;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1055s;
import p040g0.C1594f;

/* renamed from: androidx.fragment.app.e */
public class C0941e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: f0 */
    private Handler f3221f0;

    /* renamed from: g0 */
    private Runnable f3222g0 = new C0942a();

    /* renamed from: h0 */
    private DialogInterface.OnCancelListener f3223h0 = new C0943b();
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public DialogInterface.OnDismissListener f3224i0 = new C0944c();

    /* renamed from: j0 */
    private int f3225j0 = 0;

    /* renamed from: k0 */
    private int f3226k0 = 0;

    /* renamed from: l0 */
    private boolean f3227l0 = true;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f3228m0 = true;

    /* renamed from: n0 */
    private int f3229n0 = -1;

    /* renamed from: o0 */
    private boolean f3230o0;

    /* renamed from: p0 */
    private C1055s<C1048m> f3231p0 = new C0945d();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public Dialog f3232q0;

    /* renamed from: r0 */
    private boolean f3233r0;

    /* renamed from: s0 */
    private boolean f3234s0;

    /* renamed from: t0 */
    private boolean f3235t0;

    /* renamed from: u0 */
    private boolean f3236u0 = false;

    /* renamed from: androidx.fragment.app.e$a */
    class C0942a implements Runnable {
        C0942a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0941e.this.f3224i0.onDismiss(C0941e.this.f3232q0);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class C0943b implements DialogInterface.OnCancelListener {
        C0943b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0941e.this.f3232q0 != null) {
                C0941e eVar = C0941e.this;
                eVar.onCancel(eVar.f3232q0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class C0944c implements DialogInterface.OnDismissListener {
        C0944c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0941e.this.f3232q0 != null) {
                C0941e eVar = C0941e.this;
                eVar.onDismiss(eVar.f3232q0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    class C0945d implements C1055s<C1048m> {
        C0945d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo3527a(C1048m mVar) {
            if (mVar != null && C0941e.this.f3228m0) {
                View E1 = C0941e.this.mo3209E1();
                if (E1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0941e.this.f3232q0 != null) {
                    if (FragmentManager.m3651H0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C0941e.this.f3232q0);
                    }
                    C0941e.this.f3232q0.setContentView(E1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    class C0946e extends C0971l {

        /* renamed from: d */
        final /* synthetic */ C0971l f3241d;

        C0946e(C0971l lVar) {
            this.f3241d = lVar;
        }

        /* renamed from: d */
        public View mo3330d(int i) {
            return this.f3241d.mo3331g() ? this.f3241d.mo3330d(i) : C0941e.this.mo3517a2(i);
        }

        /* renamed from: g */
        public boolean mo3331g() {
            return this.f3241d.mo3331g() || C0941e.this.mo3518b2();
        }
    }

    /* renamed from: X1 */
    private void m3866X1(boolean z, boolean z2, boolean z3) {
        if (!this.f3234s0) {
            this.f3234s0 = true;
            this.f3235t0 = false;
            Dialog dialog = this.f3232q0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3232q0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3221f0.getLooper()) {
                        onDismiss(this.f3232q0);
                    } else {
                        this.f3221f0.post(this.f3222g0);
                    }
                }
            }
            this.f3233r0 = true;
            if (this.f3229n0 >= 0) {
                if (z3) {
                    mo3250U().mo3371a1(this.f3229n0, 1);
                } else {
                    mo3250U().mo3368Y0(this.f3229n0, 1, z);
                }
                this.f3229n0 = -1;
                return;
            }
            C0949f0 o = mo3250U().mo3392o();
            o.mo3565q(true);
            o.mo3435n(this);
            if (z3) {
                o.mo3431i();
            } else if (z) {
                o.mo3430h();
            } else {
                o.mo3429g();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c2 */
    private void m3867c2(Bundle bundle) {
        if (this.f3228m0 && !this.f3236u0) {
            try {
                this.f3230o0 = true;
                Dialog Z1 = mo3516Z1(bundle);
                this.f3232q0 = Z1;
                if (this.f3228m0) {
                    mo3520e2(Z1, this.f3225j0);
                    Context B = mo3199B();
                    if (B instanceof Activity) {
                        this.f3232q0.setOwnerActivity((Activity) B);
                    }
                    this.f3232q0.setCancelable(this.f3227l0);
                    this.f3232q0.setOnCancelListener(this.f3223h0);
                    this.f3232q0.setOnDismissListener(this.f3224i0);
                    this.f3236u0 = true;
                } else {
                    this.f3232q0 = null;
                }
                this.f3230o0 = false;
            } catch (Throwable th) {
                this.f3230o0 = false;
                throw th;
            }
        }
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        this.f3221f0 = new Handler();
        this.f3228m0 = this.f2991B == 0;
        if (bundle != null) {
            this.f3225j0 = bundle.getInt("android:style", 0);
            this.f3226k0 = bundle.getInt("android:theme", 0);
            this.f3227l0 = bundle.getBoolean("android:cancelable", true);
            this.f3228m0 = bundle.getBoolean("android:showsDialog", this.f3228m0);
            this.f3229n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: I0 */
    public void mo3217I0() {
        super.mo3217I0();
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            this.f3233r0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3232q0.dismiss();
            if (!this.f3234s0) {
                onDismiss(this.f3232q0);
            }
            this.f3232q0 = null;
            this.f3236u0 = false;
        }
    }

    /* renamed from: J0 */
    public void mo3219J0() {
        super.mo3219J0();
        if (!this.f3235t0 && !this.f3234s0) {
            this.f3234s0 = true;
        }
        mo3281j0().mo3743h(this.f3231p0);
    }

    /* renamed from: K0 */
    public LayoutInflater mo3222K0(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater K0 = super.mo3222K0(bundle);
        if (!this.f3228m0 || this.f3230o0) {
            if (FragmentManager.m3651H0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f3228m0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return K0;
        }
        m3867c2(bundle);
        if (FragmentManager.m3651H0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f3232q0;
        return dialog != null ? K0.cloneInContext(dialog.getContext()) : K0;
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f3225j0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3226k0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3227l0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3228m0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3229n0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: Y0 */
    public void mo3259Y0() {
        super.mo3259Y0();
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            this.f3233r0 = false;
            dialog.show();
            View decorView = this.f3232q0.getWindow().getDecorView();
            C1041h0.m4232a(decorView, this);
            C1043i0.m4233a(decorView, this);
            C1594f.m6813a(decorView, this);
        }
    }

    /* renamed from: Y1 */
    public int mo3515Y1() {
        return this.f3226k0;
    }

    /* renamed from: Z0 */
    public void mo3261Z0() {
        super.mo3261Z0();
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new C0090f(mo3207D1(), mo3515Y1());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public View mo3517a2(int i) {
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: b1 */
    public void mo3265b1(Bundle bundle) {
        Bundle bundle2;
        super.mo3265b1(bundle);
        if (this.f3232q0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3232q0.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public boolean mo3518b2() {
        return this.f3236u0;
    }

    /* renamed from: d2 */
    public void mo3519d2(boolean z) {
        this.f3227l0 = z;
        Dialog dialog = this.f3232q0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: e2 */
    public void mo3520e2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: f2 */
    public void mo3521f2(FragmentManager fragmentManager, String str) {
        this.f3234s0 = false;
        this.f3235t0 = true;
        C0949f0 o = fragmentManager.mo3392o();
        o.mo3565q(true);
        o.mo3559d(this, str);
        o.mo3429g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3280i1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3280i1(layoutInflater, viewGroup, bundle);
        if (this.f3001L == null && this.f3232q0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3232q0.onRestoreInstanceState(bundle2);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3233r0) {
            if (FragmentManager.m3651H0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m3866X1(true, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0971l mo3295p() {
        return new C0946e(super.mo3295p());
    }

    @Deprecated
    /* renamed from: v0 */
    public void mo3312v0(Bundle bundle) {
        super.mo3312v0(bundle);
    }

    /* renamed from: y0 */
    public void mo3321y0(Context context) {
        super.mo3321y0(context);
        mo3281j0().mo3740e(this.f3231p0);
        if (!this.f3235t0) {
            this.f3234s0 = false;
        }
    }
}
