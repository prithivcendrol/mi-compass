package p144z;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0854e;

/* renamed from: z.e */
final class C2955e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f11182a;

    /* renamed from: b */
    private final C2956a f11183b;

    /* renamed from: z.e$a */
    public static class C2956a {
        /* renamed from: a */
        public boolean mo10259a(Editable editable, int i, KeyEvent keyEvent) {
            return C0854e.m3391f(editable, i, keyEvent);
        }
    }

    C2955e(KeyListener keyListener) {
        this(keyListener, new C2956a());
    }

    C2955e(KeyListener keyListener, C2956a aVar) {
        this.f11182a = keyListener;
        this.f11183b = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f11182a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f11182a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f11183b.mo10259a(editable, i, keyEvent) || this.f11182a.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f11182a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f11182a.onKeyUp(view, editable, i, keyEvent);
    }
}
