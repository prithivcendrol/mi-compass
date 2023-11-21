package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import miuix.appcompat.internal.view.menu.C2242c;

public final class ExpandedMenuView extends ListView implements C2242c.C2245c, C2252h, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private C2242c f8350d;

    /* renamed from: e */
    private int f8351e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
    }

    /* renamed from: a */
    public boolean mo8193a() {
        return false;
    }

    /* renamed from: c */
    public void mo8194c(C2242c cVar) {
        this.f8350d = cVar;
    }

    /* renamed from: d */
    public boolean mo8195d(int i) {
        return false;
    }

    /* renamed from: e */
    public boolean mo8196e(C2247e eVar, int i) {
        return this.f8350d.mo8346I(eVar, i);
    }

    public int getWindowAnimations() {
        return this.f8351e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo8196e((C2247e) getAdapter().getItem(i), 0);
    }
}
