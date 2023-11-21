package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.p */
class C1255p {

    /* renamed from: a */
    final C1257b f4359a;

    /* renamed from: b */
    C1256a f4360b = new C1256a();

    /* renamed from: androidx.recyclerview.widget.p$a */
    static class C1256a {

        /* renamed from: a */
        int f4361a = 0;

        /* renamed from: b */
        int f4362b;

        /* renamed from: c */
        int f4363c;

        /* renamed from: d */
        int f4364d;

        /* renamed from: e */
        int f4365e;

        C1256a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4962a(int i) {
            this.f4361a = i | this.f4361a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4963b() {
            int i = this.f4361a;
            if ((i & 7) != 0 && (i & (mo4964c(this.f4364d, this.f4362b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4361a;
            if ((i2 & 112) != 0 && (i2 & (mo4964c(this.f4364d, this.f4363c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4361a;
            if ((i3 & 1792) != 0 && (i3 & (mo4964c(this.f4365e, this.f4362b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4361a;
            return (i4 & 28672) == 0 || (i4 & (mo4964c(this.f4365e, this.f4363c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4964c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4965d() {
            this.f4361a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4966e(int i, int i2, int i3, int i4) {
            this.f4362b = i;
            this.f4363c = i2;
            this.f4364d = i3;
            this.f4365e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    interface C1257b {
        /* renamed from: a */
        View mo4637a(int i);

        /* renamed from: b */
        int mo4638b();

        /* renamed from: c */
        int mo4639c(View view);

        /* renamed from: d */
        int mo4640d();

        /* renamed from: e */
        int mo4641e(View view);
    }

    C1255p(C1257b bVar) {
        this.f4359a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4960a(int i, int i2, int i3, int i4) {
        int d = this.f4359a.mo4640d();
        int b = this.f4359a.mo4638b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f4359a.mo4637a(i);
            this.f4360b.mo4966e(d, b, this.f4359a.mo4639c(a), this.f4359a.mo4641e(a));
            if (i3 != 0) {
                this.f4360b.mo4965d();
                this.f4360b.mo4962a(i3);
                if (this.f4360b.mo4963b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f4360b.mo4965d();
                this.f4360b.mo4962a(i4);
                if (this.f4360b.mo4963b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4961b(View view, int i) {
        this.f4360b.mo4966e(this.f4359a.mo4640d(), this.f4359a.mo4638b(), this.f4359a.mo4639c(view), this.f4359a.mo4641e(view));
        if (i == 0) {
            return false;
        }
        this.f4360b.mo4965d();
        this.f4360b.mo4962a(i);
        return this.f4360b.mo4963b();
    }
}
