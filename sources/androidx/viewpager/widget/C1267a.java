package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import androidx.core.content.C0510a;
import androidx.core.view.C0727l0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p098p4.C2551a;
import p129w.C2871a;

/* renamed from: androidx.viewpager.widget.a */
public class C1267a extends ViewGroup {

    /* renamed from: d0 */
    static final int[] f4392d0 = {16842931};

    /* renamed from: e0 */
    private static final Comparator<C1271d> f4393e0 = new C1268a();

    /* renamed from: f0 */
    private static final Interpolator f4394f0 = new C1269b();

    /* renamed from: g0 */
    private static final C1278j f4395g0 = new C1278j();

    /* renamed from: A */
    private boolean f4396A;

    /* renamed from: B */
    private int f4397B;

    /* renamed from: C */
    private int f4398C;

    /* renamed from: D */
    private int f4399D;

    /* renamed from: E */
    private float f4400E;

    /* renamed from: F */
    private float f4401F;

    /* renamed from: G */
    private float f4402G;

    /* renamed from: H */
    private float f4403H;

    /* renamed from: I */
    private int f4404I;

    /* renamed from: J */
    private VelocityTracker f4405J;

    /* renamed from: K */
    private boolean f4406K;

    /* renamed from: L */
    private EdgeEffect f4407L;

    /* renamed from: M */
    private EdgeEffect f4408M;

    /* renamed from: N */
    private boolean f4409N;

    /* renamed from: O */
    private boolean f4410O;

    /* renamed from: P */
    private int f4411P;

    /* renamed from: Q */
    private List<C1274g> f4412Q;

    /* renamed from: R */
    private C1274g f4413R;

    /* renamed from: S */
    private C1274g f4414S;

    /* renamed from: T */
    private List<C1273f> f4415T;

    /* renamed from: U */
    private C1275h f4416U;

    /* renamed from: V */
    private int f4417V;

    /* renamed from: W */
    private int f4418W;

    /* renamed from: a0 */
    private ArrayList<View> f4419a0;

    /* renamed from: b0 */
    private final Runnable f4420b0;

    /* renamed from: c0 */
    private int f4421c0;

    /* renamed from: d */
    private int f4422d;

    /* renamed from: e */
    private final ArrayList<C1271d> f4423e;

    /* renamed from: f */
    private final C1271d f4424f;

    /* renamed from: g */
    private final Rect f4425g;

    /* renamed from: h */
    int f4426h;

    /* renamed from: i */
    private int f4427i;

    /* renamed from: j */
    private boolean f4428j;

    /* renamed from: k */
    private Parcelable f4429k;

    /* renamed from: l */
    private ClassLoader f4430l;

    /* renamed from: m */
    private boolean f4431m;

    /* renamed from: n */
    private int f4432n;

    /* renamed from: o */
    private Drawable f4433o;

    /* renamed from: p */
    private int f4434p;

    /* renamed from: q */
    private int f4435q;

    /* renamed from: r */
    private float f4436r;

    /* renamed from: s */
    private float f4437s;

    /* renamed from: t */
    private int f4438t;

    /* renamed from: u */
    private int f4439u;

    /* renamed from: v */
    private boolean f4440v;

    /* renamed from: w */
    private boolean f4441w;

    /* renamed from: x */
    private boolean f4442x;

    /* renamed from: y */
    private int f4443y;

    /* renamed from: z */
    private boolean f4444z;

    /* renamed from: androidx.viewpager.widget.a$a */
    class C1268a implements Comparator<C1271d> {
        C1268a() {
        }

        /* renamed from: a */
        public int compare(C1271d dVar, C1271d dVar2) {
            return dVar.f4446b - dVar2.f4446b;
        }
    }

    /* renamed from: androidx.viewpager.widget.a$b */
    class C1269b implements Interpolator {
        C1269b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.a$c */
    public @interface C1270c {
    }

    /* renamed from: androidx.viewpager.widget.a$d */
    static class C1271d {

        /* renamed from: a */
        Object f4445a;

        /* renamed from: b */
        int f4446b;

        /* renamed from: c */
        boolean f4447c;

        /* renamed from: d */
        float f4448d;

        /* renamed from: e */
        float f4449e;

        C1271d() {
        }
    }

    /* renamed from: androidx.viewpager.widget.a$e */
    public static class C1272e extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4450a;

        /* renamed from: b */
        public int f4451b;

        /* renamed from: c */
        float f4452c = 0.0f;

