package miuix.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0385r1;
import p018c2.C1347c;
import p018c2.C1357m;

public class GroupButton extends AppCompatButton {

    /* renamed from: i */
    private static final int[] f8764i = {C1347c.f4547O};

    /* renamed from: j */
    private static final int[] f8765j = {C1347c.f4551S};

    /* renamed from: k */
    private static final int[] f8766k = {C1347c.f4549Q};

    /* renamed from: l */
    private static final int[] f8767l = {C1347c.f4546N};

    /* renamed from: m */
    private static final int[] f8768m = {C1347c.f4550R};

    /* renamed from: n */
    private static final int[] f8769n = {C1347c.f4548P};

    /* renamed from: o */
    private static final int[] f8770o = {C1347c.f4552T};

    /* renamed from: g */
    private AttributeSet f8771g;

    /* renamed from: h */
    private boolean f8772h;

    public GroupButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9719a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m9719a(Context context, AttributeSet attributeSet, int i) {
        this.f8771g = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4912c1, i, 0);
        try {
            int i2 = C1357m.f4917d1;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f8772h = obtainStyledAttributes.getBoolean(i2, false);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public boolean mo8706b() {
        return this.f8772h;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return super.onCreateDrawableState(i);
        }
        if (!(viewGroup instanceof LinearLayout)) {
            return super.onCreateDrawableState(i);
        }
        int orientation = ((LinearLayout) viewGroup).getOrientation();
        int indexOfChild = viewGroup.indexOfChild(this);
        boolean z = false;
        int i2 = 0;
        boolean z2 = true;
        boolean z3 = true;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            if (viewGroup.getChildAt(i3).getVisibility() == 0) {
                i2++;
                if (i3 < indexOfChild) {
                    z2 = false;
                }
                if (i3 > indexOfChild) {
                    z3 = false;
                }
            }
        }
        if (i2 == 1) {
            z = true;
        }
        if (orientation == 1) {
            int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
            View.mergeDrawableStates(onCreateDrawableState, f8770o);
            if (!z) {
                if (z2) {
                    View.mergeDrawableStates(onCreateDrawableState, f8764i);
                } else if (z3) {
                    View.mergeDrawableStates(onCreateDrawableState, f8766k);
                } else {
                    View.mergeDrawableStates(onCreateDrawableState, f8765j);
                }
            }
            return onCreateDrawableState;
        }
        boolean b = C0385r1.m1722b(this);
        int[] onCreateDrawableState2 = super.onCreateDrawableState(i + 1);
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState2, f8770o);
        } else if (z2) {
            View.mergeDrawableStates(onCreateDrawableState2, b ? f8769n : f8767l);
        } else if (z3) {
            View.mergeDrawableStates(onCreateDrawableState2, b ? f8767l : f8769n);
        } else {
            View.mergeDrawableStates(onCreateDrawableState2, f8768m);
        }
        return onCreateDrawableState2;
    }
}
