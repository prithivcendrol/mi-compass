package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C0521d;
import androidx.core.provider.C0602g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.j */
class C0569j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0521d.C0524c> f2583a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.j$a */
    class C0570a implements C0571b<C0602g.C0604b> {
        C0570a() {
        }

        /* renamed from: c */
        public int mo2632a(C0602g.C0604b bVar) {
            return bVar.mo2677e();
        }

        /* renamed from: d */
        public boolean mo2633b(C0602g.C0604b bVar) {
            return bVar.mo2678f();
        }
    }

    /* renamed from: androidx.core.graphics.j$b */
    private interface C0571b<T> {
        /* renamed from: a */
        int mo2632a(T t);

        /* renamed from: b */
        boolean mo2633b(T t);
    }

    C0569j() {
    }

    /* renamed from: e */
    private static <T> T m2360e(T[] tArr, int i, C0571b<T> bVar) {
        return m2361f(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    /* renamed from: f */
    private static <T> T m2361f(T[] tArr, int i, boolean z, C0571b<T> bVar) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.mo2632a(t2) - i) * 2) + (bVar.mo2633b(t2) == z ? 0 : 1);
            if (t == null || i2 > abs) {
                t = t2;
                i2 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo2619a(Context context, C0521d.C0524c cVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo2620b(Context context, CancellationSignal cancellationSignal, C0602g.C0604b[] bVarArr, int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Typeface mo2631c(Context context, InputStream inputStream) {
        File e = C0572k.m2377e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0572k.m2376d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo2621d(Context context, Resources resources, int i, String str, int i2) {
        File e = C0572k.m2377e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0572k.m2375c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0602g.C0604b mo2630g(C0602g.C0604b[] bVarArr, int i) {
        return (C0602g.C0604b) m2360e(bVarArr, i, new C0570a());
    }
}
