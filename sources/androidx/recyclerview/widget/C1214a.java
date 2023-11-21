package androidx.recyclerview.widget;

import androidx.core.util.C0621d;
import androidx.core.util.C0622e;
import androidx.recyclerview.widget.C1242h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
final class C1214a implements C1242h.C1243a {

    /* renamed from: a */
    private C0621d<C1216b> f4201a;

    /* renamed from: b */
    final ArrayList<C1216b> f4202b;

    /* renamed from: c */
    final ArrayList<C1216b> f4203c;

    /* renamed from: d */
    final C1215a f4204d;

    /* renamed from: e */
    Runnable f4205e;

    /* renamed from: f */
    final boolean f4206f;

    /* renamed from: g */
    final C1242h f4207g;

    /* renamed from: h */
    private int f4208h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C1215a {
        /* renamed from: a */
        void mo4483a(int i, int i2);

        /* renamed from: b */
        void mo4484b(C1216b bVar);

        /* renamed from: c */
        RecyclerView.C1168e0 mo4485c(int i);

        /* renamed from: d */
        void mo4486d(int i, int i2);

        /* renamed from: e */
        void mo4487e(int i, int i2);

        /* renamed from: f */
        void mo4488f(int i, int i2);

        /* renamed from: g */
        void mo4489g(C1216b bVar);

        /* renamed from: h */
        void mo4490h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static final class C1216b {

        /* renamed from: a */
        int f4209a;

        /* renamed from: b */
        int f4210b;

        /* renamed from: c */
        Object f4211c;

        /* renamed from: d */
        int f4212d;

        C1216b(int i, int i2, int i3, Object obj) {
            this.f4209a = i;
            this.f4210b = i2;
            this.f4212d = i3;
            this.f4211c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4830a() {
            int i = this.f4209a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1216b)) {
                return false;
            }
            C1216b bVar = (C1216b) obj;
            int i = this.f4209a;
            if (i != bVar.f4209a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4212d - this.f4210b) == 1 && this.f4212d == bVar.f4210b && this.f4210b == bVar.f4212d) {
                return true;
            }
            if (this.f4212d != bVar.f4212d || this.f4210b != bVar.f4210b) {
                return false;
            }
            Object obj2 = this.f4211c;
            Object obj3 = bVar.f4211c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4209a * 31) + this.f4210b) * 31) + this.f4212d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4830a() + ",s:" + this.f4210b + "c:" + this.f4212d + ",p:" + this.f4211c + "]";
        }
    }

    C1214a(C1215a aVar) {
        this(aVar, false);
    }

    C1214a(C1215a aVar, boolean z) {
        this.f4201a = new C0622e(30);
        this.f4202b = new ArrayList<>();
        this.f4203c = new ArrayList<>();
        this.f4208h = 0;
        this.f4204d = aVar;
        this.f4206f = z;
        this.f4207g = new C1242h(this);
    }

    /* renamed from: c */
    private void m5502c(C1216b bVar) {
        m5508s(bVar);
    }

    /* renamed from: d */
    private void m5503d(C1216b bVar) {
        m5508s(bVar);
    }

    /* renamed from: f */
    private void m5504f(C1216b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f4210b;
        int i2 = bVar.f4212d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4204d.mo4485c(i3) != null || m5506h(i3)) {
                if (c2 == 0) {
                    m5507k(mo4816b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5508s(mo4816b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f4212d) {
            mo4815a(bVar);
            bVar = mo4816b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m5507k(bVar);
        } else {
            m5508s(bVar);
        }
    }

    /* renamed from: g */
    private void m5505g(C1216b bVar) {
        int i = bVar.f4210b;
        int i2 = bVar.f4212d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f4204d.mo4485c(i) != null || m5506h(i)) {
                if (!z) {
                    m5507k(mo4816b(4, i4, i3, bVar.f4211c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m5508s(mo4816b(4, i4, i3, bVar.f4211c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f4212d) {
            Object obj = bVar.f4211c;
            mo4815a(bVar);
            bVar = mo4816b(4, i4, i3, obj);
        }
        if (!z) {
            m5507k(bVar);
        } else {
            m5508s(bVar);
        }
    }

    /* renamed from: h */
    private boolean m5506h(int i) {
        int size = this.f4203c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1216b bVar = this.f4203c.get(i2);
            int i3 = bVar.f4209a;
            if (i3 == 8) {
                if (mo4822n(bVar.f4212d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4210b;
                int i5 = bVar.f4212d + i4;
                while (i4 < i5) {
                    if (mo4822n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m5507k(C1216b bVar) {
        int i;
        int i2 = bVar.f4209a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int w = m5509w(bVar.f4210b, i2);
        int i3 = bVar.f4210b;
        int i4 = bVar.f4209a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4212d; i6++) {
            int w2 = m5509w(bVar.f4210b + (i * i6), bVar.f4209a);
            int i7 = bVar.f4209a;
            if (i7 == 2 ? w2 == w : i7 == 4 && w2 == w + 1) {
                i5++;
            } else {
                C1216b b = mo4816b(i7, w, i5, bVar.f4211c);
                mo4820l(b, i3);
                mo4815a(b);
                if (bVar.f4209a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                w = w2;
            }
        }
        Object obj = bVar.f4211c;
        mo4815a(bVar);
        if (i5 > 0) {
            C1216b b2 = mo4816b(bVar.f4209a, w, i5, obj);
            mo4820l(b2, i3);
            mo4815a(b2);
        }
    }

    /* renamed from: s */
    private void m5508s(C1216b bVar) {
        this.f4203c.add(bVar);
        int i = bVar.f4209a;
        if (i == 1) {
            this.f4204d.mo4487e(bVar.f4210b, bVar.f4212d);
        } else if (i == 2) {
            this.f4204d.mo4486d(bVar.f4210b, bVar.f4212d);
        } else if (i == 4) {
            this.f4204d.mo4490h(bVar.f4210b, bVar.f4212d, bVar.f4211c);
        } else if (i == 8) {
            this.f4204d.mo4483a(bVar.f4210b, bVar.f4212d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: w */
    private int m5509w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f4203c.size() - 1; size >= 0; size--) {
            C1216b bVar = this.f4203c.get(size);
            int i9 = bVar.f4209a;
            if (i9 == 8) {
                int i10 = bVar.f4210b;
                int i11 = bVar.f4212d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f4210b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f4210b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f4212d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f4212d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f4210b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f4210b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f4210b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f4212d;
                } else if (i9 == 2) {
                    i += bVar.f4212d;
                }
            }
        }
        for (int size2 = this.f4203c.size() - 1; size2 >= 0; size2--) {
            C1216b bVar2 = this.f4203c.get(size2);
            if (bVar2.f4209a == 8) {
                int i13 = bVar2.f4212d;
                if (i13 != bVar2.f4210b && i13 >= 0) {
                }
            } else if (bVar2.f4212d > 0) {
            }
            this.f4203c.remove(size2);
            mo4815a(bVar2);
        }
        return i;
    }

    /* renamed from: a */
    public void mo4815a(C1216b bVar) {
        if (!this.f4206f) {
            bVar.f4211c = null;
            this.f4201a.mo2708a(bVar);
        }
    }

    /* renamed from: b */
    public C1216b mo4816b(int i, int i2, int i3, Object obj) {
        C1216b b = this.f4201a.mo2709b();
        if (b == null) {
            return new C1216b(i, i2, i3, obj);
        }
        b.f4209a = i;
        b.f4210b = i2;
        b.f4212d = i3;
        b.f4211c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo4817e(int i) {
        int size = this.f4202b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1216b bVar = this.f4202b.get(i2);
            int i3 = bVar.f4209a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4210b;
                    if (i4 <= i) {
                        int i5 = bVar.f4212d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4210b;
                    if (i6 == i) {
                        i = bVar.f4212d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4212d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4210b <= i) {
                i += bVar.f4212d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4818i() {
        int size = this.f4203c.size();
        for (int i = 0; i < size; i++) {
            this.f4204d.mo4484b(this.f4203c.get(i));
        }
        mo4828u(this.f4203c);
        this.f4208h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4819j() {
        mo4818i();
        int size = this.f4202b.size();
        for (int i = 0; i < size; i++) {
            C1216b bVar = this.f4202b.get(i);
            int i2 = bVar.f4209a;
            if (i2 == 1) {
                this.f4204d.mo4484b(bVar);
                this.f4204d.mo4487e(bVar.f4210b, bVar.f4212d);
            } else if (i2 == 2) {
                this.f4204d.mo4484b(bVar);
                this.f4204d.mo4488f(bVar.f4210b, bVar.f4212d);
            } else if (i2 == 4) {
                this.f4204d.mo4484b(bVar);
                this.f4204d.mo4490h(bVar.f4210b, bVar.f4212d, bVar.f4211c);
            } else if (i2 == 8) {
                this.f4204d.mo4484b(bVar);
                this.f4204d.mo4483a(bVar.f4210b, bVar.f4212d);
            }
            Runnable runnable = this.f4205e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4828u(this.f4202b);
        this.f4208h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4820l(C1216b bVar, int i) {
        this.f4204d.mo4489g(bVar);
        int i2 = bVar.f4209a;
        if (i2 == 2) {
            this.f4204d.mo4488f(i, bVar.f4212d);
        } else if (i2 == 4) {
            this.f4204d.mo4490h(i, bVar.f4212d, bVar.f4211c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4821m(int i) {
        return mo4822n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo4822n(int i, int i2) {
        int size = this.f4203c.size();
        while (i2 < size) {
            C1216b bVar = this.f4203c.get(i2);
            int i3 = bVar.f4209a;
            if (i3 == 8) {
                int i4 = bVar.f4210b;
                if (i4 == i) {
                    i = bVar.f4212d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4212d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4210b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4212d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4212d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4823o(int i) {
        return (i & this.f4208h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4824p() {
        return this.f4202b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4825q() {
        return !this.f4203c.isEmpty() && !this.f4202b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4826r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4202b.add(mo4816b(4, i, i2, obj));
        this.f4208h |= 4;
        return this.f4202b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4827t() {
        this.f4207g.mo4921b(this.f4202b);
        int size = this.f4202b.size();
        for (int i = 0; i < size; i++) {
            C1216b bVar = this.f4202b.get(i);
            int i2 = bVar.f4209a;
            if (i2 == 1) {
                m5502c(bVar);
            } else if (i2 == 2) {
                m5504f(bVar);
            } else if (i2 == 4) {
                m5505g(bVar);
            } else if (i2 == 8) {
                m5503d(bVar);
            }
            Runnable runnable = this.f4205e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4202b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4828u(List<C1216b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4815a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4829v() {
        mo4828u(this.f4202b);
        mo4828u(this.f4203c);
        this.f4208h = 0;
    }
}
