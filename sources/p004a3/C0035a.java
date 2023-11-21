package p004a3;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;

/* renamed from: a3.a */
public class C0035a {

    /* renamed from: a */
    int f77a;

    /* renamed from: b */
    int f78b;

    /* renamed from: c */
    BlurMaskFilter.Blur f79c;

    /* renamed from: d */
    float f80d;

    /* renamed from: e */
    float f81e;

    /* renamed from: f */
    float f82f;

    /* renamed from: g */
    float f83g;

    /* renamed from: a3.a$a */
    public static class C0036a {

        /* renamed from: a */
        private C0035a f84a;

        public C0036a(float f) {
            this.f84a = new C0035a(f);
        }

        /* renamed from: a */
        public C0035a mo44a() {
            return this.f84a;
        }

        /* renamed from: b */
        public C0036a mo45b(int i) {
            this.f84a.f82f = (float) i;
            return this;
        }
    }

    C0035a(float f) {
        this(f, BlurMaskFilter.Blur.NORMAL);
    }

    C0035a(float f, BlurMaskFilter.Blur blur) {
        this(Color.parseColor("#0D000000"), Color.parseColor("#0DFFFFFF"), 0.0f, 0.0f, f, blur);
    }

    C0035a(int i, int i2, float f, float f2, float f3, BlurMaskFilter.Blur blur) {
        this.f83g = 0.0f;
        this.f77a = i;
        this.f78b = i2;
        this.f81e = f;
        this.f82f = f2;
        this.f80d = f3;
        this.f79c = blur;
    }
}
