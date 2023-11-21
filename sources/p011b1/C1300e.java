package p011b1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.e */
public interface C1300e extends IInterface {

    /* renamed from: b1.e$a */
    public static abstract class C1301a extends Binder implements C1300e {

        /* renamed from: b1.e$a$a */
        public static class C1302a implements C1300e {

            /* renamed from: a */
            public IBinder f4491a;

            public C1302a(IBinder iBinder) {
                this.f4491a = iBinder;
            }

            public IBinder asBinder() {
                return this.f4491a;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: x */
            public String mo5125x(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f4491a.transact(1, obtain, obtain2, 0);
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
        public static C1300e m5942x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1300e)) ? new C1302a(iBinder) : (C1300e) queryLocalInterface;
        }
    }
}
