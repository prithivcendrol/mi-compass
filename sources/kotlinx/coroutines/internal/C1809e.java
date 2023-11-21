package kotlinx.coroutines.internal;

import p029e1.C1518d;
import p077m1.C1906l;

/* renamed from: kotlinx.coroutines.internal.e */
public final class C1809e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C1831w f7056a = new C1831w("UNDEFINED");

    /* renamed from: b */
    public static final C1831w f7057b = new C1831w("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo10086v0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m7508b(p029e1.C1518d<? super T> r6, java.lang.Object r7, p077m1.C1906l<? super java.lang.Throwable, p017c1.C1344q> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C1807d
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.d r6 = (kotlinx.coroutines.internal.C1807d) r6
            java.lang.Object r8 = p121u1.C2806u.m11667b(r7, r8)
            u1.x r0 = r6.f7048g
            e1.g r1 = r6.mo5629c()
            boolean r0 = r0.mo6297e(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f7050i = r8
            r6.f10575f = r1
            u1.x r7 = r6.f7048g
            e1.g r8 = r6.mo5629c()
            r7.mo6270c(r8, r6)
            goto L_0x00b9
        L_0x0026:
            u1.r1 r0 = p121u1.C2799r1.f10601a
            u1.q0 r0 = r0.mo10082a()
            boolean r2 = r0.mo10065w()
            if (r2 == 0) goto L_0x003b
            r6.f7050i = r8
            r6.f10575f = r1
            r0.mo10062s(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo10064u(r1)
            r2 = 0
            e1.g r3 = r6.mo5629c()     // Catch:{ all -> 0x00a9 }
            u1.b1$b r4 = p121u1.C2743b1.f10535c     // Catch:{ all -> 0x00a9 }
            e1.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            u1.b1 r3 = (p121u1.C2743b1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo9977a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo9984m()     // Catch:{ all -> 0x00a9 }
            r6.mo6259a(r8, r3)     // Catch:{ all -> 0x00a9 }
            c1.k$a r8 = p017c1.C1336k.f4511d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p017c1.C1339l.m5989a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p017c1.C1336k.m5985a(r8)     // Catch:{ all -> 0x00a9 }
            r6.mo5630f(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            e1.d<T> r8 = r6.f7049h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f7051j     // Catch:{ all -> 0x00a9 }
            e1.g r4 = r8.mo5629c()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.C1799a0.m7467c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.w r5 = kotlinx.coroutines.internal.C1799a0.f7036a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            u1.t1 r8 = p121u1.C2815w.m11681f(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            e1.d<T> r5 = r6.f7049h     // Catch:{ all -> 0x0095 }
            r5.mo5630f(r7)     // Catch:{ all -> 0x0095 }
            c1.q r7 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo10086v0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.C1799a0.m7465a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo10086v0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.C1799a0.m7465a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo10067y()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo10047h(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo10061h(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo10061h(r1)
            throw r6
        L_0x00b6:
            r6.mo5630f(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C1809e.m7508b(e1.d, java.lang.Object, m1.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m7509c(C1518d dVar, Object obj, C1906l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m7508b(dVar, obj, lVar);
    }
}
