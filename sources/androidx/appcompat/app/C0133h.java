package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.C0182b;
import androidx.appcompat.view.C0185d;
import androidx.appcompat.view.C0188f;
import androidx.appcompat.view.C0190g;
import androidx.appcompat.view.C0195i;
import androidx.appcompat.view.menu.C0211e;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0232n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0326g1;
import androidx.appcompat.widget.C0327h;
import androidx.appcompat.widget.C0329h0;
import androidx.appcompat.widget.C0385r1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.app.C0501i;
import androidx.core.content.C0510a;
import androidx.core.content.res.C0528f;
import androidx.core.p008os.C0581f;
import androidx.core.view.C0662b2;
import androidx.core.view.C0675c2;
import androidx.core.view.C0680d2;
import androidx.core.view.C0685f;
import androidx.core.view.C0687f0;
import androidx.core.view.C0689f2;
import androidx.core.view.C0704g;
import androidx.core.view.C0727l0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import miuix.animation.controller.AnimState;
import p021d.C1447a;
import p021d.C1449c;
import p021d.C1452f;
import p021d.C1453g;
import p021d.C1455i;
import p021d.C1456j;
import p027e.C1512a;
import p063k.C1774g;

/* renamed from: androidx.appcompat.app.h */
class C0133h extends C0130g implements C0214g.C0215a, LayoutInflater.Factory2 {

    /* renamed from: o0 */
    private static final C1774g<String, Integer> f379o0 = new C1774g<>();

    /* renamed from: p0 */
    private static final boolean f380p0 = false;

    /* renamed from: q0 */
    private static final int[] f381q0 = {16842836};

    /* renamed from: r0 */
    private static final boolean f382r0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: s0 */
    private static final boolean f383s0 = true;

    /* renamed from: A */
    ActionBarContextView f384A;

    /* renamed from: B */
    PopupWindow f385B;

    /* renamed from: C */
    Runnable f386C;

    /* renamed from: D */
    C0662b2 f387D;

    /* renamed from: E */
    private boolean f388E;

    /* renamed from: F */
    private boolean f389F;

    /* renamed from: G */
    ViewGroup f390G;

    /* renamed from: H */
    private TextView f391H;

    /* renamed from: I */
    private View f392I;

    /* renamed from: J */
    private boolean f393J;

    /* renamed from: K */
    private boolean f394K;

    /* renamed from: L */
    boolean f395L;

    /* renamed from: M */
    boolean f396M;

    /* renamed from: N */
    boolean f397N;

    /* renamed from: O */
    boolean f398O;

    /* renamed from: P */
    boolean f399P;

    /* renamed from: Q */
    private boolean f400Q;

    /* renamed from: R */
    private C0156t[] f401R;

    /* renamed from: S */
    private C0156t f402S;

    /* renamed from: T */
    private boolean f403T;

    /* renamed from: U */
    private boolean f404U;

    /* renamed from: V */
    private boolean f405V;

    /* renamed from: W */
    boolean f406W;

    /* renamed from: X */
    private Configuration f407X;

    /* renamed from: Y */
    private int f408Y;

    /* renamed from: Z */
    private int f409Z;

    /* renamed from: a0 */
    private int f410a0;

    /* renamed from: b0 */
    private boolean f411b0;

    /* renamed from: c0 */
    private C0151p f412c0;

    /* renamed from: d0 */
    private C0151p f413d0;

    /* renamed from: e0 */
    boolean f414e0;

    /* renamed from: f0 */
    int f415f0;

    /* renamed from: g0 */
    private final Runnable f416g0;

    /* renamed from: h0 */
    private boolean f417h0;

    /* renamed from: i0 */
    private Rect f418i0;

    /* renamed from: j0 */
    private Rect f419j0;

    /* renamed from: k0 */
    private C0161l f420k0;

    /* renamed from: l0 */
    private C0169p f421l0;

    /* renamed from: m0 */
    private OnBackInvokedDispatcher f422m0;

    /* renamed from: n0 */
    private OnBackInvokedCallback f423n0;

    /* renamed from: o */
    final Object f424o;

    /* renamed from: p */
    final Context f425p;

    /* renamed from: q */
    Window f426q;

    /* renamed from: r */
    private C0149n f427r;

    /* renamed from: s */
    final C0127d f428s;

    /* renamed from: t */
    C0116a f429t;

    /* renamed from: u */
    MenuInflater f430u;

    /* renamed from: v */
    private CharSequence f431v;

    /* renamed from: w */
    private C0329h0 f432w;

    /* renamed from: x */
    private C0141g f433x;

    /* renamed from: y */
    private C0157u f434y;

    /* renamed from: z */
    C0182b f435z;

    /* renamed from: androidx.appcompat.app.h$a */
    class C0134a implements Runnable {
        C0134a() {
        }

