package p100q0;

import android.content.Context;
import java.util.Map;
import p105r0.C2603k;
import p130w0.C2874a;
import p140y0.C2933s;

/* renamed from: q0.g */
public class C2568g {

    /* renamed from: b */
    private static boolean f10090b;

    /* renamed from: c */
    private static boolean f10091c;

    /* renamed from: a */
    private C2603k f10092a;

    /* renamed from: q0.g$a */
    public interface C2569a {
        /* renamed from: a */
        Map<String, Object> mo9828a(String str);
    }

    /* renamed from: q0.g$b */
    public interface C2570b {
        /* renamed from: a */
        boolean mo9825a(String str);
    }

    /* renamed from: q0.g$c */
    public enum C2571c {
        APP("app"),
        PLUGIN("plugin"),
        SDK("sdk");
        

        /* renamed from: d */
        private String f10097d;

        private C2571c(String str) {
            this.f10097d = str;
        }

        /* renamed from: a */
        public String mo9829a() {
            return this.f10097d;
        }
    }

    /* renamed from: q0.g$d */
    public enum C2572d {
        NOT_CONNECTED("NONE"),
        MOBILE_2G("2G"),
        MOBILE_3G("3G"),
        MOBILE_4G("4G"),
        MOBILE_5G("5G"),
        WIFI("WIFI"),
        ETHERNET("ETHERNET"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: d */
        private String f10107d;

        private C2572d(String str) {
            this.f10107d = str;
        }

        public String toString() {
            return this.f10107d;
        }
    }

    private C2568g(Context context, C2561b bVar) {
        C2874a.m11877b(context.getApplicationContext());
        this.f10092a = new C2603k(context, bVar);
        mo9826e(new C2567f());
    }

    /* renamed from: a */
    public static C2568g m10960a(Context context, C2561b bVar) {
        return new C2568g(context, bVar);
    }

    /* renamed from: b */
    public static boolean m10961b() {
        return f10090b;
    }

    /* renamed from: c */
    public static boolean m10962c() {
        return f10091c;
    }

    /* renamed from: d */
    public static void m10963d(boolean z) {
        C2933s.f11129a = z;
    }

    /* renamed from: f */
    public static void m10964f() {
        f10091c = true;
    }

    /* renamed from: e */
    public void mo9826e(C2570b bVar) {
        this.f10092a.mo9868g(bVar);
    }

    /* renamed from: g */
    public void mo9827g(String str, Map<String, Object> map) {
        this.f10092a.mo9867e(str, map);
    }
}
