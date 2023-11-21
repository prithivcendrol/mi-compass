package p121u1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C1815k;
import kotlinx.coroutines.internal.C1816l;
import kotlinx.coroutines.internal.C1827s;
import p017c1.C1344q;
import p029e1.C1523g;
import p077m1.C1906l;
import p077m1.C1910p;
import p083n1.C2420e;
import p083n1.C2422g;
import p121u1.C2743b1;

/* renamed from: u1.h1 */
public class C2764h1 implements C2743b1, C2786o, C2788o1 {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10550d = AtomicReferenceFieldUpdater.newUpdater(C2764h1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: u1.h1$a */
    private static final class C2765a extends C2761g1 {

        /* renamed from: h */
        private final C2764h1 f10551h;

        /* renamed from: i */
        private final C2766b f10552i;

        /* renamed from: j */
        private final C2783n f10553j;

        /* renamed from: k */
        private final Object f10554k;

        public C2765a(C2764h1 h1Var, C2766b bVar, C2783n nVar, Object obj) {
            this.f10551h = h1Var;
            this.f10552i = bVar;
            this.f10553j = nVar;
            this.f10554k = obj;
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo3838h(Object obj) {
            mo9982v((Throwable) obj);
            return C1344q.f4517a;
        }

        /* renamed from: v */
        public void mo9982v(Throwable th) {
            this.f10551h.m11473D(this.f10552i, this.f10553j, this.f10554k);
        }
    }

    /* renamed from: u1.h1$b */
    private static final class C2766b implements C2823x0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: d */
        private final C2779l1 f10555d;

        public C2766b(C2779l1 l1Var, boolean z, Throwable th) {
            this.f10555d = l1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m11533c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        private final Object m11534d() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m11535l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public boolean mo9999a() {
            return mo10026e() == null;
        }

        /* renamed from: b */
        public final void mo10025b(Throwable th) {
            Throwable e = mo10026e();
            if (e == null) {
                mo10032m(th);
            } else if (th != e) {
                Object d = m11534d();
                if (d == null) {
                    m11535l(th);
                } else if (d instanceof Throwable) {
                    if (th != d) {
                        ArrayList<Throwable> c = m11533c();
                        c.add(d);
                        c.add(th);
                        m11535l(c);
                    }
                } else if (d instanceof ArrayList) {
                    ((ArrayList) d).add(th);
                } else {
                    throw new IllegalStateException(C2422g.m10290j("State is ", d).toString());
                }
            }
        }

        /* renamed from: e */
        public final Throwable mo10026e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public C2779l1 mo10001f() {
            return this.f10555d;
        }

        /* renamed from: g */
        public final boolean mo10027g() {
            return mo10026e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: h */
        public final boolean mo10028h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo10029i() {
            return m11534d() == C2770i1.f10563e;
        }

        /* renamed from: j */
        public final List<Throwable> mo10030j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d = m11534d();
            if (d == null) {
                arrayList = m11533c();
            } else if (d instanceof Throwable) {
                ArrayList<Throwable> c = m11533c();
                c.add(d);
                arrayList = c;
            } else if (d instanceof ArrayList) {
                arrayList = (ArrayList) d;
            } else {
                throw new IllegalStateException(C2422g.m10290j("State is ", d).toString());
            }
            Throwable e = mo10026e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !C2422g.m10281a(th, e)) {
                arrayList.add(th);
            }
            m11535l(C2770i1.f10563e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo10031k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo10032m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo10027g() + ", completing=" + mo10028h() + ", rootCause=" + mo10026e() + ", exceptions=" + m11534d() + ", list=" + mo10001f() + ']';
        }
    }

    /* renamed from: u1.h1$c */
    public static final class C2767c extends C1816l.C1817a {

        /* renamed from: d */
        final /* synthetic */ C1816l f10556d;

        /* renamed from: e */
        final /* synthetic */ C2764h1 f10557e;

        /* renamed from: f */
        final /* synthetic */ Object f10558f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2767c(C1816l lVar, C2764h1 h1Var, Object obj) {
            super(lVar);
            this.f10556d = lVar;
            this.f10557e = h1Var;
            this.f10558f = obj;
        }

        /* renamed from: i */
        public Object mo6254g(C1816l lVar) {
            if (this.f10557e.mo10009N() == this.f10558f) {
                return null;
            }
            return C1815k.m7522a();
        }
    }

    public C2764h1(boolean z) {
        this._state = z ? C2770i1.f10565g : C2770i1.f10564f;
        this._parentHandle = null;
    }

    /* renamed from: C */
    private final void m11472C(C2823x0 x0Var, Object obj) {
        C2780m M = mo10008M();
        if (M != null) {
            M.mo10000c();
            mo10017g0(C2782m1.f10576d);
        }
        Throwable th = null;
        C2792q qVar = obj instanceof C2792q ? (C2792q) obj : null;
        if (qVar != null) {
            th = qVar.f10589a;
        }
        if (x0Var instanceof C2761g1) {
            try {
                ((C2761g1) x0Var).mo9982v(th);
            } catch (Throwable th2) {
                mo9975P(new C2803t("Exception in completion handler " + x0Var + " for " + this, th2));
            }
        } else {
            C2779l1 f = x0Var.mo10001f();
            if (f != null) {
                m11484Z(f, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m11473D(C2766b bVar, C2783n nVar, Object obj) {
        C2783n X = m11482X(nVar);
        if (X == null || !m11494q0(bVar, X, obj)) {
            mo6309v(m11475F(bVar, obj));
        }
    }

    /* renamed from: E */
    private final Throwable m11474E(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2748c1(mo9974A(), (Throwable) null, this) : th;
        } else if (obj != null) {
            return ((C2788o1) obj).mo10019l();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: F */
    private final Object m11475F(C2766b bVar, Object obj) {
        boolean g;
        Throwable I;
        C2792q qVar = obj instanceof C2792q ? (C2792q) obj : null;
        Throwable th = qVar == null ? null : qVar.f10589a;
        synchronized (bVar) {
            g = bVar.mo10027g();
            List<Throwable> j = bVar.mo10030j(th);
            I = m11478I(bVar, j);
            if (I != null) {
                m11498u(I, j);
            }
        }
        boolean z = false;
        if (!(I == null || I == th)) {
            obj = new C2792q(I, false, 2, (C2420e) null);
        }
        if (I != null) {
            if (m11500z(I) || mo10010O(I)) {
                z = true;
            }
            if (z) {
                if (obj != null) {
                    ((C2792q) obj).mo10059b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!g) {
            mo10014a0(I);
        }
        mo9978b0(obj);
        C2771j.m11556a(f10550d, this, bVar, C2770i1.m11554g(obj));
        m11472C(bVar, obj);
        return obj;
    }

    /* renamed from: G */
    private final C2783n m11476G(C2823x0 x0Var) {
        C2783n nVar = x0Var instanceof C2783n ? (C2783n) x0Var : null;
        if (nVar != null) {
            return nVar;
        }
        C2779l1 f = x0Var.mo10001f();
        if (f == null) {
            return null;
        }
        return m11482X(f);
    }

    /* renamed from: H */
    private final Throwable m11477H(Object obj) {
        C2792q qVar = obj instanceof C2792q ? (C2792q) obj : null;
        if (qVar == null) {
            return null;
        }
        return qVar.f10589a;
    }

    /* renamed from: I */
    private final Throwable m11478I(C2766b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.mo10027g()) {
            return new C2748c1(mo9974A(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: L */
    private final C2779l1 m11479L(C2823x0 x0Var) {
        C2779l1 f = x0Var.mo10001f();
        if (f != null) {
            return f;
        }
        if (x0Var instanceof C2790p0) {
            return new C2779l1();
        }
        if (x0Var instanceof C2761g1) {
            m11486e0((C2761g1) x0Var);
            return null;
        }
        throw new IllegalStateException(C2422g.m10290j("State should have list: ", x0Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m11483Y(((p121u1.C2764h1.C2766b) r2).mo10001f(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return p121u1.C2770i1.f10559a;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m11480T(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo10009N()
            boolean r3 = r2 instanceof p121u1.C2764h1.C2766b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            u1.h1$b r3 = (p121u1.C2764h1.C2766b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo10029i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10562d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            u1.h1$b r3 = (p121u1.C2764h1.C2766b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo10027g()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m11474E(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            u1.h1$b r7 = (p121u1.C2764h1.C2766b) r7     // Catch:{ all -> 0x004f }
            r7.mo10025b(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            u1.h1$b r7 = (p121u1.C2764h1.C2766b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo10026e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            u1.h1$b r2 = (p121u1.C2764h1.C2766b) r2
            u1.l1 r7 = r2.mo10001f()
            r6.m11483Y(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10559a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof p121u1.C2823x0
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m11474E(r7)
        L_0x005c:
            r3 = r2
            u1.x0 r3 = (p121u1.C2823x0) r3
            boolean r4 = r3.mo9999a()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m11491n0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10559a
            return r7
        L_0x0070:
            u1.q r3 = new u1.q
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m11492o0(r2, r3)
            kotlinx.coroutines.internal.w r4 = p121u1.C2770i1.f10559a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.w r2 = p121u1.C2770i1.f10561c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = p083n1.C2422g.m10290j(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x009a:
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10562d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2764h1.m11480T(java.lang.Object):java.lang.Object");
    }

    /* renamed from: V */
    private final C2761g1 m11481V(C1906l<? super Throwable, C1344q> lVar, boolean z) {
        C2761g1 g1Var = null;
        if (z) {
            if (lVar instanceof C2752d1) {
                g1Var = (C2752d1) lVar;
            }
            if (g1Var == null) {
                g1Var = new C2828z0(lVar);
            }
        } else {
            C2761g1 g1Var2 = lVar instanceof C2761g1 ? (C2761g1) lVar : null;
            if (g1Var2 != null) {
                g1Var = g1Var2;
            }
            if (g1Var == null) {
                g1Var = new C2740a1(lVar);
            }
        }
        g1Var.mo10003x(this);
        return g1Var;
    }

    /* renamed from: X */
    private final C2783n m11482X(C1816l lVar) {
        while (lVar.mo6272q()) {
            lVar = lVar.mo6276p();
        }
        while (true) {
            lVar = lVar.mo6275o();
            if (!lVar.mo6272q()) {
                if (lVar instanceof C2783n) {
                    return (C2783n) lVar;
                }
                if (lVar instanceof C2779l1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: Y */
    private final void m11483Y(C2779l1 l1Var, Throwable th) {
        C2803t tVar;
        mo10014a0(th);
        C2803t tVar2 = null;
        for (C1816l lVar = (C1816l) l1Var.mo6274n(); !C2422g.m10281a(lVar, l1Var); lVar = lVar.mo6275o()) {
            if (lVar instanceof C2752d1) {
                C2761g1 g1Var = (C2761g1) lVar;
                try {
                    g1Var.mo9982v(th);
                } catch (Throwable th2) {
                    if (tVar2 == null) {
                        tVar = null;
                    } else {
                        C1327b.m5978a(tVar2, th2);
                        tVar = tVar2;
                    }
                    if (tVar == null) {
                        tVar2 = new C2803t("Exception in completion handler " + g1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tVar2 != null) {
            mo9975P(tVar2);
        }
        m11500z(th);
    }

    /* renamed from: Z */
    private final void m11484Z(C2779l1 l1Var, Throwable th) {
        C2803t tVar;
        C2803t tVar2 = null;
        for (C1816l lVar = (C1816l) l1Var.mo6274n(); !C2422g.m10281a(lVar, l1Var); lVar = lVar.mo6275o()) {
            if (lVar instanceof C2761g1) {
                C2761g1 g1Var = (C2761g1) lVar;
                try {
                    g1Var.mo9982v(th);
                } catch (Throwable th2) {
                    if (tVar2 == null) {
                        tVar = null;
                    } else {
                        C1327b.m5978a(tVar2, th2);
                        tVar = tVar2;
                    }
                    if (tVar == null) {
                        tVar2 = new C2803t("Exception in completion handler " + g1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tVar2 != null) {
            mo9975P(tVar2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [u1.w0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11485d0(p121u1.C2790p0 r3) {
        /*
            r2 = this;
            u1.l1 r0 = new u1.l1
            r0.<init>()
            boolean r1 = r3.mo9999a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            u1.w0 r1 = new u1.w0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f10550d
            p121u1.C2771j.m11556a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2764h1.m11485d0(u1.p0):void");
    }

    /* renamed from: e0 */
    private final void m11486e0(C2761g1 g1Var) {
        g1Var.mo6273j(new C2779l1());
        C2771j.m11556a(f10550d, this, g1Var, g1Var.mo6275o());
    }

    /* renamed from: h0 */
    private final int m11487h0(Object obj) {
        if (obj instanceof C2790p0) {
            if (((C2790p0) obj).mo9999a()) {
                return 0;
            }
            if (!C2771j.m11556a(f10550d, this, obj, C2770i1.f10565g)) {
                return -1;
            }
            mo10015c0();
            return 1;
        } else if (!(obj instanceof C2819w0)) {
            return 0;
        } else {
            if (!C2771j.m11556a(f10550d, this, obj, ((C2819w0) obj).mo10001f())) {
                return -1;
            }
            mo10015c0();
            return 1;
        }
    }

    /* renamed from: i0 */
    private final String m11488i0(Object obj) {
        if (!(obj instanceof C2766b)) {
            return obj instanceof C2823x0 ? ((C2823x0) obj).mo9999a() ? "Active" : "New" : obj instanceof C2792q ? "Cancelled" : "Completed";
        }
        C2766b bVar = (C2766b) obj;
        return bVar.mo10027g() ? "Cancelling" : bVar.mo10028h() ? "Completing" : "Active";
    }

    /* renamed from: k0 */
    public static /* synthetic */ CancellationException m11489k0(C2764h1 h1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return h1Var.mo10018j0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: m0 */
    private final boolean m11490m0(C2823x0 x0Var, Object obj) {
        if (!C2771j.m11556a(f10550d, this, x0Var, C2770i1.m11554g(obj))) {
            return false;
        }
        mo10014a0((Throwable) null);
        mo9978b0(obj);
        m11472C(x0Var, obj);
        return true;
    }

    /* renamed from: n0 */
    private final boolean m11491n0(C2823x0 x0Var, Throwable th) {
        C2779l1 L = m11479L(x0Var);
        if (L == null) {
            return false;
        }
        if (!C2771j.m11556a(f10550d, this, x0Var, new C2766b(L, false, th))) {
            return false;
        }
        m11483Y(L, th);
        return true;
    }

    /* renamed from: o0 */
    private final Object m11492o0(Object obj, Object obj2) {
        return !(obj instanceof C2823x0) ? C2770i1.f10559a : (((obj instanceof C2790p0) || (obj instanceof C2761g1)) && !(obj instanceof C2783n) && !(obj2 instanceof C2792q)) ? m11490m0((C2823x0) obj, obj2) ? obj2 : C2770i1.f10561c : m11493p0((C2823x0) obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        m11483Y(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r7 = m11476G(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r7 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (m11494q0(r1, r7, r8) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        return p121u1.C2770i1.f10560b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        return m11475F(r1, r8);
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m11493p0(p121u1.C2823x0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            u1.l1 r0 = r6.m11479L(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10561c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof p121u1.C2764h1.C2766b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            u1.h1$b r1 = (p121u1.C2764h1.C2766b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            u1.h1$b r1 = new u1.h1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo10028h()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10559a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo10031k(r3)     // Catch:{ all -> 0x0078 }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f10550d     // Catch:{ all -> 0x0078 }
            boolean r4 = p121u1.C2771j.m11556a(r4, r6, r7, r1)     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10561c     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = r1.mo10027g()     // Catch:{ all -> 0x0078 }
            boolean r5 = r8 instanceof p121u1.C2792q     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x004a
            r5 = r8
            u1.q r5 = (p121u1.C2792q) r5     // Catch:{ all -> 0x0078 }
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            java.lang.Throwable r5 = r5.f10589a     // Catch:{ all -> 0x0078 }
            r1.mo10025b(r5)     // Catch:{ all -> 0x0078 }
        L_0x0053:
            java.lang.Throwable r5 = r1.mo10026e()     // Catch:{ all -> 0x0078 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x005b
            r2 = r5
        L_0x005b:
            c1.q r3 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r6.m11483Y(r0, r2)
        L_0x0064:
            u1.n r7 = r6.m11476G(r7)
            if (r7 == 0) goto L_0x0073
            boolean r7 = r6.m11494q0(r1, r7, r8)
            if (r7 == 0) goto L_0x0073
            kotlinx.coroutines.internal.w r7 = p121u1.C2770i1.f10560b
            return r7
        L_0x0073:
            java.lang.Object r7 = r6.m11475F(r1, r8)
            return r7
        L_0x0078:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2764h1.m11493p0(u1.x0, java.lang.Object):java.lang.Object");
    }

    /* renamed from: q0 */
    private final boolean m11494q0(C2766b bVar, C2783n nVar, Object obj) {
        while (C2743b1.C2744a.m11435d(nVar.f10577h, false, false, new C2765a(this, bVar, nVar, obj), 1, (Object) null) == C2782m1.f10576d) {
            nVar = m11482X(nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private final boolean m11497t(Object obj, C2779l1 l1Var, C2761g1 g1Var) {
        int u;
        C2767c cVar = new C2767c(g1Var, this, obj);
        do {
            u = l1Var.mo6276p().mo6280u(g1Var, l1Var, cVar);
            if (u == 1) {
                return true;
            }
        } while (u != 2);
        return false;
    }

    /* renamed from: u */
    private final void m11498u(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C1327b.m5978a(th, th2);
                }
            }
        }
    }

    /* renamed from: y */
    private final Object m11499y(Object obj) {
        Object o0;
        do {
            Object N = mo10009N();
            if (!(N instanceof C2823x0) || ((N instanceof C2766b) && ((C2766b) N).mo10028h())) {
                return C2770i1.f10559a;
            }
            o0 = m11492o0(N, new C2792q(m11474E(obj), false, 2, (C2420e) null));
        } while (o0 == C2770i1.f10561c);
        return o0;
    }

    /* renamed from: z */
    private final boolean m11500z(Throwable th) {
        if (mo6307S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C2780m M = mo10008M();
        return (M == null || M == C2782m1.f10576d) ? z : M.mo10049e(th) || z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo9974A() {
        return "Job was cancelled";
    }

    /* renamed from: B */
    public boolean mo10005B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo10023w(th) && mo10006J();
    }

    /* renamed from: J */
    public boolean mo10006J() {
        return true;
    }

    /* renamed from: K */
    public boolean mo10007K() {
        return false;
    }

    /* renamed from: M */
    public final C2780m mo10008M() {
        return (C2780m) this._parentHandle;
    }

    /* renamed from: N */
    public final Object mo10009N() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C1827s)) {
                return obj;
            }
            ((C1827s) obj).mo6250c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public boolean mo10010O(Throwable th) {
        return false;
    }

    /* renamed from: P */
    public void mo9975P(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo10011Q(C2743b1 b1Var) {
        if (b1Var == null) {
            mo10017g0(C2782m1.f10576d);
            return;
        }
        b1Var.start();
        C2780m i = b1Var.mo9983i(this);
        mo10017g0(i);
        if (mo10012R()) {
            i.mo10000c();
            mo10017g0(C2782m1.f10576d);
        }
    }

    /* renamed from: R */
    public final boolean mo10012R() {
        return !(mo10009N() instanceof C2823x0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public boolean mo6307S() {
        return false;
    }

    /* renamed from: U */
    public final Object mo10013U(Object obj) {
        Object o0;
        do {
            o0 = m11492o0(mo10009N(), obj);
            if (o0 == C2770i1.f10559a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m11477H(obj));
            }
        } while (o0 == C2770i1.f10561c);
        return o0;
    }

    /* renamed from: W */
    public String mo9976W() {
        return C2757f0.m11450a(this);
    }

    /* renamed from: a */
    public boolean mo9977a() {
        Object N = mo10009N();
        return (N instanceof C2823x0) && ((C2823x0) N).mo9999a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo10014a0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo9978b0(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo10015c0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10016f0(p121u1.C2761g1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo10009N()
            boolean r1 = r0 instanceof p121u1.C2761g1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f10550d
            u1.p0 r2 = p121u1.C2770i1.f10565g
            boolean r0 = p121u1.C2771j.m11556a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof p121u1.C2823x0
            if (r1 == 0) goto L_0x0027
            u1.x0 r0 = (p121u1.C2823x0) r0
            u1.l1 r0 = r0.mo10001f()
            if (r0 == 0) goto L_0x0027
            r4.mo6277r()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2764h1.mo10016f0(u1.g1):void");
    }

    public <R> R fold(R r, C1910p<? super R, ? super C1523g.C1526b, ? extends R> pVar) {
        return C2743b1.C2744a.m11433b(this, r, pVar);
    }

    /* renamed from: g0 */
    public final void mo10017g0(C2780m mVar) {
        this._parentHandle = mVar;
    }

    public <E extends C1523g.C1526b> E get(C1523g.C1528c<E> cVar) {
        return C2743b1.C2744a.m11434c(this, cVar);
    }

    public final C1523g.C1528c<?> getKey() {
        return C2743b1.f10535c;
    }

    /* renamed from: i */
    public final C2780m mo9983i(C2786o oVar) {
        return (C2780m) C2743b1.C2744a.m11435d(this, true, false, new C2783n(oVar), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final CancellationException mo10018j0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo9974A();
            }
            cancellationException = new C2748c1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: l */
    public CancellationException mo10019l() {
        Throwable th;
        Object N = mo10009N();
        CancellationException cancellationException = null;
        if (N instanceof C2766b) {
            th = ((C2766b) N).mo10026e();
        } else if (N instanceof C2792q) {
            th = ((C2792q) N).f10589a;
        } else if (!(N instanceof C2823x0)) {
            th = null;
        } else {
            throw new IllegalStateException(C2422g.m10290j("Cannot be cancelling child in this state: ", N).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C2748c1(C2422g.m10290j("Parent job is ", m11488i0(N)), th, this) : cancellationException;
    }

    /* renamed from: l0 */
    public final String mo10020l0() {
        return mo9976W() + '{' + m11488i0(mo10009N()) + '}';
    }

    /* renamed from: m */
    public final CancellationException mo9984m() {
        Object N = mo10009N();
        CancellationException cancellationException = null;
        if (N instanceof C2766b) {
            Throwable e = ((C2766b) N).mo10026e();
            if (e != null) {
                cancellationException = mo10018j0(e, C2422g.m10290j(C2757f0.m11450a(this), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(C2422g.m10290j("Job is still new or active: ", this).toString());
        } else if (!(N instanceof C2823x0)) {
            return N instanceof C2792q ? m11489k0(this, ((C2792q) N).f10589a, (String) null, 1, (Object) null) : new C2748c1(C2422g.m10290j(C2757f0.m11450a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(C2422g.m10290j("Job is still new or active: ", this).toString());
        }
    }

    public C1523g minusKey(C1523g.C1528c<?> cVar) {
        return C2743b1.C2744a.m11436e(this, cVar);
    }

    /* renamed from: n */
    public final C2787o0 mo9985n(boolean z, boolean z2, C1906l<? super Throwable, C1344q> lVar) {
        C2761g1 V = m11481V(lVar, z);
        while (true) {
            Object N = mo10009N();
            if (N instanceof C2790p0) {
                C2790p0 p0Var = (C2790p0) N;
                if (!p0Var.mo9999a()) {
                    m11485d0(p0Var);
                } else if (C2771j.m11556a(f10550d, this, N, V)) {
                    return V;
                }
            } else {
                Throwable th = null;
                if (N instanceof C2823x0) {
                    C2779l1 f = ((C2823x0) N).mo10001f();
                    if (f != null) {
                        C2787o0 o0Var = C2782m1.f10576d;
                        if (z && (N instanceof C2766b)) {
                            synchronized (N) {
                                th = ((C2766b) N).mo10026e();
                                if (th == null || ((lVar instanceof C2783n) && !((C2766b) N).mo10028h())) {
                                    if (m11497t(N, f, V)) {
                                        if (th == null) {
                                            return V;
                                        }
                                        o0Var = V;
                                    }
                                }
                                C1344q qVar = C1344q.f4517a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.mo3838h(th);
                            }
                            return o0Var;
                        } else if (m11497t(N, f, V)) {
                            return V;
                        }
                    } else if (N != null) {
                        m11486e0((C2761g1) N);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z2) {
                        C2792q qVar2 = N instanceof C2792q ? (C2792q) N : null;
                        if (qVar2 != null) {
                            th = qVar2.f10589a;
                        }
                        lVar.mo3838h(th);
                    }
                    return C2782m1.f10576d;
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo10021o(C2788o1 o1Var) {
        mo10023w(o1Var);
    }

    /* renamed from: p */
    public void mo9986p(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2748c1(mo9974A(), (Throwable) null, this);
        }
        mo10024x(cancellationException);
    }

    public C1523g plus(C1523g gVar) {
        return C2743b1.C2744a.m11437f(this, gVar);
    }

    public final boolean start() {
        int h0;
        do {
            h0 = m11487h0(mo10009N());
            if (h0 == 0) {
                return false;
            }
        } while (h0 != 1);
        return true;
    }

    public String toString() {
        return mo10020l0() + '@' + C2757f0.m11451b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6309v(Object obj) {
    }

    /* renamed from: w */
    public final boolean mo10023w(Object obj) {
        Object a = C2770i1.f10559a;
        if (mo10007K() && (a = m11499y(obj)) == C2770i1.f10560b) {
            return true;
        }
        if (a == C2770i1.f10559a) {
            a = m11480T(obj);
        }
        if (a == C2770i1.f10559a || a == C2770i1.f10560b) {
            return true;
        }
        if (a == C2770i1.f10562d) {
            return false;
        }
        mo6309v(a);
        return true;
    }

    /* renamed from: x */
    public void mo10024x(Throwable th) {
        mo10023w(th);
    }
}
