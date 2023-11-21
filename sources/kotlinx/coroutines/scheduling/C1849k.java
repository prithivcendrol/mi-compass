package kotlinx.coroutines.scheduling;

import p121u1.C2757f0;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C1849k extends C1846h {

    /* renamed from: f */
    public final Runnable f7131f;

    public C1849k(Runnable runnable, long j, C1847i iVar) {
        super(j, iVar);
        this.f7131f = runnable;
    }

    public void run() {
        try {
            this.f7131f.run();
        } finally {
            this.f7129e.mo6335a();
        }
    }

    public String toString() {
        return "Task[" + C2757f0.m11450a(this.f7131f) + '@' + C2757f0.m11451b(this.f7131f) + ", " + this.f7128d + ", " + this.f7129e + ']';
    }
}
