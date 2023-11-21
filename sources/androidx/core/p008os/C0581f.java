package androidx.core.p008os;

import android.os.LocaleList;
import androidx.core.text.C0611a;
import java.util.Locale;

/* renamed from: androidx.core.os.f */
public final class C0581f {

    /* renamed from: b */
    private static final C0581f f2591b = m2394a(new Locale[0]);

    /* renamed from: a */
    private final C0584g f2592a;

    /* renamed from: androidx.core.os.f$a */
    static class C0582a {

        /* renamed from: a */
        private static final Locale[] f2593a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        static Locale m2402a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        private static boolean m2403b(Locale locale) {
            for (Locale equals : f2593a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        static boolean m2404c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m2403b(locale) || m2403b(locale2)) {
                return false;
            }
            String a = C0611a.m2463a(locale);
            if (!a.isEmpty()) {
                return a.equals(C0611a.m2463a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* renamed from: androidx.core.os.f$b */
    static class C0583b {
        /* renamed from: a */
        static LocaleList m2405a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m2406b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m2407c() {
            return LocaleList.getDefault();
        }
    }

    private C0581f(C0584g gVar) {
        this.f2592a = gVar;
    }

    /* renamed from: a */
    public static C0581f m2394a(Locale... localeArr) {
        return m2397h(C0583b.m2405a(localeArr));
    }

    /* renamed from: b */
    public static C0581f m2395b(String str) {
        if (str == null || str.isEmpty()) {
            return m2396d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C0582a.m2402a(split[i]);
        }
        return m2394a(localeArr);
    }

    /* renamed from: d */
    public static C0581f m2396d() {
        return f2591b;
    }

    /* renamed from: h */
    public static C0581f m2397h(LocaleList localeList) {
        return new C0581f(new C0585h(localeList));
    }

    /* renamed from: c */
    public Locale mo2639c(int i) {
        return this.f2592a.get(i);
    }

    /* renamed from: e */
    public boolean mo2640e() {
        return this.f2592a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0581f) && this.f2592a.equals(((C0581f) obj).f2592a);
    }

    /* renamed from: f */
    public int mo2642f() {
        return this.f2592a.size();
    }

    /* renamed from: g */
    public String mo2643g() {
        return this.f2592a.mo2646a();
    }

    public int hashCode() {
        return this.f2592a.hashCode();
    }

    public String toString() {
        return this.f2592a.toString();
    }
}
