package androidx.emoji2.text;

import android.content.Context;
import androidx.core.p008os.C0586i;
import androidx.emoji2.text.C0854e;
import androidx.lifecycle.C1016b;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1263a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p046h0.C1620a;

public class EmojiCompatInitializer implements C1620a<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C0841a extends C0854e.C0858c {
        protected C0841a(Context context) {
            super(new C0842b(context));
            mo3108b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C0842b implements C0854e.C0862g {

        /* renamed from: a */
        private final Context f2896a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class C0843a extends C0854e.C0863h {

            /* renamed from: a */
            final /* synthetic */ C0854e.C0863h f2897a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f2898b;

            C0843a(C0854e.C0863h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2897a = hVar;
                this.f2898b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo3080a(Throwable th) {
                try {
                    this.f2897a.mo3080a(th);
                } finally {
                    this.f2898b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo3081b(C0879m mVar) {
                try {
                    this.f2897a.mo3081b(mVar);
                } finally {
                    this.f2898b.shutdown();
                }
            }
        }

        C0842b(Context context) {
            this.f2896a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo3078a(C0854e.C0863h hVar) {
            ThreadPoolExecutor b = C0846b.m3367b("EmojiCompatInitializer");
            b.execute(new C0865f(this, hVar, b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m3361d(C0854e.C0863h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0871j a = C0848c.m3371a(this.f2896a);
                if (a != null) {
                    a.mo3131c(threadPoolExecutor);
                    a.mo3107a().mo3078a(new C0843a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo3080a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C0844c implements Runnable {
        C0844c() {
        }

        public void run() {
            try {
                C0586i.m2412a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0854e.m3393h()) {
                    C0854e.m3389b().mo3093k();
                }
            } finally {
                C0586i.m2413b();
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends C1620a<?>>> mo3072a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo3073b(Context context) {
        C0854e.m3392g(new C0841a(context));
        mo3075d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3075d(Context context) {
        final C1035g c = ((C1048m) C1263a.m5807e(context).mo4993f(ProcessLifecycleInitializer.class)).mo252c();
        c.mo3790a(new C1016b() {
            /* renamed from: f */
            public void mo3077f(C1048m mVar) {
                EmojiCompatInitializer.this.mo3076e();
                c.mo3792c(this);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3076e() {
        C0846b.m3369d().postDelayed(new C0844c(), 500);
    }
}
