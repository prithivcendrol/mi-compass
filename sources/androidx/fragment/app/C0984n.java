package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0623f;

/* renamed from: androidx.fragment.app.n */
public class C0984n {

    /* renamed from: a */
    private final C0987p<?> f3356a;

    private C0984n(C0987p<?> pVar) {
        this.f3356a = pVar;
    }

    /* renamed from: b */
    public static C0984n m4077b(C0987p<?> pVar) {
        return new C0984n((C0987p) C0623f.m2496g(pVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo3678a(Fragment fragment) {
        C0987p<?> pVar = this.f3356a;
        pVar.f3362h.mo3389m(pVar, pVar, fragment);
    }

    /* renamed from: c */
    public void mo3679c() {
        this.f3356a.f3362h.mo3407y();
    }

    /* renamed from: d */
    public boolean mo3680d(MenuItem menuItem) {
        return this.f3356a.f3362h.mo3334B(menuItem);
    }

    /* renamed from: e */
    public void mo3681e() {
        this.f3356a.f3362h.mo3335C();
    }

    /* renamed from: f */
    public void mo3682f() {
        this.f3356a.f3362h.mo3339E();
    }

    /* renamed from: g */
    public void mo3683g() {
        this.f3356a.f3362h.mo3353N();
    }

    /* renamed from: h */
    public void mo3684h() {
        this.f3356a.f3362h.mo3359R();
    }

    /* renamed from: i */
    public void mo3685i() {
        this.f3356a.f3362h.mo3360S();
    }

    /* renamed from: j */
    public void mo3686j() {
        this.f3356a.f3362h.mo3361U();
    }

    /* renamed from: k */
    public boolean mo3687k() {
        return this.f3356a.f3362h.mo3372b0(true);
    }

    /* renamed from: l */
    public FragmentManager mo3688l() {
        return this.f3356a.f3362h;
    }

    /* renamed from: m */
    public void mo3689m() {
        this.f3356a.f3362h.mo3364V0();
    }

    /* renamed from: n */
    public View mo3690n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3356a.f3362h.mo3402v0().onCreateView(view, str, context, attributeSet);
    }
}
