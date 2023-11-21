package p140y0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120u0.C2733d;

/* renamed from: y0.j */
public class C2920j {

    /* renamed from: a */
    private static Method f11100a;

    /* renamed from: b */
    private static Method f11101b;

    /* renamed from: c */
    private static Method f11102c;

    /* renamed from: d */
    private static Object f11103d;

    /* renamed from: e */
    private static Method f11104e;

    /* renamed from: f */
    private static Method f11105f;

    /* renamed from: g */
    private static String f11106g;

    /* renamed from: h */
    private static String f11107h;

    /* renamed from: i */
    private static String f11108i;

    /* renamed from: j */
    private static String f11109j;

    /* renamed from: y0.j$a */
    private static class C2921a {

        /* renamed from: y0.j$a$a */
        private static final class C2922a implements ServiceConnection {

            /* renamed from: a */
            private boolean f11110a;

            /* renamed from: b */
            private IBinder f11111b;

            private C2922a() {
                this.f11110a = false;
            }

            /* synthetic */ C2922a(C2924k kVar) {
                this();
            }

            /* renamed from: a */
            public IBinder mo10218a() {
                IBinder iBinder = this.f11111b;
                if (iBinder != null) {
                    return iBinder;
                }
                if (iBinder == null && !this.f11110a) {
                    synchronized (this) {
                        wait(30000);
                        if (this.f11111b == null) {
                            throw new InterruptedException("Not connect or connect timeout to google play service");
                        }
                    }
                }
                return this.f11111b;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this) {
                    this.f11111b = iBinder;
                    notifyAll();
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                this.f11110a = true;
                this.f11111b = null;
            }
        }

        /* renamed from: y0.j$a$b */
        private static final class C2923b implements IInterface {

            /* renamed from: a */
            private IBinder f11112a;

            public C2923b(IBinder iBinder) {
                this.f11112a = iBinder;
            }

            public IBinder asBinder() {
                return this.f11112a;
            }

            /* renamed from: b */
            public String mo10222b() {
                if (this.f11112a == null) {
                    return "";
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f11112a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public boolean mo10223x(boolean z) {
                boolean z2 = false;
                if (this.f11112a == null) {
                    return false;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f11112a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        static String m12106a(Context context) {
            if (!m12108c(context)) {
                C2933s.m12141c("GAIDClient", "Google play service is not available");
                return "";
            }
            C2922a aVar = new C2922a((C2924k) null);
            try {
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, aVar, 1)) {
                    String b = new C2923b(aVar.mo10218a()).mo10222b();
                    context.unbindService(aVar);
                    return b;
                }
            } catch (Exception e) {
                C2933s.m12143e("GAIDClient", "Query Google ADID failed ", e);
            } catch (Throwable th) {
                context.unbindService(aVar);
                throw th;
            }
            context.unbindService(aVar);
            return "";
        }

        /* renamed from: b */
        static boolean m12107b(Context context) {
            if (!m12108c(context)) {
                C2933s.m12141c("GAIDClient", "Google play service is not available");
                return false;
            }
            C2922a aVar = new C2922a((C2924k) null);
            try {
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, aVar, 1)) {
                    boolean x = new C2923b(aVar.mo10218a()).mo10223x(true);
                    context.unbindService(aVar);
                    return x;
                }
            } catch (Exception e) {
                C2933s.m12143e("GAIDClient", "Query Google isLimitAdTrackingEnabled failed ", e);
            } catch (Throwable th) {
                context.unbindService(aVar);
                throw th;
            }
            context.unbindService(aVar);
            return false;
        }

        /* renamed from: c */
        private static boolean m12108c(Context context) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 16384);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
    }

