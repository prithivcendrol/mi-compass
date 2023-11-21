package p044g4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0385r1;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import miuix.smooth.SmoothContainerDrawable2;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p038f4.C1579b;
import p038f4.C1580c;
import p038f4.C1582e;

/* renamed from: g4.b */
public class C1613b {

    /* renamed from: W */
    private static final int[] f6395W = {16842912};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f6396A;

    /* renamed from: B */
    private SpringAnimation f6397B;

    /* renamed from: C */
    private SpringAnimation f6398C;

    /* renamed from: D */
    private SpringAnimation f6399D;

    /* renamed from: E */
    private SpringAnimation f6400E;

    /* renamed from: F */
    private SpringAnimation f6401F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public float f6402G = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public float f6403H = 1.0f;

    /* renamed from: I */
    private boolean f6404I = false;

    /* renamed from: J */
    private int f6405J = -1;

    /* renamed from: K */
    private int f6406K = -1;

    /* renamed from: L */
    private boolean f6407L = false;

    /* renamed from: M */
    private float f6408M = -1.0f;

    /* renamed from: N */
    private FloatProperty<CompoundButton> f6409N = new C1615b("SliderScale");

    /* renamed from: O */
    private DynamicAnimation.OnAnimationUpdateListener f6410O = new C1612a(this);

    /* renamed from: P */
    private FloatProperty<CompoundButton> f6411P = new C1616c("MaskCheckedSlideBarAlpha");

    /* renamed from: Q */
    private int f6412Q;

    /* renamed from: R */
    private int f6413R;

    /* renamed from: S */
    private int f6414S;

    /* renamed from: T */
    private float f6415T = 1.0f;

    /* renamed from: U */
    private float[] f6416U = {0.0f, 0.0f};

    /* renamed from: V */
    private int f6417V;

    /* renamed from: a */
    private Drawable f6418a;

    /* renamed from: b */
    private int f6419b;

    /* renamed from: c */
    private Drawable f6420c;

    /* renamed from: d */
    private int f6421d;

    /* renamed from: e */
    private int f6422e;

    /* renamed from: f */
    private int f6423f;

    /* renamed from: g */
    private int f6424g;

    /* renamed from: h */
    private int f6425h;

    /* renamed from: i */
    private int f6426i;

    /* renamed from: j */
    private int f6427j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f6428k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6429l;

    /* renamed from: m */
    private int f6430m;

    /* renamed from: n */
    private int f6431n;

    /* renamed from: o */
    private boolean f6432o;

    /* renamed from: p */
    private boolean f6433p;

    /* renamed from: q */
    private int f6434q;

    /* renamed from: r */
    private CompoundButton.OnCheckedChangeListener f6435r;

    /* renamed from: s */
    private Rect f6436s = new Rect();

    /* renamed from: t */
    private StateListDrawable f6437t;

    /* renamed from: u */
    private boolean f6438u = false;

    /* renamed from: v */
    private FloatProperty<CompoundButton> f6439v = new C1614a("SliderOffset");

    /* renamed from: w */
    private Drawable f6440w;

    /* renamed from: x */
    private Drawable f6441x;

    /* renamed from: y */
    private Drawable f6442y;

    /* renamed from: z */
    private CompoundButton f6443z;

    /* renamed from: g4.b$a */
    class C1614a extends FloatProperty<CompoundButton> {
        C1614a(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(CompoundButton compoundButton) {
            return (float) C1613b.this.mo5781r();
        }

        /* renamed from: b */
        public void setValue(CompoundButton compoundButton, float f) {
            C1613b.this.mo5776R((int) f);
        }
    }

    /* renamed from: g4.b$b */
    class C1615b extends FloatProperty<CompoundButton> {
        C1615b(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(CompoundButton compoundButton) {
            return C1613b.this.f6402G;
        }

        /* renamed from: b */
        public void setValue(CompoundButton compoundButton, float f) {
            float unused = C1613b.this.f6402G = f;
        }
    }

    /* renamed from: g4.b$c */
    class C1616c extends FloatProperty<CompoundButton> {
        C1616c(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(CompoundButton compoundButton) {
            return C1613b.this.f6403H;
        }

        /* renamed from: b */
        public void setValue(CompoundButton compoundButton, float f) {
            float unused = C1613b.this.f6403H = f;
        }
    }

    /* renamed from: g4.b$d */
    class C1617d implements DynamicAnimation.OnAnimationEndListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f6447a;

        C1617d(Runnable runnable) {
            this.f6447a = runnable;
        }

        public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            this.f6447a.run();
        }
    }

