package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
public abstract class C0182b {

    /* renamed from: d */
    private Object f561d;

    /* renamed from: e */
    private boolean f562e;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface C0183a {
        /* renamed from: a */
        boolean mo529a(C0182b bVar, Menu menu);

        /* renamed from: b */
        void mo530b(C0182b bVar);

        /* renamed from: c */
        boolean mo531c(C0182b bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo532d(C0182b bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo613c();

    /* renamed from: d */
    public abstract View mo614d();

    /* renamed from: e */
    public abstract Menu mo615e();

    /* renamed from: f */
    public abstract MenuInflater mo616f();

    /* renamed from: g */
    public abstract CharSequence mo617g();

    /* renamed from: h */
    public Object mo635h() {
        return this.f561d;
    }

    /* renamed from: i */
    public abstract CharSequence mo618i();

    /* renamed from: j */
    public boolean mo636j() {
        return this.f562e;
    }

    /* renamed from: k */
    public abstract void mo619k();

    /* renamed from: l */
    public abstract boolean mo620l();

    /* renamed from: m */
    public abstract void mo621m(View view);

    /* renamed from: n */
    public abstract void mo622n(int i);

    /* renamed from: o */
    public abstract void mo623o(CharSequence charSequence);

    /* renamed from: p */
    public void mo637p(Object obj) {
        this.f561d = obj;
    }

    /* renamed from: q */
    public abstract void mo624q(int i);

    /* renamed from: r */
    public abstract void mo625r(CharSequence charSequence);

    /* renamed from: s */
    public void mo626s(boolean z) {
        this.f562e = z;
    }
}
