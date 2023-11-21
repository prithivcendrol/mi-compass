package p128v3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import p013b3.C1318e;

/* renamed from: v3.a */
public class C2870a extends C1318e {

    /* renamed from: g */
    private Paint f10949g;

    /* renamed from: h */
    private int f10950h;

    /* renamed from: i */
    private int f10951i;

    /* renamed from: j */
    private int f10952j;

    /* renamed from: k */
    private int f10953k;

    /* renamed from: l */
    private int f10954l;

    /* renamed from: m */
    private int f10955m;

    /* renamed from: n */
    private int f10956n;

    /* renamed from: o */
    private boolean f10957o;

    /* renamed from: p */
    private boolean f10958p = false;

    /* renamed from: q */
    private boolean f10959q = false;

    /* renamed from: r */
    private boolean f10960r = false;

    public C2870a(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: e */
    private void m11867e(Canvas canvas, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        PorterDuffXfermode porterDuffXfermode;
        float f = (float) i2;
        float f2 = (float) i4;
        RectF rectF = new RectF((float) i, f, (float) i3, f2);
        RectF rectF2 = new RectF((float) (i + (z4 ? this.f10953k : this.f10952j)), f, (float) (i3 - (z4 ? this.f10952j : this.f10953k)), f2);
        Path path = new Path();
        float f3 = 0.0f;
        float f4 = z ? (float) this.f10954l : 0.0f;
        if (z2) {
            f3 = (float) this.f10954l;
        }
        path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f3, f3, f3, f3}, Path.Direction.CW);
        int saveLayer = canvas.saveLayer(rectF, this.f10949g, 31);
        canvas.drawRect(rectF, this.f10949g);
        Paint paint = this.f10949g;
        if (z3) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        } else {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        }
        paint.setXfermode(porterDuffXfermode);
        canvas.drawPath(path, this.f10949g);
        this.f10949g.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10960r && this.f10949g != null) {
            if (this.f10955m != 0 || this.f10956n != 0) {
                Rect bounds = getBounds();
                int i = this.f10955m;
                int i2 = bounds.top;
                Canvas canvas2 = canvas;
                m11867e(canvas2, i, i2 - this.f10950h, this.f10956n, i2, false, false, true, this.f10957o);
                int i3 = this.f10955m;
                int i4 = bounds.bottom;
                m11867e(canvas2, i3, i4, this.f10956n, i4 + this.f10951i, false, false, true, this.f10957o);
                m11867e(canvas2, this.f10955m, bounds.top, this.f10956n, bounds.bottom, this.f10958p, this.f10959q, false, this.f10957o);
            }
        }
    }

    /* renamed from: f */
    public void mo10149f(Paint paint, int i, int i2, int i3, int i4, int i5) {
        this.f10949g = paint;
        this.f10950h = i;
        this.f10951i = i2;
        this.f10952j = i3;
        this.f10953k = i4;
        this.f10954l = i5;
    }

    /* renamed from: g */
    public void mo10150g(int i, int i2, boolean z) {
        this.f10957o = z;
        this.f10955m = i;
        this.f10956n = i2;
    }

    /* renamed from: h */
    public void mo10151h(boolean z) {
        this.f10960r = z;
    }

    /* renamed from: i */
    public void mo10152i(boolean z, boolean z2) {
        this.f10958p = z;
        this.f10959q = z2;
    }
}
