package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C0624a;
import androidx.core.view.accessibility.C0637g;
import androidx.recyclerview.widget.C1247j;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* renamed from: androidx.preference.l */
public class C1139l extends C1247j {

    /* renamed from: f */
    final RecyclerView f3721f;

    /* renamed from: g */
    final C0624a f3722g = super.mo4129n();

    /* renamed from: h */
    final C0624a f3723h = new C1140a();

    /* renamed from: androidx.preference.l$a */
    class C1140a extends C0624a {
        C1140a() {
        }

        /* renamed from: g */
        public void mo2714g(View view, C0637g gVar) {
            Preference C;
            C1139l.this.f3722g.mo2714g(view, gVar);
            int c0 = C1139l.this.f3721f.mo4272c0(view);
            RecyclerView.C1171h adapter = C1139l.this.f3721f.getAdapter();
            if ((adapter instanceof C1129i) && (C = ((C1129i) adapter).mo4089C(c0)) != null) {
                C.mo3934X(gVar);
            }
        }

        /* renamed from: j */
        public boolean mo2717j(View view, int i, Bundle bundle) {
            return C1139l.this.f3722g.mo2717j(view, i, bundle);
        }
    }

    public C1139l(RecyclerView recyclerView) {
        super(recyclerView);
        this.f3721f = recyclerView;
    }

    /* renamed from: n */
    public C0624a mo4129n() {
        return this.f3723h;
    }
}
