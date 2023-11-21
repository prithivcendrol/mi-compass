package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0232n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0213f extends BaseAdapter {

    /* renamed from: d */
    C0214g f746d;

    /* renamed from: e */
    private int f747e = -1;

    /* renamed from: f */
    private boolean f748f;

    /* renamed from: g */
    private final boolean f749g;

    /* renamed from: h */
    private final LayoutInflater f750h;

    /* renamed from: i */
    private final int f751i;

    public C0213f(C0214g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f749g = z;
        this.f750h = layoutInflater;
        this.f746d = gVar;
        this.f751i = i;
        mo851a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo851a() {
        C0218i v = this.f746d.mo929v();
        if (v != null) {
            ArrayList<C0218i> z = this.f746d.mo933z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f747e = i;
                    return;
                }
            }
        }
        this.f747e = -1;
    }

    /* renamed from: b */
    public C0214g mo852b() {
        return this.f746d;
    }

    /* renamed from: c */
    public C0218i getItem(int i) {
        ArrayList<C0218i> z = this.f749g ? this.f746d.mo933z() : this.f746d.mo863E();
        int i2 = this.f747e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    /* renamed from: d */
    public void mo854d(boolean z) {
        this.f748f = z;
    }

    public int getCount() {
        ArrayList<C0218i> z = this.f749g ? this.f746d.mo933z() : this.f746d.mo863E();
        int i = this.f747e;
        int size = z.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f750h.inflate(this.f751i, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f746d.mo864F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0232n.C0233a aVar = (C0232n.C0233a) view;
        if (this.f748f) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo703d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo851a();
        super.notifyDataSetChanged();
    }
}
