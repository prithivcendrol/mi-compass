package p121u1;

import java.util.concurrent.CancellationException;
import p083n1.C2422g;

/* renamed from: u1.c1 */
public final class C2748c1 extends CancellationException {

    /* renamed from: d */
    public final C2743b1 f10537d;

    public C2748c1(String str, Throwable th, C2743b1 b1Var) {
        super(str);
        this.f10537d = b1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2748c1) {
                C2748c1 c1Var = (C2748c1) obj;
                if (!C2422g.m10281a(c1Var.getMessage(), getMessage()) || !C2422g.m10281a(c1Var.f10537d, this.f10537d) || !C2422g.m10281a(c1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C2422g.m10282b(message);
        int hashCode = ((message.hashCode() * 31) + this.f10537d.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f10537d;
    }
}
