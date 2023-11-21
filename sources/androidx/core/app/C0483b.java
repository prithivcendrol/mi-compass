package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.C0510a;
import androidx.core.p008os.C0574a;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.b */
public class C0483b extends C0510a {

    /* renamed from: c */
    private static C0486c f2460c;

    /* renamed from: androidx.core.app.b$a */
    static class C0484a {
        /* renamed from: a */
        static void m2061a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m2062b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m2063c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    static class C0485b {
        /* renamed from: a */
        static void m2064a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m2065b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m2066c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    public interface C0486c {
        /* renamed from: a */
        boolean mo2545a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.b$d */
    public interface C0487d {
        /* renamed from: d */
        void mo2546d(int i);
    }

    /* renamed from: i */
    public static void m2057i(Activity activity) {
        C0484a.m2061a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m2058j(Activity activity) {
        if (!activity.isFinishing() && !C0488c.m2077i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: k */
    public static void m2059k(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C0482a(activity));
        }
    }

    /* renamed from: l */
    public static void m2060l(Activity activity, String[] strArr, int i) {
        C0486c cVar = f2460c;
        if (cVar == null || !cVar.mo2545a(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (!C0574a.m2384c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (activity instanceof C0487d) {
                ((C0487d) activity).mo2546d(i);
            }
            C0485b.m2065b(activity, strArr, i);
        }
    }
}
