package p102q2;

import android.view.View;
import miuix.appcompat.app.C2112p;
import p073l3.C1877a;
import p107r2.C2620b;
import p107r2.C2621c;
import p107r2.C2625d;

/* renamed from: q2.b */
public class C2583b {

    /* renamed from: a */
    private static C2620b f10125a;

    /* renamed from: q2.b$a */
    public interface C2584a {
        void end();
    }

    /* renamed from: a */
    public static void m10995a() {
        C2620b bVar = f10125a;
        if (bVar != null) {
            bVar.mo9885a();
        }
    }

    /* renamed from: b */
    public static void m10996b(View view, View view2, C2584a aVar) {
        if (f10125a == null) {
            f10125a = C1877a.f7249b ? new C2621c() : new C2625d();
        }
        f10125a.mo9887c(view, view2, aVar);
        f10125a = null;
    }

    /* renamed from: c */
    public static void m10997c(View view, View view2, boolean z, C2112p.C2116d dVar) {
        if (f10125a == null) {
            f10125a = C1877a.f7249b ? new C2621c() : new C2625d();
        }
        f10125a.mo9886b(view, view2, z, dVar);
    }
}
