package miuix.appcompat.app;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import miuix.smooth.C2385c;
import org.xmlpull.v1.XmlPullParser;
import p018c2.C1357m;
import p055i3.C1652f;

public class AlphaBlendingDrawable extends Drawable {

    /* renamed from: A */
    private static final int[] f7597A = {16843518};

    /* renamed from: B */
    private static final boolean f7598B;

    /* renamed from: C */
    private static final AnimConfig f7599C;

    /* renamed from: D */
    private static final AnimConfig f7600D;

    /* renamed from: E */
    private static final AnimConfig f7601E;

    /* renamed from: F */
    private static final AnimConfig f7602F;

    /* renamed from: G */
    private static final AnimConfig f7603G;

    /* renamed from: H */
    private static final AnimConfig f7604H;

    /* renamed from: v */
    private static final int[] f7605v = {16842919};

    /* renamed from: w */
    private static final int[] f7606w = {16843625};

    /* renamed from: x */
    private static final int[] f7607x = {16842913};

    /* renamed from: y */
    private static final int[] f7608y = {16843623, 16843518};

    /* renamed from: z */
    private static final int[] f7609z = {16843623};

    /* renamed from: a */
    private int f7610a;

    /* renamed from: b */
    private final RectF f7611b = new RectF();

    /* renamed from: c */
    private final Paint f7612c = new Paint();

    /* renamed from: d */
    private int f7613d;

    /* renamed from: e */
    private int f7614e;

    /* renamed from: f */
    private int f7615f;

    /* renamed from: g */
    private int f7616g;

    /* renamed from: h */
    private boolean f7617h;

    /* renamed from: i */
    private boolean f7618i;

    /* renamed from: j */
    private boolean f7619j;

    /* renamed from: k */
    private float f7620k;

    /* renamed from: l */
    private float f7621l;

    /* renamed from: m */
    private float f7622m;

    /* renamed from: n */
    private float f7623n;

    /* renamed from: o */
    private float f7624o;

    /* renamed from: p */
    private AnimState f7625p;

    /* renamed from: q */
    private AnimState f7626q;

    /* renamed from: r */
    private AnimState f7627r;

    /* renamed from: s */
    private AnimState f7628s;

    /* renamed from: t */
    private AnimState f7629t;

    /* renamed from: u */
    private IStateStyle f7630u;

    static {
        boolean a = true ^ C1652f.m6973a();
        f7598B = a;
        if (a) {
            f7599C = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
            f7600D = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
            AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
            f7601E = ease;
            AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
            f7602F = ease2;
            f7603G = ease;
            f7604H = ease2;
            return;
        }
        f7599C = null;
        f7600D = null;
        f7601E = null;
        f7602F = null;
        f7603G = null;
        f7604H = null;
    }

    public AlphaBlendingDrawable() {
    }

    public AlphaBlendingDrawable(View view) {
        m8232a(view.getResources(), (AttributeSet) null, (Resources.Theme) null);
    }

