package p085n3;

import android.content.Context;
import android.view.animation.AnimationUtils;
import p079m3.C1936b;
import p079m3.C1956c;
import p079m3.C1960e;
import p079m3.C1961f;
import p079m3.C1962g;
import p085n3.C2446c;

/* renamed from: n3.a */
class C2440a extends C2446c.C2447a implements C1956c.C1958b {

    /* renamed from: t */
    private C1960e f9453t = new C1960e();

    /* renamed from: u */
    private C1961f f9454u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C1956c f9455v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2442b f9456w;

    /* renamed from: n3.a$a */
    class C2441a implements C2442b.C2444b {

        /* renamed from: a */
        final /* synthetic */ int f9457a;

        /* renamed from: b */
        final /* synthetic */ int f9458b;

        /* renamed from: c */
        final /* synthetic */ int f9459c;

        C2441a(int i, int i2, int i3) {
            this.f9457a = i;
            this.f9458b = i2;
            this.f9459c = i3;
        }

        /* renamed from: a */
        public boolean mo9360a(float f, float f2) {
            C2445b.m10366b("fling finished: value(%f), velocity(%f), scroller boundary(%d, %d)", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(this.f9457a), Integer.valueOf(this.f9458b));
            C2440a.this.f9455v.mo6537n((float) C2440a.this.f9456w.f9466f);
            C2440a.this.f9455v.mo6538o(C2440a.this.f9456w.f9465e);
            float v = C2440a.this.f9455v.mo6578v();
            if (((int) f) == 0 || (v <= ((float) this.f9458b) && v >= ((float) this.f9457a))) {
                C2445b.m10365a("fling finished, no more work.");
                return false;
            }
            C2445b.m10365a("fling destination beyound boundary, start spring");
            C2440a.this.m10340N();
            C2440a aVar = C2440a.this;
            aVar.m10339M(2, aVar.mo9397n(), C2440a.this.mo9396m(), C2440a.this.mo9398o(), this.f9459c);
            return true;
        }
    }

    /* renamed from: n3.a$b */
    private static class C2442b {

        /* renamed from: a */
        C1936b<?> f9461a;

        /* renamed from: b */
        int f9462b;

        /* renamed from: c */
        private final int f9463c;

        /* renamed from: d */
        private final int f9464d;

        /* renamed from: e */
        float f9465e;

        /* renamed from: f */
        int f9466f;

        /* renamed from: g */
        private C2444b f9467g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public float f9468h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f9469i;

        /* renamed from: j */
        private long f9470j;

        /* renamed from: k */
        private C2443a f9471k = new C2443a(this, (C2441a) null);

        /* renamed from: n3.a$b$a */
        private class C2443a implements C1936b.C1954r {
            private C2443a() {
            }

            /* synthetic */ C2443a(C2442b bVar, C2441a aVar) {
                this();
            }

            /* renamed from: a */
            public void mo6573a(C1936b bVar, float f, float f2) {
                C2442b bVar2 = C2442b.this;
                bVar2.f9465e = f2;
                bVar2.f9466f = bVar2.f9462b + ((int) f);
                C2445b.m10368d("%s updating value(%f), velocity(%f), min(%f), max(%f)", bVar.getClass().getSimpleName(), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(C2442b.this.f9468h), Float.valueOf(C2442b.this.f9469i));
            }
        }

        /* renamed from: n3.a$b$b */
        interface C2444b {
            /* renamed from: a */
            boolean mo9360a(float f, float f2);
        }

