package androidx.core.p008os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import p083n1.C2422g;

/* renamed from: androidx.core.os.c */
final class C0576c {

    /* renamed from: a */
    public static final C0576c f2586a = new C0576c();

    private C0576c() {
    }

    /* renamed from: a */
    public static final void m2386a(Bundle bundle, String str, Size size) {
        C2422g.m10285e(bundle, "bundle");
        C2422g.m10285e(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m2387b(Bundle bundle, String str, SizeF sizeF) {
        C2422g.m10285e(bundle, "bundle");
        C2422g.m10285e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
