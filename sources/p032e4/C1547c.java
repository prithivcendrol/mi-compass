package p032e4;

import android.view.LayoutInflater;
import androidx.core.view.C0704g;
import p005a4.C0040b;

/* renamed from: e4.c */
public class C1547c {
    /* renamed from: a */
    public static void m6666a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        LayoutInflater.Factory2 factory22 = layoutInflater.getFactory2();
        if (factory22 == null && layoutInflater.getFactory() == null) {
            C0704g.m2815a(layoutInflater, factory2);
        } else if (factory22 instanceof C1545a) {
            ((C1545a) layoutInflater.getFactory2()).mo5666a(factory2);
        } else {
            if (factory2 instanceof C1545a) {
                ((C1545a) factory2).mo5666a(factory22);
            }
            C0040b.m65g(layoutInflater, C0040b.m61c(layoutInflater.getClass().getSuperclass(), "mFactory2"), factory2);
        }
    }
}
