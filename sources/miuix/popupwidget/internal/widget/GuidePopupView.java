package miuix.popupwidget.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p113s3.C2658a;
import p113s3.C2661d;
import p113s3.C2662e;
import p113s3.C2663f;
import p118t3.C2717b;

public class GuidePopupView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A */
    private boolean f9073A;

    /* renamed from: B */
    private Animator.AnimatorListener f9074B;

    /* renamed from: C */
    private Animator.AnimatorListener f9075C;

    /* renamed from: D */
    private int f9076D;

    /* renamed from: d */
    private Context f9077d;

    /* renamed from: e */
    private View f9078e;

    /* renamed from: f */
    private LinearLayout f9079f;

    /* renamed from: g */
    private LinearLayout f9080g;

    /* renamed from: h */
    private int f9081h;

    /* renamed from: i */
    private int f9082i;

    /* renamed from: j */
    private boolean f9083j;

    /* renamed from: k */
    private int f9084k;

    /* renamed from: l */
    private View.OnTouchListener f9085l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ObjectAnimator f9086m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f9087n;

    /* renamed from: o */
    private int f9088o;

    /* renamed from: p */
    private int f9089p;

    /* renamed from: q */
    private int f9090q;

    /* renamed from: r */
    private int f9091r;

    /* renamed from: s */
    private int f9092s;

    /* renamed from: t */
    private float f9093t;

    /* renamed from: u */
    private float f9094u;

    /* renamed from: v */
    private float f9095v;

    /* renamed from: w */
    private int f9096w;

    /* renamed from: x */
    private int f9097x;

    /* renamed from: y */
    private ColorStateList f9098y;

    /* renamed from: z */
    private final Paint f9099z;

    /* renamed from: miuix.popupwidget.internal.widget.GuidePopupView$a */
    class C2353a extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f9100d;

        C2353a() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f9100d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9100d) {
                ObjectAnimator unused = GuidePopupView.this.f9086m = null;
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f9100d = false;
        }
    }

    /* renamed from: miuix.popupwidget.internal.widget.GuidePopupView$b */
    class C2354b extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f9102d;

        C2354b() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f9102d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9102d) {
                boolean unused = GuidePopupView.this.f9087n = false;
                ObjectAnimator unused2 = GuidePopupView.this.f9086m = null;
                C2717b unused3 = GuidePopupView.this.getClass();
                throw null;
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f9102d = false;
            boolean unused = GuidePopupView.this.f9087n = true;
        }
    }

    public GuidePopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2658a.f10341b);
    }

    public GuidePopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9083j = true;
        this.f9098y = null;
        Paint paint = new Paint();
        this.f9099z = paint;
        this.f9074B = new C2353a();
        this.f9075C = new C2354b();
        this.f9076D = -1;
        this.f9077d = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2663f.f10383T, i, C2662e.f10355b);
        this.f9093t = obtainStyledAttributes.getDimension(C2663f.f10389Z, 0.0f);
        this.f9094u = obtainStyledAttributes.getDimension(C2663f.f10387X, 0.0f);
        this.f9095v = obtainStyledAttributes.getDimension(C2663f.f10391a0, 0.0f);
        this.f9096w = obtainStyledAttributes.getColor(C2663f.f10384U, 0);
        paint.setColor(obtainStyledAttributes.getColor(C2663f.f10388Y, -1));
        this.f9097x = obtainStyledAttributes.getDimensionPixelSize(C2663f.f10385V, 15);
        this.f9098y = obtainStyledAttributes.getColorStateList(C2663f.f10386W);
        obtainStyledAttributes.recycle();
        this.f9088o = (int) (this.f9094u + (this.f9095v * 2.5f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (((float) (r1 - r4)) < r3) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (((float) (r1 - r4)) < r2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (((float) (r0 - r6)) < r3) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        if (((float) (r0 - r6)) < r2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r2 = 5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9956d() {
        /*
            r14 = this;
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            r2 = 4
            int[] r3 = new int[r2]
            int r4 = r14.f9090q
            r5 = 0
            r3[r5] = r4
            int r6 = r1 - r4
            int r7 = r14.f9092s
            int r6 = r6 - r7
            r8 = 1
            r3[r8] = r6
            int r6 = r14.f9089p
            r9 = 2
            r3[r9] = r6
            int r10 = r0 - r6
            int r11 = r14.f9091r
            int r10 = r10 - r11
            r12 = 3
            r3[r12] = r10
            int r11 = r11 / r9
            int r6 = r6 + r11
            int r7 = r7 / r9
            int r4 = r4 + r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r7
            r7 = r5
        L_0x002d:
            if (r5 >= r2) goto L_0x003d
            r11 = r3[r5]
            int r13 = r14.f9088o
            if (r11 < r13) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            if (r11 <= r10) goto L_0x003a
            r7 = r5
            r10 = r11
        L_0x003a:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x003d:
            r5 = r7
        L_0x003e:
            r3 = 5
            r7 = 6
            r10 = 7
            if (r5 == 0) goto L_0x0078
            if (r5 == r8) goto L_0x0069
            if (r5 == r9) goto L_0x0059
            if (r5 == r12) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            float r0 = (float) r4
            float r3 = r14.f9095v
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            goto L_0x008a
        L_0x0052:
            int r1 = r1 - r4
            float r0 = (float) r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            goto L_0x007f
        L_0x0059:
            float r0 = (float) r4
            float r2 = r14.f9095v
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
        L_0x0060:
            r2 = r7
            goto L_0x008a
        L_0x0062:
            int r1 = r1 - r4
            float r0 = (float) r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            goto L_0x0087
        L_0x0069:
            float r1 = (float) r6
            float r3 = r14.f9095v
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0071
            goto L_0x008a
        L_0x0071:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            goto L_0x0060
        L_0x0078:
            float r1 = (float) r6
            float r2 = r14.f9095v
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0081
        L_0x007f:
            r2 = r10
            goto L_0x008a
        L_0x0081:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
        L_0x0087:
            r2 = r3
            goto L_0x008a
        L_0x0089:
            r2 = r5
        L_0x008a:
            r14.setArrowMode(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.GuidePopupView.m9956d():void");
    }

    /* renamed from: e */
    private void m9957e() {
        m9958f();
        m9960h(this.f9076D, this.f9079f, this.f9081h, this.f9082i);
        if (this.f9073A) {
            m9960h(getMirroredMode(), this.f9080g, -this.f9081h, -this.f9082i);
        }
    }

    /* renamed from: f */
    private void m9958f() {
        if (!this.f9083j) {
            this.f9084k = 0;
            return;
        }
        int i = this.f9091r / 2;
        int i2 = this.f9092s / 2;
        int sqrt = (int) Math.sqrt(Math.pow((double) i, 2.0d) + Math.pow((double) i2, 2.0d));
        int i3 = this.f9076D;
        if (i3 == 0 || i3 == 1) {
            this.f9084k = i2;
        } else if (i3 == 2 || i3 == 3) {
            this.f9084k = i;
        } else {
            this.f9084k = sqrt;
        }
    }

    /* renamed from: g */
    private void m9959g(Canvas canvas, int i, int i2, int i3) {
        float f;
        this.f9099z.setAntiAlias(true);
        this.f9099z.setStyle(Paint.Style.FILL);
        float f2 = (float) (this.f9089p + (this.f9091r / 2) + i2);
        float f3 = (float) (this.f9090q + (this.f9092s / 2) + i3);
        switch (i) {
            case 0:
                f = 180.0f;
                break;
            case 2:
                f = 90.0f;
                break;
            case 3:
                f = -90.0f;
                break;
            case 4:
                f = -45.0f;
                break;
            case 5:
                f = 135.0f;
                break;
            case 6:
                f = 45.0f;
                break;
            case 7:
                f = -135.0f;
                break;
            default:
                f = 0.0f;
                break;
        }
        canvas.save();
        canvas.rotate(f, f2, f3);
        canvas.translate(0.0f, (float) this.f9084k);
        int save = canvas.save();
        float f4 = f3;
        canvas.clipRect(f2 - 2.0f, f4, f2 + 2.0f, f3 + this.f9093t, Region.Op.DIFFERENCE);
        canvas.drawCircle(f2, f3, this.f9093t, this.f9099z);
        canvas.restoreToCount(save);
        this.f9099z.setStyle(Paint.Style.STROKE);
        this.f9099z.setStrokeWidth(4.0f);
        canvas.drawLine(f2, f4, f2, f3 + this.f9094u, this.f9099z);
        float f5 = f3 + this.f9094u + this.f9095v;
        this.f9099z.setStyle(Paint.Style.STROKE);
        this.f9099z.setStrokeWidth(4.0f);
        canvas.drawCircle(f2, f5, this.f9095v, this.f9099z);
        canvas.restore();
    }

    private int getMirroredMode() {
        int i = this.f9076D;
        if (i == -1) {
            return -1;
        }
        return i % 2 == 0 ? i + 1 : i - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        if (r9 == 4) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r9 == 5) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r9 == 6) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        if (r9 == 7) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        r3 = r3 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r3 = r3 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r3 = r3 + r11;
        r1 = r1 + r12;
        r10.layout(r3, r1, r10.getMeasuredWidth() + r3, r10.getMeasuredHeight() + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r3 = (int) (r1 - ((float) (r10.getMeasuredWidth() / 2)));
        r1 = r2 - (r10.getMeasuredHeight() / 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        r1 = (int) (r1 - ((float) (r10.getMeasuredHeight() / 2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        r2 = (int) (((double) r0) * java.lang.Math.sin(0.7853981633974483d));
        r0 = (int) (r0 - ((float) r2));
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9960h(int r9, android.widget.LinearLayout r10, int r11, int r12) {
        /*
            r8 = this;
            int r0 = r8.f9084k
            float r0 = (float) r0
            float r1 = r8.f9094u
            float r0 = r0 + r1
            float r1 = r8.f9095v
            float r0 = r0 + r1
            int r1 = r8.f9089p
            int r2 = r8.f9091r
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r2 = r8.f9090q
            int r3 = r8.f9092s
            int r3 = r3 / 2
            int r2 = r2 + r3
            r3 = 0
            switch(r9) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0034;
                case 2: goto L_0x0020;
                case 3: goto L_0x001d;
                case 4: goto L_0x0034;
                case 5: goto L_0x003f;
                case 6: goto L_0x0034;
                case 7: goto L_0x003f;
                default: goto L_0x001b;
            }
        L_0x001b:
            r1 = r3
            goto L_0x0052
        L_0x001d:
            float r1 = (float) r1
            float r1 = r1 + r0
            goto L_0x0022
        L_0x0020:
            float r1 = (float) r1
            float r1 = r1 - r0
        L_0x0022:
            int r3 = r10.getMeasuredWidth()
            int r3 = r3 / 2
            float r3 = (float) r3
            float r1 = r1 - r3
            int r3 = (int) r1
            int r1 = r10.getMeasuredHeight()
            int r1 = r1 / 2
            int r1 = r2 - r1
            goto L_0x0052
        L_0x0034:
            int r3 = r10.getMeasuredWidth()
            int r3 = r3 / 2
            int r3 = r1 - r3
            float r1 = (float) r2
            float r1 = r1 + r0
            goto L_0x0049
        L_0x003f:
            int r3 = r10.getMeasuredWidth()
            int r3 = r3 / 2
            int r3 = r1 - r3
            float r1 = (float) r2
            float r1 = r1 - r0
        L_0x0049:
            int r2 = r10.getMeasuredHeight()
            int r2 = r2 / 2
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
        L_0x0052:
            double r4 = (double) r0
            r6 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r6 = java.lang.Math.sin(r6)
            double r4 = r4 * r6
            int r2 = (int) r4
            float r4 = (float) r2
            float r0 = r0 - r4
            int r0 = (int) r0
            r4 = 4
            if (r9 == r4) goto L_0x0075
            r4 = 5
            if (r9 == r4) goto L_0x0072
            r4 = 6
            if (r9 == r4) goto L_0x0070
            r4 = 7
            if (r9 == r4) goto L_0x006e
            goto L_0x0077
        L_0x006e:
            int r3 = r3 + r2
            goto L_0x0073
        L_0x0070:
            int r3 = r3 - r2
            goto L_0x0076
        L_0x0072:
            int r3 = r3 - r2
        L_0x0073:
            int r1 = r1 + r0
            goto L_0x0077
        L_0x0075:
            int r3 = r3 + r2
        L_0x0076:
            int r1 = r1 - r0
        L_0x0077:
            int r3 = r3 + r11
            int r1 = r1 + r12
            int r9 = r10.getMeasuredWidth()
            int r9 = r9 + r3
            int r11 = r10.getMeasuredHeight()
            int r11 = r11 + r1
            r10.layout(r3, r1, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.GuidePopupView.m9960h(int, android.widget.LinearLayout, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        canvas.translate((float) this.f9089p, (float) this.f9090q);
        this.f9078e.setDrawingCacheEnabled(true);
        this.f9078e.buildDrawingCache();
        canvas.drawBitmap(this.f9078e.getDrawingCache(), 0.0f, 0.0f, (Paint) null);
        this.f9078e.setDrawingCacheEnabled(false);
        canvas.restore();
        m9959g(canvas, this.f9076D, this.f9081h, this.f9082i);
        if (this.f9073A) {
            m9959g(canvas, getMirroredMode(), -this.f9081h, -this.f9082i);
        }
    }

    public int getArrowMode() {
        return this.f9076D;
    }

    public int getColorBackground() {
        return this.f9096w;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9079f = (LinearLayout) findViewById(C2661d.f10352d);
        this.f9080g = (LinearLayout) findViewById(C2661d.f10350b);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9091r == 0 || this.f9092s == 0) {
            setAnchor(this.f9078e);
        }
        this.f9095v = (float) Math.max(Math.sqrt(Math.pow((double) this.f9079f.getMeasuredWidth(), 2.0d) + Math.pow((double) this.f9079f.getMeasuredHeight(), 2.0d)) / 2.0d, (double) this.f9095v);
        if (this.f9073A) {
            this.f9095v = (float) Math.max(Math.sqrt(Math.pow((double) this.f9080g.getMeasuredWidth(), 2.0d) + Math.pow((double) this.f9080g.getMeasuredHeight(), 2.0d)) / 2.0d, (double) this.f9095v);
        }
        if (this.f9076D == -1) {
            m9956d();
        } else {
            m9957e();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = this.f9089p;
        Rect rect = new Rect(i, this.f9090q, this.f9078e.getWidth() + i, this.f9090q + this.f9078e.getHeight());
        if (motionEvent.getAction() != 0 || !rect.contains(x, y)) {
            throw null;
        }
        this.f9078e.callOnClick();
        return true;
    }

    public void setAnchor(View view) {
        this.f9078e = view;
        this.f9091r = view.getWidth();
        this.f9092s = this.f9078e.getHeight();
        int[] iArr = new int[2];
        this.f9078e.getLocationInWindow(iArr);
        this.f9089p = iArr[0];
        this.f9090q = iArr[1];
    }

    public void setArrowMode(int i) {
        this.f9076D = i;
    }

    public void setGuidePopupWindow(C2717b bVar) {
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f9085l = onTouchListener;
    }
}
