package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.widget.C0326g1;

public final class ExpandedMenuView extends ListView implements C0214g.C0216b, C0232n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private static final int[] f645f = {16842964, 16843049};

    /* renamed from: d */
    private C0214g f646d;

    /* renamed from: e */
    private int f647e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0326g1 u = C0326g1.m1455u(context, attributeSet, f645f, i, 0);
        if (u.mo1881r(0)) {
            setBackgroundDrawable(u.mo1869f(0));
        }
        if (u.mo1881r(1)) {
            setDivider(u.mo1869f(1));
        }
        u.mo1882v();
    }

    /* renamed from: a */
    public boolean mo723a(C0218i iVar) {
        return this.f646d.mo870L(iVar, 0);
    }

    /* renamed from: b */
    public void mo724b(C0214g gVar) {
        this.f646d = gVar;
    }

    public int getWindowAnimations() {
        return this.f647e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo723a((C0218i) getAdapter().getItem(i));
    }
}
