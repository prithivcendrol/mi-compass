package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0521d;
import androidx.core.content.res.C0528f;
import androidx.core.provider.C0602g;
import p063k.C1773f;

/* renamed from: androidx.core.graphics.d */
public class C0547d {

    /* renamed from: a */
    private static final C0569j f2553a;

    /* renamed from: b */
    private static final C1773f<String, Typeface> f2554b = new C1773f<>(16);

    /* renamed from: androidx.core.graphics.d$a */
    public static class C0548a extends C0602g.C0605c {

        /* renamed from: a */
        private C0528f.C0533e f2555a;

        public C0548a(C0528f.C0533e eVar) {
            this.f2555a = eVar;
        }

        /* renamed from: a */
        public void mo2608a(int i) {
            C0528f.C0533e eVar = this.f2555a;
            if (eVar != null) {
                eVar.m2216f(i);
            }
        }

        /* renamed from: b */
        public void mo2609b(Typeface typeface) {
            C0528f.C0533e eVar = this.f2555a;
            if (eVar != null) {
                eVar.m2217g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2553a = i >= 29 ? new C0568i() : i >= 28 ? new C0567h() : i >= 26 ? new C0566g() : C0565f.m2331j() ? new C0565f() : new C0564e();
    }

    /* renamed from: a */
    public static Typeface m2259a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m2260b(Context context, CancellationSignal cancellationSignal, C0602g.C0604b[] bVarArr, int i) {
        return f2553a.mo2620b(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m2261c(Context context, C0521d.C0523b bVar, Resources resources, int i, String str, int i2, int i3, C0528f.C0533e eVar, Handler handler, boolean z) {
        Typeface typeface;
        C0521d.C0523b bVar2 = bVar;
        C0528f.C0533e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C0521d.C0526e) {
            C0521d.C0526e eVar3 = (C0521d.C0526e) bVar2;
            Typeface g = m2265g(eVar3.mo2586c());
            if (g != null) {
                if (eVar2 != null) {
                    eVar2.mo2591d(g, handler2);
                }
                return g;
            }
            typeface = C0602g.m2448c(context, eVar3.mo2585b(), i3, !z ? eVar2 == null : eVar3.mo2584a() == 0, z ? eVar3.mo2587d() : -1, C0528f.C0533e.m2215e(handler), new C0548a(eVar2));
            Resources resources2 = resources;
            int i4 = i3;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f2553a.mo2619a(context, (C0521d.C0524c) bVar2, resources, i3);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.mo2591d(typeface, handler2);
                } else {
                    eVar2.mo2590c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f2554b.mo6145d(m2263e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m2262d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = f2553a.mo2621d(context, resources, i, str, i3);
        if (d != null) {
            f2554b.mo6145d(m2263e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    /* renamed from: e */
    private static String m2263e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m2264f(Resources resources, int i, String str, int i2, int i3) {
        return f2554b.mo6144c(m2263e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m2265g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
