package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p008os.C0586i;
import androidx.core.util.C0623f;
import java.nio.ByteBuffer;
import p139y.C2907b;

/* renamed from: androidx.emoji2.text.m */
public final class C0879m {

    /* renamed from: a */
    private final C2907b f2976a;

    /* renamed from: b */
    private final char[] f2977b;

    /* renamed from: c */
    private final C0880a f2978c = new C0880a(1024);

    /* renamed from: d */
    private final Typeface f2979d;

    /* renamed from: androidx.emoji2.text.m$a */
    static class C0880a {

        /* renamed from: a */
        private final SparseArray<C0880a> f2980a;

        /* renamed from: b */
        private C0866g f2981b;

        private C0880a() {
            this(1);
        }

        C0880a(int i) {
            this.f2980a = new SparseArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0880a mo3151a(int i) {
            SparseArray<C0880a> sparseArray = this.f2980a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C0866g mo3152b() {
            return this.f2981b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3153c(C0866g gVar, int i, int i2) {
            C0880a a = mo3151a(gVar.mo3113b(i));
            if (a == null) {
                a = new C0880a();
                this.f2980a.put(gVar.mo3113b(i), a);
            }
            if (i2 > i) {
                a.mo3153c(gVar, i + 1, i2);
            } else {
                a.f2981b = gVar;
            }
        }
    }

    private C0879m(Typeface typeface, C2907b bVar) {
        this.f2979d = typeface;
        this.f2976a = bVar;
        this.f2977b = new char[(bVar.mo10207k() * 2)];
        m3479a(bVar);
    }

    /* renamed from: a */
    private void m3479a(C2907b bVar) {
        int k = bVar.mo10207k();
        for (int i = 0; i < k; i++) {
            C0866g gVar = new C0866g(this, i);
            Character.toChars(gVar.mo3117f(), this.f2977b, i * 2);
            mo3150h(gVar);
        }
    }

    /* renamed from: b */
    public static C0879m m3480b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C0586i.m2412a("EmojiCompat.MetadataRepo.create");
            return new C0879m(typeface, C0875l.m3469b(byteBuffer));
        } finally {
            C0586i.m2413b();
        }
    }

    /* renamed from: c */
    public char[] mo3145c() {
        return this.f2977b;
    }

    /* renamed from: d */
    public C2907b mo3146d() {
        return this.f2976a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3147e() {
        return this.f2976a.mo10208l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0880a mo3148f() {
        return this.f2978c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface mo3149g() {
        return this.f2979d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3150h(C0866g gVar) {
        C0623f.m2496g(gVar, "emoji metadata cannot be null");
        C0623f.m2490a(gVar.mo3114c() > 0, "invalid metadata codepoint length");
        this.f2978c.mo3153c(gVar, 0, gVar.mo3114c() - 1);
    }
}
