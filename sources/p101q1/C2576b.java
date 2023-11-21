package p101q1;

import java.util.NoSuchElementException;
import p023d1.C1492v;

/* renamed from: q1.b */
public final class C2576b extends C1492v {

    /* renamed from: d */
    private final int f10115d;

    /* renamed from: e */
    private final int f10116e;

    /* renamed from: f */
    private boolean f10117f;

    /* renamed from: g */
    private int f10118g;

    public C2576b(int i, int i2, int i3) {
        this.f10115d = i3;
        this.f10116e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f10117f = z;
        this.f10118g = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f10117f;
    }

    public int nextInt() {
        int i = this.f10118g;
        if (i != this.f10116e) {
            this.f10118g = this.f10115d + i;
        } else if (this.f10117f) {
            this.f10117f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
