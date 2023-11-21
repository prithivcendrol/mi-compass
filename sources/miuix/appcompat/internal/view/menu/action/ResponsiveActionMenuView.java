package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collection;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.smooth.C2385c;
import miuix.view.C2405j;
import p018c2.C1347c;
import p018c2.C1349e;
import p018c2.C1350f;
import p018c2.C1357m;
import p055i3.C1649c;
import p055i3.C1656j;
import p074l4.C1880a;
import p074l4.C1881b;
import p074l4.C1882c;
import p074l4.C1883d;
import p078m2.C1928g;
import p090o2.C2498e;
import p117t2.C2696d;
import p117t2.C2697e;
import p117t2.C2698f;

public class ResponsiveActionMenuView extends C2233c {

    /* renamed from: A */
    private int f8422A;

    /* renamed from: B */
    private int f8423B;

    /* renamed from: C */
    private int f8424C;

    /* renamed from: D */
    private int f8425D;

    /* renamed from: E */
    private int f8426E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public Drawable f8427F;

    /* renamed from: G */
    private Drawable f8428G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Drawable f8429H;

    /* renamed from: I */
    private final C2405j f8430I;

    /* renamed from: J */
    private C1928g f8431J = null;

    /* renamed from: K */
    private View.OnLayoutChangeListener f8432K = null;

    /* renamed from: L */
    private int f8433L;

    /* renamed from: M */
    private AttributeSet f8434M;

    /* renamed from: N */
    private View f8435N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f8436O = 0;

    /* renamed from: P */
    private Rect f8437P;

    /* renamed from: Q */
    private boolean f8438Q = false;

    /* renamed from: R */
    private boolean[] f8439R;

    /* renamed from: S */
    private boolean f8440S = false;

    /* renamed from: T */
    private ViewOutlineProvider f8441T = new C2221a();

    /* renamed from: U */
    private AnimConfig f8442U = new AnimConfig().setEase(-2, 0.9f, 0.25f).addListeners(new C2222b());

    /* renamed from: i */
    private final Context f8443i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8444j = false;

    /* renamed from: k */
    private boolean f8445k = false;

    /* renamed from: l */
    private boolean f8446l = false;

    /* renamed from: m */
    private int f8447m;

    /* renamed from: n */
    private int f8448n;

    /* renamed from: o */
    private int f8449o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f8450p;

    /* renamed from: q */
    private int f8451q;

    /* renamed from: r */
    private float f8452r;

    /* renamed from: s */
    private float f8453s;

    /* renamed from: t */
    private float f8454t;

    /* renamed from: u */
    private int f8455u;

    /* renamed from: v */
    private int f8456v;

    /* renamed from: w */
    private boolean f8457w = false;

    /* renamed from: x */
    private Path f8458x = new Path();

    /* renamed from: y */
    private Paint f8459y;

    /* renamed from: z */
    private RectF f8460z = new RectF();

