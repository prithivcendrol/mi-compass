package com.miui.compass;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.miui.compass.u */
public class C1434u extends Animation {

    /* renamed from: d */
    private final float f5588d;

    /* renamed from: e */
    private final float f5589e;

    /* renamed from: f */
    private final float f5590f;

    /* renamed from: g */
    private final float f5591g;

    /* renamed from: h */
    private Camera f5592h;

    public C1434u(float f, float f2, float f3, float f4) {
        this.f5588d = f;
        this.f5589e = f2;
        this.f5590f = f3;
        this.f5591g = f4;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f5588d;
        float f3 = f2 + ((this.f5589e - f2) * f);
        float f4 = this.f5590f;
        float f5 = this.f5591g;
        Camera camera = this.f5592h;
        Matrix matrix = transformation.getMatrix();
        camera.setLocation(0.0f, 0.0f, -25.0f);
        camera.save();
        camera.rotateX(f3);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f5592h = new Camera();
    }
}
