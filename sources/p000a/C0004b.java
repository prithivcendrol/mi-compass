package p000a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0000a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.b */
public class C0004b implements Parcelable {
    public static final Parcelable.Creator<C0004b> CREATOR = new C0005a();

    /* renamed from: d */
    final boolean f1d = false;

    /* renamed from: e */
    final Handler f2e = null;

    /* renamed from: f */
    C0000a f3f;

    /* renamed from: a.b$a */
    class C0005a implements Parcelable.Creator<C0004b> {
        C0005a() {
        }

        /* renamed from: a */
        public C0004b createFromParcel(Parcel parcel) {
            return new C0004b(parcel);
        }

        /* renamed from: b */
        public C0004b[] newArray(int i) {
            return new C0004b[i];
        }
    }

    /* renamed from: a.b$b */
    class C0006b extends C0000a.C0001a {
        C0006b() {
        }

        /* renamed from: v */
        public void mo1v(int i, Bundle bundle) {
            C0004b bVar = C0004b.this;
            Handler handler = bVar.f2e;
            if (handler != null) {
                handler.post(new C0007c(i, bundle));
            } else {
                bVar.mo5a(i, bundle);
            }
        }
    }

    /* renamed from: a.b$c */
    class C0007c implements Runnable {

        /* renamed from: d */
        final int f5d;

        /* renamed from: e */
        final Bundle f6e;

        C0007c(int i, Bundle bundle) {
            this.f5d = i;
            this.f6e = bundle;
        }

        public void run() {
            C0004b.this.mo5a(this.f5d, this.f6e);
        }
    }

    C0004b(Parcel parcel) {
        this.f3f = C0000a.C0001a.m1x(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3f == null) {
                this.f3f = new C0006b();
            }
            parcel.writeStrongBinder(this.f3f.asBinder());
        }
    }
}
