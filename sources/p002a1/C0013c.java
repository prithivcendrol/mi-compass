package p002a1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import p140y0.C2912b;
import p140y0.C2931q;
import p140y0.C2933s;

/* renamed from: a1.c */
public class C0013c {

    /* renamed from: a */
    static String f27a = "c";

    /* renamed from: a1.c$a */
    enum C0014a {
        asus("ASUS"),
        huawei("HUAWEI"),
        lenovo("LENOVO"),
        motolora("MOTOLORA"),
        meizu("MEIZU"),
        oppo("OPPO"),
        samsung("SAMSUNG"),
        numbia("NUBIA"),
        vivo("VIVO"),
        xiaomi("XIAOMI"),
        redmi("REDMI"),
        blackshark("BLACKSHARK"),
        oneplus("ONEPLUS"),
        zte("ZTE"),
        freemeos("FERRMEOS"),
        ssui("SSUI");
        

        /* renamed from: d */
        public final String f45d;

        private C0014a(String str) {
            this.f45d = str;
        }

        /* renamed from: a */
        public static C0014a[] m14a() {
            return (C0014a[]) f44u.clone();
        }

        /* renamed from: b */
        static C0014a m15b(String str) {
            for (C0014a aVar : m14a()) {
                if (aVar.f45d.equals(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    private static String m9e() {
        return Build.MANUFACTURER.toUpperCase();
    }

    /* renamed from: a */
    public String mo16a(Context context) {
        try {
            return mo17b(context, m9e());
        } catch (Exception e) {
            C2933s.m12141c(f27a, e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo17b(Context context, String str) {
        C0014a b = C0014a.m15b(str);
        if (mo18c()) {
            b = C0014a.freemeos;
        }
        if (mo19d()) {
            b = C0014a.ssui;
        }
        if (b != null) {
            switch (C0015d.f46a[b.ordinal()]) {
                case 1:
                    return new C0011a().mo13a(context);
                case 2:
                    return new C0016e().mo20a(context);
                case 3:
                case 4:
                    return new C0018g().mo23a(context);
                case 5:
                    return new C0020i().mo26a(context);
                case 6:
                    return new C0027n().mo33a(context);
                case 7:
                    return new C0029p().mo36a(context);
                case 8:
                    return new C0024k().mo29a(context);
                case 9:
                    return new C0031r().mo39a(context);
                case 10:
                case 11:
                case 12:
                    return C2931q.m12131b(context);
                case 13:
                    return new C0025l().mo30a(context);
                case 14:
                case 15:
                case 16:
                    return new C0032s().mo40a(context);
                default:
                    return "";
            }
        } else {
            throw new Exception(String.format("undefined oaid method of manufacturer %s", new Object[]{str}));
        }
    }

    /* renamed from: c */
    public boolean mo18c() {
        String a = C2912b.m12057a("ro.build.freeme.label");
        return !TextUtils.isEmpty(a) && a.equalsIgnoreCase("FREEMEOS");
    }

    /* renamed from: d */
    public boolean mo19d() {
        String a = C2912b.m12057a("ro.ssui.product");
        return !TextUtils.isEmpty(a) && !a.equalsIgnoreCase("unknown");
    }
}
