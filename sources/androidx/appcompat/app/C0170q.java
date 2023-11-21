package androidx.appcompat.app;

import androidx.core.p008os.C0581f;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: androidx.appcompat.app.q */
final class C0170q {
    /* renamed from: a */
    private static C0581f m628a(C0581f fVar, C0581f fVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < fVar.mo2642f() + fVar2.mo2642f()) {
            Locale c = i < fVar.mo2642f() ? fVar.mo2639c(i) : fVar2.mo2639c(i - fVar.mo2642f());
            if (c != null) {
                linkedHashSet.add(c);
            }
            i++;
        }
        return C0581f.m2394a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    static C0581f m629b(C0581f fVar, C0581f fVar2) {
        return (fVar == null || fVar.mo2640e()) ? C0581f.m2396d() : m628a(fVar, fVar2);
    }
}
