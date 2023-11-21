package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p075m.C1884a;
import p075m.C1885b;
import p099q.C2554b;
import p099q.C2556c;
import p099q.C2558d;

/* renamed from: androidx.constraintlayout.motion.widget.g */
public class C0442g {

    /* renamed from: a */
    boolean f1588a;

    /* renamed from: b */
    private C0451k f1589b;

    /* renamed from: c */
    private C0451k f1590c;

    /* renamed from: d */
    private C0441f f1591d;

    /* renamed from: e */
    private C0441f f1592e;

    /* renamed from: f */
    private C1884a[] f1593f;

    /* renamed from: g */
    private C1884a f1594g;

    /* renamed from: h */
    float f1595h;

    /* renamed from: i */
    float f1596i;

    /* renamed from: j */
    private int[] f1597j;

    /* renamed from: k */
    private double[] f1598k;

    /* renamed from: l */
    private double[] f1599l;

    /* renamed from: m */
    private String[] f1600m;

    /* renamed from: n */
    private float[] f1601n;

    /* renamed from: o */
    private ArrayList<C0451k> f1602o;

    /* renamed from: p */
    private HashMap<String, C2558d> f1603p;

    /* renamed from: q */
    private HashMap<String, C2556c> f1604q;

    /* renamed from: r */
    private HashMap<String, C2554b> f1605r;

    /* renamed from: s */
    private C0440e[] f1606s;

    /* renamed from: t */
    private int f1607t;

    /* renamed from: u */
    private View f1608u;

    /* renamed from: v */
    private int f1609v;

    /* renamed from: w */
    private float f1610w;

    /* renamed from: x */
    private Interpolator f1611x;

    /* renamed from: y */
    private boolean f1612y;

