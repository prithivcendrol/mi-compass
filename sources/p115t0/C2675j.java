package p115t0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import miuix.animation.utils.CommonUtils;
import p110s0.C2647i;
import p130w0.C2874a;
import p140y0.C2933s;

/* renamed from: t0.j */
public class C2675j extends Handler {

    /* renamed from: a */
    private final int f10462a = CommonUtils.UNIT_SECOND;

    /* renamed from: b */
    private final int f10463b = 10000;

    /* renamed from: c */
    private final int f10464c = 1200000;

    /* renamed from: d */
    private int f10465d = 10000;

    /* renamed from: e */
    private BroadcastReceiver f10466e = new C2676k(this);

    public C2675j(Looper looper) {
        super(looper);
        m11183d(C2874a.m11876a());
    }

    /* renamed from: a */
    private void m11181a() {
        if (!C2677l.m11185a().mo9939c(2)) {
            removeMessages(CommonUtils.UNIT_SECOND);
            int i = this.f10465d * 2;
            this.f10465d = i;
            if (i > 1200000) {
                this.f10465d = 1200000;
            }
            C2933s.m12141c("UploadTimer", "will restart retry msg after " + this.f10465d);
            sendEmptyMessageDelayed(CommonUtils.UNIT_SECOND, (long) this.f10465d);
            return;
        }
        this.f10465d = 10000;
        C2933s.m12141c("UploadTimer", "retry success");
    }

    /* renamed from: b */
    private void m11182b(int i, long j) {
        removeMessages(i);
        C2933s.m12141c("UploadTimer", "will post msg, prio=" + i + ", delay=" + j);
        sendEmptyMessageDelayed(i, j);
    }

    /* renamed from: d */
    private void m11183d(Context context) {
        if (context != null) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(this.f10466e, intentFilter);
            } catch (Exception e) {
                C2933s.m12141c("UploadTimer", "registerNetReceiver: " + e);
            }
        }
    }

    /* renamed from: c */
    public void mo9935c(int i, boolean z) {
        if (hasMessages(CommonUtils.UNIT_SECOND)) {
            C2933s.m12141c("UploadTimer", "in retry mode, return, prio=" + i);
            return;
        }
        if (z) {
            removeMessages(i);
        }
        if (!hasMessages(i)) {
            long a = z ? 0 : (long) C2647i.m11143a(i);
            C2933s.m12141c("UploadTimer", "will check prio=" + i + ", delay=" + a);
            m11182b(i, a);
        }
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (!C2647i.m11145c() || !C2647i.m11147e() || C2647i.m11146d()) {
            C2933s.m12141c("UploadTimer", "不用处理消息, available=" + C2647i.m11145c() + ", 是否有网=" + C2647i.m11147e() + ", 数据库是否为空=" + C2647i.m11146d());
            return;
        }
        int i = message.what;
        if (i == 1000) {
            m11181a();
            return;
        }
        boolean c = C2677l.m11185a().mo9939c(i);
        C2933s.m12141c("UploadTimer", "handleCheckUpload ret=" + c + ", prio=" + i);
        if (!c) {
            C2933s.m12141c("UploadTimer", "handleCheckUpload failed, will check if need to send retry msg");
            if (!hasMessages(CommonUtils.UNIT_SECOND)) {
                sendEmptyMessageDelayed(CommonUtils.UNIT_SECOND, (long) this.f10465d);
                C2933s.m12141c("UploadTimer", "fire retry timer after " + this.f10465d);
            }
        }
    }
}
