package p140y0;

import android.text.TextUtils;
import android.util.LruCache;
import p140y0.C2927n;

/* renamed from: y0.o */
final class C2929o extends LruCache<String, C2927n.C2928a> {
    C2929o(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int sizeOf(String str, C2927n.C2928a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f11116a)) {
            return 0;
        }
        return aVar.f11116a.length();
    }
}
