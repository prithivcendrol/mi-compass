package miuix.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import p055i3.C1649c;
import p117t2.C2697e;

/* renamed from: miuix.view.j */
public class C2405j implements C2397b {

    /* renamed from: d */
    private final Context f9388d;

    /* renamed from: e */
    private final View f9389e;

    /* renamed from: f */
    private final boolean f9390f;

    /* renamed from: g */
    private final C2406a f9391g;

    /* renamed from: h */
    private boolean f9392h = false;

    /* renamed from: i */
    private boolean f9393i = false;

    /* renamed from: j */
    private boolean f9394j = false;

    /* renamed from: k */
    private int[] f9395k = null;

    /* renamed from: l */
    private int[] f9396l = null;

    /* renamed from: m */
    private int f9397m = 0;

    /* renamed from: miuix.view.j$a */
    public interface C2406a {
        /* renamed from: a */
        void mo7703a(C2405j jVar);

        /* renamed from: b */
        void mo7704b(boolean z);

        /* renamed from: c */
        void mo7705c(boolean z);
    }

    public C2405j(Context context, View view, boolean z, C2406a aVar) {
        this.f9388d = context;
        this.f9389e = view;
        this.f9390f = z;
        this.f9391g = aVar;
    }

    /* renamed from: a */
    public static int[] m10249a(Context context, Drawable drawable, int[] iArr) {
        int i = 0;
        int[] iArr2 = {iArr[0], iArr[1]};
        if (drawable != null && (drawable instanceof ColorDrawable)) {
            ColorDrawable colorDrawable = (ColorDrawable) drawable;
            if (colorDrawable.getColor() == 0) {
                Drawable h = C1649c.m6963h(context, 16842836);
                if (h instanceof ColorDrawable) {
                    i = ((ColorDrawable) h).getColor();
                }
            } else {
                i = colorDrawable.getColor();
            }
            iArr2[1] = (16777215 & i) | (-16777216 & iArr[1]);
        }
        return iArr2;
    }

    /* renamed from: b */
    public void mo7648b(boolean z) {
        if (this.f9392h && this.f9393i && this.f9394j != z) {
            this.f9394j = z;
            int i = 0;
            if (z) {
                if (this.f9395k == null) {
                    this.f9391g.mo7703a(this);
                }
                this.f9391g.mo7705c(true);
                C2697e.m11270g(this.f9389e, this.f9397m, this.f9390f);
                while (true) {
                    int[] iArr = this.f9395k;
                    if (i < iArr.length) {
                        C2697e.m11264a(this.f9389e, iArr[i], this.f9396l[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                C2697e.m11266c(this.f9389e);
                C2697e.m11265b(this.f9389e);
                this.f9391g.mo7705c(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo9303c() {
        return this.f9394j;
    }

    /* renamed from: d */
    public boolean mo9304d() {
        return this.f9393i;
    }

    /* renamed from: e */
    public boolean mo9305e() {
        return this.f9392h;
    }

    /* renamed from: f */
    public void mo9306f() {
        mo9308h();
    }

    /* renamed from: g */
    public void mo9307g() {
        float f;
        if (this.f9394j) {
            if (this.f9395k == null) {
                C2697e.m11266c(this.f9389e);
                C2697e.m11265b(this.f9389e);
                this.f9391g.mo7703a(this);
            }
            try {
                f = this.f9389e.getContext().getResources().getDisplayMetrics().density;
            } catch (Exception unused) {
                f = 2.75f;
            }
            this.f9391g.mo7705c(true);
            C2697e.m11270g(this.f9389e, (int) (((float) this.f9397m) * f), this.f9390f);
            int i = 0;
            while (true) {
                int[] iArr = this.f9395k;
                if (i < iArr.length) {
                    C2697e.m11264a(this.f9389e, iArr[i], this.f9396l[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo9308h() {
        this.f9395k = null;
        this.f9396l = null;
        this.f9397m = 0;
    }

    /* renamed from: i */
    public void mo9309i(int[] iArr, int[] iArr2, int i) {
        this.f9395k = iArr;
        this.f9396l = iArr2;
        this.f9397m = i;
    }

    /* renamed from: j */
    public void mo9310j(boolean z) {
        if (this.f9392h && this.f9393i != z) {
            this.f9393i = z;
            this.f9391g.mo7704b(z);
            if (!z) {
                mo7648b(false);
            }
        }
    }

    /* renamed from: k */
    public void mo9311k(boolean z) {
        this.f9392h = z;
    }
}
