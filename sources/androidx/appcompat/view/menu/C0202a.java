package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0510a;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.view.C0657b;
import p109s.C2636b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0202a implements C2636b {

    /* renamed from: a */
    private final int f665a;

    /* renamed from: b */
    private final int f666b;

    /* renamed from: c */
    private final int f667c;

    /* renamed from: d */
    private CharSequence f668d;

    /* renamed from: e */
    private CharSequence f669e;

    /* renamed from: f */
    private Intent f670f;

    /* renamed from: g */
    private char f671g;

    /* renamed from: h */
    private int f672h = 4096;

    /* renamed from: i */
    private char f673i;

    /* renamed from: j */
    private int f674j = 4096;

    /* renamed from: k */
    private Drawable f675k;

    /* renamed from: l */
    private Context f676l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f677m;

    /* renamed from: n */
    private CharSequence f678n;

    /* renamed from: o */
    private CharSequence f679o;

    /* renamed from: p */
    private ColorStateList f680p = null;

    /* renamed from: q */
    private PorterDuff.Mode f681q = null;

    /* renamed from: r */
    private boolean f682r = false;

    /* renamed from: s */
    private boolean f683s = false;

    /* renamed from: t */
    private int f684t = 16;

    public C0202a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f676l = context;
        this.f665a = i2;
        this.f666b = i;
        this.f667c = i4;
        this.f668d = charSequence;
    }

    /* renamed from: c */
    private void m803c() {
        Drawable drawable = this.f675k;
        if (drawable == null) {
            return;
        }
        if (this.f682r || this.f683s) {
            Drawable j = C0553a.m2297j(drawable);
            this.f675k = j;
            Drawable mutate = j.mutate();
            this.f675k = mutate;
            if (this.f682r) {
                C0553a.m2294g(mutate, this.f680p);
            }
            if (this.f683s) {
                C0553a.m2295h(this.f675k, this.f681q);
            }
        }
    }

    /* renamed from: a */
    public C2636b mo738a(C0657b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0657b mo739b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C2636b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C2636b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C2636b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f674j;
    }

    public char getAlphabeticShortcut() {
        return this.f673i;
    }

    public CharSequence getContentDescription() {
        return this.f678n;
    }

    public int getGroupId() {
        return this.f666b;
    }

    public Drawable getIcon() {
        return this.f675k;
    }

    public ColorStateList getIconTintList() {
        return this.f680p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f681q;
    }

    public Intent getIntent() {
        return this.f670f;
    }

    public int getItemId() {
        return this.f665a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f672h;
    }

    public char getNumericShortcut() {
        return this.f671g;
    }

    public int getOrder() {
        return this.f667c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f668d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f669e;
        return charSequence != null ? charSequence : this.f668d;
    }

    public CharSequence getTooltipText() {
        return this.f679o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f684t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f684t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f684t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f684t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f673i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f673i = Character.toLowerCase(c);
        this.f674j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f684t = z | (this.f684t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f684t = (z ? 2 : 0) | (this.f684t & -3);
        return this;
    }

    public C2636b setContentDescription(CharSequence charSequence) {
        this.f678n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f684t = (z ? 16 : 0) | (this.f684t & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f675k = C0510a.m2124e(this.f676l, i);
        m803c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f675k = drawable;
        m803c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f680p = colorStateList;
        this.f682r = true;
        m803c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f681q = mode;
        this.f683s = true;
        m803c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f670f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f671g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f671g = c;
        this.f672h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f677m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f671g = c;
        this.f673i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f671g = c;
        this.f672h = KeyEvent.normalizeMetaState(i);
        this.f673i = Character.toLowerCase(c2);
        this.f674j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f668d = this.f676l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f668d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f669e = charSequence;
        return this;
    }

    public C2636b setTooltipText(CharSequence charSequence) {
        this.f679o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f684t & 8;
        if (z) {
            i = 0;
        }
        this.f684t = i2 | i;
        return this;
    }
}
