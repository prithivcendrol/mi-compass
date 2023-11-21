package p015c;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import p083n1.C2420e;

/* renamed from: c.b */
public final class C1321b extends C1320a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C1322a f4506a = new C1322a((C2420e) null);

    /* renamed from: c.b$a */
    public static final class C1322a {
        private C1322a() {
        }

        public /* synthetic */ C1322a(C2420e eVar) {
            this();
        }
    }

    /* renamed from: b */
    public Map<String, Boolean> mo3418a(int i, Intent intent) {
        if (i != -1) {
            return C1496z.m6504d();
        }
        if (intent == null) {
            return C1496z.m6504d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C1496z.m6504d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C1496z.m6507g(C1487q.m6480o(C1473e.m6450d(stringArrayExtra), arrayList));
    }
}
