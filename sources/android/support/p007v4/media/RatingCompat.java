package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0045a();

    /* renamed from: d */
    private final int f134d;

    /* renamed from: e */
    private final float f135e;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0045a implements Parcelable.Creator<RatingCompat> {
        C0045a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f134d = i;
        this.f135e = f;
    }

    public int describeContents() {
        return this.f134d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f134d);
        sb.append(" rating=");
        float f = this.f135e;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f134d);
        parcel.writeFloat(this.f135e);
    }
}
