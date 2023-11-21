package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
public final class C0098a implements Parcelable {
    public static final Parcelable.Creator<C0098a> CREATOR = new C0099a();

    /* renamed from: d */
    private final int f238d;

    /* renamed from: e */
    private final Intent f239e;

    /* renamed from: androidx.activity.result.a$a */
    class C0099a implements Parcelable.Creator<C0098a> {
        C0099a() {
        }

        /* renamed from: a */
        public C0098a createFromParcel(Parcel parcel) {
            return new C0098a(parcel);
        }

        /* renamed from: b */
        public C0098a[] newArray(int i) {
            return new C0098a[i];
        }
    }

    public C0098a(int i, Intent intent) {
        this.f238d = i;
        this.f239e = intent;
    }

    C0098a(Parcel parcel) {
        this.f238d = parcel.readInt();
        this.f239e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static String m270c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent mo320a() {
        return this.f239e;
    }

    /* renamed from: b */
    public int mo321b() {
        return this.f238d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m270c(this.f238d) + ", data=" + this.f239e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f238d);
        parcel.writeInt(this.f239e == null ? 0 : 1);
        Intent intent = this.f239e;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
