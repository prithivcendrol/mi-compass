package p030e2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import p005a4.C0040b;
import p018c2.C1347c;
import p018c2.C1357m;
import p036f2.C1558a;
import p055i3.C1649c;
import p117t2.C2715o;

/* renamed from: e2.a */
public class C1530a {

    /* renamed from: a */
    private Context f6171a;

    /* renamed from: b */
    private boolean f6172b = false;

    /* renamed from: c */
    private boolean f6173c = false;

    /* renamed from: d */
    private boolean f6174d;

    /* renamed from: e */
    private TypedValue f6175e;

    /* renamed from: f */
    private TypedValue f6176f;

    /* renamed from: g */
    private TypedValue f6177g;

    /* renamed from: h */
    private TypedValue f6178h;

    /* renamed from: i */
    private TypedValue f6179i;

    /* renamed from: j */
    private TypedValue f6180j;

    /* renamed from: k */
    private TypedValue f6181k;

    /* renamed from: l */
    private TypedValue f6182l;

    /* renamed from: m */
    private DisplayMetrics f6183m;

    /* renamed from: n */
    private Point f6184n;

    public C1530a(Context context, AttributeSet attributeSet) {
        this.f6171a = context;
        this.f6184n = new Point();
        mo5643u(context);
        m6600r(context, attributeSet);
    }

