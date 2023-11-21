package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p063k.C1774g;
import p109s.C2636b;
import p109s.C2637c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0204c {

    /* renamed from: a */
    final Context f695a;

    /* renamed from: b */
    private C1774g<C2636b, MenuItem> f696b;

    /* renamed from: c */
    private C1774g<C2637c, SubMenu> f697c;

    C0204c(Context context) {
        this.f695a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo813c(MenuItem menuItem) {
        if (!(menuItem instanceof C2636b)) {
            return menuItem;
        }
        C2636b bVar = (C2636b) menuItem;
        if (this.f696b == null) {
            this.f696b = new C1774g<>();
        }
        MenuItem menuItem2 = this.f696b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0220j jVar = new C0220j(this.f695a, bVar);
        this.f696b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo814d(SubMenu subMenu) {
        if (!(subMenu instanceof C2637c)) {
            return subMenu;
        }
        C2637c cVar = (C2637c) subMenu;
        if (this.f697c == null) {
            this.f697c = new C1774g<>();
        }
        SubMenu subMenu2 = this.f697c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0240s sVar = new C0240s(this.f695a, cVar);
        this.f697c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo815e() {
        C1774g<C2636b, MenuItem> gVar = this.f696b;
        if (gVar != null) {
            gVar.clear();
        }
        C1774g<C2637c, SubMenu> gVar2 = this.f697c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo816f(int i) {
        if (this.f696b != null) {
            int i2 = 0;
            while (i2 < this.f696b.size()) {
                if (this.f696b.mo6161i(i2).getGroupId() == i) {
                    this.f696b.mo6164k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo817g(int i) {
        if (this.f696b != null) {
            for (int i2 = 0; i2 < this.f696b.size(); i2++) {
                if (this.f696b.mo6161i(i2).getItemId() == i) {
                    this.f696b.mo6164k(i2);
                    return;
                }
            }
        }
    }
}
