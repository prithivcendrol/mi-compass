package miuix.appcompat.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import miuix.smooth.C2385c;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1357m;
import p055i3.C1649c;
import p117t2.C2698f;
import p117t2.C2715o;

public class DialogParentPanel2 extends LinearLayout {

    /* renamed from: d */
    private final C2255a f8607d;

    /* renamed from: e */
    private final RectF f8608e;

    /* renamed from: f */
    private final Path f8609f;

    /* renamed from: g */
    private float f8610g;

    /* renamed from: h */
    private int f8611h;

    /* renamed from: miuix.appcompat.internal.widget.DialogParentPanel2$a */
    private static class C2255a {

        /* renamed from: a */
        private final Context f8612a;

        /* renamed from: b */
        private final Point f8613b = new Point();

        /* renamed from: c */
        private int f8614c;

        /* renamed from: d */
        private boolean f8615d;

        /* renamed from: e */
        private TypedValue f8616e;

        /* renamed from: f */
        private TypedValue f8617f;

        /* renamed from: g */
        private TypedValue f8618g;

        /* renamed from: h */
        private TypedValue f8619h;

        /* renamed from: i */
        private TypedValue f8620i;

        /* renamed from: j */
        private TypedValue f8621j;

        /* renamed from: k */
        private TypedValue f8622k;

        /* renamed from: l */
        private TypedValue f8623l;

        public C2255a(Context context, AttributeSet attributeSet) {
            this.f8612a = context;
            m9557h(context, attributeSet);
            this.f8614c = mo8519d();
            this.f8615d = C2698f.m11281i(context);
        }

        /* renamed from: c */
        private int m9554c(int i, boolean z, TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4) {
            if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
                return i;
            }
            if (!z && this.f8615d) {
                return i;
            }
            boolean j = m9559j();
            if (!j) {
                typedValue = typedValue2;
            }
            int i2 = m9558i(typedValue, z);
            if (i2 > 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            if (!j) {
                typedValue3 = typedValue4;
            }
            int i3 = m9558i(typedValue3, z);
            return i3 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE) : i;
        }

        /* renamed from: f */
        private boolean m9555f(Context context) {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return true;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            return false;
        }

        /* renamed from: g */
        private boolean m9556g() {
            return (Build.VERSION.SDK_INT >= 31 || m9555f(this.f8612a)) ? this.f8612a.getResources().getConfiguration().orientation == 1 : this.f8612a.getApplicationContext().getResources().getConfiguration().orientation == 1;
        }

