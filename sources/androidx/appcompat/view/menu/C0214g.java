package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0510a;
import androidx.core.view.C0783v1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p109s.C2635a;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0214g implements C2635a {

    /* renamed from: A */
    private static final int[] f752A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f753a;

    /* renamed from: b */
    private final Resources f754b;

    /* renamed from: c */
    private boolean f755c;

    /* renamed from: d */
    private boolean f756d;

    /* renamed from: e */
    private C0215a f757e;

    /* renamed from: f */
    private ArrayList<C0218i> f758f;

    /* renamed from: g */
    private ArrayList<C0218i> f759g;

    /* renamed from: h */
    private boolean f760h;

    /* renamed from: i */
    private ArrayList<C0218i> f761i;

    /* renamed from: j */
    private ArrayList<C0218i> f762j;

    /* renamed from: k */
    private boolean f763k;

    /* renamed from: l */
    private int f764l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f765m;

    /* renamed from: n */
    CharSequence f766n;

    /* renamed from: o */
    Drawable f767o;

    /* renamed from: p */
    View f768p;

    /* renamed from: q */
    private boolean f769q = false;

    /* renamed from: r */
    private boolean f770r = false;

    /* renamed from: s */
    private boolean f771s = false;

    /* renamed from: t */
    private boolean f772t = false;

    /* renamed from: u */
    private boolean f773u = false;

    /* renamed from: v */
    private ArrayList<C0218i> f774v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0230m>> f775w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0218i f776x;

    /* renamed from: y */
    private boolean f777y = false;

    /* renamed from: z */
    private boolean f778z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0215a {
        /* renamed from: a */
        boolean mo494a(C0214g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo495b(C0214g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0216b {
        /* renamed from: a */
        boolean mo723a(C0218i iVar);
    }

    public C0214g(Context context) {
        this.f753a = context;
        this.f754b = context.getResources();
        this.f758f = new ArrayList<>();
        this.f759g = new ArrayList<>();
        this.f760h = true;
        this.f761i = new ArrayList<>();
        this.f762j = new ArrayList<>();
        this.f763k = true;
        m875b0(true);
    }

    /* renamed from: B */
    private static int m872B(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f752A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m873N(int i, boolean z) {
        if (i >= 0 && i < this.f758f.size()) {
            this.f758f.remove(i);
            if (z) {
                mo869K(true);
            }
        }
    }

    /* renamed from: W */
    private void m874W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = mo861C();
        if (view != null) {
            this.f768p = view;
            this.f766n = null;
            this.f767o = null;
        } else {
            if (i > 0) {
                this.f766n = C.getText(i);
            } else if (charSequence != null) {
                this.f766n = charSequence;
            }
            if (i2 > 0) {
                this.f767o = C0510a.m2124e(mo928u(), i2);
            } else if (drawable != null) {
                this.f767o = drawable;
            }
            this.f768p = null;
        }
        mo869K(false);
    }

    /* renamed from: b0 */
    private void m875b0(boolean z) {
        boolean z2 = true;
        if (!z || this.f754b.getConfiguration().keyboard == 1 || !C0783v1.m3109e(ViewConfiguration.get(this.f753a), this.f753a)) {
            z2 = false;
        }
        this.f756d = z2;
    }

    /* renamed from: g */
    private C0218i m876g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0218i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m877i(boolean z) {
        if (!this.f775w.isEmpty()) {
            mo901d0();
            Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0230m mVar = (C0230m) next.get();
                if (mVar == null) {
                    this.f775w.remove(next);
                } else {
                    mVar.mo798b(z);
                }
            }
            mo896c0();
        }
    }

    /* renamed from: j */
    private boolean m878j(C0239r rVar, C0230m mVar) {
        boolean z = false;
        if (this.f775w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo800e(rVar);
        }
        Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0230m mVar2 = (C0230m) next.get();
            if (mVar2 == null) {
                this.f775w.remove(next);
            } else if (!z) {
                z = mVar2.mo800e(rVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m879n(ArrayList<C0218i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo942f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo860A() {
        return this.f772t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Resources mo861C() {
        return this.f754b;
    }

    /* renamed from: D */
    public C0214g mo862D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0218i> mo863E() {
        if (!this.f760h) {
            return this.f759g;
        }
        this.f759g.clear();
        int size = this.f758f.size();
        for (int i = 0; i < size; i++) {
            C0218i iVar = this.f758f.get(i);
            if (iVar.isVisible()) {
                this.f759g.add(iVar);
            }
        }
        this.f760h = false;
        this.f763k = true;
        return this.f759g;
    }

    /* renamed from: F */
    public boolean mo864F() {
        return this.f777y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo865G() {
        return this.f755c;
    }

    /* renamed from: H */
    public boolean mo866H() {
        return this.f756d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo867I(C0218i iVar) {
        this.f763k = true;
        mo869K(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo868J(C0218i iVar) {
        this.f760h = true;
        mo869K(true);
    }

    /* renamed from: K */
    public void mo869K(boolean z) {
        if (!this.f769q) {
            if (z) {
                this.f760h = true;
                this.f763k = true;
            }
            m877i(z);
            return;
        }
        this.f770r = true;
        if (z) {
            this.f771s = true;
        }
    }

    /* renamed from: L */
    public boolean mo870L(MenuItem menuItem, int i) {
        return mo871M(menuItem, (C0230m) null, i);
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
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo871M(android.view.MenuItem r7, androidx.appcompat.view.menu.C0230m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0218i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo964k()
            androidx.core.view.b r2 = r7.mo739b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo1053a()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.mo963j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo902e(r3)
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
            r6.mo902e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.mo928u()
            r9.<init>(r0, r6, r7)
            r7.mo994x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.C0239r) r7
            if (r4 == 0) goto L_0x0063
            r2.mo1056f(r7)
        L_0x0063:
            boolean r7 = r6.m878j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0214g.mo871M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: O */
    public void mo872O(C0230m mVar) {
        Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0230m mVar2 = (C0230m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f775w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void mo873P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo927t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0239r) item.getSubMenu()).mo873P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Q */
    public void mo874Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0239r) item.getSubMenu()).mo874Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo927t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo875R(C0215a aVar) {
        this.f757e = aVar;
    }

    /* renamed from: S */
    public C0214g mo876S(int i) {
        this.f764l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo877T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f758f.size();
        mo901d0();
        for (int i = 0; i < size; i++) {
            C0218i iVar = this.f758f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo966m() && iVar.isCheckable()) {
                iVar.mo972s(iVar == menuItem);
            }
        }
        mo896c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C0214g mo878U(int i) {
        m874W(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C0214g mo879V(Drawable drawable) {
        m874W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C0214g mo880X(int i) {
        m874W(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0214g mo881Y(CharSequence charSequence) {
        m874W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0214g mo882Z(View view) {
        m874W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo883a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m872B(i3);
        C0218i g = m876g(i, i2, i3, B, charSequence, this.f764l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f765m;
        if (contextMenuInfo != null) {
            g.mo992v(contextMenuInfo);
        }
        ArrayList<C0218i> arrayList = this.f758f;
        arrayList.add(m879n(arrayList, B), g);
        mo869K(true);
        return g;
    }

    /* renamed from: a0 */
    public void mo884a0(boolean z) {
        this.f778z = z;
    }

    public MenuItem add(int i) {
        return mo883a(0, 0, 0, this.f754b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo883a(i, i2, i3, this.f754b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo883a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo883a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f753a.getPackageManager();
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
        return addSubMenu(0, 0, 0, (CharSequence) this.f754b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f754b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0218i iVar = (C0218i) mo883a(i, i2, i3, charSequence);
        C0239r rVar = new C0239r(this.f753a, this, iVar);
        iVar.mo994x(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo894b(C0230m mVar) {
        mo895c(mVar, this.f753a);
    }

    /* renamed from: c */
    public void mo895c(C0230m mVar, Context context) {
        this.f775w.add(new WeakReference(mVar));
        mVar.mo799d(context, this);
        this.f763k = true;
    }

    /* renamed from: c0 */
    public void mo896c0() {
        this.f769q = false;
        if (this.f770r) {
            this.f770r = false;
            mo869K(this.f771s);
        }
    }

    public void clear() {
        C0218i iVar = this.f776x;
        if (iVar != null) {
            mo903f(iVar);
        }
        this.f758f.clear();
        mo869K(true);
    }

    public void clearHeader() {
        this.f767o = null;
        this.f766n = null;
        this.f768p = null;
        mo869K(false);
    }

    public void close() {
        mo902e(true);
    }

    /* renamed from: d */
    public void mo900d() {
        C0215a aVar = this.f757e;
        if (aVar != null) {
            aVar.mo495b(this);
        }
    }

    /* renamed from: d0 */
    public void mo901d0() {
        if (!this.f769q) {
            this.f769q = true;
            this.f770r = false;
            this.f771s = false;
        }
    }

    /* renamed from: e */
    public final void mo902e(boolean z) {
        if (!this.f773u) {
            this.f773u = true;
            Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0230m mVar = (C0230m) next.get();
                if (mVar == null) {
                    this.f775w.remove(next);
                } else {
                    mVar.mo797a(this, z);
                }
            }
            this.f773u = false;
        }
    }

    /* renamed from: f */
    public boolean mo903f(C0218i iVar) {
        boolean z = false;
        if (!this.f775w.isEmpty() && this.f776x == iVar) {
            mo901d0();
            Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0230m mVar = (C0230m) next.get();
                if (mVar == null) {
                    this.f775w.remove(next);
                } else {
                    z = mVar.mo801f(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo896c0();
            if (z) {
                this.f776x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0218i iVar = this.f758f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f758f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo906h(C0214g gVar, MenuItem menuItem) {
        C0215a aVar = this.f757e;
        return aVar != null && aVar.mo494a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f778z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f758f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo913p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo909k(C0218i iVar) {
        boolean z = false;
        if (this.f775w.isEmpty()) {
            return false;
        }
        mo901d0();
        Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0230m mVar = (C0230m) next.get();
            if (mVar == null) {
                this.f775w.remove(next);
            } else {
                z = mVar.mo802g(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo896c0();
        if (z) {
            this.f776x = iVar;
        }
        return z;
    }

    /* renamed from: l */
    public int mo910l(int i) {
        return mo911m(i, 0);
    }

    /* renamed from: m */
    public int mo911m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f758f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int mo912o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f758f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0218i mo913p(int i, KeyEvent keyEvent) {
        ArrayList<C0218i> arrayList = this.f774v;
        arrayList.clear();
        mo916q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = mo865G();
        for (int i2 = 0; i2 < size; i2++) {
            C0218i iVar = arrayList.get(i2);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo870L(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0218i p = mo913p(i, keyEvent);
        boolean L = p != null ? mo870L(p, i2) : false;
        if ((i2 & 2) != 0) {
            mo902e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo916q(List<C0218i> list, int i, KeyEvent keyEvent) {
        boolean G = mo865G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f758f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0218i iVar = this.f758f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0214g) iVar.getSubMenu()).mo916q(list, i, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo917r() {
        ArrayList<C0218i> E = mo863E();
        if (this.f763k) {
            Iterator<WeakReference<C0230m>> it = this.f775w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0230m mVar = (C0230m) next.get();
                if (mVar == null) {
                    this.f775w.remove(next);
                } else {
                    z |= mVar.mo818c();
                }
            }
            if (z) {
                this.f761i.clear();
                this.f762j.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    C0218i iVar = E.get(i);
                    (iVar.mo965l() ? this.f761i : this.f762j).add(iVar);
                }
            } else {
                this.f761i.clear();
                this.f762j.clear();
                this.f762j.addAll(mo863E());
            }
            this.f763k = false;
        }
    }

    public void removeGroup(int i) {
        int l = mo910l(i);
        if (l >= 0) {
            int size = this.f758f.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f758f.get(l).getGroupId() != i) {
                    mo869K(true);
                } else {
                    m873N(l, false);
                    i2 = i3;
                }
            }
            mo869K(true);
        }
    }

    public void removeItem(int i) {
        m873N(mo912o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0218i> mo920s() {
        mo917r();
        return this.f761i;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f758f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0218i iVar = this.f758f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo989t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f777y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f758f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0218i iVar = this.f758f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f758f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0218i iVar = this.f758f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo995y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo869K(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f755c = z;
        mo869K(false);
    }

    public int size() {
        return this.f758f.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo927t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context mo928u() {
        return this.f753a;
    }

    /* renamed from: v */
    public C0218i mo929v() {
        return this.f776x;
    }

    /* renamed from: w */
    public Drawable mo930w() {
        return this.f767o;
    }

    /* renamed from: x */
    public CharSequence mo931x() {
        return this.f766n;
    }

    /* renamed from: y */
    public View mo932y() {
        return this.f768p;
    }

    /* renamed from: z */
    public ArrayList<C0218i> mo933z() {
        mo917r();
        return this.f762j;
    }
}
