package p010b0;

import androidx.fragment.app.Fragment;
import p083n1.C2422g;

/* renamed from: b0.a */
public final class C1282a extends C1294i {

    /* renamed from: e */
    private final String f4462e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1282a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C2422g.m10285e(fragment, "fragment");
        C2422g.m10285e(str, "previousFragmentId");
        this.f4462e = str;
    }
}
