package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.C2080e;
import miuix.appcompat.internal.view.menu.action.C2225b;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.appcompat.internal.view.menu.action.C2236d;
import p018c2.C1348d;
import p018c2.C1350f;
import p018c2.C1357m;
import p055i3.C1656j;
import p066k2.C1784f;
import p066k2.C1786h;

/* renamed from: miuix.appcompat.internal.app.widget.b */
abstract class C2182b extends ViewGroup {

    /* renamed from: A */
    private boolean f8224A;

    /* renamed from: B */
    protected boolean f8225B;

    /* renamed from: C */
    protected boolean f8226C;

    /* renamed from: D */
    protected int f8227D;

    /* renamed from: E */
    float f8228E;

    /* renamed from: F */
    int f8229F;

    /* renamed from: G */
    protected int f8230G;

    /* renamed from: H */
    protected Rect f8231H;

    /* renamed from: I */
    protected boolean f8232I;

    /* renamed from: J */
    protected TransitionListener f8233J;

    /* renamed from: K */
    protected View.OnClickListener f8234K;

    /* renamed from: d */
    protected AnimConfig f8235d;

    /* renamed from: e */
    protected AnimConfig f8236e;

    /* renamed from: f */
    protected AnimConfig f8237f;

    /* renamed from: g */
    protected AnimConfig f8238g;

    /* renamed from: h */
    protected AnimConfig f8239h;

    /* renamed from: i */
    protected AnimConfig f8240i;

    /* renamed from: j */
    protected boolean f8241j;

    /* renamed from: k */
    protected boolean f8242k;

    /* renamed from: l */
    protected C2233c f8243l;

    /* renamed from: m */
    protected C2225b f8244m;

    /* renamed from: n */
    protected ActionBarContainer f8245n;

    /* renamed from: o */
    protected boolean f8246o;

    /* renamed from: p */
    protected boolean f8247p;

    /* renamed from: q */
    protected boolean f8248q;

    /* renamed from: r */
    protected int f8249r;

    /* renamed from: s */
    protected int f8250s;

    /* renamed from: t */
    protected int f8251t;

    /* renamed from: u */
    protected int f8252u;

    /* renamed from: v */
    List<C2080e> f8253v;

    /* renamed from: w */
    int f8254w;

    /* renamed from: x */
    int f8255x;

    /* renamed from: y */
    int f8256y;

    /* renamed from: z */
    int f8257z;

    /* renamed from: miuix.appcompat.internal.app.widget.b$a */
    class C2183a extends TransitionListener {
        C2183a() {
        }

