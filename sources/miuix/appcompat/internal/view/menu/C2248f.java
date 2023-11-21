package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.C2252h;
import p018c2.C1350f;
import p018c2.C1354j;
import p055i3.C1648b;
import p055i3.C1654h;
import p061j3.C1750f;

/* renamed from: miuix.appcompat.internal.view.menu.f */
public class C2248f implements AdapterView.OnItemClickListener, View.OnKeyListener, PopupWindow.OnDismissListener, C2250g {

    /* renamed from: p */
    private static final int f8581p = C1354j.f4745D;

    /* renamed from: d */
    boolean f8582d;

    /* renamed from: e */
    private Context f8583e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public LayoutInflater f8584f;

    /* renamed from: g */
    private C1750f f8585g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2242c f8586h;

    /* renamed from: i */
    private View f8587i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8588j;

    /* renamed from: k */
    private C2249a f8589k;

    /* renamed from: l */
    private C2250g.C2251a f8590l;

    /* renamed from: m */
    private int f8591m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f8592n = f8581p;

    /* renamed from: o */
    private int f8593o = 0;

    /* renamed from: miuix.appcompat.internal.view.menu.f$a */
    private class C2249a extends BaseAdapter {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C2242c f8594d;

        /* renamed from: e */
        private int f8595e = -1;

        public C2249a(C2242c cVar) {
            this.f8594d = cVar;
            mo8493b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8493b() {
            C2247e t = C2248f.this.f8586h.mo8404t();
            if (t != null) {
                ArrayList<C2247e> x = C2248f.this.f8586h.mo8408x();
                int size = x.size();
                for (int i = 0; i < size; i++) {
                    if (x.get(i) == t) {
                        this.f8595e = i;
                        return;
                    }
                }
            }
            this.f8595e = -1;
        }

        /* renamed from: c */
        public C2247e getItem(int i) {
            ArrayList<C2247e> x = C2248f.this.f8588j ? this.f8594d.mo8408x() : this.f8594d.mo8340C();
            int i2 = this.f8595e;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return x.get(i);
        }

        public int getCount() {
            ArrayList<C2247e> x = C2248f.this.f8588j ? this.f8594d.mo8408x() : this.f8594d.mo8340C();
            int i = this.f8595e;
            int size = x.size();
            return i < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C2248f.this.f8584f.inflate(C2248f.this.f8592n, viewGroup, false);
                C1648b.m6954c(view);
            }
            C1654h.m6980d(view, i, getCount());
            C2252h.C2253a aVar = (C2252h.C2253a) view;
            if (C2248f.this.f8582d) {
                ((ListMenuItemView) view).setForceShowIcon(true);
            }
            aVar.mo8201b(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo8493b();
            super.notifyDataSetChanged();
        }
    }

    public C2248f(Context context, C2242c cVar, View view, boolean z) {
        this.f8583e = context;
        this.f8584f = LayoutInflater.from(context);
        this.f8586h = cVar;
        this.f8588j = z;
        this.f8587i = view;
        cVar.mo8374c(this);
        this.f8591m = context.getResources().getDimensionPixelSize(C1350f.f4642f0);
        this.f8593o = context.getResources().getDimensionPixelSize(C1350f.f4638d0);
    }

    /* renamed from: a */
    public void mo8299a(boolean z) {
        if (isShowing()) {
            this.f8585g.dismiss();
        }
    }

    /* renamed from: b */
    public void mo8003b(boolean z) {
        C2249a aVar = this.f8589k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        this.f8591m = this.f8583e.getResources().getDimensionPixelSize(C1350f.f4642f0);
        this.f8593o = this.f8583e.getResources().getDimensionPixelSize(C1350f.f4638d0);
        if (isShowing()) {
            this.f8585g.mo6022f(this.f8593o);
            this.f8585g.mo6020d(this.f8591m);
            this.f8585g.mo6025l(this.f8587i, (ViewGroup) null);
        }
    }

    /* renamed from: c */
    public boolean mo8004c() {
        return false;
    }

    /* renamed from: d */
    public void mo8005d(C2242c cVar, boolean z) {
        if (cVar == this.f8586h) {
            mo8299a(true);
            C2250g.C2251a aVar = this.f8590l;
            if (aVar != null) {
                aVar.mo7408d(cVar, z);
            }
        }
    }

    /* renamed from: e */
    public boolean mo8006e(C2254i iVar) {
        boolean z;
        if (iVar.hasVisibleItems()) {
            C2248f fVar = new C2248f(this.f8583e, iVar, this.f8587i, false);
            fVar.mo8488o(this.f8590l);
            int size = iVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = iVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            fVar.mo8491p(z);
            if (fVar.mo8486f()) {
                C2250g.C2251a aVar = this.f8590l;
                if (aVar != null) {
                    aVar.mo7409e(iVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo8486f() {
        C1750f fVar = new C1750f(this.f8583e);
        this.f8585g = fVar;
        fVar.mo6015Q(this.f8583e.getResources().getDimensionPixelOffset(C1350f.f4640e0));
        this.f8585g.mo6014P(false);
        this.f8585g.setOnDismissListener(this);
        this.f8585g.mo6016R(this);
        C2249a aVar = new C2249a(this.f8586h);
        this.f8589k = aVar;
        this.f8585g.mo6024i(aVar);
        this.f8585g.mo6022f(this.f8593o);
        this.f8585g.mo6020d(this.f8591m);
        this.f8585g.mo6025l(this.f8587i, (ViewGroup) null);
        this.f8585g.mo6006D().setOnKeyListener(this);
        return true;
    }

    /* renamed from: g */
    public boolean mo8007g(C2242c cVar, C2247e eVar) {
        return false;
    }

    /* renamed from: h */
    public void mo8008h(Context context, C2242c cVar) {
    }

    /* renamed from: i */
    public boolean mo8009i(C2242c cVar, C2247e eVar) {
        return false;
    }

    public boolean isShowing() {
        C1750f fVar = this.f8585g;
        return fVar != null && fVar.isShowing();
    }

    /* renamed from: o */
    public void mo8488o(C2250g.C2251a aVar) {
        this.f8590l = aVar;
    }

    public void onDismiss() {
        this.f8585g = null;
        this.f8586h.close();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2249a aVar = this.f8589k;
        aVar.f8594d.mo8346I(aVar.getItem(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo8299a(false);
        return true;
    }

    /* renamed from: p */
    public void mo8491p(boolean z) {
        this.f8582d = z;
    }

    /* renamed from: q */
    public void mo8492q(int i) {
        this.f8592n = i;
    }
}
