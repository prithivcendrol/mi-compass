package miuix.springback.view;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: miuix.springback.view.a */
public class C2393a {

    /* renamed from: a */
    private int f9333a;

    /* renamed from: b */
    float f9334b;

    /* renamed from: c */
    float f9335c;

    /* renamed from: d */
    int f9336d = -1;

    /* renamed from: e */
    int f9337e;

    /* renamed from: f */
    int f9338f;

    /* renamed from: g */
    private ViewGroup f9339g;

    public C2393a(ViewGroup viewGroup, int i) {
        this.f9339g = viewGroup;
        this.f9338f = i;
        this.f9333a = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9285a(MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i = 1;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f9336d;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                        float y = motionEvent.getY(findPointerIndex);
                        float x = motionEvent.getX(findPointerIndex);
                        float f = y - this.f9334b;
                        float f2 = x - this.f9335c;
                        if (Math.abs(f2) > ((float) this.f9333a) || Math.abs(f) > ((float) this.f9333a)) {
                            if (Math.abs(f2) <= Math.abs(f)) {
                                i = 2;
                            }
                            this.f9337e = i;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            this.f9337e = 0;
            this.f9339g.requestDisallowInterceptTouchEvent(false);
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        this.f9336d = pointerId;
        int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
        if (findPointerIndex2 >= 0) {
            this.f9334b = motionEvent.getY(findPointerIndex2);
            this.f9335c = motionEvent.getX(findPointerIndex2);
            this.f9337e = 0;
        }
    }

    /* renamed from: b */
    public boolean mo9286b(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        if (findPointerIndex < 0) {
            return false;
        }
        float y = motionEvent.getY(findPointerIndex);
        float x = motionEvent.getX(findPointerIndex);
        int[] iArr = {0, 0};
        this.f9339g.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, this.f9339g.getWidth() + i, this.f9339g.getHeight() + i2).contains((int) x, (int) y);
    }
}
