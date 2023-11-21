package android.support.p007v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0067e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface C0068a {
        /* renamed from: a */
        void mo186a(CharSequence charSequence);

        /* renamed from: b */
        void mo187b(Object obj);

        /* renamed from: c */
        void mo188c();

        /* renamed from: d */
        void mo189d(Bundle bundle);

        /* renamed from: e */
        void mo190e(List<?> list);

        /* renamed from: f */
        void mo191f(int i, int i2, int i3, int i4, int i5);

        /* renamed from: g */
        void mo192g(Object obj);

        /* renamed from: h */
        void mo193h(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.e$b */
    static class C0069b<T extends C0068a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f180a;

        public C0069b(T t) {
            this.f180a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f180a.mo191f(playbackInfo.getPlaybackType(), C0070c.m188b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m118a(bundle);
            this.f180a.mo189d(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f180a.mo187b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f180a.mo192g(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f180a.mo190e(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f180a.mo186a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f180a.mo188c();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m118a(bundle);
            this.f180a.mo193h(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    public static class C0070c {
        /* renamed from: a */
        public static AudioAttributes m187a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m188b(Object obj) {
            return m189c(m187a(obj));
        }

        /* renamed from: c */
        private static int m189c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m178a(C0068a aVar) {
        return new C0069b(aVar);
    }
}
