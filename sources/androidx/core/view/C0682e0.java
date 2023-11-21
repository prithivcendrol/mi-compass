package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.e0 */
public class C0682e0 {

    /* renamed from: a */
    private int f2757a;

    /* renamed from: b */
    private int f2758b;

    public C0682e0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo2857a() {
        return this.f2757a | this.f2758b;
    }

    /* renamed from: b */
    public void mo2858b(View view, View view2, int i) {
        mo2859c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo2859c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2758b = i;
        } else {
            this.f2757a = i;
        }
    }

    /* renamed from: d */
    public void mo2860d(View view, int i) {
        if (i == 1) {
            this.f2758b = 0;
        } else {
            this.f2757a = 0;
        }
    }
}
