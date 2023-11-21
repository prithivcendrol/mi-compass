package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C1815k {

    /* renamed from: a */
    private static final Object f7065a = new C1831w("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f7066b = new C1831w("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m7522a() {
        return f7065a;
    }

    /* renamed from: b */
    public static final C1816l m7523b(Object obj) {
        C1816l lVar = null;
        C1828t tVar = obj instanceof C1828t ? (C1828t) obj : null;
        if (tVar != null) {
            lVar = tVar.f7088a;
        }
        return lVar == null ? (C1816l) obj : lVar;
    }
}
