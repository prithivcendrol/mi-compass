package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0528f;

/* renamed from: androidx.appcompat.widget.g1 */
public class C0326g1 {

    /* renamed from: a */
    private final Context f1288a;

    /* renamed from: b */
    private final TypedArray f1289b;

    /* renamed from: c */
    private TypedValue f1290c;

    private C0326g1(Context context, TypedArray typedArray) {
        this.f1288a = context;
        this.f1289b = typedArray;
    }

    /* renamed from: s */
    public static C0326g1 m1453s(Context context, int i, int[] iArr) {
        return new C0326g1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: t */
    public static C0326g1 m1454t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0326g1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: u */
    public static C0326g1 m1455u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0326g1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1864a(int i, boolean z) {
        return this.f1289b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1865b(int i, int i2) {
        return this.f1289b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p027e.C1512a.m6566a(r2.f1288a, (r0 = r2.f1289b.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo1866c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1289b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1289b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1288a
            android.content.res.ColorStateList r0 = p027e.C1512a.m6566a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1289b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0326g1.mo1866c(int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public int mo1867d(int i, int i2) {
        return this.f1289b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int mo1868e(int i, int i2) {
        return this.f1289b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1289b.getResourceId(r3, 0);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo1869f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1289b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1289b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1288a
            android.graphics.drawable.Drawable r3 = p027e.C1512a.m6567b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1289b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0326g1.mo1869f(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public Drawable mo1870g(int i) {
        int resourceId;
        if (!this.f1289b.hasValue(i) || (resourceId = this.f1289b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0327h.m1476b().mo1884d(this.f1288a, resourceId, true);
    }

    /* renamed from: h */
    public float mo1871h(int i, float f) {
        return this.f1289b.getFloat(i, f);
    }

    /* renamed from: i */
    public Typeface mo1872i(int i, int i2, C0528f.C0533e eVar) {
        int resourceId = this.f1289b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1290c == null) {
            this.f1290c = new TypedValue();
        }
        return C0528f.m2203f(this.f1288a, resourceId, this.f1290c, i2, eVar);
    }

    /* renamed from: j */
    public int mo1873j(int i, int i2) {
        return this.f1289b.getInt(i, i2);
    }

    /* renamed from: k */
    public int mo1874k(int i, int i2) {
        return this.f1289b.getInteger(i, i2);
    }

    /* renamed from: l */
    public int mo1875l(int i, int i2) {
        return this.f1289b.getLayoutDimension(i, i2);
    }

    /* renamed from: m */
    public int mo1876m(int i, int i2) {
        return this.f1289b.getResourceId(i, i2);
    }

    /* renamed from: n */
    public String mo1877n(int i) {
        return this.f1289b.getString(i);
    }

    /* renamed from: o */
    public CharSequence mo1878o(int i) {
        return this.f1289b.getText(i);
    }

    /* renamed from: p */
    public CharSequence[] mo1879p(int i) {
        return this.f1289b.getTextArray(i);
    }

    /* renamed from: q */
    public TypedArray mo1880q() {
        return this.f1289b;
    }

    /* renamed from: r */
    public boolean mo1881r(int i) {
        return this.f1289b.hasValue(i);
    }

    /* renamed from: v */
    public void mo1882v() {
        this.f1289b.recycle();
    }
}
