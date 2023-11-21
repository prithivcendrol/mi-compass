package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C0623f;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
public final class C0665c {

    /* renamed from: a */
    private final C0671f f2742a;

    /* renamed from: androidx.core.view.c$a */
    public static final class C0666a {

        /* renamed from: a */
        private final C0668c f2743a;

        public C0666a(ClipData clipData, int i) {
            this.f2743a = Build.VERSION.SDK_INT >= 31 ? new C0667b(clipData, i) : new C0669d(clipData, i);
        }

        /* renamed from: a */
        public C0665c mo2836a() {
            return this.f2743a.build();
        }

        /* renamed from: b */
        public C0666a mo2837b(Bundle bundle) {
            this.f2743a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C0666a mo2838c(int i) {
            this.f2743a.mo2841b(i);
            return this;
        }

        /* renamed from: d */
        public C0666a mo2839d(Uri uri) {
            this.f2743a.mo2840a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    private static final class C0667b implements C0668c {

        /* renamed from: a */
        private final ContentInfo.Builder f2744a;

        C0667b(ClipData clipData, int i) {
            this.f2744a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public void mo2840a(Uri uri) {
            this.f2744a.setLinkUri(uri);
        }

        /* renamed from: b */
        public void mo2841b(int i) {
            this.f2744a.setFlags(i);
        }

        public C0665c build() {
            return new C0665c(new C0670e(this.f2744a.build()));
        }

        public void setExtras(Bundle bundle) {
            this.f2744a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    private interface C0668c {
        /* renamed from: a */
        void mo2840a(Uri uri);

        /* renamed from: b */
        void mo2841b(int i);

        C0665c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.c$d */
    private static final class C0669d implements C0668c {

        /* renamed from: a */
        ClipData f2745a;

        /* renamed from: b */
        int f2746b;

        /* renamed from: c */
        int f2747c;

        /* renamed from: d */
        Uri f2748d;

        /* renamed from: e */
        Bundle f2749e;

        C0669d(ClipData clipData, int i) {
            this.f2745a = clipData;
            this.f2746b = i;
        }

        /* renamed from: a */
        public void mo2840a(Uri uri) {
            this.f2748d = uri;
        }

        /* renamed from: b */
        public void mo2841b(int i) {
            this.f2747c = i;
        }

        public C0665c build() {
            return new C0665c(new C0672g(this));
        }

        public void setExtras(Bundle bundle) {
            this.f2749e = bundle;
        }
    }

    /* renamed from: androidx.core.view.c$e */
    private static final class C0670e implements C0671f {

        /* renamed from: a */
        private final ContentInfo f2750a;

        C0670e(ContentInfo contentInfo) {
            this.f2750a = (ContentInfo) C0623f.m2495f(contentInfo);
        }

        /* renamed from: a */
        public ClipData mo2844a() {
            return this.f2750a.getClip();
        }

        /* renamed from: b */
        public int mo2845b() {
            return this.f2750a.getFlags();
        }

        /* renamed from: c */
        public ContentInfo mo2846c() {
            return this.f2750a;
        }

        /* renamed from: d */
        public int mo2847d() {
            return this.f2750a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2750a + "}";
        }
    }

    /* renamed from: androidx.core.view.c$f */
    private interface C0671f {
        /* renamed from: a */
        ClipData mo2844a();

        /* renamed from: b */
        int mo2845b();

        /* renamed from: c */
        ContentInfo mo2846c();

        /* renamed from: d */
        int mo2847d();
    }

    /* renamed from: androidx.core.view.c$g */
    private static final class C0672g implements C0671f {

        /* renamed from: a */
        private final ClipData f2751a;

        /* renamed from: b */
        private final int f2752b;

        /* renamed from: c */
        private final int f2753c;

        /* renamed from: d */
        private final Uri f2754d;

        /* renamed from: e */
        private final Bundle f2755e;

        C0672g(C0669d dVar) {
            this.f2751a = (ClipData) C0623f.m2495f(dVar.f2745a);
            this.f2752b = C0623f.m2491b(dVar.f2746b, 0, 5, "source");
            this.f2753c = C0623f.m2494e(dVar.f2747c, 1);
            this.f2754d = dVar.f2748d;
            this.f2755e = dVar.f2749e;
        }

        /* renamed from: a */
        public ClipData mo2844a() {
            return this.f2751a;
        }

        /* renamed from: b */
        public int mo2845b() {
            return this.f2753c;
        }

        /* renamed from: c */
        public ContentInfo mo2846c() {
            return null;
        }

        /* renamed from: d */
        public int mo2847d() {
            return this.f2752b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2751a.getDescription());
            sb.append(", source=");
            sb.append(C0665c.m2652e(this.f2752b));
            sb.append(", flags=");
            sb.append(C0665c.m2651a(this.f2753c));
            String str2 = "";
            if (this.f2754d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f2754d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f2755e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C0665c(C0671f fVar) {
        this.f2742a = fVar;
    }

    /* renamed from: a */
    static String m2651a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m2652e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C0665c m2653g(ContentInfo contentInfo) {
        return new C0665c(new C0670e(contentInfo));
    }

    /* renamed from: b */
    public ClipData mo2831b() {
        return this.f2742a.mo2844a();
    }

    /* renamed from: c */
    public int mo2832c() {
        return this.f2742a.mo2845b();
    }

    /* renamed from: d */
    public int mo2833d() {
        return this.f2742a.mo2847d();
    }

    /* renamed from: f */
    public ContentInfo mo2834f() {
        ContentInfo c = this.f2742a.mo2846c();
        Objects.requireNonNull(c);
        ContentInfo contentInfo = c;
        return c;
    }

    public String toString() {
        return this.f2742a.toString();
    }
}
