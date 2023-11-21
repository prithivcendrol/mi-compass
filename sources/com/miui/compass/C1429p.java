package com.miui.compass;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ViewSwitcher;

/* renamed from: com.miui.compass.p */
public abstract class C1429p extends ViewSwitcher {

    /* renamed from: d */
    private AnimationSet f5414d;

    /* renamed from: e */
    private AnimationSet f5415e;

    /* renamed from: f */
    private AnimationSet f5416f;

    /* renamed from: g */
    private AnimationSet f5417g;

    /* renamed from: h */
    private boolean f5418h = false;

    public C1429p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m6373a() {
        if (this.f5418h) {
            this.f5414d.reset();
            this.f5414d = null;
            this.f5415e.reset();
            this.f5415e = null;
            this.f5416f.reset();
            this.f5416f = null;
            this.f5417g.reset();
            this.f5417g = null;
            this.f5418h = false;
        }
    }

    /* renamed from: b */
    private void m6374b() {
        if (getRotationCenterY() != 0.0f && !this.f5418h) {
            this.f5414d = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            this.f5414d.addAnimation(alphaAnimation);
            C1434u uVar = new C1434u(0.0f, 90.0f, (float) (getWidth() / 2), getRotationCenterY());
            uVar.setDuration(500);
            this.f5414d.addAnimation(uVar);
            this.f5415e = new AnimationSet(true);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(500);
            this.f5415e.addAnimation(alphaAnimation2);
            C1434u uVar2 = new C1434u(0.0f, -90.0f, (float) (getWidth() / 2), getRotationCenterY());
            uVar2.setDuration(500);
            this.f5415e.addAnimation(uVar2);
            this.f5417g = new AnimationSet(true);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation3.setDuration(500);
            this.f5417g.addAnimation(alphaAnimation3);
            C1434u uVar3 = new C1434u(-90.0f, 0.0f, (float) (getWidth() / 2), getRotationCenterY());
            uVar3.setDuration(500);
            this.f5417g.addAnimation(uVar3);
            this.f5416f = new AnimationSet(true);
            AlphaAnimation alphaAnimation4 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation4.setDuration(500);
            this.f5416f.addAnimation(alphaAnimation4);
            C1434u uVar4 = new C1434u(90.0f, 0.0f, (float) (getWidth() / 2), getRotationCenterY());
            uVar4.setDuration(500);
            this.f5416f.addAnimation(uVar4);
            this.f5418h = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getLyingViewId();

    /* access modifiers changed from: protected */
    public abstract int getPortraitViewId();

    /* access modifiers changed from: protected */
    public abstract float getRotationCenterY();

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setFaceDirection(float f) {
        AnimationSet animationSet;
        if (!C1403c0.m6271r()) {
            if (getInAnimation() != null && getInAnimation().hasStarted() && !getInAnimation().hasEnded()) {
                return;
            }
            if (getOutAnimation() == null || !getOutAnimation().hasStarted() || getOutAnimation().hasEnded()) {
                int id = getCurrentView().getId();
                float abs = Math.abs(f);
                if (abs < 50.0f || abs > 130.0f) {
                    if ((abs <= 40.0f || abs >= 140.0f) && id == getPortraitViewId()) {
                        m6374b();
                        setOutAnimation(this.f5415e);
                        animationSet = this.f5416f;
                    } else {
                        return;
                    }
                } else if (id == getLyingViewId()) {
                    m6374b();
                    setOutAnimation(this.f5414d);
                    animationSet = this.f5417g;
                } else {
                    return;
                }
                setInAnimation(animationSet);
                showNext();
                m6373a();
            }
        }
    }

    public void setInAnimation(Animation animation) {
        super.setInAnimation(animation);
    }
}
