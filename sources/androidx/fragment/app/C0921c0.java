package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1035g;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c0 */
final class C0921c0 implements Parcelable {
    public static final Parcelable.Creator<C0921c0> CREATOR = new C0922a();

    /* renamed from: d */
    final String f3154d;

    /* renamed from: e */
    final String f3155e;

    /* renamed from: f */
    final boolean f3156f;

    /* renamed from: g */
    final int f3157g;

    /* renamed from: h */
    final int f3158h;

    /* renamed from: i */
    final String f3159i;

    /* renamed from: j */
    final boolean f3160j;

    /* renamed from: k */
    final boolean f3161k;

    /* renamed from: l */
    final boolean f3162l;

    /* renamed from: m */
    final Bundle f3163m;

    /* renamed from: n */
    final boolean f3164n;

    /* renamed from: o */
    final int f3165o;

    /* renamed from: p */
    Bundle f3166p;

    /* renamed from: androidx.fragment.app.c0$a */
    class C0922a implements Parcelable.Creator<C0921c0> {
        C0922a() {
        }

        /* renamed from: a */
        public C0921c0 createFromParcel(Parcel parcel) {
            return new C0921c0(parcel);
        }

        /* renamed from: b */
        public C0921c0[] newArray(int i) {
            return new C0921c0[i];
        }
    }

    C0921c0(Parcel parcel) {
        this.f3154d = parcel.readString();
        this.f3155e = parcel.readString();
        boolean z = true;
        this.f3156f = parcel.readInt() != 0;
        this.f3157g = parcel.readInt();
        this.f3158h = parcel.readInt();
        this.f3159i = parcel.readString();
        this.f3160j = parcel.readInt() != 0;
        this.f3161k = parcel.readInt() != 0;
        this.f3162l = parcel.readInt() != 0;
        this.f3163m = parcel.readBundle();
        this.f3164n = parcel.readInt() == 0 ? false : z;
        this.f3166p = parcel.readBundle();
        this.f3165o = parcel.readInt();
    }

    C0921c0(Fragment fragment) {
        this.f3154d = fragment.getClass().getName();
        this.f3155e = fragment.f3025i;
        this.f3156f = fragment.f3034r;
        this.f3157g = fragment.f2990A;
        this.f3158h = fragment.f2991B;
        this.f3159i = fragment.f2992C;
        this.f3160j = fragment.f2995F;
        this.f3161k = fragment.f3032p;
        this.f3162l = fragment.f2994E;
        this.f3163m = fragment.f3026j;
        this.f3164n = fragment.f2993D;
        this.f3165o = fragment.f3010U.ordinal();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo3460a(C0986o oVar, ClassLoader classLoader) {
        Fragment a = oVar.mo3412a(classLoader, this.f3154d);
        Bundle bundle = this.f3163m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3220J1(this.f3163m);
        a.f3025i = this.f3155e;
        a.f3034r = this.f3156f;
        a.f3036t = true;
        a.f2990A = this.f3157g;
        a.f2991B = this.f3158h;
        a.f2992C = this.f3159i;
        a.f2995F = this.f3160j;
        a.f3032p = this.f3161k;
        a.f2994E = this.f3162l;
        a.f2993D = this.f3164n;
        a.f3010U = C1035g.C1038c.values()[this.f3165o];
        Bundle bundle2 = this.f3166p;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a.f3021e = bundle2;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3154d);
        sb.append(" (");
        sb.append(this.f3155e);
        sb.append(")}:");
        if (this.f3156f) {
            sb.append(" fromLayout");
        }
        if (this.f3158h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3158h));
        }
        String str = this.f3159i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3159i);
        }
        if (this.f3160j) {
            sb.append(" retainInstance");
        }
        if (this.f3161k) {
            sb.append(" removing");
        }
        if (this.f3162l) {
            sb.append(" detached");
        }
        if (this.f3164n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3154d);
        parcel.writeString(this.f3155e);
        parcel.writeInt(this.f3156f ? 1 : 0);
        parcel.writeInt(this.f3157g);
        parcel.writeInt(this.f3158h);
        parcel.writeString(this.f3159i);
        parcel.writeInt(this.f3160j ? 1 : 0);
        parcel.writeInt(this.f3161k ? 1 : 0);
        parcel.writeInt(this.f3162l ? 1 : 0);
        parcel.writeBundle(this.f3163m);
        parcel.writeInt(this.f3164n ? 1 : 0);
        parcel.writeBundle(this.f3166p);
        parcel.writeInt(this.f3165o);
    }
}
