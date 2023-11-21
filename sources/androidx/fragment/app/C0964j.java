package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0095k;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0102d;
import androidx.activity.result.C0106e;
import androidx.core.app.C0483b;
import androidx.core.app.C0500h;
import androidx.core.app.C0504k;
import androidx.core.app.C0505l;
import androidx.core.app.C0506m;
import androidx.core.content.C0515b;
import androidx.core.content.C0516c;
import androidx.core.util.C0617a;
import androidx.core.view.C0713i;
import androidx.core.view.C0793y;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1049n;
import androidx.loader.app.C1074a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p040g0.C1587c;
import p040g0.C1593e;

/* renamed from: androidx.fragment.app.j */
public class C0964j extends ComponentActivity implements C0483b.C0487d {

    /* renamed from: v */
    final C0984n f3303v = C0984n.m4077b(new C0965a());

    /* renamed from: w */
    final C1049n f3304w = new C1049n(this);

    /* renamed from: x */
    boolean f3305x;

    /* renamed from: y */
    boolean f3306y;

    /* renamed from: z */
    boolean f3307z = true;

    /* renamed from: androidx.fragment.app.j$a */
    class C0965a extends C0987p<C0964j> implements C0515b, C0516c, C0504k, C0505l, C1039g0, C0095k, C0106e, C1593e, C0915a0, C0713i {
        public C0965a() {
            super(C0964j.this);
        }

        /* renamed from: B */
        public void mo242B(C0617a<C0500h> aVar) {
            C0964j.this.mo242B(aVar);
        }

        /* renamed from: H */
        public C1034f0 mo243H() {
            return C0964j.this.mo243H();
        }

        /* renamed from: K */
        public void mo244K(C0617a<C0500h> aVar) {
            C0964j.this.mo244K(aVar);
        }

        /* renamed from: N */
        public void mo245N(C0617a<Configuration> aVar) {
            C0964j.this.mo245N(aVar);
        }

        /* renamed from: a */
        public void mo3415a(FragmentManager fragmentManager, Fragment fragment) {
            C0964j.this.mo3607o0(fragment);
        }

        /* renamed from: c */
        public C1035g mo252c() {
            return C0964j.this.f3304w;
        }

        /* renamed from: d */
        public View mo3330d(int i) {
            return C0964j.this.findViewById(i);
        }

        /* renamed from: e */
        public OnBackPressedDispatcher mo253e() {
            return C0964j.this.mo253e();
        }

        /* renamed from: f */
        public C1587c mo254f() {
            return C0964j.this.mo254f();
        }

        /* renamed from: g */
        public boolean mo3331g() {
            Window window = C0964j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: h */
        public void mo255h(C0793y yVar) {
            C0964j.this.mo255h(yVar);
        }

        /* renamed from: l */
        public void mo256l(C0617a<Configuration> aVar) {
            C0964j.this.mo256l(aVar);
        }

        /* renamed from: m */
        public void mo3614m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0964j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: o */
        public LayoutInflater mo3616o() {
            return C0964j.this.getLayoutInflater().cloneInContext(C0964j.this);
        }

        /* renamed from: q */
        public void mo3617q() {
            mo3618u();
        }

        /* renamed from: r */
        public void mo274r(C0617a<C0506m> aVar) {
            C0964j.this.mo274r(aVar);
        }

        /* renamed from: s */
        public void mo276s(C0617a<Integer> aVar) {
            C0964j.this.mo276s(aVar);
        }

        /* renamed from: t */
        public void mo284t(C0617a<Integer> aVar) {
            C0964j.this.mo284t(aVar);
        }

        /* renamed from: u */
        public void mo3618u() {
            C0964j.this.invalidateOptionsMenu();
        }

        /* renamed from: v */
        public C0964j mo3615n() {
            return C0964j.this;
        }

        /* renamed from: w */
        public void mo286w(C0617a<C0506m> aVar) {
            C0964j.this.mo286w(aVar);
        }

        /* renamed from: x */
        public void mo287x(C0793y yVar) {
            C0964j.this.mo287x(yVar);
        }

        /* renamed from: z */
        public C0102d mo288z() {
            return C0964j.this.mo288z();
        }
    }