    /* renamed from: a */
    private float m1891a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f1596i;
            if (((double) f4) != 1.0d) {
                float f5 = this.f1595h;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C1885b bVar = this.f1589b.f1680d;
        float f6 = Float.NaN;
        Iterator<C0451k> it = this.f1602o.iterator();
        while (it.hasNext()) {
            C0451k next = it.next();
            C1885b bVar2 = next.f1680d;
            if (bVar2 != null) {
                float f7 = next.f1682f;
                if (f7 < f) {
                    bVar = bVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f1682f;
                }
            }
        }
        if (bVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) bVar.mo6440a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) bVar.mo6441b(d);
            }
        }
        return f;
    }

    /* renamed from: b */
    public void mo2338b(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f1593f[0].mo6437b(d, dArr);
        this.f1593f[0].mo6439d(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f1589b.mo2417b(d, this.f1597j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: q.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: q.d$a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2339c(android.view.View r21, float r22, long r23, p075m.C1886c r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.m1891a(r2, r1)
            int r3 = r0.f1609v
            int r4 = androidx.constraintlayout.motion.widget.C0439d.f1585a
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0042
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f1610w
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002d
            float r5 = r0.f1610w
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002d:
            android.view.animation.Interpolator r5 = r0.f1611x
            if (r5 == 0) goto L_0x0036
            float r2 = r5.getInterpolation(r2)
            goto L_0x0040
        L_0x0036:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            r2 = r13
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0042:
            r14 = r2
            java.util.HashMap<java.lang.String, q.c> r2 = r0.f1604q
            if (r2 == 0) goto L_0x005f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            q.c r3 = (p099q.C2556c) r3
            r3.mo9795b(r11, r14)
            goto L_0x004f
        L_0x005f:
            java.util.HashMap<java.lang.String, q.d> r2 = r0.f1603p
            r15 = 0
            if (r2 == 0) goto L_0x0093
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L_0x006e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r7.next()
            q.d r1 = (p099q.C2558d) r1
            boolean r2 = r1 instanceof p099q.C2558d.C2559a
            if (r2 == 0) goto L_0x0082
            r8 = r1
            q.d$a r8 = (p099q.C2558d.C2559a) r8
            goto L_0x006e
        L_0x0082:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.mo9798b(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x006e
        L_0x008f:
            r16 = r9
            r9 = r8
            goto L_0x0096
        L_0x0093:
            r9 = r1
            r16 = r15
        L_0x0096:
            m.a[] r1 = r0.f1593f
            r10 = 1
            if (r1 == 0) goto L_0x01ec
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f1598k
            r1.mo6437b(r7, r2)
            m.a[] r1 = r0.f1593f
            r1 = r1[r15]
            double[] r2 = r0.f1599l
            r1.mo6439d(r7, r2)
            m.a r1 = r0.f1594g
            if (r1 == 0) goto L_0x00bf
            double[] r2 = r0.f1598k
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00bf
            r1.mo6437b(r7, r2)
            m.a r1 = r0.f1594g
            double[] r2 = r0.f1599l
            r1.mo6439d(r7, r2)
        L_0x00bf:
            boolean r1 = r0.f1612y
            if (r1 != 0) goto L_0x00df
            androidx.constraintlayout.motion.widget.k r1 = r0.f1589b
            int[] r4 = r0.f1597j
            double[] r5 = r0.f1598k
            double[] r6 = r0.f1599l
            r17 = 0
            boolean r3 = r0.f1588a
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.mo2418c(r2, r3, r4, r5, r6, r7, r8)
            r0.f1588a = r15
            goto L_0x00e0
        L_0x00df:
            r12 = r7
        L_0x00e0:
            int r1 = r0.f1607t
            int r2 = androidx.constraintlayout.motion.widget.C0439d.f1585a
            if (r1 == r2) goto L_0x0142
            android.view.View r1 = r0.f1608u
            if (r1 != 0) goto L_0x00f8
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f1607t
            android.view.View r1 = r1.findViewById(r2)
            r0.f1608u = r1
        L_0x00f8:
            android.view.View r1 = r0.f1608u
            if (r1 == 0) goto L_0x0142
            int r1 = r1.getTop()
            android.view.View r2 = r0.f1608u
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f1608u
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f1608u
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0142:
            java.util.HashMap<java.lang.String, q.c> r1 = r0.f1604q
            if (r1 == 0) goto L_0x0170
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x014e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0170
            java.lang.Object r1 = r8.next()
            m.e r1 = (p075m.C1890e) r1
            boolean r2 = r1 instanceof p099q.C2556c.C2557a
            if (r2 == 0) goto L_0x014e
            double[] r2 = r0.f1599l
            int r3 = r2.length
            if (r3 <= r10) goto L_0x014e
            q.c$a r1 = (p099q.C2556c.C2557a) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.mo9796c(r2, r3, r4, r6)
            goto L_0x014e
        L_0x0170:
            if (r9 == 0) goto L_0x018d
            double[] r1 = r0.f1599l
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = r10
            r9 = r17
            boolean r1 = r1.mo9799c(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x018f
        L_0x018d:
            r19 = r10
        L_0x018f:
            r10 = r19
        L_0x0191:
            m.a[] r1 = r0.f1593f
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b5
            r1 = r1[r10]
            float[] r2 = r0.f1601n
            r1.mo6438c(r12, r2)
            androidx.constraintlayout.motion.widget.k r1 = r0.f1589b
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.b> r1 = r1.f1694r
            java.lang.String[] r2 = r0.f1600m
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0459b) r1
            float[] r2 = r0.f1601n
            p099q.C2552a.m10894b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0191
        L_0x01b5:
            androidx.constraintlayout.motion.widget.f r1 = r0.f1591d
            int r2 = r1.f1586d
            if (r2 != 0) goto L_0x01da
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c6
        L_0x01c0:
            int r1 = r1.f1587e
            r11.setVisibility(r1)
            goto L_0x01da
        L_0x01c6:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01cf
            androidx.constraintlayout.motion.widget.f r1 = r0.f1592e
            goto L_0x01c0
        L_0x01cf:
            androidx.constraintlayout.motion.widget.f r2 = r0.f1592e
            int r2 = r2.f1587e
            int r1 = r1.f1587e
            if (r2 == r1) goto L_0x01da
            r11.setVisibility(r15)
        L_0x01da:
            androidx.constraintlayout.motion.widget.e[] r1 = r0.f1606s
            if (r1 == 0) goto L_0x023c
            r1 = r15
        L_0x01df:
            androidx.constraintlayout.motion.widget.e[] r2 = r0.f1606s
            int r3 = r2.length
            if (r1 >= r3) goto L_0x023c
            r2 = r2[r1]
            r2.mo2337a(r14, r11)
            int r1 = r1 + 1
            goto L_0x01df
        L_0x01ec:
            r19 = r10
            androidx.constraintlayout.motion.widget.k r1 = r0.f1589b
            float r2 = r1.f1684h
            androidx.constraintlayout.motion.widget.k r3 = r0.f1590c
            float r4 = r3.f1684h
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f1685i
            float r5 = r3.f1685i
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f1686j
            float r6 = r3.f1686j
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f1687k
            float r3 = r3.f1687k
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x022a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x022a
            boolean r1 = r0.f1588a
            if (r1 == 0) goto L_0x0239
        L_0x022a:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f1588a = r15
        L_0x0239:
            r11.layout(r10, r9, r2, r4)
        L_0x023c:
            java.util.HashMap<java.lang.String, q.b> r1 = r0.f1605r
            if (r1 == 0) goto L_0x026b
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0248:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x026b
            java.lang.Object r1 = r8.next()
            q.b r1 = (p099q.C2554b) r1
            boolean r2 = r1 instanceof p099q.C2554b.C2555a
            if (r2 == 0) goto L_0x0267
            q.b$a r1 = (p099q.C2554b.C2555a) r1
            double[] r2 = r0.f1599l
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.mo9794c(r2, r3, r4, r6)
            goto L_0x0248
        L_0x0267:
            r1.mo9793b(r11, r14)
            goto L_0x0248
        L_0x026b:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0442g.mo2339c(android.view.View, float, long, m.c):boolean");
    }

    public String toString() {
        return " start: x: " + this.f1589b.f1684h + " y: " + this.f1589b.f1685i + " end: x: " + this.f1590c.f1684h + " y: " + this.f1590c.f1685i;
    }
}
