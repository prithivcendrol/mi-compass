package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1019c0;
import androidx.lifecycle.C1021d0;
import androidx.lifecycle.C1034f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.z */
final class C1000z extends C1019c0 {

    /* renamed from: k */
    private static final C1021d0.C1025b f3382k = new C1001a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f3383d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1000z> f3384e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C1034f0> f3385f = new HashMap<>();

    /* renamed from: g */
    private final boolean f3386g;

    /* renamed from: h */
    private boolean f3387h = false;

    /* renamed from: i */
    private boolean f3388i = false;

    /* renamed from: j */
    private boolean f3389j = false;

    /* renamed from: androidx.fragment.app.z$a */
    class C1001a implements C1021d0.C1025b {
        C1001a() {
        }

        /* renamed from: a */
        public <T extends C1019c0> T mo3734a(Class<T> cls) {
            return new C1000z(true);
        }
    }

    C1000z(boolean z) {
        this.f3386g = z;
    }

    /* renamed from: h */
    private void m4122h(String str) {
        C1000z zVar = this.f3384e.get(str);
        if (zVar != null) {
            zVar.mo3719d();
            this.f3384e.remove(str);
        }
        C1034f0 f0Var = this.f3385f.get(str);
        if (f0Var != null) {
            f0Var.mo3786a();
            this.f3385f.remove(str);
        }
    }

    /* renamed from: k */
    static C1000z m4123k(C1034f0 f0Var) {
        return (C1000z) new C1021d0(f0Var, f3382k).mo3781a(C1000z.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3719d() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3387h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3720e(Fragment fragment) {
        if (this.f3389j) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3383d.containsKey(fragment.f3025i)) {
            this.f3383d.put(fragment.f3025i, fragment);
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1000z.class != obj.getClass()) {
            return false;
        }
        C1000z zVar = (C1000z) obj;
        return this.f3383d.equals(zVar.f3383d) && this.f3384e.equals(zVar.f3384e) && this.f3385f.equals(zVar.f3385f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3722f(Fragment fragment) {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m4122h(fragment.f3025i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3723g(String str) {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m4122h(str);
    }

    public int hashCode() {
        return (((this.f3383d.hashCode() * 31) + this.f3384e.hashCode()) * 31) + this.f3385f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3725i(String str) {
        return this.f3383d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1000z mo3726j(Fragment fragment) {
        C1000z zVar = this.f3384e.get(fragment.f3025i);
        if (zVar != null) {
            return zVar;
        }
        C1000z zVar2 = new C1000z(this.f3386g);
        this.f3384e.put(fragment.f3025i, zVar2);
        return zVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Collection<Fragment> mo3727l() {
        return new ArrayList(this.f3383d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C1034f0 mo3728m(Fragment fragment) {
        C1034f0 f0Var = this.f3385f.get(fragment.f3025i);
        if (f0Var != null) {
            return f0Var;
        }
        C1034f0 f0Var2 = new C1034f0();
        this.f3385f.put(fragment.f3025i, f0Var2);
        return f0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3729n() {
        return this.f3387h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3730o(Fragment fragment) {
        if (!this.f3389j) {
            if ((this.f3383d.remove(fragment.f3025i) != null) && FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3731p(boolean z) {
        this.f3389j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo3732q(Fragment fragment) {
        if (!this.f3383d.containsKey(fragment.f3025i)) {
            return true;
        }
        return this.f3386g ? this.f3387h : !this.f3388i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3383d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3384e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3385f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
