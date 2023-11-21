package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0094j;
import androidx.appcompat.app.C0116a;
import androidx.appcompat.view.C0184c;
import androidx.appcompat.view.C0190g;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0218i;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0239r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0681e;
import androidx.core.view.C0708h;
import androidx.core.view.C0713i;
import androidx.core.view.C0717j;
import androidx.core.view.C0727l0;
import androidx.core.view.C0793y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import miuix.animation.controller.AnimState;
import p021d.C1447a;
import p021d.C1456j;
import p027e.C1512a;
import p129w.C2871a;

public class Toolbar extends ViewGroup implements C0713i {

    /* renamed from: A */
    private CharSequence f1109A;

    /* renamed from: B */
    private CharSequence f1110B;

    /* renamed from: C */
    private ColorStateList f1111C;

    /* renamed from: D */
    private ColorStateList f1112D;

    /* renamed from: E */
    private boolean f1113E;

    /* renamed from: F */
    private boolean f1114F;

    /* renamed from: G */
    private final ArrayList<View> f1115G;

    /* renamed from: H */
    private final ArrayList<View> f1116H;

    /* renamed from: I */
    private final int[] f1117I;

    /* renamed from: J */
    final C0717j f1118J;

    /* renamed from: K */
    private ArrayList<MenuItem> f1119K;

    /* renamed from: L */
    C0286h f1120L;

    /* renamed from: M */
    private final ActionMenuView.C0252e f1121M;

    /* renamed from: N */
    private C0339j1 f1122N;

    /* renamed from: O */
    private C0299c f1123O;

    /* renamed from: P */
    private C0284f f1124P;

    /* renamed from: Q */
    private C0230m.C0231a f1125Q;

    /* renamed from: R */
    C0214g.C0215a f1126R;

    /* renamed from: S */
    private boolean f1127S;

    /* renamed from: T */
    private OnBackInvokedCallback f1128T;

    /* renamed from: U */
    private OnBackInvokedDispatcher f1129U;

    /* renamed from: V */
    private boolean f1130V;

    /* renamed from: W */
    private final Runnable f1131W;

    /* renamed from: d */
    ActionMenuView f1132d;

    /* renamed from: e */
    private TextView f1133e;

    /* renamed from: f */
    private TextView f1134f;

    /* renamed from: g */
    private ImageButton f1135g;

    /* renamed from: h */
    private ImageView f1136h;

    /* renamed from: i */
    private Drawable f1137i;

    /* renamed from: j */
    private CharSequence f1138j;

    /* renamed from: k */
    ImageButton f1139k;

    /* renamed from: l */
    View f1140l;

    /* renamed from: m */
    private Context f1141m;

    /* renamed from: n */
    private int f1142n;

    /* renamed from: o */
    private int f1143o;

    /* renamed from: p */
    private int f1144p;

    /* renamed from: q */
    int f1145q;

    /* renamed from: r */
    private int f1146r;

    /* renamed from: s */
    private int f1147s;

    /* renamed from: t */
    private int f1148t;

    /* renamed from: u */
    private int f1149u;

    /* renamed from: v */
    private int f1150v;

    /* renamed from: w */
    private C0427x0 f1151w;

    /* renamed from: x */
    private int f1152x;

    /* renamed from: y */
    private int f1153y;

