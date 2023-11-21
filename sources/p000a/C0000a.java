package p000a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.a */
public interface C0000a extends IInterface {

    /* renamed from: a.a$a */
    public static abstract class C0001a extends Binder implements C0000a {

        /* renamed from: a.a$a$a */
        private static class C0002a implements C0000a {

            /* renamed from: a */
            private IBinder f0a;

            C0002a(IBinder iBinder) {
                this.f0a = iBinder;
            }

            public IBinder asBinder() {
                return this.f0a;
            }
        }

        public C0001a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: x */
        public static C0000a m1x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0000a)) ? new C0002a(iBinder) : (C0000a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo1v(parcel.readInt(), (Bundle) C0003b.m3b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: a.a$b */
    public static class C0003b {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static <T> T m3b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: v */
    void mo1v(int i, Bundle bundle);
}