    static {
        try {
            f11100a = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
        } catch (Exception unused) {
        }
        try {
            Class<?> cls = Class.forName("miui.telephony.TelephonyManagerEx");
            f11103d = cls.getMethod("getDefault", new Class[0]).invoke((Object) null, new Object[0]);
            f11101b = cls.getMethod("getImeiList", new Class[0]);
            f11102c = cls.getMethod("getMeidList", new Class[0]);
            f11105f = cls.getMethod("getSubscriberIdForSlot", new Class[]{Integer.TYPE});
        } catch (Exception unused2) {
        }
        try {
            f11104e = Class.forName("android.telephony.TelephonyManager").getMethod("getImei", new Class[]{Integer.TYPE});
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    private static List<String> m12086a(Context context) {
        if (f11104e == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String str = (String) f11104e.invoke(telephonyManager, new Object[]{0});
            if (m12095j(str)) {
                arrayList.add(str);
            }
            if (m12099n()) {
                String str2 = (String) f11104e.invoke(telephonyManager, new Object[]{1});
                if (m12095j(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            C2933s.m12141c("DeviceUtil", "getImeiListAboveLollipop failed ex: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m12087b(Context context) {
        if (!TextUtils.isEmpty(f11106g)) {
            return f11106g;
        }
        m12103r(context);
        return !TextUtils.isEmpty(f11106g) ? f11106g : "";
    }

    /* renamed from: c */
    public static void m12088c() {
        f11108i = null;
    }

    /* renamed from: d */
    private static boolean m12089d(List<String> list) {
        for (String j : list) {
            if (!m12095j(j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static String[] m12090e(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        Method method;
        Object obj;
        String[] strArr = new String[2];
        try {
            Class cls3 = Integer.TYPE;
            String str = (String) cls.getMethod("getSubscriberId", new Class[]{cls3}).invoke(telephonyManager, new Object[]{Integer.valueOf(((int[]) cls2.getMethod("getSubId", new Class[]{cls3}).invoke(subscriptionManager, new Object[]{0}))[0])});
            strArr[0] = str;
            if (m12097l(str) || (method = f11105f) == null || (obj = f11103d) == null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", new Class[]{cls3}).invoke(telephonyManager, new Object[]{Integer.valueOf(((int[]) cls2.getMethod("getSubId", new Class[]{cls3}).invoke(subscriptionManager, new Object[]{1}))[0])});
            } else {
                strArr[0] = (String) method.invoke(obj, new Object[]{0});
                strArr[1] = (String) f11105f.invoke(f11103d, new Object[]{1});
            }
        } catch (Exception e) {
            C2933s.m12141c("DeviceUtil", "getImsiFromLToP: " + e);
        }
        return strArr;
    }

    /* renamed from: f */
    public static String m12091f(Context context) {
        if (!TextUtils.isEmpty(f11109j)) {
            return f11109j;
        }
        String b = m12087b(context);
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        String h = C2733d.m11398h(b);
        f11109j = h;
        return h;
    }

    /* renamed from: g */
    private static String m12092g(String str) {
        try {
            Method method = f11100a;
            if (method != null) {
                return String.valueOf(method.invoke((Object) null, new Object[]{str}));
            }
        } catch (Exception e) {
            C2933s.m12141c("DeviceUtil", "getProp failed ex: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: h */
    private static String[] m12093h(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        String[] strArr = new String[2];
        try {
            Class cls3 = Integer.TYPE;
            int[] iArr = (int[]) cls2.getMethod("getSubscriptionIds", new Class[]{cls3}).invoke(subscriptionManager, new Object[]{0});
            if (iArr != null) {
                strArr[0] = (String) cls.getMethod("getSubscriberId", new Class[]{cls3}).invoke(telephonyManager, new Object[]{Integer.valueOf(iArr[0])});
            }
        } catch (Exception e) {
            C2933s.m12144f("DeviceUtil", "get imsi1 above Android Q exception:" + e);
        }
        try {
            Class cls4 = Integer.TYPE;
            int[] iArr2 = (int[]) cls2.getMethod("getSubscriptionIds", new Class[]{cls4}).invoke(subscriptionManager, new Object[]{1});
            if (iArr2 != null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", new Class[]{cls4}).invoke(telephonyManager, new Object[]{Integer.valueOf(iArr2[0])});
            }
        } catch (Exception e2) {
            C2933s.m12144f("DeviceUtil", "get imsi2 above Android Q exception:" + e2);
        }
        return strArr;
    }

    /* renamed from: i */
    public static String m12094i() {
        return Build.MODEL;
    }

    /* renamed from: j */
    private static boolean m12095j(String str) {
        return str != null && str.length() == 15 && !str.matches("^0*$");
    }

    /* renamed from: k */
    public static String m12096k() {
        return Build.MANUFACTURER;
    }

    /* renamed from: l */
    private static boolean m12097l(String str) {
        return str != null && str.length() >= 6 && str.length() <= 15 && !str.matches("^0*$");
    }

    /* renamed from: m */
    private static List<String> m12098m() {
        if (f11101b == null || m12100o()) {
            return null;
        }
        try {
            List<String> list = (List) f11101b.invoke(f11103d, new Object[0]);
            if (list == null || list.size() <= 0 || m12089d(list)) {
                return null;
            }
            return list;
        } catch (Exception e) {
            C2933s.m12141c("DeviceUtil", "getImeiListFromMiui failed ex: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: n */
    private static boolean m12099n() {
        if ("dsds".equals(m12092g("persist.radio.multisim.config"))) {
            return true;
        }
        String str = Build.DEVICE;
        return "lcsh92_wet_jb9".equals(str) || "lcsh92_wet_tdd".equals(str) || "HM2013022".equals(str) || "HM2013023".equals(str) || "armani".equals(str) || "HM2014011".equals(str) || "HM2014012".equals(str);
    }

    /* renamed from: o */
    private static boolean m12100o() {
        return false;
    }

    /* renamed from: p */
    public static String m12101p(Context context) {
        if (!TextUtils.isEmpty(f11108i)) {
            return f11108i;
        }
        if (C2921a.m12107b(context)) {
            return "";
        }
        String a = C2921a.m12106a(context);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        f11108i = a;
        return a;
    }

    /* renamed from: q */
    public static List<String> m12102q(Context context) {
        List<String> r = m12103r(context);
        ArrayList arrayList = new ArrayList();
        if (r != null && !r.isEmpty()) {
            for (int i = 0; i < r.size(); i++) {
                if (!TextUtils.isEmpty(r.get(i))) {
                    arrayList.add(i, C2733d.m11398h(r.get(i)));
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: r */
    public static List<String> m12103r(Context context) {
        List<String> list;
        if (C2938w.m12181b(context)) {
            list = m12098m();
            if (list == null || list.isEmpty()) {
                list = m12086a(context);
            }
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            Collections.sort(list);
            f11106g = list.get(0);
            if (list.size() >= 2) {
                f11107h = list.get(1);
            }
        }
        return list;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: s */
    public static List<String> m12104s(Context context) {
        String str;
        String str2;
        if (!C2938w.m12184e(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (m12099n()) {
                Class<?> cls = Class.forName("android.telephony.TelephonyManager");
                int i = Build.VERSION.SDK_INT;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                Class<?> cls2 = Class.forName("android.telephony.SubscriptionManager");
                if (i < 29) {
                    str2 = m12090e(cls, cls2, telephonyManager, subscriptionManager)[0];
                    str = m12090e(cls, cls2, telephonyManager, subscriptionManager)[1];
                } else {
                    str2 = m12093h(cls, cls2, telephonyManager, subscriptionManager)[0];
                    str = m12093h(cls, cls2, telephonyManager, subscriptionManager)[1];
                }
                if (!m12097l(str2)) {
                    str2 = "";
                }
                arrayList.add(str2);
                if (!m12097l(str)) {
                    str = "";
                }
                arrayList.add(str);
                return arrayList;
            }
            String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            if (m12097l(subscriberId)) {
                arrayList.add(subscriberId);
            }
            return arrayList;
        } catch (SecurityException unused) {
            C2933s.m12141c("DeviceUtil", "getImsiList failed with on permission");
            return null;
        } catch (Exception e) {
            C2933s.m12145g("DeviceUtil", "getImsiList failed!", e);
            return null;
        }
    }

    /* renamed from: t */
    public static String m12105t(Context context) {
        try {
            List<String> s = m12104s(context);
            if (s == null) {
                return "";
            }
            for (int i = 0; i < s.size(); i++) {
                s.set(i, C2733d.m11400j(s.get(i)));
            }
            return s.toString();
        } catch (Throwable th) {
            C2933s.m12145g(C2933s.m12139a("DeviceUtil"), "getImeiListMd5 failed!", th);
            return "";
        }
    }
}
