package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0182b;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
public class C0187e extends C0182b implements C0214g.C0215a {

    /* renamed from: f */
    private Context f569f;

    /* renamed from: g */
    private ActionBarContextView f570g;

    /* renamed from: h */
    private C0182b.C0183a f571h;

    /* renamed from: i */
    private WeakReference<View> f572i;

    /* renamed from: j */
    private boolean f573j;

    /* renamed from: k */
    private boolean f574k;

    /* renamed from: l */
    private C0214g f575l;

    public C0187e(Context context, ActionBarContextView actionBarContextView, C0182b.C0183a aVar, boolean z) {
        this.f569f = context;
        this.f570g = actionBarContextView;
        this.f571h = aVar;
        C0214g S = new C0214g(actionBarContextView.getContext()).mo876S(1);
        this.f575l = S;
        S.mo875R(this);
        this.f574k = z;
    }

    /* renamed from: a */
    public boolean mo494a(C0214g gVar, MenuItem menuItem) {
        return this.f571h.mo531c(this, menuItem);
    }

    /* renamed from: b */
    public void mo495b(C0214g gVar) {
        mo619k();
        this.f570g.mo1158l();
    }

    /* renamed from: c */
    public void mo613c() {
        if (!this.f573j) {
            this.f573j = true;
            this.f571h.mo530b(this);
        }
    }

    /* renamed from: d */
    public View mo614d() {
        WeakReference<View> weakReference = this.f572i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo615e() {
        return this.f575l;
    }

    /* renamed from: f */
    public MenuInflater mo616f() {
        return new C0190g(this.f570g.getContext());
    }

    /* renamed from: g */
    public CharSequence mo617g() {
        return this.f570g.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo618i() {
        return this.f570g.getTitle();
    }

    /* renamed from: k */
    public void mo619k() {
        this.f571h.mo529a(this, this.f575l);
    }

    /* renamed from: l */
    public boolean mo620l() {
        return this.f570g.mo1156j();
    }

    /* renamed from: m */
    public void mo621m(View view) {
        this.f570g.setCustomView(view);
        this.f572i = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo622n(int i) {
        mo623o(this.f569f.getString(i));
    }

    /* renamed from: o */
    public void mo623o(CharSequence charSequence) {
        this.f570g.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo624q(int i) {
        mo625r(this.f569f.getString(i));
    }

    /* renamed from: r */
    public void mo625r(CharSequence charSequence) {
        this.f570g.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo626s(boolean z) {
        super.mo626s(z);
        this.f570g.setTitleOptional(z);
    }
}