    /* renamed from: z */
    private int f1154z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0279a implements ActionMenuView.C0252e {
        C0279a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1118J.mo2922d(menuItem)) {
                return true;
            }
            C0286h hVar = Toolbar.this.f1120L;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0280b implements Runnable {
        C0280b() {
        }

        public void run() {
            Toolbar.this.mo1628R();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0281c implements C0214g.C0215a {
        C0281c() {
        }

        /* renamed from: a */
        public boolean mo494a(C0214g gVar, MenuItem menuItem) {
            C0214g.C0215a aVar = Toolbar.this.f1126R;
            return aVar != null && aVar.mo494a(gVar, menuItem);
        }

        /* renamed from: b */
        public void mo495b(C0214g gVar) {
            if (!Toolbar.this.f1132d.mo1237F()) {
                Toolbar.this.f1118J.mo2923e(gVar);
            }
            C0214g.C0215a aVar = Toolbar.this.f1126R;
            if (aVar != null) {
                aVar.mo495b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    class C0282d implements View.OnClickListener {
        C0282d() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1633e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    static class C0283e {
        /* renamed from: a */
        static OnBackInvokedDispatcher m1287a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m1288b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0094j(runnable);
        }

        /* renamed from: c */
        static void m1289c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(AnimState.VIEW_SIZE, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: d */
        static void m1290d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    private class C0284f implements C0230m {

        /* renamed from: d */
        C0214g f1159d;

        /* renamed from: e */
        C0218i f1160e;

        C0284f() {
        }

        /* renamed from: a */
        public void mo797a(C0214g gVar, boolean z) {
        }

        /* renamed from: b */
        public void mo798b(boolean z) {
            if (this.f1160e != null) {
                C0214g gVar = this.f1159d;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1159d.getItem(i) == this.f1160e) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo801f(this.f1159d, this.f1160e);
                }
            }
        }

        /* renamed from: c */
        public boolean mo818c() {
            return false;
        }

        /* renamed from: d */
        public void mo799d(Context context, C0214g gVar) {
            C0218i iVar;
            C0214g gVar2 = this.f1159d;
            if (!(gVar2 == null || (iVar = this.f1160e) == null)) {
                gVar2.mo903f(iVar);
            }
            this.f1159d = gVar;
        }

        /* renamed from: e */
        public boolean mo800e(C0239r rVar) {
            return false;
        }

        /* renamed from: f */
        public boolean mo801f(C0214g gVar, C0218i iVar) {
            View view = Toolbar.this.f1140l;
            if (view instanceof C0184c) {
                ((C0184c) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1140l);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1139k);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1140l = null;
            toolbar3.mo1630a();
            this.f1160e = null;
            Toolbar.this.requestLayout();
            iVar.mo971r(false);
            Toolbar.this.mo1629S();
            return true;
        }

        /* renamed from: g */
        public boolean mo802g(C0214g gVar, C0218i iVar) {
            Toolbar.this.mo1635g();
            ViewParent parent = Toolbar.this.f1139k.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1139k);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1139k);
            }
            Toolbar.this.f1140l = iVar.getActionView();
            this.f1160e = iVar;
            ViewParent parent2 = Toolbar.this.f1140l.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1140l);
                }
                C0285g n = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                n.f358a = 8388611 | (toolbar4.f1145q & 112);
                n.f1162b = 2;
                toolbar4.f1140l.setLayoutParams(n);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1140l);
            }
            Toolbar.this.mo1623K();
            Toolbar.this.requestLayout();
            iVar.mo971r(true);
            View view = Toolbar.this.f1140l;
            if (view instanceof C0184c) {
                ((C0184c) view).onActionViewExpanded();
            }
            Toolbar.this.mo1629S();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0285g extends C0116a.C0117a {

        /* renamed from: b */
        int f1162b = 0;

        public C0285g(int i, int i2) {
            super(i, i2);
            this.f358a = 8388627;
        }

        public C0285g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0285g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0285g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1719a(marginLayoutParams);
        }

        public C0285g(C0116a.C0117a aVar) {
            super(aVar);
        }

