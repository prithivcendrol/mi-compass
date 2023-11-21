package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p008os.C0586i;
import androidx.core.util.C0623f;
import androidx.core.view.C0624a;
import androidx.core.view.C0627a0;
import androidx.core.view.C0660b0;
import androidx.core.view.C0719j0;
import androidx.core.view.C0727l0;
import androidx.core.view.C0783v1;
import androidx.core.view.C0797z;
import androidx.core.view.accessibility.C0631b;
import androidx.core.view.accessibility.C0637g;
import androidx.recyclerview.widget.C1214a;
import androidx.recyclerview.widget.C1217b;
import androidx.recyclerview.widget.C1236e;
import androidx.recyclerview.widget.C1247j;
import androidx.recyclerview.widget.C1255p;
import androidx.recyclerview.widget.C1258q;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p034f0.C1549a;
import p034f0.C1550b;
import p034f0.C1551c;
import p129w.C2871a;

public class RecyclerView extends ViewGroup implements C0719j0, C0627a0 {

    /* renamed from: E0 */
    private static final int[] f3929E0 = {16843830};

    /* renamed from: F0 */
    static final boolean f3930F0 = false;

    /* renamed from: G0 */
    static final boolean f3931G0 = true;

    /* renamed from: H0 */
    static final boolean f3932H0 = true;

    /* renamed from: I0 */
    static final boolean f3933I0 = true;

    /* renamed from: J0 */
    private static final boolean f3934J0 = false;

    /* renamed from: K0 */
    private static final boolean f3935K0 = false;

    /* renamed from: L0 */
    private static final Class<?>[] f3936L0;

    /* renamed from: M0 */
    static final Interpolator f3937M0 = new C1163c();

    /* renamed from: A */
    boolean f3938A;

    /* renamed from: A0 */
    private boolean f3939A0;

    /* renamed from: B */
    boolean f3940B;

    /* renamed from: B0 */
    private int f3941B0;

    /* renamed from: C */
    private boolean f3942C;

    /* renamed from: C0 */
    private int f3943C0;

    /* renamed from: D */
    private int f3944D;

    /* renamed from: D0 */
    private final C1258q.C1260b f3945D0;

    /* renamed from: E */
    boolean f3946E;

    /* renamed from: F */
    private final AccessibilityManager f3947F;

    /* renamed from: G */
    private List<C1189r> f3948G;

    /* renamed from: H */
    boolean f3949H;

    /* renamed from: I */
    boolean f3950I;

    /* renamed from: J */
    private int f3951J;

    /* renamed from: K */
    private int f3952K;

    /* renamed from: L */
    private C1176l f3953L;

    /* renamed from: M */
    private EdgeEffect f3954M;

    /* renamed from: N */
    private EdgeEffect f3955N;

    /* renamed from: O */
    private EdgeEffect f3956O;

    /* renamed from: P */
    private EdgeEffect f3957P;

    /* renamed from: Q */
    C1177m f3958Q;

    /* renamed from: R */
    private int f3959R;

    /* renamed from: S */
    private int f3960S;

    /* renamed from: T */
    private VelocityTracker f3961T;

    /* renamed from: U */
    private int f3962U;

    /* renamed from: V */
    private int f3963V;

    /* renamed from: W */
    private int f3964W;

    /* renamed from: a0 */
    private int f3965a0;

    /* renamed from: b0 */
    private int f3966b0;

    /* renamed from: c0 */
    private final int f3967c0;

    /* renamed from: d */
    private final C1197y f3968d;

    /* renamed from: d0 */
    private final int f3969d0;

    /* renamed from: e */
    final C1195w f3970e;

    /* renamed from: e0 */
    private float f3971e0;

    /* renamed from: f */
    C1198z f3972f;

    /* renamed from: f0 */
    private float f3973f0;

    /* renamed from: g */
    C1214a f3974g;

    /* renamed from: g0 */
    private boolean f3975g0;

    /* renamed from: h */
    C1217b f3976h;

    /* renamed from: h0 */
    final C1166d0 f3977h0;

    /* renamed from: i */
    final C1258q f3978i;

    /* renamed from: i0 */
    C1236e f3979i0;

    /* renamed from: j */
    boolean f3980j;

    /* renamed from: j0 */
    C1236e.C1238b f3981j0;

    /* renamed from: k */
    final Runnable f3982k;

    /* renamed from: k0 */
    final C1162b0 f3983k0;

    /* renamed from: l */
    final Rect f3984l;

    /* renamed from: l0 */
    private C1192u f3985l0;

    /* renamed from: m */
    private final Rect f3986m;

    /* renamed from: m0 */
    private List<C1192u> f3987m0;

    /* renamed from: n */
    final RectF f3988n;

    /* renamed from: n0 */
    boolean f3989n0;

    /* renamed from: o */
    C1171h f3990o;

    /* renamed from: o0 */
    boolean f3991o0;

    /* renamed from: p */
    C1183p f3992p;

    /* renamed from: p0 */
    private C1177m.C1179b f3993p0;

    /* renamed from: q */
    C1196x f3994q;

    /* renamed from: q0 */
    boolean f3995q0;

    /* renamed from: r */
    final List<C1196x> f3996r;

    /* renamed from: r0 */
    C1247j f3997r0;

    /* renamed from: s */
    final ArrayList<C1182o> f3998s;

    /* renamed from: s0 */
    private C1175k f3999s0;

    /* renamed from: t */
    private final ArrayList<C1191t> f4000t;

    /* renamed from: t0 */
    private final int[] f4001t0;

    /* renamed from: u */
    private C1191t f4002u;

    /* renamed from: u0 */
    private C0660b0 f4003u0;

    /* renamed from: v */
    boolean f4004v;

    /* renamed from: v0 */
    private final int[] f4005v0;

    /* renamed from: w */
    boolean f4006w;

    /* renamed from: w0 */
    private final int[] f4007w0;

    /* renamed from: x */
    boolean f4008x;

    /* renamed from: x0 */
    final int[] f4009x0;

    /* renamed from: y */
    boolean f4010y;

    /* renamed from: y0 */
    final List<C1168e0> f4011y0;

    /* renamed from: z */
    private int f4012z;

