package p050h4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import miuix.smooth.C2386d;

/* renamed from: h4.a */
public class C1631a {

    /* renamed from: a */
    private int f6477a = 0;

    /* renamed from: b */
    private int f6478b = 0;

    /* renamed from: c */
    private float[] f6479c;

    /* renamed from: d */
    private float f6480d;

    /* renamed from: e */
    private RectF f6481e;

    /* renamed from: f */
    private Paint f6482f;

    /* renamed from: g */
    private Paint f6483g = new Paint(1);

    /* renamed from: h */
    private Path f6484h;

    /* renamed from: i */
    private Path f6485i;

    /* renamed from: j */
    private C2386d f6486j;

    public C1631a() {
        Paint paint = new Paint(1);
        this.f6482f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f6484h = new Path();
        this.f6485i = new Path();
        this.f6486j = new C2386d();
        this.f6481e = new RectF();
    }

    /* renamed from: d */
    private Path m6918d(Path path, RectF rectF, float[] fArr, float f, float f2, float f3) {
        return this.f6486j.mo9232w(path, fArr == null ? this.f6486j.mo9228r(rectF, f, f2, f3) : this.f6486j.mo9229s(rectF, fArr, f2, f3));
    }

    /* renamed from: a */
    public void mo5802a(Canvas canvas, Xfermode xfermode) {
        this.f6483g.setXfermode(xfermode);
        canvas.drawPath(this.f6485i, this.f6483g);
        this.f6483g.setXfermode((Xfermode) null);
    }

    /* renamed from: b */
    public void mo5803b(Canvas canvas) {
        if ((this.f6477a == 0 || this.f6482f.getAlpha() == 0 || Color.alpha(this.f6478b) == 0) ? false : true) {
            canvas.save();
            this.f6482f.setStrokeWidth((float) this.f6477a);
            this.f6482f.setColor(this.f6478b);
            canvas.drawPath(this.f6484h, this.f6482f);
            canvas.restore();
        }
    }

    /* renamed from: c */
    public Path mo5804c(Rect rect) {
        float f = 0.5f;
        if ((this.f6477a == 0 || this.f6482f.getAlpha() == 0 || Color.alpha(this.f6478b) == 0) ? false : true) {
            f = 0.5f + (((float) this.f6477a) / 2.0f);
        }
        float f2 = f;
        return m6918d(new Path(), new RectF(rect), this.f6479c, this.f6480d, f2, f2);
    }

    /* renamed from: e */
    public void mo5805e(Rect rect) {
        float f = 0.5f;
        this.f6481e.set(((float) rect.left) - 0.5f, ((float) rect.top) - 0.5f, ((float) rect.right) + 0.5f, ((float) rect.bottom) + 0.5f);
        if ((this.f6477a == 0 || this.f6482f.getAlpha() == 0 || Color.alpha(this.f6478b) == 0) ? false : true) {
            f = 0.5f + (((float) this.f6477a) / 2.0f);
        }
        float f2 = f;
        this.f6484h = m6918d(this.f6484h, this.f6481e, this.f6479c, this.f6480d, f2, f2);
        Path path = this.f6485i;
        if (path != null) {
            path.reset();
        } else {
            this.f6485i = new Path();
        }
        this.f6485i.addRect(this.f6481e, Path.Direction.CW);
        this.f6485i.op(this.f6484h, Path.Op.DIFFERENCE);
    }

    /* renamed from: f */
    public void mo5806f(int i) {
        this.f6482f.setAlpha(i);
    }

    /* renamed from: g */
    public void mo5807g(float[] fArr) {
        this.f6479c = fArr;
    }

    /* renamed from: h */
    public void mo5808h(float f) {
        this.f6480d = f;
    }

    /* renamed from: i */
    public void mo5809i(int i) {
        this.f6478b = i;
    }

    /* renamed from: j */
    public void mo5810j(int i) {
        this.f6477a = i;
    }
}
