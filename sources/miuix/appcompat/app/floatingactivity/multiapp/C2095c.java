package miuix.appcompat.app.floatingactivity.multiapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import miuix.appcompat.app.C2118q;
import miuix.appcompat.app.floatingactivity.C2083a;
import miuix.appcompat.app.floatingactivity.multiapp.C2090a;
import miuix.appcompat.app.floatingactivity.multiapp.C2093b;
import p018c2.C1346b;
import p030e2.C1536e;
import p030e2.C1538g;
import p030e2.C1541j;
import p042g2.C1606a;
import p042g2.C1607b;

/* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c */
public final class C2095c {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static C2095c f7699k;

    /* renamed from: l */
    private static String[] f7700l;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f7701a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SparseArray<ArrayList<C2098c>> f7702b = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f7703c = true;

    /* renamed from: d */
    private C2090a f7704d;

    /* renamed from: e */
    private long f7705e;

    /* renamed from: f */
    private long f7706f;

    /* renamed from: g */
    private long f7707g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public WeakReference<View> f7708h;

    /* renamed from: i */
    private boolean f7709i;

    /* renamed from: j */
    private final ServiceConnection f7710j = new C2096a();

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$a */
    class C2096a implements ServiceConnection {
        C2096a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("MFloatingSwitcher", "onServiceConnected");
            if (C2095c.f7699k != null) {
                C2095c.f7699k.m8431a0(C2090a.C2091a.m8409x(iBinder));
                C2095c.this.m8454s();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("MFloatingSwitcher", "onServiceDisconnected");
            if (C2095c.f7699k != null) {
                C2095c.f7699k.m8440f0();
                C2095c.this.mo7496t();
                C2095c.this.mo7497w();
            }
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$b */
    class C2097b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2098c f7712d;

        C2097b(C2098c cVar) {
            this.f7712d = cVar;
        }

        public void run() {
            String valueOf = String.valueOf(this.f7712d.f7716f.hashCode());
            Bundle bundle = new Bundle();
            bundle.putInt("key_task_id", this.f7712d.f7721k);
            bundle.putString("execute_slide", valueOf);
            Bundle unused = C2095c.this.m8426T(10, bundle);
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$c */
    static class C2098c implements Parcelable {
        public static final Parcelable.Creator<C2098c> CREATOR = new C2099a();

        /* renamed from: d */
        int f7714d;

        /* renamed from: e */
        boolean f7715e;

        /* renamed from: f */
        C2102f f7716f;

        /* renamed from: g */
        int f7717g;

        /* renamed from: h */
        boolean f7718h;

        /* renamed from: i */
        List<Runnable> f7719i;

        /* renamed from: j */
        C2118q f7720j;

        /* renamed from: k */
        int f7721k;

        /* renamed from: l */
        String f7722l;

        /* renamed from: m */
        boolean f7723m;

        /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$c$a */
        class C2099a implements Parcelable.Creator<C2098c> {
            C2099a() {
            }

            /* renamed from: a */
            public C2098c createFromParcel(Parcel parcel) {
                return new C2098c(parcel);
            }

            /* renamed from: b */
            public C2098c[] newArray(int i) {
                return new C2098c[i];
            }
        }

        protected C2098c(Parcel parcel) {
            this.f7714d = -1;
            boolean z = false;
            this.f7718h = false;
            this.f7723m = false;
            this.f7714d = parcel.readInt();
            this.f7721k = parcel.readInt();
            this.f7722l = parcel.readString();
            this.f7715e = parcel.readByte() != 0;
            this.f7717g = parcel.readInt();
            this.f7718h = parcel.readByte() != 0;
            this.f7723m = parcel.readByte() != 0 ? true : z;
            this.f7719i = new LinkedList();
        }

        protected C2098c(boolean z) {
            this.f7714d = -1;
            this.f7718h = false;
            this.f7723m = false;
            this.f7715e = z;
            this.f7719i = new LinkedList();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "{ index : " + this.f7714d + "; taskId : " + this.f7721k + "; taskId : " + this.f7721k + "; identity : " + this.f7722l + "; serviceNotifyIndex : " + this.f7717g + "; register : " + this.f7718h + "; isOpenEnterAnimExecuted : " + this.f7723m + "; }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7714d);
            parcel.writeInt(this.f7721k);
            parcel.writeString(this.f7722l);
            parcel.writeByte(this.f7715e ? (byte) 1 : 0);
            parcel.writeInt(this.f7717g);
            parcel.writeByte(this.f7718h ? (byte) 1 : 0);
            parcel.writeByte(this.f7723m ? (byte) 1 : 0);
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$d */
    class C2100d implements C1538g {

        /* renamed from: a */
        protected String f7724a;

        /* renamed from: b */
        protected int f7725b;

        public C2100d(C2118q qVar) {
            this.f7724a = qVar.mo7560E0();
            this.f7725b = qVar.getTaskId();
        }

        /* renamed from: j */
        private boolean m8478j(int i) {
            return !C2095c.this.f7703c && (i == 1 || i == 2);
        }

        /* renamed from: a */
        public void mo5651a() {
            Bundle unused = C2095c.this.m8425S(11);
        }

        /* renamed from: b */
        public void mo5652b() {
            Bundle unused = C2095c.this.m8425S(5);
        }

        /* renamed from: c */
        public boolean mo5653c() {
            return mo7511l() == 1;
        }

        /* renamed from: d */
        public boolean mo5654d() {
            ArrayList arrayList = (ArrayList) C2095c.this.f7702b.get(mo7510k());
            if (arrayList == null) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                C2098c cVar = (C2098c) arrayList.get(i);
                if (cVar.f7714d == 0) {
                    return !cVar.f7723m;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo5655e(C2118q qVar) {
            if (qVar != null) {
                try {
                    C2095c B = C2095c.m8415B();
                    if (B != null) {
                        B.mo7492Z(C1541j.m6656f(qVar.mo7563G0()), qVar.getTaskId(), qVar.mo7560E0());
                    }
                } catch (Exception e) {
                    Log.d("MFloatingSwitcher", "saveBitmap exception", e);
                }
            }
        }

        /* renamed from: f */
        public void mo5656f() {
            Bundle unused = C2095c.this.m8425S(2);
        }

        /* renamed from: g */
        public void mo5657g() {
            Bundle unused = C2095c.this.m8425S(1);
        }

        /* renamed from: h */
        public boolean mo5650h(int i) {
            if (!m8478j(i) && C2095c.this.m8434c0(i, mo7510k())) {
                Bundle unused = C2095c.this.m8425S(5);
            }
            return false;
        }

        /* renamed from: i */
        public void mo5658i(C2118q qVar) {
            C2095c.this.mo7488Q(qVar.getTaskId(), qVar.mo7560E0());
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public int mo7510k() {
            return this.f7725b;
        }

        /* renamed from: l */
        public int mo7511l() {
            return Math.max(C2095c.this.mo7484D(mo7510k()), C2095c.this.mo7499z(mo7510k()));
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$e */
    static class C2101e implements Runnable {

        /* renamed from: d */
        private WeakReference<C2118q> f7727d = null;

        public C2101e(C2118q qVar) {
            this.f7727d = new WeakReference<>(qVar);
        }

        public void run() {
            C2118q qVar = this.f7727d.get();
            if (qVar != null) {
                qVar.mo5647F();
            }
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.c$f */
    class C2102f extends C2093b.C2094a {

        /* renamed from: a */
        protected String f7728a;

        /* renamed from: b */
        protected int f7729b;

        public C2102f(C2118q qVar) {
            this.f7728a = qVar.mo7560E0();
            this.f7729b = qVar.getTaskId();
        }

        /* renamed from: x */
        private C2118q m8490x() {
            C2095c B = C2095c.m8415B();
            if (B != null) {
                return B.mo7498x(mo7515z(), mo7514y());
            }
            return null;
        }

        /* renamed from: A */
        public void mo7513A(C2118q qVar) {
            this.f7728a = qVar.mo7560E0();
            this.f7729b = qVar.getTaskId();
        }

        /* renamed from: r */
        public Bundle mo7479r(int i, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    C2095c.f7699k.m8427U();
                } else if (i != 3) {
                    if (i != 5) {
                        switch (i) {
                            case 8:
                                C2118q x = m8490x();
                                if (!(bundle == null || x == null)) {
                                    View G0 = x.mo7563G0();
                                    C2095c.this.mo7493b0(C1541j.m6655e(G0, C1536e.m6636a(bundle)));
                                    if (!(C2095c.this.f7708h == null || C2095c.this.f7708h.get() == null)) {
                                        ((ViewGroup) G0.getParent()).getOverlay().add((View) C2095c.this.f7708h.get());
                                        break;
                                    }
                                }
                            case 9:
                                C2118q x2 = m8490x();
                                if (x2 == null || !x2.isFinishing()) {
                                    z = false;
                                }
                                bundle2.putBoolean("check_finishing", z);
                                break;
                            case 10:
                                C2118q x3 = m8490x();
                                if (x3 != null) {
                                    C2095c.this.f7701a.postDelayed(new C2101e(x3), 160);
                                    break;
                                }
                                break;
                            case 11:
                                C2095c.f7699k.m8456v();
                                break;
                        }
                    }
                } else {
                    C2095c.f7699k.m8455u();
                    C2118q x4 = m8490x();
                    if (x4 != null) {
                        C2095c.f7699k.m8442g0(x4);
                    }
                }
                return bundle2;
            }
            C2095c.f7699k.m8416E();
            return bundle2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public String mo7514y() {
            return this.f7728a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public int mo7515z() {
            return this.f7729b;
        }
    }

    private C2095c() {
    }

    /* renamed from: B */
    static C2095c m8415B() {
        return f7699k;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m8416E() {
        C2118q qVar;
        if (!m8422M(this.f7706f)) {
            this.f7706f = System.currentTimeMillis();
            for (int i = 0; i < this.f7702b.size(); i++) {
                Iterator it = this.f7702b.valueAt(i).iterator();
                while (it.hasNext()) {
                    C2098c cVar = (C2098c) it.next();
                    if (!cVar.f7715e && (qVar = cVar.f7720j) != null) {
                        qVar.runOnUiThread(new C1606a(qVar));
                    }
                }
            }
        }
    }

    /* renamed from: F */
    private void m8417F(int i) {
        ArrayList arrayList = this.f7702b.get(i);
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int i3 = ((C2098c) arrayList.get(i2)).f7714d;
                C2118q qVar = ((C2098c) arrayList.get(i2)).f7720j;
                if (!(qVar == null || i3 == 0)) {
                    qVar.mo7568K0();
                }
            }
        }
    }

    /* renamed from: G */
    private void m8418G(C2118q qVar, Intent intent, Bundle bundle) {
        m8436d0(qVar, intent, bundle);
        m8429X(qVar);
        qVar.mo252c().mo3790a(new MultiAppFloatingLifecycleObserver(qVar));
        qVar.mo7574Q0(this.f7703c);
        qVar.mo7576S0(new C2100d(qVar));
    }

    /* renamed from: H */
    public static void m8419H(C2118q qVar, Intent intent, Bundle bundle) {
        if (!m8423N(intent)) {
            C2083a.m8363w(qVar, bundle);
            return;
        }
        if (f7699k == null) {
            f7699k = new C2095c();
            if (f7700l == null) {
                f7700l = qVar.getResources().getStringArray(C1346b.f4532a);
            }
            f7699k.m8453q(qVar, intent);
        }
        f7699k.m8418G(qVar, intent, bundle);
    }

    /* renamed from: I */
    private void m8420I(C2098c cVar) {
        C2090a aVar;
        if (cVar != null && (aVar = this.f7704d) != null) {
            try {
                C2102f fVar = cVar.f7716f;
                aVar.mo7474g(fVar, mo7482A(fVar, cVar.f7721k));
                m8445i0(mo7482A(cVar.f7716f, cVar.f7721k), cVar.f7714d);
                if (!cVar.f7718h) {
                    cVar.f7718h = true;
                    cVar.f7717g = cVar.f7714d;
                }
                for (Runnable run : cVar.f7719i) {
                    run.run();
                }
                cVar.f7719i.clear();
            } catch (RemoteException e) {
                Log.w("MFloatingSwitcher", "catch register service notify exception", e);
            }
        }
    }

    /* renamed from: L */
    private boolean m8421L(C2118q qVar) {
        return (qVar == null || m8457y(qVar.getTaskId(), qVar.mo7560E0()) == null) ? false : true;
    }

    /* renamed from: M */
    private boolean m8422M(long j) {
        return System.currentTimeMillis() - j <= 100;
    }

    /* renamed from: N */
    public static boolean m8423N(Intent intent) {
        return !TextUtils.isEmpty(intent.getStringExtra("floating_service_pkg")) && !TextUtils.isEmpty(intent.getStringExtra("floating_service_path"));
    }

    /* renamed from: O */
    private boolean m8424O(String str) {
        for (String equals : f7700l) {
            if (equals.equals(str)) {
                return true;
            }
        }
        Log.w("MFloatingSwitcher", "Package is not allowed:" + str + ". Please contact the MIUIX developer!");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public Bundle m8425S(int i) {
        return m8426T(i, (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public Bundle m8426T(int i, Bundle bundle) {
        C2090a aVar = this.f7704d;
        if (aVar != null) {
            try {
                return aVar.mo7477q(i, bundle);
            } catch (RemoteException e) {
                Log.w("MFloatingSwitcher", "catch call service method exception", e);
                return null;
            }
        } else {
            Log.d("MFloatingSwitcher", "ifloatingservice is null");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m8427U() {
        C2118q qVar;
        if (!m8422M(this.f7707g)) {
            this.f7707g = System.currentTimeMillis();
            for (int i = 0; i < this.f7702b.size(); i++) {
                Iterator it = this.f7702b.valueAt(i).iterator();
                while (it.hasNext()) {
                    C2098c cVar = (C2098c) it.next();
                    if (!cVar.f7715e && (qVar = cVar.f7720j) != null) {
                        qVar.runOnUiThread(new C1607b(qVar));
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public static void m8428V(int i, String str, Bundle bundle) {
        C2098c y;
        C2095c B = m8415B();
        if (B != null && (y = B.m8457y(i, str)) != null) {
            bundle.putParcelable("floating_switcher_saved_key", y);
        }
    }

    /* renamed from: X */
    private void m8429X(C2118q qVar) {
        C2098c y = m8457y(qVar.getTaskId(), qVar.mo7560E0());
        if (y != null && y.f7716f == null) {
            y.f7716f = new C2102f(qVar);
        } else if (y != null) {
            y.f7716f.mo7513A(qVar);
        }
        m8420I(y);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m8431a0(C2090a aVar) {
        this.f7704d = aVar;
        this.f7709i = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public boolean m8434c0(int i, int i2) {
        return !(i == 4 || i == 3) || mo7484D(i2) <= 1;
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8436d0(miuix.appcompat.app.C2118q r6, android.content.Intent r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = r5.m8421L(r6)
            if (r0 != 0) goto L_0x0070
            r0 = 0
            if (r8 == 0) goto L_0x0012
            java.lang.String r0 = "floating_switcher_saved_key"
            android.os.Parcelable r8 = r8.getParcelable(r0)
            r0 = r8
            miuix.appcompat.app.floatingactivity.multiapp.c$c r0 = (miuix.appcompat.app.floatingactivity.multiapp.C2095c.C2098c) r0
        L_0x0012:
            r8 = 0
            r1 = 1
            if (r0 != 0) goto L_0x0029
            miuix.appcompat.app.floatingactivity.multiapp.c$c r0 = new miuix.appcompat.app.floatingactivity.multiapp.c$c
            r0.<init>((boolean) r1)
            if (r7 != 0) goto L_0x0021
            android.content.Intent r7 = r6.getIntent()
        L_0x0021:
            java.lang.String r2 = "service_page_index"
            int r7 = r7.getIntExtra(r2, r8)
            r0.f7714d = r7
        L_0x0029:
            r0.f7720j = r6
            int r7 = r6.getTaskId()
            r0.f7721k = r7
            java.lang.String r7 = r6.mo7560E0()
            r0.f7722l = r7
            android.util.SparseArray<java.util.ArrayList<miuix.appcompat.app.floatingactivity.multiapp.c$c>> r7 = r5.f7702b
            int r2 = r0.f7721k
            java.lang.Object r7 = r7.get(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 != 0) goto L_0x004f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.util.SparseArray<java.util.ArrayList<miuix.appcompat.app.floatingactivity.multiapp.c$c>> r2 = r5.f7702b
            int r3 = r0.f7721k
            r2.put(r3, r7)
        L_0x004f:
            int r2 = r0.f7714d
            int r3 = r7.size()
            int r3 = r3 - r1
        L_0x0056:
            if (r3 < 0) goto L_0x0068
            java.lang.Object r4 = r7.get(r3)
            miuix.appcompat.app.floatingactivity.multiapp.c$c r4 = (miuix.appcompat.app.floatingactivity.multiapp.C2095c.C2098c) r4
            int r4 = r4.f7714d
            if (r2 <= r4) goto L_0x0065
            int r8 = r3 + 1
            goto L_0x0068
        L_0x0065:
            int r3 = r3 + -1
            goto L_0x0056
        L_0x0068:
            r7.add(r8, r0)
            int r7 = r0.f7714d
            p030e2.C1531b.m6616g(r6, r7)
        L_0x0070:
            int r6 = r6.getTaskId()
            r5.m8417F(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.floatingactivity.multiapp.C2095c.m8436d0(miuix.appcompat.app.q, android.content.Intent, android.os.Bundle):void");
    }

    /* renamed from: e0 */
    private void m8438e0(int i, String str) {
        if (this.f7704d != null) {
            try {
                C2098c y = m8457y(i, str);
                if (y != null) {
                    C2090a aVar = this.f7704d;
                    C2102f fVar = y.f7716f;
                    aVar.mo7475o(fVar, String.valueOf(fVar.hashCode()));
                }
            } catch (RemoteException e) {
                Log.w("MFloatingSwitcher", "catch unregister service notify exception", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m8440f0() {
        for (int i = 0; i < this.f7702b.size(); i++) {
            Iterator it = this.f7702b.valueAt(i).iterator();
            while (it.hasNext()) {
                C2098c cVar = (C2098c) it.next();
                m8438e0(cVar.f7721k, cVar.f7722l);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m8442g0(Context context) {
        if (this.f7709i) {
            this.f7709i = false;
            context.getApplicationContext().unbindService(this.f7710j);
        }
    }

    /* renamed from: i0 */
    private void m8445i0(String str, int i) {
        C2090a aVar = this.f7704d;
        if (aVar != null) {
            try {
                aVar.mo7476p(str, i);
            } catch (RemoteException e) {
                Log.w("MFloatingSwitcher", "catch updateServerActivityIndex service notify exception", e);
            }
        }
    }

    /* renamed from: q */
    private void m8453q(Context context, Intent intent) {
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra("floating_service_pkg");
        if (m8424O(stringExtra)) {
            intent2.setPackage(stringExtra);
            String stringExtra2 = intent.getStringExtra("floating_service_path");
            if (!TextUtils.isEmpty(stringExtra2)) {
                intent2.setComponent(new ComponentName(stringExtra, stringExtra2));
                context.getApplicationContext().bindService(intent2, this.f7710j, 1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m8454s() {
        for (int i = 0; i < this.f7702b.size(); i++) {
            Iterator it = this.f7702b.valueAt(i).iterator();
            while (it.hasNext()) {
                C2098c cVar = (C2098c) it.next();
                if (!cVar.f7718h) {
                    m8420I(cVar);
                    mo7495r(cVar.f7721k, cVar.f7722l);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m8455u() {
        if (!m8422M(this.f7705e)) {
            this.f7705e = System.currentTimeMillis();
            for (int i = 0; i < this.f7702b.size(); i++) {
                ArrayList valueAt = this.f7702b.valueAt(i);
                for (int size = valueAt.size() - 1; size >= 0; size--) {
                    C2118q qVar = ((C2098c) valueAt.get(size)).f7720j;
                    int i2 = ((C2098c) valueAt.get(size)).f7714d;
                    int D = mo7484D(((C2098c) valueAt.get(size)).f7721k);
                    if (!(qVar == null || i2 == D - 1)) {
                        qVar.mo7573P0();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m8456v() {
        if (!m8422M(this.f7705e)) {
            this.f7705e = System.currentTimeMillis();
            for (int i = 0; i < this.f7702b.size(); i++) {
                ArrayList valueAt = this.f7702b.valueAt(i);
                for (int size = valueAt.size() - 1; size >= 0; size--) {
                    C2118q qVar = ((C2098c) valueAt.get(size)).f7720j;
                    int i2 = ((C2098c) valueAt.get(size)).f7714d;
                    int D = mo7484D(((C2098c) valueAt.get(size)).f7721k);
                    if (!(qVar == null || i2 == D - 1)) {
                        qVar.mo7573P0();
                    }
                }
            }
        }
    }

    /* renamed from: y */
    private C2098c m8457y(int i, String str) {
        ArrayList arrayList = this.f7702b.get(i);
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2098c cVar = (C2098c) it.next();
            if (TextUtils.equals(cVar.f7722l, str)) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public String mo7482A(Object obj, int i) {
        return obj.hashCode() + ":" + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public View mo7483C() {
        WeakReference<View> weakReference = this.f7708h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo7484D(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_task_id", i);
        Bundle T = m8426T(6, bundle);
        int i2 = T != null ? T.getInt(String.valueOf(6)) : 0;
        ArrayList arrayList = this.f7702b.get(i);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = ((C2098c) it.next()).f7714d;
                if (i3 + 1 > i2) {
                    i2 = i3 + 1;
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo7485J(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_request_identity", String.valueOf(y.f7716f.hashCode()));
        bundle.putInt("key_task_id", i);
        Bundle T = m8426T(9, bundle);
        return T != null && T.getBoolean("check_finishing");
    }

    /* renamed from: K */
    public boolean mo7486K(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y != null) {
            return y.f7723m;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo7487P() {
        return this.f7704d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo7488Q(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y != null) {
            y.f7723m = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo7489R(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y != null) {
            C2097b bVar = new C2097b(y);
            if (mo7487P()) {
                bVar.run();
            } else {
                y.f7719i.add(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo7490W(int i, String str, Runnable runnable) {
        if (!mo7486K(i, str)) {
            if (mo7499z(i) > 1 || mo7484D(i) > 1) {
                mo7488Q(i, str);
            }
            if (mo7487P()) {
                runnable.run();
                return;
            }
            C2098c y = m8457y(i, str);
            if (y != null) {
                y.f7719i.add(runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo7491Y(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y != null && y.f7720j != null) {
            m8438e0(i, str);
            ArrayList arrayList = this.f7702b.get(i);
            if (arrayList != null) {
                arrayList.remove(y);
                if (arrayList.isEmpty()) {
                    this.f7702b.remove(i);
                }
            }
            if (this.f7702b.size() == 0) {
                m8442g0(y.f7720j);
                mo7496t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo7492Z(Bitmap bitmap, int i, String str) {
        C2098c y;
        if (bitmap != null && (y = m8457y(i, str)) != null) {
            int byteCount = bitmap.getByteCount();
            ByteBuffer allocate = ByteBuffer.allocate(byteCount);
            bitmap.copyPixelsToBuffer(allocate);
            C2090a aVar = this.f7704d;
            byte[] array = allocate.array();
            int width = bitmap.getWidth();
            C1536e.m6638c(aVar, array, byteCount, width, bitmap.getHeight(), String.valueOf(y.f7716f.hashCode()), i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo7493b0(View view) {
        this.f7708h = new WeakReference<>(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo7494h0(int i, String str, boolean z) {
        C2098c y = m8457y(i, str);
        if (y != null) {
            y.f7715e = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7495r(int i, String str) {
        C2098c y;
        C2118q qVar;
        ArrayList arrayList = this.f7702b.get(i);
        if (((arrayList != null && arrayList.size() > 1) || mo7484D(i) > 1) && (y = m8457y(i, str)) != null && y.f7717g > 0 && (qVar = y.f7720j) != null) {
            qVar.mo7568K0();
        }
    }

    /* renamed from: t */
    public void mo7496t() {
        this.f7702b.clear();
        this.f7708h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo7497w() {
        if (this.f7702b.size() == 0) {
            f7699k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C2118q mo7498x(int i, String str) {
        C2098c y = m8457y(i, str);
        if (y != null) {
            return y.f7720j;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo7499z(int i) {
        ArrayList arrayList = this.f7702b.get(i);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
