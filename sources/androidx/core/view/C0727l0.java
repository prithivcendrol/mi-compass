package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0624a;
import androidx.core.view.C0689f2;
import androidx.core.view.accessibility.C0637g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p063k.C1774g;
import p104r.C2588b;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.l0 */
public class C0727l0 {

    /* renamed from: a */
    private static final AtomicInteger f2805a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, C0662b2> f2806b = null;

    /* renamed from: c */
    private static Field f2807c;

    /* renamed from: d */
    private static boolean f2808d = false;

    /* renamed from: e */
    private static final int[] f2809e = {C2588b.f10152b, C2588b.f10153c, C2588b.f10164n, C2588b.f10175y, C2588b.f10133B, C2588b.f10134C, C2588b.f10135D, C2588b.f10136E, C2588b.f10137F, C2588b.f10138G, C2588b.f10154d, C2588b.f10155e, C2588b.f10156f, C2588b.f10157g, C2588b.f10158h, C2588b.f10159i, C2588b.f10160j, C2588b.f10161k, C2588b.f10162l, C2588b.f10163m, C2588b.f10165o, C2588b.f10166p, C2588b.f10167q, C2588b.f10168r, C2588b.f10169s, C2588b.f10170t, C2588b.f10171u, C2588b.f10172v, C2588b.f10173w, C2588b.f10174x, C2588b.f10176z, C2588b.f10132A};

    /* renamed from: f */
    private static final C0710h0 f2810f = new C0723k0();

    /* renamed from: g */
    private static final C0732e f2811g = new C0732e();

