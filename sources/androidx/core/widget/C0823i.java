package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.i */
public final class C0823i {

    /* renamed from: androidx.core.widget.i$a */
    static class C0824a {
        /* renamed from: a */
        static boolean m3292a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m3293b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m3290a(ListView listView, int i) {
        return C0824a.m3292a(listView, i);
    }

    /* renamed from: b */
    public static void m3291b(ListView listView, int i) {
        C0824a.m3293b(listView, i);
    }
}
