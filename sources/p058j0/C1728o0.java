package p058j0;

import android.view.View;
import android.view.WindowId;

/* renamed from: j0.o0 */
class C1728o0 implements C1732p0 {

    /* renamed from: a */
    private final WindowId f6701a;

    C1728o0(View view) {
        this.f6701a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1728o0) && ((C1728o0) obj).f6701a.equals(this.f6701a);
    }

    public int hashCode() {
        return this.f6701a.hashCode();
    }
}
