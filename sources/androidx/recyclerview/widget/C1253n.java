package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
class C1253n {
    /* renamed from: a */
    static int m5738a(RecyclerView.C1162b0 b0Var, C1244i iVar, View view, View view2, RecyclerView.C1183p pVar, boolean z) {
        if (pVar.mo4563J() == 0 || b0Var.mo4417b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.mo4599g0(view) - pVar.mo4599g0(view2)) + 1;
        }
        return Math.min(iVar.mo4934n(), iVar.mo4924d(view2) - iVar.mo4927g(view));
    }

    /* renamed from: b */
    static int m5739b(RecyclerView.C1162b0 b0Var, C1244i iVar, View view, View view2, RecyclerView.C1183p pVar, boolean z, boolean z2) {
        if (pVar.mo4563J() == 0 || b0Var.mo4417b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (b0Var.mo4417b() - Math.max(pVar.mo4599g0(view), pVar.mo4599g0(view2))) - 1) : Math.max(0, Math.min(pVar.mo4599g0(view), pVar.mo4599g0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(iVar.mo4924d(view2) - iVar.mo4927g(view))) / ((float) (Math.abs(pVar.mo4599g0(view) - pVar.mo4599g0(view2)) + 1)))) + ((float) (iVar.mo4933m() - iVar.mo4927g(view))));
    }

    /* renamed from: c */
    static int m5740c(RecyclerView.C1162b0 b0Var, C1244i iVar, View view, View view2, RecyclerView.C1183p pVar, boolean z) {
        if (pVar.mo4563J() == 0 || b0Var.mo4417b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.mo4417b();
        }
        return (int) ((((float) (iVar.mo4924d(view2) - iVar.mo4927g(view))) / ((float) (Math.abs(pVar.mo4599g0(view) - pVar.mo4599g0(view2)) + 1))) * ((float) b0Var.mo4417b()));
    }
}
