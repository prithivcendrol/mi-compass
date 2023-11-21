package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1046k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p015c.C1320a;

/* renamed from: androidx.activity.result.d */
public abstract class C0102d {

    /* renamed from: a */
    private Random f240a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f241b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f242c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0105c> f243d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f244e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0104b<?>> f245f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f246g = new HashMap();

    /* renamed from: h */
    final Bundle f247h = new Bundle();

    /* renamed from: androidx.activity.result.d$a */
    class C0103a extends C0101c<I> {

        /* renamed from: a */
        final /* synthetic */ String f248a;

        /* renamed from: b */
        final /* synthetic */ C1320a f249b;

        C0103a(String str, C1320a aVar) {
            this.f248a = str;
            this.f249b = aVar;
        }

        /* renamed from: a */
        public void mo330a() {
            C0102d.this.mo335i(this.f248a);
        }
    }

    /* renamed from: androidx.activity.result.d$b */
    private static class C0104b<O> {

        /* renamed from: a */
        final C0100b<O> f251a;

        /* renamed from: b */
        final C1320a<?, O> f252b;

        C0104b(C0100b<O> bVar, C1320a<?, O> aVar) {
            this.f251a = bVar;
            this.f252b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.d$c */
    private static class C0105c {

        /* renamed from: a */
        final C1035g f253a;

        /* renamed from: b */
        private final ArrayList<C1046k> f254b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo336a() {
            Iterator<C1046k> it = this.f254b.iterator();
            while (it.hasNext()) {
                this.f253a.mo3792c(it.next());
            }
            this.f254b.clear();
        }
    }

    /* renamed from: a */
    private void m277a(int i, String str) {
        this.f241b.put(Integer.valueOf(i), str);
        this.f242c.put(str, Integer.valueOf(i));
    }

    /* renamed from: c */
    private <O> void m278c(String str, int i, Intent intent, C0104b<O> bVar) {
        if (bVar == null || bVar.f251a == null || !this.f244e.contains(str)) {
            this.f246g.remove(str);
            this.f247h.putParcelable(str, new C0098a(i, intent));
            return;
        }
        bVar.f251a.mo329a(bVar.f252b.mo3418a(i, intent));
        this.f244e.remove(str);
    }

    /* renamed from: d */
    private int m279d() {
        int nextInt = this.f240a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f241b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f240a.nextInt(2147418112);
        }
    }

    /* renamed from: h */
    private void m280h(String str) {
        if (this.f242c.get(str) == null) {
            m277a(m279d(), str);
        }
    }

    /* renamed from: b */
    public final boolean mo331b(int i, int i2, Intent intent) {
        String str = this.f241b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m278c(str, i2, intent, this.f245f.get(str));
        return true;
    }

    /* renamed from: e */
    public final void mo332e(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f244e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f240a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f247h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f242c.containsKey(str)) {
                        Integer remove = this.f242c.remove(str);
                        if (!this.f247h.containsKey(str)) {
                            this.f241b.remove(remove);
                        }
                    }
                    m277a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo333f(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f242c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f242c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f244e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f247h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f240a);
    }

    /* renamed from: g */
    public final <I, O> C0101c<I> mo334g(String str, C1320a<I, O> aVar, C0100b<O> bVar) {
        m280h(str);
        this.f245f.put(str, new C0104b(bVar, aVar));
        if (this.f246g.containsKey(str)) {
            Object obj = this.f246g.get(str);
            this.f246g.remove(str);
            bVar.mo329a(obj);
        }
        C0098a aVar2 = (C0098a) this.f247h.getParcelable(str);
        if (aVar2 != null) {
            this.f247h.remove(str);
            bVar.mo329a(aVar.mo3418a(aVar2.mo321b(), aVar2.mo320a()));
        }
        return new C0103a(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo335i(String str) {
        Integer remove;
        if (!this.f244e.contains(str) && (remove = this.f242c.remove(str)) != null) {
            this.f241b.remove(remove);
        }
        this.f245f.remove(str);
        if (this.f246g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f246g.get(str));
            this.f246g.remove(str);
        }
        if (this.f247h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f247h.getParcelable(str));
            this.f247h.remove(str);
        }
        C0105c cVar = this.f243d.get(str);
        if (cVar != null) {
            cVar.mo336a();
            this.f243d.remove(str);
        }
    }
}
