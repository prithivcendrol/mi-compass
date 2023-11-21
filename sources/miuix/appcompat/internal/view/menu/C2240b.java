package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.C2252h;
import p018c2.C1354j;
import p055i3.C1648b;

/* renamed from: miuix.appcompat.internal.view.menu.b */
public class C2240b implements C2250g, AdapterView.OnItemClickListener {

    /* renamed from: d */
    Context f8508d;

    /* renamed from: e */
    LayoutInflater f8509e;

    /* renamed from: f */
    C2242c f8510f;

    /* renamed from: g */
    ExpandedMenuView f8511g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f8512h;

    /* renamed from: i */
    int f8513i;

    /* renamed from: j */
    int f8514j;

    /* renamed from: k */
    int f8515k;

    /* renamed from: l */
    private C2250g.C2251a f8516l;

    /* renamed from: m */
    C2241a f8517m;

    /* renamed from: miuix.appcompat.internal.view.menu.b$a */
    private class C2241a extends BaseAdapter {

        /* renamed from: d */
        private int f8518d = -1;

        public C2241a() {
            mo8331a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8331a() {
            C2247e t = C2240b.this.f8510f.mo8404t();
            if (t != null) {
                ArrayList<C2247e> x = C2240b.this.f8510f.mo8408x();
                int size = x.size();
                for (int i = 0; i < size; i++) {
                    if (x.get(i) == t) {
                        this.f8518d = i;
                        return;
                    }
                }
            }
            this.f8518d = -1;
        }

        /* renamed from: b */
        public C2247e getItem(int i) {
            ArrayList<C2247e> x = C2240b.this.f8510f.mo8408x();
            int a = i + C2240b.this.f8512h;
            int i2 = this.f8518d;
            if (i2 >= 0 && a >= i2) {
                a++;
            }
            return x.get(a);
        }

        public int getCount() {
            int size = C2240b.this.f8510f.mo8408x().size() - C2240b.this.f8512h;
            return this.f8518d < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C2240b bVar = C2240b.this;
                view = bVar.f8509e.inflate(bVar.f8514j, viewGroup, false);
                C1648b.m6954c(view);
            }
            ((C2252h.C2253a) view).mo8201b(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo8331a();
            super.notifyDataSetChanged();
        }
    }

    public C2240b(int i, int i2) {
        this(C1354j.f4777t, i, i2);
    }

    public C2240b(int i, int i2, int i3) {
        this.f8514j = i2;
        this.f8515k = i;
        this.f8513i = i3;
    }

    public C2240b(Context context, int i) {
        this(i, 0);
        this.f8508d = context;
        this.f8509e = LayoutInflater.from(context);
    }

    public C2240b(Context context, int i, int i2) {
        this(i, i2, 0);
        this.f8508d = context;
        this.f8509e = LayoutInflater.from(context);
    }

    /* renamed from: b */
    public void mo8003b(boolean z) {
        C2241a aVar = this.f8517m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public boolean mo8004c() {
        return false;
    }

    /* renamed from: d */
    public void mo8005d(C2242c cVar, boolean z) {
        C2250g.C2251a aVar = this.f8516l;
        if (aVar != null) {
            aVar.mo7408d(cVar, z);
        }
    }

    /* renamed from: e */
    public boolean mo8006e(C2254i iVar) {
        if (!iVar.hasVisibleItems()) {
            return false;
        }
        new C2246d(iVar).mo8414c((IBinder) null);
        C2250g.C2251a aVar = this.f8516l;
        if (aVar == null) {
            return true;
        }
        aVar.mo7409e(iVar);
        return true;
    }

    /* renamed from: f */
    public ListAdapter mo8327f() {
        if (this.f8517m == null) {
            this.f8517m = new C2241a();
        }
        return this.f8517m;
    }

    /* renamed from: g */
    public boolean mo8007g(C2242c cVar, C2247e eVar) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8008h(android.content.Context r3, miuix.appcompat.internal.view.menu.C2242c r4) {
        /*
            r2 = this;
            int r0 = r2.f8513i
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f8513i
            r0.<init>(r3, r1)
            r2.f8508d = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f8509e = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f8508d
            if (r0 == 0) goto L_0x0023
            r2.f8508d = r3
            android.view.LayoutInflater r0 = r2.f8509e
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            miuix.appcompat.internal.view.menu.c r3 = r2.f8510f
            if (r3 == 0) goto L_0x002a
            r3.mo8349M(r2)
        L_0x002a:
            r2.f8510f = r4
            miuix.appcompat.internal.view.menu.b$a r3 = r2.f8517m
            if (r3 == 0) goto L_0x0033
            r3.notifyDataSetChanged()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.C2240b.mo8008h(android.content.Context, miuix.appcompat.internal.view.menu.c):void");
    }

    /* renamed from: i */
    public boolean mo8009i(C2242c cVar, C2247e eVar) {
        return false;
    }

    /* renamed from: j */
    public C2252h mo8328j(ViewGroup viewGroup) {
        if (this.f8517m == null) {
            this.f8517m = new C2241a();
        }
        if (this.f8517m.isEmpty()) {
            return null;
        }
        if (this.f8511g == null) {
            ExpandedMenuView expandedMenuView = (ExpandedMenuView) this.f8509e.inflate(this.f8515k, viewGroup, false);
            this.f8511g = expandedMenuView;
            expandedMenuView.setAdapter(this.f8517m);
            this.f8511g.setOnItemClickListener(this);
        }
        return this.f8511g;
    }

    /* renamed from: k */
    public void mo8329k(C2250g.C2251a aVar) {
        this.f8516l = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8510f.mo8346I(this.f8517m.getItem(i), 0);
    }
}
