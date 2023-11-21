package p041g1;

import java.lang.reflect.Field;
import p083n1.C2422g;

/* renamed from: g1.f */
public final class C1600f {
    /* renamed from: a */
    private static final void m6832a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C1599e m6833b(C1595a aVar) {
        return (C1599e) aVar.getClass().getAnnotation(C1599e.class);
    }

    /* renamed from: c */
    private static final int m6834c(C1595a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m6835d(C1595a aVar) {
        String str;
        C2422g.m10285e(aVar, "<this>");
        C1599e b = m6833b(aVar);
        if (b == null) {
            return null;
        }
        m6832a(1, b.mo5755v());
        int c = m6834c(aVar);
        int i = c < 0 ? -1 : b.mo5753l()[c];
        String b2 = C1602h.f6380a.mo5756b(aVar);
        if (b2 == null) {
            str = b.mo5751c();
        } else {
            str = b2 + '/' + b.mo5751c();
        }
        return new StackTraceElement(str, b.mo5754m(), b.mo5752f(), i);
    }
}
