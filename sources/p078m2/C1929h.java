package p078m2;

import android.content.Context;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.app.widget.C2211t;
import miuix.appcompat.internal.app.widget.SearchActionModeView;
import miuix.view.C2407k;

/* renamed from: m2.h */
public class C1929h extends C1919b implements C2407k {
    public C1929h(Context context, ActionMode.Callback callback) {
        super(context, callback);
    }

    /* renamed from: a */
    public void mo6518a(C2407k.C2408a aVar) {
        ((SearchActionModeView) this.f7294e.get()).setAnimatedViewListener(aVar);
    }

    public View getCustomView() {
        return ((SearchActionModeView) this.f7294e.get()).getCustomView();
    }

    /* renamed from: i */
    public void mo6519i(Rect rect) {
        WeakReference<C2211t> weakReference = this.f7294e;
        SearchActionModeView searchActionModeView = weakReference != null ? (SearchActionModeView) weakReference.get() : null;
        if (searchActionModeView != null) {
            searchActionModeView.mo8066K(rect);
        }
    }

    public void setCustomView(View view) {
        ((SearchActionModeView) this.f7294e.get()).setCustomView(view);
    }
}
