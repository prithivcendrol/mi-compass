package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.C0545c;
import androidx.emoji2.text.C0854e;

/* renamed from: androidx.emoji2.text.d */
class C0853d implements C0854e.C0859d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f2902b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f2903a;

    C0853d() {
        TextPaint textPaint = new TextPaint();
        this.f2903a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m3386b() {
        ThreadLocal<StringBuilder> threadLocal = f2902b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo3089a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b = m3386b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C0545c.m2257a(this.f2903a, b.toString());
    }
}
