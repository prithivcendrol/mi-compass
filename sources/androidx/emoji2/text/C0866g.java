package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p139y.C2906a;

/* renamed from: androidx.emoji2.text.g */
public class C0866g {

    /* renamed from: d */
    private static final ThreadLocal<C2906a> f2939d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f2940a;

    /* renamed from: b */
    private final C0879m f2941b;

    /* renamed from: c */
    private volatile int f2942c = 0;

    C0866g(C0879m mVar, int i) {
        this.f2941b = mVar;
        this.f2940a = i;
    }

    /* renamed from: g */
    private C2906a m3427g() {
        ThreadLocal<C2906a> threadLocal = f2939d;
        C2906a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C2906a();
            threadLocal.set(aVar);
        }
        this.f2941b.mo3146d().mo10206j(aVar, this.f2940a);
        return aVar;
    }

    /* renamed from: a */
    public void mo3112a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f2941b.mo3149g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f2941b.mo3145c(), this.f2940a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo3113b(int i) {
        return m3427g().mo10197h(i);
    }

    /* renamed from: c */
    public int mo3114c() {
        return m3427g().mo10198i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int mo3115d() {
        return this.f2942c;
    }

    /* renamed from: e */
    public short mo3116e() {
        return m3427g().mo10200k();
    }

    /* renamed from: f */
    public int mo3117f() {
        return m3427g().mo10201l();
    }

    /* renamed from: h */
    public short mo3118h() {
        return m3427g().mo10202m();
    }

    /* renamed from: i */
    public short mo3119i() {
        return m3427g().mo10203n();
    }

    /* renamed from: j */
    public boolean mo3120j() {
        return m3427g().mo10199j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void mo3121k(boolean z) {
        this.f2942c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3117f()));
        sb.append(", codepoints:");
        int c = mo3114c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo3113b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
