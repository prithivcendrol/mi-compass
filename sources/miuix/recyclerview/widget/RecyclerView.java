package miuix.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.SpringRecyclerView;
import p034f0.C1549a;
import p143y3.C2946a;
import p148z3.C2979b;

public class RecyclerView extends SpringRecyclerView {

    /* renamed from: Z0 */
    private final C2946a f9182Z0;

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1549a.f6201a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(new C2979b());
        this.f9182Z0 = Build.VERSION.SDK_INT > 30 ? new C2946a(this) : null;
    }

    /* renamed from: K0 */
    public void mo4246K0(int i) {
        super.mo4246K0(i);
        C2946a aVar = this.f9182Z0;
        if (aVar != null) {
            aVar.mo10240e(this, i);
        }
    }

    /* renamed from: L0 */
    public void mo4248L0(int i, int i2) {
        C2946a aVar = this.f9182Z0;
        if (aVar != null) {
            aVar.mo10238b(i, i2);
        }
        super.mo4248L0(i, i2);
    }

    /* renamed from: Z */
    public boolean mo4266Z(int i, int i2) {
        if (Math.abs(i) < 300) {
            i = 0;
        }
        if (Math.abs(i2) < 300) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        return super.mo4266Z(i, i2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2946a aVar = this.f9182Z0;
        if (aVar != null) {
            aVar.mo10241g(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C2946a aVar = this.f9182Z0;
        if (aVar != null) {
            aVar.mo10239d(z);
        }
    }
}
