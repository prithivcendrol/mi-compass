package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p040g0.C1587c;
import p040g0.C1593e;
import p083n1.C2420e;
import p083n1.C2422g;

public final class Recreator implements C1046k {

    /* renamed from: e */
    public static final C1261a f4372e = new C1261a((C2420e) null);

    /* renamed from: d */
    private final C1593e f4373d;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1261a {
        private C1261a() {
        }

        public /* synthetic */ C1261a(C2420e eVar) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C1262b implements C1587c.C1590c {

        /* renamed from: a */
        private final Set<String> f4374a = new LinkedHashSet();

        public C1262b(C1587c cVar) {
            C2422g.m10285e(cVar, "registry");
            cVar.mo5737h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo299a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4374a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo4983b(String str) {
            C2422g.m10285e(str, "className");
            this.f4374a.add(str);
        }
    }

    public Recreator(C1593e eVar) {
        C2422g.m10285e(eVar, "owner");
        this.f4373d = eVar;
    }

    /* renamed from: h */
    private final void m5802h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1587c.C1588a.class);
            C2422g.m10284d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C2422g.m10284d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C1587c.C1588a) newInstance).mo3735a(this.f4373d);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        C2422g.m10285e(mVar, "source");
        C2422g.m10285e(bVar, "event");
        if (bVar == C1035g.C1037b.ON_CREATE) {
            mVar.mo252c().mo3792c(this);
            Bundle b = this.f4373d.mo254f().mo5732b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String h : stringArrayList) {
                        m5802h(h);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
