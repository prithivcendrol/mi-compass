package p084n2;

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
import p018c2.C1354j;
import p055i3.C1648b;
import p055i3.C1654h;

/* renamed from: n2.b */
public class C2433b extends BaseAdapter {

    /* renamed from: d */
    private LayoutInflater f9441d;

    /* renamed from: e */
    private ArrayList<MenuItem> f9442e;

    /* renamed from: f */
    private Context f9443f;

    /* renamed from: n2.b$b */
    private static class C2435b {

        /* renamed from: a */
        ImageView f9444a;

        /* renamed from: b */
        TextView f9445b;

        private C2435b() {
        }
    }

    protected C2433b(Context context, Menu menu) {
        this.f9441d = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f9442e = arrayList;
        m10317a(menu, arrayList);
        this.f9443f = context;
    }

    /* renamed from: a */
    private void m10317a(Menu menu, ArrayList<MenuItem> arrayList) {
        arrayList.clear();
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (mo9337b(item)) {
                    arrayList.add(item);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo9337b(MenuItem menuItem) {
        return menuItem.isVisible();
    }

    /* renamed from: c */
    public MenuItem getItem(int i) {
        return this.f9442e.get(i);
    }

    /* renamed from: d */
    public void mo9339d(Menu menu) {
        m10317a(menu, this.f9442e);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f9442e.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9441d.inflate(C1354j.f4778u, viewGroup, false);
            C2435b bVar = new C2435b();
            bVar.f9444a = (ImageView) view.findViewById(16908294);
            bVar.f9445b = (TextView) view.findViewById(16908308);
            view.setTag(bVar);
            C1648b.m6954c(view);
        }
        C1654h.m6980d(view, i, getCount());
        Object tag = view.getTag();
        if (tag != null) {
            C2435b bVar2 = (C2435b) tag;
            MenuItem c = getItem(i);
            if (c.getIcon() != null) {
                bVar2.f9444a.setImageDrawable(c.getIcon());
                bVar2.f9444a.setVisibility(0);
            } else {
                bVar2.f9444a.setVisibility(8);
            }
            bVar2.f9445b.setText(c.getTitle());
        }
        return view;
    }
}