        public void onBegin(Object obj) {
            super.onBegin(obj);
            List<C2080e> list = C2182b.this.f8253v;
            if (list != null) {
                for (C2080e f : list) {
                    f.mo7434f(obj);
                }
            }
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            List<C2080e> list = C2182b.this.f8253v;
            if (list != null) {
                for (C2080e a : list) {
                    a.mo7429a(obj);
                }
            }
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            List<C2080e> list = C2182b.this.f8253v;
            if (list != null) {
                for (C2080e e : list) {
                    e.mo7433e(obj, collection);
                }
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.b$b */
    protected static class C2184b {

        /* renamed from: a */
        private List<View> f8259a = new ArrayList();

        /* renamed from: b */
        private boolean f8260b = true;

        /* renamed from: c */
        private float f8261c;

        /* renamed from: d */
        private boolean f8262d;

        /* renamed from: miuix.appcompat.internal.app.widget.b$b$a */
        class C2185a implements View.OnAttachStateChangeListener {
            C2185a() {
            }

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                Folme.clean(view);
            }
        }

        protected C2184b() {
        }

        /* renamed from: a */
        public void mo8127a(float f, int i, int i2, AnimConfig animConfig) {
            if (!this.f8262d) {
                if (!this.f8260b) {
                    f = this.f8261c;
                }
                AnimState add = new AnimState("to").add(ViewProperty.ALPHA, (double) f).add(ViewProperty.TRANSLATION_X, (double) i).add(ViewProperty.TRANSLATION_Y, (double) i2);
                for (View next : this.f8259a) {
                    if (next.isAttachedToWindow() && !(next.getAlpha() == f && next.getTranslationX() == ((float) i) && next.getTranslationY() == ((float) i2))) {
                        Folme.useAt(next).state().mo6815to(add, animConfig);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo8128b(View view) {
            if (!this.f8259a.contains(view)) {
                view.addOnAttachStateChangeListener(new C2185a());
                this.f8259a.add(view);
            }
        }

        /* renamed from: c */
        public void mo8129c(View view) {
            if (view != null && this.f8259a.contains(view)) {
                this.f8259a.remove(view);
            }
        }

        /* renamed from: d */
        public void mo8130d() {
            this.f8262d = false;
        }

        /* renamed from: e */
        public void mo8131e() {
            this.f8262d = true;
            for (View view : this.f8259a) {
                Folme.clean(view);
            }
        }

        /* renamed from: f */
        public void mo8132f() {
            for (View next : this.f8259a) {
                next.clearFocus();
                next.setEnabled(false);
                next.setVisibility(4);
            }
        }

        /* renamed from: g */
        public void mo8133g() {
            for (View enabled : this.f8259a) {
                enabled.setEnabled(true);
            }
        }

        /* renamed from: h */
        public void mo8134h(boolean z) {
            this.f8260b = z;
        }

        /* renamed from: i */
        public void mo8135i(float f) {
            if (!this.f8262d) {
                this.f8261c = f;
                for (View view : this.f8259a) {
                    Folme.useAt(view).state().setTo(ViewProperty.ALPHA, Float.valueOf(f));
                }
            }
        }

        /* renamed from: j */
        public void mo8136j(float f, int i, int i2) {
            mo8137k(f, i, i2, false);
        }

        /* renamed from: k */
        public void mo8137k(float f, int i, int i2, boolean z) {
            if (!this.f8262d) {
                AnimState add = new AnimState("from").add(ViewProperty.ALPHA, this.f8260b ? (double) f : (double) this.f8261c).add(ViewProperty.TRANSLATION_X, (double) i).add(ViewProperty.TRANSLATION_Y, (double) i2);
                for (View next : this.f8259a) {
                    if (z) {
                        next.setAlpha(f);
                        next.setTranslationX((float) i);
                        next.setTranslationY((float) i2);
                    }
                    if (next.isAttachedToWindow()) {
                        Folme.useAt(next).state().setTo((Object) add);
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo8138l(int i) {
            for (View next : this.f8259a) {
                next.setVisibility(i);
                if (i != 0) {
                    next.clearFocus();
                }
            }
        }
    }

    C2182b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C2182b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8254w = 1;
        this.f8255x = 1;
        this.f8256y = 1;
        this.f8257z = 1;
        this.f8224A = true;
        this.f8225B = true;
        this.f8228E = 0.0f;
        this.f8229F = 2;
        this.f8230G = Integer.MIN_VALUE;
        this.f8232I = false;
        this.f8233J = new C2183a();
        this.f8234K = null;
        this.f8226C = false;
        this.f8227D = -1;
        this.f8251t = context.getResources().getDimensionPixelSize(C1350f.f4657n);
        this.f8252u = context.getResources().getDimensionPixelSize(C1350f.f4643g);
        this.f8235d = new AnimConfig().setEase(-2, 1.0f, 0.3f);
        this.f8237f = new AnimConfig().setEase(-2, 1.0f, 0.3f).addListeners(this.f8233J);
        this.f8236e = new AnimConfig().setEase(-2, 1.0f, 0.15f);
        this.f8238g = new AnimConfig().setEase(-2, 1.0f, 0.15f).addListeners(this.f8233J);
        this.f8239h = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        this.f8240i = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4900a, 16843470, 0);
        int i2 = obtainStyledAttributes.getInt(C1357m.f5005v, 1);
        boolean z = obtainStyledAttributes.getBoolean(C1357m.f5015x, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C1357m.f4800B, true);
        obtainStyledAttributes.recycle();
        if (mo7752m()) {
            int i3 = this.f8227D;
            this.f8254w = i3;
            this.f8256y = i3;
        } else if (i2 == 0) {
            this.f8254w = 0;
            this.f8256y = 0;
        } else {
            this.f8254w = 1;
            this.f8256y = 1;
        }
        this.f8224A = z;
        this.f8225B = z2;
    }

    private void setTitleMaxHeight(int i) {
        this.f8250s = i;
        requestLayout();
    }

    private void setTitleMinHeight(int i) {
        this.f8249r = i;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public int getActionBarStyle() {
        return 16843470;
    }

    public C2233c getActionMenuView() {
        return this.f8243l;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public abstract C1784f getCollapseTitle();

    public int getExpandState() {
        return this.f8256y;
    }

    public abstract C1786h getExpandTitle();

    public C2233c getMenuView() {
        return this.f8243l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8119i(List<C2080e> list) {
        this.f8253v = list;
    }

    /* renamed from: j */
    public boolean mo7747j() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8284T(false);
    }

    /* renamed from: k */
    public boolean mo7749k() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8287W();
    }

    /* renamed from: l */
    public boolean mo7750l() {
        return this.f8224A;
    }

    /* renamed from: m */
    public boolean mo7752m() {
        return this.f8226C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo8120n(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7931o(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f8248q) {
            setSplitActionBar(getContext().getResources().getBoolean(C1348d.f4595c));
        }
        C2225b bVar = this.f8244m;
        if (bVar != null) {
            bVar.mo8288Y(configuration);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7761p(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo8121q(View view, int i, int i2, int i3) {
        return mo8122r(view, i, i2, i3, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo8122r(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (!z) {
            i4 = (this.f8249r - measuredHeight) / 2;
        }
        int i5 = i4;
        C1656j.m6986e(this, view, i, i5, i + measuredWidth, i5 + measuredHeight);
        return measuredWidth;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int mo8123s(View view, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = (this.f8249r - measuredHeight) / 2;
        C1656j.m6986e(this, view, i - measuredWidth, i4, i, i4 + measuredHeight);
        return measuredWidth;
    }

    /* access modifiers changed from: protected */
    public void setActionMenuItemLimit(int i) {
        this.f8230G = i;
        C2225b bVar = this.f8244m;
        if (bVar != null && !(bVar instanceof C2236d)) {
            bVar.mo8292c0(i);
        }
    }

    public void setBottomMenuMode(int i) {
        this.f8229F = i;
    }

    public void setExpandState(int i) {
        mo7780w(i, false, false);
    }

    /* access modifiers changed from: protected */
    public void setExpandStateByUser(int i) {
        if (i != -1) {
            this.f8226C = true;
            this.f8227D = i;
            return;
        }
        this.f8226C = false;
        this.f8227D = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r0 = r2.f8231H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPendingInset(android.graphics.Rect r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            miuix.appcompat.internal.view.menu.action.c r0 = r2.f8243l
            if (r0 == 0) goto L_0x0013
            android.graphics.Rect r0 = r2.f8231H
            if (r0 == 0) goto L_0x0013
            int r0 = r0.bottom
            int r1 = r3.bottom
            if (r0 == r1) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            android.graphics.Rect r1 = r2.f8231H
            if (r1 != 0) goto L_0x001f
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.f8231H = r1
        L_0x001f:
            android.graphics.Rect r1 = r2.f8231H
            r1.set(r3)
            if (r0 == 0) goto L_0x0029
            r2.mo7779v()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.C2182b.setPendingInset(android.graphics.Rect):void");
    }

    public void setResizable(boolean z) {
        this.f8224A = z;
    }

    public void setSplitActionBar(boolean z) {
        this.f8246o = z;
    }

    public void setSplitView(ActionBarContainer actionBarContainer) {
        this.f8245n = actionBarContainer;
    }

    public void setSplitWhenNarrow(boolean z) {
        this.f8248q = z;
    }

    public void setSubTitleClickListener(View.OnClickListener onClickListener) {
        this.f8234K = onClickListener;
    }

    public void setTitleClickable(boolean z) {
        this.f8225B = z;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo8126t(View view, int i, int i2, int i3, boolean z, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i2 + ((i3 - measuredHeight) / 2);
        if (!z) {
            i5 = (this.f8249r - measuredHeight) / 2;
        }
        int i6 = i5;
        C1656j.m6986e(this, view, i + i4, i6, i + measuredWidth + i4, i6 + measuredHeight);
        return measuredWidth + i4;
    }

    /* renamed from: u */
    public void mo7778u() {
        post(new C2181a(this));
    }

    /* renamed from: v */
    public abstract void mo7779v();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r2 == 1) goto L_0x001c;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7780w(int r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f8224A
            if (r0 != 0) goto L_0x0006
            if (r4 == 0) goto L_0x002d
        L_0x0006:
            int r4 = r1.f8254w
            if (r4 == r2) goto L_0x002d
            if (r3 == 0) goto L_0x0010
            r1.mo7931o(r4, r2)
            goto L_0x002d
        L_0x0010:
            r3 = 2
            if (r2 != r3) goto L_0x0017
            int r3 = r1.f8256y
            r1.f8255x = r3
        L_0x0017:
            r1.f8254w = r2
            if (r2 != 0) goto L_0x001f
            r3 = 0
        L_0x001c:
            r1.f8256y = r3
            goto L_0x0023
        L_0x001f:
            r3 = 1
            if (r2 != r3) goto L_0x0023
            goto L_0x001c
        L_0x0023:
            r1.mo7761p(r4, r2)
            int r2 = r1.f8256y
            r1.f8257z = r2
            r1.requestLayout()
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.C2182b.mo7780w(int, boolean, boolean):void");
    }

    /* renamed from: x */
    public boolean mo7781x() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8296g0();
    }
}
