package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.widget.C0388s0;
import androidx.appcompat.widget.C0391t0;
import androidx.core.view.C0681e;
import androidx.core.view.C0727l0;
import java.util.ArrayList;
import java.util.List;
import p021d.C1450d;
import p021d.C1453g;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0205d extends C0226k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: E */
    private static final int f698E = C1453g.f5816e;

    /* renamed from: A */
    private C0230m.C0231a f699A;

    /* renamed from: B */
    ViewTreeObserver f700B;

    /* renamed from: C */
    private PopupWindow.OnDismissListener f701C;

    /* renamed from: D */
    boolean f702D;

    /* renamed from: e */
    private final Context f703e;

    /* renamed from: f */
    private final int f704f;

    /* renamed from: g */
    private final int f705g;

    /* renamed from: h */
    private final int f706h;

    /* renamed from: i */
    private final boolean f707i;

    /* renamed from: j */
    final Handler f708j;

    /* renamed from: k */
    private final List<C0214g> f709k = new ArrayList();

    /* renamed from: l */
    final List<C0210d> f710l = new ArrayList();

    /* renamed from: m */
    final ViewTreeObserver.OnGlobalLayoutListener f711m = new C0206a();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f712n = new C0207b();

    /* renamed from: o */
    private final C0388s0 f713o = new C0208c();

    /* renamed from: p */
    private int f714p = 0;

    /* renamed from: q */
    private int f715q = 0;

    /* renamed from: r */
    private View f716r;

    /* renamed from: s */
    View f717s;

    /* renamed from: t */
    private int f718t;

    /* renamed from: u */
    private boolean f719u;

    /* renamed from: v */
    private boolean f720v;

    /* renamed from: w */
    private int f721w;

    /* renamed from: x */
    private int f722x;

    /* renamed from: y */
    private boolean f723y;

    /* renamed from: z */
    private boolean f724z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0206a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0206a() {
        }

        public void onGlobalLayout() {
            if (C0205d.this.isShowing() && C0205d.this.f710l.size() > 0 && !C0205d.this.f710l.get(0).f732a.mo2116u()) {
                View view = C0205d.this.f717s;
                if (view == null || !view.isShown()) {
                    C0205d.this.dismiss();
                    return;
                }
                for (C0210d dVar : C0205d.this.f710l) {
                    dVar.f732a.mo822j();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0207b implements View.OnAttachStateChangeListener {
        C0207b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0205d.this.f700B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0205d.this.f700B = view.getViewTreeObserver();
                }
                C0205d dVar = C0205d.this;
                dVar.f700B.removeGlobalOnLayoutListener(dVar.f711m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0208c implements C0388s0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0209a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C0210d f728d;

            /* renamed from: e */
            final /* synthetic */ MenuItem f729e;

            /* renamed from: f */
            final /* synthetic */ C0214g f730f;

            C0209a(C0210d dVar, MenuItem menuItem, C0214g gVar) {
                this.f728d = dVar;
                this.f729e = menuItem;
                this.f730f = gVar;
            }

            public void run() {
                C0210d dVar = this.f728d;
                if (dVar != null) {
                    C0205d.this.f702D = true;
                    dVar.f733b.mo902e(false);
                    C0205d.this.f702D = false;
                }
                if (this.f729e.isEnabled() && this.f729e.hasSubMenu()) {
                    this.f730f.mo870L(this.f729e, 4);
                }
            }
        }

        C0208c() {
        }

        /* renamed from: a */
        public void mo837a(C0214g gVar, MenuItem menuItem) {
            C0210d dVar = null;
            C0205d.this.f708j.removeCallbacksAndMessages((Object) null);
            int size = C0205d.this.f710l.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0205d.this.f710l.get(i).f733b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0205d.this.f710l.size()) {
                    dVar = C0205d.this.f710l.get(i2);
                }
                C0205d.this.f708j.postAtTime(new C0209a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: k */
        public void mo838k(C0214g gVar, MenuItem menuItem) {
            C0205d.this.f708j.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0210d {

        /* renamed from: a */
        public final C0391t0 f732a;

        /* renamed from: b */
        public final C0214g f733b;

        /* renamed from: c */
        public final int f734c;

        public C0210d(C0391t0 t0Var, C0214g gVar, int i) {
            this.f732a = t0Var;
            this.f733b = gVar;
            this.f734c = i;
        }

        /* renamed from: a */
        public ListView mo840a() {
            return this.f732a.mo824l();
        }
    }

    public C0205d(Context context, View view, int i, int i2, boolean z) {
        this.f703e = context;
        this.f716r = view;
        this.f705g = i;
        this.f706h = i2;
        this.f707i = z;
        this.f723y = false;
        this.f718t = m832C();
        Resources resources = context.getResources();
        this.f704f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1450d.f5713d));
        this.f708j = new Handler();
    }

    /* renamed from: A */
    private MenuItem m830A(C0214g gVar, C0214g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: B */
    private View m831B(C0210d dVar, C0214g gVar) {
        int i;
        C0213f fVar;
        int firstVisiblePosition;
        MenuItem A = m830A(dVar.f733b, gVar);
        if (A == null) {
            return null;
        }
        ListView a = dVar.mo840a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0213f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0213f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (A == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: C */
    private int m832C() {
        return C0727l0.m2916u(this.f716r) == 1 ? 0 : 1;
    }

    /* renamed from: D */
    private int m833D(int i) {
        List<C0210d> list = this.f710l;
        ListView a = list.get(list.size() - 1).mo840a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f717s.getWindowVisibleDisplayFrame(rect);
        return this.f718t == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: E */
    private void m834E(C0214g gVar) {
        View view;
        C0210d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f703e);
        C0213f fVar = new C0213f(gVar, from, this.f707i, f698E);
        if (!isShowing() && this.f723y) {
            fVar.mo854d(true);
        } else if (isShowing()) {
            fVar.mo854d(C0226k.m974w(gVar));
        }
        int n = C0226k.m973n(fVar, (ViewGroup) null, this.f703e, this.f704f);
        C0391t0 y = m835y();
        y.mo2109i(fVar);
        y.mo2119y(n);
        y.mo2120z(this.f715q);
        if (this.f710l.size() > 0) {
            List<C0210d> list = this.f710l;
            dVar = list.get(list.size() - 1);
            view = m831B(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y.mo2189N(false);
            y.mo2186K((Object) null);
            int D = m833D(n);
            boolean z = D == 1;
            this.f718t = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y.mo2117w(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f716r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f715q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f716r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f715q & 5) != 5) {
                if (z) {
                    n = view.getWidth();
                }
                i3 = i - n;
                y.mo2106f(i3);
                y.mo2100F(true);
                y.mo2105d(i2);
            } else if (!z) {
                n = view.getWidth();
                i3 = i - n;
                y.mo2106f(i3);
                y.mo2100F(true);
                y.mo2105d(i2);
            }
            i3 = i + n;
            y.mo2106f(i3);
            y.mo2100F(true);
            y.mo2105d(i2);
        } else {
            if (this.f719u) {
                y.mo2106f(this.f721w);
            }
            if (this.f720v) {
                y.mo2105d(this.f722x);
            }
            y.mo2095A(mo1066m());
        }
        this.f710l.add(new C0210d(y, gVar, this.f718t));
        y.mo822j();
        ListView l = y.mo824l();
        l.setOnKeyListener(this);
        if (dVar == null && this.f724z && gVar.mo931x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1453g.f5823l, l, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo931x());
            l.addHeaderView(frameLayout, (Object) null, false);
            y.mo822j();
        }
    }

    /* renamed from: y */
    private C0391t0 m835y() {
        C0391t0 t0Var = new C0391t0(this.f703e, (AttributeSet) null, this.f705g, this.f706h);
        t0Var.mo2188M(this.f713o);
        t0Var.mo2099E(this);
        t0Var.mo2098D(this);
        t0Var.mo2117w(this.f716r);
        t0Var.mo2120z(this.f715q);
        t0Var.mo2097C(true);
        t0Var.mo2096B(2);
        return t0Var;
    }

    /* renamed from: z */
    private int m836z(C0214g gVar) {
        int size = this.f710l.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f710l.get(i).f733b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo797a(C0214g gVar, boolean z) {
        int z2 = m836z(gVar);
        if (z2 >= 0) {
            int i = z2 + 1;
            if (i < this.f710l.size()) {
                this.f710l.get(i).f733b.mo902e(false);
            }
            C0210d remove = this.f710l.remove(z2);
            remove.f733b.mo872O(this);
            if (this.f702D) {
                remove.f732a.mo2187L((Object) null);
                remove.f732a.mo2118x(0);
            }
            remove.f732a.dismiss();
            int size = this.f710l.size();
            this.f718t = size > 0 ? this.f710l.get(size - 1).f734c : m832C();
            if (size == 0) {
                dismiss();
                C0230m.C0231a aVar = this.f699A;
                if (aVar != null) {
                    aVar.mo527a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f700B;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f700B.removeGlobalOnLayoutListener(this.f711m);
                    }
                    this.f700B = null;
                }
                this.f717s.removeOnAttachStateChangeListener(this.f712n);
                this.f701C.onDismiss();
            } else if (z) {
                this.f710l.get(0).f733b.mo902e(false);
            }
        }
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        for (C0210d a : this.f710l) {
            C0226k.m975x(a.mo840a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public boolean mo818c() {
        return false;
    }

    public void dismiss() {
        int size = this.f710l.size();
        if (size > 0) {
            C0210d[] dVarArr = (C0210d[]) this.f710l.toArray(new C0210d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0210d dVar = dVarArr[i];
                if (dVar.f732a.isShowing()) {
                    dVar.f732a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo800e(C0239r rVar) {
        for (C0210d next : this.f710l) {
            if (rVar == next.f733b) {
                next.mo840a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo820i(rVar);
        C0230m.C0231a aVar = this.f699A;
        if (aVar != null) {
            aVar.mo528b(rVar);
        }
        return true;
    }

    /* renamed from: h */
    public void mo803h(C0230m.C0231a aVar) {
        this.f699A = aVar;
    }

    /* renamed from: i */
    public void mo820i(C0214g gVar) {
        gVar.mo895c(this, this.f703e);
        if (isShowing()) {
            m834E(gVar);
        } else {
            this.f709k.add(gVar);
        }
    }

    public boolean isShowing() {
        return this.f710l.size() > 0 && this.f710l.get(0).f732a.isShowing();
    }

    /* renamed from: j */
    public void mo822j() {
        if (!isShowing()) {
            for (C0214g E : this.f709k) {
                m834E(E);
            }
            this.f709k.clear();
            View view = this.f716r;
            this.f717s = view;
            if (view != null) {
                boolean z = this.f700B == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f700B = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f711m);
                }
                this.f717s.addOnAttachStateChangeListener(this.f712n);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo823k() {
        return false;
    }

    /* renamed from: l */
    public ListView mo824l() {
        if (this.f710l.isEmpty()) {
            return null;
        }
        List<C0210d> list = this.f710l;
        return list.get(list.size() - 1).mo840a();
    }

    /* renamed from: o */
    public void mo825o(View view) {
        if (this.f716r != view) {
            this.f716r = view;
            this.f715q = C0681e.m2704a(this.f714p, C0727l0.m2916u(view));
        }
    }

    public void onDismiss() {
        C0210d dVar;
        int size = this.f710l.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f710l.get(i);
            if (!dVar.f732a.isShowing()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f733b.mo902e(false);
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
        this.f723y = z;
    }

    /* renamed from: r */
    public void mo829r(int i) {
        if (this.f714p != i) {
            this.f714p = i;
            this.f715q = C0681e.m2704a(i, C0727l0.m2916u(this.f716r));
        }
    }

    /* renamed from: s */
    public void mo830s(int i) {
        this.f719u = true;
        this.f721w = i;
    }

    /* renamed from: t */
    public void mo831t(PopupWindow.OnDismissListener onDismissListener) {
        this.f701C = onDismissListener;
    }

    /* renamed from: u */
    public void mo832u(boolean z) {
        this.f724z = z;
    }

    /* renamed from: v */
    public void mo833v(int i) {
        this.f720v = true;
        this.f722x = i;
    }
}
