package miuix.internal.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: miuix.internal.view.b */
public class C2292b extends Drawable {

    /* renamed from: a */
    private int f8714a;

    /* renamed from: b */
    private int f8715b;

    /* renamed from: c */
    private int f8716c;

    /* renamed from: d */
    private int f8717d;

    /* renamed from: e */
    private Paint f8718e;

    /* renamed from: f */
    private Paint f8719f;

    /* renamed from: g */
    private float f8720g;

    /* renamed from: h */
    private boolean f8721h;

    public C2292b(int i, int i2, int i3) {
        this(i, i2, i3, 0, 0, 0);
    }

    public C2292b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f8718e = new Paint();
        this.f8719f = new Paint();
        this.f8720g = 1.0f;
        this.f8718e.setAntiAlias(true);
        this.f8718e.setColor(i);
        this.f8714a = i2;
        this.f8715b = i3;
        boolean z = i4 != 0;
        this.f8721h = z;
        if (z) {
            this.f8719f.setAntiAlias(true);
            this.f8719f.setColor(i4);
            this.f8719f.setStyle(Paint.Style.STROKE);
            this.f8719f.setStrokeWidth(2.0f);
        }
        this.f8716c = i5;
        this.f8717d = i6;
    }

    /* renamed from: a */
    public void mo8678a(float f) {
        this.f8720g = f;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.bottom;
        float f = (float) ((i + i2) / 2);
        float f2 = (float) ((i3 + i4) / 2);
        float min = (float) (Math.min(i - i2, i4 - i3) / 2);
        canvas.drawCircle(f, f2, (this.f8720g * min) - 1.0f, this.f8718e);
        if (this.f8721h) {
            canvas.drawCircle(f, f2, ((min * this.f8720g) - 1.0f) - 1.0f, this.f8719f);
        }
    }

    public int getAlpha() {
        return this.f8718e.getAlpha();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        Paint paint;
        int i2;
        this.f8718e.setAlpha(i);
        if (this.f8721h) {
            if (i == this.f8714a) {
                paint = this.f8719f;
                i2 = this.f8716c;
            } else if (i == this.f8715b) {
                paint = this.f8719f;
                i2 = this.f8717d;
            } else {
                return;
            }
            paint.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8718e.setColorFilter(colorFilter);
    }
}
