package miuix.miuixbasewidget.widget;

import android.view.MotionEvent;
import android.view.View;
import miuix.miuixbasewidget.widget.FilterSortView;

/* renamed from: miuix.miuixbasewidget.widget.b */
public final /* synthetic */ class C2310b implements View.OnHoverListener {

    /* renamed from: d */
    public final /* synthetic */ FilterSortView.TabView f8825d;

    public /* synthetic */ C2310b(FilterSortView.TabView tabView) {
        this.f8825d = tabView;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        return this.f8825d.m9736j(view, motionEvent);
    }
}
