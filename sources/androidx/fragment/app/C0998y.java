package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.y */
final class C0998y implements Parcelable {
    public static final Parcelable.Creator<C0998y> CREATOR = new C0999a();

    /* renamed from: d */
    ArrayList<String> f3374d;

    /* renamed from: e */
    ArrayList<String> f3375e;

    /* renamed from: f */
    C0916b[] f3376f;

    /* renamed from: g */
    int f3377g;

    /* renamed from: h */
    String f3378h = null;

    /* renamed from: i */
    ArrayList<String> f3379i = new ArrayList<>();

    /* renamed from: j */
    ArrayList<C0919c> f3380j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<FragmentManager.C0909k> f3381k;

    /* renamed from: androidx.fragment.app.y$a */
    class C0999a implements Parcelable.Creator<C0998y> {
        C0999a() {
        }

        /* renamed from: a */
        public C0998y createFromParcel(Parcel parcel) {
            return new C0998y(parcel);
        }

        /* renamed from: b */
        public C0998y[] newArray(int i) {
            return new C0998y[i];
        }
    }

    public C0998y() {
    }

    public C0998y(Parcel parcel) {
        this.f3374d = parcel.createStringArrayList();
        this.f3375e = parcel.createStringArrayList();
        this.f3376f = (C0916b[]) parcel.createTypedArray(C0916b.CREATOR);
        this.f3377g = parcel.readInt();
        this.f3378h = parcel.readString();
        this.f3379i = parcel.createStringArrayList();
        this.f3380j = parcel.createTypedArrayList(C0919c.CREATOR);
        this.f3381k = parcel.createTypedArrayList(FragmentManager.C0909k.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3374d);
        parcel.writeStringList(this.f3375e);
        parcel.writeTypedArray(this.f3376f, i);
        parcel.writeInt(this.f3377g);
        parcel.writeString(this.f3378h);
        parcel.writeStringList(this.f3379i);
        parcel.writeTypedList(this.f3380j);
        parcel.writeTypedList(this.f3381k);
    }
}
