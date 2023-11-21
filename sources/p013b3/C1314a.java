package p013b3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0553a;

/* renamed from: b3.a */
public class C1314a extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private Drawable f4503d;

    public C1314a(Drawable drawable) {
        mo5149a(drawable);
    }

    /* renamed from: a */
    public void mo5149a(Drawable drawable) {
        Drawable drawable2 = this.f4503d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4503d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4503d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f4503d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f4503d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4503d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4503d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4503d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4503d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4503d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f4503d.getPadding(rect);
    }

    public int[] getState() {
        return this.f4503d.getState();
    }

    public Region getTransparentRegion() {
        return this.f4503d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0553a.m2288a(this.f4503d);
    }

    public boolean isStateful() {
        return this.f4503d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f4503d.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4503d.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4503d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4503d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0553a.m2289b(this.f4503d, z);
    }

    public void setChangingConfigurations(int i) {
        this.f4503d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4503d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4503d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4503d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0553a.m2290c(this.f4503d, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0553a.m2291d(this.f4503d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f4503d.setState(iArr);
    }

    public void setTint(int i) {
        C0553a.m2293f(this.f4503d, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0553a.m2294g(this.f4503d, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0553a.m2295h(this.f4503d, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4503d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