    /* renamed from: androidx.core.view.l0$a */
    class C0728a extends C0733f<Boolean> {
        C0728a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo2927d(View view) {
            return Boolean.valueOf(C0744p.m3051d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2928e(View view, Boolean bool) {
            C0744p.m3056i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2929h(Boolean bool, Boolean bool2) {
            return !mo2947a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.l0$b */
    class C0729b extends C0733f<CharSequence> {
        C0729b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo2927d(View view) {
            return C0744p.m3049b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2928e(View view, CharSequence charSequence) {
            C0744p.m3055h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2929h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.l0$c */
    class C0730c extends C0733f<CharSequence> {
        C0730c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo2927d(View view) {
            return C0746r.m3061a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2928e(View view, CharSequence charSequence) {
            C0746r.m3062b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2929h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.l0$d */
    class C0731d extends C0733f<Boolean> {
        C0731d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo2927d(View view) {
            return Boolean.valueOf(C0744p.m3050c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2928e(View view, Boolean bool) {
            C0744p.m3054g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2929h(Boolean bool, Boolean bool2) {
            return !mo2947a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.l0$e */
    static class C0732e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        private final WeakHashMap<View, Boolean> f2812d = new WeakHashMap<>();

        C0732e() {
        }

        /* renamed from: b */
        private void m2946b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                C0727l0.m2863M(view, z2 ? 16 : 32);
                this.f2812d.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m2947c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m2948e(View view) {
            C0735h.m2974o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2942a(View view) {
            this.f2812d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (C0738k.m2994b(view)) {
                m2947c(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2943d(View view) {
            this.f2812d.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m2948e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f2812d.entrySet()) {
                    m2946b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m2947c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.l0$f */
    static abstract class C0733f<T> {

        /* renamed from: a */
        private final int f2813a;

        /* renamed from: b */
        private final Class<T> f2814b;

        /* renamed from: c */
        private final int f2815c;

        /* renamed from: d */
        private final int f2816d;

        C0733f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C0733f(int i, Class<T> cls, int i2, int i3) {
            this.f2813a = i;
            this.f2814b = cls;
            this.f2816d = i2;
            this.f2815c = i3;
        }

        /* renamed from: b */
        private boolean m2951b() {
            return true;
        }

        /* renamed from: c */
        private boolean m2952c() {
            return Build.VERSION.SDK_INT >= this.f2815c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2947a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo2927d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo2928e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo2948f(View view) {
            if (m2952c()) {
                return mo2927d(view);
            }
            if (!m2951b()) {
                return null;
            }
            T tag = view.getTag(this.f2813a);
            if (this.f2814b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2949g(View view, T t) {
            if (m2952c()) {
                mo2928e(view, t);
            } else if (m2951b() && mo2929h(mo2948f(view), t)) {
                C0727l0.m2891h(view);
                view.setTag(this.f2813a, t);
                C0727l0.m2863M(view, this.f2816d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo2929h(T t, T t2);
    }

    /* renamed from: androidx.core.view.l0$g */
    static class C0734g {
        /* renamed from: a */
        static boolean m2959a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.l0$h */
    static class C0735h {
        /* renamed from: a */
        static AccessibilityNodeProvider m2960a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m2961b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m2962c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m2963d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m2964e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m2965f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m2966g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m2967h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m2968i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m2969j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m2970k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m2971l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m2972m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m2973n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m2974o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m2975p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m2976q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m2977r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m2978s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.l0$i */
    static class C0736i {
        /* renamed from: a */
        static int m2979a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m2980b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m2981c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m2982d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m2983e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m2984f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m2985g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m2986h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m2987i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m2988j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m2989k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.l0$j */
    static class C0737j {
        /* renamed from: a */
        static Rect m2990a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m2991b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m2992c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.l0$k */
    static class C0738k {
        /* renamed from: a */
        static int m2993a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m2994b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m2995c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m2996d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m2997e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m2998f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m2999g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.l0$l */
    static class C0739l {
        /* renamed from: a */
        static WindowInsets m3000a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m3001b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m3002c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.l0$m */
    private static class C0740m {

        /* renamed from: androidx.core.view.l0$m$a */
        class C0741a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0689f2 f2817a = null;

            /* renamed from: b */
            final /* synthetic */ View f2818b;

            /* renamed from: c */
            final /* synthetic */ C0687f0 f2819c;

            C0741a(View view, C0687f0 f0Var) {
                this.f2818b = view;
                this.f2819c = f0Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0689f2 v = C0689f2.m2722v(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C0740m.m3003a(windowInsets, this.f2818b);
                    if (v.equals(this.f2817a)) {
                        return this.f2819c.mo519a(view, v).mo2881t();
                    }
                }
                this.f2817a = v;
                C0689f2 a = this.f2819c.mo519a(view, v);
                if (i >= 30) {
                    return a.mo2881t();
                }
                C0727l0.m2872V(view);
                return a.mo2881t();
            }
        }

        /* renamed from: a */
        static void m3003a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C2588b.f10150S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0689f2 m3004b(View view, C0689f2 f2Var, Rect rect) {
            WindowInsets t = f2Var.mo2881t();
            if (t != null) {
                return C0689f2.m2722v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return f2Var;
        }

        /* renamed from: c */
        static boolean m3005c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m3006d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m3007e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m3008f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m3009g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m3010h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m3011i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0689f2 m3012j(View view) {
            return C0689f2.C0690a.m2742a(view);
        }

        /* renamed from: k */
        static String m3013k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m3014l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m3015m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m3016n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m3017o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m3018p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m3019q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m3020r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m3021s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m3022t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m3023u(View view, C0687f0 f0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C2588b.f10143L, f0Var);
            }
            if (f0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C2588b.f10150S));
            } else {
                view.setOnApplyWindowInsetsListener(new C0741a(view, f0Var));
            }
        }

        /* renamed from: v */
        static void m3024v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m3025w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m3026x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m3027y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m3028z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.l0$n */
    private static class C0742n {
        /* renamed from: a */
        public static C0689f2 m3029a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0689f2 u = C0689f2.m2721u(rootWindowInsets);
            u.mo2879r(u);
            u.mo2864d(view.getRootView());
            return u;
        }

        /* renamed from: b */
        static int m3030b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m3031c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m3032d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.l0$o */
    static class C0743o {
        /* renamed from: a */
        static void m3033a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m3034b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m3035c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m3036d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m3037e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m3038f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m3039g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m3040h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        static boolean m3041i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m3042j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m3043k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m3044l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m3045m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m3046n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m3047o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.l0$p */
    static class C0744p {
        /* renamed from: a */
        static void m3048a(View view, C0749u uVar) {
            int i = C2588b.f10149R;
            C1774g gVar = (C1774g) view.getTag(i);
            if (gVar == null) {
                gVar = new C1774g();
                view.setTag(i, gVar);
            }
            Objects.requireNonNull(uVar);
            C0720j1 j1Var = new C0720j1(uVar);
            gVar.put(uVar, j1Var);
            view.addOnUnhandledKeyEventListener(j1Var);
        }

        /* renamed from: b */
        static CharSequence m3049b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m3050c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m3051d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m3052e(View view, C0749u uVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            C1774g gVar = (C1774g) view.getTag(C2588b.f10149R);
            if (gVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m3053f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        static void m3054g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m3055h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m3056i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.l0$q */
    private static class C0745q {
        /* renamed from: a */
        static View.AccessibilityDelegate m3057a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m3058b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m3059c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m3060d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.l0$r */
    private static class C0746r {
        /* renamed from: a */
        static CharSequence m3061a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m3062b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.l0$s */
    private static final class C0747s {
        /* renamed from: a */
        public static String[] m3063a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C0665c m3064b(View view, C0665c cVar) {
            ContentInfo f = cVar.mo2834f();
            ContentInfo a = view.performReceiveContent(f);
            if (a == null) {
                return null;
            }
            return a == f ? cVar : C0665c.m2653g(a);
        }

        /* renamed from: c */
        public static void m3065c(View view, String[] strArr, C0705g0 g0Var) {
            if (g0Var == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C0748t(g0Var));
            }
        }
    }

    /* renamed from: androidx.core.view.l0$t */
    private static final class C0748t implements OnReceiveContentListener {

        /* renamed from: a */
        private final C0705g0 f2820a;

        C0748t(C0705g0 g0Var) {
            this.f2820a = g0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0665c g = C0665c.m2653g(contentInfo);
            C0665c a = this.f2820a.mo2914a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.mo2834f();
        }
    }

    /* renamed from: androidx.core.view.l0$u */
    public interface C0749u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.l0$v */
    static class C0750v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f2821d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2822a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f2823b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f2824c = null;

        C0750v() {
        }

        /* renamed from: a */
        static C0750v m3066a(View view) {
            int i = C2588b.f10148Q;
            C0750v vVar = (C0750v) view.getTag(i);
            if (vVar != null) {
                return vVar;
            }
            C0750v vVar2 = new C0750v();
            view.setTag(i, vVar2);
            return vVar2;
        }

        /* renamed from: c */
        private View m3067c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2822a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m3067c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m3069e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m3068d() {
            if (this.f2823b == null) {
                this.f2823b = new SparseArray<>();
            }
            return this.f2823b;
        }

        /* renamed from: e */
        private boolean m3069e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C2588b.f10149R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0749u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m3070g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2822a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2821d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2822a == null) {
                        this.f2822a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2821d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2822a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2822a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2953b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3070g();
            }
            View c = m3067c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3068d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo2954f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2824c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2824c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m3068d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0727l0.m2859I(view)) {
                m3069e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static C0689f2 m2851A(View view) {
        return C0742n.m3029a(view);
    }

    /* renamed from: B */
    public static CharSequence m2852B(View view) {
        return m2912r0().mo2948f(view);
    }

    /* renamed from: C */
    public static String m2853C(View view) {
        return C0740m.m3013k(view);
    }

    @Deprecated
    /* renamed from: D */
    public static int m2854D(View view) {
        return C0735h.m2966g(view);
    }

    /* renamed from: E */
    public static boolean m2855E(View view) {
        return C0734g.m2959a(view);
    }

    /* renamed from: F */
    public static boolean m2856F(View view) {
        return C0735h.m2967h(view);
    }

    /* renamed from: G */
    public static boolean m2857G(View view) {
        return C0735h.m2968i(view);
    }

    /* renamed from: H */
    public static boolean m2858H(View view) {
        Boolean f = m2879b().mo2948f(view);
        return f != null && f.booleanValue();
    }

    /* renamed from: I */
    public static boolean m2859I(View view) {
        return C0738k.m2994b(view);
    }

    /* renamed from: J */
    public static boolean m2860J(View view) {
        return C0738k.m2995c(view);
    }

    /* renamed from: K */
    public static boolean m2861K(View view) {
        Boolean f = m2874X().mo2948f(view);
        return f != null && f.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ C0665c m2862L(C0665c cVar) {
        return cVar;
    }

    /* renamed from: M */
    static void m2863M(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m2901m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (m2899l(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C0738k.m2999g(obtain, i);
                if (z) {
                    obtain.getText().add(m2901m(view));
                    m2910q0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C0738k.m2999g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m2901m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C0738k.m2997e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: N */
    public static C0689f2 m2864N(View view, C0689f2 f2Var) {
        WindowInsets t = f2Var.mo2881t();
        if (t != null) {
            WindowInsets b = C0739l.m3001b(view, t);
            if (!b.equals(t)) {
                return C0689f2.m2722v(b, view);
            }
        }
        return f2Var;
    }

    /* renamed from: O */
    public static void m2865O(View view, C0637g gVar) {
        view.onInitializeAccessibilityNodeInfo(gVar.mo2773l0());
    }

    /* renamed from: P */
    private static C0733f<CharSequence> m2866P() {
        return new C0729b(C2588b.f10142K, CharSequence.class, 8, 28);
    }

    /* renamed from: Q */
    public static boolean m2867Q(View view, int i, Bundle bundle) {
        return C0735h.m2969j(view, i, bundle);
    }

    /* renamed from: R */
    public static C0665c m2868R(View view, C0665c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0747s.m3064b(view, cVar);
        }
        C0705g0 g0Var = (C0705g0) view.getTag(C2588b.f10144M);
        if (g0Var == null) {
            return m2911r(view).mo1893a(cVar);
        }
        C0665c a = g0Var.mo2914a(view, cVar);
        if (a == null) {
            return null;
        }
        return m2911r(view).mo1893a(a);
    }

    /* renamed from: S */
    public static void m2869S(View view) {
        C0735h.m2970k(view);
    }

    /* renamed from: T */
    public static void m2870T(View view, Runnable runnable) {
        C0735h.m2972m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: U */
    public static void m2871U(View view, Runnable runnable, long j) {
        C0735h.m2973n(view, runnable, j);
    }

    /* renamed from: V */
    public static void m2872V(View view) {
        C0739l.m3002c(view);
    }

    /* renamed from: W */
    public static void m2873W(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0745q.m3059c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: X */
    private static C0733f<Boolean> m2874X() {
        return new C0728a(C2588b.f10146O, Boolean.class, 28);
    }

    /* renamed from: Y */
    public static void m2875Y(View view, C0624a aVar) {
        if (aVar == null && (m2895j(view) instanceof C0624a.C0625a)) {
            aVar = new C0624a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo2712d());
    }

    /* renamed from: Z */
    public static void m2876Z(View view, boolean z) {
        m2879b().mo2949g(view, Boolean.valueOf(z));
    }

    /* renamed from: a0 */
    public static void m2878a0(View view, CharSequence charSequence) {
        m2866P().mo2949g(view, charSequence);
        if (charSequence != null) {
            f2811g.mo2942a(view);
        } else {
            f2811g.mo2943d(view);
        }
    }

    /* renamed from: b */
    private static C0733f<Boolean> m2879b() {
        return new C0731d(C2588b.f10141J, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m2880b0(View view, Drawable drawable) {
        C0735h.m2976q(view, drawable);
    }

    /* renamed from: c */
    public static C0662b2 m2881c(View view) {
        if (f2806b == null) {
            f2806b = new WeakHashMap<>();
        }
        C0662b2 b2Var = f2806b.get(view);
        if (b2Var != null) {
            return b2Var;
        }
        C0662b2 b2Var2 = new C0662b2(view);
        f2806b.put(view, b2Var2);
        return b2Var2;
    }

    /* renamed from: c0 */
    public static void m2882c0(View view, ColorStateList colorStateList) {
        C0740m.m3019q(view, colorStateList);
    }

    /* renamed from: d */
    public static C0689f2 m2883d(View view, C0689f2 f2Var, Rect rect) {
        return C0740m.m3004b(view, f2Var, rect);
    }

    /* renamed from: d0 */
    public static void m2884d0(View view, PorterDuff.Mode mode) {
        C0740m.m3020r(view, mode);
    }

    /* renamed from: e */
    public static C0689f2 m2885e(View view, C0689f2 f2Var) {
        WindowInsets t = f2Var.mo2881t();
        if (t != null) {
            WindowInsets a = C0739l.m3000a(view, t);
            if (!a.equals(t)) {
                return C0689f2.m2722v(a, view);
            }
        }
        return f2Var;
    }

    /* renamed from: e0 */
    public static void m2886e0(View view, Rect rect) {
        C0737j.m2992c(view, rect);
    }

    /* renamed from: f */
    static boolean m2887f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0750v.m3066a(view).mo2953b(view, keyEvent);
    }

    /* renamed from: f0 */
    public static void m2888f0(View view, float f) {
        C0740m.m3021s(view, f);
    }

    /* renamed from: g */
    static boolean m2889g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0750v.m3066a(view).mo2954f(keyEvent);
    }

    /* renamed from: g0 */
    public static void m2890g0(View view, boolean z) {
        C0735h.m2977r(view, z);
    }

    /* renamed from: h */
    static void m2891h(View view) {
        C0624a i = m2893i(view);
        if (i == null) {
            i = new C0624a();
        }
        m2875Y(view, i);
    }

    /* renamed from: h0 */
    public static void m2892h0(View view, int i) {
        C0735h.m2978s(view, i);
    }

    /* renamed from: i */
    public static C0624a m2893i(View view) {
        View.AccessibilityDelegate j = m2895j(view);
        if (j == null) {
            return null;
        }
        return j instanceof C0624a.C0625a ? ((C0624a.C0625a) j).f2665a : new C0624a(j);
    }

    /* renamed from: i0 */
    public static void m2894i0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0743o.m3044l(view, i);
        }
    }

    /* renamed from: j */
    private static View.AccessibilityDelegate m2895j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? C0745q.m3057a(view) : m2897k(view);
    }

    /* renamed from: j0 */
    public static void m2896j0(View view, boolean z) {
        C0740m.m3022t(view, z);
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m2897k(View view) {
        if (f2808d) {
            return null;
        }
        if (f2807c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2807c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2808d = true;
                return null;
            }
        }
        try {
            Object obj = f2807c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2808d = true;
            return null;
        }
    }

    /* renamed from: k0 */
    public static void m2898k0(View view, C0687f0 f0Var) {
        C0740m.m3023u(view, f0Var);
    }

    /* renamed from: l */
    public static int m2899l(View view) {
        return C0738k.m2993a(view);
    }

    /* renamed from: l0 */
    public static void m2900l0(View view, int i, int i2, int i3, int i4) {
        C0736i.m2989k(view, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static CharSequence m2901m(View view) {
        return m2866P().mo2948f(view);
    }

    /* renamed from: m0 */
    public static void m2902m0(View view, boolean z) {
        m2874X().mo2949g(view, Boolean.valueOf(z));
    }

    /* renamed from: n */
    public static ColorStateList m2903n(View view) {
        return C0740m.m3009g(view);
    }

    /* renamed from: n0 */
    public static void m2904n0(View view, int i, int i2) {
        C0742n.m3032d(view, i, i2);
    }

    /* renamed from: o */
    public static PorterDuff.Mode m2905o(View view) {
        return C0740m.m3010h(view);
    }

    /* renamed from: o0 */
    public static void m2906o0(View view, CharSequence charSequence) {
        m2912r0().mo2949g(view, charSequence);
    }

    /* renamed from: p */
    public static Rect m2907p(View view) {
        return C0737j.m2990a(view);
    }

    /* renamed from: p0 */
    public static void m2908p0(View view, String str) {
        C0740m.m3024v(view, str);
    }

    /* renamed from: q */
    public static Display m2909q(View view) {
        return C0736i.m2980b(view);
    }

    /* renamed from: q0 */
    private static void m2910q0(View view) {
        if (m2913s(view) == 0) {
            m2892h0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m2913s((View) parent) == 4) {
                m2892h0(view, 2);
                return;
            }
        }
    }

    /* renamed from: r */
    private static C0710h0 m2911r(View view) {
        return view instanceof C0710h0 ? (C0710h0) view : f2810f;
    }

    /* renamed from: r0 */
    private static C0733f<CharSequence> m2912r0() {
        return new C0730c(C2588b.f10147P, CharSequence.class, 64, 30);
    }

    /* renamed from: s */
    public static int m2913s(View view) {
        return C0735h.m2962c(view);
    }

    /* renamed from: s0 */
    public static void m2914s0(View view) {
        C0740m.m3028z(view);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: t */
    public static int m2915t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0743o.m3034b(view);
        }
        return 0;
    }

    /* renamed from: u */
    public static int m2916u(View view) {
        return C0736i.m2982d(view);
    }

    /* renamed from: v */
    public static int m2917v(View view) {
        return C0735h.m2963d(view);
    }

    /* renamed from: w */
    public static int m2918w(View view) {
        return C0735h.m2964e(view);
    }

    /* renamed from: x */
    public static String[] m2919x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C0747s.m3063a(view) : (String[]) view.getTag(C2588b.f10145N);
    }

    /* renamed from: y */
    public static int m2920y(View view) {
        return C0736i.m2983e(view);
    }

    /* renamed from: z */
    public static int m2921z(View view) {
        return C0736i.m2984f(view);
    }
}
