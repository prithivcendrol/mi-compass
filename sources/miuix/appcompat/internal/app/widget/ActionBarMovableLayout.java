package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import miuix.animation.internal.AnimTask;
import miuix.animation.utils.CommonUtils;
import miuix.appcompat.app.C2071a;
import p018c2.C1347c;
import p018c2.C1357m;
import p055i3.C1650d;

public class ActionBarMovableLayout extends ActionBarOverlayLayout {

    /* renamed from: G0 */
    private static final String f7881G0 = ActionBarMovableLayout.class.getSimpleName();

    /* renamed from: A0 */
    private int f7882A0 = 8;

    /* renamed from: B0 */
    private boolean f7883B0;

    /* renamed from: C0 */
    private boolean f7884C0 = true;

    /* renamed from: D0 */
    private boolean f7885D0;

    /* renamed from: E0 */
    private VelocityTracker f7886E0;

    /* renamed from: F0 */
    private C2071a.C2072a f7887F0;

    /* renamed from: l0 */
    private View f7888l0;

    /* renamed from: m0 */
    private OverScroller f7889m0;

    /* renamed from: n0 */
    private int f7890n0;

    /* renamed from: o0 */
    private boolean f7891o0;

    /* renamed from: p0 */
    private float f7892p0;

    /* renamed from: q0 */
    private float f7893q0;

    /* renamed from: r0 */
    private int f7894r0;

    /* renamed from: s0 */
    private int f7895s0 = -1;

    /* renamed from: t0 */
    private final int f7896t0;

    /* renamed from: u0 */
    private final int f7897u0;

    /* renamed from: v0 */
    private final int f7898v0;

    /* renamed from: w0 */
    private int f7899w0 = -1;

    /* renamed from: x0 */
    private int f7900x0;

    /* renamed from: y0 */
    private int f7901y0 = -1;

    /* renamed from: z0 */
    private int f7902z0;

