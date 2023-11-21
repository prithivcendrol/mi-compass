package com.miui.compass;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public class Rotation3DLayout extends FrameLayout {

    /* renamed from: u */
    private static final float f5301u = m6215j(10.0f);

    /* renamed from: v */
    private static final float[] f5302v = {1.0f, -0.5f, 0.25f, 0.0f};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f5303d;

    /* renamed from: e */
    private float f5304e;

    /* renamed from: f */
    private int f5305f;

    /* renamed from: g */
    private float[] f5306g;

    /* renamed from: h */
    private float[] f5307h;

    /* renamed from: i */
    private float[] f5308i;

    /* renamed from: j */
    private long f5309j;

    /* renamed from: k */
    private boolean f5310k;

    /* renamed from: l */
    private boolean f5311l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5312m;

    /* renamed from: n */
    private boolean f5313n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f5314o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f5315p;

    /* renamed from: q */
    private AnimatorSet f5316q;

    /* renamed from: r */
    private Sensor f5317r;

    /* renamed from: s */
    private SensorManager f5318s;

    /* renamed from: t */
    private SensorEventListener f5319t;

    /* renamed from: com.miui.compass.Rotation3DLayout$a */
    class C1391a implements Animator.AnimatorListener {
        C1391a() {
        }

        public void onAnimationCancel(Animator animator) {
            boolean unused = Rotation3DLayout.this.f5312m = false;
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = Rotation3DLayout.this.f5312m = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            boolean unused = Rotation3DLayout.this.f5312m = true;
        }
    }

    /* renamed from: com.miui.compass.Rotation3DLayout$b */
    class C1392b implements ValueAnimator.AnimatorUpdateListener {
        C1392b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Rotation3DLayout.this.m6216l(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.miui.compass.Rotation3DLayout$c */
    class C1393c implements ValueAnimator.AnimatorUpdateListener {
        C1393c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Rotation3DLayout.this.m6217m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.miui.compass.Rotation3DLayout$d */
    private static class C1394d implements SensorEventListener {

        /* renamed from: a */
        private final WeakReference<Rotation3DLayout> f5323a;

        public C1394d(Rotation3DLayout rotation3DLayout) {
            this.f5323a = new WeakReference<>(rotation3DLayout);
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            Rotation3DLayout rotation3DLayout = this.f5323a.get();
            if (rotation3DLayout == null) {
                Log.w("Compass:Rotation3DLayout", "onSensorChanged, rotation3DLayout is null");
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[1];
            float f2 = fArr[2];
            if (Math.abs(f) < 45.0f) {
                float unused = rotation3DLayout.f5314o = (rotation3DLayout.f5303d * f) / 45.0f;
                rotation3DLayout.setRotationX(rotation3DLayout.f5314o);
            }
            if (Math.abs(f2) < 45.0f) {
                float unused2 = rotation3DLayout.f5315p = ((-rotation3DLayout.f5303d) * f2) / 45.0f;
                rotation3DLayout.setRotationY(rotation3DLayout.f5315p);
            }
        }
    }

    /* renamed from: com.miui.compass.Rotation3DLayout$e */
    public static class C1395e extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f5324a = 0;

        public C1395e(int i, int i2) {
            super(i, i2);
        }

        public C1395e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1432s.f5574v1);
            this.f5324a = obtainStyledAttributes.getInt(1, this.f5324a);
            obtainStyledAttributes.recycle();
        }

        public C1395e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Rotation3DLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Rotation3DLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5303d = 10.0f;
        this.f5304e = f5301u;
        this.f5305f = 300;
        float[] fArr = f5302v;
        this.f5306g = fArr;
        this.f5307h = new float[fArr.length];
        this.f5308i = new float[fArr.length];
        this.f5309j = 0;
        this.f5310k = true;
        this.f5311l = false;
        this.f5312m = false;
        this.f5313n = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1432s.f5571u1, i, 0);
        setMaxRotationDegree(obtainStyledAttributes.getFloat(1, this.f5303d));
        this.f5313n = obtainStyledAttributes.getBoolean(0, this.f5313n);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: i */
    private int m6214i(int i, float f) {
        return (int) (Math.sin(Math.toRadians((double) f)) * ((double) i));
    }

    /* renamed from: j */
    private static float m6215j(float f) {
        return f / (((float) CompassApplication.m6126d().getResources().getDisplayMetrics().widthPixels) / 2.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m6216l(float f, boolean z) {
        float abs = Math.abs(f);
        float f2 = this.f5303d;
        if (abs > f2) {
            f = f > 0.0f ? f2 : -f2;
        }
        if (f != getRotationX()) {
            if (z || (!this.f5311l && !this.f5312m)) {
                super.setRotationX(f);
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m6217m(float f, boolean z) {
        float abs = Math.abs(f);
        float f2 = this.f5303d;
        if (abs > f2) {
            f = f > 0.0f ? f2 : -f2;
        }
        if (f != getRotationY()) {
            if (z || (!this.f5311l && !this.f5312m)) {
                super.setRotationY(f);
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        mo5326o();
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1395e(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1395e(layoutParams);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1395e(getContext(), attributeSet);
    }

    public float getMaxRotationDegree() {
        return this.f5303d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo5324k() {
        if (this.f5316q == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5316q = animatorSet;
            animatorSet.addListener(new C1391a());
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(new DecelerateInterpolator(0.75f));
            valueAnimator.addUpdateListener(new C1392b());
            valueAnimator.setDuration((long) this.f5305f);
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setInterpolator(new DecelerateInterpolator(0.75f));
            valueAnimator2.addUpdateListener(new C1393c());
            valueAnimator2.setDuration((long) this.f5305f);
            this.f5316q.playTogether(new Animator[]{valueAnimator, valueAnimator2});
        }
        this.f5316q.cancel();
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        int i = 0;
        while (true) {
            float[] fArr = this.f5306g;
            if (i < fArr.length) {
                this.f5307h[i] = this.f5314o + (fArr[i] * rotationX);
                this.f5308i[i] = this.f5315p + (fArr[i] * rotationY);
                i++;
            } else {
                ((ValueAnimator) this.f5316q.getChildAnimations().get(0)).setFloatValues(this.f5307h);
                ((ValueAnimator) this.f5316q.getChildAnimations().get(1)).setFloatValues(this.f5308i);
                this.f5316q.start();
                return;
            }
        }
    }

    /* renamed from: n */
    public void mo5325n() {
        if (this.f5318s == null) {
            this.f5318s = (SensorManager) getContext().getSystemService("sensor");
        }
        if (this.f5319t == null) {
            this.f5319t = new C1394d(this);
        }
        Sensor defaultSensor = this.f5318s.getDefaultSensor(3);
        this.f5317r = defaultSensor;
        this.f5318s.registerListener(this.f5319t, defaultSensor, 1);
    }

    /* renamed from: o */
    public void mo5326o() {
        SensorManager sensorManager = this.f5318s;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f5319t, this.f5317r);
            this.f5317r = null;
            this.f5318s = null;
            mo5324k();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5310k) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r16.getChildCount()
            int r2 = r16.getPaddingLeft()
            int r3 = r20 - r18
            int r4 = r16.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r16.getPaddingTop()
            int r5 = r21 - r19
            int r6 = r16.getPaddingBottom()
            int r5 = r5 - r6
            r6 = 0
            r7 = r6
        L_0x001e:
            if (r7 >= r1) goto L_0x00b3
            android.view.View r8 = r0.getChildAt(r7)
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 == r10) goto L_0x00af
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.miui.compass.Rotation3DLayout$e r9 = (com.miui.compass.Rotation3DLayout.C1395e) r9
            int r10 = r8.getMeasuredWidth()
            int r11 = r8.getMeasuredHeight()
            int r12 = r9.gravity
            r13 = -1
            if (r12 != r13) goto L_0x0042
            r12 = 8388659(0x800033, float:1.1755015E-38)
        L_0x0042:
            int r13 = android.view.Gravity.getAbsoluteGravity(r12, r6)
            r12 = r12 & 112(0x70, float:1.57E-43)
            r13 = r13 & 7
            r14 = 1
            if (r13 == r14) goto L_0x005a
            r14 = 3
            if (r13 == r14) goto L_0x0053
            r14 = 5
            if (r13 == r14) goto L_0x0057
        L_0x0053:
            int r13 = r9.leftMargin
            int r13 = r13 + r2
            goto L_0x0066
        L_0x0057:
            int r13 = r3 - r10
            goto L_0x0063
        L_0x005a:
            int r13 = r3 - r2
            int r13 = r13 - r10
            int r13 = r13 / 2
            int r13 = r13 + r2
            int r14 = r9.leftMargin
            int r13 = r13 + r14
        L_0x0063:
            int r14 = r9.rightMargin
            int r13 = r13 - r14
        L_0x0066:
            r14 = 16
            if (r12 == r14) goto L_0x007a
            r14 = 48
            if (r12 == r14) goto L_0x0076
            r14 = 80
            if (r12 == r14) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            int r12 = r5 - r11
            goto L_0x0083
        L_0x0076:
            int r12 = r9.topMargin
            int r12 = r12 + r4
            goto L_0x0086
        L_0x007a:
            int r12 = r5 - r4
            int r12 = r12 - r11
            int r12 = r12 / 2
            int r12 = r12 + r4
            int r14 = r9.topMargin
            int r12 = r12 + r14
        L_0x0083:
            int r14 = r9.bottomMargin
            int r12 = r12 - r14
        L_0x0086:
            int r14 = r9.f5324a
            float r15 = r16.getRotationY()
            int r14 = r0.m6214i(r14, r15)
            int r13 = r13 + r14
            int r9 = r9.f5324a
            float r14 = r16.getRotationX()
            int r9 = r0.m6214i(r9, r14)
            int r12 = r12 - r9
            if (r17 != 0) goto L_0x00aa
            int r9 = r8.getLeft()
            if (r13 != r9) goto L_0x00aa
            int r9 = r8.getTop()
            if (r12 == r9) goto L_0x00af
        L_0x00aa:
            int r10 = r10 + r13
            int r11 = r11 + r12
            r8.layout(r13, r12, r10, r11)
        L_0x00af:
            int r7 = r7 + 1
            goto L_0x001e
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.Rotation3DLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f5310k
            if (r0 != 0) goto L_0x0009
            boolean r8 = super.onTouchEvent(r8)
            return r8
        L_0x0009:
            int r0 = r8.getAction()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            if (r0 == r1) goto L_0x0019
            r1 = 3
            if (r0 == r1) goto L_0x0031
            goto L_0x008a
        L_0x0019:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f5309j
            long r3 = r3 - r5
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0038
        L_0x0031:
            r7.mo5324k()
            r0 = 0
            r7.f5311l = r0
            goto L_0x008a
        L_0x0038:
            int r0 = r8.getAction()
            if (r0 != 0) goto L_0x0044
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.f5309j = r3
        L_0x0044:
            float r0 = r8.getX()
            r3 = 0
            float r0 = java.lang.Math.max(r3, r0)
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r0 = java.lang.Math.min(r0, r4)
            float r4 = r8.getY()
            float r3 = java.lang.Math.max(r3, r4)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r3 = java.lang.Math.min(r3, r4)
            int r4 = r7.getWidth()
            int r4 = r4 / r1
            int r5 = r7.getHeight()
            int r5 = r5 / r1
            android.animation.AnimatorSet r1 = r7.f5316q
            if (r1 == 0) goto L_0x0078
            r1.cancel()
        L_0x0078:
            float r1 = (float) r5
            float r1 = r1 - r3
            float r3 = r7.f5304e
            float r1 = r1 * r3
            r7.m6216l(r1, r2)
            float r1 = (float) r4
            float r0 = r0 - r1
            float r1 = r7.f5304e
            float r0 = r0 * r1
            r7.m6217m(r0, r2)
            r7.f5311l = r2
        L_0x008a:
            super.onTouchEvent(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.Rotation3DLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo5326o();
        } else if (this.f5313n) {
            mo5325n();
        }
    }

    public void setMaxRotationDegree(float f) {
        this.f5303d = f;
        this.f5304e = m6215j(f);
    }

    public void setResetAnimDuration(int i) {
        this.f5305f = i;
    }

    public void setResetBouncePatterns(float[] fArr) {
        if (fArr != null && fArr.length > 1) {
            this.f5306g = fArr;
            this.f5307h = new float[fArr.length];
            this.f5308i = new float[fArr.length];
        }
    }

    public void setRotationX(float f) {
        m6216l(f, false);
    }

    public void setRotationY(float f) {
        m6217m(f, false);
    }
}
