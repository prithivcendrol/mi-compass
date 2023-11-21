package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import p017c1.C1330e;
import p040g0.C1587c;
import p077m1.C1895a;
import p083n1.C2422g;
import p083n1.C2423h;

/* renamed from: androidx.lifecycle.a0 */
public final class C1014a0 implements C1587c.C1590c {

    /* renamed from: a */
    private final C1587c f3451a;

    /* renamed from: b */
    private boolean f3452b;

    /* renamed from: c */
    private Bundle f3453c;

    /* renamed from: d */
    private final C1330e f3454d;

    /* renamed from: androidx.lifecycle.a0$a */
    static final class C1015a extends C2423h implements C1895a<C1017b0> {

        /* renamed from: e */
        final /* synthetic */ C1039g0 f3455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1015a(C1039g0 g0Var) {
            super(0);
            this.f3455e = g0Var;
        }

        /* renamed from: a */
        public final C1017b0 mo3765b() {
            return C1069z.m4297b(this.f3455e);
        }
    }

    public C1014a0(C1587c cVar, C1039g0 g0Var) {
        C2422g.m10285e(cVar, "savedStateRegistry");
        C2422g.m10285e(g0Var, "viewModelStoreOwner");
        this.f3451a = cVar;
        this.f3454d = C1332g.m5980a(new C1015a(g0Var));
    }

    /* renamed from: b */
    private final C1017b0 m4190b() {
        return (C1017b0) this.f3454d.getValue();
    }

    /* renamed from: a */
    public Bundle mo299a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3453c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : m4190b().mo3771e().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((C1067y) next.getValue()).mo3834c().mo299a();
            if (!C2422g.m10281a(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f3452b = false;
        return bundle;
    }

    /* renamed from: c */
    public final void mo3763c() {
        if (!this.f3452b) {
            this.f3453c = this.f3451a.mo5732b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f3452b = true;
            m4190b();
        }
    }
}
