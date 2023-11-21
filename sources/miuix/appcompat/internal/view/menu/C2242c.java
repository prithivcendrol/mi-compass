package miuix.appcompat.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.android.internal.view.menu.MenuBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.C1348d;

/* renamed from: miuix.appcompat.internal.view.menu.c */
public class C2242c extends MenuBuilder {

    /* renamed from: y */
    private static final int[] f8520y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f8521a;

    /* renamed from: b */
    private final Resources f8522b;

    /* renamed from: c */
    private boolean f8523c;

    /* renamed from: d */
    private boolean f8524d;

    /* renamed from: e */
    private C2244b f8525e;

    /* renamed from: f */
    private ArrayList<C2247e> f8526f;

    /* renamed from: g */
    private ArrayList<C2247e> f8527g;

    /* renamed from: h */
    private boolean f8528h;

    /* renamed from: i */
    private ArrayList<C2247e> f8529i;

    /* renamed from: j */
    private ArrayList<C2247e> f8530j;

    /* renamed from: k */
    private boolean f8531k;

    /* renamed from: l */
    private int f8532l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f8533m;

    /* renamed from: n */
    CharSequence f8534n;

    /* renamed from: o */
    Drawable f8535o;

    /* renamed from: p */
    View f8536p;

    /* renamed from: q */
    private boolean f8537q = false;

    /* renamed from: r */
    private boolean f8538r = false;

    /* renamed from: s */
    private boolean f8539s = false;

    /* renamed from: t */
    private boolean f8540t = false;

    /* renamed from: u */
    private ArrayList<C2247e> f8541u = new ArrayList<>();

    /* renamed from: v */
    private CopyOnWriteArrayList<WeakReference<C2250g>> f8542v = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    private C2247e f8543w;

    /* renamed from: x */
    private final Comparator<C2247e> f8544x = new C2243a();

    /* renamed from: miuix.appcompat.internal.view.menu.c$a */
    class C2243a implements Comparator<C2247e> {
        C2243a() {
        }

        /* renamed from: a */
        public int compare(C2247e eVar, C2247e eVar2) {
            return eVar.mo8452o() != eVar2.mo8452o() ? eVar.mo8452o() ? -1 : 1 : eVar.mo8451n() != eVar2.mo8451n() ? eVar.mo8451n() ? -1 : 1 : eVar.getOrder() - eVar2.getOrder();
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.c$b */
    public interface C2244b {
        /* renamed from: c */
        boolean mo6474c(C2242c cVar, MenuItem menuItem);
    }

    /* renamed from: miuix.appcompat.internal.view.menu.c$c */
    public interface C2245c {
        /* renamed from: e */
        boolean mo8196e(C2247e eVar, int i);
    }

    public C2242c(Context context) {
        this.f8521a = context;
        this.f8522b = context.getResources();
        this.f8526f = new ArrayList<>();
        this.f8527g = new ArrayList<>();
        this.f8528h = true;
        this.f8529i = new ArrayList<>();
        this.f8530j = new ArrayList<>();
        this.f8531k = true;
        m9420Y(true);
    }

    /* renamed from: L */
    private void m9418L(int i, boolean z) {
        if (i >= 0 && i < this.f8526f.size()) {
            this.f8526f.remove(i);
            if (z) {
                mo8345H(true);
            }
        }
    }

    /* renamed from: T */
    private void m9419T(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources A = mo8338A();
        if (view != null) {
            this.f8536p = view;
            this.f8534n = null;
            this.f8535o = null;
        } else {
            if (i > 0) {
                this.f8534n = A.getText(i);
            } else if (charSequence != null) {
                this.f8534n = charSequence;
            }
            if (i2 > 0) {
                this.f8535o = A.getDrawable(i2);
            } else if (drawable != null) {
                this.f8535o = drawable;
            }
            this.f8536p = null;
        }
        mo8345H(false);
    }

    /* renamed from: Y */
    private void m9420Y(boolean z) {
        boolean z2 = true;
        if (!z || this.f8522b.getConfiguration().keyboard == 1 || !this.f8522b.getBoolean(C1348d.f4594b)) {
            z2 = false;
        }
        this.f8524d = z2;
    }

    /* renamed from: h */
    private void m9421h(boolean z) {
        if (!this.f8542v.isEmpty()) {
            mo8362a0();
            Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C2250g gVar = (C2250g) next.get();
                if (gVar == null) {
                    this.f8542v.remove(next);
                } else {
                    gVar.mo8003b(z);
                }
            }
            mo8360Z();
        }
    }

