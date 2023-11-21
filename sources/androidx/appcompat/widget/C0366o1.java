package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0727l0;
import androidx.core.view.C0783v1;

/* renamed from: androidx.appcompat.widget.o1 */
class C0366o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n */
    private static C0366o1 f1404n;

    /* renamed from: o */
    private static C0366o1 f1405o;

    /* renamed from: d */
    private final View f1406d;

    /* renamed from: e */
    private final CharSequence f1407e;

    /* renamed from: f */
    private final int f1408f;

    /* renamed from: g */
    private final Runnable f1409g = new C0357m1(this);

    /* renamed from: h */
    private final Runnable f1410h = new C0362n1(this);

    /* renamed from: i */
    private int f1411i;

    /* renamed from: j */
    private int f1412j;

    /* renamed from: k */
    private C0378p1 f1413k;

    /* renamed from: l */
    private boolean f1414l;

    /* renamed from: m */
    private boolean f1415m;

    private C0366o1(View view, CharSequence charSequence) {
        this.f1406d = view;
        this.f1407e = charSequence;
        this.f1408f = C0783v1.m3107c(ViewConfiguration.get(view.getContext()));
        m1663c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m1662b() {
        this.f1406d.removeCallbacks(this.f1409g);
    }

    /* renamed from: c */
    private void m1663c() {
        this.f1415m = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1664e() {
        mo2087i(false);
    }

    /* renamed from: f */
    private void m1665f() {
        this.f1406d.postDelayed(this.f1409g, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m1666g(C0366o1 o1Var) {
        C0366o1 o1Var2 = f1404n;
        if (o1Var2 != null) {
            o1Var2.m1662b();
        }
        f1404n = o1Var;
        if (o1Var != null) {
            o1Var.m1665f();
        }
    }

    /* renamed from: h */
    public static void m1667h(View view, CharSequence charSequence) {
        C0366o1 o1Var = f1404n;
        if (o1Var != null && o1Var.f1406d == view) {
            m1666g((C0366o1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0366o1 o1Var2 = f1405o;
            if (o1Var2 != null && o1Var2.f1406d == view) {
                o1Var2.mo2086d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0366o1(view, charSequence);
    }

    /* renamed from: j */
    private boolean m1668j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f1415m && Math.abs(x - this.f1411i) <= this.f1408f && Math.abs(y - this.f1412j) <= this.f1408f) {
            return false;
        }
        this.f1411i = x;
        this.f1412j = y;
        this.f1415m = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2086d() {
        if (f1405o == this) {
            f1405o = null;
            C0378p1 p1Var = this.f1413k;
            if (p1Var != null) {
                p1Var.mo2131c();
                this.f1413k = null;
                m1663c();
                this.f1406d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1404n == this) {
            m1666g((C0366o1) null);
        }
        this.f1406d.removeCallbacks(this.f1410h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2087i(boolean z) {
        long j;
        if (C0727l0.m2859I(this.f1406d)) {
            m1666g((C0366o1) null);
            C0366o1 o1Var = f1405o;
            if (o1Var != null) {
                o1Var.mo2086d();
            }
            f1405o = this;
            this.f1414l = z;
            C0378p1 p1Var = new C0378p1(this.f1406d.getContext());
            this.f1413k = p1Var;
            p1Var.mo2133e(this.f1406d, this.f1411i, this.f1412j, this.f1414l, this.f1407e);
            this.f1406d.addOnAttachStateChangeListener(this);
            if (this.f1414l) {
                j = 2500;
            } else {
                j = ((C0727l0.m2854D(this.f1406d) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1406d.removeCallbacks(this.f1410h);
            this.f1406d.postDelayed(this.f1410h, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1413k != null && this.f1414l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1406d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1663c();
                mo2086d();
            }
        } else if (this.f1406d.isEnabled() && this.f1413k == null && m1668j(motionEvent)) {
            m1666g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1411i = view.getWidth() / 2;
        this.f1412j = view.getHeight() / 2;
        mo2087i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2086d();
    }
}
