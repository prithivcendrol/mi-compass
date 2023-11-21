package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.annotation.Keep;
import androidx.core.view.C0660b0;
import androidx.recyclerview.widget.C1251m;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import miuix.spring.view.SpringHelper;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p034f0.C1549a;
import p073l3.C1877a;
import p080m4.C1963a;

public abstract class SpringRecyclerView extends C1251m {

    /* renamed from: W0 */
    private static final Field f4132W0;

    /* renamed from: X0 */
    private static final Field f4133X0;

    /* renamed from: Y0 */
    private static final RecyclerView.C1176l f4134Y0 = new C1202b();
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public C1203c f4135Q0;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public C1204d f4136R0;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public boolean f4137S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public boolean f4138T0;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public int f4139U0;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public SpringHelper f4140V0;

    /* renamed from: androidx.recyclerview.widget.SpringRecyclerView$a */
    private static class C1201a extends EdgeEffect {
        C1201a(Context context) {
            super(context);
        }

        public boolean draw(Canvas canvas) {
            return false;
        }

        public void finish() {
        }

        public BlendMode getBlendMode() {
            return null;
        }

        public int getColor() {
            return 0;
        }

        public int getMaxHeight() {
            return 0;
        }

        public boolean isFinished() {
            return true;
        }

        public void onAbsorb(int i) {
        }

        public void onPull(float f) {
        }

        public void onPull(float f, float f2) {
        }

        public void onRelease() {
        }

        public void setBlendMode(BlendMode blendMode) {
        }

        public void setColor(int i) {
        }

