package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.e0 */
class C0947e0 {

    /* renamed from: a */
    private final ArrayList<Fragment> f3243a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0938d0> f3244b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0921c0> f3245c = new HashMap<>();

    /* renamed from: d */
    private C1000z f3246d;

    C0947e0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3529A(C1000z zVar) {
        this.f3246d = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C0921c0 mo3530B(String str, C0921c0 c0Var) {
        return (C0921c0) (c0Var != null ? this.f3245c.put(str, c0Var) : this.f3245c.remove(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3531a(Fragment fragment) {
        if (!this.f3243a.contains(fragment)) {
            synchronized (this.f3243a) {
                this.f3243a.add(fragment);
            }
            fragment.f3031o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3532b() {
        this.f3244b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3533c(String str) {
        return this.f3244b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3534d(int i) {
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                next.mo3510t(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3535e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3244b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0938d0 next : this.f3244b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo3503k();
                    printWriter.println(k);
                    k.mo3298q(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3243a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3243a.get(i).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo3536f(String str) {
        C0938d0 d0Var = this.f3244b.get(str);
        if (d0Var != null) {
            return d0Var.mo3503k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3537g(int i) {
        for (int size = this.f3243a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3243a.get(size);
            if (fragment != null && fragment.f2990A == i) {
                return fragment;
            }
        }
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                Fragment k = next.mo3503k();
                if (k.f2990A == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3538h(String str) {
        if (str != null) {
            for (int size = this.f3243a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3243a.get(size);
                if (fragment != null && str.equals(fragment.f2992C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                Fragment k = next.mo3503k();
                if (str.equals(k.f2992C)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3539i(String str) {
        Fragment s;
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null && (s = next.mo3503k().mo3303s(str)) != null) {
                return s;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3540j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3000K;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3243a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3243a.get(i);
            if (fragment2.f3000K == viewGroup && (view2 = fragment2.f3001L) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3243a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3243a.get(indexOf);
            if (fragment3.f3000K == viewGroup && (view = fragment3.f3001L) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C0938d0> mo3541k() {
        ArrayList arrayList = new ArrayList();
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> mo3542l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0938d0> it = this.f3244b.values().iterator();
        while (it.hasNext()) {
            C0938d0 next = it.next();
            arrayList.add(next != null ? next.mo3503k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ArrayList<C0921c0> mo3543m() {
        return new ArrayList<>(this.f3245c.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0938d0 mo3544n(String str) {
        return this.f3244b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<Fragment> mo3545o() {
        ArrayList arrayList;
        if (this.f3243a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3243a) {
            arrayList = new ArrayList(this.f3243a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C1000z mo3546p() {
        return this.f3246d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0921c0 mo3547q(String str) {
        return this.f3245c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3548r(C0938d0 d0Var) {
        Fragment k = d0Var.mo3503k();
        if (!mo3533c(k.f3025i)) {
            this.f3244b.put(k.f3025i, d0Var);
            if (k.f2996G) {
                if (k.f2995F) {
                    this.f3246d.mo3720e(k);
                } else {
                    this.f3246d.mo3730o(k);
                }
                k.f2996G = false;
            }
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3549s(C0938d0 d0Var) {
        Fragment k = d0Var.mo3503k();
        if (k.f2995F) {
            this.f3246d.mo3730o(k);
        }
        if (this.f3244b.put(k.f3025i, (Object) null) != null && FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3550t() {
        Iterator<Fragment> it = this.f3243a.iterator();
        while (it.hasNext()) {
            C0938d0 d0Var = this.f3244b.get(it.next().f3025i);
            if (d0Var != null) {
                d0Var.mo3504m();
            }
        }
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                next.mo3504m();
                Fragment k = next.mo3503k();
                if (k.f3032p && !k.mo3296p0()) {
                    if (k.f3033q && !this.f3245c.containsKey(k.f3025i)) {
                        next.mo3508r();
                    }
                    mo3549s(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3551u(Fragment fragment) {
        synchronized (this.f3243a) {
            this.f3243a.remove(fragment);
        }
        fragment.f3031o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3552v() {
        this.f3244b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3553w(List<String> list) {
        this.f3243a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo3536f(next);
                if (f != null) {
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo3531a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3554x(ArrayList<C0921c0> arrayList) {
        this.f3245c.clear();
        Iterator<C0921c0> it = arrayList.iterator();
        while (it.hasNext()) {
            C0921c0 next = it.next();
            this.f3245c.put(next.f3155e, next);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ArrayList<String> mo3555y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3244b.size());
        for (C0938d0 next : this.f3244b.values()) {
            if (next != null) {
                Fragment k = next.mo3503k();
                next.mo3508r();
                arrayList.add(k.f3025i);
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.f3021e);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public ArrayList<String> mo3556z() {
        synchronized (this.f3243a) {
            if (this.f3243a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3243a.size());
            Iterator<Fragment> it = this.f3243a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3025i);
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3025i + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
