package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1046k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.j */
public class C0717j {

    /* renamed from: a */
    private final Runnable f2799a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C0793y> f2800b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<C0793y, C0718a> f2801c = new HashMap();

    /* renamed from: androidx.core.view.j$a */
    private static class C0718a {

        /* renamed from: a */
        final C1035g f2802a;

        /* renamed from: b */
        private C1046k f2803b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2925a() {
            this.f2802a.mo3792c(this.f2803b);
            this.f2803b = null;
        }
    }

    public C0717j(Runnable runnable) {
        this.f2799a = runnable;
    }

    /* renamed from: a */
    public void mo2919a(C0793y yVar) {
        this.f2800b.add(yVar);
        this.f2799a.run();
    }

    /* renamed from: b */
    public void mo2920b(Menu menu, MenuInflater menuInflater) {
        Iterator<C0793y> it = this.f2800b.iterator();
        while (it.hasNext()) {
            it.next().mo2957c(menu, menuInflater);
        }
    }

    /* renamed from: c */
    public void mo2921c(Menu menu) {
        Iterator<C0793y> it = this.f2800b.iterator();
        while (it.hasNext()) {
            it.next().mo2956b(menu);
        }
    }

    /* renamed from: d */
    public boolean mo2922d(MenuItem menuItem) {
        Iterator<C0793y> it = this.f2800b.iterator();
        while (it.hasNext()) {
            if (it.next().mo2955a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo2923e(Menu menu) {
        Iterator<C0793y> it = this.f2800b.iterator();
        while (it.hasNext()) {
            it.next().mo2958d(menu);
        }
    }

    /* renamed from: f */
    public void mo2924f(C0793y yVar) {
        this.f2800b.remove(yVar);
        C0718a remove = this.f2801c.remove(yVar);
        if (remove != null) {
            remove.mo2925a();
        }
        this.f2799a.run();
    }
}