        public void setSize(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.SpringRecyclerView$b */
    private static class C1202b extends RecyclerView.C1176l {
        private C1202b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4516a(RecyclerView recyclerView, int i) {
            return new C1201a(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.SpringRecyclerView$c */
    private class C1203c extends C1251m.C1252a {
        private C1203c() {
            super();
        }

        /* renamed from: b */
        public void mo4429b(int i, int i2) {
            int f = SpringRecyclerView.this.f4140V0.mo9234f();
            int g = SpringRecyclerView.this.f4140V0.mo9235g();
            if (!SpringRecyclerView.this.m5338M1() || (f == 0 && g == 0)) {
                super.mo4429b(i, i2);
            } else {
                mo4736m(i, i2, f, g);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4734k(int i) {
            boolean unused = SpringRecyclerView.this.f4137S0 = true;
            SpringRecyclerView.this.setScrollState(2);
            mo4943j();
            this.f4348m.mo9385p(0, -i, SpringRecyclerView.this.getWidth());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4735l(int i) {
            boolean unused = SpringRecyclerView.this.f4138T0 = true;
            SpringRecyclerView.this.setScrollState(2);
            mo4943j();
            this.f4348m.mo9386q(0, -i, SpringRecyclerView.this.getHeight());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo4736m(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = i3;
            int i10 = i4;
            boolean z = true;
            boolean unused = SpringRecyclerView.this.f4137S0 = i9 != 0;
            SpringRecyclerView springRecyclerView = SpringRecyclerView.this;
            if (i10 == 0) {
                z = false;
            }
            boolean unused2 = springRecyclerView.f4138T0 = z;
            SpringRecyclerView.this.setScrollState(2);
            mo4943j();
            int signum = Integer.signum(i) * i9;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = -i9;
            if (signum > 0) {
                i6 = i13;
                i5 = i6;
            } else if (i < 0) {
                i5 = i13;
                i6 = Integer.MIN_VALUE;
            } else {
                i6 = i13;
                i5 = Integer.MAX_VALUE;
            }
            if (Integer.signum(i2) * i10 > 0) {
                i8 = -i10;
                i7 = i8;
            } else {
                if (i2 < 0) {
                    i12 = -i10;
                } else {
                    i11 = -i10;
                }
                i8 = i11;
                i7 = i12;
            }
            this.f4348m.mo9373d(0, 0, i, i2, i6, i5, i8, i7, SpringRecyclerView.this.getWidth(), SpringRecyclerView.this.getHeight());
            mo4430d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo4737n(int i, int i2) {
            if (i != 0) {
                boolean unused = SpringRecyclerView.this.f4137S0 = true;
            }
            if (i2 != 0) {
                boolean unused2 = SpringRecyclerView.this.f4138T0 = true;
            }
            SpringRecyclerView.this.setScrollState(2);
            mo4943j();
            int i3 = -i;
            int i4 = -i2;
            this.f4348m.mo9388t(0, 0, i3, i3, i4, i4);
            mo4430d();
        }
    }

    /* renamed from: androidx.recyclerview.widget.SpringRecyclerView$d */
    private class C1204d extends C0660b0 {
        C1204d(View view) {
            super(view);
        }

        /* renamed from: d */
        public boolean mo2807d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            return SpringRecyclerView.this.f4140V0.mo9236i(i, i2, iArr, iArr2, i3);
        }

        /* renamed from: e */
        public void mo2808e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            SpringRecyclerView.this.f4140V0.mo9237j(i, i2, i3, i4, iArr, i5, iArr2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4738s(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            if (SpringRecyclerView.this.f4137S0 || SpringRecyclerView.this.f4138T0) {
                return false;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            return super.mo2807d(i, i2, iArr, iArr2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4739t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            if (!SpringRecyclerView.this.f4137S0 && !SpringRecyclerView.this.f4138T0) {
                super.mo2808e(i, i2, i3, i4, iArr, i5, iArr2);
            }
        }
    }

    static {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("h0");
            f4132W0 = declaredField;
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = RecyclerView.class.getDeclaredField("u0");
                f4133X0 = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public SpringRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1549a.f6201a);
    }

    public SpringRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4139U0 = 0;
        this.f4140V0 = new SpringHelper() {

            /* renamed from: c */
            C1963a f4141c;

            /* renamed from: l */
            private C1963a m5341l() {
                if (this.f4141c == null) {
                    this.f4141c = new C1963a(SpringRecyclerView.this.getContext());
                }
                return this.f4141c;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo4713a() {
                RecyclerView.C1183p pVar = SpringRecyclerView.this.f3992p;
                return pVar != null && pVar.mo4198k();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public boolean mo4714b() {
                RecyclerView.C1183p pVar = SpringRecyclerView.this.f3992p;
                return pVar != null && pVar.mo4199l();
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public boolean mo4715c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
                if (SpringRecyclerView.this.f4137S0 && mo9234f() == 0) {
                    boolean unused = SpringRecyclerView.this.f4137S0 = false;
                }
                if (SpringRecyclerView.this.f4138T0 && mo9235g() == 0) {
                    boolean unused2 = SpringRecyclerView.this.f4138T0 = false;
                }
                return SpringRecyclerView.this.f4136R0.mo4738s(i, i2, iArr, iArr2, i3);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public void mo4716d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
                int i6 = i3;
                int i7 = i4;
                SpringRecyclerView.this.f4136R0.mo4739t(i, i2, i3, i4, iArr, i5, iArr2);
                if (mo4719k() && SpringRecyclerView.this.f4139U0 == 2) {
                    if (!SpringRecyclerView.this.f4137S0 && mo4713a() && i6 != 0) {
                        SpringRecyclerView.this.f4135Q0.mo4734k(i3);
                    }
                    if (!SpringRecyclerView.this.f4138T0 && mo4714b() && i7 != 0) {
                        SpringRecyclerView.this.f4135Q0.mo4735l(i4);
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public int mo4717e() {
                return SpringRecyclerView.this.getHeight();
            }

            /* access modifiers changed from: protected */
            /* renamed from: h */
            public int mo4718h() {
                return SpringRecyclerView.this.getWidth();
            }

            /* access modifiers changed from: protected */
            /* renamed from: k */
            public boolean mo4719k() {
                return SpringRecyclerView.this.m5338M1();
            }

            /* access modifiers changed from: protected */
            @Keep
            public void vibrate() {
                if (HapticCompat.m10231c("2.0")) {
                    m5341l().mo6600a(201);
                } else {
                    HapticCompat.performHapticFeedback(SpringRecyclerView.this, C2403h.f9378q);
                }
            }
        };
        this.f4135Q0 = new C1203c();
        C1204d dVar = new C1204d(this);
        this.f4136R0 = dVar;
        dVar.mo2813m(isNestedScrollingEnabled());
        m5337L1(this.f4135Q0);
        m5336K1(this.f4136R0);
        super.setEdgeEffectFactory(f4134Y0);
        if (C1877a.f7248a) {
            setSpringEnabled(false);
        }
    }

    /* renamed from: K1 */
    private void m5336K1(C0660b0 b0Var) {
        try {
            f4133X0.set(this, b0Var);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: L1 */
    private void m5337L1(C1251m.C1252a aVar) {
        try {
            f4132W0.set(this, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public boolean m5338M1() {
        return getOverScrollMode() != 2 && getSpringEnabled();
    }

    /* renamed from: K0 */
    public void mo4246K0(int i) {
        super.mo4246K0(i);
        this.f4139U0 = i;
        if (!m5338M1() || i == 2) {
            return;
        }
        if (this.f4137S0 || this.f4138T0) {
            this.f4135Q0.mo4432f();
            this.f4137S0 = false;
            this.f4138T0 = false;
        }
    }

    public void draw(Canvas canvas) {
        int f = this.f4140V0.mo9234f();
        int g = this.f4140V0.mo9235g();
        if (f == 0 && g == 0) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate((float) (-f), (float) (-g));
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public /* bridge */ /* synthetic */ boolean getSpringEnabled() {
        return super.getSpringEnabled();
    }

    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f4139U0 == 1 && i == 0) {
            int f = this.f4140V0.mo9234f();
            int g = this.f4140V0.mo9235g();
            if (!(f == 0 && g == 0)) {
                this.f4135Q0.mo4737n(f, g);
                return;
            }
        }
        super.setScrollState(i);
    }

    public /* bridge */ /* synthetic */ void setSpringEnabled(boolean z) {
        super.setSpringEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y1 */
    public boolean mo4712y1() {
        return this.f4137S0 || this.f4138T0;
    }
}