    /* renamed from: g4.b$e */
    class C1618e implements Runnable {
        C1618e() {
        }

        public void run() {
            C1613b bVar = C1613b.this;
            boolean unused = bVar.f6396A = bVar.f6429l >= C1613b.this.f6428k;
        }
    }

    public C1613b(CompoundButton compoundButton) {
        this.f6443z = compoundButton;
        this.f6396A = compoundButton.isChecked();
        if (!this.f6443z.isChecked()) {
            this.f6403H = 0.0f;
        }
    }

    /* renamed from: B */
    private void m6856B(Canvas canvas) {
        int i = (int) ((1.0f - this.f6403H) * 255.0f);
        if (i > 0) {
            this.f6441x.setAlpha(i);
            this.f6441x.draw(canvas);
        }
        int i2 = (int) (this.f6403H * 255.0f);
        if (i2 > 0) {
            this.f6440w.setAlpha(i2);
            this.f6440w.draw(canvas);
        }
    }

    /* renamed from: D */
    private void m6857D() {
        if (this.f6398C.isRunning()) {
            this.f6398C.cancel();
        }
        if (!this.f6397B.isRunning()) {
            this.f6397B.start();
        }
    }

    /* renamed from: F */
    private void m6858F() {
        if (this.f6397B.isRunning()) {
            this.f6397B.cancel();
        }
        if (!this.f6398C.isRunning()) {
            this.f6398C.start();
        }
    }

    /* renamed from: G */
    private void m6859G() {
        if (this.f6404I) {
            this.f6429l = this.f6405J;
            this.f6419b = this.f6406K;
            this.f6403H = this.f6408M;
            this.f6396A = this.f6407L;
            this.f6404I = false;
            this.f6405J = -1;
            this.f6406K = -1;
            this.f6408M = -1.0f;
        }
    }

    /* renamed from: H */
    private void m6860H() {
        this.f6405J = this.f6429l;
        this.f6406K = this.f6419b;
        this.f6408M = this.f6403H;
        this.f6407L = this.f6396A;
        this.f6404I = true;
    }

    /* renamed from: I */
    private void m6861I(Canvas canvas) {
        canvas.restore();
    }

    /* renamed from: J */
    private void m6862J(Canvas canvas, int i, int i2) {
        canvas.save();
        float f = this.f6402G;
        canvas.scale(f, f, (float) i, (float) i2);
    }

    /* renamed from: M */
    private void m6863M(boolean z) {
        if (this.f6396A) {
            if (this.f6400E.isRunning()) {
                this.f6400E.cancel();
            }
            if (!this.f6399D.isRunning() && !z) {
                this.f6403H = 1.0f;
            }
        }
        if (!this.f6396A) {
            if (this.f6399D.isRunning()) {
                this.f6399D.cancel();
            }
            if (!this.f6400E.isRunning() && z) {
                this.f6403H = 0.0f;
            }
        }
    }

    /* renamed from: S */
    private void m6864S(boolean z) {
        SpringAnimation springAnimation = this.f6401F;
        if (springAnimation == null || !springAnimation.isRunning()) {
            boolean z2 = this.f6396A;
            this.f6429l = z2 ? this.f6428k : this.f6427j;
            this.f6419b = z2 ? 255 : 0;
        }
        m6859G();
        m6863M(z);
    }

    /* renamed from: i */
    private float[] m6873i(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float width = ((float) iArr[0]) + (((float) view.getWidth()) * 0.5f);
        float height = ((float) iArr[1]) + (((float) view.getHeight()) * 0.5f);
        float f = 0.0f;
        float width2 = view.getWidth() == 0 ? 0.0f : (rawX - width) / ((float) view.getWidth());
        if (view.getHeight() != 0) {
            f = (rawY - height) / ((float) view.getHeight());
        }
        float max = Math.max(-1.0f, Math.min(1.0f, width2));
        float max2 = Math.max(-1.0f, Math.min(1.0f, f));
        int i = this.f6417V;
        return new float[]{max * ((float) i), max2 * ((float) i)};
    }

    /* renamed from: j */
    private void m6874j(boolean z) {
        if (z != this.f6443z.isChecked()) {
            this.f6443z.setChecked(z);
            m6864S(z);
            mo5786z();
        }
        m6875k(z, z ? this.f6428k : this.f6427j, new C1618e());
    }

