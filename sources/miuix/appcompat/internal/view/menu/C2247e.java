package miuix.appcompat.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.core.content.res.C0528f;
import miuix.appcompat.internal.view.menu.C2252h;
import p102q2.C2582a;

/* renamed from: miuix.appcompat.internal.view.menu.e */
public final class C2247e implements MenuItem {

    /* renamed from: B */
    private static String f8550B;

    /* renamed from: C */
    private static String f8551C;

    /* renamed from: D */
    private static String f8552D;

    /* renamed from: E */
    private static String f8553E;

    /* renamed from: A */
    private ContextMenu.ContextMenuInfo f8554A;

    /* renamed from: a */
    private final int f8555a;

    /* renamed from: b */
    private final int f8556b;

    /* renamed from: c */
    private final int f8557c;

    /* renamed from: d */
    private final int f8558d;

    /* renamed from: e */
    private CharSequence f8559e;

    /* renamed from: f */
    private CharSequence f8560f;

    /* renamed from: g */
    private CharSequence f8561g;

    /* renamed from: h */
    private Intent f8562h;

    /* renamed from: i */
    private char f8563i;

    /* renamed from: j */
    private char f8564j;

    /* renamed from: k */
    private C2582a f8565k;

    /* renamed from: l */
    private boolean f8566l = false;

    /* renamed from: m */
    private int f8567m;

    /* renamed from: n */
    private Drawable f8568n;

    /* renamed from: o */
    private int f8569o = 0;

    /* renamed from: p */
    private C2242c f8570p;

    /* renamed from: q */
    private C2254i f8571q;

    /* renamed from: r */
    private Runnable f8572r;

    /* renamed from: s */
    private MenuItem.OnMenuItemClickListener f8573s;

    /* renamed from: t */
    private int f8574t = 16;

    /* renamed from: u */
    private int f8575u;

    /* renamed from: v */
    private View f8576v;

    /* renamed from: w */
    private View f8577w;

    /* renamed from: x */
    private ActionProvider f8578x;

    /* renamed from: y */
    private MenuItem.OnActionExpandListener f8579y;

    /* renamed from: z */
    private boolean f8580z = false;

    C2247e(C2242c cVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f8570p = cVar;
        this.f8555a = i2;
        this.f8556b = i;
        this.f8557c = i3;
        this.f8558d = i4;
        this.f8559e = charSequence;
        this.f8575u = i5;
    }

