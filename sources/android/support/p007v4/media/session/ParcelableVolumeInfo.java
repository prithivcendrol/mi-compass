package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0055a();

    /* renamed from: d */
    public int f148d;

    /* renamed from: e */
    public int f149e;

    /* renamed from: f */
    public int f150f;

    /* renamed from: g */
    public int f151g;

    /* renamed from: h */
    public int f152h;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0055a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0055a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f148d = parcel.readInt();
        this.f150f = parcel.readInt();
        this.f151g = parcel.readInt();
        this.f152h = parcel.readInt();
        this.f149e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f148d);
        parcel.writeInt(this.f150f);
        parcel.writeInt(this.f151g);
        parcel.writeInt(this.f152h);
        parcel.writeInt(this.f149e);
    }
}
