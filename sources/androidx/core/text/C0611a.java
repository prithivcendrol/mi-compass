package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
public final class C0611a {

    /* renamed from: androidx.core.text.a$a */
    static class C0612a {
        /* renamed from: a */
        static ULocale m2464a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        static ULocale m2465b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m2466c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    /* renamed from: a */
    public static String m2463a(Locale locale) {
        return C0612a.m2466c(C0612a.m2464a(C0612a.m2465b(locale)));
    }
}
