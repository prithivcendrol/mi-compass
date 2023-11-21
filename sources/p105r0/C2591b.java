package p105r0;

import android.content.Context;
import p100q0.C2561b;
import p100q0.C2568g;
import p110s0.C2638a;
import p115t0.C2672g;
import p130w0.C2874a;
import p130w0.C2877c;
import p130w0.C2879e;
import p140y0.C2925l;
import p140y0.C2933s;

/* renamed from: r0.b */
public class C2591b implements C2601i {

    /* renamed from: a */
    private C2561b f10205a;

    public C2591b(Context context, C2561b bVar) {
        C2879e.m11901c(context);
        this.f10205a = bVar;
    }

    /* renamed from: a */
    public void mo9850a(String str, String str2) {
        if (mo9853d(str, str2)) {
            if (!C2672g.m11175d()) {
                C2672g.m11172a(str, str2);
                return;
            }
            C2672g.m11173b(this);
            if (C2933s.f11129a && !str.equalsIgnoreCase("onetrack_bug_report")) {
                C2933s.m12141c("OneTrackLocalImp", "track data:" + str2);
            }
            C2638a.m11112c(this.f10205a.mo9800b());
            if (!mo9851b(str)) {
                C2877c.m11898a(this.f10205a.mo9800b(), C2874a.m11880e(), str, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9851b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "disable_log"
            r1 = 0
            s0.e r2 = p110s0.C2642e.m11130c()     // Catch:{ Exception -> 0x0022 }
            q0.b r3 = r5.f10205a     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = r3.mo9800b()     // Catch:{ Exception -> 0x0022 }
            boolean r2 = r2.mo9913f(r3, r0)     // Catch:{ Exception -> 0x0022 }
            s0.e r3 = p110s0.C2642e.m11130c()     // Catch:{ Exception -> 0x0020 }
            q0.b r4 = r5.f10205a     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = r4.mo9800b()     // Catch:{ Exception -> 0x0020 }
            boolean r6 = r3.mo9914g(r4, r6, r0, r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x003f
        L_0x0020:
            r6 = move-exception
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            r2 = r1
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isDisableTrack: "
            r0.append(r3)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "OneTrackLocalImp"
            p140y0.C2933s.m12141c(r0, r6)
            r6 = r1
        L_0x003f:
            if (r2 != 0) goto L_0x0043
            if (r6 == 0) goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p105r0.C2591b.mo9851b(java.lang.String):boolean");
    }

    /* renamed from: c */
    public void mo9852c(int i) {
        if (C2672g.m11175d() && i == 2) {
            C2925l.m12112a(new C2592c(this));
        }
    }

    /* renamed from: d */
    public boolean mo9853d(String str, String str2) {
        if (C2568g.m10961b() || C2568g.m10962c()) {
            return false;
        }
        if ((str != null && str.equals("onetrack_bug_report")) || str2 == null || str2.length() * 2 <= 102400) {
            return true;
        }
        C2933s.m12141c("OneTrackLocalImp", "Event size exceed limitation!");
        return false;
    }
}
