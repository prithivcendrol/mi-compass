package p089o1;

import java.util.Random;
import p083n1.C2422g;

/* renamed from: o1.b */
public final class C2490b extends C2489a {

    /* renamed from: f */
    private final C2491a f9700f = new C2491a();

    /* renamed from: o1.b$a */
    public static final class C2491a extends ThreadLocal<Random> {
        C2491a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo9619c() {
        Object obj = this.f9700f.get();
        C2422g.m10284d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
