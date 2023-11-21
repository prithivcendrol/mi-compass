package p019c3;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p025d3.C1500a;
import p043g3.C1609b;

/* renamed from: c3.b */
public class C1359b {

    /* renamed from: a */
    private String f5035a;

    /* renamed from: b */
    private C1358a f5036b = C1358a.VERBOSE;

    /* renamed from: c */
    private CopyOnWriteArrayList<C1500a> f5037c = new CopyOnWriteArrayList<>();

    public C1359b(String str) {
        this.f5035a = str;
    }

    /* renamed from: b */
    private void m5993b(C1358a aVar, String str, String str2, Throwable th, C1609b bVar) {
        C1358a aVar2 = aVar;
        if (aVar.compareTo(this.f5036b) >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<C1500a> it = this.f5037c.iterator();
            while (it.hasNext()) {
                C1500a next = it.next();
                String str3 = this.f5035a;
                String str4 = str;
                long j = currentTimeMillis;
                C1358a aVar3 = aVar;
                if (str2 == null) {
                    next.mo5578a(str3, str4, j, aVar3, bVar);
                } else {
                    next.mo5579b(str3, str4, j, aVar3, str2, th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5199a(C1500a aVar) {
        if (aVar != null) {
            this.f5037c.addIfAbsent(aVar);
            return;
        }
        throw new IllegalArgumentException("Appender not allowed to be null");
    }

    /* renamed from: c */
    public void mo5200c(C1358a aVar, String str, C1609b bVar) {
        m5993b(aVar, str, (String) null, (Throwable) null, bVar);
    }

    /* renamed from: d */
    public void mo5201d(C1358a aVar, String str, String str2, Throwable th) {
        m5993b(aVar, str, str2, th, (C1609b) null);
    }

    /* renamed from: e */
    public void mo5202e(C1358a aVar) {
        this.f5036b = aVar;
    }
}