    /* renamed from: i */
    private boolean m9422i(C2254i iVar, C2250g gVar) {
        boolean z = false;
        if (this.f8542v.isEmpty()) {
            return false;
        }
        if (gVar != null) {
            z = gVar.mo8006e(iVar);
        }
        Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C2250g gVar2 = (C2250g) next.get();
            if (gVar2 == null) {
                this.f8542v.remove(next);
            } else if (!z) {
                z = gVar2.mo8006e(iVar);
            }
        }
        return z;
    }

    /* renamed from: m */
    private static int m9423m(ArrayList<C2247e> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo8420d() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: z */
    private static int m9424z(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f8520y;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Resources mo8338A() {
        return this.f8522b;
    }

    /* renamed from: B */
    public C2242c mo8339B() {
        return this;
    }

    /* renamed from: C */
    public ArrayList<C2247e> mo8340C() {
        if (!this.f8528h) {
            return this.f8527g;
        }
        this.f8527g.clear();
        Iterator<C2247e> it = this.f8526f.iterator();
        while (it.hasNext()) {
            C2247e next = it.next();
            if (next.isVisible()) {
                this.f8527g.add(next);
            }
        }
        Collections.sort(this.f8527g, this.f8544x);
        this.f8528h = false;
        this.f8531k = true;
        return this.f8527g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo8341D() {
        return this.f8523c;
    }

    /* renamed from: E */
    public boolean mo8342E() {
        return this.f8524d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo8343F(C2247e eVar) {
        this.f8531k = true;
        mo8345H(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo8344G(C2247e eVar) {
        this.f8528h = true;
        mo8345H(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo8345H(boolean z) {
        if (!this.f8537q) {
            if (z) {
                this.f8528h = true;
                this.f8531k = true;
            }
            m9421h(z);
            return;
        }
        this.f8538r = true;
    }

    /* renamed from: I */
    public boolean mo8346I(MenuItem menuItem, int i) {
        return mo8347J(menuItem, (C2250g) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8347J(android.view.MenuItem r7, miuix.appcompat.internal.view.menu.C2250g r8, int r9) {
        /*
            r6 = this;
            miuix.appcompat.internal.view.menu.e r7 = (miuix.appcompat.internal.view.menu.C2247e) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo8448k()
            android.view.ActionProvider r2 = r7.mo8424g()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.hasSubMenu()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.mo8447j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo8379e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo8379e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            miuix.appcompat.internal.view.menu.i r9 = new miuix.appcompat.internal.view.menu.i
            android.content.Context r0 = r6.mo8398s()
            r9.<init>(r0, r6, r7)
            r7.mo8481v(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            miuix.appcompat.internal.view.menu.i r7 = (miuix.appcompat.internal.view.menu.C2254i) r7
            if (r4 == 0) goto L_0x0063
            r2.onPrepareSubMenu(r7)
        L_0x0063:
            boolean r7 = r6.m9422i(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.C2242c.mo8347J(android.view.MenuItem, miuix.appcompat.internal.view.menu.g, int):boolean");
    }

    /* renamed from: K */
    public void mo8348K(int i) {
        m9418L(i, true);
    }

    /* renamed from: M */
    public void mo8349M(C2250g gVar) {
        Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C2250g gVar2 = (C2250g) next.get();
            if (gVar2 == null || gVar2 == gVar) {
                this.f8542v.remove(next);
            }
        }
    }

    /* renamed from: N */
    public void mo8350N(C2244b bVar) {
        this.f8525e = bVar;
    }

    /* renamed from: O */
    public C2242c mo8351O(int i) {
        this.f8532l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo8352P(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        Iterator<C2247e> it = this.f8526f.iterator();
        while (it.hasNext()) {
            C2247e next = it.next();
            if (next.getGroupId() == groupId && next.mo8450m() && next.isCheckable()) {
                next.mo8454q(next == menuItem);
            }
        }
    }

    /* renamed from: Q */
    public void mo8353Q(boolean z) {
        this.f8539s = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public C2242c mo8354R(int i) {
        m9419T(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C2242c mo8355S(Drawable drawable) {
        m9419T(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C2242c mo8356U(int i) {
        m9419T(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C2242c mo8357V(CharSequence charSequence) {
        m9419T(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public C2242c mo8358W(View view) {
        m9419T(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: X */
    public void mo8359X(boolean z) {
        this.f8537q = z;
    }

    /* renamed from: Z */
    public void mo8360Z() {
        this.f8537q = false;
        if (this.f8538r) {
            this.f8538r = false;
            mo8345H(true);
        }
    }

    /* renamed from: a */
    public MenuItem mo8361a(C2247e eVar) {
        int z = m9424z(eVar.getOrder());
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f8533m;
        if (contextMenuInfo != null) {
            eVar.mo8480u(contextMenuInfo);
        }
        ArrayList<C2247e> arrayList = this.f8526f;
        arrayList.add(m9423m(arrayList, z), eVar);
        mo8345H(true);
        return eVar;
    }

    /* renamed from: a0 */
    public void mo8362a0() {
        if (!this.f8537q) {
            this.f8537q = true;
            this.f8538r = false;
        }
    }

    public MenuItem add(int i) {
        return mo8372b(0, 0, 0, this.f8522b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo8372b(i, i2, i3, this.f8522b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo8372b(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo8372b(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f8521a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f8522b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f8522b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C2247e eVar = (C2247e) mo8372b(i, i2, i3, charSequence);
        C2254i iVar = new C2254i(this.f8521a, this, eVar);
        eVar.mo8481v(iVar);
        return iVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public MenuItem mo8372b(int i, int i2, int i3, CharSequence charSequence) {
        int z = m9424z(i3);
        C2247e eVar = new C2247e(this, i, i2, i3, z, charSequence, this.f8532l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f8533m;
        if (contextMenuInfo != null) {
            eVar.mo8480u(contextMenuInfo);
        }
        ArrayList<C2247e> arrayList = this.f8526f;
        arrayList.add(m9423m(arrayList, z), eVar);
        mo8345H(true);
        return eVar;
    }

    /* renamed from: b0 */
    public void mo8373b0() {
        mo8345H(true);
    }

    /* renamed from: c */
    public void mo8374c(C2250g gVar) {
        this.f8542v.add(new WeakReference(gVar));
        gVar.mo8008h(this.f8521a, this);
        this.f8531k = true;
    }

    public void clear() {
        C2247e eVar = this.f8543w;
        if (eVar != null) {
            mo8380f(eVar);
        }
        this.f8526f.clear();
        mo8345H(true);
    }

    public void clearHeader() {
        this.f8535o = null;
        this.f8534n = null;
        this.f8536p = null;
        mo8345H(false);
    }

    public void close() {
        mo8379e(true);
    }

    /* renamed from: d */
    public void mo8378d() {
        this.f8537q = true;
        clear();
        clearHeader();
        this.f8537q = false;
        this.f8538r = false;
        mo8345H(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8379e(boolean z) {
        if (!this.f8540t) {
            this.f8540t = true;
            Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C2250g gVar = (C2250g) next.get();
                if (gVar == null) {
                    this.f8542v.remove(next);
                } else {
                    gVar.mo8005d(this, z);
                }
            }
            this.f8540t = false;
        }
    }

    /* renamed from: f */
    public boolean mo8380f(C2247e eVar) {
        boolean z = false;
        if (!this.f8542v.isEmpty() && this.f8543w == eVar) {
            mo8362a0();
            Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C2250g gVar = (C2250g) next.get();
                if (gVar == null) {
                    this.f8542v.remove(next);
                } else {
                    z = gVar.mo8009i(this, eVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo8360Z();
            if (z) {
                this.f8543w = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C2247e eVar = this.f8526f.get(i2);
            if (eVar.getItemId() == i) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (findItem = eVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo8382g(C2242c cVar, MenuItem menuItem) {
        C2244b bVar = this.f8525e;
        return bVar != null && bVar.mo6474c(cVar, menuItem);
    }

    public MenuItem getItem(int i) {
        return this.f8526f.get(i);
    }

    public boolean hasVisibleItems() {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f8526f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo8390o(i, keyEvent) != null;
    }

    /* renamed from: j */
    public boolean mo8386j(C2247e eVar) {
        boolean z = false;
        if (this.f8542v.isEmpty()) {
            return false;
        }
        mo8362a0();
        Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C2250g gVar = (C2250g) next.get();
            if (gVar == null) {
                this.f8542v.remove(next);
            } else {
                z = gVar.mo8007g(this, eVar);
                if (z) {
                    break;
                }
            }
        }
        mo8360Z();
        if (z) {
            this.f8543w = eVar;
        }
        return z;
    }

    /* renamed from: k */
    public int mo8387k(int i) {
        return mo8388l(i, 0);
    }

    /* renamed from: l */
    public int mo8388l(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f8526f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: n */
    public int mo8389n(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f8526f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2247e mo8390o(int i, KeyEvent keyEvent) {
        ArrayList<C2247e> arrayList = this.f8541u;
        arrayList.clear();
        mo8391p(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        boolean D = mo8341D();
        Iterator<C2247e> it = arrayList.iterator();
        while (it.hasNext()) {
            C2247e next = it.next();
            char alphabeticShortcut = D ? next.getAlphabeticShortcut() : next.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (D && alphabeticShortcut == 8 && i == 67))) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8391p(List<C2247e> list, int i, KeyEvent keyEvent) {
        boolean D = mo8341D();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            Iterator<C2247e> it = this.f8526f.iterator();
            while (it.hasNext()) {
                C2247e next = it.next();
                if (next.hasSubMenu()) {
                    ((C2242c) next.getSubMenu()).mo8391p(list, i, keyEvent);
                }
                char alphabeticShortcut = D ? next.getAlphabeticShortcut() : next.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (D && alphabeticShortcut == 8 && i == 67)) && next.isEnabled()) {
                        list.add(next);
                    }
                }
            }
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo8346I(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C2247e o = mo8390o(i, keyEvent);
        boolean I = o != null ? mo8346I(o, i2) : false;
        if ((i2 & 2) != 0) {
            mo8379e(true);
        }
        return I;
    }

    /* renamed from: q */
    public void mo8394q() {
        if (this.f8531k) {
            Iterator<WeakReference<C2250g>> it = this.f8542v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C2250g gVar = (C2250g) next.get();
                if (gVar == null) {
                    this.f8542v.remove(next);
                } else {
                    z |= gVar.mo8004c();
                }
            }
            this.f8529i.clear();
            this.f8530j.clear();
            if (z) {
                Iterator<C2247e> it2 = mo8340C().iterator();
                while (it2.hasNext()) {
                    C2247e next2 = it2.next();
                    (next2.mo8449l() ? this.f8529i : this.f8530j).add(next2);
                }
            } else {
                this.f8530j.addAll(mo8340C());
            }
            this.f8531k = false;
        }
    }

    /* renamed from: r */
    public C2244b mo8395r() {
        return this.f8525e;
    }

    public void removeGroup(int i) {
        int k = mo8387k(i);
        if (k >= 0) {
            int size = this.f8526f.size() - k;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f8526f.get(k).getGroupId() != i) {
                    mo8345H(true);
                } else {
                    m9418L(k, false);
                    i2 = i3;
                }
            }
            mo8345H(true);
        }
    }

    public void removeItem(int i) {
        m9418L(mo8389n(i), true);
    }

    /* renamed from: s */
    public Context mo8398s() {
        return this.f8521a;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        Iterator<C2247e> it = this.f8526f.iterator();
        while (it.hasNext()) {
            C2247e next = it.next();
            if (next.getGroupId() == i) {
                next.mo8455r(z2);
                next.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        Iterator<C2247e> it = this.f8526f.iterator();
        while (it.hasNext()) {
            C2247e next = it.next();
            if (next.getGroupId() == i) {
                next.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        Iterator<C2247e> it = this.f8526f.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C2247e next = it.next();
            if (next.getGroupId() == i && next.mo8484y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo8345H(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f8523c = z;
        mo8345H(false);
    }

    public int size() {
        return this.f8526f.size();
    }

    /* renamed from: t */
    public C2247e mo8404t() {
        return this.f8543w;
    }

    /* renamed from: u */
    public Drawable mo8405u() {
        return this.f8535o;
    }

    /* renamed from: v */
    public CharSequence mo8406v() {
        return this.f8534n;
    }

    /* renamed from: w */
    public View mo8407w() {
        return this.f8536p;
    }

    /* renamed from: x */
    public ArrayList<C2247e> mo8408x() {
        mo8394q();
        return this.f8530j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo8409y() {
        return this.f8539s;
    }
}
