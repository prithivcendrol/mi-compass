package p121u1;

/* renamed from: u1.r1 */
public final class C2799r1 {

    /* renamed from: a */
    public static final C2799r1 f10601a = new C2799r1();

    /* renamed from: b */
    private static final ThreadLocal<C2793q0> f10602b = new ThreadLocal<>();

    private C2799r1() {
    }

    /* renamed from: a */
    public final C2793q0 mo10082a() {
        ThreadLocal<C2793q0> threadLocal = f10602b;
        C2793q0 q0Var = threadLocal.get();
        if (q0Var != null) {
            return q0Var;
        }
        C2793q0 a = C2804t0.m11662a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo10083b() {
        f10602b.set((Object) null);
    }

    /* renamed from: c */
    public final void mo10084c(C2793q0 q0Var) {
        f10602b.set(q0Var);
    }
}
