package p061j3;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import miuix.appcompat.app.C2118q;
import miuix.smooth.SmoothFrameLayout2;
import miuix.springback.view.SpringBackLayout;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p018c2.C1347c;
import p018c2.C1349e;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1356l;
import p055i3.C1647a;
import p055i3.C1649c;
import p055i3.C1651e;
import p072l2.C1876d;
import p117t2.C2693a;
import p117t2.C2698f;

/* renamed from: j3.f */
public class C1750f extends PopupWindow {

    /* renamed from: A */
    private DataSetObserver f6733A = new C1751a();

    /* renamed from: d */
    private int f6734d;

    /* renamed from: e */
    private int f6735e;

    /* renamed from: f */
    private boolean f6736f;

    /* renamed from: g */
    private boolean f6737g;

    /* renamed from: h */
    protected final Rect f6738h;

    /* renamed from: i */
    private Context f6739i;

    /* renamed from: j */
    protected FrameLayout f6740j;

    /* renamed from: k */
    protected View f6741k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ListView f6742l;

    /* renamed from: m */
    private ListAdapter f6743m;

    /* renamed from: n */
    private AdapterView.OnItemClickListener f6744n;

    /* renamed from: o */
    private int f6745o = 8388661;

    /* renamed from: p */
    private int f6746p;

    /* renamed from: q */
    private int f6747q;

    /* renamed from: r */
    protected int f6748r;

    /* renamed from: s */
    private int f6749s;

    /* renamed from: t */
    private int f6750t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C1754d f6751u;

    /* renamed from: v */
    protected int f6752v;

    /* renamed from: w */
    private int f6753w;

    /* renamed from: x */
    private PopupWindow.OnDismissListener f6754x;

    /* renamed from: y */
    private boolean f6755y = true;

    /* renamed from: z */
    private WeakReference<View> f6756z;

    /* renamed from: j3.f$a */
    class C1751a extends DataSetObserver {
        C1751a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m7317b(View view) {
            int z = C1750f.this.mo6029z();
            int A = C1750f.this.mo6004A();
            int i = (z <= 0 || C1750f.this.f6751u.f6762b <= z) ? C1750f.this.f6751u.f6762b : z;
            view.getLocationInWindow(new int[2]);
            C1750f.this.update(view, C1750f.this.m7291w(view), C1750f.this.m7292x(view), A, i);
        }

        public void onChanged() {
            View s;
            C1750f.this.f6751u.f6763c = false;
            if (C1750f.this.isShowing() && (s = C1750f.this.m7276C()) != null) {
                s.post(new C1749e(this, s));
            }
        }
    }

    /* renamed from: j3.f$b */
    class C1752b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        private int f6758a = -1;

