package p010b0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: b0.d */
public final class C1285d {

    /* renamed from: a */
    public static final C1285d f4467a = new C1285d();

    /* renamed from: b */
    private static C1288c f4468b = C1288c.f4479e;

    /* renamed from: b0.d$a */
    public enum C1286a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: b0.d$b */
    public interface C1287b {
        /* renamed from: a */
        void mo5113a(C1294i iVar);
    }

    /* renamed from: b0.d$c */
    public static final class C1288c {

        /* renamed from: d */
        public static final C1289a f4478d = new C1289a((C2420e) null);

        /* renamed from: e */
        public static final C1288c f4479e = new C1288c(C1474e0.m6454b(), (C1287b) null, C1496z.m6504d());

        /* renamed from: a */
        private final Set<C1286a> f4480a;

        /* renamed from: b */
        private final C1287b f4481b;

        /* renamed from: c */
        private final Map<String, Set<Class<? extends C1294i>>> f4482c;

        /* renamed from: b0.d$c$a */
        public static final class C1289a {
            private C1289a() {
            }

            public /* synthetic */ C1289a(C2420e eVar) {
                this();
            }
        }

        public C1288c(Set<? extends C1286a> set, C1287b bVar, Map<String, ? extends Set<Class<? extends C1294i>>> map) {
            C2422g.m10285e(set, "flags");
            C2422g.m10285e(map, "allowedViolations");
            this.f4480a = set;
            this.f4481b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put((String) next.getKey(), (Set) next.getValue());
            }
            this.f4482c = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<C1286a> mo5114a() {
            return this.f4480a;
        }

        /* renamed from: b */
        public final C1287b mo5115b() {
            return this.f4481b;
        }

        /* renamed from: c */
        public final Map<String, Set<Class<? extends C1294i>>> mo5116c() {
            return this.f4482c;
        }
    }

    private C1285d() {
    }

    /* renamed from: c */
    private final C1288c m5920c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.mo3287n0()) {
                FragmentManager U = fragment.mo3250U();
                C2422g.m10284d(U, "declaringFragment.parentFragmentManager");
                if (U.mo3333A0() != null) {
                    C1288c A0 = U.mo3333A0();
                    C2422g.m10282b(A0);
                    return A0;
                }
            }
            fragment = fragment.mo3247T();
        }
        return f4468b;
    }

    /* renamed from: d */
    private final void m5921d(C1288c cVar, C1294i iVar) {
        Fragment a = iVar.mo5117a();
        String name = a.getClass().getName();
        if (cVar.mo5114a().contains(C1286a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, iVar);
        }
        if (cVar.mo5115b() != null) {
            m5930m(a, new C1283b(cVar, iVar));
        }
        if (cVar.mo5114a().contains(C1286a.PENALTY_DEATH)) {
            m5930m(a, new C1284c(name, iVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m5922e(C1288c cVar, C1294i iVar) {
        C2422g.m10285e(cVar, "$policy");
        C2422g.m10285e(iVar, "$violation");
        cVar.mo5115b().mo5113a(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m5923f(String str, C1294i iVar) {
        C2422g.m10285e(iVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, iVar);
        throw iVar;
    }

    /* renamed from: g */
    private final void m5924g(C1294i iVar) {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + iVar.mo5117a().getClass().getName(), iVar);
        }
    }

    /* renamed from: h */
    public static final void m5925h(Fragment fragment, String str) {
        C2422g.m10285e(fragment, "fragment");
        C2422g.m10285e(str, "previousFragmentId");
        C1282a aVar = new C1282a(fragment, str);
        C1285d dVar = f4467a;
        dVar.m5924g(aVar);
        C1288c c = dVar.m5920c(fragment);
        if (c.mo5114a().contains(C1286a.DETECT_FRAGMENT_REUSE) && dVar.m5931n(c, fragment.getClass(), aVar.getClass())) {
            dVar.m5921d(c, aVar);
        }
    }

    /* renamed from: i */
    public static final void m5926i(Fragment fragment, ViewGroup viewGroup) {
        C2422g.m10285e(fragment, "fragment");
        C1290e eVar = new C1290e(fragment, viewGroup);
        C1285d dVar = f4467a;
        dVar.m5924g(eVar);
        C1288c c = dVar.m5920c(fragment);
        if (c.mo5114a().contains(C1286a.DETECT_FRAGMENT_TAG_USAGE) && dVar.m5931n(c, fragment.getClass(), eVar.getClass())) {
            dVar.m5921d(c, eVar);
        }
    }

    /* renamed from: j */
    public static final void m5927j(Fragment fragment) {
        C2422g.m10285e(fragment, "fragment");
        C1291f fVar = new C1291f(fragment);
        C1285d dVar = f4467a;
        dVar.m5924g(fVar);
        C1288c c = dVar.m5920c(fragment);
        if (c.mo5114a().contains(C1286a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.m5931n(c, fragment.getClass(), fVar.getClass())) {
            dVar.m5921d(c, fVar);
        }
    }

    /* renamed from: k */
    public static final void m5928k(Fragment fragment, Fragment fragment2, int i) {
        C2422g.m10285e(fragment, "violatingFragment");
        C2422g.m10285e(fragment2, "targetFragment");
        C1292g gVar = new C1292g(fragment, fragment2, i);
        C1285d dVar = f4467a;
        dVar.m5924g(gVar);
        C1288c c = dVar.m5920c(fragment);
        if (c.mo5114a().contains(C1286a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.m5931n(c, fragment.getClass(), gVar.getClass())) {
            dVar.m5921d(c, gVar);
        }
    }

    /* renamed from: l */
    public static final void m5929l(Fragment fragment, ViewGroup viewGroup) {
        C2422g.m10285e(fragment, "fragment");
        C2422g.m10285e(viewGroup, "container");
        C1295j jVar = new C1295j(fragment, viewGroup);
        C1285d dVar = f4467a;
        dVar.m5924g(jVar);
        C1288c c = dVar.m5920c(fragment);
        if (c.mo5114a().contains(C1286a.DETECT_WRONG_FRAGMENT_CONTAINER) && dVar.m5931n(c, fragment.getClass(), jVar.getClass())) {
            dVar.m5921d(c, jVar);
        }
    }

    /* renamed from: m */
    private final void m5930m(Fragment fragment, Runnable runnable) {
        if (fragment.mo3287n0()) {
            Handler k = fragment.mo3250U().mo3401u0().mo3693k();
            C2422g.m10284d(k, "fragment.parentFragmentManager.host.handler");
            if (!C2422g.m10281a(k.getLooper(), Looper.myLooper())) {
                k.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: n */
    private final boolean m5931n(C1288c cVar, Class<? extends Fragment> cls, Class<? extends C1294i> cls2) {
        Set set = cVar.mo5116c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C2422g.m10281a(cls2.getSuperclass(), C1294i.class) || !C1487q.m6473h(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
