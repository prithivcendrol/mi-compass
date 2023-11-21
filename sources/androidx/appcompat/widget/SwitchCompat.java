package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.view.C0727l0;
import androidx.core.widget.C0828k;
import androidx.emoji2.text.C0854e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import miuix.animation.utils.CommonUtils;
import p021d.C1447a;
import p021d.C1454h;
import p021d.C1456j;
import p027e.C1512a;
import p045h.C1619a;

public class SwitchCompat extends CompoundButton {

    /* renamed from: V */
    private static final Property<SwitchCompat, Float> f1062V = new C0276a(Float.class, "thumbPos");

    /* renamed from: W */
    private static final int[] f1063W = {16842912};

    /* renamed from: A */
    private VelocityTracker f1064A;

    /* renamed from: B */
    private int f1065B;

    /* renamed from: C */
    float f1066C;

    /* renamed from: D */
    private int f1067D;

    /* renamed from: E */
    private int f1068E;

    /* renamed from: F */
    private int f1069F;

    /* renamed from: G */
    private int f1070G;

    /* renamed from: H */
    private int f1071H;

    /* renamed from: I */
    private int f1072I;

    /* renamed from: J */
    private int f1073J;

    /* renamed from: K */
    private boolean f1074K;

    /* renamed from: L */
    private final TextPaint f1075L;

    /* renamed from: M */
    private ColorStateList f1076M;

    /* renamed from: N */
    private Layout f1077N;

    /* renamed from: O */
    private Layout f1078O;

    /* renamed from: P */
    private TransformationMethod f1079P;

    /* renamed from: Q */
    ObjectAnimator f1080Q;

    /* renamed from: R */
    private final C0420x f1081R;

    /* renamed from: S */
    private C0342k f1082S;

    /* renamed from: T */
    private C0278c f1083T;

    /* renamed from: U */
    private final Rect f1084U;

    /* renamed from: d */
    private Drawable f1085d;

    /* renamed from: e */
    private ColorStateList f1086e;

    /* renamed from: f */
    private PorterDuff.Mode f1087f;

    /* renamed from: g */
    private boolean f1088g;

    /* renamed from: h */
    private boolean f1089h;

    /* renamed from: i */
    private Drawable f1090i;

    /* renamed from: j */
    private ColorStateList f1091j;

    /* renamed from: k */
    private PorterDuff.Mode f1092k;

    /* renamed from: l */
    private boolean f1093l;

    /* renamed from: m */
    private boolean f1094m;

    /* renamed from: n */
    private int f1095n;

    /* renamed from: o */
    private int f1096o;

    /* renamed from: p */
    private int f1097p;

    /* renamed from: q */
    private boolean f1098q;

    /* renamed from: r */
    private CharSequence f1099r;

    /* renamed from: s */
    private CharSequence f1100s;

    /* renamed from: t */
    private CharSequence f1101t;

    /* renamed from: u */
    private CharSequence f1102u;

    /* renamed from: v */
    private boolean f1103v;

    /* renamed from: w */
    private int f1104w;

    /* renamed from: x */
    private int f1105x;

    /* renamed from: y */
    private float f1106y;

