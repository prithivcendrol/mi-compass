package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0235p;

/* renamed from: androidx.appcompat.widget.n0 */
public abstract class C0359n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    private final float f1373d;

    /* renamed from: e */
    private final int f1374e;

    /* renamed from: f */
    private final int f1375f;

    /* renamed from: g */
    final View f1376g;

    /* renamed from: h */
    private Runnable f1377h;

    /* renamed from: i */
    private Runnable f1378i;

    /* renamed from: j */
    private boolean f1379j;

    /* renamed from: k */
    private int f1380k;

    /* renamed from: l */
    private final int[] f1381l = new int[2];

    /* renamed from: androidx.appcompat.widget.n0$a */
    private class C0360a implements Runnable {
        C0360a() {
        }

        public void run() {
            ViewParent parent = C0359n0.this.f1376g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    private class C0361b implements Runnable {
        C0361b() {
        }

        public void run() {
            C0359n0.this.mo2020e();
        }
    }

    public C0359n0(View view) {
        this.f1376g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1373d = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1374e = tapTimeout;
        this.f1375f = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1629a() {
        Runnable runnable = this.f1378i;
        if (runnable != null) {
            this.f1376g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1377h;
        if (runnable2 != null) {
            this.f1376g.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1630f(MotionEvent motionEvent) {
        C0346l0 l0Var;
        View view = this.f1376g;
        C0235p b = mo720b();
        if (b == null || !b.isShowing() || (l0Var = (C0346l0) b.mo824l()) == null || !l0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1633i(view, obtainNoHistory);
        m1634j(l0Var, obtainNoHistory);
        boolean e = l0Var.mo1972e(obtainNoHistory, this.f1380k);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1631g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1376g
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1380k
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1373d
            boolean r6 = m1632h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1629a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1629a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1380k = r6
            java.lang.Runnable r6 = r5.f1377h
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.n0$a r6 = new androidx.appcompat.widget.n0$a
            r6.<init>()
            r5.f1377h = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1377h
            int r1 = r5.f1374e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1378i
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.n0$b r6 = new androidx.appcompat.widget.n0$b
            r6.<init>()
            r5.f1378i = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1378i
            int r1 = r5.f1375f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0359n0.m1631g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1632h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1633i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1381l;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1634j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1381l;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0235p mo720b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo721c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1779d() {
        C0235p b = mo720b();
        if (b == null || !b.isShowing()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2020e() {
        m1629a();
        View view = this.f1376g;
        if (view.isEnabled() && !view.isLongClickable() && mo721c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1379j = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1379j;
        if (z2) {
            z = m1630f(motionEvent) || !mo1779d();
        } else {
            z = m1631g(motionEvent) && mo721c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1376g.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1379j = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1379j = false;
        this.f1380k = -1;
        Runnable runnable = this.f1377h;
        if (runnable != null) {
            this.f1376g.removeCallbacks(runnable);
        }
    }
}
