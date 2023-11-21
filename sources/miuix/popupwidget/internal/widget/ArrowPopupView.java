package miuix.popupwidget.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import miuix.view.C2400e;
import p055i3.C1650d;
import p055i3.C1656j;
import p113s3.C2658a;
import p113s3.C2659b;
import p113s3.C2661d;
import p113s3.C2662e;
import p113s3.C2663f;
import p118t3.C2716a;

public class ArrowPopupView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A */
    private Drawable f9023A;

    /* renamed from: B */
    private Drawable f9024B;

    /* renamed from: C */
    private View.OnTouchListener f9025C;

    /* renamed from: D */
    private Rect f9026D;

    /* renamed from: E */
    private RectF f9027E;

    /* renamed from: F */
    private AnimatorSet f9028F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public AnimationSet f9029G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f9030H;

    /* renamed from: I */
    private boolean f9031I;

    /* renamed from: J */
    private int f9032J;

    /* renamed from: K */
    private int f9033K;

    /* renamed from: L */
    private int f9034L;

    /* renamed from: M */
    private int f9035M;

    /* renamed from: N */
    private int f9036N;

    /* renamed from: O */
    private int f9037O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f9038P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f9039Q;

    /* renamed from: R */
    private int f9040R;

    /* renamed from: S */
    private Animation.AnimationListener f9041S;

    /* renamed from: T */
    private Animation.AnimationListener f9042T;

    /* renamed from: U */
    private int f9043U;

    /* renamed from: d */
    private View f9044d;

    /* renamed from: e */
    private AppCompatImageView f9045e;

    /* renamed from: f */
    private FrameLayout f9046f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public LinearLayout f9047g;

    /* renamed from: h */
    private LinearLayout f9048h;

    /* renamed from: i */
    private AppCompatTextView f9049i;

    /* renamed from: j */
    private AppCompatButton f9050j;

    /* renamed from: k */
    private AppCompatButton f9051k;

    /* renamed from: l */
    private C2352e f9052l;

    /* renamed from: m */
    private C2352e f9053m;

    /* renamed from: n */
    private int f9054n;

    /* renamed from: o */
    private int f9055o;

    /* renamed from: p */
    private Drawable f9056p;

    /* renamed from: q */
    private Drawable f9057q;

    /* renamed from: r */
    private Drawable f9058r;

    /* renamed from: s */
    private Drawable f9059s;

    /* renamed from: t */
    private Drawable f9060t;

    /* renamed from: u */
    private Drawable f9061u;

    /* renamed from: v */
    private Drawable f9062v;

    /* renamed from: w */
    private Drawable f9063w;

    /* renamed from: x */
    private Drawable f9064x;

    /* renamed from: y */
    private Drawable f9065y;

    /* renamed from: z */
    private Drawable f9066z;

    /* renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$a */
    class C2348a implements Animation.AnimationListener {
        C2348a() {
        }

        public void onAnimationEnd(Animation animation) {
            AnimationSet unused = ArrowPopupView.this.f9029G = null;
            if (ArrowPopupView.this.f9038P) {
                ArrowPopupView.this.m9940j();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$b */
    class C2349b implements Animation.AnimationListener {
        C2349b() {
        }

        public void onAnimationEnd(Animation animation) {
            boolean unused = ArrowPopupView.this.f9030H = false;
            AnimationSet unused2 = ArrowPopupView.this.f9029G = null;
            C2716a unused3 = ArrowPopupView.this.getClass();
            throw null;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$c */
    class C2350c extends AnimatorListenerAdapter {
        C2350c() {
        }

        public void onAnimationEnd(Animator animator) {
            C2716a unused = ArrowPopupView.this.getClass();
            throw null;
        }
    }

    /* renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$d */
    class C2351d implements ValueAnimator.AnimatorUpdateListener {
        C2351d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int unused = ArrowPopupView.this.f9039Q = ((Float) valueAnimator.getAnimatedValue()).intValue();
            int abs = Math.abs(ArrowPopupView.this.f9039Q);
            ArrowPopupView arrowPopupView = ArrowPopupView.this;
            arrowPopupView.invalidate(arrowPopupView.f9047g.getLeft() - abs, ArrowPopupView.this.f9047g.getTop() - abs, ArrowPopupView.this.f9047g.getRight() + abs, ArrowPopupView.this.f9047g.getBottom() + abs);
        }
    }

    /* renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$e */
    class C2352e implements View.OnClickListener {

        /* renamed from: d */
        public View.OnClickListener f9071d;

        C2352e() {
        }

        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f9071d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C2716a unused = ArrowPopupView.this.getClass();
            throw null;
        }
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2658a.f10340a);
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9026D = new Rect();
        this.f9027E = new RectF();
        this.f9031I = true;
        this.f9032J = 2;
        this.f9038P = false;
        this.f9041S = new C2348a();
        this.f9042T = new C2349b();
        this.f9043U = 0;
        C2400e.m10241b(this, false);
        this.f9031I = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2663f.f10424r, i, C2662e.f10354a);
        this.f9056p = obtainStyledAttributes.getDrawable(C2663f.f10438y);
        this.f9057q = obtainStyledAttributes.getDrawable(C2663f.f10428t);
        this.f9058r = obtainStyledAttributes.getDrawable(C2663f.f10430u);
        this.f9059s = obtainStyledAttributes.getDrawable(C2663f.f10358B);
        this.f9060t = obtainStyledAttributes.getDrawable(C2663f.f10360C);
        this.f9061u = obtainStyledAttributes.getDrawable(C2663f.f10362D);
        this.f9062v = obtainStyledAttributes.getDrawable(C2663f.f10432v);
        this.f9063w = obtainStyledAttributes.getDrawable(C2663f.f10356A);
        this.f9064x = obtainStyledAttributes.getDrawable(C2663f.f10440z);
        this.f9065y = obtainStyledAttributes.getDrawable(C2663f.f10364E);
        this.f9066z = obtainStyledAttributes.getDrawable(C2663f.f10366F);
        this.f9024B = obtainStyledAttributes.getDrawable(C2663f.f10436x);
        this.f9023A = obtainStyledAttributes.getDrawable(C2663f.f10434w);
        this.f9040R = obtainStyledAttributes.getDimensionPixelOffset(C2663f.f10426s, getResources().getDimensionPixelSize(C2659b.f10343b));
        obtainStyledAttributes.recycle();
        this.f9033K = context.getResources().getDimensionPixelOffset(C2659b.f10344c);
    }

    private int getArrowHeight() {
        Drawable drawable;
        int i = this.f9043U;
        if (i == 9 || i == 10) {
            drawable = this.f9060t;
        } else if (i == 17 || i == 18) {
            drawable = this.f9062v;
        } else {
            int measuredHeight = this.f9045e.getMeasuredHeight();
            if (measuredHeight != 0) {
                return measuredHeight;
            }
            drawable = this.f9045e.getDrawable();
        }
        return drawable.getIntrinsicHeight();
    }

    private int getArrowWidth() {
        int measuredWidth = this.f9045e.getMeasuredWidth();
        return measuredWidth == 0 ? this.f9045e.getDrawable().getIntrinsicWidth() : measuredWidth;
    }

    /* renamed from: i */
    private void m9939i() {
        int[] iArr = new int[2];
        this.f9044d.getLocationInWindow(iArr);
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.f9047g.getMeasuredWidth();
        int measuredHeight = this.f9047g.getMeasuredHeight();
        int height2 = this.f9044d.getHeight();
        int width2 = this.f9044d.getWidth();
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        int i = 16;
        sparseIntArray.put(16, iArr[1] - measuredHeight);
        sparseIntArray.put(8, ((height - iArr[1]) - height2) - measuredHeight);
        int i2 = 0;
        sparseIntArray.put(64, iArr[0] - measuredWidth);
        sparseIntArray.put(32, ((width - iArr[0]) - width2) - measuredWidth);
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (i2 >= sparseIntArray.size()) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i2);
            if (sparseIntArray.get(keyAt) >= this.f9033K) {
                i = keyAt;
                break;
            }
            if (sparseIntArray.get(keyAt) > i3) {
                i3 = sparseIntArray.get(keyAt);
                i = keyAt;
            }
            i2++;
        }
        setArrowMode(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m9940j() {
        if (C1650d.m6967a()) {
            AnimationSet animationSet = this.f9029G;
            if (animationSet != null) {
                animationSet.cancel();
            }
            AnimatorSet animatorSet = this.f9028F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f9028F = animatorSet2;
            animatorSet2.addListener(new C2350c());
            float f = getContext().getResources().getDisplayMetrics().density * 4.0f;
            Property property = View.TRANSLATION_Y;
            int i = this.f9032J;
            boolean z = i == 1 || (i == 2 && C1656j.m6983b(this));
            int i2 = this.f9043U;
            if (i2 != 16) {
                if (i2 != 32) {
                    if (i2 == 64) {
                        if (!z) {
                            f = -f;
                        }
                    }
                } else if (z) {
                    f = -f;
                }
                property = View.TRANSLATION_X;
            } else {
                f = -f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9047g, property, new float[]{0.0f, f, 0.0f});
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration(1200);
            if (this.f9031I) {
                ofFloat.setRepeatCount(8);
            } else {
                ofFloat.setRepeatCount(-1);
            }
            ofFloat.addUpdateListener(new C2351d());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9045e, property, new float[]{0.0f, f, 0.0f});
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat2.setDuration(1200);
            if (this.f9031I) {
                ofFloat2.setRepeatCount(8);
            } else {
                ofFloat2.setRepeatCount(-1);
            }
            this.f9028F.playTogether(new Animator[]{ofFloat, ofFloat2});
            this.f9028F.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011f  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9941k(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            int[] r2 = new int[r1]
            android.view.View r3 = r0.f9044d
            r3.getLocationOnScreen(r2)
            r3 = 0
            r4 = r2[r3]
            r5 = 1
            r6 = r2[r5]
            r0.getLocationOnScreen(r2)
            android.view.View r7 = r0.f9044d
            int r7 = r7.getWidth()
            android.view.View r8 = r0.f9044d
            int r8 = r8.getHeight()
            int r9 = r17.getWidth()
            int r10 = r17.getHeight()
            android.widget.LinearLayout r11 = r0.f9047g
            int r11 = r11.getMeasuredWidth()
            android.widget.LinearLayout r12 = r0.f9047g
            int r12 = r12.getMinimumWidth()
            int r11 = java.lang.Math.max(r11, r12)
            android.widget.LinearLayout r12 = r0.f9047g
            int r12 = r12.getMeasuredHeight()
            android.widget.LinearLayout r13 = r0.f9047g
            int r13 = r13.getMinimumHeight()
            int r12 = java.lang.Math.max(r12, r13)
            int r13 = r17.getArrowWidth()
            int r14 = r17.getArrowHeight()
            int r15 = r8 / 2
            int r15 = r15 + r6
            r16 = r2[r5]
            int r15 = r15 - r16
            r0.f9035M = r15
            int r15 = r10 - r15
            int r8 = r8 - r14
            int r8 = r8 / r1
            int r6 = r6 + r8
            int r6 = r6 - r16
            android.widget.LinearLayout r8 = r0.f9047g
            int r8 = r8.getPaddingTop()
            android.widget.LinearLayout r3 = r0.f9047g
            int r3 = r3.getPaddingBottom()
            int r8 = r8 - r3
            int r8 = r8 / r1
            int r6 = r6 + r8
            r0.f9037O = r6
            int r3 = r12 / 2
            int r6 = r12 - r3
            int r8 = r17.getLeft()
            int r8 = r8 + r18
            r0.f9034L = r8
            boolean r8 = r17.m9948r()
            if (r8 == 0) goto L_0x00bd
            int r8 = r0.f9032J
            if (r8 == r5) goto L_0x00a0
            if (r8 != r1) goto L_0x008f
            boolean r1 = p055i3.C1656j.m6983b(r17)
            if (r1 == 0) goto L_0x008f
            goto L_0x00a0
        L_0x008f:
            int r1 = r0.f9034L
            int r7 = r4 - r11
            android.widget.LinearLayout r8 = r0.f9047g
            int r8 = r8.getPaddingRight()
            int r7 = r7 + r8
            int r7 = r7 - r13
            r8 = 0
            r2 = r2[r8]
            int r7 = r7 - r2
            goto L_0x00f0
        L_0x00a0:
            int r1 = r0.f9034L
            int r4 = r4 + r7
            android.widget.LinearLayout r7 = r0.f9047g
            int r7 = r7.getPaddingLeft()
            int r4 = r4 - r7
            int r4 = r4 + r13
            r7 = 0
            r2 = r2[r7]
        L_0x00ae:
            int r4 = r4 - r2
            int r1 = r1 + r4
            r0.f9034L = r1
            android.widget.LinearLayout r2 = r0.f9047g
            int r2 = r2.getPaddingLeft()
            int r2 = r2 - r13
            int r1 = r1 + r2
            int r1 = r1 + r5
        L_0x00bb:
            r8 = r1
            goto L_0x00fb
        L_0x00bd:
            boolean r8 = r17.m9947q()
            if (r8 == 0) goto L_0x00fa
            int r8 = r0.f9032J
            if (r8 == r5) goto L_0x00df
            if (r8 != r1) goto L_0x00d0
            boolean r1 = p055i3.C1656j.m6983b(r17)
            if (r1 == 0) goto L_0x00d0
            goto L_0x00df
        L_0x00d0:
            int r1 = r0.f9034L
            int r4 = r4 + r7
            android.widget.LinearLayout r7 = r0.f9047g
            int r7 = r7.getPaddingLeft()
            int r4 = r4 - r7
            int r4 = r4 + r13
            r7 = 0
            r2 = r2[r7]
            goto L_0x00ae
        L_0x00df:
            int r1 = r0.f9034L
            int r7 = r4 - r11
            android.widget.LinearLayout r8 = r0.f9047g
            int r8 = r8.getPaddingRight()
            int r7 = r7 + r8
            int r7 = r7 - r13
            r8 = 0
            r2 = r2[r8]
            int r7 = r7 - r2
            int r7 = r7 + r5
        L_0x00f0:
            int r1 = r1 + r7
            r0.f9034L = r1
            int r4 = r4 - r13
            int r4 = r4 - r2
            int r4 = r4 + r18
            int r1 = r4 + -1
            goto L_0x00bb
        L_0x00fa:
            r8 = 0
        L_0x00fb:
            int r1 = r0.f9035M
            if (r1 < r3) goto L_0x0103
            if (r15 < r6) goto L_0x0103
            int r1 = r1 - r3
            goto L_0x0107
        L_0x0103:
            if (r15 >= r6) goto L_0x010d
            int r1 = r10 - r12
        L_0x0107:
            int r2 = r0.f9055o
            int r1 = r1 + r2
        L_0x010a:
            r0.f9035M = r1
            goto L_0x0112
        L_0x010d:
            if (r1 >= r3) goto L_0x0112
            int r1 = r0.f9055o
            goto L_0x010a
        L_0x0112:
            int r1 = r0.f9037O
            int r2 = r0.f9055o
            int r1 = r1 + r2
            r0.f9037O = r1
            if (r1 >= 0) goto L_0x011f
            r2 = 0
            r0.f9037O = r2
            goto L_0x0129
        L_0x011f:
            int r2 = r1 + r14
            if (r2 <= r10) goto L_0x0129
            int r2 = r1 + r14
            int r2 = r2 - r10
            int r1 = r1 - r2
            r0.f9037O = r1
        L_0x0129:
            android.widget.LinearLayout r1 = r0.f9047g
            int r2 = r0.f9034L
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r0.f9035M
            int r3 = java.lang.Math.max(r4, r3)
            int r4 = r0.f9034L
            int r4 = r4 + r11
            int r4 = java.lang.Math.min(r4, r9)
            int r5 = r0.f9035M
            int r5 = r5 + r12
            int r5 = java.lang.Math.min(r5, r10)
            r1.layout(r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f9045e
            int r2 = r0.f9037O
            int r13 = r13 + r8
            int r14 = r14 + r2
            r1.layout(r8, r2, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.ArrowPopupView.m9941k(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9942l() {
        /*
            r5 = this;
            int r0 = r5.f9032J
            r1 = 1
            if (r0 == r1) goto L_0x0010
            r2 = 2
            if (r0 != r2) goto L_0x000f
            boolean r0 = p055i3.C1656j.m6983b(r5)
            if (r0 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            int r0 = r5.f9054n
            if (r1 == 0) goto L_0x0015
            int r0 = -r0
        L_0x0015:
            boolean r1 = r5.m9950t()
            if (r1 == 0) goto L_0x001f
            r5.m9943m(r0)
            goto L_0x0022
        L_0x001f:
            r5.m9941k(r0)
        L_0x0022:
            android.view.View r0 = r5.getContentView()
            if (r0 == 0) goto L_0x0076
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r2 = r0.getMeasuredHeight()
            android.widget.LinearLayout r3 = r5.f9047g
            int r3 = r3.getMeasuredHeight()
            android.widget.LinearLayout r4 = r5.f9048h
            int r4 = r4.getMeasuredHeight()
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x0052
            android.widget.LinearLayout r2 = r5.f9047g
            int r2 = r2.getMeasuredHeight()
            android.widget.LinearLayout r3 = r5.f9048h
            int r3 = r3.getMeasuredHeight()
            int r2 = r2 - r3
            r1.height = r2
        L_0x004e:
            r0.setLayoutParams(r1)
            goto L_0x0067
        L_0x0052:
            int r2 = r0.getMeasuredWidth()
            android.widget.LinearLayout r3 = r5.f9047g
            int r3 = r3.getMeasuredWidth()
            if (r2 <= r3) goto L_0x0067
            android.widget.LinearLayout r2 = r5.f9047g
            int r2 = r2.getMeasuredWidth()
            r1.width = r2
            goto L_0x004e
        L_0x0067:
            int r0 = r1.height
            if (r0 <= 0) goto L_0x006f
            int r0 = r1.width
            if (r0 > 0) goto L_0x0076
        L_0x006f:
            java.lang.String r0 = "ArrowPopupView"
            java.lang.String r1 = "Invalid LayoutPrams of content view, please check the anchor view"
            android.util.Log.w(r0, r1)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.ArrowPopupView.m9942l():void");
    }

    /* renamed from: m */
    private void m9943m(int i) {
        int i2;
        int width = this.f9044d.getWidth();
        int height = this.f9044d.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(this.f9047g.getMeasuredWidth(), this.f9047g.getMinimumWidth());
        int max2 = Math.max(this.f9047g.getMeasuredHeight(), this.f9047g.getMinimumHeight());
        int arrowWidth = getArrowWidth();
        int arrowHeight = getArrowHeight();
        int[] iArr = new int[2];
        this.f9044d.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i6 = ((width / 2) + i3) - i5;
        this.f9034L = i6;
        int i7 = width2 - i6;
        this.f9036N = (i3 + ((width - arrowWidth) / 2)) - i5;
        this.f9035M = getTop() + this.f9055o;
        if (m9945o()) {
            this.f9035M += ((i4 - iArr[1]) - max2) + (this.f9047g.getPaddingBottom() - arrowHeight);
            i2 = (((i4 - iArr[1]) - arrowHeight) + this.f9055o) - 1;
        } else if (m9949s()) {
            int paddingTop = this.f9035M + (((i4 + height) - iArr[1]) - this.f9047g.getPaddingTop()) + arrowHeight;
            this.f9035M = paddingTop;
            i2 = paddingTop + (this.f9047g.getPaddingTop() - arrowHeight) + 1;
        } else {
            i2 = 0;
        }
        int i8 = max / 2;
        int i9 = max - i8;
        int i10 = this.f9034L;
        if (i10 >= i8 && i7 >= i9) {
            this.f9034L = i10 - i8;
        } else if (i7 < i9) {
            this.f9034L = width2 - max;
        } else if (i10 < i8) {
            this.f9034L = 0;
        }
        int i11 = this.f9034L + i;
        this.f9034L = i11;
        int i12 = this.f9036N + i;
        this.f9036N = i12;
        if (i12 < 0) {
            this.f9036N = 0;
        } else if (i12 + arrowWidth > width2) {
            this.f9036N = i12 - ((i12 + arrowWidth) - width2);
        }
        this.f9047g.layout(Math.max(i11, 0), Math.max(this.f9035M, 0), Math.min(this.f9034L + max, width2), Math.min(this.f9035M + max2, height2));
        m9944n(arrowWidth, arrowHeight, i2);
    }

    /* renamed from: n */
    private void m9944n(int i, int i2, int i3) {
        int i4;
        int i5 = this.f9032J;
        boolean z = false;
        boolean z2 = i5 == 1 || (i5 == 2 && C1656j.m6983b(this));
        int i6 = this.f9043U;
        if (i6 == 9 || i6 == 10) {
            if ((!z2 && i6 == 9) || (z2 && i6 == 10)) {
                z = true;
            }
            LinearLayout linearLayout = this.f9047g;
            int left = z ? (linearLayout.getLeft() + this.f9047g.getPaddingStart()) - 1 : (linearLayout.getRight() - this.f9047g.getPaddingStart()) - i;
            i3 = (i3 + this.f9047g.getPaddingTop()) - i2;
            AppCompatImageView appCompatImageView = this.f9045e;
            appCompatImageView.layout(left, i3, left + i, appCompatImageView.getMeasuredHeight() + i3);
            i4 = left;
        } else if (i6 == 17 || i6 == 18) {
            if ((!z2 && i6 == 18) || (z2 && i6 == 17)) {
                z = true;
            }
            LinearLayout linearLayout2 = this.f9047g;
            int left2 = z ? linearLayout2.getLeft() + this.f9047g.getPaddingStart() : (linearLayout2.getRight() - this.f9047g.getPaddingEnd()) - i;
            int bottom = (this.f9047g.getBottom() - this.f9047g.getPaddingBottom()) - (this.f9045e.getMeasuredHeight() - i2);
            i4 = left2;
            if (this.f9043U == 18) {
                AppCompatImageView appCompatImageView2 = this.f9045e;
                appCompatImageView2.layout(i4, bottom, i4 + i, appCompatImageView2.getMeasuredHeight() + bottom);
            }
            i3 = bottom - 5;
        } else {
            i4 = this.f9036N;
        }
        AppCompatImageView appCompatImageView3 = this.f9045e;
        appCompatImageView3.layout(i4, i3, i + i4, appCompatImageView3.getDrawable().getIntrinsicHeight() + i3);
    }

    /* renamed from: o */
    private boolean m9945o() {
        return m9946p(16);
    }

    /* renamed from: p */
    private boolean m9946p(int i) {
        return (this.f9043U & i) == i;
    }

    /* renamed from: q */
    private boolean m9947q() {
        return m9946p(32);
    }

    /* renamed from: r */
    private boolean m9948r() {
        return m9946p(64);
    }

    /* renamed from: s */
    private boolean m9949s() {
        return m9946p(8);
    }

    /* renamed from: t */
    private boolean m9950t() {
        return m9949s() || m9945o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r0 = r3.f9024B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0 = r3.f9023A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r0 = r3.f9065y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r0 = r3.f9066z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r1 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
        if (r1 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        r0 = r3.f9064x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r0 = r3.f9063w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (r1 != false) goto L_0x005c;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9951v(int r4) {
        /*
            r3 = this;
            int r0 = r3.f9032J
            r1 = 1
            if (r0 == r1) goto L_0x0010
            r2 = 2
            if (r0 != r2) goto L_0x000f
            boolean r0 = p055i3.C1656j.m6983b(r3)
            if (r0 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r0 = 32
            if (r4 == r0) goto L_0x005f
            r0 = 64
            if (r4 == r0) goto L_0x0055
            switch(r4) {
                case 8: goto L_0x0045;
                case 9: goto L_0x0040;
                case 10: goto L_0x0036;
                default: goto L_0x001b;
            }
        L_0x001b:
            switch(r4) {
                case 16: goto L_0x002e;
                case 17: goto L_0x0029;
                case 18: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0064
        L_0x001f:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x0026
        L_0x0023:
            android.graphics.drawable.Drawable r0 = r3.f9024B
            goto L_0x0032
        L_0x0026:
            android.graphics.drawable.Drawable r0 = r3.f9023A
            goto L_0x0032
        L_0x0029:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x0023
            goto L_0x0026
        L_0x002e:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            android.graphics.drawable.Drawable r0 = r3.f9062v
        L_0x0032:
            r4.setImageDrawable(r0)
            goto L_0x0064
        L_0x0036:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x003d
        L_0x003a:
            android.graphics.drawable.Drawable r0 = r3.f9065y
            goto L_0x0032
        L_0x003d:
            android.graphics.drawable.Drawable r0 = r3.f9066z
            goto L_0x0032
        L_0x0040:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x003a
            goto L_0x003d
        L_0x0045:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            android.widget.LinearLayout r0 = r3.f9048h
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0052
            android.graphics.drawable.Drawable r0 = r3.f9061u
            goto L_0x0032
        L_0x0052:
            android.graphics.drawable.Drawable r0 = r3.f9060t
            goto L_0x0032
        L_0x0055:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x005c
        L_0x0059:
            android.graphics.drawable.Drawable r0 = r3.f9064x
            goto L_0x0032
        L_0x005c:
            android.graphics.drawable.Drawable r0 = r3.f9063w
            goto L_0x0032
        L_0x005f:
            androidx.appcompat.widget.AppCompatImageView r4 = r3.f9045e
            if (r1 == 0) goto L_0x0059
            goto L_0x005c
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.ArrowPopupView.m9951v(int):void");
    }

    public int getArrowMode() {
        return this.f9043U;
    }

    public int getContentFrameWrapperBottomPadding() {
        return this.f9047g.getPaddingBottom();
    }

    public int getContentFrameWrapperTopPadding() {
        return this.f9047g.getPaddingTop();
    }

    public View getContentView() {
        if (this.f9046f.getChildCount() > 0) {
            return this.f9046f.getChildAt(0);
        }
        return null;
    }

    public AppCompatButton getNegativeButton() {
        return this.f9051k;
    }

    public AppCompatButton getPositiveButton() {
        return this.f9050j;
    }

    @Deprecated
    public float getRollingPercent() {
        return 1.0f;
    }

    public int getTitleHeight() {
        if (this.f9048h.getVisibility() != 8) {
            return this.f9048h.getMeasuredHeight();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        int i3;
        Drawable drawable;
        int i4;
        int i5;
        if (this.f9056p == null) {
            int width = this.f9034L + (this.f9047g.getWidth() / 2);
            int height = this.f9035M + (this.f9047g.getHeight() / 2);
            int i6 = this.f9043U;
            if (i6 != 8) {
                if (i6 == 16) {
                    f = 180.0f;
                    i5 = this.f9036N + (this.f9045e.getMeasuredWidth() / 2);
                    i2 = this.f9047g.getRight() - i5;
                    i4 = this.f9034L;
                } else if (i6 == 32) {
                    f = -90.0f;
                    i5 = this.f9037O + (this.f9045e.getMeasuredHeight() / 2);
                    i2 = this.f9047g.getBottom() - i5;
                    i4 = this.f9035M;
                } else if (i6 != 64) {
                    f = 0.0f;
                    i2 = 0;
                    i = 0;
                } else {
                    f = 90.0f;
                    int measuredHeight = this.f9037O + (this.f9045e.getMeasuredHeight() / 2);
                    i2 = measuredHeight - this.f9035M;
                    i = this.f9047g.getBottom() - measuredHeight;
                }
                i = i5 - i4;
            } else {
                int measuredWidth = this.f9036N + (this.f9045e.getMeasuredWidth() / 2);
                i2 = measuredWidth - this.f9034L;
                i = this.f9047g.getRight() - measuredWidth;
                f = 0.0f;
            }
            int save = canvas.save();
            canvas.rotate(f, (float) width, (float) height);
            int i7 = this.f9043U;
            if (i7 == 8 || i7 == 16) {
                canvas.translate((float) this.f9034L, (float) this.f9035M);
                this.f9057q.setBounds(0, 0, i2, this.f9047g.getHeight());
                canvas.translate(0.0f, (float) (m9949s() ? this.f9039Q : -this.f9039Q));
                this.f9057q.draw(canvas);
                canvas.translate((float) i2, 0.0f);
                drawable = this.f9058r;
                i3 = this.f9047g.getHeight();
            } else {
                if (i7 == 32 || i7 == 64) {
                    canvas.translate((float) (width - (this.f9047g.getHeight() / 2)), (float) (height - (this.f9047g.getWidth() / 2)));
                    this.f9057q.setBounds(0, 0, i2, this.f9047g.getWidth());
                    canvas.translate(0.0f, (float) (m9947q() ? this.f9039Q : -this.f9039Q));
                    this.f9057q.draw(canvas);
                    canvas.translate((float) i2, 0.0f);
                    drawable = this.f9058r;
                    i3 = this.f9047g.getWidth();
                }
                canvas.restoreToCount(save);
            }
            drawable.setBounds(0, 0, i, i3);
            this.f9058r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9045e = (AppCompatImageView) findViewById(C2661d.f10351c);
        this.f9046f = (FrameLayout) findViewById(16908290);
        LinearLayout linearLayout = (LinearLayout) findViewById(C2661d.f10349a);
        this.f9047g = linearLayout;
        linearLayout.setBackground(this.f9056p);
        this.f9047g.setMinimumHeight(getContext().getResources().getDimensionPixelOffset(C2659b.f10342a));
        if (!(this.f9057q == null || this.f9058r == null)) {
            Rect rect = new Rect();
            this.f9057q.getPadding(rect);
            LinearLayout linearLayout2 = this.f9047g;
            int i = rect.top;
            linearLayout2.setPadding(i, i, i, i);
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(C2661d.f10353e);
        this.f9048h = linearLayout3;
        linearLayout3.setBackground(this.f9059s);
        this.f9049i = (AppCompatTextView) findViewById(16908310);
        this.f9050j = (AppCompatButton) findViewById(16908314);
        this.f9051k = (AppCompatButton) findViewById(16908313);
        this.f9052l = new C2352e();
        this.f9053m = new C2352e();
        this.f9050j.setOnClickListener(this.f9052l);
        this.f9051k.setOnClickListener(this.f9053m);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9044d.isAttachedToWindow()) {
            if (this.f9043U == 0) {
                m9939i();
            }
            m9951v(this.f9043U);
            m9942l();
            return;
        }
        throw null;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f9026D;
        this.f9047g.getHitRect(rect);
        if (motionEvent.getAction() != 0 || rect.contains(x, y)) {
            View.OnTouchListener onTouchListener = this.f9025C;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
        throw null;
    }

    public void setAnchor(View view) {
        this.f9044d = view;
    }

    public void setArrowMode(int i) {
        this.f9043U = i;
        m9951v(i);
    }

    public void setArrowPopupWindow(C2716a aVar) {
    }

    public void setAutoDismiss(boolean z) {
        this.f9031I = z;
    }

    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setContentView(View view) {
        mo8980u(view, new ViewGroup.LayoutParams(-2, -2));
    }

    public void setLayoutRtlMode(int i) {
        if (i > 2 || i < 0) {
            this.f9032J = 2;
        } else {
            this.f9032J = i;
        }
    }

    @Deprecated
    public void setRollingPercent(float f) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f9048h.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f9049i.setText(charSequence);
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f9025C = onTouchListener;
    }

    /* renamed from: u */
    public void mo8980u(View view, ViewGroup.LayoutParams layoutParams) {
        this.f9046f.removeAllViews();
        if (view != null) {
            this.f9046f.addView(view, layoutParams);
        }
    }
}
