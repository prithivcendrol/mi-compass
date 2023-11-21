package miuix.miuixbasewidget.widget.internal;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import org.xmlpull.v1.XmlPullParser;
import p005a4.C0039a;
import p067k3.C1795i;
import p137x2.C2901a;

public class FilterSortTabView2ForegroundDrawable extends Drawable {
    private static final AnimConfig ACTIVATE_ENTER_CONFIG;
    private static final AnimConfig ACTIVATE_EXIT_CONFIG;
    private static final String ALPHA_F = "alphaF";
    private static final AnimConfig HOVER_ENTER_CONFIG;
    private static final AnimConfig HOVER_EXIT_CONFIG;
    private static final AnimConfig PRESS_ENTER_CONFIG;
    private static final AnimConfig PRESS_EXIT_CONFIG;
    private static final int[] STATE_ACTIVATED = {16843518};
    private static final int[] STATE_DRAG_HOVERED = {16843625};
    private static final int[] STATE_HOVERED = {16843623};
    private static final int[] STATE_HOVERED_ACTIVATED = {16843623, 16843518};
    private static final int[] STATE_PRESSED = {16842919};
    private static final String TAG = "StateTransitionDrawable";
    private static final boolean USE_FOLME;
    private static final boolean USE_SMOOTH_ROUND_RECT = (true ^ isCommonLiteStrategy());
    private static Boolean mIsCommonLiteStrategy;
    private boolean mActivated;
    private float mActivatedAlpha;
    private AnimState mActivatedState;
    private boolean mHovered;
    private float mHoveredActivatedAlpha;
    private AnimState mHoveredActivatedState;
    private float mHoveredAlpha;
    private AnimState mHoveredState;
    private float mNormalAlpha;
    private AnimState mNormalState;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    private boolean mPressed;
    private float mPressedAlpha;
    private AnimState mPressedState;
    private int mRadius;
    private final RectF mRect = new RectF();
    private IStateStyle mStyle;

    static {
        boolean z = !isCommonLiteStrategy();
        USE_FOLME = z;
        if (z) {
            HOVER_ENTER_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
            HOVER_EXIT_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
            AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
            PRESS_ENTER_CONFIG = ease;
            AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
            PRESS_EXIT_CONFIG = ease2;
            ACTIVATE_ENTER_CONFIG = ease;
            ACTIVATE_EXIT_CONFIG = ease2;
            return;
        }
        HOVER_ENTER_CONFIG = null;
        HOVER_EXIT_CONFIG = null;
        PRESS_ENTER_CONFIG = null;
        PRESS_EXIT_CONFIG = null;
        ACTIVATE_ENTER_CONFIG = null;
        ACTIVATE_EXIT_CONFIG = null;
    }

    public FilterSortTabView2ForegroundDrawable() {
    }

    public FilterSortTabView2ForegroundDrawable(View view) {
        init(view.getResources(), (AttributeSet) null, (Resources.Theme) null);
    }

