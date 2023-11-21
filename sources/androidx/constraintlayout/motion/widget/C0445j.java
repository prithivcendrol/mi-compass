package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0452l;
import androidx.constraintlayout.widget.C0463d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0678d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.constraintlayout.motion.widget.j */
public class C0445j extends ConstraintLayout implements C0678d0 {

    /* renamed from: x0 */
    public static boolean f1617x0;

    /* renamed from: B */
    Interpolator f1618B;

    /* renamed from: C */
    Interpolator f1619C;

    /* renamed from: D */
    float f1620D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f1621E;

    /* renamed from: F */
    int f1622F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f1623G;

    /* renamed from: H */
    private boolean f1624H;

    /* renamed from: I */
    HashMap<View, C0442g> f1625I;

    /* renamed from: J */
    private long f1626J;

    /* renamed from: K */
    private float f1627K;

    /* renamed from: L */
    float f1628L;

    /* renamed from: M */
    float f1629M;

    /* renamed from: N */
    private long f1630N;

    /* renamed from: O */
    float f1631O;

    /* renamed from: P */
    private boolean f1632P;

    /* renamed from: Q */
    boolean f1633Q;

    /* renamed from: R */
    private C0449d f1634R;

    /* renamed from: S */
    int f1635S;

    /* renamed from: T */
    private boolean f1636T;

    /* renamed from: U */
    private C0437b f1637U;

    /* renamed from: V */
    boolean f1638V;

    /* renamed from: W */
    float f1639W;

    /* renamed from: a0 */
    float f1640a0;

    /* renamed from: b0 */
    long f1641b0;

    /* renamed from: c0 */
    float f1642c0;

    /* renamed from: d0 */
    private boolean f1643d0;

    /* renamed from: e0 */
    private ArrayList<C0443h> f1644e0;

    /* renamed from: f0 */
    private ArrayList<C0443h> f1645f0;

    /* renamed from: g0 */
    private ArrayList<C0443h> f1646g0;

    /* renamed from: h0 */
    private CopyOnWriteArrayList<C0449d> f1647h0;

    /* renamed from: i0 */
    private int f1648i0;

    /* renamed from: j0 */
    private float f1649j0;

    /* renamed from: k0 */
    boolean f1650k0;

    /* renamed from: l0 */
    protected boolean f1651l0;

    /* renamed from: m0 */
    float f1652m0;

    /* renamed from: n0 */
    private boolean f1653n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C0448c f1654o0;

    /* renamed from: p0 */
    private Runnable f1655p0;

    /* renamed from: q0 */
    private int[] f1656q0;

    /* renamed from: r0 */
    int f1657r0;

    /* renamed from: s0 */
    private int f1658s0;

    /* renamed from: t0 */
    private boolean f1659t0;

    /* renamed from: u0 */
    C0450e f1660u0;

    /* renamed from: v0 */
    private boolean f1661v0;

    /* renamed from: w0 */
    ArrayList<Integer> f1662w0;

    /* renamed from: androidx.constraintlayout.motion.widget.j$a */
    class C0446a implements Runnable {
        C0446a() {
        }

