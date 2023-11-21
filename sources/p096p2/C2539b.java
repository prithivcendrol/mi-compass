package p096p2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.EventLog;
import android.view.ContextMenu;
import android.view.View;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2246d;

/* renamed from: p2.b */
public class C2539b extends C2242c implements ContextMenu {

    /* renamed from: z */
    C2541d f10010z;

    public C2539b(Context context) {
        super(context);
    }

    /* renamed from: c0 */
    public boolean mo9720c0() {
        C2541d dVar = this.f10010z;
        if (!(dVar instanceof C2541d)) {
            return false;
        }
        return dVar.mo9733b().isShowing();
    }

    public void close() {
        super.close();
        C2541d dVar = this.f10010z;
        if (dVar != null) {
            dVar.mo9732a();
            this.f10010z = null;
        }
    }

    /* renamed from: d0 */
    public void mo9721d0() {
        C2541d dVar = this.f10010z;
        if (dVar instanceof C2541d) {
            dVar.mo9734c();
        }
    }

    /* renamed from: e0 */
    public C2246d mo9722e0(View view, IBinder iBinder) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (mo8340C().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        C2246d dVar = new C2246d(this);
        dVar.mo8414c(iBinder);
        return dVar;
    }

    /* renamed from: f0 */
    public C2541d mo9723f0(View view, IBinder iBinder, float f, float f2) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (mo8340C().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        C2541d dVar = new C2541d(this);
        this.f10010z = dVar;
        dVar.mo9736e(iBinder, view, f, f2);
        return this.f10010z;
    }

    public ContextMenu setHeaderIcon(int i) {
        return (ContextMenu) super.mo8354R(i);
    }

    public ContextMenu setHeaderIcon(Drawable drawable) {
        return (ContextMenu) super.mo8355S(drawable);
    }

    public ContextMenu setHeaderTitle(int i) {
        return (ContextMenu) super.mo8356U(i);
    }

    public ContextMenu setHeaderTitle(CharSequence charSequence) {
        return (ContextMenu) super.mo8357V(charSequence);
    }

    public ContextMenu setHeaderView(View view) {
        return (ContextMenu) super.mo8358W(view);
    }
}
