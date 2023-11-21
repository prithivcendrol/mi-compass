package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.C0547d;
import androidx.core.provider.C0602g;
import androidx.core.util.C0617a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p063k.C1773f;
import p063k.C1774g;

/* renamed from: androidx.core.provider.f */
class C0596f {

    /* renamed from: a */
    static final C1773f<String, Typeface> f2615a = new C1773f<>(16);

    /* renamed from: b */
    private static final ExecutorService f2616b = C0606h.m2460a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f2617c = new Object();

    /* renamed from: d */
    static final C1774g<String, ArrayList<C0617a<C0601e>>> f2618d = new C1774g<>();

    /* renamed from: androidx.core.provider.f$a */
    class C0597a implements Callable<C0601e> {

        /* renamed from: a */
        final /* synthetic */ String f2619a;

        /* renamed from: b */
        final /* synthetic */ Context f2620b;

        /* renamed from: c */
        final /* synthetic */ C0595e f2621c;

        /* renamed from: d */
        final /* synthetic */ int f2622d;

        C0597a(String str, Context context, C0595e eVar, int i) {
            this.f2619a = str;
            this.f2620b = context;
            this.f2621c = eVar;
            this.f2622d = i;
        }

        /* renamed from: a */
        public C0601e call() {
            return C0596f.m2438c(this.f2619a, this.f2620b, this.f2621c, this.f2622d);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    class C0598b implements C0617a<C0601e> {

        /* renamed from: a */
        final /* synthetic */ C0588a f2623a;

        C0598b(C0588a aVar) {
            this.f2623a = aVar;
        }

        /* renamed from: a */
        public void accept(C0601e eVar) {
            if (eVar == null) {
                eVar = new C0601e(-3);
            }
            this.f2623a.mo2654b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    class C0599c implements Callable<C0601e> {

        /* renamed from: a */
        final /* synthetic */ String f2624a;

        /* renamed from: b */
        final /* synthetic */ Context f2625b;

        /* renamed from: c */
        final /* synthetic */ C0595e f2626c;

        /* renamed from: d */
        final /* synthetic */ int f2627d;

        C0599c(String str, Context context, C0595e eVar, int i) {
            this.f2624a = str;
            this.f2625b = context;
            this.f2626c = eVar;
            this.f2627d = i;
        }

        /* renamed from: a */
        public C0601e call() {
            try {
                return C0596f.m2438c(this.f2624a, this.f2625b, this.f2626c, this.f2627d);
            } catch (Throwable unused) {
                return new C0601e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    class C0600d implements C0617a<C0601e> {

        /* renamed from: a */
        final /* synthetic */ String f2628a;

        C0600d(String str) {
            this.f2628a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C0617a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.C0596f.C0601e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C0596f.f2617c
                monitor-enter(r0)
                k.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r1 = androidx.core.provider.C0596f.f2618d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f2628a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f2628a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.C0617a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0596f.C0600d.accept(androidx.core.provider.f$e):void");
        }
    }

    /* renamed from: androidx.core.provider.f$e */
    static final class C0601e {

        /* renamed from: a */
        final Typeface f2629a;

        /* renamed from: b */
        final int f2630b;

        C0601e(int i) {
            this.f2629a = null;
            this.f2630b = i;
        }

        @SuppressLint({"WrongConstant"})
        C0601e(Typeface typeface) {
            this.f2629a = typeface;
            this.f2630b = 0;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo2671a() {
            return this.f2630b == 0;
        }
    }

    /* renamed from: a */
    private static String m2436a(C0595e eVar, int i) {
        return eVar.mo2660d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m2437b(C0602g.C0603a aVar) {
        int i = 1;
        if (aVar.mo2673c() != 0) {
            return aVar.mo2673c() != 1 ? -3 : -2;
        }
        C0602g.C0604b[] b = aVar.mo2672b();
        if (!(b == null || b.length == 0)) {
            int length = b.length;
            i = 0;
            int i2 = 0;
            while (i2 < length) {
                int b2 = b[i2].mo2674b();
                if (b2 == 0) {
                    i2++;
                } else if (b2 < 0) {
                    return -3;
                } else {
                    return b2;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C0601e m2438c(String str, Context context, C0595e eVar, int i) {
        C1773f<String, Typeface> fVar = f2615a;
        Typeface c = fVar.mo6144c(str);
        if (c != null) {
            return new C0601e(c);
        }
        try {
            C0602g.C0603a e = C0593d.m2424e(context, eVar, (CancellationSignal) null);
            int b = m2437b(e);
            if (b != 0) {
                return new C0601e(b);
            }
            Typeface b2 = C0547d.m2260b(context, (CancellationSignal) null, e.mo2672b(), i);
            if (b2 == null) {
                return new C0601e(-3);
            }
            fVar.mo6145d(str, b2);
            return new C0601e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0601e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new androidx.core.provider.C0596f.C0599c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f2616b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        androidx.core.provider.C0606h.m2461b(r8, r9, new androidx.core.provider.C0596f.C0600d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m2439d(android.content.Context r5, androidx.core.provider.C0595e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.C0588a r9) {
        /*
            java.lang.String r0 = m2436a(r6, r7)
            k.f<java.lang.String, android.graphics.Typeface> r1 = f2615a
            java.lang.Object r1 = r1.mo6144c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo2654b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f2617c
            monitor-enter(r9)
            k.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r2 = f2618d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f2616b
        L_0x0044:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.C0606h.m2461b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0596f.m2439d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m2440e(Context context, C0595e eVar, C0588a aVar, int i, int i2) {
        String a = m2436a(eVar, i);
        Typeface c = f2615a.mo6144c(a);
        if (c != null) {
            aVar.mo2654b(new C0601e(c));
            return c;
        } else if (i2 == -1) {
            C0601e c2 = m2438c(a, context, eVar, i);
            aVar.mo2654b(c2);
            return c2.f2629a;
        } else {
            try {
                C0601e eVar2 = (C0601e) C0606h.m2462c(f2616b, new C0597a(a, context, eVar, i), i2);
                aVar.mo2654b(eVar2);
                return eVar2.f2629a;
            } catch (InterruptedException unused) {
                aVar.mo2654b(new C0601e(-3));
                return null;
            }
        }
    }
}
