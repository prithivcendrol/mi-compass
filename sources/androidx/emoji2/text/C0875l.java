package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p139y.C2907b;

/* renamed from: androidx.emoji2.text.l */
class C0875l {

    /* renamed from: androidx.emoji2.text.l$a */
    private static class C0876a implements C0878c {

        /* renamed from: a */
        private final ByteBuffer f2973a;

        C0876a(ByteBuffer byteBuffer) {
            this.f2973a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void mo3139a(int i) {
            ByteBuffer byteBuffer = this.f2973a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: b */
        public long mo3140b() {
            return C0875l.m3470c(this.f2973a.getInt());
        }

        /* renamed from: c */
        public int mo3141c() {
            return this.f2973a.getInt();
        }

        public long getPosition() {
            return (long) this.f2973a.position();
        }

        public int readUnsignedShort() {
            return C0875l.m3471d(this.f2973a.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    private static class C0877b {

        /* renamed from: a */
        private final long f2974a;

        /* renamed from: b */
        private final long f2975b;

        C0877b(long j, long j2) {
            this.f2974a = j;
            this.f2975b = j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3144a() {
            return this.f2974a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    private interface C0878c {
        /* renamed from: a */
        void mo3139a(int i);

        /* renamed from: b */
        long mo3140b();

        /* renamed from: c */
        int mo3141c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static C0877b m3468a(C0878c cVar) {
        long j;
        cVar.mo3139a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo3139a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int c = cVar.mo3141c();
                cVar.mo3139a(4);
                j = cVar.mo3140b();
                cVar.mo3139a(4);
                if (1835365473 == c) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo3139a((int) (j - cVar.getPosition()));
                cVar.mo3139a(12);
                long b = cVar.mo3140b();
                for (int i2 = 0; ((long) i2) < b; i2++) {
                    int c2 = cVar.mo3141c();
                    long b2 = cVar.mo3140b();
                    long b3 = cVar.mo3140b();
                    if (1164798569 == c2 || 1701669481 == c2) {
                        return new C0877b(b2 + j, b3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    static C2907b m3469b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m3468a(new C0876a(duplicate)).mo3144a());
        return C2907b.m12006h(duplicate);
    }

    /* renamed from: c */
    static long m3470c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    static int m3471d(short s) {
        return s & 65535;
    }
}
