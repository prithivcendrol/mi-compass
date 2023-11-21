package androidx.recyclerview.widget;

import androidx.core.util.C0621d;
import androidx.core.util.C0622e;
import androidx.recyclerview.widget.RecyclerView;
import p063k.C1772e;
import p063k.C1774g;

/* renamed from: androidx.recyclerview.widget.q */
class C1258q {

    /* renamed from: a */
    final C1774g<RecyclerView.C1168e0, C1259a> f4366a = new C1774g<>();

    /* renamed from: b */
    final C1772e<RecyclerView.C1168e0> f4367b = new C1772e<>();

    /* renamed from: androidx.recyclerview.widget.q$a */
    static class C1259a {

        /* renamed from: d */
        static C0621d<C1259a> f4368d = new C0622e(20);

        /* renamed from: a */
        int f4369a;

        /* renamed from: b */
        RecyclerView.C1177m.C1180c f4370b;

        /* renamed from: c */
        RecyclerView.C1177m.C1180c f4371c;

        private C1259a() {
        }

        /* renamed from: a */
        static void m5795a() {
            do {
            } while (f4368d.mo2709b() != null);
        }

        /* renamed from: b */
        static C1259a m5796b() {
            C1259a b = f4368d.mo2709b();
            return b == null ? new C1259a() : b;
        }

        /* renamed from: c */
        static void m5797c(C1259a aVar) {
            aVar.f4369a = 0;
            aVar.f4370b = null;
            aVar.f4371c = null;
            f4368d.mo2708a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    interface C1260b {
        /* renamed from: a */
        void mo4425a(RecyclerView.C1168e0 e0Var);

        /* renamed from: b */
        void mo4426b(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2);

        /* renamed from: c */
        void mo4427c(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2);

        /* renamed from: d */
        void mo4428d(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2);
    }

    C1258q() {
    }

    /* renamed from: l */
    private RecyclerView.C1177m.C1180c m5778l(RecyclerView.C1168e0 e0Var, int i) {
        C1259a m;
        RecyclerView.C1177m.C1180c cVar;
        int f = this.f4366a.mo6155f(e0Var);
        if (f >= 0 && (m = this.f4366a.mo6166m(f)) != null) {
            int i2 = m.f4369a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.f4369a = i3;
                if (i == 4) {
                    cVar = m.f4370b;
                } else if (i == 8) {
                    cVar = m.f4371c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4366a.mo6164k(f);
                    C1259a.m5797c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4967a(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar) {
        C1259a aVar = this.f4366a.get(e0Var);
        if (aVar == null) {
            aVar = C1259a.m5796b();
            this.f4366a.put(e0Var, aVar);
        }
        aVar.f4369a |= 2;
        aVar.f4370b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4968b(RecyclerView.C1168e0 e0Var) {
        C1259a aVar = this.f4366a.get(e0Var);
        if (aVar == null) {
            aVar = C1259a.m5796b();
            this.f4366a.put(e0Var, aVar);
        }
        aVar.f4369a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4969c(long j, RecyclerView.C1168e0 e0Var) {
        this.f4367b.mo6136h(j, e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4970d(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar) {
        C1259a aVar = this.f4366a.get(e0Var);
        if (aVar == null) {
            aVar = C1259a.m5796b();
            this.f4366a.put(e0Var, aVar);
        }
        aVar.f4371c = cVar;
        aVar.f4369a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4971e(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar) {
        C1259a aVar = this.f4366a.get(e0Var);
        if (aVar == null) {
            aVar = C1259a.m5796b();
            this.f4366a.put(e0Var, aVar);
        }
        aVar.f4370b = cVar;
        aVar.f4369a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4972f() {
        this.f4366a.clear();
        this.f4367b.mo6129a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1168e0 mo4973g(long j) {
        return this.f4367b.mo6132d(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo4974h(RecyclerView.C1168e0 e0Var) {
        C1259a aVar = this.f4366a.get(e0Var);
        return (aVar == null || (aVar.f4369a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4975i(RecyclerView.C1168e0 e0Var) {
        C1259a aVar = this.f4366a.get(e0Var);
        return (aVar == null || (aVar.f4369a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4976j() {
        C1259a.m5795a();
    }

    /* renamed from: k */
    public void mo4977k(RecyclerView.C1168e0 e0Var) {
        mo4981p(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1177m.C1180c mo4978m(RecyclerView.C1168e0 e0Var) {
        return m5778l(e0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1177m.C1180c mo4979n(RecyclerView.C1168e0 e0Var) {
        return m5778l(e0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4980o(C1260b bVar) {
        RecyclerView.C1177m.C1180c cVar;
        RecyclerView.C1177m.C1180c cVar2;
        for (int size = this.f4366a.size() - 1; size >= 0; size--) {
            RecyclerView.C1168e0 i = this.f4366a.mo6161i(size);
            C1259a k = this.f4366a.mo6164k(size);
            int i2 = k.f4369a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f4370b;
                    if (cVar != null) {
                        cVar2 = k.f4371c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.mo4428d(i, k.f4370b, k.f4371c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f4370b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        C1259a.m5797c(k);
                    }
                    bVar.mo4426b(i, k.f4370b, k.f4371c);
                    C1259a.m5797c(k);
                }
                bVar.mo4427c(i, cVar, cVar2);
                C1259a.m5797c(k);
            }
            bVar.mo4425a(i);
            C1259a.m5797c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4981p(RecyclerView.C1168e0 e0Var) {
        C1259a aVar = this.f4366a.get(e0Var);
        if (aVar != null) {
            aVar.f4369a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4982q(RecyclerView.C1168e0 e0Var) {
        int k = this.f4367b.mo6139k() - 1;
        while (true) {
            if (k < 0) {
                break;
            } else if (e0Var == this.f4367b.mo6140l(k)) {
                this.f4367b.mo6138j(k);
                break;
            } else {
                k--;
            }
        }
        C1259a remove = this.f4366a.remove(e0Var);
        if (remove != null) {
            C1259a.m5797c(remove);
        }
    }
}
