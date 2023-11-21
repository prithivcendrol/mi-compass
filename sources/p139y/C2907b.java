package p139y;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: y.b */
public final class C2907b extends C2908c {
    /* renamed from: h */
    public static C2907b m12006h(ByteBuffer byteBuffer) {
        return m12007i(byteBuffer, new C2907b());
    }

    /* renamed from: i */
    public static C2907b m12007i(ByteBuffer byteBuffer, C2907b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.mo10204f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C2907b mo10204f(int i, ByteBuffer byteBuffer) {
        mo10205g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo10205g(int i, ByteBuffer byteBuffer) {
        mo10211c(i, byteBuffer);
    }

    /* renamed from: j */
    public C2906a mo10206j(C2906a aVar, int i) {
        int b = mo10210b(6);
        if (b != 0) {
            return aVar.mo10195f(mo10209a(mo10212d(b) + (i * 4)), this.f11081b);
        }
        return null;
    }

    /* renamed from: k */
    public int mo10207k() {
        int b = mo10210b(6);
        if (b != 0) {
            return mo10213e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo10208l() {
        int b = mo10210b(4);
        if (b != 0) {
            return this.f11081b.getInt(b + this.f11080a);
        }
        return 0;
    }
}
