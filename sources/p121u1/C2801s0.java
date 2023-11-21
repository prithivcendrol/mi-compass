package p121u1;

import java.util.concurrent.locks.LockSupport;
import p121u1.C2796r0;

/* renamed from: u1.s0 */
public abstract class C2801s0 extends C2793q0 {
    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo9995A(long j, C2796r0.C2797a aVar) {
        C2760g0.f10545j.mo10076M(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo10085B() {
        Thread z = mo9992z();
        if (Thread.currentThread() != z) {
            C2746c.m11438a();
            LockSupport.unpark(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Thread mo9992z();
}
