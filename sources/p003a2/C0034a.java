package p003a2;

import miuix.androidbasewidget.internal.view.SeekBarBackGroundShapeDrawable;
import miuix.animation.physics.DynamicAnimation;

/* renamed from: a2.a */
public final /* synthetic */ class C0034a implements DynamicAnimation.OnAnimationUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SeekBarBackGroundShapeDrawable f76a;

    public /* synthetic */ C0034a(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable) {
        this.f76a = seekBarBackGroundShapeDrawable;
    }

    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f76a.m8030i(dynamicAnimation, f, f2);
    }
}
