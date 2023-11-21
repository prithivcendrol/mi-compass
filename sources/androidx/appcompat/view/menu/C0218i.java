package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0232n;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.view.C0657b;
import p021d.C1454h;
import p027e.C1512a;
import p109s.C2636b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0218i implements C2636b {

    /* renamed from: A */
    private View f783A;

    /* renamed from: B */
    private C0657b f784B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f785C;

    /* renamed from: D */
    private boolean f786D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f787E;

    /* renamed from: a */
    private final int f788a;

    /* renamed from: b */
    private final int f789b;

    /* renamed from: c */
    private final int f790c;

    /* renamed from: d */
    private final int f791d;

    /* renamed from: e */
    private CharSequence f792e;

    /* renamed from: f */
    private CharSequence f793f;

    /* renamed from: g */
    private Intent f794g;

    /* renamed from: h */
    private char f795h;

    /* renamed from: i */
    private int f796i = 4096;

    /* renamed from: j */
    private char f797j;

    /* renamed from: k */
    private int f798k = 4096;

    /* renamed from: l */
    private Drawable f799l;

    /* renamed from: m */
    private int f800m = 0;

    /* renamed from: n */
    C0214g f801n;

    /* renamed from: o */
    private C0239r f802o;

    /* renamed from: p */
    private Runnable f803p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f804q;

    /* renamed from: r */
    private CharSequence f805r;

    /* renamed from: s */
    private CharSequence f806s;

    /* renamed from: t */
    private ColorStateList f807t = null;

    /* renamed from: u */
    private PorterDuff.Mode f808u = null;

    /* renamed from: v */
    private boolean f809v = false;

    /* renamed from: w */
    private boolean f810w = false;

    /* renamed from: x */
    private boolean f811x = false;

    /* renamed from: y */
    private int f812y = 16;

    /* renamed from: z */
    private int f813z;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0219a implements C0657b.C0659b {
        C0219a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0218i iVar = C0218i.this;
            iVar.f801n.mo868J(iVar);
        }
    }

    C0218i(C0214g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f801n = gVar;
        this.f788a = i2;
        this.f789b = i;
        this.f790c = i3;
        this.f791d = i4;
        this.f792e = charSequence;
        this.f813z = i5;
    }

    /* renamed from: d */
    private static void m935d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m936e(Drawable drawable) {
        if (drawable != null && this.f811x && (this.f809v || this.f810w)) {
            drawable = C0553a.m2297j(drawable).mutate();
            if (this.f809v) {
                C0553a.m2294g(drawable, this.f807t);
            }
            if (this.f810w) {
                C0553a.m2295h(drawable, this.f808u);
            }
            this.f811x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo939A() {
        return this.f801n.mo866H() && mo943g() != 0;
    }

    /* renamed from: B */
    public boolean mo940B() {
        return (this.f813z & 4) == 4;
    }

    /* renamed from: a */
    public C2636b mo738a(C0657b bVar) {
        C0657b bVar2 = this.f784B;
        if (bVar2 != null) {
            bVar2.mo2802h();
        }
        this.f783A = null;
        this.f784B = bVar;
        this.f801n.mo869K(true);
        C0657b bVar3 = this.f784B;
        if (bVar3 != null) {
            bVar3.mo1060j(new C0219a());
        }
        return this;
    }

    /* renamed from: b */
    public C0657b mo739b() {
        return this.f784B;
    }

    /* renamed from: c */
    public void mo941c() {
        this.f801n.mo867I(this);
    }

    public boolean collapseActionView() {
        if ((this.f813z & 8) == 0) {
            return false;
        }
        if (this.f783A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f785C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f801n.mo903f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo963j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f785C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f801n.mo909k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo942f() {
        return this.f791d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo943g() {
        return this.f801n.mo865G() ? this.f797j : this.f795h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f783A;
        if (view != null) {
            return view;
        }
        C0657b bVar = this.f784B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1058d(this);
        this.f783A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f798k;
    }

    public char getAlphabeticShortcut() {
        return this.f797j;
    }

    public CharSequence getContentDescription() {
        return this.f805r;
    }

    public int getGroupId() {
        return this.f789b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f799l;
        if (drawable != null) {
            return m936e(drawable);
        }
        if (this.f800m == 0) {
            return null;
        }
        Drawable b = C1512a.m6567b(this.f801n.mo928u(), this.f800m);
        this.f800m = 0;
        this.f799l = b;
        return m936e(b);
    }

    public ColorStateList getIconTintList() {
        return this.f807t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f808u;
    }

    public Intent getIntent() {
        return this.f794g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f788a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f787E;
    }

    public int getNumericModifiers() {
        return this.f796i;
    }

    public char getNumericShortcut() {
        return this.f795h;
    }

    public int getOrder() {
        return this.f790c;
    }

    public SubMenu getSubMenu() {
        return this.f802o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f792e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f793f;
        return charSequence != null ? charSequence : this.f792e;
    }

    public CharSequence getTooltipText() {
        return this.f806s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo956h() {
        int i;
        char g = mo943g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f801n.mo928u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f801n.mo928u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C1454h.f5844m));
        }
        int i2 = this.f801n.mo865G() ? this.f798k : this.f796i;
        m935d(sb, i2, 65536, resources.getString(C1454h.f5840i));
        m935d(sb, i2, 4096, resources.getString(C1454h.f5836e));
        m935d(sb, i2, 2, resources.getString(C1454h.f5835d));
        m935d(sb, i2, 1, resources.getString(C1454h.f5841j));
        m935d(sb, i2, 4, resources.getString(C1454h.f5843l));
        m935d(sb, i2, 8, resources.getString(C1454h.f5839h));
        if (g == 8) {
            i = C1454h.f5837f;
        } else if (g == 10) {
            i = C1454h.f5838g;
        } else if (g != ' ') {
            sb.append(g);
            return sb.toString();
        } else {
            i = C1454h.f5842k;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f802o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo958i(C0232n.C0233a aVar) {
        return (aVar == null || !aVar.mo700a()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f786D;
    }

    public boolean isCheckable() {
        return (this.f812y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f812y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f812y & 16) != 0;
    }

    public boolean isVisible() {
        C0657b bVar = this.f784B;
        return (bVar == null || !bVar.mo1059g()) ? (this.f812y & 8) == 0 : (this.f812y & 8) == 0 && this.f784B.mo1057b();
    }

    /* renamed from: j */
    public boolean mo963j() {
        C0657b bVar;
        if ((this.f813z & 8) == 0) {
            return false;
        }
        if (this.f783A == null && (bVar = this.f784B) != null) {
            this.f783A = bVar.mo1058d(this);
        }
        return this.f783A != null;
    }

    /* renamed from: k */
    public boolean mo964k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f804q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0214g gVar = this.f801n;
        if (gVar.mo906h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f803p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f794g != null) {
            try {
                this.f801n.mo928u().startActivity(this.f794g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0657b bVar = this.f784B;
        return bVar != null && bVar.mo1055e();
    }

    /* renamed from: l */
    public boolean mo965l() {
        return (this.f812y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo966m() {
        return (this.f812y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo967n() {
        return (this.f813z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo968o() {
        return (this.f813z & 2) == 2;
    }

    /* renamed from: p */
    public C2636b setActionView(int i) {
        Context u = this.f801n.mo928u();
        setActionView(LayoutInflater.from(u).inflate(i, new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public C2636b setActionView(View view) {
        int i;
        this.f783A = view;
        this.f784B = null;
        if (view != null && view.getId() == -1 && (i = this.f788a) > 0) {
            view.setId(i);
        }
        this.f801n.mo867I(this);
        return this;
    }

    /* renamed from: r */
    public void mo971r(boolean z) {
        this.f786D = z;
        this.f801n.mo869K(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo972s(boolean z) {
        int i = this.f812y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f812y = i2;
        if (i != i2) {
            this.f801n.mo869K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f797j == c) {
            return this;
        }
        this.f797j = Character.toLowerCase(c);
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f797j == c && this.f798k == i) {
            return this;
        }
        this.f797j = Character.toLowerCase(c);
        this.f798k = KeyEvent.normalizeMetaState(i);
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f812y;
        boolean z2 = z | (i & true);
        this.f812y = z2 ? 1 : 0;
        if (i != z2) {
            this.f801n.mo869K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f812y & 4) != 0) {
            this.f801n.mo877T(this);
        } else {
            mo972s(z);
        }
        return this;
    }

    public C2636b setContentDescription(CharSequence charSequence) {
        this.f805r = charSequence;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f812y = z ? this.f812y | 16 : this.f812y & -17;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f799l = null;
        this.f800m = i;
        this.f811x = true;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f800m = 0;
        this.f799l = drawable;
        this.f811x = true;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f807t = colorStateList;
        this.f809v = true;
        this.f811x = true;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f808u = mode;
        this.f810w = true;
        this.f811x = true;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f794g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f795h == c) {
            return this;
        }
        this.f795h = c;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f795h == c && this.f796i == i) {
            return this;
        }
        this.f795h = c;
        this.f796i = KeyEvent.normalizeMetaState(i);
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f785C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f804q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f795h = c;
        this.f797j = Character.toLowerCase(c2);
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f795h = c;
        this.f796i = KeyEvent.normalizeMetaState(i);
        this.f797j = Character.toLowerCase(c2);
        this.f798k = KeyEvent.normalizeMetaState(i2);
        this.f801n.mo869K(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f813z = i;
            this.f801n.mo867I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f801n.mo928u().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f792e = charSequence;
        this.f801n.mo869K(false);
        C0239r rVar = this.f802o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f793f = charSequence;
        this.f801n.mo869K(false);
        return this;
    }

    public C2636b setTooltipText(CharSequence charSequence) {
        this.f806s = charSequence;
        this.f801n.mo869K(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo995y(z)) {
            this.f801n.mo868J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo989t(boolean z) {
        this.f812y = (z ? 4 : 0) | (this.f812y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f792e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo991u(boolean z) {
        this.f812y = z ? this.f812y | 32 : this.f812y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo992v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f787E = contextMenuInfo;
    }

    /* renamed from: w */
    public C2636b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo994x(C0239r rVar) {
        this.f802o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo995y(boolean z) {
        int i = this.f812y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f812y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo996z() {
        return this.f801n.mo860A();
    }
}
