package p126v1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p029e1.C1523g;
import p083n1.C2420e;
import p083n1.C2422g;
import p121u1.C2755e1;
import p121u1.C2784n0;

/* renamed from: v1.a */
public final class C2866a extends C2867b {
    private volatile C2866a _immediate;

    /* renamed from: e */
    private final Handler f10943e;

    /* renamed from: f */
    private final String f10944f;

    /* renamed from: g */
    private final boolean f10945g;

    /* renamed from: h */
    private final C2866a f10946h;

    public C2866a(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2866a(Handler handler, String str, int i, C2420e eVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C2866a(Handler handler, String str, boolean z) {
        super((C2420e) null);
        C2866a aVar = null;
        this.f10943e = handler;
        this.f10944f = str;
        this.f10945g = z;
        this._immediate = z ? this : aVar;
        C2866a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C2866a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f10946h = aVar2;
    }

    /* renamed from: s */
    private final void m11860s(C1523g gVar, Runnable runnable) {
        C2755e1.m11446a(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2784n0.m11606b().mo6270c(gVar, runnable);
    }

    /* renamed from: c */
    public void mo6270c(C1523g gVar, Runnable runnable) {
        if (!this.f10943e.post(runnable)) {
            m11860s(gVar, runnable);
        }
    }

    /* renamed from: e */
    public boolean mo6297e(C1523g gVar) {
        return !this.f10945g || !C2422g.m10281a(Looper.myLooper(), this.f10943e.getLooper());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2866a) && ((C2866a) obj).f10943e == this.f10943e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10943e);
    }

    /* renamed from: t */
    public C2866a mo6298h() {
        return this.f10946h;
    }

    public String toString() {
        String r = mo10045r();
        if (r != null) {
            return r;
        }
        String str = this.f10944f;
        if (str == null) {
            str = this.f10943e.toString();
        }
        return this.f10945g ? C2422g.m10290j(str, ".immediate") : str;
    }
}
