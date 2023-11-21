package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import p018c2.C1354j;
import p078m2.C1918a;

/* renamed from: miuix.appcompat.internal.app.widget.u */
public class C2212u extends ScrollingTabContainerView {
    public C2212u(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    /* access modifiers changed from: package-private */
    public int getDefaultTabTextStyle() {
        return 16843509;
    }

    /* access modifiers changed from: package-private */
    public int getTabBarLayoutRes() {
        return C1354j.f4765h;
    }

    /* access modifiers changed from: package-private */
    public int getTabContainerHeight() {
        return C1918a.m7836b(getContext()).mo6468e();
    }

    /* access modifiers changed from: package-private */
    public int getTabViewLayoutRes() {
        return C1354j.f4763f;
    }

    /* access modifiers changed from: package-private */
    public int getTabViewMarginHorizontal() {
        return 0;
    }

    /* renamed from: j */
    public View mo8031j(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        ViewParent parent = view.getParent();
        if (parent != this) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable((Drawable) null);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f8123i.getMeasuredHeight();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        this.f8123i.layout(i, i5, this.f8123i.getMeasuredWidth(), measuredHeight2 + i5);
    }
}
