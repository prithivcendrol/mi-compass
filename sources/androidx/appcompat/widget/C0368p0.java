package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0235p;
import androidx.core.view.C0727l0;
import androidx.core.widget.C0825j;
import java.lang.reflect.Method;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.p0 */
public class C0368p0 implements C0235p {

    /* renamed from: J */
    private static Method f1418J;

    /* renamed from: K */
    private static Method f1419K;

    /* renamed from: A */
    private final C0376h f1420A;

    /* renamed from: B */
    private final C0375g f1421B;

    /* renamed from: C */
    private final C0373e f1422C;

    /* renamed from: D */
    private Runnable f1423D;

    /* renamed from: E */
    final Handler f1424E;

    /* renamed from: F */
    private final Rect f1425F;

    /* renamed from: G */
    private Rect f1426G;

    /* renamed from: H */
    private boolean f1427H;

    /* renamed from: I */
    PopupWindow f1428I;

    /* renamed from: d */
    private Context f1429d;

    /* renamed from: e */
    private ListAdapter f1430e;

    /* renamed from: f */
    C0346l0 f1431f;

    /* renamed from: g */
    private int f1432g;

    /* renamed from: h */
    private int f1433h;

    /* renamed from: i */
    private int f1434i;

    /* renamed from: j */
    private int f1435j;

    /* renamed from: k */
    private int f1436k;

    /* renamed from: l */
    private boolean f1437l;

    /* renamed from: m */
    private boolean f1438m;

    /* renamed from: n */
    private boolean f1439n;

    /* renamed from: o */
    private int f1440o;

    /* renamed from: p */
    private boolean f1441p;

    /* renamed from: q */
    private boolean f1442q;

    /* renamed from: r */
    int f1443r;

    /* renamed from: s */
    private View f1444s;

    /* renamed from: t */
    private int f1445t;

    /* renamed from: u */
    private DataSetObserver f1446u;

    /* renamed from: v */
    private View f1447v;

    /* renamed from: w */
    private Drawable f1448w;

    /* renamed from: x */
    private AdapterView.OnItemClickListener f1449x;

    /* renamed from: y */
    private AdapterView.OnItemSelectedListener f1450y;

    /* renamed from: z */
    final C0377i f1451z;

    /* renamed from: androidx.appcompat.widget.p0$a */
    class C0369a implements Runnable {
        C0369a() {
        }

