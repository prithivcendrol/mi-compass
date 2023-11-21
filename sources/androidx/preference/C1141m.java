package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0727l0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.m */
public class C1141m extends RecyclerView.C1168e0 {

    /* renamed from: u */
    private final Drawable f3725u;

    /* renamed from: v */
    private ColorStateList f3726v;

    /* renamed from: w */
    private final SparseArray<View> f3727w;

    /* renamed from: x */
    private boolean f3728x;

    /* renamed from: y */
    private boolean f3729y;

    C1141m(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3727w = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = C1144p.f3743a;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f3725u = view.getBackground();
        if (textView != null) {
            this.f3726v = textView.getTextColors();
        }
    }

    /* renamed from: M */
    public View mo4130M(int i) {
        View view = this.f3727w.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f4049a.findViewById(i);
        if (findViewById != null) {
            this.f3727w.put(i, findViewById);
        }
        return findViewById;
    }

    /* renamed from: N */
    public boolean mo4131N() {
        return this.f3728x;
    }

    /* renamed from: O */
    public boolean mo4132O() {
        return this.f3729y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4133P() {
        Drawable background = this.f4049a.getBackground();
        Drawable drawable = this.f3725u;
        if (background != drawable) {
            C0727l0.m2880b0(this.f4049a, drawable);
        }
        TextView textView = (TextView) mo4130M(16908310);
        if (textView != null && this.f3726v != null && !textView.getTextColors().equals(this.f3726v)) {
            textView.setTextColor(this.f3726v);
        }
    }

    /* renamed from: Q */
    public void mo4134Q(boolean z) {
        this.f3728x = z;
    }

    /* renamed from: R */
    public void mo4135R(boolean z) {
        this.f3729y = z;
    }
}
