package p144z;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0854e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: z.d */
final class C2953d implements InputFilter {

    /* renamed from: a */
    private final TextView f11178a;

    /* renamed from: b */
    private C0854e.C0860e f11179b;

    /* renamed from: z.d$a */
    private static class C2954a extends C0854e.C0860e {

        /* renamed from: a */
        private final Reference<TextView> f11180a;

        /* renamed from: b */
        private final Reference<C2953d> f11181b;

        C2954a(TextView textView, C2953d dVar) {
            this.f11180a = new WeakReference(textView);
            this.f11181b = new WeakReference(dVar);
        }

        /* renamed from: c */
        private boolean m12222c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo1619b() {
            CharSequence text;
            CharSequence o;
            super.mo1619b();
            TextView textView = this.f11180a.get();
            if (m12222c(textView, this.f11181b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o = C0854e.m3389b().mo3096o(text))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    C2953d.m12221b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }
    }

    C2953d(TextView textView) {
        this.f11178a = textView;
    }

    /* renamed from: a */
    private C0854e.C0860e m12220a() {
        if (this.f11179b == null) {
            this.f11179b = new C2954a(this.f11178a, this);
        }
        return this.f11179b;
    }

    /* renamed from: b */
    static void m12221b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f11178a.isInEditMode()) {
            return charSequence;
        }
        int d = C0854e.m3389b().mo3091d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f11178a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0854e.m3389b().mo3097p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C0854e.m3389b().mo3100s(m12220a());
        return charSequence;
    }
}
