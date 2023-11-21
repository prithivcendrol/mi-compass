package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class C1254o extends RecyclerView.C1177m {

    /* renamed from: g */
    boolean f4358g = true;

    /* renamed from: A */
    public final void mo4944A(RecyclerView.C1168e0 e0Var) {
        mo4952I(e0Var);
        mo4523h(e0Var);
    }

    /* renamed from: B */
    public final void mo4945B(RecyclerView.C1168e0 e0Var) {
        mo4953J(e0Var);
    }

    /* renamed from: C */
    public final void mo4946C(RecyclerView.C1168e0 e0Var, boolean z) {
        mo4954K(e0Var, z);
        mo4523h(e0Var);
    }

    /* renamed from: D */
    public final void mo4947D(RecyclerView.C1168e0 e0Var, boolean z) {
        mo4955L(e0Var, z);
    }

    /* renamed from: E */
    public final void mo4948E(RecyclerView.C1168e0 e0Var) {
        mo4956M(e0Var);
        mo4523h(e0Var);
    }

    /* renamed from: F */
    public final void mo4949F(RecyclerView.C1168e0 e0Var) {
        mo4957N(e0Var);
    }

    /* renamed from: G */
    public final void mo4950G(RecyclerView.C1168e0 e0Var) {
        mo4958O(e0Var);
        mo4523h(e0Var);
    }

    /* renamed from: H */
    public final void mo4951H(RecyclerView.C1168e0 e0Var) {
        mo4959P(e0Var);
    }

    /* renamed from: I */
    public void mo4952I(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: J */
    public void mo4953J(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: K */
    public void mo4954K(RecyclerView.C1168e0 e0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo4955L(RecyclerView.C1168e0 e0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo4956M(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: N */
    public void mo4957N(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: O */
    public void mo4958O(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: P */
    public void mo4959P(RecyclerView.C1168e0 e0Var) {
    }

    /* renamed from: a */
    public boolean mo4517a(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f4083a) == (i2 = cVar2.f4083a) && cVar.f4084b == cVar2.f4084b)) {
            return mo4865w(e0Var);
        }
        return mo4867y(e0Var, i, cVar.f4084b, i2, cVar2.f4084b);
    }

    /* renamed from: b */
    public boolean mo4518b(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4083a;
        int i4 = cVar.f4084b;
        if (e0Var2.mo4454J()) {
            int i5 = cVar.f4083a;
            i = cVar.f4084b;
            i2 = i5;
        } else {
            i2 = cVar2.f4083a;
            i = cVar2.f4084b;
        }
        return mo4866x(e0Var, e0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo4519c(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2) {
        int i = cVar.f4083a;
        int i2 = cVar.f4084b;
        View view = e0Var.f4049a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4083a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4084b;
        if (e0Var.mo4478v() || (i == left && i2 == top)) {
            return mo4868z(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4867y(e0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo4520d(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2) {
        int i = cVar.f4083a;
        int i2 = cVar2.f4083a;
        if (i == i2 && cVar.f4084b == cVar2.f4084b) {
            mo4948E(e0Var);
            return false;
        }
        return mo4867y(e0Var, i, cVar.f4084b, i2, cVar2.f4084b);
    }

    /* renamed from: f */
    public boolean mo4521f(RecyclerView.C1168e0 e0Var) {
        return !this.f4358g || e0Var.mo4475t();
    }

    /* renamed from: w */
    public abstract boolean mo4865w(RecyclerView.C1168e0 e0Var);

    /* renamed from: x */
    public abstract boolean mo4866x(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo4867y(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo4868z(RecyclerView.C1168e0 e0Var);
}
