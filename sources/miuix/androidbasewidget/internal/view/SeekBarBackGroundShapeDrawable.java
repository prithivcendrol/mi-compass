package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import miuix.androidbasewidget.internal.view.C1975a;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import p003a2.C0034a;

public class SeekBarBackGroundShapeDrawable extends C1975a {

    /* renamed from: d */
    private SpringAnimation f7416d;

    /* renamed from: e */
    private SpringAnimation f7417e;

    /* renamed from: f */
    private GradientDrawable f7418f;

    /* renamed from: g */
    private float f7419g = 0.0f;

    /* renamed from: h */
    private FloatProperty<SeekBarBackGroundShapeDrawable> f7420h = new C1972a("BlackAlpha");

    /* renamed from: miuix.androidbasewidget.internal.view.SeekBarBackGroundShapeDrawable$a */
    class C1972a extends FloatProperty<SeekBarBackGroundShapeDrawable> {
        C1972a(String str) {
            super(str);
        }

        /* renamed from: a */
        public float getValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable) {
            return seekBarBackGroundShapeDrawable.mo6611f();
        }

        /* renamed from: b */
        public void setValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable, float f) {
            seekBarBackGroundShapeDrawable.mo6612j(f);
        }
    }

    /* renamed from: miuix.androidbasewidget.internal.view.SeekBarBackGroundShapeDrawable$b */
    class C1973b implements DynamicAnimation.OnAnimationUpdateListener {
        C1973b() {
        }

        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            SeekBarBackGroundShapeDrawable.this.invalidateSelf();
        }
    }

    /* renamed from: miuix.androidbasewidget.internal.view.SeekBarBackGroundShapeDrawable$c */
    protected static class C1974c extends C1975a.C1976a {
        protected C1974c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable mo6615a(Resources resources, Resources.Theme theme, C1975a.C1976a aVar) {
            return new SeekBarBackGroundShapeDrawable(resources, theme, aVar);
        }
    }

    public SeekBarBackGroundShapeDrawable() {
        m8028g();
        m8029h();
    }

    public SeekBarBackGroundShapeDrawable(Resources resources, Resources.Theme theme, C1975a.C1976a aVar) {
        super(resources, theme, aVar);
        m8028g();
        m8029h();
    }

    /* renamed from: e */
    private void m8027e(Canvas canvas) {
        this.f7418f.setBounds(getBounds());
        this.f7418f.setAlpha((int) (this.f7419g * 255.0f));
        this.f7418f.setCornerRadius(getCornerRadius());
        this.f7418f.draw(canvas);
    }

    /* renamed from: g */
    private void m8028g() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.f7420h, 0.05f);
        this.f7416d = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.f7416d.getSpring().setDampingRatio(0.99f);
        this.f7416d.setMinimumVisibleChange(0.00390625f);
        this.f7416d.addUpdateListener(new C0034a(this));
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.f7420h, 0.0f);
        this.f7417e = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f7417e.getSpring().setDampingRatio(0.99f);
        this.f7417e.setMinimumVisibleChange(0.00390625f);
        this.f7417e.addUpdateListener(new C1973b());
    }

    /* renamed from: h */
    private void m8029h() {
        GradientDrawable gradientDrawable = new GradientDrawable(getOrientation(), getColors());
        this.f7418f = gradientDrawable;
        gradientDrawable.setCornerRadius(getCornerRadius());
        this.f7418f.setShape(getShape());
        this.f7418f.setColor(-16777216);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m8030i(DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1975a.C1976a mo6607a() {
        return new C1974c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6608b() {
        this.f7416d.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6609c() {
        this.f7417e.start();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m8027e(canvas);
    }

    /* renamed from: f */
    public float mo6611f() {
        return this.f7419g;
    }

    /* renamed from: j */
    public void mo6612j(float f) {
        this.f7419g = f;
    }
}
