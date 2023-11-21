package miuix.internal.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;

/* renamed from: miuix.internal.view.d */
public class C2294d {

    /* renamed from: a */
    private int f8723a;

    /* renamed from: b */
    private int f8724b;

    /* renamed from: c */
    private float f8725c = 1.0f;

    /* renamed from: d */
    private C2292b f8726d;

    /* renamed from: e */
    private C2292b f8727e;

    /* renamed from: f */
    private C2292b f8728f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public CheckBoxAnimatedStateListDrawable f8729g;

    /* renamed from: h */
    private SpringAnimation f8730h;

    /* renamed from: i */
    private SpringAnimation f8731i;

    /* renamed from: j */
    private SpringAnimation f8732j;

    /* renamed from: k */
    private SpringAnimation f8733k;

    /* renamed from: l */
    private SpringAnimation f8734l;

    /* renamed from: m */
    private SpringAnimation f8735m;

    /* renamed from: n */
    private SpringAnimation f8736n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public SpringAnimation f8737o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public SpringAnimation f8738p;

    /* renamed from: q */
    private SpringAnimation f8739q;

    /* renamed from: r */
    private DynamicAnimation.OnAnimationUpdateListener f8740r = new C2293c(this);

    /* renamed from: s */
    private DynamicAnimation.OnAnimationUpdateListener f8741s = new C2295a();

    /* renamed from: t */
    private FloatProperty<CheckBoxAnimatedStateListDrawable> f8742t = new C2296b("Scale");

    /* renamed from: u */
    private FloatProperty<CheckBoxAnimatedStateListDrawable> f8743u = new C2297c("ContentAlpha");

    /* renamed from: v */
    private FloatProperty<C2294d> f8744v = new C2298d("Scale");

    /* renamed from: w */
    private FloatProperty<C2292b> f8745w = new C2299e("Alpha");

    /* renamed from: x */
    private boolean f8746x;

