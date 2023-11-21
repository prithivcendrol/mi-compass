package p010b0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p083n1.C2422g;

/* renamed from: b0.e */
public final class C1290e extends C1294i {

    /* renamed from: e */
    private final ViewGroup f4483e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1290e(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C2422g.m10285e(fragment, "fragment");
        this.f4483e = viewGroup;
    }
}
