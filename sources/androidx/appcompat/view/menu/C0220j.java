package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0184c;
import androidx.core.view.C0657b;
import java.lang.reflect.Method;
import p109s.C2636b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0220j extends C0204c implements MenuItem {

    /* renamed from: d */
    private final C2636b f815d;

    /* renamed from: e */
    private Method f816e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0221a extends C0657b {

        /* renamed from: d */
        final ActionProvider f817d;

        C0221a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f817d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1053a() {
            return this.f817d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1054c() {
            return this.f817d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1055e() {
            return this.f817d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1056f(SubMenu subMenu) {
            this.f817d.onPrepareSubMenu(C0220j.this.mo814d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0222b extends C0221a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private C0657b.C0659b f819f;

        C0222b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo1057b() {
            return this.f817d.isVisible();
        }

        /* renamed from: d */
        public View mo1058d(MenuItem menuItem) {
            return this.f817d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1059g() {
            return this.f817d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1060j(C0657b.C0659b bVar) {
            this.f819f = bVar;
            this.f817d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0657b.C0659b bVar = this.f819f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0223c extends FrameLayout implements C0184c {

        /* renamed from: d */
        final CollapsibleActionView f821d;

        C0223c(View view) {
            super(view.getContext());
            this.f821d = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1062a() {
            return (View) this.f821d;
        }

        public void onActionViewCollapsed() {
            this.f821d.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f821d.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0224d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f822a;

        C0224d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f822a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f822a.onMenuItemActionCollapse(C0220j.this.mo813c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f822a.onMenuItemActionExpand(C0220j.this.mo813c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0225e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        private final MenuItem.OnMenuItemClickListener f824d;

        C0225e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f824d = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f824d.onMenuItemClick(C0220j.this.mo813c(menuItem));
        }
    }

    public C0220j(Context context, C2636b bVar) {
        super(context);
        if (bVar != null) {
            this.f815d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f815d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f815d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0657b b = this.f815d.mo739b();
        if (b instanceof C0221a) {
            return ((C0221a) b).f817d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f815d.getActionView();
        return actionView instanceof C0223c ? ((C0223c) actionView).mo1062a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f815d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f815d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f815d.getContentDescription();
    }

    public int getGroupId() {
        return this.f815d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f815d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f815d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f815d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f815d.getIntent();
    }

    public int getItemId() {
        return this.f815d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f815d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f815d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f815d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f815d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo814d(this.f815d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f815d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f815d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f815d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1019h(boolean z) {
        try {
            if (this.f816e == null) {
                this.f816e = this.f815d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f816e.invoke(this.f815d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f815d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f815d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f815d.isCheckable();
    }

    public boolean isChecked() {
        return this.f815d.isChecked();
    }

    public boolean isEnabled() {
        return this.f815d.isEnabled();
    }

    public boolean isVisible() {
        return this.f815d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0222b bVar = new C0222b(this.f695a, actionProvider);
        C2636b bVar2 = this.f815d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo738a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f815d.setActionView(i);
        View actionView = this.f815d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f815d.setActionView((View) new C0223c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0223c(view);
        }
        this.f815d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f815d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f815d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f815d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f815d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f815d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f815d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f815d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f815d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f815d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f815d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f815d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f815d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f815d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f815d.setOnActionExpandListener(onActionExpandListener != null ? new C0224d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f815d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0225e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f815d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f815d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f815d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f815d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f815d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f815d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f815d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f815d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f815d.setVisible(z);
    }
}
