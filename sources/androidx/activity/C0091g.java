package androidx.activity;

import androidx.core.util.C0617a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.g */
public abstract class C0091g {

    /* renamed from: a */
    private boolean f227a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0085a> f228b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private C0617a<Boolean> f229c;

    public C0091g(boolean z) {
        this.f227a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo310a(C0085a aVar) {
        this.f228b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo311b();

    /* renamed from: c */
    public final boolean mo312c() {
        return this.f227a;
    }

    /* renamed from: d */
    public final void mo313d() {
        Iterator<C0085a> it = this.f228b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo314e(C0085a aVar) {
        this.f228b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo315f(boolean z) {
        this.f227a = z;
        C0617a<Boolean> aVar = this.f229c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo316g(C0617a<Boolean> aVar) {
        this.f229c = aVar;
    }
}
