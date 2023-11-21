package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0091g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0098a;
import androidx.activity.result.C0100b;
import androidx.activity.result.C0101c;
import androidx.core.app.C0500h;
import androidx.core.app.C0504k;
import androidx.core.app.C0505l;
import androidx.core.app.C0506m;
import androidx.core.content.C0515b;
import androidx.core.content.C0516c;
import androidx.core.util.C0617a;
import androidx.core.view.C0713i;
import androidx.core.view.C0793y;
import androidx.fragment.app.C0949f0;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0009b;
import p010b0.C1285d;
import p015c.C1320a;

public abstract class FragmentManager {

    /* renamed from: R */
    private static boolean f3070R = false;

    /* renamed from: A */
    private C0986o f3071A = new C0902d();

    /* renamed from: B */
    private C0983m0 f3072B = new C0903e();

    /* renamed from: C */
    private C0101c<Intent> f3073C;

    /* renamed from: D */
    private C0101c<Object> f3074D;

    /* renamed from: E */
    private C0101c<String[]> f3075E;

    /* renamed from: F */
    ArrayDeque<C0909k> f3076F = new ArrayDeque<>();

    /* renamed from: G */
    private boolean f3077G;

    /* renamed from: H */
    private boolean f3078H;

    /* renamed from: I */
    private boolean f3079I;

    /* renamed from: J */
    private boolean f3080J;

    /* renamed from: K */
    private boolean f3081K;

    /* renamed from: L */
    private ArrayList<C0914a> f3082L;

    /* renamed from: M */
    private ArrayList<Boolean> f3083M;

    /* renamed from: N */
    private ArrayList<Fragment> f3084N;

    /* renamed from: O */
    private C1000z f3085O;

    /* renamed from: P */
    private C1285d.C1288c f3086P;

    /* renamed from: Q */
    private Runnable f3087Q = new C0904f();

    /* renamed from: a */
    private final ArrayList<C0912m> f3088a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3089b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0947e0 f3090c = new C0947e0();

    /* renamed from: d */
    ArrayList<C0914a> f3091d;

    /* renamed from: e */
    private ArrayList<Fragment> f3092e;

