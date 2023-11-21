package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0226k implements C0235p, C0230m, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private Rect f826d;

    C0226k() {
    }

    /* renamed from: n */
    protected static int m973n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: w */
    protected static boolean m974w(C0214g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    protected static C0213f m975x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0213f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0213f) listAdapter;
    }

    /* renamed from: d */
    public void mo799d(Context context, C0214g gVar) {
    }

    /* renamed from: f */
    public boolean mo801f(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo802g(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: i */
    public abstract void mo820i(C0214g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo823k() {
        return true;
    }

    /* renamed from: m */
    public Rect mo1066m() {
        return this.f826d;
    }

    /* renamed from: o */
    public abstract void mo825o(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m975x(listAdapter).f746d.mo871M((MenuItem) listAdapter.getItem(i), this, mo823k() ? 0 : 4);
    }

    /* renamed from: p */
    public void mo1068p(Rect rect) {
        this.f826d = rect;
    }

    /* renamed from: q */
    public abstract void mo828q(boolean z);

    /* renamed from: r */
    public abstract void mo829r(int i);

    /* renamed from: s */
    public abstract void mo830s(int i);

    /* renamed from: t */
    public abstract void mo831t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo832u(boolean z);

    /* renamed from: v */
    public abstract void mo833v(int i);
}
