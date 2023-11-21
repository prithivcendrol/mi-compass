package androidx.activity.result;

import androidx.activity.result.C0102d;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import p015c.C1320a;

class ActivityResultRegistry$1 implements C1046k {

    /* renamed from: d */
    final /* synthetic */ String f234d;

    /* renamed from: e */
    final /* synthetic */ C0100b f235e;

    /* renamed from: f */
    final /* synthetic */ C1320a f236f;

    /* renamed from: g */
    final /* synthetic */ C0102d f237g;

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        if (C1035g.C1037b.ON_START.equals(bVar)) {
            this.f237g.f245f.put(this.f234d, new C0102d.C0104b(this.f235e, this.f236f));
            if (this.f237g.f246g.containsKey(this.f234d)) {
                Object obj = this.f237g.f246g.get(this.f234d);
                this.f237g.f246g.remove(this.f234d);
                this.f235e.mo329a(obj);
            }
            C0098a aVar = (C0098a) this.f237g.f247h.getParcelable(this.f234d);
            if (aVar != null) {
                this.f237g.f247h.remove(this.f234d);
                this.f235e.mo329a(this.f236f.mo3418a(aVar.mo321b(), aVar.mo320a()));
            }
        } else if (C1035g.C1037b.ON_STOP.equals(bVar)) {
            this.f237g.f245f.remove(this.f234d);
        } else if (C1035g.C1037b.ON_DESTROY.equals(bVar)) {
            this.f237g.mo335i(this.f234d);
        }
    }
}
