package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import p000a.C0004b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C0004b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5a(int i, Bundle bundle) {
        MediaSessionCompat.m118a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