    /* renamed from: k */
    private void m6875k(boolean z, int i, Runnable runnable) {
        SpringAnimation springAnimation;
        SpringAnimation springAnimation2 = this.f6401F;
        if (springAnimation2 != null && springAnimation2.isRunning()) {
            this.f6401F.cancel();
        }
        if (z == this.f6443z.isChecked()) {
            SpringAnimation springAnimation3 = new SpringAnimation(this.f6443z, this.f6439v, (float) i);
            this.f6401F = springAnimation3;
            springAnimation3.getSpring().setStiffness(986.96f);
            this.f6401F.getSpring().setDampingRatio(0.7f);
            this.f6401F.addUpdateListener(this.f6410O);
            this.f6401F.addEndListener(new C1617d(runnable));
            this.f6401F.start();
            if (z) {
                if (!this.f6399D.isRunning()) {
                    this.f6399D.start();
                }
                if (this.f6400E.isRunning()) {
                    springAnimation = this.f6400E;
                } else {
                    return;
                }
            } else {
                if (!this.f6400E.isRunning()) {
                    this.f6400E.start();
                }
                if (this.f6399D.isRunning()) {
                    springAnimation = this.f6399D;
                } else {
                    return;
                }
            }
            springAnimation.cancel();
        }
    }

    /* renamed from: l */
    private void m6876l() {
        m6874j(!this.f6443z.isChecked());
        HapticCompat.m10233e(this.f6443z, C2403h.f9361F, C2403h.f9370i);
    }

    /* renamed from: m */
    private Drawable m6877m(Drawable drawable) {
        SmoothContainerDrawable2 smoothContainerDrawable2 = new SmoothContainerDrawable2();
        smoothContainerDrawable2.mo9177h(this.f6443z.getLayerType());
        smoothContainerDrawable2.mo9169g((float) this.f6412Q);
        smoothContainerDrawable2.mo9167e(drawable);
        int i = this.f6414S;
        int i2 = this.f6413R;
        smoothContainerDrawable2.setBounds(new Rect(i, i2, this.f6422e - i, this.f6423f - i2));
        return smoothContainerDrawable2;
    }

    /* renamed from: n */
    private StateListDrawable m6878n() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setBounds(0, 0, this.f6422e, this.f6423f);
        stateListDrawable.setCallback(this.f6443z);
        return stateListDrawable;
    }

