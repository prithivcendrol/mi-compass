package p031e3;

import p025d3.C1502c;

/* renamed from: e3.b */
public class C1543b extends C1502c {

    /* renamed from: j */
    private C1544c f6196j;

    /* renamed from: k */
    private String f6197k;

    public C1543b(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: k */
    private void m6660k() {
        C1544c cVar;
        if (this.f6125c != null && (cVar = this.f6196j) != null) {
            String a = cVar.mo5662a(this);
            this.f6197k = a;
            if (a != null) {
                mo5583a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo5586f() {
        String str = this.f6197k;
        return str == null ? super.mo5586f() : str;
    }

    /* renamed from: j */
    public synchronized void mo5588j(String str) {
        m6660k();
        super.mo5588j(str);
    }

    /* renamed from: l */
    public synchronized void mo5665l(C1544c cVar) {
        this.f6196j = cVar;
    }
}
