package p011b1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.b */
public final class C1297b implements IInterface {

    /* renamed from: a */
    private IBinder f4489a;

    public C1297b(IBinder iBinder) {
        this.f4489a = iBinder;
    }

    public IBinder asBinder() {
        return this.f4489a;
    }

    /* renamed from: b */
    public String mo5121b() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f4489a.transact(1, obtain, obtain2, 0);
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
