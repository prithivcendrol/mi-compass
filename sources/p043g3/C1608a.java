package p043g3;

import android.util.Log;

/* renamed from: g3.a */
public abstract class C1608a implements C1609b {

    /* renamed from: d */
    private boolean f6389d;

    /* renamed from: b */
    public void mo5760b() {
        this.f6389d = false;
    }

    /* renamed from: d */
    public void mo5761d() {
        if (this.f6389d) {
            Log.w("AbstractMessage", "Recycle message twice");
            return;
        }
        mo5762e();
        this.f6389d = true;
        C1610c.m6851b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo5762e();
}
