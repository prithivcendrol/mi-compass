package p145z0;

import android.content.Context;
import p002a1.C0013c;
import p002a1.C0021j;
import p140y0.C2931q;
import p140y0.C2933s;
import p140y0.C2934t;
import p140y0.C2939x;

/* renamed from: z0.a */
public class C2964a {

    /* renamed from: c */
    private static final String f11197c = "a";

    /* renamed from: d */
    private static volatile C2964a f11198d;

    /* renamed from: a */
    private volatile boolean f11199a = false;

    /* renamed from: b */
    private volatile String f11200b = "";

    /* renamed from: b */
    public static C2964a m12260b() {
        if (f11198d == null) {
            synchronized (C2964a.class) {
                if (f11198d == null) {
                    f11198d = new C2964a();
                }
            }
        }
        return f11198d;
    }

    /* renamed from: a */
    public String mo10279a(Context context) {
        synchronized (this.f11200b) {
            if (C2939x.m12185a()) {
                if (!C2933s.f11129a) {
                    C2933s.m12144f(f11197c, "getOaid() throw exception : Don't use it on the main thread");
                    return "";
                }
                throw new IllegalStateException("Don't use it on the main thread");
            } else if (this.f11200b != null && !this.f11200b.equals("")) {
                String str = this.f11200b;
                return str;
            } else if (this.f11199a) {
                String str2 = this.f11200b;
                return str2;
            } else if (C2934t.m12158j()) {
                this.f11200b = C2931q.m12131b(context);
                String str3 = this.f11200b;
                return str3;
            } else {
                String a = new C0021j().mo27a(context);
                if (a == null || a.equals("")) {
                    String a2 = new C0013c().mo16a(context);
                    if (a2 == null || a2.equals("")) {
                        this.f11199a = true;
                        String str4 = this.f11200b;
                        return str4;
                    }
                    this.f11200b = a2;
                    return a2;
                }
                this.f11200b = a;
                return a;
            }
        }
    }
}
