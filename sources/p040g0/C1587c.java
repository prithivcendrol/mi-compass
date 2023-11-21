package p040g0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import p057j.C1660b;
import p083n1.C2420e;
import p083n1.C2422g;

@SuppressLint({"RestrictedApi"})
/* renamed from: g0.c */
public final class C1587c {

    /* renamed from: g */
    private static final C1589b f6365g = new C1589b((C2420e) null);

    /* renamed from: a */
    private final C1660b<String, C1590c> f6366a = new C1660b<>();

    /* renamed from: b */
    private boolean f6367b;

    /* renamed from: c */
    private Bundle f6368c;

    /* renamed from: d */
    private boolean f6369d;

    /* renamed from: e */
    private Recreator.C1262b f6370e;

    /* renamed from: f */
    private boolean f6371f = true;

    /* renamed from: g0.c$a */
    public interface C1588a {
        /* renamed from: a */
        void mo3735a(C1593e eVar);
    }

    /* renamed from: g0.c$b */
    private static final class C1589b {
        private C1589b() {
        }

        public /* synthetic */ C1589b(C2420e eVar) {
            this();
        }
    }

    /* renamed from: g0.c$c */
    public interface C1590c {
        /* renamed from: a */
        Bundle mo299a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m6796d(C1587c cVar, C1048m mVar, C1035g.C1037b bVar) {
        boolean z;
        C2422g.m10285e(cVar, "this$0");
        C2422g.m10285e(mVar, "<anonymous parameter 0>");
        C2422g.m10285e(bVar, "event");
        if (bVar == C1035g.C1037b.ON_START) {
            z = true;
        } else if (bVar == C1035g.C1037b.ON_STOP) {
            z = false;
        } else {
            return;
        }
        cVar.f6371f = z;
    }

    /* renamed from: b */
    public final Bundle mo5732b(String str) {
        C2422g.m10285e(str, "key");
        if (this.f6369d) {
            Bundle bundle = this.f6368c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f6368c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f6368c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f6368c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final C1590c mo5733c(String str) {
        C2422g.m10285e(str, "key");
        Iterator<Map.Entry<String, C1590c>> it = this.f6366a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C2422g.m10284d(next, "components");
            C1590c cVar = (C1590c) next.getValue();
            if (C2422g.m10281a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo5734e(C1035g gVar) {
        C2422g.m10285e(gVar, "lifecycle");
        if (!this.f6367b) {
            gVar.mo3790a(new C1586b(this));
            this.f6367b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void mo5735f(Bundle bundle) {
        if (!this.f6367b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f6369d) {
            this.f6368c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f6369d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    /* renamed from: g */
    public final void mo5736g(Bundle bundle) {
        C2422g.m10285e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f6368c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1660b<K, V>.d c = this.f6366a.mo5835c();
        C2422g.m10284d(c, "this.components.iteratorWithAdditions()");
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            bundle2.putBundle((String) entry.getKey(), ((C1590c) entry.getValue()).mo299a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void mo5737h(String str, C1590c cVar) {
        C2422g.m10285e(str, "key");
        C2422g.m10285e(cVar, "provider");
        if (!(this.f6366a.mo5831f(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void mo5738i(Class<? extends C1588a> cls) {
        C2422g.m10285e(cls, "clazz");
        if (this.f6371f) {
            Recreator.C1262b bVar = this.f6370e;
            if (bVar == null) {
                bVar = new Recreator.C1262b(this);
            }
            this.f6370e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1262b bVar2 = this.f6370e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C2422g.m10284d(name, "clazz.name");
                    bVar2.mo4983b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
