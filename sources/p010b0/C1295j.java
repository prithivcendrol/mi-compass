package p010b0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p083n1.C2422g;

/* renamed from: b0.j */
public final class C1295j extends C1294i {

    /* renamed from: e */
    private final ViewGroup f4487e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1295j(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C2422g.m10285e(fragment, "fragment");
        C2422g.m10285e(viewGroup, "container");
        this.f4487e = viewGroup;
    }
}
