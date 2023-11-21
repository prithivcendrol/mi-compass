package p040g0;

import android.os.Bundle;
import androidx.lifecycle.C1035g;
import androidx.savedstate.Recreator;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: g0.d */
public final class C1591d {

    /* renamed from: d */
    public static final C1592a f6372d = new C1592a((C2420e) null);

    /* renamed from: a */
    private final C1593e f6373a;

    /* renamed from: b */
    private final C1587c f6374b;

    /* renamed from: c */
    private boolean f6375c;

    /* renamed from: g0.d$a */
    public static final class C1592a {
        private C1592a() {
        }

        public /* synthetic */ C1592a(C2420e eVar) {
            this();
        }

        /* renamed from: a */
        public final C1591d mo5743a(C1593e eVar) {
            C2422g.m10285e(eVar, "owner");
            return new C1591d(eVar, (C2420e) null);
        }
    }

    private C1591d(C1593e eVar) {
        this.f6373a = eVar;
        this.f6374b = new C1587c();
    }

    public /* synthetic */ C1591d(C1593e eVar, C2420e eVar2) {
        this(eVar);
    }

    /* renamed from: a */
    public static final C1591d m6806a(C1593e eVar) {
        return f6372d.mo5743a(eVar);
    }

    /* renamed from: b */
    public final C1587c mo5739b() {
        return this.f6374b;
    }

    /* renamed from: c */
    public final void mo5740c() {
        C1035g c = this.f6373a.mo252c();
        C2422g.m10284d(c, "owner.lifecycle");
        if (c.mo3791b() == C1035g.C1038c.INITIALIZED) {
            c.mo3790a(new Recreator(this.f6373a));
            this.f6374b.mo5734e(c);
            this.f6375c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void mo5741d(Bundle bundle) {
        if (!this.f6375c) {
            mo5740c();
        }
        C1035g c = this.f6373a.mo252c();
        C2422g.m10284d(c, "owner.lifecycle");
        if (!c.mo3791b().mo3794a(C1035g.C1038c.STARTED)) {
            this.f6374b.mo5735f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + c.mo3791b()).toString());
    }

    /* renamed from: e */
    public final void mo5742e(Bundle bundle) {
        C2422g.m10285e(bundle, "outBundle");
        this.f6374b.mo5736g(bundle);
    }
}
