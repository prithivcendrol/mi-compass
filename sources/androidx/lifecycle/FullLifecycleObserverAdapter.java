package androidx.lifecycle;

import androidx.lifecycle.C1035g;

class FullLifecycleObserverAdapter implements C1046k {

    /* renamed from: d */
    private final C1020d f3391d;

    /* renamed from: e */
    private final C1046k f3392e;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C1002a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3393a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.C1035g.C1037b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3393a = r0
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3393a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C1035g.C1037b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C1002a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C1020d dVar, C1046k kVar) {
        this.f3391d = dVar;
        this.f3392e = kVar;
    }

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        switch (C1002a.f3393a[bVar.ordinal()]) {
            case 1:
                this.f3391d.mo3767b(mVar);
                break;
            case 2:
                this.f3391d.mo3769d(mVar);
                break;
            case 3:
                this.f3391d.mo3077f(mVar);
                break;
            case 4:
                this.f3391d.mo3768c(mVar);
                break;
            case 5:
                this.f3391d.mo3770e(mVar);
                break;
            case 6:
                this.f3391d.mo3766a(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1046k kVar = this.f3392e;
        if (kVar != null) {
            kVar.mo289g(mVar, bVar);
        }
    }
}
