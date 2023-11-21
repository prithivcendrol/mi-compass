package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1035g;
import p022d0.C1457a;
import p022d0.C1461c;
import p040g0.C1593e;
import p077m1.C1906l;
import p083n1.C2422g;
import p083n1.C2423h;
import p083n1.C2429n;

/* renamed from: androidx.lifecycle.z */
public final class C1069z {

    /* renamed from: a */
    public static final C1457a.C1459b<C1593e> f3515a = new C1071b();

    /* renamed from: b */
    public static final C1457a.C1459b<C1039g0> f3516b = new C1072c();

    /* renamed from: c */
    public static final C1457a.C1459b<Bundle> f3517c = new C1070a();

    /* renamed from: androidx.lifecycle.z$a */
    public static final class C1070a implements C1457a.C1459b<Bundle> {
        C1070a() {
        }
    }

    /* renamed from: androidx.lifecycle.z$b */
    public static final class C1071b implements C1457a.C1459b<C1593e> {
        C1071b() {
        }
    }

    /* renamed from: androidx.lifecycle.z$c */
    public static final class C1072c implements C1457a.C1459b<C1039g0> {
        C1072c() {
        }
    }

    /* renamed from: androidx.lifecycle.z$d */
    static final class C1073d extends C2423h implements C1906l<C1457a, C1017b0> {

        /* renamed from: e */
        public static final C1073d f3518e = new C1073d();

        C1073d() {
            super(1);
        }

        /* renamed from: a */
        public final C1017b0 mo3838h(C1457a aVar) {
            C2422g.m10285e(aVar, "$this$initializer");
            return new C1017b0();
        }
    }

    /* renamed from: a */
    public static final <T extends C1593e & C1039g0> void m4296a(T t) {
        C2422g.m10285e(t, "<this>");
        C1035g.C1038c b = t.mo252c().mo3791b();
        C2422g.m10284d(b, "lifecycle.currentState");
        if (!(b == C1035g.C1038c.INITIALIZED || b == C1035g.C1038c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.mo254f().mo5733c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1014a0 a0Var = new C1014a0(t.mo254f(), (C1039g0) t);
            t.mo254f().mo5737h("androidx.lifecycle.internal.SavedStateHandlesProvider", a0Var);
            t.mo252c().mo3790a(new SavedStateHandleAttacher(a0Var));
        }
    }

    /* renamed from: b */
    public static final C1017b0 m4297b(C1039g0 g0Var) {
        Class cls = C1017b0.class;
        C2422g.m10285e(g0Var, "<this>");
        C1461c cVar = new C1461c();
        cVar.mo5479a(C2429n.m10300a(cls), C1073d.f3518e);
        return (C1017b0) new C1021d0(g0Var, cVar.mo5480b()).mo3782b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
