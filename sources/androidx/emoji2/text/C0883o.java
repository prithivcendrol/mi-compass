package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
public final class C0883o extends C0870i {

    /* renamed from: i */
    private static Paint f2986i;

    public C0883o(C0866g gVar) {
        super(gVar);
    }

    /* renamed from: c */
    private static Paint m3502c() {
        if (f2986i == null) {
            TextPaint textPaint = new TextPaint();
            f2986i = textPaint;
            textPaint.setColor(C0854e.m3389b().mo3090c());
            f2986i.setStyle(Paint.Style.FILL);
        }
        return f2986i;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C0854e.m3389b().mo3092i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo3129b()), (float) i5, m3502c());
        }
        mo3128a().mo3112a(canvas, f, (float) i4, paint);
    }
}
