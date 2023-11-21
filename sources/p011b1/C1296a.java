package p011b1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.a */
public final class C1296a implements IInterface {

    /* renamed from: a */
    private IBinder f4488a;

    public C1296a(IBinder iBinder) {
        this.f4488a = iBinder;
    }

    public IBinder asBinder() {
        return this.f4488a;
    }

    /* renamed from: b */
    public String mo5119b() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            this.f4488a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            th.printStackTrace();
            str = null;
        }
        obtain.recycle();
        obtain2.recycle();
        return str;
    }
}