    /* renamed from: u */
    private void m6879u(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        this.f6440w = drawable;
        this.f6441x = drawable2;
        this.f6442y = drawable3;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m6880x(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f6443z.invalidate();
    }

    /* renamed from: y */
    private void m6881y(int i) {
        if (C0385r1.m1722b(this.f6443z)) {
            i = -i;
        }
        int i2 = this.f6429l + i;
        this.f6429l = i2;
        int i3 = this.f6427j;
        if (i2 < i3) {
            this.f6429l = i3;
        } else {
            int i4 = this.f6428k;
            if (i2 > i4) {
                this.f6429l = i4;
            }
        }
        int i5 = this.f6429l;
        boolean z = i5 == i3 || i5 == this.f6428k;
        if (z && !this.f6438u) {
            HapticCompat.m10233e(this.f6443z, C2403h.f9361F, C2403h.f9370i);
        }
        this.f6438u = z;
        mo5776R(this.f6429l);
    }

    /* renamed from: A */
    public void mo5767A(Canvas canvas) {
        Drawable drawable;
        mo5775Q();
        m6856B(canvas);
        boolean b = C0385r1.m1722b(this.f6443z);
        int i = this.f6426i;
        if (b) {
            i = -i;
        }
        int i2 = b ? (this.f6422e - this.f6429l) - this.f6424g : this.f6429l;
        float[] fArr = this.f6416U;
        float f = fArr[0];
        int i3 = i2 + i + ((int) f);
        int i4 = (b ? this.f6422e - this.f6429l : this.f6424g + this.f6429l) + i + ((int) f);
        int i5 = this.f6423f;
        int i6 = this.f6425h;
        int i7 = ((i5 - i6) / 2) + ((int) fArr[1]);
        int i8 = i6 + i7;
        m6862J(canvas, (i4 + i3) / 2, (i8 + i7) / 2);
        if (this.f6396A) {
            this.f6418a.setBounds(i3, i7, i4, i8);
            drawable = this.f6418a;
        } else {
            this.f6420c.setBounds(i3, i7, i4, i8);
            drawable = this.f6420c;
        }
        drawable.draw(canvas);
        m6861I(canvas);
    }

    /* renamed from: C */
    public void mo5768C(MotionEvent motionEvent) {
        SpringAnimation springAnimation;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 9) {
                if (this.f6398C.isRunning()) {
                    this.f6398C.cancel();
                }
                springAnimation = this.f6397B;
            } else if (actionMasked == 10) {
                float[] fArr = this.f6416U;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                if (this.f6397B.isRunning()) {
                    this.f6397B.cancel();
                }
                springAnimation = this.f6398C;
            } else {
                return;
            }
            springAnimation.start();
            return;
        }
        this.f6416U = m6873i(this.f6443z, motionEvent);
        this.f6443z.invalidate();
    }

    /* renamed from: E */
    public void mo5769E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f6436s;
        boolean b = C0385r1.m1722b(this.f6443z);
        rect.set(b ? (this.f6422e - this.f6429l) - this.f6424g : this.f6429l, 0, b ? this.f6422e - this.f6429l : this.f6429l + this.f6424g, this.f6423f);
        boolean z = true;
        if (action != 0) {
            if (action == 1) {
                this.f6443z.playSoundEffect(0);
                m6858F();
                if (!this.f6432o || !this.f6433p) {
                    m6876l();
                } else {
                    if (this.f6429l < this.f6428k / 2) {
                        z = false;
                    }
                    this.f6396A = z;
                    m6874j(z);
                    if (rect.contains(x, y)) {
                        HapticCompat.m10233e(this.f6443z, C2403h.f9361F, C2403h.f9370i);
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    m6858F();
                    if (this.f6432o) {
                        if (this.f6429l < this.f6428k / 2) {
                            z = false;
                        }
                        this.f6396A = z;
                        m6874j(z);
                    }
                } else {
                    return;
                }
            } else if (this.f6432o) {
                m6881y(x - this.f6430m);
                this.f6430m = x;
                if (Math.abs(x - this.f6431n) >= this.f6434q) {
                    this.f6433p = true;
                    this.f6443z.getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            } else {
                return;
            }
            this.f6432o = false;
            this.f6433p = false;
            this.f6443z.setPressed(false);
            return;
        }
        if (rect.contains(x, y)) {
            this.f6432o = true;
            this.f6443z.setPressed(true);
            m6857D();
            int i = this.f6429l;
            if (i > this.f6427j && i < this.f6428k) {
                z = false;
            }
            this.f6438u = z;
        } else {
            this.f6432o = false;
        }
        this.f6430m = x;
        this.f6431n = x;
        this.f6433p = false;
    }

    /* renamed from: K */
    public void mo5770K(float f) {
        this.f6415T = f;
    }

    /* renamed from: L */
    public void mo5771L(boolean z) {
        m6860H();
        this.f6396A = z;
        this.f6429l = z ? this.f6428k : this.f6427j;
        this.f6419b = z ? 255 : 0;
        this.f6403H = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = this.f6401F;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.f6401F.cancel();
        }
        if (this.f6400E.isRunning()) {
            this.f6400E.cancel();
        }
        if (this.f6399D.isRunning()) {
            this.f6399D.cancel();
        }
        this.f6443z.invalidate();
    }

    /* renamed from: N */
    public void mo5772N(int i) {
        Drawable drawable = this.f6440w;
        if (drawable instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable).mo9177h(i);
        }
        Drawable drawable2 = this.f6441x;
        if (drawable2 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable2).mo9177h(i);
        }
        Drawable drawable3 = this.f6442y;
        if (drawable3 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable3).mo9177h(i);
        }
    }

    /* renamed from: O */
    public void mo5773O(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6435r = onCheckedChangeListener;
    }

    /* renamed from: P */
    public void mo5774P() {
        ViewParent parent = this.f6443z.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    /* renamed from: Q */
    public void mo5775Q() {
        if (mo5782s() != null) {
            this.f6418a.setState(this.f6443z.getDrawableState());
            this.f6420c.setState(this.f6443z.getDrawableState());
            this.f6437t.setState(this.f6443z.getDrawableState());
            this.f6440w.setState(this.f6443z.getDrawableState());
            this.f6441x.setState(this.f6443z.getDrawableState());
        }
    }

    /* renamed from: R */
    public void mo5776R(int i) {
        this.f6429l = i;
        this.f6443z.invalidate();
    }

    /* renamed from: T */
    public boolean mo5777T(Drawable drawable) {
        return drawable == this.f6437t;
    }

    /* renamed from: o */
    public float mo5778o() {
        return this.f6415T;
    }

    /* renamed from: p */
    public int mo5779p() {
        return this.f6423f;
    }

    /* renamed from: q */
    public int mo5780q() {
        return this.f6422e;
    }

    /* renamed from: r */
    public int mo5781r() {
        return this.f6429l;
    }

    /* renamed from: s */
    public Drawable mo5782s() {
        return this.f6418a;
    }

    /* renamed from: t */
    public void mo5783t() {
        SpringAnimation springAnimation = new SpringAnimation(this.f6443z, this.f6409N, 1.127f);
        this.f6397B = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.f6397B.getSpring().setDampingRatio(0.6f);
        this.f6397B.setMinimumVisibleChange(0.002f);
        this.f6397B.addUpdateListener(this.f6410O);
        SpringAnimation springAnimation2 = new SpringAnimation(this.f6443z, this.f6409N, 1.0f);
        this.f6398C = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f6398C.getSpring().setDampingRatio(0.6f);
        this.f6398C.setMinimumVisibleChange(0.002f);
        this.f6398C.addUpdateListener(this.f6410O);
        SpringAnimation springAnimation3 = new SpringAnimation(this.f6443z, this.f6411P, 1.0f);
        this.f6399D = springAnimation3;
        springAnimation3.getSpring().setStiffness(438.64f);
        this.f6399D.getSpring().setDampingRatio(0.99f);
        this.f6399D.setMinimumVisibleChange(0.00390625f);
        this.f6399D.addUpdateListener(this.f6410O);
        SpringAnimation springAnimation4 = new SpringAnimation(this.f6443z, this.f6411P, 0.0f);
        this.f6400E = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.f6400E.getSpring().setDampingRatio(0.99f);
        this.f6400E.setMinimumVisibleChange(0.00390625f);
        this.f6400E.addUpdateListener(this.f6410O);
    }

    /* renamed from: v */
    public void mo5784v(Context context, TypedArray typedArray) {
        this.f6412Q = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6285a);
        this.f6413R = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6290f);
        this.f6414S = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6289e);
        this.f6443z.setDrawingCacheEnabled(false);
        this.f6434q = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f6418a = typedArray.getDrawable(C1582e.f6329d0);
        this.f6420c = typedArray.getDrawable(C1582e.f6327c0);
        this.f6443z.setBackground(typedArray.getDrawable(C1582e.f6321Z));
        Color.parseColor("#FF3482FF");
        this.f6421d = typedArray.getColor(C1582e.f6331e0, context.getColor(C1579b.f6284a));
        int dimensionPixelSize = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6287c);
        int dimensionPixelSize2 = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6286b);
        int dimensionPixelSize3 = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6288d);
        this.f6422e = (dimensionPixelSize2 * 2) + this.f6443z.getResources().getDimensionPixelSize(C1580c.f6294j);
        this.f6423f = (dimensionPixelSize * 2) + dimensionPixelSize3;
        int dimensionPixelSize4 = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6293i);
        int dimensionPixelSize5 = this.f6443z.getResources().getDimensionPixelSize(C1580c.f6291g);
        this.f6426i = dimensionPixelSize5;
        this.f6424g = dimensionPixelSize4;
        this.f6425h = dimensionPixelSize4;
        this.f6427j = 0;
        this.f6428k = (this.f6422e - dimensionPixelSize4) - (dimensionPixelSize5 * 2);
        this.f6429l = 0;
        TypedValue typedValue = new TypedValue();
        int i = C1582e.f6323a0;
        typedArray.getValue(i, typedValue);
        TypedValue typedValue2 = new TypedValue();
        int i2 = C1582e.f6325b0;
        typedArray.getValue(i2, typedValue2);
        Drawable drawable = typedArray.getDrawable(i);
        Drawable drawable2 = typedArray.getDrawable(i2);
        if (typedValue.type == typedValue2.type && typedValue.data == typedValue2.data && typedValue.resourceId == typedValue2.resourceId) {
            drawable2 = drawable;
        }
        if (!(drawable2 == null || drawable == null)) {
            drawable2.setTint(this.f6421d);
            m6879u(m6877m(drawable2), m6877m(drawable), m6877m(drawable2));
            this.f6437t = m6878n();
        }
        mo5775Q();
        if (this.f6443z.isChecked()) {
            mo5776R(this.f6428k);
        }
        this.f6417V = this.f6443z.getResources().getDimensionPixelOffset(C1580c.f6292h);
    }

    /* renamed from: w */
    public void mo5785w() {
        StateListDrawable stateListDrawable = this.f6437t;
        if (stateListDrawable != null) {
            stateListDrawable.jumpToCurrentState();
        }
    }

    /* renamed from: z */
    public void mo5786z() {
        if (this.f6435r != null) {
            this.f6435r.onCheckedChanged(this.f6443z, this.f6443z.isChecked());
        }
    }
}
