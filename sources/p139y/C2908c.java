package p139y;

import java.nio.ByteBuffer;

/* renamed from: y.c */
public class C2908c {

    /* renamed from: a */
    protected int f11080a;

    /* renamed from: b */
    protected ByteBuffer f11081b;

    /* renamed from: c */
    private int f11082c;

    /* renamed from: d */
    private int f11083d;

    /* renamed from: e */
    C2909d f11084e = C2909d.m12018a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10209a(int i) {
        return i + this.f11081b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo10210b(int i) {
        if (i < this.f11083d) {
            return this.f11081b.getShort(this.f11082c + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10211c(int i, ByteBuffer byteBuffer) {
        short s;
        this.f11081b = byteBuffer;
        if (byteBuffer != null) {
            this.f11080a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f11082c = i2;
            s = this.f11081b.getShort(i2);
        } else {
            s = 0;
            this.f11080a = 0;
            this.f11082c = 0;
        }
        this.f11083d = s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo10212d(int i) {
        int i2 = i + this.f11080a;
        return i2 + this.f11081b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo10213e(int i) {
        int i2 = i + this.f11080a;
        return this.f11081b.getInt(i2 + this.f11081b.getInt(i2));
    }
}
