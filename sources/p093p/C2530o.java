package p093p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p069l.C1858d;
import p087o.C2471b;
import p087o.C2473d;
import p087o.C2476e;
import p087o.C2479f;

/* renamed from: p.o */
public class C2530o {

    /* renamed from: g */
    static int f9976g;

    /* renamed from: a */
    ArrayList<C2476e> f9977a = new ArrayList<>();

    /* renamed from: b */
    int f9978b;

    /* renamed from: c */
    boolean f9979c = false;

    /* renamed from: d */
    int f9980d;

    /* renamed from: e */
    ArrayList<C2531a> f9981e = null;

    /* renamed from: f */
    private int f9982f = -1;

    /* renamed from: p.o$a */
    class C2531a {

        /* renamed from: a */
        WeakReference<C2476e> f9983a;

        /* renamed from: b */
        int f9984b;

        /* renamed from: c */
        int f9985c;

        /* renamed from: d */
        int f9986d;

        /* renamed from: e */
        int f9987e;

        /* renamed from: f */
        int f9988f;

        /* renamed from: g */
        int f9989g;

        public C2531a(C2476e eVar, C1858d dVar, int i) {
            this.f9983a = new WeakReference<>(eVar);
            this.f9984b = dVar.mo6410x(eVar.f9572O);
            this.f9985c = dVar.mo6410x(eVar.f9573P);
            this.f9986d = dVar.mo6410x(eVar.f9574Q);
            this.f9987e = dVar.mo6410x(eVar.f9575R);
            this.f9988f = dVar.mo6410x(eVar.f9576S);
            this.f9989g = i;
        }
    }

    public C2530o(int i) {
        int i2 = f9976g;
        f9976g = i2 + 1;
        this.f9978b = i2;
        this.f9980d = i;
    }

    /* renamed from: e */
    private String m10746e() {
        int i = this.f9980d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m10747j(C1858d dVar, ArrayList<C2476e> arrayList, int i) {
        int x;
        C2473d dVar2;
        C2479f fVar = (C2479f) arrayList.get(0).mo9481I();
        dVar.mo6392D();
        fVar.mo9430g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo9430g(dVar, false);
        }
        if (i == 0 && fVar.f9653W0 > 0) {
            C2471b.m10437b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.f9654X0 > 0) {
            C2471b.m10437b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo6411z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f9981e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f9981e.add(new C2531a(arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            x = dVar.mo6410x(fVar.f9572O);
            dVar2 = fVar.f9574Q;
        } else {
            x = dVar.mo6410x(fVar.f9573P);
            dVar2 = fVar.f9575R;
        }
        int x2 = dVar.mo6410x(dVar2);
        dVar.mo6392D();
        return x2 - x;
    }

    /* renamed from: a */
    public boolean mo9701a(C2476e eVar) {
        if (this.f9977a.contains(eVar)) {
            return false;
        }
        this.f9977a.add(eVar);
        return true;
    }

    /* renamed from: b */
    public void mo9702b(ArrayList<C2530o> arrayList) {
        int size = this.f9977a.size();
        if (this.f9982f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2530o oVar = arrayList.get(i);
                if (this.f9982f == oVar.f9978b) {
                    mo9706g(this.f9980d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo9703c() {
        return this.f9978b;
    }

    /* renamed from: d */
    public int mo9704d() {
        return this.f9980d;
    }

    /* renamed from: f */
    public int mo9705f(C1858d dVar, int i) {
        if (this.f9977a.size() == 0) {
            return 0;
        }
        return m10747j(dVar, this.f9977a, i);
    }

    /* renamed from: g */
    public void mo9706g(int i, C2530o oVar) {
        Iterator<C2476e> it = this.f9977a.iterator();
        while (it.hasNext()) {
            C2476e next = it.next();
            oVar.mo9701a(next);
            int c = oVar.mo9703c();
            if (i == 0) {
                next.f9565I0 = c;
            } else {
                next.f9567J0 = c;
            }
        }
        this.f9982f = oVar.f9978b;
    }

    /* renamed from: h */
    public void mo9707h(boolean z) {
        this.f9979c = z;
    }

    /* renamed from: i */
    public void mo9708i(int i) {
        this.f9980d = i;
    }

    public String toString() {
        String str = m10746e() + " [" + this.f9978b + "] <";
        Iterator<C2476e> it = this.f9977a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo9553r();
        }
        return str + " >";
    }
}
