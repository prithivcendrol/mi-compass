package p032e4;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e4.b */
public class C1546b implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    private ViewGroup.OnHierarchyChangeListener f6199a;

    public void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6199a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6199a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
