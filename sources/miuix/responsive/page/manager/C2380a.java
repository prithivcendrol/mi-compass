package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Objects;
import p014b4.C1319a;
import p026d4.C1507b;
import p117t2.C2693a;

/* renamed from: miuix.responsive.page.manager.a */
public abstract class C2380a {

    /* renamed from: c */
    protected static boolean f9196c = true;

    /* renamed from: a */
    protected final C1507b f9197a = new C1507b();

    /* renamed from: b */
    protected C1507b f9198b;

    /* renamed from: e */
    public static boolean m10077e() {
        return f9196c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1507b mo9062a() {
        return C1319a.m5965a(mo7636c(), C2693a.m11238g(mo7636c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1507b mo9063b(Configuration configuration) {
        return C1319a.m5966b(mo7636c(), C2693a.m11238g(mo7636c()), configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Context mo7636c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo9064d(C1507b bVar, C1507b bVar2) {
        return Objects.equals(bVar, bVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo9065f(Configuration configuration) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo9066g(Configuration configuration) {
    }
}
