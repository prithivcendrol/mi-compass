package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import p018c2.C1357m;
import p090o2.C2496c;

/* renamed from: miuix.appcompat.internal.view.menu.action.e */
class C2238e extends LinearLayout {

    /* renamed from: d */
    private C2496c f8506d;

    /* renamed from: e */
    private C2239a f8507e;

    /* renamed from: miuix.appcompat.internal.view.menu.action.e$a */
    interface C2239a {
        /* renamed from: a */
        void mo8279a();
    }

    public C2238e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4882V1, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1357m.f4890X1);
        CharSequence text = obtainStyledAttributes.getText(C1357m.f4886W1);
        String string = obtainStyledAttributes.getString(C1357m.f4894Y1);
        obtainStyledAttributes.recycle();
        C2496c cVar = new C2496c(this);
        this.f8506d = cVar;
        cVar.mo9665c(drawable);
        this.f8506d.mo9666d(text);
        this.f8506d.mo9663a(string);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }

    /* renamed from: a */
    private boolean m9402a() {
        View view = this;
        while (view != null && view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        return view == null;
    }

    /* renamed from: b */
    public void mo8324b(C2239a aVar) {
        this.f8507e = aVar;
    }

    public boolean performClick() {
        if (super.performClick() || !m9402a()) {
            return true;
        }
        playSoundEffect(0);
        C2239a aVar = this.f8507e;
        if (aVar != null) {
            aVar.mo8279a();
        }
        return true;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8506d.mo9664b(z);
    }
}
