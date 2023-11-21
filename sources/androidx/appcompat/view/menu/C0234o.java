package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p109s.C2635a;

/* renamed from: androidx.appcompat.view.menu.o */
public class C0234o extends C0204c implements Menu {

    /* renamed from: d */
    private final C2635a f840d;

    public C0234o(Context context, C2635a aVar) {
        super(context);
        if (aVar != null) {
            this.f840d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo813c(this.f840d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo813c(this.f840d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo813c(this.f840d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo813c(this.f840d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f840d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo813c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo814d(this.f840d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo814d(this.f840d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo814d(this.f840d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo814d(this.f840d.addSubMenu(charSequence));
    }

    public void clear() {
        mo815e();
        this.f840d.clear();
    }

    public void close() {
        this.f840d.close();
    }

    public MenuItem findItem(int i) {
        return mo813c(this.f840d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo813c(this.f840d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f840d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f840d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f840d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f840d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo816f(i);
        this.f840d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo817g(i);
        this.f840d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f840d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f840d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f840d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f840d.setQwertyMode(z);
    }

    public int size() {
        return this.f840d.size();
    }
}
