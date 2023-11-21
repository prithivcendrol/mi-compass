package p084n2;

import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import miuix.appcompat.app.C2078d;
import p055i3.C1656j;
import p061j3.C1750f;

/* renamed from: n2.d */
public class C2437d extends C1750f implements C2436c {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C2078d f9446B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2433b f9447C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public View f9448D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ViewGroup f9449E;

    /* renamed from: n2.d$a */
    class C2438a implements AdapterView.OnItemClickListener {

        /* renamed from: n2.d$a$a */
        class C2439a implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            final /* synthetic */ SubMenu f9451d;

            C2439a(SubMenu subMenu) {
                this.f9451d = subMenu;
            }

            public void onDismiss() {
                C2437d.this.setOnDismissListener((PopupWindow.OnDismissListener) null);
                C2437d.this.mo9347m(this.f9451d);
                C2437d dVar = C2437d.this;
                dVar.mo6005B(dVar.f9448D, C2437d.this.f9449E);
            }
        }

        C2438a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MenuItem c = C2437d.this.f9447C.getItem(i);
            if (c.hasSubMenu()) {
                C2437d.this.setOnDismissListener(new C2439a(c.getSubMenu()));
            } else {
                C2437d.this.f9446B.mo7392C(0, c);
            }
            C2437d.this.mo9344a(true);
        }
    }

    public C2437d(C2078d dVar, Menu menu) {
        super(dVar.mo7415k());
        Context k = dVar.mo7415k();
        this.f9446B = dVar;
        C2433b bVar = new C2433b(k, menu);
        this.f9447C = bVar;
        mo6024i(bVar);
        mo6016R(new C2438a());
    }

    /* renamed from: a0 */
    private void m10328a0(View view, ViewGroup viewGroup) {
        int i;
        if (viewGroup == null) {
            Log.w("ImmersionMenu", "ImmersionMenuPopupWindow offset can't be adjusted without parent");
            return;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        mo6020d(-(view.getHeight() + ((iArr2[1] - iArr[1]) - mo6008F())));
        if (C1656j.m6983b(viewGroup)) {
            i = mo6007E();
        } else {
            i = (viewGroup.getWidth() - ((iArr2[0] - iArr[0]) + view.getWidth())) - mo6007E();
        }
        mo6022f(i);
    }

    /* renamed from: a */
    public void mo9344a(boolean z) {
        dismiss();
    }

    /* renamed from: b0 */
    public View mo9348b0() {
        return this.f9448D;
    }

    /* renamed from: c0 */
    public ViewGroup mo9349c0() {
        return this.f9449E;
    }

    /* renamed from: l */
    public void mo6025l(View view, ViewGroup viewGroup) {
        this.f9448D = view;
        this.f9449E = viewGroup;
        m10328a0(view, viewGroup);
        super.mo6025l(view, viewGroup);
    }

    /* renamed from: m */
    public void mo9347m(Menu menu) {
        this.f9447C.mo9339d(menu);
    }
}
