package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
class C1217b {

    /* renamed from: a */
    final C1219b f4213a;

    /* renamed from: b */
    final C1218a f4214b = new C1218a();

    /* renamed from: c */
    final List<View> f4215c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    static class C1218a {

        /* renamed from: a */
        long f4216a = 0;

        /* renamed from: b */
        C1218a f4217b;

        C1218a() {
        }

        /* renamed from: c */
        private void m5554c() {
            if (this.f4217b == null) {
                this.f4217b = new C1218a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4852a(int i) {
            if (i >= 64) {
                C1218a aVar = this.f4217b;
                if (aVar != null) {
                    aVar.mo4852a(i - 64);
                    return;
                }
                return;
            }
            this.f4216a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4853b(int i) {
            C1218a aVar = this.f4217b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f4216a) : Long.bitCount(this.f4216a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f4216a & ((1 << i) - 1)) : aVar.mo4853b(i - 64) + Long.bitCount(this.f4216a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4854d(int i) {
            if (i < 64) {
                return (this.f4216a & (1 << i)) != 0;
            }
            m5554c();
            return this.f4217b.mo4854d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4855e(int i, boolean z) {
            if (i >= 64) {
                m5554c();
                this.f4217b.mo4855e(i - 64, z);
                return;
            }
            long j = this.f4216a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4216a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo4858h(i);
            } else {
                mo4852a(i);
            }
            if (z2 || this.f4217b != null) {
                m5554c();
                this.f4217b.mo4855e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo4856f(int i) {
            if (i >= 64) {
                m5554c();
                return this.f4217b.mo4856f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4216a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4216a = j3;
            long j4 = j - 1;
            this.f4216a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1218a aVar = this.f4217b;
            if (aVar != null) {
                if (aVar.mo4854d(0)) {
                    mo4858h(63);
                }
                this.f4217b.mo4856f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4857g() {
            this.f4216a = 0;
            C1218a aVar = this.f4217b;
            if (aVar != null) {
                aVar.mo4857g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4858h(int i) {
            if (i >= 64) {
                m5554c();
                this.f4217b.mo4858h(i - 64);
                return;
            }
            this.f4216a |= 1 << i;
        }

        public String toString() {
            if (this.f4217b == null) {
                return Long.toBinaryString(this.f4216a);
            }
            return this.f4217b.toString() + "xx" + Long.toBinaryString(this.f4216a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    interface C1219b {
        /* renamed from: a */
        View mo4434a(int i);

        /* renamed from: b */
        void mo4435b(View view);

        /* renamed from: c */
        RecyclerView.C1168e0 mo4436c(View view);

        /* renamed from: d */
        void mo4437d(int i);

        /* renamed from: e */
        void mo4438e(View view);

        /* renamed from: f */
        void mo4439f(View view, int i);

        /* renamed from: g */
        int mo4440g();

        /* renamed from: h */
        void mo4441h(int i);

        /* renamed from: i */
        void mo4442i();

        /* renamed from: j */
        void mo4443j(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo4444k(View view);
    }

    C1217b(C1219b bVar) {
        this.f4213a = bVar;
    }

    /* renamed from: h */
    private int m5534h(int i) {
        if (i < 0) {
            return -1;
        }
        int g = this.f4213a.mo4440g();
        int i2 = i;
        while (i2 < g) {
            int b = i - (i2 - this.f4214b.mo4853b(i2));
            if (b == 0) {
                while (this.f4214b.mo4854d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m5535l(View view) {
        this.f4215c.add(view);
        this.f4213a.mo4435b(view);
    }

    /* renamed from: t */
    private boolean m5536t(View view) {
        if (!this.f4215c.remove(view)) {
            return false;
        }
        this.f4213a.mo4438e(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4834a(View view, int i, boolean z) {
        int g = i < 0 ? this.f4213a.mo4440g() : m5534h(i);
        this.f4214b.mo4855e(g, z);
        if (z) {
            m5535l(view);
        }
        this.f4213a.mo4439f(view, g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4835b(View view, boolean z) {
        mo4834a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4836c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int g = i < 0 ? this.f4213a.mo4440g() : m5534h(i);
        this.f4214b.mo4855e(g, z);
        if (z) {
            m5535l(view);
        }
        this.f4213a.mo4443j(view, g, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4837d(int i) {
        int h = m5534h(i);
        this.f4214b.mo4856f(h);
        this.f4213a.mo4437d(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo4838e(int i) {
        int size = this.f4215c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4215c.get(i2);
            RecyclerView.C1168e0 c = this.f4213a.mo4436c(view);
            if (c.mo4468m() == i && !c.mo4475t() && !c.mo4478v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo4839f(int i) {
        return this.f4213a.mo4434a(m5534h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4840g() {
        return this.f4213a.mo4440g() - this.f4215c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo4841i(int i) {
        return this.f4213a.mo4434a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4842j() {
        return this.f4213a.mo4440g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4843k(View view) {
        int k = this.f4213a.mo4444k(view);
        if (k >= 0) {
            this.f4214b.mo4858h(k);
            m5535l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4844m(View view) {
        int k = this.f4213a.mo4444k(view);
        if (k != -1 && !this.f4214b.mo4854d(k)) {
            return k - this.f4214b.mo4853b(k);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4845n(View view) {
        return this.f4215c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4846o() {
        this.f4214b.mo4857g();
        for (int size = this.f4215c.size() - 1; size >= 0; size--) {
            this.f4213a.mo4438e(this.f4215c.get(size));
            this.f4215c.remove(size);
        }
        this.f4213a.mo4442i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4847p(View view) {
        int k = this.f4213a.mo4444k(view);
        if (k >= 0) {
            if (this.f4214b.mo4856f(k)) {
                m5536t(view);
            }
            this.f4213a.mo4441h(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4848q(int i) {
        int h = m5534h(i);
        View a = this.f4213a.mo4434a(h);
        if (a != null) {
            if (this.f4214b.mo4856f(h)) {
                m5536t(a);
            }
            this.f4213a.mo4441h(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4849r(View view) {
        int k = this.f4213a.mo4444k(view);
        if (k == -1) {
            m5536t(view);
            return true;
        } else if (!this.f4214b.mo4854d(k)) {
            return false;
        } else {
            this.f4214b.mo4856f(k);
            m5536t(view);
            this.f4213a.mo4441h(k);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4850s(View view) {
        int k = this.f4213a.mo4444k(view);
        if (k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4214b.mo4854d(k)) {
            this.f4214b.mo4852a(k);
            m5536t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4214b.toString() + ", hidden list:" + this.f4215c.size();
    }
}
