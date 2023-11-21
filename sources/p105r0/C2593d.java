package p105r0;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;
import p100q0.C2561b;
import p100q0.C2568g;
import p105r0.C2595f;
import p115t0.C2672g;
import p140y0.C2925l;
import p140y0.C2933s;

/* renamed from: r0.d */
public class C2593d implements C2595f.C2597b, C2601i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ConcurrentHashMap<String, String> f10207a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2561b f10208b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2595f f10209c;

    public C2593d(Context context, C2561b bVar) {
        this.f10208b = bVar;
        C2595f c = C2595f.m11018c();
        this.f10209c = c;
        c.mo9858e(this);
    }

    /* renamed from: f */
    private void m11010f() {
        C2925l.m12112a(new C2594e(this));
    }

    /* renamed from: g */
    private boolean m11011g(String str, String str2) {
        if (C2568g.m10961b()) {
            return false;
        }
        if ((str != null && str.equals("onetrack_bug_report")) || str2 == null || str2.length() * 2 <= 102400) {
            return true;
        }
        C2933s.m12141c("OneTrackSystemImp", "Event size exceed limitation!");
        return false;
    }

    /* renamed from: a */
    public void mo9850a(String str, String str2) {
        if (m11011g(str, str2)) {
            if (C2672g.m11175d()) {
                C2672g.m11173b(this);
            } else if (!"onetrack_cta_status".equalsIgnoreCase(str)) {
                C2672g.m11172a(str, str2);
                return;
            }
            if (C2933s.f11129a) {
                C2933s.m12141c("OneTrackSystemImp", "track name:" + str + " data :" + str2 + " tid" + Process.myTid());
            }
            synchronized (this.f10207a) {
                if (!this.f10209c.mo9859f(str, str2, this.f10208b)) {
                    this.f10207a.put(str2, str);
                    if (C2933s.f11129a) {
                        C2933s.m12141c("OneTrackSystemImp", "track mIOneTrackService is null!" + this.f10207a.size() + "  " + str2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo9855b() {
        if (C2672g.m11175d()) {
            m11010f();
        }
    }

    /* renamed from: c */
    public void mo9852c(int i) {
        this.f10209c.mo9857d(i);
    }
}
