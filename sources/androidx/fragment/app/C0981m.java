package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0689f2;
import androidx.core.view.C0727l0;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0010c;
import p083n1.C2422g;

/* renamed from: androidx.fragment.app.m */
public final class C0981m extends FrameLayout {

    /* renamed from: d */
    private final List<View> f3351d = new ArrayList();

    /* renamed from: e */
    private final List<View> f3352e = new ArrayList();

    /* renamed from: f */
    private View.OnApplyWindowInsetsListener f3353f;

    /* renamed from: g */
    private boolean f3354g = true;

    /* renamed from: androidx.fragment.app.m$a */
    public static final class C0982a {

        /* renamed from: a */
        public static final C0982a f3355a = new C0982a();

        private C0982a() {
        }

        /* renamed from: a */
        public final WindowInsets mo3677a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C2422g.m10285e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C2422g.m10285e(view, "v");
            C2422g.m10285e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C2422g.m10284d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0981m(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        C2422g.m10285e(context, "context");
        C2422g.m10285e(attributeSet, "attrs");
        C2422g.m10285e(fragmentManager, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C0010c.f21e;
        C2422g.m10284d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C0010c.f22f) : classAttribute;
        String string = obtainStyledAttributes.getString(C0010c.f23g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h0 = fragmentManager.mo3378h0(id);
        if (classAttribute != null && h0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.mo3397s0().mo3412a(context.getClassLoader(), classAttribute);
            C2422g.m10284d(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.mo3231N0(context, attributeSet, (Bundle) null);
            fragmentManager.mo3392o().mo3565q(true).mo3558c(this, a, string).mo3432j();
        }
        fragmentManager.mo3365W0(this);
    }

    /* renamed from: a */
    private final void m4074a(View view) {
        if (this.f3352e.contains(view)) {
            this.f3351d.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C2422g.m10285e(view, "child");
        if (FragmentManager.m3650B0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0689f2 f2Var;
        C2422g.m10285e(windowInsets, "insets");
        C0689f2 u = C0689f2.m2721u(windowInsets);
        C2422g.m10284d(u, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3353f;
        if (onApplyWindowInsetsListener != null) {
            C0982a aVar = C0982a.f3355a;
            C2422g.m10282b(onApplyWindowInsetsListener);
            f2Var = C0689f2.m2721u(aVar.mo3677a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            f2Var = C0727l0.m2864N(this, u);
        }
        C2422g.m10284d(f2Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!f2Var.mo2875n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0727l0.m2885e(getChildAt(i), f2Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C2422g.m10285e(canvas, "canvas");
        if (this.f3354g) {
            for (View drawChild : this.f3351d) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C2422g.m10285e(canvas, "canvas");
        C2422g.m10285e(view, "child");
        if (!this.f3354g || !(!this.f3351d.isEmpty()) || !this.f3351d.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C2422g.m10285e(view, "view");
        this.f3352e.remove(view);
        if (this.f3351d.remove(view)) {
            this.f3354g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.m3679k0(this).mo3378h0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C2422g.m10285e(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C2422g.m10284d(childAt, "view");
                m4074a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        C2422g.m10285e(view, "view");
        m4074a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C2422g.m10284d(childAt, "view");
        m4074a(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        C2422g.m10285e(view, "view");
        m4074a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C2422g.m10284d(childAt, "view");
            m4074a(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C2422g.m10284d(childAt, "view");
            m4074a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3354g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C2422g.m10285e(onApplyWindowInsetsListener, "listener");
        this.f3353f = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C2422g.m10285e(view, "view");
        if (view.getParent() == this) {
            this.f3352e.add(view);
        }
        super.startViewTransition(view);
    }
}
