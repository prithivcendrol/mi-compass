package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0122b;
import androidx.appcompat.view.menu.C0230m;
import p021d.C1453g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0217h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0230m.C0231a {

    /* renamed from: d */
    private C0214g f779d;

    /* renamed from: e */
    private C0122b f780e;

    /* renamed from: f */
    C0211e f781f;

    /* renamed from: g */
    private C0230m.C0231a f782g;

    public C0217h(C0214g gVar) {
        this.f779d = gVar;
    }

    /* renamed from: a */
    public void mo527a(C0214g gVar, boolean z) {
        if (z || gVar == this.f779d) {
            mo934c();
        }
        C0230m.C0231a aVar = this.f782g;
        if (aVar != null) {
            aVar.mo527a(gVar, z);
        }
    }

    /* renamed from: b */
    public boolean mo528b(C0214g gVar) {
        C0230m.C0231a aVar = this.f782g;
        if (aVar != null) {
            return aVar.mo528b(gVar);
        }
        return false;
    }

    /* renamed from: c */
    public void mo934c() {
        C0122b bVar = this.f780e;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: d */
    public void mo935d(IBinder iBinder) {
        C0214g gVar = this.f779d;
        C0122b.C0123a aVar = new C0122b.C0123a(gVar.mo928u());
        C0211e eVar = new C0211e(aVar.mo405b(), C1453g.f5821j);
        this.f781f = eVar;
        eVar.mo803h(this);
        this.f779d.mo894b(this.f781f);
        aVar.mo406c(this.f781f.mo841i(), this);
        View y = gVar.mo932y();
        if (y != null) {
            aVar.mo407d(y);
        } else {
            aVar.mo408e(gVar.mo930w()).mo416m(gVar.mo931x());
        }
        aVar.mo412i(this);
        C0122b a = aVar.mo404a();
        this.f780e = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f780e.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f780e.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f779d.mo870L((C0218i) this.f781f.mo841i().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f781f.mo797a(this.f779d, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f780e.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f780e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f779d.mo902e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f779d.performShortcut(i, keyEvent, 0);
    }
}
