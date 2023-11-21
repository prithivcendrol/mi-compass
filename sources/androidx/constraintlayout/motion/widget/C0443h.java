package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0445j;
import androidx.constraintlayout.widget.C0462c;
import androidx.constraintlayout.widget.C0478j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.motion.widget.h */
public class C0443h extends C0462c implements C0445j.C0449d {

    /* renamed from: m */
    private boolean f1613m;

    /* renamed from: n */
    private boolean f1614n;

    /* renamed from: o */
    private float f1615o;

    /* renamed from: p */
    protected View[] f1616p;

    /* renamed from: a */
    public void mo2341a(C0445j jVar, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo2342b(C0445j jVar, int i, int i2) {
    }

    /* renamed from: c */
    public void mo2343c(C0445j jVar, int i) {
    }

    public float getProgress() {
        return this.f1615o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2345m(AttributeSet attributeSet) {
        super.mo2345m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0478j.f2020B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2038D6) {
                    this.f1613m = obtainStyledAttributes.getBoolean(index, this.f1613m);
                } else if (index == C0478j.f2029C6) {
                    this.f1614n = obtainStyledAttributes.getBoolean(index, this.f1614n);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f1615o = f;
        int i = 0;
        if (this.f1830e > 0) {
            this.f1616p = mo2478l((ConstraintLayout) getParent());
            while (i < this.f1830e) {
                mo2351x(this.f1616p[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C0443h)) {
                mo2351x(childAt, f);
            }
            i++;
        }
    }

    /* renamed from: t */
    public boolean mo2347t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo2348u() {
        return this.f1614n;
    }

    /* renamed from: v */
    public boolean mo2349v() {
        return this.f1613m;
    }

    /* renamed from: w */
    public void mo2350w(Canvas canvas) {
    }

    /* renamed from: x */
    public void mo2351x(View view, float f) {
    }
}
