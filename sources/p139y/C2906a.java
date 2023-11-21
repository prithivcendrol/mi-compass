package p139y;

import java.nio.ByteBuffer;

/* renamed from: y.a */
public final class C2906a extends C2908c {
    /* renamed from: f */
    public C2906a mo10195f(int i, ByteBuffer byteBuffer) {
        mo10196g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo10196g(int i, ByteBuffer byteBuffer) {
        mo10211c(i, byteBuffer);
    }

    /* renamed from: h */
    public int mo10197h(int i) {
        int b = mo10210b(16);
        if (b != 0) {
            return this.f11081b.getInt(mo10212d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int mo10198i() {
        int b = mo10210b(16);
        if (b != 0) {
            return mo10213e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo10199j() {
        int b = mo10210b(6);
        return (b == 0 || this.f11081b.get(b + this.f11080a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short mo10200k() {
        int b = mo10210b(14);
        if (b != 0) {
            return this.f11081b.getShort(b + this.f11080a);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo10201l() {
        int b = mo10210b(4);
        if (b != 0) {
            return this.f11081b.getInt(b + this.f11080a);
        }
        return 0;
    }

    /* renamed from: m */
    public short mo10202m() {
        int b = mo10210b(8);
        if (b != 0) {
            return this.f11081b.getShort(b + this.f11080a);
        }
        return 0;
    }

    /* renamed from: n */
    public short mo10203n() {
        int b = mo10210b(12);
        if (b != 0) {
            return this.f11081b.getShort(b + this.f11080a);
        }
        return 0;
    }
}
