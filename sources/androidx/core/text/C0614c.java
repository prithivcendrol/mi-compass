package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0619c;

/* renamed from: androidx.core.text.c */
public class C0614c implements Spannable {

    /* renamed from: g */
    private static final Object f2647g = new Object();

    /* renamed from: d */
    private final Spannable f2648d;

    /* renamed from: e */
    private final C0615a f2649e;

    /* renamed from: f */
    private final PrecomputedText f2650f;

    /* renamed from: androidx.core.text.c$a */
    public static final class C0615a {

        /* renamed from: a */
        private final TextPaint f2651a;

        /* renamed from: b */
        private final TextDirectionHeuristic f2652b;

        /* renamed from: c */
        private final int f2653c;

        /* renamed from: d */
        private final int f2654d;

        /* renamed from: e */
        final PrecomputedText.Params f2655e;

        /* renamed from: androidx.core.text.c$a$a */
        public static class C0616a {

            /* renamed from: a */
            private final TextPaint f2656a;

            /* renamed from: b */
            private TextDirectionHeuristic f2657b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c */
            private int f2658c = 1;

            /* renamed from: d */
            private int f2659d = 1;

            public C0616a(TextPaint textPaint) {
                this.f2656a = textPaint;
            }

            /* renamed from: a */
            public C0615a mo2704a() {
                return new C0615a(this.f2656a, this.f2657b, this.f2658c, this.f2659d);
            }

            /* renamed from: b */
            public C0616a mo2705b(int i) {
                this.f2658c = i;
                return this;
            }

            /* renamed from: c */
            public C0616a mo2706c(int i) {
                this.f2659d = i;
                return this;
            }

            /* renamed from: d */
            public C0616a mo2707d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2657b = textDirectionHeuristic;
                return this;
            }
        }

        public C0615a(PrecomputedText.Params params) {
            this.f2651a = params.getTextPaint();
            this.f2652b = params.getTextDirection();
            this.f2653c = params.getBreakStrategy();
            this.f2654d = params.getHyphenationFrequency();
            this.f2655e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        C0615a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f2655e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2651a = textPaint;
            this.f2652b = textDirectionHeuristic;
            this.f2653c = i;
            this.f2654d = i2;
        }

        /* renamed from: a */
        public boolean mo2696a(C0615a aVar) {
            if (this.f2653c == aVar.mo2697b() && this.f2654d == aVar.mo2698c() && this.f2651a.getTextSize() == aVar.mo2700e().getTextSize() && this.f2651a.getTextScaleX() == aVar.mo2700e().getTextScaleX() && this.f2651a.getTextSkewX() == aVar.mo2700e().getTextSkewX() && this.f2651a.getLetterSpacing() == aVar.mo2700e().getLetterSpacing() && TextUtils.equals(this.f2651a.getFontFeatureSettings(), aVar.mo2700e().getFontFeatureSettings()) && this.f2651a.getFlags() == aVar.mo2700e().getFlags() && this.f2651a.getTextLocales().equals(aVar.mo2700e().getTextLocales())) {
                return this.f2651a.getTypeface() == null ? aVar.mo2700e().getTypeface() == null : this.f2651a.getTypeface().equals(aVar.mo2700e().getTypeface());
            }
            return false;
        }

        /* renamed from: b */
        public int mo2697b() {
            return this.f2653c;
        }

        /* renamed from: c */
        public int mo2698c() {
            return this.f2654d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo2699d() {
            return this.f2652b;
        }

        /* renamed from: e */
        public TextPaint mo2700e() {
            return this.f2651a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0615a)) {
                return false;
            }
            C0615a aVar = (C0615a) obj;
            return mo2696a(aVar) && this.f2652b == aVar.mo2699d();
        }

        public int hashCode() {
            return C0619c.m2481b(Float.valueOf(this.f2651a.getTextSize()), Float.valueOf(this.f2651a.getTextScaleX()), Float.valueOf(this.f2651a.getTextSkewX()), Float.valueOf(this.f2651a.getLetterSpacing()), Integer.valueOf(this.f2651a.getFlags()), this.f2651a.getTextLocales(), this.f2651a.getTypeface(), Boolean.valueOf(this.f2651a.isElegantTextHeight()), this.f2652b, Integer.valueOf(this.f2653c), Integer.valueOf(this.f2654d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2651a.getTextSize());
            sb.append(", textScaleX=" + this.f2651a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2651a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f2651a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2651a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2651a.getTextLocales());
            sb.append(", typeface=" + this.f2651a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f2651a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2652b);
            sb.append(", breakStrategy=" + this.f2653c);
            sb.append(", hyphenationFrequency=" + this.f2654d);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public C0615a mo2683a() {
        return this.f2649e;
    }

    /* renamed from: b */
    public PrecomputedText mo2684b() {
        Spannable spannable = this.f2648d;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2648d.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2648d.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2648d.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2648d.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f2650f.getSpans(i, i2, cls) : this.f2648d.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2648d.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2648d.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2650f.removeSpan(obj);
        } else {
            this.f2648d.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2650f.setSpan(obj, i, i2, i3);
        } else {
            this.f2648d.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2648d.subSequence(i, i2);
    }

    public String toString() {
        return this.f2648d.toString();
    }
}
