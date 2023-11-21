package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0623f;
import java.util.List;

/* renamed from: androidx.core.provider.e */
public final class C0595e {

    /* renamed from: a */
    private final String f2609a;

    /* renamed from: b */
    private final String f2610b;

    /* renamed from: c */
    private final String f2611c;

    /* renamed from: d */
    private final List<List<byte[]>> f2612d;

    /* renamed from: e */
    private final int f2613e = 0;

    /* renamed from: f */
    private final String f2614f;

    public C0595e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2609a = (String) C0623f.m2495f(str);
        this.f2610b = (String) C0623f.m2495f(str2);
        this.f2611c = (String) C0623f.m2495f(str3);
        this.f2612d = (List) C0623f.m2495f(list);
        this.f2614f = m2429a(str, str2, str3);
    }

    /* renamed from: a */
    private String m2429a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo2658b() {
        return this.f2612d;
    }

    /* renamed from: c */
    public int mo2659c() {
        return this.f2613e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo2660d() {
        return this.f2614f;
    }

    /* renamed from: e */
    public String mo2661e() {
        return this.f2609a;
    }

    /* renamed from: f */
    public String mo2662f() {
        return this.f2610b;
    }

    /* renamed from: g */
    public String mo2663g() {
        return this.f2611c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2609a + ", mProviderPackage: " + this.f2610b + ", mQuery: " + this.f2611c + ", mCertificates:");
        for (int i = 0; i < this.f2612d.size(); i++) {
            sb.append(" [");
            List list = this.f2612d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2613e);
        return sb.toString();
    }
}
