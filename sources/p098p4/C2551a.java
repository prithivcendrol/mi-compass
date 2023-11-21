package p098p4;

import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.C1267a;

/* renamed from: p4.a */
public class C2551a extends C1267a {

    /* renamed from: h0 */
    boolean f10052h0;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10052h0) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e("ViewPager", "Catch IllegalArgumentException:" + e);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10052h0) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e("ViewPager", "Catch IllegalArgumentException:" + e);
            return false;
        }
    }

    public void setDraggable(boolean z) {
        this.f10052h0 = z;
    }
}
