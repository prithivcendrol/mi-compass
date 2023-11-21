package p082n0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: n0.a */
public interface C2411a extends IInterface {

    /* renamed from: n0.a$a */
    public static abstract class C2412a extends Binder implements C2411a {

        /* renamed from: n0.a$a$a */
        private static class C2413a implements C2411a {

            /* renamed from: a */
            private IBinder f9418a;

            C2413a(IBinder iBinder) {
                this.f9418a = iBinder;
            }

            public IBinder asBinder() {
                return this.f9418a;
            }

            /* renamed from: k */
            public void mo9312k(String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.miui.analytics.ITrack");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f9418a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: x */
        public static C2411a m10267x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.miui.analytics.ITrack");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2411a)) ? new C2413a(iBinder) : (C2411a) queryLocalInterface;
        }
    }

    /* renamed from: k */
    void mo9312k(String str, String str2, String str3, String str4);
}
