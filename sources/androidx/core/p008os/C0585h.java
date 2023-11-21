package androidx.core.p008os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.h */
final class C0585h implements C0584g {

    /* renamed from: a */
    private final LocaleList f2594a;

    C0585h(Object obj) {
        this.f2594a = (LocaleList) obj;
    }

    /* renamed from: a */
    public String mo2646a() {
        return this.f2594a.toLanguageTags();
    }

    /* renamed from: b */
    public Object mo2647b() {
        return this.f2594a;
    }

    public boolean equals(Object obj) {
        return this.f2594a.equals(((C0584g) obj).mo2647b());
    }

    public Locale get(int i) {
        return this.f2594a.get(i);
    }

    public int hashCode() {
        return this.f2594a.hashCode();
    }

    public boolean isEmpty() {
        return this.f2594a.isEmpty();
    }

    public int size() {
        return this.f2594a.size();
    }

    public String toString() {
        return this.f2594a.toString();
    }
}
