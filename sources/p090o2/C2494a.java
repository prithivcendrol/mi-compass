package p090o2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o2.a */
public class C2494a implements MenuItem {

    /* renamed from: a */
    private final int f9703a;

    /* renamed from: b */
    private final int f9704b;

    /* renamed from: c */
    private final int f9705c;

    /* renamed from: d */
    private final int f9706d;

    /* renamed from: e */
    private CharSequence f9707e;

    /* renamed from: f */
    private CharSequence f9708f;

    /* renamed from: g */
    private Intent f9709g;

    /* renamed from: h */
    private char f9710h;

    /* renamed from: i */
    private char f9711i;

    /* renamed from: j */
    private Drawable f9712j;

    /* renamed from: k */
    private Context f9713k;

    /* renamed from: l */
    private MenuItem.OnMenuItemClickListener f9714l;

    /* renamed from: m */
    private int f9715m = 16;

    public C2494a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f9713k = context;
        this.f9703a = i2;
        this.f9704b = i;
        this.f9705c = i3;
        this.f9706d = i4;
        this.f9707e = charSequence;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return this.f9711i;
    }

    public int getGroupId() {
        return this.f9704b;
    }

    public Drawable getIcon() {
        return this.f9712j;
    }

    public Intent getIntent() {
        return this.f9709g;
    }

    public int getItemId() {
        return this.f9703a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f9710h;
    }

    public int getOrder() {
        return this.f9706d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f9707e;
    }

    public CharSequence getTitleCondensed() {
        return this.f9708f;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f9715m & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f9715m & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f9715m & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f9715m & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f9711i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f9715m = z | (this.f9715m & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f9715m = (z ? 2 : 0) | (this.f9715m & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f9715m = (z ? 16 : 0) | (this.f9715m & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f9712j = this.f9713k.getResources().getDrawable(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f9712j = drawable;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f9709g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f9710h = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9714l = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f9710h = c;
        this.f9711i = c2;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f9707e = this.f9713k.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f9707e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9708f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f9715m & 8;
        if (z) {
            i = 0;
        }
        this.f9715m = i2 | i;
        return this;
    }
}
