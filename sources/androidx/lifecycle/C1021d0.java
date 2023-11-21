package androidx.lifecycle;

import android.app.Application;
import p022d0.C1457a;
import p022d0.C1462d;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: androidx.lifecycle.d0 */
public class C1021d0 {

    /* renamed from: a */
    private final C1034f0 f3460a;

    /* renamed from: b */
    private final C1025b f3461b;

    /* renamed from: c */
    private final C1457a f3462c;

    /* renamed from: androidx.lifecycle.d0$a */
    public static class C1022a extends C1027c {

        /* renamed from: d */
        public static final C1023a f3463d = new C1023a((C2420e) null);

        /* renamed from: e */
        public static final C1457a.C1459b<Application> f3464e = C1023a.C1024a.f3465a;

        /* renamed from: androidx.lifecycle.d0$a$a */
        public static final class C1023a {

            /* renamed from: androidx.lifecycle.d0$a$a$a */
            private static final class C1024a implements C1457a.C1459b<Application> {

                /* renamed from: a */
                public static final C1024a f3465a = new C1024a();

                private C1024a() {
                }
            }

            private C1023a() {
            }

            public /* synthetic */ C1023a(C2420e eVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.d0$b */
    public interface C1025b {

        /* renamed from: a */
        public static final C1026a f3466a = C1026a.f3467a;

        /* renamed from: androidx.lifecycle.d0$b$a */
        public static final class C1026a {

            /* renamed from: a */
            static final /* synthetic */ C1026a f3467a = new C1026a();

            private C1026a() {
            }
        }

        /* renamed from: a */
        <T extends C1019c0> T mo3734a(Class<T> cls) {
            C2422g.m10285e(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        /* renamed from: b */
        <T extends C1019c0> T mo3783b(Class<T> cls, C1457a aVar) {
            C2422g.m10285e(cls, "modelClass");
            C2422g.m10285e(aVar, "extras");
            return mo3734a(cls);
        }
    }

    /* renamed from: androidx.lifecycle.d0$c */
    public static class C1027c implements C1025b {

        /* renamed from: b */
        public static final C1028a f3468b = new C1028a((C2420e) null);

        /* renamed from: c */
        public static final C1457a.C1459b<String> f3469c = C1028a.C1029a.f3470a;

        /* renamed from: androidx.lifecycle.d0$c$a */
        public static final class C1028a {

            /* renamed from: androidx.lifecycle.d0$c$a$a */
            private static final class C1029a implements C1457a.C1459b<String> {

                /* renamed from: a */
                public static final C1029a f3470a = new C1029a();

                private C1029a() {
                }
            }

            private C1028a() {
            }

            public /* synthetic */ C1028a(C2420e eVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.d0$d */
    public static class C1030d {
        /* renamed from: a */
        public void mo3784a(C1019c0 c0Var) {
            C2422g.m10285e(c0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1021d0(C1034f0 f0Var, C1025b bVar) {
        this(f0Var, bVar, (C1457a) null, 4, (C2420e) null);
        C2422g.m10285e(f0Var, "store");
        C2422g.m10285e(bVar, "factory");
    }

    public C1021d0(C1034f0 f0Var, C1025b bVar, C1457a aVar) {
        C2422g.m10285e(f0Var, "store");
        C2422g.m10285e(bVar, "factory");
        C2422g.m10285e(aVar, "defaultCreationExtras");
        this.f3460a = f0Var;
        this.f3461b = bVar;
        this.f3462c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1021d0(C1034f0 f0Var, C1025b bVar, C1457a aVar, int i, C2420e eVar) {
        this(f0Var, bVar, (i & 4) != 0 ? C1457a.C1458a.f6103b : aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1021d0(androidx.lifecycle.C1039g0 r3, androidx.lifecycle.C1021d0.C1025b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            p083n1.C2422g.m10285e(r3, r0)
            java.lang.String r0 = "factory"
            p083n1.C2422g.m10285e(r4, r0)
            androidx.lifecycle.f0 r0 = r3.mo243H()
            java.lang.String r1 = "owner.viewModelStore"
            p083n1.C2422g.m10284d(r0, r1)
            d0.a r3 = androidx.lifecycle.C1032e0.m4217a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1021d0.<init>(androidx.lifecycle.g0, androidx.lifecycle.d0$b):void");
    }

    /* renamed from: a */
    public <T extends C1019c0> T mo3781a(Class<T> cls) {
        C2422g.m10285e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo3782b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C1019c0> T mo3782b(String str, Class<T> cls) {
        T t;
        C2422g.m10285e(str, "key");
        C2422g.m10285e(cls, "modelClass");
        T b = this.f3460a.mo3787b(str);
        if (cls.isInstance(b)) {
            C1025b bVar = this.f3461b;
            C1030d dVar = bVar instanceof C1030d ? (C1030d) bVar : null;
            if (dVar != null) {
                C2422g.m10284d(b, "viewModel");
                dVar.mo3784a(b);
            }
            if (b != null) {
                return b;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        C1462d dVar2 = new C1462d(this.f3462c);
        dVar2.mo5481b(C1027c.f3469c, str);
        try {
            t = this.f3461b.mo3783b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t = this.f3461b.mo3734a(cls);
        }
        this.f3460a.mo3789d(str, t);
        return t;
    }
}
