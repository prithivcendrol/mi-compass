package p010b0;

import androidx.fragment.app.Fragment;
import p083n1.C2422g;

/* renamed from: b0.i */
public abstract class C1294i extends RuntimeException {

    /* renamed from: d */
    private final Fragment f4486d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1294i(Fragment fragment, String str) {
        super(str);
        C2422g.m10285e(fragment, "fragment");
        this.f4486d = fragment;
    }

    /* renamed from: a */
    public final Fragment mo5117a() {
        return this.f4486d;
    }
}
