package miuix.appcompat.app.floatingactivity.multiapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: miuix.appcompat.app.floatingactivity.multiapp.a */
public interface C2090a extends IInterface {

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.a$a */
    public static abstract class C2091a extends Binder implements C2090a {

        /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.a$a$a */
        private static class C2092a implements C2090a {

            /* renamed from: a */
            private final IBinder f7698a;

            C2092a(IBinder iBinder) {
                this.f7698a = iBinder;
            }

            public IBinder asBinder() {
                return this.f7698a;
            }

            /* renamed from: g */
            public int mo7474g(C2093b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    obtain.writeStrongBinder(bVar == null ? null : bVar.asBinder());
                    obtain.writeString(str);
                    this.f7698a.transact(3, obtain, obtain2, 0);
                    int readInt = obtain2.readInt();
                    obtain2.readException();
                    return readInt;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }

            /* renamed from: o */
            public void mo7475o(C2093b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    obtain.writeStrongBinder(bVar == null ? null : bVar.asBinder());
                    obtain.writeString(str);
                    this.f7698a.transact(4, obtain, obtain2, 0);
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }

            /* renamed from: p */
            public void mo7476p(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f7698a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }

            /* renamed from: q */
            public Bundle mo7477q(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    obtain.writeInt(i);
                    obtain.writeBundle(bundle);
                    this.f7698a.transact(2, obtain, obtain2, 0);
                    Bundle readBundle = obtain2.readBundle(getClass().getClassLoader());
                    obtain2.readException();
                    return readBundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: x */
        public static C2090a m8409x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            return iBinder.queryLocalInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService") instanceof C2090a ? (C2090a) iBinder : new C2092a(iBinder);
        }
    }

    /* renamed from: g */
    int mo7474g(C2093b bVar, String str);

    /* renamed from: o */
    void mo7475o(C2093b bVar, String str);

    /* renamed from: p */
    void mo7476p(String str, int i);

    /* renamed from: q */
    Bundle mo7477q(int i, Bundle bundle);
}
