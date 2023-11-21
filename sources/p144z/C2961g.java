package p144z;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0854e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: z.g */
final class C2961g implements TextWatcher {

    /* renamed from: d */
    private final EditText f11189d;

    /* renamed from: e */
    private final boolean f11190e;

    /* renamed from: f */
    private C0854e.C0860e f11191f;

    /* renamed from: g */
    private int f11192g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f11193h = 0;

    /* renamed from: i */
    private boolean f11194i;

    /* renamed from: z.g$a */
    private static class C2962a extends C0854e.C0860e {

        /* renamed from: a */
        private final Reference<EditText> f11195a;

        C2962a(EditText editText) {
            this.f11195a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo1619b() {
            super.mo1619b();
            C2961g.m12255b(this.f11195a.get(), 1);
        }
    }

    C2961g(EditText editText, boolean z) {
        this.f11189d = editText;
        this.f11190e = z;
        this.f11194i = true;
    }

    /* renamed from: a */
    private C0854e.C0860e m12254a() {
        if (this.f11191f == null) {
            this.f11191f = new C2962a(this.f11189d);
        }
        return this.f11191f;
    }

    /* renamed from: b */
    static void m12255b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0854e.m3389b().mo3096o(editableText);
            C2953d.m12221b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: d */
    private boolean m12256d() {
        return !this.f11194i || (!this.f11190e && !C0854e.m3393h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void mo10274c(boolean z) {
        if (this.f11194i != z) {
            if (this.f11191f != null) {
                C0854e.m3389b().mo3101t(this.f11191f);
            }
            this.f11194i = z;
            if (z) {
                m12255b(this.f11189d, C0854e.m3389b().mo3091d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f11189d.isInEditMode() && !m12256d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C0854e.m3389b().mo3091d();
            if (d != 0) {
                if (d == 1) {
                    C0854e.m3389b().mo3099r((Spannable) charSequence, i, i + i3, this.f11192g, this.f11193h);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C0854e.m3389b().mo3100s(m12254a());
        }
    }
}
