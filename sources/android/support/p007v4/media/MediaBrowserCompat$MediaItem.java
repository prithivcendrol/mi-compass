package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0041a();

    /* renamed from: d */
    private final int f109d;

    /* renamed from: e */
    private final MediaDescriptionCompat f110e;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0041a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0041a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f109d = parcel.readInt();
        this.f110e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f109d + ", mDescription=" + this.f110e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f109d);
        this.f110e.writeToParcel(parcel, i);
    }
}
