package p100q0;

import android.text.TextUtils;
import p100q0.C2568g;

/* renamed from: q0.b */
public class C2561b {

    /* renamed from: a */
    private String f10054a;

    /* renamed from: b */
    private String f10055b;

    /* renamed from: c */
    private String f10056c;

    /* renamed from: d */
    private boolean f10057d;

    /* renamed from: e */
    private String f10058e;

    /* renamed from: f */
    private C2568g.C2571c f10059f;

    /* renamed from: g */
    private boolean f10060g;

    /* renamed from: h */
    private boolean f10061h;

    /* renamed from: i */
    private boolean f10062i;

    /* renamed from: j */
    private boolean f10063j;

    /* renamed from: k */
    private boolean f10064k;

    /* renamed from: l */
    private boolean f10065l;

    /* renamed from: m */
    private String f10066m;

    /* renamed from: q0.b$a */
    public static class C2562a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f10067a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f10068b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f10069c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f10070d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f10071e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2568g.C2571c f10072f = C2568g.C2571c.APP;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f10073g = true;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f10074h = true;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f10075i = true;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f10076j = false;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f10077k = true;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f10078l = false;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public String f10079m;

        /* renamed from: c */
        public C2561b mo9814c() {
            return new C2561b(this);
        }

        /* renamed from: o */
        public C2562a mo9815o(String str) {
            this.f10067a = str;
            return this;
        }

        /* renamed from: p */
        public C2562a mo9816p(String str) {
            this.f10069c = str;
            return this;
        }

        /* renamed from: q */
        public C2562a mo9817q(boolean z) {
            this.f10076j = z;
            return this;
        }

        /* renamed from: r */
        public C2562a mo9818r(boolean z) {
            this.f10070d = z;
            return this;
        }

        /* renamed from: s */
        public C2562a mo9819s(C2568g.C2571c cVar) {
            this.f10072f = cVar;
            return this;
        }
    }

    private C2561b(C2562a aVar) {
        this.f10059f = C2568g.C2571c.APP;
        this.f10060g = true;
        this.f10061h = true;
        this.f10062i = true;
        this.f10064k = true;
        this.f10065l = false;
        this.f10054a = aVar.f10067a;
        this.f10055b = aVar.f10068b;
        this.f10056c = aVar.f10069c;
        this.f10057d = aVar.f10070d;
        this.f10058e = aVar.f10071e;
        this.f10059f = aVar.f10072f;
        this.f10060g = aVar.f10073g;
        this.f10062i = aVar.f10075i;
        this.f10061h = aVar.f10074h;
        this.f10063j = aVar.f10076j;
        this.f10064k = aVar.f10077k;
        this.f10065l = aVar.f10078l;
        this.f10066m = aVar.f10079m;
    }

    /* renamed from: a */
    private String m10905a(String str) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            sb.append(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == 1 || i == str.length() - 2 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public String mo9800b() {
        return this.f10054a;
    }

    /* renamed from: c */
    public String mo9801c() {
        return this.f10056c;
    }

    /* renamed from: d */
    public String mo9802d() {
        return this.f10066m;
    }

    /* renamed from: e */
    public C2568g.C2571c mo9803e() {
        return this.f10059f;
    }

    /* renamed from: f */
    public String mo9804f() {
        return this.f10055b;
    }

    /* renamed from: g */
    public String mo9805g() {
        return this.f10058e;
    }

    /* renamed from: h */
    public boolean mo9806h() {
        return this.f10064k;
    }

    /* renamed from: i */
    public boolean mo9807i() {
        return this.f10063j;
    }

    @Deprecated
    /* renamed from: j */
    public boolean mo9808j() {
        return this.f10060g;
    }

    /* renamed from: k */
    public boolean mo9809k() {
        return this.f10062i;
    }

    /* renamed from: l */
    public boolean mo9810l() {
        return this.f10061h;
    }

    /* renamed from: m */
    public boolean mo9811m() {
        return this.f10057d;
    }

    /* renamed from: n */
    public boolean mo9812n() {
        return this.f10065l;
    }

    public String toString() {
        try {
            return "Configuration{appId='" + m10905a(this.f10054a) + '\'' + ", pluginId='" + m10905a(this.f10055b) + '\'' + ", channel='" + this.f10056c + '\'' + ", international=" + this.f10057d + ", region='" + this.f10058e + '\'' + ", overrideMiuiRegionSetting=" + this.f10065l + ", mode=" + this.f10059f + ", GAIDEnable=" + this.f10060g + ", IMSIEnable=" + this.f10061h + ", IMEIEnable=" + this.f10062i + ", ExceptionCatcherEnable=" + this.f10063j + ", instanceId=" + m10905a(this.f10066m) + '}';
        } catch (Exception unused) {
            return "";
        }
    }
}