    public C0964j() {
        m3985h0();
    }

    /* renamed from: h0 */
    private void m3985h0() {
        mo254f().mo5737h("android:support:lifecycle", new C0948f(this));
        mo256l(new C0951g(this));
        mo247U(new C0953h(this));
        mo246T(new C0961i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ Bundle m3986i0() {
        mo3606m0();
        this.f3304w.mo3795h(C1035g.C1037b.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m3987j0(Configuration configuration) {
        this.f3303v.mo3689m();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m3988k0(Intent intent) {
        this.f3303v.mo3689m();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m3989l0(Context context) {
        this.f3303v.mo3678a((Fragment) null);
    }

    /* renamed from: n0 */
    private static boolean m3990n0(FragmentManager fragmentManager, C1035g.C1038c cVar) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo3399t0()) {
            if (next != null) {
                if (next.mo3233O() != null) {
                    z |= m3990n0(next.mo3197A(), cVar);
                }
                C0966j0 j0Var = next.f3012W;
                if (j0Var != null && j0Var.mo252c().mo3791b().mo3794a(C1035g.C1038c.STARTED)) {
                    next.f3012W.mo3625i(cVar);
                    z = true;
                }
                if (next.f3011V.mo3791b().mo3794a(C1035g.C1038c.STARTED)) {
                    next.f3011V.mo3797o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo2546d(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (mo2557O(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f3305x);
            printWriter.print(" mResumed=");
            printWriter.print(this.f3306y);
            printWriter.print(" mStopped=");
            printWriter.print(this.f3307z);
            if (getApplication() != null) {
                C1074a.m4300b(this).mo3839a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f3303v.mo3688l().mo3366X(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final View mo3604f0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3303v.mo3690n(view, str, context, attributeSet);
    }

    /* renamed from: g0 */
    public FragmentManager mo3605g0() {
        return this.f3303v.mo3688l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo3606m0() {
        do {
        } while (m3990n0(mo3605g0(), C1035g.C1038c.CREATED));
    }

    @Deprecated
    /* renamed from: o0 */
    public void mo3607o0(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3303v.mo3689m();
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3304w.mo3795h(C1035g.C1037b.ON_CREATE);
        this.f3303v.mo3681e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View f0 = mo3604f0(view, str, context, attributeSet);
        return f0 == null ? super.onCreateView(view, str, context, attributeSet) : f0;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View f0 = mo3604f0((View) null, str, context, attributeSet);
        return f0 == null ? super.onCreateView(str, context, attributeSet) : f0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3303v.mo3682f();
        this.f3304w.mo3795h(C1035g.C1037b.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f3303v.mo3680d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f3306y = false;
        this.f3303v.mo3683g();
        this.f3304w.mo3795h(C1035g.C1037b.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3613p0();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3303v.mo3689m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f3303v.mo3689m();
        super.onResume();
        this.f3306y = true;
        this.f3303v.mo3687k();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f3303v.mo3689m();
        super.onStart();
        this.f3307z = false;
        if (!this.f3305x) {
            this.f3305x = true;
            this.f3303v.mo3679c();
        }
        this.f3303v.mo3687k();
        this.f3304w.mo3795h(C1035g.C1037b.ON_START);
        this.f3303v.mo3685i();
    }

    public void onStateNotSaved() {
        this.f3303v.mo3689m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f3307z = true;
        mo3606m0();
        this.f3303v.mo3686j();
        this.f3304w.mo3795h(C1035g.C1037b.ON_STOP);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo3613p0() {
        this.f3304w.mo3795h(C1035g.C1037b.ON_RESUME);
        this.f3303v.mo3684h();
    }
}
