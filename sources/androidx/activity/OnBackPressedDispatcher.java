package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p008os.C0574a;
import androidx.core.util.C0617a;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f209a;

    /* renamed from: b */
    final ArrayDeque<C0091g> f210b = new ArrayDeque<>();

    /* renamed from: c */
    private C0617a<Boolean> f211c;

    /* renamed from: d */
    private OnBackInvokedCallback f212d;

    /* renamed from: e */
    private OnBackInvokedDispatcher f213e;

    /* renamed from: f */
    private boolean f214f = false;

    private class LifecycleOnBackPressedCancellable implements C1046k, C0085a {

        /* renamed from: d */
        private final C1035g f215d;

        /* renamed from: e */
        private final C0091g f216e;

        /* renamed from: f */
        private C0085a f217f;

        LifecycleOnBackPressedCancellable(C1035g gVar, C0091g gVar2) {
            this.f215d = gVar;
            this.f216e = gVar2;
            gVar.mo3790a(this);
        }

        public void cancel() {
            this.f215d.mo3792c(this);
            this.f216e.mo314e(this);
            C0085a aVar = this.f217f;
            if (aVar != null) {
                aVar.cancel();
                this.f217f = null;
            }
        }

        /* renamed from: g */
        public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
            if (bVar == C1035g.C1037b.ON_START) {
                this.f217f = OnBackPressedDispatcher.this.mo292c(this.f216e);
            } else if (bVar == C1035g.C1037b.ON_STOP) {
                C0085a aVar = this.f217f;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C1035g.C1037b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    static class C0083a {
        /* renamed from: a */
        static OnBackInvokedCallback m249a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0094j(runnable);
        }

        /* renamed from: b */
        static void m250b(Object obj, int i, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: c */
        static void m251c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    private class C0084b implements C0085a {

        /* renamed from: d */
        private final C0091g f219d;

        C0084b(C0091g gVar) {
            this.f219d = gVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f210b.remove(this.f219d);
            this.f219d.mo314e(this);
            if (C0574a.m2384c()) {
                this.f219d.mo316g((C0617a<Boolean>) null);
                OnBackPressedDispatcher.this.mo296h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f209a = runnable;
        if (C0574a.m2384c()) {
            this.f211c = new C0092h(this);
            this.f212d = C0083a.m249a(new C0093i(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m241e(Boolean bool) {
        if (C0574a.m2384c()) {
            mo296h();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: b */
    public void mo291b(C1048m mVar, C0091g gVar) {
        C1035g c = mVar.mo252c();
        if (c.mo3791b() != C1035g.C1038c.DESTROYED) {
            gVar.mo310a(new LifecycleOnBackPressedCancellable(c, gVar));
            if (C0574a.m2384c()) {
                mo296h();
                gVar.mo316g(this.f211c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0085a mo292c(C0091g gVar) {
        this.f210b.add(gVar);
        C0084b bVar = new C0084b(gVar);
        gVar.mo310a(bVar);
        if (C0574a.m2384c()) {
            mo296h();
            gVar.mo316g(this.f211c);
        }
        return bVar;
    }

    /* renamed from: d */
    public boolean mo293d() {
        Iterator<C0091g> descendingIterator = this.f210b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().mo312c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo294f() {
        Iterator<C0091g> descendingIterator = this.f210b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0091g next = descendingIterator.next();
            if (next.mo312c()) {
                next.mo311b();
                return;
            }
        }
        Runnable runnable = this.f209a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void mo295g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f213e = onBackInvokedDispatcher;
        mo296h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo296h() {
        boolean d = mo293d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f213e;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (d && !this.f214f) {
            C0083a.m250b(onBackInvokedDispatcher, 0, this.f212d);
            this.f214f = true;
        } else if (!d && this.f214f) {
            C0083a.m251c(onBackInvokedDispatcher, this.f212d);
            this.f214f = false;
        }
    }
}
