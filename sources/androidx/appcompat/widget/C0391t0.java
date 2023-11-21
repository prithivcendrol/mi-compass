package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0213f;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0218i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0391t0 extends C0368p0 implements C0388s0 {

    /* renamed from: M */
    private static Method f1475M;

    /* renamed from: L */
    private C0388s0 f1476L;

    /* renamed from: androidx.appcompat.widget.t0$a */
    static class C0392a {
        /* renamed from: a */
        static void m1739a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m1740b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    static class C0393b {
        /* renamed from: a */
        static void m1741a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$c */
    public static class C0394c extends C0346l0 {

        /* renamed from: q */
        final int f1477q;

        /* renamed from: r */
        final int f1478r;

        /* renamed from: s */
        private C0388s0 f1479s;

        /* renamed from: t */
        private MenuItem f1480t;

        /* renamed from: androidx.appcompat.widget.t0$c$a */
        static class C0395a {
            /* renamed from: a */
            static int m1744a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0394c(Context context, boolean z) {
            super(context, z);
            if (1 == C0395a.m1744a(context.getResources().getConfiguration())) {
                this.f1477q = 21;
                this.f1478r = 22;
                return;
            }
            this.f1477q = 22;
            this.f1478r = 21;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1969d(int i, int i2, int i3, int i4, int i5) {
            return super.mo1969d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1972e(MotionEvent motionEvent, int i) {
            return super.mo1972e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1479s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0213f fVar = (C0213f) adapter;
                C0218i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1480t;
                if (menuItem != iVar) {
                    C0214g b = fVar.mo852b();
                    if (menuItem != null) {
                        this.f1479s.mo838k(b, menuItem);
                    }
                    this.f1480t = iVar;
                    if (iVar != null) {
                        this.f1479s.mo837a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1477q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1478r) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0213f) adapter).mo852b().mo902e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0388s0 s0Var) {
            this.f1479s = s0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1475M = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0391t0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: K */
    public void mo2186K(Object obj) {
        C0392a.m1739a(this.f1428I, (Transition) obj);
    }

    /* renamed from: L */
    public void mo2187L(Object obj) {
        C0392a.m1740b(this.f1428I, (Transition) obj);
    }

    /* renamed from: M */
    public void mo2188M(C0388s0 s0Var) {
        this.f1476L = s0Var;
    }

    /* renamed from: N */
    public void mo2189N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1475M;
            if (method != null) {
                try {
                    method.invoke(this.f1428I, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0393b.m1741a(this.f1428I, z);
        }
    }

    /* renamed from: a */
    public void mo837a(C0214g gVar, MenuItem menuItem) {
        C0388s0 s0Var = this.f1476L;
        if (s0Var != null) {
            s0Var.mo837a(gVar, menuItem);
        }
    }

    /* renamed from: k */
    public void mo838k(C0214g gVar, MenuItem menuItem) {
        C0388s0 s0Var = this.f1476L;
        if (s0Var != null) {
            s0Var.mo838k(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0346l0 mo2111p(Context context, boolean z) {
        C0394c cVar = new C0394c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
