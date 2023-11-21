package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1183p implements RecyclerView.C1158a0.C1160b {

    /* renamed from: A */
    boolean f4145A = false;

    /* renamed from: B */
    private BitSet f4146B;

    /* renamed from: C */
    int f4147C = -1;

    /* renamed from: D */
    int f4148D = Integer.MIN_VALUE;

    /* renamed from: E */
    C1208d f4149E = new C1208d();

    /* renamed from: F */
    private int f4150F = 2;

    /* renamed from: G */
    private boolean f4151G;

    /* renamed from: H */
    private boolean f4152H;

    /* renamed from: I */
    private C1211e f4153I;

    /* renamed from: J */
    private int f4154J;

    /* renamed from: K */
    private final Rect f4155K = new Rect();

    /* renamed from: L */
    private final C1206b f4156L = new C1206b();

    /* renamed from: M */
    private boolean f4157M = false;

    /* renamed from: N */
    private boolean f4158N = true;

    /* renamed from: O */
    private int[] f4159O;

    /* renamed from: P */
    private final Runnable f4160P = new C1205a();

    /* renamed from: s */
    private int f4161s = -1;

    /* renamed from: t */
    C1213f[] f4162t;

    /* renamed from: u */
    C1244i f4163u;

    /* renamed from: v */
    C1244i f4164v;

    /* renamed from: w */
    private int f4165w;

    /* renamed from: x */
    private int f4166x;

    /* renamed from: y */
    private final C1240f f4167y;

    /* renamed from: z */
    boolean f4168z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1205a implements Runnable {
        C1205a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4749O1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1206b {

        /* renamed from: a */
        int f4170a;

        /* renamed from: b */
        int f4171b;

        /* renamed from: c */
        boolean f4172c;

        /* renamed from: d */
        boolean f4173d;

        /* renamed from: e */
        boolean f4174e;

        /* renamed from: f */
        int[] f4175f;

        C1206b() {
            mo4762c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4760a() {
            this.f4171b = this.f4172c ? StaggeredGridLayoutManager.this.f4163u.mo4929i() : StaggeredGridLayoutManager.this.f4163u.mo4933m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4761b(int i) {
            this.f4171b = this.f4172c ? StaggeredGridLayoutManager.this.f4163u.mo4929i() - i : StaggeredGridLayoutManager.this.f4163u.mo4933m() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4762c() {
            this.f4170a = -1;
            this.f4171b = Integer.MIN_VALUE;
            this.f4172c = false;
            this.f4173d = false;
            this.f4174e = false;
            int[] iArr = this.f4175f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4763d(C1213f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4175f;
            if (iArr == null || iArr.length < length) {
                this.f4175f = new int[StaggeredGridLayoutManager.this.f4162t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4175f[i] = fVarArr[i].mo4808p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1207c extends RecyclerView.C1188q {

        /* renamed from: e */
        C1213f f4177e;

        /* renamed from: f */
        boolean f4178f;

        public C1207c(int i, int i2) {
            super(i, i2);
        }

        public C1207c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1207c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1207c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public boolean mo4764e() {
            return this.f4178f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C1208d {

        /* renamed from: a */
        int[] f4179a;

        /* renamed from: b */
        List<C1209a> f4180b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C1209a implements Parcelable {
            public static final Parcelable.Creator<C1209a> CREATOR = new C1210a();

            /* renamed from: d */
            int f4181d;

            /* renamed from: e */
            int f4182e;

            /* renamed from: f */
            int[] f4183f;

            /* renamed from: g */
            boolean f4184g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            class C1210a implements Parcelable.Creator<C1209a> {
                C1210a() {
                }

                /* renamed from: a */
                public C1209a createFromParcel(Parcel parcel) {
                    return new C1209a(parcel);
                }

                /* renamed from: b */
                public C1209a[] newArray(int i) {
                    return new C1209a[i];
                }
            }

            C1209a() {
            }

            C1209a(Parcel parcel) {
                this.f4181d = parcel.readInt();
                this.f4182e = parcel.readInt();
                this.f4184g = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4183f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo4777a(int i) {
                int[] iArr = this.f4183f;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4181d + ", mGapDir=" + this.f4182e + ", mHasUnwantedGapAfter=" + this.f4184g + ", mGapPerSpan=" + Arrays.toString(this.f4183f) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4181d);
                parcel.writeInt(this.f4182e);
                parcel.writeInt(this.f4184g ? 1 : 0);
                int[] iArr = this.f4183f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4183f);
            }
        }

        C1208d() {
        }

        /* renamed from: i */
        private int m5458i(int i) {
            if (this.f4180b == null) {
                return -1;
            }
            C1209a f = mo4770f(i);
            if (f != null) {
                this.f4180b.remove(f);
            }
            int size = this.f4180b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4180b.get(i2).f4181d >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f4180b.remove(i2);
            return this.f4180b.get(i2).f4181d;
        }

        /* renamed from: l */
        private void m5459l(int i, int i2) {
            List<C1209a> list = this.f4180b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1209a aVar = this.f4180b.get(size);
                    int i3 = aVar.f4181d;
                    if (i3 >= i) {
                        aVar.f4181d = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m5460m(int i, int i2) {
            List<C1209a> list = this.f4180b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1209a aVar = this.f4180b.get(size);
                    int i4 = aVar.f4181d;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f4180b.remove(size);
                        } else {
                            aVar.f4181d = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo4765a(C1209a aVar) {
            if (this.f4180b == null) {
                this.f4180b = new ArrayList();
            }
            int size = this.f4180b.size();
            for (int i = 0; i < size; i++) {
                C1209a aVar2 = this.f4180b.get(i);
                if (aVar2.f4181d == aVar.f4181d) {
                    this.f4180b.remove(i);
                }
                if (aVar2.f4181d >= aVar.f4181d) {
                    this.f4180b.add(i, aVar);
                    return;
                }
            }
            this.f4180b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4766b() {
            int[] iArr = this.f4179a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4180b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4767c(int i) {
            int[] iArr = this.f4179a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f4179a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo4776o(i)];
                this.f4179a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4179a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4768d(int i) {
            List<C1209a> list = this.f4180b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4180b.get(size).f4181d >= i) {
                        this.f4180b.remove(size);
                    }
                }
            }
            return mo4772h(i);
        }

        /* renamed from: e */
        public C1209a mo4769e(int i, int i2, int i3, boolean z) {
            List<C1209a> list = this.f4180b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1209a aVar = this.f4180b.get(i4);
                int i5 = aVar.f4181d;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f4182e == i3 || (z && aVar.f4184g))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1209a mo4770f(int i) {
            List<C1209a> list = this.f4180b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1209a aVar = this.f4180b.get(size);
                if (aVar.f4181d == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo4771g(int i) {
            int[] iArr = this.f4179a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4772h(int i) {
            int[] iArr = this.f4179a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m5458i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f4179a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4179a.length;
            }
            int min = Math.min(i2 + 1, this.f4179a.length);
            Arrays.fill(this.f4179a, i, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4773j(int i, int i2) {
            int[] iArr = this.f4179a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4767c(i3);
                int[] iArr2 = this.f4179a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4179a, i, i3, -1);
                m5459l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4774k(int i, int i2) {
            int[] iArr = this.f4179a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4767c(i3);
                int[] iArr2 = this.f4179a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4179a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m5460m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo4775n(int i, C1213f fVar) {
            mo4767c(i);
            this.f4179a[i] = fVar.f4199e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4776o(int i) {
            int length = this.f4179a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C1211e implements Parcelable {
        public static final Parcelable.Creator<C1211e> CREATOR = new C1212a();

        /* renamed from: d */
        int f4185d;

        /* renamed from: e */
        int f4186e;

        /* renamed from: f */
        int f4187f;

        /* renamed from: g */
        int[] f4188g;

        /* renamed from: h */
        int f4189h;

        /* renamed from: i */
        int[] f4190i;

        /* renamed from: j */
        List<C1208d.C1209a> f4191j;

        /* renamed from: k */
        boolean f4192k;

        /* renamed from: l */
        boolean f4193l;

        /* renamed from: m */
        boolean f4194m;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        class C1212a implements Parcelable.Creator<C1211e> {
            C1212a() {
            }

            /* renamed from: a */
            public C1211e createFromParcel(Parcel parcel) {
                return new C1211e(parcel);
            }

            /* renamed from: b */
            public C1211e[] newArray(int i) {
                return new C1211e[i];
            }
        }

        public C1211e() {
        }

        C1211e(Parcel parcel) {
            this.f4185d = parcel.readInt();
            this.f4186e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4187f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4188g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4189h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4190i = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f4192k = parcel.readInt() == 1;
            this.f4193l = parcel.readInt() == 1;
            this.f4194m = parcel.readInt() == 1 ? true : z;
            this.f4191j = parcel.readArrayList(C1208d.C1209a.class.getClassLoader());
        }

        public C1211e(C1211e eVar) {
            this.f4187f = eVar.f4187f;
            this.f4185d = eVar.f4185d;
            this.f4186e = eVar.f4186e;
            this.f4188g = eVar.f4188g;
            this.f4189h = eVar.f4189h;
            this.f4190i = eVar.f4190i;
            this.f4192k = eVar.f4192k;
            this.f4193l = eVar.f4193l;
            this.f4194m = eVar.f4194m;
            this.f4191j = eVar.f4191j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4785a() {
            this.f4188g = null;
            this.f4187f = 0;
            this.f4185d = -1;
            this.f4186e = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4786b() {
            this.f4188g = null;
            this.f4187f = 0;
            this.f4189h = 0;
            this.f4190i = null;
            this.f4191j = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4185d);
            parcel.writeInt(this.f4186e);
            parcel.writeInt(this.f4187f);
            if (this.f4187f > 0) {
                parcel.writeIntArray(this.f4188g);
            }
            parcel.writeInt(this.f4189h);
            if (this.f4189h > 0) {
                parcel.writeIntArray(this.f4190i);
            }
            parcel.writeInt(this.f4192k ? 1 : 0);
            parcel.writeInt(this.f4193l ? 1 : 0);
            parcel.writeInt(this.f4194m ? 1 : 0);
            parcel.writeList(this.f4191j);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C1213f {

        /* renamed from: a */
        ArrayList<View> f4195a = new ArrayList<>();

        /* renamed from: b */
        int f4196b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4197c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4198d = 0;

        /* renamed from: e */
        final int f4199e;

        C1213f(int i) {
            this.f4199e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4793a(View view) {
            C1207c n = mo4806n(view);
            n.f4177e = this;
            this.f4195a.add(view);
            this.f4197c = Integer.MIN_VALUE;
            if (this.f4195a.size() == 1) {
                this.f4196b = Integer.MIN_VALUE;
            }
            if (n.mo4645c() || n.mo4644b()) {
                this.f4198d += StaggeredGridLayoutManager.this.f4163u.mo4925e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4794b(boolean z, int i) {
            int l = z ? mo4804l(Integer.MIN_VALUE) : mo4808p(Integer.MIN_VALUE);
            mo4797e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.f4163u.mo4929i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.f4163u.mo4933m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.f4197c = l;
                    this.f4196b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4795c() {
            C1208d.C1209a f;
            ArrayList<View> arrayList = this.f4195a;
            View view = arrayList.get(arrayList.size() - 1);
            C1207c n = mo4806n(view);
            this.f4197c = StaggeredGridLayoutManager.this.f4163u.mo4924d(view);
            if (n.f4178f && (f = StaggeredGridLayoutManager.this.f4149E.mo4770f(n.mo4643a())) != null && f.f4182e == 1) {
                this.f4197c += f.mo4777a(this.f4199e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4796d() {
            C1208d.C1209a f;
            View view = this.f4195a.get(0);
            C1207c n = mo4806n(view);
            this.f4196b = StaggeredGridLayoutManager.this.f4163u.mo4927g(view);
            if (n.f4178f && (f = StaggeredGridLayoutManager.this.f4149E.mo4770f(n.mo4643a())) != null && f.f4182e == -1) {
                this.f4196b -= f.mo4777a(this.f4199e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4797e() {
            this.f4195a.clear();
            mo4809q();
            this.f4198d = 0;
        }

        /* renamed from: f */
        public int mo4798f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4168z) {
                i2 = this.f4195a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f4195a.size();
            }
            return mo4801i(i2, i, true);
        }

        /* renamed from: g */
        public int mo4799g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4168z) {
                i2 = 0;
                i = this.f4195a.size();
            } else {
                i2 = this.f4195a.size() - 1;
                i = -1;
            }
            return mo4801i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4800h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f4163u.mo4933m();
            int i3 = StaggeredGridLayoutManager.this.f4163u.mo4929i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f4195a.get(i);
                int g = StaggeredGridLayoutManager.this.f4163u.mo4927g(view);
                int d = StaggeredGridLayoutManager.this.f4163u.mo4924d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                    } else if (g >= m && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo4599g0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo4801i(int i, int i2, boolean z) {
            return mo4800h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo4802j() {
            return this.f4198d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo4803k() {
            int i = this.f4197c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4795c();
            return this.f4197c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo4804l(int i) {
            int i2 = this.f4197c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4195a.size() == 0) {
                return i;
            }
            mo4795c();
            return this.f4197c;
        }

        /* renamed from: m */
        public View mo4805m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4195a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4195a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4168z && staggeredGridLayoutManager.mo4599g0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4168z && staggeredGridLayoutManager2.mo4599g0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4195a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4195a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4168z && staggeredGridLayoutManager3.mo4599g0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4168z && staggeredGridLayoutManager4.mo4599g0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1207c mo4806n(View view) {
            return (C1207c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4807o() {
            int i = this.f4196b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4796d();
            return this.f4196b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo4808p(int i) {
            int i2 = this.f4196b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4195a.size() == 0) {
                return i;
            }
            mo4796d();
            return this.f4196b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4809q() {
            this.f4196b = Integer.MIN_VALUE;
            this.f4197c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4810r(int i) {
            int i2 = this.f4196b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4196b = i2 + i;
            }
            int i3 = this.f4197c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4197c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4811s() {
            int size = this.f4195a.size();
            View remove = this.f4195a.remove(size - 1);
            C1207c n = mo4806n(remove);
            n.f4177e = null;
            if (n.mo4645c() || n.mo4644b()) {
                this.f4198d -= StaggeredGridLayoutManager.this.f4163u.mo4925e(remove);
            }
            if (size == 1) {
                this.f4196b = Integer.MIN_VALUE;
            }
            this.f4197c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4812t() {
            View remove = this.f4195a.remove(0);
            C1207c n = mo4806n(remove);
            n.f4177e = null;
            if (this.f4195a.size() == 0) {
                this.f4197c = Integer.MIN_VALUE;
            }
            if (n.mo4645c() || n.mo4644b()) {
                this.f4198d -= StaggeredGridLayoutManager.this.f4163u.mo4925e(remove);
            }
            this.f4196b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4813u(View view) {
            C1207c n = mo4806n(view);
            n.f4177e = this;
            this.f4195a.add(0, view);
            this.f4196b = Integer.MIN_VALUE;
            if (this.f4195a.size() == 1) {
                this.f4197c = Integer.MIN_VALUE;
            }
            if (n.mo4645c() || n.mo4644b()) {
                this.f4198d += StaggeredGridLayoutManager.this.f4163u.mo4925e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4814v(int i) {
            this.f4196b = i;
            this.f4197c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1183p.C1187d h0 = RecyclerView.C1183p.m5112h0(context, attributeSet, i, i2);
        mo4741D2(h0.f4108a);
        mo4743F2(h0.f4109b);
        mo4742E2(h0.f4110c);
        this.f4167y = new C1240f();
        m5377W1();
    }

    /* renamed from: A2 */
    private void m5359A2() {
        this.f4145A = (this.f4165w == 1 || !mo4757p2()) ? this.f4168z : !this.f4168z;
    }

    /* renamed from: C2 */
    private void m5360C2(int i) {
        C1240f fVar = this.f4167y;
        fVar.f4324e = i;
        int i2 = 1;
        if (this.f4145A != (i == -1)) {
            i2 = -1;
        }
        fVar.f4323d = i2;
    }

    /* renamed from: G2 */
    private void m5361G2(int i, int i2) {
        for (int i3 = 0; i3 < this.f4161s; i3++) {
            if (!this.f4162t[i3].f4195a.isEmpty()) {
                m5367M2(this.f4162t[i3], i, i2);
            }
        }
    }

    /* renamed from: H2 */
    private boolean m5362H2(RecyclerView.C1162b0 b0Var, C1206b bVar) {
        boolean z = this.f4151G;
        int b = b0Var.mo4417b();
        bVar.f4170a = z ? m5380c2(b) : m5379Y1(b);
        bVar.f4171b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: I1 */
    private void m5363I1(View view) {
        for (int i = this.f4161s - 1; i >= 0; i--) {
            this.f4162t[i].mo4793a(view);
        }
    }

    /* renamed from: J1 */
    private void m5364J1(C1206b bVar) {
        boolean z;
        C1211e eVar = this.f4153I;
        int i = eVar.f4187f;
        if (i > 0) {
            if (i == this.f4161s) {
                for (int i2 = 0; i2 < this.f4161s; i2++) {
                    this.f4162t[i2].mo4797e();
                    C1211e eVar2 = this.f4153I;
                    int i3 = eVar2.f4188g[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f4193l ? this.f4163u.mo4929i() : this.f4163u.mo4933m();
                    }
                    this.f4162t[i2].mo4814v(i3);
                }
            } else {
                eVar.mo4786b();
                C1211e eVar3 = this.f4153I;
                eVar3.f4185d = eVar3.f4186e;
            }
        }
        C1211e eVar4 = this.f4153I;
        this.f4152H = eVar4.f4194m;
        mo4742E2(eVar4.f4192k);
        m5359A2();
        C1211e eVar5 = this.f4153I;
        int i4 = eVar5.f4185d;
        if (i4 != -1) {
            this.f4147C = i4;
            z = eVar5.f4193l;
        } else {
            z = this.f4145A;
        }
        bVar.f4172c = z;
        if (eVar5.f4189h > 1) {
            C1208d dVar = this.f4149E;
            dVar.f4179a = eVar5.f4190i;
            dVar.f4180b = eVar5.f4191j;
        }
    }

    /* renamed from: K2 */
    private void m5365K2(int i, RecyclerView.C1162b0 b0Var) {
        int i2;
        int i3;
        int c;
        C1240f fVar = this.f4167y;
        boolean z = false;
        fVar.f4321b = 0;
        fVar.f4322c = i;
        if (!mo4628w0() || (c = b0Var.mo4418c()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f4145A == (c < i)) {
                i3 = this.f4163u.mo4934n();
                i2 = 0;
            } else {
                i2 = this.f4163u.mo4934n();
                i3 = 0;
            }
        }
        if (mo4566M()) {
            this.f4167y.f4325f = this.f4163u.mo4933m() - i2;
            this.f4167y.f4326g = this.f4163u.mo4929i() + i3;
        } else {
            this.f4167y.f4326g = this.f4163u.mo4928h() + i3;
            this.f4167y.f4325f = -i2;
        }
        C1240f fVar2 = this.f4167y;
        fVar2.f4327h = false;
        fVar2.f4320a = true;
        if (this.f4163u.mo4931k() == 0 && this.f4163u.mo4928h() == 0) {
            z = true;
        }
        fVar2.f4328i = z;
    }

    /* renamed from: M1 */
    private void m5366M1(View view, C1207c cVar, C1240f fVar) {
        if (fVar.f4324e == 1) {
            if (cVar.f4178f) {
                m5363I1(view);
            } else {
                cVar.f4177e.mo4793a(view);
            }
        } else if (cVar.f4178f) {
            m5393v2(view);
        } else {
            cVar.f4177e.mo4813u(view);
        }
    }

    /* renamed from: M2 */
    private void m5367M2(C1213f fVar, int i, int i2) {
        int j = fVar.mo4802j();
        if (i == -1) {
            if (fVar.mo4807o() + j > i2) {
                return;
            }
        } else if (fVar.mo4803k() - j < i2) {
            return;
        }
        this.f4146B.set(fVar.f4199e, false);
    }

    /* renamed from: N1 */
    private int m5368N1(int i) {
        if (mo4563J() == 0) {
            return this.f4145A ? 1 : -1;
        }
        return (i < mo4753f2()) != this.f4145A ? -1 : 1;
    }

    /* renamed from: N2 */
    private int m5369N2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: P1 */
    private boolean m5370P1(C1213f fVar) {
        if (this.f4145A) {
            if (fVar.mo4803k() < this.f4163u.mo4929i()) {
                ArrayList<View> arrayList = fVar.f4195a;
                return !fVar.mo4806n(arrayList.get(arrayList.size() - 1)).f4178f;
            }
        } else if (fVar.mo4807o() > this.f4163u.mo4933m()) {
            return !fVar.mo4806n(fVar.f4195a.get(0)).f4178f;
        }
        return false;
    }

    /* renamed from: Q1 */
    private int m5371Q1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        return C1253n.m5738a(b0Var, this.f4163u, mo4751a2(!this.f4158N), mo4750Z1(!this.f4158N), this, this.f4158N);
    }

    /* renamed from: R1 */
    private int m5372R1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        return C1253n.m5739b(b0Var, this.f4163u, mo4751a2(!this.f4158N), mo4750Z1(!this.f4158N), this, this.f4158N, this.f4145A);
    }

    /* renamed from: S1 */
    private int m5373S1(RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0) {
            return 0;
        }
        return C1253n.m5740c(b0Var, this.f4163u, mo4751a2(!this.f4158N), mo4750Z1(!this.f4158N), this, this.f4158N);
    }

    /* renamed from: T1 */
    private int m5374T1(int i) {
        if (i == 1) {
            return (this.f4165w != 1 && mo4757p2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f4165w != 1 && mo4757p2()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f4165w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f4165w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f4165w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f4165w == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: U1 */
    private C1208d.C1209a m5375U1(int i) {
        C1208d.C1209a aVar = new C1208d.C1209a();
        aVar.f4183f = new int[this.f4161s];
        for (int i2 = 0; i2 < this.f4161s; i2++) {
            aVar.f4183f[i2] = i - this.f4162t[i2].mo4804l(i);
        }
        return aVar;
    }

    /* renamed from: V1 */
    private C1208d.C1209a m5376V1(int i) {
        C1208d.C1209a aVar = new C1208d.C1209a();
        aVar.f4183f = new int[this.f4161s];
        for (int i2 = 0; i2 < this.f4161s; i2++) {
            aVar.f4183f[i2] = this.f4162t[i2].mo4808p(i) - i;
        }
        return aVar;
    }

    /* renamed from: W1 */
    private void m5377W1() {
        this.f4163u = C1244i.m5659b(this, this.f4165w);
        this.f4164v = C1244i.m5659b(this, 1 - this.f4165w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: X1 */
    private int m5378X1(RecyclerView.C1195w wVar, C1240f fVar, RecyclerView.C1162b0 b0Var) {
        C1213f fVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z;
        RecyclerView.C1195w wVar2 = wVar;
        C1240f fVar3 = fVar;
        ? r9 = 0;
        this.f4146B.set(0, this.f4161s, true);
        int i7 = this.f4167y.f4328i ? fVar3.f4324e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar3.f4324e == 1 ? fVar3.f4326g + fVar3.f4321b : fVar3.f4325f - fVar3.f4321b;
        m5361G2(fVar3.f4324e, i7);
        int i8 = this.f4145A ? this.f4163u.mo4929i() : this.f4163u.mo4933m();
        boolean z2 = false;
        while (fVar.mo4909a(b0Var) && (this.f4167y.f4328i || !this.f4146B.isEmpty())) {
            View b = fVar3.mo4910b(wVar2);
            C1207c cVar = (C1207c) b.getLayoutParams();
            int a = cVar.mo4643a();
            int g = this.f4149E.mo4771g(a);
            boolean z3 = g == -1 ? true : r9;
            if (z3) {
                fVar2 = cVar.f4178f ? this.f4162t[r9] : m5387l2(fVar3);
                this.f4149E.mo4775n(a, fVar2);
            } else {
                fVar2 = this.f4162t[g];
            }
            C1213f fVar4 = fVar2;
            cVar.f4177e = fVar4;
            if (fVar3.f4324e == 1) {
                mo4591d(b);
            } else {
                mo4594e(b, r9);
            }
            m5390r2(b, cVar, r9);
            if (fVar3.f4324e == 1) {
                int h2 = cVar.f4178f ? m5383h2(i8) : fVar4.mo4804l(i8);
                int e = this.f4163u.mo4925e(b) + h2;
                if (z3 && cVar.f4178f) {
                    C1208d.C1209a U1 = m5375U1(h2);
                    U1.f4182e = -1;
                    U1.f4181d = a;
                    this.f4149E.mo4765a(U1);
                }
                i = e;
                i2 = h2;
            } else {
                int k2 = cVar.f4178f ? m5386k2(i8) : fVar4.mo4808p(i8);
                i2 = k2 - this.f4163u.mo4925e(b);
                if (z3 && cVar.f4178f) {
                    C1208d.C1209a V1 = m5376V1(k2);
                    V1.f4182e = 1;
                    V1.f4181d = a;
                    this.f4149E.mo4765a(V1);
                }
                i = k2;
            }
            if (cVar.f4178f && fVar3.f4323d == -1) {
                if (!z3) {
                    if (!(fVar3.f4324e == 1 ? mo4746K1() : mo4747L1())) {
                        C1208d.C1209a f = this.f4149E.mo4770f(a);
                        if (f != null) {
                            f.f4184g = true;
                        }
                    }
                }
                this.f4157M = true;
            }
            m5366M1(b, cVar, fVar3);
            if (!mo4757p2() || this.f4165w != 1) {
                int m = cVar.f4178f ? this.f4164v.mo4933m() : (fVar4.f4199e * this.f4166x) + this.f4164v.mo4933m();
                i4 = m;
                i3 = this.f4164v.mo4925e(b) + m;
            } else {
                int i9 = cVar.f4178f ? this.f4164v.mo4929i() : this.f4164v.mo4929i() - (((this.f4161s - 1) - fVar4.f4199e) * this.f4166x);
                i3 = i9;
                i4 = i9 - this.f4164v.mo4925e(b);
            }
            if (this.f4165w == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i6 = i4;
                i4 = i2;
                i5 = i3;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i6 = i2;
                i5 = i;
                i = i3;
            }
            staggeredGridLayoutManager.mo4632y0(view, i6, i4, i5, i);
            if (cVar.f4178f) {
                m5361G2(this.f4167y.f4324e, i7);
            } else {
                m5367M2(fVar4, this.f4167y.f4324e, i7);
            }
            m5394w2(wVar2, this.f4167y);
            if (this.f4167y.f4327h && b.hasFocusable()) {
                if (cVar.f4178f) {
                    this.f4146B.clear();
                } else {
                    z = false;
                    this.f4146B.set(fVar4.f4199e, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i10 = r9;
        if (!z2) {
            m5394w2(wVar2, this.f4167y);
        }
        int m2 = this.f4167y.f4324e == -1 ? this.f4163u.mo4933m() - m5386k2(this.f4163u.mo4933m()) : m5383h2(this.f4163u.mo4929i()) - this.f4163u.mo4929i();
        return m2 > 0 ? Math.min(fVar3.f4321b, m2) : i10;
    }

    /* renamed from: Y1 */
    private int m5379Y1(int i) {
        int J = mo4563J();
        for (int i2 = 0; i2 < J; i2++) {
            int g0 = mo4599g0(mo4562I(i2));
            if (g0 >= 0 && g0 < i) {
                return g0;
            }
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m5380c2(int i) {
        for (int J = mo4563J() - 1; J >= 0; J--) {
            int g0 = mo4599g0(mo4562I(J));
            if (g0 >= 0 && g0 < i) {
                return g0;
            }
        }
        return 0;
    }

    /* renamed from: d2 */
    private void m5381d2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z) {
        int i;
        int h2 = m5383h2(Integer.MIN_VALUE);
        if (h2 != Integer.MIN_VALUE && (i = this.f4163u.mo4929i() - h2) > 0) {
            int i2 = i - (-mo4740B2(-i, wVar, b0Var));
            if (z && i2 > 0) {
                this.f4163u.mo4938r(i2);
            }
        }
    }

    /* renamed from: e2 */
    private void m5382e2(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var, boolean z) {
        int m;
        int k2 = m5386k2(Integer.MAX_VALUE);
        if (k2 != Integer.MAX_VALUE && (m = k2 - this.f4163u.mo4933m()) > 0) {
            int B2 = m - mo4740B2(m, wVar, b0Var);
            if (z && B2 > 0) {
                this.f4163u.mo4938r(-B2);
            }
        }
    }

    /* renamed from: h2 */
    private int m5383h2(int i) {
        int l = this.f4162t[0].mo4804l(i);
        for (int i2 = 1; i2 < this.f4161s; i2++) {
            int l2 = this.f4162t[i2].mo4804l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: i2 */
    private int m5384i2(int i) {
        int p = this.f4162t[0].mo4808p(i);
        for (int i2 = 1; i2 < this.f4161s; i2++) {
            int p2 = this.f4162t[i2].mo4808p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: j2 */
    private int m5385j2(int i) {
        int l = this.f4162t[0].mo4804l(i);
        for (int i2 = 1; i2 < this.f4161s; i2++) {
            int l2 = this.f4162t[i2].mo4804l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: k2 */
    private int m5386k2(int i) {
        int p = this.f4162t[0].mo4808p(i);
        for (int i2 = 1; i2 < this.f4161s; i2++) {
            int p2 = this.f4162t[i2].mo4808p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: l2 */
    private C1213f m5387l2(C1240f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5392t2(fVar.f4324e)) {
            i2 = this.f4161s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f4161s;
            i = 1;
        }
        C1213f fVar2 = null;
        if (fVar.f4324e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f4163u.mo4933m();
            while (i2 != i3) {
                C1213f fVar3 = this.f4162t[i2];
                int l = fVar3.mo4804l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f4163u.mo4929i();
        while (i2 != i3) {
            C1213f fVar4 = this.f4162t[i2];
            int p = fVar4.mo4808p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5388m2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4145A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4754g2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4753f2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f4149E
            r4.mo4772h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4149E
            r9.mo4774k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f4149E
            r7.mo4773j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4149E
            r9.mo4774k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4149E
            r9.mo4773j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f4145A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4753f2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4754g2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4623s1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5388m2(int, int, int):void");
    }

    /* renamed from: q2 */
    private void m5389q2(View view, int i, int i2, boolean z) {
        mo4606j(view, this.f4155K);
        C1207c cVar = (C1207c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f4155K;
        int N2 = m5369N2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f4155K;
        int N22 = m5369N2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo4557F1(view, N2, N22, cVar) : mo4554D1(view, N2, N22, cVar)) {
            view.measure(N2, N22);
        }
    }

    /* renamed from: r2 */
    private void m5390r2(View view, C1207c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f4178f) {
            if (this.f4165w == 1) {
                i2 = this.f4154J;
            } else {
                m5389q2(view, RecyclerView.C1183p.m5109K(mo4614n0(), mo4616o0(), mo4592d0() + mo4595e0(), cVar.width, true), this.f4154J, z);
                return;
            }
        } else if (this.f4165w == 1) {
            i2 = RecyclerView.C1183p.m5109K(this.f4166x, mo4616o0(), 0, cVar.width, false);
        } else {
            i2 = RecyclerView.C1183p.m5109K(mo4614n0(), mo4616o0(), mo4592d0() + mo4595e0(), cVar.width, true);
            i = RecyclerView.C1183p.m5109K(this.f4166x, mo4580X(), 0, cVar.height, false);
            m5389q2(view, i2, i, z);
        }
        i = RecyclerView.C1183p.m5109K(mo4579W(), mo4580X(), mo4597f0() + mo4590c0(), cVar.height, true);
        m5389q2(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo4749O1() != false) goto L_0x014f;
     */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5391s2(androidx.recyclerview.widget.RecyclerView.C1195w r9, androidx.recyclerview.widget.RecyclerView.C1162b0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f4156L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f4153I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f4147C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4417b()
            if (r1 != 0) goto L_0x0018
            r8.mo4607j1(r9)
            r0.mo4762c()
            return
        L_0x0018:
            boolean r1 = r0.f4174e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f4147C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f4153I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4762c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f4153I
            if (r5 == 0) goto L_0x0037
            r8.m5364J1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5359A2()
            boolean r5 = r8.f4145A
            r0.f4172c = r5
        L_0x003e:
            r8.mo4745J2(r10, r0)
            r0.f4174e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f4153I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f4147C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f4172c
            boolean r6 = r8.f4151G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4757p2()
            boolean r6 = r8.f4152H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f4149E
            r5.mo4766b()
            r0.f4173d = r4
        L_0x0060:
            int r5 = r8.mo4563J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f4153I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f4187f
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f4173d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f4161s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4162t
            r5 = r5[r1]
            r5.mo4797e()
            int r5 = r0.f4171b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f4162t
            r6 = r6[r1]
            r6.mo4814v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4156L
            int[] r1 = r1.f4175f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f4161s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4162t
            r5 = r5[r1]
            r5.mo4797e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f4156L
            int[] r6 = r6.f4175f
            r6 = r6[r1]
            r5.mo4814v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f4161s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4162t
            r5 = r5[r1]
            boolean r6 = r8.f4145A
            int r7 = r0.f4171b
            r5.mo4794b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4156L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f4162t
            r1.mo4763d(r5)
        L_0x00c9:
            r8.mo4627w(r9)
            androidx.recyclerview.widget.f r1 = r8.f4167y
            r1.f4320a = r3
            r8.f4157M = r3
            androidx.recyclerview.widget.i r1 = r8.f4164v
            int r1 = r1.mo4934n()
            r8.mo4748L2(r1)
            int r1 = r0.f4170a
            r8.m5365K2(r1, r10)
            boolean r1 = r0.f4172c
            if (r1 == 0) goto L_0x00f0
            r8.m5360C2(r2)
            androidx.recyclerview.widget.f r1 = r8.f4167y
            r8.m5378X1(r9, r1, r10)
            r8.m5360C2(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m5360C2(r4)
            androidx.recyclerview.widget.f r1 = r8.f4167y
            r8.m5378X1(r9, r1, r10)
            r8.m5360C2(r2)
        L_0x00fb:
            androidx.recyclerview.widget.f r1 = r8.f4167y
            int r2 = r0.f4170a
            int r5 = r1.f4323d
            int r2 = r2 + r5
            r1.f4322c = r2
            r8.m5378X1(r9, r1, r10)
            r8.m5397z2()
            int r1 = r8.mo4563J()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f4145A
            if (r1 == 0) goto L_0x011b
            r8.m5381d2(r9, r10, r4)
            r8.m5382e2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m5382e2(r9, r10, r4)
            r8.m5381d2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo4420e()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f4150F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo4563J()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f4157M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo4755n2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = r4
            goto L_0x0140
        L_0x013f:
            r11 = r3
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f4160P
            r8.mo4615n1(r11)
            boolean r11 = r8.mo4749O1()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = r3
        L_0x014f:
            boolean r11 = r10.mo4420e()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4156L
            r11.mo4762c()
        L_0x015a:
            boolean r11 = r0.f4172c
            r8.f4151G = r11
            boolean r11 = r8.mo4757p2()
            r8.f4152H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4156L
            r11.mo4762c()
            r8.m5391s2(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5391s2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: t2 */
    private boolean m5392t2(int i) {
        if (this.f4165w == 0) {
            return (i == -1) != this.f4145A;
        }
        return ((i == -1) == this.f4145A) == mo4757p2();
    }

    /* renamed from: v2 */
    private void m5393v2(View view) {
        for (int i = this.f4161s - 1; i >= 0; i--) {
            this.f4162t[i].mo4813u(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f4324e == -1) goto L_0x0012;
     */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5394w2(androidx.recyclerview.widget.RecyclerView.C1195w r3, androidx.recyclerview.widget.C1240f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f4320a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f4328i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f4321b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f4324e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f4326g
        L_0x0014:
            r2.m5395x2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f4325f
        L_0x001a:
            r2.m5396y2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f4324e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f4325f
            int r1 = r2.m5384i2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f4326g
            int r4 = r4.f4321b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f4326g
            int r0 = r2.m5385j2(r0)
            int r1 = r4.f4326g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f4325f
            int r4 = r4.f4321b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5394w2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: x2 */
    private void m5395x2(RecyclerView.C1195w wVar, int i) {
        int J = mo4563J() - 1;
        while (J >= 0) {
            View I = mo4562I(J);
            if (this.f4163u.mo4927g(I) >= i && this.f4163u.mo4937q(I) >= i) {
                C1207c cVar = (C1207c) I.getLayoutParams();
                if (cVar.f4178f) {
                    int i2 = 0;
                    while (i2 < this.f4161s) {
                        if (this.f4162t[i2].f4195a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4161s; i3++) {
                        this.f4162t[i3].mo4811s();
                    }
                } else if (cVar.f4177e.f4195a.size() != 1) {
                    cVar.f4177e.mo4811s();
                } else {
                    return;
                }
                mo4611l1(I, wVar);
                J--;
            } else {
                return;
            }
        }
    }

    /* renamed from: y2 */
    private void m5396y2(RecyclerView.C1195w wVar, int i) {
        while (mo4563J() > 0) {
            View I = mo4562I(0);
            if (this.f4163u.mo4924d(I) <= i && this.f4163u.mo4936p(I) <= i) {
                C1207c cVar = (C1207c) I.getLayoutParams();
                if (cVar.f4178f) {
                    int i2 = 0;
                    while (i2 < this.f4161s) {
                        if (this.f4162t[i2].f4195a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4161s; i3++) {
                        this.f4162t[i3].mo4812t();
                    }
                } else if (cVar.f4177e.f4195a.size() != 1) {
                    cVar.f4177e.mo4812t();
                } else {
                    return;
                }
                mo4611l1(I, wVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: z2 */
    private void m5397z2() {
        if (this.f4164v.mo4931k() != 1073741824) {
            float f = 0.0f;
            int J = mo4563J();
            for (int i = 0; i < J; i++) {
                View I = mo4562I(i);
                float e = (float) this.f4164v.mo4925e(I);
                if (e >= f) {
                    if (((C1207c) I.getLayoutParams()).mo4764e()) {
                        e = (e * 1.0f) / ((float) this.f4161s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f4166x;
            int round = Math.round(f * ((float) this.f4161s));
            if (this.f4164v.mo4931k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4164v.mo4934n());
            }
            mo4748L2(round);
            if (this.f4166x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo4562I(i3);
                    C1207c cVar = (C1207c) I2.getLayoutParams();
                    if (!cVar.f4178f) {
                        if (!mo4757p2() || this.f4165w != 1) {
                            int i4 = cVar.f4177e.f4199e;
                            int i5 = this.f4165w;
                            int i6 = (this.f4166x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                I2.offsetLeftAndRight(i6);
                            } else {
                                I2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f4161s;
                            int i8 = cVar.f4177e.f4199e;
                            I2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f4166x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A1 */
    public void mo4136A1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int d0 = mo4592d0() + mo4595e0();
        int f0 = mo4597f0() + mo4590c0();
        if (this.f4165w == 1) {
            i4 = RecyclerView.C1183p.m5113n(i2, rect.height() + f0, mo4585a0());
            i3 = RecyclerView.C1183p.m5113n(i, (this.f4166x * this.f4161s) + d0, mo4588b0());
        } else {
            i3 = RecyclerView.C1183p.m5113n(i, rect.width() + d0, mo4588b0());
            i4 = RecyclerView.C1183p.m5113n(i2, (this.f4166x * this.f4161s) + f0, mo4585a0());
        }
        mo4636z1(i3, i4);
    }

    /* renamed from: B0 */
    public void mo4549B0(int i) {
        super.mo4549B0(i);
        for (int i2 = 0; i2 < this.f4161s; i2++) {
            this.f4162t[i2].mo4810r(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public int mo4740B2(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        if (mo4563J() == 0 || i == 0) {
            return 0;
        }
        mo4758u2(i, b0Var);
        int X1 = m5378X1(wVar, this.f4167y, b0Var);
        if (this.f4167y.f4321b >= X1) {
            i = i < 0 ? -X1 : X1;
        }
        this.f4163u.mo4938r(-i);
        this.f4151G = this.f4145A;
        C1240f fVar = this.f4167y;
        fVar.f4321b = 0;
        m5394w2(wVar, fVar);
        return i;
    }

    /* renamed from: C0 */
    public void mo4551C0(int i) {
        super.mo4551C0(i);
        for (int i2 = 0; i2 < this.f4161s; i2++) {
            this.f4162t[i2].mo4810r(i);
        }
    }

    /* renamed from: D */
    public RecyclerView.C1188q mo4137D() {
        return this.f4165w == 0 ? new C1207c(-2, -1) : new C1207c(-1, -2);
    }

    /* renamed from: D0 */
    public void mo4553D0(RecyclerView.C1171h hVar, RecyclerView.C1171h hVar2) {
        this.f4149E.mo4766b();
        for (int i = 0; i < this.f4161s; i++) {
            this.f4162t[i].mo4797e();
        }
    }

    /* renamed from: D2 */
    public void mo4741D2(int i) {
        if (i == 0 || i == 1) {
            mo4193g((String) null);
            if (i != this.f4165w) {
                this.f4165w = i;
                C1244i iVar = this.f4163u;
                this.f4163u = this.f4164v;
                this.f4164v = iVar;
                mo4623s1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: E */
    public RecyclerView.C1188q mo4138E(Context context, AttributeSet attributeSet) {
        return new C1207c(context, attributeSet);
    }

    /* renamed from: E2 */
    public void mo4742E2(boolean z) {
        mo4193g((String) null);
        C1211e eVar = this.f4153I;
        if (!(eVar == null || eVar.f4192k == z)) {
            eVar.f4192k = z;
        }
        this.f4168z = z;
        mo4623s1();
    }

    /* renamed from: F */
    public RecyclerView.C1188q mo4139F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1207c((ViewGroup.MarginLayoutParams) layoutParams) : new C1207c(layoutParams);
    }

    /* renamed from: F2 */
    public void mo4743F2(int i) {
        mo4193g((String) null);
        if (i != this.f4161s) {
            mo4756o2();
            this.f4161s = i;
            this.f4146B = new BitSet(this.f4161s);
            this.f4162t = new C1213f[this.f4161s];
            for (int i2 = 0; i2 < this.f4161s; i2++) {
                this.f4162t[i2] = new C1213f(i2);
            }
            mo4623s1();
        }
    }

    /* renamed from: H0 */
    public void mo4177H0(RecyclerView recyclerView, RecyclerView.C1195w wVar) {
        super.mo4177H0(recyclerView, wVar);
        mo4615n1(this.f4160P);
        for (int i = 0; i < this.f4161s; i++) {
            this.f4162t[i].mo4797e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: H1 */
    public boolean mo4140H1() {
        return this.f4153I == null;
    }

    /* renamed from: I0 */
    public View mo4141I0(View view, int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        View B;
        View m;
        if (mo4563J() == 0 || (B = mo4548B(view)) == null) {
            return null;
        }
        m5359A2();
        int T1 = m5374T1(i);
        if (T1 == Integer.MIN_VALUE) {
            return null;
        }
        C1207c cVar = (C1207c) B.getLayoutParams();
        boolean z = cVar.f4178f;
        C1213f fVar = cVar.f4177e;
        int g2 = T1 == 1 ? mo4754g2() : mo4753f2();
        m5365K2(g2, b0Var);
        m5360C2(T1);
        C1240f fVar2 = this.f4167y;
        fVar2.f4322c = fVar2.f4323d + g2;
        fVar2.f4321b = (int) (((float) this.f4163u.mo4934n()) * 0.33333334f);
        C1240f fVar3 = this.f4167y;
        fVar3.f4327h = true;
        fVar3.f4320a = false;
        m5378X1(wVar, fVar3, b0Var);
        this.f4151G = this.f4145A;
        if (!z && (m = fVar.mo4805m(g2, T1)) != null && m != B) {
            return m;
        }
        if (m5392t2(T1)) {
            for (int i2 = this.f4161s - 1; i2 >= 0; i2--) {
                View m2 = this.f4162t[i2].mo4805m(g2, T1);
                if (m2 != null && m2 != B) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f4161s; i3++) {
                View m3 = this.f4162t[i3].mo4805m(g2, T1);
                if (m3 != null && m3 != B) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f4168z ^ true) == (T1 == -1);
        if (!z) {
            View C = mo4175C(z2 ? fVar.mo4798f() : fVar.mo4799g());
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m5392t2(T1)) {
            for (int i4 = this.f4161s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f4199e) {
                    C1213f[] fVarArr = this.f4162t;
                    View C2 = mo4175C(z2 ? fVarArr[i4].mo4798f() : fVarArr[i4].mo4799g());
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f4161s; i5++) {
                C1213f[] fVarArr2 = this.f4162t;
                View C3 = mo4175C(z2 ? fVarArr2[i5].mo4798f() : fVarArr2[i5].mo4799g());
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I2 */
    public boolean mo4744I2(RecyclerView.C1162b0 b0Var, C1206b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!b0Var.mo4420e() && (i = this.f4147C) != -1) {
            if (i < 0 || i >= b0Var.mo4417b()) {
                this.f4147C = -1;
                this.f4148D = Integer.MIN_VALUE;
            } else {
                C1211e eVar = this.f4153I;
                if (eVar == null || eVar.f4185d == -1 || eVar.f4187f < 1) {
                    View C = mo4175C(this.f4147C);
                    if (C != null) {
                        bVar.f4170a = this.f4145A ? mo4754g2() : mo4753f2();
                        if (this.f4148D != Integer.MIN_VALUE) {
                            if (bVar.f4172c) {
                                i3 = this.f4163u.mo4929i() - this.f4148D;
                                i2 = this.f4163u.mo4924d(C);
                            } else {
                                i3 = this.f4163u.mo4933m() + this.f4148D;
                                i2 = this.f4163u.mo4927g(C);
                            }
                            bVar.f4171b = i3 - i2;
                            return true;
                        } else if (this.f4163u.mo4925e(C) > this.f4163u.mo4934n()) {
                            bVar.f4171b = bVar.f4172c ? this.f4163u.mo4929i() : this.f4163u.mo4933m();
                            return true;
                        } else {
                            int g = this.f4163u.mo4927g(C) - this.f4163u.mo4933m();
                            if (g < 0) {
                                bVar.f4171b = -g;
                                return true;
                            }
                            int i4 = this.f4163u.mo4929i() - this.f4163u.mo4924d(C);
                            if (i4 < 0) {
                                bVar.f4171b = i4;
                                return true;
                            }
                            bVar.f4171b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f4147C;
                        bVar.f4170a = i5;
                        int i6 = this.f4148D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m5368N1(i5) == 1) {
                                z = true;
                            }
                            bVar.f4172c = z;
                            bVar.mo4760a();
                        } else {
                            bVar.mo4761b(i6);
                        }
                        bVar.f4173d = true;
                    }
                } else {
                    bVar.f4171b = Integer.MIN_VALUE;
                    bVar.f4170a = this.f4147C;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public void mo4179J0(AccessibilityEvent accessibilityEvent) {
        super.mo4179J0(accessibilityEvent);
        if (mo4563J() > 0) {
            View a2 = mo4751a2(false);
            View Z1 = mo4750Z1(false);
            if (a2 != null && Z1 != null) {
                int g0 = mo4599g0(a2);
                int g02 = mo4599g0(Z1);
                if (g0 < g02) {
                    accessibilityEvent.setFromIndex(g0);
                    accessibilityEvent.setToIndex(g02);
                    return;
                }
                accessibilityEvent.setFromIndex(g02);
                accessibilityEvent.setToIndex(g0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J2 */
    public void mo4745J2(RecyclerView.C1162b0 b0Var, C1206b bVar) {
        if (!mo4744I2(b0Var, bVar) && !m5362H2(b0Var, bVar)) {
            bVar.mo4760a();
            bVar.f4170a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public boolean mo4746K1() {
        int l = this.f4162t[0].mo4804l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4161s; i++) {
            if (this.f4162t[i].mo4804l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public boolean mo4747L1() {
        int p = this.f4162t[0].mo4808p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4161s; i++) {
            if (this.f4162t[i].mo4808p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L2 */
    public void mo4748L2(int i) {
        this.f4166x = i / this.f4161s;
        this.f4154J = View.MeasureSpec.makeMeasureSpec(i, this.f4164v.mo4931k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo4749O1() {
        int i;
        int i2;
        if (mo4563J() == 0 || this.f4150F == 0 || !mo4620q0()) {
            return false;
        }
        if (this.f4145A) {
            i2 = mo4754g2();
            i = mo4753f2();
        } else {
            i2 = mo4753f2();
            i = mo4754g2();
        }
        if (i2 == 0 && mo4755n2() != null) {
            this.f4149E.mo4766b();
        } else if (!this.f4157M) {
            return false;
        } else {
            int i3 = this.f4145A ? -1 : 1;
            int i4 = i + 1;
            C1208d.C1209a e = this.f4149E.mo4769e(i2, i4, i3, true);
            if (e == null) {
                this.f4157M = false;
                this.f4149E.mo4768d(i4);
                return false;
            }
            C1208d.C1209a e2 = this.f4149E.mo4769e(i2, e.f4181d, i3 * -1, true);
            if (e2 == null) {
                this.f4149E.mo4768d(e.f4181d);
            } else {
                this.f4149E.mo4768d(e2.f4181d + 1);
            }
        }
        mo4625t1();
        mo4623s1();
        return true;
    }

    /* renamed from: Q0 */
    public void mo4146Q0(RecyclerView recyclerView, int i, int i2) {
        m5388m2(i, i2, 1);
    }

    /* renamed from: R0 */
    public void mo4147R0(RecyclerView recyclerView) {
        this.f4149E.mo4766b();
        mo4623s1();
    }

    /* renamed from: S0 */
    public void mo4148S0(RecyclerView recyclerView, int i, int i2, int i3) {
        m5388m2(i, i2, 8);
    }

    /* renamed from: T0 */
    public void mo4149T0(RecyclerView recyclerView, int i, int i2) {
        m5388m2(i, i2, 2);
    }

    /* renamed from: V0 */
    public void mo4150V0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5388m2(i, i2, 4);
    }

    /* renamed from: W0 */
    public void mo4151W0(RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        m5391s2(wVar, b0Var, true);
    }

    /* renamed from: X0 */
    public void mo4153X0(RecyclerView.C1162b0 b0Var) {
        super.mo4153X0(b0Var);
        this.f4147C = -1;
        this.f4148D = Integer.MIN_VALUE;
        this.f4153I = null;
        this.f4156L.mo4762c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public View mo4750Z1(boolean z) {
        int m = this.f4163u.mo4933m();
        int i = this.f4163u.mo4929i();
        View view = null;
        for (int J = mo4563J() - 1; J >= 0; J--) {
            View I = mo4562I(J);
            int g = this.f4163u.mo4927g(I);
            int d = this.f4163u.mo4924d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public PointF mo4190a(int i) {
        int N1 = m5368N1(i);
        PointF pointF = new PointF();
        if (N1 == 0) {
            return null;
        }
        if (this.f4165w == 0) {
            pointF.x = (float) N1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) N1;
        }
        return pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public View mo4751a2(boolean z) {
        int m = this.f4163u.mo4933m();
        int i = this.f4163u.mo4929i();
        int J = mo4563J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo4562I(i2);
            int g = this.f4163u.mo4927g(I);
            if (this.f4163u.mo4924d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: b1 */
    public void mo4191b1(Parcelable parcelable) {
        if (parcelable instanceof C1211e) {
            C1211e eVar = (C1211e) parcelable;
            this.f4153I = eVar;
            if (this.f4147C != -1) {
                eVar.mo4785a();
                this.f4153I.mo4786b();
            }
            mo4623s1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public int mo4752b2() {
        View Z1 = this.f4145A ? mo4750Z1(true) : mo4751a2(true);
        if (Z1 == null) {
            return -1;
        }
        return mo4599g0(Z1);
    }

    /* renamed from: c1 */
    public Parcelable mo4192c1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f4153I != null) {
            return new C1211e(this.f4153I);
        }
        C1211e eVar = new C1211e();
        eVar.f4192k = this.f4168z;
        eVar.f4193l = this.f4151G;
        eVar.f4194m = this.f4152H;
        C1208d dVar = this.f4149E;
        if (dVar == null || (iArr = dVar.f4179a) == null) {
            eVar.f4189h = 0;
        } else {
            eVar.f4190i = iArr;
            eVar.f4189h = iArr.length;
            eVar.f4191j = dVar.f4180b;
        }
        if (mo4563J() > 0) {
            eVar.f4185d = this.f4151G ? mo4754g2() : mo4753f2();
            eVar.f4186e = mo4752b2();
            int i3 = this.f4161s;
            eVar.f4187f = i3;
            eVar.f4188g = new int[i3];
            for (int i4 = 0; i4 < this.f4161s; i4++) {
                if (this.f4151G) {
                    i = this.f4162t[i4].mo4804l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f4163u.mo4929i();
                    } else {
                        eVar.f4188g[i4] = i;
                    }
                } else {
                    i = this.f4162t[i4].mo4808p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f4163u.mo4933m();
                    } else {
                        eVar.f4188g[i4] = i;
                    }
                }
                i -= i2;
                eVar.f4188g[i4] = i;
            }
        } else {
            eVar.f4185d = -1;
            eVar.f4186e = -1;
            eVar.f4187f = 0;
        }
        return eVar;
    }

    /* renamed from: d1 */
    public void mo4593d1(int i) {
        if (i == 0) {
            mo4749O1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo4753f2() {
        if (mo4563J() == 0) {
            return 0;
        }
        return mo4599g0(mo4562I(0));
    }

    /* renamed from: g */
    public void mo4193g(String str) {
        if (this.f4153I == null) {
            super.mo4193g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public int mo4754g2() {
        int J = mo4563J();
        if (J == 0) {
            return 0;
        }
        return mo4599g0(mo4562I(J - 1));
    }

    /* renamed from: k */
    public boolean mo4198k() {
        return this.f4165w == 0;
    }

    /* renamed from: l */
    public boolean mo4199l() {
        return this.f4165w == 1;
    }

    /* renamed from: m */
    public boolean mo4157m(RecyclerView.C1188q qVar) {
        return qVar instanceof C1207c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4755n2() {
        /*
            r12 = this;
            int r0 = r12.mo4563J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4161s
            r2.<init>(r3)
            int r3 = r12.f4161s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4165w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4757p2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f4145A
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4562I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1207c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4177e
            int r9 = r9.f4199e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4177e
            boolean r9 = r12.m5370P1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4177e
            int r9 = r9.f4199e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4178f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4562I(r9)
            boolean r10 = r12.f4145A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.i r10 = r12.f4163u
            int r10 = r10.mo4924d(r7)
            androidx.recyclerview.widget.i r11 = r12.f4163u
            int r11 = r11.mo4924d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.i r10 = r12.f4163u
            int r10 = r10.mo4927g(r7)
            androidx.recyclerview.widget.i r11 = r12.f4163u
            int r11 = r11.mo4927g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1207c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4177e
            int r8 = r8.f4199e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4177e
            int r9 = r9.f4199e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4755n2():android.view.View");
    }

    /* renamed from: o */
    public void mo4200o(int i, int i2, RecyclerView.C1162b0 b0Var, RecyclerView.C1183p.C1186c cVar) {
        int i3;
        int i4;
        if (this.f4165w != 0) {
            i = i2;
        }
        if (mo4563J() != 0 && i != 0) {
            mo4758u2(i, b0Var);
            int[] iArr = this.f4159O;
            if (iArr == null || iArr.length < this.f4161s) {
                this.f4159O = new int[this.f4161s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f4161s; i6++) {
                C1240f fVar = this.f4167y;
                if (fVar.f4323d == -1) {
                    i4 = fVar.f4325f;
                    i3 = this.f4162t[i6].mo4808p(i4);
                } else {
                    i4 = this.f4162t[i6].mo4804l(fVar.f4326g);
                    i3 = this.f4167y.f4326g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f4159O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f4159O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f4167y.mo4909a(b0Var); i8++) {
                cVar.mo4642a(this.f4167y.f4322c, this.f4159O[i8]);
                C1240f fVar2 = this.f4167y;
                fVar2.f4322c += fVar2.f4323d;
            }
        }
    }

    /* renamed from: o2 */
    public void mo4756o2() {
        this.f4149E.mo4766b();
        mo4623s1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public boolean mo4757p2() {
        return mo4581Y() == 1;
    }

    /* renamed from: q */
    public int mo4202q(RecyclerView.C1162b0 b0Var) {
        return m5371Q1(b0Var);
    }

    /* renamed from: r */
    public int mo4159r(RecyclerView.C1162b0 b0Var) {
        return m5372R1(b0Var);
    }

    /* renamed from: r0 */
    public boolean mo4203r0() {
        return this.f4150F != 0;
    }

    /* renamed from: s */
    public int mo4160s(RecyclerView.C1162b0 b0Var) {
        return m5373S1(b0Var);
    }

    /* renamed from: t */
    public int mo4205t(RecyclerView.C1162b0 b0Var) {
        return m5371Q1(b0Var);
    }

    /* renamed from: u */
    public int mo4161u(RecyclerView.C1162b0 b0Var) {
        return m5372R1(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4758u2(int i, RecyclerView.C1162b0 b0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4754g2();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo4753f2();
        }
        this.f4167y.f4320a = true;
        m5365K2(i3, b0Var);
        m5360C2(i2);
        C1240f fVar = this.f4167y;
        fVar.f4322c = i3 + fVar.f4323d;
        fVar.f4321b = Math.abs(i);
    }

    /* renamed from: v */
    public int mo4162v(RecyclerView.C1162b0 b0Var) {
        return m5373S1(b0Var);
    }

    /* renamed from: v1 */
    public int mo4163v1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        return mo4740B2(i, wVar, b0Var);
    }

    /* renamed from: w1 */
    public int mo4164w1(int i, RecyclerView.C1195w wVar, RecyclerView.C1162b0 b0Var) {
        return mo4740B2(i, wVar, b0Var);
    }
}
