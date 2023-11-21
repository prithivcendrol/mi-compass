package miuix.appcompat.app.floatingactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import miuix.appcompat.app.C2118q;
import p030e2.C1531b;
import p030e2.C1538g;
import p030e2.C1541j;
import p036f2.C1559b;
import p036f2.C1562e;

/* renamed from: miuix.appcompat.app.floatingactivity.a */
public class C2083a {

    /* renamed from: e */
    private static C2083a f7677e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final HashMap<String, C2084a> f7678f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SparseArray<ArrayList<C2118q>> f7679a = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f7680b;

    /* renamed from: c */
    private WeakReference<View> f7681c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayList<C2118q> f7682d = new ArrayList<>();

    /* renamed from: miuix.appcompat.app.floatingactivity.a$a */
    private static class C2084a implements Parcelable {
        public static final Parcelable.Creator<C2084a> CREATOR = new C2085a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7683d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f7684e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f7685f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f7686g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f7687h;

        /* renamed from: i */
        private boolean f7688i;

        /* renamed from: miuix.appcompat.app.floatingactivity.a$a$a */
        class C2085a implements Parcelable.Creator<C2084a> {
            C2085a() {
            }

            /* renamed from: a */
            public C2084a createFromParcel(Parcel parcel) {
                return new C2084a(parcel);
            }

            /* renamed from: b */
            public C2084a[] newArray(int i) {
                return new C2084a[i];
            }
        }

        protected C2084a(Parcel parcel) {
            this.f7683d = "";
            boolean z = false;
            this.f7684e = 0;
            this.f7686g = 0;
            this.f7687h = false;
            this.f7688i = false;
            this.f7683d = parcel.readString();
            this.f7684e = parcel.readInt();
            this.f7685f = parcel.readString();
            this.f7686g = parcel.readInt();
            this.f7687h = parcel.readByte() != 0 ? true : z;
        }

