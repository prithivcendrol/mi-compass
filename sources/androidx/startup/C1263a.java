package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p046h0.C1620a;
import p046h0.C1621b;
import p046h0.C1622c;
import p052i0.C1640b;

/* renamed from: androidx.startup.a */
public final class C1263a {

    /* renamed from: d */
    private static volatile C1263a f4375d;

    /* renamed from: e */
    private static final Object f4376e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f4377a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C1620a<?>>> f4378b = new HashSet();

    /* renamed from: c */
    final Context f4379c;

    C1263a(Context context) {
        this.f4379c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m5806d(Class<? extends C1620a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C1640b.m6945d()) {
            try {
                C1640b.m6942a(cls.getSimpleName());
            } catch (Throwable th) {
                C1640b.m6943b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4377a.containsKey(cls)) {
                set.add(cls);
                C1620a aVar = (C1620a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C1620a<?>>> a = aVar.mo3072a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f4377a.containsKey(next)) {
                            m5806d(next, set);
                        }
                    }
                }
                t = aVar.mo3073b(this.f4379c);
                set.remove(cls);
                this.f4377a.put(cls, t);
            } else {
                t = this.f4377a.get(cls);
            }
            C1640b.m6943b();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: e */
    public static C1263a m5807e(Context context) {
        if (f4375d == null) {
            synchronized (f4376e) {
                if (f4375d == null) {
                    f4375d = new C1263a(context);
                }
            }
        }
        return f4375d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4990a() {
        try {
            C1640b.m6942a("Startup");
            mo4991b(this.f4379c.getPackageManager().getProviderInfo(new ComponentName(this.f4379c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C1640b.m6943b();
        } catch (PackageManager.NameNotFoundException e) {
            throw new C1622c((Throwable) e);
        } catch (Throwable th) {
            C1640b.m6943b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4991b(Bundle bundle) {
        String string = this.f4379c.getString(C1621b.f6451a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C1620a.class.isAssignableFrom(cls)) {
                            this.f4378b.add(cls);
                        }
                    }
                }
                for (Class<? extends C1620a<?>> d : this.f4378b) {
                    m5806d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C1622c((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4992c(Class<? extends C1620a<?>> cls) {
        T t;
        synchronized (f4376e) {
            t = this.f4377a.get(cls);
            if (t == null) {
                t = m5806d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: f */
    public <T> T mo4993f(Class<? extends C1620a<T>> cls) {
        return mo4992c(cls);
    }

    /* renamed from: g */
    public boolean mo4994g(Class<? extends C1620a<?>> cls) {
        return this.f4378b.contains(cls);
    }
}
