package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.core.util.C0618b;
import androidx.lifecycle.C1019c0;
import androidx.lifecycle.C1021d0;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1054r;
import androidx.lifecycle.C1055s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p028e0.C1513a;
import p063k.C1775h;

/* renamed from: androidx.loader.app.b */
class C1075b extends C1074a {

    /* renamed from: c */
    static boolean f3519c = false;

    /* renamed from: a */
    private final C1048m f3520a;

    /* renamed from: b */
    private final C1077b f3521b;

    /* renamed from: androidx.loader.app.b$a */
    public static class C1076a<D> extends C1054r<D> {

        /* renamed from: l */
        private final int f3522l;

        /* renamed from: m */
        private final Bundle f3523m;

        /* renamed from: n */
        private C1048m f3524n;

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo3741f() {
            if (C1075b.f3519c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo3742g() {
            if (C1075b.f3519c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* renamed from: h */
        public void mo3743h(C1055s<? super D> sVar) {
            super.mo3743h(sVar);
            this.f3524n = null;
        }

        /* renamed from: i */
        public void mo3744i(D d) {
            super.mo3744i(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C1513a<D> mo3842j(boolean z) {
            if (C1075b.f3519c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: k */
        public void mo3843k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3522l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3523m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3844l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3522l);
            sb.append(" : ");
            C0618b.m2479a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    static class C1077b extends C1019c0 {

        /* renamed from: f */
        private static final C1021d0.C1025b f3525f = new C1078a();

        /* renamed from: d */
        private C1775h<C1076a> f3526d = new C1775h<>();

        /* renamed from: e */
        private boolean f3527e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class C1078a implements C1021d0.C1025b {
            C1078a() {
            }

            /* renamed from: a */
            public <T extends C1019c0> T mo3734a(Class<T> cls) {
                return new C1077b();
            }
        }

        C1077b() {
        }

        /* renamed from: f */
        static C1077b m4312f(C1034f0 f0Var) {
            return (C1077b) new C1021d0(f0Var, f3525f).mo3781a(C1077b.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3719d() {
            super.mo3719d();
            int j = this.f3526d.mo6184j();
            for (int i = 0; i < j; i++) {
                this.f3526d.mo6185k(i).mo3842j(true);
            }
            this.f3526d.mo6176b();
        }

        /* renamed from: e */
        public void mo3846e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3526d.mo6184j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f3526d.mo6184j(); i++) {
                    C1076a k = this.f3526d.mo6185k(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3526d.mo6182h(i));
                    printWriter.print(": ");
                    printWriter.println(k.toString());
                    k.mo3843k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3847g() {
            int j = this.f3526d.mo6184j();
            for (int i = 0; i < j; i++) {
                this.f3526d.mo6185k(i).mo3844l();
            }
        }
    }

    C1075b(C1048m mVar, C1034f0 f0Var) {
        this.f3520a = mVar;
        this.f3521b = C1077b.m4312f(f0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo3839a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3521b.mo3846e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo3840c() {
        this.f3521b.mo3847g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0618b.m2479a(this.f3520a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
