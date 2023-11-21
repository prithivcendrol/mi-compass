package p123u3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0122b;
import androidx.preference.C1111a;
import miuix.appcompat.app.C2112p;

/* renamed from: u3.b */
public class C2832b extends C1111a {

    /* renamed from: H0 */
    private C2840g f10626H0;

    /* renamed from: I0 */
    private C2835d f10627I0;

    /* renamed from: u3.b$a */
    class C2833a implements C2835d {
        C2833a() {
        }

        /* renamed from: a */
        public void mo10098a(C2112p.C2114b bVar) {
            C2832b.this.mo10097w2(bVar);
        }

        /* renamed from: b */
        public View mo10099b(Context context) {
            return C2832b.this.mo4059j2(context);
        }

        /* renamed from: c */
        public boolean mo10100c() {
            return true;
        }

        /* renamed from: d */
        public void mo10101d(View view) {
            C2832b.this.mo4050i2(view);
        }
    }

    public C2832b() {
        C2833a aVar = new C2833a();
        this.f10627I0 = aVar;
        this.f10626H0 = new C2840g(aVar, this);
    }

    /* renamed from: v2 */
    public static C2832b m11722v2(String str) {
        C2832b bVar = new C2832b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.mo3220J1(bundle);
        return bVar;
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        return this.f10626H0.mo10105a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public final void mo4055l2(C0122b.C0123a aVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo10097w2(C2112p.C2114b bVar) {
        super.mo4055l2(new C2831a(mo3199B(), bVar));
    }
}