        public void run() {
            C0445j.this.f1654o0.mo2408a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.j$b */
    static /* synthetic */ class C0447b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.j$e[] r0 = androidx.constraintlayout.motion.widget.C0445j.C0450e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1664a = r0
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.C0445j.C0450e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1664a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.C0445j.C0450e.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1664a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.C0445j.C0450e.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1664a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.C0445j.C0450e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0445j.C0447b.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.j$c */
    class C0448c {

        /* renamed from: a */
        float f1665a = Float.NaN;

        /* renamed from: b */
        float f1666b = Float.NaN;

        /* renamed from: c */
        int f1667c = -1;

        /* renamed from: d */
        int f1668d = -1;

        /* renamed from: e */
        final String f1669e = "motion.progress";

        /* renamed from: f */
        final String f1670f = "motion.velocity";

        /* renamed from: g */
        final String f1671g = "motion.StartState";

        /* renamed from: h */
        final String f1672h = "motion.EndState";

        C0448c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2408a() {
            int i = this.f1667c;
            if (!(i == -1 && this.f1668d == -1)) {
                if (i == -1) {
                    C0445j.this.mo2361N(this.f1668d);
                } else {
                    int i2 = this.f1668d;
                    if (i2 == -1) {
                        C0445j.this.mo2358K(i, -1, -1);
                    } else {
                        C0445j.this.mo2359L(i, i2);
                    }
                }
                C0445j.this.setState(C0450e.SETUP);
            }
            if (!Float.isNaN(this.f1666b)) {
                C0445j.this.mo2357J(this.f1665a, this.f1666b);
                this.f1665a = Float.NaN;
                this.f1666b = Float.NaN;
                this.f1667c = -1;
                this.f1668d = -1;
            } else if (!Float.isNaN(this.f1665a)) {
                C0445j.this.setProgress(this.f1665a);
            }
        }

        /* renamed from: b */
        public Bundle mo2409b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1665a);
            bundle.putFloat("motion.velocity", this.f1666b);
            bundle.putInt("motion.StartState", this.f1667c);
            bundle.putInt("motion.EndState", this.f1668d);
            return bundle;
        }

        /* renamed from: c */
        public void mo2410c() {
            this.f1668d = C0445j.this.f1623G;
            this.f1667c = C0445j.this.f1621E;
            this.f1666b = C0445j.this.getVelocity();
            this.f1665a = C0445j.this.getProgress();
        }

        /* renamed from: d */
        public void mo2411d(int i) {
            this.f1668d = i;
        }

        /* renamed from: e */
        public void mo2412e(float f) {
            this.f1665a = f;
        }

        /* renamed from: f */
        public void mo2413f(int i) {
            this.f1667c = i;
        }

