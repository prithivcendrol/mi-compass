package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0623f;

/* renamed from: androidx.emoji2.text.i */
public abstract class C0870i extends ReplacementSpan {

    /* renamed from: d */
    private final Paint.FontMetricsInt f2956d = new Paint.FontMetricsInt();

    /* renamed from: e */
    private final C0866g f2957e;

    /* renamed from: f */
    private short f2958f = -1;

    /* renamed from: g */
    private short f2959g = -1;

    /* renamed from: h */
    private float f2960h = 1.0f;

    C0870i(C0866g gVar) {
        C0623f.m2496g(gVar, "metadata cannot be null");
        this.f2957e = gVar;
    }

    /* renamed from: a */
    public final C0866g mo3128a() {
        return this.f2957e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3129b() {
        return this.f2958f;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2956d);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2956d;
        this.f2960h = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f2957e.mo3116e());
        this.f2959g = (short) ((int) (((float) this.f2957e.mo3116e()) * this.f2960h));
        short i3 = (short) ((int) (((float) this.f2957e.mo3119i()) * this.f2960h));
        this.f2958f = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2956d;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