    /* renamed from: c */
    private C2582a m9480c() {
        if (this.f8565k == null) {
            this.f8565k = new C2582a(this.f8570p.mo8398s());
        }
        return this.f8565k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo8417A() {
        return this.f8570p.mo8342E() && mo8421e() != 0;
    }

    /* renamed from: B */
    public void mo8418B() {
        if (!this.f8566l || this.f8577w.getVisibility() != 0) {
            C2582a aVar = this.f8565k;
            if (aVar != null) {
                aVar.mo9847c();
                this.f8565k = null;
                return;
            }
            return;
        }
        m9480c().mo9846b(this.f8577w, this.f8567m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f8579y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean collapseActionView() {
        /*
            r1 = this;
            int r0 = r1.f8575u
            r0 = r0 & 8
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = r1.f8576v
            if (r0 == 0) goto L_0x001c
            android.view.MenuItem$OnActionExpandListener r0 = r1.f8579y
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.onMenuItemActionCollapse(r1)
            if (r0 == 0) goto L_0x001e
        L_0x0014:
            miuix.appcompat.internal.view.menu.c r0 = r1.f8570p
            boolean r0 = r0.mo8380f(r1)
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.C2247e.collapseActionView():boolean");
    }

    /* renamed from: d */
    public int mo8420d() {
        return this.f8558d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public char mo8421e() {
        return this.f8564j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f8579y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean expandActionView() {
        /*
            r1 = this;
            int r0 = r1.f8575u
            r0 = r0 & 8
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = r1.f8576v
            if (r0 == 0) goto L_0x001e
            android.view.MenuItem$OnActionExpandListener r0 = r1.f8579y
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.onMenuItemActionExpand(r1)
            if (r0 == 0) goto L_0x001e
        L_0x0014:
            miuix.appcompat.internal.view.menu.c r0 = r1.f8570p
            boolean r0 = r0.mo8386j(r1)
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.C2247e.expandActionView():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo8423f() {
        String str;
        char e = mo8421e();
        if (e == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f8550B);
        if (e == 8) {
            str = f8552D;
        } else if (e == 10) {
            str = f8551C;
        } else if (e != ' ') {
            sb.append(e);
            return sb.toString();
        } else {
            str = f8553E;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    public ActionProvider mo8424g() {
        return this.f8578x;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
    }

    public View getActionView() {
        View view = this.f8576v;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f8578x;
        if (actionProvider == null) {
            return null;
        }
        View onCreateActionView = actionProvider.onCreateActionView(this);
        this.f8576v = onCreateActionView;
        return onCreateActionView;
    }

    public char getAlphabeticShortcut() {
        return this.f8564j;
    }

    public CharSequence getContentDescription() {
        return this.f8561g;
    }

    public int getGroupId() {
        return this.f8556b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f8568n;
        if (drawable != null) {
            return drawable;
        }
        if (this.f8569o == 0) {
            return null;
        }
        Drawable d = C0528f.m2201d(this.f8570p.mo8338A(), this.f8569o, this.f8570p.mo8398s().getTheme());
        this.f8569o = 0;
        this.f8568n = d;
        return d;
    }

    public Intent getIntent() {
        return this.f8562h;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f8555a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8554A;
    }

    public char getNumericShortcut() {
        return this.f8563i;
    }

    public int getOrder() {
        return this.f8557c;
    }

    public SubMenu getSubMenu() {
        return this.f8571q;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f8559e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8560f;
        return charSequence != null ? charSequence : this.f8559e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence mo8439h(C2252h.C2253a aVar) {
        return (aVar == null || !aVar.mo8200a()) ? getTitle() : getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return this.f8571q != null;
    }

    /* renamed from: i */
    public View mo8441i() {
        return this.f8577w;
    }

    public boolean isActionViewExpanded() {
        return this.f8580z;
    }

    public boolean isCheckable() {
        return (this.f8574t & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f8574t & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f8574t & 16) != 0;
    }

    public boolean isVisible() {
        ActionProvider actionProvider = this.f8578x;
        return (actionProvider == null || !actionProvider.overridesItemVisibility()) ? (this.f8574t & 8) == 0 : (this.f8574t & 8) == 0 && this.f8578x.isVisible();
    }

    /* renamed from: j */
    public boolean mo8447j() {
        return ((this.f8575u & 8) == 0 || this.f8576v == null) ? false : true;
    }

    /* renamed from: k */
    public boolean mo8448k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f8573s;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C2242c cVar = this.f8570p;
        if (cVar.mo8382g(cVar.mo8339B(), this)) {
            return true;
        }
        Runnable runnable = this.f8572r;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f8562h != null) {
            try {
                this.f8570p.mo8398s().startActivity(this.f8562h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        ActionProvider actionProvider = this.f8578x;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    /* renamed from: l */
    public boolean mo8449l() {
        return (this.f8574t & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo8450m() {
        return (this.f8574t & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo8451n() {
        return (this.f8575u & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo8452o() {
        return (this.f8575u & 2) == 2;
    }

    /* renamed from: p */
    public void mo8453p(boolean z) {
        this.f8580z = z;
        this.f8570p.mo8345H(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8454q(boolean z) {
        int i = this.f8574t;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f8574t = i2;
        if (i != i2) {
            this.f8570p.mo8345H(false);
        }
    }

    /* renamed from: r */
    public void mo8455r(boolean z) {
        this.f8574t = (z ? 4 : 0) | (this.f8574t & -5);
    }

    /* renamed from: s */
    public void mo8456s(boolean z) {
        this.f8574t = z ? this.f8574t | 32 : this.f8574t & -33;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
    }

    public MenuItem setActionView(int i) {
        Context s = this.f8570p.mo8398s();
        setActionView(LayoutInflater.from(s).inflate(i, new LinearLayout(s), false));
        return this;
    }

    public MenuItem setActionView(View view) {
        int i;
        this.f8576v = view;
        this.f8577w = view;
        this.f8578x = null;
        if (view != null && view.getId() == -1 && (i = this.f8555a) > 0) {
            view.setId(i);
        }
        this.f8570p.mo8343F(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f8564j == c) {
            return this;
        }
        this.f8564j = Character.toLowerCase(c);
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f8574t;
        boolean z2 = z | (i & true);
        this.f8574t = z2 ? 1 : 0;
        if (i != z2) {
            this.f8570p.mo8345H(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f8574t & 4) != 0) {
            this.f8570p.mo8352P(this);
        } else {
            mo8454q(z);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f8561g = charSequence;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f8574t = z ? this.f8574t | 16 : this.f8574t & -17;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f8568n = null;
        this.f8569o = i;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f8569o = 0;
        this.f8568n = drawable;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f8562h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f8563i == c) {
            return this;
        }
        this.f8563i = c;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return mo8482w(onActionExpandListener);
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8573s = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f8563i = c;
        this.f8564j = Character.toLowerCase(c2);
        this.f8570p.mo8345H(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f8575u = i;
            this.f8570p.mo8343F(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f8570p.mo8398s().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f8559e = charSequence;
        this.f8570p.mo8345H(false);
        C2254i iVar = this.f8571q;
        if (iVar != null) {
            iVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8560f = charSequence;
        this.f8570p.mo8345H(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo8484y(z)) {
            this.f8570p.mo8344G(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo8478t(C2242c cVar) {
        this.f8570p = cVar;
    }

    public String toString() {
        return this.f8559e.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8480u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f8554A = contextMenuInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo8481v(C2254i iVar) {
        this.f8571q = iVar;
        iVar.setHeaderTitle(getTitle());
    }

    /* renamed from: w */
    public MenuItem mo8482w(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8579y = onActionExpandListener;
        return this;
    }

    /* renamed from: x */
    public void mo8483x(View view) {
        this.f8577w = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo8484y(boolean z) {
        int i = this.f8574t;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f8574t = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo8485z() {
        return this.f8570p.mo8409y();
    }
}