    /* renamed from: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView$a */
    class C2221a extends ViewOutlineProvider {
        C2221a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ResponsiveActionMenuView.this.f8450p);
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView$b */
    class C2222b extends TransitionListener {
        C2222b() {
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            int unused = ResponsiveActionMenuView.this.f8436O = UpdateInfo.findByName(collection, "target").getIntValue();
            ResponsiveActionMenuView.this.requestLayout();
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView$c */
    class C2223c implements C2405j.C2406a {
        C2223c() {
        }

        /* renamed from: a */
        public void mo7703a(C2405j jVar) {
            boolean d = C1649c.m6959d(ResponsiveActionMenuView.this.getContext(), C1347c.f4535C, true);
            jVar.mo9309i(C2405j.m10249a(ResponsiveActionMenuView.this.getContext(), ResponsiveActionMenuView.this.f8444j ? ResponsiveActionMenuView.this.f8429H : ResponsiveActionMenuView.this.f8427F, d ? C1881b.f7258b : C1880a.f7253b), d ? C1883d.f7263a : C1882c.f7262a, 66);
        }

        /* renamed from: b */
        public void mo7704b(boolean z) {
        }

        /* renamed from: c */
        public void mo7705c(boolean z) {
            ResponsiveActionMenuView.this.m9294H();
        }
    }

    public ResponsiveActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8447m = C2698f.m11275c(context, 11.0f);
        this.f8448n = C2698f.m11275c(context, 16.0f);
        this.f8449o = C2698f.m11275c(context, 196.0f);
        this.f8424C = C2698f.m11275c(context, 8.0f);
        this.f8425D = C2698f.m11275c(context, 5.0f);
        this.f8426E = C2698f.m11275c(context, 2.0f);
        this.f8450p = context.getResources().getDimensionPixelSize(C1350f.f4662p0);
        this.f8451q = context.getResources().getColor(C1349e.f4602f);
        this.f8452r = (float) context.getResources().getDimensionPixelSize(C1350f.f4666r0);
        this.f8453s = (float) context.getResources().getDimensionPixelSize(C1350f.f4668s0);
        this.f8454t = (float) context.getResources().getDimensionPixelSize(C1350f.f4670t0);
        this.f8455u = context.getResources().getColor(C1349e.f4603g);
        this.f8456v = context.getResources().getDimensionPixelSize(C1350f.f4664q0);
        Paint paint = new Paint(1);
        this.f8459y = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f8459y.setColor(this.f8455u);
        this.f8459y.setStrokeWidth((float) this.f8456v);
        this.f8433L = context.getResources().getDisplayMetrics().densityDpi;
        this.f8443i = context;
        this.f8434M = attributeSet;
        m9291E(attributeSet);
        setClipToPadding(false);
        setWillNotDraw(false);
        C2385c.m10112c(this, true);
        this.f8430I = new C2405j(context, this, false, new C2223c());
    }

    /* renamed from: B */
    private void m9288B() {
        if (this.f8438Q) {
            setTranslationY((float) C1656j.m6982a(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m9289C(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1928g gVar = this.f8431J;
        if (gVar != null) {
            gVar.layout(getLeft(), getTop(), getRight(), getBottom());
        }
    }

    /* renamed from: D */
    private void m9290D(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m9303z(childAt)) {
                if (childAt instanceof LinearLayout) {
                    ((LinearLayout) childAt).setGravity(1);
                }
                if (z) {
                    childAt.setPadding(0, 0, 0, 0);
                } else {
                    childAt.setPadding(0, (!C2698f.m11284l(this) || (C2698f.m11282j(this.f8443i) && !C2698f.m11285m(this.f8443i))) ? this.f8425D : this.f8424C, 0, 0);
                }
                childAt.measure(i, i2);
            }
        }
    }

    /* renamed from: E */
    private void m9291E(AttributeSet attributeSet) {
        Context context = this.f8443i;
        if (context != null) {
            TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, C1357m.f4938h2, C1347c.f4542J, 0);
                this.f8427F = typedArray.getDrawable(C1357m.f4943i2);
                this.f8429H = typedArray.getDrawable(C1357m.f4948j2);
                typedArray.recycle();
                if (C2697e.m11269f()) {
                    this.f8428G = new ColorDrawable(0);
                }
            } catch (Throwable th) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }
    }