    /* renamed from: a */
    private void m8232a(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, C1357m.f4811D2, 0, 0) : resources.obtainAttributes(attributeSet, C1357m.f4811D2);
        int color = obtainStyledAttributes.getColor(C1357m.f4835J2, -16777216);
        this.f7610a = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4839K2, 0);
        this.f7620k = obtainStyledAttributes.getFloat(C1357m.f4827H2, 0.0f);
        this.f7621l = obtainStyledAttributes.getFloat(C1357m.f4831I2, 0.0f);
        this.f7622m = obtainStyledAttributes.getFloat(C1357m.f4823G2, 0.0f);
        this.f7623n = obtainStyledAttributes.getFloat(C1357m.f4815E2, 0.0f);
        this.f7624o = obtainStyledAttributes.getFloat(C1357m.f4819F2, 0.0f);
        obtainStyledAttributes.recycle();
        this.f7612c.setColor(color);
        if (f7598B) {
            this.f7625p = new AnimState().add("alphaF", (double) this.f7620k);
            this.f7627r = new AnimState().add("alphaF", (double) this.f7621l);
            this.f7626q = new AnimState().add("alphaF", (double) this.f7622m);
            this.f7628s = new AnimState().add("alphaF", (double) this.f7623n);
            this.f7629t = new AnimState().add("alphaF", (double) this.f7624o);
            IStateStyle useValue = Folme.useValue(this);
            this.f7630u = useValue;
            useValue.setTo((Object) this.f7625p);
        } else {
            setAlphaF(this.f7620k);
        }
        m8233d(true);
    }

    @SuppressLint({"LongLogTag"})
    /* renamed from: d */
    private void m8233d(boolean z) {
        C2385c.m10111b(this, z);
    }

    /* renamed from: e */
    private boolean m8234e() {
        if (this.f7617h) {
            this.f7617h = false;
            this.f7618i = false;
            this.f7619j = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7628s, f7602F);
            } else {
                setAlphaF(this.f7623n);
            }
            return true;
        } else if (this.f7618i) {
            this.f7618i = false;
            this.f7619j = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7628s, f7600D);
            } else {
                setAlphaF(this.f7623n);
            }
            return true;
        } else if (this.f7619j) {
            return false;
        } else {
            this.f7619j = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7628s, f7603G);
            } else {
                setAlphaF(this.f7623n);
            }
            return true;
        }
    }

    /* renamed from: f */
    private boolean m8235f() {
        if (this.f7617h) {
            this.f7617h = false;
            this.f7618i = true;
            this.f7619j = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7629t, f7602F);
            } else {
                setAlphaF(this.f7624o);
            }
            return true;
        }
        boolean z = this.f7618i;
        if (z && this.f7619j) {
            return false;
        }
        if (z) {
            this.f7619j = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7629t, f7603G);
            } else {
                setAlphaF(this.f7624o);
            }
            return true;
        } else if (this.f7619j) {
            this.f7618i = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7629t, f7599C);
            } else {
                setAlphaF(this.f7624o);
            }
            return true;
        } else {
            this.f7619j = true;
            this.f7618i = true;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7629t, f7599C);
            } else {
                setAlphaF(this.f7624o);
            }
            return true;
        }
    }

    /* renamed from: g */
    private boolean m8236g() {
        if (this.f7617h) {
            this.f7617h = false;
            this.f7618i = true;
            this.f7619j = false;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7626q, f7602F);
            } else {
                setAlphaF(this.f7622m);
            }
            return true;
        } else if (!this.f7618i) {
            this.f7618i = true;
            this.f7619j = false;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7626q, f7599C);
            } else {
                setAlphaF(this.f7622m);
            }
            return true;
        } else if (!this.f7619j) {
            return false;
        } else {
            if (f7598B) {
                this.f7630u.mo6815to(this.f7626q, f7600D);
            } else {
                setAlphaF(this.f7622m);
            }
            return true;
        }
    }

    /* renamed from: h */
    private boolean m8237h() {
        if (this.f7617h) {
            this.f7617h = false;
            this.f7618i = false;
            this.f7619j = false;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7625p, f7602F);
            } else {
                setAlphaF(this.f7620k);
            }
            return true;
        } else if (this.f7618i) {
            this.f7618i = false;
            this.f7619j = false;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7625p, f7600D);
            } else {
                setAlphaF(this.f7620k);
            }
            return true;
        } else if (!this.f7619j) {
            return false;
        } else {
            this.f7619j = false;
            if (f7598B) {
                this.f7630u.mo6815to(this.f7625p, f7604H);
            } else {
                setAlphaF(this.f7620k);
            }
            return true;
        }
    }

    /* renamed from: i */
    private boolean m8238i() {
        if (this.f7617h) {
            return false;
        }
        if (f7598B) {
            this.f7630u.mo6815to(this.f7627r, f7601E);
        } else {
            setAlphaF(this.f7621l);
        }
        this.f7617h = true;
        this.f7618i = false;
        this.f7619j = false;
        return true;
    }

    /* renamed from: b */
    public void mo7343b(int i, int i2, int i3, int i4) {
        this.f7613d = i;
        this.f7614e = i2;
        this.f7615f = i3;
        this.f7616g = i4;
    }

    /* renamed from: c */
    public void mo7344c(int i) {
        if (this.f7610a != i) {
            this.f7610a = i;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (isVisible()) {
            RectF rectF = this.f7611b;
            int i = this.f7610a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f7612c);
        }
    }

    public float getAlphaF() {
        return ((float) this.f7612c.getAlpha()) / 255.0f;
    }

    public int getOpacity() {
        return 0;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        m8232a(resources, attributeSet, theme);
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        if (f7598B) {
            IStateStyle iStateStyle = this.f7630u;
            iStateStyle.setTo((Object) iStateStyle.getCurrentState());
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f7611b.set(rect);
        RectF rectF = this.f7611b;
        rectF.left += (float) this.f7613d;
        rectF.top += (float) this.f7614e;
        rectF.right -= (float) this.f7615f;
        rectF.bottom -= (float) this.f7616g;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return (StateSet.stateSetMatches(f7605v, iArr) || StateSet.stateSetMatches(f7606w, iArr) || StateSet.stateSetMatches(f7607x, iArr)) ? m8238i() : StateSet.stateSetMatches(f7608y, iArr) ? m8235f() : StateSet.stateSetMatches(f7609z, iArr) ? m8236g() : StateSet.stateSetMatches(f7597A, iArr) ? m8234e() : m8237h();
    }

    public void setAlpha(int i) {
    }

    public void setAlphaF(float f) {
        this.f7612c.setAlpha((int) (f * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
