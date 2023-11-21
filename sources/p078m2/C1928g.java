package p078m2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import p004a3.C0035a;
import p004a3.C0037b;
import p004a3.C0038c;
import p018c2.C1347c;
import p055i3.C1649c;

/* renamed from: m2.g */
public class C1928g extends View {

    /* renamed from: d */
    private int f7321d = 0;

    /* renamed from: e */
    private C0037b f7322e;

    /* renamed from: f */
    private Path f7323f = new Path();

    /* renamed from: g */
    private float f7324g;

    public C1928g(Context context) {
        super(context);
        m7876a();
    }

    /* renamed from: a */
    private void m7876a() {
        this.f7324g = (float) getContext().getResources().getDisplayMetrics().densityDpi;
        C0038c cVar = new C0038c(getContext(), new C0035a.C0036a(50.0f).mo45b(6).mo44a(), C1649c.m6959d(getContext(), C1347c.f4535C, true));
        this.f7322e = cVar;
        cVar.mo51f(0, 0, getMeasuredWidth(), getMeasuredHeight());
        setBackgroundColor(0);
        setImportantForAccessibility(4);
    }

    /* renamed from: b */
    public void mo6512b() {
        this.f7322e.mo47b(this, false, 2);
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        canvas.save();
        if (this.f7322e != null) {
            boolean unused = canvas.clipOutPath(this.f7323f);
            this.f7322e.mo46a(canvas, (float) this.f7321d);
        }
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7322e.mo47b(this, true, 2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C0037b bVar;
        if (((float) configuration.densityDpi) != this.f7324g && (bVar = this.f7322e) != null) {
            bVar.mo49d(configuration, C1649c.m6959d(getContext(), C1347c.f4535C, true));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0037b bVar = this.f7322e;
        if (bVar != null) {
            bVar.mo51f(i, i2, i3, i4);
            this.f7323f.reset();
            Path path = this.f7323f;
            RectF c = this.f7322e.mo48c();
            int i5 = this.f7321d;
            path.addRoundRect(c, (float) i5, (float) i5, Path.Direction.CW);
        }
    }

    public void setShadowHostViewRadius(int i) {
        this.f7321d = i;
        this.f7323f.reset();
        Path path = this.f7323f;
        RectF c = this.f7322e.mo48c();
        int i2 = this.f7321d;
        path.addRoundRect(c, (float) i2, (float) i2, Path.Direction.CW);
    }
}
