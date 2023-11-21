package p058j0;

import android.view.ViewGroup;

/* renamed from: j0.k */
public class C1708k {

    /* renamed from: a */
    private ViewGroup f6629a;

    /* renamed from: b */
    private Runnable f6630b;

    /* renamed from: b */
    public static C1708k m7108b(ViewGroup viewGroup) {
        return (C1708k) viewGroup.getTag(C1704i.f6626b);
    }

    /* renamed from: c */
    static void m7109c(ViewGroup viewGroup, C1708k kVar) {
        viewGroup.setTag(C1704i.f6626b, kVar);
    }

    /* renamed from: a */
    public void mo5920a() {
        Runnable runnable;
        if (m7108b(this.f6629a) == this && (runnable = this.f6630b) != null) {
            runnable.run();
        }
    }
}
