package p025d3;

import android.util.Log;
import p019c3.C1358a;
import p037f3.C1572a;
import p043g3.C1609b;

/* renamed from: d3.b */
public class C1501b implements C1500a {

    /* renamed from: a */
    private C1572a f6121a;

    /* renamed from: b */
    private C1502c f6122b;

    /* renamed from: d */
    private void m6520d(String str, String str2, long j, C1358a aVar, String str3, Throwable th, C1609b bVar) {
        String str4;
        C1572a aVar2 = this.f6121a;
        if (aVar2 == null) {
            str4 = "Fail to append log for formatter is null";
        } else {
            C1502c cVar = this.f6122b;
            if (cVar == null) {
                str4 = "Fail to append log for FileManager is null";
            } else {
                String str5 = str;
                String str6 = str2;
                long j2 = j;
                C1358a aVar3 = aVar;
                cVar.mo5588j(str3 == null ? aVar2.mo5725b(str5, str6, j2, aVar3, bVar) : aVar2.mo5724a(str5, str6, j2, aVar3, str3, th));
                return;
            }
        }
        Log.e("FileAppender", str4);
    }

    /* renamed from: a */
    public void mo5578a(String str, String str2, long j, C1358a aVar, C1609b bVar) {
        m6520d(str, str2, j, aVar, (String) null, (Throwable) null, bVar);
    }

    /* renamed from: b */
    public void mo5579b(String str, String str2, long j, C1358a aVar, String str3, Throwable th) {
        m6520d(str, str2, j, aVar, str3, th, (C1609b) null);
    }

    /* renamed from: c */
    public void mo5580c() {
        C1502c cVar = this.f6122b;
        if (cVar != null) {
            cVar.mo5583a();
            this.f6122b = null;
        }
    }

    /* renamed from: e */
    public void mo5581e(C1502c cVar) {
        if (this.f6122b != cVar) {
            mo5580c();
            this.f6122b = cVar;
        }
    }

    /* renamed from: f */
    public void mo5582f(C1572a aVar) {
        this.f6121a = aVar;
    }
}
