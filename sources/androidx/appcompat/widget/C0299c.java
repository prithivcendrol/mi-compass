package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0181a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0203b;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0218i;
import androidx.appcompat.view.menu.C0227l;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0232n;
import androidx.appcompat.view.menu.C0235p;
import androidx.appcompat.view.menu.C0239r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.view.C0657b;
import java.util.ArrayList;
import p021d.C1447a;
import p021d.C1453g;

/* renamed from: androidx.appcompat.widget.c */
class C0299c extends C0203b implements C0657b.C0658a {

    /* renamed from: A */
    private final SparseBooleanArray f1211A = new SparseBooleanArray();

    /* renamed from: B */
    C0305e f1212B;

    /* renamed from: C */
    C0300a f1213C;

    /* renamed from: D */
    C0302c f1214D;

    /* renamed from: E */
    private C0301b f1215E;

    /* renamed from: F */
    final C0306f f1216F = new C0306f();

    /* renamed from: G */
    int f1217G;

    /* renamed from: n */
    C0303d f1218n;

    /* renamed from: o */
    private Drawable f1219o;

    /* renamed from: p */
    private boolean f1220p;

    /* renamed from: q */
    private boolean f1221q;

    /* renamed from: r */
    private boolean f1222r;

    /* renamed from: s */
    private int f1223s;

    /* renamed from: t */
    private int f1224t;

    /* renamed from: u */
    private int f1225u;

    /* renamed from: v */
    private boolean f1226v;

    /* renamed from: w */
    private boolean f1227w;

    /* renamed from: x */
    private boolean f1228x;

    /* renamed from: y */
    private boolean f1229y;

