package p011b1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.g */
public class C1306g implements IInterface {

    /* renamed from: a */
    private IBinder f4493a;

    public C1306g(IBinder iBinder) {
        this.f4493a = iBinder;
    }

    public IBinder asBinder() {
        return this.f4493a;
    }

    /* renamed from: b */
    public String mo5129b() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
            this.f4493a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            th.printStackTrace();
            str = null;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }
}
