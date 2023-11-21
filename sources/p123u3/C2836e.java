package p123u3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0122b;
import androidx.preference.C1114c;
import miuix.appcompat.app.C2112p;

/* renamed from: u3.e */
public class C2836e extends C1114c {

    /* renamed from: G0 */
    private C2840g f10629G0;

    /* renamed from: H0 */
    private C2835d f10630H0;

    /* renamed from: u3.e$a */
    class C2837a implements C2835d {
        C2837a() {
        }

        /* renamed from: a */
        public void mo10098a(C2112p.C2114b bVar) {
            C2836e.this.mo10103t2(bVar);
        }

        /* renamed from: b */
        public View mo10099b(Context context) {
            return C2836e.this.mo4059j2(context);
        }

        /* renamed from: c */
        public boolean mo10100c() {
            return false;
        }

        /* renamed from: d */
        public void mo10101d(View view) {
            C2836e.this.mo4050i2(view);
        }
    }

    public C2836e() {
        C2837a aVar = new C2837a();
        this.f10630H0 = aVar;
        this.f10629G0 = new C2840g(aVar, this);
    }

    /* renamed from: s2 */
    public static C2836e m11737s2(String str) {
        C2836e eVar = new C2836e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.mo3220J1(bundle);
        return eVar;
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        return this.f10629G0.mo10105a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public final void mo4055l2(C0122b.C0123a aVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo10103t2(C2112p.C2114b bVar) {
        super.mo4055l2(new C2831a(mo3199B(), bVar));
    }
}
