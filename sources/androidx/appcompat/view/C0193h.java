package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0662b2;
import androidx.core.view.C0675c2;
import androidx.core.view.C0680d2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
public class C0193h {

    /* renamed from: a */
    final ArrayList<C0662b2> f623a = new ArrayList<>();

    /* renamed from: b */
    private long f624b = -1;

    /* renamed from: c */
    private Interpolator f625c;

    /* renamed from: d */
    C0675c2 f626d;

    /* renamed from: e */
    private boolean f627e;

    /* renamed from: f */
    private final C0680d2 f628f = new C0194a();

    /* renamed from: androidx.appcompat.view.h$a */
    class C0194a extends C0680d2 {

        /* renamed from: a */
        private boolean f629a = false;

        /* renamed from: b */
        private int f630b = 0;

        C0194a() {
        }

        /* renamed from: b */
        public void mo523b(View view) {
            int i = this.f630b + 1;
            this.f630b = i;
            if (i == C0193h.this.f623a.size()) {
                C0675c2 c2Var = C0193h.this.f626d;
                if (c2Var != null) {
                    c2Var.mo523b((View) null);
                }
                mo684d();
            }
        }

        /* renamed from: c */
        public void mo524c(View view) {
            if (!this.f629a) {
                this.f629a = true;
                C0675c2 c2Var = C0193h.this.f626d;
                if (c2Var != null) {
                    c2Var.mo524c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo684d() {
            this.f630b = 0;
            this.f629a = false;
            C0193h.this.mo677b();
        }
    }

    /* renamed from: a */
    public void mo676a() {
        if (this.f627e) {
            Iterator<C0662b2> it = this.f623a.iterator();
            while (it.hasNext()) {
                it.next().mo2819c();
            }
            this.f627e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo677b() {
        this.f627e = false;
    }

    /* renamed from: c */
    public C0193h mo678c(C0662b2 b2Var) {
        if (!this.f627e) {
            this.f623a.add(b2Var);
        }
        return this;
    }

    /* renamed from: d */
    public C0193h mo679d(C0662b2 b2Var, C0662b2 b2Var2) {
        this.f623a.add(b2Var);
        b2Var2.mo2824j(b2Var.mo2820d());
        this.f623a.add(b2Var2);
        return this;
    }

    /* renamed from: e */
    public C0193h mo680e(long j) {
        if (!this.f627e) {
            this.f624b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0193h mo681f(Interpolator interpolator) {
        if (!this.f627e) {
            this.f625c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0193h mo682g(C0675c2 c2Var) {
        if (!this.f627e) {
            this.f626d = c2Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo683h() {
        if (!this.f627e) {
            Iterator<C0662b2> it = this.f623a.iterator();
            while (it.hasNext()) {
                C0662b2 next = it.next();
                long j = this.f624b;
                if (j >= 0) {
                    next.mo2821f(j);
                }
                Interpolator interpolator = this.f625c;
                if (interpolator != null) {
                    next.mo2822g(interpolator);
                }
                if (this.f626d != null) {
                    next.mo2823h(this.f628f);
                }
                next.mo2826l();
            }
            this.f627e = true;
        }
    }
}
