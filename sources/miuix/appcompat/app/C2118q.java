package miuix.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0964j;
import p020c4.C1361a;
import p026d4.C1511e;
import p030e2.C1535d;
import p030e2.C1538g;
import p030e2.C1539h;
import p117t2.C2693a;
import p117t2.C2711k;

@SuppressLint({"MissingSuperCall"})
/* renamed from: miuix.appcompat.app.q */
public class C2118q extends C0964j implements C2130v, C1535d, C1361a<Activity> {

    /* renamed from: A */
    private C2711k f7746A;

    /* renamed from: B */
    private C2124t f7747B = new C2124t(this, new C2120b(), new C2121c());

    /* renamed from: miuix.appcompat.app.q$b */
    private class C2120b implements C2081f {
        private C2120b() {
        }

        /* renamed from: a */
        public void mo7435a() {
            C2118q.super.onStop();
        }

        /* renamed from: b */
        public void mo7436b() {
            C2118q.super.onPostResume();
        }

        /* renamed from: c */
        public void mo7437c(Bundle bundle) {
            C2118q.super.onRestoreInstanceState(bundle);
        }

        /* renamed from: d */
        public void mo7438d(Bundle bundle) {
            C2118q.super.onSaveInstanceState(bundle);
        }

        /* renamed from: e */
        public void mo7439e(Bundle bundle) {
            C2118q.super.onCreate(bundle);
        }

        public void onConfigurationChanged(Configuration configuration) {
            C2118q.super.onConfigurationChanged(configuration);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return C2118q.super.onCreatePanelMenu(i, menu);
        }

        public View onCreatePanelView(int i) {
            return C2118q.super.onCreatePanelView(i);
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return C2118q.super.onMenuItemSelected(i, menuItem);
        }

        public void onPanelClosed(int i, Menu menu) {
            C2118q.super.onPanelClosed(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            return C2118q.super.onPreparePanel(i, view, menu);
        }
    }

    /* renamed from: miuix.appcompat.app.q$c */
    private class C2121c implements C1539h {
        private C2121c() {
        }

        /* renamed from: a */
        public boolean mo5659a(boolean z) {
            return C2118q.this.mo7571N0(z);
        }