        public C2084a(String str, int i, String str2, int i2, boolean z) {
            this.f7688i = false;
            this.f7683d = str;
            this.f7684e = i;
            this.f7685f = str2;
            this.f7686g = i2;
            this.f7687h = z;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "{ activityClassName : " + this.f7683d + "; index : " + this.f7684e + "; identity : " + this.f7685f + "; taskId : " + this.f7686g + "; isOpenEnterAnimExecuted : " + this.f7687h + "; }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7683d);
            parcel.writeInt(this.f7684e);
            parcel.writeString(this.f7685f);
            parcel.writeInt(this.f7686g);
            parcel.writeByte(this.f7687h ? (byte) 1 : 0);
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.a$b */
    class C2086b implements C1538g {

        /* renamed from: a */
        protected String f7689a;

        /* renamed from: b */
        protected int f7690b;

        public C2086b(C2118q qVar) {
            this.f7689a = qVar.mo7560E0();
            this.f7690b = qVar.getTaskId();
        }

        /* renamed from: j */
        private void m8385j(C2118q qVar) {
            View p;
            ViewGroup viewGroup;
            C2083a o = C2083a.m8357o();
            if (o != null && (p = o.mo7460p()) != null && (viewGroup = (ViewGroup) qVar.mo7563G0().getParent()) != null) {
                viewGroup.getOverlay().clear();
                viewGroup.getOverlay().add(p);
            }
        }

        /* renamed from: k */
        private boolean m8386k(int i) {
            return !C2083a.this.f7680b && (i == 1 || i == 2);
        }

        /* renamed from: n */
        private boolean m8387n(int i) {
            ArrayList arrayList = (ArrayList) C2083a.this.f7679a.get(mo7471m());
            return (i == 4 || i == 3) && (arrayList != null && arrayList.size() > 1);
        }

        /* renamed from: a */
        public void mo5651a() {
            Iterator it = C2083a.this.f7682d.iterator();
            while (it.hasNext()) {
                ((C2118q) it.next()).mo7573P0();
            }
            C2083a.this.f7682d.clear();
        }

        /* renamed from: b */
        public void mo5652b() {
            C2083a.this.m8359s(mo7470l());
        }

        /* renamed from: c */
        public boolean mo5653c() {
            ArrayList arrayList;
            C2084a aVar = (C2084a) C2083a.f7678f.get(mo7470l());
            if (aVar == null || (arrayList = (ArrayList) C2083a.this.f7679a.get(aVar.f7686g)) == null) {
                return true;
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!((C2118q) it.next()).isFinishing()) {
                    i++;
                }
            }
            return i == 1;
        }

        /* renamed from: d */
        public boolean mo5654d() {
            ArrayList arrayList;
            C2084a aVar = (C2084a) C2083a.f7678f.get(mo7470l());
            if (aVar == null || (arrayList = (ArrayList) C2083a.this.f7679a.get(aVar.f7686g)) == null) {
                return true;
            }
            if (arrayList.size() > 1) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!((C2118q) it.next()).isFinishing()) {
                        i++;
                        continue;
                    }
                    if (i > 1) {
                        return false;
                    }
                }
            }
            C2118q qVar = arrayList.size() == 0 ? null : (C2118q) arrayList.get(0);
            if (qVar == null || qVar.isFinishing() || ((C2084a) C2083a.f7678f.get(qVar.mo7560E0())) == null) {
                return true;
            }
            return !aVar.f7687h;
        }

        /* renamed from: e */
        public void mo5655e(C2118q qVar) {
            C2083a o;
            C2118q r;
            View d;
            if (qVar != null && (o = C2083a.m8357o()) != null && (r = o.mo7461r(qVar)) != null) {
                int i = 0;
                do {
                    d = C1541j.m6654d(r, qVar);
                    i++;
                    if (d != null || i >= 3) {
                        o.mo7454E(d);
                        m8385j(r);
                    }
                    d = C1541j.m6654d(r, qVar);
                    i++;
                    break;
                } while (i >= 3);
                o.mo7454E(d);
                m8385j(r);
            }
        }

        /* renamed from: f */
        public void mo5656f() {
            C2083a.this.m8346F(mo7470l());
        }

        /* renamed from: g */
        public void mo5657g() {
            C2083a.this.m8359s(mo7470l());
        }

        /* renamed from: h */
        public boolean mo5650h(int i) {
            if (m8386k(i)) {
                return false;
            }
            if (m8387n(i)) {
                C2083a.this.m8355j(mo7470l());
            } else {
                C2083a.this.mo7456i(mo7470l());
            }
            return false;
        }

        /* renamed from: i */
        public void mo5658i(C2118q qVar) {
            C2083a.this.mo7452A(qVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public String mo7470l() {
            return this.f7689a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public int mo7471m() {
            return this.f7690b;
        }
    }

    private C2083a() {
    }

    /* renamed from: B */
    public static void m8344B(C2118q qVar, Bundle bundle) {
        if (m8357o() != null && bundle != null) {
            bundle.putParcelable("miuix_floating_activity_info_key", m8358q(qVar));
        }
    }

    /* renamed from: C */
    private C2084a m8345C(C2118q qVar, Bundle bundle) {
        C2084a aVar = (C2084a) bundle.getParcelable("miuix_floating_activity_info_key");
        if (aVar != null) {
            return aVar;
        }
        Log.w("FloatingActivity", "FloatingActivitySwitcher restore a full ActivitySpec instance with savedInstanceState fail, Check if you have replaced the theme in the float window !");
        return new C2084a(qVar.getClass().getSimpleName(), 0, qVar.mo7560E0(), qVar.getTaskId(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m8346F(String str) {
        C2084a aVar = f7678f.get(str);
        if (aVar != null) {
            ArrayList arrayList = this.f7679a.get(aVar.f7686g);
            int i = -1;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((C2118q) arrayList.get(i2)).mo7560E0().equals(str)) {
                        i = i2;
                    }
                }
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((C2118q) arrayList.get(i3)).mo7577T0();
            }
        }
    }

    /* renamed from: G */
    private void m8347G(C2118q qVar, Bundle bundle) {
        if (!m8365z(qVar)) {
            int taskId = qVar.getTaskId();
            ArrayList arrayList = this.f7679a.get(taskId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7679a.put(taskId, arrayList);
            }
            if (bundle != null) {
                C2084a C = m8345C(qVar, bundle);
                String unused = C.f7683d = qVar.getClass().getSimpleName();
                String unused2 = C.f7685f = qVar.mo7560E0();
                m8362v(arrayList, C.f7684e, qVar);
                f7678f.put(qVar.mo7560E0(), C);
            } else {
                arrayList.add(qVar);
                C2083a o = m8357o();
                f7678f.put(qVar.mo7560E0(), new C2084a(qVar.getClass().getSimpleName(), o == null ? 0 : o.mo7458m(qVar), qVar.mo7560E0(), qVar.getTaskId(), false));
            }
        }
        C2084a aVar = f7678f.get(qVar.mo7560E0());
        if (aVar != null) {
            C1531b.m6616g(qVar, aVar.f7684e);
        }
        m8356k(qVar);
        m8360t(qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m8355j(String str) {
        ArrayList arrayList;
        C2084a aVar = f7678f.get(str);
        if (aVar != null && (arrayList = this.f7679a.get(aVar.f7686g)) != null && arrayList.size() > 0) {
            ((C2118q) arrayList.get(arrayList.size() - 1)).mo7573P0();
        }
    }

    /* renamed from: k */
    private void m8356k(C2118q qVar) {
        if (!C1531b.m6615f()) {
            if (qVar.mo7562G()) {
                C1531b.m6610a(qVar);
            } else {
                C1531b.m6611b(qVar);
            }
        }
    }

    /* renamed from: o */
    static C2083a m8357o() {
        return f7677e;
    }

    /* renamed from: q */
    private static C2084a m8358q(C2118q qVar) {
        C2084a aVar = f7678f.get(qVar.mo7560E0());
        C2083a o = m8357o();
        if (aVar == null) {
            aVar = new C2084a(qVar.getClass().getSimpleName(), o == null ? 0 : o.mo7458m(qVar), qVar.mo7560E0(), qVar.getTaskId(), false);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m8359s(String str) {
        C2084a aVar = f7678f.get(str);
        if (aVar != null) {
            ArrayList arrayList = this.f7679a.get(aVar.f7686g);
            int i = -1;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((C2118q) arrayList.get(i2)).mo7560E0().equals(str)) {
                        i = i2;
                    }
                }
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((C2118q) arrayList.get(i3)).mo7567J0();
            }
        }
    }

    /* renamed from: t */
    private void m8360t(C2118q qVar) {
        ArrayList arrayList = this.f7679a.get(qVar.getTaskId());
        if (arrayList != null) {
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    i = -1;
                    break;
                } else if (!((C2118q) arrayList.get(i)).isFinishing()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                while (true) {
                    i++;
                    if (i < arrayList.size()) {
                        ((C2118q) arrayList.get(i)).mo7568K0();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private void m8361u(C2118q qVar, Bundle bundle) {
        if (!(C1559b.m6692a(qVar) instanceof C1562e)) {
            m8347G(qVar, bundle);
            qVar.mo252c().mo3790a(new SingleAppFloatingLifecycleObserver(qVar));
            qVar.mo7574Q0(this.f7680b);
            qVar.mo7576S0(new C2086b(qVar));
        }
    }

    /* renamed from: v */
    private void m8362v(ArrayList<C2118q> arrayList, int i, C2118q qVar) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            i2 = 0;
            if (size < 0) {
                break;
            }
            C2084a aVar = f7678f.get(arrayList.get(size).mo7560E0());
            if (aVar != null) {
                i2 = aVar.f7684e;
            }
            if (i > i2) {
                i2 = size + 1;
                break;
            }
        }
        arrayList.add(i2, qVar);
    }

    /* renamed from: w */
    public static void m8363w(C2118q qVar, Bundle bundle) {
        m8364x(qVar, true, bundle);
    }

    /* renamed from: x */
    private static void m8364x(C2118q qVar, boolean z, Bundle bundle) {
        if (f7677e == null) {
            C2083a aVar = new C2083a();
            f7677e = aVar;
            aVar.f7680b = z;
        }
        f7677e.m8361u(qVar, bundle);
    }

    /* renamed from: z */
    private boolean m8365z(C2118q qVar) {
        return f7678f.get(qVar.mo7560E0()) != null;
    }

    /* renamed from: A */
    public void mo7452A(C2118q qVar) {
        C2084a aVar = f7678f.get(qVar.mo7560E0());
        if (aVar != null) {
            boolean unused = aVar.f7687h = true;
        }
    }

    /* renamed from: D */
    public void mo7453D(String str, int i) {
        ArrayList arrayList = this.f7679a.get(i);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2118q) arrayList.get(size)).mo7560E0().equals(str)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f7679a.remove(i);
            }
        }
        f7678f.remove(str);
        if (this.f7679a.size() == 0) {
            mo7455h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo7454E(View view) {
        this.f7681c = new WeakReference<>(view);
    }

    /* renamed from: h */
    public void mo7455h() {
        this.f7679a.clear();
        f7678f.clear();
        this.f7681c = null;
        f7677e = null;
    }

    /* renamed from: i */
    public void mo7456i(String str) {
        ArrayList arrayList;
        C2084a aVar = f7678f.get(str);
        if (aVar != null && (arrayList = this.f7679a.get(aVar.f7686g)) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2118q qVar = (C2118q) arrayList.get(size);
                if (!qVar.mo7560E0().equals(str)) {
                    qVar.mo7567J0();
                    this.f7682d.add(qVar);
                    arrayList.remove(qVar);
                    f7678f.remove(qVar.mo7560E0());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2118q mo7457l(String str, int i) {
        ArrayList arrayList = this.f7679a.get(i);
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2118q qVar = (C2118q) it.next();
            if (qVar.mo7560E0().equals(str)) {
                return qVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo7458m(C2118q qVar) {
        ArrayList arrayList;
        if (qVar == null || (arrayList = this.f7679a.get(qVar.getTaskId())) == null) {
            return -1;
        }
        return arrayList.indexOf(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public ArrayList<C2118q> mo7459n(int i) {
        return this.f7679a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public View mo7460p() {
        WeakReference<View> weakReference = this.f7681c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C2118q mo7461r(C2118q qVar) {
        if (qVar == null) {
            return null;
        }
        ArrayList arrayList = this.f7679a.get(qVar.getTaskId());
        int indexOf = arrayList != null ? arrayList.indexOf(qVar) : -1;
        if (indexOf <= 0) {
            return null;
        }
        int i = indexOf - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            C2118q qVar2 = (C2118q) arrayList.get(i);
            if (!qVar2.isFinishing()) {
                return qVar2;
            }
        }
        return null;
    }

    /* renamed from: y */
    public boolean mo7462y(C2118q qVar) {
        C2084a aVar = f7678f.get(qVar.mo7560E0());
        return aVar != null && aVar.f7687h;
    }
}
