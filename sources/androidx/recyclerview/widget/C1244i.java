package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public abstract class C1244i {

    /* renamed from: a */
    protected final RecyclerView.C1183p f4336a;

    /* renamed from: b */
    private int f4337b;

    /* renamed from: c */
    final Rect f4338c;

    /* renamed from: androidx.recyclerview.widget.i$a */
    class C1245a extends C1244i {
        C1245a(RecyclerView.C1183p pVar) {
            super(pVar, (C1245a) null);
        }

        /* renamed from: d */
        public int mo4924d(View view) {
            return this.f4336a.mo4575T(view) + ((RecyclerView.C1188q) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo4925e(View view) {
            RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
            return this.f4336a.mo4574S(view) + qVar.leftMargin + qVar.rightMargin;
        }

        /* renamed from: f */
        public int mo4926f(View view) {
            RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
            return this.f4336a.mo4573R(view) + qVar.topMargin + qVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo4927g(View view) {
            return this.f4336a.mo4572Q(view) - ((RecyclerView.C1188q) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo4928h() {
            return this.f4336a.mo4614n0();
        }

        /* renamed from: i */
        public int mo4929i() {
            return this.f4336a.mo4614n0() - this.f4336a.mo4595e0();
        }

        /* renamed from: j */
        public int mo4930j() {
            return this.f4336a.mo4595e0();
        }

        /* renamed from: k */
        public int mo4931k() {
            return this.f4336a.mo4616o0();
        }

        /* renamed from: l */
        public int mo4932l() {
            return this.f4336a.mo4580X();
        }

        /* renamed from: m */
        public int mo4933m() {
            return this.f4336a.mo4592d0();
        }

        /* renamed from: n */
        public int mo4934n() {
            return (this.f4336a.mo4614n0() - this.f4336a.mo4592d0()) - this.f4336a.mo4595e0();
        }

        /* renamed from: p */
        public int mo4936p(View view) {
            this.f4336a.mo4612m0(view, true, this.f4338c);
            return this.f4338c.right;
        }

        /* renamed from: q */
        public int mo4937q(View view) {
            this.f4336a.mo4612m0(view, true, this.f4338c);
            return this.f4338c.left;
        }

        /* renamed from: r */
        public void mo4938r(int i) {
            this.f4336a.mo4549B0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    class C1246b extends C1244i {
        C1246b(RecyclerView.C1183p pVar) {
            super(pVar, (C1245a) null);
        }

        /* renamed from: d */
        public int mo4924d(View view) {
            return this.f4336a.mo4569O(view) + ((RecyclerView.C1188q) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo4925e(View view) {
            RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
            return this.f4336a.mo4573R(view) + qVar.topMargin + qVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo4926f(View view) {
            RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
            return this.f4336a.mo4574S(view) + qVar.leftMargin + qVar.rightMargin;
        }

        /* renamed from: g */
        public int mo4927g(View view) {
            return this.f4336a.mo4576U(view) - ((RecyclerView.C1188q) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo4928h() {
            return this.f4336a.mo4579W();
        }

        /* renamed from: i */
        public int mo4929i() {
            return this.f4336a.mo4579W() - this.f4336a.mo4590c0();
        }

        /* renamed from: j */
        public int mo4930j() {
            return this.f4336a.mo4590c0();
        }

        /* renamed from: k */
        public int mo4931k() {
            return this.f4336a.mo4580X();
        }

        /* renamed from: l */
        public int mo4932l() {
            return this.f4336a.mo4616o0();
        }

        /* renamed from: m */
        public int mo4933m() {
            return this.f4336a.mo4597f0();
        }

        /* renamed from: n */
        public int mo4934n() {
            return (this.f4336a.mo4579W() - this.f4336a.mo4597f0()) - this.f4336a.mo4590c0();
        }

        /* renamed from: p */
        public int mo4936p(View view) {
            this.f4336a.mo4612m0(view, true, this.f4338c);
            return this.f4338c.bottom;
        }

        /* renamed from: q */
        public int mo4937q(View view) {
            this.f4336a.mo4612m0(view, true, this.f4338c);
            return this.f4338c.top;
        }

        /* renamed from: r */
        public void mo4938r(int i) {
            this.f4336a.mo4551C0(i);
        }
    }

    private C1244i(RecyclerView.C1183p pVar) {
        this.f4337b = Integer.MIN_VALUE;
        this.f4338c = new Rect();
        this.f4336a = pVar;
    }

    /* synthetic */ C1244i(RecyclerView.C1183p pVar, C1245a aVar) {
        this(pVar);
    }

    /* renamed from: a */
    public static C1244i m5658a(RecyclerView.C1183p pVar) {
        return new C1245a(pVar);
    }

    /* renamed from: b */
    public static C1244i m5659b(RecyclerView.C1183p pVar, int i) {
        if (i == 0) {
            return m5658a(pVar);
        }
        if (i == 1) {
            return m5660c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1244i m5660c(RecyclerView.C1183p pVar) {
        return new C1246b(pVar);
    }

    /* renamed from: d */
    public abstract int mo4924d(View view);

    /* renamed from: e */
    public abstract int mo4925e(View view);

    /* renamed from: f */
    public abstract int mo4926f(View view);

    /* renamed from: g */
    public abstract int mo4927g(View view);

    /* renamed from: h */
    public abstract int mo4928h();

    /* renamed from: i */
    public abstract int mo4929i();

    /* renamed from: j */
    public abstract int mo4930j();

    /* renamed from: k */
    public abstract int mo4931k();

    /* renamed from: l */
    public abstract int mo4932l();

    /* renamed from: m */
    public abstract int mo4933m();

    /* renamed from: n */
    public abstract int mo4934n();

    /* renamed from: o */
    public int mo4935o() {
        if (Integer.MIN_VALUE == this.f4337b) {
            return 0;
        }
        return mo4934n() - this.f4337b;
    }

    /* renamed from: p */
    public abstract int mo4936p(View view);

    /* renamed from: q */
    public abstract int mo4937q(View view);

    /* renamed from: r */
    public abstract void mo4938r(int i);

    /* renamed from: s */
    public void mo4939s() {
        this.f4337b = mo4934n();
    }
}
