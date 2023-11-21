package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.C0102d;
import androidx.activity.result.C0106e;
import androidx.core.app.C0499g;
import androidx.core.app.C0500h;
import androidx.core.app.C0504k;
import androidx.core.app.C0505l;
import androidx.core.app.C0506m;
import androidx.core.content.C0515b;
import androidx.core.content.C0516c;
import androidx.core.p008os.C0574a;
import androidx.core.util.C0617a;
import androidx.core.view.C0713i;
import androidx.core.view.C0717j;
import androidx.core.view.C0793y;
import androidx.lifecycle.C1021d0;
import androidx.lifecycle.C1033f;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1041h0;
import androidx.lifecycle.C1043i0;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1049n;
import androidx.lifecycle.C1063w;
import androidx.lifecycle.C1069z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.C1280a;
import p009b.C1281b;
import p022d0.C1457a;
import p022d0.C1462d;
import p040g0.C1587c;
import p040g0.C1591d;
import p040g0.C1593e;
import p040g0.C1594f;
import p052i0.C1640b;

public class ComponentActivity extends C0499g implements C1039g0, C1033f, C1593e, C0095k, C0106e, C0515b, C0516c, C0504k, C0505l, C0713i {

    /* renamed from: f */
    final C1280a f181f = new C1280a();

    /* renamed from: g */
    private final C0717j f182g = new C0717j(new C0086b(this));

    /* renamed from: h */
    private final C1049n f183h = new C1049n(this);

    /* renamed from: i */
    final C1591d f184i;

    /* renamed from: j */
    private C1034f0 f185j;

    /* renamed from: k */
    private final OnBackPressedDispatcher f186k;

    /* renamed from: l */
    private int f187l;

    /* renamed from: m */
    private final AtomicInteger f188m;

    /* renamed from: n */
    private final C0102d f189n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C0617a<Configuration>> f190o;

    /* renamed from: p */
    private final CopyOnWriteArrayList<C0617a<Integer>> f191p;

    /* renamed from: q */
    private final CopyOnWriteArrayList<C0617a<Intent>> f192q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<C0617a<C0500h>> f193r;

    /* renamed from: s */
    private final CopyOnWriteArrayList<C0617a<C0506m>> f194s;

    /* renamed from: t */
    private boolean f195t;

