package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f3533a = 0;

    /* renamed from: b */
    int f3534b = 0;

    /* renamed from: c */
    int f3535c = 0;

    /* renamed from: d */
    int f3536d = -1;

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int mo3854a() {
        return this.f3534b;
    }

    /* renamed from: b */
    public int mo3855b() {
        int i = this.f3535c;
        int c = mo3856c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3856c() {
        int i = this.f3536d;
        return i != -1 ? i : AudioAttributesCompat.m4317a(false, this.f3535c, this.f3533a);
    }

    /* renamed from: d */
    public int mo3857d() {
        return this.f3533a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3534b == audioAttributesImplBase.mo3854a() && this.f3535c == audioAttributesImplBase.mo3855b() && this.f3533a == audioAttributesImplBase.mo3857d() && this.f3536d == audioAttributesImplBase.f3536d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3534b), Integer.valueOf(this.f3535c), Integer.valueOf(this.f3533a), Integer.valueOf(this.f3536d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3536d != -1) {
            sb.append(" stream=");
            sb.append(this.f3536d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4318b(this.f3533a));
        sb.append(" content=");
        sb.append(this.f3534b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3535c).toUpperCase());
        return sb.toString();
    }
}
