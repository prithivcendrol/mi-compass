package p083n1;

import java.io.Serializable;
import p106r1.C2614a;
import p106r1.C2616c;

/* renamed from: n1.a */
public abstract class C2414a implements C2614a, Serializable {

    /* renamed from: j */
    public static final Object f9419j = C2415a.f9426d;

    /* renamed from: d */
    private transient C2614a f9420d;

    /* renamed from: e */
    protected final Object f9421e;

    /* renamed from: f */
    private final Class f9422f;

    /* renamed from: g */
    private final String f9423g;

    /* renamed from: h */
    private final String f9424h;

    /* renamed from: i */
    private final boolean f9425i;

    /* renamed from: n1.a$a */
    private static class C2415a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final C2415a f9426d = new C2415a();

        private C2415a() {
        }
    }

    public C2414a() {
        this(f9419j);
    }

    protected C2414a(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C2414a(Object obj, Class cls, String str, String str2, boolean z) {
        this.f9421e = obj;
        this.f9422f = cls;
        this.f9423g = str;
        this.f9424h = str2;
        this.f9425i = z;
    }

    /* renamed from: a */
    public C2614a mo9314a() {
        C2614a aVar = this.f9420d;
        if (aVar != null) {
            return aVar;
        }
        C2614a c = mo9315c();
        this.f9420d = c;
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C2614a mo9315c();

    /* renamed from: e */
    public Object mo9316e() {
        return this.f9421e;
    }

    /* renamed from: f */
    public String mo9317f() {
        return this.f9423g;
    }

    /* renamed from: i */
    public C2616c mo9318i() {
        Class cls = this.f9422f;
        if (cls == null) {
            return null;
        }
        return this.f9425i ? C2429n.m10301b(cls) : C2429n.m10300a(cls);
    }

    /* renamed from: j */
    public String mo9319j() {
        return this.f9424h;
    }
}
