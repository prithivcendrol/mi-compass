package p033f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0553a;

/* renamed from: f.a */
public class C1548a extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private Drawable f6200d;

    public C1548a(Drawable drawable) {
        mo5671a(drawable);
    }

    /* renamed from: a */
    public void mo5671a(Drawable drawable) {
        Drawable drawable2 = this.f6200d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f6200d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f6200d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f6200d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f6200d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f6200d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f6200d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f6200d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f6200d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f6200d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f6200d.getPadding(rect);
    }

    public int[] getState() {
        return this.f6200d.getState();
    }

    public Region getTransparentRegion() {
        return this.f6200d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0553a.m2288a(this.f6200d);
    }

    public boolean isStateful() {
        return this.f6200d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f6200d.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f6200d.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f6200d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f6200d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0553a.m2289b(this.f6200d, z);
    }

    public void setChangingConfigurations(int i) {
        this.f6200d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6200d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f6200d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f6200d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0553a.m2290c(this.f6200d, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0553a.m2291d(this.f6200d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f6200d.setState(iArr);
    }

    public void setTint(int i) {
        C0553a.m2293f(this.f6200d, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0553a.m2294g(this.f6200d, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0553a.m2295h(this.f6200d, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f6200d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
