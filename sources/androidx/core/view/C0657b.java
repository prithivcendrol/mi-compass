package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
public abstract class C0657b {

    /* renamed from: a */
    private final Context f2727a;

    /* renamed from: b */
    private C0658a f2728b;

    /* renamed from: c */
    private C0659b f2729c;

    /* renamed from: androidx.core.view.b$a */
    public interface C0658a {
    }

    /* renamed from: androidx.core.view.b$b */
    public interface C0659b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0657b(Context context) {
        this.f2727a = context;
    }

    /* renamed from: a */
    public boolean mo1053a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1057b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1054c();

    /* renamed from: d */
    public View mo1058d(MenuItem menuItem) {
        return mo1054c();
    }

    /* renamed from: e */
    public boolean mo1055e() {
        return false;
    }

    /* renamed from: f */
    public void mo1056f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1059g() {
        return false;
    }

    /* renamed from: h */
    public void mo2802h() {
        this.f2729c = null;
        this.f2728b = null;
    }

    /* renamed from: i */
    public void mo2803i(C0658a aVar) {
        this.f2728b = aVar;
    }

    /* renamed from: j */
    public void mo1060j(C0659b bVar) {
        if (!(this.f2729c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2729c = bVar;
    }
}
