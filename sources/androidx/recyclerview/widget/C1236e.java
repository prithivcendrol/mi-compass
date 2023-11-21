package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p008os.C0586i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.e */
final class C1236e implements Runnable {

    /* renamed from: h */
    static final ThreadLocal<C1236e> f4305h = new ThreadLocal<>();

    /* renamed from: i */
    static Comparator<C1239c> f4306i = new C1237a();

    /* renamed from: d */
    ArrayList<RecyclerView> f4307d = new ArrayList<>();

    /* renamed from: e */
    long f4308e;

    /* renamed from: f */
    long f4309f;

    /* renamed from: g */
    private ArrayList<C1239c> f4310g = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    class C1237a implements Comparator<C1239c> {
        C1237a() {
        }

        /* renamed from: a */
        public int compare(C1239c cVar, C1239c cVar2) {
            RecyclerView recyclerView = cVar.f4318d;
            if ((recyclerView == null) != (cVar2.f4318d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f4315a;
            if (z != cVar2.f4315a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f4316b - cVar.f4316b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f4317c - cVar2.f4317c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    static class C1238b implements RecyclerView.C1183p.C1186c {

        /* renamed from: a */
        int f4311a;

        /* renamed from: b */
        int f4312b;

        /* renamed from: c */
        int[] f4313c;

        /* renamed from: d */
        int f4314d;

        C1238b() {
        }

        /* renamed from: a */
        public void mo4642a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4314d * 2;
                int[] iArr = this.f4313c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4313c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4313c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4313c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4314d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4904b() {
            int[] iArr = this.f4313c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4314d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4905c(RecyclerView recyclerView, boolean z) {
            this.f4314d = 0;
            int[] iArr = this.f4313c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C1183p pVar = recyclerView.f3992p;
            if (recyclerView.f3990o != null && pVar != null && pVar.mo4624t0()) {
                if (z) {
                    if (!recyclerView.f3974g.mo4824p()) {
                        pVar.mo4201p(recyclerView.f3990o.mo4094g(), this);
                    }
                } else if (!recyclerView.mo4328l0()) {
                    pVar.mo4200o(this.f4311a, this.f4312b, recyclerView.f3983k0, this);
                }
                int i = this.f4314d;
                if (i > pVar.f4100m) {
                    pVar.f4100m = i;
                    pVar.f4101n = z;
                    recyclerView.f3970e.mo4674K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4906d(int i) {
            if (this.f4313c != null) {
                int i2 = this.f4314d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4313c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4907e(int i, int i2) {
            this.f4311a = i;
            this.f4312b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    static class C1239c {

        /* renamed from: a */
        public boolean f4315a;

        /* renamed from: b */
        public int f4316b;

        /* renamed from: c */
        public int f4317c;

        /* renamed from: d */
        public RecyclerView f4318d;

        /* renamed from: e */
        public int f4319e;

        C1239c() {
        }

        /* renamed from: a */
        public void mo4908a() {
            this.f4315a = false;
            this.f4316b = 0;
            this.f4317c = 0;
            this.f4318d = null;
            this.f4319e = 0;
        }
    }

    C1236e() {
    }

    /* renamed from: b */
    private void m5617b() {
        C1239c cVar;
        int size = this.f4307d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4307d.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3981j0.mo4905c(recyclerView, false);
                i += recyclerView.f3981j0.f4314d;
            }
        }
        this.f4310g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4307d.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1238b bVar = recyclerView2.f3981j0;
                int abs = Math.abs(bVar.f4311a) + Math.abs(bVar.f4312b);
                for (int i5 = 0; i5 < bVar.f4314d * 2; i5 += 2) {
                    if (i3 >= this.f4310g.size()) {
                        cVar = new C1239c();
                        this.f4310g.add(cVar);
                    } else {
                        cVar = this.f4310g.get(i3);
                    }
                    int[] iArr = bVar.f4313c;
                    int i6 = iArr[i5 + 1];
                    cVar.f4315a = i6 <= abs;
                    cVar.f4316b = abs;
                    cVar.f4317c = i6;
                    cVar.f4318d = recyclerView2;
                    cVar.f4319e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4310g, f4306i);
    }

    /* renamed from: c */
    private void m5618c(C1239c cVar, long j) {
        RecyclerView.C1168e0 i = m5622i(cVar.f4318d, cVar.f4319e, cVar.f4315a ? Long.MAX_VALUE : j);
        if (i != null && i.f4050b != null && i.mo4474s() && !i.mo4475t()) {
            m5621h(i.f4050b.get(), j);
        }
    }

    /* renamed from: d */
    private void m5619d(long j) {
        int i = 0;
        while (i < this.f4310g.size()) {
            C1239c cVar = this.f4310g.get(i);
            if (cVar.f4318d != null) {
                m5618c(cVar, j);
                cVar.mo4908a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m5620e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f3976h.mo4842j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1168e0 f0 = RecyclerView.m4853f0(recyclerView.f3976h.mo4841i(i2));
            if (f0.f4051c == i && !f0.mo4475t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5621h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3949H && recyclerView.f3976h.mo4842j() != 0) {
                recyclerView.mo4258U0();
            }
            C1238b bVar = recyclerView.f3981j0;
            bVar.mo4905c(recyclerView, true);
            if (bVar.f4314d != 0) {
                try {
                    C0586i.m2412a("RV Nested Prefetch");
                    recyclerView.f3983k0.mo4421f(recyclerView.f3990o);
                    for (int i = 0; i < bVar.f4314d * 2; i += 2) {
                        m5622i(recyclerView, bVar.f4313c[i], j);
                    }
                } finally {
                    C0586i.m2413b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C1168e0 m5622i(RecyclerView recyclerView, int i, long j) {
        if (m5620e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1195w wVar = recyclerView.f3970e;
        try {
            recyclerView.mo4240G0();
            RecyclerView.C1168e0 I = wVar.mo4672I(i, false, j);
            if (I != null) {
                if (!I.mo4474s() || I.mo4475t()) {
                    wVar.mo4677a(I, false);
                } else {
                    wVar.mo4666B(I.f4049a);
                }
            }
            return I;
        } finally {
            recyclerView.mo4244I0(false);
        }
    }

    /* renamed from: a */
    public void mo4897a(RecyclerView recyclerView) {
        this.f4307d.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4898f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4308e == 0) {
            this.f4308e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3981j0.mo4907e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4899g(long j) {
        m5617b();
        m5619d(j);
    }

    /* renamed from: j */
    public void mo4900j(RecyclerView recyclerView) {
        this.f4307d.remove(recyclerView);
    }

    public void run() {
        try {
            C0586i.m2412a("RV Prefetch");
            if (!this.f4307d.isEmpty()) {
                int size = this.f4307d.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4307d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4899g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4309f);
                    this.f4308e = 0;
                    C0586i.m2413b();
                }
            }
        } finally {
            this.f4308e = 0;
            C0586i.m2413b();
        }
    }
}
