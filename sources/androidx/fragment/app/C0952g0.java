package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p058j0.C1690e;
import p063k.C1761a;

/* renamed from: androidx.fragment.app.g0 */
class C0952g0 {

    /* renamed from: a */
    static final C0962i0 f3277a = new C0954h0();

    /* renamed from: b */
    static final C0962i0 f3278b = m3937b();

    /* renamed from: a */
    static void m3936a(Fragment fragment, Fragment fragment2, boolean z, C1761a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.mo3210F();
        } else {
            fragment.mo3210F();
        }
    }

    /* renamed from: b */
    private static C0962i0 m3937b() {
        try {
            return C1690e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static void m3938c(C1761a<String, String> aVar, C1761a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo6166m(size))) {
                aVar.mo6164k(size);
            }
        }
    }

    /* renamed from: d */
    static void m3939d(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }
}
