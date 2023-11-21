package p144z;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C0623f;

/* renamed from: z.a */
public final class C2947a {

    /* renamed from: a */
    private final C2949b f11168a;

    /* renamed from: b */
    private int f11169b = Integer.MAX_VALUE;

    /* renamed from: c */
    private int f11170c = 0;

    /* renamed from: z.a$a */
    private static class C2948a extends C2949b {

        /* renamed from: a */
        private final EditText f11171a;

        /* renamed from: b */
        private final C2961g f11172b;

        C2948a(EditText editText, boolean z) {
            this.f11171a = editText;
            C2961g gVar = new C2961g(editText, z);
            this.f11172b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C2950b.getInstance());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo10245a(KeyListener keyListener) {
            if (keyListener instanceof C2955e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C2955e(keyListener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo10246b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C2951c ? inputConnection : new C2951c(this.f11171a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10247c(boolean z) {
            this.f11172b.mo10274c(z);
        }
    }

    /* renamed from: z.a$b */
    static class C2949b {
        C2949b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyListener mo10245a(KeyListener keyListener) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public InputConnection mo10246b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10247c(boolean z) {
            throw null;
        }
    }

    public C2947a(EditText editText, boolean z) {
        C0623f.m2496g(editText, "editText cannot be null");
        this.f11168a = new C2948a(editText, z);
    }

    /* renamed from: a */
    public KeyListener mo10242a(KeyListener keyListener) {
        return this.f11168a.mo10245a(keyListener);
    }

    /* renamed from: b */
    public InputConnection mo10243b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f11168a.mo10246b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void mo10244c(boolean z) {
        this.f11168a.mo10247c(z);
    }
}
