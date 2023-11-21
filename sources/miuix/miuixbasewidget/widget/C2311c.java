package miuix.miuixbasewidget.widget;

import android.view.View;
import miuix.miuixbasewidget.widget.FilterSortView2;

/* renamed from: miuix.miuixbasewidget.widget.c */
public final /* synthetic */ class C2311c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FilterSortView2.TabView f8826d;

    /* renamed from: e */
    public final /* synthetic */ View.OnClickListener f8827e;

    public /* synthetic */ C2311c(FilterSortView2.TabView tabView, View.OnClickListener onClickListener) {
        this.f8826d = tabView;
        this.f8827e = onClickListener;
    }

    public final void onClick(View view) {
        this.f8826d.m9756g(this.f8827e, view);
    }
}
