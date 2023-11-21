package android.support.p007v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface C0060b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0061a extends Binder implements C0060b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0062a implements C0060b {

            /* renamed from: a */
            private IBinder f170a;

            C0062a(IBinder iBinder) {
                this.f170a = iBinder;
            }

            public IBinder asBinder() {
                return this.f170a;
            }

            /* renamed from: h */
            public void mo174h(C0058a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f170a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: x */
        public static C0060b m152x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0060b)) ? new C0062a(iBinder) : (C0060b) queryLocalInterface;
        }
    }

    /* renamed from: h */
    void mo174h(C0058a aVar);
}
