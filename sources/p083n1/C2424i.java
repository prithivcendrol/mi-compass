package p083n1;

/* renamed from: n1.i */
public final class C2424i implements C2416b {

    /* renamed from: a */
    private final Class<?> f9436a;

    /* renamed from: b */
    private final String f9437b;

    public C2424i(Class<?> cls, String str) {
        C2422g.m10285e(cls, "jClass");
        C2422g.m10285e(str, "moduleName");
        this.f9436a = cls;
        this.f9437b = str;
    }

    /* renamed from: a */
    public Class<?> mo9320a() {
        return this.f9436a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2424i) && C2422g.m10281a(mo9320a(), ((C2424i) obj).mo9320a());
    }

    public int hashCode() {
        return mo9320a().hashCode();
    }

    public String toString() {
        return mo9320a().toString() + " (Kotlin reflection is not available)";
    }
}
