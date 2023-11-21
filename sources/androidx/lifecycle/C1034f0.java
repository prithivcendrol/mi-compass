package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.f0 */
public class C1034f0 {

    /* renamed from: a */
    private final HashMap<String, C1019c0> f3471a = new HashMap<>();

    /* renamed from: a */
    public final void mo3786a() {
        for (C1019c0 a : this.f3471a.values()) {
            a.mo3779a();
        }
        this.f3471a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1019c0 mo3787b(String str) {
        return this.f3471a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo3788c() {
        return new HashSet(this.f3471a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3789d(String str, C1019c0 c0Var) {
        C1019c0 put = this.f3471a.put(str, c0Var);
        if (put != null) {
            put.mo3719d();
        }
    }
}
