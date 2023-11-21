package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p083n1.C2422g;
import p083n1.C2426k;
import p121u1.C2757f0;
import p121u1.C2771j;

/* renamed from: kotlinx.coroutines.internal.l */
public class C1816l {

    /* renamed from: d */
    static final /* synthetic */ AtomicReferenceFieldUpdater f7067d;

    /* renamed from: e */
    static final /* synthetic */ AtomicReferenceFieldUpdater f7068e;

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7069f;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.l$a */
    public static abstract class C1817a extends C1805c<C1816l> {

        /* renamed from: b */
        public final C1816l f7070b;

        /* renamed from: c */
        public C1816l f7071c;

        public C1817a(C1816l lVar) {
            this.f7070b = lVar;
        }

        /* renamed from: h */
        public void mo6251d(C1816l lVar, Object obj) {
            boolean z = obj == null;
            C1816l lVar2 = z ? this.f7070b : this.f7071c;
            if (lVar2 != null && C2771j.m11556a(C1816l.f7067d, lVar, this, lVar2) && z) {
                C1816l lVar3 = this.f7070b;
                C1816l lVar4 = this.f7071c;
                C2422g.m10282b(lVar4);
                lVar3.m7527m(lVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.l$b */
    /* synthetic */ class C1818b extends C2426k {
        C1818b(Object obj) {
            super(obj, C2757f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C2757f0.m11450a(this.f9421e);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C1816l> cls2 = C1816l.class;
        f7067d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f7068e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f7069f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (p121u1.C2771j.m11556a(f7067d, r3, r2, ((kotlinx.coroutines.internal.C1828t) r4).f7088a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C1816l m7525k(kotlinx.coroutines.internal.C1827s r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.C1816l) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f7068e
            boolean r0 = p121u1.C2771j.m11556a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo6272q()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C1827s
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.s r0 = (kotlinx.coroutines.internal.C1827s) r0
            boolean r0 = r8.mo6301b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.s r4 = (kotlinx.coroutines.internal.C1827s) r4
            r4.mo6250c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C1828t
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f7067d
            kotlinx.coroutines.internal.t r4 = (kotlinx.coroutines.internal.C1828t) r4
            kotlinx.coroutines.internal.l r4 = r4.f7088a
            boolean r2 = p121u1.C2771j.m11556a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.C1816l) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.C1816l) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C1816l.m7525k(kotlinx.coroutines.internal.s):kotlinx.coroutines.internal.l");
    }

    /* renamed from: l */
    private final C1816l m7526l(C1816l lVar) {
        while (lVar.mo6272q()) {
            lVar = (C1816l) lVar._prev;
        }
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m7527m(C1816l lVar) {
        C1816l lVar2;
        do {
            lVar2 = (C1816l) lVar._prev;
            if (mo6274n() != lVar) {
                return;
            }
        } while (!C2771j.m11556a(f7068e, lVar, lVar2, this));
        if (mo6272q()) {
            lVar.m7525k((C1827s) null);
        }
    }

    /* renamed from: t */
    private final C1828t m7528t() {
        C1828t tVar = (C1828t) this._removedRef;
        if (tVar != null) {
            return tVar;
        }
        C1828t tVar2 = new C1828t(this);
        f7069f.lazySet(this, tVar2);
        return tVar2;
    }

    /* renamed from: j */
    public final boolean mo6273j(C1816l lVar) {
        f7068e.lazySet(lVar, this);
        f7067d.lazySet(lVar, this);
        while (mo6274n() == this) {
            if (C2771j.m11556a(f7067d, this, this, lVar)) {
                lVar.m7527m(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final Object mo6274n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C1827s)) {
                return obj;
            }
            ((C1827s) obj).mo6250c(this);
        }
    }

    /* renamed from: o */
    public final C1816l mo6275o() {
        return C1815k.m7523b(mo6274n());
    }

    /* renamed from: p */
    public final C1816l mo6276p() {
        C1816l k = m7525k((C1827s) null);
        return k == null ? m7526l((C1816l) this._prev) : k;
    }

    /* renamed from: q */
    public boolean mo6272q() {
        return mo6274n() instanceof C1828t;
    }

    /* renamed from: r */
    public boolean mo6277r() {
        return mo6278s() == null;
    }

    /* renamed from: s */
    public final C1816l mo6278s() {
        Object n;
        C1816l lVar;
        do {
            n = mo6274n();
            if (n instanceof C1828t) {
                return ((C1828t) n).f7088a;
            }
            if (n == this) {
                return (C1816l) n;
            }
            lVar = (C1816l) n;
        } while (!C2771j.m11556a(f7067d, this, n, lVar.m7528t()));
        lVar.m7525k((C1827s) null);
        return null;
    }

    public String toString() {
        return new C1818b(this) + '@' + C2757f0.m11451b(this);
    }

    /* renamed from: u */
    public final int mo6280u(C1816l lVar, C1816l lVar2, C1817a aVar) {
        f7068e.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7067d;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        aVar.f7071c = lVar2;
        if (!C2771j.m11556a(atomicReferenceFieldUpdater, this, lVar2, aVar)) {
            return 0;
        }
        return aVar.mo6250c(this) == null ? 1 : 2;
    }
}
