package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.C0614c;
import java.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.p */
class C0884p implements Spannable {

    /* renamed from: d */
    private boolean f2987d = false;

    /* renamed from: e */
    private Spannable f2988e;

    /* renamed from: androidx.emoji2.text.p$a */
    private static class C0885a {
        /* renamed from: a */
        static IntStream m3506a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        static IntStream m3507b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.p$b */
    static class C0886b {
        C0886b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3196a(CharSequence charSequence) {
            return charSequence instanceof C0614c;
        }
    }

    /* renamed from: androidx.emoji2.text.p$c */
    static class C0887c extends C0886b {
        C0887c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3196a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C0614c);
        }
    }

    C0884p(Spannable spannable) {
        this.f2988e = spannable;
    }

    C0884p(CharSequence charSequence) {
        this.f2988e = new SpannableString(charSequence);
    }

    /* renamed from: a */
    private void m3503a() {
        Spannable spannable = this.f2988e;
        if (!this.f2987d && m3504c().mo3196a(spannable)) {
            this.f2988e = new SpannableString(spannable);
        }
        this.f2987d = true;
    }

    /* renamed from: c */
    static C0886b m3504c() {
        return Build.VERSION.SDK_INT < 28 ? new C0886b() : new C0887c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable mo3182b() {
        return this.f2988e;
    }

    public char charAt(int i) {
        return this.f2988e.charAt(i);
    }

    public IntStream chars() {
        return C0885a.m3506a(this.f2988e);
    }

    public IntStream codePoints() {
        return C0885a.m3507b(this.f2988e);
    }

    public int getSpanEnd(Object obj) {
        return this.f2988e.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2988e.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2988e.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f2988e.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2988e.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2988e.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        m3503a();
        this.f2988e.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        m3503a();
        this.f2988e.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2988e.subSequence(i, i2);
    }

    public String toString() {
        return this.f2988e.toString();
    }
}
