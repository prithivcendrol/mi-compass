package com.miui.compass;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import java.security.InvalidParameterException;
import miuix.animation.utils.CommonUtils;

/* renamed from: com.miui.compass.x */
public class C1437x extends ViewGroup {

    /* renamed from: V */
    private static final LinearLayout.LayoutParams f5599V = new LinearLayout.LayoutParams(-1, -1, 1.0f);

    /* renamed from: W */
    private static final float f5600W = ((float) (0.016d / Math.log(0.75d)));

    /* renamed from: A */
    private float f5601A;

    /* renamed from: B */
    private int f5602B;

    /* renamed from: C */
    private ScaleGestureDetector f5603C;

    /* renamed from: D */
    protected float f5604D;

    /* renamed from: E */
    protected float f5605E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f5606F;

    /* renamed from: G */
    private boolean f5607G;

    /* renamed from: H */
    private boolean f5608H;

    /* renamed from: I */
    private boolean f5609I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f5610J;

    /* renamed from: K */
    private int f5611K;

    /* renamed from: L */
    private int f5612L;

    /* renamed from: M */
    private float f5613M;

    /* renamed from: N */
    private float f5614N;

    /* renamed from: O */
    private float f5615O;

    /* renamed from: P */
    private int f5616P;

    /* renamed from: Q */
    private C1441d f5617Q;

    /* renamed from: R */
    private int f5618R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public float f5619S;

    /* renamed from: T */
    private C1443f f5620T;

    /* renamed from: U */
    private C1438a f5621U;

    /* renamed from: d */
    private final float f5622d;

    /* renamed from: e */
    private boolean f5623e;

    /* renamed from: f */
    private int f5624f;

    /* renamed from: g */
    private int f5625g;

    /* renamed from: h */
    private C1442e f5626h;

    /* renamed from: i */
    private int f5627i;

    /* renamed from: j */
    private int f5628j;

    /* renamed from: k */
    private int f5629k;

    /* renamed from: l */
    protected int f5630l;

    /* renamed from: m */
    private int f5631m;

    /* renamed from: n */
    protected int f5632n;

    /* renamed from: o */
    protected int f5633o;

    /* renamed from: p */
    private int f5634p;

    /* renamed from: q */
    private int f5635q;

    /* renamed from: r */
    private int f5636r;

    /* renamed from: s */
    private int f5637s;

    /* renamed from: t */
    protected int f5638t;

    /* renamed from: u */
    private int f5639u;

    /* renamed from: v */
    private int f5640v;

    /* renamed from: w */
    private int f5641w;

    /* renamed from: x */
    private float f5642x;

    /* renamed from: y */
    private boolean f5643y;

    /* renamed from: z */
    private Scroller f5644z;

    /* renamed from: com.miui.compass.x$a */
    private class C1438a {

        /* renamed from: a */
        private VelocityTracker f5645a;

        /* renamed from: b */
        private int f5646b;

        /* renamed from: c */
        private float f5647c;

        /* renamed from: d */
        private float f5648d;

        private C1438a() {
            this.f5646b = -1;
            this.f5647c = -1.0f;
            this.f5648d = -1.0f;
        }

        /* synthetic */ C1438a(C1437x xVar, C1436w wVar) {
            this();
        }

        /* renamed from: f */
        private void m6417f() {
            this.f5646b = -1;
            float f = (float) -1;
            this.f5647c = f;
            this.f5648d = f;
        }

        /* renamed from: a */
        public void mo5466a(MotionEvent motionEvent) {
            if (this.f5645a == null) {
                this.f5645a = VelocityTracker.obtain();
            }
            this.f5645a.addMovement(motionEvent);
            float x = motionEvent.getX();
            int i = this.f5646b;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                if (findPointerIndex != -1) {
                    x = motionEvent.getX(findPointerIndex);
                } else {
                    this.f5646b = -1;
                }
            }
            if (this.f5647c < 0.0f) {
                this.f5647c = x;
                return;
            }
            int i2 = (this.f5648d > 0.0f ? 1 : (this.f5648d == 0.0f ? 0 : -1));
            this.f5648d = x;
        }

