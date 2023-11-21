package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0182b;
import androidx.appcompat.view.menu.C0220j;
import androidx.appcompat.view.menu.C0234o;
import java.util.ArrayList;
import p063k.C1774g;
import p109s.C2635a;
import p109s.C2636b;

/* renamed from: androidx.appcompat.view.f */
public class C0188f extends ActionMode {

    /* renamed from: a */
    final Context f576a;

    /* renamed from: b */
    final C0182b f577b;

    /* renamed from: androidx.appcompat.view.f$a */
    public static class C0189a implements C0182b.C0183a {

        /* renamed from: a */
        final ActionMode.Callback f578a;

        /* renamed from: b */
        final Context f579b;

        /* renamed from: c */
        final ArrayList<C0188f> f580c = new ArrayList<>();

        /* renamed from: d */
        final C1774g<Menu, Menu> f581d = new C1774g<>();

        public C0189a(Context context, ActionMode.Callback callback) {
            this.f579b = context;
            this.f578a = callback;
        }

        /* renamed from: f */
        private Menu m748f(Menu menu) {
            Menu menu2 = this.f581d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0234o oVar = new C0234o(this.f579b, (C2635a) menu);
            this.f581d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public boolean mo529a(C0182b bVar, Menu menu) {
            return this.f578a.onPrepareActionMode(mo666e(bVar), m748f(menu));
        }

        /* renamed from: b */
        public void mo530b(C0182b bVar) {
            this.f578a.onDestroyActionMode(mo666e(bVar));
        }

        /* renamed from: c */
        public boolean mo531c(C0182b bVar, MenuItem menuItem) {
            return this.f578a.onActionItemClicked(mo666e(bVar), new C0220j(this.f579b, (C2636b) menuItem));
        }

        /* renamed from: d */
        public boolean mo532d(C0182b bVar, Menu menu) {
            return this.f578a.onCreateActionMode(mo666e(bVar), m748f(menu));
        }

        /* renamed from: e */
        public ActionMode mo666e(C0182b bVar) {
            int size = this.f580c.size();
            for (int i = 0; i < size; i++) {
                C0188f fVar = this.f580c.get(i);
                if (fVar != null && fVar.f577b == bVar) {
                    return fVar;
                }
            }
            C0188f fVar2 = new C0188f(this.f579b, bVar);
            this.f580c.add(fVar2);
            return fVar2;
        }
    }

    public C0188f(Context context, C0182b bVar) {
        this.f576a = context;
        this.f577b = bVar;
    }

    public void finish() {
        this.f577b.mo613c();
    }

    public View getCustomView() {
        return this.f577b.mo614d();
    }

    public Menu getMenu() {
        return new C0234o(this.f576a, (C2635a) this.f577b.mo615e());
    }

    public MenuInflater getMenuInflater() {
        return this.f577b.mo616f();
    }

    public CharSequence getSubtitle() {
        return this.f577b.mo617g();
    }

    public Object getTag() {
        return this.f577b.mo635h();
    }

    public CharSequence getTitle() {
        return this.f577b.mo618i();
    }

    public boolean getTitleOptionalHint() {
        return this.f577b.mo636j();
    }

    public void invalidate() {
        this.f577b.mo619k();
    }

    public boolean isTitleOptional() {
        return this.f577b.mo620l();
    }

    public void setCustomView(View view) {
        this.f577b.mo621m(view);
    }

    public void setSubtitle(int i) {
        this.f577b.mo622n(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f577b.mo623o(charSequence);
    }

    public void setTag(Object obj) {
        this.f577b.mo637p(obj);
    }

    public void setTitle(int i) {
        this.f577b.mo624q(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f577b.mo625r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f577b.mo626s(z);
    }
}
