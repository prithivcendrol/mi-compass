package miuix.appcompat.internal.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import miuix.appcompat.app.C2112p;
import miuix.appcompat.internal.view.menu.C2250g;
import p018c2.C1354j;

/* renamed from: miuix.appcompat.internal.view.menu.d */
public class C2246d implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C2250g.C2251a {

    /* renamed from: d */
    private C2242c f8546d;

    /* renamed from: e */
    private C2112p f8547e;

    /* renamed from: f */
    C2240b f8548f;

    /* renamed from: g */
    private C2250g.C2251a f8549g;

    public C2246d(C2242c cVar) {
        this.f8546d = cVar;
    }

    /* renamed from: a */
    public void mo8412a() {
        C2112p pVar = this.f8547e;
        if (pVar != null) {
            pVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo8413b(C2250g.C2251a aVar) {
        this.f8549g = aVar;
    }

    /* renamed from: c */
    public void mo8414c(IBinder iBinder) {
        C2242c cVar = this.f8546d;
        C2112p.C2114b bVar = new C2112p.C2114b(cVar.mo8398s());
        C2240b bVar2 = new C2240b(cVar.mo8398s(), C1354j.f4781x);
        this.f8548f = bVar2;
        bVar2.mo8329k(this);
        this.f8546d.mo8374c(this.f8548f);
        bVar.mo7537b(this.f8548f.mo8327f(), this);
        View w = cVar.mo8407w();
        if (w != null) {
            bVar.mo7539d(w);
        } else {
            bVar.mo7540e(cVar.mo8405u()).mo7553r(cVar.mo8406v());
        }
        bVar.mo7544i(17039360, (DialogInterface.OnClickListener) null);
        bVar.mo7547l(this);
        C2112p a = bVar.mo7536a();
        this.f8547e = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f8547e.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f8547e.show();
    }

    /* renamed from: d */
    public void mo7408d(C2242c cVar, boolean z) {
        if (z || cVar == this.f8546d) {
            mo8412a();
        }
        C2250g.C2251a aVar = this.f8549g;
        if (aVar != null) {
            aVar.mo7408d(cVar, z);
        }
    }

    /* renamed from: e */
    public boolean mo7409e(C2242c cVar) {
        C2250g.C2251a aVar = this.f8549g;
        return aVar != null && aVar.mo7409e(cVar);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f8546d.mo8346I((C2247e) this.f8548f.mo8327f().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f8548f.mo8005d(this.f8546d, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f8547e.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f8547e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f8546d.mo8379e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f8546d.performShortcut(i, keyEvent, 0);
    }
}
