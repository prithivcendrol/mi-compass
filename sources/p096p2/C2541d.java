package p096p2;

import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2250g;

/* renamed from: p2.d */
public class C2541d implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    private C2242c f10011d;

    /* renamed from: e */
    private C2250g.C2251a f10012e;

    /* renamed from: f */
    private C2540c f10013f;

    /* renamed from: g */
    private View f10014g;

    /* renamed from: h */
    private ViewGroup f10015h;

    /* renamed from: i */
    private float[] f10016i = new float[2];

    public C2541d(C2242c cVar) {
        this.f10011d = cVar;
    }

    /* renamed from: a */
    public void mo9732a() {
        C2540c cVar = this.f10013f;
        if (cVar != null) {
            cVar.dismiss();
            this.f10013f = null;
        }
    }

    /* renamed from: b */
    public C2542e mo9733b() {
        C2540c cVar = this.f10013f;
        if (cVar instanceof C2542e) {
            return (C2542e) cVar;
        }
        return null;
    }

    /* renamed from: c */
    public void mo9734c() {
        C2540c cVar = this.f10013f;
        if (cVar != null) {
            View view = this.f10014g;
            ViewGroup viewGroup = this.f10015h;
            float[] fArr = this.f10016i;
            cVar.mo9730j(view, viewGroup, fArr[0], fArr[1]);
        }
    }

    /* renamed from: d */
    public void mo9735d(C2250g.C2251a aVar) {
        this.f10012e = aVar;
    }

    /* renamed from: e */
    public void mo9736e(IBinder iBinder, View view, float f, float f2) {
        this.f10013f = new C2542e(this.f10011d.mo8398s(), this.f10011d, this);
        this.f10014g = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f10015h = viewGroup;
        float[] fArr = this.f10016i;
        fArr[0] = f;
        fArr[1] = f2;
        this.f10013f.mo9731k(this.f10014g, viewGroup, f, f2);
    }

    public void onDismiss() {
        C2250g.C2251a aVar = this.f10012e;
        if (aVar != null) {
            aVar.mo7408d(this.f10011d, true);
        }
        this.f10011d.mo8378d();
    }
}
