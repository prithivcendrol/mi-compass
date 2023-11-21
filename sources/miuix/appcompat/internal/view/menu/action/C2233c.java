package miuix.appcompat.internal.view.menu.action;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LayoutAnimationController;
import android.widget.LinearLayout;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2252h;
import miuix.view.C2397b;

/* renamed from: miuix.appcompat.internal.view.menu.action.c */
public abstract class C2233c extends LinearLayout implements C2242c.C2245c, C2252h, C2397b {

    /* renamed from: d */
    private C2242c f8496d;

    /* renamed from: e */
    private boolean f8497e;

    /* renamed from: f */
    private C2225b f8498f;

    /* renamed from: g */
    private C2235b f8499g;

    /* renamed from: h */
    protected boolean f8500h = false;

    /* renamed from: miuix.appcompat.internal.view.menu.action.c$a */
    public static class C2234a extends LinearLayout.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f8501a;

        public C2234a(int i, int i2) {
            super(i, i2);
            this.f8501a = false;
        }

        public C2234a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2234a(C2234a aVar) {
            super(aVar);
            this.f8501a = aVar.f8501a;
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.c$b */
    class C2235b implements Animator.AnimatorListener {

        /* renamed from: d */
        Animator f8502d;

        public C2235b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f8502d = null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f8502d = animator;
        }
    }

    public C2233c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        this.f8499g = new C2235b();
        setLayoutAnimation((LayoutAnimationController) null);
    }

    /* renamed from: a */
    public boolean mo8193a() {
        return false;
    }

    /* renamed from: c */
    public void mo8194c(C2242c cVar) {
        this.f8496d = cVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C2234a);
    }

    /* renamed from: d */
    public boolean mo8195d(int i) {
        View childAt = getChildAt(i);
        childAt.clearAnimation();
        removeView(childAt);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo8196e(C2247e eVar, int i) {
        return this.f8496d.mo8346I(eVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8261f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C2234a generateDefaultLayoutParams() {
        return new C2234a(-2, -2);
    }

    public abstract int getCollapsedHeight();

    public C2225b getPresenter() {
        return this.f8498f;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public C2234a generateLayoutParams(AttributeSet attributeSet) {
        return new C2234a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C2234a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2234a ? new C2234a((C2234a) layoutParams) : generateDefaultLayoutParams();
    }

    /* renamed from: j */
    public C2234a mo8234j(View view) {
        C2234a g = generateDefaultLayoutParams();
        g.f8501a = true;
        return g;
    }

    /* renamed from: k */
    public boolean mo8263k() {
        return false;
    }

    /* renamed from: l */
    public void mo8264l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8265m() {
    }

    /* renamed from: n */
    public void mo8316n(boolean z) {
        this.f8500h = z;
        if (z) {
            mo8261f();
        } else {
            mo8265m();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2225b bVar = this.f8498f;
        if (bVar != null) {
            bVar.mo8003b(false);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8498f.mo8281O(false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public abstract /* synthetic */ void setEnableBlur(boolean z);

    public void setOverflowReserved(boolean z) {
        this.f8497e = z;
    }

    public void setPresenter(C2225b bVar) {
        this.f8498f = bVar;
    }

    public abstract /* synthetic */ void setSupportBlur(boolean z);
}
