package p123u3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.C1120g;
import androidx.preference.DialogPreference;
import miuix.appcompat.app.C2112p;

/* renamed from: u3.g */
class C2840g {

    /* renamed from: a */
    private C2835d f10635a;

    /* renamed from: b */
    private C1120g f10636b;

    public C2840g(C2835d dVar, C1120g gVar) {
        this.f10635a = dVar;
        this.f10636b = gVar;
    }

    /* renamed from: b */
    private void m11755b(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    /* renamed from: a */
    public Dialog mo10105a(Bundle bundle) {
        Context B = this.f10636b.mo3199B();
        DialogPreference g2 = this.f10636b.mo4058g2();
        C2112p.C2114b bVar = new C2112p.C2114b(B);
        C2831a aVar = new C2831a(B, bVar);
        aVar.mo416m(g2.mo3867J0());
        aVar.mo408e(g2.mo3864G0());
        aVar.mo413j(g2.mo3869L0(), this.f10636b);
        aVar.mo411h(g2.mo3868K0(), this.f10636b);
        View b = this.f10635a.mo10099b(B);
        if (b != null) {
            this.f10635a.mo10101d(b);
            aVar.mo417n(b);
        } else {
            aVar.mo409f(g2.mo3866I0());
        }
        this.f10635a.mo10098a(bVar);
        C2112p a = bVar.mo7536a();
        if (this.f10635a.mo10100c()) {
            m11755b(a);
        }
        return a;
    }
}
