package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0218i;
import androidx.appcompat.view.menu.C0220j;
import androidx.appcompat.widget.C0326g1;
import androidx.appcompat.widget.C0336j0;
import androidx.core.view.C0657b;
import androidx.core.view.C0789x;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p021d.C1456j;
import p109s.C2635a;

/* renamed from: androidx.appcompat.view.g */
public class C0190g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f582e;

    /* renamed from: f */
    static final Class<?>[] f583f;

    /* renamed from: a */
    final Object[] f584a;

    /* renamed from: b */
    final Object[] f585b;

    /* renamed from: c */
    Context f586c;

    /* renamed from: d */
    private Object f587d;

    /* renamed from: androidx.appcompat.view.g$a */
    private static class C0191a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private static final Class<?>[] f588f = {MenuItem.class};

        /* renamed from: d */
        private Object f589d;

        /* renamed from: e */
        private Method f590e;

        public C0191a(Object obj, String str) {
            this.f589d = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f590e = cls.getMethod(str, f588f);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f590e.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f590e.invoke(this.f589d, new Object[]{menuItem})).booleanValue();
                }
                this.f590e.invoke(this.f589d, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.g$b */
    private class C0192b {

        /* renamed from: A */
        C0657b f591A;

        /* renamed from: B */
        private CharSequence f592B;

        /* renamed from: C */
        private CharSequence f593C;

        /* renamed from: D */
        private ColorStateList f594D = null;

        /* renamed from: E */
        private PorterDuff.Mode f595E = null;

        /* renamed from: a */
        private Menu f597a;

        /* renamed from: b */
        private int f598b;

        /* renamed from: c */
        private int f599c;

        /* renamed from: d */
        private int f600d;

        /* renamed from: e */
        private int f601e;

        /* renamed from: f */
        private boolean f602f;

        /* renamed from: g */
        private boolean f603g;

        /* renamed from: h */
        private boolean f604h;

        /* renamed from: i */
        private int f605i;

        /* renamed from: j */
        private int f606j;

        /* renamed from: k */
        private CharSequence f607k;

        /* renamed from: l */
        private CharSequence f608l;

        /* renamed from: m */
        private int f609m;

        /* renamed from: n */
        private char f610n;

        /* renamed from: o */
        private int f611o;

        /* renamed from: p */
        private char f612p;

        /* renamed from: q */
        private int f613q;

        /* renamed from: r */
        private int f614r;

        /* renamed from: s */
        private boolean f615s;

        /* renamed from: t */
        private boolean f616t;

        /* renamed from: u */
        private boolean f617u;

        /* renamed from: v */
        private int f618v;

        /* renamed from: w */
        private int f619w;

        /* renamed from: x */
        private String f620x;

        /* renamed from: y */
        private String f621y;

        /* renamed from: z */
        private String f622z;

        public C0192b(Menu menu) {
            this.f597a = menu;
            mo675h();
        }

        /* renamed from: c */
        private char m757c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m758e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0190g.this.f586c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m759i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f615s).setVisible(this.f616t).setEnabled(this.f617u).setCheckable(this.f614r >= 1).setTitleCondensed(this.f608l).setIcon(this.f609m);
            int i = this.f618v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f622z != null) {
                if (!C0190g.this.f586c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0191a(C0190g.this.mo667b(), this.f622z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f614r >= 2) {
                if (menuItem instanceof C0218i) {
                    ((C0218i) menuItem).mo989t(true);
                } else if (menuItem instanceof C0220j) {
                    ((C0220j) menuItem).mo1019h(true);
                }
            }
            String str = this.f620x;
            if (str != null) {
                menuItem.setActionView((View) m758e(str, C0190g.f582e, C0190g.this.f584a));
                z = true;
            }
            int i2 = this.f619w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0657b bVar = this.f591A;
            if (bVar != null) {
                C0789x.m3117a(menuItem, bVar);
            }
            C0789x.m3119c(menuItem, this.f592B);
            C0789x.m3123g(menuItem, this.f593C);
            C0789x.m3118b(menuItem, this.f610n, this.f611o);
            C0789x.m3122f(menuItem, this.f612p, this.f613q);
            PorterDuff.Mode mode = this.f595E;
            if (mode != null) {
                C0789x.m3121e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f594D;
            if (colorStateList != null) {
                C0789x.m3120d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo670a() {
            this.f604h = true;
            m759i(this.f597a.add(this.f598b, this.f605i, this.f606j, this.f607k));
        }

        /* renamed from: b */
        public SubMenu mo671b() {
            this.f604h = true;
            SubMenu addSubMenu = this.f597a.addSubMenu(this.f598b, this.f605i, this.f606j, this.f607k);
            m759i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo672d() {
            return this.f604h;
        }

        /* renamed from: f */
        public void mo673f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0190g.this.f586c.obtainStyledAttributes(attributeSet, C1456j.f6044o1);
            this.f598b = obtainStyledAttributes.getResourceId(C1456j.f6054q1, 0);
            this.f599c = obtainStyledAttributes.getInt(C1456j.f6064s1, 0);
            this.f600d = obtainStyledAttributes.getInt(C1456j.f6069t1, 0);
            this.f601e = obtainStyledAttributes.getInt(C1456j.f6074u1, 0);
            this.f602f = obtainStyledAttributes.getBoolean(C1456j.f6059r1, true);
            this.f603g = obtainStyledAttributes.getBoolean(C1456j.f6049p1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo674g(AttributeSet attributeSet) {
            C0326g1 t = C0326g1.m1454t(C0190g.this.f586c, attributeSet, C1456j.f6079v1);
            this.f605i = t.mo1876m(C1456j.f6094y1, 0);
            this.f606j = (t.mo1873j(C1456j.f5857B1, this.f599c) & -65536) | (t.mo1873j(C1456j.f5862C1, this.f600d) & 65535);
            this.f607k = t.mo1878o(C1456j.f5867D1);
            this.f608l = t.mo1878o(C1456j.f5872E1);
            this.f609m = t.mo1876m(C1456j.f6084w1, 0);
            this.f610n = m757c(t.mo1877n(C1456j.f5877F1));
            this.f611o = t.mo1873j(C1456j.f5912M1, 4096);
            this.f612p = m757c(t.mo1877n(C1456j.f5882G1));
            this.f613q = t.mo1873j(C1456j.f5932Q1, 4096);
            int i = C1456j.f5887H1;
            this.f614r = t.mo1881r(i) ? t.mo1864a(i, false) : this.f601e;
            this.f615s = t.mo1864a(C1456j.f6099z1, false);
            this.f616t = t.mo1864a(C1456j.f5852A1, this.f602f);
            this.f617u = t.mo1864a(C1456j.f6089x1, this.f603g);
            this.f618v = t.mo1873j(C1456j.f5937R1, -1);
            this.f622z = t.mo1877n(C1456j.f5892I1);
            this.f619w = t.mo1876m(C1456j.f5897J1, 0);
            this.f620x = t.mo1877n(C1456j.f5907L1);
            String n = t.mo1877n(C1456j.f5902K1);
            this.f621y = n;
            boolean z = n != null;
            if (z && this.f619w == 0 && this.f620x == null) {
                this.f591A = (C0657b) m758e(n, C0190g.f583f, C0190g.this.f585b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f591A = null;
            }
            this.f592B = t.mo1878o(C1456j.f5917N1);
            this.f593C = t.mo1878o(C1456j.f5942S1);
            int i2 = C1456j.f5927P1;
            if (t.mo1881r(i2)) {
                this.f595E = C0336j0.m1542e(t.mo1873j(i2, -1), this.f595E);
            } else {
                this.f595E = null;
            }
            int i3 = C1456j.f5922O1;
            if (t.mo1881r(i3)) {
                this.f594D = t.mo1866c(i3);
            } else {
                this.f594D = null;
            }
            t.mo1882v();
            this.f604h = false;
        }

        /* renamed from: h */
        public void mo675h() {
            this.f598b = 0;
            this.f599c = 0;
            this.f600d = 0;
            this.f601e = 0;
            this.f602f = true;
            this.f603g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f582e = r0
            f583f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0190g.<clinit>():void");
    }

    public C0190g(Context context) {
        super(context);
        this.f586c = context;
        Object[] objArr = {context};
        this.f584a = objArr;
        this.f585b = objArr;
    }

    /* renamed from: a */
    private Object m754a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m754a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m755c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0192b bVar = new C0192b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo675h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo672d()) {
                                C0657b bVar2 = bVar.f591A;
                                if (bVar2 == null || !bVar2.mo1053a()) {
                                    bVar.mo670a();
                                } else {
                                    bVar.mo671b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo673f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo674g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m755c(xmlPullParser, attributeSet, bVar.mo671b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo667b() {
        if (this.f587d == null) {
            this.f587d = m754a(this.f586c);
        }
        return this.f587d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C2635a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f586c.getResources().getLayout(i);
            m755c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
