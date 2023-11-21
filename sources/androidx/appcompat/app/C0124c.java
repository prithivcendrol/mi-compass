package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0097m;
import androidx.appcompat.view.C0182b;
import androidx.appcompat.widget.C0382q1;
import androidx.core.app.C0483b;
import androidx.core.app.C0501i;
import androidx.core.app.C0508o;
import androidx.core.p008os.C0581f;
import androidx.fragment.app.C0964j;
import androidx.lifecycle.C1041h0;
import androidx.lifecycle.C1043i0;
import p009b.C1281b;
import p040g0.C1587c;
import p040g0.C1594f;

/* renamed from: androidx.appcompat.app.c */
public class C0124c extends C0964j implements C0127d, C0508o.C0509a {

    /* renamed from: A */
    private C0130g f362A;

    /* renamed from: B */
    private Resources f363B;

    /* renamed from: androidx.appcompat.app.c$a */
    class C0125a implements C1587c.C1590c {
        C0125a() {
        }

        /* renamed from: a */
        public Bundle mo299a() {
            Bundle bundle = new Bundle();
            C0124c.this.mo441q0().mo457H(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    class C0126b implements C1281b {
        C0126b() {
        }

        /* renamed from: a */
        public void mo300a(Context context) {
            C0130g q0 = C0124c.this.mo441q0();
            q0.mo477x();
            q0.mo453D(C0124c.this.mo254f().mo5732b("androidx:appcompat"));
        }
    }

    public C0124c() {
        m369s0();
    }

    /* renamed from: W */
    private void m368W() {
        C1041h0.m4232a(getWindow().getDecorView(), this);
        C1043i0.m4233a(getWindow().getDecorView(), this);
        C1594f.m6813a(getWindow().getDecorView(), this);
        C0097m.m268a(getWindow().getDecorView(), this);
    }

    /* renamed from: s0 */
    private void m369s0() {
        mo254f().mo5737h("androidx:appcompat", new C0125a());
        mo246T(new C0126b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m370z0(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0124c.m370z0(android.view.KeyEvent):boolean");
    }

    /* renamed from: A0 */
    public void mo418A0(Intent intent) {
        C0501i.m2101e(this, intent);
    }

    /* renamed from: B0 */
    public boolean mo419B0(Intent intent) {
        return C0501i.m2102f(this, intent);
    }

    /* renamed from: C */
    public Intent mo420C() {
        return C0501i.m2097a(this);
    }

    /* renamed from: M */
    public C0182b mo421M(C0182b.C0183a aVar) {
        return null;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m368W();
        mo441q0().mo467f(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo441q0().mo471k(context));
    }

    public void closeOptionsMenu() {
        C0116a r0 = mo442r0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (r0 == null || !r0.mo368h()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0116a r0 = mo442r0();
        if (keyCode != 82 || r0 == null || !r0.mo379s(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo441q0().mo472n(i);
    }

    public MenuInflater getMenuInflater() {
        return mo441q0().mo475t();
    }

    public Resources getResources() {
        if (this.f363B == null && C0382q1.m1719c()) {
            this.f363B = new C0382q1(this, super.getResources());
        }
        Resources resources = this.f363B;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo441q0().mo478y();
    }

    /* renamed from: n */
    public void mo429n(C0182b bVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo441q0().mo452C(configuration);
        if (this.f363B != null) {
            this.f363B.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo448x0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo441q0().mo454E();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m370z0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0116a r0 = mo442r0();
        if (menuItem.getItemId() != 16908332 || r0 == null || (r0.mo371k() & 4) == 0) {
            return false;
        }
        return mo449y0();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo441q0().mo455F(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo441q0().mo456G();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo441q0().mo458I();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo441q0().mo459J();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo441q0().mo466U(charSequence);
    }

    public void openOptionsMenu() {
        C0116a r0 = mo442r0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (r0 == null || !r0.mo380t()) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: q */
    public void mo440q(C0182b bVar) {
    }

    /* renamed from: q0 */
    public C0130g mo441q0() {
        if (this.f362A == null) {
            this.f362A = C0130g.m401l(this, this);
        }
        return this.f362A;
    }

    /* renamed from: r0 */
    public C0116a mo442r0() {
        return mo441q0().mo476w();
    }

    public void setContentView(int i) {
        m368W();
        mo441q0().mo461P(i);
    }

    public void setContentView(View view) {
        m368W();
        mo441q0().mo462Q(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m368W();
        mo441q0().mo463R(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo441q0().mo465T(i);
    }

    /* renamed from: t0 */
    public void mo444t0(C0508o oVar) {
        oVar.mo2563b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo445u0(C0581f fVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo446v0(int i) {
    }

    /* renamed from: w0 */
    public void mo447w0(C0508o oVar) {
    }

    @Deprecated
    /* renamed from: x0 */
    public void mo448x0() {
    }

    /* renamed from: y0 */
    public boolean mo449y0() {
        Intent C = mo420C();
        if (C == null) {
            return false;
        }
        if (mo419B0(C)) {
            C0508o d = C0508o.m2113d(this);
            mo444t0(d);
            mo447w0(d);
            d.mo2565e();
            try {
                C0483b.m2057i(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo418A0(C);
            return true;
        }
    }
}
