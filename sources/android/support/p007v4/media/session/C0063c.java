package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0058a;
import android.support.p007v4.media.session.C0067e;
import android.support.p007v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0063c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f171a = C0067e.m178a(new C0064a(this));

    /* renamed from: b */
    C0058a f172b;

    /* renamed from: android.support.v4.media.session.c$a */
    private static class C0064a implements C0067e.C0068a {

        /* renamed from: a */
        private final WeakReference<C0063c> f173a;

        C0064a(C0063c cVar) {
            this.f173a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo186a(CharSequence charSequence) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo182f(charSequence);
            }
        }

        /* renamed from: b */
        public void mo187b(Object obj) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo179c(MediaMetadataCompat.m85a(obj));
            }
        }

        /* renamed from: c */
        public void mo188c() {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo183g();
            }
        }

        /* renamed from: d */
        public void mo189d(Bundle bundle) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo177b(bundle);
            }
        }

        /* renamed from: e */
        public void mo190e(List<?> list) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo181e(MediaSessionCompat.QueueItem.m120b(list));
            }
        }

        /* renamed from: f */
        public void mo191f(int i, int i2, int i3, int i4, int i5) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                cVar.mo176a(new C0066d(i, i2, i3, i4, i5));
            }
        }

        /* renamed from: g */
        public void mo192g(Object obj) {
            C0063c cVar = this.f173a.get();
            if (cVar != null && cVar.f172b == null) {
                cVar.mo180d(PlaybackStateCompat.m132a(obj));
            }
        }

        /* renamed from: h */
        public void mo193h(String str, Bundle bundle) {
            C0063c cVar = this.f173a.get();
            if (cVar != null) {
                C0058a aVar = cVar.f172b;
                cVar.mo184h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0065b extends C0058a.C0059a {

        /* renamed from: a */
        private final WeakReference<C0063c> f174a;

        C0065b(C0063c cVar) {
            this.f174a = new WeakReference<>(cVar);
        }

        /* renamed from: f */
        public void mo165f(boolean z) {
        }

        /* renamed from: j */
        public void mo166j(int i) {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: m */
        public void mo167m(int i) {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: n */
        public void mo168n() {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: s */
        public void mo169s(boolean z) {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: t */
        public void mo170t(PlaybackStateCompat playbackStateCompat) {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: u */
        public void mo171u(String str, Bundle bundle) {
            C0063c cVar = this.f174a.get();
            if (cVar != null) {
                cVar.mo185i(1, str, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo176a(C0066d dVar) {
    }

    /* renamed from: b */
    public void mo177b(Bundle bundle) {
    }

    public void binderDied() {
        mo185i(8, (Object) null, (Bundle) null);
    }

    /* renamed from: c */
    public void mo179c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo180d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo181e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo182f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo183g() {
    }

    /* renamed from: h */
    public void mo184h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo185i(int i, Object obj, Bundle bundle) {
    }
}
