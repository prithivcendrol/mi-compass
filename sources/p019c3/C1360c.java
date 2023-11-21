package p019c3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p025d3.C1501b;
import p025d3.C1503d;
import p031e3.C1542a;
import p031e3.C1543b;
import p037f3.C1573b;
import p049h3.C1630a;
import p073l3.C1877a;

/* renamed from: c3.c */
public class C1360c {
    /* renamed from: a */
    public static C1359b m5998a(Context context) {
        return m5999b(context, C1630a.m6917b(context), C1630a.f6476a);
    }

    /* renamed from: b */
    public static C1359b m5999b(Context context, String str, String str2) {
        Bundle bundle;
        C1359b bVar = new C1359b(str2);
        C1501b bVar2 = new C1501b();
        bVar2.mo5582f(new C1573b());
        C1542a aVar = new C1542a();
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("LoggerFactory", e.getMessage());
            bundle = null;
        }
        aVar.mo5663b(m6001d(bundle) - 1);
        aVar.mo5664c(m6002e(bundle));
        C1543b bVar3 = new C1543b(str, str2);
        bVar3.mo5665l(aVar);
        bVar2.mo5581e(bVar3);
        bVar.mo5199a(bVar2);
        bVar.mo5202e(C1877a.f7251d ? C1358a.VERBOSE : C1358a.INFO);
        return bVar;
    }

    /* renamed from: c */
    public static C1359b m6000c() {
        C1359b bVar = new C1359b(C1630a.f6476a);
        bVar.mo5199a(new C1503d());
        bVar.mo5202e(C1877a.f7251d ? C1358a.VERBOSE : C1358a.INFO);
        return bVar;
    }

    /* renamed from: d */
    private static int m6001d(Bundle bundle) {
        if (bundle != null && bundle.containsKey("maxBackup")) {
            Object obj = bundle.get("maxBackup");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() < 20) {
                    return num.intValue();
                }
            }
            Log.e("LoggerFactory", "Log config error:maxBackup must be int type and smaller than 20");
        }
        return 4;
    }

    /* renamed from: e */
    private static int m6002e(Bundle bundle) {
        if (bundle != null && bundle.containsKey("maxFileMbSize")) {
            Object obj = bundle.get("maxFileMbSize");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() <= 10) {
                    return num.intValue() * 1024 * 1024;
                }
            }
            Log.e("LoggerFactory", "Log config error:maxFileMbSize must be int type and smaller than 10");
        }
        return 1048576;
    }
}
