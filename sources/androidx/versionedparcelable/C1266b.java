package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p063k.C1761a;

/* renamed from: androidx.versionedparcelable.b */
class C1266b extends C1265a {

    /* renamed from: d */
    private final SparseIntArray f4384d;

    /* renamed from: e */
    private final Parcel f4385e;

    /* renamed from: f */
    private final int f4386f;

    /* renamed from: g */
    private final int f4387g;

    /* renamed from: h */
    private final String f4388h;

    /* renamed from: i */
    private int f4389i;

    /* renamed from: j */
    private int f4390j;

    /* renamed from: k */
    private int f4391k;

    C1266b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1761a(), new C1761a(), new C1761a());
    }

    private C1266b(Parcel parcel, int i, int i2, String str, C1761a<String, Method> aVar, C1761a<String, Method> aVar2, C1761a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4384d = new SparseIntArray();
        this.f4389i = -1;
        this.f4391k = -1;
        this.f4385e = parcel;
        this.f4386f = i;
        this.f4387g = i2;
        this.f4390j = i;
        this.f4388h = str;
    }

    /* renamed from: A */
    public void mo5001A(byte[] bArr) {
        if (bArr != null) {
            this.f4385e.writeInt(bArr.length);
            this.f4385e.writeByteArray(bArr);
            return;
        }
        this.f4385e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5003C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4385e, 0);
    }

    /* renamed from: E */
    public void mo5005E(int i) {
        this.f4385e.writeInt(i);
    }

    /* renamed from: G */
    public void mo5007G(Parcelable parcelable) {
        this.f4385e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo5009I(String str) {
        this.f4385e.writeString(str);
    }

    /* renamed from: a */
    public void mo5014a() {
        int i = this.f4389i;
        if (i >= 0) {
            int i2 = this.f4384d.get(i);
            int dataPosition = this.f4385e.dataPosition();
            this.f4385e.setDataPosition(i2);
            this.f4385e.writeInt(dataPosition - i2);
            this.f4385e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1265a mo5015b() {
        Parcel parcel = this.f4385e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4390j;
        if (i == this.f4386f) {
            i = this.f4387g;
        }
        int i2 = i;
        return new C1266b(parcel, dataPosition, i2, this.f4388h + "  ", this.f4381a, this.f4382b, this.f4383c);
    }

    /* renamed from: g */
    public boolean mo5017g() {
        return this.f4385e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo5019i() {
        int readInt = this.f4385e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4385e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo5021k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4385e);
    }

    /* renamed from: m */
    public boolean mo5023m(int i) {
        while (this.f4390j < this.f4387g) {
            int i2 = this.f4391k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4385e.setDataPosition(this.f4390j);
            int readInt = this.f4385e.readInt();
            this.f4391k = this.f4385e.readInt();
            this.f4390j += readInt;
        }
        return this.f4391k == i;
    }

    /* renamed from: o */
    public int mo5025o() {
        return this.f4385e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo5027q() {
        return this.f4385e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo5029s() {
        return this.f4385e.readString();
    }

    /* renamed from: w */
    public void mo5033w(int i) {
        mo5014a();
        this.f4389i = i;
        this.f4384d.put(i, this.f4385e.dataPosition());
        mo5005E(0);
        mo5005E(i);
    }

    /* renamed from: y */
    public void mo5035y(boolean z) {
        this.f4385e.writeInt(z ? 1 : 0);
    }
}