        /* renamed from: d */
        boolean f4453d;

        /* renamed from: e */
        int f4454e;

        /* renamed from: f */
        int f4455f;

        public C1272e() {
            super(-1, -1);
        }

        public C1272e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1267a.f4392d0);
            this.f4451b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.a$f */
    public interface C1273f {
        /* renamed from: a */
        void mo5094a(C2551a aVar, C1279b bVar, C1279b bVar2);
    }

    /* renamed from: androidx.viewpager.widget.a$g */
    public interface C1274g {
        /* renamed from: a */
        void mo5095a(int i, float f, int i2);

        /* renamed from: b */
        void mo5096b(int i);

        /* renamed from: c */
        void mo5097c(int i);
    }

    /* renamed from: androidx.viewpager.widget.a$h */
    public interface C1275h {
        /* renamed from: a */
        void mo5098a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.a$i */
    public static class C1276i extends C2871a {
        public static final Parcelable.Creator<C1276i> CREATOR = new C1277a();

        /* renamed from: f */
        int f4456f;

        /* renamed from: g */
        int f4457g;

        /* renamed from: h */
        Parcelable f4458h;

        /* renamed from: i */
        ClassLoader f4459i;

        /* renamed from: androidx.viewpager.widget.a$i$a */
        class C1277a implements Parcelable.ClassLoaderCreator<C1276i> {
            C1277a() {
            }

            /* renamed from: a */
            public C1276i createFromParcel(Parcel parcel) {
                return new C1276i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1276i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1276i(parcel, classLoader);
            }

            /* renamed from: c */
            public C1276i[] newArray(int i) {
                return new C1276i[i];
            }
        }

        C1276i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4456f = parcel.readInt();
            this.f4457g = parcel.readInt();
            this.f4458h = parcel.readParcelable(classLoader);
            this.f4459i = classLoader;
        }

        public C1276i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4456f + " isRTL=" + this.f4457g + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4456f);
            parcel.writeInt(this.f4457g);
            parcel.writeParcelable(this.f4458h, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.a$j */
    static class C1278j implements Comparator<View> {
        C1278j() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C1272e eVar = (C1272e) view.getLayoutParams();
            C1272e eVar2 = (C1272e) view2.getLayoutParams();
            boolean z = eVar.f4450a;
            return z != eVar2.f4450a ? z ? 1 : -1 : eVar.f4454e - eVar2.f4454e;
        }
    }

    /* renamed from: A */
    private boolean m5871A() {
        this.f4404I = -1;
        m5879h();
        this.f4407L.onRelease();
        this.f4408M.onRelease();
        return this.f4407L.isFinished() || this.f4408M.isFinished();
    }

    /* renamed from: B */
    private void m5872B(int i, boolean z, int i2, boolean z2) {
        C1271d m = mo5063m(i);
        int clientWidth = m != null ? (int) (((float) getClientWidth()) * Math.max(this.f4436r, Math.min(m.f4449e, this.f4437s))) : 0;
        if (z) {
            mo5040F(clientWidth, 0, i2);
            if (z2) {
                m5876e(i);
                return;
            }
            return;
        }
        if (z2) {
            m5876e(i);
        }
        m5874c(false);
        scrollTo(clientWidth, 0);
        m5885u(clientWidth);
    }

    /* renamed from: G */
    private void m5873G() {
        if (this.f4418W != 0) {
            ArrayList<View> arrayList = this.f4419a0;
            if (arrayList == null) {
                this.f4419a0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f4419a0.add(getChildAt(i));
            }
            Collections.sort(this.f4419a0, f4395g0);
        }
    }

    /* renamed from: c */
    private void m5874c(boolean z) {
        boolean z2 = this.f4421c0 == 2;
        if (!z2) {
            this.f4442x = false;
            for (int i = 0; i < this.f4423e.size(); i++) {
                C1271d dVar = this.f4423e.get(i);
                if (dVar.f4447c) {
                    dVar.f4447c = false;
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            if (z) {
                C0727l0.m2870T(this, this.f4420b0);
            } else {
                this.f4420b0.run();
            }
        } else {
            setScrollingCacheEnabled(false);
            throw null;
        }
    }

    /* renamed from: d */
    private void m5875d(int i, float f, int i2) {
        C1274g gVar = this.f4413R;
        if (gVar != null) {
            gVar.mo5095a(i, f, i2);
        }
        List<C1274g> list = this.f4412Q;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1274g gVar2 = this.f4412Q.get(i3);
                if (gVar2 != null) {
                    gVar2.mo5095a(i, f, i2);
                }
            }
        }
        C1274g gVar3 = this.f4414S;
        if (gVar3 != null) {
            gVar3.mo5095a(i, f, i2);
        }
    }