        /* renamed from: b */
        public void mo5660b(boolean z) {
            C2118q.this.mo7570M0(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public void mo7557B0(Configuration configuration) {
        this.f7747B.mo7620b0(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public void mo7558C0(Configuration configuration) {
        this.f7747B.mo7621d0(configuration);
    }

    /* renamed from: D */
    public void mo5203D(Configuration configuration, C1511e eVar, boolean z) {
        this.f7747B.mo5203D(configuration, eVar, z);
    }

    /* renamed from: D0 */
    public void mo7559D0() {
    }

    /* renamed from: E0 */
    public String mo7560E0() {
        return this.f7747B.mo7625i0();
    }

    /* renamed from: F */
    public void mo5647F() {
        this.f7747B.mo7624h0();
    }

    /* renamed from: F0 */
    public C2071a mo7561F0() {
        return this.f7747B.mo7411g();
    }

    /* renamed from: G */
    public boolean mo7562G() {
        return this.f7747B.mo7606G();
    }

    /* renamed from: G0 */
    public View mo7563G0() {
        return this.f7747B.mo7626k0();
    }

    /* renamed from: H0 */
    public Activity mo5204L() {
        return this;
    }

    /* renamed from: I */
    public void mo5648I() {
        this.f7747B.mo7623g0();
    }

    /* renamed from: I0 */
    public C2711k mo7565I0() {
        return this.f7746A;
    }

    /* renamed from: J */
    public Rect mo7566J() {
        return this.f7747B.mo7566J();
    }

    /* renamed from: J0 */
    public void mo7567J0() {
        this.f7747B.mo7628m0();
    }

    /* renamed from: K0 */
    public void mo7568K0() {
        this.f7747B.mo7629n0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public boolean mo7569L0() {
        return false;
    }

    /* renamed from: M0 */
    public void mo7570M0(boolean z) {
    }

    /* renamed from: N0 */
    public boolean mo7571N0(boolean z) {
        return true;
    }

    /* renamed from: O0 */
    public void mo7572O0(Rect rect) {
        this.f7747B.mo7395H(rect);
    }

    /* renamed from: P0 */
    public void mo7573P0() {
        super.finish();
    }

    /* renamed from: Q0 */
    public void mo7574Q0(boolean z) {
        this.f7747B.mo7610J0(z);
    }

    @Deprecated
    /* renamed from: R0 */
    public void mo7575R0(boolean z) {
        this.f7747B.mo7401P(z);
    }

    /* renamed from: S0 */
    public void mo7576S0(C1538g gVar) {
        this.f7747B.mo7613N0(gVar);
    }

    /* renamed from: T0 */
    public void mo7577T0() {
        this.f7747B.mo7617S0();
    }

    @Deprecated
    /* renamed from: U0 */
    public void mo7578U0(View view, ViewGroup viewGroup) {
        this.f7747B.mo7405T(view, viewGroup);
    }

    /* renamed from: a */
    public void mo5205a(Configuration configuration, C1511e eVar, boolean z) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f7747B.mo7619a0(view, layoutParams);
    }

    /* renamed from: b */
    public void mo7407b(Rect rect) {
        this.f7747B.mo7407b(rect);
        mo7572O0(rect);
    }

    public void bindViewWithContentInset(View view) {
        this.f7747B.mo7414j(view);
    }

    public void finish() {
        if (!this.f7747B.mo7616Q0()) {
            mo7573P0();
        }
    }

    public MenuInflater getMenuInflater() {
        return this.f7747B.mo7421r();
    }

    /* renamed from: i */
    public void mo7413i(int[] iArr) {
    }

    public void invalidateOptionsMenu() {
        this.f7747B.invalidateOptionsMenu();
    }

    public boolean isFinishing() {
        return this.f7747B.mo7631r0() || super.isFinishing();
    }

    /* renamed from: m */
    public void mo7584m(int i) {
        this.f7747B.mo7584m(i);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f7747B.mo7426x(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f7747B.mo7427y(actionMode);
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo7558C0(getResources().getConfiguration());
        if (!this.f7746A.mo9958a()) {
            C2693a.m11248q(this.f7746A);
        }
        this.f7747B.mo7428z(configuration);
        mo7557B0(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C2693a.m11247p(this);
        this.f7747B.mo7614O0(mo7569L0());
        this.f7747B.mo7632w0(bundle);
        this.f7746A = C2693a.m11240i(this, (Configuration) null, true);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f7747B.mo7633x0(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f7747B.mo7634y0(i);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f7747B.mo7391B();
        C2693a.m11249r(this);
        this.f7746A = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (C2076b0.m8272c(mo3605g0(), i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (C2076b0.m8275j(mo3605g0(), i, keyEvent)) {
            return true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (C2076b0.m8278n(mo3605g0(), i, i2, keyEvent)) {
            return true;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (C2076b0.m8274i(mo3605g0(), i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f7747B.mo7392C(i, menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f7747B.mo7635z0(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        this.f7747B.mo7600A0();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f7747B.mo7601B0(i, view, menu);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        this.f7747B.mo7602C0(bundle);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f7747B.mo7603D0(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f7747B.mo7604E0();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        this.f7747B.mo7615P0(charSequence);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f7747B.mo7396I(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f7747B.mo7397K(callback, i);
    }

    /* renamed from: p */
    public void mo5649p() {
        this.f7747B.mo7622f0();
    }

    public void registerCoordinateScrollView(View view) {
        this.f7747B.mo7398M(view);
    }

    public void setBottomMenuCustomView(View view) {
        this.f7747B.mo7605F0(view);
    }

    public void setContentView(int i) {
        this.f7747B.mo7607G0(i);
    }

    public void setContentView(View view) {
        this.f7747B.mo7608H0(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f7747B.mo7609I0(view, layoutParams);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.f7747B.mo7618T0(callback);
    }

    public void unregisterCoordinateScrollView(View view) {
        this.f7747B.mo7406U(view);
    }
}
