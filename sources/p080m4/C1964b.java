package p080m4;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p019c3.C1358a;
import p019c3.C1359b;
import p019c3.C1360c;
import p043g3.C1608a;
import p043g3.C1609b;
import p043g3.C1610c;

/* renamed from: m4.b */
public class C1964b {

    /* renamed from: m4.b$b */
    public static class C1966b {

        /* renamed from: a */
        private C1359b f7403a;

        /* renamed from: b */
        private boolean f7404b;

        /* renamed from: c */
        private ExecutorService f7405c;

        /* renamed from: m4.b$b$a */
        public static class C1967a extends C1608a implements Runnable {

            /* renamed from: e */
            private C1358a f7406e;

            /* renamed from: f */
            private String f7407f;

            /* renamed from: g */
            private String f7408g;

            /* renamed from: h */
            private Throwable f7409h;

            /* renamed from: i */
            private C1609b f7410i;

            /* renamed from: j */
            private C1359b f7411j;

            /* renamed from: f */
            public static C1967a m8018f() {
                return (C1967a) C1610c.m6850a(C1967a.class);
            }

            /* renamed from: a */
            public void mo5763a(Appendable appendable) {
            }

            /* renamed from: c */
            public Throwable mo5764c() {
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public void mo5762e() {
                this.f7411j = null;
                this.f7406e = null;
                this.f7407f = null;
                this.f7408g = null;
                this.f7409h = null;
                C1609b bVar = this.f7410i;
                if (bVar != null) {
                    bVar.mo5761d();
                    this.f7410i = null;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public void mo6605g(C1359b bVar, C1358a aVar, String str, String str2, Throwable th, C1609b bVar2) {
                this.f7411j = bVar;
                this.f7406e = aVar;
                this.f7407f = str;
                this.f7408g = str2;
                this.f7409h = th;
                this.f7410i = bVar2;
            }

            public void run() {
                C1359b bVar = this.f7411j;
                if (bVar == null) {
                    Log.e("LogcatFacade", "mLogger is null");
                } else {
                    C1609b bVar2 = this.f7410i;
                    if (bVar2 == null) {
                        bVar.mo5201d(this.f7406e, this.f7407f, this.f7408g, this.f7409h);
                    } else {
                        bVar.mo5200c(this.f7406e, this.f7407f, bVar2);
                    }
                }
                mo5761d();
            }
        }

        private C1966b(C1359b bVar) {
            this(bVar, false);
        }

        private C1966b(C1359b bVar, boolean z) {
            this.f7403a = bVar;
            this.f7404b = z;
            if (z) {
                this.f7405c = Executors.newSingleThreadExecutor();
            }
        }

        /* renamed from: c */
        private void m8014c(C1358a aVar, String str, String str2, Throwable th) {
            mo6603a(aVar, str, str2, th, (C1609b) null);
        }

        /* renamed from: d */
        private void m8015d(C1358a aVar, String str, String str2, Throwable th, C1609b bVar) {
            C1359b bVar2 = this.f7403a;
            if (bVar2 == null) {
                Log.e("LogcatFacade", "mLogger is null");
            } else if (bVar == null) {
                bVar2.mo5201d(aVar, str, str2, th);
            } else {
                bVar2.mo5200c(aVar, str, bVar);
                bVar.mo5761d();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6603a(C1358a aVar, String str, String str2, Throwable th, C1609b bVar) {
            if (this.f7404b) {
                C1967a f = C1967a.m8018f();
                f.mo6605g(this.f7403a, aVar, str, str2, th, bVar);
                this.f7405c.execute(f);
                return;
            }
            m8015d(aVar, str, str2, th, bVar);
        }

        /* renamed from: b */
        public void mo6604b(String str, String str2) {
            m8014c(C1358a.INFO, str, str2, (Throwable) null);
        }
    }

    /* renamed from: m4.b$c */
    private static class C1968c {

        /* renamed from: a */
        private static volatile C1968c f7412a;

        /* renamed from: b */
        private static C1966b f7413b;

        private C1968c(Context context) {
            f7413b = new C1966b(C1360c.m5998a(context));
        }

        /* renamed from: a */
        static void m8023a(Context context) {
            if (f7412a == null) {
                synchronized (C1968c.class) {
                    if (f7412a == null) {
                        f7412a = new C1968c(context);
                    }
                }
            }
        }

        /* renamed from: b */
        static C1966b m8024b() {
            return f7413b;
        }
    }

    /* renamed from: m4.b$d */
    private static class C1969d extends C1966b {
        private C1969d() {
            super((C1359b) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6603a(C1358a aVar, String str, String str2, Throwable th, C1609b bVar) {
            C1971f.f7415a.mo6603a(aVar, str, str2, th, bVar);
            C1968c.m8024b().mo6603a(aVar, str, str2, th, bVar);
        }
    }

    /* renamed from: m4.b$e */
    private static class C1970e {

        /* renamed from: a */
        static final C1966b f7414a = new C1969d();
    }

    /* renamed from: m4.b$f */
    private static class C1971f {

        /* renamed from: a */
        static final C1966b f7415a = new C1966b(C1360c.m6000c());
    }

    /* renamed from: a */
    public static C1966b m8013a(Context context) {
        C1968c.m8023a(context);
        return C1970e.f7414a;
    }
}
