package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c */
class C0919c implements Parcelable {
    public static final Parcelable.Creator<C0919c> CREATOR = new C0920a();

    /* renamed from: d */
    final List<String> f3152d;

    /* renamed from: e */
    final List<C0916b> f3153e;

    /* renamed from: androidx.fragment.app.c$a */
    class C0920a implements Parcelable.Creator<C0919c> {
        C0920a() {
        }

        /* renamed from: a */
        public C0919c createFromParcel(Parcel parcel) {
            return new C0919c(parcel);
        }

        /* renamed from: b */
        public C0919c[] newArray(int i) {
            return new C0919c[i];
        }
    }

    C0919c(Parcel parcel) {
        this.f3152d = parcel.createStringArrayList();
        this.f3153e = parcel.createTypedArrayList(C0916b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3152d);
        parcel.writeTypedList(this.f3153e);
    }
}
