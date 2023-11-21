package p078m2;

import android.content.Context;
import android.view.ActionMode;
import android.view.View;
import miuix.appcompat.internal.app.widget.ActionBarContextView;

/* renamed from: m2.d */
public class C1924d extends C1919b {
    public C1924d(Context context, ActionMode.Callback callback) {
        super(context, callback);
    }

    public CharSequence getTitle() {
        return ((ActionBarContextView) this.f7294e.get()).getTitle();
    }

    public void setCustomView(View view) {
    }

    public void setSubtitle(int i) {
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(int i) {
        setTitle((CharSequence) this.f7293d.getResources().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        ((ActionBarContextView) this.f7294e.get()).setTitle(charSequence);
    }
}
