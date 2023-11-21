package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p087o.C2476e;

/* renamed from: androidx.constraintlayout.widget.h */
public class C0476h extends View {

    /* renamed from: d */
    private int f2001d;

    /* renamed from: e */
    private View f2002e;

    /* renamed from: f */
    private int f2003f;

    /* renamed from: a */
    public void mo2533a(ConstraintLayout constraintLayout) {
        if (this.f2002e != null) {
            ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) getLayoutParams();
            ConstraintLayout.C0455b bVar2 = (ConstraintLayout.C0455b) this.f2002e.getLayoutParams();
            bVar2.f1792v0.mo9529g1(0);
            C2476e.C2478b y = bVar.f1792v0.mo9564y();
            C2476e.C2478b bVar3 = C2476e.C2478b.FIXED;
            if (y != bVar3) {
                bVar.f1792v0.mo9531h1(bVar2.f1792v0.mo9503U());
            }
            if (bVar.f1792v0.mo9497R() != bVar3) {
                bVar.f1792v0.mo9482I0(bVar2.f1792v0.mo9560v());
            }
            bVar2.f1792v0.mo9529g1(8);
        }
    }

    /* renamed from: b */
    public void mo2534b(ConstraintLayout constraintLayout) {
        if (this.f2001d == -1 && !isInEditMode()) {
            setVisibility(this.f2003f);
        }
        View findViewById = constraintLayout.findViewById(this.f2001d);
        this.f2002e = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0455b) findViewById.getLayoutParams()).f1768j0 = true;
            this.f2002e.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2002e;
    }

    public int getEmptyVisibility() {
        return this.f2003f;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2001d != i) {
            View view = this.f2002e;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0455b) this.f2002e.getLayoutParams()).f1768j0 = false;
                this.f2002e = null;
            }
            this.f2001d = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2003f = i;
    }
}
