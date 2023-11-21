package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.b */
public final class C0543b {

    /* renamed from: e */
    public static final C0543b f2547e = new C0543b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f2548a;

    /* renamed from: b */
    public final int f2549b;

    /* renamed from: c */
    public final int f2550c;

    /* renamed from: d */
    public final int f2551d;

    /* renamed from: androidx.core.graphics.b$a */
    static class C0544a {
        /* renamed from: a */
        static Insets m2256a(int i, int i2, int i3, int i4) {
            return Insets.m66of(i, i2, i3, i4);
        }
    }

    private C0543b(int i, int i2, int i3, int i4) {
        this.f2548a = i;
        this.f2549b = i2;
        this.f2550c = i3;
        this.f2551d = i4;
    }

    /* renamed from: a */
    public static C0543b m2251a(C0543b bVar, C0543b bVar2) {
        return m2252b(Math.max(bVar.f2548a, bVar2.f2548a), Math.max(bVar.f2549b, bVar2.f2549b), Math.max(bVar.f2550c, bVar2.f2550c), Math.max(bVar.f2551d, bVar2.f2551d));
    }

    /* renamed from: b */
    public static C0543b m2252b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2547e : new C0543b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0543b m2253c(Rect rect) {
        return m2252b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0543b m2254d(Insets insets) {
        return m2252b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo2604e() {
        return C0544a.m2256a(this.f2548a, this.f2549b, this.f2550c, this.f2551d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0543b.class != obj.getClass()) {
            return false;
        }
        C0543b bVar = (C0543b) obj;
        return this.f2551d == bVar.f2551d && this.f2548a == bVar.f2548a && this.f2550c == bVar.f2550c && this.f2549b == bVar.f2549b;
    }

    public int hashCode() {
        return (((((this.f2548a * 31) + this.f2549b) * 31) + this.f2550c) * 31) + this.f2551d;
    }

    public String toString() {
        return "Insets{left=" + this.f2548a + ", top=" + this.f2549b + ", right=" + this.f2550c + ", bottom=" + this.f2551d + '}';
    }
}
