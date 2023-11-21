package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C0637g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3873I = false;

    /* renamed from: J */
    int f3874J = -1;

    /* renamed from: K */
    int[] f3875K;

    /* renamed from: L */
    View[] f3876L;

    /* renamed from: M */
    final SparseIntArray f3877M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3878N = new SparseIntArray();

    /* renamed from: O */
    C1151c f3879O = new C1149a();

    /* renamed from: P */
    final Rect f3880P = new Rect();

    /* renamed from: Q */
    private boolean f3881Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1149a extends C1151c {
        /* renamed from: e */
        public int mo4166e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo4167f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1150b extends RecyclerView.C1188q {

        /* renamed from: e */
        int f3882e = -1;

        /* renamed from: f */
        int f3883f = 0;

        public C1150b(int i, int i2) {
            super(i, i2);
        }

        public C1150b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1150b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1150b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int mo4168e() {
            return this.f3882e;
        }

        /* renamed from: f */
        public int mo4169f() {
            return this.f3883f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1151c {

        /* renamed from: a */
        final SparseIntArray f3884a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3885b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3886c = false;

        /* renamed from: d */
        private boolean f3887d = false;

        /* renamed from: a */
        static int m4730a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4170b(int i, int i2) {
            if (!this.f3887d) {
                return mo4172d(i, i2);
            }
            int i3 = this.f3885b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo4172d(i, i2);
            this.f3885b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4171c(int i, int i2) {
            if (!this.f3886c) {
                return mo4166e(i, i2);
            }
            int i3 = this.f3884a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo4166e(i, i2);
            this.f3884a.put(i, e);
            return e;
        }

        /* renamed from: d */
        public int mo4172d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f3887d || (a = m4730a(this.f3885b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i5 = this.f3885b.get(a);
                i4 = a + 1;
                i3 = mo4171c(a, i2) + mo4167f(a);
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                }
            }
            int f = mo4167f(i);
            while (i4 < i) {
                int f2 = mo4167f(i4);
                int i6 = i3 + f2;
                if (i6 == i2) {
                    i5++;
                    i6 = 0;
                } else if (i6 > i2) {
                    i5++;
                    i6 = f2;
                }
                i4++;
            }
            return i3 + f > i2 ? i5 + 1 : i5;
        }

        /* renamed from: e */
        public abstract int mo4166e(int i, int i2);

        /* renamed from: f */
        public abstract int mo4167f(int i);

        /* renamed from: g */
        public void mo4173g() {
            this.f3885b.clear();
        }

        /* renamed from: h */
        public void mo4174h() {
            this.f3884a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4152W2(RecyclerView.C1183p.m5112h0(context, attributeSet, i, i2).f4109b);
    }

    /* renamed from: G2 */
    private void m4680G2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i2 = 1;
            i5 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3876L[i3];
            C1150b bVar = (C1150b) view.getLayoutParams();
            int S2 = m4691S2(wVar, b0Var, mo4599g0(view));
            bVar.f3883f = S2;
            bVar.f3882e = i4;
            i4 += S2;
            i3 += i2;
        }
    }

    /* renamed from: H2 */
    private void m4681H2() {
        int J = mo4563J();
        for (int i = 0; i < J; i++) {
            C1150b bVar = (C1150b) mo4562I(i).getLayoutParams();
            int a = bVar.mo4643a();
            this.f3877M.put(a, bVar.mo4169f());
            this.f3878N.put(a, bVar.mo4168e());
        }
    }

    /* renamed from: I2 */
    private void m4682I2(int i) {
        this.f3875K = m4683J2(this.f3875K, this.f3874J, i);
    }

    /* renamed from: J2 */
    static int[] m4683J2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: K2 */
    private void m4684K2() {
        this.f3877M.clear();
        this.f3878N.clear();
    }

    /* renamed from: L2 */
    private int m4685L2(RecyclerView.C1162b0 b0Var) {
        if (!(mo4563J() == 0 || b0Var.mo4417b() == 0)) {
            mo4182P1();
            boolean j2 = mo4197j2();
            View T1 = mo4185T1(!j2, true);
            View S1 = mo4184S1(!j2, true);
            if (!(T1 == null || S1 == null)) {
                int b = this.f3879O.mo4170b(mo4599g0(T1), this.f3874J);
                int b2 = this.f3879O.mo4170b(mo4599g0(S1), this.f3874J);
                int min = Math.min(b, b2);
                int max = this.f3901x ? Math.max(0, ((this.f3879O.mo4170b(b0Var.mo4417b() - 1, this.f3874J) + 1) - Math.max(b, b2)) - 1) : Math.max(0, min);
                if (!j2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3898u.mo4924d(S1) - this.f3898u.mo4927g(T1))) / ((float) ((this.f3879O.mo4170b(mo4599g0(S1), this.f3874J) - this.f3879O.mo4170b(mo4599g0(T1), this.f3874J)) + 1)))) + ((float) (this.f3898u.mo4933m() - this.f3898u.mo4927g(T1))));
            }
        }
        return 0;
    }

    /* renamed from: M2 */
    private int m4686M2(RecyclerView.C1162b0 b0Var) {
        if (!(mo4563J() == 0 || b0Var.mo4417b() == 0)) {
            mo4182P1();
            View T1 = mo4185T1(!mo4197j2(), true);
            View S1 = mo4184S1(!mo4197j2(), true);
            if (!(T1 == null || S1 == null)) {
                if (!mo4197j2()) {
                    return this.f3879O.mo4170b(b0Var.mo4417b() - 1, this.f3874J) + 1;
                }
                int d = this.f3898u.mo4924d(S1) - this.f3898u.mo4927g(T1);
                int b = this.f3879O.mo4170b(mo4599g0(T1), this.f3874J);
                return (int) ((((float) d) / ((float) ((this.f3879O.mo4170b(mo4599g0(S1), this.f3874J) - b) + 1))) * ((float) (this.f3879O.mo4170b(b0Var.mo4417b() - 1, this.f3874J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: N2 */
    private void m4687N2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, LinearLayoutManager.C1152a aVar, int i) {
        boolean z = i == 1;
        int R2 = m4690R2(wVar, b0Var, aVar.f3905b);
        if (z) {
            while (R2 > 0) {
                int i2 = aVar.f3905b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3905b = i3;
                    R2 = m4690R2(wVar, b0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = b0Var.mo4417b() - 1;
        int i4 = aVar.f3905b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int R22 = m4690R2(wVar, b0Var, i5);
            if (R22 <= R2) {
                break;
            }
            i4 = i5;
            R2 = R22;
        }
        aVar.f3905b = i4;
    }

    /* renamed from: O2 */
    private void m4688O2() {
        View[] viewArr = this.f3876L;
        if (viewArr == null || viewArr.length != this.f3874J) {
            this.f3876L = new View[this.f3874J];
        }
    }

    /* renamed from: Q2 */
    private int m4689Q2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, int i) {
        if (!b0Var.mo4420e()) {
            return this.f3879O.mo4170b(i, this.f3874J);
        }
        int f = wVar.mo4681f(i);
        if (f != -1) {
            return this.f3879O.mo4170b(f, this.f3874J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: R2 */
    private int m4690R2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, int i) {
        if (!b0Var.mo4420e()) {
            return this.f3879O.mo4171c(i, this.f3874J);
        }
        int i2 = this.f3878N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.mo4681f(i);
        if (f != -1) {
            return this.f3879O.mo4171c(f, this.f3874J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: S2 */
    private int m4691S2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, int i) {
        if (!b0Var.mo4420e()) {
            return this.f3879O.mo4167f(i);
        }
        int i2 = this.f3877M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.mo4681f(i);
        if (f != -1) {
            return this.f3879O.mo4167f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: T2 */
    private void m4692T2(float f, int i) {
        m4682I2(Math.max(Math.round(f * ((float) this.f3874J)), i));
    }

    /* renamed from: U2 */
    private void m4693U2(View view, int i, boolean z) {
        int i2;
        int i3;
        C1150b bVar = (C1150b) view.getLayoutParams();
        Rect rect = bVar.f4113b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int P2 = mo4145P2(bVar.f3882e, bVar.f3883f);
        if (this.f3896s == 1) {
            i2 = RecyclerView.C1183p.m5109K(P2, i, i5, bVar.width, false);
            i3 = RecyclerView.C1183p.m5109K(this.f3898u.mo4934n(), mo4580X(), i4, bVar.height, true);
        } else {
            int K = RecyclerView.C1183p.m5109K(P2, i, i4, bVar.height, false);
            int K2 = RecyclerView.C1183p.m5109K(this.f3898u.mo4934n(), mo4616o0(), i5, bVar.width, true);
            i3 = K;
            i2 = K2;
        }
        m4694V2(view, i2, i3, z);
    }

    /* renamed from: V2 */
    private void m4694V2(View view, int i, int i2, boolean z) {
        RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
        if (z ? mo4557F1(view, i, i2, qVar) : mo4554D1(view, i, i2, qVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: X2 */
    private void m4695X2() {
        int i;
        int i2;
        if (mo4195h2() == 1) {
            i2 = mo4614n0() - mo4595e0();
            i = mo4592d0();
        } else {
            i2 = mo4579W() - mo4590c0();
            i = mo4597f0();
        }
        m4682I2(i2 - i);
    }

    /* renamed from: A1 */
    public void mo4136A1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3875K == null) {
            super.mo4136A1(rect, i, i2);
        }
        int d0 = mo4592d0() + mo4595e0();
        int f0 = mo4597f0() + mo4590c0();
        if (this.f3896s == 1) {
            i4 = RecyclerView.C1183p.m5113n(i2, rect.height() + f0, mo4585a0());
            int[] iArr = this.f3875K;
            i3 = RecyclerView.C1183p.m5113n(i, iArr[iArr.length - 1] + d0, mo4588b0());
        } else {
            i3 = RecyclerView.C1183p.m5113n(i, rect.width() + d0, mo4588b0());
            int[] iArr2 = this.f3875K;
            i4 = RecyclerView.C1183p.m5113n(i2, iArr2[iArr2.length - 1] + f0, mo4585a0());
        }
        mo4636z1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C1188q mo4137D() {
        return this.f3896s == 0 ? new C1150b(-2, -1) : new C1150b(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.C1188q mo4138E(Context context, AttributeSet attributeSet) {
        return new C1150b(context, attributeSet);
    }

    /* renamed from: F */
    public RecyclerView.C1188q mo4139F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1150b((ViewGroup.MarginLayoutParams) layoutParams) : new C1150b(layoutParams);
    }

    /* renamed from: H1 */
    public boolean mo4140H1() {
        return this.f3891D == null && !this.f3873I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4141I0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1195w r26, androidx.recyclerview.widget.RecyclerView.C1162b0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo4548B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1150b) r5
            int r6 = r5.f3882e
            int r5 = r5.f3883f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4141I0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo4180N1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3901x
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo4563J()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo4563J()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f3896s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4196i2()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m4689Q2(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m4689Q2(r1, r2, r10)
            android.view.View r1 = r0.mo4562I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1150b) r9
            int r2 = r9.f3882e
            r18 = r3
            int r3 = r9.f3883f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo4630x0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3882e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3882e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4141I0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void mo4142J1(RecyclerView.C1162b0 b0Var, LinearLayoutManager.C1154c cVar, RecyclerView.C1183p.C1186c cVar2) {
        int i = this.f3874J;
        for (int i2 = 0; i2 < this.f3874J && cVar.mo4219c(b0Var) && i > 0; i2++) {
            int i3 = cVar.f3916d;
            cVar2.mo4642a(i3, Math.max(0, cVar.f3919g));
            i -= this.f3879O.mo4167f(i3);
            cVar.f3916d += cVar.f3917e;
        }
    }

    /* renamed from: N */
    public int mo4143N(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (this.f3896s == 1) {
            return this.f3874J;
        }
        if (b0Var.mo4417b() < 1) {
            return 0;
        }
        return m4689Q2(wVar, b0Var, b0Var.mo4417b() - 1) + 1;
    }

    /* renamed from: O0 */
    public void mo4144O0(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, View view, C0637g gVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1150b)) {
            super.mo4568N0(view, gVar);
            return;
        }
        C1150b bVar = (C1150b) layoutParams;
        int Q2 = m4689Q2(wVar, b0Var, bVar.mo4643a());
        if (this.f3896s == 0) {
            i4 = bVar.mo4168e();
            i3 = bVar.mo4169f();
            i = 1;
            z2 = false;
            z = false;
            i2 = Q2;
        } else {
            i3 = 1;
            i2 = bVar.mo4168e();
            i = bVar.mo4169f();
            z2 = false;
            z = false;
            i4 = Q2;
        }
        gVar.mo2748W(C0637g.C0640c.m2591a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public int mo4145P2(int i, int i2) {
        if (this.f3896s != 1 || !mo4196i2()) {
            int[] iArr = this.f3875K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3875K;
        int i3 = this.f3874J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: Q0 */
    public void mo4146Q0(RecyclerView recyclerView, int i, int i2) {
        this.f3879O.mo4174h();
        this.f3879O.mo4173g();
    }

    /* renamed from: R0 */
    public void mo4147R0(RecyclerView recyclerView) {
        this.f3879O.mo4174h();
        this.f3879O.mo4173g();
    }

    /* renamed from: S0 */
    public void mo4148S0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3879O.mo4174h();
        this.f3879O.mo4173g();
    }

    /* renamed from: T0 */
    public void mo4149T0(RecyclerView recyclerView, int i, int i2) {
        this.f3879O.mo4174h();
        this.f3879O.mo4173g();
    }

    /* renamed from: V0 */
    public void mo4150V0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3879O.mo4174h();
        this.f3879O.mo4173g();
    }

    /* renamed from: W0 */
    public void mo4151W0(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (b0Var.mo4420e()) {
            m4681H2();
        }
        super.mo4151W0(wVar, b0Var);
        m4684K2();
    }

    /* renamed from: W2 */
    public void mo4152W2(int i) {
        if (i != this.f3874J) {
            this.f3873I = true;
            if (i >= 1) {
                this.f3874J = i;
                this.f3879O.mo4174h();
                mo4623s1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: X0 */
    public void mo4153X0(RecyclerView.C1162b0 b0Var) {
        super.mo4153X0(b0Var);
        this.f3873I = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public View mo4154b2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z, boolean z2) {
        int i;
        int J = mo4563J();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo4563J() - 1;
            i3 = -1;
        } else {
            i2 = J;
            i = 0;
        }
        int b = b0Var.mo4417b();
        mo4182P1();
        int m = this.f3898u.mo4933m();
        int i4 = this.f3898u.mo4929i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo4562I(i);
            int g0 = mo4599g0(I);
            if (g0 >= 0 && g0 < b && m4690R2(wVar, b0Var, g0) == 0) {
                if (((RecyclerView.C1188q) I.getLayoutParams()).mo4645c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f3898u.mo4927g(I) < i4 && this.f3898u.mo4924d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: j0 */
    public int mo4155j0(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (this.f3896s == 0) {
            return this.f3874J;
        }
        if (b0Var.mo4417b() < 1) {
            return 0;
        }
        return m4689Q2(wVar, b0Var, b0Var.mo4417b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public void mo4156k2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, LinearLayoutManager.C1154c cVar, LinearLayoutManager.C1153b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View d;
        RecyclerView.C1195w wVar2 = wVar;
        RecyclerView.C1162b0 b0Var2 = b0Var;
        LinearLayoutManager.C1154c cVar2 = cVar;
        LinearLayoutManager.C1153b bVar2 = bVar;
        int l = this.f3898u.mo4932l();
        boolean z = false;
        boolean z2 = l != 1073741824;
        int i11 = mo4563J() > 0 ? this.f3875K[this.f3874J] : 0;
        if (z2) {
            m4695X2();
        }
        boolean z3 = cVar2.f3917e == 1;
        int i12 = this.f3874J;
        if (!z3) {
            i12 = m4690R2(wVar2, b0Var2, cVar2.f3916d) + m4691S2(wVar2, b0Var2, cVar2.f3916d);
        }
        int i13 = 0;
        while (i13 < this.f3874J && cVar2.mo4219c(b0Var2) && i12 > 0) {
            int i14 = cVar2.f3916d;
            int S2 = m4691S2(wVar2, b0Var2, i14);
            if (S2 <= this.f3874J) {
                i12 -= S2;
                if (i12 < 0 || (d = cVar2.mo4220d(wVar2)) == null) {
                    break;
                }
                this.f3876L[i13] = d;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + S2 + " spans but GridLayoutManager has only " + this.f3874J + " spans.");
            }
        }
        if (i13 == 0) {
            bVar2.f3910b = true;
            return;
        }
        float f = 0.0f;
        m4680G2(wVar2, b0Var2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f3876L[i15];
            if (cVar2.f3924l == null) {
                if (z3) {
                    mo4591d(view);
                } else {
                    mo4594e(view, z);
                }
            } else if (z3) {
                mo4587b(view);
            } else {
                mo4589c(view, z ? 1 : 0);
            }
            mo4606j(view, this.f3880P);
            m4693U2(view, l, z);
            int e = this.f3898u.mo4925e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f3898u.mo4926f(view)) * 1.0f) / ((float) ((C1150b) view.getLayoutParams()).f3883f);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            m4692T2(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f3876L[i17];
                m4693U2(view2, 1073741824, true);
                int e2 = this.f3898u.mo4925e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f3876L[i18];
            if (this.f3898u.mo4925e(view3) != i16) {
                C1150b bVar3 = (C1150b) view3.getLayoutParams();
                Rect rect = bVar3.f4113b;
                int i19 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i20 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int P2 = mo4145P2(bVar3.f3882e, bVar3.f3883f);
                if (this.f3896s == 1) {
                    i10 = RecyclerView.C1183p.m5109K(P2, 1073741824, i20, bVar3.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = RecyclerView.C1183p.m5109K(P2, 1073741824, i19, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                m4694V2(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f3909a = i16;
        if (this.f3896s == 1) {
            if (cVar2.f3918f == -1) {
                i4 = cVar2.f3914b;
                i = i4 - i16;
            } else {
                int i22 = cVar2.f3914b;
                i = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i2 = 0;
        } else if (cVar2.f3918f == -1) {
            int i23 = cVar2.f3914b;
            i2 = i23 - i16;
            i = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f3914b;
            i3 = i16 + i24;
            i2 = i24;
            i4 = 0;
            i = 0;
        }
        while (i21 < i13) {
            View view4 = this.f3876L[i21];
            C1150b bVar4 = (C1150b) view4.getLayoutParams();
            if (this.f3896s == 1) {
                if (mo4196i2()) {
                    int d0 = mo4592d0() + this.f3875K[this.f3874J - bVar4.f3882e];
                    i8 = i4;
                    i7 = d0;
                    i6 = d0 - this.f3898u.mo4926f(view4);
                } else {
                    int d02 = mo4592d0() + this.f3875K[bVar4.f3882e];
                    i8 = i4;
                    i6 = d02;
                    i7 = this.f3898u.mo4926f(view4) + d02;
                }
                i5 = i;
            } else {
                int f0 = mo4597f0() + this.f3875K[bVar4.f3882e];
                i5 = f0;
                i7 = i3;
                i6 = i2;
                i8 = this.f3898u.mo4926f(view4) + f0;
            }
            mo4632y0(view4, i6, i5, i7, i8);
            if (bVar4.mo4645c() || bVar4.mo4644b()) {
                bVar2.f3911c = true;
            }
            bVar2.f3912d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f3876L, (Object) null);
    }

    /* renamed from: m */
    public boolean mo4157m(RecyclerView.C1188q qVar) {
        return qVar instanceof C1150b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public void mo4158m2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, LinearLayoutManager.C1152a aVar, int i) {
        super.mo4158m2(wVar, b0Var, aVar, i);
        m4695X2();
        if (b0Var.mo4417b() > 0 && !b0Var.mo4420e()) {
            m4687N2(wVar, b0Var, aVar, i);
        }
        m4688O2();
    }

    /* renamed from: r */
    public int mo4159r(RecyclerView.C1162b0 b0Var) {
        return this.f3881Q ? m4685L2(b0Var) : super.mo4159r(b0Var);
    }

    /* renamed from: s */
    public int mo4160s(RecyclerView.C1162b0 b0Var) {
        return this.f3881Q ? m4686M2(b0Var) : super.mo4160s(b0Var);
    }

    /* renamed from: u */
    public int mo4161u(RecyclerView.C1162b0 b0Var) {
        return this.f3881Q ? m4685L2(b0Var) : super.mo4161u(b0Var);
    }

    /* renamed from: v */
    public int mo4162v(RecyclerView.C1162b0 b0Var) {
        return this.f3881Q ? m4686M2(b0Var) : super.mo4162v(b0Var);
    }

    /* renamed from: v1 */
    public int mo4163v1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        m4695X2();
        m4688O2();
        return super.mo4163v1(i, wVar, b0Var);
    }

    /* renamed from: w1 */
    public int mo4164w1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        m4695X2();
        m4688O2();
        return super.mo4164w1(i, wVar, b0Var);
    }

    /* renamed from: x2 */
    public void mo4165x2(boolean z) {
        if (!z) {
            super.mo4165x2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
}
