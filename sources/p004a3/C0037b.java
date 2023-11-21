package p004a3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p117t2.C2698f;

/* renamed from: a3.b */
public abstract class C0037b {

    /* renamed from: a */
    protected Context f85a;

    /* renamed from: b */
    protected C0035a f86b;

    /* renamed from: c */
    protected float f87c = 0.0f;

    /* renamed from: d */
    protected float f88d = 0.0f;

    /* renamed from: e */
    protected float f89e = 0.0f;

    /* renamed from: f */
    protected float f90f = 0.0f;

    /* renamed from: g */
    protected RectF f91g = new RectF();

    /* renamed from: h */
    protected Paint f92h = new Paint();

    /* renamed from: i */
    protected int f93i;

    /* renamed from: j */
    protected boolean f94j = false;

    /* renamed from: k */
    protected boolean[] f95k;

    public C0037b(Context context, C0035a aVar, boolean z) {
        this.f85a = context;
        this.f86b = aVar;
        mo52g(z, context.getResources().getDisplayMetrics().density, aVar);
    }

    /* renamed from: a */
    public void mo46a(Canvas canvas, float f) {
        canvas.drawRoundRect(this.f91g, f, f, this.f92h);
    }

    /* renamed from: b */
    public void mo47b(View view, boolean z, int i) {
        if (this.f94j != z) {
            this.f94j = z;
            if (z) {
                this.f95k = new boolean[i];
                int i2 = 0;
                while (i2 < i) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        this.f95k[i2] = viewGroup.getClipChildren();
                        viewGroup.setClipChildren(false);
                        view = (View) parent;
                        i2++;
                    } else {
                        return;
                    }
                }
                return;
            }
            for (int i3 = 0; i3 < i; i3++) {
                ViewParent parent2 = view.getParent();
                if (parent2 == null) {
                    break;
                }
                ((ViewGroup) parent2).setClipChildren(this.f95k[i3]);
                view = (View) parent2;
            }
            this.f95k = null;
        }
    }

    /* renamed from: c */
    public RectF mo48c() {
        return this.f91g;
    }

    /* renamed from: d */
    public void mo49d(Configuration configuration, boolean z) {
        mo52g(z, (((float) configuration.densityDpi) * 1.0f) / 160.0f, this.f86b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50e(float f, C0035a aVar) {
        this.f87c = (float) C2698f.m11274b(f, aVar.f81e);
        this.f88d = (float) C2698f.m11274b(f, aVar.f82f);
        this.f89e = (float) C2698f.m11274b(f, aVar.f80d);
    }

    /* renamed from: f */
    public void mo51f(int i, int i2, int i3, int i4) {
        this.f91g.set(0.0f, 0.0f, ((float) i3) - ((float) i), ((float) i4) - ((float) i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo52g(boolean z, float f, C0035a aVar) {
        int i = z ? this.f86b.f77a : this.f86b.f78b;
        this.f93i = i;
        this.f92h.setColor(i);
        if (this.f90f != f) {
            this.f90f = f;
            mo50e(f, aVar);
        }
    }
}