    /* renamed from: a */
    private TypedValue m6589a() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6176f;
    }

    /* renamed from: b */
    private TypedValue m6590b() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6178h;
    }

    /* renamed from: c */
    private TypedValue m6591c() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6177g;
    }

    /* renamed from: d */
    private TypedValue m6592d() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6175e;
    }

    /* renamed from: g */
    private TypedValue m6593g() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6182l;
    }

    /* renamed from: h */
    private TypedValue m6594h() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6181k;
    }

    /* renamed from: i */
    private TypedValue m6595i() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6180j;
    }

    /* renamed from: j */
    private TypedValue m6596j() {
        if (!this.f6172b || !this.f6173c) {
            return null;
        }
        return this.f6179i;
    }

    /* renamed from: k */
    private int m6597k(int i, boolean z, TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4) {
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return i;
        }
        boolean o = m6599o();
        if (!o) {
            typedValue = typedValue2;
        }
        int s = m6601s(typedValue, z);
        if (s > 0) {
            return View.MeasureSpec.makeMeasureSpec(s, 1073741824);
        }
        if (!o) {
            typedValue3 = typedValue4;
        }
        int s2 = m6601s(typedValue3, z);
        return s2 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(s2, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE) : i;
    }

    /* renamed from: l */
    private int m6598l(ContextThemeWrapper contextThemeWrapper) {
        try {
            return ((Integer) C0040b.m64f(contextThemeWrapper, C0040b.m63e(contextThemeWrapper.getClass(), "getThemeResId", (Class<?>[]) null), (Object[]) null)).intValue();
        } catch (RuntimeException e) {
            Log.w("FloatingABOLayoutSpec", "catch theme resource get exception", e);
            return 0;
        }
    }

    /* renamed from: o */
    private boolean m6599o() {
        return this.f6171a.getApplicationContext().getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: r */
    private void m6600r(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4899Z2);
            int i = C1357m.f4964m3;
            if (obtainStyledAttributes.hasValue(i)) {
                TypedValue typedValue = new TypedValue();
                this.f6175e = typedValue;
                obtainStyledAttributes.getValue(i, typedValue);
            }
            int i2 = C1357m.f4949j3;
            if (obtainStyledAttributes.hasValue(i2)) {
                TypedValue typedValue2 = new TypedValue();
                this.f6176f = typedValue2;
                obtainStyledAttributes.getValue(i2, typedValue2);
            }
            int i3 = C1357m.f4959l3;
            if (obtainStyledAttributes.hasValue(i3)) {
                TypedValue typedValue3 = new TypedValue();
                this.f6177g = typedValue3;
                obtainStyledAttributes.getValue(i3, typedValue3);
            }
            int i4 = C1357m.f4954k3;
            if (obtainStyledAttributes.hasValue(i4)) {
                TypedValue typedValue4 = new TypedValue();
                this.f6178h = typedValue4;
                obtainStyledAttributes.getValue(i4, typedValue4);
            }
            int i5 = C1357m.f4994s3;
            if (obtainStyledAttributes.hasValue(i5)) {
                TypedValue typedValue5 = new TypedValue();
                this.f6179i = typedValue5;
                obtainStyledAttributes.getValue(i5, typedValue5);
            }
            int i6 = C1357m.f4989r3;
            if (obtainStyledAttributes.hasValue(i6)) {
                TypedValue typedValue6 = new TypedValue();
                this.f6180j = typedValue6;
                obtainStyledAttributes.getValue(i6, typedValue6);
            }
            int i7 = C1357m.f4979p3;
            if (obtainStyledAttributes.hasValue(i7)) {
                TypedValue typedValue7 = new TypedValue();
                this.f6182l = typedValue7;
                obtainStyledAttributes.getValue(i7, typedValue7);
            }
            int i8 = C1357m.f4984q3;
            if (obtainStyledAttributes.hasValue(i8)) {
                TypedValue typedValue8 = new TypedValue();
                this.f6181k = typedValue8;
                obtainStyledAttributes.getValue(i8, typedValue8);
            }
            this.f6172b = obtainStyledAttributes.getBoolean(C1357m.f4919d3, false);
            this.f6173c = C1558a.m6677h(context);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private int m6601s(TypedValue typedValue, boolean z) {
        int i;
        float fraction;
        if (!(typedValue == null || (i = typedValue.type) == 0)) {
            if (i == 5) {
                fraction = typedValue.getDimension(this.f6183m);
            } else if (i == 6) {
                float f = (float) (z ? this.f6184n.x : this.f6184n.y);
                fraction = typedValue.getFraction(f, f);
            }
            return (int) fraction;
        }
        return 0;
    }

    /* renamed from: e */
    public int mo5636e(int i) {
        return m6597k(i, false, m6590b(), m6589a(), m6594h(), m6593g());
    }

    /* renamed from: f */
    public int mo5637f(int i) {
        return m6597k(i, false, this.f6178h, this.f6176f, this.f6181k, this.f6182l);
    }

    /* renamed from: m */
    public int mo5638m(int i) {
        return m6597k(i, true, m6592d(), m6591c(), m6596j(), m6595i());
    }

    /* renamed from: n */
    public int mo5639n(int i) {
        return m6597k(i, true, this.f6175e, this.f6177g, this.f6179i, this.f6180j);
    }

    /* renamed from: p */
    public void mo5640p() {
        int l;
        Context context = this.f6171a;
        if (this.f6174d && (context instanceof ContextThemeWrapper) && (l = m6598l((ContextThemeWrapper) context)) > 0) {
            context = new ContextThemeWrapper(this.f6171a.getApplicationContext(), l);
        }
        this.f6175e = C1649c.m6966k(context, C1347c.f4564c0);
        this.f6176f = C1649c.m6966k(context, C1347c.f4558Z);
        this.f6177g = C1649c.m6966k(context, C1347c.f4562b0);
        this.f6178h = C1649c.m6966k(context, C1347c.f4560a0);
        this.f6179i = C1649c.m6966k(context, C1347c.f4572g0);
        this.f6180j = C1649c.m6966k(context, C1347c.f4570f0);
        this.f6181k = C1649c.m6966k(context, C1347c.f4568e0);
        this.f6182l = C1649c.m6966k(context, C1347c.f4566d0);
        mo5643u(context);
    }

    /* renamed from: q */
    public void mo5641q(boolean z) {
        if (this.f6172b) {
            this.f6173c = z;
        }
    }

    /* renamed from: t */
    public void mo5642t(boolean z) {
        this.f6174d = z;
    }

    /* renamed from: u */
    public void mo5643u(Context context) {
        this.f6183m = context.getResources().getDisplayMetrics();
        this.f6184n = C2715o.m11335f(context);
    }
}
