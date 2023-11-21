package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0949f0;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class C0914a extends C0949f0 implements FragmentManager.C0912m {

    /* renamed from: t */
    final FragmentManager f3134t;

    /* renamed from: u */
    boolean f3135u;

    /* renamed from: v */
    int f3136v;

    /* renamed from: w */
    boolean f3137w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0914a(FragmentManager fragmentManager) {
        super(fragmentManager.mo3397s0(), fragmentManager.mo3401u0() != null ? fragmentManager.mo3401u0().mo3692j().getClassLoader() : null);
        this.f3136v = -1;
        this.f3137w = false;
        this.f3134t = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Fragment mo3428A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3250c.size() - 1; size >= 0; size--) {
            C0949f0.C0950a aVar = this.f3250c.get(size);
            int i = aVar.f3267a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3268b;
                            break;
                        case 10:
                            aVar.f3275i = aVar.f3274h;
                            break;
                    }
                }
                arrayList.add(aVar.f3268b);
            }
            arrayList.remove(aVar.f3268b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3427a(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3256i) {
            return true;
        }
        this.f3134t.mo3379i(this);
        return true;
    }

    /* renamed from: g */
    public int mo3429g() {
        return mo3437s(false);
    }

    /* renamed from: h */
    public int mo3430h() {
        return mo3437s(true);
    }

    /* renamed from: i */
    public void mo3431i() {
        mo3562k();
        this.f3134t.mo3373c0(this, false);
    }

    /* renamed from: j */
    public void mo3432j() {
        mo3562k();
        this.f3134t.mo3373c0(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3433l(int i, Fragment fragment, String str, int i2) {
        super.mo3433l(i, fragment, str, i2);
        fragment.f3039w = this.f3134t;
    }

    /* renamed from: m */
    public boolean mo3434m() {
        return this.f3250c.isEmpty();
    }

    /* renamed from: n */
    public C0949f0 mo3435n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3039w;
        if (fragmentManager == null || fragmentManager == this.f3134t) {
            return super.mo3435n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3436r(int i) {
        if (this.f3256i) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3250c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0949f0.C0950a aVar = this.f3250c.get(i2);
                Fragment fragment = aVar.f3268b;
                if (fragment != null) {
                    fragment.f3038v += i;
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3268b + " to " + aVar.f3268b.f3038v);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo3437s(boolean z) {
        if (!this.f3135u) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0970k0("FragmentManager"));
                mo3438t("  ", printWriter);
                printWriter.close();
            }
            this.f3135u = true;
            this.f3136v = this.f3256i ? this.f3134t.mo3387l() : -1;
            this.f3134t.mo3369Z(this, z);
            return this.f3136v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: t */
    public void mo3438t(String str, PrintWriter printWriter) {
        mo3440u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3136v >= 0) {
            sb.append(" #");
            sb.append(this.f3136v);
        }
        if (this.f3258k != null) {
            sb.append(" ");
            sb.append(this.f3258k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo3440u(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3258k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3136v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3135u);
            if (this.f3255h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3255h));
            }
            if (!(this.f3251d == 0 && this.f3252e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3251d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3252e));
            }
            if (!(this.f3253f == 0 && this.f3254g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3253f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3254g));
            }
            if (!(this.f3259l == 0 && this.f3260m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3259l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3260m);
            }
            if (!(this.f3261n == 0 && this.f3262o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3261n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3262o);
            }
        }
        if (!this.f3250c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3250c.size();
            for (int i = 0; i < size; i++) {
                C0949f0.C0950a aVar = this.f3250c.get(i);
                switch (aVar.f3267a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3267a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3268b);
                if (z) {
                    if (!(aVar.f3270d == 0 && aVar.f3271e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3270d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3271e));
                    }
                    if (aVar.f3272f != 0 || aVar.f3273g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3272f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3273g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3441v() {
        FragmentManager fragmentManager;
        int size = this.f3250c.size();
        for (int i = 0; i < size; i++) {
            C0949f0.C0950a aVar = this.f3250c.get(i);
            Fragment fragment = aVar.f3268b;
            if (fragment != null) {
                fragment.f3033q = this.f3137w;
                fragment.mo3232N1(false);
                fragment.mo3229M1(this.f3255h);
                fragment.mo3238P1(this.f3263p, this.f3264q);
            }
            switch (aVar.f3267a) {
                case 1:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, false);
                    this.f3134t.mo3382j(fragment);
                    continue;
                case 3:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3375d1(fragment);
                    continue;
                case 4:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3340E0(fragment);
                    continue;
                case 5:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, false);
                    this.f3134t.mo3394o1(fragment);
                    continue;
                case 6:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3405x(fragment);
                    continue;
                case 7:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, false);
                    this.f3134t.mo3391n(fragment);
                    continue;
                case 8:
                    fragmentManager = this.f3134t;
                    break;
                case 9:
                    fragmentManager = this.f3134t;
                    fragment = null;
                    break;
                case 10:
                    this.f3134t.mo3388l1(fragment, aVar.f3275i);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3267a);
            }
            fragmentManager.mo3390m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3442w() {
        FragmentManager fragmentManager;
        for (int size = this.f3250c.size() - 1; size >= 0; size--) {
            C0949f0.C0950a aVar = this.f3250c.get(size);
            Fragment fragment = aVar.f3268b;
            if (fragment != null) {
                fragment.f3033q = this.f3137w;
                fragment.mo3232N1(true);
                fragment.mo3229M1(FragmentManager.m3678h1(this.f3255h));
                fragment.mo3238P1(this.f3264q, this.f3263p);
            }
            switch (aVar.f3267a) {
                case 1:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, true);
                    this.f3134t.mo3375d1(fragment);
                    continue;
                case 3:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3382j(fragment);
                    continue;
                case 4:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3394o1(fragment);
                    continue;
                case 5:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, true);
                    this.f3134t.mo3340E0(fragment);
                    continue;
                case 6:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3391n(fragment);
                    continue;
                case 7:
                    fragment.mo3218I1(aVar.f3270d, aVar.f3271e, aVar.f3272f, aVar.f3273g);
                    this.f3134t.mo3386k1(fragment, true);
                    this.f3134t.mo3405x(fragment);
                    continue;
                case 8:
                    fragmentManager = this.f3134t;
                    fragment = null;
                    break;
                case 9:
                    fragmentManager = this.f3134t;
                    break;
                case 10:
                    this.f3134t.mo3388l1(fragment, aVar.f3274h);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3267a);
            }
            fragmentManager.mo3390m1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public Fragment mo3443x(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3250c.size()) {
            C0949f0.C0950a aVar = this.f3250c.get(i);
            int i2 = aVar.f3267a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3268b;
                    int i3 = fragment3.f2991B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2991B == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3250c.add(i, new C0949f0.C0950a(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                C0949f0.C0950a aVar2 = new C0949f0.C0950a(3, fragment4, true);
                                aVar2.f3270d = aVar.f3270d;
                                aVar2.f3272f = aVar.f3272f;
                                aVar2.f3271e = aVar.f3271e;
                                aVar2.f3273g = aVar.f3273g;
                                this.f3250c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3250c.remove(i);
                        i--;
                    } else {
                        aVar.f3267a = 1;
                        aVar.f3269c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3268b);
                    Fragment fragment5 = aVar.f3268b;
                    if (fragment5 == fragment2) {
                        this.f3250c.add(i, new C0949f0.C0950a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3250c.add(i, new C0949f0.C0950a(9, fragment2, true));
                        aVar.f3269c = true;
                        i++;
                        fragment2 = aVar.f3268b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3268b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: y */
    public String mo3444y() {
        return this.f3258k;
    }

    /* renamed from: z */
    public void mo3445z() {
        if (this.f3266s != null) {
            for (int i = 0; i < this.f3266s.size(); i++) {
                this.f3266s.get(i).run();
            }
            this.f3266s = null;
        }
    }
}
