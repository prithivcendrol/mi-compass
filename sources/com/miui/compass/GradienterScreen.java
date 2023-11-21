package com.miui.compass;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0466e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;

public class GradienterScreen extends C1429p {

    /* renamed from: i */
    private GradienterView f5219i;

    /* renamed from: j */
    public GradienterView f5220j;

    /* renamed from: k */
    private TextView f5221k;

    /* renamed from: l */
    private TextView f5222l;

    /* renamed from: m */
    private ConstraintLayout f5223m;

    /* renamed from: n */
    private ConstraintLayout f5224n;

    /* renamed from: o */
    private ImageView f5225o;

    /* renamed from: p */
    private ImageView f5226p;

    /* renamed from: q */
    private boolean f5227q = true;

    /* renamed from: r */
    private boolean f5228r = false;

    /* renamed from: s */
    private long f5229s = -1;

    /* renamed from: t */
    private float f5230t;

    /* renamed from: u */
    private float f5231u;

    /* renamed from: v */
    private float f5232v;

    /* renamed from: w */
    private int f5233w = 0;

    /* renamed from: x */
    private WeakReference<C1437x> f5234x;

    public GradienterScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) getContext().getApplicationContext().getSystemService("layout_inflater")).inflate(2131558438, this, true);
        GradienterView gradienterView = (GradienterView) findViewById(2131362055);
        this.f5219i = gradienterView;
        gradienterView.setIsPortrait(false);
        GradienterView gradienterView2 = (GradienterView) findViewById(2131362056);
        this.f5220j = gradienterView2;
        gradienterView2.setIsPortrait(true);
        this.f5221k = (TextView) findViewById(2131362100);
        this.f5222l = (TextView) findViewById(2131362101);
        this.f5223m = (ConstraintLayout) findViewById(2131361887);
        this.f5224n = (ConstraintLayout) findViewById(2131361888);
        this.f5225o = (ImageView) findViewById(2131362052);
        this.f5226p = (ImageView) findViewById(2131362053);
        Typeface g = C1403c0.m6260g(getContext().getAssets(), "MitypeMono-DemiBold.otf");
        this.f5221k.setTypeface(g);
        this.f5222l.setTypeface(g);
        mo5297i(context);
        mo5294f();
    }

    /* renamed from: c */
    private void m6175c(TextView textView, String str, float f, float f2) {
        WeakReference<C1437x> weakReference;
        if (!this.f5228r) {
            float abs = Math.abs(f2 - f);
            float f3 = this.f5232v + abs;
            this.f5232v = f3;
            if (f3 > 10.0f || abs > 4.0f) {
                this.f5228r = true;
                this.f5232v = 0.0f;
            }
        }
        if (this.f5228r && Math.abs(f2 - f) <= 4.0f) {
            this.f5233w++;
        }
        if (this.f5233w >= 15) {
            if (System.currentTimeMillis() - this.f5229s > 2000 && (weakReference = this.f5234x) != null && weakReference.get() != null && this.f5234x.get().getCurrentScreenIndex() == 1 && this.f5227q) {
                textView.announceForAccessibility(str + "°");
                this.f5229s = System.currentTimeMillis();
            }
            this.f5228r = false;
            this.f5233w = 0;
        }
    }

    /* renamed from: g */
    private void m6176g(TextView textView, float f) {
        String t = C1403c0.m6273t(getContext(), 2131820586, f);
        if (textView != null && !t.equals(textView.getText())) {
            Math.round(f);
            textView.setText(t);
            ((View) textView.getParent()).setContentDescription(t + "°");
        }
    }

    /* renamed from: d */
    public void mo5292d(C1437x xVar) {
        this.f5234x = new WeakReference<>(xVar);
    }

    /* renamed from: e */
    public void mo5293e(boolean z) {
        ConstraintLayout constraintLayout;
        int i;
        this.f5227q = z;
        if (z) {
            constraintLayout = this.f5223m;
            i = 1;
        } else {
            constraintLayout = this.f5223m;
            i = 2;
        }
        constraintLayout.setImportantForAccessibility(i);
        this.f5224n.setImportantForAccessibility(i);
    }

    /* renamed from: f */
    public void mo5294f() {
        C0466e eVar = new C0466e();
        eVar.mo2502i(this.f5223m);
        C0466e eVar2 = new C0466e();
        eVar2.mo2502i(this.f5224n);
        if (C1403c0.m6264k() || C1403c0.m6265l()) {
            eVar.mo2504k(this.f5225o.getId(), 7, this.f5221k.getId(), 6);
            eVar2.mo2504k(this.f5226p.getId(), 7, this.f5222l.getId(), 6);
            this.f5222l.setTextDirection(3);
        } else {
            eVar.mo2504k(this.f5225o.getId(), 6, this.f5221k.getId(), 7);
            eVar2.mo2504k(this.f5226p.getId(), 6, this.f5222l.getId(), 7);
        }
        eVar.mo2496c(this.f5223m);
        eVar2.mo2496c(this.f5224n);
    }

    public GradienterView getGradienterPortraitView() {
        return this.f5220j;
    }

    /* access modifiers changed from: protected */
    public int getLyingViewId() {
        return 2131362050;
    }

    /* access modifiers changed from: protected */
    public int getPortraitViewId() {
        return 2131362051;
    }

    /* access modifiers changed from: protected */
    public float getRotationCenterY() {
        return ((float) getHeight()) / 2.0f;
    }

    /* renamed from: h */
    public void mo5296h(float f, float f2) {
        this.f5219i.mo5300h(f, f2);
        m6176g(this.f5221k, this.f5219i.getDirectionLying());
        if (getCurrentView().getId() == getLyingViewId()) {
            m6175c(this.f5221k, C1403c0.m6273t(getContext(), 2131820586, this.f5219i.getDirectionLying()), this.f5219i.getDirectionLying(), this.f5230t);
            this.f5230t = this.f5219i.getDirectionLying();
        }
        this.f5220j.mo5300h(f, f2);
        m6176g(this.f5222l, this.f5220j.getDirectionPortart());
        if (getCurrentView().getId() == getPortraitViewId()) {
            m6175c(this.f5222l, C1403c0.m6273t(getContext(), 2131820586, this.f5219i.getDirectionPortart()), this.f5219i.getDirectionPortart(), this.f5231u);
            this.f5231u = this.f5219i.getDirectionPortart();
        }
    }

    /* renamed from: i */
    public void mo5297i(Context context) {
        this.f5219i.mo5301k();
        this.f5220j.mo5301k();
    }
}
