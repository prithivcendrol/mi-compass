package androidx.activity;

import androidx.core.util.C0617a;

/* renamed from: androidx.activity.h */
public final /* synthetic */ class C0092h implements C0617a {

    /* renamed from: a */
    public final /* synthetic */ OnBackPressedDispatcher f230a;

    public /* synthetic */ C0092h(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f230a = onBackPressedDispatcher;
    }

    public final void accept(Object obj) {
        this.f230a.m241e((Boolean) obj);
    }
}
