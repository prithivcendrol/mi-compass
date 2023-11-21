package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0727l0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.d0 */
class C0310d0 {

    /* renamed from: l */
    private static final RectF f1244l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1245m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1246n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1247a = 0;

    /* renamed from: b */
    private boolean f1248b = false;

    /* renamed from: c */
    private float f1249c = -1.0f;

    /* renamed from: d */
    private float f1250d = -1.0f;

    /* renamed from: e */
    private float f1251e = -1.0f;

    /* renamed from: f */
    private int[] f1252f = new int[0];

    /* renamed from: g */
    private boolean f1253g = false;

    /* renamed from: h */
    private TextPaint f1254h;

    /* renamed from: i */
    private final TextView f1255i;

    /* renamed from: j */
    private final Context f1256j;

    /* renamed from: k */
    private final C0316f f1257k;

    /* renamed from: androidx.appcompat.widget.d0$a */
    private static final class C0311a {
        /* renamed from: a */
        static StaticLayout m1413a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m1414b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    private static final class C0312b {
        /* renamed from: a */
        static boolean m1415a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$c */
    private static final class C0313c {
        /* renamed from: a */
        static StaticLayout m1416a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0316f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo1816a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$d */
    private static class C0314d extends C0316f {
        C0314d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1816a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0310d0.m1391m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$e */
    private static class C0315e extends C0314d {
        C0315e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1816a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1817b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$f */
    private static class C0316f {
        C0316f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1816a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1817b(TextView textView) {
            return ((Boolean) C0310d0.m1391m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0310d0(TextView textView) {
        this.f1255i = textView;
        this.f1256j = textView.getContext();
        this.f1257k = Build.VERSION.SDK_INT >= 29 ? new C0315e() : new C0314d();
    }

    /* renamed from: b */
    private int[] m1387b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1388c() {
        this.f1247a = 0;
        this.f1250d = -1.0f;
        this.f1251e = -1.0f;
        this.f1249c = -1.0f;
        this.f1252f = new int[0];
        this.f1248b = false;
    }

    /* renamed from: e */
    private int m1389e(RectF rectF) {
        int length = this.f1252f.length;
        if (length != 0) {
            int i = 0;
            int i2 = 1;
            int i3 = length - 1;
            while (true) {
                int i4 = i2;
                int i5 = i;
                i = i4;
                while (i <= i3) {
                    int i6 = (i + i3) / 2;
                    if (m1396x(this.f1252f[i6], rectF)) {
                        i2 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i3 = i5;
                    }
                }
                return this.f1252f[i5];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: k */
    private static Method m1390k(String str) {
        try {
            Method method = f1245m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1245m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: m */
    static <T> T m1391m(Object obj, String str, T t) {
        try {
            return m1390k(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: s */
    private void m1392s(float f) {
        if (f != this.f1255i.getPaint().getTextSize()) {
            this.f1255i.getPaint().setTextSize(f);
            boolean a = C0312b.m1415a(this.f1255i);
            if (this.f1255i.getLayout() != null) {
                this.f1248b = false;
                try {
                    Method k = m1390k("nullLayouts");
                    if (k != null) {
                        k.invoke(this.f1255i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    this.f1255i.requestLayout();
                } else {
                    this.f1255i.forceLayout();
                }
                this.f1255i.invalidate();
            }
        }
    }

    /* renamed from: u */
    private boolean m1393u() {
        if (!m1397y() || this.f1247a != 1) {
            this.f1248b = false;
        } else {
            if (!this.f1253g || this.f1252f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1251e - this.f1250d) / this.f1249c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1250d + (((float) i) * this.f1249c));
                }
                this.f1252f = m1387b(iArr);
            }
            this.f1248b = true;
        }
        return this.f1248b;
    }

    /* renamed from: v */
    private void m1394v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1252f = m1387b(iArr);
            m1395w();
        }
    }

    /* renamed from: w */
    private boolean m1395w() {
        int[] iArr = this.f1252f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1253g = z;
        if (z) {
            this.f1247a = 1;
            this.f1250d = (float) iArr[0];
            this.f1251e = (float) iArr[length - 1];
            this.f1249c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    private boolean m1396x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1255i.getText();
        TransformationMethod transformationMethod = this.f1255i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1255i)) == null)) {
            text = transformation;
        }
        int b = C0311a.m1414b(this.f1255i);
        mo1809l(i);
        StaticLayout d = mo1803d(text, (Layout.Alignment) m1391m(this.f1255i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        return (b == -1 || (d.getLineCount() <= b && d.getLineEnd(d.getLineCount() - 1) == text.length())) && ((float) d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: y */
    private boolean m1397y() {
        return !(this.f1255i instanceof C0331i);
    }

    /* renamed from: z */
    private void m1398z(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1247a = 1;
            this.f1250d = f;
            this.f1251e = f2;
            this.f1249c = f3;
            this.f1253g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1802a() {
        if (mo1810n()) {
            if (this.f1248b) {
                if (this.f1255i.getMeasuredHeight() > 0 && this.f1255i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1257k.mo1817b(this.f1255i) ? 1048576 : (this.f1255i.getMeasuredWidth() - this.f1255i.getTotalPaddingLeft()) - this.f1255i.getTotalPaddingRight();
                    int height = (this.f1255i.getHeight() - this.f1255i.getCompoundPaddingBottom()) - this.f1255i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1244l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float e = (float) m1389e(rectF);
                            if (e != this.f1255i.getTextSize()) {
                                mo1815t(0, e);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1248b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public StaticLayout mo1803d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C0313c.m1416a(charSequence, alignment, i, i2, this.f1255i, this.f1254h, this.f1257k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1804f() {
        return Math.round(this.f1251e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1805g() {
        return Math.round(this.f1250d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo1806h() {
        return Math.round(this.f1249c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] mo1807i() {
        return this.f1252f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo1808j() {
        return this.f1247a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1809l(int i) {
        TextPaint textPaint = this.f1254h;
        if (textPaint == null) {
            this.f1254h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1254h.set(this.f1255i.getPaint());
        this.f1254h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo1810n() {
        return m1397y() && this.f1247a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1811o(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1256j;
        int[] iArr = C1456j.f6003g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1255i;
        C0727l0.m2873W(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C1456j.f6028l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1247a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C1456j.f6023k0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C1456j.f6013i0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C1456j.f6008h0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C1456j.f6018j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1394v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1397y()) {
            this.f1247a = 0;
        } else if (this.f1247a == 1) {
            if (!this.f1253g) {
                DisplayMetrics displayMetrics = this.f1256j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1398z(dimension2, dimension3, dimension);
            }
            m1393u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1812p(int i, int i2, int i3, int i4) {
        if (m1397y()) {
            DisplayMetrics displayMetrics = this.f1256j.getResources().getDisplayMetrics();
            m1398z(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1393u()) {
                mo1802a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1813q(int[] iArr, int i) {
        if (m1397y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1256j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1252f = m1387b(iArr2);
                if (!m1395w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1253g = false;
            }
            if (m1393u()) {
                mo1802a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1814r(int i) {
        if (!m1397y()) {
            return;
        }
        if (i == 0) {
            m1388c();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1256j.getResources().getDisplayMetrics();
            m1398z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1393u()) {
                mo1802a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1815t(int i, float f) {
        Context context = this.f1256j;
        m1392s(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
