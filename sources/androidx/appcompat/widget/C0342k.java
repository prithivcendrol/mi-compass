package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p021d.C1456j;
import p144z.C2957f;

/* renamed from: androidx.appcompat.widget.k */
class C0342k {

    /* renamed from: a */
    private final TextView f1342a;

    /* renamed from: b */
    private final C2957f f1343b;

    C0342k(TextView textView) {
        this.f1342a = textView;
        this.f1343b = new C2957f(textView, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] mo1963a(InputFilter[] inputFilterArr) {
        return this.f1343b.mo10260a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo1964b() {
        return this.f1343b.mo10261b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1965c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1342a.getContext().obtainStyledAttributes(attributeSet, C1456j.f6003g0, i, 0);
        try {
            int i2 = C1456j.f6073u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo1967e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1966d(boolean z) {
        this.f1343b.mo10262c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1967e(boolean z) {
        this.f1343b.mo10263d(z);
    }

    /* renamed from: f */
    public TransformationMethod mo1968f(TransformationMethod transformationMethod) {
        return this.f1343b.mo10264e(transformationMethod);
    }
}
