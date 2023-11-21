package p072l2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import p018c2.C1352h;
import p018c2.C1355k;
import p055i3.C1649c;
import p066k2.C1784f;
import p066k2.C1786h;

/* renamed from: l2.b */
public class C1873b {
    /* renamed from: b */
    public static C1784f m7790b(Context context, int i, int i2) {
        C1784f fVar = new C1784f(context, i, i2);
        fVar.mo6206n();
        return fVar;
    }

    /* renamed from: c */
    public static C1786h m7791c(Context context) {
        C1786h hVar = new C1786h(context);
        hVar.mo6217e();
        return hVar;
    }

    /* renamed from: d */
    public static View m7792d(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(C1352h.f4720h0);
        frameLayout.setVisibility(8);
        frameLayout.setContentDescription(context.getResources().getString(C1355k.f4786c));
        frameLayout.setClipChildren(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        appCompatImageView.post(new C1872a(appCompatImageView, context));
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2));
        if (viewGroup != null) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m7793e(AppCompatImageView appCompatImageView, Context context) {
        appCompatImageView.setImageDrawable(C1649c.m6963h(context, 16843531));
        Folme.useAt(appCompatImageView).hover().setFeedbackRadius(60.0f);
        Folme.useAt(appCompatImageView).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf((View) appCompatImageView.getParent(), new AnimConfig[0]);
    }
}
