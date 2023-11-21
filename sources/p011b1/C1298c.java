package p011b1;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b1.c */
public class C1298c implements C1299d {

    /* renamed from: a */
    private IBinder f4490a;

    public C1298c(IBinder iBinder) {
        this.f4490a = iBinder;
    }

    public IBinder asBinder() {
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public String mo5123b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            this.f4490a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Exception e) {
            e.printStackTrace();
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
