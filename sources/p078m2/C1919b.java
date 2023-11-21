package p078m2;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.app.widget.C2211t;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.view.C2396a;

/* renamed from: m2.b */
public class C1919b extends ActionMode implements C2242c.C2244b, C2396a {

    /* renamed from: d */
    protected Context f7293d;

    /* renamed from: e */
    protected WeakReference<C2211t> f7294e;

    /* renamed from: f */
    private ActionMode.Callback f7295f;

    /* renamed from: g */
    private C2242c f7296g;

    /* renamed from: h */
    private C1920a f7297h;

    /* renamed from: i */
    boolean f7298i = false;

    /* renamed from: m2.b$a */
    public interface C1920a {
        /* renamed from: a */
        void mo6492a(ActionMode actionMode);
    }

    public C1919b(Context context, ActionMode.Callback callback) {
        this.f7293d = context;
        this.f7295f = callback;
        C2242c O = new C2242c(context).mo8351O(1);
        this.f7296g = O;
        O.mo8350N(this);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* renamed from: b */
    public boolean mo6473b() {
        this.f7296g.mo8362a0();
        try {
            return this.f7295f.onCreateActionMode(this, this.f7296g);
        } finally {
            this.f7296g.mo8360Z();
        }
    }

    /* renamed from: c */
    public boolean mo6474c(C2242c cVar, MenuItem menuItem) {
        ActionMode.Callback callback = this.f7295f;
        return callback != null && callback.onActionItemClicked(this, menuItem);
    }

    /* renamed from: d */
    public void mo6475d(boolean z, float f) {
    }

    /* renamed from: e */
    public void mo6476e(boolean z) {
        ActionMode.Callback callback;
        if (!z && (callback = this.f7295f) != null) {
            callback.onDestroyActionMode(this);
            this.f7295f = null;
        }
    }

    /* renamed from: f */
    public void mo6477f(boolean z) {
    }

    public void finish() {
        if (!this.f7298i) {
            this.f7298i = true;
            this.f7294e.get().mo7728g();
            C1920a aVar = this.f7297h;
            if (aVar != null) {
                aVar.mo6492a(this);
            }
            ActionMode.Callback callback = this.f7295f;
            if (callback != null) {
                callback.onDestroyActionMode(this);
                this.f7295f = null;
            }
        }
    }

    /* renamed from: g */
    public void mo6479g(C1920a aVar) {
        this.f7297h = aVar;
    }

    public View getCustomView() {
        throw new UnsupportedOperationException("getCustomView not supported");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    public Menu getMenu() {
        return this.f7296g;
    }

    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.f7293d);
    }

    public CharSequence getSubtitle() {
        throw new UnsupportedOperationException("getSubtitle not supported");
    }

    public CharSequence getTitle() {
        throw new UnsupportedOperationException("getTitle not supported");
    }

    /* renamed from: h */
    public void mo6485h(C2211t tVar) {
        tVar.mo7724b(this);
        this.f7294e = new WeakReference<>(tVar);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    public void invalidate() {
        this.f7296g.mo8362a0();
        try {
            this.f7295f.onPrepareActionMode(this, this.f7296g);
        } finally {
            this.f7296g.mo8360Z();
        }
    }

    public void setCustomView(View view) {
        throw new UnsupportedOperationException("setCustomView not supported");
    }

    public void setSubtitle(int i) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    public void setSubtitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    public void setTitle(int i) {
        throw new UnsupportedOperationException("setTitle not supported");
    }

    public void setTitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setTitle not supported");
    }
}