        /* renamed from: g */
        public void mo2414g(Bundle bundle) {
            this.f1665a = bundle.getFloat("motion.progress");
            this.f1666b = bundle.getFloat("motion.velocity");
            this.f1667c = bundle.getInt("motion.StartState");
            this.f1668d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo2415h(float f) {
            this.f1666b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.j$d */
    public interface C0449d {
        /* renamed from: a */
        void mo2341a(C0445j jVar, int i, int i2, float f);

        /* renamed from: b */
        void mo2342b(C0445j jVar, int i, int i2);

        /* renamed from: c */
        void mo2343c(C0445j jVar, int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.j$e */
    enum C0450e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: F */
    private void m1907F() {
        CopyOnWriteArrayList<C0449d> copyOnWriteArrayList;
        if ((this.f1634R != null || ((copyOnWriteArrayList = this.f1647h0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1649j0 != this.f1628L) {
            if (this.f1648i0 != -1) {
                C0449d dVar = this.f1634R;
                if (dVar != null) {
                    dVar.mo2342b(this, this.f1621E, this.f1623G);
                }
                CopyOnWriteArrayList<C0449d> copyOnWriteArrayList2 = this.f1647h0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0449d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2342b(this, this.f1621E, this.f1623G);
                    }
                }
                this.f1650k0 = true;
            }
            this.f1648i0 = -1;
            float f = this.f1628L;
            this.f1649j0 = f;
            C0449d dVar2 = this.f1634R;
            if (dVar2 != null) {
                dVar2.mo2341a(this, this.f1621E, this.f1623G, f);
            }
            CopyOnWriteArrayList<C0449d> copyOnWriteArrayList3 = this.f1647h0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0449d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2341a(this, this.f1621E, this.f1623G, this.f1628L);
                }
            }
            this.f1650k0 = true;
        }
    }

    /* renamed from: I */
    private void m1908I() {
        CopyOnWriteArrayList<C0449d> copyOnWriteArrayList;
        if (this.f1634R != null || ((copyOnWriteArrayList = this.f1647h0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f1650k0 = false;
            Iterator<Integer> it = this.f1662w0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0449d dVar = this.f1634R;
                if (dVar != null) {
                    dVar.mo2343c(this, next.intValue());
                }
                CopyOnWriteArrayList<C0449d> copyOnWriteArrayList2 = this.f1647h0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0449d> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo2343c(this, next.intValue());
                    }
                }
            }
            this.f1662w0.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo2353D(float f) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0211, code lost:
        if (r1 != r2) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0221, code lost:
        if (r1 != r2) goto L_0x0215;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2354E(boolean r22) {
        /*
            r21 = this;
            r0 = r21
            long r1 = r0.f1630N
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r21.getNanoTime()
            r0.f1630N = r1
        L_0x0010:
            float r1 = r0.f1629M
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.f1622F = r4
        L_0x0020:
            boolean r3 = r0.f1643d0
            r7 = 0
            if (r3 != 0) goto L_0x0035
            boolean r3 = r0.f1633Q
            if (r3 == 0) goto L_0x0032
            if (r22 != 0) goto L_0x0035
            float r3 = r0.f1631O
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r6 = 1
            goto L_0x0207
        L_0x0035:
            float r3 = r0.f1631O
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r21.getNanoTime()
            android.view.animation.Interpolator r3 = r0.f1618B
            boolean r10 = r3 instanceof androidx.constraintlayout.motion.widget.C0444i
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0054
            long r12 = r0.f1630N
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f1627K
            float r10 = r10 / r12
            goto L_0x0055
        L_0x0054:
            r10 = r2
        L_0x0055:
            float r12 = r0.f1629M
            float r12 = r12 + r10
            boolean r13 = r0.f1632P
            if (r13 == 0) goto L_0x005e
            float r12 = r0.f1631O
        L_0x005e:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0068
            float r14 = r0.f1631O
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0072
        L_0x0068:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0078
            float r14 = r0.f1631O
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0078
        L_0x0072:
            float r12 = r0.f1631O
            r0.f1633Q = r7
            r14 = 1
            goto L_0x0079
        L_0x0078:
            r14 = r7
        L_0x0079:
            r0.f1629M = r12
            r0.f1628L = r12
            r0.f1630N = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x00ed
            if (r14 != 0) goto L_0x00ed
            boolean r14 = r0.f1636T
            if (r14 == 0) goto L_0x00d0
            long r6 = r0.f1626J
            long r6 = r8 - r6
            float r6 = (float) r6
            float r6 = r6 * r11
            float r3 = r3.getInterpolation(r6)
            android.view.animation.Interpolator r6 = r0.f1618B
            r6.getClass()
            r0.f1629M = r3
            r0.f1630N = r8
            boolean r7 = r6 instanceof androidx.constraintlayout.motion.widget.C0444i
            if (r7 == 0) goto L_0x00eb
            androidx.constraintlayout.motion.widget.i r6 = (androidx.constraintlayout.motion.widget.C0444i) r6
            float r6 = r6.mo2352a()
            r0.f1620D = r6
            float r7 = java.lang.Math.abs(r6)
            float r8 = r0.f1627K
            float r7 = r7 * r8
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00c1
            r0.f1629M = r5
            r7 = 0
            r0.f1633Q = r7
            r3 = r5
            goto L_0x00c2
        L_0x00c1:
            r7 = 0
        L_0x00c2:
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            r0.f1629M = r2
            r0.f1633Q = r7
            r12 = r2
            goto L_0x00ef
        L_0x00d0:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r6 = r0.f1618B
            boolean r7 = r6 instanceof androidx.constraintlayout.motion.widget.C0444i
            if (r7 == 0) goto L_0x00e1
            androidx.constraintlayout.motion.widget.i r6 = (androidx.constraintlayout.motion.widget.C0444i) r6
            float r6 = r6.mo2352a()
            goto L_0x00e9
        L_0x00e1:
            float r12 = r12 + r10
            float r6 = r6.getInterpolation(r12)
            float r6 = r6 - r3
            float r6 = r6 * r1
            float r6 = r6 / r10
        L_0x00e9:
            r0.f1620D = r6
        L_0x00eb:
            r12 = r3
            goto L_0x00ef
        L_0x00ed:
            r0.f1620D = r10
        L_0x00ef:
            float r3 = r0.f1620D
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            androidx.constraintlayout.motion.widget.j$e r3 = androidx.constraintlayout.motion.widget.C0445j.C0450e.MOVING
            r0.setState(r3)
        L_0x00fe:
            if (r13 <= 0) goto L_0x0106
            float r3 = r0.f1631O
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0110
        L_0x0106:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0115
            float r3 = r0.f1631O
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0115
        L_0x0110:
            float r12 = r0.f1631O
            r3 = 0
            r0.f1633Q = r3
        L_0x0115:
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0120
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r7 = 0
            goto L_0x0128
        L_0x0120:
            r7 = 0
            r0.f1633Q = r7
            androidx.constraintlayout.motion.widget.j$e r3 = androidx.constraintlayout.motion.widget.C0445j.C0450e.FINISHED
            r0.setState(r3)
        L_0x0128:
            int r3 = r21.getChildCount()
            r0.f1643d0 = r7
            long r8 = r21.getNanoTime()
            r0.f1652m0 = r12
            android.view.animation.Interpolator r6 = r0.f1619C
            if (r6 != 0) goto L_0x013a
            r6 = r12
            goto L_0x013e
        L_0x013a:
            float r6 = r6.getInterpolation(r12)
        L_0x013e:
            android.view.animation.Interpolator r10 = r0.f1619C
            if (r10 == 0) goto L_0x0156
            float r11 = r0.f1627K
            float r11 = r1 / r11
            float r11 = r11 + r12
            float r10 = r10.getInterpolation(r11)
            r0.f1620D = r10
            android.view.animation.Interpolator r11 = r0.f1619C
            float r11 = r11.getInterpolation(r12)
            float r10 = r10 - r11
            r0.f1620D = r10
        L_0x0156:
            r10 = r7
        L_0x0157:
            if (r10 >= r3) goto L_0x017c
            android.view.View r11 = r0.getChildAt(r10)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.g> r15 = r0.f1625I
            java.lang.Object r15 = r15.get(r11)
            androidx.constraintlayout.motion.widget.g r15 = (androidx.constraintlayout.motion.widget.C0442g) r15
            if (r15 == 0) goto L_0x0178
            boolean r7 = r0.f1643d0
            r20 = 0
            r16 = r11
            r17 = r6
            r18 = r8
            boolean r11 = r15.mo2339c(r16, r17, r18, r20)
            r7 = r7 | r11
            r0.f1643d0 = r7
        L_0x0178:
            int r10 = r10 + 1
            r7 = 0
            goto L_0x0157
        L_0x017c:
            if (r13 <= 0) goto L_0x0184
            float r3 = r0.f1631O
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x018e
        L_0x0184:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0190
            float r3 = r0.f1631O
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0190
        L_0x018e:
            r7 = 1
            goto L_0x0191
        L_0x0190:
            r7 = 0
        L_0x0191:
            boolean r3 = r0.f1643d0
            if (r3 != 0) goto L_0x01a0
            boolean r3 = r0.f1633Q
            if (r3 != 0) goto L_0x01a0
            if (r7 == 0) goto L_0x01a0
            androidx.constraintlayout.motion.widget.j$e r3 = androidx.constraintlayout.motion.widget.C0445j.C0450e.FINISHED
            r0.setState(r3)
        L_0x01a0:
            boolean r3 = r0.f1651l0
            if (r3 == 0) goto L_0x01a7
            r21.requestLayout()
        L_0x01a7:
            boolean r3 = r0.f1643d0
            r6 = 1
            r7 = r7 ^ r6
            r3 = r3 | r7
            r0.f1643d0 = r3
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r8 = 0
            if (r7 > 0) goto L_0x01bf
            int r7 = r0.f1621E
            if (r7 == r4) goto L_0x01bf
            int r4 = r0.f1622F
            if (r4 != r7) goto L_0x01bc
            goto L_0x01bf
        L_0x01bc:
            r0.f1622F = r7
            throw r8
        L_0x01bf:
            double r9 = (double) r12
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 < 0) goto L_0x01d0
            int r4 = r0.f1622F
            int r7 = r0.f1623G
            if (r4 != r7) goto L_0x01cd
            goto L_0x01d0
        L_0x01cd:
            r0.f1622F = r7
            throw r8
        L_0x01d0:
            if (r3 != 0) goto L_0x01eb
            boolean r3 = r0.f1633Q
            if (r3 == 0) goto L_0x01d7
            goto L_0x01eb
        L_0x01d7:
            if (r13 <= 0) goto L_0x01dd
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01e5
        L_0x01dd:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ee
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x01ee
        L_0x01e5:
            androidx.constraintlayout.motion.widget.j$e r3 = androidx.constraintlayout.motion.widget.C0445j.C0450e.FINISHED
            r0.setState(r3)
            goto L_0x01ee
        L_0x01eb:
            r21.invalidate()
        L_0x01ee:
            boolean r3 = r0.f1643d0
            if (r3 != 0) goto L_0x0207
            boolean r3 = r0.f1633Q
            if (r3 != 0) goto L_0x0207
            if (r13 <= 0) goto L_0x01fc
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0204
        L_0x01fc:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0207
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0207
        L_0x0204:
            r21.mo2356H()
        L_0x0207:
            float r1 = r0.f1629M
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0219
            int r1 = r0.f1622F
            int r2 = r0.f1623G
            if (r1 == r2) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            r6 = 0
        L_0x0215:
            r0.f1622F = r2
            r7 = r6
            goto L_0x0225
        L_0x0219:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0224
            int r1 = r0.f1622F
            int r2 = r0.f1621E
            if (r1 == r2) goto L_0x0214
            goto L_0x0215
        L_0x0224:
            r7 = 0
        L_0x0225:
            boolean r1 = r0.f1661v0
            r1 = r1 | r7
            r0.f1661v0 = r1
            if (r7 == 0) goto L_0x0233
            boolean r1 = r0.f1653n0
            if (r1 != 0) goto L_0x0233
            r21.requestLayout()
        L_0x0233:
            float r1 = r0.f1629M
            r0.f1628L = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0445j.mo2354E(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo2355G() {
        int i;
        CopyOnWriteArrayList<C0449d> copyOnWriteArrayList;
        if ((this.f1634R != null || ((copyOnWriteArrayList = this.f1647h0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1648i0 == -1) {
            this.f1648i0 = this.f1622F;
            if (!this.f1662w0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f1662w0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f1622F;
            if (!(i == i2 || i2 == -1)) {
                this.f1662w0.add(Integer.valueOf(i2));
            }
        }
        m1908I();
        Runnable runnable = this.f1655p0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f1656q0;
        if (iArr != null && this.f1657r0 > 0) {
            mo2361N(iArr[0]);
            int[] iArr2 = this.f1656q0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f1657r0--;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo2356H() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r3 > 0.5f) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r4 > 0) goto L_0x002f;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2357J(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L_0x001c
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f1654o0
            if (r0 != 0) goto L_0x0011
            androidx.constraintlayout.motion.widget.j$c r0 = new androidx.constraintlayout.motion.widget.j$c
            r0.<init>()
            r2.f1654o0 = r0
        L_0x0011:
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f1654o0
            r0.mo2412e(r3)
            androidx.constraintlayout.motion.widget.j$c r3 = r2.f1654o0
            r3.mo2415h(r4)
            return
        L_0x001c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.j$e r0 = androidx.constraintlayout.motion.widget.C0445j.C0450e.MOVING
            r2.setState(r0)
            r2.f1620D = r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x0034
            if (r4 <= 0) goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r2.mo2353D(r0)
            goto L_0x0043
        L_0x0034:
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0043
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0043
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0030
            goto L_0x002f
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0445j.mo2357J(float, float):void");
    }

    /* renamed from: K */
    public void mo2358K(int i, int i2, int i3) {
        setState(C0450e.SETUP);
        this.f1622F = i;
        this.f1621E = -1;
        this.f1623G = -1;
        C0463d dVar = this.f1709n;
        if (dVar != null) {
            dVar.mo2492d(i, (float) i2, (float) i3);
        }
    }

    /* renamed from: L */
    public void mo2359L(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f1654o0 == null) {
                this.f1654o0 = new C0448c();
            }
            this.f1654o0.mo2413f(i);
            this.f1654o0.mo2411d(i2);
        }
    }

    /* renamed from: M */
    public void mo2360M() {
        mo2353D(1.0f);
        this.f1655p0 = null;
    }

    /* renamed from: N */
    public void mo2361N(int i) {
        if (!isAttachedToWindow()) {
            if (this.f1654o0 == null) {
                this.f1654o0 = new C0448c();
            }
            this.f1654o0.mo2411d(i);
            return;
        }
        mo2362O(i, -1, -1);
    }

    /* renamed from: O */
    public void mo2362O(int i, int i2, int i3) {
        mo2363P(i, i2, i3, -1);
    }

    /* renamed from: P */
    public void mo2363P(int i, int i2, int i3, int i4) {
        int i5 = this.f1622F;
        if (i5 != i) {
            if (this.f1621E == i) {
                mo2353D(0.0f);
                if (i4 > 0) {
                    this.f1627K = ((float) i4) / 1000.0f;
                }
            } else if (this.f1623G == i) {
                mo2353D(1.0f);
                if (i4 > 0) {
                    this.f1627K = ((float) i4) / 1000.0f;
                }
            } else {
                this.f1623G = i;
                if (i5 != -1) {
                    mo2359L(i5, i);
                    mo2353D(1.0f);
                    this.f1629M = 0.0f;
                    mo2360M();
                    if (i4 > 0) {
                        this.f1627K = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f1636T = false;
                this.f1631O = 1.0f;
                this.f1628L = 0.0f;
                this.f1629M = 0.0f;
                this.f1630N = getNanoTime();
                this.f1626J = getNanoTime();
                this.f1632P = false;
                this.f1618B = null;
                if (i4 == -1) {
                    throw null;
                }
                this.f1621E = -1;
                throw null;
            }
        }
    }

    /* renamed from: c */
    public void mo1174c(View view, View view2, int i, int i2) {
        this.f1641b0 = getNanoTime();
        this.f1642c0 = 0.0f;
        this.f1639W = 0.0f;
        this.f1640a0 = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<C0443h> arrayList = this.f1646g0;
        if (arrayList != null) {
            Iterator<C0443h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2350w(canvas);
            }
        }
        mo2354E(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f1622F;
    }

    public ArrayList<C0452l.C0453a> getDefinedTransitions() {
        return null;
    }

    public C0437b getDesignTool() {
        if (this.f1637U == null) {
            this.f1637U = new C0437b(this);
        }
        return this.f1637U;
    }

    public int getEndState() {
        return this.f1623G;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1629M;
    }

    public C0452l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f1621E;
    }

    public float getTargetPosition() {
        return this.f1631O;
    }

    public Bundle getTransitionState() {
        if (this.f1654o0 == null) {
            this.f1654o0 = new C0448c();
        }
        this.f1654o0.mo2410c();
        return this.f1654o0.mo2409b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.f1627K * 1000.0f);
    }

    public float getVelocity() {
        return this.f1620D;
    }

    /* renamed from: i */
    public void mo1189i(View view, int i) {
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j */
    public void mo1190j(View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: m */
    public void mo1193m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f1638V && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f1638V = false;
    }

    /* renamed from: n */
    public void mo1194n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: o */
    public boolean mo1195o(View view, View view2, int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f1658s0 = display.getRotation();
        }
        mo2356H();
        C0448c cVar = this.f1654o0;
        if (cVar == null) {
            return;
        }
        if (this.f1659t0) {
            post(new C0446a());
        } else {
            cVar.mo2408a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1653n0 = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.f1653n0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0443h) {
            C0443h hVar = (C0443h) view;
            if (this.f1647h0 == null) {
                this.f1647h0 = new CopyOnWriteArrayList<>();
            }
            this.f1647h0.add(hVar);
            if (hVar.mo2349v()) {
                if (this.f1644e0 == null) {
                    this.f1644e0 = new ArrayList<>();
                }
                this.f1644e0.add(hVar);
            }
            if (hVar.mo2348u()) {
                if (this.f1645f0 == null) {
                    this.f1645f0 = new ArrayList<>();
                }
                this.f1645f0.add(hVar);
            }
            if (hVar.mo2347t()) {
                if (this.f1646g0 == null) {
                    this.f1646g0 = new ArrayList<>();
                }
                this.f1646g0.add(hVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C0443h> arrayList = this.f1644e0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C0443h> arrayList2 = this.f1645f0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        if (!this.f1651l0) {
            int i = this.f1622F;
        }
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo2390s(int i) {
        this.f1709n = null;
    }

    public void setDebugMode(int i) {
        this.f1635S = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f1659t0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f1624H = z;
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C0443h> arrayList = this.f1645f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1645f0.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C0443h> arrayList = this.f1644e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1644e0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        C0450e eVar;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1654o0 == null) {
                this.f1654o0 = new C0448c();
            }
            this.f1654o0.mo2412e(f);
            return;
        }
        if (i <= 0) {
            if (this.f1629M == 1.0f && this.f1622F == this.f1623G) {
                setState(C0450e.MOVING);
            }
            this.f1622F = this.f1621E;
            if (this.f1629M != 0.0f) {
                return;
            }
        } else if (f >= 1.0f) {
            if (this.f1629M == 0.0f && this.f1622F == this.f1621E) {
                setState(C0450e.MOVING);
            }
            this.f1622F = this.f1623G;
            if (this.f1629M != 1.0f) {
                return;
            }
        } else {
            this.f1622F = -1;
            eVar = C0450e.MOVING;
            setState(eVar);
        }
        eVar = C0450e.FINISHED;
        setState(eVar);
    }

    public void setScene(C0452l lVar) {
        mo2437q();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f1654o0 == null) {
                this.f1654o0 = new C0448c();
            }
            this.f1654o0.mo2413f(i);
            this.f1654o0.mo2411d(i);
            return;
        }
        this.f1622F = i;
    }

    /* access modifiers changed from: package-private */
    public void setState(C0450e eVar) {
        C0450e eVar2 = C0450e.FINISHED;
        if (eVar != eVar2 || this.f1622F != -1) {
            C0450e eVar3 = this.f1660u0;
            this.f1660u0 = eVar;
            C0450e eVar4 = C0450e.MOVING;
            if (eVar3 == eVar4 && eVar == eVar4) {
                m1907F();
            }
            int i = C0447b.f1664a[eVar3.ordinal()];
            if (i == 1 || i == 2) {
                if (eVar == eVar4) {
                    m1907F();
                }
                if (eVar != eVar2) {
                    return;
                }
            } else if (!(i == 3 && eVar == eVar2)) {
                return;
            }
            mo2355G();
        }
    }

    public void setTransition(int i) {
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0452l.C0453a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(C0449d dVar) {
        this.f1634R = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1654o0 == null) {
            this.f1654o0 = new C0448c();
        }
        this.f1654o0.mo2414g(bundle);
        if (isAttachedToWindow()) {
            this.f1654o0.mo2408a();
        }
    }

    public String toString() {
        Context context = getContext();
        return C0436a.m1887a(context, this.f1621E) + "->" + C0436a.m1887a(context, this.f1623G) + " (pos:" + this.f1629M + " Dpos/Dt:" + this.f1620D;
    }
}
