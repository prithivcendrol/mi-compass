package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import java.util.Map;
import p051i.C1632a;
import p057j.C1660b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f3399k = new Object();

    /* renamed from: a */
    final Object f3400a = new Object();

    /* renamed from: b */
    private C1660b<C1055s<? super T>, LiveData<T>.c> f3401b = new C1660b<>();

    /* renamed from: c */
    int f3402c = 0;

    /* renamed from: d */
    private boolean f3403d;

    /* renamed from: e */
    private volatile Object f3404e;

    /* renamed from: f */
    volatile Object f3405f;

    /* renamed from: g */
    private int f3406g;

    /* renamed from: h */
    private boolean f3407h;

    /* renamed from: i */
    private boolean f3408i;

    /* renamed from: j */
    private final Runnable f3409j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C1046k {

        /* renamed from: h */
        final C1048m f3410h;

        /* renamed from: i */
        final /* synthetic */ LiveData f3411i;

        /* renamed from: g */
        public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
            C1035g.C1038c b = this.f3410h.mo252c().mo3791b();
            if (b == C1035g.C1038c.DESTROYED) {
                this.f3411i.mo3743h(this.f3414d);
                return;
            }
            C1035g.C1038c cVar = null;
            while (cVar != b) {
                mo3748h(mo3746j());
                cVar = b;
                b = this.f3410h.mo252c().mo3791b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3745i() {
            this.f3410h.mo252c().mo3792c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3746j() {
            return this.f3410h.mo252c().mo3791b().mo3794a(C1035g.C1038c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1005a implements Runnable {
        C1005a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3400a) {
                obj = LiveData.this.f3405f;
                LiveData.this.f3405f = LiveData.f3399k;
            }
            LiveData.this.mo3744i(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1006b extends LiveData<T>.c {
        C1006b(C1055s<? super T> sVar) {
            super(sVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3746j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1007c {

        /* renamed from: d */
        final C1055s<? super T> f3414d;

        /* renamed from: e */
        boolean f3415e;

        /* renamed from: f */
        int f3416f = -1;

        C1007c(C1055s<? super T> sVar) {
            this.f3414d = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3748h(boolean z) {
            if (z != this.f3415e) {
                this.f3415e = z;
                LiveData.this.mo3738b(z ? 1 : -1);
                if (this.f3415e) {
                    LiveData.this.mo3739d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3745i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract boolean mo3746j();
    }

    public LiveData() {
        Object obj = f3399k;
        this.f3405f = obj;
        this.f3409j = new C1005a();
        this.f3404e = obj;
        this.f3406g = -1;
    }

    /* renamed from: a */
    static void m4147a(String str) {
        if (!C1632a.m6928d().mo5812b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m4148c(LiveData<T>.c cVar) {
        if (cVar.f3415e) {
            if (!cVar.mo3746j()) {
                cVar.mo3748h(false);
                return;
            }
            int i = cVar.f3416f;
            int i2 = this.f3406g;
            if (i < i2) {
                cVar.f3416f = i2;
                cVar.f3414d.mo3527a(this.f3404e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3738b(int i) {
        int i2 = this.f3402c;
        this.f3402c = i + i2;
        if (!this.f3403d) {
            this.f3403d = true;
            while (true) {
                try {
                    int i3 = this.f3402c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo3741f();
                        } else if (z2) {
                            mo3742g();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f3403d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3739d(LiveData<T>.c cVar) {
        if (this.f3407h) {
            this.f3408i = true;
            return;
        }
        this.f3407h = true;
        do {
            this.f3408i = false;
            if (cVar == null) {
                C1660b<K, V>.d c = this.f3401b.mo5835c();
                while (c.hasNext()) {
                    m4148c((C1007c) ((Map.Entry) c.next()).getValue());
                    if (this.f3408i) {
                        break;
                    }
                }
            } else {
                m4148c(cVar);
                cVar = null;
            }
        } while (this.f3408i);
        this.f3407h = false;
    }

    /* renamed from: e */
    public void mo3740e(C1055s<? super T> sVar) {
        m4147a("observeForever");
        C1006b bVar = new C1006b(sVar);
        C1007c f = this.f3401b.mo5831f(sVar, bVar);
        if (f instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (f == null) {
            bVar.mo3748h(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3741f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3742g() {
    }

    /* renamed from: h */
    public void mo3743h(C1055s<? super T> sVar) {
        m4147a("removeObserver");
        C1007c g = this.f3401b.mo5832g(sVar);
        if (g != null) {
            g.mo3745i();
            g.mo3748h(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo3744i(T t) {
        m4147a("setValue");
        this.f3406g++;
        this.f3404e = t;
        mo3739d((LiveData<T>.c) null);
    }
}
