package androidx.emoji2.text;

import androidx.emoji2.text.C0854e;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.f */
public final /* synthetic */ class C0865f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiCompatInitializer.C0842b f2936d;

    /* renamed from: e */
    public final /* synthetic */ C0854e.C0863h f2937e;

    /* renamed from: f */
    public final /* synthetic */ ThreadPoolExecutor f2938f;

    public /* synthetic */ C0865f(EmojiCompatInitializer.C0842b bVar, C0854e.C0863h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2936d = bVar;
        this.f2937e = hVar;
        this.f2938f = threadPoolExecutor;
    }

    public final void run() {
        this.f2936d.m3361d(this.f2937e, this.f2938f);
    }
}
