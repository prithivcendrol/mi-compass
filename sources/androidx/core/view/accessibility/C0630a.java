package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
public final class C0630a extends ClickableSpan {

    /* renamed from: d */
    private final int f2668d;

    /* renamed from: e */
    private final C0637g f2669e;

    /* renamed from: f */
    private final int f2670f;

    public C0630a(int i, C0637g gVar, int i2) {
        this.f2668d = i;
        this.f2669e = gVar;
        this.f2670f = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2668d);
        this.f2669e.mo2740M(this.f2670f, bundle);
    }
}
