package p076m0;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: m0.b */
public final class C1893b {

    /* renamed from: a */
    protected C1894c f7290a = new C1894c();

    /* renamed from: b */
    protected C1892a f7291b;

    public C1893b(C1892a aVar) {
        this.f7291b = aVar;
    }

    /* renamed from: b */
    private boolean m7821b() {
        Object obj;
        try {
            Method method = Class.forName("miui.app.profile.ProfileManager").getMethod("isEnabled", (Class[]) null);
            method.setAccessible(true);
            obj = method.invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            obj = Boolean.FALSE;
        }
        return obj != null && ((Boolean) obj).booleanValue();
    }

    /* renamed from: a */
    public boolean mo6454a(Context context) {
        if (m7821b() && this.f7290a.mo6459a(context, "isDialogNoNetworkInChina")) {
            return this.f7290a.mo6460b(context);
        }
        C1892a aVar = this.f7291b;
        if (aVar != null) {
            return aVar.mo6449a(context);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo6455c(Context context) {
        if (m7821b() && this.f7290a.mo6459a(context, "isGoMiuiPermSetting")) {
            return this.f7290a.mo6461c(context);
        }
        C1892a aVar = this.f7291b;
        if (aVar != null) {
            return aVar.mo6450b(context);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo6456d(Context context) {
        if (m7821b() && this.f7290a.mo6459a(context, "isShowCtaDialog")) {
            return this.f7290a.mo6462d(context);
        }
        C1892a aVar = this.f7291b;
        if (aVar != null) {
            return aVar.mo6451c(context);
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo6457e(Context context) {
        if (m7821b() && this.f7290a.mo6459a(context, "isShowPermissionUse")) {
            return this.f7290a.mo6463e(context);
        }
        C1892a aVar = this.f7291b;
        if (aVar != null) {
            return aVar.mo6452d(context);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo6458f(Context context) {
        if (m7821b() && this.f7290a.mo6459a(context, "isTrackEvent")) {
            return this.f7290a.mo6464f(context);
        }
        C1892a aVar = this.f7291b;
        if (aVar != null) {
            return aVar.mo6453e(context);
        }
        return false;
    }
}
