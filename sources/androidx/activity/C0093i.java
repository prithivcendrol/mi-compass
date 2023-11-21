package androidx.activity;

/* renamed from: androidx.activity.i */
public final /* synthetic */ class C0093i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OnBackPressedDispatcher f231d;

    public /* synthetic */ C0093i(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f231d = onBackPressedDispatcher;
    }

    public final void run() {
        this.f231d.mo294f();
    }
}