        public void run() {
            View q = C0368p0.this.mo2112q();
            if (q != null && q.getWindowToken() != null) {
                C0368p0.this.mo822j();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    class C0370b implements AdapterView.OnItemSelectedListener {
        C0370b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0346l0 l0Var;
            if (i != -1 && (l0Var = C0368p0.this.f1431f) != null) {
                l0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$c */
    static class C0371c {
        /* renamed from: a */
        static int m1703a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$d */
    static class C0372d {
        /* renamed from: a */
        static void m1704a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m1705b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$e */
    private class C0373e implements Runnable {
        C0373e() {
        }

        public void run() {
            C0368p0.this.mo2110o();
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$f */
    private class C0374f extends DataSetObserver {
        C0374f() {
        }

        public void onChanged() {
            if (C0368p0.this.isShowing()) {
                C0368p0.this.mo822j();
            }
        }

        public void onInvalidated() {
            C0368p0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$g */
    private class C0375g implements AbsListView.OnScrollListener {
        C0375g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0368p0.this.mo2115t() && C0368p0.this.f1428I.getContentView() != null) {
                C0368p0 p0Var = C0368p0.this;
                p0Var.f1424E.removeCallbacks(p0Var.f1451z);
                C0368p0.this.f1451z.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$h */
    private class C0376h implements View.OnTouchListener {
        C0376h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0368p0.this.f1428I) != null && popupWindow.isShowing() && x >= 0 && x < C0368p0.this.f1428I.getWidth() && y >= 0 && y < C0368p0.this.f1428I.getHeight()) {
                C0368p0 p0Var = C0368p0.this;
                p0Var.f1424E.postDelayed(p0Var.f1451z, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0368p0 p0Var2 = C0368p0.this;
                p0Var2.f1424E.removeCallbacks(p0Var2.f1451z);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$i */
    private class C0377i implements Runnable {
        C0377i() {
        }

        public void run() {
            C0346l0 l0Var = C0368p0.this.f1431f;
            if (l0Var != null && C0727l0.m2859I(l0Var) && C0368p0.this.f1431f.getCount() > C0368p0.this.f1431f.getChildCount()) {
                int childCount = C0368p0.this.f1431f.getChildCount();
                C0368p0 p0Var = C0368p0.this;
                if (childCount <= p0Var.f1443r) {
                    p0Var.f1428I.setInputMethodMode(2);
                    C0368p0.this.mo822j();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1418J = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1419K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0368p0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0368p0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1432g = -2;
        this.f1433h = -2;
        this.f1436k = 1002;
        this.f1440o = 0;
        this.f1441p = false;
        this.f1442q = false;
        this.f1443r = Integer.MAX_VALUE;
        this.f1445t = 0;
        this.f1451z = new C0377i();
        this.f1420A = new C0376h();
        this.f1421B = new C0375g();
        this.f1422C = new C0373e();
        this.f1425F = new Rect();
        this.f1429d = context;
        this.f1424E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f6029l1, i, i2);
        this.f1434i = obtainStyledAttributes.getDimensionPixelOffset(C1456j.f6034m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C1456j.f6039n1, 0);
        this.f1435j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1437l = true;
        }
        obtainStyledAttributes.recycle();
        C0367p pVar = new C0367p(context, attributeSet, i, i2);
        this.f1428I = pVar;
        pVar.setInputMethodMode(1);
    }

    /* renamed from: G */
    private void m1673G(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1418J;
            if (method != null) {
                try {
                    method.invoke(this.f1428I, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0372d.m1705b(this.f1428I, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.l0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1674n() {
        /*
            r12 = this;
            androidx.appcompat.widget.l0 r0 = r12.f1431f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f1429d
            androidx.appcompat.widget.p0$a r5 = new androidx.appcompat.widget.p0$a
            r5.<init>()
            r12.f1423D = r5
            boolean r5 = r12.f1427H
            r5 = r5 ^ r3
            androidx.appcompat.widget.l0 r5 = r12.mo2111p(r0, r5)
            r12.f1431f = r5
            android.graphics.drawable.Drawable r6 = r12.f1448w
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            android.widget.ListAdapter r6 = r12.f1430e
            r5.setAdapter(r6)
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1449x
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            r5.setFocusable(r3)
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            androidx.appcompat.widget.p0$b r6 = new androidx.appcompat.widget.p0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            androidx.appcompat.widget.p0$g r6 = r12.f1421B
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1450y
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.l0 r6 = r12.f1431f
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.l0 r5 = r12.f1431f
            android.view.View r6 = r12.f1444s
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1445t
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1445t
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1433h
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f1428I
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f1428I
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1444s
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f1428I
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f1425F
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1425F
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1437l
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f1435j = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f1425F
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f1428I
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.mo2112q()
            int r6 = r12.f1435j
            int r3 = r12.m1675r(r4, r6, r3)
            boolean r4 = r12.f1441p
            if (r4 != 0) goto L_0x0161
            int r4 = r12.f1432g
            if (r4 != r2) goto L_0x011c
            goto L_0x0161
        L_0x011c:
            int r4 = r12.f1433h
            r6 = -2
            if (r4 == r6) goto L_0x012a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012a
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0142
        L_0x012a:
            android.content.Context r2 = r12.f1429d
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1425F
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0142:
            r7 = r1
            androidx.appcompat.widget.l0 r6 = r12.f1431f
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo1969d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x015f
            androidx.appcompat.widget.l0 r2 = r12.f1431f
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.l0 r3 = r12.f1431f
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x015f:
            int r1 = r1 + r0
            return r1
        L_0x0161:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0368p0.m1674n():int");
    }

    /* renamed from: r */
    private int m1675r(View view, int i, boolean z) {
        return C0371c.m1703a(this.f1428I, view, i, z);
    }

    /* renamed from: v */
    private void m1676v() {
        View view = this.f1444s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1444s);
            }
        }
    }

    /* renamed from: A */
    public void mo2095A(Rect rect) {
        this.f1426G = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: B */
    public void mo2096B(int i) {
        this.f1428I.setInputMethodMode(i);
    }

    /* renamed from: C */
    public void mo2097C(boolean z) {
        this.f1427H = z;
        this.f1428I.setFocusable(z);
    }

    /* renamed from: D */
    public void mo2098D(PopupWindow.OnDismissListener onDismissListener) {
        this.f1428I.setOnDismissListener(onDismissListener);
    }

    /* renamed from: E */
    public void mo2099E(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1449x = onItemClickListener;
    }

    /* renamed from: F */
    public void mo2100F(boolean z) {
        this.f1439n = true;
        this.f1438m = z;
    }

    /* renamed from: H */
    public void mo2101H(int i) {
        this.f1445t = i;
    }

    /* renamed from: I */
    public void mo2102I(int i) {
        C0346l0 l0Var = this.f1431f;
        if (isShowing() && l0Var != null) {
            l0Var.setListSelectionHidden(false);
            l0Var.setSelection(i);
            if (l0Var.getChoiceMode() != 0) {
                l0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: J */
    public void mo2103J(int i) {
        this.f1433h = i;
    }

    /* renamed from: b */
    public int mo2104b() {
        return this.f1434i;
    }

    /* renamed from: d */
    public void mo2105d(int i) {
        this.f1435j = i;
        this.f1437l = true;
    }

    public void dismiss() {
        this.f1428I.dismiss();
        m1676v();
        this.f1428I.setContentView((View) null);
        this.f1431f = null;
        this.f1424E.removeCallbacks(this.f1451z);
    }

    /* renamed from: f */
    public void mo2106f(int i) {
        this.f1434i = i;
    }

    /* renamed from: g */
    public int mo2107g() {
        if (!this.f1437l) {
            return 0;
        }
        return this.f1435j;
    }

    public Drawable getBackground() {
        return this.f1428I.getBackground();
    }

    /* renamed from: i */
    public void mo2109i(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1446u;
        if (dataSetObserver == null) {
            this.f1446u = new C0374f();
        } else {
            ListAdapter listAdapter2 = this.f1430e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1430e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1446u);
        }
        C0346l0 l0Var = this.f1431f;
        if (l0Var != null) {
            l0Var.setAdapter(this.f1430e);
        }
    }

    public boolean isShowing() {
        return this.f1428I.isShowing();
    }

    /* renamed from: j */
    public void mo822j() {
        int n = m1674n();
        boolean t = mo2115t();
        C0825j.m3295b(this.f1428I, this.f1436k);
        boolean z = true;
        if (!this.f1428I.isShowing()) {
            int i = this.f1433h;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2112q().getWidth();
            }
            int i2 = this.f1432g;
            if (i2 == -1) {
                n = -1;
            } else if (i2 != -2) {
                n = i2;
            }
            this.f1428I.setWidth(i);
            this.f1428I.setHeight(n);
            m1673G(true);
            this.f1428I.setOutsideTouchable(!this.f1442q && !this.f1441p);
            this.f1428I.setTouchInterceptor(this.f1420A);
            if (this.f1439n) {
                C0825j.m3294a(this.f1428I, this.f1438m);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1419K;
                if (method != null) {
                    try {
                        method.invoke(this.f1428I, new Object[]{this.f1426G});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0372d.m1704a(this.f1428I, this.f1426G);
            }
            C0825j.m3296c(this.f1428I, mo2112q(), this.f1434i, this.f1435j, this.f1440o);
            this.f1431f.setSelection(-1);
            if (!this.f1427H || this.f1431f.isInTouchMode()) {
                mo2110o();
            }
            if (!this.f1427H) {
                this.f1424E.post(this.f1422C);
            }
        } else if (C0727l0.m2859I(mo2112q())) {
            int i3 = this.f1433h;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2112q().getWidth();
            }
            int i4 = this.f1432g;
            if (i4 == -1) {
                if (!t) {
                    n = -1;
                }
                if (t) {
                    this.f1428I.setWidth(this.f1433h == -1 ? -1 : 0);
                    this.f1428I.setHeight(0);
                } else {
                    this.f1428I.setWidth(this.f1433h == -1 ? -1 : 0);
                    this.f1428I.setHeight(-1);
                }
            } else if (i4 != -2) {
                n = i4;
            }
            PopupWindow popupWindow = this.f1428I;
            if (this.f1442q || this.f1441p) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1428I.update(mo2112q(), this.f1434i, this.f1435j, i3 < 0 ? -1 : i3, n < 0 ? -1 : n);
        }
    }

    /* renamed from: l */
    public ListView mo824l() {
        return this.f1431f;
    }

    /* renamed from: o */
    public void mo2110o() {
        C0346l0 l0Var = this.f1431f;
        if (l0Var != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0346l0 mo2111p(Context context, boolean z) {
        return new C0346l0(context, z);
    }

    /* renamed from: q */
    public View mo2112q() {
        return this.f1447v;
    }

    /* renamed from: s */
    public int mo2113s() {
        return this.f1433h;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f1428I.setBackgroundDrawable(drawable);
    }

    /* renamed from: t */
    public boolean mo2115t() {
        return this.f1428I.getInputMethodMode() == 2;
    }

    /* renamed from: u */
    public boolean mo2116u() {
        return this.f1427H;
    }

    /* renamed from: w */
    public void mo2117w(View view) {
        this.f1447v = view;
    }

    /* renamed from: x */
    public void mo2118x(int i) {
        this.f1428I.setAnimationStyle(i);
    }

    /* renamed from: y */
    public void mo2119y(int i) {
        Drawable background = this.f1428I.getBackground();
        if (background != null) {
            background.getPadding(this.f1425F);
            Rect rect = this.f1425F;
            this.f1433h = rect.left + rect.right + i;
            return;
        }
        mo2103J(i);
    }

    /* renamed from: z */
    public void mo2120z(int i) {
        this.f1440o = i;
    }
}
