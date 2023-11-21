package p124v;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p124v.C2861b;

/* renamed from: v.a */
public abstract class C2858a extends BaseAdapter implements Filterable, C2861b.C2862a {

    /* renamed from: d */
    protected boolean f10929d;

    /* renamed from: e */
    protected boolean f10930e;

    /* renamed from: f */
    protected Cursor f10931f;

    /* renamed from: g */
    protected Context f10932g;

    /* renamed from: h */
    protected int f10933h;

    /* renamed from: i */
    protected C2859a f10934i;

    /* renamed from: j */
    protected DataSetObserver f10935j;

    /* renamed from: k */
    protected C2861b f10936k;

    /* renamed from: v.a$a */
    private class C2859a extends ContentObserver {
        C2859a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C2858a.this.mo10137h();
        }
    }

    /* renamed from: v.a$b */
    private class C2860b extends DataSetObserver {
        C2860b() {
        }

        public void onChanged() {
            C2858a aVar = C2858a.this;
            aVar.f10929d = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C2858a aVar = C2858a.this;
            aVar.f10929d = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C2858a(Context context, Cursor cursor, boolean z) {
        mo10131e(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1745a(Cursor cursor) {
        Cursor i = mo10138i(cursor);
        if (i != null) {
            i.close();
        }
    }

    /* renamed from: b */
    public Cursor mo10130b() {
        return this.f10931f;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo1748d(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10131e(Context context, Cursor cursor, int i) {
        C2860b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f10930e = true;
        } else {
            this.f10930e = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f10931f = cursor;
        this.f10929d = z;
        this.f10932g = context;
        this.f10933h = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f10934i = new C2859a();
            bVar = new C2860b();
        } else {
            bVar = null;
            this.f10934i = null;
        }
        this.f10935j = bVar;
        if (z) {
            C2859a aVar = this.f10934i;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10935j;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo10132f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo1749g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f10929d || (cursor = this.f10931f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10929d) {
            return null;
        }
        this.f10931f.moveToPosition(i);
        if (view == null) {
            view = mo10132f(this.f10932g, this.f10931f, viewGroup);
        }
        mo1748d(view, this.f10932g, this.f10931f);
        return view;
    }

    public Filter getFilter() {
        if (this.f10936k == null) {
            this.f10936k = new C2861b(this);
        }
        return this.f10936k;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f10929d || (cursor = this.f10931f) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10931f;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f10929d || (cursor = this.f10931f) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f10931f.getLong(this.f10933h);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10929d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f10931f.moveToPosition(i)) {
            if (view == null) {
                view = mo1749g(this.f10932g, this.f10931f, viewGroup);
            }
            mo1748d(view, this.f10932g, this.f10931f);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo10137h() {
        Cursor cursor;
        if (this.f10930e && (cursor = this.f10931f) != null && !cursor.isClosed()) {
            this.f10929d = this.f10931f.requery();
        }
    }

    /* renamed from: i */
    public Cursor mo10138i(Cursor cursor) {
        Cursor cursor2 = this.f10931f;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2859a aVar = this.f10934i;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10935j;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10931f = cursor;
        if (cursor != null) {
            C2859a aVar2 = this.f10934i;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f10935j;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10933h = cursor.getColumnIndexOrThrow("_id");
            this.f10929d = true;
            notifyDataSetChanged();
        } else {
            this.f10933h = -1;
            this.f10929d = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