    private void calculatePath() {
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRect;
        int i = this.mRadius;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
    }

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, C1795i.f6982j1, 0, 0) : resources.obtainAttributes(attributeSet, C1795i.f6982j1);
        int color = obtainStyledAttributes.getColor(C1795i.f7000p1, -16777216);
        this.mRadius = obtainStyledAttributes.getDimensionPixelSize(C1795i.f7003q1, 0);
        this.mNormalAlpha = obtainStyledAttributes.getFloat(C1795i.f6994n1, 0.0f);
        this.mPressedAlpha = obtainStyledAttributes.getFloat(C1795i.f6997o1, 0.0f);
        this.mHoveredAlpha = obtainStyledAttributes.getFloat(C1795i.f6991m1, 0.0f);
        this.mActivatedAlpha = obtainStyledAttributes.getFloat(C1795i.f6985k1, 0.0f);
        this.mHoveredActivatedAlpha = obtainStyledAttributes.getFloat(C1795i.f6988l1, 0.0f);
        obtainStyledAttributes.recycle();
        this.mPaint.setColor(color);
        if (USE_FOLME) {
            this.mNormalState = new AnimState().add(ALPHA_F, (double) this.mNormalAlpha);
            this.mPressedState = new AnimState().add(ALPHA_F, (double) this.mPressedAlpha);
            this.mHoveredState = new AnimState().add(ALPHA_F, (double) this.mHoveredAlpha);
            this.mActivatedState = new AnimState().add(ALPHA_F, (double) this.mActivatedAlpha);
            this.mHoveredActivatedState = new AnimState().add(ALPHA_F, (double) this.mHoveredActivatedAlpha);
            IStateStyle useValue = Folme.useValue(this);
            this.mStyle = useValue;
            useValue.setTo((Object) this.mNormalState);
        } else {
            setAlphaF(this.mNormalAlpha);
        }
        if (USE_SMOOTH_ROUND_RECT) {
            setSmoothCornerEnable(true);
        }
    }

    private static boolean isCommonLiteStrategy() {
        if (mIsCommonLiteStrategy == null) {
            mIsCommonLiteStrategy = Boolean.valueOf(C2901a.m11964E() || C2901a.m11962C() || C2901a.m11965F());
        }
        return mIsCommonLiteStrategy.booleanValue();
    }

    @SuppressLint({"LongLogTag"})
    private void setSmoothCornerEnable(boolean z) {
        Class<Drawable> cls = Drawable.class;
        try {
            C0039a.m52m(cls, this, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.e(TAG, "setSmoothCornerEnabled failed:" + e.getMessage());
        }
    }

    private boolean toActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        } else if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mActivatedState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        } else if (this.mActivated) {
            return false;
        } else {
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mActivatedState, ACTIVATE_ENTER_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        }
    }

    private boolean toHoveredActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        boolean z = this.mHovered;
        if (z && this.mActivated) {
            return false;
        }
        if (z) {
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredActivatedState, ACTIVATE_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        } else if (this.mActivated) {
            this.mHovered = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        } else {
            this.mActivated = true;
            this.mHovered = true;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
    }

    private boolean toHoveredState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        } else if (!this.mHovered) {
            this.mHovered = true;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredState, HOVER_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        } else if (!this.mActivated) {
            return false;
        } else {
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mHoveredState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        }
    }

    private boolean toNormalState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mNormalState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        } else if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mNormalState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        } else if (!this.mActivated) {
            return false;
        } else {
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.mo6815to(this.mNormalState, ACTIVATE_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        }
    }

    private boolean toPressedState() {
        if (this.mPressed) {
            return false;
        }
        if (USE_FOLME) {
            this.mStyle.mo6815to(this.mPressedState, PRESS_ENTER_CONFIG);
        } else {
            setAlphaF(this.mPressedAlpha);
        }
        this.mPressed = true;
        this.mHovered = false;
        this.mActivated = false;
        return true;
    }

    public void draw(Canvas canvas) {
        if (USE_SMOOTH_ROUND_RECT) {
            canvas.drawPath(this.mPath, this.mPaint);
            return;
        }
        RectF rectF = this.mRect;
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.mPaint);
    }

    public float getAlphaF() {
        return ((float) this.mPaint.getAlpha()) / 255.0f;
    }

    public int getOpacity() {
        return 0;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        init(resources, attributeSet, theme);
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        if (USE_FOLME) {
            IStateStyle iStateStyle = this.mStyle;
            iStateStyle.setTo((Object) iStateStyle.getCurrentState());
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.mRect.set(rect);
        calculatePath();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return (StateSet.stateSetMatches(STATE_PRESSED, iArr) || StateSet.stateSetMatches(STATE_DRAG_HOVERED, iArr)) ? toPressedState() : StateSet.stateSetMatches(STATE_HOVERED_ACTIVATED, iArr) ? toHoveredActivatedState() : StateSet.stateSetMatches(STATE_HOVERED, iArr) ? toHoveredState() : StateSet.stateSetMatches(STATE_ACTIVATED, iArr) ? toActivatedState() : toNormalState();
    }

    public void setAlpha(int i) {
    }

    public void setAlphaF(float f) {
        this.mPaint.setAlpha((int) (f * 255.0f));
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadius(int i) {
        if (this.mRadius != i) {
            this.mRadius = i;
            invalidateSelf();
        }
    }
}
