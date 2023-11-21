package p121u1;

import p029e1.C1523g;

/* renamed from: u1.s1 */
public final class C2802s1 extends C2820x {

    /* renamed from: e */
    public static final C2802s1 f10603e = new C2802s1();

    private C2802s1() {
    }

    /* renamed from: c */
    public void mo6270c(C1523g gVar, Runnable runnable) {
        C2813v1 v1Var = (C2813v1) gVar.get(C2813v1.f10610e);
        if (v1Var != null) {
            v1Var.f10611d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: e */
    public boolean mo6297e(C1523g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
