package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
class C1240f {

    /* renamed from: a */
    boolean f4320a = true;

    /* renamed from: b */
    int f4321b;

    /* renamed from: c */
    int f4322c;

    /* renamed from: d */
    int f4323d;

    /* renamed from: e */
    int f4324e;

    /* renamed from: f */
    int f4325f = 0;

    /* renamed from: g */
    int f4326g = 0;

    /* renamed from: h */
    boolean f4327h;

    /* renamed from: i */
    boolean f4328i;

    C1240f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4909a(RecyclerView.C1162b0 b0Var) {
        int i = this.f4322c;
        return i >= 0 && i < b0Var.mo4417b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4910b(RecyclerView.C1195w wVar) {
        View o = wVar.mo4690o(this.f4322c);
        this.f4322c += this.f4323d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4321b + ", mCurrentPosition=" + this.f4322c + ", mItemDirection=" + this.f4323d + ", mLayoutDirection=" + this.f4324e + ", mStartLine=" + this.f4325f + ", mEndLine=" + this.f4326g + '}';
    }
}
