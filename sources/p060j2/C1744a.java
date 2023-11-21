package p060j2;

import android.view.View;

/* renamed from: j2.a */
public class C1744a {

    /* renamed from: a */
    private final View f6723a;

    /* renamed from: b */
    private int f6724b;

    /* renamed from: c */
    private boolean f6725c;

    /* renamed from: d */
    private float f6726d;

    /* renamed from: e */
    private boolean f6727e;

    public C1744a(View view) {
        this.f6723a = view;
        this.f6724b = view.getVisibility();
        this.f6726d = view.getAlpha();
    }

    /* renamed from: a */
    public void mo5998a(boolean z, float f) {
        View view;
        this.f6727e = z;
        if (z) {
            view = this.f6723a;
        } else {
            view = this.f6723a;
            f = this.f6726d;
        }
        view.setAlpha(f);
    }

    /* renamed from: b */
    public void mo5999b(boolean z, int i) {
        View view;
        this.f6725c = z;
        if (z) {
            view = this.f6723a;
        } else {
            view = this.f6723a;
            i = this.f6724b;
        }
        view.setVisibility(i);
    }
}
