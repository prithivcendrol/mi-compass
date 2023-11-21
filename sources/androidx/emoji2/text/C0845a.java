package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C0845a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f2900a;

    public /* synthetic */ C0845a(String str) {
        this.f2900a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C0846b.m3368c(this.f2900a, runnable);
    }
}
