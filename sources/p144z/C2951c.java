package p144z;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0854e;

/* renamed from: z.c */
final class C2951c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f11176a;

    /* renamed from: b */
    private final C2952a f11177b;

    /* renamed from: z.c$a */
    public static class C2952a {
        /* renamed from: a */
        public boolean mo10251a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C0854e.m3390e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo10252b(EditorInfo editorInfo) {
            if (C0854e.m3393h()) {
                C0854e.m3389b().mo3102u(editorInfo);
            }
        }
    }

    C2951c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C2952a());
    }

    C2951c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C2952a aVar) {
        super(inputConnection, false);
        this.f11176a = textView;
        this.f11177b = aVar;
        aVar.mo10252b(editorInfo);
    }

    /* renamed from: a */
    private Editable m12217a() {
        return this.f11176a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return this.f11177b.mo10251a(this, m12217a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f11177b.mo10251a(this, m12217a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
