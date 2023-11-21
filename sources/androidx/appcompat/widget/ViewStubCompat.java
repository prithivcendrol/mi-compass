package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p021d.C1456j;

public final class ViewStubCompat extends View {

    /* renamed from: d */
    private int f1165d;

    /* renamed from: e */
    private int f1166e;

    /* renamed from: f */
    private WeakReference<View> f1167f;

    /* renamed from: g */
    private LayoutInflater f1168g;

    /* renamed from: h */
    private C0289a f1169h;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0289a {
        /* renamed from: a */
        void mo1739a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1165d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f5924O3, i, 0);
        this.f1166e = obtainStyledAttributes.getResourceId(C1456j.f5939R3, -1);
        this.f1165d = obtainStyledAttributes.getResourceId(C1456j.f5934Q3, 0);
        setId(obtainStyledAttributes.getResourceId(C1456j.f5929P3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1727a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1165d != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1168g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1165d, viewGroup, false);
            int i = this.f1166e;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1167f = new WeakReference<>(inflate);
            C0289a aVar = this.f1169h;
            if (aVar != null) {
                aVar.mo1739a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1166e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1168g;
    }

    public int getLayoutResource() {
        return this.f1165d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1166e = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1168g = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1165d = i;
    }

    public void setOnInflateListener(C0289a aVar) {
        this.f1169h = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1167f;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1727a();
        }
    }
}
