package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0662b2;
import androidx.core.view.C0675c2;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0290a extends ViewGroup {

    /* renamed from: d */
    protected final C0291a f1170d;

    /* renamed from: e */
    protected final Context f1171e;

    /* renamed from: f */
    protected ActionMenuView f1172f;

    /* renamed from: g */
    protected C0299c f1173g;

    /* renamed from: h */
    protected int f1174h;

    /* renamed from: i */
    protected C0662b2 f1175i;

    /* renamed from: j */
    private boolean f1176j;

    /* renamed from: k */
    private boolean f1177k;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0291a implements C0675c2 {

        /* renamed from: a */
        private boolean f1178a = false;

        /* renamed from: b */
        int f1179b;

        protected C0291a() {
        }

        /* renamed from: a */
        public void mo1743a(View view) {
            this.f1178a = true;
        }

        /* renamed from: b */
        public void mo523b(View view) {
            if (!this.f1178a) {
                C0290a aVar = C0290a.this;
                aVar.f1175i = null;
                C0290a.super.setVisibility(this.f1179b);
            }
        }

        /* renamed from: c */
        public void mo524c(View view) {
            C0290a.super.setVisibility(0);
            this.f1178a = false;
        }

        /* renamed from: d */
        public C0291a mo1744d(C0662b2 b2Var, int i) {
            C0290a.this.f1175i = b2Var;
            this.f1179b = i;
            return this;
        }
    }

    C0290a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0290a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1170d = new C0291a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1447a.f5675a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1171e = context;
        } else {
            this.f1171e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m1306d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1740c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1741e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0662b2 mo1147f(int i, long j) {
        C0662b2 b;
        C0662b2 b2Var = this.f1175i;
        if (b2Var != null) {
            b2Var.mo2819c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b = C0727l0.m2881c(this).mo2818b(1.0f);
        } else {
            b = C0727l0.m2881c(this).mo2818b(0.0f);
        }
        b.mo2821f(j);
        b.mo2823h(this.f1170d.mo1744d(b, i));
        return b;
    }

    public int getAnimatedVisibility() {
        return this.f1175i != null ? this.f1170d.f1179b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1174h;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1456j.f5972a, C1447a.f5677c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1456j.f6017j, 0));
        obtainStyledAttributes.recycle();
        C0299c cVar = this.f1173g;
        if (cVar != null) {
            cVar.mo1769F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1177k = false;
        }
        if (!this.f1177k) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1177k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1177k = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1176j = false;
        }
        if (!this.f1176j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1176j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1176j = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1174h = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0662b2 b2Var = this.f1175i;
            if (b2Var != null) {
                b2Var.mo2819c();
            }
            super.setVisibility(i);
        }
    }
}
