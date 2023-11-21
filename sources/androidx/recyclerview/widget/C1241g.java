package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
public class C1241g extends RecyclerView.C1158a0 {

    /* renamed from: g */
    protected PointF f4329g;

    /* renamed from: h */
    private final DisplayMetrics f4330h;

    /* renamed from: i */
    private boolean f4331i;

    /* renamed from: j */
    private float f4332j;

    /* renamed from: k */
    protected int f4333k;

    /* renamed from: l */
    protected int f4334l;

    /* renamed from: v */
    private int m5636v(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: x */
    private float m5637x() {
        if (!this.f4331i) {
            this.f4332j = mo4915s(this.f4330h);
            this.f4331i = true;
        }
        return this.f4332j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4410k(int i, int i2, RecyclerView.C1162b0 b0Var, RecyclerView.C1158a0.C1159a aVar) {
        if (mo4401b() == 0) {
            mo4414o();
            return;
        }
        this.f4333k = m5636v(this.f4333k, i);
        int v = m5636v(this.f4334l, i2);
        this.f4334l = v;
        if (this.f4333k == 0 && v == 0) {
            mo4920z(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4411l() {
        this.f4334l = 0;
        this.f4333k = 0;
        this.f4329g = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4412m(View view, RecyclerView.C1162b0 b0Var, RecyclerView.C1158a0.C1159a aVar) {
        int q = mo4913q(view, mo4918w());
        int r = mo4914r(view, mo4919y());
        if (mo4916t((int) Math.sqrt((double) ((q * q) + (r * r)))) > 0) {
            throw null;
        }
    }

    /* renamed from: p */
    public int mo4912p(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: q */
    public int mo4913q(View view, int i) {
        RecyclerView.C1183p d = mo4403d();
        if (d == null || !d.mo4198k()) {
            return 0;
        }
        RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
        return mo4912p(d.mo4572Q(view) - qVar.leftMargin, d.mo4575T(view) + qVar.rightMargin, d.mo4592d0(), d.mo4614n0() - d.mo4595e0(), i);
    }

    /* renamed from: r */
    public int mo4914r(View view, int i) {
        RecyclerView.C1183p d = mo4403d();
        if (d == null || !d.mo4199l()) {
            return 0;
        }
        RecyclerView.C1188q qVar = (RecyclerView.C1188q) view.getLayoutParams();
        return mo4912p(d.mo4576U(view) - qVar.topMargin, d.mo4569O(view) + qVar.bottomMargin, d.mo4597f0(), d.mo4579W() - d.mo4590c0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public float mo4915s(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo4916t(int i) {
        return (int) Math.ceil(((double) mo4917u(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo4917u(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m5637x()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo4918w() {
        PointF pointF = this.f4329g;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo4919y() {
        PointF pointF = this.f4329g;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo4920z(RecyclerView.C1158a0.C1159a aVar) {
        PointF a = mo4400a(mo4404e());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            mo4404e();
            throw null;
        }
        mo4407h(a);
        this.f4329g = a;
        this.f4333k = (int) (a.x * 10000.0f);
        this.f4334l = (int) (a.y * 10000.0f);
        mo4917u(10000);
        throw null;
    }
}
