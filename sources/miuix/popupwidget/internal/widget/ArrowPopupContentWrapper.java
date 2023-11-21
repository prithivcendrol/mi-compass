package miuix.popupwidget.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p113s3.C2660c;

public class ArrowPopupContentWrapper extends LinearLayout {

    /* renamed from: d */
    private Paint f9018d;

    /* renamed from: e */
    private Bitmap f9019e;

    /* renamed from: f */
    private Bitmap f9020f;

    /* renamed from: g */
    private Bitmap f9021g;

    /* renamed from: h */
    private Bitmap f9022h;

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f9018d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9018d.setAntiAlias(true);
        Resources resources = getResources();
        this.f9019e = BitmapFactory.decodeResource(resources, C2660c.f10345a);
        this.f9020f = BitmapFactory.decodeResource(resources, C2660c.f10346b);
        this.f9021g = BitmapFactory.decodeResource(resources, C2660c.f10347c);
        this.f9022h = BitmapFactory.decodeResource(resources, C2660c.f10348d);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(this.f9019e, (float) (getPaddingLeft() + 0), (float) (getPaddingTop() + 0), this.f9018d);
        canvas.drawBitmap(this.f9020f, (float) ((getWidth() - this.f9020f.getWidth()) - getPaddingRight()), (float) (getPaddingTop() + 0), this.f9018d);
        canvas.drawBitmap(this.f9021g, (float) (getPaddingLeft() + 0), (float) ((getHeight() - this.f9021g.getHeight()) - getPaddingBottom()), this.f9018d);
        canvas.drawBitmap(this.f9022h, (float) ((getWidth() - this.f9022h.getWidth()) - getPaddingRight()), (float) ((getHeight() - this.f9022h.getHeight()) - getPaddingBottom()), this.f9018d);
        canvas.restore();
    }
}
