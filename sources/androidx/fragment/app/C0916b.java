package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0949f0;
import androidx.lifecycle.C1035g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0916b implements Parcelable {
    public static final Parcelable.Creator<C0916b> CREATOR = new C0917a();

    /* renamed from: d */
    final int[] f3138d;

    /* renamed from: e */
    final ArrayList<String> f3139e;

    /* renamed from: f */
    final int[] f3140f;

    /* renamed from: g */
    final int[] f3141g;

    /* renamed from: h */
    final int f3142h;

    /* renamed from: i */
    final String f3143i;

    /* renamed from: j */
    final int f3144j;

    /* renamed from: k */
    final int f3145k;

    /* renamed from: l */
    final CharSequence f3146l;

    /* renamed from: m */
    final int f3147m;

    /* renamed from: n */
    final CharSequence f3148n;

    /* renamed from: o */
    final ArrayList<String> f3149o;

    /* renamed from: p */
    final ArrayList<String> f3150p;

    /* renamed from: q */
    final boolean f3151q;

    /* renamed from: androidx.fragment.app.b$a */
    class C0917a implements Parcelable.Creator<C0916b> {
        C0917a() {
        }

        /* renamed from: a */
        public C0916b createFromParcel(Parcel parcel) {
            return new C0916b(parcel);
        }

        /* renamed from: b */
        public C0916b[] newArray(int i) {
            return new C0916b[i];
        }
    }

    C0916b(Parcel parcel) {
        this.f3138d = parcel.createIntArray();
        this.f3139e = parcel.createStringArrayList();
        this.f3140f = parcel.createIntArray();
        this.f3141g = parcel.createIntArray();
        this.f3142h = parcel.readInt();
        this.f3143i = parcel.readString();
        this.f3144j = parcel.readInt();
        this.f3145k = parcel.readInt();
        this.f3146l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3147m = parcel.readInt();
        this.f3148n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3149o = parcel.createStringArrayList();
        this.f3150p = parcel.createStringArrayList();
        this.f3151q = parcel.readInt() != 0;
    }

    C0916b(C0914a aVar) {
        int size = aVar.f3250c.size();
        this.f3138d = new int[(size * 6)];
        if (aVar.f3256i) {
            this.f3139e = new ArrayList<>(size);
            this.f3140f = new int[size];
            this.f3141g = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0949f0.C0950a aVar2 = aVar.f3250c.get(i);
                int i3 = i2 + 1;
                this.f3138d[i2] = aVar2.f3267a;
                ArrayList<String> arrayList = this.f3139e;
                Fragment fragment = aVar2.f3268b;
                arrayList.add(fragment != null ? fragment.f3025i : null);
                int[] iArr = this.f3138d;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3269c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3270d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3271e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3272f;
                iArr[i7] = aVar2.f3273g;
                this.f3140f[i] = aVar2.f3274h.ordinal();
                this.f3141g[i] = aVar2.f3275i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f3142h = aVar.f3255h;
            this.f3143i = aVar.f3258k;
            this.f3144j = aVar.f3136v;
            this.f3145k = aVar.f3259l;
            this.f3146l = aVar.f3260m;
            this.f3147m = aVar.f3261n;
            this.f3148n = aVar.f3262o;
            this.f3149o = aVar.f3263p;
            this.f3150p = aVar.f3264q;
            this.f3151q = aVar.f3265r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    private void m3812a(C0914a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f3138d.length) {
                C0949f0.C0950a aVar2 = new C0949f0.C0950a();
                int i3 = i + 1;
                aVar2.f3267a = this.f3138d[i];
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3138d[i3]);
                }
                aVar2.f3274h = C1035g.C1038c.values()[this.f3140f[i2]];
                aVar2.f3275i = C1035g.C1038c.values()[this.f3141g[i2]];
                int[] iArr = this.f3138d;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.f3269c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                aVar2.f3270d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                aVar2.f3271e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                aVar2.f3272f = i10;
                int i11 = iArr[i9];
                aVar2.f3273g = i11;
                aVar.f3251d = i6;
                aVar.f3252e = i8;
                aVar.f3253f = i10;
                aVar.f3254g = i11;
                aVar.mo3560e(aVar2);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f3255h = this.f3142h;
                aVar.f3258k = this.f3143i;
                aVar.f3256i = true;
                aVar.f3259l = this.f3145k;
                aVar.f3260m = this.f3146l;
                aVar.f3261n = this.f3147m;
                aVar.f3262o = this.f3148n;
                aVar.f3263p = this.f3149o;
                aVar.f3264q = this.f3150p;
                aVar.f3265r = this.f3151q;
                return;
            }
        }
    }

    /* renamed from: b */
    public C0914a mo3446b(FragmentManager fragmentManager) {
        C0914a aVar = new C0914a(fragmentManager);
        m3812a(aVar);
        aVar.f3136v = this.f3144j;
        for (int i = 0; i < this.f3139e.size(); i++) {
            String str = this.f3139e.get(i);
            if (str != null) {
                aVar.f3250c.get(i).f3268b = fragmentManager.mo3376f0(str);
            }
        }
        aVar.mo3436r(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3138d);
        parcel.writeStringList(this.f3139e);
        parcel.writeIntArray(this.f3140f);
        parcel.writeIntArray(this.f3141g);
        parcel.writeInt(this.f3142h);
        parcel.writeString(this.f3143i);
        parcel.writeInt(this.f3144j);
        parcel.writeInt(this.f3145k);
        TextUtils.writeToParcel(this.f3146l, parcel, 0);
        parcel.writeInt(this.f3147m);
        TextUtils.writeToParcel(this.f3148n, parcel, 0);
        parcel.writeStringList(this.f3149o);
        parcel.writeStringList(this.f3150p);
        parcel.writeInt(this.f3151q ? 1 : 0);
    }
}
