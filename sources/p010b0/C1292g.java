package p010b0;

import androidx.fragment.app.Fragment;
import p083n1.C2422g;

/* renamed from: b0.g */
public final class C1292g extends C1293h {

    /* renamed from: e */
    private final Fragment f4484e;

    /* renamed from: f */
    private final int f4485f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1292g(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        C2422g.m10285e(fragment, "fragment");
        C2422g.m10285e(fragment2, "targetFragment");
        this.f4484e = fragment2;
        this.f4485f = i;
    }
}
