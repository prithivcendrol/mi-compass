package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.widget.C0391t0;
import androidx.core.view.C0727l0;
import p021d.C1450d;
import p021d.C1453g;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0236q extends C0226k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: y */
    private static final int f841y = C1453g.f5824m;

    /* renamed from: e */
    private final Context f842e;

    /* renamed from: f */
    private final C0214g f843f;

    /* renamed from: g */
    private final C0213f f844g;

    /* renamed from: h */
    private final boolean f845h;

    /* renamed from: i */
    private final int f846i;

    /* renamed from: j */
    private final int f847j;

    /* renamed from: k */
    private final int f848k;

    /* renamed from: l */
    final C0391t0 f849l;

    /* renamed from: m */
    final ViewTreeObserver.OnGlobalLayoutListener f850m = new C0237a();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f851n = new C0238b();

    /* renamed from: o */
    private PopupWindow.OnDismissListener f852o;

    /* renamed from: p */
    private View f853p;

    /* renamed from: q */
    View f854q;

    /* renamed from: r */
    private C0230m.C0231a f855r;

    /* renamed from: s */
    ViewTreeObserver f856s;

    /* renamed from: t */
    private boolean f857t;

    /* renamed from: u */
    private boolean f858u;

    /* renamed from: v */
    private int f859v;

    /* renamed from: w */
    private int f860w = 0;

    /* renamed from: x */
    private boolean f861x;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0237a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0237a() {
        }

        public void onGlobalLayout() {
            if (C0236q.this.isShowing() && !C0236q.this.f849l.mo2116u()) {
                View view = C0236q.this.f854q;
                if (view == null || !view.isShown()) {
                    C0236q.this.dismiss();
                } else {
                    C0236q.this.f849l.mo822j();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0238b implements View.OnAttachStateChangeListener {
        C0238b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0236q.this.f856s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0236q.this.f856s = view.getViewTreeObserver();
                }
                C0236q qVar = C0236q.this;
                qVar.f856s.removeGlobalOnLayoutListener(qVar.f850m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0236q(Context context, C0214g gVar, View view, int i, int i2, boolean z) {
        this.f842e = context;
        this.f843f = gVar;
        this.f845h = z;
        this.f844g = new C0213f(gVar, LayoutInflater.from(context), z, f841y);
        this.f847j = i;
        this.f848k = i2;
        Resources resources = context.getResources();
        this.f846i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1450d.f5713d));
        this.f853p = view;
        this.f849l = new C0391t0(context, (AttributeSet) null, i, i2);
        gVar.mo895c(this, context);
    }

    /* renamed from: y */
    private boolean m1020y() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f857t || (view = this.f853p) == null) {
            return false;
        }
        this.f854q = view;
        this.f849l.mo2098D(this);
        this.f849l.mo2099E(this);
        this.f849l.mo2097C(true);
        View view2 = this.f854q;
        boolean z = this.f856s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f856s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f850m);
        }
        view2.addOnAttachStateChangeListener(this.f851n);
        this.f849l.mo2117w(view2);
        this.f849l.mo2120z(this.f860w);
        if (!this.f858u) {
            this.f859v = C0226k.m973n(this.f844g, (ViewGroup) null, this.f842e, this.f846i);
            this.f858u = true;
        }
        this.f849l.mo2119y(this.f859v);
        this.f849l.mo2096B(2);
        this.f849l.mo2095A(mo1066m());
        this.f849l.mo822j();
        ListView l = this.f849l.mo824l();
        l.setOnKeyListener(this);
        if (this.f861x && this.f843f.mo931x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f842e).inflate(C1453g.f5823l, l, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f843f.mo931x());
            }
            frameLayout.setEnabled(false);
            l.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f849l.mo2109i(this.f844g);
        this.f849l.mo822j();
        return true;
    }

    /* renamed from: a */
    public void mo797a(C0214g gVar, boolean z) {
        if (gVar == this.f843f) {
            dismiss();
            C0230m.C0231a aVar = this.f855r;
            if (aVar != null) {
                aVar.mo527a(gVar, z);
            }
        }
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        this.f858u = false;
        C0213f fVar = this.f844g;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public boolean mo818c() {
        return false;
    }

    public void dismiss() {
        if (isShowing()) {
            this.f849l.dismiss();
        }
    }

    /* renamed from: e */
    public boolean mo800e(C0239r rVar) {
        if (rVar.hasVisibleItems()) {
            C0227l lVar = new C0227l(this.f842e, rVar, this.f854q, this.f845h, this.f847j, this.f848k);
            lVar.mo1077j(this.f855r);
            lVar.mo1074g(C0226k.m974w(rVar));
            lVar.mo1076i(this.f852o);
            this.f852o = null;
            this.f843f.mo902e(false);
            int b = this.f849l.mo2104b();
            int g = this.f849l.mo2107g();
            if ((Gravity.getAbsoluteGravity(this.f860w, C0727l0.m2916u(this.f853p)) & 7) == 5) {
                b += this.f853p.getWidth();
            }
            if (lVar.mo1080n(b, g)) {
                C0230m.C0231a aVar = this.f855r;
                if (aVar == null) {
                    return true;
                }
                aVar.mo528b(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void mo803h(C0230m.C0231a aVar) {
        this.f855r = aVar;
    }

    /* renamed from: i */
    public void mo820i(C0214g gVar) {
    }

    public boolean isShowing() {
        return !this.f857t && this.f849l.isShowing();
    }

    /* renamed from: j */
    public void mo822j() {
        if (!m1020y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public ListView mo824l() {
        return this.f849l.mo824l();
    }

    /* renamed from: o */
    public void mo825o(View view) {
        this.f853p = view;
    }

    public void onDismiss() {
        this.f857t = true;
        this.f843f.close();
        ViewTreeObserver viewTreeObserver = this.f856s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f856s = this.f854q.getViewTreeObserver();
            }
            this.f856s.removeGlobalOnLayoutListener(this.f850m);
            this.f856s = null;
        }
        this.f854q.removeOnAttachStateChangeListener(this.f851n);
        PopupWindow.OnDismissListener onDismissListener = this.f852o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: q */
    public void mo828q(boolean z) {
        this.f844g.mo854d(z);
    }

    /* renamed from: r */
    public void mo829r(int i) {
        this.f860w = i;
    }

    /* renamed from: s */
    public void mo830s(int i) {
        this.f849l.mo2106f(i);
    }

    /* renamed from: t */
    public void mo831t(PopupWindow.OnDismissListener onDismissListener) {
        this.f852o = onDismissListener;
    }

    /* renamed from: u */
    public void mo832u(boolean z) {
        this.f861x = z;
    }

    /* renamed from: v */
    public void mo833v(int i) {
        this.f849l.mo2105d(i);
    }
}