    /* renamed from: z */
    private float f1107z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0276a extends Property<SwitchCompat, Float> {
        C0276a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1066C);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    static class C0277b {
        /* renamed from: a */
        static void m1237a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    static class C0278c extends C0854e.C0860e {

        /* renamed from: a */
        private final Reference<SwitchCompat> f1108a;

        C0278c(SwitchCompat switchCompat) {
            this.f1108a = new WeakReference(switchCompat);
        }

        /* renamed from: a */
        public void mo1618a(Throwable th) {
            SwitchCompat switchCompat = this.f1108a.get();
            if (switchCompat != null) {
                switchCompat.mo1577j();
            }
        }

        /* renamed from: b */
        public void mo1619b() {
            SwitchCompat switchCompat = this.f1108a.get();
            if (switchCompat != null) {
                switchCompat.mo1577j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5671K);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1086e = null;
        this.f1087f = null;
        this.f1088g = false;
        this.f1089h = false;
        this.f1091j = null;
        this.f1092k = null;
        this.f1093l = false;
        this.f1094m = false;
        this.f1064A = VelocityTracker.obtain();
        this.f1074K = true;
        this.f1084U = new Rect();
        C0298b1.m1339a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1075L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C1456j.f5868D2;
        C0326g1 u = C0326g1.m1455u(context, attributeSet, iArr, i, 0);
        C0727l0.m2873W(this, context, iArr, attributeSet, u.mo1880q(), i, 0);
        Drawable f = u.mo1869f(C1456j.f5883G2);
        this.f1085d = f;
        if (f != null) {
            f.setCallback(this);
        }
        Drawable f2 = u.mo1869f(C1456j.f5928P2);
        this.f1090i = f2;
        if (f2 != null) {
            f2.setCallback(this);
        }
        setTextOnInternal(u.mo1878o(C1456j.f5873E2));
        setTextOffInternal(u.mo1878o(C1456j.f5878F2));
        this.f1103v = u.mo1864a(C1456j.f5888H2, true);
        this.f1095n = u.mo1868e(C1456j.f5913M2, 0);
        this.f1096o = u.mo1868e(C1456j.f5898J2, 0);
        this.f1097p = u.mo1868e(C1456j.f5903K2, 0);
        this.f1098q = u.mo1864a(C1456j.f5893I2, false);
        ColorStateList c = u.mo1866c(C1456j.f5918N2);
        if (c != null) {
            this.f1086e = c;
            this.f1088g = true;
        }
        PorterDuff.Mode e = C0336j0.m1542e(u.mo1873j(C1456j.f5923O2, -1), (PorterDuff.Mode) null);
        if (this.f1087f != e) {
            this.f1087f = e;
            this.f1089h = true;
        }
        if (this.f1088g || this.f1089h) {
            m1219b();
        }
        ColorStateList c2 = u.mo1866c(C1456j.f5933Q2);
        if (c2 != null) {
            this.f1091j = c2;
            this.f1093l = true;
        }
        PorterDuff.Mode e2 = C0336j0.m1542e(u.mo1873j(C1456j.f5938R2, -1), (PorterDuff.Mode) null);
        if (this.f1092k != e2) {
            this.f1092k = e2;
            this.f1094m = true;
        }
        if (this.f1093l || this.f1094m) {
            m1220c();
        }
        int m = u.mo1876m(C1456j.f5908L2, 0);
        if (m != 0) {
            mo1579m(context, m);
        }
        C0420x xVar = new C0420x(this);
        this.f1081R = xVar;
        xVar.mo2290m(attributeSet, i);
        u.mo1882v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1105x = viewConfiguration.getScaledTouchSlop();
        this.f1065B = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private void m1218a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1062V, new float[]{z ? 1.0f : 0.0f});
        this.f1080Q = ofFloat;
        ofFloat.setDuration(250);
        C0277b.m1237a(this.f1080Q, true);
        this.f1080Q.start();
    }

    /* renamed from: b */
    private void m1219b() {
        Drawable drawable = this.f1085d;
        if (drawable == null) {
            return;
        }
        if (this.f1088g || this.f1089h) {
            Drawable mutate = C0553a.m2297j(drawable).mutate();
            this.f1085d = mutate;
            if (this.f1088g) {
                C0553a.m2294g(mutate, this.f1086e);
            }
            if (this.f1089h) {
                C0553a.m2295h(this.f1085d, this.f1087f);
            }
            if (this.f1085d.isStateful()) {
                this.f1085d.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1220c() {
        Drawable drawable = this.f1090i;
        if (drawable == null) {
            return;
        }
        if (this.f1093l || this.f1094m) {
            Drawable mutate = C0553a.m2297j(drawable).mutate();
            this.f1090i = mutate;
            if (this.f1093l) {
                C0553a.m2294g(mutate, this.f1091j);
            }
            if (this.f1094m) {
                C0553a.m2295h(this.f1090i, this.f1092k);
            }
            if (this.f1090i.isStateful()) {
                this.f1090i.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m1221d() {
        ObjectAnimator objectAnimator = this.f1080Q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m1222e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m1223f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private CharSequence m1224g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().mo1968f(this.f1079P);
        return f != null ? f.getTransformation(charSequence, this) : charSequence;
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f1082S == null) {
            this.f1082S = new C0342k(this);
        }
        return this.f1082S;
    }

    private boolean getTargetCheckedState() {
        return this.f1066C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0385r1.m1722b(this) ? 1.0f - this.f1066C : this.f1066C) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1090i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1084U;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1085d;
        Rect d = drawable2 != null ? C0336j0.m1541d(drawable2) : C0336j0.f1313c;
        return ((((this.f1067D - this.f1069F) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: h */
    private boolean m1225h(float f, float f2) {
        if (this.f1085d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1085d.getPadding(this.f1084U);
        int i = this.f1071H;
        int i2 = this.f1105x;
        int i3 = i - i2;
        int i4 = (this.f1070G + thumbOffset) - i2;
        Rect rect = this.f1084U;
        return f > ((float) i4) && f < ((float) ((((this.f1069F + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1073J + i2));
    }

    /* renamed from: i */
    private Layout m1226i(CharSequence charSequence) {
        TextPaint textPaint = this.f1075L;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m1227k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1101t;
            if (charSequence == null) {
                charSequence = getResources().getString(C1454h.f5833b);
            }
            C0727l0.m2906o0(this, charSequence);
        }
    }

    /* renamed from: l */
    private void m1228l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1099r;
            if (charSequence == null) {
                charSequence = getResources().getString(C1454h.f5834c);
            }
            C0727l0.m2906o0(this, charSequence);
        }
    }

    /* renamed from: o */
    private void m1229o(int i, int i2) {
        mo1580n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: p */
    private void m1230p() {
        if (this.f1083T == null && this.f1082S.mo1964b() && C0854e.m3393h()) {
            C0854e b = C0854e.m3389b();
            int d = b.mo3091d();
            if (d == 3 || d == 0) {
                C0278c cVar = new C0278c(this);
                this.f1083T = cVar;
                b.mo3100s(cVar);
            }
        }
    }

    /* renamed from: q */
    private void m1231q(MotionEvent motionEvent) {
        this.f1104w = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1064A.computeCurrentVelocity(CommonUtils.UNIT_SECOND);
            float xVelocity = this.f1064A.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1065B)) {
                z = getTargetCheckedState();
            } else if (!C0385r1.m1722b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1222e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1101t = charSequence;
        this.f1102u = m1224g(charSequence);
        this.f1078O = null;
        if (this.f1103v) {
            m1230p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1099r = charSequence;
        this.f1100s = m1224g(charSequence);
        this.f1077N = null;
        if (this.f1103v) {
            m1230p();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1084U;
        int i3 = this.f1070G;
        int i4 = this.f1071H;
        int i5 = this.f1072I;
        int i6 = this.f1073J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1085d;
        Rect d = drawable != null ? C0336j0.m1541d(drawable) : C0336j0.f1313c;
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1090i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1090i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1085d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1069F + rect.right;
            this.f1085d.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0553a.m2291d(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1085d;
        if (drawable != null) {
            C0553a.m2290c(drawable, f, f2);
        }
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null) {
            C0553a.m2290c(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1085d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0385r1.m1722b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1067D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1097p : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0385r1.m1722b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1067D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1097p : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1103v;
    }

    public boolean getSplitTrack() {
        return this.f1098q;
    }

    public int getSwitchMinWidth() {
        return this.f1096o;
    }

    public int getSwitchPadding() {
        return this.f1097p;
    }

    public CharSequence getTextOff() {
        return this.f1101t;
    }

    public CharSequence getTextOn() {
        return this.f1099r;
    }

    public Drawable getThumbDrawable() {
        return this.f1085d;
    }

    /* access modifiers changed from: protected */
    public final float getThumbPosition() {
        return this.f1066C;
    }

    public int getThumbTextPadding() {
        return this.f1095n;
    }

    public ColorStateList getThumbTintList() {
        return this.f1086e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1087f;
    }

    public Drawable getTrackDrawable() {
        return this.f1090i;
    }

    public ColorStateList getTrackTintList() {
        return this.f1091j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1092k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1577j() {
        setTextOnInternal(this.f1099r);
        setTextOffInternal(this.f1101t);
        requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1085d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1080Q;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1080Q.end();
            this.f1080Q = null;
        }
    }

    /* renamed from: m */
    public void mo1579m(Context context, int i) {
        C0326g1 s = C0326g1.m1453s(context, i, C1456j.f5943S2);
        ColorStateList c = s.mo1866c(C1456j.f5959W2);
        if (c == null) {
            c = getTextColors();
        }
        this.f1076M = c;
        int e = s.mo1868e(C1456j.f5947T2, 0);
        if (e != 0) {
            float f = (float) e;
            if (f != this.f1075L.getTextSize()) {
                this.f1075L.setTextSize(f);
                requestLayout();
            }
        }
        m1229o(s.mo1873j(C1456j.f5951U2, -1), s.mo1873j(C1456j.f5955V2, -1));
        this.f1079P = s.mo1864a(C1456j.f5981b3, false) ? new C1619a(getContext()) : null;
        setTextOnInternal(this.f1099r);
        setTextOffInternal(this.f1101t);
        s.mo1882v();
    }

    /* renamed from: n */
    public void mo1580n(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1075L;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1075L;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1075L.setFakeBoldText(false);
        this.f1075L.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1063W);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1084U;
        Drawable drawable = this.f1090i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1071H;
        int i3 = this.f1073J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1085d;
        if (drawable != null) {
            if (!this.f1098q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0336j0.m1541d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1077N : this.f1078O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1076M;
            if (colorStateList != null) {
                this.f1075L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1075L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1099r : this.f1101t;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1085d != null) {
            Rect rect = this.f1084U;
            Drawable drawable = this.f1090i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0336j0.m1541d(this.f1085d);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0385r1.m1722b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1067D + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1067D) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1068E;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1068E;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1068E;
            this.f1070G = i7;
            this.f1071H = i9;
            this.f1073J = i8;
            this.f1072I = i6;
        }
        i8 = i10 + i9;
        this.f1070G = i7;
        this.f1071H = i9;
        this.f1073J = i8;
        this.f1072I = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1103v) {
            if (this.f1077N == null) {
                this.f1077N = m1226i(this.f1100s);
            }
            if (this.f1078O == null) {
                this.f1078O = m1226i(this.f1102u);
            }
        }
        Rect rect = this.f1084U;
        Drawable drawable = this.f1085d;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1085d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1085d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1069F = Math.max(this.f1103v ? Math.max(this.f1077N.getWidth(), this.f1078O.getWidth()) + (this.f1095n * 2) : 0, i4);
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1090i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1085d;
        if (drawable3 != null) {
            Rect d = C0336j0.m1541d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = this.f1074K ? Math.max(this.f1096o, (this.f1069F * 2) + i6 + i7) : this.f1096o;
        int max2 = Math.max(i5, i3);
        this.f1067D = max;
        this.f1068E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1099r : this.f1101t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1064A
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f1104w
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1106y
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.C0385r1.m1722b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f1066C
            float r0 = r0 + r2
            float r0 = m1223f(r0, r4, r3)
            float r2 = r6.f1066C
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f1106y = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1106y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1105x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f1107z
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1105x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f1104w = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1106y = r0
            r6.f1107z = r3
            return r1
        L_0x0089:
            int r0 = r6.f1104w
            if (r0 != r2) goto L_0x0094
            r6.m1231q(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f1104w = r0
            android.view.VelocityTracker r0 = r6.f1064A
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.m1225h(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f1104w = r1
            r6.f1106y = r0
            r6.f1107z = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m1228l();
        } else {
            m1227k();
        }
        if (getWindowToken() == null || !C0727l0.m2860J(this)) {
            m1221d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1218a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo1967e(z);
        setTextOnInternal(this.f1099r);
        setTextOffInternal(this.f1101t);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void setEnforceSwitchWidth(boolean z) {
        this.f1074K = z;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo1963a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1103v != z) {
            this.f1103v = z;
            requestLayout();
            if (z) {
                m1230p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1098q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1096o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1097p = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1075L.getTypeface() != null && !this.f1075L.getTypeface().equals(typeface)) || (this.f1075L.getTypeface() == null && typeface != null)) {
            this.f1075L.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            m1227k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m1228l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1085d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1085d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1066C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1512a.m6567b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1095n = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1086e = colorStateList;
        this.f1088g = true;
        m1219b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1087f = mode;
        this.f1089h = true;
        m1219b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1090i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1090i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1512a.m6567b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1091j = colorStateList;
        this.f1093l = true;
        m1220c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1092k = mode;
        this.f1094m = true;
        m1220c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1085d || drawable == this.f1090i;
    }
}