        C2442b(C1936b<?> bVar, int i, float f) {
            this.f9461a = bVar;
            bVar.mo6534k(-3.4028235E38f);
            this.f9461a.mo6533j(Float.MAX_VALUE);
            this.f9462b = i;
            this.f9465e = f;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            if (i > 0) {
                i3 = Integer.MIN_VALUE + i;
            } else if (i < 0) {
                i2 = Integer.MAX_VALUE + i;
            }
            this.f9463c = i3;
            this.f9464d = i2;
            this.f9461a.mo6537n(0.0f);
            this.f9461a.mo6538o(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9361c() {
            this.f9470j = 0;
            this.f9461a.mo6529b();
            this.f9461a.mo6532i(this.f9471k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo9362d() {
            C2444b bVar = this.f9467g;
            if (bVar != null) {
                return bVar.mo9360a((float) this.f9466f, this.f9465e);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1936b<?> mo9363e() {
            return this.f9461a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo9364f(int i) {
            return i - this.f9462b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9365g(int i) {
            int i2 = this.f9464d;
            if (i > i2) {
                i = i2;
            }
            float max = (float) Math.max(i - this.f9462b, 0);
            this.f9461a.mo6533j(max);
            this.f9469i = max;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo9366h(int i) {
            int i2 = this.f9463c;
            if (i < i2) {
                i = i2;
            }
            float min = (float) Math.min(i - this.f9462b, 0);
            this.f9461a.mo6534k(min);
            this.f9468h = min;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo9367i(C2444b bVar) {
            this.f9467g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo9368j() {
            this.f9461a.mo6528a(this.f9471k);
            this.f9461a.mo6540q(true);
            this.f9470j = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo9369k() {
            long j = this.f9470j;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis == j) {
                C2445b.m10367c("update done in this frame, dropping current update request");
                return !this.f9461a.mo6531f();
            }
            boolean doAnimationFrame = this.f9461a.doAnimationFrame(currentAnimationTimeMillis);
            if (doAnimationFrame) {
                C2445b.m10368d("%s finishing value(%d) velocity(%f)", this.f9461a.getClass().getSimpleName(), Integer.valueOf(this.f9466f), Float.valueOf(this.f9465e));
                this.f9461a.mo6532i(this.f9471k);
                this.f9470j = 0;
            }
            this.f9470j = currentAnimationTimeMillis;
            return doAnimationFrame;
        }
    }

    C2440a(Context context) {
        super(context);
        C1961f fVar = new C1961f(this.f9453t);
        this.f9454u = fVar;
        fVar.mo6591w(new C1962g());
        this.f9454u.mo6535l(0.5f);
        this.f9454u.mo6589t().mo6594d(0.97f);
        this.f9454u.mo6589t().mo6596f(130.5f);
        this.f9454u.mo6589t().mo6597g(1000.0d);
        C1956c cVar = new C1956c(this.f9453t, this);
        this.f9455v = cVar;
        cVar.mo6535l(0.5f);
        this.f9455v.mo6580y(0.4761905f);
    }

    /* renamed from: L */
    private void m10338L(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        this.f9455v.mo6537n(0.0f);
        float f = (float) i2;
        this.f9455v.mo6538o(f);
        long v = ((long) i) + ((long) this.f9455v.mo6578v());
        if (v > ((long) i4)) {
            i7 = (int) this.f9455v.mo6579w((float) (i4 - i));
            i6 = i4;
        } else if (v < ((long) i3)) {
            i7 = (int) this.f9455v.mo6579w((float) (i3 - i));
            i6 = i3;
        } else {
            i6 = (int) v;
            i7 = (int) this.f9455v.mo6577u();
        }
        mo9407z(false);
        mo9403u(f);
        mo9391B(AnimationUtils.currentAnimationTimeMillis());
        mo9404v(i);
        mo9390A(i);
        mo9405w(i7);
        mo9406x(i6);
        mo9392C(0);
        int min = Math.min(i3, i);
        int max = Math.max(i4, i);
        C2442b bVar = new C2442b(this.f9455v, i, f);
        this.f9456w = bVar;
        bVar.mo9367i(new C2441a(i3, i4, i5));
        this.f9456w.mo9366h(min);
        this.f9456w.mo9365g(max);
        this.f9456w.mo9368j();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m10339M(int i, int i2, float f, int i3, int i4) {
        if (f > 8000.0f) {
            C2445b.m10366b("%f is too fast for spring, slow down", Float.valueOf(f));
            f = 8000.0f;
        }
        mo9407z(false);
        mo9403u(f);
        mo9391B(AnimationUtils.currentAnimationTimeMillis());
        mo9404v(i2);
        mo9390A(i2);
        mo9405w(Integer.MAX_VALUE);
        mo9406x(i3);
        mo9392C(i);
        this.f9456w = new C2442b(this.f9454u, i2, f);
        this.f9454u.mo6589t().mo6595e((float) this.f9456w.mo9364f(i3));
        if (i4 != 0) {
            if (f < 0.0f) {
                this.f9456w.mo9366h(i3 - i4);
                this.f9456w.mo9365g(Math.max(i3, i2));
            } else {
                this.f9456w.mo9366h(Math.min(i3, i2));
                this.f9456w.mo9365g(i3 + i4);
            }
        }
        this.f9456w.mo9368j();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m10340N() {
        if (this.f9456w != null) {
            C2445b.m10366b("resetting current handler: state(%d), anim(%s), value(%d), velocity(%f)", Integer.valueOf(mo9400q()), this.f9456w.mo9363e().getClass().getSimpleName(), Integer.valueOf(this.f9456w.f9466f), Float.valueOf(this.f9456w.f9465e));
            this.f9456w.mo9361c();
            this.f9456w = null;
        }
    }

    /* renamed from: O */
    private void m10341O(int i, int i2, int i3, int i4, int i5) {
        float f;
        int i6;
        boolean z = false;
        C2445b.m10366b("startAfterEdge: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5));
        if (i <= i2 || i >= i3) {
            boolean z2 = i > i3;
            int i7 = z2 ? i3 : i2;
            int i8 = i - i7;
            if (i4 != 0 && Integer.signum(i8) * i4 >= 0) {
                z = true;
            }
            if (z) {
                C2445b.m10365a("spring forward");
                i6 = 2;
                f = (float) i4;
            } else {
                this.f9455v.mo6537n((float) i);
                f = (float) i4;
                this.f9455v.mo6538o(f);
                float v = this.f9455v.mo6578v();
                if ((!z2 || v >= ((float) i3)) && (z2 || v <= ((float) i2))) {
                    C2445b.m10365a("spring backward");
                    i6 = 1;
                } else {
                    C2445b.m10365a("fling to content");
                    m10338L(i, i4, i2, i3, i5);
                    return;
                }
            }
            m10339M(i6, i, f, i7, i5);
            return;
        }
        mo9407z(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo9352D(int i, int i2, int i3) {
        int i4;
        float f;
        int i5;
        C2440a aVar;
        int i6;
        int i7;
        C2445b.m10366b("SPRING_BACK start(%d) boundary(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (this.f9456w != null) {
            m10340N();
        }
        if (i < i2) {
            i4 = 1;
            f = 0.0f;
            i5 = 0;
            aVar = this;
            i6 = i;
            i7 = i2;
        } else if (i > i3) {
            i4 = 1;
            f = 0.0f;
            i5 = 0;
            aVar = this;
            i6 = i;
            i7 = i3;
        } else {
            mo9404v(i);
            mo9390A(i);
            mo9406x(i);
            mo9405w(0);
            mo9407z(true);
            return !mo9402s();
        }
        aVar.m10339M(i4, i6, f, i7, i5);
        return !mo9402s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo9353F() {
        C2442b bVar = this.f9456w;
        if (bVar == null) {
            C2445b.m10365a("no handler found, aborting");
            return false;
        }
        boolean k = bVar.mo9369k();
        mo9404v(this.f9456w.f9466f);
        mo9403u(this.f9456w.f9465e);
        if (mo9400q() == 2 && Math.signum((float) this.f9456w.f9466f) * Math.signum(this.f9456w.f9465e) < 0.0f) {
            C2445b.m10365a("State Changed: BALLISTIC -> CUBIC");
            mo9392C(1);
        }
        return !k;
    }

    /* renamed from: P */
    public void mo9354P(double d) {
        float f;
        C1962g gVar;
        if (Math.abs(d) <= 5000.0d) {
            gVar = this.f9454u.mo6589t();
            f = 246.7f;
        } else {
            gVar = this.f9454u.mo6589t();
            f = 130.5f;
        }
        gVar.mo6596f(f);
    }

    /* renamed from: a */
    public void mo6586a(int i) {
        mo9359y(mo9399p() + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo9355j() {
        C2442b bVar = this.f9456w;
        if (bVar == null || !bVar.mo9362d()) {
            return false;
        }
        C2445b.m10365a("checking have more work when finish");
        mo9353F();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9356k() {
        C2445b.m10365a("finish scroller");
        mo9404v(mo9398o());
        mo9407z(true);
        m10340N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9357l(int i, int i2, int i3, int i4, int i5) {
        C2445b.m10366b("FLING: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        m10340N();
        if (i2 == 0) {
            mo9404v(i);
            mo9390A(i);
            mo9406x(i);
            mo9405w(0);
            mo9407z(true);
            return;
        }
        mo9354P((double) i2);
        if (i > i4 || i < i3) {
            m10341O(i, i3, i4, i2, i5);
        } else {
            m10338L(i, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo9358t(int i, int i2, int i3) {
        if (mo9400q() == 0) {
            if (this.f9456w != null) {
                m10340N();
            }
            m10341O(i, i2, i2, (int) mo9396m(), i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9359y(int i) {
        super.mo9359y(i);
    }
}
