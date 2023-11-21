package miuix.appcompat.app.floatingactivity;

import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1047l;
import androidx.lifecycle.C1056t;
import miuix.appcompat.app.C2118q;

public class FloatingLifecycleObserver implements C1047l {

    /* renamed from: d */
    protected String f7673d;

    /* renamed from: e */
    protected int f7674e;

    public FloatingLifecycleObserver(C2118q qVar) {
        this.f7673d = qVar.mo7560E0();
        this.f7674e = qVar.getTaskId();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo7446h() {
        return this.f7673d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo7447i() {
        return this.f7674e;
    }

    @C1056t(C1035g.C1037b.ON_CREATE)
    public void onCreate() {
    }

    @C1056t(C1035g.C1037b.ON_DESTROY)
    public void onDestroy() {
    }

    @C1056t(C1035g.C1037b.ON_PAUSE)
    public void onPause() {
    }

    @C1056t(C1035g.C1037b.ON_RESUME)
    public void onResume() {
    }
}