    /* renamed from: z */
    private int f1230z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0300a extends C0227l {
        public C0300a(Context context, C0239r rVar, View view) {
            super(context, rVar, view, false, C1447a.f5686l);
            if (!((C0218i) rVar.getItem()).mo965l()) {
                View view2 = C0299c.this.f1218n;
                mo1073f(view2 == null ? (View) C0299c.this.f693l : view2);
            }
            mo1077j(C0299c.this.f1216F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1072e() {
            C0299c cVar = C0299c.this;
            cVar.f1213C = null;
            cVar.f1217G = 0;
            super.mo1072e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0301b extends ActionMenuItemView.C0201b {
        C0301b() {
        }

        /* renamed from: a */
        public C0235p mo722a() {
            C0300a aVar = C0299c.this.f1213C;
            if (aVar != null) {
                return aVar.mo1070c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0302c implements Runnable {

        /* renamed from: d */
        private C0305e f1233d;

        public C0302c(C0305e eVar) {
            this.f1233d = eVar;
        }

        public void run() {
            if (C0299c.this.f687f != null) {
                C0299c.this.f687f.mo900d();
            }
            View view = (View) C0299c.this.f693l;
            if (!(view == null || view.getWindowToken() == null || !this.f1233d.mo1079m())) {
                C0299c.this.f1212B = this.f1233d;
            }
            C0299c.this.f1214D = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0303d extends AppCompatImageView implements ActionMenuView.C0248a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0304a extends C0359n0 {

            /* renamed from: m */
            final /* synthetic */ C0299c f1236m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0304a(View view, C0299c cVar) {
                super(view);
                this.f1236m = cVar;
            }

            /* renamed from: b */
            public C0235p mo720b() {
                C0305e eVar = C0299c.this.f1212B;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1070c();
            }

            /* renamed from: c */
            public boolean mo721c() {
                C0299c.this.mo1774K();
                return true;
            }

            /* renamed from: d */
            public boolean mo1779d() {
                C0299c cVar = C0299c.this;
                if (cVar.f1214D != null) {
                    return false;
                }
                cVar.mo1765B();
                return true;
            }
        }

        public C0303d(Context context) {
            super(context, (AttributeSet) null, C1447a.f5685k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0353l1.m1614a(this, getContentDescription());
            setOnTouchListener(new C0304a(this, C0299c.this));
        }

        /* renamed from: b */
        public boolean mo701b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo702c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0299c.this.mo1774K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0553a.m2291d(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0305e extends C0227l {
        public C0305e(Context context, C0214g gVar, View view, boolean z) {
            super(context, gVar, view, z, C1447a.f5686l);
            mo1075h(8388613);
            mo1077j(C0299c.this.f1216F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1072e() {
            if (C0299c.this.f687f != null) {
                C0299c.this.f687f.close();
            }
            C0299c.this.f1212B = null;
            super.mo1072e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0306f implements C0230m.C0231a {
        C0306f() {
        }

        /* renamed from: a */
        public void mo527a(C0214g gVar, boolean z) {
            if (gVar instanceof C0239r) {
                gVar.mo862D().mo902e(false);
            }
            C0230m.C0231a m = C0299c.this.mo808m();
            if (m != null) {
                m.mo527a(gVar, z);
            }
        }

        /* renamed from: b */
        public boolean mo528b(C0214g gVar) {
            if (gVar == C0299c.this.f687f) {
                return false;
            }
            C0299c.this.f1217G = ((C0239r) gVar).getItem().getItemId();
            C0230m.C0231a m = C0299c.this.mo808m();
            if (m != null) {
                return m.mo528b(gVar);
            }
            return false;
        }
    }

    public C0299c(Context context) {
        super(context, C1453g.f5814c, C1453g.f5813b);
    }

    /* renamed from: z */
    private View m1352z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f693l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0232n.C0233a) && ((C0232n.C0233a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable mo1764A() {
        C0303d dVar = this.f1218n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1220p) {
            return this.f1219o;
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1765B() {
        C0232n nVar;
        C0302c cVar = this.f1214D;
        if (cVar == null || (nVar = this.f693l) == null) {
            C0305e eVar = this.f1212B;
            if (eVar == null) {
                return false;
            }
            eVar.mo1069b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f1214D = null;
        return true;
    }

    /* renamed from: C */
    public boolean mo1766C() {
        C0300a aVar = this.f1213C;
        if (aVar == null) {
            return false;
        }
        aVar.mo1069b();
        return true;
    }

    /* renamed from: D */
    public boolean mo1767D() {
        return this.f1214D != null || mo1768E();
    }

    /* renamed from: E */
    public boolean mo1768E() {
        C0305e eVar = this.f1212B;
        return eVar != null && eVar.mo1071d();
    }

    /* renamed from: F */
    public void mo1769F(Configuration configuration) {
        if (!this.f1226v) {
            this.f1225u = C0181a.m696b(this.f686e).mo630d();
        }
        C0214g gVar = this.f687f;
        if (gVar != null) {
            gVar.mo869K(true);
        }
    }

    /* renamed from: G */
    public void mo1770G(boolean z) {
        this.f1229y = z;
    }

    /* renamed from: H */
    public void mo1771H(ActionMenuView actionMenuView) {
        this.f693l = actionMenuView;
        actionMenuView.mo724b(this.f687f);
    }

    /* renamed from: I */
    public void mo1772I(Drawable drawable) {
        C0303d dVar = this.f1218n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1220p = true;
        this.f1219o = drawable;
    }

    /* renamed from: J */
    public void mo1773J(boolean z) {
        this.f1221q = z;
        this.f1222r = true;
    }

    /* renamed from: K */
    public boolean mo1774K() {
        C0214g gVar;
        if (!this.f1221q || mo1768E() || (gVar = this.f687f) == null || this.f693l == null || this.f1214D != null || gVar.mo933z().isEmpty()) {
            return false;
        }
        C0302c cVar = new C0302c(new C0305e(this.f686e, this.f687f, this.f1218n, true));
        this.f1214D = cVar;
        ((View) this.f693l).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo797a(C0214g gVar, boolean z) {
        mo1775y();
        super.mo797a(gVar, z);
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        C0232n nVar;
        super.mo798b(z);
        ((View) this.f693l).requestLayout();
        C0214g gVar = this.f687f;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0218i> s = gVar.mo920s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                C0657b b = s.get(i).mo739b();
                if (b != null) {
                    b.mo2803i(this);
                }
            }
        }
        C0214g gVar2 = this.f687f;
        ArrayList<C0218i> z3 = gVar2 != null ? gVar2.mo933z() : null;
        if (this.f1221q && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0303d dVar = this.f1218n;
        if (z2) {
            if (dVar == null) {
                this.f1218n = new C0303d(this.f685d);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1218n.getParent();
            if (viewGroup != this.f693l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1218n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f693l;
                actionMenuView.addView(this.f1218n, actionMenuView.mo1233B());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f693l)) {
            ((ViewGroup) nVar).removeView(this.f1218n);
        }
        ((ActionMenuView) this.f693l).setOverflowReserved(this.f1221q);
    }

    /* renamed from: c */
    public boolean mo818c() {
        int i;
        ArrayList<C0218i> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0299c cVar = this;
        C0214g gVar = cVar.f687f;
        View view = null;
        boolean z2 = false;
        if (gVar != null) {
            arrayList = gVar.mo863E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = cVar.f1225u;
        int i6 = cVar.f1224t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f693l;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0218i iVar = arrayList.get(i9);
            if (iVar.mo968o()) {
                i7++;
            } else if (iVar.mo967n()) {
                i8++;
            } else {
                z3 = true;
            }
            if (cVar.f1229y && iVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f1221q && (z3 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.f1211A;
        sparseBooleanArray.clear();
        if (cVar.f1227w) {
            int i11 = cVar.f1230z;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0218i iVar2 = arrayList.get(i12);
            if (iVar2.mo968o()) {
                View n = cVar.mo809n(iVar2, view, viewGroup);
                if (cVar.f1227w) {
                    i2 -= ActionMenuView.m1090H(n, i3, i2, makeMeasureSpec, z2 ? 1 : 0);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo991u(true);
                z = z2;
                i4 = i;
            } else if (iVar2.mo967n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i10 > 0 || z4) && i6 > 0 && (!cVar.f1227w || i2 > 0);
                boolean z6 = z5;
                i4 = i;
                if (z5) {
                    View n2 = cVar.mo809n(iVar2, (View) null, viewGroup);
                    if (cVar.f1227w) {
                        int H = ActionMenuView.m1090H(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= H;
                        if (H == 0) {
                            z6 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z5 = z7 & (!cVar.f1227w ? i6 + i13 > 0 : i6 >= 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i14 = 0;
                    while (i14 < i12) {
                        C0218i iVar3 = arrayList.get(i14);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo965l()) {
                                i10++;
                            }
                            iVar3.mo991u(false);
                        }
                        i14++;
                    }
                }
                if (z5) {
                    i10--;
                }
                iVar2.mo991u(z5);
                z = false;
            } else {
                z = z2;
                i4 = i;
                iVar2.mo991u(z);
            }
            i12++;
            z2 = z;
            i = i4;
            view = null;
            cVar = this;
        }
        return true;
    }

    /* renamed from: d */
    public void mo799d(Context context, C0214g gVar) {
        super.mo799d(context, gVar);
        Resources resources = context.getResources();
        C0181a b = C0181a.m696b(context);
        if (!this.f1222r) {
            this.f1221q = b.mo634h();
        }
        if (!this.f1228x) {
            this.f1223s = b.mo629c();
        }
        if (!this.f1226v) {
            this.f1225u = b.mo630d();
        }
        int i = this.f1223s;
        if (this.f1221q) {
            if (this.f1218n == null) {
                C0303d dVar = new C0303d(this.f685d);
                this.f1218n = dVar;
                if (this.f1220p) {
                    dVar.setImageDrawable(this.f1219o);
                    this.f1219o = null;
                    this.f1220p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1218n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1218n.getMeasuredWidth();
        } else {
            this.f1218n = null;
        }
        this.f1224t = i;
        this.f1230z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: e */
    public boolean mo800e(C0239r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0239r rVar2 = rVar;
        while (rVar2.mo1111e0() != this.f687f) {
            rVar2 = (C0239r) rVar2.mo1111e0();
        }
        View z2 = m1352z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f1217G = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0300a aVar = new C0300a(this.f686e, rVar, z2);
        this.f1213C = aVar;
        aVar.mo1074g(z);
        this.f1213C.mo1078k();
        super.mo800e(rVar);
        return true;
    }

    /* renamed from: j */
    public void mo805j(C0218i iVar, C0232n.C0233a aVar) {
        aVar.mo703d(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f693l);
        if (this.f1215E == null) {
            this.f1215E = new C0301b();
        }
        actionMenuItemView.setPopupCallback(this.f1215E);
    }

    /* renamed from: l */
    public boolean mo807l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1218n) {
            return false;
        }
        return super.mo807l(viewGroup, i);
    }

    /* renamed from: n */
    public View mo809n(C0218i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo963j()) {
            actionView = super.mo809n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1253k(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public C0232n mo810o(ViewGroup viewGroup) {
        C0232n nVar = this.f693l;
        C0232n o = super.mo810o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    /* renamed from: q */
    public boolean mo812q(int i, C0218i iVar) {
        return iVar.mo965l();
    }

    /* renamed from: y */
    public boolean mo1775y() {
        return mo1765B() | mo1766C();
    }
}
