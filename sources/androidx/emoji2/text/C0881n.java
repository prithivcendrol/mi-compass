package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0623f;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
public final class C0881n extends SpannableStringBuilder {

    /* renamed from: d */
    private final Class<?> f2982d;

    /* renamed from: e */
    private final List<C0882a> f2983e = new ArrayList();

    /* renamed from: androidx.emoji2.text.n$a */
    private static class C0882a implements TextWatcher, SpanWatcher {

        /* renamed from: d */
        final Object f2984d;

        /* renamed from: e */
        private final AtomicInteger f2985e = new AtomicInteger(0);

        C0882a(Object obj) {
            this.f2984d = obj;
        }

        /* renamed from: b */
        private boolean m3499b(Object obj) {
            return obj instanceof C0870i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3173a() {
            this.f2985e.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2984d).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2984d).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo3176c() {
            this.f2985e.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2985e.get() <= 0 || !m3499b(obj)) {
                ((SpanWatcher) this.f2984d).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f2985e.get() <= 0 || !m3499b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f2984d).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2985e.get() <= 0 || !m3499b(obj)) {
                ((SpanWatcher) this.f2984d).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2984d).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C0881n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0623f.m2496g(cls, "watcherClass cannot be null");
        this.f2982d = cls;
    }

    C0881n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0623f.m2496g(cls, "watcherClass cannot be null");
        this.f2982d = cls;
    }

    /* renamed from: b */
    private void m3490b() {
        for (int i = 0; i < this.f2983e.size(); i++) {
            this.f2983e.get(i).mo3173a();
        }
    }

    /* renamed from: c */
    public static C0881n m3491c(Class<?> cls, CharSequence charSequence) {
        return new C0881n(cls, charSequence);
    }

    /* renamed from: e */
    private void m3492e() {
        for (int i = 0; i < this.f2983e.size(); i++) {
            this.f2983e.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C0882a m3493f(Object obj) {
        for (int i = 0; i < this.f2983e.size(); i++) {
            C0882a aVar = this.f2983e.get(i);
            if (aVar.f2984d == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m3494g(Class<?> cls) {
        return this.f2982d == cls;
    }

    /* renamed from: h */
    private boolean m3495h(Object obj) {
        return obj != null && m3494g(obj.getClass());
    }

    /* renamed from: i */
    private void m3496i() {
        for (int i = 0; i < this.f2983e.size(); i++) {
            this.f2983e.get(i).mo3176c();
        }
    }

    /* renamed from: a */
    public void mo3154a() {
        m3490b();
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: d */
    public void mo3159d() {
        m3496i();
        m3492e();
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public int getSpanEnd(Object obj) {
        C0882a f;
        if (m3495h(obj) && (f = m3493f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C0882a f;
        if (m3495h(obj) && (f = m3493f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C0882a f;
        if (m3495h(obj) && (f = m3493f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m3494g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0882a[] aVarArr = (C0882a[]) super.getSpans(i, i2, C0882a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f2984d;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public int nextSpanTransition(int i, int i2, Class<C0882a> cls) {
        if (cls == null || m3494g(cls)) {
            cls = C0882a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C0882a aVar;
        if (m3495h(obj)) {
            aVar = m3493f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2983e.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m3490b();
        super.replace(i, i2, charSequence);
        m3496i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m3490b();
        super.replace(i, i2, charSequence, i3, i4);
        m3496i();
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m3495h(obj)) {
            C0882a aVar = new C0882a(obj);
            this.f2983e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C0881n(this.f2982d, this, i, i2);
    }
}
