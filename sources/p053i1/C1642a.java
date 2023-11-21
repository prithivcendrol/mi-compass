package p053i1;

import p047h1.C1623a;
import p083n1.C2422g;

/* renamed from: i1.a */
public class C1642a extends C1623a {
    /* renamed from: a */
    public void mo5799a(Throwable th, Throwable th2) {
        C2422g.m10285e(th, "cause");
        C2422g.m10285e(th2, "exception");
        th.addSuppressed(th2);
    }
}
