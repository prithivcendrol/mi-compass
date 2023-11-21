package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C1021d0;
import androidx.lifecycle.C1033f;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1049n;
import androidx.lifecycle.C1069z;
import p022d0.C1457a;
import p022d0.C1462d;
import p040g0.C1587c;
import p040g0.C1591d;
import p040g0.C1593e;

/* renamed from: androidx.fragment.app.j0 */
class C0966j0 implements C1033f, C1593e, C1039g0 {

    /* renamed from: d */
    private final Fragment f3309d;

    /* renamed from: e */
    private final C1034f0 f3310e;

    /* renamed from: f */
    private C1049n f3311f = null;

    /* renamed from: g */
    private C1591d f3312g = null;

    C0966j0(Fragment fragment, C1034f0 f0Var) {
        this.f3309d = fragment;
        this.f3310e = f0Var;
    }

    /* renamed from: H */
    public C1034f0 mo243H() {
        mo3621b();
        return this.f3310e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3620a(C1035g.C1037b bVar) {
        this.f3311f.mo3795h(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3621b() {
        if (this.f3311f == null) {
            this.f3311f = new C1049n(this);
            C1591d a = C1591d.m6806a(this);
            this.f3312g = a;
            a.mo5740c();
            C1069z.m4296a(this);
        }
    }

    /* renamed from: c */
    public C1035g mo252c() {
        mo3621b();
        return this.f3311f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3622d() {
        return this.f3311f != null;
    }

    /* renamed from: f */
    public C1587c mo254f() {
        mo3621b();
        return this.f3312g.mo5739b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3623g(Bundle bundle) {
        this.f3312g.mo5741d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3624h(Bundle bundle) {
        this.f3312g.mo5742e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3625i(C1035g.C1038c cVar) {
        this.f3311f.mo3797o(cVar);
    }

    /* renamed from: u */
    public C1457a mo285u() {
        Application application;
        Context applicationContext = this.f3309d.mo3207D1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C1462d dVar = new C1462d();
        if (application != null) {
            dVar.mo5481b(C1021d0.C1022a.f3464e, application);
        }
        dVar.mo5481b(C1069z.f3515a, this);
        dVar.mo5481b(C1069z.f3516b, this);
        if (this.f3309d.mo3323z() != null) {
            dVar.mo5481b(C1069z.f3517c, this.f3309d.mo3323z());
        }
        return dVar;
    }
}