    /* renamed from: e */
    private void m5876e(int i) {
        C1274g gVar = this.f4413R;
        if (gVar != null) {
            gVar.mo5097c(i);
        }
        List<C1274g> list = this.f4412Q;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1274g gVar2 = this.f4412Q.get(i2);
                if (gVar2 != null) {
                    gVar2.mo5097c(i);
                }
            }
        }
        C1274g gVar3 = this.f4414S;
        if (gVar3 != null) {
            gVar3.mo5097c(i);
        }
    }

    /* renamed from: f */
    private void m5877f(int i) {
        C1274g gVar = this.f4413R;
        if (gVar != null) {
            gVar.mo5096b(i);
        }
        List<C1274g> list = this.f4412Q;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1274g gVar2 = this.f4412Q.get(i2);
                if (gVar2 != null) {
                    gVar2.mo5096b(i);
                }
            }
        }
        C1274g gVar3 = this.f4414S;
        if (gVar3 != null) {
            gVar3.mo5096b(i);
        }
    }

    /* renamed from: g */
    private void m5878g(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f4417V : 0, (Paint) null);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m5879h() {
        this.f4444z = false;
        this.f4396A = false;
        VelocityTracker velocityTracker = this.f4405J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4405J = null;
        }
    }

    /* renamed from: j */
    private Rect m5880j(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                return rect;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    /* renamed from: l */
    private C1271d m5881l() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f4432n) / ((float) clientWidth) : 0.0f;
        int i2 = -1;
        float f3 = 0.0f;
        int i3 = 0;
        C1271d dVar = null;
        boolean z = true;
        while (i3 < this.f4423e.size()) {
            C1271d dVar2 = this.f4423e.get(i3);
            if (z || dVar2.f4446b == (i = i2 + 1)) {
                f = dVar2.f4449e;
                float f4 = dVar2.f4448d + f + f2;
                if (!z && scrollX < f) {
                    return dVar;
                }
                if (scrollX < f4 || i3 == this.f4423e.size() - 1) {
                    return dVar2;
                }
                i2 = dVar2.f4446b;
                f3 = dVar2.f4448d;
                i3++;
                z = false;
                dVar = dVar2;
            } else {
                C1271d dVar3 = this.f4424f;
                dVar3.f4449e = f + f3 + f2;
                dVar3.f4446b = i;
                throw null;
            }
        }
        return dVar;
    }

    /* renamed from: n */
    private static boolean m5882n(View view) {
        return view.getClass().getAnnotation(C1270c.class) != null;
    }

    /* renamed from: o */
    private boolean m5883o(float f, float f2) {
        return (f < ((float) this.f4398C) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f4398C)) && f2 < 0.0f);
    }

    /* renamed from: r */
    private void m5884r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4404I) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4400E = motionEvent.getX(i);
            this.f4404I = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4405J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4441w != z) {
            this.f4441w = z;
        }
    }

    /* renamed from: u */
    private boolean m5885u(int i) {
        if (this.f4423e.size() != 0) {
            C1271d l = m5881l();
            int clientWidth = getClientWidth();
            int i2 = this.f4432n;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = l.f4446b;
            float f2 = ((((float) i) / f) - l.f4449e) / (l.f4448d + (((float) i2) / f));
            this.f4410O = false;
            mo5076q(i4, f2, (int) (((float) i3) * f2));
            if (this.f4410O) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f4409N) {
            return false;
        } else {
            this.f4410O = false;
            mo5076q(0, 0.0f, 0);
            if (this.f4410O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: v */
    private boolean m5886v(float f) {
        this.f4400E = f;
        getScrollX();
        getClientWidth();
        ArrayList<C1271d> arrayList = this.f4423e;
        int i = this.f4423e.get(0).f4446b;
        int i2 = arrayList.get(arrayList.size() - 1).f4446b;
        throw null;
    }

    /* renamed from: y */
    private void m5887y(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f4423e.isEmpty()) {
            C1271d m = mo5063m(this.f4426h);
            int min = (int) ((m != null ? Math.min(m.f4449e, this.f4437s) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m5874c(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: z */
    private void m5888z(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: C */
    public void mo5037C(int i, boolean z) {
        this.f4442x = false;
        mo5038D(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo5038D(int i, boolean z, boolean z2) {
        mo5039E(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo5039E(int i, boolean z, boolean z2, int i2) {
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo5040F(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = i - getScrollX();
        int scrollY = i2 - getScrollY();
        if (scrollX == 0 && scrollY == 0) {
            m5874c(false);
            mo5089w();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        this.f4431m = false;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5041a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = r1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = r2
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f4425g
            android.graphics.Rect r1 = r6.m5880j(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4425g
            android.graphics.Rect r2 = r6.m5880j(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo5078s()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00c8
        L_0x009a:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f4425g
            android.graphics.Rect r1 = r6.m5880j(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4425g
            android.graphics.Rect r2 = r6.m5880j(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 > r2) goto L_0x0094
            boolean r0 = r6.mo5087t()
            goto L_0x0098
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.mo5087t()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.mo5078s()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.C1267a.mo5041a(int):boolean");
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1271d k;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (k = mo5062k(childAt)) != null && k.f4446b == this.f4426h) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C1271d k;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = mo5062k(childAt)) != null && k.f4446b == this.f4426h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1272e eVar = (C1272e) layoutParams;
        boolean n = eVar.f4450a | m5882n(view);
        eVar.f4450a = n;
        if (!this.f4440v) {
            super.addView(view, i, layoutParams);
        } else if (!n) {
            eVar.f4453d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo5045b(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo5045b(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1272e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f4431m = true;
        throw null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo5061i(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1271d k;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = mo5062k(childAt)) != null && k.f4446b == this.f4426h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        if (getOverScrollMode() != 0) {
            this.f4407L.finish();
            this.f4408M.finish();
        } else {
            if (!this.f4407L.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f4436r * ((float) width));
                this.f4407L.setSize(height, width);
                z = false | this.f4407L.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4408M.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f4437s + 1.0f)) * ((float) width2));
                this.f4408M.setSize(height2, width2);
                z |= this.f4408M.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            C0727l0.m2869S(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4433o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1272e();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1272e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1279b getAdapter() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f4418W == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C1272e) this.f4419a0.get(i2).getLayoutParams()).f4455f;
    }

    public int getCurrentItem() {
        return this.f4426h;
    }

    public int getOffscreenPageLimit() {
        return this.f4443y;
    }

    public int getPageMargin() {
        return this.f4432n;
    }

    /* renamed from: i */
    public boolean mo5061i(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo5041a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo5041a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo5087t();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo5078s();
            } else {
                i = 17;
            }
            return mo5041a(i);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1271d mo5062k(View view) {
        if (this.f4423e.size() <= 0) {
            return null;
        }
        Object obj = this.f4423e.get(0).f4445a;
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C1271d mo5063m(int i) {
        for (int i2 = 0; i2 < this.f4423e.size(); i2++) {
            C1271d dVar = this.f4423e.get(i2);
            if (dVar.f4446b == i) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4409N = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4420b0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4432n > 0 && this.f4433o != null) {
            this.f4423e.size();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5871A();
            return false;
        }
        if (action != 0) {
            if (this.f4444z) {
                return true;
            }
            if (this.f4396A) {
                return false;
            }
        }
        if (action != 0) {
            if (action == 2) {
                int i = this.f4404I;
                if (i != -1 && (findPointerIndex = motionEvent2.findPointerIndex(i)) >= 0 && findPointerIndex < motionEvent.getPointerCount()) {
                    float x = motionEvent2.getX(findPointerIndex);
                    float f = x - this.f4400E;
                    float abs = Math.abs(f);
                    float y = motionEvent2.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.f4403H);
                    int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i2 != 0 && !m5883o(this.f4400E, f)) {
                        if (mo5045b(this, false, (int) f, (int) x, (int) y)) {
                            this.f4400E = x;
                            this.f4401F = y;
                            this.f4396A = true;
                            return false;
                        }
                    }
                    int i3 = this.f4399D;
                    if (abs > ((float) i3) && abs * 0.5f > abs2) {
                        this.f4444z = true;
                        m5888z(true);
                        setScrollState(1);
                        float f2 = this.f4402G;
                        float f3 = (float) this.f4399D;
                        this.f4400E = i2 > 0 ? f2 + f3 : f2 - f3;
                        this.f4401F = y;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i3)) {
                        this.f4396A = true;
                    }
                    if (this.f4444z && m5886v(x)) {
                        C0727l0.m2869S(this);
                    }
                }
            } else if (action == 6) {
                m5884r(motionEvent);
            }
            if (this.f4405J == null) {
                this.f4405J = VelocityTracker.obtain();
            }
            this.f4405J.addMovement(motionEvent2);
            return this.f4444z;
        }
        float x2 = motionEvent.getX();
        this.f4402G = x2;
        this.f4400E = x2;
        float y2 = motionEvent.getY();
        this.f4403H = y2;
        this.f4401F = y2;
        this.f4404I = motionEvent2.getPointerId(0);
        this.f4396A = false;
        this.f4431m = true;
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.a$e r12 = (androidx.viewpager.widget.C1267a.C1272e) r12
            boolean r14 = r12.f4450a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f4451b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.a$e r9 = (androidx.viewpager.widget.C1267a.C1272e) r9
            boolean r10 = r9.f4450a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.a$d r10 = r0.mo5062k(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f4449e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f4453d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f4453d = r14
            float r9 = r9.f4452c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f4434p = r5
            int r3 = r3 - r7
            r0.f4435q = r3
            r0.f4411P = r11
            boolean r1 = r0.f4409N
            if (r1 == 0) goto L_0x0118
            int r1 = r0.f4426h
            r2 = 0
            r0.m5872B(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.f4409N = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.C1267a.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1272e eVar;
        C1272e eVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f4398C = Math.min(measuredWidth / 10, this.f4397B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (eVar2 = (C1272e) childAt.getLayoutParams()) == null || !eVar2.f4450a)) {
                int i6 = eVar2.f4451b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (!(i7 == 3 || i7 == 5)) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = eVar2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = eVar2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f4438t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f4439u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4440v = true;
        mo5089w();
        this.f4440v = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((eVar = (C1272e) childAt2.getLayoutParams()) == null || !eVar.f4450a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * eVar.f4452c), 1073741824), this.f4439u);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1271d k;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (k = mo5062k(childAt)) != null && k.f4446b == this.f4426h && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1276i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1276i iVar = (C1276i) parcelable;
        super.onRestoreInstanceState(iVar.mo10153a());
        this.f4427i = iVar.f4456f;
        this.f4428j = iVar.f4457g > 0;
        this.f4429k = iVar.f4458h;
        this.f4430l = iVar.f4459i;
    }

    public Parcelable onSaveInstanceState() {
        C1276i iVar = new C1276i(super.onSaveInstanceState());
        iVar.f4456f = this.f4426h;
        iVar.f4457g = mo5075p() ? 1 : 0;
        return iVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f4432n;
            m5887y(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4406K) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5075p() {
        return getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5076q(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f4411P
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.a$e r9 = (androidx.viewpager.widget.C1267a.C1272e) r9
            boolean r10 = r9.f4450a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f4451b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m5875d(r13, r14, r15)
            androidx.viewpager.widget.a$h r13 = r12.f4416U
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.a$e r0 = (androidx.viewpager.widget.C1267a.C1272e) r0
            boolean r0 = r0.f4450a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.a$h r3 = r12.f4416U
            r3.mo5098a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f4410O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.C1267a.mo5076q(int, float, int):void");
    }

    public void removeView(View view) {
        if (this.f4440v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5078s() {
        int i = this.f4426h;
        if (i <= 0) {
            return false;
        }
        mo5037C(i - 1, true);
        return true;
    }

    public void setAdapter(C1279b bVar) {
        this.f4422d = 0;
        List<C1273f> list = this.f4415T;
        if (list != null && !list.isEmpty()) {
            int size = this.f4415T.size();
            for (int i = 0; i < size; i++) {
                this.f4415T.get(i).mo5094a((C2551a) this, (C1279b) null, bVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f4442x = false;
        mo5038D(i, !this.f4409N, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 2) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 2);
            i = 2;
        }
        if (i != this.f4443y) {
            this.f4443y = i;
            mo5089w();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1274g gVar) {
        this.f4413R = gVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f4432n;
        this.f4432n = i;
        int width = getWidth();
        m5887y(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0510a.m2124e(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4433o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f4421c0 != i) {
            this.f4421c0 = i;
            if (this.f4416U != null) {
                m5878g(i != 0);
            }
            m5877f(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5087t() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4433o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5089w() {
        mo5090x(this.f4426h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5090x(int i) {
        int i2 = this.f4426h;
        if (i2 != i) {
            mo5063m(i2);
            this.f4426h = i;
        }
        m5873G();
    }
}