    /* renamed from: u */
    private boolean f196u;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0078a implements Runnable {
        C0078a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0079b extends C0102d {
        C0079b() {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static class C0080c {
        /* renamed from: a */
        static void m236a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    static class C0081d {
        /* renamed from: a */
        static OnBackInvokedDispatcher m237a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    static final class C0082e {

        /* renamed from: a */
        Object f202a;

        /* renamed from: b */
        C1034f0 f203b;

        C0082e() {
        }
    }

    public ComponentActivity() {
        C1591d a = C1591d.m6806a(this);
        this.f184i = a;
        this.f186k = new OnBackPressedDispatcher(new C0078a());
        this.f188m = new AtomicInteger();
        this.f189n = new C0079b();
        this.f190o = new CopyOnWriteArrayList<>();
        this.f191p = new CopyOnWriteArrayList<>();
        this.f192q = new CopyOnWriteArrayList<>();
        this.f193r = new CopyOnWriteArrayList<>();
        this.f194s = new CopyOnWriteArrayList<>();
        this.f195t = false;
        this.f196u = false;
        if (mo252c() != null) {
            mo252c().mo3790a(new C1046k() {
                /* renamed from: g */
                public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
                    if (bVar == C1035g.C1037b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            C0080c.m236a(peekDecorView);
                        }
                    }
                }
            });
            mo252c().mo3790a(new C1046k() {
                /* renamed from: g */
                public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
                    if (bVar == C1035g.C1037b.ON_DESTROY) {
                        ComponentActivity.this.f181f.mo5109b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo243H().mo3786a();
                        }
                    }
                }
            });
            mo252c().mo3790a(new C1046k() {
                /* renamed from: g */
                public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
                    ComponentActivity.this.mo248V();
                    ComponentActivity.this.mo252c().mo3792c(this);
                }
            });
            a.mo5740c();
            C1069z.m4296a(this);
            mo254f().mo5737h("android:support:activity-result", new C0087c(this));
            mo246T(new C0088d(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: W */
    private void m209W() {
        C1041h0.m4232a(getWindow().getDecorView(), this);
        C1043i0.m4233a(getWindow().getDecorView(), this);
        C1594f.m6813a(getWindow().getDecorView(), this);
        C0097m.m268a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ Bundle m210Y() {
        Bundle bundle = new Bundle();
        this.f189n.mo333f(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m211Z(Context context) {
        Bundle b = mo254f().mo5732b("android:support:activity-result");
        if (b != null) {
            this.f189n.mo332e(b);
        }
    }

    /* renamed from: B */
    public final void mo242B(C0617a<C0500h> aVar) {
        this.f193r.add(aVar);
    }

    /* renamed from: H */
    public C1034f0 mo243H() {
        if (getApplication() != null) {
            mo248V();
            return this.f185j;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: K */
    public final void mo244K(C0617a<C0500h> aVar) {
        this.f193r.remove(aVar);
    }

    /* renamed from: N */
    public final void mo245N(C0617a<Configuration> aVar) {
        this.f190o.remove(aVar);
    }

    /* renamed from: T */
    public final void mo246T(C1281b bVar) {
        this.f181f.mo5108a(bVar);
    }

    /* renamed from: U */
    public final void mo247U(C0617a<Intent> aVar) {
        this.f192q.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo248V() {
        if (this.f185j == null) {
            C0082e eVar = (C0082e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f185j = eVar.f203b;
            }
            if (this.f185j == null) {
                this.f185j = new C1034f0();
            }
        }
    }

    /* renamed from: X */
    public void mo249X() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: a0 */
    public Object mo250a0() {
        return null;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m209W();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: c */
    public C1035g mo252c() {
        return this.f183h;
    }

    /* renamed from: e */
    public final OnBackPressedDispatcher mo253e() {
        return this.f186k;
    }

    /* renamed from: f */
    public final C1587c mo254f() {
        return this.f184i.mo5739b();
    }

    /* renamed from: h */
    public void mo255h(C0793y yVar) {
        this.f182g.mo2924f(yVar);
    }

    /* renamed from: l */
    public final void mo256l(C0617a<Configuration> aVar) {
        this.f190o.add(aVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f189n.mo331b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f186k.mo294f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C0617a<Configuration>> it = this.f190o.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f184i.mo5741d(bundle);
        this.f181f.mo5110c(this);
        super.onCreate(bundle);
        C1063w.m4284g(this);
        if (C0574a.m2384c()) {
            this.f186k.mo295g(C0081d.m237a(this));
        }
        int i = this.f187l;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f182g.mo2920b(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f182g.mo2922d(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.f195t) {
            Iterator<C0617a<C0500h>> it = this.f193r.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0500h(z));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f195t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f195t = false;
            Iterator<C0617a<C0500h>> it = this.f193r.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0500h(z, configuration));
            }
        } catch (Throwable th) {
            this.f195t = false;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C0617a<Intent>> it = this.f192q.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f182g.mo2921c(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.f196u) {
            Iterator<C0617a<C0506m>> it = this.f194s.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0506m(z));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f196u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f196u = false;
            Iterator<C0617a<C0506m>> it = this.f194s.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0506m(z, configuration));
            }
        } catch (Throwable th) {
            this.f196u = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f182g.mo2923e(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f189n.mo331b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0082e eVar;
        Object a0 = mo250a0();
        C1034f0 f0Var = this.f185j;
        if (f0Var == null && (eVar = (C0082e) getLastNonConfigurationInstance()) != null) {
            f0Var = eVar.f203b;
        }
        if (f0Var == null && a0 == null) {
            return null;
        }
        C0082e eVar2 = new C0082e();
        eVar2.f202a = a0;
        eVar2.f203b = f0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C1035g c = mo252c();
        if (c instanceof C1049n) {
            ((C1049n) c).mo3797o(C1035g.C1038c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f184i.mo5742e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C0617a<Integer>> it = this.f191p.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public final void mo274r(C0617a<C0506m> aVar) {
        this.f194s.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C1640b.m6945d()) {
                C1640b.m6942a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            C1640b.m6943b();
        }
    }

    /* renamed from: s */
    public final void mo276s(C0617a<Integer> aVar) {
        this.f191p.remove(aVar);
    }

    public void setContentView(int i) {
        m209W();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m209W();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m209W();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: t */
    public final void mo284t(C0617a<Integer> aVar) {
        this.f191p.add(aVar);
    }

    /* renamed from: u */
    public C1457a mo285u() {
        C1462d dVar = new C1462d();
        if (getApplication() != null) {
            dVar.mo5481b(C1021d0.C1022a.f3464e, getApplication());
        }
        dVar.mo5481b(C1069z.f3515a, this);
        dVar.mo5481b(C1069z.f3516b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.mo5481b(C1069z.f3517c, getIntent().getExtras());
        }
        return dVar;
    }

    /* renamed from: w */
    public final void mo286w(C0617a<C0506m> aVar) {
        this.f194s.add(aVar);
    }

    /* renamed from: x */
    public void mo287x(C0793y yVar) {
        this.f182g.mo2919a(yVar);
    }

    /* renamed from: z */
    public final C0102d mo288z() {
        return this.f189n;
    }
}