    /* renamed from: miuix.internal.view.d$a */
    class C2295a implements DynamicAnimation.OnAnimationUpdateListener {
        C2295a() {
        }

        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            C2294d.this.f8729g.mo8662l(C2294d.this.mo8685f());
            C2294d.this.f8729g.invalidateSelf();
        }
    }

    /* renamed from: miuix.internal.view.d$b */
    class C2296b extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        C2296b(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return C2294d.this.f8729g.mo8656d();
        }

        /* renamed from: b */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f) {
            C2294d.this.f8729g.mo8662l(f);
        }
    }

    /* renamed from: miuix.internal.view.d$c */
    class C2297c extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        C2297c(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return checkBoxAnimatedStateListDrawable.mo8655c();
        }

        /* renamed from: b */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            checkBoxAnimatedStateListDrawable.mo8661k(f);
        }
    }

    /* renamed from: miuix.internal.view.d$d */
    class C2298d extends FloatProperty<C2294d> {
        C2298d(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(C2294d dVar) {
            return C2294d.this.mo8685f();
        }

        /* renamed from: b */
        public void setValue(C2294d dVar, float f) {
            C2294d.this.mo8688k(f);
        }
    }

    /* renamed from: miuix.internal.view.d$e */
    class C2299e extends FloatProperty<C2292b> {
        C2299e(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(C2292b bVar) {
            return (float) (bVar.getAlpha() / 255);
        }

        /* renamed from: b */
        public void setValue(C2292b bVar, float f) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            bVar.setAlpha((int) (f * 255.0f));
        }
    }

    /* renamed from: miuix.internal.view.d$f */
    class C2300f implements DynamicAnimation.OnAnimationUpdateListener {
        C2300f() {
        }

        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            C2294d.this.f8729g.invalidateSelf();
        }
    }

    /* renamed from: miuix.internal.view.d$g */
    class C2301g implements Runnable {
        C2301g() {
        }

        public void run() {
            if (!C2294d.this.f8737o.isRunning()) {
                C2294d.this.f8737o.start();
            }
            if (!C2294d.this.f8738p.isRunning()) {
                C2294d.this.f8738p.start();
            }
        }
    }

    public C2294d(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4;
        int i10 = i5;
        this.f8723a = i9;
        this.f8724b = i10;
        this.f8746x = z;
        C2292b bVar = new C2292b(i, i4, i5, i6, i7, i8);
        this.f8726d = bVar;
        bVar.setAlpha(this.f8723a);
        int i11 = i2;
        C2292b bVar2 = new C2292b(i2, i9, i10);
        this.f8727e = bVar2;
        bVar2.setAlpha(0);
        C2292b bVar3 = new C2292b(i3, i9, i10);
        this.f8728f = bVar3;
        bVar3.setAlpha(255);
        this.f8729g = checkBoxAnimatedStateListDrawable;
        m9695g();
    }

    /* renamed from: g */
    private void m9695g() {
        float f;
        SpringAnimation springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.f8744v, 0.85f);
        this.f8730h = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f8730h.getSpring().setDampingRatio(0.99f);
        this.f8730h.getSpring().setFinalPosition(0.85f);
        this.f8730h.setMinimumVisibleChange(0.002f);
        this.f8730h.addUpdateListener(this.f8741s);
        SpringAnimation springAnimation3 = new SpringAnimation(this, this.f8744v, 1.0f);
        this.f8733k = springAnimation3;
        springAnimation3.getSpring().setStiffness(986.96f);
        this.f8733k.getSpring().setDampingRatio(0.6f);
        this.f8733k.setMinimumVisibleChange(0.002f);
        this.f8733k.addUpdateListener(new C2300f());
        SpringAnimation springAnimation4 = new SpringAnimation(this.f8729g, this.f8743u, 0.5f);
        this.f8736n = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.f8736n.getSpring().setDampingRatio(0.99f);
        this.f8736n.setMinimumVisibleChange(0.00390625f);
        this.f8736n.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation5 = new SpringAnimation(this.f8727e, this.f8745w, 0.1f);
        this.f8731i = springAnimation5;
        springAnimation5.getSpring().setStiffness(986.96f);
        this.f8731i.getSpring().setDampingRatio(0.99f);
        this.f8731i.setMinimumVisibleChange(0.00390625f);
        this.f8731i.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation6 = new SpringAnimation(this.f8727e, this.f8745w, 0.0f);
        this.f8732j = springAnimation6;
        springAnimation6.getSpring().setStiffness(986.96f);
        this.f8732j.getSpring().setDampingRatio(0.99f);
        this.f8732j.setMinimumVisibleChange(0.00390625f);
        this.f8732j.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation7 = new SpringAnimation(this.f8728f, this.f8745w, 1.0f);
        this.f8734l = springAnimation7;
        springAnimation7.getSpring().setStiffness(986.96f);
        this.f8734l.getSpring().setDampingRatio(0.7f);
        this.f8734l.setMinimumVisibleChange(0.00390625f);
        this.f8734l.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation8 = new SpringAnimation(this.f8729g, this.f8743u, 1.0f);
        this.f8737o = springAnimation8;
        springAnimation8.getSpring().setStiffness(438.64f);
        this.f8737o.getSpring().setDampingRatio(0.6f);
        this.f8737o.setMinimumVisibleChange(0.00390625f);
        this.f8737o.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation9 = new SpringAnimation(this.f8728f, this.f8745w, 0.0f);
        this.f8735m = springAnimation9;
        springAnimation9.getSpring().setStiffness(986.96f);
        this.f8735m.getSpring().setDampingRatio(0.99f);
        this.f8735m.setMinimumVisibleChange(0.00390625f);
        this.f8735m.addUpdateListener(this.f8740r);
        SpringAnimation springAnimation10 = new SpringAnimation(this.f8729g, this.f8742t, 1.0f);
        this.f8738p = springAnimation10;
        springAnimation10.getSpring().setStiffness(438.64f);
        this.f8738p.getSpring().setDampingRatio(0.6f);
        this.f8738p.setMinimumVisibleChange(0.002f);
        this.f8738p.addUpdateListener(this.f8740r);
        if (this.f8746x) {
            springAnimation = this.f8738p;
            f = 5.0f;
        } else {
            springAnimation = this.f8738p;
            f = 10.0f;
        }
        springAnimation.setStartVelocity(f);
        SpringAnimation springAnimation11 = new SpringAnimation(this.f8729g, this.f8742t, 0.3f);
        this.f8739q = springAnimation11;
        springAnimation11.getSpring().setStiffness(986.96f);
        this.f8739q.getSpring().setDampingRatio(0.99f);
        this.f8739q.setMinimumVisibleChange(0.002f);
        this.f8739q.addUpdateListener(this.f8741s);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m9696h(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f8729g.invalidateSelf();
    }

    /* renamed from: e */
    public void mo8684e(Canvas canvas) {
        this.f8726d.draw(canvas);
        this.f8727e.draw(canvas);
        this.f8728f.draw(canvas);
    }

    /* renamed from: f */
    public float mo8685f() {
        return this.f8725c;
    }

    /* renamed from: i */
    public void mo8686i(int i, int i2, int i3, int i4) {
        this.f8726d.setBounds(i, i2, i3, i4);
        this.f8727e.setBounds(i, i2, i3, i4);
        this.f8728f.setBounds(i, i2, i3, i4);
    }

    /* renamed from: j */
    public void mo8687j(Rect rect) {
        this.f8726d.setBounds(rect);
        this.f8727e.setBounds(rect);
        this.f8728f.setBounds(rect);
    }

    /* renamed from: k */
    public void mo8688k(float f) {
        this.f8726d.mo8678a(f);
        this.f8727e.mo8678a(f);
        this.f8728f.mo8678a(f);
        this.f8725c = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo8689l(boolean z, boolean z2) {
        if (z2 && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!this.f8730h.isRunning()) {
                this.f8730h.start();
            }
            if (!this.f8736n.isRunning()) {
                this.f8736n.start();
            }
            if (!z && !this.f8731i.isRunning()) {
                this.f8731i.start();
            }
            if (this.f8732j.isRunning()) {
                this.f8732j.cancel();
            }
            if (this.f8733k.isRunning()) {
                this.f8733k.cancel();
            }
            if (this.f8737o.isRunning()) {
                this.f8737o.cancel();
            }
            if (this.f8738p.isRunning()) {
                this.f8738p.cancel();
            }
            if (this.f8739q.isRunning()) {
                this.f8739q.cancel();
            }
            if (this.f8735m.isRunning()) {
                this.f8735m.cancel();
            }
            if (this.f8734l.isRunning()) {
                this.f8734l.cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8690m(boolean z, boolean z2) {
        C2292b bVar;
        SpringAnimation springAnimation;
        float f;
        SpringAnimation springAnimation2;
        if (!z2 || Thread.currentThread() != Looper.getMainLooper().getThread()) {
            if (z) {
                bVar = this.f8728f;
                springAnimation = this.f8734l;
            } else {
                bVar = this.f8728f;
                springAnimation = this.f8735m;
            }
            bVar.setAlpha((int) (springAnimation.getSpring().getFinalPosition() * 255.0f));
            return;
        }
        if (this.f8730h.isRunning()) {
            this.f8730h.cancel();
        }
        if (this.f8736n.isRunning()) {
            this.f8736n.cancel();
        }
        if (this.f8731i.isRunning()) {
            this.f8731i.cancel();
        }
        if (!this.f8732j.isRunning()) {
            this.f8732j.start();
        }
        if (z) {
            if (this.f8735m.isRunning()) {
                this.f8735m.cancel();
            }
            if (!this.f8734l.isRunning()) {
                this.f8734l.start();
            }
            new Handler().postDelayed(new C2301g(), 50);
            if (this.f8746x) {
                springAnimation2 = this.f8733k;
                f = 10.0f;
            } else {
                springAnimation2 = this.f8733k;
                f = 5.0f;
            }
            springAnimation2.setStartVelocity(f);
        } else {
            if (this.f8734l.isRunning()) {
                this.f8734l.cancel();
            }
            if (!this.f8735m.isRunning()) {
                this.f8735m.start();
            }
            if (!this.f8739q.isRunning()) {
                this.f8739q.start();
            }
        }
        this.f8733k.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8691n(boolean z, boolean z2) {
        int i;
        C2292b bVar;
        if (z2) {
            if (z) {
                this.f8728f.setAlpha(255);
                this.f8727e.setAlpha(25);
            } else {
                this.f8728f.setAlpha(0);
                this.f8727e.setAlpha(0);
            }
            bVar = this.f8726d;
            i = this.f8723a;
        } else {
            this.f8728f.setAlpha(0);
            this.f8727e.setAlpha(0);
            bVar = this.f8726d;
            i = this.f8724b;
        }
        bVar.setAlpha(i);
    }
}