    public ActionBarMovableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4812E, C1347c.f4563c, 0);
        if (C1650d.m6967a()) {
            this.f7900x0 = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4816F, 0);
        }
        this.f7899w0 = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4820G, -1);
        this.f7901y0 = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4824H, -1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7896t0 = viewConfiguration.getScaledTouchSlop();
        this.f7889m0 = new OverScroller(context);
        this.f7897u0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7898v0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setOverScrollMode(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: W */
    private boolean m8775W(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int y = (int) view.getY();
        int x = (int) view.getX();
        int y2 = (int) (view.getY() + ((float) view.getHeight()));
        int x2 = (int) (view.getX() + ((float) view.getWidth()));
        if (view == this.f7888l0) {
            int top = this.f7931e.getTop();
            y += top;
            y2 += top;
        }
        return i2 >= y && i2 < y2 && i >= x && i < x2;
    }

    /* renamed from: X */
    private void m8776X() {
        VelocityTracker velocityTracker = this.f7886E0;
        if (velocityTracker == null) {
            this.f7886E0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: Y */
    private void m8777Y() {
        if (this.f7886E0 == null) {
            this.f7886E0 = VelocityTracker.obtain();
        }
    }

    /* renamed from: Z */
    private boolean m8778Z() {
        int visibility;
        mo7795U();
        View view = this.f7888l0;
        if (view == null || (visibility = view.getVisibility()) == this.f7882A0) {
            return false;
        }
        this.f7882A0 = visibility;
        return true;
    }

    /* renamed from: e0 */
    private void m8779e0(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f7890n0) {
            int i = action == 0 ? 1 : 0;
            this.f7892p0 = (float) ((int) motionEvent.getY(i));
            this.f7890n0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f7886E0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: f0 */
    private void m8780f0() {
        VelocityTracker velocityTracker = this.f7886E0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7886E0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo7793S(float f) {
        float a0 = mo7797a0(f);
        this.f7933f.setTranslationY(a0);
        mo7795U();
        View view = this.f7888l0;
        if (view != null) {
            view.setTranslationY(a0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public int mo7794T() {
        VelocityTracker velocityTracker = this.f7886E0;
        velocityTracker.computeCurrentVelocity(CommonUtils.UNIT_SECOND, (float) this.f7898v0);
        return (int) velocityTracker.getYVelocity(this.f7890n0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo7795U() {
        this.f7888l0 = this.f7931e.getTabContainer();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo7796V(int i) {
        int overScrollDistance = getOverScrollDistance();
        this.f7889m0.fling(0, this.f7894r0, 0, i, 0, 0, 0, getScrollRange(), 0, overScrollDistance);
        this.f7885D0 = true;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public float mo7797a0(float f) {
        float f2 = ((((float) (-this.f7900x0)) + f) - ((float) this.f7899w0)) - ((float) this.f7902z0);
        mo7795U();
        View view = this.f7888l0;
        return (view == null || view.getVisibility() != 0) ? f2 : f2 - ((float) this.f7888l0.getHeight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo7798b0(float f) {
        mo7793S(f);
        C2071a.C2072a aVar = this.f7887F0;
        if (aVar != null) {
            aVar.mo7364c(this.f7895s0, f / ((float) this.f7899w0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo7799c0() {
        C2071a.C2072a aVar = this.f7887F0;
        if (aVar != null) {
            aVar.mo7366e();
        }
    }

    public void computeScroll() {
        if (this.f7889m0.computeScrollOffset()) {
            int i = this.f7894r0;
            int currY = this.f7889m0.getCurrY();
            if (i != currY) {
                overScrollBy(0, currY - i, 0, this.f7894r0, 0, getScrollRange(), 0, getOverScrollDistance(), true);
            }
            postInvalidateOnAnimation();
        } else if (this.f7885D0) {
            mo7808h0();
            this.f7885D0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollExtent() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        return getScrollRange();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo7803d0() {
        this.f7895s0 = -1;
        C2071a.C2072a aVar = this.f7887F0;
        if (aVar != null) {
            aVar.mo7362a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public boolean mo7804g0(MotionEvent motionEvent) {
        int i;
        C2071a.C2072a aVar;
        C2071a.C2072a aVar2;
        int i2 = this.f7890n0;
        int i3 = 0;
        if (i2 == -1) {
            return false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex == -1) {
            Log.w(f7881G0, "invalid pointer index");
            return false;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        int i4 = (int) (y - this.f7892p0);
        int abs = Math.abs(i4);
        int i5 = (int) x;
        int i6 = (int) y;
        boolean z = (m8775W(this.f7933f, i5, i6) || m8775W(this.f7888l0, i5, i6)) && abs > this.f7896t0 && abs > ((int) Math.abs(x - this.f7893q0)) && ((i = this.f7894r0) != 0 ? i4 <= 0 || i < getOverScrollDistance() || (aVar = this.f7887F0) == null || !aVar.mo7363b() : i4 >= 0 && ((aVar2 = this.f7887F0) == null || !aVar2.mo7363b()));
        if (z) {
            this.f7892p0 = y;
            this.f7893q0 = x;
            if (i4 > 0) {
                i3 = 1;
            }
            this.f7895s0 = i3;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return z;
    }

    public int getOverScrollDistance() {
        if (C1650d.m6967a()) {
            return this.f7900x0;
        }
        return 0;
    }

    public int getScrollRange() {
        return this.f7899w0;
    }

    public int getScrollStart() {
        return this.f7902z0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo7808h0() {
        if (this.f7884C0) {
            int scrollRange = getScrollRange();
            int i = this.f7894r0;
            this.f7889m0.startScroll(0, i, 0, i > scrollRange / 2 ? scrollRange - i : -i, 800);
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view != this.f7933f) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, ((((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.bottomMargin) + this.f7929d.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) this.f7929d.getLayoutParams()).topMargin) - getScrollRange()) - getOverScrollDistance()) - this.f7902z0, marginLayoutParams.height));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View contentMask = getContentMask();
        if (contentMask != null && contentMask.getVisibility() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.f7891o0) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            m8779e0(motionEvent);
                        }
                    }
                } else if (mo7804g0(motionEvent)) {
                    this.f7891o0 = true;
                    m8777Y();
                    this.f7886E0.addMovement(motionEvent);
                    mo7799c0();
                }
            }
            this.f7891o0 = false;
            this.f7890n0 = -1;
            m8780f0();
            mo7803d0();
        } else {
            this.f7892p0 = motionEvent.getY();
            this.f7893q0 = motionEvent.getX();
            this.f7890n0 = motionEvent.getPointerId(0);
            m8776X();
            this.f7886E0.addMovement(motionEvent);
            this.f7889m0.forceFinished(true);
        }
        return this.f7891o0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = !this.f7883B0 || m8778Z();
        if (!this.f7883B0) {
            if (this.f7901y0 < 0) {
                this.f7901y0 = this.f7899w0;
            }
            this.f7894r0 = this.f7901y0;
            this.f7883B0 = true;
        }
        if (z2) {
            mo7793S((float) this.f7894r0);
        }
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        C2071a.C2072a aVar;
        mo7798b0((float) i2);
        this.f7894r0 = i2;
        if (i2 == 0 && z2) {
            int T = mo7794T();
            if (Math.abs(T) > this.f7897u0 * 2 && (aVar = this.f7887F0) != null) {
                aVar.mo7365d(((float) (-T)) * 0.2f, AnimTask.MAX_TO_PAGE_SIZE);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        MotionEvent motionEvent2 = motionEvent;
        m8777Y();
        this.f7886E0.addMovement(motionEvent2);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f7892p0 = (float) ((int) motionEvent2.getY(actionIndex));
                            i = motionEvent2.getPointerId(actionIndex);
                        } else if (action == 6) {
                            m8779e0(motionEvent);
                            this.f7892p0 = (float) ((int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f7890n0)));
                        }
                    }
                } else if (this.f7891o0) {
                    int findPointerIndex = motionEvent2.findPointerIndex(this.f7890n0);
                    if (findPointerIndex == -1) {
                        return false;
                    }
                    float y = motionEvent2.getY(findPointerIndex);
                    boolean overScrollBy = overScrollBy(0, (int) (y - this.f7892p0), 0, this.f7894r0, 0, getScrollRange(), 0, getOverScrollDistance(), true);
                    this.f7892p0 = y;
                    if (overScrollBy) {
                        if (this.f7894r0 == 0) {
                            this.f7891o0 = false;
                            this.f7890n0 = -1;
                            motionEvent2.setAction(0);
                            dispatchTouchEvent(motionEvent);
                        }
                        this.f7886E0.clear();
                    }
                } else if (mo7804g0(motionEvent)) {
                    this.f7891o0 = true;
                    m8777Y();
                    this.f7886E0.addMovement(motionEvent2);
                    mo7799c0();
                }
                return true;
            }
            if (this.f7891o0) {
                this.f7891o0 = false;
                this.f7890n0 = -1;
                int T = mo7794T();
                if (Math.abs(T) > this.f7897u0) {
                    mo7796V(T);
                } else {
                    if (this.f7889m0.springBack(0, this.f7894r0, 0, 0, 0, getScrollRange())) {
                        invalidate();
                    } else {
                        mo7808h0();
                    }
                }
            }
            return true;
        }
        this.f7892p0 = motionEvent.getY();
        i = motionEvent2.getPointerId(0);
        this.f7890n0 = i;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int overScrollMode = getOverScrollMode();
        boolean z2 = true;
        int i9 = i4 + i2;
        if (!(overScrollMode == 0 || (overScrollMode == 1 && (computeVerticalScrollRange() > computeVerticalScrollExtent())))) {
            i8 = 0;
        }
        int i10 = i8 + i6;
        if (i9 > i10) {
            i9 = i10;
        } else if (i9 < 0) {
            i9 = 0;
        } else {
            z2 = false;
        }
        onOverScrolled(0, i9, false, z2);
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public void setInitialMotionY(int i) {
        this.f7901y0 = i;
    }

    public void setMotionY(int i) {
        this.f7894r0 = i;
        mo7798b0((float) i);
    }

    public void setOnScrollListener(C2071a.C2072a aVar) {
        this.f7887F0 = aVar;
    }

    public void setOverScrollDistance(int i) {
        if (C1650d.m6967a()) {
            this.f7900x0 = i;
        }
    }

    public void setScrollRange(int i) {
        this.f7899w0 = i;
    }

    public void setScrollStart(int i) {
        this.f7902z0 = i;
    }

    public void setSpringBackEnabled(boolean z) {
        this.f7884C0 = z;
    }
}
