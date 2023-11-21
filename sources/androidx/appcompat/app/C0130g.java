package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0166o;
import androidx.core.p008os.C0574a;
import androidx.core.p008os.C0581f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import p063k.C1768b;

/* renamed from: androidx.appcompat.app.g */
public abstract class C0130g {

    /* renamed from: d */
    static C0166o.C0167a f368d = new C0166o.C0167a(new C0166o.C0168b());

    /* renamed from: e */
    private static int f369e = -100;

    /* renamed from: f */
    private static C0581f f370f = null;

    /* renamed from: g */
    private static C0581f f371g = null;

    /* renamed from: h */
    private static Boolean f372h = null;

    /* renamed from: i */
    private static boolean f373i = false;

    /* renamed from: j */
    private static Object f374j = null;

    /* renamed from: k */
    private static Context f375k = null;

    /* renamed from: l */
    private static final C1768b<WeakReference<C0130g>> f376l = new C1768b<>();

    /* renamed from: m */
    private static final Object f377m = new Object();

    /* renamed from: n */
    private static final Object f378n = new Object();

    /* renamed from: androidx.appcompat.app.g$a */
    static class C0131a {
        /* renamed from: a */
        static LocaleList m436a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    static class C0132b {
        /* renamed from: a */
        static LocaleList m437a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        static void m438b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    C0130g() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ void m391B(Context context) {
        C0166o.m620c(context);
        f373i = true;
    }

    /* renamed from: K */
    static void m392K(C0130g gVar) {
        synchronized (f377m) {
            m393L(gVar);
        }
    }

    /* renamed from: L */
    private static void m393L(C0130g gVar) {
        synchronized (f377m) {
            Iterator<WeakReference<C0130g>> it = f376l.iterator();
            while (it.hasNext()) {
                C0130g gVar2 = (C0130g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: N */
    static void m394N(Context context) {
        f375k = context;
    }

    /* renamed from: O */
    public static void m395O(C0581f fVar) {
        Objects.requireNonNull(fVar);
        if (C0574a.m2384c()) {
            Object s = m405s();
            if (s != null) {
                C0132b.m438b(s, C0131a.m436a(fVar.mo2643g()));
            }
        } else if (!fVar.equals(f370f)) {
            synchronized (f377m) {
                f370f = fVar;
                m400h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m396V(android.content.Context r3) {
        /*
            boolean r0 = m408z(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.p008os.C0574a.m2384c()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f373i
            if (r0 != 0) goto L_0x0054
            androidx.appcompat.app.o$a r0 = f368d
            androidx.appcompat.app.e r1 = new androidx.appcompat.app.e
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0054
        L_0x001c:
            java.lang.Object r0 = f378n
            monitor-enter(r0)
            androidx.core.os.f r1 = f370f     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0040
            androidx.core.os.f r1 = f371g     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0031
            java.lang.String r3 = androidx.appcompat.app.C0166o.m619b(r3)     // Catch:{ all -> 0x0055 }
            androidx.core.os.f r3 = androidx.core.p008os.C0581f.m2395b(r3)     // Catch:{ all -> 0x0055 }
            f371g = r3     // Catch:{ all -> 0x0055 }
        L_0x0031:
            androidx.core.os.f r3 = f371g     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.mo2640e()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x003b
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x003b:
            androidx.core.os.f r3 = f371g     // Catch:{ all -> 0x0055 }
            f370f = r3     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x0040:
            androidx.core.os.f r2 = f371g     // Catch:{ all -> 0x0055 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0053
            androidx.core.os.f r1 = f370f     // Catch:{ all -> 0x0055 }
            f371g = r1     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.mo2643g()     // Catch:{ all -> 0x0055 }
            androidx.appcompat.app.C0166o.m618a(r3, r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0130g.m396V(android.content.Context):void");
    }

    /* renamed from: e */
    static void m399e(C0130g gVar) {
        synchronized (f377m) {
            m393L(gVar);
            f376l.add(new WeakReference(gVar));
        }
    }

    /* renamed from: h */
    private static void m400h() {
        Iterator<WeakReference<C0130g>> it = f376l.iterator();
        while (it.hasNext()) {
            C0130g gVar = (C0130g) it.next().get();
            if (gVar != null) {
                gVar.mo468g();
            }
        }
    }

    /* renamed from: l */
    public static C0130g m401l(Activity activity, C0127d dVar) {
        return new C0133h(activity, dVar);
    }

    /* renamed from: m */
    public static C0130g m402m(Dialog dialog, C0127d dVar) {
        return new C0133h(dialog, dVar);
    }

    /* renamed from: o */
    public static C0581f m403o() {
        if (C0574a.m2384c()) {
            Object s = m405s();
            if (s != null) {
                return C0581f.m2397h(C0132b.m437a(s));
            }
        } else {
            C0581f fVar = f370f;
            if (fVar != null) {
                return fVar;
            }
        }
        return C0581f.m2396d();
    }

    /* renamed from: q */
    public static int m404q() {
        return f369e;
    }

    /* renamed from: s */
    static Object m405s() {
        Context p;
        Object obj = f374j;
        if (obj != null) {
            return obj;
        }
        if (f375k == null) {
            Iterator<WeakReference<C0130g>> it = f376l.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0130g gVar = (C0130g) it.next().get();
                    if (gVar != null && (p = gVar.mo473p()) != null) {
                        f375k = p;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Context context = f375k;
        if (context != null) {
            f374j = context.getSystemService("locale");
        }
        return f374j;
    }

    /* renamed from: u */
    static C0581f m406u() {
        return f370f;
    }

    /* renamed from: v */
    static C0581f m407v() {
        return f371g;
    }

    /* renamed from: z */
    static boolean m408z(Context context) {
        if (f372h == null) {
            try {
                Bundle bundle = C0163m.m616a(context).metaData;
                if (bundle != null) {
                    f372h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f372h = Boolean.FALSE;
            }
        }
        return f372h.booleanValue();
    }

    /* renamed from: C */
    public abstract void mo452C(Configuration configuration);

    /* renamed from: D */
    public abstract void mo453D(Bundle bundle);

    /* renamed from: E */
    public abstract void mo454E();

    /* renamed from: F */
    public abstract void mo455F(Bundle bundle);

    /* renamed from: G */
    public abstract void mo456G();

    /* renamed from: H */
    public abstract void mo457H(Bundle bundle);

    /* renamed from: I */
    public abstract void mo458I();

    /* renamed from: J */
    public abstract void mo459J();

    /* renamed from: M */
    public abstract boolean mo460M(int i);

    /* renamed from: P */
    public abstract void mo461P(int i);

    /* renamed from: Q */
    public abstract void mo462Q(View view);

    /* renamed from: R */
    public abstract void mo463R(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: S */
    public void mo464S(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: T */
    public void mo465T(int i) {
    }

    /* renamed from: U */
    public abstract void mo466U(CharSequence charSequence);

    /* renamed from: f */
    public abstract void mo467f(View view, ViewGroup.LayoutParams layoutParams);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo468g() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo469i(Context context) {
        f368d.execute(new C0129f(context));
    }

    @Deprecated
    /* renamed from: j */
    public void mo470j(Context context) {
    }

    /* renamed from: k */
    public Context mo471k(Context context) {
        mo470j(context);
        return context;
    }

    /* renamed from: n */
    public abstract <T extends View> T mo472n(int i);

    /* renamed from: p */
    public Context mo473p() {
        return null;
    }

    /* renamed from: r */
    public int mo474r() {
        return -100;
    }

    /* renamed from: t */
    public abstract MenuInflater mo475t();

    /* renamed from: w */
    public abstract C0116a mo476w();

    /* renamed from: x */
    public abstract void mo477x();

    /* renamed from: y */
    public abstract void mo478y();
}
