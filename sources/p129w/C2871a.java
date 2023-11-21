package p129w;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: w.a */
public abstract class C2871a implements Parcelable {
    public static final Parcelable.Creator<C2871a> CREATOR = new C2873b();

    /* renamed from: e */
    public static final C2871a f10961e = new C2872a();

    /* renamed from: d */
    private final Parcelable f10962d;

    /* renamed from: w.a$a */
    class C2872a extends C2871a {
        C2872a() {
            super((C2872a) null);
        }
    }

    /* renamed from: w.a$b */
    class C2873b implements Parcelable.ClassLoaderCreator<C2871a> {
        C2873b() {
        }

        /* renamed from: a */
        public C2871a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C2871a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C2871a.f10961e;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C2871a[] newArray(int i) {
            return new C2871a[i];
        }
    }

    private C2871a() {
        this.f10962d = null;
    }

    protected C2871a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10962d = readParcelable == null ? f10961e : readParcelable;
    }

    protected C2871a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10962d = parcelable == f10961e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C2871a(C2872a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable mo10153a() {
        return this.f10962d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10962d, i);
    }
}
