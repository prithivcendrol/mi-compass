package p061j3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import p018c2.C1352h;
import p018c2.C1354j;
import p055i3.C1648b;
import p055i3.C1654h;

/* renamed from: j3.g */
public class C1755g extends BaseAdapter {

    /* renamed from: d */
    private LayoutInflater f6764d;

    /* renamed from: e */
    private ArrayList<MenuItem> f6765e;

    /* renamed from: f */
    private Context f6766f;

    /* renamed from: j3.g$b */
    private static class C1757b {

        /* renamed from: a */
        ImageView f6767a;

        /* renamed from: b */
        TextView f6768b;

        private C1757b() {
        }
    }

    protected C1755g(Context context, Menu menu) {
        this.f6764d = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f6765e = arrayList;
        if (menu != null) {
            m7319a(menu, arrayList);
        }
        this.f6766f = context;
    }

    /* renamed from: a */
    private void m7319a(Menu menu, ArrayList<MenuItem> arrayList) {
        arrayList.clear();
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (mo6034b(item)) {
                    arrayList.add(item);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6034b(MenuItem menuItem) {
        return menuItem.isVisible();
    }

    /* renamed from: c */
    public MenuItem getItem(int i) {
        return this.f6765e.get(i);
    }

    /* renamed from: d */
    public void mo6036d(Menu menu) {
        m7319a(menu, this.f6765e);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f6765e.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6764d.inflate(C1354j.f4743B, viewGroup, false);
            C1757b bVar = new C1757b();
            bVar.f6767a = (ImageView) view.findViewById(16908294);
            bVar.f6768b = (TextView) view.findViewById(16908308);
            view.setTag(C1352h.f4708b0, bVar);
            C1648b.m6954c(view);
        }
        C1654h.m6979c(view, i, getCount());
        Object tag = view.getTag(C1352h.f4708b0);
        if (tag != null) {
            C1757b bVar2 = (C1757b) tag;
            MenuItem c = getItem(i);
            if (c.getIcon() != null) {
                bVar2.f6767a.setImageDrawable(c.getIcon());
                bVar2.f6767a.setVisibility(0);
            } else {
                bVar2.f6767a.setVisibility(8);
            }
            bVar2.f6768b.setText(c.getTitle());
        }
        return view;
    }
}
