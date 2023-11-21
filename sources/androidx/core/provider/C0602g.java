package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0547d;
import androidx.core.util.C0623f;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.provider.g */
public class C0602g {

    /* renamed from: androidx.core.provider.g$a */
    public static class C0603a {

        /* renamed from: a */
        private final int f2631a;

        /* renamed from: b */
        private final C0604b[] f2632b;

        @Deprecated
        public C0603a(int i, C0604b[] bVarArr) {
            this.f2631a = i;
            this.f2632b = bVarArr;
        }

        /* renamed from: a */
        static C0603a m2449a(int i, C0604b[] bVarArr) {
            return new C0603a(i, bVarArr);
        }

        /* renamed from: b */
        public C0604b[] mo2672b() {
            return this.f2632b;
        }

        /* renamed from: c */
        public int mo2673c() {
            return this.f2631a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    public static class C0604b {

        /* renamed from: a */
        private final Uri f2633a;

        /* renamed from: b */
        private final int f2634b;

        /* renamed from: c */
        private final int f2635c;

        /* renamed from: d */
        private final boolean f2636d;

        /* renamed from: e */
        private final int f2637e;

        @Deprecated
        public C0604b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2633a = (Uri) C0623f.m2495f(uri);
            this.f2634b = i;
            this.f2635c = i2;
            this.f2636d = z;
            this.f2637e = i3;
        }

        /* renamed from: a */
        static C0604b m2452a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0604b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo2674b() {
            return this.f2637e;
        }

        /* renamed from: c */
        public int mo2675c() {
            return this.f2634b;
        }

        /* renamed from: d */
        public Uri mo2676d() {
            return this.f2633a;
        }

        /* renamed from: e */
        public int mo2677e() {
            return this.f2635c;
        }

        /* renamed from: f */
        public boolean mo2678f() {
            return this.f2636d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    public static class C0605c {
        /* renamed from: a */
        public void mo2608a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo2609b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m2446a(Context context, CancellationSignal cancellationSignal, C0604b[] bVarArr) {
        return C0547d.m2260b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C0603a m2447b(Context context, CancellationSignal cancellationSignal, C0595e eVar) {
        return C0593d.m2424e(context, eVar, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m2448c(Context context, C0595e eVar, int i, boolean z, int i2, Handler handler, C0605c cVar) {
        C0588a aVar = new C0588a(cVar, handler);
        return z ? C0596f.m2440e(context, eVar, aVar, i, i2) : C0596f.m2439d(context, eVar, i, (Executor) null, aVar);
    }
}