        /* renamed from: h */
        private void m9557h(Context context, AttributeSet attributeSet) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4899Z2);
                int i = C1357m.f4964m3;
                if (obtainStyledAttributes.hasValue(i)) {
                    TypedValue typedValue = new TypedValue();
                    this.f8616e = typedValue;
                    obtainStyledAttributes.getValue(i, typedValue);
                }
                int i2 = C1357m.f4949j3;
                if (obtainStyledAttributes.hasValue(i2)) {
                    TypedValue typedValue2 = new TypedValue();
                    this.f8617f = typedValue2;
                    obtainStyledAttributes.getValue(i2, typedValue2);
                }
                int i3 = C1357m.f4959l3;
                if (obtainStyledAttributes.hasValue(i3)) {
                    TypedValue typedValue3 = new TypedValue();
                    this.f8618g = typedValue3;
                    obtainStyledAttributes.getValue(i3, typedValue3);
                }
                int i4 = C1357m.f4954k3;
                if (obtainStyledAttributes.hasValue(i4)) {
                    TypedValue typedValue4 = new TypedValue();
                    this.f8619h = typedValue4;
                    obtainStyledAttributes.getValue(i4, typedValue4);
                }
                int i5 = C1357m.f4994s3;
                if (obtainStyledAttributes.hasValue(i5)) {
                    TypedValue typedValue5 = new TypedValue();
                    this.f8620i = typedValue5;
                    obtainStyledAttributes.getValue(i5, typedValue5);
                }
                int i6 = C1357m.f4989r3;
                if (obtainStyledAttributes.hasValue(i6)) {
                    TypedValue typedValue6 = new TypedValue();
                    this.f8621j = typedValue6;
                    obtainStyledAttributes.getValue(i6, typedValue6);
                }
                int i7 = C1357m.f4979p3;
                if (obtainStyledAttributes.hasValue(i7)) {
                    TypedValue typedValue7 = new TypedValue();
                    this.f8623l = typedValue7;
                    obtainStyledAttributes.getValue(i7, typedValue7);
                }
                int i8 = C1357m.f4984q3;
                if (obtainStyledAttributes.hasValue(i8)) {
                    TypedValue typedValue8 = new TypedValue();
                    this.f8622k = typedValue8;
                    obtainStyledAttributes.getValue(i8, typedValue8);
                }
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: i */
        private int m9558i(TypedValue typedValue, boolean z) {
            int i;
            float fraction;
            if (!(typedValue == null || (i = typedValue.type) == 0)) {
                if (i == 5) {
                    fraction = typedValue.getDimension(this.f8612a.getResources().getDisplayMetrics());
                } else if (i == 6) {
                    float f = (float) (z ? this.f8613b.x : this.f8613b.y);
                    fraction = typedValue.getFraction(f, f);
                }
                return (int) fraction;
            }
            return 0;
        }

        /* renamed from: j */
        private boolean m9559j() {
            return m9556g() || this.f8614c >= 500;
        }

        /* renamed from: a */
        public void mo8517a(int i) {
            if (this.f8614c != i) {
                this.f8616e = C1649c.m6966k(this.f8612a, C1347c.f4564c0);
                this.f8617f = C1649c.m6966k(this.f8612a, C1347c.f4558Z);
                this.f8618g = C1649c.m6966k(this.f8612a, C1347c.f4562b0);
                this.f8619h = C1649c.m6966k(this.f8612a, C1347c.f4560a0);
                this.f8620i = C1649c.m6966k(this.f8612a, C1347c.f4572g0);
                this.f8621j = C1649c.m6966k(this.f8612a, C1347c.f4570f0);
                this.f8622k = C1649c.m6966k(this.f8612a, C1347c.f4568e0);
                this.f8623l = C1649c.m6966k(this.f8612a, C1347c.f4566d0);
                this.f8615d = C2698f.m11281i(this.f8612a);
                this.f8614c = i;
            }
        }

        /* renamed from: b */
        public int mo8518b(int i) {
            return m9554c(i, false, this.f8619h, this.f8617f, this.f8622k, this.f8623l);
        }

        /* renamed from: d */
        public int mo8519d() {
            C2715o.m11331b(this.f8612a, this.f8613b);
            return (int) (((float) this.f8613b.y) / this.f8612a.getResources().getDisplayMetrics().density);
        }

        /* renamed from: e */
        public int mo8520e(int i) {
            return m9554c(i, true, this.f8616e, this.f8618g, this.f8620i, this.f8621j);
        }
    }

    public DialogParentPanel2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogParentPanel2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8608e = new RectF();
        this.f8609f = new Path();
        setSmoothCornerEnable(true);
        Resources resources = getResources();
        setCornerRadius(resources.getDimension(C1350f.f4610F));
        this.f8611h = resources.getDisplayMetrics().densityDpi;
        this.f8607d = new C2255a(context, attributeSet);
    }

    /* renamed from: a */
    private void m9551a(Canvas canvas) {
        this.f8609f.reset();
        Path path = this.f8609f;
        RectF rectF = this.f8608e;
        float f = this.f8610g;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.f8609f);
    }

    /* renamed from: b */
    private void m9552b() {
        this.f8607d.mo8517a(this.f8607d.mo8519d());
    }

    /* renamed from: c */
    private void m9553c() {
        invalidateOutline();
        invalidate();
    }

    private void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f8610g = f;
        m9553c();
    }

    private void setSmoothCornerEnable(boolean z) {
        C2385c.m10112c(this, z);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        m9551a(canvas);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.densityDpi;
        if (i != this.f8611h) {
            this.f8611h = i;
            setCornerRadius(getResources().getDimension(C1350f.f4610F));
        }
        m9552b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m9552b();
        super.onMeasure(this.f8607d.mo8520e(i), this.f8607d.mo8518b(i2));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8608e.set(0.0f, 0.0f, (float) i, (float) i2);
    }
}
