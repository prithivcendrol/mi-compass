package p011b1;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b1.h */
public class C1307h implements C1308i {

    /* renamed from: a */
    private IBinder f4494a;

    public C1307h(IBinder iBinder) {
        this.f4494a = iBinder;
    }

    public IBinder asBinder() {
        return this.f4494a;
    }

    /* renamed from: l */
    public String mo5131l() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f4494a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            str = null;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }
}
