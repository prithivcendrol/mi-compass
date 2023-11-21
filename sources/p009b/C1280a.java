package p009b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: b.a */
public final class C1280a {

    /* renamed from: a */
    private final Set<C1281b> f4460a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f4461b;

    /* renamed from: a */
    public void mo5108a(C1281b bVar) {
        if (this.f4461b != null) {
            bVar.mo300a(this.f4461b);
        }
        this.f4460a.add(bVar);
    }

    /* renamed from: b */
    public void mo5109b() {
        this.f4461b = null;
    }

    /* renamed from: c */
    public void mo5110c(Context context) {
        this.f4461b = context;
        for (C1281b a : this.f4460a) {
            a.mo300a(context);
        }
    }
}
