package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.C0046a;
import android.support.p007v4.media.C0048b;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0042a();

    /* renamed from: d */
    private final String f111d;

    /* renamed from: e */
    private final CharSequence f112e;

    /* renamed from: f */
    private final CharSequence f113f;

    /* renamed from: g */
    private final CharSequence f114g;

    /* renamed from: h */
    private final Bitmap f115h;

    /* renamed from: i */
    private final Uri f116i;

    /* renamed from: j */
    private final Bundle f117j;

    /* renamed from: k */
    private final Uri f118k;

    /* renamed from: l */
    private Object f119l;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0042a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0042a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m72a(C0046a.m90a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0043b {

        /* renamed from: a */
        private String f120a;

        /* renamed from: b */
        private CharSequence f121b;

        /* renamed from: c */
        private CharSequence f122c;

        /* renamed from: d */
        private CharSequence f123d;

        /* renamed from: e */
        private Bitmap f124e;

        /* renamed from: f */
        private Uri f125f;

        /* renamed from: g */
        private Bundle f126g;

        /* renamed from: h */
        private Uri f127h;

        /* renamed from: a */
        public MediaDescriptionCompat mo91a() {
            return new MediaDescriptionCompat(this.f120a, this.f121b, this.f122c, this.f123d, this.f124e, this.f125f, this.f126g, this.f127h);
        }

        /* renamed from: b */
        public C0043b mo92b(CharSequence charSequence) {
            this.f123d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0043b mo93c(Bundle bundle) {
            this.f126g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0043b mo94d(Bitmap bitmap) {
            this.f124e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0043b mo95e(Uri uri) {
            this.f125f = uri;
            return this;
        }

        /* renamed from: f */
        public C0043b mo96f(String str) {
            this.f120a = str;
            return this;
        }

        /* renamed from: g */
        public C0043b mo97g(Uri uri) {
            this.f127h = uri;
            return this;
        }

        /* renamed from: h */
        public C0043b mo98h(CharSequence charSequence) {
            this.f122c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0043b mo99i(CharSequence charSequence) {
            this.f121b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f111d = str;
        this.f112e = charSequence;
        this.f113f = charSequence2;
        this.f114g = charSequence3;
        this.f115h = bitmap;
        this.f116i = uri;
        this.f117j = bundle;
        this.f118k = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p007v4.media.MediaDescriptionCompat m72a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0074
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p007v4.media.C0046a.m95f(r8)
            r1.mo96f(r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0046a.m97h(r8)
            r1.mo99i(r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0046a.m96g(r8)
            r1.mo98h(r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0046a.m91b(r8)
            r1.mo92b(r2)
            android.graphics.Bitmap r2 = android.support.p007v4.media.C0046a.m93d(r8)
            r1.mo94d(r2)
            android.net.Uri r2 = android.support.p007v4.media.C0046a.m94e(r8)
            r1.mo95e(r2)
            android.os.Bundle r2 = android.support.p007v4.media.C0046a.m92c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0044
            android.support.p007v4.media.session.MediaSessionCompat.m118a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0057
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005d:
            r0 = r2
        L_0x005e:
            r1.mo93c(r0)
            if (r4 == 0) goto L_0x0067
            r1.mo97g(r4)
            goto L_0x006e
        L_0x0067:
            android.net.Uri r0 = android.support.p007v4.media.C0048b.m108a(r8)
            r1.mo97g(r0)
        L_0x006e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo91a()
            r0.f119l = r8
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.MediaDescriptionCompat.m72a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo83b() {
        Object obj = this.f119l;
        if (obj != null) {
            return obj;
        }
        Object b = C0046a.C0047a.m100b();
        C0046a.C0047a.m105g(b, this.f111d);
        C0046a.C0047a.m107i(b, this.f112e);
        C0046a.C0047a.m106h(b, this.f113f);
        C0046a.C0047a.m101c(b, this.f114g);
        C0046a.C0047a.m103e(b, this.f115h);
        C0046a.C0047a.m104f(b, this.f116i);
        C0046a.C0047a.m102d(b, this.f117j);
        C0048b.C0049a.m109a(b, this.f118k);
        Object a = C0046a.C0047a.m99a(b);
        this.f119l = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f112e + ", " + this.f113f + ", " + this.f114g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0046a.m98i(mo83b(), parcel, i);
    }
}
