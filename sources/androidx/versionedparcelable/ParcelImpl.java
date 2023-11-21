package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p070l0.C1870a;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1264a();

    /* renamed from: d */
    private final C1870a f4380d;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1264a implements Parcelable.Creator<ParcelImpl> {
        C1264a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4380d = new C1266b(parcel).mo5031u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1266b(parcel).mo5012L(this.f4380d);
    }
}
