package p011b1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.f */
public interface C1303f extends IInterface {

    /* renamed from: b1.f$a */
    public static abstract class C1304a extends Binder implements C1303f {

        /* renamed from: b1.f$a$a */
        public static class C1305a implements C1303f {

            /* renamed from: a */
            public IBinder f4492a;

            public C1305a(IBinder iBinder) {
                this.f4492a = iBinder;
            }

            public IBinder asBinder() {
                return this.f4492a;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: x */
            public String mo5127x(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f4492a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain.recycle();
                    obtain2.recycle();
                    return readString;
                } catch (Exception e) {
                    e.printStackTrace();
                    obtain.recycle();
                    obtain2.recycle();
                    return null;
                } catch (Throwable th) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th;
                }
            }
        }

        /* renamed from: x */
        public static C1303f m5944x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1303f)) ? new C1305a(iBinder) : (C1303f) queryLocalInterface;
        }
    }
}
