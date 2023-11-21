package p121u1;

import kotlinx.coroutines.internal.C1831w;

/* renamed from: u1.i1 */
public final class C2770i1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C1831w f10559a = new C1831w("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C1831w f10560b = new C1831w("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C1831w f10561c = new C1831w("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C1831w f10562d = new C1831w("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C1831w f10563e = new C1831w("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C2790p0 f10564f = new C2790p0(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C2790p0 f10565g = new C2790p0(true);

    /* renamed from: g */
    public static final Object m11554g(Object obj) {
        return obj instanceof C2823x0 ? new C2826y0((C2823x0) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m11555h(Object obj) {
        C2823x0 x0Var;
        C2826y0 y0Var = obj instanceof C2826y0 ? (C2826y0) obj : null;
        return (y0Var == null || (x0Var = y0Var.f10621a) == null) ? obj : x0Var;
    }
}
