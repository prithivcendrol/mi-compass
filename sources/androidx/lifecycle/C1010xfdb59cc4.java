package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import p017c1.C1336k;
import p017c1.C1339l;
import p077m1.C1895a;
import p083n1.C2422g;
import p121u1.C2768i;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
public final class C1010xfdb59cc4 implements C1046k {

    /* renamed from: d */
    final /* synthetic */ C1035g.C1038c f3440d;

    /* renamed from: e */
    final /* synthetic */ C1035g f3441e;

    /* renamed from: f */
    final /* synthetic */ C2768i<Object> f3442f;

    /* renamed from: g */
    final /* synthetic */ C1895a<Object> f3443g;

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        Object obj;
        C2768i<Object> iVar;
        C1042i th;
        C2422g.m10285e(mVar, "source");
        C2422g.m10285e(bVar, "event");
        if (bVar == C1035g.C1037b.m4228d(this.f3440d)) {
            this.f3441e.mo3792c(this);
            iVar = this.f3442f;
            C1895a<Object> aVar = this.f3443g;
            try {
                C1336k.C1337a aVar2 = C1336k.f4511d;
                obj = C1336k.m5985a(aVar.mo3765b());
            } catch (Throwable th2) {
                th = th2;
                C1336k.C1337a aVar3 = C1336k.f4511d;
            }
        } else if (bVar == C1035g.C1037b.ON_DESTROY) {
            this.f3441e.mo3792c(this);
            iVar = this.f3442f;
            C1336k.C1337a aVar4 = C1336k.f4511d;
            th = new C1042i();
            obj = C1336k.m5985a(C1339l.m5989a(th));
        } else {
            return;
        }
        iVar.mo5630f(obj);
    }
}
