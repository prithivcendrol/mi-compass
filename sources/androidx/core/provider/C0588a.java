package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0596f;
import androidx.core.provider.C0602g;

/* renamed from: androidx.core.provider.a */
class C0588a {

    /* renamed from: a */
    private final C0602g.C0605c f2600a;

    /* renamed from: b */
    private final Handler f2601b;

    /* renamed from: androidx.core.provider.a$a */
    class C0589a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0602g.C0605c f2602d;

        /* renamed from: e */
        final /* synthetic */ Typeface f2603e;

        C0589a(C0602g.C0605c cVar, Typeface typeface) {
            this.f2602d = cVar;
            this.f2603e = typeface;
        }

        public void run() {
            this.f2602d.mo2609b(this.f2603e);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    class C0590b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0602g.C0605c f2605d;

        /* renamed from: e */
        final /* synthetic */ int f2606e;

        C0590b(C0602g.C0605c cVar, int i) {
            this.f2605d = cVar;
            this.f2606e = i;
        }

        public void run() {
            this.f2605d.mo2608a(this.f2606e);
        }
    }

    C0588a(C0602g.C0605c cVar, Handler handler) {
        this.f2600a = cVar;
        this.f2601b = handler;
    }

    /* renamed from: a */
    private void m2416a(int i) {
        this.f2601b.post(new C0590b(this.f2600a, i));
    }

    /* renamed from: c */
    private void m2417c(Typeface typeface) {
        this.f2601b.post(new C0589a(this.f2600a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2654b(C0596f.C0601e eVar) {
        if (eVar.mo2671a()) {
            m2417c(eVar.f2629a);
        } else {
            m2416a(eVar.f2630b);
        }
    }
}
