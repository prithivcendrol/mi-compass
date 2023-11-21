package miuix.internal.view;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import miuix.internal.view.C2290a;
import p018c2.C1356l;
import p018c2.C1357m;

public class CheckBoxAnimatedStateListDrawable extends C2290a {

    /* renamed from: f */
    private C2294d f8695f;

    /* renamed from: g */
    private float f8696g = 1.0f;

    /* renamed from: h */
    private float f8697h = 1.0f;

    /* renamed from: i */
    private boolean f8698i = false;

    /* renamed from: j */
    private boolean f8699j = false;

    /* renamed from: k */
    private boolean f8700k;

    /* renamed from: miuix.internal.view.CheckBoxAnimatedStateListDrawable$a */
    protected static class C2288a extends C2290a.C2291a {
        protected C2288a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable mo8669a(Resources resources, Resources.Theme theme, C2290a.C2291a aVar) {
            return new CheckBoxAnimatedStateListDrawable(resources, theme, aVar);
        }
    }

    public CheckBoxAnimatedStateListDrawable() {
    }

    public CheckBoxAnimatedStateListDrawable(Resources resources, Resources.Theme theme, C2290a.C2291a aVar) {
        super(resources, theme, aVar);
        this.f8695f = new C2294d(this, mo8658e(), aVar.f8705b, aVar.f8706c, aVar.f8707d, aVar.f8709f, aVar.f8710g, aVar.f8708e, aVar.f8711h, aVar.f8712i);
    }

    /* renamed from: f */
    private boolean m9666f(TypedArray typedArray, int i, boolean z) {
        try {
            return typedArray.getBoolean(i, z);
        } catch (Exception e) {
            Log.w("MiuixCheckbox", "try catch Exception insafeGetBoolean", e);
            return z;
        }
    }

    /* renamed from: g */
    private int m9667g(TypedArray typedArray, int i, int i2) {
        try {
            return typedArray.getColor(i, i2);
        } catch (UnsupportedOperationException e) {
            Log.w("MiuixCheckbox", "try catch UnsupportedOperationException insafeGetColor", e);
            return i2;
        }
    }

    /* renamed from: h */
    private int m9668h(TypedArray typedArray, int i, int i2) {
        try {
            return typedArray.getInt(i, i2);
        } catch (Exception e) {
            Log.w("MiuixCheckbox", "try catch Exception insafeGetInt", e);
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2290a.C2291a mo8652a() {
        return new C2288a();
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(mo8654b(), C1357m.f4991s0);
        this.f8703d.f8705b = m9667g(obtainStyledAttributes, C1357m.f5016x0, 0);
        this.f8703d.f8706c = m9667g(obtainStyledAttributes, C1357m.f5006v0, 0);
        this.f8703d.f8707d = m9667g(obtainStyledAttributes, C1357m.f5011w0, 0);
        this.f8703d.f8708e = m9667g(obtainStyledAttributes, C1357m.f5021y0, 0);
        this.f8703d.f8709f = m9668h(obtainStyledAttributes, C1357m.f5001u0, 0);
        this.f8703d.f8710g = m9668h(obtainStyledAttributes, C1357m.f4996t0, 0);
        this.f8703d.f8711h = m9668h(obtainStyledAttributes, C1357m.f4797A0, 0);
        this.f8703d.f8712i = m9668h(obtainStyledAttributes, C1357m.f5025z0, 0);
        this.f8703d.f8713j = m9666f(obtainStyledAttributes, C1357m.f4801B0, false);
        obtainStyledAttributes.recycle();
        boolean e = mo8658e();
        C2290a.C2291a aVar = this.f8703d;
        this.f8695f = new C2294d(this, e, aVar.f8705b, aVar.f8706c, aVar.f8707d, aVar.f8709f, aVar.f8710g, aVar.f8708e, aVar.f8711h, aVar.f8712i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo8654b() {
        return C1356l.f4792d;
    }

    /* renamed from: c */
    public float mo8655c() {
        return this.f8697h;
    }

    /* renamed from: d */
    public float mo8656d() {
        return this.f8696g;
    }

    public void draw(Canvas canvas) {
        int i;
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            super.draw(canvas);
        } else if (!this.f8703d.f8713j) {
            C2294d dVar = this.f8695f;
            if (dVar != null) {
                dVar.mo8684e(canvas);
            }
            super.draw(canvas);
        } else {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 2));
            if (this.f8700k) {
                C2294d dVar2 = this.f8695f;
                if (dVar2 != null) {
                    dVar2.mo8684e(canvas);
                }
                i = (int) (this.f8697h * 255.0f);
            } else {
                i = 76;
            }
            setAlpha(i);
            canvas.save();
            Rect bounds = getBounds();
            float f = this.f8696g;
            canvas.scale(f, f, (float) ((bounds.left + bounds.right) / 2), (float) ((bounds.top + bounds.bottom) / 2));
            super.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8658e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8659i(int i, int i2, int i3, int i4) {
        C2294d dVar = this.f8695f;
        if (dVar != null) {
            dVar.mo8686i(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8660j(Rect rect) {
        C2294d dVar = this.f8695f;
        if (dVar != null) {
            dVar.mo8687j(rect);
        }
    }

    /* renamed from: k */
    public void mo8661k(float f) {
        this.f8697h = f;
    }

    /* renamed from: l */
    public void mo8662l(float f) {
        this.f8696g = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8663m(boolean z) {
        C2294d dVar = this.f8695f;
        if (dVar != null) {
            dVar.mo8689l(z, this.f8703d.f8713j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8664n(boolean z) {
        C2294d dVar = this.f8695f;
        if (dVar != null) {
            dVar.mo8690m(z, this.f8703d.f8713j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8665o(boolean z, boolean z2) {
        C2294d dVar = this.f8695f;
        if (dVar != null) {
            dVar.mo8691n(z, z2);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f8695f == null) {
            return onStateChange;
        }
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            return super.onStateChange(iArr);
        }
        this.f8700k = false;
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842919) {
                z = true;
            } else if (i == 16842912) {
                z2 = true;
            } else if (i == 16842910) {
                this.f8700k = true;
            }
        }
        if (z) {
            mo8663m(z2);
        }
        if (!this.f8698i && !z) {
            mo8665o(z2, this.f8700k);
        }
        if (!z && (this.f8698i || z2 != this.f8699j)) {
            mo8664n(z2);
        }
        this.f8698i = z;
        this.f8699j = z2;
        return onStateChange;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        mo8659i(i, i2, i3, i4);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        mo8660j(rect);
    }
}
