package p123u3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0122b;
import androidx.preference.C1116d;
import miuix.appcompat.app.C2112p;

/* renamed from: u3.f */
public class C2838f extends C1116d {

    /* renamed from: H0 */
    private C2840g f10632H0;

    /* renamed from: I0 */
    private C2835d f10633I0;

    /* renamed from: u3.f$a */
    class C2839a implements C2835d {
        C2839a() {
        }

        /* renamed from: a */
        public void mo10098a(C2112p.C2114b bVar) {
            C2838f.this.mo10104t2(bVar);
        }

        /* renamed from: b */
        public View mo10099b(Context context) {
            return C2838f.this.mo4059j2(context);
        }

        /* renamed from: c */
        public boolean mo10100c() {
            return false;
        }

        /* renamed from: d */
        public void mo10101d(View view) {
            C2838f.this.mo4050i2(view);
        }
    }

    public C2838f() {
        C2839a aVar = new C2839a();
        this.f10633I0 = aVar;
        this.f10632H0 = new C2840g(aVar, this);
    }

    /* renamed from: s2 */
    public static C2838f m11747s2(String str) {
        C2838f fVar = new C2838f();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        fVar.mo3220J1(bundle);
        return fVar;
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        return this.f10632H0.mo10105a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public final void mo4055l2(C0122b.C0123a aVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo10104t2(C2112p.C2114b bVar) {
        super.mo4055l2(new C2831a(mo3199B(), bVar));
    }
}