    /* renamed from: F */
    private void m9292F(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!m9303z(childAt) && (childAt instanceof LinearLayout)) {
                ((LinearLayout) childAt).setPadding(0, i, 0, 0);
            }
        }
    }

    /* renamed from: G */
    private void m9293G(View view) {
        boolean[] zArr;
        if (C2696d.f10482a && (zArr = this.f8439R) != null) {
            int length = zArr.length;
            for (int i = 0; i < length; i++) {
                ViewParent parent = view.getParent();
                if (parent == null) {
                    break;
                }
                ((ViewGroup) parent).setClipChildren(this.f8439R[i]);
                view = (View) parent;
            }
            this.f8439R = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m9294H() {
        Drawable drawable;
        if (this.f8444j) {
            setOutlineProvider(this.f8441T);
            if (!mo8277y()) {
                drawable = this.f8429H;
                setBackground(drawable);
            }
        } else {
            setOutlineProvider((ViewOutlineProvider) null);
            if (this.f8500h) {
                setBackground((Drawable) null);
                return;
            } else if (!mo8277y()) {
                drawable = this.f8427F;
                setBackground(drawable);
            }
        }
        drawable = this.f8428G;
        setBackground(drawable);
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        return indexOfChild(this.f8435N) != -1 ? childCount - 1 : childCount;
    }

    private Rect getCustomViewClipBounds() {
        if (this.f8437P == null) {
            this.f8437P = new Rect();
        }
        this.f8437P.set(0, 0, this.f8435N.getMeasuredWidth(), this.f8435N.getMeasuredHeight() - this.f8436O);
        return this.f8437P;
    }

    private int getMaxChildrenTotalHeight() {
        int x;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!m9303z(childAt) && (childAt instanceof LinearLayout) && i < (x = m9302x((LinearLayout) childAt))) {
                i = x;
            }
        }
        return i;
    }

    /* renamed from: x */
    private int m9302x(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            i += linearLayout.getChildAt(i2).getMeasuredHeight();
        }
        return i;
    }

    /* renamed from: z */
    private boolean m9303z(View view) {
        return view == this.f8435N;
    }

    /* renamed from: A */
    public boolean mo8259A() {
        return this.f8444j;
    }

    /* renamed from: b */
    public void mo7648b(boolean z) {
        this.f8430I.mo7648b(z);
    }

    /* renamed from: d */
    public boolean mo8195d(int i) {
        View childAt = getChildAt(i);
        if (m9303z(childAt)) {
            return false;
        }
        C2233c.C2234a aVar = (C2233c.C2234a) childAt.getLayoutParams();
        return (aVar == null || !aVar.f8501a) && super.mo8195d(i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8457w && mo8259A()) {
            canvas.drawPath(this.f8458x, this.f8459y);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8261f() {
        setBackground((Drawable) null);
    }

    public int getBottomMenuCustomViewOffset() {
        return this.f8436O;
    }

    public int getCollapsedHeight() {
        if (this.f8446l) {
            return 0;
        }
        int a = C1656j.m6982a(this);
        View view = (View) getParent();
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        if (measuredHeight <= 0) {
            return 0;
        }
        return Math.max(measuredHeight, a);
    }

    /* renamed from: k */
    public boolean mo8263k() {
        return this.f8445k;
    }

    /* renamed from: l */
    public void mo8264l() {
        super.mo8264l();
        mo7648b(false);
        m9293G(this);
        C1928g gVar = this.f8431J;
        if (gVar != null) {
            gVar.mo6512b();
            ViewGroup viewGroup = (ViewGroup) getParent();
            viewGroup.removeView(this.f8431J);
            viewGroup.removeOnLayoutChangeListener(this.f8432K);
            this.f8431J = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8265m() {
        m9294H();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8457w = false;
        if (C2696d.f10482a) {
            if (mo8259A()) {
                mo8276w(this);
                C2696d.m11262c(this, this.f8451q, this.f8453s, this.f8454t, (float) this.f8450p);
                return;
            }
            m9293G(this);
            C2696d.m11261b(this);
        } else if (C2385c.f9268b) {
            Log.w("ResponsiveActionMenuView", "Support mi shadow and not support smooth corner!");
            this.f8457w = true;
        } else if (!mo8259A()) {
            C1928g gVar = this.f8431J;
            if (gVar != null) {
                gVar.mo6512b();
                ViewGroup viewGroup = (ViewGroup) getParent();
                viewGroup.removeOnLayoutChangeListener(this.f8432K);
                viewGroup.removeView(this.f8431J);
                this.f8431J = null;
            }
        } else if (this.f8431J == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            C1928g gVar2 = new C1928g(getContext());
            this.f8431J = gVar2;
            gVar2.setShadowHostViewRadius(this.f8450p);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            viewGroup2.addView(this.f8431J, layoutParams);
            C2498e eVar = new C2498e(this);
            this.f8432K = eVar;
            viewGroup2.addOnLayoutChangeListener(eVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2405j jVar = this.f8430I;
        if (jVar != null) {
            jVar.mo9306f();
        }
        int i = configuration.densityDpi;
        if (i != this.f8433L) {
            this.f8433L = i;
            this.f8447m = C2698f.m11275c(this.f8443i, 11.0f);
            this.f8448n = C2698f.m11275c(this.f8443i, 16.0f);
            this.f8449o = C2698f.m11275c(this.f8443i, 196.0f);
            this.f8424C = C2698f.m11275c(this.f8443i, 8.0f);
            this.f8425D = C2698f.m11275c(this.f8443i, 5.0f);
            this.f8426E = C2698f.m11275c(this.f8443i, 2.0f);
            Context context = getContext();
            this.f8450p = context.getResources().getDimensionPixelSize(C1350f.f4662p0);
            this.f8452r = (float) context.getResources().getDimensionPixelSize(C1350f.f4666r0);
            this.f8453s = (float) context.getResources().getDimensionPixelSize(C1350f.f4668s0);
            this.f8454t = (float) context.getResources().getDimensionPixelSize(C1350f.f4670t0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1350f.f4664q0);
            this.f8456v = dimensionPixelSize;
            this.f8459y.setStrokeWidth((float) dimensionPixelSize);
            if (C2696d.f10482a) {
                if (mo8259A()) {
                    C2696d.m11262c(this, this.f8451q, this.f8453s, this.f8454t, this.f8452r);
                } else {
                    C2696d.m11261b(this);
                }
            }
            m9291E(this.f8434M);
            m9294H();
            C1928g gVar = this.f8431J;
            if (gVar != null) {
                gVar.setShadowHostViewRadius(this.f8450p);
            }
        }
    }

    public void onDetachedFromWindow() {
        mo7648b(false);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (r10 < 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            boolean r10 = r7.f8445k
            r11 = 8
            r12 = 0
            if (r10 == 0) goto L_0x0030
            android.view.View r8 = r7.f8435N
            if (r8 == 0) goto L_0x002f
            int r8 = r8.getVisibility()
            if (r8 == r11) goto L_0x002f
            android.view.View r1 = r7.f8435N
            int r8 = r1.getMeasuredWidth()
            int r4 = r8 + 0
            android.view.View r8 = r7.f8435N
            int r8 = r8.getMeasuredHeight()
            int r5 = r8 + 0
            r2 = 0
            r3 = 0
            r0 = r7
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
        L_0x002f:
            return
        L_0x0030:
            android.view.View r10 = r7.f8435N
            if (r10 == 0) goto L_0x005c
            int r10 = r10.getVisibility()
            if (r10 == r11) goto L_0x005c
            android.view.View r1 = r7.f8435N
            int r10 = r1.getMeasuredWidth()
            int r4 = r10 + 0
            android.view.View r10 = r7.f8435N
            int r10 = r10.getMeasuredHeight()
            int r5 = r10 + 0
            r2 = 0
            r3 = 0
            r0 = r7
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
            android.view.View r10 = r7.f8435N
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r12
            int r11 = r7.f8436O
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x005d
        L_0x005c:
            r10 = r12
        L_0x005d:
            int r11 = r7.getChildCount()
            int r0 = r7.getActionMenuItemCount()
            int r1 = r7.getPaddingStart()
            int r8 = r8 - r1
            int r1 = r7.getPaddingEnd()
            int r8 = r8 - r1
            int r1 = r7.f8422A
            int r1 = r1 * r0
            int r0 = r0 + -1
            int r2 = r7.f8447m
            int r0 = r0 * r2
            int r1 = r1 + r0
            int r0 = r7.getPaddingStart()
            int r8 = r8 - r1
            int r8 = r8 / 2
            int r0 = r0 + r8
            r8 = r0
        L_0x0081:
            if (r12 >= r11) goto L_0x00a7
            android.view.View r6 = r7.getChildAt(r12)
            boolean r0 = r7.m9303z(r6)
            if (r0 == 0) goto L_0x008e
            goto L_0x00a4
        L_0x008e:
            int r0 = r6.getMeasuredWidth()
            int r4 = r8 + r0
            r0 = r7
            r1 = r6
            r2 = r8
            r3 = r10
            r5 = r9
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
            int r0 = r6.getMeasuredWidth()
            int r1 = r7.f8447m
            int r0 = r0 + r1
            int r8 = r8 + r0
        L_0x00a4:
            int r12 = r12 + 1
            goto L_0x0081
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view;
        int i3 = i2;
        this.f8445k = false;
        this.f8446l = false;
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop() + paddingBottom;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        int size = View.MeasureSpec.getSize(i);
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f8423B = 0;
            View view2 = this.f8435N;
            if (view2 == null || view2.getVisibility() == 8) {
                this.f8446l = true;
                setMeasuredDimension(0, 0);
            } else {
                this.f8445k = true;
                C2233c.C2234a aVar = (C2233c.C2234a) this.f8435N.getLayoutParams();
                if (this.f8444j) {
                    view = this.f8435N;
                    size -= this.f8448n * 2;
                } else {
                    view = this.f8435N;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingTop, aVar.height));
                this.f8435N.setClipBounds(getCustomViewClipBounds());
                setMeasuredDimension(this.f8435N.getMeasuredWidth(), ((this.f8435N.getMeasuredHeight() + 0) + paddingTop) - this.f8436O);
            }
            m9288B();
            return;
        }
        if (this.f8444j) {
            this.f8422A = C2698f.m11275c(this.f8443i, 115.0f);
            int c = C2698f.m11275c(this.f8443i, 80.0f);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c, Integer.MIN_VALUE);
            int i4 = (actionMenuItemCount - 1) * this.f8447m;
            int i5 = (this.f8422A * actionMenuItemCount) + i4;
            int i6 = this.f8448n;
            if (i5 >= size - (i6 * 2)) {
                this.f8422A = (((size - paddingLeft) - (i6 * 2)) - i4) / actionMenuItemCount;
            }
            m9290D(View.MeasureSpec.makeMeasureSpec(this.f8422A, 1073741824), makeMeasureSpec, true);
            m9292F((c - (getMaxChildrenTotalHeight() + (this.f8426E * 2))) / 2);
            this.f8423B = c;
            size = Math.max((this.f8422A * actionMenuItemCount) + paddingLeft + i4, this.f8449o);
        } else {
            this.f8422A = ((size - paddingLeft) - ((actionMenuItemCount - 1) * this.f8447m)) / actionMenuItemCount;
            int c2 = C2698f.m11275c(getContext(), 64.0f) + paddingBottom;
            m9290D(View.MeasureSpec.makeMeasureSpec(this.f8422A, 1073741824), View.MeasureSpec.makeMeasureSpec(c2, 1073741824), this.f8444j);
            this.f8423B = c2;
        }
        int i7 = 0 + this.f8423B + paddingTop;
        if (!this.f8444j) {
            i7 -= paddingBottom;
        }
        View view3 = this.f8435N;
        if (!(view3 == null || view3.getVisibility() == 8)) {
            this.f8435N.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingTop, ((C2233c.C2234a) this.f8435N.getLayoutParams()).height));
            this.f8435N.setClipBounds(getCustomViewClipBounds());
            i7 = (i7 + this.f8435N.getMeasuredHeight()) - this.f8436O;
        }
        setMeasuredDimension(size, i7);
        m9288B();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        mo7648b(false);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) this.f8456v) / 2.0f;
        this.f8460z.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f8460z.inset(f, f);
        this.f8458x.reset();
        Path path = this.f8458x;
        RectF rectF = this.f8460z;
        int i5 = this.f8450p;
        path.addRoundRect(rectF, (float) i5, (float) i5, Path.Direction.CW);
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        if (this.f8435N != null && i >= 0) {
            this.f8436O = i;
            requestLayout();
        }
    }

    public void setEnableBlur(boolean z) {
        this.f8430I.mo9310j(z);
    }

    public void setHidden(boolean z) {
        this.f8438Q = z;
    }

    public void setSupportBlur(boolean z) {
        this.f8430I.mo9311k(z);
    }

    public void setSuspendEnabled(boolean z) {
        if (this.f8444j != z) {
            this.f8444j = z;
            this.f8430I.mo9308h();
            this.f8430I.mo9307g();
        }
        m9294H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C1928g gVar = this.f8431J;
        if (gVar != null) {
            gVar.setTranslationY(f);
        }
    }

    /* renamed from: v */
    public void mo8275v(View view) {
        if (view != null) {
            this.f8435N = view;
            addView(view);
        }
    }

    /* renamed from: w */
    public void mo8276w(View view) {
        if (C2696d.f10482a && this.f8439R == null) {
            this.f8439R = new boolean[2];
            int i = 0;
            while (i < 2) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    this.f8439R[i] = viewGroup.getClipChildren();
                    viewGroup.setClipChildren(false);
                    view = (View) parent;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: y */
    public boolean mo8277y() {
        return this.f8430I.mo9303c();
    }
}