        /* renamed from: b */
        public int mo5467b(float f) {
            if (f <= 300.0f) {
                return 4;
            }
            if (Math.abs(this.f5648d - this.f5647c) > ((float) C1437x.this.f5610J)) {
                return this.f5648d > this.f5647c ? 1 : 2;
            }
            return 3;
        }

        /* renamed from: c */
        public float mo5468c(int i, int i2, int i3) {
            this.f5645a.computeCurrentVelocity(i, (float) i2);
            return this.f5645a.getXVelocity(i3);
        }

        /* renamed from: d */
        public void mo5469d(int i) {
            VelocityTracker velocityTracker = this.f5645a;
            if (velocityTracker == null) {
                this.f5645a = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            m6417f();
            this.f5646b = i;
        }

        /* renamed from: e */
        public void mo5470e() {
            VelocityTracker velocityTracker = this.f5645a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5645a = null;
            }
            m6417f();
        }
    }

    /* renamed from: com.miui.compass.x$b */
    private interface C1439b {
    }

    /* renamed from: com.miui.compass.x$c */
    private class C1440c implements ScaleGestureDetector.OnScaleGestureListener {
        private C1440c() {
        }

        /* synthetic */ C1440c(C1437x xVar, C1436w wVar) {
            this();
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (C1437x.this.f5606F == 0 && (((float) scaleGestureDetector.getTimeDelta()) > 200.0f || scaleFactor < 0.95f || scaleFactor > 1.0526316f)) {
                C1437x.this.m6403x((MotionEvent) null, 4);
            }
            if (scaleFactor < 0.8f) {
                C1437x.this.mo5430o(scaleGestureDetector);
                return true;
            } else if (scaleFactor <= 1.2f) {
                return false;
            } else {
                C1437x.this.mo5436p(scaleGestureDetector);
                return true;
            }
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return C1437x.this.f5606F == 0;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C1437x.this.mo5429l();
        }
    }

    /* renamed from: com.miui.compass.x$d */
    private class C1441d implements Interpolator {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f5651a;

        public C1441d() {
            this.f5651a = C1437x.this.f5619S;
        }

        /* renamed from: b */
        public void mo5474b() {
            this.f5651a = 0.0f;
        }

        /* renamed from: c */
        public void mo5475c(int i, int i2) {
            this.f5651a = i > 0 ? C1437x.this.f5619S / ((float) i) : C1437x.this.f5619S;
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            float f3 = this.f5651a;
            return (f2 * f2 * (((f3 + 1.0f) * f2) + f3)) + 1.0f;
        }
    }

    /* renamed from: com.miui.compass.x$e */
    private class C1442e extends LinearLayout implements C1439b {
        public C1442e(Context context) {
            super(context);
        }
    }

    /* renamed from: com.miui.compass.x$f */
    public interface C1443f {
        /* renamed from: a */
        void mo5275a(C1437x xVar);

        /* renamed from: b */
        void mo5276b(C1437x xVar);
    }

    public C1437x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1437x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5622d = Resources.getSystem().getDisplayMetrics().density * 1280.0f;
        this.f5623e = true;
        this.f5625g = 2131231675;
        this.f5632n = 1;
        this.f5634p = 0;
        this.f5635q = 0;
        this.f5639u = -1;
        this.f5642x = 0.33333334f;
        this.f5601A = 0.5f;
        this.f5602B = 0;
        this.f5606F = 0;
        this.f5609I = true;
        this.f5612L = -1;
        this.f5615O = 0.5f;
        this.f5616P = 300;
        this.f5618R = 0;
        this.f5619S = 1.3f;
        this.f5621U = new C1438a(this, (C1436w) null);
        m6396m();
    }

    /* renamed from: E */
    private int m6384E(int i, boolean z) {
        return (z || !m6397n()) ? i : m6400u(i);
    }

    /* renamed from: F */
    private int m6385F(int i) {
        return m6397n() ? m6400u(i) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        r11.setPivotX(0.0f);
        r11.setPivotY(0.0f);
        r11.setRotation(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        r11.setRotationX(0.0f);
        r11.setRotationY(0.0f);
        m6402w(r11, r10.f5622d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ec, code lost:
        r11.setRotationY((-r5) * r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f1, code lost:
        m6402w(r11, 5000.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x017f, code lost:
        mo5464t(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6386G(android.view.View r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.miui.compass.C1437x.C1439b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r11.getMeasuredWidth()
            float r0 = (float) r0
            int r1 = r11.getMeasuredHeight()
            float r1 = (float) r1
            int r2 = r10.getMeasuredWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r4 = r0 / r3
            float r3 = r1 / r3
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r5 = r5 + r2
            int r2 = r11.getLeft()
            float r2 = (float) r2
            float r5 = r5 - r2
            float r5 = r5 - r4
            float r5 = r5 / r0
            int r2 = r10.f5618R
            r6 = 1167867904(0x459c4000, float:5000.0)
            r7 = 1050253722(0x3e99999a, float:0.3)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            switch(r2) {
                case 0: goto L_0x017f;
                case 1: goto L_0x017f;
                case 2: goto L_0x0156;
                case 3: goto L_0x012b;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00b0;
                case 6: goto L_0x0037;
                case 7: goto L_0x0072;
                case 8: goto L_0x003e;
                case 9: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0182
        L_0x0039:
            r10.mo5417H(r11, r5)
            goto L_0x0182
        L_0x003e:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            float r1 = java.lang.Math.abs(r5)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            goto L_0x017f
        L_0x004c:
            float r1 = java.lang.Math.abs(r5)
            float r1 = r8 - r1
            r11.setAlpha(r1)
            float r0 = r0 * r5
            r11.setTranslationX(r0)
            r11.setTranslationY(r9)
            r11.setScaleX(r8)
            r11.setScaleY(r8)
            r11.setPivotX(r4)
            r11.setPivotY(r3)
            r11.setRotation(r9)
            r11.setRotationX(r9)
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x00ec
        L_0x0072:
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0078
            goto L_0x017f
        L_0x0078:
            float r2 = r8 - r5
            r11.setAlpha(r2)
            r3 = 1058642330(0x3f19999a, float:0.6)
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 * r4
            float r2 = r2 + r3
            float r8 = r8 - r2
            float r0 = r0 * r8
            r3 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r3
            r11.setTranslationX(r0)
            float r1 = r1 * r8
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            r11.setTranslationY(r1)
            r11.setScaleX(r2)
            r11.setScaleY(r2)
        L_0x009a:
            r11.setPivotX(r9)
            r11.setPivotY(r9)
            r11.setRotation(r9)
        L_0x00a3:
            r11.setRotationX(r9)
            r11.setRotationY(r9)
            float r0 = r10.f5622d
            r10.m6402w(r11, r0)
            goto L_0x0182
        L_0x00b0:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            float r1 = java.lang.Math.abs(r5)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00be
            goto L_0x017f
        L_0x00be:
            float r1 = java.lang.Math.abs(r5)
            float r1 = r8 - r1
            r11.setAlpha(r1)
            r11.setTranslationY(r9)
            float r1 = r0 * r5
            float r2 = java.lang.Math.abs(r5)
            float r0 = r0 * r2
            float r0 = r0 * r7
            float r1 = r1 - r0
            r11.setTranslationX(r1)
            float r7 = r7 * r5
            float r7 = r7 + r8
            r11.setScaleX(r7)
            r11.setScaleY(r7)
            r11.setPivotX(r9)
            r11.setPivotY(r3)
            r11.setRotation(r9)
            r11.setRotationX(r9)
            r0 = 1110704128(0x42340000, float:45.0)
        L_0x00ec:
            float r1 = -r5
            float r1 = r1 * r0
            r11.setRotationY(r1)
        L_0x00f1:
            r10.m6402w(r11, r6)
            goto L_0x0182
        L_0x00f6:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            float r1 = java.lang.Math.abs(r5)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0104
            goto L_0x017f
        L_0x0104:
            r11.setAlpha(r8)
            r11.setTranslationX(r9)
            r11.setTranslationY(r9)
            r11.setScaleX(r8)
            r11.setScaleY(r8)
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0118
            r0 = r9
        L_0x0118:
            r11.setPivotX(r0)
            r11.setPivotY(r3)
            r11.setRotation(r9)
            r11.setRotationX(r9)
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r5 = r5 * r0
            r11.setRotationY(r5)
            goto L_0x00f1
        L_0x012b:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x017f
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0138
            goto L_0x017f
        L_0x0138:
            r11.setAlpha(r8)
            r11.setTranslationX(r9)
            r11.setTranslationY(r9)
            r11.setScaleX(r8)
            r11.setScaleY(r8)
            r11.setPivotX(r4)
            r11.setPivotY(r1)
            float r0 = -r5
            r1 = 1106247680(0x41f00000, float:30.0)
            float r0 = r0 * r1
            r11.setRotation(r0)
            goto L_0x00a3
        L_0x0156:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x017f
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0163
            goto L_0x017f
        L_0x0163:
            float r0 = java.lang.Math.abs(r5)
            float r0 = r8 - r0
            r1 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r1
            float r0 = r0 + r7
            r11.setAlpha(r0)
            r11.setTranslationX(r9)
            r11.setTranslationY(r9)
            r11.setScaleX(r8)
            r11.setScaleY(r8)
            goto L_0x009a
        L_0x017f:
            r10.mo5464t(r11)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.C1437x.m6386G(android.view.View):void");
    }

    /* renamed from: I */
    private void m6387I() {
        int i;
        int i2 = this.f5629k;
        if (i2 == 0) {
            i = this.f5630l;
        } else if (i2 == 1) {
            i = 0;
        } else if (i2 != 2) {
            if (i2 == 3) {
                i = this.f5635q - this.f5633o;
            }
            this.f5631m += getPaddingLeft();
        } else {
            i = (this.f5635q - this.f5633o) / 2;
        }
        this.f5631m = i;
        this.f5631m += getPaddingLeft();
    }

    /* renamed from: h */
    private ImageView m6392h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(this.f5625g);
        return imageView;
    }

    /* renamed from: i */
    private View m6393i(int i, boolean z) {
        if (i < 0 || i >= getScreenCount()) {
            return null;
        }
        return getChildAt(m6384E(i, z));
    }

    /* renamed from: j */
    private void m6394j(int i, boolean z) {
        int E = m6384E(i, z);
        if (this.f5643y) {
            E -= E % this.f5632n;
        }
        measure(this.f5636r, this.f5637s);
        scrollTo((this.f5633o * E) - this.f5631m, 0);
    }

    /* renamed from: k */
    private void m6395k(int i, boolean z) {
        int i2;
        if (this.f5643y) {
            int max = Math.max(0, Math.min(i, getScreenCount() - 1));
            i2 = max - (max % this.f5632n);
        } else {
            i2 = Math.max(0, Math.min(i, getScreenCount() - this.f5632n));
        }
        setCurrentScreenInner(m6384E(i2, z));
        if (!this.f5623e) {
            if (!this.f5644z.isFinished()) {
                this.f5644z.abortAnimation();
            }
            m6394j(this.f5638t, true);
            invalidate();
        }
    }

    /* renamed from: m */
    private void m6396m() {
        setAlwaysDrawnWithCacheEnabled(true);
        setClipToPadding(true);
        this.f5617Q = new C1441d();
        this.f5644z = new Scroller(getContext(), this.f5617Q);
        setCurrentScreenInner(0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5610J = viewConfiguration.getScaledTouchSlop();
        setMaximumSnapVelocity(viewConfiguration.getScaledMaximumFlingVelocity());
        this.f5603C = new ScaleGestureDetector(getContext(), new C1440c(this, (C1436w) null));
    }

    /* renamed from: n */
    private boolean m6397n() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: q */
    private void m6398q(MotionEvent motionEvent) {
        this.f5621U.mo5466a(motionEvent);
        int i = this.f5606F;
        if (i == 0 || 4 == i) {
            this.f5603C.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: r */
    private void m6399r() {
        int i = this.f5633o;
        this.f5641w = ((int) (((float) (-i)) * this.f5642x)) - this.f5631m;
        this.f5640v = !this.f5643y ? ((int) ((((float) i) * (((float) getScreenCount()) + this.f5642x)) - ((float) this.f5635q))) + this.f5631m : (int) (((float) (((getScreenCount() - 1) / this.f5632n) * this.f5635q)) + (((float) this.f5633o) * this.f5642x));
    }

    private void setCurrentScreenInner(int i) {
        this.f5638t = i;
        this.f5639u = -1;
    }

    /* renamed from: u */
    private int m6400u(int i) {
        return (getScreenCount() - 1) - i;
    }

    /* renamed from: v */
    private boolean m6401v(MotionEvent motionEvent) {
        float abs = Math.abs(motionEvent.getX(0) - this.f5604D);
        return abs > Math.abs(motionEvent.getY(0) - this.f5605E) * this.f5615O && abs > ((float) (this.f5610J * motionEvent.getPointerCount()));
    }

    /* renamed from: w */
    private void m6402w(View view, float f) {
        if (view.getCameraDistance() != f) {
            view.setCameraDistance(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m6403x(MotionEvent motionEvent, int i) {
        this.f5606F = i;
        getParent().requestDisallowInterceptTouchEvent(this.f5606F != 0);
        if (this.f5606F == 0) {
            this.f5612L = -1;
            this.f5609I = false;
            this.f5621U.mo5470e();
            return;
        }
        if (motionEvent != null) {
            int pointerId = motionEvent.getPointerId(0);
            this.f5612L = pointerId;
            this.f5604D = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
        }
        if (this.f5609I) {
            this.f5609I = false;
            View childAt = getChildAt(this.f5638t);
            if (childAt != null) {
                childAt.cancelLongPress();
            }
        }
        if (this.f5606F == 1) {
            this.f5614N = (float) getScrollX();
            this.f5613M = ((float) System.nanoTime()) / 1.0E9f;
        }
    }

    /* renamed from: y */
    private void m6404y(int i) {
        if (this.f5633o > 0 && getCurrentScreen() != null) {
            int c = (int) this.f5621U.mo5468c(CommonUtils.UNIT_SECOND, this.f5611K, i);
            mo5465z(c, this.f5621U.mo5467b((float) Math.abs(c)));
        }
    }

    /* renamed from: A */
    public void mo5273A(int i) {
        mo5274B(m6384E(i, false), 0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo5274B(int i, int i2, boolean z) {
        mo5415C(i, i2, z, (C1443f) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5415C(int i, int i2, boolean z, C1443f fVar) {
        int i3;
        if (this.f5635q > 0) {
            if (this.f5643y) {
                int max = Math.max(0, Math.min(i, getScreenCount() - 1));
                this.f5639u = max;
                i3 = max - (max % this.f5632n);
            } else {
                i3 = Math.max(0, Math.min(i, getScreenCount() - this.f5632n));
            }
            this.f5639u = i3;
            int max2 = Math.max(1, Math.abs(this.f5639u - this.f5638t));
            if (!this.f5644z.isFinished()) {
                C1443f fVar2 = this.f5620T;
                if (fVar2 != null) {
                    fVar2.mo5276b(this);
                }
                this.f5644z.abortAnimation();
            }
            this.f5620T = fVar;
            int abs = Math.abs(i2);
            if (z) {
                this.f5617Q.mo5475c(max2, abs);
            } else {
                this.f5617Q.mo5474b();
            }
            int scrollX = ((this.f5639u * this.f5633o) - this.f5631m) - getScrollX();
            if (scrollX != 0) {
                int abs2 = Math.abs(scrollX);
                int i4 = this.f5616P;
                int i5 = (abs2 * i4) / this.f5635q;
                if (abs > 0) {
                    i5 += (int) ((((float) i5) / (((float) abs) / 2500.0f)) * 0.4f);
                }
                int max3 = Math.max(i4, i5);
                this.f5644z.startScroll(getScrollX(), 0, scrollX, 0, max2 <= 1 ? Math.min(max3, this.f5616P * 2) : max3);
                invalidate();
            }
        }
    }

    /* renamed from: D */
    public void mo5416D(int i, C1443f fVar) {
        mo5415C(m6384E(i, false), 0, false, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5417H(View view, float f) {
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int screenCount = getScreenCount();
        boolean n = m6397n();
        int i2 = 0;
        if (i >= 0) {
            if (n) {
                i2 = screenCount - i;
            }
            screenCount = Math.min(i, screenCount);
        }
        if (n) {
            screenCount = i2;
        }
        C1442e eVar = this.f5626h;
        if (eVar != null) {
            eVar.addView(m6392h(), screenCount, f5599V);
        }
        this.f5602B++;
        m6399r();
        super.addView(view, screenCount, layoutParams);
    }

    public void computeScroll() {
        if (this.f5644z.computeScrollOffset()) {
            this.f5614N = (float) this.f5644z.getCurrX();
            setScrollX(this.f5644z.getCurrX());
            this.f5613M = ((float) System.nanoTime()) / 1.0E9f;
            setScrollY(this.f5644z.getCurrY());
            postInvalidateOnAnimation();
            return;
        }
        int i = this.f5639u;
        if (i != -1) {
            setCurrentScreenInner(Math.max(0, Math.min(i, getScreenCount() - 1)));
            this.f5639u = -1;
            C1443f fVar = this.f5620T;
            if (fVar != null) {
                fVar.mo5275a(this);
                this.f5620T = null;
            }
        } else if (this.f5606F == 1) {
            float nanoTime = ((float) System.nanoTime()) / 1.0E9f;
            float scrollX = this.f5614N - ((float) getScrollX());
            setScrollX((int) (((float) getScrollX()) + (((float) Math.exp((double) ((nanoTime - this.f5613M) / f5600W))) * scrollX)));
            this.f5613M = nanoTime;
            if (scrollX > 1.0f || scrollX < -1.0f) {
                postInvalidate();
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (i == 17) {
            int i2 = this.f5638t;
            if (i2 > 0) {
                mo5274B(i2 - 1, 0, false);
                return true;
            }
        } else if (i == 66 && this.f5638t < getScreenCount() - 1) {
            mo5274B(this.f5638t + 1, 0, false);
            return true;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        m6386G(view);
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5422g(View view, FrameLayout.LayoutParams layoutParams) {
        this.f5624f++;
        super.addView(view, -1, layoutParams);
    }

    public View getCurrentScreen() {
        return m6393i(this.f5638t, true);
    }

    public int getCurrentScreenIndex() {
        int i = this.f5639u;
        if (i == -1) {
            i = this.f5638t;
        }
        return m6385F(i);
    }

    public final int getScreenCount() {
        return this.f5602B;
    }

    public int getScreenTransitionType() {
        return this.f5618R;
    }

    /* access modifiers changed from: protected */
    public int getTouchState() {
        return this.f5606F;
    }

    public int getVisibleRange() {
        return this.f5632n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5429l() {
        this.f5608H = true;
        m6403x((MotionEvent) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5430o(ScaleGestureDetector scaleGestureDetector) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        computeScroll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0 != 3) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (m6401v(r6) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r4) goto L_0x0021
            if (r0 == r1) goto L_0x0013
            if (r0 == r2) goto L_0x0021
            goto L_0x0053
        L_0x0013:
            r5.m6398q(r6)
            int r0 = r5.f5606F
            if (r0 != 0) goto L_0x0053
            boolean r0 = r5.m6401v(r6)
            if (r0 == 0) goto L_0x0053
            goto L_0x0050
        L_0x0021:
            r5.m6403x(r6, r3)
            goto L_0x0053
        L_0x0025:
            r6.setAction(r2)
            android.view.ScaleGestureDetector r0 = r5.f5603C
            r0.onTouchEvent(r6)
            r6.setAction(r3)
            r5.f5608H = r3
            r5.f5607G = r3
            float r0 = r6.getX()
            r5.f5604D = r0
            float r0 = r6.getY()
            r5.f5605E = r0
            android.widget.Scroller r0 = r5.f5644z
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x004b
            r5.f5609I = r4
            goto L_0x0053
        L_0x004b:
            android.widget.Scroller r0 = r5.f5644z
            r0.abortAnimation()
        L_0x0050:
            r5.m6403x(r6, r4)
        L_0x0053:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x005e
            r5.m6398q(r6)
        L_0x005e:
            boolean r6 = r5.f5608H
            if (r6 != 0) goto L_0x0068
            int r6 = r5.f5606F
            if (r6 == 0) goto L_0x0069
            if (r6 == r2) goto L_0x0069
        L_0x0068:
            r3 = r4
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.C1437x.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int screenCount = getScreenCount();
        int i6 = 0;
        for (int i7 = 0; i7 < screenCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.layout(i6, getPaddingTop() + this.f5627i, childAt.getMeasuredWidth() + i6, getPaddingTop() + this.f5627i + childAt.getMeasuredHeight());
                i6 += childAt.getMeasuredWidth();
            }
        }
        if (this.f5643y) {
            int i8 = this.f5638t;
            int i9 = this.f5632n;
            if (i8 % i9 > 0) {
                i5 = i8 - (i8 % i9);
                m6395k(i5, true);
                this.f5634p = this.f5635q;
            }
        }
        int i10 = this.f5634p;
        if (i10 > 0 && i10 != this.f5635q) {
            i5 = this.f5638t;
            m6395k(i5, true);
        }
        this.f5634p = this.f5635q;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f5636r = i;
        this.f5637s = i2;
        int screenCount = getScreenCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5624f; i5++) {
            View childAt = getChildAt(i5 + screenCount);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + this.f5627i + getPaddingBottom() + this.f5628j, layoutParams.height));
            i3 = Math.max(i3, childAt.getMeasuredWidth());
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < screenCount; i8++) {
            View childAt2 = getChildAt(i8);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            childAt2.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams2.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + this.f5627i + getPaddingBottom() + this.f5628j, layoutParams2.height));
            i6 = Math.max(i6, childAt2.getMeasuredWidth());
            i7 = Math.max(i7, childAt2.getMeasuredHeight());
        }
        setMeasuredDimension(View.resolveSize(Math.max(i6, i3) + getPaddingLeft() + getPaddingRight(), i), View.resolveSize(Math.max(i7, i4) + getPaddingTop() + this.f5627i + getPaddingBottom() + this.f5628j, i2));
        if (screenCount > 0) {
            this.f5633o = i6;
            this.f5635q = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            m6387I();
            int i9 = this.f5633o;
            if (i9 > 0) {
                this.f5632n = Math.max(1, (this.f5635q + ((int) (((float) i9) * this.f5601A))) / i9);
            }
            setOverScrollRatio(this.f5642x);
        }
        if (this.f5623e && this.f5632n > 0) {
            this.f5623e = false;
            setHorizontalScrollBarEnabled(false);
            setCurrentScreen(this.f5638t);
            setHorizontalScrollBarEnabled(true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5608H) {
            return true;
        }
        if (this.f5607G) {
            m6398q(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 1) {
            if (action == 2) {
                if (this.f5606F == 0 && m6401v(motionEvent)) {
                    m6403x(motionEvent, 1);
                }
                if (this.f5606F == 1) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5612L);
                    if (findPointerIndex == -1) {
                        m6403x(motionEvent, 1);
                        findPointerIndex = motionEvent.findPointerIndex(this.f5612L);
                    }
                    float x = motionEvent.getX(findPointerIndex);
                    float f = this.f5604D - x;
                    this.f5604D = x;
                    if (f != 0.0f) {
                        scrollTo(Math.round(this.f5614N + f), 0);
                    } else {
                        awakenScrollBars();
                    }
                }
            } else if (action != 3) {
                if (action == 6) {
                    int action2 = (motionEvent.getAction() & 65280) >> 8;
                    if (motionEvent.getPointerId(action2) == this.f5612L) {
                        if (action2 == 0) {
                            i = 1;
                        }
                        this.f5604D = motionEvent.getX(i);
                        int pointerId = motionEvent.getPointerId(i);
                        this.f5612L = pointerId;
                        this.f5621U.mo5469d(pointerId);
                    }
                }
            }
            this.f5607G = true;
            return true;
        }
        if (this.f5606F == 1) {
            m6404y(this.f5612L);
        }
        m6403x(motionEvent, 0);
        this.f5607G = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo5436p(ScaleGestureDetector scaleGestureDetector) {
    }

    public void removeAllViewsInLayout() {
        this.f5624f = 0;
        this.f5602B = 0;
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    public void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    public void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    public void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("ScreenView doesn't support remove view directly.");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= getScreenCount()) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        if (indexOfChild == this.f5638t && this.f5644z.isFinished()) {
            return false;
        }
        mo5273A(indexOfChild);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo5444s(View view) {
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= getScreenCount()) {
            this.f5624f--;
            super.removeViewAt(indexOfChild);
            return;
        }
        throw new InvalidParameterException("The view passed through the parameter must be indicator.");
    }

    public void scrollTo(int i, int i2) {
        this.f5614N = (float) Math.max(this.f5641w, Math.min(i, this.f5640v));
        this.f5613M = ((float) System.nanoTime()) / 1.0E9f;
        super.scrollTo((int) this.f5614N, i2);
    }

    public void setAllowLongPress(boolean z) {
        this.f5609I = z;
    }

    public void setConfirmHorizontalScrollRatio(float f) {
        this.f5615O = f;
    }

    public void setCurrentScreen(int i) {
        m6395k(i, false);
    }

    public void setIndicatorBarVisibility(int i) {
        setSeekBarVisibility(i);
    }

    public void setMaximumSnapVelocity(int i) {
        this.f5611K = i;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            getChildAt(i).setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOverScrollRatio(float f) {
        this.f5642x = f;
        m6399r();
    }

    public void setOvershootTension(float f) {
        this.f5619S = f;
        C1441d dVar = this.f5617Q;
        if (dVar != null) {
            float unused = dVar.f5651a = f;
        }
    }

    public void setScreenAlignment(int i) {
        this.f5629k = i;
    }

    public void setScreenOffset(int i) {
        this.f5630l = i;
        this.f5629k = 0;
        requestLayout();
    }

    public void setScreenPadding(Rect rect) {
        if (rect != null) {
            this.f5627i = rect.top;
            this.f5628j = rect.bottom;
            setPadding(rect.left, 0, rect.right, 0);
            return;
        }
        throw new InvalidParameterException("The padding parameter can not be null.");
    }

    public void setScreenSnapDuration(int i) {
        this.f5616P = i;
    }

    public void setScreenTransitionType(int i) {
        if (i != this.f5618R) {
            this.f5618R = i;
            switch (i) {
                case 0:
                case 3:
                    setOvershootTension(1.3f);
                    setScreenSnapDuration(300);
                    return;
                case 1:
                case 2:
                case 7:
                    setOvershootTension(0.0f);
                    setScreenSnapDuration(270);
                    return;
                case 4:
                case 5:
                    setOvershootTension(0.0f);
                    break;
                case 8:
                    setOvershootTension(1.3f);
                    break;
                default:
                    return;
            }
            setScreenSnapDuration(330);
        }
    }

    public void setScrollWholeScreen(boolean z) {
        this.f5643y = z;
    }

    public void setSeekBarPosition(FrameLayout.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C1442e eVar = this.f5626h;
            if (eVar == null) {
                C1442e eVar2 = new C1442e(getContext());
                this.f5626h = eVar2;
                eVar2.setLayoutDirection(0);
                this.f5626h.setGravity(16);
                this.f5626h.setAnimationCacheEnabled(false);
                for (int i = 0; i < getChildCount(); i++) {
                    this.f5626h.addView(m6392h(), f5599V);
                }
            } else if (eVar.getParent() != null) {
                this.f5626h.setLayoutParams(layoutParams);
                return;
            }
            mo5422g(this.f5626h, layoutParams);
            return;
        }
        C1442e eVar3 = this.f5626h;
        if (eVar3 != null) {
            mo5444s(eVar3);
            this.f5626h = null;
        }
    }

    public void setSeekBarVisibility(int i) {
        C1442e eVar = this.f5626h;
        if (eVar != null) {
            eVar.setVisibility(i);
        }
    }

    public void setTouchSlop(int i) {
        this.f5610J = i;
    }

    public void setVisibleExtentionRatio(float f) {
        this.f5601A = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo5464t(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        m6402w(view, this.f5622d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo5465z(int i, int i2) {
        int i3;
        int i4;
        if (i2 != 1 || (i4 = this.f5638t) <= 0) {
            if (i2 == 2 && this.f5638t < getScreenCount() - 1) {
                i3 = this.f5638t + this.f5632n;
            } else if (i2 == 3) {
                i3 = this.f5638t;
            } else {
                i3 = (getScrollX() + ((this.f5633o * (this.f5643y ? this.f5632n : 1)) >> 1)) / this.f5633o;
                i = 0;
            }
            mo5274B(i3, i, true);
            return;
        }
        mo5274B(i4 - this.f5632n, i, true);
    }
}
