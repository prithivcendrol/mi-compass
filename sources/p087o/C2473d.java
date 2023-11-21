package p087o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p069l.C1857c;
import p069l.C1867i;
import p093p.C2522i;
import p093p.C2530o;

/* renamed from: o.d */
public class C2473d {

    /* renamed from: a */
    private HashSet<C2473d> f9527a = null;

    /* renamed from: b */
    private int f9528b;

    /* renamed from: c */
    private boolean f9529c;

    /* renamed from: d */
    public final C2476e f9530d;

    /* renamed from: e */
    public final C2475b f9531e;

    /* renamed from: f */
    public C2473d f9532f;

    /* renamed from: g */
    public int f9533g = 0;

    /* renamed from: h */
    int f9534h = Integer.MIN_VALUE;

    /* renamed from: i */
    C1867i f9535i;

    /* renamed from: o.d$a */
    static /* synthetic */ class C2474a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9536a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.d$b[] r0 = p087o.C2473d.C2475b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9536a = r0
                o.d$b r1 = p087o.C2473d.C2475b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.d$b r1 = p087o.C2473d.C2475b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.d$b r1 = p087o.C2473d.C2475b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.d$b r1 = p087o.C2473d.C2475b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x003e }
                o.d$b r1 = p087o.C2473d.C2475b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.d$b r1 = p087o.C2473d.C2475b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.d$b r1 = p087o.C2473d.C2475b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.d$b r1 = p087o.C2473d.C2475b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9536a     // Catch:{ NoSuchFieldError -> 0x006c }
                o.d$b r1 = p087o.C2473d.C2475b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p087o.C2473d.C2474a.<clinit>():void");
        }
    }

    /* renamed from: o.d$b */
    public enum C2475b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2473d(C2476e eVar, C2475b bVar) {
        this.f9530d = eVar;
        this.f9531e = bVar;
    }

    /* renamed from: a */
    public boolean mo9445a(C2473d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo9460p();
            return true;
        } else if (!z && !mo9459o(dVar)) {
            return false;
        } else {
            this.f9532f = dVar;
            if (dVar.f9527a == null) {
                dVar.f9527a = new HashSet<>();
            }
            HashSet<C2473d> hashSet = this.f9532f.f9527a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f9533g = i;
            this.f9534h = i2;
            return true;
        }
    }

    /* renamed from: b */
    public void mo9446b(int i, ArrayList<C2530o> arrayList, C2530o oVar) {
        HashSet<C2473d> hashSet = this.f9527a;
        if (hashSet != null) {
            Iterator<C2473d> it = hashSet.iterator();
            while (it.hasNext()) {
                C2522i.m10713a(it.next().f9530d, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C2473d> mo9447c() {
        return this.f9527a;
    }

    /* renamed from: d */
    public int mo9448d() {
        if (!this.f9529c) {
            return 0;
        }
        return this.f9528b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = r3.f9532f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9449e() {
        /*
            r3 = this;
            o.e r0 = r3.f9530d
            int r0 = r0.mo9501T()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f9534h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0021
            o.d r0 = r3.f9532f
            if (r0 == 0) goto L_0x0021
            o.e r0 = r0.f9530d
            int r0 = r0.mo9501T()
            if (r0 != r1) goto L_0x0021
            int r0 = r3.f9534h
            return r0
        L_0x0021:
            int r0 = r3.f9533g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2473d.mo9449e():int");
    }

    /* renamed from: f */
    public final C2473d mo9450f() {
        switch (C2474a.f9536a[this.f9531e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f9530d.f9574Q;
            case 3:
                return this.f9530d.f9572O;
            case 4:
                return this.f9530d.f9575R;
            case 5:
                return this.f9530d.f9573P;
            default:
                throw new AssertionError(this.f9531e.name());
        }
    }

    /* renamed from: g */
    public C2476e mo9451g() {
        return this.f9530d;
    }

    /* renamed from: h */
    public C1867i mo9452h() {
        return this.f9535i;
    }

    /* renamed from: i */
    public C2473d mo9453i() {
        return this.f9532f;
    }

    /* renamed from: j */
    public C2475b mo9454j() {
        return this.f9531e;
    }

    /* renamed from: k */
    public boolean mo9455k() {
        HashSet<C2473d> hashSet = this.f9527a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C2473d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo9450f().mo9458n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo9456l() {
        HashSet<C2473d> hashSet = this.f9527a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean mo9457m() {
        return this.f9529c;
    }

    /* renamed from: n */
    public boolean mo9458n() {
        return this.f9532f != null;
    }

    /* renamed from: o */
    public boolean mo9459o(C2473d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C2475b j = dVar.mo9454j();
        C2475b bVar = this.f9531e;
        if (j == bVar) {
            return bVar != C2475b.BASELINE || (dVar.mo9451g().mo9509X() && mo9451g().mo9509X());
        }
        switch (C2474a.f9536a[bVar.ordinal()]) {
            case 1:
                return (j == C2475b.BASELINE || j == C2475b.CENTER_X || j == C2475b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j == C2475b.LEFT || j == C2475b.RIGHT;
                if (!(dVar.mo9451g() instanceof C2480g)) {
                    return z2;
                }
                if (z2 || j == C2475b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = j == C2475b.TOP || j == C2475b.BOTTOM;
                if (!(dVar.mo9451g() instanceof C2480g)) {
                    return z3;
                }
                if (z3 || j == C2475b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
                return (j == C2475b.LEFT || j == C2475b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f9531e.name());
        }
    }

    /* renamed from: p */
    public void mo9460p() {
        HashSet<C2473d> hashSet;
        C2473d dVar = this.f9532f;
        if (!(dVar == null || (hashSet = dVar.f9527a) == null)) {
            hashSet.remove(this);
            if (this.f9532f.f9527a.size() == 0) {
                this.f9532f.f9527a = null;
            }
        }
        this.f9527a = null;
        this.f9532f = null;
        this.f9533g = 0;
        this.f9534h = Integer.MIN_VALUE;
        this.f9529c = false;
        this.f9528b = 0;
    }

    /* renamed from: q */
    public void mo9461q() {
        this.f9529c = false;
        this.f9528b = 0;
    }

    /* renamed from: r */
    public void mo9462r(C1857c cVar) {
        C1867i iVar = this.f9535i;
        if (iVar == null) {
            this.f9535i = new C1867i(C1867i.C1868a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo6427e();
        }
    }

    /* renamed from: s */
    public void mo9463s(int i) {
        this.f9528b = i;
        this.f9529c = true;
    }

    public String toString() {
        return this.f9530d.mo9553r() + ":" + this.f9531e.toString();
    }
}
