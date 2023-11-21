package p124v;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: v.b */
class C2861b extends Filter {

    /* renamed from: a */
    C2862a f10939a;

    /* renamed from: v.b$a */
    interface C2862a {
        /* renamed from: a */
        void mo1745a(Cursor cursor);

        /* renamed from: b */
        Cursor mo10130b();

        /* renamed from: c */
        Cursor mo1746c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    C2861b(C2862a aVar) {
        this.f10939a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f10939a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c = this.f10939a.mo1746c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c != null) {
            filterResults.count = c.getCount();
        } else {
            filterResults.count = 0;
            c = null;
        }
        filterResults.values = c;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f10939a.mo10130b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f10939a.mo1745a((Cursor) obj);
        }
    }
}
