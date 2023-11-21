package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p021d.C1447a;

/* renamed from: androidx.appcompat.widget.t */
public class C0390t extends SeekBar {

    /* renamed from: d */
    private final C0396u f1474d;

    public C0390t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5669I);
    }

    public C0390t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0396u uVar = new C0396u(this);
        this.f1474d = uVar;
        uVar.mo2135c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1474d.mo2193h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1474d.mo2194i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1474d.mo2192g(canvas);
    }
}
