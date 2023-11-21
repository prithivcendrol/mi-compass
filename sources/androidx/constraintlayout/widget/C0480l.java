package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p087o.C2485k;

/* renamed from: androidx.constraintlayout.widget.l */
public abstract class C0480l extends C0462c {

    /* renamed from: m */
    private boolean f2451m;

    /* renamed from: n */
    private boolean f2452n;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2477i(ConstraintLayout constraintLayout) {
        mo2476h(constraintLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2345m(AttributeSet attributeSet) {
        super.mo2345m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0478j.f2334n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2352p1) {
                    this.f2451m = true;
                } else if (index == C0478j.f2397u1) {
                    this.f2452n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2451m || this.f2452n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f1830e; i++) {
                    View k = constraintLayout.mo2435k(this.f1829d[i]);
                    if (k != null) {
                        if (this.f2451m) {
                            k.setVisibility(visibility);
                        }
                        if (this.f2452n && elevation > 0.0f) {
                            k.setTranslationZ(k.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2474g();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2474g();
    }

    /* renamed from: t */
    public void mo2542t(C2485k kVar, int i, int i2) {
    }
}
