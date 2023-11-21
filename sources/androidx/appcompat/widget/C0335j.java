package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p021d.C1456j;
import p144z.C2947a;

/* renamed from: androidx.appcompat.widget.j */
class C0335j {

    /* renamed from: a */
    private final EditText f1309a;

    /* renamed from: b */
    private final C2947a f1310b;

    C0335j(EditText editText) {
        this.f1309a = editText;
        this.f1310b = new C2947a(editText, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener mo1949a(KeyListener keyListener) {
        return mo1950b(keyListener) ? this.f1310b.mo10242a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1950b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1951c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1309a.getContext().obtainStyledAttributes(attributeSet, C1456j.f6003g0, i, 0);
        try {
            int i2 = C1456j.f6073u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo1953e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public InputConnection mo1952d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1310b.mo10243b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1953e(boolean z) {
        this.f1310b.mo10244c(z);
    }
}
