package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1183p implements RecyclerView.C1158a0.C1160b {

    /* renamed from: A */
    int f3888A;

    /* renamed from: B */
    int f3889B;

    /* renamed from: C */
    private boolean f3890C;

    /* renamed from: D */
    C1155d f3891D;

    /* renamed from: E */
    final C1152a f3892E;

    /* renamed from: F */
    private final C1153b f3893F;

    /* renamed from: G */
    private int f3894G;

    /* renamed from: H */
    private int[] f3895H;

    /* renamed from: s */
    int f3896s;

    /* renamed from: t */
    private C1154c f3897t;

    /* renamed from: u */
    C1244i f3898u;

    /* renamed from: v */
    private boolean f3899v;

    /* renamed from: w */
    private boolean f3900w;

    /* renamed from: x */
    boolean f3901x;

    /* renamed from: y */
    private boolean f3902y;

    /* renamed from: z */
    private boolean f3903z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1152a {

        /* renamed from: a */
        C1244i f3904a;

        /* renamed from: b */
        int f3905b;

        /* renamed from: c */
        int f3906c;

        /* renamed from: d */
        boolean f3907d;

        /* renamed from: e */
        boolean f3908e;

        C1152a() {
            mo4214e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4210a() {
            this.f3906c = this.f3907d ? this.f3904a.mo4929i() : this.f3904a.mo4933m();
        }

        /* renamed from: b */
        public void mo4211b(View view, int i) {
            this.f3906c = this.f3907d ? this.f3904a.mo4924d(view) + this.f3904a.mo4935o() : this.f3904a.mo4927g(view);
            this.f3905b = i;
        }

        /* renamed from: c */
        public void mo4212c(View view, int i) {
            int o = this.f3904a.mo4935o();
            if (o >= 0) {
                mo4211b(view, i);
                return;
            }
            this.f3905b = i;
            if (this.f3907d) {
                int i2 = (this.f3904a.mo4929i() - o) - this.f3904a.mo4924d(view);
                this.f3906c = this.f3904a.mo4929i() - i2;
                if (i2 > 0) {
                    int e = this.f3906c - this.f3904a.mo4925e(view);
                    int m = this.f3904a.mo4933m();
                    int min = e - (m + Math.min(this.f3904a.mo4927g(view) - m, 0));
                    if (min < 0) {
                        this.f3906c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3904a.mo4927g(view);
            int m2 = g - this.f3904a.mo4933m();
            this.f3906c = g;
            if (m2 > 0) {
                int i3 = (this.f3904a.mo4929i() - Math.min(0, (this.f3904a.mo4929i() - o) - this.f3904a.mo4924d(view))) - (g + this.f3904a.mo4925e(view));
                if (i3 < 0) {
                    this.f3906c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4213d(View view, RecyclerView.C1162b0 b0Var) {
            RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
            return !qVar.mo4645c() && qVar.mo4643a() >= 0 && qVar.mo4643a() < b0Var.mo4417b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4214e() {
            this.f3905b = -1;
            this.f3906c = Integer.MIN_VALUE;
            this.f3907d = false;
            this.f3908e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3905b + ", mCoordinate=" + this.f3906c + ", mLayoutFromEnd=" + this.f3907d + ", mValid=" + this.f3908e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1153b {

        /* renamed from: a */
        public int f3909a;

        /* renamed from: b */
        public boolean f3910b;

        /* renamed from: c */
        public boolean f3911c;

        /* renamed from: d */
        public boolean f3912d;

        protected C1153b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4216a() {
            this.f3909a = 0;
            this.f3910b = false;
            this.f3911c = false;
            this.f3912d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1154c {

        /* renamed from: a */
        boolean f3913a = true;

        /* renamed from: b */
        int f3914b;

        /* renamed from: c */
        int f3915c;

        /* renamed from: d */
        int f3916d;

        /* renamed from: e */
        int f3917e;

        /* renamed from: f */
        int f3918f;

        /* renamed from: g */
        int f3919g;

        /* renamed from: h */
        int f3920h = 0;

        /* renamed from: i */
        int f3921i = 0;

        /* renamed from: j */
        boolean f3922j = false;

        /* renamed from: k */
        int f3923k;

        /* renamed from: l */
        List<RecyclerView.C1168e0> f3924l = null;

        /* renamed from: m */
        boolean f3925m;

        C1154c() {
        }

        /* renamed from: e */
        private View m4820e() {
            int size = this.f3924l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3924l.get(i).f4049a;
                RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
                if (!qVar.mo4645c() && this.f3916d == qVar.mo4643a()) {
                    mo4218b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4217a() {
            mo4218b((View) null);
        }

        /* renamed from: b */
        public void mo4218b(View view) {
            View f = mo4221f(view);
            this.f3916d = f == null ? -1 : ((RecyclerView.C1188q) f.getLayoutParams()).mo4643a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4219c(RecyclerView.C1162b0 b0Var) {
            int i = this.f3916d;
            return i >= 0 && i < b0Var.mo4417b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4220d(RecyclerView.C1195w wVar) {
            if (this.f3924l != null) {
                return m4820e();
            }
            View o = wVar.mo4690o(this.f3916d);
            this.f3916d += this.f3917e;
            return o;
        }

        /* renamed from: f */
        public View mo4221f(View view) {
            int a;
            int size = this.f3924l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3924l.get(i2).f4049a;
                RecyclerView.C1188q qVar = (RecyclerView.C1188q) view3.getLayoutParams();
                if (view3 != view && !qVar.mo4645c() && (a = (qVar.mo4643a() - this.f3916d) * this.f3917e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C1155d implements Parcelable {
        public static final Parcelable.Creator<C1155d> CREATOR = new C1156a();

        /* renamed from: d */
        int f3926d;

        /* renamed from: e */
        int f3927e;

        /* renamed from: f */
        boolean f3928f;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        class C1156a implements Parcelable.Creator<C1155d> {
            C1156a() {
            }

            /* renamed from: a */
            public C1155d createFromParcel(Parcel parcel) {
                return new C1155d(parcel);
            }

            /* renamed from: b */
            public C1155d[] newArray(int i) {
                return new C1155d[i];
            }
        }

        public C1155d() {
        }

        C1155d(Parcel parcel) {
            this.f3926d = parcel.readInt();
            this.f3927e = parcel.readInt();
            this.f3928f = parcel.readInt() != 1 ? false : true;
        }

        public C1155d(C1155d dVar) {
            this.f3926d = dVar.f3926d;
            this.f3927e = dVar.f3927e;
            this.f3928f = dVar.f3928f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4222a() {
            return this.f3926d >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4223b() {
            this.f3926d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3926d);
            parcel.writeInt(this.f3927e);
            parcel.writeInt(this.f3928f ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3896s = 1;
        this.f3900w = false;
        this.f3901x = false;
        this.f3902y = false;
        this.f3903z = true;
        this.f3888A = -1;
        this.f3889B = Integer.MIN_VALUE;
        this.f3891D = null;
        this.f3892E = new C1152a();
        this.f3893F = new C1153b();
        this.f3894G = 2;
        this.f3895H = new int[2];
        mo4208v2(i);
        mo4209w2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3896s = 1;
        this.f3900w = false;
        this.f3901x = false;
        this.f3902y = false;
        this.f3903z = true;
        this.f3888A = -1;
        this.f3889B = Integer.MIN_VALUE;
        this.f3891D = null;
        this.f3892E = new C1152a();
        this.f3893F = new C1153b();
        this.f3894G = 2;
        this.f3895H = new int[2];
        RecyclerView.C1183p.C1187d h0 = RecyclerView.C1183p.m5112h0(context, attributeSet, i, i2);
        mo4208v2(h0.f4108a);
        mo4209w2(h0.f4110c);
        mo4165x2(h0.f4111d);
    }

    /* renamed from: A2 */
    private void m4738A2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, C1152a aVar) {
        if (!m4762z2(b0Var, aVar) && !m4761y2(wVar, b0Var, aVar)) {
            aVar.mo4210a();
            aVar.f3905b = this.f3902y ? b0Var.mo4417b() - 1 : 0;
        }
    }

    /* renamed from: B2 */
    private void m4739B2(int i, int i2, boolean z, RecyclerView.C1162b0 b0Var) {
        int i3;
        this.f3897t.f3925m = mo4204r2();
        this.f3897t.f3918f = i;
        int[] iArr = this.f3895H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo4178I1(b0Var, iArr);
        int max = Math.max(0, this.f3895H[0]);
        int max2 = Math.max(0, this.f3895H[1]);
        if (i == 1) {
            z2 = true;
        }
        C1154c cVar = this.f3897t;
        int i5 = z2 ? max2 : max;
        cVar.f3920h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3921i = max;
        if (z2) {
            cVar.f3920h = i5 + this.f3898u.mo4930j();
            View e2 = m4753e2();
            C1154c cVar2 = this.f3897t;
            if (this.f3901x) {
                i4 = -1;
            }
            cVar2.f3917e = i4;
            int g0 = mo4599g0(e2);
            C1154c cVar3 = this.f3897t;
            cVar2.f3916d = g0 + cVar3.f3917e;
            cVar3.f3914b = this.f3898u.mo4924d(e2);
            i3 = this.f3898u.mo4924d(e2) - this.f3898u.mo4929i();
        } else {
            View f2 = m4754f2();
            this.f3897t.f3920h += this.f3898u.mo4933m();
            C1154c cVar4 = this.f3897t;
            if (!this.f3901x) {
                i4 = -1;
            }
            cVar4.f3917e = i4;
            int g02 = mo4599g0(f2);
            C1154c cVar5 = this.f3897t;
            cVar4.f3916d = g02 + cVar5.f3917e;
            cVar5.f3914b = this.f3898u.mo4927g(f2);
            i3 = (-this.f3898u.mo4927g(f2)) + this.f3898u.mo4933m();
        }
        C1154c cVar6 = this.f3897t;
        cVar6.f3915c = i2;
        if (z) {
            cVar6.f3915c = i2 - i3;
        }
        cVar6.f3919g = i3;
    }

    /* renamed from: C2 */
    private void m4740C2(int i, int i2) {
        this.f3897t.f3915c = this.f3898u.mo4929i() - i2;
        C1154c cVar = this.f3897t;
        cVar.f3917e = this.f3901x ? -1 : 1;
        cVar.f3916d = i;
        cVar.f3918f = 1;
        cVar.f3914b = i2;
        cVar.f3919g = Integer.MIN_VALUE;
    }

    /* renamed from: D2 */
    private void m4741D2(C1152a aVar) {
        m4740C2(aVar.f3905b, aVar.f3906c);
    }

    /* renamed from: E2 */
    private void m4742E2(int i, int i2) {
        this.f3897t.f3915c = i2 - this.f3898u.mo4933m();
        C1154c cVar = this.f3897t;
        cVar.f3916d = i;
        cVar.f3917e = this.f3901x ? 1 : -1;
        cVar.f3918f = -1;
        cVar.f3914b = i2;
        cVar.f3919g = Integer.MIN_VALUE;
    }

    /* renamed from: F2 */
    private void m4743F2(C1152a aVar) {
        m4742E2(aVar.f3905b, aVar.f3906c);
    }

    /* renamed from: K1 */
    private int m4744K1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        mo4182P1();
        C1244i iVar = this.f3898u;
        View T1 = mo4185T1(!this.f3903z, true);
        return C1253n.m5738a(b0Var, iVar, T1, mo4184S1(!this.f3903z, true), this, this.f3903z);
    }

    /* renamed from: L1 */
    private int m4745L1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        mo4182P1();
        C1244i iVar = this.f3898u;
        View T1 = mo4185T1(!this.f3903z, true);
        return C1253n.m5739b(b0Var, iVar, T1, mo4184S1(!this.f3903z, true), this, this.f3903z, this.f3901x);
    }

    /* renamed from: M1 */
    private int m4746M1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        mo4182P1();
        C1244i iVar = this.f3898u;
        View T1 = mo4185T1(!this.f3903z, true);
        return C1253n.m5740c(b0Var, iVar, T1, mo4184S1(!this.f3903z, true), this, this.f3903z);
    }

    /* renamed from: R1 */
    private View m4747R1() {
        return mo4188X1(0, mo4563J());
    }

    /* renamed from: V1 */
    private View m4748V1() {
        return mo4188X1(mo4563J() - 1, -1);
    }

    /* renamed from: Z1 */
    private View m4749Z1() {
        return this.f3901x ? m4747R1() : m4748V1();
    }

    /* renamed from: a2 */
    private View m4750a2() {
        return this.f3901x ? m4748V1() : m4747R1();
    }

    /* renamed from: c2 */
    private int m4751c2(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z) {
        int i2;
        int i3 = this.f3898u.mo4929i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo4206t2(-i3, wVar, b0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3898u.mo4929i() - i5) <= 0) {
            return i4;
        }
        this.f3898u.mo4938r(i2);
        return i2 + i4;
    }

    /* renamed from: d2 */
    private int m4752d2(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z) {
        int m;
        int m2 = i - this.f3898u.mo4933m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo4206t2(m2, wVar, b0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3898u.mo4933m()) <= 0) {
            return i2;
        }
        this.f3898u.mo4938r(-m);
        return i2 - m;
    }

    /* renamed from: e2 */
    private View m4753e2() {
        return mo4562I(this.f3901x ? 0 : mo4563J() - 1);
    }

    /* renamed from: f2 */
    private View m4754f2() {
        return mo4562I(this.f3901x ? mo4563J() - 1 : 0);
    }

    /* renamed from: l2 */
    private void m4755l2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, int i, int i2) {
        RecyclerView.C1195w wVar2 = wVar;
        RecyclerView.C1162b0 b0Var2 = b0Var;
        if (b0Var.mo4422g() && mo4563J() != 0 && !b0Var.mo4420e() && mo4140H1()) {
            List<RecyclerView.C1168e0> k = wVar.mo4686k();
            int size = k.size();
            int g0 = mo4599g0(mo4562I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1168e0 e0Var = k.get(i5);
                if (!e0Var.mo4478v()) {
                    boolean z = true;
                    if ((e0Var.mo4468m() < g0) != this.f3901x) {
                        z = true;
                    }
                    int e = this.f3898u.mo4925e(e0Var.f4049a);
                    if (z) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f3897t.f3924l = k;
            if (i3 > 0) {
                m4742E2(mo4599g0(m4754f2()), i);
                C1154c cVar = this.f3897t;
                cVar.f3920h = i3;
                cVar.f3915c = 0;
                cVar.mo4217a();
                mo4183Q1(wVar2, this.f3897t, b0Var2, false);
            }
            if (i4 > 0) {
                m4740C2(mo4599g0(m4753e2()), i2);
                C1154c cVar2 = this.f3897t;
                cVar2.f3920h = i4;
                cVar2.f3915c = 0;
                cVar2.mo4217a();
                mo4183Q1(wVar2, this.f3897t, b0Var2, false);
            }
            this.f3897t.f3924l = null;
        }
    }

    /* renamed from: n2 */
    private void m4756n2(RecyclerView.C1195w wVar, C1154c cVar) {
        if (cVar.f3913a && !cVar.f3925m) {
            int i = cVar.f3919g;
            int i2 = cVar.f3921i;
            if (cVar.f3918f == -1) {
                m4758p2(wVar, i, i2);
            } else {
                m4759q2(wVar, i, i2);
            }
        }
    }

    /* renamed from: o2 */
    private void m4757o2(RecyclerView.C1195w wVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4613m1(i3, wVar);
                }
                return;
            }
            while (i > i2) {
                mo4613m1(i, wVar);
                i--;
            }
        }
    }

    /* renamed from: p2 */
    private void m4758p2(RecyclerView.C1195w wVar, int i, int i2) {
        int J = mo4563J();
        if (i >= 0) {
            int h = (this.f3898u.mo4928h() - i) + i2;
            if (this.f3901x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo4562I(i3);
                    if (this.f3898u.mo4927g(I) < h || this.f3898u.mo4937q(I) < h) {
                        m4757o2(wVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = mo4562I(i5);
                if (this.f3898u.mo4927g(I2) < h || this.f3898u.mo4937q(I2) < h) {
                    m4757o2(wVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: q2 */
    private void m4759q2(RecyclerView.C1195w wVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo4563J();
            if (this.f3901x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = mo4562I(i5);
                    if (this.f3898u.mo4924d(I) > i3 || this.f3898u.mo4936p(I) > i3) {
                        m4757o2(wVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = mo4562I(i6);
                if (this.f3898u.mo4924d(I2) > i3 || this.f3898u.mo4936p(I2) > i3) {
                    m4757o2(wVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: s2 */
    private void m4760s2() {
        this.f3901x = (this.f3896s == 1 || !mo4196i2()) ? this.f3900w : !this.f3900w;
    }

    /* renamed from: y2 */
    private boolean m4761y2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, C1152a aVar) {
        View b2;
        boolean z = false;
        if (mo4563J() == 0) {
            return false;
        }
        View V = mo4578V();
        if (V == null || !aVar.mo4213d(V, b0Var)) {
            boolean z2 = this.f3899v;
            boolean z3 = this.f3902y;
            if (z2 != z3 || (b2 = mo4154b2(wVar, b0Var, aVar.f3907d, z3)) == null) {
                return false;
            }
            aVar.mo4211b(b2, mo4599g0(b2));
            if (!b0Var.mo4420e() && mo4140H1()) {
                int g = this.f3898u.mo4927g(b2);
                int d = this.f3898u.mo4924d(b2);
                int m = this.f3898u.mo4933m();
                int i = this.f3898u.mo4929i();
                boolean z4 = d <= m && g < m;
                if (g >= i && d > i) {
                    z = true;
                }
                if (z4 || z) {
                    if (aVar.f3907d) {
                        m = i;
                    }
                    aVar.f3906c = m;
                }
            }
            return true;
        }
        aVar.mo4212c(V, mo4599g0(V));
        return true;
    }

    /* renamed from: z2 */
    private boolean m4762z2(RecyclerView.C1162b0 b0Var, C1152a aVar) {
        int i;
        boolean z = false;
        if (!b0Var.mo4420e() && (i = this.f3888A) != -1) {
            if (i < 0 || i >= b0Var.mo4417b()) {
                this.f3888A = -1;
                this.f3889B = Integer.MIN_VALUE;
            } else {
                aVar.f3905b = this.f3888A;
                C1155d dVar = this.f3891D;
                if (dVar != null && dVar.mo4222a()) {
                    boolean z2 = this.f3891D.f3928f;
                    aVar.f3907d = z2;
                    aVar.f3906c = z2 ? this.f3898u.mo4929i() - this.f3891D.f3927e : this.f3898u.mo4933m() + this.f3891D.f3927e;
                    return true;
                } else if (this.f3889B == Integer.MIN_VALUE) {
                    View C = mo4175C(this.f3888A);
                    if (C == null) {
                        if (mo4563J() > 0) {
                            if ((this.f3888A < mo4599g0(mo4562I(0))) == this.f3901x) {
                                z = true;
                            }
                            aVar.f3907d = z;
                        }
                        aVar.mo4210a();
                    } else if (this.f3898u.mo4925e(C) > this.f3898u.mo4934n()) {
                        aVar.mo4210a();
                        return true;
                    } else if (this.f3898u.mo4927g(C) - this.f3898u.mo4933m() < 0) {
                        aVar.f3906c = this.f3898u.mo4933m();
                        aVar.f3907d = false;
                        return true;
                    } else if (this.f3898u.mo4929i() - this.f3898u.mo4924d(C) < 0) {
                        aVar.f3906c = this.f3898u.mo4929i();
                        aVar.f3907d = true;
                        return true;
                    } else {
                        aVar.f3906c = aVar.f3907d ? this.f3898u.mo4924d(C) + this.f3898u.mo4935o() : this.f3898u.mo4927g(C);
                    }
                    return true;
                } else {
                    boolean z3 = this.f3901x;
                    aVar.f3907d = z3;
                    aVar.f3906c = z3 ? this.f3898u.mo4929i() - this.f3889B : this.f3898u.mo4933m() + this.f3889B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public View mo4175C(int i) {
        int J = mo4563J();
        if (J == 0) {
            return null;
        }
        int g0 = i - mo4599g0(mo4562I(0));
        if (g0 >= 0 && g0 < J) {
            View I = mo4562I(g0);
            if (mo4599g0(I) == i) {
                return I;
            }
        }
        return super.mo4175C(i);
    }

    /* renamed from: D */
    public RecyclerView.C1188q mo4137D() {
        return new RecyclerView.C1188q(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public boolean mo4176E1() {
        return (mo4580X() == 1073741824 || mo4616o0() == 1073741824 || !mo4618p0()) ? false : true;
    }

    /* renamed from: H0 */
    public void mo4177H0(RecyclerView recyclerView, RecyclerView.C1195w wVar) {
        super.mo4177H0(recyclerView, wVar);
        if (this.f3890C) {
            mo4607j1(wVar);
            wVar.mo4678c();
        }
    }

    /* renamed from: H1 */
    public boolean mo4140H1() {
        return this.f3891D == null && this.f3899v == this.f3902y;
    }

    /* renamed from: I0 */
    public View mo4141I0(View view, int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        int N1;
        m4760s2();
        if (mo4563J() == 0 || (N1 = mo4180N1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4182P1();
        m4739B2(N1, (int) (((float) this.f3898u.mo4934n()) * 0.33333334f), false, b0Var);
        C1154c cVar = this.f3897t;
        cVar.f3919g = Integer.MIN_VALUE;
        cVar.f3913a = false;
        mo4183Q1(wVar, cVar, b0Var, true);
        View a2 = N1 == -1 ? m4750a2() : m4749Z1();
        View f2 = N1 == -1 ? m4754f2() : m4753e2();
        if (!f2.hasFocusable()) {
            return a2;
        }
        if (a2 == null) {
            return null;
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public void mo4178I1(RecyclerView.C1162b0 b0Var, int[] iArr) {
        int i;
        int g2 = mo4194g2(b0Var);
        if (this.f3897t.f3918f == -1) {
            i = 0;
        } else {
            i = g2;
            g2 = 0;
        }
        iArr[0] = g2;
        iArr[1] = i;
    }

    /* renamed from: J0 */
    public void mo4179J0(AccessibilityEvent accessibilityEvent) {
        super.mo4179J0(accessibilityEvent);
        if (mo4563J() > 0) {
            accessibilityEvent.setFromIndex(mo4186U1());
            accessibilityEvent.setToIndex(mo4187W1());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void mo4142J1(RecyclerView.C1162b0 b0Var, C1154c cVar, RecyclerView.C1183p.C1186c cVar2) {
        int i = cVar.f3916d;
        if (i >= 0 && i < b0Var.mo4417b()) {
            cVar2.mo4642a(i, Math.max(0, cVar.f3919g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public int mo4180N1(int i) {
        if (i == 1) {
            return (this.f3896s != 1 && mo4196i2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3896s != 1 && mo4196i2()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f3896s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f3896s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f3896s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3896s == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public C1154c mo4181O1() {
        return new C1154c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public void mo4182P1() {
        if (this.f3897t == null) {
            this.f3897t = mo4181O1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public int mo4183Q1(RecyclerView.C1195w wVar, C1154c cVar, RecyclerView.C1162b0 b0Var, boolean z) {
        int i = cVar.f3915c;
        int i2 = cVar.f3919g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3919g = i2 + i;
            }
            m4756n2(wVar, cVar);
        }
        int i3 = cVar.f3915c + cVar.f3920h;
        C1153b bVar = this.f3893F;
        while (true) {
            if ((!cVar.f3925m && i3 <= 0) || !cVar.mo4219c(b0Var)) {
                break;
            }
            bVar.mo4216a();
            mo4156k2(wVar, b0Var, cVar, bVar);
            if (!bVar.f3910b) {
                cVar.f3914b += bVar.f3909a * cVar.f3918f;
                if (!bVar.f3911c || cVar.f3924l != null || !b0Var.mo4420e()) {
                    int i4 = cVar.f3915c;
                    int i5 = bVar.f3909a;
                    cVar.f3915c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3919g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3909a;
                    cVar.f3919g = i7;
                    int i8 = cVar.f3915c;
                    if (i8 < 0) {
                        cVar.f3919g = i7 + i8;
                    }
                    m4756n2(wVar, cVar);
                }
                if (z && bVar.f3912d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3915c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public View mo4184S1(boolean z, boolean z2) {
        int J;
        int i;
        if (this.f3901x) {
            J = 0;
            i = mo4563J();
        } else {
            J = mo4563J() - 1;
            i = -1;
        }
        return mo4189Y1(J, i, z, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public View mo4185T1(boolean z, boolean z2) {
        int i;
        int J;
        if (this.f3901x) {
            i = mo4563J() - 1;
            J = -1;
        } else {
            i = 0;
            J = mo4563J();
        }
        return mo4189Y1(i, J, z, z2);
    }

    /* renamed from: U1 */
    public int mo4186U1() {
        View Y1 = mo4189Y1(0, mo4563J(), false, true);
        if (Y1 == null) {
            return -1;
        }
        return mo4599g0(Y1);
    }

    /* renamed from: W0 */
    public void mo4151W0(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3891D == null && this.f3888A == -1) && b0Var.mo4417b() == 0) {
            mo4607j1(wVar);
            return;
        }
        C1155d dVar = this.f3891D;
        if (dVar != null && dVar.mo4222a()) {
            this.f3888A = this.f3891D.f3926d;
        }
        mo4182P1();
        this.f3897t.f3913a = false;
        m4760s2();
        View V = mo4578V();
        C1152a aVar = this.f3892E;
        if (!aVar.f3908e || this.f3888A != -1 || this.f3891D != null) {
            aVar.mo4214e();
            C1152a aVar2 = this.f3892E;
            aVar2.f3907d = this.f3901x ^ this.f3902y;
            m4738A2(wVar, b0Var, aVar2);
            this.f3892E.f3908e = true;
        } else if (V != null && (this.f3898u.mo4927g(V) >= this.f3898u.mo4929i() || this.f3898u.mo4924d(V) <= this.f3898u.mo4933m())) {
            this.f3892E.mo4212c(V, mo4599g0(V));
        }
        C1154c cVar = this.f3897t;
        cVar.f3918f = cVar.f3923k >= 0 ? 1 : -1;
        int[] iArr = this.f3895H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4178I1(b0Var, iArr);
        int max = Math.max(0, this.f3895H[0]) + this.f3898u.mo4933m();
        int max2 = Math.max(0, this.f3895H[1]) + this.f3898u.mo4930j();
        if (!(!b0Var.mo4420e() || (i6 = this.f3888A) == -1 || this.f3889B == Integer.MIN_VALUE || (C = mo4175C(i6)) == null)) {
            if (this.f3901x) {
                i7 = this.f3898u.mo4929i() - this.f3898u.mo4924d(C);
                i8 = this.f3889B;
            } else {
                i8 = this.f3898u.mo4927g(C) - this.f3898u.mo4933m();
                i7 = this.f3889B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C1152a aVar3 = this.f3892E;
        if (!aVar3.f3907d ? !this.f3901x : this.f3901x) {
            i9 = 1;
        }
        mo4158m2(wVar, b0Var, aVar3, i9);
        mo4627w(wVar);
        this.f3897t.f3925m = mo4204r2();
        this.f3897t.f3922j = b0Var.mo4420e();
        this.f3897t.f3921i = 0;
        C1152a aVar4 = this.f3892E;
        if (aVar4.f3907d) {
            m4743F2(aVar4);
            C1154c cVar2 = this.f3897t;
            cVar2.f3920h = max;
            mo4183Q1(wVar, cVar2, b0Var, false);
            C1154c cVar3 = this.f3897t;
            i2 = cVar3.f3914b;
            int i11 = cVar3.f3916d;
            int i12 = cVar3.f3915c;
            if (i12 > 0) {
                max2 += i12;
            }
            m4741D2(this.f3892E);
            C1154c cVar4 = this.f3897t;
            cVar4.f3920h = max2;
            cVar4.f3916d += cVar4.f3917e;
            mo4183Q1(wVar, cVar4, b0Var, false);
            C1154c cVar5 = this.f3897t;
            i = cVar5.f3914b;
            int i13 = cVar5.f3915c;
            if (i13 > 0) {
                m4742E2(i11, i2);
                C1154c cVar6 = this.f3897t;
                cVar6.f3920h = i13;
                mo4183Q1(wVar, cVar6, b0Var, false);
                i2 = this.f3897t.f3914b;
            }
        } else {
            m4741D2(aVar4);
            C1154c cVar7 = this.f3897t;
            cVar7.f3920h = max2;
            mo4183Q1(wVar, cVar7, b0Var, false);
            C1154c cVar8 = this.f3897t;
            i = cVar8.f3914b;
            int i14 = cVar8.f3916d;
            int i15 = cVar8.f3915c;
            if (i15 > 0) {
                max += i15;
            }
            m4743F2(this.f3892E);
            C1154c cVar9 = this.f3897t;
            cVar9.f3920h = max;
            cVar9.f3916d += cVar9.f3917e;
            mo4183Q1(wVar, cVar9, b0Var, false);
            C1154c cVar10 = this.f3897t;
            i2 = cVar10.f3914b;
            int i16 = cVar10.f3915c;
            if (i16 > 0) {
                m4740C2(i14, i);
                C1154c cVar11 = this.f3897t;
                cVar11.f3920h = i16;
                mo4183Q1(wVar, cVar11, b0Var, false);
                i = this.f3897t.f3914b;
            }
        }
        if (mo4563J() > 0) {
            if (this.f3901x ^ this.f3902y) {
                int c2 = m4751c2(i, wVar, b0Var, true);
                i4 = i2 + c2;
                i3 = i + c2;
                i5 = m4752d2(i4, wVar, b0Var, false);
            } else {
                int d2 = m4752d2(i2, wVar, b0Var, true);
                i4 = i2 + d2;
                i3 = i + d2;
                i5 = m4751c2(i3, wVar, b0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m4755l2(wVar, b0Var, i2, i);
        if (!b0Var.mo4420e()) {
            this.f3898u.mo4939s();
        } else {
            this.f3892E.mo4214e();
        }
        this.f3899v = this.f3902y;
    }

    /* renamed from: W1 */
    public int mo4187W1() {
        View Y1 = mo4189Y1(mo4563J() - 1, -1, false, true);
        if (Y1 == null) {
            return -1;
        }
        return mo4599g0(Y1);
    }

    /* renamed from: X0 */
    public void mo4153X0(RecyclerView.C1162b0 b0Var) {
        super.mo4153X0(b0Var);
        this.f3891D = null;
        this.f3888A = -1;
        this.f3889B = Integer.MIN_VALUE;
        this.f3892E.mo4214e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo4188X1(int i, int i2) {
        int i3;
        int i4;
        mo4182P1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4562I(i);
        }
        if (this.f3898u.mo4927g(mo4562I(i)) < this.f3898u.mo4933m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f3896s == 0 ? this.f4092e : this.f4093f).mo4960a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View mo4189Y1(int i, int i2, boolean z, boolean z2) {
        mo4182P1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f3896s == 0 ? this.f4092e : this.f4093f).mo4960a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public PointF mo4190a(int i) {
        if (mo4563J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4599g0(mo4562I(0))) {
            z = true;
        }
        if (z != this.f3901x) {
            i2 = -1;
        }
        return this.f3896s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: b1 */
    public void mo4191b1(Parcelable parcelable) {
        if (parcelable instanceof C1155d) {
            C1155d dVar = (C1155d) parcelable;
            this.f3891D = dVar;
            if (this.f3888A != -1) {
                dVar.mo4223b();
            }
            mo4623s1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public View mo4154b2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        mo4182P1();
        int J = mo4563J();
        int i3 = -1;
        if (z2) {
            i2 = mo4563J() - 1;
            i = -1;
        } else {
            i3 = J;
            i2 = 0;
            i = 1;
        }
        int b = b0Var.mo4417b();
        int m = this.f3898u.mo4933m();
        int i4 = this.f3898u.mo4929i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View I = mo4562I(i2);
            int g0 = mo4599g0(I);
            int g = this.f3898u.mo4927g(I);
            int d = this.f3898u.mo4924d(I);
            if (g0 >= 0 && g0 < b) {
                if (!((RecyclerView.C1188q) I.getLayoutParams()).mo4645c()) {
                    boolean z3 = d <= m && g < m;
                    boolean z4 = g >= i4 && d > i4;
                    if (!z3 && !z4) {
                        return I;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = I;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = I;
                    }
                    view2 = I;
                } else if (view3 == null) {
                    view3 = I;
                }
            }
            i2 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: c1 */
    public Parcelable mo4192c1() {
        if (this.f3891D != null) {
            return new C1155d(this.f3891D);
        }
        C1155d dVar = new C1155d();
        if (mo4563J() > 0) {
            mo4182P1();
            boolean z = this.f3899v ^ this.f3901x;
            dVar.f3928f = z;
            if (z) {
                View e2 = m4753e2();
                dVar.f3927e = this.f3898u.mo4929i() - this.f3898u.mo4924d(e2);
                dVar.f3926d = mo4599g0(e2);
            } else {
                View f2 = m4754f2();
                dVar.f3926d = mo4599g0(f2);
                dVar.f3927e = this.f3898u.mo4927g(f2) - this.f3898u.mo4933m();
            }
        } else {
            dVar.mo4223b();
        }
        return dVar;
    }

    /* renamed from: g */
    public void mo4193g(String str) {
        if (this.f3891D == null) {
            super.mo4193g(str);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: g2 */
    public int mo4194g2(RecyclerView.C1162b0 b0Var) {
        if (b0Var.mo4419d()) {
            return this.f3898u.mo4934n();
        }
        return 0;
    }

    /* renamed from: h2 */
    public int mo4195h2() {
        return this.f3896s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public boolean mo4196i2() {
        return mo4581Y() == 1;
    }

    /* renamed from: j2 */
    public boolean mo4197j2() {
        return this.f3903z;
    }

    /* renamed from: k */
    public boolean mo4198k() {
        return this.f3896s == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public void mo4156k2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, C1154c cVar, C1153b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4220d(wVar);
        if (d == null) {
            bVar.f3910b = true;
            return;
        }
        RecyclerView.C1188q qVar = (RecyclerView.C1188q) d.getLayoutParams();
        if (cVar.f3924l == null) {
            if (this.f3901x == (cVar.f3918f == -1)) {
                mo4591d(d);
            } else {
                mo4594e(d, 0);
            }
        } else {
            if (this.f3901x == (cVar.f3918f == -1)) {
                mo4587b(d);
            } else {
                mo4589c(d, 0);
            }
        }
        mo4635z0(d, 0, 0);
        bVar.f3909a = this.f3898u.mo4925e(d);
        if (this.f3896s == 1) {
            if (mo4196i2()) {
                i5 = mo4614n0() - mo4595e0();
                i4 = i5 - this.f3898u.mo4926f(d);
            } else {
                i4 = mo4592d0();
                i5 = this.f3898u.mo4926f(d) + i4;
            }
            int i6 = cVar.f3918f;
            int i7 = cVar.f3914b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f3909a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f3909a + i7;
            }
        } else {
            int f0 = mo4597f0();
            int f = this.f3898u.mo4926f(d) + f0;
            int i8 = cVar.f3918f;
            int i9 = cVar.f3914b;
            if (i8 == -1) {
                i2 = i9;
                i3 = f0;
                i = f;
                i4 = i9 - bVar.f3909a;
            } else {
                i3 = f0;
                i2 = bVar.f3909a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4632y0(d, i4, i3, i2, i);
        if (qVar.mo4645c() || qVar.mo4644b()) {
            bVar.f3911c = true;
        }
        bVar.f3912d = d.hasFocusable();
    }

    /* renamed from: l */
    public boolean mo4199l() {
        return this.f3896s == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public void mo4158m2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, C1152a aVar, int i) {
    }

    /* renamed from: o */
    public void mo4200o(int i, int i2, RecyclerView.C1162b0 b0Var, RecyclerView.C1183p.C1186c cVar) {
        if (this.f3896s != 0) {
            i = i2;
        }
        if (mo4563J() != 0 && i != 0) {
            mo4182P1();
            m4739B2(i > 0 ? 1 : -1, Math.abs(i), true, b0Var);
            mo4142J1(b0Var, this.f3897t, cVar);
        }
    }

    /* renamed from: p */
    public void mo4201p(int i, RecyclerView.C1183p.C1186c cVar) {
        boolean z;
        int i2;
        C1155d dVar = this.f3891D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4222a()) {
            m4760s2();
            z = this.f3901x;
            i2 = this.f3888A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C1155d dVar2 = this.f3891D;
            z = dVar2.f3928f;
            i2 = dVar2.f3926d;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3894G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4642a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: q */
    public int mo4202q(RecyclerView.C1162b0 b0Var) {
        return m4744K1(b0Var);
    }

    /* renamed from: r */
    public int mo4159r(RecyclerView.C1162b0 b0Var) {
        return m4745L1(b0Var);
    }

    /* renamed from: r0 */
    public boolean mo4203r0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public boolean mo4204r2() {
        return this.f3898u.mo4931k() == 0 && this.f3898u.mo4928h() == 0;
    }

    /* renamed from: s */
    public int mo4160s(RecyclerView.C1162b0 b0Var) {
        return m4746M1(b0Var);
    }

    /* renamed from: t */
    public int mo4205t(RecyclerView.C1162b0 b0Var) {
        return m4744K1(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public int mo4206t2(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0 || i == 0) {
            return 0;
        }
        mo4182P1();
        this.f3897t.f3913a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4739B2(i2, abs, true, b0Var);
        C1154c cVar = this.f3897t;
        int Q1 = cVar.f3919g + mo4183Q1(wVar, cVar, b0Var, false);
        if (Q1 < 0) {
            return 0;
        }
        if (abs > Q1) {
            i = i2 * Q1;
        }
        this.f3898u.mo4938r(-i);
        this.f3897t.f3923k = i;
        return i;
    }

    /* renamed from: u */
    public int mo4161u(RecyclerView.C1162b0 b0Var) {
        return m4745L1(b0Var);
    }

    /* renamed from: u2 */
    public void mo4207u2(int i, int i2) {
        this.f3888A = i;
        this.f3889B = i2;
        C1155d dVar = this.f3891D;
        if (dVar != null) {
            dVar.mo4223b();
        }
        mo4623s1();
    }

    /* renamed from: v */
    public int mo4162v(RecyclerView.C1162b0 b0Var) {
        return m4746M1(b0Var);
    }

    /* renamed from: v1 */
    public int mo4163v1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (this.f3896s == 1) {
            return 0;
        }
        return mo4206t2(i, wVar, b0Var);
    }

    /* renamed from: v2 */
    public void mo4208v2(int i) {
        if (i == 0 || i == 1) {
            mo4193g((String) null);
            if (i != this.f3896s || this.f3898u == null) {
                C1244i b = C1244i.m5659b(this, i);
                this.f3898u = b;
                this.f3892E.f3904a = b;
                this.f3896s = i;
                mo4623s1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: w1 */
    public int mo4164w1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (this.f3896s == 0) {
            return 0;
        }
        return mo4206t2(i, wVar, b0Var);
    }

    /* renamed from: w2 */
    public void mo4209w2(boolean z) {
        mo4193g((String) null);
        if (z != this.f3900w) {
            this.f3900w = z;
            mo4623s1();
        }
    }

    /* renamed from: x2 */
    public void mo4165x2(boolean z) {
        mo4193g((String) null);
        if (this.f3902y != z) {
            this.f3902y = z;
            mo4623s1();
        }
    }
}