        public C0285g(C0285g gVar) {
            super((C0116a.C0117a) gVar);
            this.f1162b = gVar.f1162b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1719a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface C0286h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$i */
    public static class C0287i extends C2871a {
        public static final Parcelable.Creator<C0287i> CREATOR = new C0288a();

        /* renamed from: f */
        int f1163f;

        /* renamed from: g */
        boolean f1164g;

        /* renamed from: androidx.appcompat.widget.Toolbar$i$a */
        class C0288a implements Parcelable.ClassLoaderCreator<C0287i> {
            C0288a() {
            }

            /* renamed from: a */
            public C0287i createFromParcel(Parcel parcel) {
                return new C0287i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0287i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0287i(parcel, classLoader);
            }

            /* renamed from: c */
            public C0287i[] newArray(int i) {
                return new C0287i[i];
            }
        }

        public C0287i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1163f = parcel.readInt();
            this.f1164g = parcel.readInt() != 0;
        }

        public C0287i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1163f);
            parcel.writeInt(this.f1164g ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5674N);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1154z = 8388627;
        this.f1115G = new ArrayList<>();
        this.f1116H = new ArrayList<>();
        this.f1117I = new int[2];
        this.f1118J = new C0717j(new C0330h1(this));
        this.f1119K = new ArrayList<>();
        this.f1121M = new C0279a();
        this.f1131W = new C0280b();
        Context context2 = getContext();
        int[] iArr = C1456j.f5991d3;
        C0326g1 u = C0326g1.m1455u(context2, attributeSet, iArr, i, 0);
        C0727l0.m2873W(this, context, iArr, attributeSet, u.mo1880q(), i, 0);
        this.f1143o = u.mo1876m(C1456j.f5879F3, 0);
        this.f1144p = u.mo1876m(C1456j.f6086w3, 0);
        this.f1154z = u.mo1874k(C1456j.f5996e3, this.f1154z);
        this.f1145q = u.mo1874k(C1456j.f6001f3, 48);
        int d = u.mo1867d(C1456j.f6101z3, 0);
        int i2 = C1456j.f5874E3;
        d = u.mo1881r(i2) ? u.mo1867d(i2, d) : d;
        this.f1150v = d;
        this.f1149u = d;
        this.f1148t = d;
        this.f1147s = d;
        int d2 = u.mo1867d(C1456j.f5864C3, -1);
        if (d2 >= 0) {
            this.f1147s = d2;
        }
        int d3 = u.mo1867d(C1456j.f5859B3, -1);
        if (d3 >= 0) {
            this.f1148t = d3;
        }
        int d4 = u.mo1867d(C1456j.f5869D3, -1);
        if (d4 >= 0) {
            this.f1149u = d4;
        }
        int d5 = u.mo1867d(C1456j.f5854A3, -1);
        if (d5 >= 0) {
            this.f1150v = d5;
        }
        this.f1146r = u.mo1868e(C1456j.f6056q3, -1);
        int d6 = u.mo1867d(C1456j.f6036m3, Integer.MIN_VALUE);
        int d7 = u.mo1867d(C1456j.f6016i3, Integer.MIN_VALUE);
        int e = u.mo1868e(C1456j.f6026k3, 0);
        int e2 = u.mo1868e(C1456j.f6031l3, 0);
        m1251i();
        this.f1151w.mo2309e(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f1151w.mo2311g(d6, d7);
        }
        this.f1152x = u.mo1867d(C1456j.f6041n3, Integer.MIN_VALUE);
        this.f1153y = u.mo1867d(C1456j.f6021j3, Integer.MIN_VALUE);
        this.f1137i = u.mo1869f(C1456j.f6011h3);
        this.f1138j = u.mo1878o(C1456j.f6006g3);
        CharSequence o = u.mo1878o(C1456j.f6096y3);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = u.mo1878o(C1456j.f6081v3);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.f1141m = getContext();
        setPopupTheme(u.mo1876m(C1456j.f6076u3, 0));
        Drawable f = u.mo1869f(C1456j.f6071t3);
        if (f != null) {
            setNavigationIcon(f);
        }
        CharSequence o3 = u.mo1878o(C1456j.f6066s3);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable f2 = u.mo1869f(C1456j.f6046o3);
        if (f2 != null) {
            setLogo(f2);
        }
        CharSequence o4 = u.mo1878o(C1456j.f6051p3);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        int i3 = C1456j.f5884G3;
        if (u.mo1881r(i3)) {
            setTitleTextColor(u.mo1866c(i3));
        }
        int i4 = C1456j.f6091x3;
        if (u.mo1881r(i4)) {
            setSubtitleTextColor(u.mo1866c(i4));
        }
        int i5 = C1456j.f6061r3;
        if (u.mo1881r(i5)) {
            mo1716z(u.mo1876m(i5, 0));
        }
        u.mo1882v();
    }

    /* renamed from: B */
    private boolean m1240B(View view) {
        return view.getParent() == this || this.f1116H.contains(view);
    }

    /* renamed from: E */
    private int m1241E(View view, int i, int[] iArr, int i2) {
        C0285g gVar = (C0285g) view.getLayoutParams();
        int i3 = gVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int r = m1257r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r, max + measuredWidth, view.getMeasuredHeight() + r);
        return max + measuredWidth + gVar.rightMargin;
    }

    /* renamed from: F */
    private int m1242F(View view, int i, int[] iArr, int i2) {
        C0285g gVar = (C0285g) view.getLayoutParams();
        int i3 = gVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int r = m1257r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r, max, view.getMeasuredHeight() + r);
        return max - (measuredWidth + gVar.leftMargin);
    }

    /* renamed from: G */
    private int m1243G(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: H */
    private void m1244H(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: I */
    private void m1245I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1118J.mo2920b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1119K = currentMenuItems2;
    }

    /* renamed from: J */
    private void m1246J() {
        removeCallbacks(this.f1131W);
        post(this.f1131W);
    }

    /* renamed from: P */
    private boolean m1247P() {
        if (!this.f1127S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1248Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    private boolean m1248Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1249b(List<View> list, int i) {
        boolean z = C0727l0.m2916u(this) == 1;
        int childCount = getChildCount();
        int a = C0681e.m2704a(i, C0727l0.m2916u(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0285g gVar = (C0285g) childAt.getLayoutParams();
                if (gVar.f1162b == 0 && m1248Q(childAt) && m1256q(gVar.f358a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0285g gVar2 = (C0285g) childAt2.getLayoutParams();
            if (gVar2.f1162b == 0 && m1248Q(childAt2) && m1256q(gVar2.f358a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1250c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0285g n = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0285g) layoutParams;
        n.f1162b = 1;
        if (!z || this.f1140l == null) {
            addView(view, n);
            return;
        }
        view.setLayoutParams(n);
        this.f1116H.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0190g(getContext());
    }

    /* renamed from: i */
    private void m1251i() {
        if (this.f1151w == null) {
            this.f1151w = new C0427x0();
        }
    }

    /* renamed from: j */
    private void m1252j() {
        if (this.f1136h == null) {
            this.f1136h = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: k */
    private void m1253k() {
        m1254l();
        if (this.f1132d.mo1239J() == null) {
            C0214g gVar = (C0214g) this.f1132d.getMenu();
            if (this.f1124P == null) {
                this.f1124P = new C0284f();
            }
            this.f1132d.setExpandedActionViewsExclusive(true);
            gVar.mo895c(this.f1124P, this.f1141m);
            mo1629S();
        }
    }

    /* renamed from: l */
    private void m1254l() {
        if (this.f1132d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1132d = actionMenuView;
            actionMenuView.setPopupTheme(this.f1142n);
            this.f1132d.setOnMenuItemClickListener(this.f1121M);
            this.f1132d.mo1240K(this.f1125Q, new C0281c());
            C0285g n = generateDefaultLayoutParams();
            n.f358a = 8388613 | (this.f1145q & 112);
            this.f1132d.setLayoutParams(n);
            m1250c(this.f1132d, false);
        }
    }

    /* renamed from: m */
    private void m1255m() {
        if (this.f1135g == null) {
            this.f1135g = new C0355m(getContext(), (AttributeSet) null, C1447a.f5673M);
            C0285g n = generateDefaultLayoutParams();
            n.f358a = 8388611 | (this.f1145q & 112);
            this.f1135g.setLayoutParams(n);
        }
    }

    /* renamed from: q */
    private int m1256q(int i) {
        int u = C0727l0.m2916u(this);
        int a = C0681e.m2704a(i, u) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : u == 1 ? 5 : 3;
    }

    /* renamed from: r */
    private int m1257r(View view, int i) {
        C0285g gVar = (C0285g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int s = m1258s(gVar.f358a);
        if (s == 48) {
            return getPaddingTop() - i2;
        }
        if (s == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = gVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = gVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: s */
    private int m1258s(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1154z & 112;
    }

    /* renamed from: t */
    private int m1259t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0708h.m2820b(marginLayoutParams) + C0708h.m2819a(marginLayoutParams);
    }

    /* renamed from: u */
    private int m1260u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: v */
    private int m1261v(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0285g gVar = (C0285g) view.getLayoutParams();
            int i5 = gVar.leftMargin - i;
            int i6 = gVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: A */
    public void mo1620A() {
        Iterator<MenuItem> it = this.f1119K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m1245I();
    }

    /* renamed from: C */
    public boolean mo1621C() {
        ActionMenuView actionMenuView = this.f1132d;
        return actionMenuView != null && actionMenuView.mo1236E();
    }

    /* renamed from: D */
    public boolean mo1622D() {
        ActionMenuView actionMenuView = this.f1132d;
        return actionMenuView != null && actionMenuView.mo1237F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo1623K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0285g) childAt.getLayoutParams()).f1162b == 2 || childAt == this.f1132d)) {
                removeViewAt(childCount);
                this.f1116H.add(childAt);
            }
        }
    }

    /* renamed from: L */
    public void mo1624L(int i, int i2) {
        m1251i();
        this.f1151w.mo2311g(i, i2);
    }

    /* renamed from: M */
    public void mo1625M(C0214g gVar, C0299c cVar) {
        if (gVar != null || this.f1132d != null) {
            m1254l();
            C0214g J = this.f1132d.mo1239J();
            if (J != gVar) {
                if (J != null) {
                    J.mo872O(this.f1123O);
                    J.mo872O(this.f1124P);
                }
                if (this.f1124P == null) {
                    this.f1124P = new C0284f();
                }
                cVar.mo1770G(true);
                if (gVar != null) {
                    gVar.mo895c(cVar, this.f1141m);
                    gVar.mo895c(this.f1124P, this.f1141m);
                } else {
                    cVar.mo799d(this.f1141m, (C0214g) null);
                    this.f1124P.mo799d(this.f1141m, (C0214g) null);
                    cVar.mo798b(true);
                    this.f1124P.mo798b(true);
                }
                this.f1132d.setPopupTheme(this.f1142n);
                this.f1132d.setPresenter(cVar);
                this.f1123O = cVar;
                mo1629S();
            }
        }
    }

    /* renamed from: N */
    public void mo1626N(Context context, int i) {
        this.f1144p = i;
        TextView textView = this.f1134f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public void mo1627O(Context context, int i) {
        this.f1143o = i;
        TextView textView = this.f1133e;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: R */
    public boolean mo1628R() {
        ActionMenuView actionMenuView = this.f1132d;
        return actionMenuView != null && actionMenuView.mo1241L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo1629S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = C0283e.m1287a(this);
            boolean z = mo1714w() && a != null && C0727l0.m2859I(this) && this.f1130V;
            if (z && this.f1129U == null) {
                if (this.f1128T == null) {
                    this.f1128T = C0283e.m1288b(new C0334i1(this));
                }
                C0283e.m1289c(a, this.f1128T);
            } else if (!z && (onBackInvokedDispatcher = this.f1129U) != null) {
                C0283e.m1290d(onBackInvokedDispatcher, this.f1128T);
                a = null;
            } else {
                return;
            }
            this.f1129U = a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1630a() {
        for (int size = this.f1116H.size() - 1; size >= 0; size--) {
            addView(this.f1116H.get(size));
        }
        this.f1116H.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0285g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1132d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1632d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1132d
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1238G()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1632d():boolean");
    }

    /* renamed from: e */
    public void mo1633e() {
        C0284f fVar = this.f1124P;
        C0218i iVar = fVar == null ? null : fVar.f1160e;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1634f() {
        ActionMenuView actionMenuView = this.f1132d;
        if (actionMenuView != null) {
            actionMenuView.mo1264x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1635g() {
        if (this.f1139k == null) {
            C0355m mVar = new C0355m(getContext(), (AttributeSet) null, C1447a.f5673M);
            this.f1139k = mVar;
            mVar.setImageDrawable(this.f1137i);
            this.f1139k.setContentDescription(this.f1138j);
            C0285g n = generateDefaultLayoutParams();
            n.f358a = 8388611 | (this.f1145q & 112);
            n.f1162b = 2;
            this.f1139k.setLayoutParams(n);
            this.f1139k.setOnClickListener(new C0282d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1139k;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1139k;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0427x0 x0Var = this.f1151w;
        if (x0Var != null) {
            return x0Var.mo2305a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1153y;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0427x0 x0Var = this.f1151w;
        if (x0Var != null) {
            return x0Var.mo2306b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0427x0 x0Var = this.f1151w;
        if (x0Var != null) {
            return x0Var.mo2307c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0427x0 x0Var = this.f1151w;
        if (x0Var != null) {
            return x0Var.mo2308d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1152x;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1239J();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1132d
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1239J()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1153y
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0727l0.m2916u(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0727l0.m2916u(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1152x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1136h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1136h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1253k();
        return this.f1132d.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1135g;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1135g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1135g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0299c getOuterActionMenuPresenter() {
        return this.f1123O;
    }

    public Drawable getOverflowIcon() {
        m1253k();
        return this.f1132d.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1141m;
    }

    public int getPopupTheme() {
        return this.f1142n;
    }

    public CharSequence getSubtitle() {
        return this.f1110B;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1134f;
    }

    public CharSequence getTitle() {
        return this.f1109A;
    }

    public int getTitleMarginBottom() {
        return this.f1150v;
    }

    public int getTitleMarginEnd() {
        return this.f1148t;
    }

    public int getTitleMarginStart() {
        return this.f1147s;
    }

    public int getTitleMarginTop() {
        return this.f1149u;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1133e;
    }

    public C0333i0 getWrapper() {
        if (this.f1122N == null) {
            this.f1122N = new C0339j1(this, true);
        }
        return this.f1122N;
    }

    /* renamed from: h */
    public void mo255h(C0793y yVar) {
        this.f1118J.mo2924f(yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0285g generateDefaultLayoutParams() {
        return new C0285g(-2, -2);
    }

    /* renamed from: o */
    public C0285g generateLayoutParams(AttributeSet attributeSet) {
        return new C0285g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo1629S();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1131W);
        mo1629S();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1114F = false;
        }
        if (!this.f1114F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1114F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1114F = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.C0727l0.m2916u(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1117I
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.C0727l0.m2917v(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1135g
            boolean r13 = r0.m1248Q(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f1135g
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m1242F(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m1241E(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f1139k
            boolean r15 = r0.m1248Q(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f1139k
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m1242F(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m1241E(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1132d
            boolean r15 = r0.m1248Q(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1132d
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m1241E(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m1242F(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1140l
            boolean r13 = r0.m1248Q(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f1140l
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m1242F(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m1241E(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f1136h
            boolean r13 = r0.m1248Q(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f1136h
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m1242F(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m1241E(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f1133e
            boolean r13 = r0.m1248Q(r13)
            android.widget.TextView r14 = r0.f1134f
            boolean r14 = r0.m1248Q(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f1133e
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.C0285g) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1133e
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f1134f
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0285g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1134f
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f1133e
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f1134f
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f1134f
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f1133e
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.C0285g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0285g) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f1133e
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f1134f
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f1154z
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1149u
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1150v
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1150v
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1149u
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1147s
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1133e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0285g) r1
            android.widget.TextView r2 = r0.f1133e
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1133e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1133e
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1148t
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f1134f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0285g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1134f
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1134f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1134f
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1148t
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.f1147s
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.f1133e
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.C0285g) r3
            android.widget.TextView r4 = r0.f1133e
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1133e
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1133e
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1148t
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.f1134f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.C0285g) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1134f
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1134f
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1134f
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1148t
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            r4 = 3
            r0.m1249b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            int r3 = r3.size()
            r7 = r1
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f1115G
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m1241E(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            r4 = 5
            r0.m1249b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            int r3 = r3.size()
            r7 = r1
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f1115G
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1242F(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            r4 = 1
            r0.m1249b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            int r3 = r0.m1261v(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.f1115G
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.f1115G
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m1241E(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.f1115G
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1117I;
        char b = C0385r1.m1722b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (m1248Q(this.f1135g)) {
            m1244H(this.f1135g, i, 0, i2, 0, this.f1146r);
            i5 = this.f1135g.getMeasuredWidth() + m1259t(this.f1135g);
            i4 = Math.max(0, this.f1135g.getMeasuredHeight() + m1260u(this.f1135g));
            i3 = View.combineMeasuredStates(0, this.f1135g.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1248Q(this.f1139k)) {
            m1244H(this.f1139k, i, 0, i2, 0, this.f1146r);
            i5 = this.f1139k.getMeasuredWidth() + m1259t(this.f1139k);
            i4 = Math.max(i4, this.f1139k.getMeasuredHeight() + m1260u(this.f1139k));
            i3 = View.combineMeasuredStates(i3, this.f1139k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (m1248Q(this.f1132d)) {
            m1244H(this.f1132d, i, max, i2, 0, this.f1146r);
            i6 = this.f1132d.getMeasuredWidth() + m1259t(this.f1132d);
            i4 = Math.max(i4, this.f1132d.getMeasuredHeight() + m1260u(this.f1132d));
            i3 = View.combineMeasuredStates(i3, this.f1132d.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1248Q(this.f1140l)) {
            max2 += m1243G(this.f1140l, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1140l.getMeasuredHeight() + m1260u(this.f1140l));
            i3 = View.combineMeasuredStates(i3, this.f1140l.getMeasuredState());
        }
        if (m1248Q(this.f1136h)) {
            max2 += m1243G(this.f1136h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1136h.getMeasuredHeight() + m1260u(this.f1136h));
            i3 = View.combineMeasuredStates(i3, this.f1136h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0285g) childAt.getLayoutParams()).f1162b == 0 && m1248Q(childAt)) {
                max2 += m1243G(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1260u(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1149u + this.f1150v;
        int i13 = this.f1147s + this.f1148t;
        if (m1248Q(this.f1133e)) {
            m1243G(this.f1133e, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1133e.getMeasuredWidth() + m1259t(this.f1133e);
            i7 = this.f1133e.getMeasuredHeight() + m1260u(this.f1133e);
            i9 = View.combineMeasuredStates(i3, this.f1133e.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m1248Q(this.f1134f)) {
            i8 = Math.max(i8, m1243G(this.f1134f, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1134f.getMeasuredHeight() + m1260u(this.f1134f);
            i9 = View.combineMeasuredStates(i9, this.f1134f.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1247P()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0287i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0287i iVar = (C0287i) parcelable;
        super.onRestoreInstanceState(iVar.mo10153a());
        ActionMenuView actionMenuView = this.f1132d;
        C0214g J = actionMenuView != null ? actionMenuView.mo1239J() : null;
        int i = iVar.f1163f;
        if (!(i == 0 || this.f1124P == null || J == null || (findItem = J.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f1164g) {
            m1246J();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1251i();
        C0427x0 x0Var = this.f1151w;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        x0Var.mo2310f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0218i iVar;
        C0287i iVar2 = new C0287i(super.onSaveInstanceState());
        C0284f fVar = this.f1124P;
        if (!(fVar == null || (iVar = fVar.f1160e) == null)) {
            iVar2.f1163f = iVar.getItemId();
        }
        iVar2.f1164g = mo1622D();
        return iVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1113E = false;
        }
        if (!this.f1113E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1113E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1113E = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0285g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0285g ? new C0285g((C0285g) layoutParams) : layoutParams instanceof C0116a.C0117a ? new C0285g((C0116a.C0117a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0285g((ViewGroup.MarginLayoutParams) layoutParams) : new C0285g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1130V != z) {
            this.f1130V = z;
            mo1629S();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1635g();
        }
        ImageButton imageButton = this.f1139k;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1512a.m6567b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1635g();
            this.f1139k.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1139k;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1137i);
        }
    }

    public void setCollapsible(boolean z) {
        this.f1127S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1153y) {
            this.f1153y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1152x) {
            this.f1152x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1512a.m6567b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1252j();
            if (!m1240B(this.f1136h)) {
                m1250c(this.f1136h, true);
            }
        } else {
            ImageView imageView = this.f1136h;
            if (imageView != null && m1240B(imageView)) {
                removeView(this.f1136h);
                this.f1116H.remove(this.f1136h);
            }
        }
        ImageView imageView2 = this.f1136h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1252j();
        }
        ImageView imageView = this.f1136h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1255m();
        }
        ImageButton imageButton = this.f1135g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0353l1.m1614a(this.f1135g, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1512a.m6567b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1255m();
            if (!m1240B(this.f1135g)) {
                m1250c(this.f1135g, true);
            }
        } else {
            ImageButton imageButton = this.f1135g;
            if (imageButton != null && m1240B(imageButton)) {
                removeView(this.f1135g);
                this.f1116H.remove(this.f1135g);
            }
        }
        ImageButton imageButton2 = this.f1135g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1255m();
        this.f1135g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0286h hVar) {
        this.f1120L = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1253k();
        this.f1132d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1142n != i) {
            this.f1142n = i;
            if (i == 0) {
                this.f1141m = getContext();
            } else {
                this.f1141m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1134f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1134f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1134f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1144p;
                if (i != 0) {
                    this.f1134f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1112D;
                if (colorStateList != null) {
                    this.f1134f.setTextColor(colorStateList);
                }
            }
            if (!m1240B(this.f1134f)) {
                m1250c(this.f1134f, true);
            }
        } else {
            TextView textView = this.f1134f;
            if (textView != null && m1240B(textView)) {
                removeView(this.f1134f);
                this.f1116H.remove(this.f1134f);
            }
        }
        TextView textView2 = this.f1134f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1110B = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1112D = colorStateList;
        TextView textView = this.f1134f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1133e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1133e = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1133e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1143o;
                if (i != 0) {
                    this.f1133e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1111C;
                if (colorStateList != null) {
                    this.f1133e.setTextColor(colorStateList);
                }
            }
            if (!m1240B(this.f1133e)) {
                m1250c(this.f1133e, true);
            }
        } else {
            TextView textView = this.f1133e;
            if (textView != null && m1240B(textView)) {
                removeView(this.f1133e);
                this.f1116H.remove(this.f1133e);
            }
        }
        TextView textView2 = this.f1133e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1109A = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1150v = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1148t = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1147s = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1149u = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1111C = colorStateList;
        TextView textView = this.f1133e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: w */
    public boolean mo1714w() {
        C0284f fVar = this.f1124P;
        return (fVar == null || fVar.f1160e == null) ? false : true;
    }

    /* renamed from: x */
    public void mo287x(C0793y yVar) {
        this.f1118J.mo2919a(yVar);
    }

    /* renamed from: y */
    public boolean mo1715y() {
        ActionMenuView actionMenuView = this.f1132d;
        return actionMenuView != null && actionMenuView.mo1235D();
    }

    /* renamed from: z */
    public void mo1716z(int i) {
        getMenuInflater().inflate(i, getMenu());
    }
}
