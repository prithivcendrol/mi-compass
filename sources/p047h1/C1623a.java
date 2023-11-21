package p047h1;

import java.lang.reflect.Method;
import p083n1.C2422g;
import p089o1.C2490b;
import p089o1.C2492c;

/* renamed from: h1.a */
public class C1623a {

    /* renamed from: h1.a$a */
    private static final class C1624a {

        /* renamed from: a */
        public static final C1624a f6452a = new C1624a();

        /* renamed from: b */
        public static final Method f6453b;

        /* renamed from: c */
        public static final Method f6454c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                h1.a$a r0 = new h1.a$a
                r0.<init>()
                f6452a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p083n1.C2422g.m10284d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p083n1.C2422g.m10281a(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                p083n1.C2422g.m10284d(r7, r8)
                java.lang.Object r7 = p023d1.C1473e.m6453g(r7)
                boolean r7 = p083n1.C2422g.m10281a(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f6453b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = p083n1.C2422g.m10281a(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f6454c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p047h1.C1623a.C1624a.<clinit>():void");
        }

        private C1624a() {
        }
    }

    /* renamed from: a */
    public void mo5799a(Throwable th, Throwable th2) {
        C2422g.m10285e(th, "cause");
        C2422g.m10285e(th2, "exception");
        Method method = C1624a.f6453b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C2492c mo5800b() {
        return new C2490b();
    }
}
