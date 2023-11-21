package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.C0595e;
import androidx.core.provider.C0602g;
import androidx.core.util.C0623f;
import androidx.emoji2.text.C0854e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
public class C0871j extends C0854e.C0858c {

    /* renamed from: j */
    private static final C0872a f2961j = new C0872a();

    /* renamed from: androidx.emoji2.text.j$a */
    public static class C0872a {
        /* renamed from: a */
        public Typeface mo3132a(Context context, C0602g.C0604b bVar) {
            return C0602g.m2446a(context, (CancellationSignal) null, new C0602g.C0604b[]{bVar});
        }

        /* renamed from: b */
        public C0602g.C0603a mo3133b(Context context, C0595e eVar) {
            return C0602g.m2447b(context, (CancellationSignal) null, eVar);
        }

        /* renamed from: c */
        public void mo3134c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    private static class C0873b implements C0854e.C0862g {

        /* renamed from: a */
        private final Context f2962a;

        /* renamed from: b */
        private final C0595e f2963b;

        /* renamed from: c */
        private final C0872a f2964c;

        /* renamed from: d */
        private final Object f2965d = new Object();

        /* renamed from: e */
        private Handler f2966e;

        /* renamed from: f */
        private Executor f2967f;

        /* renamed from: g */
        private ThreadPoolExecutor f2968g;

        /* renamed from: h */
        C0854e.C0863h f2969h;

        /* renamed from: i */
        private ContentObserver f2970i;

        /* renamed from: j */
        private Runnable f2971j;

        C0873b(Context context, C0595e eVar, C0872a aVar) {
            C0623f.m2496g(context, "Context cannot be null");
            C0623f.m2496g(eVar, "FontRequest cannot be null");
            this.f2962a = context.getApplicationContext();
            this.f2963b = eVar;
            this.f2964c = aVar;
        }

        /* renamed from: b */
        private void m3462b() {
            synchronized (this.f2965d) {
                this.f2969h = null;
                ContentObserver contentObserver = this.f2970i;
                if (contentObserver != null) {
                    this.f2964c.mo3134c(this.f2962a, contentObserver);
                    this.f2970i = null;
                }
                Handler handler = this.f2966e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2971j);
                }
                this.f2966e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2968g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2967f = null;
                this.f2968g = null;
            }
        }

        /* renamed from: e */
        private C0602g.C0604b m3463e() {
            try {
                C0602g.C0603a b = this.f2964c.mo3133b(this.f2962a, this.f2963b);
                if (b.mo2673c() == 0) {
                    C0602g.C0604b[] b2 = b.mo2672b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo2673c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: a */
        public void mo3078a(C0854e.C0863h hVar) {
            C0623f.m2496g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2965d) {
                this.f2969h = hVar;
            }
            mo3136d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f2965d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.p008os.C0586i.m2412a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f2964c.mo3132a(r4.f2962a, r0);
            r0 = androidx.core.graphics.C0572k.m2378f(r4.f2962a, (android.os.CancellationSignal) null, r0.mo2676d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C0879m.m3480b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.p008os.C0586i.m2413b();
            r1 = r4.f2965d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f2969h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo3081b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            m3462b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.p008os.C0586i.m2413b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f2965d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f2969h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo3080a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            m3462b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = m3463e();
            r1 = r0.mo2674b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3135c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2965d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f2969h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.m3463e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo2674b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f2965d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p008os.C0586i.m2412a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f2964c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2962a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo3132a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2962a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.mo2676d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = androidx.core.graphics.C0572k.m2378f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.C0879m.m3480b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.p008os.C0586i.m2413b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f2965d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f2969h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo3081b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.m3462b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.p008os.C0586i.m2413b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f2965d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f2969h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo3080a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.m3462b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0871j.C0873b.mo3135c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3136d() {
            synchronized (this.f2965d) {
                if (this.f2969h != null) {
                    if (this.f2967f == null) {
                        ThreadPoolExecutor b = C0846b.m3367b("emojiCompat");
                        this.f2968g = b;
                        this.f2967f = b;
                    }
                    this.f2967f.execute(new C0874k(this));
                }
            }
        }

        /* renamed from: f */
        public void mo3137f(Executor executor) {
            synchronized (this.f2965d) {
                this.f2967f = executor;
            }
        }
    }

    public C0871j(Context context, C0595e eVar) {
        super(new C0873b(context, eVar, f2961j));
    }

    /* renamed from: c */
    public C0871j mo3131c(Executor executor) {
        ((C0873b) mo3107a()).mo3137f(executor);
        return this;
    }
}
