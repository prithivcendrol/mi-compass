package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0060b;
import android.support.p007v4.media.session.C0063c;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0497f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f136a;

    /* renamed from: b */
    private final List<C0063c> f137b;

    /* renamed from: c */
    private HashMap<C0063c, C0051a> f138c;

    /* renamed from: d */
    final MediaSessionCompat.Token f139d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f140d;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f140d.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f136a) {
                    mediaControllerCompat$MediaControllerImplApi21.f139d.mo135b(C0060b.C0061a.m152x(C0497f.m2089a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f139d.mo136c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo113a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0051a extends C0063c.C0065b {
        C0051a(C0063c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo115a(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: c */
        public void mo116c() {
            throw new AssertionError();
        }

        /* renamed from: d */
        public void mo117d(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: e */
        public void mo118e(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: i */
        public void mo119i(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: w */
        public void mo120w(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo113a() {
        if (this.f139d.mo134a() != null) {
            for (C0063c next : this.f137b) {
                C0051a aVar = new C0051a(next);
                this.f138c.put(next, aVar);
                next.f172b = aVar;
                try {
                    this.f139d.mo134a().mo174h(aVar);
                    next.mo185i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f137b.clear();
        }
    }
}