        public void run() {
            C0133h hVar = C0133h.this;
            if ((hVar.f415f0 & 1) != 0) {
                hVar.mo509n0(0);
            }
            C0133h hVar2 = C0133h.this;
            if ((hVar2.f415f0 & 4096) != 0) {
                hVar2.mo509n0(108);
            }
            C0133h hVar3 = C0133h.this;
            hVar3.f414e0 = false;
            hVar3.f415f0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    class C0135b implements C0687f0 {
        C0135b() {
        }

        /* renamed from: a */
        public C0689f2 mo519a(View view, C0689f2 f2Var) {
            int k = f2Var.mo2873k();
            int k1 = C0133h.this.mo506k1(f2Var, (Rect) null);
            if (k != k1) {
                f2Var = f2Var.mo2876o(f2Var.mo2871i(), k1, f2Var.mo2872j(), f2Var.mo2869h());
            }
            return C0727l0.m2864N(view, f2Var);
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    class C0136c implements ContentFrameLayout.C0256a {
        C0136c() {
        }

        /* renamed from: a */
        public void mo520a() {
        }

        public void onDetachedFromWindow() {
            C0133h.this.mo507l0();
        }
    }

    /* renamed from: androidx.appcompat.app.h$d */
    class C0137d implements Runnable {

        /* renamed from: androidx.appcompat.app.h$d$a */
        class C0138a extends C0680d2 {
            C0138a() {
            }

            /* renamed from: b */
            public void mo523b(View view) {
                C0133h.this.f384A.setAlpha(1.0f);
                C0133h.this.f387D.mo2823h((C0675c2) null);
                C0133h.this.f387D = null;
            }

            /* renamed from: c */
            public void mo524c(View view) {
                C0133h.this.f384A.setVisibility(0);
            }
        }

        C0137d() {
        }

        public void run() {
            C0133h hVar = C0133h.this;
            hVar.f385B.showAtLocation(hVar.f384A, 55, 0, 0);
            C0133h.this.mo510o0();
            if (C0133h.this.mo493Z0()) {
                C0133h.this.f384A.setAlpha(0.0f);
                C0133h hVar2 = C0133h.this;
                hVar2.f387D = C0727l0.m2881c(hVar2.f384A).mo2818b(1.0f);
                C0133h.this.f387D.mo2823h(new C0138a());
                return;
            }
            C0133h.this.f384A.setAlpha(1.0f);
            C0133h.this.f384A.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.h$e */
    class C0139e extends C0680d2 {
        C0139e() {
        }

        /* renamed from: b */
        public void mo523b(View view) {
            C0133h.this.f384A.setAlpha(1.0f);
            C0133h.this.f387D.mo2823h((C0675c2) null);
            C0133h.this.f387D = null;
        }

        /* renamed from: c */
        public void mo524c(View view) {
            C0133h.this.f384A.setVisibility(0);
            if (C0133h.this.f384A.getParent() instanceof View) {
                C0727l0.m2872V((View) C0133h.this.f384A.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$f */
    interface C0140f {
        /* renamed from: a */
        boolean mo525a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.h$g */
    private final class C0141g implements C0230m.C0231a {
        C0141g() {
        }

        /* renamed from: a */
        public void mo527a(C0214g gVar, boolean z) {
            C0133h.this.mo501e0(gVar);
        }

        /* renamed from: b */
        public boolean mo528b(C0214g gVar) {
            Window.Callback A0 = C0133h.this.mo479A0();
            if (A0 == null) {
                return true;
            }
            A0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.h$h */
    class C0142h implements C0182b.C0183a {

        /* renamed from: a */
        private C0182b.C0183a f443a;

        /* renamed from: androidx.appcompat.app.h$h$a */
        class C0143a extends C0680d2 {
            C0143a() {
            }

            /* renamed from: b */
            public void mo523b(View view) {
                C0133h.this.f384A.setVisibility(8);
                C0133h hVar = C0133h.this;
                PopupWindow popupWindow = hVar.f385B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f384A.getParent() instanceof View) {
                    C0727l0.m2872V((View) C0133h.this.f384A.getParent());
                }
                C0133h.this.f384A.mo1157k();
                C0133h.this.f387D.mo2823h((C0675c2) null);
                C0133h hVar2 = C0133h.this;
                hVar2.f387D = null;
                C0727l0.m2872V(hVar2.f390G);
            }
        }

        public C0142h(C0182b.C0183a aVar) {
            this.f443a = aVar;
        }

        /* renamed from: a */
        public boolean mo529a(C0182b bVar, Menu menu) {
            C0727l0.m2872V(C0133h.this.f390G);
            return this.f443a.mo529a(bVar, menu);
        }

        /* renamed from: b */
        public void mo530b(C0182b bVar) {
            this.f443a.mo530b(bVar);
            C0133h hVar = C0133h.this;
            if (hVar.f385B != null) {
                hVar.f426q.getDecorView().removeCallbacks(C0133h.this.f386C);
            }
            C0133h hVar2 = C0133h.this;
            if (hVar2.f384A != null) {
                hVar2.mo510o0();
                C0133h hVar3 = C0133h.this;
                hVar3.f387D = C0727l0.m2881c(hVar3.f384A).mo2818b(0.0f);
                C0133h.this.f387D.mo2823h(new C0143a());
            }
            C0133h hVar4 = C0133h.this;
            C0127d dVar = hVar4.f428s;
            if (dVar != null) {
                dVar.mo440q(hVar4.f435z);
            }
            C0133h hVar5 = C0133h.this;
            hVar5.f435z = null;
            C0727l0.m2872V(hVar5.f390G);
            C0133h.this.mo504i1();
        }

        /* renamed from: c */
        public boolean mo531c(C0182b bVar, MenuItem menuItem) {
            return this.f443a.mo531c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo532d(C0182b bVar, Menu menu) {
            return this.f443a.mo532d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.h$i */
    static class C0144i {
        /* renamed from: a */
        static Context m548a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m549b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        /* renamed from: c */
        static void m550c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        static void m551d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.h$j */
    static class C0145j {
        /* renamed from: a */
        static boolean m552a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        static String m553b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    static class C0146k {
        /* renamed from: a */
        static void m554a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        /* renamed from: b */
        static C0581f m555b(Configuration configuration) {
            return C0581f.m2395b(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m556c(C0581f fVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fVar.mo2643g()));
        }

        /* renamed from: d */
        static void m557d(Configuration configuration, C0581f fVar) {
            configuration.setLocales(LocaleList.forLanguageTags(fVar.mo2643g()));
        }
    }

    /* renamed from: androidx.appcompat.app.h$l */
    static class C0147l {
        /* renamed from: a */
        static void m558a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$m */
    static class C0148m {
        /* renamed from: a */
        static OnBackInvokedDispatcher m559a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m560b(Object obj, C0133h hVar) {
            Objects.requireNonNull(hVar);
            C0158i iVar = new C0158i(hVar);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(AnimState.VIEW_SIZE, iVar);
            return iVar;
        }

        /* renamed from: c */
        static void m561c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.app.h$n */
    class C0149n extends C0195i {

        /* renamed from: e */
        private C0140f f446e;

        /* renamed from: f */
        private boolean f447f;

        /* renamed from: g */
        private boolean f448g;

        /* renamed from: h */
        private boolean f449h;

        C0149n(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo533b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f448g = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f448g = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f448g = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo534c(Window.Callback callback) {
            try {
                this.f447f = true;
                callback.onContentChanged();
                this.f447f = false;
            } catch (Throwable th) {
                this.f447f = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo535d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f449h = true;
                callback.onPanelClosed(i, menu);
                this.f449h = false;
            } catch (Throwable th) {
                this.f449h = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f448g ? mo685a().dispatchKeyEvent(keyEvent) : C0133h.this.mo508m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0133h.this.mo484L0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final ActionMode mo538e(ActionMode.Callback callback) {
            C0188f.C0189a aVar = new C0188f.C0189a(C0133h.this.f425p, callback);
            C0182b c1 = C0133h.this.mo498c1(aVar);
            if (c1 != null) {
                return aVar.mo666e(c1);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f447f) {
                mo685a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0214g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.h$f r0 = r1.f446e
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.C0149n.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0133h.this.mo486O0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f449h) {
                mo685a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            C0133h.this.mo487P0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0214g gVar = menu instanceof C0214g ? (C0214g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            boolean z = true;
            if (gVar != null) {
                gVar.mo884a0(true);
            }
            C0140f fVar = this.f446e;
            if (fVar == null || !fVar.mo525a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (gVar != null) {
                gVar.mo884a0(false);
            }
            return z;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0214g gVar;
            C0156t y0 = C0133h.this.mo516y0(0, true);
            if (y0 == null || (gVar = y0.f468j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0133h.this.mo480G0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo538e(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.h$o */
    private class C0150o extends C0151p {

        /* renamed from: c */
        private final PowerManager f451c;

        C0150o(Context context) {
            super();
            this.f451c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo548b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo549c() {
            return C0145j.m552a(this.f451c) ? 2 : 1;
        }

        /* renamed from: d */
        public void mo550d() {
            C0133h.this.mo491Y();
        }
    }

    /* renamed from: androidx.appcompat.app.h$p */
    abstract class C0151p {

        /* renamed from: a */
        private BroadcastReceiver f453a;

        /* renamed from: androidx.appcompat.app.h$p$a */
        class C0152a extends BroadcastReceiver {
            C0152a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0151p.this.mo550d();
            }
        }

        C0151p() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo551a() {
            BroadcastReceiver broadcastReceiver = this.f453a;
            if (broadcastReceiver != null) {
                try {
                    C0133h.this.f425p.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f453a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo548b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo549c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo550d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo552e() {
            mo551a();
            IntentFilter b = mo548b();
            if (b != null && b.countActions() != 0) {
                if (this.f453a == null) {
                    this.f453a = new C0152a();
                }
                C0133h.this.f425p.registerReceiver(this.f453a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$q */
    private class C0153q extends C0151p {

        /* renamed from: c */
        private final C0174t f456c;

        C0153q(C0174t tVar) {
            super();
            this.f456c = tVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo548b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo549c() {
            return this.f456c.mo595d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo550d() {
            C0133h.this.mo491Y();
        }
    }

    /* renamed from: androidx.appcompat.app.h$r */
    private static class C0154r {
        /* renamed from: a */
        static void m577a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.h$s */
    private class C0155s extends ContentFrameLayout {
        public C0155s(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m578b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0133h.this.mo508m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m578b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0133h.this.mo502g0(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1512a.m6567b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.h$t */
    protected static final class C0156t {

        /* renamed from: a */
        int f459a;

        /* renamed from: b */
        int f460b;

        /* renamed from: c */
        int f461c;

        /* renamed from: d */
        int f462d;

        /* renamed from: e */
        int f463e;

        /* renamed from: f */
        int f464f;

        /* renamed from: g */
        ViewGroup f465g;

        /* renamed from: h */
        View f466h;

        /* renamed from: i */
        View f467i;

        /* renamed from: j */
        C0214g f468j;

        /* renamed from: k */
        C0211e f469k;

        /* renamed from: l */
        Context f470l;

        /* renamed from: m */
        boolean f471m;

        /* renamed from: n */
        boolean f472n;

        /* renamed from: o */
        boolean f473o;

        /* renamed from: p */
        public boolean f474p;

        /* renamed from: q */
        boolean f475q = false;

        /* renamed from: r */
        boolean f476r;

        /* renamed from: s */
        Bundle f477s;

        C0156t(int i) {
            this.f459a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0232n mo557a(C0230m.C0231a aVar) {
            if (this.f468j == null) {
                return null;
            }
            if (this.f469k == null) {
                C0211e eVar = new C0211e(this.f470l, C1453g.f5821j);
                this.f469k = eVar;
                eVar.mo803h(aVar);
                this.f468j.mo894b(this.f469k);
            }
            return this.f469k.mo842j(this.f465g);
        }

        /* renamed from: b */
        public boolean mo558b() {
            if (this.f466h == null) {
                return false;
            }
            if (this.f467i != null) {
                return true;
            }
            return this.f469k.mo841i().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo559c(C0214g gVar) {
            C0211e eVar;
            C0214g gVar2 = this.f468j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo872O(this.f469k);
                }
                this.f468j = gVar;
                if (gVar != null && (eVar = this.f469k) != null) {
                    gVar.mo894b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo560d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C1447a.f5675a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C1447a.f5665E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C1455i.f5847b;
            }
            newTheme.applyStyle(i2, true);
            C0185d dVar = new C0185d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f470l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C1456j.f6093y0);
            this.f460b = obtainStyledAttributes.getResourceId(C1456j.f5856B0, 0);
            this.f464f = obtainStyledAttributes.getResourceId(C1456j.f5851A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.h$u */
    private final class C0157u implements C0230m.C0231a {
        C0157u() {
        }

        /* renamed from: a */
        public void mo527a(C0214g gVar, boolean z) {
            C0214g D = gVar.mo862D();
            boolean z2 = D != gVar;
            C0133h hVar = C0133h.this;
            if (z2) {
                gVar = D;
            }
            C0156t r0 = hVar.mo513r0(gVar);
            if (r0 == null) {
                return;
            }
            if (z2) {
                C0133h.this.mo499d0(r0.f459a, r0, D);
                C0133h.this.mo503h0(r0, true);
                return;
            }
            C0133h.this.mo503h0(r0, z);
        }

        /* renamed from: b */
        public boolean mo528b(C0214g gVar) {
            Window.Callback A0;
            if (gVar != gVar.mo862D()) {
                return true;
            }
            C0133h hVar = C0133h.this;
            if (!hVar.f395L || (A0 = hVar.mo479A0()) == null || C0133h.this.f406W) {
                return true;
            }
            A0.onMenuOpened(108, gVar);
            return true;
        }
    }

    C0133h(Activity activity, C0127d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    C0133h(Dialog dialog, C0127d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f379o0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0133h(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0127d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f387D = r0
            r0 = 1
            r2.f388E = r0
            r0 = -100
            r2.f408Y = r0
            androidx.appcompat.app.h$a r1 = new androidx.appcompat.app.h$a
            r1.<init>()
            r2.f416g0 = r1
            r2.f425p = r3
            r2.f428s = r5
            r2.f424o = r6
            int r3 = r2.f408Y
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.c r3 = r2.m459f1()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.g r3 = r3.mo441q0()
            int r3 = r3.mo474r()
            r2.f408Y = r3
        L_0x0032:
            int r3 = r2.f408Y
            if (r3 != r0) goto L_0x0059
            k.g<java.lang.String, java.lang.Integer> r3 = f379o0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f408Y = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.m454a0(r4)
        L_0x005e:
            androidx.appcompat.widget.C0327h.m1478h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m439B0() {
        /*
            r3 = this;
            r3.m466p0()
            boolean r0 = r3.f395L
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f429t
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f424o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.u r0 = new androidx.appcompat.app.u
            java.lang.Object r1 = r3.f424o
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f396M
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f429t = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.u r0 = new androidx.appcompat.app.u
            java.lang.Object r1 = r3.f424o
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f429t
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f417h0
            r0.mo382v(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.m439B0():void");
    }

    /* renamed from: C0 */
    private boolean m440C0(C0156t tVar) {
        View view = tVar.f467i;
        if (view != null) {
            tVar.f466h = view;
            return true;
        } else if (tVar.f468j == null) {
            return false;
        } else {
            if (this.f434y == null) {
                this.f434y = new C0157u();
            }
            View view2 = (View) tVar.mo557a(this.f434y);
            tVar.f466h = view2;
            return view2 != null;
        }
    }

    /* renamed from: D0 */
    private boolean m441D0(C0156t tVar) {
        tVar.mo560d(mo514t0());
        tVar.f465g = new C0155s(tVar.f470l);
        tVar.f461c = 81;
        return true;
    }

    /* renamed from: E0 */
    private boolean m442E0(C0156t tVar) {
        Context context = this.f425p;
        int i = tVar.f459a;
        if ((i == 0 || i == 108) && this.f432w != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C1447a.f5680f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C1447a.f5681g, typedValue, true);
            } else {
                theme.resolveAttribute(C1447a.f5681g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0185d dVar = new C0185d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0214g gVar = new C0214g(context);
        gVar.mo875R(this);
        tVar.mo559c(gVar);
        return true;
    }

    /* renamed from: F0 */
    private void m443F0(int i) {
        this.f415f0 = (1 << i) | this.f415f0;
        if (!this.f414e0) {
            C0727l0.m2870T(this.f426q.getDecorView(), this.f416g0);
            this.f414e0 = true;
        }
    }

    /* renamed from: K0 */
    private boolean m444K0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0156t y0 = mo516y0(i, true);
        if (!y0.f473o) {
            return m448U0(y0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m445N0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f435z
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$t r2 = r4.mo516y0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.h0 r5 = r4.f432w
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1188h()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f425p
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.h0 r5 = r4.f432w
            boolean r5 = r5.mo1173b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f406W
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m448U0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.h0 r5 = r4.f432w
            boolean r0 = r5.mo1181g()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.h0 r5 = r4.f432w
            boolean r0 = r5.mo1179f()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f473o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f472n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f471m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f476r
            if (r5 == 0) goto L_0x005b
            r2.f471m = r1
            boolean r5 = r4.m448U0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m446R0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.mo503h0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f425p
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.m445N0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m446R0(androidx.appcompat.app.C0133h.C0156t r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f473o
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r13.f406W
            if (r0 == 0) goto L_0x000a
            goto L_0x00f8
        L_0x000a:
            int r0 = r14.f459a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f425p
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.mo479A0()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f459a
            androidx.appcompat.view.menu.g r4 = r14.f468j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.mo503h0(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f425p
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.m448U0(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.f465g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006a
            boolean r5 = r14.f475q
            if (r5 == 0) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            android.view.View r15 = r14.f467i
            if (r15 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x00cc
            int r15 = r15.width
            if (r15 != r3) goto L_0x00cc
            r6 = r3
            goto L_0x00cd
        L_0x006a:
            if (r15 != 0) goto L_0x0077
            boolean r15 = r13.m441D0(r14)
            if (r15 == 0) goto L_0x0076
            android.view.ViewGroup r15 = r14.f465g
            if (r15 != 0) goto L_0x0086
        L_0x0076:
            return
        L_0x0077:
            boolean r3 = r14.f475q
            if (r3 == 0) goto L_0x0086
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x0086
            android.view.ViewGroup r15 = r14.f465g
            r15.removeAllViews()
        L_0x0086:
            boolean r15 = r13.m440C0(r14)
            if (r15 == 0) goto L_0x00f6
            boolean r15 = r14.mo558b()
            if (r15 != 0) goto L_0x0093
            goto L_0x00f6
        L_0x0093:
            android.view.View r15 = r14.f466h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x00a0:
            int r3 = r14.f460b
            android.view.ViewGroup r5 = r14.f465g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f466h
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00b8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f466h
            r3.removeView(r5)
        L_0x00b8:
            android.view.ViewGroup r3 = r14.f465g
            android.view.View r5 = r14.f466h
            r3.addView(r5, r15)
            android.view.View r15 = r14.f466h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x00cc
            android.view.View r15 = r14.f466h
            r15.requestFocus()
        L_0x00cc:
            r6 = r4
        L_0x00cd:
            r14.f472n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.f462d
            int r9 = r14.f463e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f461c
            r15.gravity = r1
            int r1 = r14.f464f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f465g
            r0.addView(r1, r15)
            r14.f473o = r2
            int r14 = r14.f459a
            if (r14 != 0) goto L_0x00f5
            r13.mo504i1()
        L_0x00f5:
            return
        L_0x00f6:
            r14.f475q = r2
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.m446R0(androidx.appcompat.app.h$t, android.view.KeyEvent):void");
    }

    /* renamed from: T0 */
    private boolean m447T0(C0156t tVar, int i, KeyEvent keyEvent, int i2) {
        C0214g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f471m || m448U0(tVar, keyEvent)) && (gVar = tVar.f468j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f432w == null) {
            mo503h0(tVar, true);
        }
        return z;
    }

    /* renamed from: U0 */
    private boolean m448U0(C0156t tVar, KeyEvent keyEvent) {
        C0329h0 h0Var;
        C0329h0 h0Var2;
        C0329h0 h0Var3;
        if (this.f406W) {
            return false;
        }
        if (tVar.f471m) {
            return true;
        }
        C0156t tVar2 = this.f402S;
        if (!(tVar2 == null || tVar2 == tVar)) {
            mo503h0(tVar2, false);
        }
        Window.Callback A0 = mo479A0();
        if (A0 != null) {
            tVar.f467i = A0.onCreatePanelView(tVar.f459a);
        }
        int i = tVar.f459a;
        boolean z = i == 0 || i == 108;
        if (z && (h0Var3 = this.f432w) != null) {
            h0Var3.mo1176d();
        }
        if (tVar.f467i == null) {
            if (z) {
                mo489S0();
            }
            C0214g gVar = tVar.f468j;
            if (gVar == null || tVar.f476r) {
                if (gVar == null && (!m442E0(tVar) || tVar.f468j == null)) {
                    return false;
                }
                if (z && this.f432w != null) {
                    if (this.f433x == null) {
                        this.f433x = new C0141g();
                    }
                    this.f432w.mo1172a(tVar.f468j, this.f433x);
                }
                tVar.f468j.mo901d0();
                if (!A0.onCreatePanelMenu(tVar.f459a, tVar.f468j)) {
                    tVar.mo559c((C0214g) null);
                    if (z && (h0Var2 = this.f432w) != null) {
                        h0Var2.mo1172a((Menu) null, this.f433x);
                    }
                    return false;
                }
                tVar.f476r = false;
            }
            tVar.f468j.mo901d0();
            Bundle bundle = tVar.f477s;
            if (bundle != null) {
                tVar.f468j.mo873P(bundle);
                tVar.f477s = null;
            }
            if (!A0.onPreparePanel(0, tVar.f467i, tVar.f468j)) {
                if (z && (h0Var = this.f432w) != null) {
                    h0Var.mo1172a((Menu) null, this.f433x);
                }
                tVar.f468j.mo896c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f474p = z2;
            tVar.f468j.setQwertyMode(z2);
            tVar.f468j.mo896c0();
        }
        tVar.f471m = true;
        tVar.f472n = false;
        this.f402S = tVar;
        return true;
    }

    /* renamed from: V0 */
    private void m449V0(boolean z) {
        C0329h0 h0Var = this.f432w;
        if (h0Var == null || !h0Var.mo1188h() || (ViewConfiguration.get(this.f425p).hasPermanentMenuKey() && !this.f432w.mo1178e())) {
            C0156t y0 = mo516y0(0, true);
            y0.f475q = true;
            mo503h0(y0, false);
            m446R0(y0, (KeyEvent) null);
            return;
        }
        Window.Callback A0 = mo479A0();
        if (this.f432w.mo1173b() && z) {
            this.f432w.mo1179f();
            if (!this.f406W) {
                A0.onPanelClosed(108, mo516y0(0, true).f468j);
            }
        } else if (A0 != null && !this.f406W) {
            if (this.f414e0 && (this.f415f0 & 1) != 0) {
                this.f426q.getDecorView().removeCallbacks(this.f416g0);
                this.f416g0.run();
            }
            C0156t y02 = mo516y0(0, true);
            C0214g gVar = y02.f468j;
            if (gVar != null && !y02.f476r && A0.onPreparePanel(0, y02.f467i, gVar)) {
                A0.onMenuOpened(108, y02.f468j);
                this.f432w.mo1181g();
            }
        }
    }

    /* renamed from: W */
    private boolean m450W(boolean z) {
        return m452X(z, true);
    }

    /* renamed from: W0 */
    private int m451W0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: X */
    private boolean m452X(boolean z, boolean z2) {
        if (this.f406W) {
            return false;
        }
        int c0 = m456c0();
        int H0 = mo481H0(this.f425p, c0);
        C0581f fVar = null;
        if (Build.VERSION.SDK_INT < 33) {
            fVar = mo496b0(this.f425p);
        }
        if (!z2 && fVar != null) {
            fVar = mo515x0(this.f425p.getResources().getConfiguration());
        }
        boolean h1 = m461h1(H0, fVar, z);
        if (c0 == 0) {
            m471w0(this.f425p).mo552e();
        } else {
            C0151p pVar = this.f412c0;
            if (pVar != null) {
                pVar.mo551a();
            }
        }
        if (c0 == 3) {
            m470v0(this.f425p).mo552e();
        } else {
            C0151p pVar2 = this.f413d0;
            if (pVar2 != null) {
                pVar2.mo551a();
            }
        }
        return h1;
    }

    /* renamed from: Z */
    private void m453Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f390G.findViewById(16908290);
        View decorView = this.f426q.getDecorView();
        contentFrameLayout.mo1450a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f425p.obtainStyledAttributes(C1456j.f6093y0);
        obtainStyledAttributes.getValue(C1456j.f5901K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1456j.f5906L0, contentFrameLayout.getMinWidthMinor());
        int i = C1456j.f5891I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C1456j.f5896J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C1456j.f5881G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C1456j.f5886H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: a0 */
    private void m454a0(Window window) {
        if (this.f426q == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0149n)) {
                C0149n nVar = new C0149n(callback);
                this.f427r = nVar;
                window.setCallback(nVar);
                C0326g1 t = C0326g1.m1454t(this.f425p, (AttributeSet) null, f381q0);
                Drawable g = t.mo1870g(0);
                if (g != null) {
                    window.setBackgroundDrawable(g);
                }
                t.mo1882v();
                this.f426q = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f422m0 == null) {
                    mo464S((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a1 */
    private boolean m455a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f426q.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0727l0.m2859I((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: c0 */
    private int m456c0() {
        int i = this.f408Y;
        return i != -100 ? i : C0130g.m404q();
    }

    /* renamed from: e1 */
    private void m457e1() {
        if (this.f389F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: f0 */
    private void m458f0() {
        C0151p pVar = this.f412c0;
        if (pVar != null) {
            pVar.mo551a();
        }
        C0151p pVar2 = this.f413d0;
        if (pVar2 != null) {
            pVar2.mo551a();
        }
    }

    /* renamed from: f1 */
    private C0124c m459f1() {
        Context context = this.f425p;
        while (context != null) {
            if (!(context instanceof C0124c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0124c) context;
            }
        }
        return null;
    }

    /* renamed from: g1 */
    private void m460g1(Configuration configuration) {
        Activity activity = (Activity) this.f424o;
        if (activity instanceof C1048m) {
            if (!((C1048m) activity).mo252c().mo3791b().mo3794a(C1035g.C1038c.CREATED)) {
                return;
            }
        } else if (!this.f405V || this.f406W) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m461h1(int r9, androidx.core.p008os.C0581f r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f425p
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m462i0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f425p
            int r1 = r8.m469u0(r1)
            android.content.res.Configuration r2 = r8.f407X
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f425p
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.f r2 = r8.mo515x0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.f r0 = r8.mo515x0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0047
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0047
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x0047:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x0071
            if (r11 == 0) goto L_0x0071
            boolean r11 = r8.f404U
            if (r11 == 0) goto L_0x0071
            boolean r11 = f382r0
            if (r11 != 0) goto L_0x005a
            boolean r11 = r8.f405V
            if (r11 == 0) goto L_0x0071
        L_0x005a:
            java.lang.Object r11 = r8.f424o
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0071
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x0071
            java.lang.Object r11 = r8.f424o
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.C0483b.m2059k(r11)
            r11 = r7
            goto L_0x0072
        L_0x0071:
            r11 = r6
        L_0x0072:
            if (r11 != 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            r11 = r3 & r1
            if (r11 != r3) goto L_0x007b
            r6 = r7
        L_0x007b:
            r8.m464j1(r4, r0, r6, r5)
            goto L_0x0080
        L_0x007f:
            r7 = r11
        L_0x0080:
            if (r7 == 0) goto L_0x009c
            java.lang.Object r11 = r8.f424o
            boolean r1 = r11 instanceof androidx.appcompat.app.C0124c
            if (r1 == 0) goto L_0x009c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0091
            androidx.appcompat.app.c r11 = (androidx.appcompat.app.C0124c) r11
            r11.mo446v0(r9)
        L_0x0091:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = r8.f424o
            androidx.appcompat.app.c r9 = (androidx.appcompat.app.C0124c) r9
            r9.mo445u0(r10)
        L_0x009c:
            if (r7 == 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            android.content.Context r9 = r8.f425p
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.f r9 = r8.mo515x0(r9)
            r8.mo492Y0(r9)
        L_0x00b1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.m461h1(int, androidx.core.os.f, boolean):boolean");
    }

    /* renamed from: i0 */
    private Configuration m462i0(Context context, int i, C0581f fVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (fVar != null) {
            mo490X0(configuration2, fVar);
        }
        return configuration2;
    }

    /* renamed from: j0 */
    private ViewGroup m463j0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f425p.obtainStyledAttributes(C1456j.f6093y0);
        int i = C1456j.f5866D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C1456j.f5911M0, false)) {
                mo460M(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo460M(108);
            }
            if (obtainStyledAttributes.getBoolean(C1456j.f5871E0, false)) {
                mo460M(109);
            }
            if (obtainStyledAttributes.getBoolean(C1456j.f5876F0, false)) {
                mo460M(10);
            }
            this.f398O = obtainStyledAttributes.getBoolean(C1456j.f6098z0, false);
            obtainStyledAttributes.recycle();
            m467q0();
            this.f426q.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f425p);
            if (this.f399P) {
                viewGroup = (ViewGroup) from.inflate(this.f397N ? C1453g.f5826o : C1453g.f5825n, (ViewGroup) null);
            } else if (this.f398O) {
                viewGroup = (ViewGroup) from.inflate(C1453g.f5817f, (ViewGroup) null);
                this.f396M = false;
                this.f395L = false;
            } else if (this.f395L) {
                TypedValue typedValue = new TypedValue();
                this.f425p.getTheme().resolveAttribute(C1447a.f5680f, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0185d(this.f425p, typedValue.resourceId) : this.f425p).inflate(C1453g.f5827p, (ViewGroup) null);
                C0329h0 h0Var = (C0329h0) viewGroup.findViewById(C1452f.f5801p);
                this.f432w = h0Var;
                h0Var.setWindowCallback(mo479A0());
                if (this.f396M) {
                    this.f432w.mo1191k(109);
                }
                if (this.f393J) {
                    this.f432w.mo1191k(2);
                }
                if (this.f394K) {
                    this.f432w.mo1191k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C0727l0.m2898k0(viewGroup, new C0135b());
                if (this.f432w == null) {
                    this.f391H = (TextView) viewGroup.findViewById(C1452f.f5782M);
                }
                C0385r1.m1723c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1452f.f5787b);
                ViewGroup viewGroup2 = (ViewGroup) this.f426q.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f426q.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0136c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f395L + ", windowActionBarOverlay: " + this.f396M + ", android:windowIsFloating: " + this.f398O + ", windowActionModeOverlay: " + this.f397N + ", windowNoTitle: " + this.f399P + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: j1 */
    private void m464j1(int i, C0581f fVar, boolean z, Configuration configuration) {
        Resources resources = this.f425p.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        if (fVar != null) {
            mo490X0(configuration2, fVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0171r.m630a(resources);
        }
        int i2 = this.f409Z;
        if (i2 != 0) {
            this.f425p.setTheme(i2);
            this.f425p.getTheme().applyStyle(this.f409Z, true);
        }
        if (z && (this.f424o instanceof Activity)) {
            m460g1(configuration2);
        }
    }

    /* renamed from: l1 */
    private void m465l1(View view) {
        int i;
        Context context;
        if ((C0727l0.m2854D(view) & 8192) != 0) {
            context = this.f425p;
            i = C1449c.f5703b;
        } else {
            context = this.f425p;
            i = C1449c.f5702a;
        }
        view.setBackgroundColor(C0510a.m2122c(context, i));
    }

    /* renamed from: p0 */
    private void m466p0() {
        if (!this.f389F) {
            this.f390G = m463j0();
            CharSequence z0 = mo517z0();
            if (!TextUtils.isEmpty(z0)) {
                C0329h0 h0Var = this.f432w;
                if (h0Var != null) {
                    h0Var.setWindowTitle(z0);
                } else if (mo489S0() != null) {
                    mo489S0().mo364B(z0);
                } else {
                    TextView textView = this.f391H;
                    if (textView != null) {
                        textView.setText(z0);
                    }
                }
            }
            m453Z();
            mo488Q0(this.f390G);
            this.f389F = true;
            C0156t y0 = mo516y0(0, false);
            if (this.f406W) {
                return;
            }
            if (y0 == null || y0.f468j == null) {
                m443F0(108);
            }
        }
    }

    /* renamed from: q0 */
    private void m467q0() {
        if (this.f426q == null) {
            Object obj = this.f424o;
            if (obj instanceof Activity) {
                m454a0(((Activity) obj).getWindow());
            }
        }
        if (this.f426q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: s0 */
    private static Configuration m468s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            C0146k.m554a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0147l.m558a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0144i.m549b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: u0 */
    private int m469u0(Context context) {
        if (!this.f411b0 && (this.f424o instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f424o.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f410a0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f410a0 = 0;
            }
        }
        this.f411b0 = true;
        return this.f410a0;
    }

    /* renamed from: v0 */
    private C0151p m470v0(Context context) {
        if (this.f413d0 == null) {
            this.f413d0 = new C0150o(context);
        }
        return this.f413d0;
    }

    /* renamed from: w0 */
    private C0151p m471w0(Context context) {
        if (this.f412c0 == null) {
            this.f412c0 = new C0153q(C0174t.m636a(context));
        }
        return this.f412c0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final Window.Callback mo479A0() {
        return this.f426q.getCallback();
    }

    /* renamed from: C */
    public void mo452C(Configuration configuration) {
        C0116a w;
        if (this.f395L && this.f389F && (w = mo476w()) != null) {
            w.mo376p(configuration);
        }
        C0327h.m1476b().mo1886g(this.f425p);
        this.f407X = new Configuration(this.f425p.getResources().getConfiguration());
        m452X(false, false);
    }

    /* renamed from: D */
    public void mo453D(Bundle bundle) {
        this.f404U = true;
        m450W(false);
        m467q0();
        Object obj = this.f424o;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0501i.m2099c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0116a S0 = mo489S0();
                if (S0 == null) {
                    this.f417h0 = true;
                } else {
                    S0.mo382v(true);
                }
            }
            C0130g.m399e(this);
        }
        this.f407X = new Configuration(this.f425p.getResources().getConfiguration());
        this.f405V = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo454E() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f424o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0130g.m392K(r3)
        L_0x0009:
            boolean r0 = r3.f414e0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f426q
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f416g0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f406W = r0
            int r0 = r3.f408Y
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f424o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            k.g<java.lang.String, java.lang.Integer> r0 = f379o0
            java.lang.Object r1 = r3.f424o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f408Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            k.g<java.lang.String, java.lang.Integer> r0 = f379o0
            java.lang.Object r1 = r3.f424o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f429t
            if (r0 == 0) goto L_0x005b
            r0.mo377q()
        L_0x005b:
            r3.m458f0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.mo454E():void");
    }

    /* renamed from: F */
    public void mo455F(Bundle bundle) {
        m466p0();
    }

    /* renamed from: G */
    public void mo456G() {
        C0116a w = mo476w();
        if (w != null) {
            w.mo363A(true);
        }
    }

    /* renamed from: G0 */
    public boolean mo480G0() {
        return this.f388E;
    }

    /* renamed from: H */
    public void mo457H(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public int mo481H0(Context context, int i) {
        C0151p w0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        w0 = m470v0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                w0 = m471w0(context);
            }
            return w0.mo549c();
        }
        return i;
    }

    /* renamed from: I */
    public void mo458I() {
        m452X(true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean mo482I0() {
        boolean z = this.f403T;
        this.f403T = false;
        C0156t y0 = mo516y0(0, false);
        if (y0 == null || !y0.f473o) {
            C0182b bVar = this.f435z;
            if (bVar != null) {
                bVar.mo613c();
                return true;
            }
            C0116a w = mo476w();
            return w != null && w.mo369i();
        }
        if (!z) {
            mo503h0(y0, true);
        }
        return true;
    }

    /* renamed from: J */
    public void mo459J() {
        C0116a w = mo476w();
        if (w != null) {
            w.mo363A(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean mo483J0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f403T = z;
        } else if (i == 82) {
            m444K0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo484L0(int i, KeyEvent keyEvent) {
        C0116a w = mo476w();
        if (w != null && w.mo378r(i, keyEvent)) {
            return true;
        }
        C0156t tVar = this.f402S;
        if (tVar == null || !m447T0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f402S == null) {
                C0156t y0 = mo516y0(0, true);
                m448U0(y0, keyEvent);
                boolean T0 = m447T0(y0, keyEvent.getKeyCode(), keyEvent, 1);
                y0.f471m = false;
                if (T0) {
                    return true;
                }
            }
            return false;
        }
        C0156t tVar2 = this.f402S;
        if (tVar2 != null) {
            tVar2.f472n = true;
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo460M(int i) {
        int W0 = m451W0(i);
        if (this.f399P && W0 == 108) {
            return false;
        }
        if (this.f395L && W0 == 1) {
            this.f395L = false;
        }
        if (W0 == 1) {
            m457e1();
            this.f399P = true;
            return true;
        } else if (W0 == 2) {
            m457e1();
            this.f393J = true;
            return true;
        } else if (W0 == 5) {
            m457e1();
            this.f394K = true;
            return true;
        } else if (W0 == 10) {
            m457e1();
            this.f397N = true;
            return true;
        } else if (W0 == 108) {
            m457e1();
            this.f395L = true;
            return true;
        } else if (W0 != 109) {
            return this.f426q.requestFeature(W0);
        } else {
            m457e1();
            this.f396M = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public boolean mo485M0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m445N0(0, keyEvent);
                return true;
            }
        } else if (mo482I0()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo486O0(int i) {
        C0116a w;
        if (i == 108 && (w = mo476w()) != null) {
            w.mo370j(true);
        }
    }

    /* renamed from: P */
    public void mo461P(int i) {
        m466p0();
        ViewGroup viewGroup = (ViewGroup) this.f390G.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f425p).inflate(i, viewGroup);
        this.f427r.mo534c(this.f426q.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo487P0(int i) {
        if (i == 108) {
            C0116a w = mo476w();
            if (w != null) {
                w.mo370j(false);
            }
        } else if (i == 0) {
            C0156t y0 = mo516y0(i, true);
            if (y0.f473o) {
                mo503h0(y0, false);
            }
        }
    }

    /* renamed from: Q */
    public void mo462Q(View view) {
        m466p0();
        ViewGroup viewGroup = (ViewGroup) this.f390G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f427r.mo534c(this.f426q.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo488Q0(ViewGroup viewGroup) {
    }

    /* renamed from: R */
    public void mo463R(View view, ViewGroup.LayoutParams layoutParams) {
        m466p0();
        ViewGroup viewGroup = (ViewGroup) this.f390G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f427r.mo534c(this.f426q.getCallback());
    }

    /* renamed from: S */
    public void mo464S(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo464S(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f422m0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f423n0) == null)) {
            C0148m.m561c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f423n0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f424o;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = C0148m.m559a((Activity) this.f424o);
            }
        }
        this.f422m0 = onBackInvokedDispatcher;
        mo504i1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final C0116a mo489S0() {
        return this.f429t;
    }

    /* renamed from: T */
    public void mo465T(int i) {
        this.f409Z = i;
    }

    /* renamed from: U */
    public final void mo466U(CharSequence charSequence) {
        this.f431v = charSequence;
        C0329h0 h0Var = this.f432w;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
        } else if (mo489S0() != null) {
            mo489S0().mo364B(charSequence);
        } else {
            TextView textView = this.f391H;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo490X0(Configuration configuration, C0581f fVar) {
        C0146k.m557d(configuration, fVar);
    }

    /* renamed from: Y */
    public boolean mo491Y() {
        return m450W(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo492Y0(C0581f fVar) {
        C0146k.m556c(fVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f390G;
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo493Z0() {
        /*
            r1 = this;
            boolean r0 = r1.f389F
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f390G
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.C0727l0.m2860J(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.mo493Z0():boolean");
    }

    /* renamed from: a */
    public boolean mo494a(C0214g gVar, MenuItem menuItem) {
        C0156t r0;
        Window.Callback A0 = mo479A0();
        if (A0 == null || this.f406W || (r0 = mo513r0(gVar.mo862D())) == null) {
            return false;
        }
        return A0.onMenuItemSelected(r0.f459a, menuItem);
    }

    /* renamed from: b */
    public void mo495b(C0214g gVar) {
        m449V0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C0581f mo496b0(Context context) {
        C0581f u;
        if (Build.VERSION.SDK_INT >= 33 || (u = C0130g.m406u()) == null) {
            return null;
        }
        C0581f x0 = mo515x0(context.getApplicationContext().getResources().getConfiguration());
        C0581f b = C0170q.m629b(u, x0);
        return b.mo2640e() ? x0 : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public boolean mo497b1() {
        if (this.f422m0 == null) {
            return false;
        }
        C0156t y0 = mo516y0(0, false);
        return (y0 != null && y0.f473o) || this.f435z != null;
    }

    /* renamed from: c1 */
    public C0182b mo498c1(C0182b.C0183a aVar) {
        C0127d dVar;
        if (aVar != null) {
            C0182b bVar = this.f435z;
            if (bVar != null) {
                bVar.mo613c();
            }
            C0142h hVar = new C0142h(aVar);
            C0116a w = mo476w();
            if (w != null) {
                C0182b D = w.mo366D(hVar);
                this.f435z = D;
                if (!(D == null || (dVar = this.f428s) == null)) {
                    dVar.mo429n(D);
                }
            }
            if (this.f435z == null) {
                this.f435z = mo500d1(hVar);
            }
            mo504i1();
            return this.f435z;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo499d0(int i, C0156t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i >= 0) {
                C0156t[] tVarArr = this.f401R;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                menu = tVar.f468j;
            }
        }
        if ((tVar == null || tVar.f473o) && !this.f406W) {
            this.f427r.mo535d(this.f426q.getCallback(), i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.C0182b mo500d1(androidx.appcompat.view.C0182b.C0183a r8) {
        /*
            r7 = this;
            r7.mo510o0()
            androidx.appcompat.view.b r0 = r7.f435z
            if (r0 == 0) goto L_0x000a
            r0.mo613c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0133h.C0142h
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$h r0 = new androidx.appcompat.app.h$h
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f428s
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f406W
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.mo421M(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f435z = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f384A
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f398O
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f425p
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p021d.C1447a.f5680f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f425p
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f425p
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f425p
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f384A = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p021d.C1447a.f5683i
            r5.<init>(r4, r1, r6)
            r7.f385B = r5
            r6 = 2
            androidx.core.widget.C0825j.m3295b(r5, r6)
            android.widget.PopupWindow r5 = r7.f385B
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f384A
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f385B
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p021d.C1447a.f5676b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f384A
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f385B
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$d r0 = new androidx.appcompat.app.h$d
            r0.<init>()
            r7.f386C = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f390G
            int r4 = p021d.C1452f.f5793h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo514t0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1727a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f384A = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f384A
            if (r0 == 0) goto L_0x015b
            r7.mo510o0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f384A
            r0.mo1157k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f384A
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f384A
            android.widget.PopupWindow r6 = r7.f385B
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo615e()
            boolean r8 = r8.mo532d(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo619k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            r8.mo1155h(r0)
            r7.f435z = r0
            boolean r8 = r7.mo493Z0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            androidx.core.view.b2 r8 = androidx.core.view.C0727l0.m2881c(r8)
            androidx.core.view.b2 r8 = r8.mo2818b(r0)
            r7.f387D = r8
            androidx.appcompat.app.h$e r0 = new androidx.appcompat.app.h$e
            r0.<init>()
            r8.mo2823h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f384A
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.C0727l0.m2872V(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f385B
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f426q
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f386C
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f435z = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f435z
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.d r0 = r7.f428s
            if (r0 == 0) goto L_0x0166
            r0.mo429n(r8)
        L_0x0166:
            r7.mo504i1()
            androidx.appcompat.view.b r8 = r7.f435z
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.mo500d1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo501e0(C0214g gVar) {
        if (!this.f400Q) {
            this.f400Q = true;
            this.f432w.mo1192l();
            Window.Callback A0 = mo479A0();
            if (A0 != null && !this.f406W) {
                A0.onPanelClosed(108, gVar);
            }
            this.f400Q = false;
        }
    }

    /* renamed from: f */
    public void mo467f(View view, ViewGroup.LayoutParams layoutParams) {
        m466p0();
        ((ViewGroup) this.f390G.findViewById(16908290)).addView(view, layoutParams);
        this.f427r.mo534c(this.f426q.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo468g() {
        if (C0130g.m408z(this.f425p) && C0130g.m406u() != null && !C0130g.m406u().equals(C0130g.m407v())) {
            mo469i(this.f425p);
        }
        return m450W(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo502g0(int i) {
        mo503h0(mo516y0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo503h0(C0156t tVar, boolean z) {
        ViewGroup viewGroup;
        C0329h0 h0Var;
        if (!z || tVar.f459a != 0 || (h0Var = this.f432w) == null || !h0Var.mo1173b()) {
            WindowManager windowManager = (WindowManager) this.f425p.getSystemService("window");
            if (!(windowManager == null || !tVar.f473o || (viewGroup = tVar.f465g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo499d0(tVar.f459a, tVar, (Menu) null);
                }
            }
            tVar.f471m = false;
            tVar.f472n = false;
            tVar.f473o = false;
            tVar.f466h = null;
            tVar.f475q = true;
            if (this.f402S == tVar) {
                this.f402S = null;
            }
            if (tVar.f459a == 0) {
                mo504i1();
                return;
            }
            return;
        }
        mo501e0(tVar.f468j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo504i1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean b1 = mo497b1();
            if (b1 && this.f423n0 == null) {
                this.f423n0 = C0148m.m560b(this.f422m0, this);
            } else if (!b1 && (onBackInvokedCallback = this.f423n0) != null) {
                C0148m.m561c(this.f422m0, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: k */
    public Context mo471k(Context context) {
        boolean z = true;
        this.f404U = true;
        int H0 = mo481H0(context, m456c0());
        if (C0130g.m408z(context)) {
            C0130g.m396V(context);
        }
        C0581f b0 = mo496b0(context);
        if (f383s0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0154r.m577a((ContextThemeWrapper) context, m462i0(context, H0, b0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0185d) {
            try {
                ((C0185d) context).mo640a(m462i0(context, H0, b0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f382r0) {
            return super.mo471k(context);
        }
        Configuration configuration = null;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C0144i.m548a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m468s0(configuration3, configuration4);
        }
        Configuration i0 = m462i0(context, H0, b0, configuration, true);
        C0185d dVar = new C0185d(context, C1455i.f5848c);
        dVar.mo640a(i0);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0528f.C0534f.m2222a(dVar.getTheme());
        }
        return super.mo471k(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0089;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo505k0(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.l r0 = r11.f420k0
            r1 = 0
            if (r0 != 0) goto L_0x005a
            android.content.Context r0 = r11.f425p
            int[] r2 = p021d.C1456j.f6093y0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p021d.C1456j.f5861C0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            r0.<init>()
        L_0x001a:
            r11.f420k0 = r0
            goto L_0x005a
        L_0x001d:
            android.content.Context r2 = r11.f425p     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0038 }
            androidx.appcompat.app.l r2 = (androidx.appcompat.app.C0161l) r2     // Catch:{ all -> 0x0038 }
            r11.f420k0 = r2     // Catch:{ all -> 0x0038 }
            goto L_0x005a
        L_0x0038:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            r0.<init>()
            goto L_0x001a
        L_0x005a:
            boolean r8 = f380p0
            r0 = 1
            if (r8 == 0) goto L_0x008a
            androidx.appcompat.app.p r2 = r11.f421l0
            if (r2 != 0) goto L_0x006a
            androidx.appcompat.app.p r2 = new androidx.appcompat.app.p
            r2.<init>()
            r11.f421l0 = r2
        L_0x006a:
            androidx.appcompat.app.p r2 = r11.f421l0
            boolean r2 = r2.mo593a(r15)
            if (r2 == 0) goto L_0x0074
            r7 = r0
            goto L_0x008b
        L_0x0074:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L_0x0082
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L_0x008a
            goto L_0x0089
        L_0x0082:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.m455a1(r0)
        L_0x0089:
            r1 = r0
        L_0x008a:
            r7 = r1
        L_0x008b:
            androidx.appcompat.app.l r2 = r11.f420k0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.C0382q1.m1719c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.mo586r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0133h.mo505k0(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public final int mo506k1(C0689f2 f2Var, Rect rect) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        int k = f2Var != null ? f2Var.mo2873k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f384A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f384A.getLayoutParams();
            boolean z3 = true;
            if (this.f384A.isShown()) {
                if (this.f418i0 == null) {
                    this.f418i0 = new Rect();
                    this.f419j0 = new Rect();
                }
                Rect rect2 = this.f418i0;
                Rect rect3 = this.f419j0;
                if (f2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f2Var.mo2871i(), f2Var.mo2873k(), f2Var.mo2872j(), f2Var.mo2869h());
                }
                C0385r1.m1721a(this.f390G, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C0689f2 A = C0727l0.m2851A(this.f390G);
                int i6 = A == null ? 0 : A.mo2871i();
                int j = A == null ? 0 : A.mo2872j();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f392I != null) {
                    View view = this.f392I;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == j))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = i6;
                        marginLayoutParams.rightMargin = j;
                        this.f392I.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f425p);
                    this.f392I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = j;
                    this.f390G.addView(this.f392I, -1, layoutParams);
                }
                View view3 = this.f392I;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m465l1(this.f392I);
                }
                if (!this.f397N && z3) {
                    k = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f384A.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f392I;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo507l0() {
        C0214g gVar;
        C0329h0 h0Var = this.f432w;
        if (h0Var != null) {
            h0Var.mo1192l();
        }
        if (this.f385B != null) {
            this.f426q.getDecorView().removeCallbacks(this.f386C);
            if (this.f385B.isShowing()) {
                try {
                    this.f385B.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f385B = null;
        }
        mo510o0();
        C0156t y0 = mo516y0(0, false);
        if (y0 != null && (gVar = y0.f468j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public boolean mo508m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f424o;
        boolean z = true;
        if (((obj instanceof C0685f.C0686a) || (obj instanceof C0160k)) && (decorView = this.f426q.getDecorView()) != null && C0685f.m2714d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f427r.mo533b(this.f426q.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo483J0(keyCode, keyEvent) : mo485M0(keyCode, keyEvent);
    }

    /* renamed from: n */
    public <T extends View> T mo472n(int i) {
        m466p0();
        return this.f426q.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo509n0(int i) {
        C0156t y0;
        C0156t y02 = mo516y0(i, true);
        if (y02.f468j != null) {
            Bundle bundle = new Bundle();
            y02.f468j.mo874Q(bundle);
            if (bundle.size() > 0) {
                y02.f477s = bundle;
            }
            y02.f468j.mo901d0();
            y02.f468j.clear();
        }
        y02.f476r = true;
        y02.f475q = true;
        if ((i == 108 || i == 0) && this.f432w != null && (y0 = mo516y0(0, false)) != null) {
            y0.f471m = false;
            m448U0(y0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo510o0() {
        C0662b2 b2Var = this.f387D;
        if (b2Var != null) {
            b2Var.mo2819c();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo505k0(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public Context mo473p() {
        return this.f425p;
    }

    /* renamed from: r */
    public int mo474r() {
        return this.f408Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C0156t mo513r0(Menu menu) {
        C0156t[] tVarArr = this.f401R;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0156t tVar = tVarArr[i];
            if (tVar != null && tVar.f468j == menu) {
                return tVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public MenuInflater mo475t() {
        if (this.f430u == null) {
            m439B0();
            C0116a aVar = this.f429t;
            this.f430u = new C0190g(aVar != null ? aVar.mo372l() : this.f425p);
        }
        return this.f430u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final Context mo514t0() {
        C0116a w = mo476w();
        Context l = w != null ? w.mo372l() : null;
        return l == null ? this.f425p : l;
    }

    /* renamed from: w */
    public C0116a mo476w() {
        m439B0();
        return this.f429t;
    }

    /* renamed from: x */
    public void mo477x() {
        LayoutInflater from = LayoutInflater.from(this.f425p);
        if (from.getFactory() == null) {
            C0704g.m2815a(from, this);
        } else if (!(from.getFactory2() instanceof C0133h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C0581f mo515x0(Configuration configuration) {
        return C0146k.m555b(configuration);
    }

    /* renamed from: y */
    public void mo478y() {
        if (mo489S0() != null && !mo476w().mo373m()) {
            m443F0(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C0156t mo516y0(int i, boolean z) {
        C0156t[] tVarArr = this.f401R;
        if (tVarArr == null || tVarArr.length <= i) {
            C0156t[] tVarArr2 = new C0156t[(i + 1)];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f401R = tVarArr2;
            tVarArr = tVarArr2;
        }
        C0156t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        C0156t tVar2 = new C0156t(i);
        tVarArr[i] = tVar2;
        return tVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public final CharSequence mo517z0() {
        Object obj = this.f424o;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f431v;
    }
}
