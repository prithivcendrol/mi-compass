package p099q;

import android.view.View;
import p075m.C1886c;
import p075m.C1891f;

/* renamed from: q.d */
public abstract class C2558d extends C1891f {

    /* renamed from: q.d$a */
    public static class C2559a extends C2558d {
        /* renamed from: b */
        public boolean mo9798b(View view, float f, long j, C1886c cVar) {
            return this.f7287h;
        }

        /* renamed from: c */
        public boolean mo9799c(View view, C1886c cVar, float f, long j, double d, double d2) {
            view.setRotation(mo9797a(f, j, view, cVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f7287h;
        }
    }

    /* renamed from: a */
    public float mo9797a(float f, long j, View view, C1886c cVar) {
        this.f7280a.mo6438c((double) f, this.f7286g);
        float[] fArr = this.f7286g;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f7287h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f7289j)) {
            throw null;
        } else {
            this.f7289j = (float) ((((double) this.f7289j) + ((((double) (j - this.f7288i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
            throw null;
        }
    }

    /* renamed from: b */
    public abstract boolean mo9798b(View view, float f, long j, C1886c cVar);
}
