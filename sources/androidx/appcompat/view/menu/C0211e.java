package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0232n;
import java.util.ArrayList;
import p021d.C1453g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0211e implements C0230m, AdapterView.OnItemClickListener {

    /* renamed from: d */
    Context f735d;

    /* renamed from: e */
    LayoutInflater f736e;

    /* renamed from: f */
    C0214g f737f;

    /* renamed from: g */
    ExpandedMenuView f738g;

    /* renamed from: h */
    int f739h;

    /* renamed from: i */
    int f740i;

    /* renamed from: j */
    int f741j;

    /* renamed from: k */
    private C0230m.C0231a f742k;

    /* renamed from: l */
    C0212a f743l;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0212a extends BaseAdapter {

        /* renamed from: d */
        private int f744d = -1;

        public C0212a() {
            mo844a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo844a() {
            C0218i v = C0211e.this.f737f.mo929v();
            if (v != null) {
                ArrayList<C0218i> z = C0211e.this.f737f.mo933z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f744d = i;
                        return;
                    }
                }
            }
            this.f744d = -1;
        }

        /* renamed from: b */
        public C0218i getItem(int i) {
            ArrayList<C0218i> z = C0211e.this.f737f.mo933z();
            int i2 = i + C0211e.this.f739h;
            int i3 = this.f744d;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        public int getCount() {
            int size = C0211e.this.f737f.mo933z().size() - C0211e.this.f739h;
            return this.f744d < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0211e eVar = C0211e.this;
                view = eVar.f736e.inflate(eVar.f741j, viewGroup, false);
            }
            ((C0232n.C0233a) view).mo703d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo844a();
            super.notifyDataSetChanged();
        }
    }

    public C0211e(int i, int i2) {
        this.f741j = i;
        this.f740i = i2;
    }

    public C0211e(Context context, int i) {
        this(i, 0);
        this.f735d = context;
        this.f736e = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo797a(C0214g gVar, boolean z) {
        C0230m.C0231a aVar = this.f742k;
        if (aVar != null) {
            aVar.mo527a(gVar, z);
        }
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        C0212a aVar = this.f743l;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public boolean mo818c() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo799d(android.content.Context r3, androidx.appcompat.view.menu.C0214g r4) {
        /*
            r2 = this;
            int r0 = r2.f740i
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f740i
            r0.<init>(r3, r1)
            r2.f735d = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f736e = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f735d
            if (r0 == 0) goto L_0x0023
            r2.f735d = r3
            android.view.LayoutInflater r0 = r2.f736e
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f737f = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f743l
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0211e.mo799d(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: e */
    public boolean mo800e(C0239r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0217h(rVar).mo935d((IBinder) null);
        C0230m.C0231a aVar = this.f742k;
        if (aVar == null) {
            return true;
        }
        aVar.mo528b(rVar);
        return true;
    }

    /* renamed from: f */
    public boolean mo801f(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo802g(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: h */
    public void mo803h(C0230m.C0231a aVar) {
        this.f742k = aVar;
    }

    /* renamed from: i */
    public ListAdapter mo841i() {
        if (this.f743l == null) {
            this.f743l = new C0212a();
        }
        return this.f743l;
    }

    /* renamed from: j */
    public C0232n mo842j(ViewGroup viewGroup) {
        if (this.f738g == null) {
            this.f738g = (ExpandedMenuView) this.f736e.inflate(C1453g.f5818g, viewGroup, false);
            if (this.f743l == null) {
                this.f743l = new C0212a();
            }
            this.f738g.setAdapter(this.f743l);
            this.f738g.setOnItemClickListener(this);
        }
        return this.f738g;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f737f.mo871M(this.f743l.getItem(i), this, 0);
    }
}
