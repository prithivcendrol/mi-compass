package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p063k.C1761a;
import p070l0.C1870a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1265a {

    /* renamed from: a */
    protected final C1761a<String, Method> f4381a;

    /* renamed from: b */
    protected final C1761a<String, Method> f4382b;

    /* renamed from: c */
    protected final C1761a<String, Class> f4383c;

    public C1265a(C1761a<String, Method> aVar, C1761a<String, Method> aVar2, C1761a<String, Class> aVar3) {
        this.f4381a = aVar;
        this.f4382b = aVar2;
        this.f4383c = aVar3;
    }

    /* renamed from: N */
    private void m5815N(C1870a aVar) {
        try {
            mo5009I(m5816c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m5816c(Class<? extends C1870a> cls) {
        Class cls2 = this.f4383c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4383c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m5817d(String str) {
        Class<C1265a> cls = C1265a.class;
        Method method = this.f4381a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4381a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m5818e(Class cls) {
        Method method = this.f4382b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m5816c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1265a.class});
        this.f4382b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo5001A(byte[] bArr);

    /* renamed from: B */
    public void mo5002B(byte[] bArr, int i) {
        mo5033w(i);
        mo5001A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo5003C(CharSequence charSequence);

    /* renamed from: D */
    public void mo5004D(CharSequence charSequence, int i) {
        mo5033w(i);
        mo5003C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo5005E(int i);

    /* renamed from: F */
    public void mo5006F(int i, int i2) {
        mo5033w(i2);
        mo5005E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo5007G(Parcelable parcelable);

    /* renamed from: H */
    public void mo5008H(Parcelable parcelable, int i) {
        mo5033w(i);
        mo5007G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo5009I(String str);

    /* renamed from: J */
    public void mo5010J(String str, int i) {
        mo5033w(i);
        mo5009I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C1870a> void mo5011K(T t, C1265a aVar) {
        try {
            m5818e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo5012L(C1870a aVar) {
        if (aVar == null) {
            mo5009I((String) null);
            return;
        }
        m5815N(aVar);
        C1265a b = mo5015b();
        mo5011K(aVar, b);
        b.mo5014a();
    }

    /* renamed from: M */
    public void mo5013M(C1870a aVar, int i) {
        mo5033w(i);
        mo5012L(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5014a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1265a mo5015b();

    /* renamed from: f */
    public boolean mo5016f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo5017g();

    /* renamed from: h */
    public boolean mo5018h(boolean z, int i) {
        return !mo5023m(i) ? z : mo5017g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo5019i();

    /* renamed from: j */
    public byte[] mo5020j(byte[] bArr, int i) {
        return !mo5023m(i) ? bArr : mo5019i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo5021k();

    /* renamed from: l */
    public CharSequence mo5022l(CharSequence charSequence, int i) {
        return !mo5023m(i) ? charSequence : mo5021k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo5023m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C1870a> T mo5024n(String str, C1265a aVar) {
        try {
            return (C1870a) m5817d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo5025o();

    /* renamed from: p */
    public int mo5026p(int i, int i2) {
        return !mo5023m(i2) ? i : mo5025o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo5027q();

    /* renamed from: r */
    public <T extends Parcelable> T mo5028r(T t, int i) {
        return !mo5023m(i) ? t : mo5027q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo5029s();

    /* renamed from: t */
    public String mo5030t(String str, int i) {
        return !mo5023m(i) ? str : mo5029s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C1870a> T mo5031u() {
        String s = mo5029s();
        if (s == null) {
            return null;
        }
        return mo5024n(s, mo5015b());
    }

    /* renamed from: v */
    public <T extends C1870a> T mo5032v(T t, int i) {
        return !mo5023m(i) ? t : mo5031u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo5033w(int i);

    /* renamed from: x */
    public void mo5034x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo5035y(boolean z);

    /* renamed from: z */
    public void mo5036z(boolean z, int i) {
        mo5033w(i);
        mo5035y(z);
    }
}