    /* renamed from: f */
    private final C0988q f3093f = new C0988q(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f3094g;

    /* renamed from: h */
    private final C0091g f3095h = new C0900b(false);

    /* renamed from: i */
    private final AtomicInteger f3096i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, C0919c> f3097j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<String, Bundle> f3098k = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map<String, Object> f3099l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private ArrayList<C0911l> f3100m;
    private C0983m0 mSpecialEffectsControllerFactory = null;

    /* renamed from: n */
    private final C0990r f3101n = new C0990r(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList<C0915a0> f3102o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    private final C0617a<Configuration> f3103p = new C0992s(this);

    /* renamed from: q */
    private final C0617a<Integer> f3104q = new C0993t(this);

    /* renamed from: r */
    private final C0617a<C0500h> f3105r = new C0994u(this);

    /* renamed from: s */
    private final C0617a<C0506m> f3106s = new C0995v(this);

    /* renamed from: t */
    private final C0793y f3107t = new C0901c();

    /* renamed from: u */
    int f3108u = -1;

    /* renamed from: v */
    private C0987p<?> f3109v;

    /* renamed from: w */
    private C0971l f3110w;

    /* renamed from: x */
    private Fragment f3111x;

    /* renamed from: y */
    Fragment f3112y;

    /* renamed from: z */
    private C0986o f3113z = null;

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C08986 implements C1046k {

        /* renamed from: d */
        final /* synthetic */ String f3114d;

        /* renamed from: e */
        final /* synthetic */ C0918b0 f3115e;

        /* renamed from: f */
        final /* synthetic */ C1035g f3116f;

        /* renamed from: g */
        final /* synthetic */ FragmentManager f3117g;

        /* renamed from: g */
        public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
            Bundle bundle;
            if (bVar == C1035g.C1037b.ON_START && (bundle = (Bundle) this.f3117g.f3098k.get(this.f3114d)) != null) {
                this.f3115e.mo3453a(this.f3114d, bundle);
                this.f3117g.mo3398t(this.f3114d);
            }
            if (bVar == C1035g.C1037b.ON_DESTROY) {
                this.f3116f.mo3792c(this);
                this.f3117g.f3099l.remove(this.f3114d);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C0899a implements C0100b<Map<String, Boolean>> {
        C0899a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo329a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            C0909k pollFirst = FragmentManager.this.f3076F.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f3128d;
                int i2 = pollFirst.f3129e;
                Fragment i3 = FragmentManager.this.f3090c.mo3539i(str);
                if (i3 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i3.mo3253V0(i2, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C0900b extends C0091g {
        C0900b(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo311b() {
            FragmentManager.this.mo3338D0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C0901c implements C0793y {
        C0901c() {
        }

        /* renamed from: a */
        public boolean mo2955a(MenuItem menuItem) {
            return FragmentManager.this.mo3348K(menuItem);
        }

        /* renamed from: b */
        public void mo2956b(Menu menu) {
            FragmentManager.this.mo3350L(menu);
        }

        /* renamed from: c */
        public void mo2957c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.mo3337D(menu, menuInflater);
        }

        /* renamed from: d */
        public void mo2958d(Menu menu) {
            FragmentManager.this.mo3357P(menu);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C0902d extends C0986o {
        C0902d() {
        }

        /* renamed from: a */
        public Fragment mo3412a(ClassLoader classLoader, String str) {
            return FragmentManager.this.mo3401u0().mo3632b(FragmentManager.this.mo3401u0().mo3692j(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C0903e implements C0983m0 {
        C0903e() {
        }

        /* renamed from: a */
        public C0972l0 mo3413a(ViewGroup viewGroup) {
            return new C0923d(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    class C0904f implements Runnable {
        C0904f() {
        }

        public void run() {
            FragmentManager.this.mo3372b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    class C0905g implements C0915a0 {

        /* renamed from: d */
        final /* synthetic */ Fragment f3124d;

        C0905g(Fragment fragment) {
            this.f3124d = fragment;
        }

        /* renamed from: a */
        public void mo3415a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3124d.mo3324z0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    class C0906h implements C0100b<C0098a> {
        C0906h() {
        }

        /* renamed from: b */
        public void mo329a(C0098a aVar) {
            C0909k pollFirst = FragmentManager.this.f3076F.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3128d;
            int i = pollFirst.f3129e;
            Fragment i2 = FragmentManager.this.f3090c.mo3539i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3315w0(i, aVar.mo321b(), aVar.mo320a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    class C0907i implements C0100b<C0098a> {
        C0907i() {
        }

        /* renamed from: b */
        public void mo329a(C0098a aVar) {
            C0909k pollFirst = FragmentManager.this.f3076F.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3128d;
            int i = pollFirst.f3129e;
            Fragment i2 = FragmentManager.this.f3090c.mo3539i(str);
            if (i2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i2.mo3315w0(i, aVar.mo321b(), aVar.mo320a());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    static class C0908j extends C1320a<Object, C0098a> {
        C0908j() {
        }

        /* renamed from: b */
        public C0098a mo3418a(int i, Intent intent) {
            return new C0098a(i, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.FragmentManager$k */
    static class C0909k implements Parcelable {
        public static final Parcelable.Creator<C0909k> CREATOR = new C0910a();

        /* renamed from: d */
        String f3128d;

        /* renamed from: e */
        int f3129e;

        /* renamed from: androidx.fragment.app.FragmentManager$k$a */
        class C0910a implements Parcelable.Creator<C0909k> {
            C0910a() {
            }

            /* renamed from: a */
            public C0909k createFromParcel(Parcel parcel) {
                return new C0909k(parcel);
            }

            /* renamed from: b */
            public C0909k[] newArray(int i) {
                return new C0909k[i];
            }
        }

        C0909k(Parcel parcel) {
            this.f3128d = parcel.readString();
            this.f3129e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3128d);
            parcel.writeInt(this.f3129e);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public interface C0911l {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    interface C0912m {
        /* renamed from: a */
        boolean mo3427a(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    private class C0913n implements C0912m {

        /* renamed from: a */
        final String f3130a;

        /* renamed from: b */
        final int f3131b;

        /* renamed from: c */
        final int f3132c;

        C0913n(String str, int i, int i2) {
            this.f3130a = str;
            this.f3131b = i;
            this.f3132c = i2;
        }

        /* renamed from: a */
        public boolean mo3427a(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3112y;
            if (fragment != null && this.f3131b < 0 && this.f3130a == null && fragment.mo3197A().mo3370Z0()) {
                return false;
            }
            return FragmentManager.this.mo3374c1(arrayList, arrayList2, this.f3130a, this.f3131b, this.f3132c);
        }
    }

    /* renamed from: B0 */
    static Fragment m3650B0(View view) {
        Object tag = view.getTag(C0009b.f14a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: H0 */
    public static boolean m3651H0(int i) {
        return f3070R || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: I0 */
    private boolean m3652I0(Fragment fragment) {
        return (fragment.f2997H && fragment.f2998I) || fragment.f3041y.mo3395p();
    }

    /* renamed from: J0 */
    private boolean m3653J0() {
        Fragment fragment = this.f3111x;
        if (fragment == null) {
            return true;
        }
        return fragment.mo3287n0() && this.f3111x.mo3250U().m3653J0();
    }

    /* renamed from: M */
    private void m3654M(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3376f0(fragment.f3025i))) {
            fragment.mo3311u1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m3656Q0(Configuration configuration) {
        if (m3653J0()) {
            mo3332A(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m3657R0(Integer num) {
        if (m3653J0() && num.intValue() == 80) {
            mo3343G(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m3658S0(C0500h hVar) {
        if (m3653J0()) {
            mo3345H(hVar.mo2559a(), false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: T */
    private void m3659T(int i) {
        try {
            this.f3089b = true;
            this.f3090c.mo3534d(i);
            mo3362U0(i, false);
            for (C0972l0 j : m3692u()) {
                j.mo3638j();
            }
            this.f3089b = false;
            mo3372b0(true);
        } catch (Throwable th) {
            this.f3089b = false;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m3660T0(C0506m mVar) {
        if (m3653J0()) {
            mo3355O(mVar.mo2561a(), false);
        }
    }

    /* renamed from: W */
    private void m3661W() {
        if (this.f3081K) {
            this.f3081K = false;
            m3685p1();
        }
    }

    /* renamed from: Y */
    private void m3662Y() {
        for (C0972l0 j : m3692u()) {
            j.mo3638j();
        }
    }

    /* renamed from: a0 */
    private void m3664a0(boolean z) {
        if (this.f3089b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3109v == null) {
            if (this.f3080J) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3109v.mo3693k().getLooper()) {
            if (!z) {
                m3686q();
            }
            if (this.f3082L == null) {
                this.f3082L = new ArrayList<>();
                this.f3083M = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b1 */
    private boolean m3666b1(String str, int i, int i2) {
        mo3372b0(false);
        m3664a0(true);
        Fragment fragment = this.f3112y;
        if (fragment != null && i < 0 && str == null && fragment.mo3197A().mo3370Z0()) {
            return true;
        }
        boolean c1 = mo3374c1(this.f3082L, this.f3083M, str, i, i2);
        if (c1) {
            this.f3089b = true;
            try {
                m3672e1(this.f3082L, this.f3083M);
            } finally {
                m3688r();
            }
        }
        m3690r1();
        m3661W();
        this.f3090c.mo3532b();
        return c1;
    }

    /* renamed from: d0 */
    private static void m3669d0(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0914a aVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3436r(-1);
                aVar.mo3442w();
            } else {
                aVar.mo3436r(1);
                aVar.mo3441v();
            }
            i++;
        }
    }

    /* renamed from: e0 */
    private void m3671e0(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f3265r;
        ArrayList<Fragment> arrayList3 = this.f3084N;
        if (arrayList3 == null) {
            this.f3084N = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f3084N.addAll(this.f3090c.mo3545o());
        Fragment y0 = mo3408y0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C0914a aVar = arrayList.get(i3);
            y0 = !arrayList2.get(i3).booleanValue() ? aVar.mo3443x(this.f3084N, y0) : aVar.mo3428A(this.f3084N, y0);
            z2 = z2 || aVar.f3256i;
        }
        this.f3084N.clear();
        if (!z && this.f3108u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<C0949f0.C0950a> it = arrayList.get(i4).f3250c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3268b;
                    if (!(fragment == null || fragment.f3039w == null)) {
                        this.f3090c.mo3548r(mo3403w(fragment));
                    }
                }
            }
        }
        m3669d0(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            C0914a aVar2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = aVar2.f3250c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f3250c.get(size).f3268b;
                    if (fragment2 != null) {
                        mo3403w(fragment2).mo3504m();
                    }
                }
            } else {
                Iterator<C0949f0.C0950a> it2 = aVar2.f3250c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f3268b;
                    if (fragment3 != null) {
                        mo3403w(fragment3).mo3504m();
                    }
                }
            }
        }
        mo3362U0(this.f3108u, true);
        for (C0972l0 next : m3693v(arrayList, i, i2)) {
            next.mo3643r(booleanValue);
            next.mo3642p();
            next.mo3637g();
        }
        while (i < i2) {
            C0914a aVar3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && aVar3.f3136v >= 0) {
                aVar3.f3136v = -1;
            }
            aVar3.mo3445z();
            i++;
        }
        if (z2) {
            m3674f1();
        }
    }

    /* renamed from: e1 */
    private void m3672e1(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3265r) {
                        if (i2 != i) {
                            m3671e0(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3265r) {
                                i2++;
                            }
                        }
                        m3671e0(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m3671e0(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: f1 */
    private void m3674f1() {
        if (this.f3100m != null) {
            for (int i = 0; i < this.f3100m.size(); i++) {
                this.f3100m.get(i).onBackStackChanged();
            }
        }
    }

    /* renamed from: g0 */
    private int m3676g0(String str, int i, boolean z) {
        ArrayList<C0914a> arrayList = this.f3091d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f3091d.size() - 1;
            while (size >= 0) {
                C0914a aVar = this.f3091d.get(size);
                if ((str != null && str.equals(aVar.mo3444y())) || (i >= 0 && i == aVar.f3136v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    C0914a aVar2 = this.f3091d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.mo3444y())) && (i < 0 || i != aVar2.f3136v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f3091d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f3091d.size() - 1;
        }
    }

    /* renamed from: h1 */
    static int m3678h1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 8194) {
            return 4097;
        }
        if (i == 8197) {
            return 4100;
        }
        if (i != 4099) {
            return i != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* renamed from: k0 */
    static FragmentManager m3679k0(View view) {
        Fragment l0 = m3680l0(view);
        if (l0 == null) {
            Context context = view.getContext();
            C0964j jVar = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof C0964j) {
                    jVar = (C0964j) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (jVar != null) {
                return jVar.mo3605g0();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (l0.mo3287n0()) {
            return l0.mo3197A();
        } else {
            throw new IllegalStateException("The Fragment " + l0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    /* renamed from: l0 */
    private static Fragment m3680l0(View view) {
        while (view != null) {
            Fragment B0 = m3650B0(view);
            if (B0 != null) {
                return B0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: m0 */
    private void m3681m0() {
        for (C0972l0 k : m3692u()) {
            k.mo3639k();
        }
    }

    /* renamed from: n0 */
    private boolean m3682n0(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3088a) {
            if (this.f3088a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3088a.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f3088a.get(i).mo3427a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.f3088a.clear();
                this.f3109v.mo3693k().removeCallbacks(this.f3087Q);
            }
        }
    }

    /* renamed from: n1 */
    private void m3683n1(Fragment fragment) {
        ViewGroup r0 = m3689r0(fragment);
        if (r0 != null && fragment.mo3202C() + fragment.mo3216I() + fragment.mo3254W() + fragment.mo3256X() > 0) {
            int i = C0009b.f16c;
            if (r0.getTag(i) == null) {
                r0.setTag(i, fragment);
            }
            ((Fragment) r0.getTag(i)).mo3232N1(fragment.mo3252V());
        }
    }

    /* renamed from: p0 */
    private C1000z m3684p0(Fragment fragment) {
        return this.f3085O.mo3726j(fragment);
    }

    /* renamed from: p1 */
    private void m3685p1() {
        for (C0938d0 X0 : this.f3090c.mo3541k()) {
            mo3367X0(X0);
        }
    }

    /* renamed from: q */
    private void m3686q() {
        if (mo3356O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q1 */
    private void m3687q1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0970k0("FragmentManager"));
        C0987p<?> pVar = this.f3109v;
        if (pVar != null) {
            try {
                pVar.mo3614m("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo3366X("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: r */
    private void m3688r() {
        this.f3089b = false;
        this.f3083M.clear();
        this.f3082L.clear();
    }

    /* renamed from: r0 */
    private ViewGroup m3689r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3000K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2991B > 0 && this.f3110w.mo3331g()) {
            View d = this.f3110w.mo3330d(fragment.f2991B);
            if (d instanceof ViewGroup) {
                return (ViewGroup) d;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3393o0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3352M0(r3.f3111x) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo315f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3095h;
     */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3690r1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r0 = r3.f3088a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r1 = r3.f3088a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.g r1 = r3.f3095h     // Catch:{ all -> 0x002a }
            r1.mo315f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.g r0 = r3.f3095h
            int r1 = r3.mo3393o0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3111x
            boolean r1 = r3.mo3352M0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo315f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m3690r1():void");
    }

    /* renamed from: s */
    private void m3691s() {
        C0987p<?> pVar = this.f3109v;
        boolean z = true;
        if (pVar instanceof C1039g0) {
            z = this.f3090c.mo3546p().mo3729n();
        } else if (pVar.mo3692j() instanceof Activity) {
            z = true ^ ((Activity) this.f3109v.mo3692j()).isChangingConfigurations();
        }
        if (z) {
            for (C0919c cVar : this.f3097j.values()) {
                for (String g : cVar.f3152d) {
                    this.f3090c.mo3546p().mo3723g(g);
                }
            }
        }
    }

    /* renamed from: u */
    private Set<C0972l0> m3692u() {
        HashSet hashSet = new HashSet();
        for (C0938d0 k : this.f3090c.mo3541k()) {
            ViewGroup viewGroup = k.mo3503k().f3000K;
            if (viewGroup != null) {
                hashSet.add(C0972l0.m4043o(viewGroup, mo3410z0()));
            }
        }
        return hashSet;
    }

    /* renamed from: v */
    private Set<C0972l0> m3693v(ArrayList<C0914a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C0949f0.C0950a> it = arrayList.get(i).f3250c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3268b;
                if (!(fragment == null || (viewGroup = fragment.f3000K) == null)) {
                    hashSet.add(C0972l0.m4042n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3332A(Configuration configuration, boolean z) {
        if (z && (this.f3109v instanceof C0515b)) {
            m3687q1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null) {
                next.mo3271e1(configuration);
                if (z) {
                    next.f3041y.mo3332A(configuration, true);
                }
            }
        }
    }

    /* renamed from: A0 */
    public C1285d.C1288c mo3333A0() {
        return this.f3086P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3334B(MenuItem menuItem) {
        if (this.f3108u < 1) {
            return false;
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null && next.mo3274f1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo3335C() {
        this.f3078H = false;
        this.f3079I = false;
        this.f3085O.mo3731p(false);
        m3659T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public C1034f0 mo3336C0(Fragment fragment) {
        return this.f3085O.mo3728m(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3337D(Menu menu, MenuInflater menuInflater) {
        if (this.f3108u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null && mo3351L0(next) && next.mo3277h1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3092e != null) {
            for (int i = 0; i < this.f3092e.size(); i++) {
                Fragment fragment = this.f3092e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3214H0();
                }
            }
        }
        this.f3092e = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo3338D0() {
        mo3372b0(true);
        if (this.f3095h.mo312c()) {
            mo3370Z0();
        } else {
            this.f3094g.mo294f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3339E() {
        this.f3080J = true;
        mo3372b0(true);
        m3662Y();
        m3691s();
        m3659T(-1);
        C0987p<?> pVar = this.f3109v;
        if (pVar instanceof C0516c) {
            ((C0516c) pVar).mo276s(this.f3104q);
        }
        C0987p<?> pVar2 = this.f3109v;
        if (pVar2 instanceof C0515b) {
            ((C0515b) pVar2).mo245N(this.f3103p);
        }
        C0987p<?> pVar3 = this.f3109v;
        if (pVar3 instanceof C0504k) {
            ((C0504k) pVar3).mo244K(this.f3105r);
        }
        C0987p<?> pVar4 = this.f3109v;
        if (pVar4 instanceof C0505l) {
            ((C0505l) pVar4).mo274r(this.f3106s);
        }
        C0987p<?> pVar5 = this.f3109v;
        if (pVar5 instanceof C0713i) {
            ((C0713i) pVar5).mo255h(this.f3107t);
        }
        this.f3109v = null;
        this.f3110w = null;
        this.f3111x = null;
        if (this.f3094g != null) {
            this.f3095h.mo313d();
            this.f3094g = null;
        }
        C0101c<Intent> cVar = this.f3073C;
        if (cVar != null) {
            cVar.mo330a();
            this.f3074D.mo330a();
            this.f3075E.mo330a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo3340E0(Fragment fragment) {
        if (m3651H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2993D) {
            fragment.f2993D = true;
            fragment.f3006Q = true ^ fragment.f3006Q;
            m3683n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo3341F() {
        m3659T(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo3342F0(Fragment fragment) {
        if (fragment.f3031o && m3652I0(fragment)) {
            this.f3077G = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3343G(boolean z) {
        if (z && (this.f3109v instanceof C0516c)) {
            m3687q1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null) {
                next.mo3288n1();
                if (z) {
                    next.f3041y.mo3343G(true);
                }
            }
        }
    }

    /* renamed from: G0 */
    public boolean mo3344G0() {
        return this.f3080J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3345H(boolean z, boolean z2) {
        if (z2 && (this.f3109v instanceof C0504k)) {
            m3687q1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null) {
                next.mo3291o1(z);
                if (z2) {
                    next.f3041y.mo3345H(z, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3346I(Fragment fragment) {
        Iterator<C0915a0> it = this.f3102o.iterator();
        while (it.hasNext()) {
            it.next().mo3415a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3347J() {
        for (Fragment next : this.f3090c.mo3542l()) {
            if (next != null) {
                next.mo3225L0(next.mo3290o0());
                next.f3041y.mo3347J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo3348K(MenuItem menuItem) {
        if (this.f3108u < 1) {
            return false;
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null && next.mo3297p1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean mo3349K0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.mo3290o0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo3350L(Menu menu) {
        if (this.f3108u >= 1) {
            for (Fragment next : this.f3090c.mo3545o()) {
                if (next != null) {
                    next.mo3300q1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo3351L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.mo3299q0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public boolean mo3352M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3039w;
        return fragment.equals(fragmentManager.mo3408y0()) && mo3352M0(fragmentManager.f3111x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3353N() {
        m3659T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo3354N0(int i) {
        return this.f3108u >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3355O(boolean z, boolean z2) {
        if (z2 && (this.f3109v instanceof C0505l)) {
            m3687q1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null) {
                next.mo3305s1(z);
                if (z2) {
                    next.f3041y.mo3355O(z, true);
                }
            }
        }
    }

    /* renamed from: O0 */
    public boolean mo3356O0() {
        return this.f3078H || this.f3079I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo3357P(Menu menu) {
        boolean z = false;
        if (this.f3108u < 1) {
            return false;
        }
        for (Fragment next : this.f3090c.mo3545o()) {
            if (next != null && mo3351L0(next) && next.mo3308t1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo3358Q() {
        m3690r1();
        m3654M(this.f3112y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3359R() {
        this.f3078H = false;
        this.f3079I = false;
        this.f3085O.mo3731p(false);
        m3659T(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo3360S() {
        this.f3078H = false;
        this.f3079I = false;
        this.f3085O.mo3731p(false);
        m3659T(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3361U() {
        this.f3079I = true;
        this.f3085O.mo3731p(true);
        m3659T(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3362U0(int i, boolean z) {
        C0987p<?> pVar;
        if (this.f3109v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3108u) {
            this.f3108u = i;
            this.f3090c.mo3550t();
            m3685p1();
            if (this.f3077G && (pVar = this.f3109v) != null && this.f3108u == 7) {
                pVar.mo3617q();
                this.f3077G = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo3363V() {
        m3659T(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3364V0() {
        if (this.f3109v != null) {
            this.f3078H = false;
            this.f3079I = false;
            this.f3085O.mo3731p(false);
            for (Fragment next : this.f3090c.mo3545o()) {
                if (next != null) {
                    next.mo3310u0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3365W0(C0981m mVar) {
        View view;
        for (C0938d0 next : this.f3090c.mo3541k()) {
            Fragment k = next.mo3503k();
            if (k.f2991B == mVar.getId() && (view = k.f3001L) != null && view.getParent() == null) {
                k.f3000K = mVar;
                next.mo3494b();
            }
        }
    }

    /* renamed from: X */
    public void mo3366X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3090c.mo3535e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3092e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3092e.get(i).toString());
            }
        }
        ArrayList<C0914a> arrayList2 = this.f3091d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0914a aVar = this.f3091d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3438t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3096i.get());
        synchronized (this.f3088a) {
            int size3 = this.f3088a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3088a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3109v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3110w);
        if (this.f3111x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3111x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3108u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3078H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3079I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3080J);
        if (this.f3077G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3077G);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo3367X0(C0938d0 d0Var) {
        Fragment k = d0Var.mo3503k();
        if (!k.f3002M) {
            return;
        }
        if (this.f3089b) {
            this.f3081K = true;
            return;
        }
        k.f3002M = false;
        d0Var.mo3504m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3368Y0(int i, int i2, boolean z) {
        if (i >= 0) {
            mo3369Z(new C0913n((String) null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo3369Z(C0912m mVar, boolean z) {
        if (!z) {
            if (this.f3109v != null) {
                m3686q();
            } else if (this.f3080J) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3088a) {
            if (this.f3109v != null) {
                this.f3088a.add(mVar);
                mo3384j1();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: Z0 */
    public boolean mo3370Z0() {
        return m3666b1((String) null, -1, 0);
    }

    /* renamed from: a1 */
    public boolean mo3371a1(int i, int i2) {
        if (i >= 0) {
            return m3666b1((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo3372b0(boolean z) {
        m3664a0(z);
        boolean z2 = false;
        while (m3682n0(this.f3082L, this.f3083M)) {
            this.f3089b = true;
            try {
                m3672e1(this.f3082L, this.f3083M);
                m3688r();
                z2 = true;
            } catch (Throwable th) {
                m3688r();
                throw th;
            }
        }
        m3690r1();
        m3661W();
        this.f3090c.mo3532b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo3373c0(C0912m mVar, boolean z) {
        if (!z || (this.f3109v != null && !this.f3080J)) {
            m3664a0(z);
            if (mVar.mo3427a(this.f3082L, this.f3083M)) {
                this.f3089b = true;
                try {
                    m3672e1(this.f3082L, this.f3083M);
                } finally {
                    m3688r();
                }
            }
            m3690r1();
            m3661W();
            this.f3090c.mo3532b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public boolean mo3374c1(ArrayList<C0914a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int g0 = m3676g0(str, i, (i2 & 1) != 0);
        if (g0 < 0) {
            return false;
        }
        for (int size = this.f3091d.size() - 1; size >= g0; size--) {
            arrayList.add(this.f3091d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3375d1(Fragment fragment) {
        if (m3651H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3038v);
        }
        boolean z = !fragment.mo3296p0();
        if (!fragment.f2994E || z) {
            this.f3090c.mo3551u(fragment);
            if (m3652I0(fragment)) {
                this.f3077G = true;
            }
            fragment.f3032p = true;
            m3683n1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Fragment mo3376f0(String str) {
        return this.f3090c.mo3536f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3377g1(Parcelable parcelable) {
        C0938d0 d0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f3109v.mo3692j().getClassLoader());
                    this.f3098k.put(next.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f3109v.mo3692j().getClassLoader());
                    arrayList.add((C0921c0) bundle.getParcelable("state"));
                }
            }
            this.f3090c.mo3554x(arrayList);
            C0998y yVar = (C0998y) bundle3.getParcelable("state");
            if (yVar != null) {
                this.f3090c.mo3552v();
                Iterator<String> it = yVar.f3374d.iterator();
                while (it.hasNext()) {
                    C0921c0 B = this.f3090c.mo3530B(it.next(), (C0921c0) null);
                    if (B != null) {
                        Fragment i = this.f3085O.mo3725i(B.f3155e);
                        if (i != null) {
                            if (m3651H0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + i);
                            }
                            d0Var = new C0938d0(this.f3101n, this.f3090c, i, B);
                        } else {
                            d0Var = new C0938d0(this.f3101n, this.f3090c, this.f3109v.mo3692j().getClassLoader(), mo3397s0(), B);
                        }
                        Fragment k = d0Var.mo3503k();
                        k.f3039w = this;
                        if (m3651H0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k.f3025i + "): " + k);
                        }
                        d0Var.mo3506o(this.f3109v.mo3692j().getClassLoader());
                        this.f3090c.mo3548r(d0Var);
                        d0Var.mo3510t(this.f3108u);
                    }
                }
                for (Fragment next3 : this.f3085O.mo3727l()) {
                    if (!this.f3090c.mo3533c(next3.f3025i)) {
                        if (m3651H0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next3 + " that was not found in the set of active Fragments " + yVar.f3374d);
                        }
                        this.f3085O.mo3730o(next3);
                        next3.f3039w = this;
                        C0938d0 d0Var2 = new C0938d0(this.f3101n, this.f3090c, next3);
                        d0Var2.mo3510t(1);
                        d0Var2.mo3504m();
                        next3.f3032p = true;
                        d0Var2.mo3504m();
                    }
                }
                this.f3090c.mo3553w(yVar.f3375e);
                if (yVar.f3376f != null) {
                    this.f3091d = new ArrayList<>(yVar.f3376f.length);
                    int i2 = 0;
                    while (true) {
                        C0916b[] bVarArr = yVar.f3376f;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        C0914a b = bVarArr[i2].mo3446b(this);
                        if (m3651H0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + b.f3136v + "): " + b);
                            PrintWriter printWriter = new PrintWriter(new C0970k0("FragmentManager"));
                            b.mo3440u("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3091d.add(b);
                        i2++;
                    }
                } else {
                    this.f3091d = null;
                }
                this.f3096i.set(yVar.f3377g);
                String str = yVar.f3378h;
                if (str != null) {
                    Fragment f0 = mo3376f0(str);
                    this.f3112y = f0;
                    m3654M(f0);
                }
                ArrayList<String> arrayList2 = yVar.f3379i;
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        this.f3097j.put(arrayList2.get(i3), yVar.f3380j.get(i3));
                    }
                }
                this.f3076F = new ArrayDeque<>(yVar.f3381k);
            }
        }
    }

    /* renamed from: h0 */
    public Fragment mo3378h0(int i) {
        return this.f3090c.mo3537g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3379i(C0914a aVar) {
        if (this.f3091d == null) {
            this.f3091d = new ArrayList<>();
        }
        this.f3091d.add(aVar);
    }

    /* renamed from: i0 */
    public Fragment mo3380i0(String str) {
        return this.f3090c.mo3538h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public Bundle m3655P0() {
        int size;
        Bundle bundle = new Bundle();
        m3681m0();
        m3662Y();
        mo3372b0(true);
        this.f3078H = true;
        this.f3085O.mo3731p(true);
        ArrayList<String> y = this.f3090c.mo3555y();
        ArrayList<C0921c0> m = this.f3090c.mo3543m();
        if (!m.isEmpty()) {
            ArrayList<String> z = this.f3090c.mo3556z();
            C0916b[] bVarArr = null;
            ArrayList<C0914a> arrayList = this.f3091d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                bVarArr = new C0916b[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new C0916b(this.f3091d.get(i));
                    if (m3651H0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3091d.get(i));
                    }
                }
            }
            C0998y yVar = new C0998y();
            yVar.f3374d = y;
            yVar.f3375e = z;
            yVar.f3376f = bVarArr;
            yVar.f3377g = this.f3096i.get();
            Fragment fragment = this.f3112y;
            if (fragment != null) {
                yVar.f3378h = fragment.f3025i;
            }
            yVar.f3379i.addAll(this.f3097j.keySet());
            yVar.f3380j.addAll(this.f3097j.values());
            yVar.f3381k = new ArrayList<>(this.f3076F);
            bundle.putParcelable("state", yVar);
            for (String next : this.f3098k.keySet()) {
                bundle.putBundle("result_" + next, this.f3098k.get(next));
            }
            Iterator<C0921c0> it = m.iterator();
            while (it.hasNext()) {
                C0921c0 next2 = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next2);
                bundle.putBundle("fragment_" + next2.f3155e, bundle2);
            }
        } else if (m3651H0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0938d0 mo3382j(Fragment fragment) {
        String str = fragment.f3009T;
        if (str != null) {
            C1285d.m5925h(fragment, str);
        }
        if (m3651H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0938d0 w = mo3403w(fragment);
        fragment.f3039w = this;
        this.f3090c.mo3548r(w);
        if (!fragment.f2994E) {
            this.f3090c.mo3531a(fragment);
            fragment.f3032p = false;
            if (fragment.f3001L == null) {
                fragment.f3006Q = false;
            }
            if (m3652I0(fragment)) {
                this.f3077G = true;
            }
        }
        return w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Fragment mo3383j0(String str) {
        return this.f3090c.mo3539i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3384j1() {
        synchronized (this.f3088a) {
            boolean z = true;
            if (this.f3088a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f3109v.mo3693k().removeCallbacks(this.f3087Q);
                this.f3109v.mo3693k().post(this.f3087Q);
                m3690r1();
            }
        }
    }

    /* renamed from: k */
    public void mo3385k(C0915a0 a0Var) {
        this.f3102o.add(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3386k1(Fragment fragment, boolean z) {
        ViewGroup r0 = m3689r0(fragment);
        if (r0 != null && (r0 instanceof C0981m)) {
            ((C0981m) r0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo3387l() {
        return this.f3096i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3388l1(Fragment fragment, C1035g.C1038c cVar) {
        if (!fragment.equals(mo3376f0(fragment.f3025i)) || !(fragment.f3040x == null || fragment.f3039w == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f3010U = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3389m(androidx.fragment.app.C0987p<?> r4, androidx.fragment.app.C0971l r5, androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.p<?> r0 = r3.f3109v
            if (r0 != 0) goto L_0x0167
            r3.f3109v = r4
            r3.f3110w = r5
            r3.f3111x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$g r5 = new androidx.fragment.app.FragmentManager$g
            r5.<init>(r6)
        L_0x0011:
            r3.mo3385k(r5)
            goto L_0x001d
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.C0915a0
            if (r5 == 0) goto L_0x001d
            r5 = r4
            androidx.fragment.app.a0 r5 = (androidx.fragment.app.C0915a0) r5
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r5 = r3.f3111x
            if (r5 == 0) goto L_0x0024
            r3.m3690r1()
        L_0x0024:
            boolean r5 = r4 instanceof androidx.activity.C0095k
            if (r5 == 0) goto L_0x0039
            r5 = r4
            androidx.activity.k r5 = (androidx.activity.C0095k) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.mo253e()
            r3.f3094g = r0
            if (r6 == 0) goto L_0x0034
            r5 = r6
        L_0x0034:
            androidx.activity.g r1 = r3.f3095h
            r0.mo291b(r5, r1)
        L_0x0039:
            if (r6 == 0) goto L_0x0044
            androidx.fragment.app.FragmentManager r4 = r6.f3039w
            androidx.fragment.app.z r4 = r4.m3684p0(r6)
        L_0x0041:
            r3.f3085O = r4
            goto L_0x005a
        L_0x0044:
            boolean r5 = r4 instanceof androidx.lifecycle.C1039g0
            if (r5 == 0) goto L_0x0053
            androidx.lifecycle.g0 r4 = (androidx.lifecycle.C1039g0) r4
            androidx.lifecycle.f0 r4 = r4.mo243H()
            androidx.fragment.app.z r4 = androidx.fragment.app.C1000z.m4123k(r4)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.z r4 = new androidx.fragment.app.z
            r5 = 0
            r4.<init>(r5)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.z r4 = r3.f3085O
            boolean r5 = r3.mo3356O0()
            r4.mo3731p(r5)
            androidx.fragment.app.e0 r4 = r3.f3090c
            androidx.fragment.app.z r5 = r3.f3085O
            r4.mo3529A(r5)
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof p040g0.C1593e
            if (r5 == 0) goto L_0x008b
            if (r6 != 0) goto L_0x008b
            g0.e r4 = (p040g0.C1593e) r4
            g0.c r4 = r4.mo254f()
            androidx.fragment.app.w r5 = new androidx.fragment.app.w
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo5737h(r0, r5)
            android.os.Bundle r4 = r4.mo5732b(r0)
            if (r4 == 0) goto L_0x008b
            r3.mo3377g1(r4)
        L_0x008b:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.activity.result.C0106e
            if (r5 == 0) goto L_0x0123
            androidx.activity.result.e r4 = (androidx.activity.result.C0106e) r4
            androidx.activity.result.d r4 = r4.mo288z()
            if (r6 == 0) goto L_0x00ad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.f3025i
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00af
        L_0x00ad:
            java.lang.String r5 = ""
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            c.c r1 = new c.c
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r2.<init>()
            androidx.activity.result.c r0 = r4.mo334g(r0, r1, r2)
            r3.f3073C = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            androidx.activity.result.c r0 = r4.mo334g(r0, r1, r2)
            r3.f3074D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            c.b r0 = new c.b
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.c r4 = r4.mo334g(r5, r0, r1)
            r3.f3075E = r4
        L_0x0123:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.core.content.C0515b
            if (r5 == 0) goto L_0x0130
            androidx.core.content.b r4 = (androidx.core.content.C0515b) r4
            androidx.core.util.a<android.content.res.Configuration> r5 = r3.f3103p
            r4.mo256l(r5)
        L_0x0130:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.core.content.C0516c
            if (r5 == 0) goto L_0x013d
            androidx.core.content.c r4 = (androidx.core.content.C0516c) r4
            androidx.core.util.a<java.lang.Integer> r5 = r3.f3104q
            r4.mo284t(r5)
        L_0x013d:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.core.app.C0504k
            if (r5 == 0) goto L_0x014a
            androidx.core.app.k r4 = (androidx.core.app.C0504k) r4
            androidx.core.util.a<androidx.core.app.h> r5 = r3.f3105r
            r4.mo242B(r5)
        L_0x014a:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.core.app.C0505l
            if (r5 == 0) goto L_0x0157
            androidx.core.app.l r4 = (androidx.core.app.C0505l) r4
            androidx.core.util.a<androidx.core.app.m> r5 = r3.f3106s
            r4.mo286w(r5)
        L_0x0157:
            androidx.fragment.app.p<?> r4 = r3.f3109v
            boolean r5 = r4 instanceof androidx.core.view.C0713i
            if (r5 == 0) goto L_0x0166
            if (r6 != 0) goto L_0x0166
            androidx.core.view.i r4 = (androidx.core.view.C0713i) r4
            androidx.core.view.y r5 = r3.f3107t
            r4.mo287x(r5)
        L_0x0166:
            return
        L_0x0167:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3389m(androidx.fragment.app.p, androidx.fragment.app.l, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3390m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3376f0(fragment.f3025i)) && (fragment.f3040x == null || fragment.f3039w == this))) {
            Fragment fragment2 = this.f3112y;
            this.f3112y = fragment;
            m3654M(fragment2);
            m3654M(this.f3112y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3391n(Fragment fragment) {
        if (m3651H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2994E) {
            fragment.f2994E = false;
            if (!fragment.f3031o) {
                this.f3090c.mo3531a(fragment);
                if (m3651H0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3652I0(fragment)) {
                    this.f3077G = true;
                }
            }
        }
    }

    /* renamed from: o */
    public C0949f0 mo3392o() {
        return new C0914a(this);
    }

    /* renamed from: o0 */
    public int mo3393o0() {
        ArrayList<C0914a> arrayList = this.f3091d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3394o1(Fragment fragment) {
        if (m3651H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2993D) {
            fragment.f2993D = false;
            fragment.f3006Q = !fragment.f3006Q;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo3395p() {
        boolean z = false;
        for (Fragment next : this.f3090c.mo3542l()) {
            if (next != null) {
                z = m3652I0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public C0971l mo3396q0() {
        return this.f3110w;
    }

    /* renamed from: s0 */
    public C0986o mo3397s0() {
        C0986o oVar = this.f3113z;
        if (oVar != null) {
            return oVar;
        }
        Fragment fragment = this.f3111x;
        return fragment != null ? fragment.f3039w.mo3397s0() : this.f3071A;
    }

    /* renamed from: t */
    public final void mo3398t(String str) {
        this.f3098k.remove(str);
        if (m3651H0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* renamed from: t0 */
    public List<Fragment> mo3399t0() {
        return this.f3090c.mo3545o();
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3111x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f3111x;
        } else {
            C0987p<?> pVar = this.f3109v;
            if (pVar != null) {
                sb.append(pVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f3109v;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u0 */
    public C0987p<?> mo3401u0() {
        return this.f3109v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public LayoutInflater.Factory2 mo3402v0() {
        return this.f3093f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0938d0 mo3403w(Fragment fragment) {
        C0938d0 n = this.f3090c.mo3544n(fragment.f3025i);
        if (n != null) {
            return n;
        }
        C0938d0 d0Var = new C0938d0(this.f3101n, this.f3090c, fragment);
        d0Var.mo3506o(this.f3109v.mo3692j().getClassLoader());
        d0Var.mo3510t(this.f3108u);
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public C0990r mo3404w0() {
        return this.f3101n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3405x(Fragment fragment) {
        if (m3651H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2994E) {
            fragment.f2994E = true;
            if (fragment.f3031o) {
                if (m3651H0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3090c.mo3551u(fragment);
                if (m3652I0(fragment)) {
                    this.f3077G = true;
                }
                m3683n1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public Fragment mo3406x0() {
        return this.f3111x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3407y() {
        this.f3078H = false;
        this.f3079I = false;
        this.f3085O.mo3731p(false);
        m3659T(4);
    }

    /* renamed from: y0 */
    public Fragment mo3408y0() {
        return this.f3112y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3409z() {
        this.f3078H = false;
        this.f3079I = false;
        this.f3085O.mo3731p(false);
        m3659T(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C0983m0 mo3410z0() {
        C0983m0 m0Var = this.mSpecialEffectsControllerFactory;
        if (m0Var != null) {
            return m0Var;
        }
        Fragment fragment = this.f3111x;
        return fragment != null ? fragment.f3039w.mo3410z0() : this.f3072B;
    }
}
