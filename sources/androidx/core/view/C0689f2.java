package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import androidx.core.graphics.C0543b;
import androidx.core.util.C0619c;
import androidx.core.util.C0623f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.f2 */
public class C0689f2 {

    /* renamed from: b */
    public static final C0689f2 f2763b = (Build.VERSION.SDK_INT >= 30 ? C0700k.f2793q : C0701l.f2794b);

    /* renamed from: a */
    private final C0701l f2764a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.f2$a */
    static class C0690a {

        /* renamed from: a */
        private static Field f2765a;

        /* renamed from: b */
        private static Field f2766b;

        /* renamed from: c */
        private static Field f2767c;

        /* renamed from: d */
        private static boolean f2768d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2765a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2766b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2767c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C0689f2 m2742a(View view) {
            if (f2768d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2765a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2766b.get(obj);
                        Rect rect2 = (Rect) f2767c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C0689f2 a = new C0691b().mo2883b(C0543b.m2253c(rect)).mo2884c(C0543b.m2253c(rect2)).mo2882a();
                            a.mo2879r(a);
                            a.mo2864d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.f2$b */
    public static final class C0691b {

        /* renamed from: a */
        private final C0695f f2769a;

        public C0691b() {
            int i = Build.VERSION.SDK_INT;
            this.f2769a = i >= 30 ? new C0694e() : i >= 29 ? new C0693d() : new C0692c();
        }

        public C0691b(C0689f2 f2Var) {
            int i = Build.VERSION.SDK_INT;
            this.f2769a = i >= 30 ? new C0694e(f2Var) : i >= 29 ? new C0693d(f2Var) : new C0692c(f2Var);
        }

        /* renamed from: a */
        public C0689f2 mo2882a() {
            return this.f2769a.mo2885b();
        }

        @Deprecated
        /* renamed from: b */
        public C0691b mo2883b(C0543b bVar) {
            this.f2769a.mo2886d(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0691b mo2884c(C0543b bVar) {
            this.f2769a.mo2887f(bVar);
            return this;
        }
    }

    /* renamed from: androidx.core.view.f2$c */
    private static class C0692c extends C0695f {

        /* renamed from: e */
        private static Field f2770e = null;

        /* renamed from: f */
        private static boolean f2771f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f2772g = null;

        /* renamed from: h */
        private static boolean f2773h = false;

        /* renamed from: c */
        private WindowInsets f2774c;

        /* renamed from: d */
        private C0543b f2775d;

        C0692c() {
            this.f2774c = m2746h();
        }

        C0692c(C0689f2 f2Var) {
            super(f2Var);
            this.f2774c = f2Var.mo2881t();
        }

        /* renamed from: h */
        private static WindowInsets m2746h() {
            if (!f2771f) {
                try {
                    f2770e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2771f = true;
            }
            Field field = f2770e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2773h) {
                try {
                    f2772g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2773h = true;
            }
            Constructor<WindowInsets> constructor = f2772g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0689f2 mo2885b() {
            mo2891a();
            C0689f2 u = C0689f2.m2721u(this.f2774c);
            u.mo2877p(this.f2778b);
            u.mo2880s(this.f2775d);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2886d(C0543b bVar) {
            this.f2775d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2887f(C0543b bVar) {
            WindowInsets windowInsets = this.f2774c;
            if (windowInsets != null) {
                this.f2774c = windowInsets.replaceSystemWindowInsets(bVar.f2548a, bVar.f2549b, bVar.f2550c, bVar.f2551d);
            }
        }
    }

    /* renamed from: androidx.core.view.f2$d */
    private static class C0693d extends C0695f {

        /* renamed from: c */
        final WindowInsets$Builder f2776c;

        C0693d() {
            this.f2776c = new WindowInsets$Builder();
        }

        C0693d(C0689f2 f2Var) {
            super(f2Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets t = f2Var.mo2881t();
            if (t == null) {
                windowInsets$Builder = new WindowInsets$Builder();
            }
            this.f2776c = windowInsets$Builder;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0689f2 mo2885b() {
            mo2891a();
            C0689f2 u = C0689f2.m2721u(this.f2776c.build());
            u.mo2877p(this.f2778b);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2888c(C0543b bVar) {
            this.f2776c.setMandatorySystemGestureInsets(bVar.mo2604e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2886d(C0543b bVar) {
            this.f2776c.setStableInsets(bVar.mo2604e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2889e(C0543b bVar) {
            this.f2776c.setSystemGestureInsets(bVar.mo2604e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2887f(C0543b bVar) {
            this.f2776c.setSystemWindowInsets(bVar.mo2604e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2890g(C0543b bVar) {
            this.f2776c.setTappableElementInsets(bVar.mo2604e());
        }
    }

    /* renamed from: androidx.core.view.f2$e */
    private static class C0694e extends C0693d {
        C0694e() {
        }

        C0694e(C0689f2 f2Var) {
            super(f2Var);
        }
    }

    /* renamed from: androidx.core.view.f2$f */
    private static class C0695f {

        /* renamed from: a */
        private final C0689f2 f2777a;

        /* renamed from: b */
        C0543b[] f2778b;

        C0695f() {
            this(new C0689f2((C0689f2) null));
        }

        C0695f(C0689f2 f2Var) {
            this.f2777a = f2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2891a() {
            C0543b[] bVarArr = this.f2778b;
            if (bVarArr != null) {
                C0543b bVar = bVarArr[C0702m.m2811b(1)];
                C0543b bVar2 = this.f2778b[C0702m.m2811b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f2777a.mo2867f(2);
                }
                if (bVar == null) {
                    bVar = this.f2777a.mo2867f(1);
                }
                mo2887f(C0543b.m2251a(bVar, bVar2));
                C0543b bVar3 = this.f2778b[C0702m.m2811b(16)];
                if (bVar3 != null) {
                    mo2889e(bVar3);
                }
                C0543b bVar4 = this.f2778b[C0702m.m2811b(32)];
                if (bVar4 != null) {
                    mo2888c(bVar4);
                }
                C0543b bVar5 = this.f2778b[C0702m.m2811b(64)];
                if (bVar5 != null) {
                    mo2890g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0689f2 mo2885b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2888c(C0543b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2886d(C0543b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2889e(C0543b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2887f(C0543b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2890g(C0543b bVar) {
        }
    }

    /* renamed from: androidx.core.view.f2$g */
    private static class C0696g extends C0701l {

        /* renamed from: h */
        private static boolean f2779h = false;

        /* renamed from: i */
        private static Method f2780i;

        /* renamed from: j */
        private static Class<?> f2781j;

        /* renamed from: k */
        private static Field f2782k;

        /* renamed from: l */
        private static Field f2783l;

        /* renamed from: c */
        final WindowInsets f2784c;

        /* renamed from: d */
        private C0543b[] f2785d;

        /* renamed from: e */
        private C0543b f2786e;

        /* renamed from: f */
        private C0689f2 f2787f;

        /* renamed from: g */
        C0543b f2788g;

        C0696g(C0689f2 f2Var, WindowInsets windowInsets) {
            super(f2Var);
            this.f2786e = null;
            this.f2784c = windowInsets;
        }

        C0696g(C0689f2 f2Var, C0696g gVar) {
            this(f2Var, new WindowInsets(gVar.f2784c));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C0543b m2763t(int i, boolean z) {
            C0543b bVar = C0543b.f2547e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C0543b.m2251a(bVar, mo2902u(i2, z));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C0543b m2764v() {
            C0689f2 f2Var = this.f2787f;
            return f2Var != null ? f2Var.mo2868g() : C0543b.f2547e;
        }

        /* renamed from: w */
        private C0543b m2765w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2779h) {
                    m2766x();
                }
                Method method = f2780i;
                if (!(method == null || f2781j == null || f2782k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2782k.get(f2783l.get(invoke));
                        if (rect != null) {
                            return C0543b.m2253c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m2766x() {
            try {
                f2780i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2781j = cls;
                f2782k = cls.getDeclaredField("mVisibleInsets");
                f2783l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2782k.setAccessible(true);
                f2783l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f2779h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2892d(View view) {
            C0543b w = m2765w(view);
            if (w == null) {
                w = C0543b.f2547e;
            }
            mo2900q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2893e(C0689f2 f2Var) {
            f2Var.mo2879r(this.f2787f);
            f2Var.mo2878q(this.f2788g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2788g, ((C0696g) obj).f2788g);
        }

        /* renamed from: g */
        public C0543b mo2895g(int i) {
            return m2763t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C0543b mo2896k() {
            if (this.f2786e == null) {
                this.f2786e = C0543b.m2252b(this.f2784c.getSystemWindowInsetLeft(), this.f2784c.getSystemWindowInsetTop(), this.f2784c.getSystemWindowInsetRight(), this.f2784c.getSystemWindowInsetBottom());
            }
            return this.f2786e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0689f2 mo2897m(int i, int i2, int i3, int i4) {
            C0691b bVar = new C0691b(C0689f2.m2721u(this.f2784c));
            bVar.mo2884c(C0689f2.m2720m(mo2896k(), i, i2, i3, i4));
            bVar.mo2883b(C0689f2.m2720m(mo2905i(), i, i2, i3, i4));
            return bVar.mo2882a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo2898o() {
            return this.f2784c.isRound();
        }

        /* renamed from: p */
        public void mo2899p(C0543b[] bVarArr) {
            this.f2785d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2900q(C0543b bVar) {
            this.f2788g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2901r(C0689f2 f2Var) {
            this.f2787f = f2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C0543b mo2902u(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? C0543b.m2252b(0, Math.max(m2764v().f2549b, mo2896k().f2549b), 0, 0) : C0543b.m2252b(0, mo2896k().f2549b, 0, 0);
            }
            C0543b bVar = null;
            if (i != 2) {
                if (i == 8) {
                    C0543b[] bVarArr = this.f2785d;
                    if (bVarArr != null) {
                        bVar = bVarArr[C0702m.m2811b(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    C0543b k = mo2896k();
                    C0543b v = m2764v();
                    int i3 = k.f2551d;
                    if (i3 > v.f2551d) {
                        return C0543b.m2252b(0, 0, 0, i3);
                    }
                    C0543b bVar2 = this.f2788g;
                    return (bVar2 == null || bVar2.equals(C0543b.f2547e) || (i2 = this.f2788g.f2551d) <= v.f2551d) ? C0543b.f2547e : C0543b.m2252b(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo2912j();
                } else {
                    if (i == 32) {
                        return mo2911h();
                    }
                    if (i == 64) {
                        return mo2913l();
                    }
                    if (i != 128) {
                        return C0543b.f2547e;
                    }
                    C0689f2 f2Var = this.f2787f;
                    C0676d e = f2Var != null ? f2Var.mo2865e() : mo2909f();
                    return e != null ? C0543b.m2252b(e.mo2851b(), e.mo2853d(), e.mo2852c(), e.mo2850a()) : C0543b.f2547e;
                }
            } else if (z) {
                C0543b v2 = m2764v();
                C0543b i4 = mo2905i();
                return C0543b.m2252b(Math.max(v2.f2548a, i4.f2548a), 0, Math.max(v2.f2550c, i4.f2550c), Math.max(v2.f2551d, i4.f2551d));
            } else {
                C0543b k2 = mo2896k();
                C0689f2 f2Var2 = this.f2787f;
                if (f2Var2 != null) {
                    bVar = f2Var2.mo2868g();
                }
                int i5 = k2.f2551d;
                if (bVar != null) {
                    i5 = Math.min(i5, bVar.f2551d);
                }
                return C0543b.m2252b(k2.f2548a, 0, k2.f2550c, i5);
            }
        }
    }

    /* renamed from: androidx.core.view.f2$h */
    private static class C0697h extends C0696g {

        /* renamed from: m */
        private C0543b f2789m = null;

        C0697h(C0689f2 f2Var, WindowInsets windowInsets) {
            super(f2Var, windowInsets);
        }

        C0697h(C0689f2 f2Var, C0697h hVar) {
            super(f2Var, (C0696g) hVar);
            this.f2789m = hVar.f2789m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0689f2 mo2903b() {
            return C0689f2.m2721u(this.f2784c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0689f2 mo2904c() {
            return C0689f2.m2721u(this.f2784c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C0543b mo2905i() {
            if (this.f2789m == null) {
                this.f2789m = C0543b.m2252b(this.f2784c.getStableInsetLeft(), this.f2784c.getStableInsetTop(), this.f2784c.getStableInsetRight(), this.f2784c.getStableInsetBottom());
            }
            return this.f2789m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo2906n() {
            return this.f2784c.isConsumed();
        }

        /* renamed from: s */
        public void mo2907s(C0543b bVar) {
            this.f2789m = bVar;
        }
    }

    /* renamed from: androidx.core.view.f2$i */
    private static class C0698i extends C0697h {
        C0698i(C0689f2 f2Var, WindowInsets windowInsets) {
            super(f2Var, windowInsets);
        }

        C0698i(C0689f2 f2Var, C0698i iVar) {
            super(f2Var, (C0697h) iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0689f2 mo2908a() {
            return C0689f2.m2721u(this.f2784c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0698i)) {
                return false;
            }
            C0698i iVar = (C0698i) obj;
            return Objects.equals(this.f2784c, iVar.f2784c) && Objects.equals(this.f2788g, iVar.f2788g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0676d mo2909f() {
            return C0676d.m2689e(this.f2784c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2784c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.f2$j */
    private static class C0699j extends C0698i {

        /* renamed from: n */
        private C0543b f2790n = null;

        /* renamed from: o */
        private C0543b f2791o = null;

        /* renamed from: p */
        private C0543b f2792p = null;

        C0699j(C0689f2 f2Var, WindowInsets windowInsets) {
            super(f2Var, windowInsets);
        }

        C0699j(C0689f2 f2Var, C0699j jVar) {
            super(f2Var, (C0698i) jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0543b mo2911h() {
            if (this.f2791o == null) {
                this.f2791o = C0543b.m2254d(this.f2784c.getMandatorySystemGestureInsets());
            }
            return this.f2791o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0543b mo2912j() {
            if (this.f2790n == null) {
                this.f2790n = C0543b.m2254d(this.f2784c.getSystemGestureInsets());
            }
            return this.f2790n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0543b mo2913l() {
            if (this.f2792p == null) {
                this.f2792p = C0543b.m2254d(this.f2784c.getTappableElementInsets());
            }
            return this.f2792p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0689f2 mo2897m(int i, int i2, int i3, int i4) {
            return C0689f2.m2721u(this.f2784c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo2907s(C0543b bVar) {
        }
    }

    /* renamed from: androidx.core.view.f2$k */
    private static class C0700k extends C0699j {

        /* renamed from: q */
        static final C0689f2 f2793q = C0689f2.m2721u(WindowInsets.CONSUMED);

        C0700k(C0689f2 f2Var, WindowInsets windowInsets) {
            super(f2Var, windowInsets);
        }

        C0700k(C0689f2 f2Var, C0700k kVar) {
            super(f2Var, (C0699j) kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo2892d(View view) {
        }

        /* renamed from: g */
        public C0543b mo2895g(int i) {
            return C0543b.m2254d(this.f2784c.getInsets(C0703n.m2814a(i)));
        }
    }

    /* renamed from: androidx.core.view.f2$l */
    private static class C0701l {

        /* renamed from: b */
        static final C0689f2 f2794b = new C0691b().mo2882a().mo2861a().mo2862b().mo2863c();

        /* renamed from: a */
        final C0689f2 f2795a;

        C0701l(C0689f2 f2Var) {
            this.f2795a = f2Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0689f2 mo2908a() {
            return this.f2795a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0689f2 mo2903b() {
            return this.f2795a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0689f2 mo2904c() {
            return this.f2795a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2892d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2893e(C0689f2 f2Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0701l)) {
                return false;
            }
            C0701l lVar = (C0701l) obj;
            return mo2898o() == lVar.mo2898o() && mo2906n() == lVar.mo2906n() && C0619c.m2480a(mo2896k(), lVar.mo2896k()) && C0619c.m2480a(mo2905i(), lVar.mo2905i()) && C0619c.m2480a(mo2909f(), lVar.mo2909f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0676d mo2909f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0543b mo2895g(int i) {
            return C0543b.f2547e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0543b mo2911h() {
            return mo2896k();
        }

        public int hashCode() {
            return C0619c.m2481b(Boolean.valueOf(mo2898o()), Boolean.valueOf(mo2906n()), mo2896k(), mo2905i(), mo2909f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0543b mo2905i() {
            return C0543b.f2547e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0543b mo2912j() {
            return mo2896k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0543b mo2896k() {
            return C0543b.f2547e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0543b mo2913l() {
            return mo2896k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0689f2 mo2897m(int i, int i2, int i3, int i4) {
            return f2794b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo2906n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo2898o() {
            return false;
        }

        /* renamed from: p */
        public void mo2899p(C0543b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2900q(C0543b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2901r(C0689f2 f2Var) {
        }

        /* renamed from: s */
        public void mo2907s(C0543b bVar) {
        }
    }

    /* renamed from: androidx.core.view.f2$m */
    public static final class C0702m {
        /* renamed from: a */
        public static int m2810a() {
            return 8;
        }

        /* renamed from: b */
        static int m2811b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: c */
        public static int m2812c() {
            return 2;
        }

        /* renamed from: d */
        public static int m2813d() {
            return 7;
        }
    }

    /* renamed from: androidx.core.view.f2$n */
    private static final class C0703n {
        /* renamed from: a */
        static int m2814a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets$Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    private C0689f2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f2764a = i >= 30 ? new C0700k(this, windowInsets) : i >= 29 ? new C0699j(this, windowInsets) : i >= 28 ? new C0698i(this, windowInsets) : new C0697h(this, windowInsets);
    }

    public C0689f2(C0689f2 f2Var) {
        if (f2Var != null) {
            C0701l lVar = f2Var.f2764a;
            int i = Build.VERSION.SDK_INT;
            this.f2764a = (i < 30 || !(lVar instanceof C0700k)) ? (i < 29 || !(lVar instanceof C0699j)) ? (i < 28 || !(lVar instanceof C0698i)) ? lVar instanceof C0697h ? new C0697h(this, (C0697h) lVar) : lVar instanceof C0696g ? new C0696g(this, (C0696g) lVar) : new C0701l(this) : new C0698i(this, (C0698i) lVar) : new C0699j(this, (C0699j) lVar) : new C0700k(this, (C0700k) lVar);
            lVar.mo2893e(this);
            return;
        }
        this.f2764a = new C0701l(this);
    }

    /* renamed from: m */
    static C0543b m2720m(C0543b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f2548a - i);
        int max2 = Math.max(0, bVar.f2549b - i2);
        int max3 = Math.max(0, bVar.f2550c - i3);
        int max4 = Math.max(0, bVar.f2551d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C0543b.m2252b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C0689f2 m2721u(WindowInsets windowInsets) {
        return m2722v(windowInsets, (View) null);
    }

    /* renamed from: v */
    public static C0689f2 m2722v(WindowInsets windowInsets, View view) {
        C0689f2 f2Var = new C0689f2((WindowInsets) C0623f.m2495f(windowInsets));
        if (view != null && C0727l0.m2859I(view)) {
            f2Var.mo2879r(C0727l0.m2851A(view));
            f2Var.mo2864d(view.getRootView());
        }
        return f2Var;
    }

    @Deprecated
    /* renamed from: a */
    public C0689f2 mo2861a() {
        return this.f2764a.mo2908a();
    }

    @Deprecated
    /* renamed from: b */
    public C0689f2 mo2862b() {
        return this.f2764a.mo2903b();
    }

    @Deprecated
    /* renamed from: c */
    public C0689f2 mo2863c() {
        return this.f2764a.mo2904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2864d(View view) {
        this.f2764a.mo2892d(view);
    }

    /* renamed from: e */
    public C0676d mo2865e() {
        return this.f2764a.mo2909f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0689f2)) {
            return false;
        }
        return C0619c.m2480a(this.f2764a, ((C0689f2) obj).f2764a);
    }

    /* renamed from: f */
    public C0543b mo2867f(int i) {
        return this.f2764a.mo2895g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C0543b mo2868g() {
        return this.f2764a.mo2905i();
    }

    @Deprecated
    /* renamed from: h */
    public int mo2869h() {
        return this.f2764a.mo2896k().f2551d;
    }

    public int hashCode() {
        C0701l lVar = this.f2764a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo2871i() {
        return this.f2764a.mo2896k().f2548a;
    }

    @Deprecated
    /* renamed from: j */
    public int mo2872j() {
        return this.f2764a.mo2896k().f2550c;
    }

    @Deprecated
    /* renamed from: k */
    public int mo2873k() {
        return this.f2764a.mo2896k().f2549b;
    }

    /* renamed from: l */
    public C0689f2 mo2874l(int i, int i2, int i3, int i4) {
        return this.f2764a.mo2897m(i, i2, i3, i4);
    }

    /* renamed from: n */
    public boolean mo2875n() {
        return this.f2764a.mo2906n();
    }

    @Deprecated
    /* renamed from: o */
    public C0689f2 mo2876o(int i, int i2, int i3, int i4) {
        return new C0691b(this).mo2884c(C0543b.m2252b(i, i2, i3, i4)).mo2882a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2877p(C0543b[] bVarArr) {
        this.f2764a.mo2899p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2878q(C0543b bVar) {
        this.f2764a.mo2900q(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2879r(C0689f2 f2Var) {
        this.f2764a.mo2901r(f2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2880s(C0543b bVar) {
        this.f2764a.mo2907s(bVar);
    }

    /* renamed from: t */
    public WindowInsets mo2881t() {
        C0701l lVar = this.f2764a;
        if (lVar instanceof C0696g) {
            return ((C0696g) lVar).f2784c;
        }
        return null;
    }
}
