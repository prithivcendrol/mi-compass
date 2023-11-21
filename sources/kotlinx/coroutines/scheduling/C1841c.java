package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
public final class C1841c extends C1844f {

    /* renamed from: k */
    public static final C1841c f7121k = new C1841c();

    private C1841c() {
        super(C1850l.f7133b, C1850l.f7134c, C1850l.f7135d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
