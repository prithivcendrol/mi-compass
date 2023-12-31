package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p114t.C2664a;

/* renamed from: androidx.core.content.res.c */
public final class C0520c {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2508a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2168a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m2169b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0520c.m2168a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m2169b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2171d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m2170c() {
        ThreadLocal<TypedValue> threadLocal = f2508a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r9.hasValue(r12) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r9.hasValue(r12) != false) goto L_0x008b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2171d(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x0013:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00e0
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0022
            r11 = 3
            if (r9 == r11) goto L_0x00e0
        L_0x0022:
            r11 = 2
            if (r9 != r11) goto L_0x00db
            if (r10 > r3) goto L_0x00db
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0035
            goto L_0x00db
        L_0x0035:
            int[] r9 = p104r.C2589c.f10180b
            android.content.res.TypedArray r9 = m2174g(r0, r2, r1, r9)
            int r10 = p104r.C2589c.f10181c
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x005c
            boolean r11 = m2172e(r0, r12)
            if (r11 != 0) goto L_0x005c
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x005a }
            android.content.res.ColorStateList r10 = m2168a(r0, r10, r2)     // Catch:{ Exception -> 0x005a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005a }
            goto L_0x0060
        L_0x005a:
            int r10 = p104r.C2589c.f10181c
        L_0x005c:
            int r10 = r9.getColor(r10, r13)
        L_0x0060:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = p104r.C2589c.f10182d
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x006f
        L_0x006a:
            float r11 = r9.getFloat(r12, r11)
            goto L_0x0078
        L_0x006f:
            int r12 = p104r.C2589c.f10184f
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0078
            goto L_0x006a
        L_0x0078:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r13) goto L_0x0089
            int r12 = p104r.C2589c.f10183e
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            int r12 = p104r.C2589c.f10185g
        L_0x008b:
            float r12 = r9.getFloat(r12, r14)
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x009a:
            if (r14 >= r9) goto L_0x00c6
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto L_0x00c0
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto L_0x00c0
            int r7 = p104r.C2587a.f10129a
            if (r4 == r7) goto L_0x00c0
            int r7 = p104r.C2587a.f10130b
            if (r4 == r7) goto L_0x00c0
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            int r4 = -r4
        L_0x00bd:
            r13[r15] = r4
            r15 = r7
        L_0x00c0:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto L_0x009a
        L_0x00c6:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = m2173f(r10, r11, r12)
            int[] r5 = androidx.core.content.res.C0527e.m2195a(r5, r8, r4)
            java.lang.Object[] r0 = androidx.core.content.res.C0527e.m2196b(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00db:
            r4 = 1
            r0 = r17
            goto L_0x0013
        L_0x00e0:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0520c.m2171d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m2172e(Resources resources, int i) {
        TypedValue c = m2170c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: f */
    private static int m2173f(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int a = C2664a.m11155a((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, 255);
        if (z) {
            C0518a c = C0518a.m2145c(i);
            i = C0518a.m2149m(c.mo2572j(), c.mo2571i(), f2);
        }
        return (i & 16777215) | (a << 24);
    }

    /* renamed from: g */
    private static TypedArray m2174g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