    /* renamed from: z0 */
    private Runnable f4013z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1157a implements Runnable {
        C1157a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4010y && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f4004v) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3940B) {
                    recyclerView2.f3938A = true;
                } else {
                    recyclerView2.mo4389t();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1158a0 {

        /* renamed from: a */
        private int f4015a;

        /* renamed from: b */
        private RecyclerView f4016b;

        /* renamed from: c */
        private C1183p f4017c;

        /* renamed from: d */
        private boolean f4018d;

        /* renamed from: e */
        private boolean f4019e;

        /* renamed from: f */
        private View f4020f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        public static class C1159a {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        public interface C1160b {
            /* renamed from: a */
            PointF mo4190a(int i);
        }

        /* renamed from: a */
        public PointF mo4400a(int i) {
            C1183p d = mo4403d();
            if (d instanceof C1160b) {
                return ((C1160b) d).mo4190a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1160b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public int mo4401b() {
            return this.f4016b.f3992p.mo4563J();
        }

        /* renamed from: c */
        public int mo4402c(View view) {
            return this.f4016b.mo4280d0(view);
        }

        /* renamed from: d */
        public C1183p mo4403d() {
            return this.f4017c;
        }

        /* renamed from: e */
        public int mo4404e() {
            return this.f4015a;
        }

        /* renamed from: f */
        public boolean mo4405f() {
            return this.f4018d;
        }

        /* renamed from: g */
        public boolean mo4406g() {
            return this.f4019e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo4407h(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4408i(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f4016b;
            if (this.f4015a == -1 || recyclerView == null) {
                mo4414o();
            }
            if (this.f4018d && this.f4020f == null && this.f4017c != null && (a = mo4400a(this.f4015a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo4295g1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f4018d = false;
            View view = this.f4020f;
            if (view != null) {
                if (mo4402c(view) != this.f4015a) {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4020f = null;
                } else {
                    mo4412m(this.f4020f, recyclerView.f3983k0, (C1159a) null);
                    throw null;
                }
            }
            if (this.f4019e) {
                mo4410k(i, i2, recyclerView.f3983k0, (C1159a) null);
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4409j(View view) {
            if (mo4402c(view) == mo4404e()) {
                this.f4020f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public abstract void mo4410k(int i, int i2, C1162b0 b0Var, C1159a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo4411l();

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo4412m(View view, C1162b0 b0Var, C1159a aVar);

        /* renamed from: n */
        public void mo4413n(int i) {
            this.f4015a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public final void mo4414o() {
            if (this.f4019e) {
                this.f4019e = false;
                mo4411l();
                this.f4016b.f3983k0.f4022a = -1;
                this.f4020f = null;
                this.f4015a = -1;
                this.f4018d = false;
                this.f4017c.mo4596e1(this);
                this.f4017c = null;
                this.f4016b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1161b implements Runnable {
        C1161b() {
        }

        public void run() {
            C1177m mVar = RecyclerView.this.f3958Q;
            if (mVar != null) {
                mVar.mo4536u();
            }
            RecyclerView.this.f3995q0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static class C1162b0 {

        /* renamed from: a */
        int f4022a = -1;

        /* renamed from: b */
        private SparseArray<Object> f4023b;

        /* renamed from: c */
        int f4024c = 0;

        /* renamed from: d */
        int f4025d = 0;

        /* renamed from: e */
        int f4026e = 1;

        /* renamed from: f */
        int f4027f = 0;

        /* renamed from: g */
        boolean f4028g = false;

        /* renamed from: h */
        boolean f4029h = false;

        /* renamed from: i */
        boolean f4030i = false;

        /* renamed from: j */
        boolean f4031j = false;

        /* renamed from: k */
        boolean f4032k = false;

        /* renamed from: l */
        boolean f4033l = false;

        /* renamed from: m */
        int f4034m;

        /* renamed from: n */
        long f4035n;

        /* renamed from: o */
        int f4036o;

        /* renamed from: p */
        int f4037p;

        /* renamed from: q */
        int f4038q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4416a(int i) {
            if ((this.f4026e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4026e));
            }
        }

        /* renamed from: b */
        public int mo4417b() {
            return this.f4029h ? this.f4024c - this.f4025d : this.f4027f;
        }

        /* renamed from: c */
        public int mo4418c() {
            return this.f4022a;
        }

        /* renamed from: d */
        public boolean mo4419d() {
            return this.f4022a != -1;
        }

        /* renamed from: e */
        public boolean mo4420e() {
            return this.f4029h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4421f(C1171h hVar) {
            this.f4026e = 1;
            this.f4027f = hVar.mo4094g();
            this.f4029h = false;
            this.f4030i = false;
            this.f4031j = false;
        }

        /* renamed from: g */
        public boolean mo4422g() {
            return this.f4033l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4022a + ", mData=" + this.f4023b + ", mItemCount=" + this.f4027f + ", mIsMeasuring=" + this.f4031j + ", mPreviousLayoutItemCount=" + this.f4024c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4025d + ", mStructureChanged=" + this.f4028g + ", mInPreLayout=" + this.f4029h + ", mRunSimpleAnimations=" + this.f4032k + ", mRunPredictiveAnimations=" + this.f4033l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class C1163c implements Interpolator {
        C1163c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class C1164c0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1165d implements C1258q.C1260b {
        C1165d() {
        }

        /* renamed from: a */
        public void mo4425a(C1168e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3992p.mo4611l1(e0Var.f4049a, recyclerView.f3970e);
        }

        /* renamed from: b */
        public void mo4426b(C1168e0 e0Var, C1177m.C1180c cVar, C1177m.C1180c cVar2) {
            RecyclerView.this.mo4326k(e0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4427c(C1168e0 e0Var, C1177m.C1180c cVar, C1177m.C1180c cVar2) {
            RecyclerView.this.f3970e.mo4673J(e0Var);
            RecyclerView.this.mo4330m(e0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4428d(C1168e0 e0Var, C1177m.C1180c cVar, C1177m.C1180c cVar2) {
            e0Var.mo4451G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f3949H;
            C1177m mVar = recyclerView.f3958Q;
            if (z) {
                if (!mVar.mo4518b(e0Var, e0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!mVar.mo4520d(e0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.mo4250M0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    class C1166d0 implements Runnable {

        /* renamed from: d */
        private int f4040d;

        /* renamed from: e */
        private int f4041e;

        /* renamed from: f */
        OverScroller f4042f;

        /* renamed from: g */
        Interpolator f4043g;

        /* renamed from: h */
        private boolean f4044h = false;

        /* renamed from: i */
        private boolean f4045i = false;

        C1166d0() {
            Interpolator interpolator = RecyclerView.f3937M0;
            this.f4043g = interpolator;
            this.f4042f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m4982a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m4983c() {
            RecyclerView.this.removeCallbacks(this);
            C0727l0.m2870T(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void mo4429b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4041e = 0;
            this.f4040d = 0;
            Interpolator interpolator = this.f4043g;
            Interpolator interpolator2 = RecyclerView.f3937M0;
            if (interpolator != interpolator2) {
                this.f4043g = interpolator2;
                this.f4042f = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4042f.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4430d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4430d() {
            if (this.f4044h) {
                this.f4045i = true;
            } else {
                m4983c();
            }
        }

        /* renamed from: e */
        public void mo4431e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m4982a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3937M0;
            }
            if (this.f4043g != interpolator) {
                this.f4043g = interpolator;
                this.f4042f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4041e = 0;
            this.f4040d = 0;
            RecyclerView.this.setScrollState(2);
            this.f4042f.startScroll(0, 0, i, i2, i4);
            mo4430d();
        }

        /* renamed from: f */
        public void mo4432f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4042f.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3992p == null) {
                mo4432f();
                return;
            }
            this.f4045i = false;
            this.f4044h = true;
            recyclerView.mo4389t();
            OverScroller overScroller = this.f4042f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4040d;
                int i4 = currY - this.f4041e;
                this.f4040d = currX;
                this.f4041e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4009x0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo4235E(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4009x0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4360s(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3990o != null) {
                    int[] iArr3 = recyclerView3.f4009x0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo4295g1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4009x0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1158a0 a0Var = recyclerView4.f3992p.f4094g;
                    if (a0Var != null && !a0Var.mo4405f() && a0Var.mo4406g()) {
                        int b = RecyclerView.this.f3983k0.mo4417b();
                        if (b == 0) {
                            a0Var.mo4414o();
                        } else {
                            if (a0Var.mo4404e() >= b) {
                                a0Var.mo4413n(b - 1);
                            }
                            a0Var.mo4408i(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f3998s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4009x0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo4237F(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4009x0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo4241H(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1158a0 a0Var2 = RecyclerView.this.f3992p.f4094g;
                if ((a0Var2 != null && a0Var2.mo4405f()) || !z) {
                    mo4430d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1236e eVar = recyclerView7.f3979i0;
                    if (eVar != null) {
                        eVar.mo4898f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo4268a(i7, currVelocity);
                    }
                    if (RecyclerView.f3933I0) {
                        RecyclerView.this.f3981j0.mo4904b();
                    }
                }
            }
            C1158a0 a0Var3 = RecyclerView.this.f3992p.f4094g;
            if (a0Var3 != null && a0Var3.mo4405f()) {
                a0Var3.mo4408i(0, 0);
            }
            this.f4044h = false;
            if (this.f4045i) {
                m4983c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo4354r1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1167e implements C1217b.C1219b {
        C1167e() {
        }

        /* renamed from: a */
        public View mo4434a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo4435b(View view) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0 != null) {
                f0.mo4446B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public C1168e0 mo4436c(View view) {
            return RecyclerView.m4853f0(view);
        }

        /* renamed from: d */
        public void mo4437d(int i) {
            C1168e0 f0;
            View a = mo4434a(i);
            if (!(a == null || (f0 = RecyclerView.m4853f0(a)) == null)) {
                if (!f0.mo4480x() || f0.mo4454J()) {
                    f0.mo4458b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + f0 + RecyclerView.this.mo4252O());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: e */
        public void mo4438e(View view) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0 != null) {
                f0.mo4447C(RecyclerView.this);
            }
        }

        /* renamed from: f */
        public void mo4439f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo4395x(view);
        }

        /* renamed from: g */
        public int mo4440g() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: h */
        public void mo4441h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo4397y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: i */
        public void mo4442i() {
            int g = mo4440g();
            for (int i = 0; i < g; i++) {
                View a = mo4434a(i);
                RecyclerView.this.mo4397y(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: j */
        public void mo4443j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0 != null) {
                if (f0.mo4480x() || f0.mo4454J()) {
                    f0.mo4462f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0 + RecyclerView.this.mo4252O());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: k */
        public int mo4444k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    public static abstract class C1168e0 {

        /* renamed from: t */
        private static final List<Object> f4048t = Collections.emptyList();

        /* renamed from: a */
        public final View f4049a;

        /* renamed from: b */
        WeakReference<RecyclerView> f4050b;

        /* renamed from: c */
        int f4051c = -1;

        /* renamed from: d */
        int f4052d = -1;

        /* renamed from: e */
        long f4053e = -1;

        /* renamed from: f */
        int f4054f = -1;

        /* renamed from: g */
        int f4055g = -1;

        /* renamed from: h */
        C1168e0 f4056h = null;

        /* renamed from: i */
        C1168e0 f4057i = null;

        /* renamed from: j */
        int f4058j;

        /* renamed from: k */
        List<Object> f4059k = null;

        /* renamed from: l */
        List<Object> f4060l = null;

        /* renamed from: m */
        private int f4061m = 0;

        /* renamed from: n */
        C1195w f4062n = null;

        /* renamed from: o */
        boolean f4063o = false;

        /* renamed from: p */
        private int f4064p = 0;

        /* renamed from: q */
        int f4065q = -1;

        /* renamed from: r */
        RecyclerView f4066r;

        /* renamed from: s */
        C1171h<? extends C1168e0> f4067s;

        public C1168e0(View view) {
            if (view != null) {
                this.f4049a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m4999g() {
            if (this.f4059k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4059k = arrayList;
                this.f4060l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4445A(int i, boolean z) {
            if (this.f4052d == -1) {
                this.f4052d = this.f4051c;
            }
            if (this.f4055g == -1) {
                this.f4055g = this.f4051c;
            }
            if (z) {
                this.f4055g += i;
            }
            this.f4051c += i;
            if (this.f4049a.getLayoutParams() != null) {
                ((C1188q) this.f4049a.getLayoutParams()).f4114c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4446B(RecyclerView recyclerView) {
            int i = this.f4065q;
            if (i == -1) {
                i = C0727l0.m2913s(this.f4049a);
            }
            this.f4064p = i;
            recyclerView.mo4319i1(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4447C(RecyclerView recyclerView) {
            recyclerView.mo4319i1(this, this.f4064p);
            this.f4064p = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4448D() {
            this.f4058j = 0;
            this.f4051c = -1;
            this.f4052d = -1;
            this.f4053e = -1;
            this.f4055g = -1;
            this.f4061m = 0;
            this.f4056h = null;
            this.f4057i = null;
            mo4460d();
            this.f4064p = 0;
            this.f4065q = -1;
            RecyclerView.m4864q(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4449E() {
            if (this.f4052d == -1) {
                this.f4052d = this.f4051c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4450F(int i, int i2) {
            this.f4058j = (i & i2) | (this.f4058j & (~i2));
        }

        /* renamed from: G */
        public final void mo4451G(boolean z) {
            int i;
            int i2 = this.f4061m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f4061m = i3;
            if (i3 < 0) {
                this.f4061m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f4058j | 16;
            } else if (z && i3 == 0) {
                i = this.f4058j & -17;
            } else {
                return;
            }
            this.f4058j = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo4452H(C1195w wVar, boolean z) {
            this.f4062n = wVar;
            this.f4063o = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo4453I() {
            return (this.f4058j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo4454J() {
            return (this.f4058j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4455K() {
            this.f4062n.mo4673J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4456L() {
            return (this.f4058j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4457a(Object obj) {
            if (obj == null) {
                mo4458b(1024);
            } else if ((1024 & this.f4058j) == 0) {
                m4999g();
                this.f4059k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4458b(int i) {
            this.f4058j = i | this.f4058j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4459c() {
            this.f4052d = -1;
            this.f4055g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4460d() {
            List<Object> list = this.f4059k;
            if (list != null) {
                list.clear();
            }
            this.f4058j &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4461e() {
            this.f4058j &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4462f() {
            this.f4058j &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4463h() {
            return (this.f4058j & 16) == 0 && C0727l0.m2857G(this.f4049a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4464i(int i, int i2, boolean z) {
            mo4458b(8);
            mo4445A(i2, z);
            this.f4051c = i;
        }

        /* renamed from: j */
        public final int mo4465j() {
            RecyclerView recyclerView = this.f4066r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4269a0(this);
        }

        /* renamed from: k */
        public final long mo4466k() {
            return this.f4053e;
        }

        /* renamed from: l */
        public final int mo4467l() {
            return this.f4054f;
        }

        /* renamed from: m */
        public final int mo4468m() {
            int i = this.f4055g;
            return i == -1 ? this.f4051c : i;
        }

        /* renamed from: n */
        public final int mo4469n() {
            return this.f4052d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo4470o() {
            if ((this.f4058j & 1024) != 0) {
                return f4048t;
            }
            List<Object> list = this.f4059k;
            return (list == null || list.size() == 0) ? f4048t : this.f4060l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4471p(int i) {
            return (i & this.f4058j) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4472q() {
            return (this.f4058j & 512) != 0 || mo4475t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4473r() {
            return (this.f4049a.getParent() == null || this.f4049a.getParent() == this.f4066r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4474s() {
            return (this.f4058j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo4475t() {
            return (this.f4058j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4051c + " id=" + this.f4053e + ", oldPos=" + this.f4052d + ", pLpos:" + this.f4055g);
            if (mo4479w()) {
                sb.append(" scrap ");
                sb.append(this.f4063o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4475t()) {
                sb.append(" invalid");
            }
            if (!mo4474s()) {
                sb.append(" unbound");
            }
            if (mo4482z()) {
                sb.append(" update");
            }
            if (mo4478v()) {
                sb.append(" removed");
            }
            if (mo4454J()) {
                sb.append(" ignored");
            }
            if (mo4480x()) {
                sb.append(" tmpDetached");
            }
            if (!mo4477u()) {
                sb.append(" not recyclable(" + this.f4061m + ")");
            }
            if (mo4472q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4049a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo4477u() {
            return (this.f4058j & 16) == 0 && !C0727l0.m2857G(this.f4049a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo4478v() {
            return (this.f4058j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo4479w() {
            return this.f4062n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4480x() {
            return (this.f4058j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4481y() {
            return (this.f4058j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4482z() {
            return (this.f4058j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1169f implements C1214a.C1215a {
        C1169f() {
        }

        /* renamed from: a */
        public void mo4483a(int i, int i2) {
            RecyclerView.this.mo4233C0(i, i2);
            RecyclerView.this.f3989n0 = true;
        }

        /* renamed from: b */
        public void mo4484b(C1214a.C1216b bVar) {
            mo4491i(bVar);
        }

        /* renamed from: c */
        public C1168e0 mo4485c(int i) {
            C1168e0 Y = RecyclerView.this.mo4264Y(i, true);
            if (Y != null && !RecyclerView.this.f3976h.mo4845n(Y.f4049a)) {
                return Y;
            }
            return null;
        }

        /* renamed from: d */
        public void mo4486d(int i, int i2) {
            RecyclerView.this.mo4234D0(i, i2, false);
            RecyclerView.this.f3989n0 = true;
        }

        /* renamed from: e */
        public void mo4487e(int i, int i2) {
            RecyclerView.this.mo4232B0(i, i2);
            RecyclerView.this.f3989n0 = true;
        }

        /* renamed from: f */
        public void mo4488f(int i, int i2) {
            RecyclerView.this.mo4234D0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3989n0 = true;
            recyclerView.f3983k0.f4025d += i2;
        }

        /* renamed from: g */
        public void mo4489g(C1214a.C1216b bVar) {
            mo4491i(bVar);
        }

        /* renamed from: h */
        public void mo4490h(int i, int i2, Object obj) {
            RecyclerView.this.mo4392u1(i, i2, obj);
            RecyclerView.this.f3991o0 = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4491i(C1214a.C1216b bVar) {
            int i = bVar.f4209a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3992p.mo4146Q0(recyclerView, bVar.f4210b, bVar.f4212d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3992p.mo4149T0(recyclerView2, bVar.f4210b, bVar.f4212d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3992p.mo4150V0(recyclerView3, bVar.f4210b, bVar.f4212d, bVar.f4211c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3992p.mo4148S0(recyclerView4, bVar.f4210b, bVar.f4212d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C1170g {

        /* renamed from: a */
        static final /* synthetic */ int[] f4069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.C1171h.C1172a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4069a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1171h.C1172a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4069a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1171h.C1172a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1170g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class C1171h<VH extends C1168e0> {

        /* renamed from: a */
        private final C1173i f4070a = new C1173i();

        /* renamed from: b */
        private boolean f4071b = false;

        /* renamed from: c */
        private C1172a f4072c = C1172a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum C1172a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* renamed from: d */
        public final void mo4492d(VH vh, int i) {
            boolean z = vh.f4067s == null;
            if (z) {
                vh.f4051c = i;
                if (mo4496k()) {
                    vh.f4053e = mo4095h(i);
                }
                vh.mo4450F(1, 519);
                C0586i.m2412a("RV OnBindView");
            }
            vh.f4067s = this;
            mo4500p(vh, i, vh.mo4470o());
            if (z) {
                vh.mo4460d();
                ViewGroup.LayoutParams layoutParams = vh.f4049a.getLayoutParams();
                if (layoutParams instanceof C1188q) {
                    ((C1188q) layoutParams).f4114c = true;
                }
                C0586i.m2413b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo4493e() {
            int i = C1170g.f4069a[this.f4072c.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return true;
            }
            return mo4094g() > 0;
        }

        /* renamed from: f */
        public final VH mo4494f(ViewGroup viewGroup, int i) {
            try {
                C0586i.m2412a("RV CreateView");
                VH q = mo4098q(viewGroup, i);
                if (q.f4049a.getParent() == null) {
                    q.f4054f = i;
                    return q;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0586i.m2413b();
            }
        }

        /* renamed from: g */
        public abstract int mo4094g();

        /* renamed from: h */
        public abstract long mo4095h(int i);

        /* renamed from: i */
        public abstract int mo4096i(int i);

        /* renamed from: j */
        public final boolean mo4495j() {
            return this.f4070a.mo4509a();
        }

        /* renamed from: k */
        public final boolean mo4496k() {
            return this.f4071b;
        }

        /* renamed from: l */
        public final void mo4497l() {
            this.f4070a.mo4510b();
        }

        /* renamed from: m */
        public final void mo4498m(int i, Object obj) {
            this.f4070a.mo4511c(i, 1, obj);
        }

        /* renamed from: n */
        public void mo4499n(RecyclerView recyclerView) {
        }

        /* renamed from: o */
        public abstract void mo4097o(VH vh, int i);

        /* renamed from: p */
        public void mo4500p(VH vh, int i, List<Object> list) {
            mo4097o(vh, i);
        }

        /* renamed from: q */
        public abstract VH mo4098q(ViewGroup viewGroup, int i);

        /* renamed from: r */
        public void mo4501r(RecyclerView recyclerView) {
        }

        /* renamed from: s */
        public boolean mo4502s(VH vh) {
            return false;
        }

        /* renamed from: t */
        public void mo4503t(VH vh) {
        }

        /* renamed from: u */
        public void mo4504u(VH vh) {
        }

        /* renamed from: v */
        public void mo4505v(VH vh) {
        }

        /* renamed from: w */
        public void mo4506w(C1174j jVar) {
            this.f4070a.registerObserver(jVar);
        }

        /* renamed from: x */
        public void mo4507x(boolean z) {
            if (!mo4495j()) {
                this.f4071b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: y */
        public void mo4508y(C1174j jVar) {
            this.f4070a.unregisterObserver(jVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C1173i extends Observable<C1174j> {
        C1173i() {
        }

        /* renamed from: a */
        public boolean mo4509a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4510b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1174j) this.mObservers.get(size)).mo4512a();
            }
        }

        /* renamed from: c */
        public void mo4511c(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1174j) this.mObservers.get(size)).mo4514c(i, i2, obj);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C1174j {
        /* renamed from: a */
        public void mo4512a() {
        }

        /* renamed from: b */
        public void mo4513b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4514c(int i, int i2, Object obj) {
            mo4513b(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface C1175k {
        /* renamed from: a */
        int mo4515a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C1176l {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4516a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C1177m {

        /* renamed from: a */
        private C1179b f4077a = null;

        /* renamed from: b */
        private ArrayList<C1178a> f4078b = new ArrayList<>();

        /* renamed from: c */
        private long f4079c = 120;

        /* renamed from: d */
        private long f4080d = 120;

        /* renamed from: e */
        private long f4081e = 250;

        /* renamed from: f */
        private long f4082f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public interface C1178a {
            /* renamed from: a */
            void mo4538a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        interface C1179b {
            /* renamed from: a */
            void mo4539a(C1168e0 e0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public static class C1180c {

            /* renamed from: a */
            public int f4083a;

            /* renamed from: b */
            public int f4084b;

            /* renamed from: c */
            public int f4085c;

            /* renamed from: d */
            public int f4086d;

            /* renamed from: a */
            public C1180c mo4540a(C1168e0 e0Var) {
                return mo4541b(e0Var, 0);
            }

            /* renamed from: b */
            public C1180c mo4541b(C1168e0 e0Var, int i) {
                View view = e0Var.f4049a;
                this.f4083a = view.getLeft();
                this.f4084b = view.getTop();
                this.f4085c = view.getRight();
                this.f4086d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5076e(C1168e0 e0Var) {
            int i = e0Var.f4058j & 14;
            if (e0Var.mo4475t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = e0Var.mo4469n();
            int j = e0Var.mo4465j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo4517a(C1168e0 e0Var, C1180c cVar, C1180c cVar2);

        /* renamed from: b */
        public abstract boolean mo4518b(C1168e0 e0Var, C1168e0 e0Var2, C1180c cVar, C1180c cVar2);

        /* renamed from: c */
        public abstract boolean mo4519c(C1168e0 e0Var, C1180c cVar, C1180c cVar2);

        /* renamed from: d */
        public abstract boolean mo4520d(C1168e0 e0Var, C1180c cVar, C1180c cVar2);

        /* renamed from: f */
        public abstract boolean mo4521f(C1168e0 e0Var);

        /* renamed from: g */
        public boolean mo4522g(C1168e0 e0Var, List<Object> list) {
            return mo4521f(e0Var);
        }

        /* renamed from: h */
        public final void mo4523h(C1168e0 e0Var) {
            mo4533r(e0Var);
            C1179b bVar = this.f4077a;
            if (bVar != null) {
                bVar.mo4539a(e0Var);
            }
        }

        /* renamed from: i */
        public final void mo4524i() {
            int size = this.f4078b.size();
            for (int i = 0; i < size; i++) {
                this.f4078b.get(i).mo4538a();
            }
            this.f4078b.clear();
        }

        /* renamed from: j */
        public abstract void mo4525j(C1168e0 e0Var);

        /* renamed from: k */
        public abstract void mo4526k();

        /* renamed from: l */
        public long mo4527l() {
            return this.f4079c;
        }

        /* renamed from: m */
        public long mo4528m() {
            return this.f4082f;
        }

        /* renamed from: n */
        public long mo4529n() {
            return this.f4081e;
        }

        /* renamed from: o */
        public long mo4530o() {
            return this.f4080d;
        }

        /* renamed from: p */
        public abstract boolean mo4531p();

        /* renamed from: q */
        public C1180c mo4532q() {
            return new C1180c();
        }

        /* renamed from: r */
        public void mo4533r(C1168e0 e0Var) {
        }

        /* renamed from: s */
        public C1180c mo4534s(C1162b0 b0Var, C1168e0 e0Var) {
            return mo4532q().mo4540a(e0Var);
        }

        /* renamed from: t */
        public C1180c mo4535t(C1162b0 b0Var, C1168e0 e0Var, int i, List<Object> list) {
            return mo4532q().mo4540a(e0Var);
        }

        /* renamed from: u */
        public abstract void mo4536u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4537v(C1179b bVar) {
            this.f4077a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C1181n implements C1177m.C1179b {
        C1181n() {
        }

        /* renamed from: a */
        public void mo4539a(C1168e0 e0Var) {
            e0Var.mo4451G(true);
            if (e0Var.f4056h != null && e0Var.f4057i == null) {
                e0Var.f4056h = null;
            }
            e0Var.f4057i = null;
            if (!e0Var.mo4453I() && !RecyclerView.this.mo4259V0(e0Var.f4049a) && e0Var.mo4480x()) {
                RecyclerView.this.removeDetachedView(e0Var.f4049a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1182o {
        @Deprecated
        /* renamed from: d */
        public void mo4542d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo4081e(Rect rect, View view, RecyclerView recyclerView, C1162b0 b0Var) {
            mo4542d(rect, ((C1188q) view.getLayoutParams()).mo4643a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo4543f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4544g(Canvas canvas, RecyclerView recyclerView, C1162b0 b0Var) {
            mo4543f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo4545h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo4082i(Canvas canvas, RecyclerView recyclerView, C1162b0 b0Var) {
            mo4545h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C1183p {

        /* renamed from: a */
        C1217b f4088a;

        /* renamed from: b */
        RecyclerView f4089b;

        /* renamed from: c */
        private final C1255p.C1257b f4090c;

        /* renamed from: d */
        private final C1255p.C1257b f4091d;

        /* renamed from: e */
        C1255p f4092e;

        /* renamed from: f */
        C1255p f4093f;

        /* renamed from: g */
        C1158a0 f4094g;

        /* renamed from: h */
        boolean f4095h = false;

        /* renamed from: i */
        boolean f4096i = false;

        /* renamed from: j */
        boolean f4097j = false;

        /* renamed from: k */
        private boolean f4098k = true;

        /* renamed from: l */
        private boolean f4099l = true;

        /* renamed from: m */
        int f4100m;

        /* renamed from: n */
        boolean f4101n;

        /* renamed from: o */
        private int f4102o;

        /* renamed from: p */
        private int f4103p;

        /* renamed from: q */
        private int f4104q;

        /* renamed from: r */
        private int f4105r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class C1184a implements C1255p.C1257b {
            C1184a() {
            }

            /* renamed from: a */
            public View mo4637a(int i) {
                return C1183p.this.mo4562I(i);
            }

            /* renamed from: b */
            public int mo4638b() {
                return C1183p.this.mo4614n0() - C1183p.this.mo4595e0();
            }

            /* renamed from: c */
            public int mo4639c(View view) {
                return C1183p.this.mo4572Q(view) - ((C1188q) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: d */
            public int mo4640d() {
                return C1183p.this.mo4592d0();
            }

            /* renamed from: e */
            public int mo4641e(View view) {
                return C1183p.this.mo4575T(view) + ((C1188q) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class C1185b implements C1255p.C1257b {
            C1185b() {
            }

            /* renamed from: a */
            public View mo4637a(int i) {
                return C1183p.this.mo4562I(i);
            }

            /* renamed from: b */
            public int mo4638b() {
                return C1183p.this.mo4579W() - C1183p.this.mo4590c0();
            }

            /* renamed from: c */
            public int mo4639c(View view) {
                return C1183p.this.mo4576U(view) - ((C1188q) view.getLayoutParams()).topMargin;
            }

            /* renamed from: d */
            public int mo4640d() {
                return C1183p.this.mo4597f0();
            }

            /* renamed from: e */
            public int mo4641e(View view) {
                return C1183p.this.mo4569O(view) + ((C1188q) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface C1186c {
            /* renamed from: a */
            void mo4642a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class C1187d {

            /* renamed from: a */
            public int f4108a;

            /* renamed from: b */
            public int f4109b;

            /* renamed from: c */
            public boolean f4110c;

            /* renamed from: d */
            public boolean f4111d;
        }

        public C1183p() {
            C1184a aVar = new C1184a();
            this.f4090c = aVar;
            C1185b bVar = new C1185b();
            this.f4091d = bVar;
            this.f4092e = new C1255p(aVar);
            this.f4093f = new C1255p(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5109K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1183p.m5109K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m5110L(View view, Rect rect) {
            int[] iArr = new int[2];
            int d0 = mo4592d0();
            int f0 = mo4597f0();
            int n0 = mo4614n0() - mo4595e0();
            int W = mo4579W() - mo4590c0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - d0;
            int min = Math.min(0, i);
            int i2 = top - f0;
            int min2 = Math.min(0, i2);
            int i3 = width - n0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo4581Y() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m5111f(View view, int i, boolean z) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (z || f0.mo4478v()) {
                this.f4089b.f3978i.mo4968b(f0);
            } else {
                this.f4089b.f3978i.mo4981p(f0);
            }
            C1188q qVar = (C1188q) view.getLayoutParams();
            if (f0.mo4456L() || f0.mo4479w()) {
                if (f0.mo4479w()) {
                    f0.mo4455K();
                } else {
                    f0.mo4461e();
                }
                this.f4088a.mo4836c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4089b) {
                int m = this.f4088a.mo4844m(view);
                if (i == -1) {
                    i = this.f4088a.mo4840g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4089b.indexOfChild(view) + this.f4089b.mo4252O());
                } else if (m != i) {
                    this.f4089b.f3992p.mo4547A0(m, i);
                }
            } else {
                this.f4088a.mo4834a(view, i, false);
                qVar.f4114c = true;
                C1158a0 a0Var = this.f4094g;
                if (a0Var != null && a0Var.mo4406g()) {
                    this.f4094g.mo4409j(view);
                }
            }
            if (qVar.f4115d) {
                f0.f4049a.invalidate();
                qVar.f4115d = false;
            }
        }

        /* renamed from: h0 */
        public static C1187d m5112h0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1187d dVar = new C1187d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1551c.f6210f, i, i2);
            dVar.f4108a = obtainStyledAttributes.getInt(C1551c.f6211g, 1);
            dVar.f4109b = obtainStyledAttributes.getInt(C1551c.f6221q, 1);
            dVar.f4110c = obtainStyledAttributes.getBoolean(C1551c.f6220p, false);
            dVar.f4111d = obtainStyledAttributes.getBoolean(C1551c.f6222r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m5113n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: s0 */
        private boolean m5114s0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int d0 = mo4592d0();
            int f0 = mo4597f0();
            int n0 = mo4614n0() - mo4595e0();
            int W = mo4579W() - mo4590c0();
            Rect rect = this.f4089b.f3984l;
            mo4570P(focusedChild, rect);
            return rect.left - i < n0 && rect.right - i > d0 && rect.top - i2 < W && rect.bottom - i2 > f0;
        }

        /* renamed from: u1 */
        private void m5115u1(C1195w wVar, int i, View view) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (!f0.mo4454J()) {
                if (!f0.mo4475t() || f0.mo4478v() || this.f4089b.f3990o.mo4496k()) {
                    mo4629x(i);
                    wVar.mo4668D(view);
                    this.f4089b.f3978i.mo4977k(f0);
                    return;
                }
                mo4619p1(i);
                wVar.mo4667C(f0);
            }
        }

        /* renamed from: v0 */
        private static boolean m5116v0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: y */
        private void m5117y(int i, View view) {
            this.f4088a.mo4837d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4546A(RecyclerView recyclerView, C1195w wVar) {
            this.f4096i = false;
            mo4177H0(recyclerView, wVar);
        }

        /* renamed from: A0 */
        public void mo4547A0(int i, int i2) {
            View I = mo4562I(i);
            if (I != null) {
                mo4629x(i);
                mo4601h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4089b.toString());
        }

        /* renamed from: A1 */
        public void mo4136A1(Rect rect, int i, int i2) {
            mo4636z1(m5113n(i, rect.width() + mo4592d0() + mo4595e0(), mo4588b0()), m5113n(i2, rect.height() + mo4597f0() + mo4590c0(), mo4585a0()));
        }

        /* renamed from: B */
        public View mo4548B(View view) {
            View Q;
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView == null || (Q = recyclerView.mo4255Q(view)) == null || this.f4088a.mo4845n(Q)) {
                return null;
            }
            return Q;
        }

        /* renamed from: B0 */
        public void mo4549B0(int i) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                recyclerView.mo4398z0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B1 */
        public void mo4550B1(int i, int i2) {
            int J = mo4563J();
            if (J == 0) {
                this.f4089b.mo4393v(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo4562I(i7);
                Rect rect = this.f4089b.f3984l;
                mo4570P(I, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f4089b.f3984l.set(i4, i5, i3, i6);
            mo4136A1(this.f4089b.f3984l, i, i2);
        }

        /* renamed from: C */
        public View mo4175C(int i) {
            int J = mo4563J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo4562I(i2);
                C1168e0 f0 = RecyclerView.m4853f0(I);
                if (f0 != null && f0.mo4468m() == i && !f0.mo4454J() && (this.f4089b.f3983k0.mo4420e() || !f0.mo4478v())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo4551C0(int i) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                recyclerView.mo4231A0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C1 */
        public void mo4552C1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f4089b = null;
                this.f4088a = null;
                i = 0;
                this.f4104q = 0;
            } else {
                this.f4089b = recyclerView;
                this.f4088a = recyclerView.f3976h;
                this.f4104q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f4105r = i;
            this.f4102o = 1073741824;
            this.f4103p = 1073741824;
        }

        /* renamed from: D */
        public abstract C1188q mo4137D();

        /* renamed from: D0 */
        public void mo4553D0(C1171h hVar, C1171h hVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public boolean mo4554D1(View view, int i, int i2, C1188q qVar) {
            return view.isLayoutRequested() || !this.f4098k || !m5116v0(view.getWidth(), i, qVar.width) || !m5116v0(view.getHeight(), i2, qVar.height);
        }

        /* renamed from: E */
        public C1188q mo4138E(Context context, AttributeSet attributeSet) {
            return new C1188q(context, attributeSet);
        }

        /* renamed from: E0 */
        public boolean mo4555E0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public boolean mo4176E1() {
            return false;
        }

        /* renamed from: F */
        public C1188q mo4139F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1188q ? new C1188q((C1188q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1188q((ViewGroup.MarginLayoutParams) layoutParams) : new C1188q(layoutParams);
        }

        /* renamed from: F0 */
        public void mo4556F0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean mo4557F1(View view, int i, int i2, C1188q qVar) {
            return !this.f4098k || !m5116v0(view.getMeasuredWidth(), i, qVar.width) || !m5116v0(view.getMeasuredHeight(), i2, qVar.height);
        }

        /* renamed from: G */
        public int mo4558G() {
            return -1;
        }

        @Deprecated
        /* renamed from: G0 */
        public void mo4559G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public void mo4560G1() {
            C1158a0 a0Var = this.f4094g;
            if (a0Var != null) {
                a0Var.mo4414o();
            }
        }

        /* renamed from: H */
        public int mo4561H(View view) {
            return ((C1188q) view.getLayoutParams()).f4113b.bottom;
        }

        /* renamed from: H0 */
        public void mo4177H0(RecyclerView recyclerView, C1195w wVar) {
            mo4559G0(recyclerView);
        }

        /* renamed from: H1 */
        public boolean mo4140H1() {
            return false;
        }

        /* renamed from: I */
        public View mo4562I(int i) {
            C1217b bVar = this.f4088a;
            if (bVar != null) {
                return bVar.mo4839f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public View mo4141I0(View view, int i, C1195w wVar, C1162b0 b0Var) {
            return null;
        }

        /* renamed from: J */
        public int mo4563J() {
            C1217b bVar = this.f4088a;
            if (bVar != null) {
                return bVar.mo4840g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public void mo4179J0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4089b;
            mo4564K0(recyclerView.f3970e, recyclerView.f3983k0, accessibilityEvent);
        }

        /* renamed from: K0 */
        public void mo4564K0(C1195w wVar, C1162b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4089b.canScrollVertically(-1) && !this.f4089b.canScrollHorizontally(-1) && !this.f4089b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1171h hVar = this.f4089b.f3990o;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.mo4094g());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L0 */
        public void mo4565L0(C0637g gVar) {
            RecyclerView recyclerView = this.f4089b;
            mo4567M0(recyclerView.f3970e, recyclerView.f3983k0, gVar);
        }

        /* renamed from: M */
        public boolean mo4566M() {
            RecyclerView recyclerView = this.f4089b;
            return recyclerView != null && recyclerView.f3980j;
        }

        /* renamed from: M0 */
        public void mo4567M0(C1195w wVar, C1162b0 b0Var, C0637g gVar) {
            if (this.f4089b.canScrollVertically(-1) || this.f4089b.canScrollHorizontally(-1)) {
                gVar.mo2752a(8192);
                gVar.mo2765h0(true);
            }
            if (this.f4089b.canScrollVertically(1) || this.f4089b.canScrollHorizontally(1)) {
                gVar.mo2752a(4096);
                gVar.mo2765h0(true);
            }
            gVar.mo2747V(C0637g.C0639b.m2590a(mo4155j0(wVar, b0Var), mo4143N(wVar, b0Var), mo4626u0(wVar, b0Var), mo4608k0(wVar, b0Var)));
        }

        /* renamed from: N */
        public int mo4143N(C1195w wVar, C1162b0 b0Var) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void mo4568N0(View view, C0637g gVar) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0 != null && !f0.mo4478v() && !this.f4088a.mo4845n(f0.f4049a)) {
                RecyclerView recyclerView = this.f4089b;
                mo4144O0(recyclerView.f3970e, recyclerView.f3983k0, view, gVar);
            }
        }

        /* renamed from: O */
        public int mo4569O(View view) {
            return view.getBottom() + mo4561H(view);
        }

        /* renamed from: O0 */
        public void mo4144O0(C1195w wVar, C1162b0 b0Var, View view, C0637g gVar) {
        }

        /* renamed from: P */
        public void mo4570P(View view, Rect rect) {
            RecyclerView.m4854g0(view, rect);
        }

        /* renamed from: P0 */
        public View mo4571P0(View view, int i) {
            return null;
        }

        /* renamed from: Q */
        public int mo4572Q(View view) {
            return view.getLeft() - mo4583Z(view);
        }

        /* renamed from: Q0 */
        public void mo4146Q0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: R */
        public int mo4573R(View view) {
            Rect rect = ((C1188q) view.getLayoutParams()).f4113b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo4147R0(RecyclerView recyclerView) {
        }

        /* renamed from: S */
        public int mo4574S(View view) {
            Rect rect = ((C1188q) view.getLayoutParams()).f4113b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo4148S0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: T */
        public int mo4575T(View view) {
            return view.getRight() + mo4604i0(view);
        }

        /* renamed from: T0 */
        public void mo4149T0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: U */
        public int mo4576U(View view) {
            return view.getTop() - mo4610l0(view);
        }

        /* renamed from: U0 */
        public void mo4577U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo4578V() {
            View focusedChild;
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4088a.mo4845n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo4150V0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4577U0(recyclerView, i, i2);
        }

        /* renamed from: W */
        public int mo4579W() {
            return this.f4105r;
        }

        /* renamed from: W0 */
        public void mo4151W0(C1195w wVar, C1162b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: X */
        public int mo4580X() {
            return this.f4103p;
        }

        /* renamed from: X0 */
        public void mo4153X0(C1162b0 b0Var) {
        }

        /* renamed from: Y */
        public int mo4581Y() {
            return C0727l0.m2916u(this.f4089b);
        }

        /* renamed from: Y0 */
        public void mo4582Y0(C1195w wVar, C1162b0 b0Var, int i, int i2) {
            this.f4089b.mo4393v(i, i2);
        }

        /* renamed from: Z */
        public int mo4583Z(View view) {
            return ((C1188q) view.getLayoutParams()).f4113b.left;
        }

        @Deprecated
        /* renamed from: Z0 */
        public boolean mo4584Z0(RecyclerView recyclerView, View view, View view2) {
            return mo4628w0() || recyclerView.mo4391u0();
        }

        /* renamed from: a0 */
        public int mo4585a0() {
            return C0727l0.m2917v(this.f4089b);
        }

        /* renamed from: a1 */
        public boolean mo4586a1(RecyclerView recyclerView, C1162b0 b0Var, View view, View view2) {
            return mo4584Z0(recyclerView, view, view2);
        }

        /* renamed from: b */
        public void mo4587b(View view) {
            mo4589c(view, -1);
        }

        /* renamed from: b0 */
        public int mo4588b0() {
            return C0727l0.m2918w(this.f4089b);
        }

        /* renamed from: b1 */
        public void mo4191b1(Parcelable parcelable) {
        }

        /* renamed from: c */
        public void mo4589c(View view, int i) {
            m5111f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo4590c0() {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: c1 */
        public Parcelable mo4192c1() {
            return null;
        }

        /* renamed from: d */
        public void mo4591d(View view) {
            mo4594e(view, -1);
        }

        /* renamed from: d0 */
        public int mo4592d0() {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: d1 */
        public void mo4593d1(int i) {
        }

        /* renamed from: e */
        public void mo4594e(View view, int i) {
            m5111f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo4595e0() {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e1 */
        public void mo4596e1(C1158a0 a0Var) {
            if (this.f4094g == a0Var) {
                this.f4094g = null;
            }
        }

        /* renamed from: f0 */
        public int mo4597f0() {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public boolean mo4598f1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4089b;
            return mo4600g1(recyclerView.f3970e, recyclerView.f3983k0, i, bundle);
        }

        /* renamed from: g */
        public void mo4193g(String str) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                recyclerView.mo4332n(str);
            }
        }

        /* renamed from: g0 */
        public int mo4599g0(View view) {
            return ((C1188q) view.getLayoutParams()).mo4643a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: g1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4600g1(androidx.recyclerview.widget.RecyclerView.C1195w r8, androidx.recyclerview.widget.RecyclerView.C1162b0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f4089b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo4579W()
                int r11 = r7.mo4597f0()
                int r8 = r8 - r11
                int r11 = r7.mo4590c0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f4089b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4614n0()
                int r11 = r7.mo4592d0()
                int r10 = r10 - r11
                int r11 = r7.mo4595e0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo4579W()
                int r10 = r7.mo4597f0()
                int r8 = r8 - r10
                int r10 = r7.mo4590c0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = r9
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f4089b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4614n0()
                int r11 = r7.mo4592d0()
                int r10 = r10 - r11
                int r11 = r7.mo4595e0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = r9
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f4089b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo4334n1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1183p.mo4600g1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
        }

        /* renamed from: h */
        public void mo4601h(View view, int i) {
            mo4603i(view, i, (C1188q) view.getLayoutParams());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h1 */
        public boolean mo4602h1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4089b;
            return mo4605i1(recyclerView.f3970e, recyclerView.f3983k0, view, i, bundle);
        }

        /* renamed from: i */
        public void mo4603i(View view, int i, C1188q qVar) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0.mo4478v()) {
                this.f4089b.f3978i.mo4968b(f0);
            } else {
                this.f4089b.f3978i.mo4981p(f0);
            }
            this.f4088a.mo4836c(view, i, qVar, f0.mo4478v());
        }

        /* renamed from: i0 */
        public int mo4604i0(View view) {
            return ((C1188q) view.getLayoutParams()).f4113b.right;
        }

        /* renamed from: i1 */
        public boolean mo4605i1(C1195w wVar, C1162b0 b0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: j */
        public void mo4606j(View view, Rect rect) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4324j0(view));
            }
        }

        /* renamed from: j0 */
        public int mo4155j0(C1195w wVar, C1162b0 b0Var) {
            return -1;
        }

        /* renamed from: j1 */
        public void mo4607j1(C1195w wVar) {
            for (int J = mo4563J() - 1; J >= 0; J--) {
                if (!RecyclerView.m4853f0(mo4562I(J)).mo4454J()) {
                    mo4613m1(J, wVar);
                }
            }
        }

        /* renamed from: k */
        public boolean mo4198k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo4608k0(C1195w wVar, C1162b0 b0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k1 */
        public void mo4609k1(C1195w wVar) {
            int j = wVar.mo4685j();
            for (int i = j - 1; i >= 0; i--) {
                View n = wVar.mo4689n(i);
                C1168e0 f0 = RecyclerView.m4853f0(n);
                if (!f0.mo4454J()) {
                    f0.mo4451G(false);
                    if (f0.mo4480x()) {
                        this.f4089b.removeDetachedView(n, false);
                    }
                    C1177m mVar = this.f4089b.f3958Q;
                    if (mVar != null) {
                        mVar.mo4525j(f0);
                    }
                    f0.mo4451G(true);
                    wVar.mo4698y(n);
                }
            }
            wVar.mo4680e();
            if (j > 0) {
                this.f4089b.invalidate();
            }
        }

        /* renamed from: l */
        public boolean mo4199l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo4610l0(View view) {
            return ((C1188q) view.getLayoutParams()).f4113b.top;
        }

        /* renamed from: l1 */
        public void mo4611l1(View view, C1195w wVar) {
            mo4617o1(view);
            wVar.mo4666B(view);
        }

        /* renamed from: m */
        public boolean mo4157m(C1188q qVar) {
            return qVar != null;
        }

        /* renamed from: m0 */
        public void mo4612m0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1188q) view.getLayoutParams()).f4113b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f4089b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f4089b.f3988n;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: m1 */
        public void mo4613m1(int i, C1195w wVar) {
            View I = mo4562I(i);
            mo4619p1(i);
            wVar.mo4666B(I);
        }

        /* renamed from: n0 */
        public int mo4614n0() {
            return this.f4104q;
        }

        /* renamed from: n1 */
        public boolean mo4615n1(Runnable runnable) {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: o */
        public void mo4200o(int i, int i2, C1162b0 b0Var, C1186c cVar) {
        }

        /* renamed from: o0 */
        public int mo4616o0() {
            return this.f4102o;
        }

        /* renamed from: o1 */
        public void mo4617o1(View view) {
            this.f4088a.mo4847p(view);
        }

        /* renamed from: p */
        public void mo4201p(int i, C1186c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p0 */
        public boolean mo4618p0() {
            int J = mo4563J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = mo4562I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: p1 */
        public void mo4619p1(int i) {
            if (mo4562I(i) != null) {
                this.f4088a.mo4848q(i);
            }
        }

        /* renamed from: q */
        public int mo4202q(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: q0 */
        public boolean mo4620q0() {
            return this.f4096i;
        }

        /* renamed from: q1 */
        public boolean mo4621q1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4622r1(recyclerView, view, rect, z, false);
        }

        /* renamed from: r */
        public int mo4159r(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo4203r0() {
            return this.f4097j;
        }

        /* renamed from: r1 */
        public boolean mo4622r1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m5110L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m5114s0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4327k1(i, i2);
            }
            return true;
        }

        /* renamed from: s */
        public int mo4160s(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: s1 */
        public void mo4623s1() {
            RecyclerView recyclerView = this.f4089b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: t */
        public int mo4205t(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: t0 */
        public final boolean mo4624t0() {
            return this.f4099l;
        }

        /* renamed from: t1 */
        public void mo4625t1() {
            this.f4095h = true;
        }

        /* renamed from: u */
        public int mo4161u(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public boolean mo4626u0(C1195w wVar, C1162b0 b0Var) {
            return false;
        }

        /* renamed from: v */
        public int mo4162v(C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: v1 */
        public int mo4163v1(int i, C1195w wVar, C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: w */
        public void mo4627w(C1195w wVar) {
            for (int J = mo4563J() - 1; J >= 0; J--) {
                m5115u1(wVar, J, mo4562I(J));
            }
        }

        /* renamed from: w0 */
        public boolean mo4628w0() {
            C1158a0 a0Var = this.f4094g;
            return a0Var != null && a0Var.mo4406g();
        }

        /* renamed from: w1 */
        public int mo4164w1(int i, C1195w wVar, C1162b0 b0Var) {
            return 0;
        }

        /* renamed from: x */
        public void mo4629x(int i) {
            m5117y(i, mo4562I(i));
        }

        /* renamed from: x0 */
        public boolean mo4630x0(View view, boolean z, boolean z2) {
            boolean z3 = this.f4092e.mo4961b(view, 24579) && this.f4093f.mo4961b(view, 24579);
            return z ? z3 : !z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x1 */
        public void mo4631x1(RecyclerView recyclerView) {
            mo4633y1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: y0 */
        public void mo4632y0(View view, int i, int i2, int i3, int i4) {
            C1188q qVar = (C1188q) view.getLayoutParams();
            Rect rect = qVar.f4113b;
            view.layout(i + rect.left + qVar.leftMargin, i2 + rect.top + qVar.topMargin, (i3 - rect.right) - qVar.rightMargin, (i4 - rect.bottom) - qVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y1 */
        public void mo4633y1(int i, int i2) {
            this.f4104q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4102o = mode;
            if (mode == 0 && !RecyclerView.f3931G0) {
                this.f4104q = 0;
            }
            this.f4105r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4103p = mode2;
            if (mode2 == 0 && !RecyclerView.f3931G0) {
                this.f4105r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4634z(RecyclerView recyclerView) {
            this.f4096i = true;
            mo4556F0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo4635z0(View view, int i, int i2) {
            C1188q qVar = (C1188q) view.getLayoutParams();
            Rect j0 = this.f4089b.mo4324j0(view);
            int i3 = i + j0.left + j0.right;
            int i4 = i2 + j0.top + j0.bottom;
            int K = m5109K(mo4614n0(), mo4616o0(), mo4592d0() + mo4595e0() + qVar.leftMargin + qVar.rightMargin + i3, qVar.width, mo4198k());
            int K2 = m5109K(mo4579W(), mo4580X(), mo4597f0() + mo4590c0() + qVar.topMargin + qVar.bottomMargin + i4, qVar.height, mo4199l());
            if (mo4554D1(view, K, K2, qVar)) {
                view.measure(K, K2);
            }
        }

        /* renamed from: z1 */
        public void mo4636z1(int i, int i2) {
            this.f4089b.setMeasuredDimension(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C1188q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1168e0 f4112a;

        /* renamed from: b */
        final Rect f4113b = new Rect();

        /* renamed from: c */
        boolean f4114c = true;

        /* renamed from: d */
        boolean f4115d = false;

        public C1188q(int i, int i2) {
            super(i, i2);
        }

        public C1188q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1188q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1188q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1188q(C1188q qVar) {
            super(qVar);
        }

        /* renamed from: a */
        public int mo4643a() {
            return this.f4112a.mo4468m();
        }

        /* renamed from: b */
        public boolean mo4644b() {
            return this.f4112a.mo4481y();
        }

        /* renamed from: c */
        public boolean mo4645c() {
            return this.f4112a.mo4478v();
        }

        /* renamed from: d */
        public boolean mo4646d() {
            return this.f4112a.mo4475t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public interface C1189r {
        /* renamed from: a */
        void mo4647a(View view);

        /* renamed from: b */
        void mo4648b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static abstract class C1190s {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface C1191t {
        /* renamed from: a */
        boolean mo4649a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4650b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4651c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static abstract class C1192u {
        /* renamed from: a */
        public void mo4652a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4653b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C1193v {

        /* renamed from: a */
        SparseArray<C1194a> f4116a = new SparseArray<>();

        /* renamed from: b */
        private int f4117b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        static class C1194a {

            /* renamed from: a */
            final ArrayList<C1168e0> f4118a = new ArrayList<>();

            /* renamed from: b */
            int f4119b = 5;

            /* renamed from: c */
            long f4120c = 0;

            /* renamed from: d */
            long f4121d = 0;

            C1194a() {
            }
        }

        /* renamed from: g */
        private C1194a m5268g(int i) {
            C1194a aVar = this.f4116a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1194a aVar2 = new C1194a();
            this.f4116a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4654a() {
            this.f4117b++;
        }

        /* renamed from: b */
        public void mo4655b() {
            for (int i = 0; i < this.f4116a.size(); i++) {
                this.f4116a.valueAt(i).f4118a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4656c() {
            this.f4117b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4657d(int i, long j) {
            C1194a g = m5268g(i);
            g.f4121d = mo4662j(g.f4121d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4658e(int i, long j) {
            C1194a g = m5268g(i);
            g.f4120c = mo4662j(g.f4120c, j);
        }

        /* renamed from: f */
        public C1168e0 mo4659f(int i) {
            C1194a aVar = this.f4116a.get(i);
            if (aVar == null || aVar.f4118a.isEmpty()) {
                return null;
            }
            ArrayList<C1168e0> arrayList = aVar.f4118a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo4473r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4660h(C1171h hVar, C1171h hVar2, boolean z) {
            if (hVar != null) {
                mo4656c();
            }
            if (!z && this.f4117b == 0) {
                mo4655b();
            }
            if (hVar2 != null) {
                mo4654a();
            }
        }

        /* renamed from: i */
        public void mo4661i(C1168e0 e0Var) {
            int l = e0Var.mo4467l();
            ArrayList<C1168e0> arrayList = m5268g(l).f4118a;
            if (this.f4116a.get(l).f4119b > arrayList.size()) {
                e0Var.mo4448D();
                arrayList.add(e0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4662j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4663k(int i, long j, long j2) {
            long j3 = m5268g(i).f4121d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4664l(int i, long j, long j2) {
            long j3 = m5268g(i).f4120c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C1195w {

        /* renamed from: a */
        final ArrayList<C1168e0> f4122a;

        /* renamed from: b */
        ArrayList<C1168e0> f4123b = null;

        /* renamed from: c */
        final ArrayList<C1168e0> f4124c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1168e0> f4125d;

        /* renamed from: e */
        private int f4126e;

        /* renamed from: f */
        int f4127f;

        /* renamed from: g */
        C1193v f4128g;

        public C1195w() {
            ArrayList<C1168e0> arrayList = new ArrayList<>();
            this.f4122a = arrayList;
            this.f4125d = Collections.unmodifiableList(arrayList);
            this.f4126e = 2;
            this.f4127f = 2;
        }

        /* renamed from: H */
        private boolean m5280H(C1168e0 e0Var, int i, int i2, long j) {
            e0Var.f4067s = null;
            e0Var.f4066r = RecyclerView.this;
            int l = e0Var.mo4467l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f4128g.mo4663k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3990o.mo4492d(e0Var, i);
            this.f4128g.mo4657d(e0Var.mo4467l(), RecyclerView.this.getNanoTime() - nanoTime);
            m5281b(e0Var);
            if (!RecyclerView.this.f3983k0.mo4420e()) {
                return true;
            }
            e0Var.f4055g = i2;
            return true;
        }

        /* renamed from: b */
        private void m5281b(C1168e0 e0Var) {
            if (RecyclerView.this.mo4390t0()) {
                View view = e0Var.f4049a;
                if (C0727l0.m2913s(view) == 0) {
                    C0727l0.m2892h0(view, 1);
                }
                C1247j jVar = RecyclerView.this.f3997r0;
                if (jVar != null) {
                    C0624a n = jVar.mo4129n();
                    if (n instanceof C1247j.C1248a) {
                        ((C1247j.C1248a) n).mo4942o(view);
                    }
                    C0727l0.m2875Y(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m5282q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5282q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m5283r(C1168e0 e0Var) {
            View view = e0Var.f4049a;
            if (view instanceof ViewGroup) {
                m5282q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4665A(int i) {
            mo4677a(this.f4124c.get(i), true);
            this.f4124c.remove(i);
        }

        /* renamed from: B */
        public void mo4666B(View view) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (f0.mo4480x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0.mo4479w()) {
                f0.mo4455K();
            } else if (f0.mo4456L()) {
                f0.mo4461e();
            }
            mo4667C(f0);
            if (RecyclerView.this.f3958Q != null && !f0.mo4477u()) {
                RecyclerView.this.f3958Q.mo4525j(f0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4667C(C1168e0 e0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (e0Var.mo4479w() || e0Var.f4049a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.mo4479w());
                sb.append(" isAttached:");
                if (e0Var.f4049a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4252O());
                throw new IllegalArgumentException(sb.toString());
            } else if (e0Var.mo4480x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.mo4252O());
            } else if (!e0Var.mo4454J()) {
                boolean h = e0Var.mo4463h();
                C1171h hVar = RecyclerView.this.f3990o;
                if ((hVar != null && h && hVar.mo4502s(e0Var)) || e0Var.mo4477u()) {
                    if (this.f4127f <= 0 || e0Var.mo4471p(526)) {
                        z = false;
                    } else {
                        int size = this.f4124c.size();
                        if (size >= this.f4127f && size > 0) {
                            mo4665A(0);
                            size--;
                        }
                        if (RecyclerView.f3933I0 && size > 0 && !RecyclerView.this.f3981j0.mo4906d(e0Var.f4051c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3981j0.mo4906d(this.f4124c.get(i).f4051c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4124c.add(size, e0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4677a(e0Var, true);
                    } else {
                        z3 = false;
                    }
                    z2 = z;
                } else {
                    z3 = false;
                }
                RecyclerView.this.f3978i.mo4982q(e0Var);
                if (!z2 && !z3 && h) {
                    e0Var.f4067s = null;
                    e0Var.f4066r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo4252O());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4668D(View view) {
            ArrayList<C1168e0> arrayList;
            C1168e0 f0 = RecyclerView.m4853f0(view);
            if (!f0.mo4471p(12) && f0.mo4481y() && !RecyclerView.this.mo4335o(f0)) {
                if (this.f4123b == null) {
                    this.f4123b = new ArrayList<>();
                }
                f0.mo4452H(this, true);
                arrayList = this.f4123b;
            } else if (!f0.mo4475t() || f0.mo4478v() || RecyclerView.this.f3990o.mo4496k()) {
                f0.mo4452H(this, false);
                arrayList = this.f4122a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo4252O());
            }
            arrayList.add(f0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4669E(C1193v vVar) {
            C1193v vVar2 = this.f4128g;
            if (vVar2 != null) {
                vVar2.mo4656c();
            }
            this.f4128g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f4128g.mo4654a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4670F(C1164c0 c0Var) {
        }

        /* renamed from: G */
        public void mo4671G(int i) {
            this.f4126e = i;
            mo4674K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01b7  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1168e0 mo4672I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01d3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f3983k0
                int r1 = r1.mo4417b()
                if (r3 >= r1) goto L_0x01d3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f3983k0
                boolean r1 = r1.mo4420e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.mo4683h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.mo4688m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4675L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4458b(r5)
                boolean r5 = r1.mo4479w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f4049a
                r5.removeDetachedView(r9, r8)
                r1.mo4455K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4456L()
                if (r5 == 0) goto L_0x0057
                r1.mo4461e()
            L_0x0057:
                r6.mo4667C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3974g
                int r5 = r5.mo4821m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3990o
                int r9 = r9.mo4094g()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3990o
                int r9 = r9.mo4096i(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f3990o
                boolean r10 = r10.mo4496k()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f3990o
                long r10 = r1.mo4095h(r5)
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r6.mo4687l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f4051c = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.mo4684i()
                androidx.recyclerview.widget.RecyclerView$e0 r0 = r0.mo4659f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.mo4448D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3930F0
                if (r1 == 0) goto L_0x00ac
                r6.m5283r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f4128g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4664l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f3990o
                androidx.recyclerview.widget.RecyclerView$e0 r2 = r5.mo4494f(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3933I0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.f4049a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4842U(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f4050b = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f4128g
                long r10 = r10 - r0
                r5.mo4658e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f3983k0
                int r2 = r2.mo4417b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4252O()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3983k0
                boolean r0 = r0.mo4420e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo4471p(r0)
                if (r1 == 0) goto L_0x0166
                r9.mo4450F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3983k0
                boolean r0 = r0.f4032k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1177m.m5076e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f3958Q
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f3983k0
                java.util.List r4 = r9.mo4470o()
                androidx.recyclerview.widget.RecyclerView$m$c r0 = r2.mo4535t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4257R0(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3983k0
                boolean r0 = r0.mo4420e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.mo4474s()
                if (r0 == 0) goto L_0x0179
                r9.f4055g = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.mo4474s()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.mo4482z()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.mo4475t()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = r8
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3974g
                int r2 = r0.mo4821m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m5280H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.f4049a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x01af:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.C1188q) r1
                android.view.View r2 = r9.f4049a
                r2.setLayoutParams(r1)
                goto L_0x01c8
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x01af
            L_0x01c6:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.C1188q) r1
            L_0x01c8:
                r1.f4112a = r9
                if (r10 == 0) goto L_0x01cf
                if (r0 == 0) goto L_0x01cf
                goto L_0x01d0
            L_0x01cf:
                r7 = r8
            L_0x01d0:
                r1.f4115d = r7
                return r9
            L_0x01d3:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f3983k0
                int r2 = r2.mo4417b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4252O()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1195w.mo4672I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4673J(C1168e0 e0Var) {
            (e0Var.f4063o ? this.f4123b : this.f4122a).remove(e0Var);
            e0Var.f4062n = null;
            e0Var.f4063o = false;
            e0Var.mo4461e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4674K() {
            C1183p pVar = RecyclerView.this.f3992p;
            this.f4127f = this.f4126e + (pVar != null ? pVar.f4100m : 0);
            for (int size = this.f4124c.size() - 1; size >= 0 && this.f4124c.size() > this.f4127f; size--) {
                mo4665A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4675L(C1168e0 e0Var) {
            if (e0Var.mo4478v()) {
                return RecyclerView.this.f3983k0.mo4420e();
            }
            int i = e0Var.f4051c;
            if (i < 0 || i >= RecyclerView.this.f3990o.mo4094g()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.mo4252O());
            } else if (!RecyclerView.this.f3983k0.mo4420e() && RecyclerView.this.f3990o.mo4096i(e0Var.f4051c) != e0Var.mo4467l()) {
                return false;
            } else {
                if (RecyclerView.this.f3990o.mo4496k()) {
                    return e0Var.mo4466k() == RecyclerView.this.f3990o.mo4095h(e0Var.f4051c);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4676M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4124c.size() - 1; size >= 0; size--) {
                C1168e0 e0Var = this.f4124c.get(size);
                if (e0Var != null && (i3 = e0Var.f4051c) >= i && i3 < i4) {
                    e0Var.mo4458b(2);
                    mo4665A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4677a(C1168e0 e0Var, boolean z) {
            RecyclerView.m4864q(e0Var);
            View view = e0Var.f4049a;
            C1247j jVar = RecyclerView.this.f3997r0;
            if (jVar != null) {
                C0624a n = jVar.mo4129n();
                C0727l0.m2875Y(view, n instanceof C1247j.C1248a ? ((C1247j.C1248a) n).mo4941n(view) : null);
            }
            if (z) {
                mo4682g(e0Var);
            }
            e0Var.f4067s = null;
            e0Var.f4066r = null;
            mo4684i().mo4661i(e0Var);
        }

        /* renamed from: c */
        public void mo4678c() {
            this.f4122a.clear();
            mo4699z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4679d() {
            int size = this.f4124c.size();
            for (int i = 0; i < size; i++) {
                this.f4124c.get(i).mo4459c();
            }
            int size2 = this.f4122a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4122a.get(i2).mo4459c();
            }
            ArrayList<C1168e0> arrayList = this.f4123b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4123b.get(i3).mo4459c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4680e() {
            this.f4122a.clear();
            ArrayList<C1168e0> arrayList = this.f4123b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo4681f(int i) {
            if (i >= 0 && i < RecyclerView.this.f3983k0.mo4417b()) {
                return !RecyclerView.this.f3983k0.mo4420e() ? i : RecyclerView.this.f3974g.mo4821m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f3983k0.mo4417b() + RecyclerView.this.mo4252O());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4682g(C1168e0 e0Var) {
            C1196x xVar = RecyclerView.this.f3994q;
            if (xVar != null) {
                xVar.mo4700a(e0Var);
            }
            int size = RecyclerView.this.f3996r.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f3996r.get(i).mo4700a(e0Var);
            }
            C1171h hVar = RecyclerView.this.f3990o;
            if (hVar != null) {
                hVar.mo4505v(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3983k0 != null) {
                recyclerView.f3978i.mo4982q(e0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1168e0 mo4683h(int i) {
            int size;
            int m;
            ArrayList<C1168e0> arrayList = this.f4123b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1168e0 e0Var = this.f4123b.get(i3);
                    if (e0Var.mo4456L() || e0Var.mo4468m() != i) {
                        i3++;
                    } else {
                        e0Var.mo4458b(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.f3990o.mo4496k() && (m = RecyclerView.this.f3974g.mo4821m(i)) > 0 && m < RecyclerView.this.f3990o.mo4094g()) {
                    long h = RecyclerView.this.f3990o.mo4095h(m);
                    while (i2 < size) {
                        C1168e0 e0Var2 = this.f4123b.get(i2);
                        if (e0Var2.mo4456L() || e0Var2.mo4466k() != h) {
                            i2++;
                        } else {
                            e0Var2.mo4458b(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1193v mo4684i() {
            if (this.f4128g == null) {
                this.f4128g = new C1193v();
            }
            return this.f4128g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4685j() {
            return this.f4122a.size();
        }

        /* renamed from: k */
        public List<C1168e0> mo4686k() {
            return this.f4125d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1168e0 mo4687l(long j, int i, boolean z) {
            for (int size = this.f4122a.size() - 1; size >= 0; size--) {
                C1168e0 e0Var = this.f4122a.get(size);
                if (e0Var.mo4466k() == j && !e0Var.mo4456L()) {
                    if (i == e0Var.mo4467l()) {
                        e0Var.mo4458b(32);
                        if (e0Var.mo4478v() && !RecyclerView.this.f3983k0.mo4420e()) {
                            e0Var.mo4450F(2, 14);
                        }
                        return e0Var;
                    } else if (!z) {
                        this.f4122a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.f4049a, false);
                        mo4698y(e0Var.f4049a);
                    }
                }
            }
            int size2 = this.f4124c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1168e0 e0Var2 = this.f4124c.get(size2);
                if (e0Var2.mo4466k() == j && !e0Var2.mo4473r()) {
                    if (i == e0Var2.mo4467l()) {
                        if (!z) {
                            this.f4124c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z) {
                        mo4665A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1168e0 mo4688m(int i, boolean z) {
            View e;
            int size = this.f4122a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1168e0 e0Var = this.f4122a.get(i3);
                if (e0Var.mo4456L() || e0Var.mo4468m() != i || e0Var.mo4475t() || (!RecyclerView.this.f3983k0.f4029h && e0Var.mo4478v())) {
                    i3++;
                } else {
                    e0Var.mo4458b(32);
                    return e0Var;
                }
            }
            if (z || (e = RecyclerView.this.f3976h.mo4838e(i)) == null) {
                int size2 = this.f4124c.size();
                while (i2 < size2) {
                    C1168e0 e0Var2 = this.f4124c.get(i2);
                    if (e0Var2.mo4475t() || e0Var2.mo4468m() != i || e0Var2.mo4473r()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f4124c.remove(i2);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            C1168e0 f0 = RecyclerView.m4853f0(e);
            RecyclerView.this.f3976h.mo4850s(e);
            int m = RecyclerView.this.f3976h.mo4844m(e);
            if (m != -1) {
                RecyclerView.this.f3976h.mo4837d(m);
                mo4668D(e);
                f0.mo4458b(8224);
                return f0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0 + RecyclerView.this.mo4252O());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo4689n(int i) {
            return this.f4122a.get(i).f4049a;
        }

        /* renamed from: o */
        public View mo4690o(int i) {
            return mo4691p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo4691p(int i, boolean z) {
            return mo4672I(i, z, Long.MAX_VALUE).f4049a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4692s() {
            int size = this.f4124c.size();
            for (int i = 0; i < size; i++) {
                C1188q qVar = (C1188q) this.f4124c.get(i).f4049a.getLayoutParams();
                if (qVar != null) {
                    qVar.f4114c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4693t() {
            int size = this.f4124c.size();
            for (int i = 0; i < size; i++) {
                C1168e0 e0Var = this.f4124c.get(i);
                if (e0Var != null) {
                    e0Var.mo4458b(6);
                    e0Var.mo4457a((Object) null);
                }
            }
            C1171h hVar = RecyclerView.this.f3990o;
            if (hVar == null || !hVar.mo4496k()) {
                mo4699z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4694u(int i, int i2) {
            int size = this.f4124c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1168e0 e0Var = this.f4124c.get(i3);
                if (e0Var != null && e0Var.f4051c >= i) {
                    e0Var.mo4445A(i2, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4695v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f4124c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1168e0 e0Var = this.f4124c.get(i7);
                if (e0Var != null && (i6 = e0Var.f4051c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        e0Var.mo4445A(i2 - i, false);
                    } else {
                        e0Var.mo4445A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4696w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4124c.size() - 1; size >= 0; size--) {
                C1168e0 e0Var = this.f4124c.get(size);
                if (e0Var != null) {
                    int i4 = e0Var.f4051c;
                    if (i4 >= i3) {
                        e0Var.mo4445A(-i2, z);
                    } else if (i4 >= i) {
                        e0Var.mo4458b(8);
                        mo4665A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo4697x(C1171h hVar, C1171h hVar2, boolean z) {
            mo4678c();
            mo4684i().mo4660h(hVar, hVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4698y(View view) {
            C1168e0 f0 = RecyclerView.m4853f0(view);
            f0.f4062n = null;
            f0.f4063o = false;
            f0.mo4461e();
            mo4667C(f0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4699z() {
            for (int size = this.f4124c.size() - 1; size >= 0; size--) {
                mo4665A(size);
            }
            this.f4124c.clear();
            if (RecyclerView.f3933I0) {
                RecyclerView.this.f3981j0.mo4904b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface C1196x {
        /* renamed from: a */
        void mo4700a(C1168e0 e0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    private class C1197y extends C1174j {
        C1197y() {
        }

        /* renamed from: a */
        public void mo4512a() {
            RecyclerView.this.mo4332n((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3983k0.f4028g = true;
            recyclerView.mo4254P0(true);
            if (!RecyclerView.this.f3974g.mo4824p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo4514c(int i, int i2, Object obj) {
            RecyclerView.this.mo4332n((String) null);
            if (RecyclerView.this.f3974g.mo4826r(i, i2, obj)) {
                mo4701d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4701d() {
            if (RecyclerView.f3932H0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4006w && recyclerView.f4004v) {
                    C0727l0.m2870T(recyclerView, recyclerView.f3982k);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3946E = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C1198z extends C2871a {
        public static final Parcelable.Creator<C1198z> CREATOR = new C1199a();

        /* renamed from: f */
        Parcelable f4131f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        class C1199a implements Parcelable.ClassLoaderCreator<C1198z> {
            C1199a() {
            }

            /* renamed from: a */
            public C1198z createFromParcel(Parcel parcel) {
                return new C1198z(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1198z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1198z(parcel, classLoader);
            }

            /* renamed from: c */
            public C1198z[] newArray(int i) {
                return new C1198z[i];
            }
        }

        C1198z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4131f = parcel.readParcelable(classLoader == null ? C1183p.class.getClassLoader() : classLoader);
        }

        C1198z(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4702b(C1198z zVar) {
            this.f4131f = zVar.f4131f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4131f, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f3929E0 = r1
            f3930F0 = r3
            f3931G0 = r0
            f3932H0 = r0
            f3933I0 = r0
            f3934J0 = r3
            f3935K0 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f3936L0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f3937M0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1549a.f6201a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f3968d = new C1197y();
        this.f3970e = new C1195w();
        this.f3978i = new C1258q();
        this.f3982k = new C1157a();
        this.f3984l = new Rect();
        this.f3986m = new Rect();
        this.f3988n = new RectF();
        this.f3996r = new ArrayList();
        this.f3998s = new ArrayList<>();
        this.f4000t = new ArrayList<>();
        this.f4012z = 0;
        this.f3949H = false;
        this.f3950I = false;
        this.f3951J = 0;
        this.f3952K = 0;
        this.f3953L = new C1176l();
        this.f3958Q = new C1220c();
        this.f3959R = 0;
        this.f3960S = -1;
        this.f3971e0 = Float.MIN_VALUE;
        this.f3973f0 = Float.MIN_VALUE;
        this.f3975g0 = true;
        this.f3977h0 = new C1166d0();
        this.f3981j0 = f3933I0 ? new C1236e.C1238b() : null;
        this.f3983k0 = new C1162b0();
        this.f3989n0 = false;
        this.f3991o0 = false;
        this.f3993p0 = new C1181n();
        this.f3995q0 = false;
        this.f4001t0 = new int[2];
        this.f4005v0 = new int[2];
        this.f4007w0 = new int[2];
        this.f4009x0 = new int[2];
        this.f4011y0 = new ArrayList();
        this.f4013z0 = new C1161b();
        this.f3941B0 = 0;
        this.f3943C0 = 0;
        this.f3945D0 = new C1165d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3966b0 = viewConfiguration.getScaledTouchSlop();
        this.f3971e0 = C0783v1.m3106b(viewConfiguration, context2);
        this.f3973f0 = C0783v1.m3108d(viewConfiguration, context2);
        this.f3967c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3969d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3958Q.mo4537v(this.f3993p0);
        mo4333n0();
        m4863p0();
        m4861o0();
        if (C0727l0.m2913s(this) == 0) {
            C0727l0.m2892h0(this, 1);
        }
        this.f3947F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1247j(this));
        int[] iArr = C1551c.f6210f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C0727l0.m2873W(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C1551c.f6219o);
        if (obtainStyledAttributes.getInt(C1551c.f6213i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3980j = obtainStyledAttributes.getBoolean(C1551c.f6212h, true);
        boolean z = obtainStyledAttributes.getBoolean(C1551c.f6214j, false);
        this.f4008x = z;
        if (z) {
            mo4350q0((StateListDrawable) obtainStyledAttributes.getDrawable(C1551c.f6217m), obtainStyledAttributes.getDrawable(C1551c.f6218n), (StateListDrawable) obtainStyledAttributes.getDrawable(C1551c.f6215k), obtainStyledAttributes.getDrawable(C1551c.f6216l));
        }
        obtainStyledAttributes.recycle();
        m4866u(context, string, attributeSet, i, 0);
        int[] iArr2 = f3929E0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        C0727l0.m2873W(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: B */
    private void m4830B() {
        boolean z = true;
        this.f3983k0.mo4416a(1);
        mo4253P(this.f3983k0);
        this.f3983k0.f4031j = false;
        mo4336o1();
        this.f3978i.mo4972f();
        mo4240G0();
        m4836O0();
        m4850d1();
        C1162b0 b0Var = this.f3983k0;
        if (!b0Var.f4032k || !this.f3991o0) {
            z = false;
        }
        b0Var.f4030i = z;
        this.f3991o0 = false;
        this.f3989n0 = false;
        b0Var.f4029h = b0Var.f4033l;
        b0Var.f4027f = this.f3990o.mo4094g();
        m4840T(this.f4001t0);
        if (this.f3983k0.f4032k) {
            int g = this.f3976h.mo4840g();
            for (int i = 0; i < g; i++) {
                C1168e0 f0 = m4853f0(this.f3976h.mo4839f(i));
                if (!f0.mo4454J() && (!f0.mo4475t() || this.f3990o.mo4496k())) {
                    this.f3978i.mo4971e(f0, this.f3958Q.mo4535t(this.f3983k0, f0, C1177m.m5076e(f0), f0.mo4470o()));
                    if (this.f3983k0.f4030i && f0.mo4481y() && !f0.mo4478v() && !f0.mo4454J() && !f0.mo4475t()) {
                        this.f3978i.mo4969c(mo4271b0(f0), f0);
                    }
                }
            }
        }
        if (this.f3983k0.f4033l) {
            mo4291e1();
            C1162b0 b0Var2 = this.f3983k0;
            boolean z2 = b0Var2.f4028g;
            b0Var2.f4028g = false;
            this.f3992p.mo4151W0(this.f3970e, b0Var2);
            this.f3983k0.f4028g = z2;
            for (int i2 = 0; i2 < this.f3976h.mo4840g(); i2++) {
                C1168e0 f02 = m4853f0(this.f3976h.mo4839f(i2));
                if (!f02.mo4454J() && !this.f3978i.mo4975i(f02)) {
                    int e = C1177m.m5076e(f02);
                    boolean p = f02.mo4471p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C1177m.C1180c t = this.f3958Q.mo4535t(this.f3983k0, f02, e, f02.mo4470o());
                    if (p) {
                        mo4257R0(f02, t);
                    } else {
                        this.f3978i.mo4967a(f02, t);
                    }
                }
            }
        }
        mo4352r();
        mo4242H0();
        mo4351q1(false);
        this.f3983k0.f4026e = 2;
    }

    /* renamed from: C */
    private void m4831C() {
        mo4336o1();
        mo4240G0();
        this.f3983k0.mo4416a(6);
        this.f3974g.mo4819j();
        this.f3983k0.f4027f = this.f3990o.mo4094g();
        this.f3983k0.f4025d = 0;
        if (this.f3972f != null && this.f3990o.mo4493e()) {
            Parcelable parcelable = this.f3972f.f4131f;
            if (parcelable != null) {
                this.f3992p.mo4191b1(parcelable);
            }
            this.f3972f = null;
        }
        C1162b0 b0Var = this.f3983k0;
        b0Var.f4029h = false;
        this.f3992p.mo4151W0(this.f3970e, b0Var);
        C1162b0 b0Var2 = this.f3983k0;
        b0Var2.f4028g = false;
        b0Var2.f4032k = b0Var2.f4032k && this.f3958Q != null;
        b0Var2.f4026e = 4;
        mo4242H0();
        mo4351q1(false);
    }

    /* renamed from: D */
    private void m4832D() {
        this.f3983k0.mo4416a(4);
        mo4336o1();
        mo4240G0();
        C1162b0 b0Var = this.f3983k0;
        b0Var.f4026e = 1;
        if (b0Var.f4032k) {
            for (int g = this.f3976h.mo4840g() - 1; g >= 0; g--) {
                C1168e0 f0 = m4853f0(this.f3976h.mo4839f(g));
                if (!f0.mo4454J()) {
                    long b0 = mo4271b0(f0);
                    C1177m.C1180c s = this.f3958Q.mo4534s(this.f3983k0, f0);
                    C1168e0 g2 = this.f3978i.mo4973g(b0);
                    if (g2 != null && !g2.mo4454J()) {
                        boolean h = this.f3978i.mo4974h(g2);
                        boolean h2 = this.f3978i.mo4974h(f0);
                        if (!h || g2 != f0) {
                            C1177m.C1180c n = this.f3978i.mo4979n(g2);
                            this.f3978i.mo4970d(f0, s);
                            C1177m.C1180c m = this.f3978i.mo4978m(f0);
                            if (n == null) {
                                m4858k0(b0, f0, g2);
                            } else {
                                m4859l(g2, f0, n, m, h, h2);
                            }
                        }
                    }
                    this.f3978i.mo4970d(f0, s);
                }
            }
            this.f3978i.mo4980o(this.f3945D0);
        }
        this.f3992p.mo4609k1(this.f3970e);
        C1162b0 b0Var2 = this.f3983k0;
        b0Var2.f4024c = b0Var2.f4027f;
        this.f3949H = false;
        this.f3950I = false;
        b0Var2.f4032k = false;
        b0Var2.f4033l = false;
        this.f3992p.f4095h = false;
        ArrayList<C1168e0> arrayList = this.f3970e.f4123b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1183p pVar = this.f3992p;
        if (pVar.f4101n) {
            pVar.f4100m = 0;
            pVar.f4101n = false;
            this.f3970e.mo4674K();
        }
        this.f3992p.mo4153X0(this.f3983k0);
        mo4242H0();
        mo4351q1(false);
        this.f3978i.mo4972f();
        int[] iArr = this.f4001t0;
        if (m4868w(iArr[0], iArr[1])) {
            mo4241H(0, 0);
        }
        m4839S0();
        m4846b1();
    }

    /* renamed from: J */
    private boolean m4833J(MotionEvent motionEvent) {
        C1191t tVar = this.f4002u;
        if (tVar != null) {
            tVar.mo4650b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f4002u = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m4838S(motionEvent);
        }
    }

    /* renamed from: J0 */
    private void m4834J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3960S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3960S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3964W = x;
            this.f3962U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3965a0 = y;
            this.f3963V = y;
        }
    }

    /* renamed from: N0 */
    private boolean m4835N0() {
        return this.f3958Q != null && this.f3992p.mo4140H1();
    }

    /* renamed from: O0 */
    private void m4836O0() {
        boolean z;
        if (this.f3949H) {
            this.f3974g.mo4829v();
            if (this.f3950I) {
                this.f3992p.mo4147R0(this);
            }
        }
        if (m4835N0()) {
            this.f3974g.mo4827t();
        } else {
            this.f3974g.mo4819j();
        }
        boolean z2 = false;
        boolean z3 = this.f3989n0 || this.f3991o0;
        this.f3983k0.f4032k = this.f4010y && this.f3958Q != null && ((z = this.f3949H) || z3 || this.f3992p.f4095h) && (!z || this.f3990o.mo4496k());
        C1162b0 b0Var = this.f3983k0;
        if (b0Var.f4032k && z3 && !this.f3949H && m4835N0()) {
            z2 = true;
        }
        b0Var.f4033l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4837Q0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.mo4247L()
            android.widget.EdgeEffect r1 = r6.f3954M
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L_0x001c:
            androidx.core.widget.C0815d.m3271c(r1, r4, r9)
            r9 = r3
            goto L_0x0039
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0038
            r6.mo4249M()
            android.widget.EdgeEffect r1 = r6.f3956O
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0053
            r6.mo4251N()
            android.widget.EdgeEffect r9 = r6.f3955N
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C0815d.m3271c(r9, r1, r7)
            goto L_0x006f
        L_0x0053:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            r6.mo4245K()
            android.widget.EdgeEffect r9 = r6.f3957P
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C0815d.m3271c(r9, r1, r2)
            goto L_0x006f
        L_0x006e:
            r3 = r9
        L_0x006f:
            if (r3 != 0) goto L_0x0079
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            androidx.core.view.C0727l0.m2869S(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4837Q0(float, float, float, float):void");
    }

    /* renamed from: S */
    private boolean m4838S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4000t.size();
        int i = 0;
        while (i < size) {
            C1191t tVar = this.f4000t.get(i);
            if (!tVar.mo4649a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f4002u = tVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: S0 */
    private void m4839S0() {
        View findViewById;
        if (this.f3975g0 && this.f3990o != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3935K0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3976h.mo4845n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3976h.mo4840g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C1168e0 X = (this.f3983k0.f4035n == -1 || !this.f3990o.mo4496k()) ? null : mo4262X(this.f3983k0.f4035n);
                if (X != null && !this.f3976h.mo4845n(X.f4049a) && X.f4049a.hasFocusable()) {
                    view = X.f4049a;
                } else if (this.f3976h.mo4840g() > 0) {
                    view = m4843V();
                }
                if (view != null) {
                    int i = this.f3983k0.f4036o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: T */
    private void m4840T(int[] iArr) {
        int g = this.f3976h.mo4840g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4839f(i3));
            if (!f0.mo4454J()) {
                int m = f0.mo4468m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: T0 */
    private void m4841T0() {
        boolean z;
        EdgeEffect edgeEffect = this.f3954M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3954M.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3955N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3955N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3956O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3956O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3957P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3957P.isFinished();
        }
        if (z) {
            C0727l0.m2869S(this);
        }
    }

    /* renamed from: U */
    static RecyclerView m4842U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView U = m4842U(viewGroup.getChildAt(i));
            if (U != null) {
                return U;
            }
        }
        return null;
    }

    /* renamed from: V */
    private View m4843V() {
        C1168e0 W;
        C1162b0 b0Var = this.f3983k0;
        int i = b0Var.f4034m;
        if (i == -1) {
            i = 0;
        }
        int b = b0Var.mo4417b();
        int i2 = i;
        while (i2 < b) {
            C1168e0 W2 = mo4260W(i2);
            if (W2 == null) {
                break;
            } else if (W2.f4049a.hasFocusable()) {
                return W2.f4049a;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (W = mo4260W(min)) == null) {
                return null;
            }
            if (W.f4049a.hasFocusable()) {
                return W.f4049a;
            }
        }
    }

    /* renamed from: a1 */
    private void m4844a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3984l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1188q) {
            C1188q qVar = (C1188q) layoutParams;
            if (!qVar.f4114c) {
                Rect rect = qVar.f4113b;
                Rect rect2 = this.f3984l;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3984l);
            offsetRectIntoDescendantCoords(view, this.f3984l);
        }
        this.f3992p.mo4622r1(this, view, this.f3984l, !this.f4010y, view2 == null);
    }

    /* renamed from: b1 */
    private void m4846b1() {
        C1162b0 b0Var = this.f3983k0;
        b0Var.f4035n = -1;
        b0Var.f4034m = -1;
        b0Var.f4036o = -1;
    }

    /* renamed from: c1 */
    private void m4848c1() {
        VelocityTracker velocityTracker = this.f3961T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo4354r1(0);
        m4841T0();
    }

    /* renamed from: d1 */
    private void m4850d1() {
        C1168e0 e0Var = null;
        View focusedChild = (!this.f3975g0 || !hasFocus() || this.f3990o == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            e0Var = mo4256R(focusedChild);
        }
        if (e0Var == null) {
            m4846b1();
            return;
        }
        this.f3983k0.f4035n = this.f3990o.mo4496k() ? e0Var.mo4466k() : -1;
        this.f3983k0.f4034m = this.f3949H ? -1 : e0Var.mo4478v() ? e0Var.f4052d : e0Var.mo4465j();
        this.f3983k0.f4036o = m4855h0(e0Var.f4049a);
    }

    /* renamed from: f */
    private void m4852f(C1168e0 e0Var) {
        View view = e0Var.f4049a;
        boolean z = view.getParent() == this;
        this.f3970e.mo4673J(mo4290e0(view));
        if (e0Var.mo4480x()) {
            this.f3976h.mo4836c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1217b bVar = this.f3976h;
        if (!z) {
            bVar.mo4835b(view, true);
        } else {
            bVar.mo4843k(view);
        }
    }

    /* renamed from: f0 */
    static C1168e0 m4853f0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1188q) view.getLayoutParams()).f4112a;
    }

    /* renamed from: g0 */
    static void m4854g0(View view, Rect rect) {
        C1188q qVar = (C1188q) view.getLayoutParams();
        Rect rect2 = qVar.f4113b;
        rect.set((view.getLeft() - rect2.left) - qVar.leftMargin, (view.getTop() - rect2.top) - qVar.topMargin, view.getRight() + rect2.right + qVar.rightMargin, view.getBottom() + rect2.bottom + qVar.bottomMargin);
    }

    private C0660b0 getScrollingChildHelper() {
        if (this.f4003u0 == null) {
            this.f4003u0 = new C0660b0(this);
        }
        return this.f4003u0;
    }

    /* renamed from: h0 */
    private int m4855h0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: h1 */
    private void m4856h1(C1171h hVar, boolean z, boolean z2) {
        C1171h hVar2 = this.f3990o;
        if (hVar2 != null) {
            hVar2.mo4508y(this.f3968d);
            this.f3990o.mo4501r(this);
        }
        if (!z || z2) {
            mo4258U0();
        }
        this.f3974g.mo4829v();
        C1171h hVar3 = this.f3990o;
        this.f3990o = hVar;
        if (hVar != null) {
            hVar.mo4506w(this.f3968d);
            hVar.mo4499n(this);
        }
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4553D0(hVar3, this.f3990o);
        }
        this.f3970e.mo4697x(hVar3, this.f3990o, z);
        this.f3983k0.f4028g = true;
    }

    /* renamed from: i0 */
    private String m4857i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: k0 */
    private void m4858k0(long j, C1168e0 e0Var, C1168e0 e0Var2) {
        int g = this.f3976h.mo4840g();
        for (int i = 0; i < g; i++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4839f(i));
            if (f0 != e0Var && mo4271b0(f0) == j) {
                C1171h hVar = this.f3990o;
                if (hVar == null || !hVar.mo4496k()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0 + " \n View Holder 2:" + e0Var + mo4252O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0 + " \n View Holder 2:" + e0Var + mo4252O());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + mo4252O());
    }

    /* renamed from: l */
    private void m4859l(C1168e0 e0Var, C1168e0 e0Var2, C1177m.C1180c cVar, C1177m.C1180c cVar2, boolean z, boolean z2) {
        e0Var.mo4451G(false);
        if (z) {
            m4852f(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z2) {
                m4852f(e0Var2);
            }
            e0Var.f4056h = e0Var2;
            m4852f(e0Var);
            this.f3970e.mo4673J(e0Var);
            e0Var2.mo4451G(false);
            e0Var2.f4057i = e0Var;
        }
        if (this.f3958Q.mo4518b(e0Var, e0Var2, cVar, cVar2)) {
            mo4250M0();
        }
    }

    /* renamed from: m0 */
    private boolean m4860m0() {
        int g = this.f3976h.mo4840g();
        for (int i = 0; i < g; i++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4839f(i));
            if (f0 != null && !f0.mo4454J() && f0.mo4481y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: o0 */
    private void m4861o0() {
        if (C0727l0.m2915t(this) == 0) {
            C0727l0.m2894i0(this, 8);
        }
    }

    /* renamed from: p */
    private void m4862p() {
        m4848c1();
        setScrollState(0);
    }

    /* renamed from: p0 */
    private void m4863p0() {
        this.f3976h = new C1217b(new C1167e());
    }

    /* renamed from: q */
    static void m4864q(C1168e0 e0Var) {
        Reference reference = e0Var.f4050b;
        if (reference != null) {
            Object obj = reference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        e0Var.f4050b = null;
                        return;
                    } else if (view != e0Var.f4049a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: t1 */
    private void m4865t1() {
        this.f3977h0.mo4432f();
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4560G1();
        }
    }

    /* renamed from: u */
    private void m4866u(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String i0 = m4857i0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(i0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C1183p.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3936L0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1183p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i0, e7);
                }
            }
        }
    }

    /* renamed from: v0 */
    private boolean m4867v0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || mo4255Q(view2) == null) {
            return false;
        }
        if (view == null || mo4255Q(view) == null) {
            return true;
        }
        this.f3984l.set(0, 0, view.getWidth(), view.getHeight());
        this.f3986m.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3984l);
        offsetDescendantRectToMyCoords(view2, this.f3986m);
        char c = 65535;
        int i3 = this.f3992p.mo4581Y() == 1 ? -1 : 1;
        Rect rect = this.f3984l;
        int i4 = rect.left;
        Rect rect2 = this.f3986m;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo4252O());
    }

    /* renamed from: w */
    private boolean m4868w(int i, int i2) {
        m4840T(this.f4001t0);
        int[] iArr = this.f4001t0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: y0 */
    private void m4869y0(int i, int i2, MotionEvent motionEvent, int i3) {
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3940B) {
            int[] iArr = this.f4009x0;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean k = pVar.mo4198k();
            boolean l = this.f3992p.mo4199l();
            mo4349p1(l ? k | true : k ? 1 : 0, i3);
            if (mo4235E(k ? i : 0, l ? i2 : 0, this.f4009x0, this.f4005v0, i3)) {
                int[] iArr2 = this.f4009x0;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i5 = k ? i : 0;
            if (l) {
                i4 = i2;
            }
            mo4292f1(i5, i4, motionEvent, i3);
            C1236e eVar = this.f3979i0;
            if (!(eVar == null || (i == 0 && i2 == 0))) {
                eVar.mo4898f(this, i, i2);
            }
            mo4354r1(i3);
        }
    }

    /* renamed from: z */
    private void m4870z() {
        int i = this.f3944D;
        this.f3944D = 0;
        if (i != 0 && mo4390t0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0631b.m2515b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4230A() {
        if (this.f3990o == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f3992p == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f3983k0.f4031j = false;
            boolean z = this.f3939A0 && !(this.f3941B0 == getWidth() && this.f3943C0 == getHeight());
            this.f3941B0 = 0;
            this.f3943C0 = 0;
            this.f3939A0 = false;
            if (this.f3983k0.f4026e == 1) {
                m4830B();
            } else if (!this.f3974g.mo4825q() && !z && this.f3992p.mo4614n0() == getWidth() && this.f3992p.mo4579W() == getHeight()) {
                this.f3992p.mo4631x1(this);
                m4832D();
            }
            this.f3992p.mo4631x1(this);
            m4831C();
            m4832D();
        }
    }

    /* renamed from: A0 */
    public void mo4231A0(int i) {
        int g = this.f3976h.mo4840g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3976h.mo4839f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo4232B0(int i, int i2) {
        int j = this.f3976h.mo4842j();
        for (int i3 = 0; i3 < j; i3++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i3));
            if (f0 != null && !f0.mo4454J() && f0.f4051c >= i) {
                f0.mo4445A(i2, false);
                this.f3983k0.f4028g = true;
            }
        }
        this.f3970e.mo4694u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4233C0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f3976h.mo4842j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i7));
            if (f0 != null && (i6 = f0.f4051c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    f0.mo4445A(i2 - i, false);
                } else {
                    f0.mo4445A(i5, false);
                }
                this.f3983k0.f4028g = true;
            }
        }
        this.f3970e.mo4695v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo4234D0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f3976h.mo4842j();
        for (int i4 = 0; i4 < j; i4++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i4));
            if (f0 != null && !f0.mo4454J()) {
                int i5 = f0.f4051c;
                if (i5 >= i3) {
                    f0.mo4445A(-i2, z);
                } else if (i5 >= i) {
                    f0.mo4464i(i - 1, -i2, z);
                }
                this.f3983k0.f4028g = true;
            }
        }
        this.f3970e.mo4696w(i, i2, z);
        requestLayout();
    }

    /* renamed from: E */
    public boolean mo4235E(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2807d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: E0 */
    public void mo4236E0(View view) {
    }

    /* renamed from: F */
    public final void mo4237F(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo2808e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: F0 */
    public void mo4238F0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4239G(int i) {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4593d1(i);
        }
        mo4246K0(i);
        C1192u uVar = this.f3985l0;
        if (uVar != null) {
            uVar.mo4652a(this, i);
        }
        List<C1192u> list = this.f3987m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3987m0.get(size).mo4652a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo4240G0() {
        this.f3951J++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4241H(int i, int i2) {
        this.f3952K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo4248L0(i, i2);
        C1192u uVar = this.f3985l0;
        if (uVar != null) {
            uVar.mo4653b(this, i, i2);
        }
        List<C1192u> list = this.f3987m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3987m0.get(size).mo4653b(this, i, i2);
            }
        }
        this.f3952K--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo4242H0() {
        mo4244I0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4243I() {
        int i;
        for (int size = this.f4011y0.size() - 1; size >= 0; size--) {
            C1168e0 e0Var = this.f4011y0.get(size);
            if (e0Var.f4049a.getParent() == this && !e0Var.mo4454J() && (i = e0Var.f4065q) != -1) {
                C0727l0.m2892h0(e0Var.f4049a, i);
                e0Var.f4065q = -1;
            }
        }
        this.f4011y0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo4244I0(boolean z) {
        int i = this.f3951J - 1;
        this.f3951J = i;
        if (i < 1) {
            this.f3951J = 0;
            if (z) {
                m4870z();
                mo4243I();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4245K() {
        int i;
        int i2;
        if (this.f3957P == null) {
            EdgeEffect a = this.f3953L.mo4516a(this, 3);
            this.f3957P = a;
            if (this.f3980j) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: K0 */
    public void mo4246K0(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo4247L() {
        int i;
        int i2;
        if (this.f3954M == null) {
            EdgeEffect a = this.f3953L.mo4516a(this, 0);
            this.f3954M = a;
            if (this.f3980j) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: L0 */
    public void mo4248L0(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4249M() {
        int i;
        int i2;
        if (this.f3956O == null) {
            EdgeEffect a = this.f3953L.mo4516a(this, 2);
            this.f3956O = a;
            if (this.f3980j) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo4250M0() {
        if (!this.f3995q0 && this.f4004v) {
            C0727l0.m2870T(this, this.f4013z0);
            this.f3995q0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4251N() {
        int i;
        int i2;
        if (this.f3955N == null) {
            EdgeEffect a = this.f3953L.mo4516a(this, 1);
            this.f3955N = a;
            if (this.f3980j) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public String mo4252O() {
        return " " + super.toString() + ", adapter:" + this.f3990o + ", layout:" + this.f3992p + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo4253P(C1162b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3977h0.f4042f;
            b0Var.f4037p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f4038q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f4037p = 0;
        b0Var.f4038q = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo4254P0(boolean z) {
        this.f3950I = z | this.f3950I;
        this.f3949H = true;
        mo4396x0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4255Q(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo4255Q(android.view.View):android.view.View");
    }

    /* renamed from: R */
    public C1168e0 mo4256R(View view) {
        View Q = mo4255Q(view);
        if (Q == null) {
            return null;
        }
        return mo4290e0(Q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo4257R0(C1168e0 e0Var, C1177m.C1180c cVar) {
        e0Var.mo4450F(0, 8192);
        if (this.f3983k0.f4030i && e0Var.mo4481y() && !e0Var.mo4478v() && !e0Var.mo4454J()) {
            this.f3978i.mo4969c(mo4271b0(e0Var), e0Var);
        }
        this.f3978i.mo4971e(e0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo4258U0() {
        C1177m mVar = this.f3958Q;
        if (mVar != null) {
            mVar.mo4526k();
        }
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4607j1(this.f3970e);
            this.f3992p.mo4609k1(this.f3970e);
        }
        this.f3970e.mo4678c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public boolean mo4259V0(View view) {
        mo4336o1();
        boolean r = this.f3976h.mo4849r(view);
        if (r) {
            C1168e0 f0 = m4853f0(view);
            this.f3970e.mo4673J(f0);
            this.f3970e.mo4667C(f0);
        }
        mo4351q1(!r);
        return r;
    }

    /* renamed from: W */
    public C1168e0 mo4260W(int i) {
        C1168e0 e0Var = null;
        if (this.f3949H) {
            return null;
        }
        int j = this.f3976h.mo4842j();
        for (int i2 = 0; i2 < j; i2++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i2));
            if (f0 != null && !f0.mo4478v() && mo4269a0(f0) == i) {
                if (!this.f3976h.mo4845n(f0.f4049a)) {
                    return f0;
                }
                e0Var = f0;
            }
        }
        return e0Var;
    }

    /* renamed from: W0 */
    public void mo4261W0(C1182o oVar) {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4193g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3998s.remove(oVar);
        if (this.f3998s.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4394w0();
        requestLayout();
    }

    /* renamed from: X */
    public C1168e0 mo4262X(long j) {
        C1171h hVar = this.f3990o;
        C1168e0 e0Var = null;
        if (hVar != null && hVar.mo4496k()) {
            int j2 = this.f3976h.mo4842j();
            for (int i = 0; i < j2; i++) {
                C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i));
                if (f0 != null && !f0.mo4478v() && f0.mo4466k() == j) {
                    if (!this.f3976h.mo4845n(f0.f4049a)) {
                        return f0;
                    }
                    e0Var = f0;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: X0 */
    public void mo4263X0(C1191t tVar) {
        this.f4000t.remove(tVar);
        if (this.f4002u == tVar) {
            this.f4002u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C1168e0 mo4264Y(int i, boolean z) {
        int j = this.f3976h.mo4842j();
        C1168e0 e0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i2));
            if (f0 != null && !f0.mo4478v()) {
                if (z) {
                    if (f0.f4051c != i) {
                        continue;
                    }
                } else if (f0.mo4468m() != i) {
                    continue;
                }
                if (!this.f3976h.mo4845n(f0.f4049a)) {
                    return f0;
                }
                e0Var = f0;
            }
        }
        return e0Var;
    }

    /* renamed from: Y0 */
    public void mo4265Y0(C1192u uVar) {
        List<C1192u> list = this.f3987m0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    /* renamed from: Z */
    public boolean mo4266Z(int i, int i2) {
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3940B) {
            return false;
        } else {
            boolean k = pVar.mo4198k();
            boolean l = this.f3992p.mo4199l();
            if (!k || Math.abs(i) < this.f3967c0) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.f3967c0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                if (z) {
                    if (l) {
                        k |= true;
                    }
                    mo4349p1(k ? 1 : 0, 1);
                    int i3 = this.f3969d0;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.f3969d0;
                    this.f3977h0.mo4429b(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo4267Z0() {
        C1168e0 e0Var;
        int g = this.f3976h.mo4840g();
        for (int i = 0; i < g; i++) {
            View f = this.f3976h.mo4839f(i);
            C1168e0 e0 = mo4290e0(f);
            if (!(e0 == null || (e0Var = e0.f4057i) == null)) {
                View view = e0Var.f4049a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4268a(int i, int i2) {
        if (i < 0) {
            mo4247L();
            if (this.f3954M.isFinished()) {
                this.f3954M.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo4249M();
            if (this.f3956O.isFinished()) {
                this.f3956O.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo4251N();
            if (this.f3955N.isFinished()) {
                this.f3955N.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo4245K();
            if (this.f3957P.isFinished()) {
                this.f3957P.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0727l0.m2869S(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public int mo4269a0(C1168e0 e0Var) {
        if (e0Var.mo4471p(524) || !e0Var.mo4474s()) {
            return -1;
        }
        return this.f3974g.mo4817e(e0Var.f4051c);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1183p pVar = this.f3992p;
        if (pVar == null || !pVar.mo4555E0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public long mo4271b0(C1168e0 e0Var) {
        return this.f3990o.mo4496k() ? e0Var.mo4466k() : (long) e0Var.f4051c;
    }

    /* renamed from: c0 */
    public int mo4272c0(View view) {
        C1168e0 f0 = m4853f0(view);
        if (f0 != null) {
            return f0.mo4465j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1188q) && this.f3992p.mo4157m((C1188q) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4198k()) {
            return this.f3992p.mo4202q(this.f3983k0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4198k()) {
            return this.f3992p.mo4159r(this.f3983k0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4198k()) {
            return this.f3992p.mo4160s(this.f3983k0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4199l()) {
            return this.f3992p.mo4205t(this.f3983k0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4199l()) {
            return this.f3992p.mo4161u(this.f3983k0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1183p pVar = this.f3992p;
        if (pVar != null && pVar.mo4199l()) {
            return this.f3992p.mo4162v(this.f3983k0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int mo4280d0(View view) {
        C1168e0 f0 = m4853f0(view);
        if (f0 != null) {
            return f0.mo4468m();
        }
        return -1;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2804a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2805b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2806c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2809f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3998s.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3998s.get(i2).mo4082i(canvas, this, this.f3983k0);
        }
        EdgeEffect edgeEffect = this.f3954M;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3980j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3954M;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3955N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3980j) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3955N;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3956O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3980j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.f3956O;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3957P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3980j) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f3957P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3958Q == null || this.f3998s.size() <= 0 || !this.f3958Q.mo4531p()) {
            z3 = z;
        }
        if (z3) {
            C0727l0.m2869S(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public C1168e0 mo4290e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4853f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo4291e1() {
        int j = this.f3976h.mo4842j();
        for (int i = 0; i < j; i++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i));
            if (!f0.mo4454J()) {
                f0.mo4449E();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public boolean mo4292f1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4389t();
        if (this.f3990o != null) {
            int[] iArr = this.f4009x0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo4295g1(i8, i9, iArr);
            int[] iArr2 = this.f4009x0;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f3998s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4009x0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo4237F(i6, i7, i5, i4, this.f4005v0, i3, iArr3);
        int[] iArr4 = this.f4009x0;
        int i12 = iArr4[0];
        int i13 = i5 - i12;
        int i14 = iArr4[1];
        int i15 = i4 - i14;
        boolean z = (i12 == 0 && i14 == 0) ? false : true;
        int i16 = this.f3964W;
        int[] iArr5 = this.f4005v0;
        int i17 = iArr5[0];
        this.f3964W = i16 - i17;
        int i18 = this.f3965a0;
        int i19 = iArr5[1];
        this.f3965a0 = i18 - i19;
        int[] iArr6 = this.f4007w0;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0797z.m3148a(motionEvent2, 8194)) {
                m4837Q0(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i15);
            }
            mo4360s(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo4241H(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i6 == 0 && i7 == 0) ? false : true;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View P0 = this.f3992p.mo4571P0(view, i);
        if (P0 != null) {
            return P0;
        }
        boolean z2 = true;
        boolean z3 = this.f3990o != null && this.f3992p != null && !mo4391u0() && !this.f3940B;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo4389t();
                if (mo4255Q(view) == null) {
                    return null;
                }
                mo4336o1();
                view2 = this.f3992p.mo4141I0(view, i, this.f3970e, this.f3983k0);
                mo4351q1(false);
            }
        } else {
            if (this.f3992p.mo4199l()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3934J0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3992p.mo4198k()) {
                int i3 = (this.f3992p.mo4581Y() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f3934J0) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo4389t();
                if (mo4255Q(view) == null) {
                    return null;
                }
                mo4336o1();
                this.f3992p.mo4141I0(view, i, this.f3970e, this.f3983k0);
                mo4351q1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4867v0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4844a1(view2, (View) null);
        return view;
    }

    /* renamed from: g */
    public void mo4294g(C1182o oVar) {
        mo4316h(oVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo4295g1(int i, int i2, int[] iArr) {
        mo4336o1();
        mo4240G0();
        C0586i.m2412a("RV Scroll");
        mo4253P(this.f3983k0);
        int v1 = i != 0 ? this.f3992p.mo4163v1(i, this.f3970e, this.f3983k0) : 0;
        int w1 = i2 != 0 ? this.f3992p.mo4164w1(i2, this.f3970e, this.f3983k0) : 0;
        C0586i.m2413b();
        mo4267Z0();
        mo4242H0();
        mo4351q1(false);
        if (iArr != null) {
            iArr[0] = v1;
            iArr[1] = w1;
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            return pVar.mo4137D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4252O());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            return pVar.mo4138E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4252O());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            return pVar.mo4139F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4252O());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1171h getAdapter() {
        return this.f3990o;
    }

    public int getBaseline() {
        C1183p pVar = this.f3992p;
        return pVar != null ? pVar.mo4558G() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1175k kVar = this.f3999s0;
        return kVar == null ? super.getChildDrawingOrder(i, i2) : kVar.mo4515a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3980j;
    }

    public C1247j getCompatAccessibilityDelegate() {
        return this.f3997r0;
    }

    public C1176l getEdgeEffectFactory() {
        return this.f3953L;
    }

    public C1177m getItemAnimator() {
        return this.f3958Q;
    }

    public int getItemDecorationCount() {
        return this.f3998s.size();
    }

    public C1183p getLayoutManager() {
        return this.f3992p;
    }

    public int getMaxFlingVelocity() {
        return this.f3969d0;
    }

    public int getMinFlingVelocity() {
        return this.f3967c0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3933I0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1190s getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3975g0;
    }

    public C1193v getRecycledViewPool() {
        return this.f3970e.mo4684i();
    }

    public int getScrollState() {
        return this.f3959R;
    }

    /* renamed from: h */
    public void mo4316h(C1182o oVar, int i) {
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4193g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3998s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3998s.add(oVar);
        } else {
            this.f3998s.add(i, oVar);
        }
        mo4394w0();
        requestLayout();
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2810j();
    }

    /* renamed from: i */
    public void mo4318i(C1191t tVar) {
        this.f4000t.add(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public boolean mo4319i1(C1168e0 e0Var, int i) {
        if (mo4391u0()) {
            e0Var.f4065q = i;
            this.f4011y0.add(e0Var);
            return false;
        }
        C0727l0.m2892h0(e0Var.f4049a, i);
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.f4004v;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3940B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2812l();
    }

    /* renamed from: j */
    public void mo4323j(C1192u uVar) {
        if (this.f3987m0 == null) {
            this.f3987m0 = new ArrayList();
        }
        this.f3987m0.add(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Rect mo4324j0(View view) {
        C1188q qVar = (C1188q) view.getLayoutParams();
        if (!qVar.f4114c) {
            return qVar.f4113b;
        }
        if (this.f3983k0.mo4420e() && (qVar.mo4644b() || qVar.mo4646d())) {
            return qVar.f4113b;
        }
        Rect rect = qVar.f4113b;
        rect.set(0, 0, 0, 0);
        int size = this.f3998s.size();
        for (int i = 0; i < size; i++) {
            this.f3984l.set(0, 0, 0, 0);
            this.f3998s.get(i).mo4081e(this.f3984l, view, this, this.f3983k0);
            int i2 = rect.left;
            Rect rect2 = this.f3984l;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f4114c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public boolean mo4325j1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo4391u0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0631b.m2514a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f3944D |= i;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4326k(C1168e0 e0Var, C1177m.C1180c cVar, C1177m.C1180c cVar2) {
        e0Var.mo4451G(false);
        if (this.f3958Q.mo4517a(e0Var, cVar, cVar2)) {
            mo4250M0();
        }
    }

    /* renamed from: k1 */
    public void mo4327k1(int i, int i2) {
        mo4329l1(i, i2, (Interpolator) null);
    }

    /* renamed from: l0 */
    public boolean mo4328l0() {
        return !this.f4010y || this.f3949H || this.f3974g.mo4824p();
    }

    /* renamed from: l1 */
    public void mo4329l1(int i, int i2, Interpolator interpolator) {
        mo4331m1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4330m(C1168e0 e0Var, C1177m.C1180c cVar, C1177m.C1180c cVar2) {
        m4852f(e0Var);
        e0Var.mo4451G(false);
        if (this.f3958Q.mo4519c(e0Var, cVar, cVar2)) {
            mo4250M0();
        }
    }

    /* renamed from: m1 */
    public void mo4331m1(int i, int i2, Interpolator interpolator, int i3) {
        mo4334n1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4332n(String str) {
        if (mo4391u0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4252O());
            }
            throw new IllegalStateException(str);
        } else if (this.f3952K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo4252O()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo4333n0() {
        this.f3974g = new C1214a(new C1169f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo4334n1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3940B) {
            int i4 = 0;
            if (!pVar.mo4198k()) {
                i = 0;
            }
            if (!this.f3992p.mo4199l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo4349p1(i4, 1);
                    }
                    this.f3977h0.mo4431e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4335o(C1168e0 e0Var) {
        C1177m mVar = this.f3958Q;
        return mVar == null || mVar.mo4522g(e0Var, e0Var.mo4470o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo4336o1() {
        int i = this.f4012z + 1;
        this.f4012z = i;
        if (i == 1 && !this.f3940B) {
            this.f3938A = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3951J = 0;
        boolean z = true;
        this.f4004v = true;
        if (!this.f4010y || isLayoutRequested()) {
            z = false;
        }
        this.f4010y = z;
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4634z(this);
        }
        this.f3995q0 = false;
        if (f3933I0) {
            ThreadLocal<C1236e> threadLocal = C1236e.f4305h;
            C1236e eVar = threadLocal.get();
            this.f3979i0 = eVar;
            if (eVar == null) {
                this.f3979i0 = new C1236e();
                Display q = C0727l0.m2909q(this);
                float f = 60.0f;
                if (!isInEditMode() && q != null) {
                    float refreshRate = q.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1236e eVar2 = this.f3979i0;
                eVar2.f4309f = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.f3979i0.mo4897a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1236e eVar;
        super.onDetachedFromWindow();
        C1177m mVar = this.f3958Q;
        if (mVar != null) {
            mVar.mo4526k();
        }
        mo4362s1();
        this.f4004v = false;
        C1183p pVar = this.f3992p;
        if (pVar != null) {
            pVar.mo4546A(this, this.f3970e);
        }
        this.f4011y0.clear();
        removeCallbacks(this.f4013z0);
        this.f3978i.mo4976j();
        if (f3933I0 && (eVar = this.f3979i0) != null) {
            eVar.mo4900j(this);
            this.f3979i0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3998s.size();
        for (int i = 0; i < size; i++) {
            this.f3998s.get(i).mo4544g(canvas, this, this.f3983k0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3992p != null && !this.f3940B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3992p.mo4199l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3992p.mo4198k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m4869y0((int) (f * this.f3971e0), (int) (f2 * this.f3973f0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3992p.mo4199l()) {
                        f2 = -axisValue;
                    } else if (this.f3992p.mo4198k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m4869y0((int) (f * this.f3971e0), (int) (f2 * this.f3973f0), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                m4869y0((int) (f * this.f3971e0), (int) (f2 * this.f3973f0), motionEvent, 1);
            }
            f = 0.0f;
            m4869y0((int) (f * this.f3971e0), (int) (f2 * this.f3973f0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3940B) {
            return false;
        }
        this.f4002u = null;
        if (m4838S(motionEvent)) {
            m4862p();
            return true;
        }
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            return false;
        }
        boolean k = pVar.mo4198k();
        boolean l = this.f3992p.mo4199l();
        if (this.f3961T == null) {
            this.f3961T = VelocityTracker.obtain();
        }
        this.f3961T.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3942C) {
                this.f3942C = false;
            }
            this.f3960S = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3964W = x;
            this.f3962U = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3965a0 = y;
            this.f3963V = y;
            if (this.f3959R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo4354r1(1);
            }
            int[] iArr = this.f4007w0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l) {
                k |= true;
            }
            mo4349p1(k ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f3961T.clear();
            mo4354r1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3960S);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3960S + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3959R != 1) {
                int i = x2 - this.f3962U;
                int i2 = y2 - this.f3963V;
                if (!k || Math.abs(i) <= this.f3966b0) {
                    z = false;
                } else {
                    this.f3964W = x2;
                    z = true;
                }
                if (l && Math.abs(i2) > this.f3966b0) {
                    this.f3965a0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m4862p();
        } else if (actionMasked == 5) {
            this.f3960S = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3964W = x3;
            this.f3962U = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3965a0 = y3;
            this.f3963V = y3;
        } else if (actionMasked == 6) {
            m4834J0(motionEvent);
        }
        return this.f3959R == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0586i.m2412a("RV OnLayout");
        mo4230A();
        C0586i.m2413b();
        this.f4010y = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            mo4393v(i, i2);
            return;
        }
        boolean z = false;
        if (pVar.mo4203r0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3992p.mo4582Y0(this.f3970e, this.f3983k0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f3939A0 = z;
            if (!z && this.f3990o != null) {
                if (this.f3983k0.f4026e == 1) {
                    m4830B();
                }
                this.f3992p.mo4633y1(i, i2);
                this.f3983k0.f4031j = true;
                m4831C();
                this.f3992p.mo4550B1(i, i2);
                if (this.f3992p.mo4176E1()) {
                    this.f3992p.mo4633y1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3983k0.f4031j = true;
                    m4831C();
                    this.f3992p.mo4550B1(i, i2);
                }
                this.f3941B0 = getMeasuredWidth();
                this.f3943C0 = getMeasuredHeight();
            }
        } else if (this.f4006w) {
            this.f3992p.mo4582Y0(this.f3970e, this.f3983k0, i, i2);
        } else {
            if (this.f3946E) {
                mo4336o1();
                mo4240G0();
                m4836O0();
                mo4242H0();
                C1162b0 b0Var = this.f3983k0;
                if (b0Var.f4033l) {
                    b0Var.f4029h = true;
                } else {
                    this.f3974g.mo4819j();
                    this.f3983k0.f4029h = false;
                }
                this.f3946E = false;
                mo4351q1(false);
            } else if (this.f3983k0.f4033l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1171h hVar = this.f3990o;
            if (hVar != null) {
                this.f3983k0.f4027f = hVar.mo4094g();
            } else {
                this.f3983k0.f4027f = 0;
            }
            mo4336o1();
            this.f3992p.mo4582Y0(this.f3970e, this.f3983k0, i, i2);
            mo4351q1(false);
            this.f3983k0.f4029h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4391u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1198z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1198z zVar = (C1198z) parcelable;
        this.f3972f = zVar;
        super.onRestoreInstanceState(zVar.mo10153a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1198z zVar = new C1198z(super.onSaveInstanceState());
        C1198z zVar2 = this.f3972f;
        if (zVar2 != null) {
            zVar.mo4702b(zVar2);
        } else {
            C1183p pVar = this.f3992p;
            zVar.f4131f = pVar != null ? pVar.mo4192c1() : null;
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4353r0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3940B
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.f3942C
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.m4833J(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m4862p()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3992p
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4198k()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3992p
            boolean r11 = r0.mo4199l()
            android.view.VelocityTracker r0 = r6.f3961T
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f3961T = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f4007w0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f4007w0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.m4834J0(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f3960S = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3964W = r0
            r6.f3962U = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3965a0 = r0
            r6.f3963V = r0
            goto L_0x01d0
        L_0x0087:
            r17.m4862p()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.f3960S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f3960S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f3964W
            int r0 = r0 - r13
            int r1 = r6.f3965a0
            int r1 = r1 - r14
            int r2 = r6.f3959R
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.f3966b0
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = r9
            goto L_0x00de
        L_0x00dd:
            r2 = r8
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.f3966b0
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = r9
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.f3959R
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.f4009x0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = r8
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = r8
        L_0x010f:
            int[] r4 = r6.f4005v0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo4235E(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.f4009x0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f4007w0
            r1 = r0[r8]
            int[] r2 = r6.f4005v0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.f4005v0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f3964W = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f3965a0 = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = r8
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = r8
        L_0x0154:
            boolean r1 = r6.mo4292f1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.e r1 = r6.f3979i0
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.mo4898f(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.f3961T
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f3961T
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f3969d0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.f3961T
            int r2 = r6.f3960S
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = r0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.f3961T
            int r3 = r6.f3960S
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = r0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo4266Z(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.m4848c1()
            r8 = r9
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.f3960S = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3964W = r0
            r6.f3962U = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3965a0 = r0
            r6.f3963V = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.mo4349p1(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.f3961T
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p1 */
    public boolean mo4349p1(int i, int i2) {
        return getScrollingChildHelper().mo2815p(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo4350q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4252O());
        }
        Resources resources = getContext().getResources();
        new C1231d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1550b.f6202a), resources.getDimensionPixelSize(C1550b.f6204c), resources.getDimensionPixelOffset(C1550b.f6203b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo4351q1(boolean z) {
        if (this.f4012z < 1) {
            this.f4012z = 1;
        }
        if (!z && !this.f3940B) {
            this.f3938A = false;
        }
        if (this.f4012z == 1) {
            if (z && this.f3938A && !this.f3940B && this.f3992p != null && this.f3990o != null) {
                mo4230A();
            }
            if (!this.f3940B) {
                this.f3938A = false;
            }
        }
        this.f4012z--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4352r() {
        int j = this.f3976h.mo4842j();
        for (int i = 0; i < j; i++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i));
            if (!f0.mo4454J()) {
                f0.mo4459c();
            }
        }
        this.f3970e.mo4679d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo4353r0() {
        this.f3957P = null;
        this.f3955N = null;
        this.f3956O = null;
        this.f3954M = null;
    }

    /* renamed from: r1 */
    public void mo4354r1(int i) {
        getScrollingChildHelper().mo2817r(i);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1168e0 f0 = m4853f0(view);
        if (f0 != null) {
            if (f0.mo4480x()) {
                f0.mo4462f();
            } else if (!f0.mo4454J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0 + mo4252O());
            }
        }
        view.clearAnimation();
        mo4397y(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3992p.mo4586a1(this, this.f3983k0, view, view2) && view2 != null) {
            m4844a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3992p.mo4621q1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4000t.size();
        for (int i = 0; i < size; i++) {
            this.f4000t.get(i).mo4651c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f4012z != 0 || this.f3940B) {
            this.f3938A = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4360s(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3954M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3954M.onRelease();
            z = this.f3954M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3956O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3956O.onRelease();
            z |= this.f3956O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3955N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3955N.onRelease();
            z |= this.f3955N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3957P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3957P.onRelease();
            z |= this.f3957P.isFinished();
        }
        if (z) {
            C0727l0.m2869S(this);
        }
    }

    /* renamed from: s0 */
    public void mo4361s0() {
        if (this.f3998s.size() != 0) {
            C1183p pVar = this.f3992p;
            if (pVar != null) {
                pVar.mo4193g("Cannot invalidate item decorations during a scroll or layout");
            }
            mo4394w0();
            requestLayout();
        }
    }

    /* renamed from: s1 */
    public void mo4362s1() {
        setScrollState(0);
        m4865t1();
    }

    public void scrollBy(int i, int i2) {
        C1183p pVar = this.f3992p;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3940B) {
            boolean k = pVar.mo4198k();
            boolean l = this.f3992p.mo4199l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                mo4292f1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4325j1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1247j jVar) {
        this.f3997r0 = jVar;
        C0727l0.m2875Y(this, jVar);
    }

    public void setAdapter(C1171h hVar) {
        setLayoutFrozen(false);
        m4856h1(hVar, false, true);
        mo4254P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1175k kVar) {
        if (kVar != this.f3999s0) {
            this.f3999s0 = kVar;
            setChildrenDrawingOrderEnabled(kVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3980j) {
            mo4353r0();
        }
        this.f3980j = z;
        super.setClipToPadding(z);
        if (this.f4010y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1176l lVar) {
        C0623f.m2495f(lVar);
        this.f3953L = lVar;
        mo4353r0();
    }

    public void setHasFixedSize(boolean z) {
        this.f4006w = z;
    }

    public void setItemAnimator(C1177m mVar) {
        C1177m mVar2 = this.f3958Q;
        if (mVar2 != null) {
            mVar2.mo4526k();
            this.f3958Q.mo4537v((C1177m.C1179b) null);
        }
        this.f3958Q = mVar;
        if (mVar != null) {
            mVar.mo4537v(this.f3993p0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3970e.mo4671G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1183p pVar) {
        if (pVar != this.f3992p) {
            mo4362s1();
            if (this.f3992p != null) {
                C1177m mVar = this.f3958Q;
                if (mVar != null) {
                    mVar.mo4526k();
                }
                this.f3992p.mo4607j1(this.f3970e);
                this.f3992p.mo4609k1(this.f3970e);
                this.f3970e.mo4678c();
                if (this.f4004v) {
                    this.f3992p.mo4546A(this, this.f3970e);
                }
                this.f3992p.mo4552C1((RecyclerView) null);
                this.f3992p = null;
            } else {
                this.f3970e.mo4678c();
            }
            this.f3976h.mo4846o();
            this.f3992p = pVar;
            if (pVar != null) {
                if (pVar.f4089b == null) {
                    pVar.mo4552C1(this);
                    if (this.f4004v) {
                        this.f3992p.mo4634z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f4089b.mo4252O());
                }
            }
            this.f3970e.mo4674K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2813m(z);
    }

    public void setOnFlingListener(C1190s sVar) {
    }

    @Deprecated
    public void setOnScrollListener(C1192u uVar) {
        this.f3985l0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3975g0 = z;
    }

    public void setRecycledViewPool(C1193v vVar) {
        this.f3970e.mo4669E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(C1196x xVar) {
        this.f3994q = xVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3959R) {
            this.f3959R = i;
            if (i != 2) {
                m4865t1();
            }
            mo4239G(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3966b0 = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3966b0 = i2;
    }

    public void setViewCacheExtension(C1164c0 c0Var) {
        this.f3970e.mo4670F(c0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2814o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2816q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3940B) {
            mo4332n("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3940B = false;
                if (!(!this.f3938A || this.f3992p == null || this.f3990o == null)) {
                    requestLayout();
                }
                this.f3938A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3940B = true;
            this.f3942C = true;
            mo4362s1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4389t() {
        if (!this.f4010y || this.f3949H) {
            C0586i.m2412a("RV FullInvalidate");
            mo4230A();
            C0586i.m2413b();
        } else if (this.f3974g.mo4824p()) {
            if (this.f3974g.mo4823o(4) && !this.f3974g.mo4823o(11)) {
                C0586i.m2412a("RV PartialInvalidate");
                mo4336o1();
                mo4240G0();
                this.f3974g.mo4827t();
                if (!this.f3938A) {
                    if (m4860m0()) {
                        mo4230A();
                    } else {
                        this.f3974g.mo4818i();
                    }
                }
                mo4351q1(true);
                mo4242H0();
            } else if (this.f3974g.mo4824p()) {
                C0586i.m2412a("RV FullInvalidate");
                mo4230A();
            } else {
                return;
            }
            C0586i.m2413b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo4390t0() {
        AccessibilityManager accessibilityManager = this.f3947F;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: u0 */
    public boolean mo4391u0() {
        return this.f3951J > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo4392u1(int i, int i2, Object obj) {
        int i3;
        int j = this.f3976h.mo4842j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f3976h.mo4841i(i5);
            C1168e0 f0 = m4853f0(i6);
            if (f0 != null && !f0.mo4454J() && (i3 = f0.f4051c) >= i && i3 < i4) {
                f0.mo4458b(2);
                f0.mo4457a(obj);
                ((C1188q) i6.getLayoutParams()).f4114c = true;
            }
        }
        this.f3970e.mo4676M(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4393v(int i, int i2) {
        setMeasuredDimension(C1183p.m5113n(i, getPaddingLeft() + getPaddingRight(), C0727l0.m2918w(this)), C1183p.m5113n(i2, getPaddingTop() + getPaddingBottom(), C0727l0.m2917v(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo4394w0() {
        int j = this.f3976h.mo4842j();
        for (int i = 0; i < j; i++) {
            ((C1188q) this.f3976h.mo4841i(i).getLayoutParams()).f4114c = true;
        }
        this.f3970e.mo4692s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4395x(View view) {
        C1168e0 f0 = m4853f0(view);
        mo4236E0(view);
        C1171h hVar = this.f3990o;
        if (!(hVar == null || f0 == null)) {
            hVar.mo4503t(f0);
        }
        List<C1189r> list = this.f3948G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3948G.get(size).mo4647a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo4396x0() {
        int j = this.f3976h.mo4842j();
        for (int i = 0; i < j; i++) {
            C1168e0 f0 = m4853f0(this.f3976h.mo4841i(i));
            if (f0 != null && !f0.mo4454J()) {
                f0.mo4458b(6);
            }
        }
        mo4394w0();
        this.f3970e.mo4693t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4397y(View view) {
        C1168e0 f0 = m4853f0(view);
        mo4238F0(view);
        C1171h hVar = this.f3990o;
        if (!(hVar == null || f0 == null)) {
            hVar.mo4504u(f0);
        }
        List<C1189r> list = this.f3948G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3948G.get(size).mo4648b(view);
            }
        }
    }

    /* renamed from: z0 */
    public void mo4398z0(int i) {
        int g = this.f3976h.mo4840g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3976h.mo4839f(i2).offsetLeftAndRight(i);
        }
    }
}
