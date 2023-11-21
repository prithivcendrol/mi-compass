package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C1035g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p010b0.C1285d;

/* renamed from: androidx.fragment.app.f0 */
public abstract class C0949f0 {

    /* renamed from: a */
    private final C0986o f3248a;

    /* renamed from: b */
    private final ClassLoader f3249b;

    /* renamed from: c */
    ArrayList<C0950a> f3250c = new ArrayList<>();

    /* renamed from: d */
    int f3251d;

    /* renamed from: e */
    int f3252e;

    /* renamed from: f */
    int f3253f;

    /* renamed from: g */
    int f3254g;

    /* renamed from: h */
    int f3255h;

    /* renamed from: i */
    boolean f3256i;

    /* renamed from: j */
    boolean f3257j = true;

    /* renamed from: k */
    String f3258k;

    /* renamed from: l */
    int f3259l;

    /* renamed from: m */
    CharSequence f3260m;

    /* renamed from: n */
    int f3261n;

    /* renamed from: o */
    CharSequence f3262o;

    /* renamed from: p */
    ArrayList<String> f3263p;

    /* renamed from: q */
    ArrayList<String> f3264q;

    /* renamed from: r */
    boolean f3265r = false;

    /* renamed from: s */
    ArrayList<Runnable> f3266s;

    /* renamed from: androidx.fragment.app.f0$a */
    static final class C0950a {

        /* renamed from: a */
        int f3267a;

        /* renamed from: b */
        Fragment f3268b;

        /* renamed from: c */
        boolean f3269c;

        /* renamed from: d */
        int f3270d;

        /* renamed from: e */
        int f3271e;

        /* renamed from: f */
        int f3272f;

        /* renamed from: g */
        int f3273g;

        /* renamed from: h */
        C1035g.C1038c f3274h;

        /* renamed from: i */
        C1035g.C1038c f3275i;

        C0950a() {
        }

        C0950a(int i, Fragment fragment) {
            this.f3267a = i;
            this.f3268b = fragment;
            this.f3269c = false;
            C1035g.C1038c cVar = C1035g.C1038c.RESUMED;
            this.f3274h = cVar;
            this.f3275i = cVar;
        }

        C0950a(int i, Fragment fragment, boolean z) {
            this.f3267a = i;
            this.f3268b = fragment;
            this.f3269c = z;
            C1035g.C1038c cVar = C1035g.C1038c.RESUMED;
            this.f3274h = cVar;
            this.f3275i = cVar;
        }
    }

    C0949f0(C0986o oVar, ClassLoader classLoader) {
        this.f3248a = oVar;
        this.f3249b = classLoader;
    }

    /* renamed from: b */
    public C0949f0 mo3557b(int i, Fragment fragment, String str) {
        mo3433l(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0949f0 mo3558c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3000K = viewGroup;
        return mo3557b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public C0949f0 mo3559d(Fragment fragment, String str) {
        mo3433l(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3560e(C0950a aVar) {
        this.f3250c.add(aVar);
        aVar.f3270d = this.f3251d;
        aVar.f3271e = this.f3252e;
        aVar.f3272f = this.f3253f;
        aVar.f3273g = this.f3254g;
    }

    /* renamed from: f */
    public C0949f0 mo3561f(String str) {
        if (this.f3257j) {
            this.f3256i = true;
            this.f3258k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: g */
    public abstract int mo3429g();

    /* renamed from: h */
    public abstract int mo3430h();

    /* renamed from: i */
    public abstract void mo3431i();

    /* renamed from: j */
    public abstract void mo3432j();

    /* renamed from: k */
    public C0949f0 mo3562k() {
        if (!this.f3256i) {
            this.f3257j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3433l(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.f3009T;
        if (str2 != null) {
            C1285d.m5925h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f2992C;
            if (str3 == null || str.equals(str3)) {
                fragment.f2992C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2992C + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2990A;
                if (i3 == 0 || i3 == i) {
                    fragment.f2990A = i;
                    fragment.f2991B = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2990A + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo3560e(new C0950a(i2, fragment));
    }

    /* renamed from: m */
    public abstract boolean mo3434m();

    /* renamed from: n */
    public C0949f0 mo3435n(Fragment fragment) {
        mo3560e(new C0950a(3, fragment));
        return this;
    }

    /* renamed from: o */
    public C0949f0 mo3563o(int i, Fragment fragment) {
        return mo3564p(i, fragment, (String) null);
    }

    /* renamed from: p */
    public C0949f0 mo3564p(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3433l(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: q */
    public C0949f0 mo3565q(boolean z) {
        this.f3265r = z;
        return this;
    }
}
