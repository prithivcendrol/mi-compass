package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p008os.C0574a;
import androidx.core.view.accessibility.C0648j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p104r.C2588b;

/* renamed from: androidx.core.view.accessibility.g */
public class C0637g {

    /* renamed from: d */
    private static int f2671d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f2672a;

    /* renamed from: b */
    public int f2673b = -1;

    /* renamed from: c */
    private int f2674c = -1;

    /* renamed from: androidx.core.view.accessibility.g$a */
    public static class C0638a {

        /* renamed from: A */
        public static final C0638a f2675A = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: B */
        public static final C0638a f2676B = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C0648j) null, C0648j.C0653e.class);

        /* renamed from: C */
        public static final C0638a f2677C = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: D */
        public static final C0638a f2678D = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: E */
        public static final C0638a f2679E = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: F */
        public static final C0638a f2680F = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: G */
        public static final C0638a f2681G;

        /* renamed from: H */
        public static final C0638a f2682H;

        /* renamed from: I */
        public static final C0638a f2683I;

        /* renamed from: J */
        public static final C0638a f2684J;

        /* renamed from: K */
        public static final C0638a f2685K = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);

        /* renamed from: L */
        public static final C0638a f2686L = new C0638a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (C0648j) null, C0648j.C0654f.class);

        /* renamed from: M */
        public static final C0638a f2687M;

        /* renamed from: N */
        public static final C0638a f2688N;

        /* renamed from: O */
        public static final C0638a f2689O;

        /* renamed from: P */
        public static final C0638a f2690P;

        /* renamed from: Q */
        public static final C0638a f2691Q;

        /* renamed from: R */
        public static final C0638a f2692R;

        /* renamed from: S */
        public static final C0638a f2693S;

        /* renamed from: T */
        public static final C0638a f2694T;

        /* renamed from: U */
        public static final C0638a f2695U;

        /* renamed from: e */
        public static final C0638a f2696e = new C0638a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C0638a f2697f = new C0638a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C0638a f2698g = new C0638a(4, (CharSequence) null);

        /* renamed from: h */
        public static final C0638a f2699h = new C0638a(8, (CharSequence) null);

        /* renamed from: i */
        public static final C0638a f2700i = new C0638a(16, (CharSequence) null);

        /* renamed from: j */
        public static final C0638a f2701j = new C0638a(32, (CharSequence) null);

        /* renamed from: k */
        public static final C0638a f2702k = new C0638a(64, (CharSequence) null);

        /* renamed from: l */
        public static final C0638a f2703l = new C0638a(128, (CharSequence) null);

        /* renamed from: m */
        public static final C0638a f2704m;

        /* renamed from: n */
        public static final C0638a f2705n;

        /* renamed from: o */
        public static final C0638a f2706o;

        /* renamed from: p */
        public static final C0638a f2707p;

        /* renamed from: q */
        public static final C0638a f2708q = new C0638a(4096, (CharSequence) null);

        /* renamed from: r */
        public static final C0638a f2709r = new C0638a(8192, (CharSequence) null);

        /* renamed from: s */
        public static final C0638a f2710s = new C0638a(16384, (CharSequence) null);

        /* renamed from: t */
        public static final C0638a f2711t = new C0638a(32768, (CharSequence) null);

        /* renamed from: u */
        public static final C0638a f2712u = new C0638a(65536, (CharSequence) null);

        /* renamed from: v */
        public static final C0638a f2713v = new C0638a(131072, (CharSequence) null, C0648j.C0655g.class);

        /* renamed from: w */
        public static final C0638a f2714w = new C0638a(262144, (CharSequence) null);

        /* renamed from: x */
        public static final C0638a f2715x = new C0638a(524288, (CharSequence) null);

        /* renamed from: y */
        public static final C0638a f2716y = new C0638a(1048576, (CharSequence) null);

        /* renamed from: z */
        public static final C0638a f2717z = new C0638a(2097152, (CharSequence) null, C0648j.C0656h.class);

        /* renamed from: a */
        final Object f2718a;

        /* renamed from: b */
        private final int f2719b;

        /* renamed from: c */
        private final Class<? extends C0648j.C0649a> f2720c;

        /* renamed from: d */
        protected final C0648j f2721d;

        static {
            Class<C0648j.C0651c> cls = C0648j.C0651c.class;
            Class<C0648j.C0650b> cls2 = C0648j.C0650b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f2704m = new C0638a(256, (CharSequence) null, cls2);
            f2705n = new C0638a(512, (CharSequence) null, cls2);
            f2706o = new C0638a(1024, (CharSequence) null, cls);
            f2707p = new C0638a(2048, (CharSequence) null, cls);
            int i = Build.VERSION.SDK_INT;
            f2681G = new C0638a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2682H = new C0638a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2683I = new C0638a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2684J = new C0638a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2687M = new C0638a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0648j) null, C0648j.C0652d.class);
            f2688N = new C0638a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2689O = new C0638a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2690P = new C0638a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2691Q = new C0638a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2692R = new C0638a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2693S = new C0638a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            f2694T = new C0638a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
            if (i >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f2695U = new C0638a(accessibilityAction, 16908376, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
        }

        public C0638a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
        }

        private C0638a(int i, CharSequence charSequence, Class<? extends C0648j.C0649a> cls) {
            this((Object) null, i, charSequence, (C0648j) null, cls);
        }

        C0638a(Object obj) {
            this(obj, 0, (CharSequence) null, (C0648j) null, (Class<? extends C0648j.C0649a>) null);
        }

        C0638a(Object obj, int i, CharSequence charSequence, C0648j jVar, Class<? extends C0648j.C0649a> cls) {
            this.f2719b = i;
            this.f2721d = jVar;
            this.f2718a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f2720c = cls;
        }

        /* renamed from: a */
        public int mo2784a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2718a).getId();
        }

        /* renamed from: b */
        public CharSequence mo2785b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2718a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2786c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.j r0 = r4.f2721d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.j$a> r2 = r4.f2720c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.j$a r1 = (androidx.core.view.accessibility.C0648j.C0649a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo2801a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.j$a> r1 = r4.f2720c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.j r6 = r4.f2721d
                boolean r5 = r6.mo2800a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.C0637g.C0638a.mo2786c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0638a)) {
                return false;
            }
            Object obj2 = this.f2718a;
            Object obj3 = ((C0638a) obj).f2718a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2718a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.view.accessibility.g$b */
    public static class C0639b {

        /* renamed from: a */
        final Object f2722a;

        C0639b(Object obj) {
            this.f2722a = obj;
        }

        /* renamed from: a */
        public static C0639b m2590a(int i, int i2, boolean z, int i3) {
            return new C0639b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: androidx.core.view.accessibility.g$c */
    public static class C0640c {

        /* renamed from: a */
        final Object f2723a;

        C0640c(Object obj) {
            this.f2723a = obj;
        }

        /* renamed from: a */
        public static C0640c m2591a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C0640c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    private C0637g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2672a = accessibilityNodeInfo;
    }

    /* renamed from: J */
    public static C0637g m2522J() {
        return m2531m0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: K */
    public static C0637g m2523K(View view) {
        return m2531m0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: L */
    public static C0637g m2524L(C0637g gVar) {
        return m2531m0(AccessibilityNodeInfo.obtain(gVar.f2672a));
    }

    /* renamed from: O */
    private void m2525O(View view) {
        SparseArray<WeakReference<ClickableSpan>> t = m2534t(view);
        if (t != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < t.size(); i++) {
                if (t.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                t.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: Q */
    private void m2526Q(int i, boolean z) {
        Bundle q = mo2777q();
        if (q != null) {
            int i2 = q.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            q.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: d */
    private void m2527d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m2528f() {
        this.f2672a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f2672a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f2672a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f2672a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g */
    private List<Integer> m2529g(String str) {
        ArrayList<Integer> integerArrayList = this.f2672a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f2672a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static String m2530i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: m0 */
    public static C0637g m2531m0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0637g(accessibilityNodeInfo);
    }

    /* renamed from: o */
    public static ClickableSpan[] m2532o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: r */
    private SparseArray<WeakReference<ClickableSpan>> m2533r(View view) {
        SparseArray<WeakReference<ClickableSpan>> t = m2534t(view);
        if (t != null) {
            return t;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C2588b.f10140I, sparseArray);
        return sparseArray;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m2534t(View view) {
        return (SparseArray) view.getTag(C2588b.f10140I);
    }

    /* renamed from: x */
    private boolean m2535x() {
        return !m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    private int m2536y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2671d;
        f2671d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo2731A() {
        return this.f2672a.isChecked();
    }

    /* renamed from: B */
    public boolean mo2732B() {
        return this.f2672a.isClickable();
    }

    /* renamed from: C */
    public boolean mo2733C() {
        return this.f2672a.isEnabled();
    }

    /* renamed from: D */
    public boolean mo2734D() {
        return this.f2672a.isFocusable();
    }

    /* renamed from: E */
    public boolean mo2735E() {
        return this.f2672a.isFocused();
    }

    /* renamed from: F */
    public boolean mo2736F() {
        return this.f2672a.isLongClickable();
    }

    /* renamed from: G */
    public boolean mo2737G() {
        return this.f2672a.isPassword();
    }

    /* renamed from: H */
    public boolean mo2738H() {
        return this.f2672a.isScrollable();
    }

    /* renamed from: I */
    public boolean mo2739I() {
        return this.f2672a.isSelected();
    }

    /* renamed from: M */
    public boolean mo2740M(int i, Bundle bundle) {
        return this.f2672a.performAction(i, bundle);
    }

    /* renamed from: N */
    public void mo2741N() {
        this.f2672a.recycle();
    }

    /* renamed from: P */
    public void mo2742P(boolean z) {
        this.f2672a.setAccessibilityFocused(z);
    }

    @Deprecated
    /* renamed from: R */
    public void mo2743R(Rect rect) {
        this.f2672a.setBoundsInParent(rect);
    }

    /* renamed from: S */
    public void mo2744S(Rect rect) {
        this.f2672a.setBoundsInScreen(rect);
    }

    /* renamed from: T */
    public void mo2745T(CharSequence charSequence) {
        this.f2672a.setClassName(charSequence);
    }

    /* renamed from: U */
    public void mo2746U(boolean z) {
        this.f2672a.setClickable(z);
    }

    /* renamed from: V */
    public void mo2747V(Object obj) {
        this.f2672a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0639b) obj).f2722a);
    }

    /* renamed from: W */
    public void mo2748W(Object obj) {
        this.f2672a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0640c) obj).f2723a);
    }

    /* renamed from: X */
    public void mo2749X(CharSequence charSequence) {
        this.f2672a.setContentDescription(charSequence);
    }

    /* renamed from: Y */
    public void mo2750Y(boolean z) {
        this.f2672a.setEnabled(z);
    }

    /* renamed from: Z */
    public void mo2751Z(boolean z) {
        this.f2672a.setFocusable(z);
    }

    /* renamed from: a */
    public void mo2752a(int i) {
        this.f2672a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo2753a0(boolean z) {
        this.f2672a.setFocused(z);
    }

    /* renamed from: b */
    public void mo2754b(C0638a aVar) {
        this.f2672a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2718a);
    }

    /* renamed from: b0 */
    public void mo2755b0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2672a.setHeading(z);
        } else {
            m2526Q(2, z);
        }
    }

    /* renamed from: c */
    public void mo2756c(View view, int i) {
        this.f2672a.addChild(view, i);
    }

    /* renamed from: c0 */
    public void mo2757c0(CharSequence charSequence) {
        this.f2672a.setPackageName(charSequence);
    }

    /* renamed from: d0 */
    public void mo2758d0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2672a.setPaneTitle(charSequence);
        } else {
            this.f2672a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: e */
    public void mo2759e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m2528f();
            m2525O(view);
            ClickableSpan[] o = m2532o(charSequence);
            if (o != null && o.length > 0) {
                mo2777q().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C2588b.f10151a);
                SparseArray<WeakReference<ClickableSpan>> r = m2533r(view);
                for (int i = 0; i < o.length; i++) {
                    int y = m2536y(o[i], r);
                    r.put(y, new WeakReference(o[i]));
                    m2527d(o[i], (Spanned) charSequence, y);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo2760e0(View view) {
        this.f2673b = -1;
        this.f2672a.setParent(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0637g)) {
            return false;
        }
        C0637g gVar = (C0637g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2672a;
        if (accessibilityNodeInfo == null) {
            if (gVar.f2672a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(gVar.f2672a)) {
            return false;
        }
        return this.f2674c == gVar.f2674c && this.f2673b == gVar.f2673b;
    }

    /* renamed from: f0 */
    public void mo2762f0(View view, int i) {
        this.f2673b = i;
        this.f2672a.setParent(view, i);
    }

    /* renamed from: g0 */
    public void mo2763g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2672a.setScreenReaderFocusable(z);
        } else {
            m2526Q(1, z);
        }
    }

    /* renamed from: h */
    public List<C0638a> mo2764h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2672a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0638a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void mo2765h0(boolean z) {
        this.f2672a.setScrollable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2672a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void mo2767i0(View view, int i) {
        this.f2674c = i;
        this.f2672a.setSource(view, i);
    }

    @Deprecated
    /* renamed from: j */
    public int mo2768j() {
        return this.f2672a.getActions();
    }

    /* renamed from: j0 */
    public void mo2769j0(CharSequence charSequence) {
        if (C0574a.m2383b()) {
            this.f2672a.setStateDescription(charSequence);
        } else {
            this.f2672a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: k */
    public void mo2770k(Rect rect) {
        this.f2672a.getBoundsInParent(rect);
    }

    /* renamed from: k0 */
    public void mo2771k0(boolean z) {
        this.f2672a.setVisibleToUser(z);
    }

    /* renamed from: l */
    public void mo2772l(Rect rect) {
        this.f2672a.getBoundsInScreen(rect);
    }

    /* renamed from: l0 */
    public AccessibilityNodeInfo mo2773l0() {
        return this.f2672a;
    }

    /* renamed from: m */
    public int mo2774m() {
        return this.f2672a.getChildCount();
    }

    /* renamed from: n */
    public CharSequence mo2775n() {
        return this.f2672a.getClassName();
    }

    /* renamed from: p */
    public CharSequence mo2776p() {
        return this.f2672a.getContentDescription();
    }

    /* renamed from: q */
    public Bundle mo2777q() {
        return this.f2672a.getExtras();
    }

    /* renamed from: s */
    public CharSequence mo2778s() {
        return this.f2672a.getPackageName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo2770k(rect);
        sb.append("; boundsInParent: " + rect);
        mo2772l(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo2778s());
        sb.append("; className: ");
        sb.append(mo2775n());
        sb.append("; text: ");
        sb.append(mo2780u());
        sb.append("; contentDescription: ");
        sb.append(mo2776p());
        sb.append("; viewId: ");
        sb.append(mo2782w());
        sb.append("; uniqueId: ");
        sb.append(mo2781v());
        sb.append("; checkable: ");
        sb.append(mo2783z());
        sb.append("; checked: ");
        sb.append(mo2731A());
        sb.append("; focusable: ");
        sb.append(mo2734D());
        sb.append("; focused: ");
        sb.append(mo2735E());
        sb.append("; selected: ");
        sb.append(mo2739I());
        sb.append("; clickable: ");
        sb.append(mo2732B());
        sb.append("; longClickable: ");
        sb.append(mo2736F());
        sb.append("; enabled: ");
        sb.append(mo2733C());
        sb.append("; password: ");
        sb.append(mo2737G());
        sb.append("; scrollable: " + mo2738H());
        sb.append("; [");
        List<C0638a> h = mo2764h();
        for (int i = 0; i < h.size(); i++) {
            C0638a aVar = h.get(i);
            String i2 = m2530i(aVar.mo2784a());
            if (i2.equals("ACTION_UNKNOWN") && aVar.mo2785b() != null) {
                i2 = aVar.mo2785b().toString();
            }
            sb.append(i2);
            if (i != h.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence mo2780u() {
        if (!m2535x()) {
            return this.f2672a.getText();
        }
        List<Integer> g = m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g2 = m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g3 = m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g4 = m2529g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2672a.getText(), 0, this.f2672a.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new C0630a(g4.get(i).intValue(), this, mo2777q().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g.get(i).intValue(), g2.get(i).intValue(), g3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: v */
    public String mo2781v() {
        return C0574a.m2384c() ? this.f2672a.getUniqueId() : this.f2672a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: w */
    public String mo2782w() {
        return this.f2672a.getViewIdResourceName();
    }

    /* renamed from: z */
    public boolean mo2783z() {
        return this.f2672a.isCheckable();
    }
}
