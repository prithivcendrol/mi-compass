package kotlinx.coroutines.internal;

import p083n1.C2422g;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C1813i {
    /* renamed from: a */
    public static final void m7520a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C2422g.m10290j("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
