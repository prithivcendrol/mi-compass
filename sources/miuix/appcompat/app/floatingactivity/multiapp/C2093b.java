package miuix.appcompat.app.floatingactivity.multiapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: miuix.appcompat.app.floatingactivity.multiapp.b */
public interface C2093b extends IInterface {

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.b$a */
    public static abstract class C2094a extends Binder implements C2093b {
        public C2094a() {
            attachInterface(this, "miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
                parcel2.writeBundle(mo7479r(parcel.readInt(), parcel.readBundle()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
                return true;
            }
        }
    }

    /* renamed from: r */
    Bundle mo7479r(int i, Bundle bundle);
}
