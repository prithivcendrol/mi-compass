package p051i;

import java.util.concurrent.Executor;

/* renamed from: i.a */
public class C1632a extends C1638d {

    /* renamed from: c */
    private static volatile C1632a f6487c;

    /* renamed from: d */
    private static final Executor f6488d = new C1633a();

    /* renamed from: e */
    private static final Executor f6489e = new C1634b();

    /* renamed from: a */
    private C1638d f6490a;

    /* renamed from: b */
    private C1638d f6491b;

    /* renamed from: i.a$a */
    static class C1633a implements Executor {
        C1633a() {
        }

        public void execute(Runnable runnable) {
            C1632a.m6928d().mo5813c(runnable);
        }
    }

    /* renamed from: i.a$b */
    static class C1634b implements Executor {
        C1634b() {
        }

        public void execute(Runnable runnable) {
            C1632a.m6928d().mo5811a(runnable);
        }
    }

    private C1632a() {
        C1636c cVar = new C1636c();
        this.f6491b = cVar;
        this.f6490a = cVar;
    }

    /* renamed from: d */
    public static C1632a m6928d() {
        if (f6487c != null) {
            return f6487c;
        }
        synchronized (C1632a.class) {
            if (f6487c == null) {
                f6487c = new C1632a();
            }
        }
        return f6487c;
    }

    /* renamed from: a */
    public void mo5811a(Runnable runnable) {
        this.f6490a.mo5811a(runnable);
    }

    /* renamed from: b */
    public boolean mo5812b() {
        return this.f6490a.mo5812b();
    }

    /* renamed from: c */
    public void mo5813c(Runnable runnable) {
        this.f6490a.mo5813c(runnable);
    }

    /* renamed from: e */
    public void mo5814e(C1638d dVar) {
        if (dVar == null) {
            dVar = this.f6491b;
        }
        this.f6490a = dVar;
    }
}
