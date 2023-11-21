package p121u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p083n1.C2420e;

/* renamed from: u1.q */
public class C2792q {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10588b = AtomicIntegerFieldUpdater.newUpdater(C2792q.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f10589a;

    public C2792q(Throwable th, boolean z) {
        this.f10589a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2792q(Throwable th, boolean z, int i, C2420e eVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean mo10058a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo10059b() {
        return f10588b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C2757f0.m11450a(this) + '[' + this.f10589a + ']';
    }
}
