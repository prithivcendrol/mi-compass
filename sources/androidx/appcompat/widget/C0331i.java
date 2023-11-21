package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0665c;
import androidx.core.view.C0710h0;
import androidx.core.view.C0727l0;
import androidx.core.widget.C0828k;
import androidx.core.widget.C0838o;
import p021d.C1447a;
import p119u.C2719b;
import p119u.C2722d;

/* renamed from: androidx.appcompat.widget.i */
public class C0331i extends EditText implements C0710h0 {

    /* renamed from: d */
    private final C0318e f1301d;

    /* renamed from: e */
    private final C0420x f1302e;

    /* renamed from: f */
    private final C0417w f1303f;

    /* renamed from: g */
    private final C0838o f1304g;

    /* renamed from: h */
    private final C0335j f1305h;

    /* renamed from: i */
    private C0332a f1306i;

    /* renamed from: androidx.appcompat.widget.i$a */
    class C0332a {
        C0332a() {
        }

        /* renamed from: a */
        public TextClassifier mo1919a() {
            return C0331i.super.getTextClassifier();
        }

        /* renamed from: b */
        public void mo1920b(TextClassifier textClassifier) {
            C0331i.super.setTextClassifier(textClassifier);
        }
    }

    public C0331i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5662B);
    }

    public C0331i(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0318e eVar = new C0318e(this);
        this.f1301d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f1302e = xVar;
        xVar.mo2290m(attributeSet, i);
        xVar.mo2280b();
        this.f1303f = new C0417w(this);
        this.f1304g = new C0838o();
        C0335j jVar = new C0335j(this);
        this.f1305h = jVar;
        jVar.mo1951c(attributeSet, i);
        mo1894d(jVar);
    }

    private C0332a getSuperCaller() {
        if (this.f1306i == null) {
            this.f1306i = new C0332a();
        }
        return this.f1306i;
    }

    /* renamed from: a */
    public C0665c mo1893a(C0665c cVar) {
        return this.f1304g.mo2914a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1894d(C0335j jVar) {
        KeyListener keyListener = getKeyListener();
        if (jVar.mo1950b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = jVar.mo1949a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f1302e;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1302e.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1302e.mo2288k();
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1303f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.w r0 = r2.f1303f
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo2276a()
            return r0
        L_0x0010:
            androidx.appcompat.widget.i$a r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.mo1919a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0331i.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] x;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1302e.mo2295r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C0345l.m1590a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (x = C0727l0.m2919x(this)) == null)) {
            C2719b.m11343d(editorInfo, x);
            a = C2722d.m11352c(this, a, editorInfo);
        }
        return this.f1305h.mo1952d(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0386s.m1724a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C0386s.m1725b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1302e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1302e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1305h.mo1953e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1305h.mo1949a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f1301d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1302e.mo2300w(colorStateList);
        this.f1302e.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1302e.mo2301x(mode);
        this.f1302e.mo2280b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0420x xVar = this.f1302e;
        if (xVar != null) {
            xVar.mo2294q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0417w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1303f) == null) {
            getSuperCaller().mo1920b(textClassifier);
        } else {
            wVar.mo2277b(textClassifier);
        }
    }
}
