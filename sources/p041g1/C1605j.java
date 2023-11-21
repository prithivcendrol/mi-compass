package p041g1;

import p029e1.C1518d;
import p083n1.C2421f;
import p083n1.C2422g;
import p083n1.C2429n;

/* renamed from: g1.j */
public abstract class C1605j extends C1597c implements C2421f<Object> {

    /* renamed from: g */
    private final int f6386g;

    public C1605j(int i, C1518d<Object> dVar) {
        super(dVar);
        this.f6386g = i;
    }

    /* renamed from: d */
    public int mo5757d() {
        return this.f6386g;
    }

    public String toString() {
        if (mo5745i() != null) {
            return super.toString();
        }
        String d = C2429n.m10303d(this);
        C2422g.m10284d(d, "renderLambdaToString(this)");
        return d;
    }
}
