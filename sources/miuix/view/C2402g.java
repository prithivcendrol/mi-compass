package miuix.view;

import android.content.res.Configuration;

/* renamed from: miuix.view.g */
public class C2402g {

    /* renamed from: a */
    public int f9351a;

    /* renamed from: b */
    public int f9352b;

    /* renamed from: c */
    public float f9353c;

    /* renamed from: d */
    public float f9354d;

    /* renamed from: e */
    public float f9355e;

    public C2402g(Configuration configuration) {
        int i = configuration.densityDpi;
        this.f9351a = i;
        this.f9352b = i;
        float f = ((float) i) * 0.00625f;
        this.f9353c = f;
        float f2 = configuration.fontScale;
        this.f9355e = f2;
        this.f9354d = f * (f2 == 0.0f ? 1.0f : f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2402g)) {
            return false;
        }
        C2402g gVar = (C2402g) obj;
        return Float.compare(this.f9353c, gVar.f9353c) == 0 && Float.compare(this.f9354d, gVar.f9354d) == 0 && Float.compare(this.f9355e, gVar.f9355e) == 0 && this.f9352b == gVar.f9352b && this.f9351a == gVar.f9351a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "{ densityDpi:" + this.f9352b + ", density:" + this.f9353c + ", scaledDensity:" + this.f9354d + ", fontScale: " + this.f9355e + ", defaultBitmapDensity:" + this.f9351a + "}";
    }
}
