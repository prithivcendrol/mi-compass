package p111s1;

import java.util.Iterator;
import p083n1.C2422g;

/* renamed from: s1.f */
class C2653f extends C2652e {

    /* renamed from: s1.f$a */
    public static final class C2654a implements C2649b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f10324a;

        public C2654a(Iterator it) {
            this.f10324a = it;
        }

        public Iterator<T> iterator() {
            return this.f10324a;
        }
    }

    /* renamed from: a */
    public static <T> C2649b<T> m11150a(Iterator<? extends T> it) {
        C2422g.m10285e(it, "<this>");
        return m11151b(new C2654a(it));
    }

    /* renamed from: b */
    public static final <T> C2649b<T> m11151b(C2649b<? extends T> bVar) {
        C2422g.m10285e(bVar, "<this>");
        return bVar instanceof C2648a ? bVar : new C2648a(bVar);
    }
}
