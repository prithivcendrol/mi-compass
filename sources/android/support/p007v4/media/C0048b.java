package android.support.p007v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.b */
class C0048b {

    /* renamed from: android.support.v4.media.b$a */
    static class C0049a {
        /* renamed from: a */
        public static void m109a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m108a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
