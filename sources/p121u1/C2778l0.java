package p121u1;

import kotlinx.coroutines.scheduling.C1846h;
import p029e1.C1518d;
import p083n1.C2422g;

/* renamed from: u1.l0 */
public abstract class C2778l0<T> extends C1846h {

    /* renamed from: f */
    public int f10575f;

    public C2778l0(int i) {
        this.f10575f = i;
    }

    /* renamed from: a */
    public void mo6259a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract C1518d<T> mo6260b();

    /* renamed from: d */
    public Throwable mo10037d(Object obj) {
        C2792q qVar = obj instanceof C2792q ? (C2792q) obj : null;
        if (qVar == null) {
            return null;
        }
        return qVar.f10589a;
    }

    /* renamed from: g */
    public <T> T mo10038g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void mo10047h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C1327b.m5978a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C2422g.m10282b(th);
            C2739a0.m11422a(mo6260b().mo5629c(), new C2754e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: i */
    public abstract Object mo6261i();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r4.mo10086v0() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r4.mo10086v0() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.i r0 = r10.f7129e
            e1.d r1 = r10.mo6260b()     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.d r1 = (kotlinx.coroutines.internal.C1807d) r1     // Catch:{ all -> 0x00a9 }
            e1.d<T> r2 = r1.f7049h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = r1.f7051j     // Catch:{ all -> 0x00a9 }
            e1.g r3 = r2.mo5629c()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C1799a0.m7467c(r3, r1)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.w r4 = kotlinx.coroutines.internal.C1799a0.f7036a     // Catch:{ all -> 0x00a9 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            u1.t1 r4 = p121u1.C2815w.m11681f(r2, r3, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            e1.g r6 = r2.mo5629c()     // Catch:{ all -> 0x009c }
            java.lang.Object r7 = r10.mo6261i()     // Catch:{ all -> 0x009c }
            java.lang.Throwable r8 = r10.mo10037d(r7)     // Catch:{ all -> 0x009c }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f10575f     // Catch:{ all -> 0x009c }
            boolean r9 = p121u1.C2781m0.m11596b(r9)     // Catch:{ all -> 0x009c }
            if (r9 == 0) goto L_0x003e
            u1.b1$b r9 = p121u1.C2743b1.f10535c     // Catch:{ all -> 0x009c }
            e1.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x009c }
            u1.b1 r6 = (p121u1.C2743b1) r6     // Catch:{ all -> 0x009c }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.mo9977a()     // Catch:{ all -> 0x009c }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo9984m()     // Catch:{ all -> 0x009c }
            r10.mo6259a(r7, r6)     // Catch:{ all -> 0x009c }
            c1.k$a r7 = p017c1.C1336k.f4511d     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = p017c1.C1339l.m5989a(r6)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = p017c1.C1336k.m5985a(r6)     // Catch:{ all -> 0x009c }
        L_0x0058:
            r2.mo5630f(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0072
        L_0x005c:
            if (r8 == 0) goto L_0x0069
            c1.k$a r6 = p017c1.C1336k.f4511d     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = p017c1.C1339l.m5989a(r8)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = p017c1.C1336k.m5985a(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0058
        L_0x0069:
            java.lang.Object r6 = r10.mo10038g(r7)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = p017c1.C1336k.m5985a(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0058
        L_0x0072:
            c1.q r2 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x007c
            boolean r2 = r4.mo10086v0()     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007f
        L_0x007c:
            kotlinx.coroutines.internal.C1799a0.m7465a(r3, r1)     // Catch:{ all -> 0x00a9 }
        L_0x007f:
            r0.mo6335a()     // Catch:{ all -> 0x0089 }
            c1.q r0 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = p017c1.C1336k.m5985a(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0094
        L_0x0089:
            r0 = move-exception
            c1.k$a r1 = p017c1.C1336k.f4511d
            java.lang.Object r0 = p017c1.C1339l.m5989a(r0)
            java.lang.Object r0 = p017c1.C1336k.m5985a(r0)
        L_0x0094:
            java.lang.Throwable r0 = p017c1.C1336k.m5986b(r0)
            r10.mo10047h(r5, r0)
            goto L_0x00c8
        L_0x009c:
            r2 = move-exception
            if (r4 == 0) goto L_0x00a5
            boolean r4 = r4.mo10086v0()     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x00a8
        L_0x00a5:
            kotlinx.coroutines.internal.C1799a0.m7465a(r3, r1)     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            c1.k$a r2 = p017c1.C1336k.f4511d     // Catch:{ all -> 0x00b6 }
            r0.mo6335a()     // Catch:{ all -> 0x00b6 }
            c1.q r0 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = p017c1.C1336k.m5985a(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x00c1
        L_0x00b6:
            r0 = move-exception
            c1.k$a r2 = p017c1.C1336k.f4511d
            java.lang.Object r0 = p017c1.C1339l.m5989a(r0)
            java.lang.Object r0 = p017c1.C1336k.m5985a(r0)
        L_0x00c1:
            java.lang.Throwable r0 = p017c1.C1336k.m5986b(r0)
            r10.mo10047h(r1, r0)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2778l0.run():void");
    }
}
