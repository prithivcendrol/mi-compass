package p144z;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C0623f;
import androidx.emoji2.text.C0854e;

/* renamed from: z.f */
public final class C2957f {

    /* renamed from: a */
    private final C2959b f11184a;

    /* renamed from: z.f$a */
    private static class C2958a extends C2959b {

        /* renamed from: a */
        private final TextView f11185a;

        /* renamed from: b */
        private final C2953d f11186b;

        /* renamed from: c */
        private boolean f11187c = true;

        C2958a(TextView textView) {
            this.f11185a = textView;
            this.f11186b = new C2953d(textView);
        }

        /* renamed from: f */
        private InputFilter[] m12230f(InputFilter[] inputFilterArr) {
            for (C2953d dVar : inputFilterArr) {
                if (dVar == this.f11186b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f11186b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        private SparseArray<InputFilter> m12231g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2953d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        private InputFilter[] m12232h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = m12231g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: j */
        private TransformationMethod m12233j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C2963h ? ((C2963h) transformationMethod).mo10276a() : transformationMethod;
        }

        /* renamed from: k */
        private void m12234k() {
            this.f11185a.setFilters(mo10265a(this.f11185a.getFilters()));
        }

        /* renamed from: m */
        private TransformationMethod m12235m(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof C2963h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new C2963h(transformationMethod) : transformationMethod;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo10265a(InputFilter[] inputFilterArr) {
            return !this.f11187c ? m12232h(inputFilterArr) : m12230f(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo10266b() {
            return this.f11187c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10267c(boolean z) {
            if (z) {
                mo10271l();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo10268d(boolean z) {
            this.f11187c = z;
            mo10271l();
            m12234k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public TransformationMethod mo10269e(TransformationMethod transformationMethod) {
            return this.f11187c ? m12235m(transformationMethod) : m12233j(transformationMethod);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo10270i(boolean z) {
            this.f11187c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo10271l() {
            this.f11185a.setTransformationMethod(mo10269e(this.f11185a.getTransformationMethod()));
        }
    }

    /* renamed from: z.f$b */
    static class C2959b {
        C2959b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo10265a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo10266b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10267c(boolean z) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo10268d(boolean z) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public TransformationMethod mo10269e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: z.f$c */
    private static class C2960c extends C2959b {

        /* renamed from: a */
        private final C2958a f11188a;

        C2960c(TextView textView) {
            this.f11188a = new C2958a(textView);
        }

        /* renamed from: f */
        private boolean m12248f() {
            return !C0854e.m3393h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo10265a(InputFilter[] inputFilterArr) {
            return m12248f() ? inputFilterArr : this.f11188a.mo10265a(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo10266b() {
            return this.f11188a.mo10266b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10267c(boolean z) {
            if (!m12248f()) {
                this.f11188a.mo10267c(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo10268d(boolean z) {
            if (m12248f()) {
                this.f11188a.mo10270i(z);
            } else {
                this.f11188a.mo10268d(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public TransformationMethod mo10269e(TransformationMethod transformationMethod) {
            return m12248f() ? transformationMethod : this.f11188a.mo10269e(transformationMethod);
        }
    }

    public C2957f(TextView textView, boolean z) {
        C0623f.m2496g(textView, "textView cannot be null");
        this.f11184a = !z ? new C2960c(textView) : new C2958a(textView);
    }

    /* renamed from: a */
    public InputFilter[] mo10260a(InputFilter[] inputFilterArr) {
        return this.f11184a.mo10265a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo10261b() {
        return this.f11184a.mo10266b();
    }

    /* renamed from: c */
    public void mo10262c(boolean z) {
        this.f11184a.mo10267c(z);
    }

    /* renamed from: d */
    public void mo10263d(boolean z) {
        this.f11184a.mo10268d(z);
    }

    /* renamed from: e */
    public TransformationMethod mo10264e(TransformationMethod transformationMethod) {
        return this.f11184a.mo10269e(transformationMethod);
    }
}