        C1752b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = C1750f.this.f6741k.getMeasuredHeight();
            int i9 = this.f6758a;
            if (i9 == -1 || i9 != measuredHeight) {
                boolean z = true;
                if (C1750f.this.f6742l.getAdapter() != null) {
                    z = C1750f.this.mo6009G();
                }
                ((SpringBackLayout) C1750f.this.f6741k).setEnabled(z);
                C1750f.this.f6742l.setVerticalScrollBarEnabled(z);
                this.f6758a = measuredHeight;
            }
        }
    }

    /* renamed from: j3.f$c */
    class C1753c extends ViewOutlineProvider {
        C1753c() {
        }

        public void getOutline(View view, Outline outline) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                outline.setAlpha(C1649c.m6964i(view.getContext(), C1347c.f4541I, 0.0f));
                if (view.getBackground() != null) {
                    view.getBackground().getOutline(outline);
                }
            }
        }
    }

    /* renamed from: j3.f$d */
    private static class C1754d {

        /* renamed from: a */
        int f6761a;

        /* renamed from: b */
        int f6762b;

        /* renamed from: c */
        boolean f6763c;

        private C1754d() {
        }

        /* synthetic */ C1754d(C1751a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo6033a(int i) {
            this.f6761a = i;
            this.f6763c = true;
        }
    }

    public C1750f(Context context) {
        super(context);
        this.f6739i = context;
        setHeight(-2);
        Resources resources = context.getResources();
        C1651e eVar = new C1651e(this.f6739i);
        this.f6746p = Math.min(eVar.mo5826d(), resources.getDimensionPixelSize(C1350f.f4632a0));
        this.f6747q = resources.getDimensionPixelSize(C1350f.f4634b0);
        this.f6748r = Math.min(eVar.mo5825c(), resources.getDimensionPixelSize(C1350f.f4630Z));
        int b = (int) (eVar.mo5824b() * 8.0f);
        this.f6734d = b;
        this.f6735e = b;
        this.f6738h = new Rect();
        this.f6751u = new C1754d((C1751a) null);
        setFocusable(true);
        setOutsideTouchable(true);
        this.f6740j = new SmoothFrameLayout2(context);
        ((SmoothFrameLayout2) this.f6740j).setCornerRadius((float) context.getResources().getDimensionPixelSize(C1350f.f4629Y));
        this.f6740j.setOnClickListener(new C1746b(this));
        mo6010L(context);
        setAnimationStyle(C1356l.f4791c);
        this.f6752v = C1649c.m6962g(this.f6739i, C1347c.f4540H);
        super.setOnDismissListener(new C1747c(this));
        this.f6749s = context.getResources().getDimensionPixelSize(C1350f.f4608D);
        this.f6750t = context.getResources().getDimensionPixelSize(C1350f.f4609E);
        this.f6753w = context.getResources().getDimensionPixelSize(C1350f.f4636c0);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public View m7276C() {
        WeakReference<View> weakReference = this.f6756z;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m7277H(View view) {
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m7278I() {
        PopupWindow.OnDismissListener onDismissListener = this.f6754x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m7279J(AdapterView adapterView, View view, int i, long j) {
        int headerViewsCount = i - this.f6742l.getHeaderViewsCount();
        if (this.f6744n != null && headerViewsCount >= 0 && headerViewsCount < this.f6743m.getCount()) {
            this.f6744n.onItemClick(adapterView, view, headerViewsCount, j);
        }
    }

    /* renamed from: K */
    private void m7280K(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 += view.getMeasuredHeight();
            if (!this.f6751u.f6763c) {
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth >= i) {
                    this.f6751u.mo6033a(i);
                } else if (measuredWidth > i3) {
                    i3 = measuredWidth;
                }
            }
        }
        C1754d dVar = this.f6751u;
        if (!dVar.f6763c) {
            dVar.mo6033a(i3);
        }
        this.f6751u.f6762b = i4;
    }

    /* renamed from: U */
    private boolean m7281U() {
        return this.f6755y && (Build.VERSION.SDK_INT > 29 || !C1647a.m6951a(this.f6739i));
    }

    /* renamed from: V */
    private void m7282V(View view) {
        showAsDropDown(view, m7291w(view), m7292x(view), this.f6745o);
        HapticCompat.m10233e(view, C2403h.f9356A, C2403h.f9375n);
        m7293y(this.f6740j.getRootView());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m7291w(android.view.View r6) {
        /*
            r5 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r6.getLocationInWindow(r0)
            boolean r1 = androidx.appcompat.widget.C0385r1.m1722b(r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            r1 = r0[r3]
            int r4 = r5.f6734d
            int r1 = r1 - r4
            int r4 = r5.getWidth()
            int r1 = r1 + r4
            int r4 = r5.f6749s
            int r1 = r1 + r4
            android.view.View r4 = r6.getRootView()
            int r4 = r4.getWidth()
            if (r1 <= r4) goto L_0x005c
            android.view.View r1 = r6.getRootView()
            int r1 = r1.getWidth()
            int r4 = r5.getWidth()
            int r1 = r1 - r4
            int r4 = r5.f6749s
            int r1 = r1 - r4
            r0 = r0[r3]
            goto L_0x005a
        L_0x0038:
            r1 = r0[r3]
            int r4 = r6.getWidth()
            int r1 = r1 + r4
            int r4 = r5.f6734d
            int r1 = r1 + r4
            int r4 = r5.getWidth()
            int r1 = r1 - r4
            int r4 = r5.f6749s
            int r1 = r1 - r4
            if (r1 >= 0) goto L_0x005c
            int r1 = r5.getWidth()
            int r4 = r5.f6749s
            int r1 = r1 + r4
            r0 = r0[r3]
            int r4 = r6.getWidth()
            int r0 = r0 + r4
        L_0x005a:
            int r1 = r1 - r0
            goto L_0x005e
        L_0x005c:
            r1 = r3
            r2 = r1
        L_0x005e:
            if (r2 != 0) goto L_0x0085
            boolean r0 = r5.f6736f
            if (r0 == 0) goto L_0x0066
            int r3 = r5.f6734d
        L_0x0066:
            if (r3 == 0) goto L_0x0084
            if (r0 != 0) goto L_0x0084
            boolean r6 = androidx.appcompat.widget.C0385r1.m1722b(r6)
            if (r6 == 0) goto L_0x007a
            android.graphics.Rect r6 = r5.f6738h
            int r6 = r6.left
            int r0 = r5.f6734d
            int r6 = r6 - r0
            int r1 = r3 - r6
            goto L_0x0085
        L_0x007a:
            android.graphics.Rect r6 = r5.f6738h
            int r6 = r6.right
            int r0 = r5.f6734d
            int r6 = r6 - r0
            int r1 = r3 + r6
            goto L_0x0085
        L_0x0084:
            r1 = r3
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p061j3.C1750f.m7291w(android.view.View):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public int m7292x(View view) {
        int i;
        float f;
        int i2;
        int i3 = this.f6737g ? this.f6735e : ((-view.getHeight()) - this.f6738h.top) + this.f6735e;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f2 = (float) iArr[1];
        int i4 = this.f6739i.getResources().getDisplayMetrics().heightPixels;
        int[] iArr2 = new int[2];
        int i5 = 0;
        if (C1649c.m6959d(this.f6739i, C1347c.f4536D, false)) {
            Context context = this.f6739i;
            if (context instanceof C2118q) {
                View findViewById = ((C2118q) context).findViewById(C1352h.f4723j);
                if (findViewById == null) {
                    findViewById = ((C2118q) this.f6739i).findViewById(16908290);
                }
                i = findViewById.getHeight();
                findViewById.getLocationInWindow(iArr2);
            } else {
                if (context instanceof ContextThemeWrapper) {
                    Context baseContext = ((ContextThemeWrapper) context).getBaseContext();
                    if (baseContext instanceof C2118q) {
                        C2118q qVar = (C2118q) baseContext;
                        View findViewById2 = qVar.findViewById(C1352h.f4723j);
                        if (findViewById2 == null) {
                            findViewById2 = qVar.findViewById(16908290);
                        }
                        int height = findViewById2.getHeight();
                        findViewById2.getLocationInWindow(iArr2);
                        i = height;
                    }
                }
                i = i4;
            }
            f = f2 - ((float) iArr2[1]);
        } else {
            f = f2;
            i = i4;
        }
        int z = mo6029z();
        int min = z > 0 ? Math.min(this.f6751u.f6762b, z) : this.f6751u.f6762b;
        if (min < i && f + ((float) i3) + ((float) min) + ((float) view.getHeight()) > ((float) i)) {
            if (this.f6737g) {
                i5 = view.getHeight();
            }
            i3 -= i5 + min;
        }
        int[] iArr3 = new int[2];
        view.getRootView().getLocationInWindow(iArr3);
        int height2 = (int) (((float) i3) + f2 + ((float) view.getHeight()));
        if (height2 >= iArr3[1] && height2 < (i2 = iArr2[1])) {
            int i6 = i2 - height2;
            setHeight(min - i6);
            i3 += i6;
        }
        int i7 = height2 + min;
        if (i7 <= iArr3[1] + i4) {
            int i8 = iArr2[1];
            if (i8 + i < i7) {
                setHeight(min - ((i7 - i8) - i));
            }
        }
        return i3;
    }

    /* renamed from: y */
    public static void m7293y(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view != null && (layoutParams = (WindowManager.LayoutParams) view.getLayoutParams()) != null) {
            layoutParams.flags |= 2;
            layoutParams.dimAmount = 0.3f;
            ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo6004A() {
        if (!this.f6751u.f6763c) {
            m7280K(this.f6743m, (ViewGroup) null, this.f6739i, this.f6746p);
        }
        int max = Math.max(this.f6751u.f6761a, this.f6747q);
        Rect rect = this.f6738h;
        return max + rect.left + rect.right;
    }

    /* renamed from: B */
    public void mo6005B(View view, ViewGroup viewGroup) {
        setWidth(mo6004A());
        int i = this.f6751u.f6762b;
        int z = mo6029z();
        if (i > z) {
            i = z;
        }
        setHeight(i);
        m7282V(view);
    }

    /* renamed from: D */
    public ListView mo6006D() {
        return this.f6742l;
    }

    /* renamed from: E */
    public int mo6007E() {
        return this.f6749s;
    }

    /* renamed from: F */
    public int mo6008F() {
        return this.f6750t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo6009G() {
        return this.f6751u.f6762b > mo6029z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6010L(Context context) {
        Drawable h = C1649c.m6963h(this.f6739i, C1347c.f4534B);
        if (h != null) {
            h.getPadding(this.f6738h);
            this.f6740j.setBackground(h);
        }
        setBackgroundDrawable(new ColorDrawable(0));
        mo6018T(this.f6740j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo6011M(View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            str = "show: anchor is null";
        } else {
            if (this.f6741k == null) {
                View inflate = LayoutInflater.from(this.f6739i).inflate(C1354j.f4783z, (ViewGroup) null);
                this.f6741k = inflate;
                inflate.addOnLayoutChangeListener(new C1752b());
            }
            int i = -2;
            if (!(this.f6740j.getChildCount() == 1 && this.f6740j.getChildAt(0) == this.f6741k)) {
                this.f6740j.removeAllViews();
                this.f6740j.addView(this.f6741k);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6741k.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                layoutParams.gravity = 16;
            }
            if (m7281U()) {
                this.f6740j.setElevation((float) this.f6752v);
                setElevation((float) (this.f6752v + this.f6753w));
                mo6017S(this.f6740j);
            }
            ListView listView = (ListView) this.f6741k.findViewById(16908298);
            this.f6742l = listView;
            if (listView == null) {
                str = "list not found";
            } else {
                listView.setOnItemClickListener(new C1748d(this));
                this.f6742l.setAdapter(this.f6743m);
                setWidth(mo6004A());
                int z = mo6029z();
                if (z > 0 && this.f6751u.f6762b > z) {
                    i = z;
                }
                setHeight(i);
                ((InputMethodManager) this.f6739i.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return true;
            }
        }
        Log.e("ListPopupWindow", str);
        return false;
    }

    /* renamed from: N */
    public void mo6012N(int i) {
        this.f6751u.mo6033a(i);
    }

    /* renamed from: O */
    public void mo6013O(int i) {
        this.f6745o = i;
    }

    /* renamed from: P */
    public void mo6014P(boolean z) {
        this.f6755y = z;
    }

    /* renamed from: Q */
    public void mo6015Q(int i) {
        this.f6748r = i;
    }

    /* renamed from: R */
    public void mo6016R(AdapterView.OnItemClickListener onItemClickListener) {
        this.f6744n = onItemClickListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo6017S(View view) {
        int i = Build.VERSION.SDK_INT;
        if (C2698f.m11281i(this.f6739i)) {
            view.setOutlineProvider((ViewOutlineProvider) null);
            return;
        }
        view.setOutlineProvider(new C1753c());
        if (i >= 28) {
            view.setOutlineSpotShadowColor(this.f6739i.getColor(C1349e.f4601e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo6018T(View view) {
        super.setContentView(view);
    }

    /* renamed from: b */
    public int mo6019b() {
        return this.f6734d;
    }

    /* renamed from: d */
    public void mo6020d(int i) {
        this.f6735e = i;
        this.f6737g = true;
    }

    public void dismiss() {
        super.dismiss();
        C1876d.m7800d(this.f6739i, this);
    }

    /* renamed from: f */
    public void mo6022f(int i) {
        this.f6734d = i;
        this.f6736f = true;
    }

    /* renamed from: g */
    public int mo6023g() {
        return this.f6735e;
    }

    /* renamed from: i */
    public void mo6024i(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f6743m;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f6733A);
        }
        this.f6743m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6733A);
        }
    }

    /* renamed from: l */
    public void mo6025l(View view, ViewGroup viewGroup) {
        if (mo6011M(view, viewGroup)) {
            m7282V(view);
        }
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6754x = onDismissListener;
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        this.f6756z = new WeakReference<>(view);
        C1876d.m7801e(this.f6739i, this);
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        C1876d.m7801e(this.f6739i, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo6029z() {
        return Math.min(this.f6748r, new C1651e(this.f6739i).mo5825c() - C2693a.m11237f(this.f6739i, false));
    }
}
