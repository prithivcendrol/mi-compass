package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.p008os.C0577d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p017c1.C1341n;
import p040g0.C1587c;
import p083n1.C2420e;
import p083n1.C2422g;
import p131w1.C2884a;

/* renamed from: androidx.lifecycle.y */
public final class C1067y {

    /* renamed from: f */
    public static final C1068a f3508f = new C1068a((C2420e) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Class<? extends Object>[] f3509g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map<String, Object> f3510a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C1587c.C1590c> f3511b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, Object> f3512c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<String, C2884a<Object>> f3513d = new LinkedHashMap();

    /* renamed from: e */
    private final C1587c.C1590c f3514e = new C1066x(this);

    /* renamed from: androidx.lifecycle.y$a */
    public static final class C1068a {
        private C1068a() {
        }

        public /* synthetic */ C1068a(C2420e eVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo3836a(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1067y.f3509g) {
                C2422g.m10282b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m4292d(C1067y yVar) {
        C2422g.m10285e(yVar, "this$0");
        for (Map.Entry entry : C1496z.m6509i(yVar.f3511b).entrySet()) {
            yVar.mo3835e((String) entry.getKey(), ((C1587c.C1590c) entry.getValue()).mo299a());
        }
        Set<String> keySet = yVar.f3510a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(yVar.f3510a.get(next));
        }
        return C0577d.m2388a(C1341n.m5992a("keys", arrayList), C1341n.m5992a("values", arrayList2));
    }

    /* renamed from: c */
    public final C1587c.C1590c mo3834c() {
        return this.f3514e;
    }

    /* renamed from: e */
    public final <T> void mo3835e(String str, T t) {
        C2422g.m10285e(str, "key");
        if (f3508f.mo3836a(t)) {
            Object obj = this.f3512c.get(str);
            C1054r rVar = obj instanceof C1054r ? (C1054r) obj : null;
            if (rVar != null) {
                rVar.mo3744i(t);
            } else {
                this.f3510a.put(str, t);
            }
            C2884a aVar = this.f3513d.get(str);
            if (aVar != null) {
                aVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C2422g.m10282b(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
}
