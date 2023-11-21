package p140y0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: y0.g */
class C2917g extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2916f f11094a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2917g(C2916f fVar, Looper looper) {
        super(looper);
        this.f11094a = fVar;
    }

    public void handleMessage(Message message) {
        if (message.what == 100) {
            this.f11094a.m12084j(message.getData().getString("hint"));
        }
    }
}
