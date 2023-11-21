package p087o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p069l.C1857c;
import p069l.C1858d;
import p081n.C2410a;
import p087o.C2473d;
import p093p.C2515c;
import p093p.C2518f;
import p093p.C2525l;
import p093p.C2528n;
import p093p.C2532p;

/* renamed from: o.e */
public class C2476e {

    /* renamed from: K0 */
    public static float f9547K0 = 0.5f;

    /* renamed from: A */
    public int f9548A = 0;

    /* renamed from: A0 */
    int f9549A0;

    /* renamed from: B */
    public float f9550B = 1.0f;

    /* renamed from: B0 */
    boolean f9551B0;

    /* renamed from: C */
    public int f9552C = 0;

    /* renamed from: C0 */
    boolean f9553C0;

    /* renamed from: D */
    public int f9554D = 0;

    /* renamed from: D0 */
    public float[] f9555D0;

    /* renamed from: E */
    public float f9556E = 1.0f;

    /* renamed from: E0 */
    protected C2476e[] f9557E0;

    /* renamed from: F */
    int f9558F = -1;

    /* renamed from: F0 */
    protected C2476e[] f9559F0;

    /* renamed from: G */
    float f9560G = 1.0f;

    /* renamed from: G0 */
    C2476e f9561G0;

    /* renamed from: H */
    private int[] f9562H = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: H0 */
    C2476e f9563H0;

    /* renamed from: I */
    private float f9564I = 0.0f;

    /* renamed from: I0 */
    public int f9565I0;

    /* renamed from: J */
    private boolean f9566J = false;

    /* renamed from: J0 */
    public int f9567J0;

    /* renamed from: K */
    private boolean f9568K;

    /* renamed from: L */
    private boolean f9569L = false;

    /* renamed from: M */
    private int f9570M = 0;

    /* renamed from: N */
    private int f9571N = 0;

    /* renamed from: O */
    public C2473d f9572O = new C2473d(this, C2473d.C2475b.LEFT);

    /* renamed from: P */
    public C2473d f9573P = new C2473d(this, C2473d.C2475b.TOP);

    /* renamed from: Q */
    public C2473d f9574Q = new C2473d(this, C2473d.C2475b.RIGHT);

    /* renamed from: R */
    public C2473d f9575R = new C2473d(this, C2473d.C2475b.BOTTOM);

    /* renamed from: S */
    public C2473d f9576S = new C2473d(this, C2473d.C2475b.BASELINE);

    /* renamed from: T */
    C2473d f9577T = new C2473d(this, C2473d.C2475b.CENTER_X);

    /* renamed from: U */
    C2473d f9578U = new C2473d(this, C2473d.C2475b.CENTER_Y);

    /* renamed from: V */
    public C2473d f9579V;

    /* renamed from: W */
    public C2473d[] f9580W;

    /* renamed from: X */
    protected ArrayList<C2473d> f9581X;

    /* renamed from: Y */
    private boolean[] f9582Y;

    /* renamed from: Z */
    public C2478b[] f9583Z;

    /* renamed from: a */
    public boolean f9584a = false;

    /* renamed from: a0 */
    public C2476e f9585a0;

    /* renamed from: b */
    public C2532p[] f9586b = new C2532p[2];

    /* renamed from: b0 */
    int f9587b0;

    /* renamed from: c */
    public C2515c f9588c;

    /* renamed from: c0 */
    int f9589c0;

    /* renamed from: d */
    public C2515c f9590d;

    /* renamed from: d0 */
    public float f9591d0;

    /* renamed from: e */
    public C2525l f9592e = null;

    /* renamed from: e0 */
    protected int f9593e0;

    /* renamed from: f */
    public C2528n f9594f = null;

    /* renamed from: f0 */
    protected int f9595f0;

    /* renamed from: g */
    public boolean[] f9596g = {true, true};

    /* renamed from: g0 */
    protected int f9597g0;

    /* renamed from: h */
    boolean f9598h = false;

    /* renamed from: h0 */
    int f9599h0;

    /* renamed from: i */
    private boolean f9600i = true;

    /* renamed from: i0 */
    int f9601i0;

    /* renamed from: j */
    private boolean f9602j = false;

    /* renamed from: j0 */
    protected int f9603j0;

    /* renamed from: k */
    private boolean f9604k = true;

    /* renamed from: k0 */
    protected int f9605k0;

    /* renamed from: l */
    private int f9606l = -1;

    /* renamed from: l0 */
    int f9607l0;

    /* renamed from: m */
    private int f9608m = -1;

    /* renamed from: m0 */
    protected int f9609m0;

    /* renamed from: n */
    public C2410a f9610n = new C2410a(this);

    /* renamed from: n0 */
    protected int f9611n0;

    /* renamed from: o */
    public String f9612o;

    /* renamed from: o0 */
    float f9613o0;

    /* renamed from: p */
    private boolean f9614p = false;

    /* renamed from: p0 */
    float f9615p0;

    /* renamed from: q */
    private boolean f9616q = false;

    /* renamed from: q0 */
    private Object f9617q0;

    /* renamed from: r */
    private boolean f9618r = false;

    /* renamed from: r0 */
    private int f9619r0;

    /* renamed from: s */
    private boolean f9620s = false;

    /* renamed from: s0 */
    private int f9621s0;

    /* renamed from: t */
    public int f9622t = -1;

    /* renamed from: t0 */
    private boolean f9623t0;

    /* renamed from: u */
    public int f9624u = -1;

    /* renamed from: u0 */
    private String f9625u0;

    /* renamed from: v */
    private int f9626v = 0;

    /* renamed from: v0 */
    private String f9627v0;

    /* renamed from: w */
    public int f9628w = 0;

    /* renamed from: w0 */
    boolean f9629w0;

    /* renamed from: x */
    public int f9630x = 0;

    /* renamed from: x0 */
    boolean f9631x0;

    /* renamed from: y */
    public int[] f9632y = new int[2];

    /* renamed from: y0 */
    boolean f9633y0;

    /* renamed from: z */
    public int f9634z = 0;

    /* renamed from: z0 */
    int f9635z0;

    /* renamed from: o.e$a */
    static /* synthetic */ class C2477a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9636a;

        /* renamed from: b */
        static final /* synthetic */ int[] f9637b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                o.e$b[] r0 = p087o.C2476e.C2478b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9637b = r0
                r1 = 1
                o.e$b r2 = p087o.C2476e.C2478b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9637b     // Catch:{ NoSuchFieldError -> 0x001d }
                o.e$b r3 = p087o.C2476e.C2478b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9637b     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.e$b r4 = p087o.C2476e.C2478b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9637b     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.e$b r5 = p087o.C2476e.C2478b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                o.d$b[] r4 = p087o.C2473d.C2475b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f9636a = r4
                o.d$b r5 = p087o.C2473d.C2475b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f9636a     // Catch:{ NoSuchFieldError -> 0x004e }
                o.d$b r4 = p087o.C2473d.C2475b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x0058 }
                o.d$b r1 = p087o.C2473d.C2475b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.d$b r1 = p087o.C2473d.C2475b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x006d }
                o.d$b r1 = p087o.C2473d.C2475b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.d$b r1 = p087o.C2473d.C2475b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x0083 }
                o.d$b r1 = p087o.C2473d.C2475b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x008f }
                o.d$b r1 = p087o.C2473d.C2475b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f9636a     // Catch:{ NoSuchFieldError -> 0x009b }
                o.d$b r1 = p087o.C2473d.C2475b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.C2477a.<clinit>():void");
        }
    }

    /* renamed from: o.e$b */
    public enum C2478b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C2476e() {
        C2473d dVar = new C2473d(this, C2473d.C2475b.CENTER);
        this.f9579V = dVar;
        this.f9580W = new C2473d[]{this.f9572O, this.f9574Q, this.f9573P, this.f9575R, this.f9576S, dVar};
        this.f9581X = new ArrayList<>();
        this.f9582Y = new boolean[2];
        C2478b bVar = C2478b.FIXED;
        this.f9583Z = new C2478b[]{bVar, bVar};
        this.f9585a0 = null;
        this.f9587b0 = 0;
        this.f9589c0 = 0;
        this.f9591d0 = 0.0f;
        this.f9593e0 = -1;
        this.f9595f0 = 0;
        this.f9597g0 = 0;
        this.f9599h0 = 0;
        this.f9601i0 = 0;
        this.f9603j0 = 0;
        this.f9605k0 = 0;
        this.f9607l0 = 0;
        float f = f9547K0;
        this.f9613o0 = f;
        this.f9615p0 = f;
        this.f9619r0 = 0;
        this.f9621s0 = 0;
        this.f9623t0 = false;
        this.f9625u0 = null;
        this.f9627v0 = null;
        this.f9633y0 = false;
        this.f9635z0 = 0;
        this.f9549A0 = 0;
        this.f9555D0 = new float[]{-1.0f, -1.0f};
        this.f9557E0 = new C2476e[]{null, null};
        this.f9559F0 = new C2476e[]{null, null};
        this.f9561G0 = null;
        this.f9563H0 = null;
        this.f9565I0 = -1;
        this.f9567J0 = -1;
        m10462d();
    }

    /* renamed from: N */
    private void m10460N(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        m10466v0(sb, "      size", i, 0);
        m10466v0(sb, "      min", i2, 0);
        m10466v0(sb, "      max", i3, Integer.MAX_VALUE);
        m10466v0(sb, "      matchMin", i5, 0);
        m10466v0(sb, "      matchDef", i6, 0);
        m10465u0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: O */
    private void m10461O(StringBuilder sb, String str, C2473d dVar) {
        if (dVar.f9532f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(dVar.f9532f);
            sb.append("'");
            if (!(dVar.f9534h == Integer.MIN_VALUE && dVar.f9533g == 0)) {
                sb.append(",");
                sb.append(dVar.f9533g);
                if (dVar.f9534h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(dVar.f9534h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    /* renamed from: d */
    private void m10462d() {
        this.f9581X.add(this.f9572O);
        this.f9581X.add(this.f9573P);
        this.f9581X.add(this.f9574Q);
        this.f9581X.add(this.f9575R);
        this.f9581X.add(this.f9577T);
        this.f9581X.add(this.f9578U);
        this.f9581X.add(this.f9579V);
        this.f9581X.add(this.f9576S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
        r0 = r5.f9532f;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10463d0(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            o.d[] r0 = r4.f9580W
            r1 = r0[r5]
            o.d r2 = r1.f9532f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            o.d r2 = r2.f9532f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            o.d r0 = r5.f9532f
            if (r0 == 0) goto L_0x001b
            o.d r0 = r0.f9532f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.m10463d0(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0488, code lost:
        if ((r4 instanceof p087o.C2470a) != false) goto L_0x048d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0473 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x057e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:374:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:378:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10464i(p069l.C1858d r38, boolean r39, boolean r40, boolean r41, boolean r42, p069l.C1867i r43, p069l.C1867i r44, p087o.C2476e.C2478b r45, boolean r46, p087o.C2473d r47, p087o.C2473d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            r37 = this;
            r0 = r37
            r10 = r38
            r11 = r43
            r12 = r44
            r13 = r47
            r14 = r48
            r15 = r51
            r1 = r52
            r2 = r60
            r3 = r61
            r4 = r62
            l.i r9 = r10.mo6406q(r13)
            l.i r8 = r10.mo6406q(r14)
            o.d r5 = r47.mo9453i()
            l.i r7 = r10.mo6406q(r5)
            o.d r5 = r48.mo9453i()
            l.i r6 = r10.mo6406q(r5)
            p069l.C1858d.m7717w()
            boolean r16 = r47.mo9458n()
            boolean r17 = r48.mo9458n()
            o.d r5 = r0.f9579V
            boolean r18 = r5.mo9458n()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r54 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r59
        L_0x0051:
            int[] r20 = p087o.C2476e.C2477a.f9637b
            int r21 = r45.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f9606l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r39 == 0) goto L_0x007d
            r0.f9606l = r14
            r50 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f9608m
            if (r2 == r14) goto L_0x0088
            if (r39 != 0) goto L_0x0088
            r0.f9608m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r50
        L_0x008a:
            int r14 = r0.f9621s0
            r50 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r50
        L_0x0098:
            if (r64 == 0) goto L_0x00bb
            if (r16 != 0) goto L_0x00a6
            if (r17 != 0) goto L_0x00a6
            if (r18 != 0) goto L_0x00a6
            r2 = r49
            r10.mo6397f(r9, r2)
            goto L_0x00b6
        L_0x00a6:
            if (r16 == 0) goto L_0x00b6
            if (r17 != 0) goto L_0x00b6
            int r2 = r47.mo9449e()
            r24 = r6
            r6 = 8
            r10.mo6396e(r9, r7, r2, r6)
            goto L_0x00be
        L_0x00b6:
            r24 = r6
            r6 = 8
            goto L_0x00be
        L_0x00bb:
            r24 = r6
            r6 = r2
        L_0x00be:
            if (r19 != 0) goto L_0x00e8
            if (r46 == 0) goto L_0x00d7
            r2 = 3
            r6 = 0
            r10.mo6396e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00ce
            r10.mo6399h(r8, r9, r15, r2)
        L_0x00ce:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00db
            r10.mo6401j(r8, r9, r1, r2)
            goto L_0x00db
        L_0x00d7:
            r2 = r6
            r10.mo6396e(r8, r9, r14, r2)
        L_0x00db:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
        L_0x00e4:
            r24 = r3
            goto L_0x01d4
        L_0x00e8:
            r1 = 2
            if (r5 == r1) goto L_0x010b
            if (r54 != 0) goto L_0x010b
            r1 = 1
            if (r12 == r1) goto L_0x00f2
            if (r12 != 0) goto L_0x010b
        L_0x00f2:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00fc
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00fc:
            r2 = 8
            r10.mo6396e(r8, r9, r1, r2)
            r19 = r42
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e4
        L_0x010b:
            r1 = -2
            if (r3 != r1) goto L_0x0110
            r2 = r14
            goto L_0x0111
        L_0x0110:
            r2 = r3
        L_0x0111:
            if (r4 != r1) goto L_0x0115
            r1 = r14
            goto L_0x0116
        L_0x0115:
            r1 = r4
        L_0x0116:
            if (r14 <= 0) goto L_0x011c
            r3 = 1
            if (r12 == r3) goto L_0x011c
            r14 = 0
        L_0x011c:
            if (r2 <= 0) goto L_0x0127
            r3 = 8
            r10.mo6399h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0127:
            if (r1 <= 0) goto L_0x0140
            if (r40 == 0) goto L_0x0130
            r3 = 1
            if (r12 != r3) goto L_0x0130
            r3 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 1
        L_0x0131:
            if (r3 == 0) goto L_0x0139
            r3 = 8
            r10.mo6401j(r8, r9, r1, r3)
            goto L_0x013b
        L_0x0139:
            r3 = 8
        L_0x013b:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x0142
        L_0x0140:
            r3 = 8
        L_0x0142:
            r4 = 1
            if (r12 != r4) goto L_0x0160
            if (r40 == 0) goto L_0x014b
            r10.mo6396e(r8, r9, r14, r3)
            goto L_0x0152
        L_0x014b:
            r4 = 5
            r10.mo6396e(r8, r9, r14, r4)
            r10.mo6401j(r8, r9, r14, r3)
        L_0x0152:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
            r24 = r2
            r2 = r7
            goto L_0x01d4
        L_0x0160:
            r3 = 2
            if (r12 != r3) goto L_0x01c3
            o.d$b r3 = r47.mo9454j()
            o.d$b r4 = p087o.C2473d.C2475b.TOP
            if (r3 == r4) goto L_0x0185
            o.d$b r3 = r47.mo9454j()
            o.d$b r6 = p087o.C2473d.C2475b.BOTTOM
            if (r3 != r6) goto L_0x0174
            goto L_0x0185
        L_0x0174:
            o.e r3 = r0.f9585a0
            o.d$b r4 = p087o.C2473d.C2475b.LEFT
            o.d r3 = r3.mo9542m(r4)
            l.i r3 = r10.mo6406q(r3)
            o.e r4 = r0.f9585a0
            o.d$b r6 = p087o.C2473d.C2475b.RIGHT
            goto L_0x0193
        L_0x0185:
            o.e r3 = r0.f9585a0
            o.d r3 = r3.mo9542m(r4)
            l.i r3 = r10.mo6406q(r3)
            o.e r4 = r0.f9585a0
            o.d$b r6 = p087o.C2473d.C2475b.BOTTOM
        L_0x0193:
            o.d r4 = r4.mo9542m(r6)
            l.i r4 = r10.mo6406q(r4)
            r14 = r3
            r6 = r4
            l.b r3 = r38.mo6407r()
            r4 = r8
            r46 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r52 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r63
            l.b r3 = r3.mo6376k(r4, r5, r6, r7, r8)
            r10.mo6395d(r3)
            if (r40 == 0) goto L_0x01ba
            r19 = 0
        L_0x01ba:
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = r42
            goto L_0x01d4
        L_0x01c3:
            r46 = r1
            r52 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = 1
        L_0x01d4:
            if (r64 == 0) goto L_0x0573
            if (r56 == 0) goto L_0x01da
            goto L_0x0573
        L_0x01da:
            if (r16 != 0) goto L_0x01e5
            if (r17 != 0) goto L_0x01e5
            if (r18 != 0) goto L_0x01e5
        L_0x01e0:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x0543
        L_0x01e5:
            if (r16 == 0) goto L_0x01fe
            if (r17 != 0) goto L_0x01fe
            o.d r1 = r13.f9532f
            o.e r1 = r1.f9530d
            if (r40 == 0) goto L_0x01f6
            boolean r1 = r1 instanceof p087o.C2470a
            if (r1 == 0) goto L_0x01f6
            r2 = 8
            goto L_0x01f7
        L_0x01f6:
            r2 = 5
        L_0x01f7:
            r20 = r40
            r1 = r2
        L_0x01fa:
            r2 = r15
        L_0x01fb:
            r3 = 0
            goto L_0x0545
        L_0x01fe:
            if (r16 != 0) goto L_0x022e
            if (r17 == 0) goto L_0x022e
            int r1 = r48.mo9449e()
            int r1 = -r1
            r2 = 8
            r10.mo6396e(r14, r15, r1, r2)
            if (r40 == 0) goto L_0x01e0
            boolean r1 = r0.f9602j
            if (r1 == 0) goto L_0x0226
            boolean r1 = r9.f7212j
            if (r1 == 0) goto L_0x0226
            o.e r1 = r0.f9585a0
            if (r1 == 0) goto L_0x0226
            o.f r1 = (p087o.C2479f) r1
            if (r39 == 0) goto L_0x0222
            r1.mo9593w1(r13)
            goto L_0x01e0
        L_0x0222:
            r1.mo9569B1(r13)
            goto L_0x01e0
        L_0x0226:
            r1 = 5
            r3 = 0
            r10.mo6399h(r9, r11, r3, r1)
            r2 = r15
            goto L_0x0543
        L_0x022e:
            r3 = 0
            if (r16 == 0) goto L_0x0541
            if (r17 == 0) goto L_0x0541
            o.d r1 = r13.f9532f
            o.e r8 = r1.f9530d
            r6 = r48
            r7 = r3
            o.d r1 = r6.f9532f
            o.e r5 = r1.f9530d
            o.e r3 = r37.mo9481I()
            r16 = 6
            if (r25 == 0) goto L_0x03ab
            if (r12 != 0) goto L_0x02ae
            if (r4 != 0) goto L_0x0272
            if (r24 != 0) goto L_0x0272
            boolean r1 = r2.f7212j
            if (r1 == 0) goto L_0x0266
            boolean r1 = r15.f7212j
            if (r1 == 0) goto L_0x0266
            int r1 = r47.mo9449e()
            r4 = 8
            r10.mo6396e(r9, r2, r1, r4)
            int r1 = r48.mo9449e()
            int r1 = -r1
            r10.mo6396e(r14, r15, r1, r4)
            return
        L_0x0266:
            r4 = 8
            r1 = r4
            r17 = r1
            r18 = r7
            r23 = r18
            r21 = 1
            goto L_0x027d
        L_0x0272:
            r4 = 8
            r21 = r7
            r1 = 5
            r17 = 5
            r18 = 1
            r23 = 1
        L_0x027d:
            boolean r4 = r8 instanceof p087o.C2470a
            if (r4 != 0) goto L_0x0298
            boolean r4 = r5 instanceof p087o.C2470a
            if (r4 == 0) goto L_0x0286
            goto L_0x0298
        L_0x0286:
            r4 = r44
            r20 = r16
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            goto L_0x02a9
        L_0x0298:
            r4 = r44
            r20 = r16
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r22 = 4
        L_0x02a9:
            r23 = r1
            r1 = 3
            goto L_0x03ff
        L_0x02ae:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02d8
            boolean r1 = r8 instanceof p087o.C2470a
            if (r1 != 0) goto L_0x02c9
            boolean r1 = r5 instanceof p087o.C2470a
            if (r1 == 0) goto L_0x02bc
            goto L_0x02c9
        L_0x02bc:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 5
            goto L_0x02d5
        L_0x02c9:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
        L_0x02d5:
            r23 = 5
            goto L_0x02e9
        L_0x02d8:
            r1 = 1
            if (r12 != r1) goto L_0x02ef
            r4 = r44
            r28 = r7
            r20 = r16
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
        L_0x02e9:
            r26 = 1
            r27 = 1
            goto L_0x03ff
        L_0x02ef:
            r1 = 3
            if (r12 != r1) goto L_0x039b
            int r1 = r0.f9558F
            r7 = -1
            if (r1 != r7) goto L_0x031b
            r4 = r44
            if (r57 == 0) goto L_0x0309
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            if (r40 == 0) goto L_0x0306
            r20 = 5
            goto L_0x0311
        L_0x0306:
            r20 = 4
            goto L_0x0311
        L_0x0309:
            r20 = r17
            r23 = r20
            r1 = 3
            r7 = 1
            r18 = 5
        L_0x0311:
            r22 = 5
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x03ff
        L_0x031b:
            if (r54 == 0) goto L_0x0345
            r1 = r60
            r7 = 2
            if (r1 == r7) goto L_0x0328
            r7 = 1
            if (r1 != r7) goto L_0x0326
            goto L_0x0329
        L_0x0326:
            r1 = 0
            goto L_0x032a
        L_0x0328:
            r7 = 1
        L_0x0329:
            r1 = r7
        L_0x032a:
            if (r1 != 0) goto L_0x0330
            r1 = r17
            r4 = 5
            goto L_0x0332
        L_0x0330:
            r1 = 5
            r4 = 4
        L_0x0332:
            r23 = r1
            r22 = r4
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r4 = r44
            goto L_0x03ff
        L_0x0345:
            r7 = 1
            if (r4 <= 0) goto L_0x0358
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 5
            goto L_0x0397
        L_0x0358:
            if (r4 != 0) goto L_0x0388
            if (r24 != 0) goto L_0x0388
            if (r57 != 0) goto L_0x036e
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r22 = r17
            r1 = 3
            r18 = 5
            goto L_0x0397
        L_0x036e:
            if (r8 == r3) goto L_0x0374
            if (r5 == r3) goto L_0x0374
            r1 = 4
            goto L_0x0375
        L_0x0374:
            r1 = 5
        L_0x0375:
            r4 = r44
            r23 = r1
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x03ff
        L_0x0388:
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
        L_0x0397:
            r23 = 5
            goto L_0x03ff
        L_0x039b:
            r7 = 1
            r4 = r44
            r20 = r16
            r18 = 5
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
            goto L_0x03fd
        L_0x03ab:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f7212j
            if (r1 == 0) goto L_0x03ee
            boolean r1 = r15.f7212j
            if (r1 == 0) goto L_0x03ee
            int r1 = r47.mo9449e()
            int r3 = r48.mo9449e()
            r4 = 8
            r54 = r38
            r55 = r9
            r56 = r2
            r57 = r1
            r58 = r53
            r59 = r15
            r60 = r14
            r61 = r3
            r62 = r4
            r54.mo6394c(r55, r56, r57, r58, r59, r60, r61, r62)
            if (r40 == 0) goto L_0x03ed
            if (r19 == 0) goto L_0x03ed
            o.d r1 = r6.f9532f
            if (r1 == 0) goto L_0x03e4
            int r1 = r48.mo9449e()
            r4 = r44
            goto L_0x03e7
        L_0x03e4:
            r4 = r44
            r1 = 0
        L_0x03e7:
            if (r15 == r4) goto L_0x03ed
            r2 = 5
            r10.mo6399h(r4, r14, r1, r2)
        L_0x03ed:
            return
        L_0x03ee:
            r4 = r44
            r1 = 3
            r18 = 5
            r26 = r7
            r27 = r26
            r20 = r16
            r23 = r18
            r22 = 4
        L_0x03fd:
            r28 = 0
        L_0x03ff:
            if (r26 == 0) goto L_0x040a
            if (r2 != r15) goto L_0x040a
            if (r8 == r3) goto L_0x040a
            r26 = 0
            r29 = 0
            goto L_0x040c
        L_0x040a:
            r29 = r7
        L_0x040c:
            if (r27 == 0) goto L_0x0455
            if (r25 != 0) goto L_0x0421
            if (r55 != 0) goto L_0x0421
            if (r57 != 0) goto L_0x0421
            if (r2 != r11) goto L_0x0421
            if (r15 != r4) goto L_0x0421
            r23 = r17
            r27 = r23
            r20 = 0
            r29 = 0
            goto L_0x0425
        L_0x0421:
            r27 = r20
            r20 = r40
        L_0x0425:
            int r30 = r47.mo9449e()
            int r31 = r48.mo9449e()
            r13 = r1
            r1 = r38
            r42 = r2
            r13 = r17
            r17 = 4
            r36 = r18
            r18 = r7
            r7 = r36
            r2 = r9
            r32 = r3
            r3 = r42
            r4 = r30
            r33 = r5
            r5 = r53
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.mo6394c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0467
        L_0x0455:
            r42 = r2
            r32 = r3
            r33 = r5
            r18 = r7
            r34 = r8
            r35 = r9
            r13 = r17
            r17 = 4
            r20 = r40
        L_0x0467:
            r2 = r29
            int r1 = r0.f9621s0
            if (r1 != r13) goto L_0x0474
            boolean r1 = r48.mo9456l()
            if (r1 != 0) goto L_0x0474
            return
        L_0x0474:
            r1 = r42
            if (r26 == 0) goto L_0x04aa
            if (r20 == 0) goto L_0x0490
            if (r1 == r15) goto L_0x0490
            if (r25 != 0) goto L_0x0490
            r3 = r34
            boolean r4 = r3 instanceof p087o.C2470a
            if (r4 != 0) goto L_0x048b
            r4 = r33
            boolean r5 = r4 instanceof p087o.C2470a
            if (r5 == 0) goto L_0x0494
            goto L_0x048d
        L_0x048b:
            r4 = r33
        L_0x048d:
            r5 = r16
            goto L_0x0496
        L_0x0490:
            r4 = r33
            r3 = r34
        L_0x0494:
            r5 = r23
        L_0x0496:
            int r6 = r47.mo9449e()
            r8 = r35
            r10.mo6399h(r8, r1, r6, r5)
            int r6 = r48.mo9449e()
            int r6 = -r6
            r10.mo6401j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x04b0
        L_0x04aa:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x04b0:
            if (r20 == 0) goto L_0x04c6
            if (r58 == 0) goto L_0x04c6
            boolean r5 = r3 instanceof p087o.C2470a
            if (r5 != 0) goto L_0x04c6
            boolean r5 = r4 instanceof p087o.C2470a
            if (r5 != 0) goto L_0x04c6
            r5 = r32
            if (r4 == r5) goto L_0x04c8
            r6 = r16
            r7 = r6
            r2 = r18
            goto L_0x04cc
        L_0x04c6:
            r5 = r32
        L_0x04c8:
            r6 = r22
            r7 = r23
        L_0x04cc:
            if (r2 == 0) goto L_0x0517
            if (r28 == 0) goto L_0x04f7
            if (r57 == 0) goto L_0x04d4
            if (r41 == 0) goto L_0x04f7
        L_0x04d4:
            if (r3 == r5) goto L_0x04db
            if (r4 != r5) goto L_0x04d9
            goto L_0x04db
        L_0x04d9:
            r2 = r6
            goto L_0x04dd
        L_0x04db:
            r2 = r16
        L_0x04dd:
            boolean r9 = r3 instanceof p087o.C2480g
            if (r9 != 0) goto L_0x04e5
            boolean r9 = r4 instanceof p087o.C2480g
            if (r9 == 0) goto L_0x04e6
        L_0x04e5:
            r2 = 5
        L_0x04e6:
            boolean r9 = r3 instanceof p087o.C2470a
            if (r9 != 0) goto L_0x04ee
            boolean r9 = r4 instanceof p087o.C2470a
            if (r9 == 0) goto L_0x04ef
        L_0x04ee:
            r2 = 5
        L_0x04ef:
            if (r57 == 0) goto L_0x04f2
            r2 = 5
        L_0x04f2:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x04f8
        L_0x04f7:
            r2 = r6
        L_0x04f8:
            if (r20 == 0) goto L_0x0508
            int r2 = java.lang.Math.min(r7, r2)
            if (r54 == 0) goto L_0x0508
            if (r57 != 0) goto L_0x0508
            if (r3 == r5) goto L_0x0506
            if (r4 != r5) goto L_0x0508
        L_0x0506:
            r2 = r17
        L_0x0508:
            int r3 = r47.mo9449e()
            r10.mo6396e(r8, r1, r3, r2)
            int r3 = r48.mo9449e()
            int r3 = -r3
            r10.mo6396e(r14, r15, r3, r2)
        L_0x0517:
            if (r20 == 0) goto L_0x0528
            if (r11 != r1) goto L_0x0520
            int r2 = r47.mo9449e()
            goto L_0x0521
        L_0x0520:
            r2 = 0
        L_0x0521:
            if (r1 == r11) goto L_0x0528
            r1 = 5
            r10.mo6399h(r8, r11, r2, r1)
            goto L_0x0529
        L_0x0528:
            r1 = 5
        L_0x0529:
            if (r20 == 0) goto L_0x01fa
            if (r25 == 0) goto L_0x01fa
            r2 = r15
            if (r51 != 0) goto L_0x01fb
            if (r24 != 0) goto L_0x01fb
            if (r25 == 0) goto L_0x053c
            r3 = 3
            if (r12 != r3) goto L_0x053c
            r3 = 0
            r10.mo6399h(r14, r8, r3, r13)
            goto L_0x0545
        L_0x053c:
            r3 = 0
            r10.mo6399h(r14, r8, r3, r1)
            goto L_0x0545
        L_0x0541:
            r2 = r15
            r1 = 5
        L_0x0543:
            r20 = r40
        L_0x0545:
            if (r20 == 0) goto L_0x0572
            if (r19 == 0) goto L_0x0572
            r4 = r48
            o.d r5 = r4.f9532f
            if (r5 == 0) goto L_0x0553
            int r3 = r48.mo9449e()
        L_0x0553:
            r5 = r44
            if (r2 == r5) goto L_0x0572
            boolean r2 = r0.f9602j
            if (r2 == 0) goto L_0x056f
            boolean r2 = r14.f7212j
            if (r2 == 0) goto L_0x056f
            o.e r2 = r0.f9585a0
            if (r2 == 0) goto L_0x056f
            o.f r2 = (p087o.C2479f) r2
            if (r39 == 0) goto L_0x056b
            r2.mo9592v1(r4)
            goto L_0x056e
        L_0x056b:
            r2.mo9568A1(r4)
        L_0x056e:
            return
        L_0x056f:
            r10.mo6399h(r5, r14, r3, r1)
        L_0x0572:
            return
        L_0x0573:
            r5 = r44
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            if (r1 >= r7) goto L_0x05b8
            if (r40 == 0) goto L_0x05b8
            if (r19 == 0) goto L_0x05b8
            r10.mo6399h(r8, r11, r3, r13)
            if (r39 != 0) goto L_0x0590
            o.d r1 = r0.f9576S
            o.d r1 = r1.f9532f
            if (r1 != 0) goto L_0x058e
            goto L_0x0590
        L_0x058e:
            r2 = r3
            goto L_0x0592
        L_0x0590:
            r2 = r18
        L_0x0592:
            if (r39 != 0) goto L_0x05b3
            o.d r1 = r0.f9576S
            o.d r1 = r1.f9532f
            if (r1 == 0) goto L_0x05b3
            o.e r1 = r1.f9530d
            float r2 = r1.f9591d0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05b2
            o.e$b[] r1 = r1.f9583Z
            r2 = r1[r3]
            o.e$b r4 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x05b2
            r1 = r1[r18]
            if (r1 != r4) goto L_0x05b2
            r2 = r18
            goto L_0x05b3
        L_0x05b2:
            r2 = r3
        L_0x05b3:
            if (r2 == 0) goto L_0x05b8
            r10.mo6399h(r5, r14, r3, r13)
        L_0x05b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.m10464i(l.d, boolean, boolean, boolean, boolean, l.i, l.i, o.e$b, boolean, o.d, o.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: u0 */
    private void m10465u0(StringBuilder sb, String str, float f, float f2) {
        if (f != f2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* renamed from: v0 */
    private void m10466v0(StringBuilder sb, String str, int i, int i2) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    /* renamed from: w0 */
    private void m10467w0(StringBuilder sb, String str, float f, int i) {
        if (f != 0.0f) {
            sb.append(str);
            sb.append(" :  [");
            sb.append(f);
            sb.append(",");
            sb.append(i);
            sb.append("");
            sb.append("],\n");
        }
    }

    /* renamed from: A */
    public int mo9465A() {
        return this.f9570M;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9466A0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f9591d0 = r9
            r8.f9593e0 = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f9591d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.mo9466A0(java.lang.String):void");
    }

    /* renamed from: B */
    public int mo9467B() {
        return this.f9571N;
    }

    /* renamed from: B0 */
    public void mo9468B0(int i) {
        if (this.f9566J) {
            int i2 = i - this.f9607l0;
            int i3 = this.f9589c0 + i2;
            this.f9597g0 = i2;
            this.f9573P.mo9463s(i2);
            this.f9575R.mo9463s(i3);
            this.f9576S.mo9463s(i);
            this.f9616q = true;
        }
    }

    /* renamed from: C */
    public int mo9469C(int i) {
        if (i == 0) {
            return mo9503U();
        }
        if (i == 1) {
            return mo9560v();
        }
        return 0;
    }

    /* renamed from: C0 */
    public void mo9470C0(int i, int i2) {
        if (!this.f9614p) {
            this.f9572O.mo9463s(i);
            this.f9574Q.mo9463s(i2);
            this.f9595f0 = i;
            this.f9587b0 = i2 - i;
            this.f9614p = true;
        }
    }

    /* renamed from: D */
    public int mo9471D() {
        return this.f9562H[1];
    }

    /* renamed from: D0 */
    public void mo9472D0(int i) {
        this.f9572O.mo9463s(i);
        this.f9595f0 = i;
    }

    /* renamed from: E */
    public int mo9473E() {
        return this.f9562H[0];
    }

    /* renamed from: E0 */
    public void mo9474E0(int i) {
        this.f9573P.mo9463s(i);
        this.f9597g0 = i;
    }

    /* renamed from: F */
    public int mo9475F() {
        return this.f9611n0;
    }

    /* renamed from: F0 */
    public void mo9476F0(int i, int i2) {
        if (!this.f9616q) {
            this.f9573P.mo9463s(i);
            this.f9575R.mo9463s(i2);
            this.f9597g0 = i;
            this.f9589c0 = i2 - i;
            if (this.f9566J) {
                this.f9576S.mo9463s(i + this.f9607l0);
            }
            this.f9616q = true;
        }
    }

    /* renamed from: G */
    public int mo9477G() {
        return this.f9609m0;
    }

    /* renamed from: G0 */
    public void mo9478G0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f9595f0 = i;
        this.f9597g0 = i2;
        if (this.f9621s0 == 8) {
            this.f9587b0 = 0;
            this.f9589c0 = 0;
            return;
        }
        C2478b[] bVarArr = this.f9583Z;
        C2478b bVar = bVarArr[0];
        C2478b bVar2 = C2478b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.f9587b0)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.f9589c0)) {
            i8 = i5;
        }
        this.f9587b0 = i7;
        this.f9589c0 = i8;
        int i9 = this.f9611n0;
        if (i8 < i9) {
            this.f9589c0 = i9;
        }
        int i10 = this.f9609m0;
        if (i7 < i10) {
            this.f9587b0 = i10;
        }
        int i11 = this.f9548A;
        if (i11 > 0 && bVar == C2478b.MATCH_CONSTRAINT) {
            this.f9587b0 = Math.min(this.f9587b0, i11);
        }
        int i12 = this.f9554D;
        if (i12 > 0 && this.f9583Z[1] == C2478b.MATCH_CONSTRAINT) {
            this.f9589c0 = Math.min(this.f9589c0, i12);
        }
        int i13 = this.f9587b0;
        if (i7 != i13) {
            this.f9606l = i13;
        }
        int i14 = this.f9589c0;
        if (i8 != i14) {
            this.f9608m = i14;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f9575R;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p087o.C2476e mo9479H(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            o.d r3 = r2.f9574Q
            o.d r0 = r3.f9532f
            if (r0 == 0) goto L_0x001f
            o.d r1 = r0.f9532f
            if (r1 != r3) goto L_0x001f
            o.e r3 = r0.f9530d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            o.d r3 = r2.f9575R
            o.d r0 = r3.f9532f
            if (r0 == 0) goto L_0x001f
            o.d r1 = r0.f9532f
            if (r1 != r3) goto L_0x001f
            o.e r3 = r0.f9530d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.mo9479H(int):o.e");
    }

    /* renamed from: H0 */
    public void mo9480H0(boolean z) {
        this.f9566J = z;
    }

    /* renamed from: I */
    public C2476e mo9481I() {
        return this.f9585a0;
    }

    /* renamed from: I0 */
    public void mo9482I0(int i) {
        this.f9589c0 = i;
        int i2 = this.f9611n0;
        if (i < i2) {
            this.f9589c0 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f9573P;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p087o.C2476e mo9483J(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            o.d r3 = r2.f9572O
            o.d r0 = r3.f9532f
            if (r0 == 0) goto L_0x001f
            o.d r1 = r0.f9532f
            if (r1 != r3) goto L_0x001f
            o.e r3 = r0.f9530d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            o.d r3 = r2.f9573P
            o.d r0 = r3.f9532f
            if (r0 == 0) goto L_0x001f
            o.d r1 = r0.f9532f
            if (r1 != r3) goto L_0x001f
            o.e r3 = r0.f9530d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.mo9483J(int):o.e");
    }

    /* renamed from: J0 */
    public void mo9484J0(float f) {
        this.f9613o0 = f;
    }

    /* renamed from: K */
    public int mo9485K() {
        return mo9505V() + this.f9587b0;
    }

    /* renamed from: K0 */
    public void mo9486K0(int i) {
        this.f9635z0 = i;
    }

    /* renamed from: L */
    public C2532p mo9487L(int i) {
        if (i == 0) {
            return this.f9592e;
        }
        if (i == 1) {
            return this.f9594f;
        }
        return null;
    }

    /* renamed from: L0 */
    public void mo9488L0(int i, int i2) {
        this.f9595f0 = i;
        int i3 = i2 - i;
        this.f9587b0 = i3;
        int i4 = this.f9609m0;
        if (i3 < i4) {
            this.f9587b0 = i4;
        }
    }

    /* renamed from: M */
    public void mo9489M(StringBuilder sb) {
        sb.append("  " + this.f9612o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f9587b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f9589c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f9595f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f9597g0);
        sb.append("\n");
        m10461O(sb, "left", this.f9572O);
        m10461O(sb, "top", this.f9573P);
        m10461O(sb, "right", this.f9574Q);
        m10461O(sb, "bottom", this.f9575R);
        m10461O(sb, "baseline", this.f9576S);
        m10461O(sb, "centerX", this.f9577T);
        m10461O(sb, "centerY", this.f9578U);
        m10460N(sb, "    width", this.f9587b0, this.f9609m0, this.f9562H[0], this.f9606l, this.f9634z, this.f9628w, this.f9550B, this.f9555D0[0]);
        m10460N(sb, "    height", this.f9589c0, this.f9611n0, this.f9562H[1], this.f9608m, this.f9552C, this.f9630x, this.f9556E, this.f9555D0[1]);
        m10467w0(sb, "    dimensionRatio", this.f9591d0, this.f9593e0);
        m10465u0(sb, "    horizontalBias", this.f9613o0, f9547K0);
        m10465u0(sb, "    verticalBias", this.f9615p0, f9547K0);
        m10466v0(sb, "    horizontalChainStyle", this.f9635z0, 0);
        m10466v0(sb, "    verticalChainStyle", this.f9549A0, 0);
        sb.append("  }");
    }

    /* renamed from: M0 */
    public void mo9490M0(C2478b bVar) {
        this.f9583Z[0] = bVar;
    }

    /* renamed from: N0 */
    public void mo9491N0(int i, int i2, int i3, float f) {
        this.f9628w = i;
        this.f9634z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f9548A = i3;
        this.f9550B = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f9628w = 2;
        }
    }

    /* renamed from: O0 */
    public void mo9492O0(float f) {
        this.f9555D0[0] = f;
    }

    /* renamed from: P */
    public float mo9493P() {
        return this.f9615p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo9494P0(int i, boolean z) {
        this.f9582Y[i] = z;
    }

    /* renamed from: Q */
    public int mo9495Q() {
        return this.f9549A0;
    }

    /* renamed from: Q0 */
    public void mo9496Q0(boolean z) {
        this.f9568K = z;
    }

    /* renamed from: R */
    public C2478b mo9497R() {
        return this.f9583Z[1];
    }

    /* renamed from: R0 */
    public void mo9498R0(boolean z) {
        this.f9569L = z;
    }

    /* renamed from: S */
    public int mo9499S() {
        int i = 0;
        if (this.f9572O != null) {
            i = 0 + this.f9573P.f9533g;
        }
        return this.f9574Q != null ? i + this.f9575R.f9533g : i;
    }

    /* renamed from: S0 */
    public void mo9500S0(int i, int i2) {
        this.f9570M = i;
        this.f9571N = i2;
        mo9506V0(false);
    }

    /* renamed from: T */
    public int mo9501T() {
        return this.f9621s0;
    }

    /* renamed from: T0 */
    public void mo9502T0(int i) {
        this.f9562H[1] = i;
    }

    /* renamed from: U */
    public int mo9503U() {
        if (this.f9621s0 == 8) {
            return 0;
        }
        return this.f9587b0;
    }

    /* renamed from: U0 */
    public void mo9504U0(int i) {
        this.f9562H[0] = i;
    }

    /* renamed from: V */
    public int mo9505V() {
        C2476e eVar = this.f9585a0;
        return (eVar == null || !(eVar instanceof C2479f)) ? this.f9595f0 : ((C2479f) eVar).f9649S0 + this.f9595f0;
    }

    /* renamed from: V0 */
    public void mo9506V0(boolean z) {
        this.f9600i = z;
    }

    /* renamed from: W */
    public int mo9507W() {
        C2476e eVar = this.f9585a0;
        return (eVar == null || !(eVar instanceof C2479f)) ? this.f9597g0 : ((C2479f) eVar).f9650T0 + this.f9597g0;
    }

    /* renamed from: W0 */
    public void mo9508W0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f9611n0 = i;
    }

    /* renamed from: X */
    public boolean mo9509X() {
        return this.f9566J;
    }

    /* renamed from: X0 */
    public void mo9510X0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f9609m0 = i;
    }

    /* renamed from: Y */
    public boolean mo9511Y(int i) {
        if (i == 0) {
            return (this.f9572O.f9532f != null ? 1 : 0) + (this.f9574Q.f9532f != null ? 1 : 0) < 2;
        }
        return ((this.f9573P.f9532f != null ? 1 : 0) + (this.f9575R.f9532f != null ? 1 : 0)) + (this.f9576S.f9532f != null ? 1 : 0) < 2;
    }

    /* renamed from: Y0 */
    public void mo9512Y0(int i, int i2) {
        this.f9595f0 = i;
        this.f9597g0 = i2;
    }

    /* renamed from: Z */
    public boolean mo9513Z() {
        int size = this.f9581X.size();
        for (int i = 0; i < size; i++) {
            if (this.f9581X.get(i).mo9456l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z0 */
    public void mo9514Z0(C2476e eVar) {
        this.f9585a0 = eVar;
    }

    /* renamed from: a0 */
    public boolean mo9515a0() {
        return (this.f9606l == -1 && this.f9608m == -1) ? false : true;
    }

    /* renamed from: a1 */
    public void mo9516a1(float f) {
        this.f9615p0 = f;
    }

    /* renamed from: b0 */
    public boolean mo9517b0(int i, int i2) {
        C2473d dVar;
        C2473d dVar2;
        if (i == 0) {
            C2473d dVar3 = this.f9572O.f9532f;
            if (dVar3 != null && dVar3.mo9457m() && (dVar2 = this.f9574Q.f9532f) != null && dVar2.mo9457m()) {
                return (this.f9574Q.f9532f.mo9448d() - this.f9574Q.mo9449e()) - (this.f9572O.f9532f.mo9448d() + this.f9572O.mo9449e()) >= i2;
            }
        } else {
            C2473d dVar4 = this.f9573P.f9532f;
            if (dVar4 != null && dVar4.mo9457m() && (dVar = this.f9575R.f9532f) != null && dVar.mo9457m()) {
                return (this.f9575R.f9532f.mo9448d() - this.f9575R.mo9449e()) - (this.f9573P.f9532f.mo9448d() + this.f9573P.mo9449e()) >= i2;
            }
        }
        return false;
    }

    /* renamed from: b1 */
    public void mo9518b1(int i) {
        this.f9549A0 = i;
    }

    /* renamed from: c0 */
    public void mo9519c0(C2473d.C2475b bVar, C2476e eVar, C2473d.C2475b bVar2, int i, int i2) {
        mo9542m(bVar).mo9445a(eVar.mo9542m(bVar2), i, i2, true);
    }

    /* renamed from: c1 */
    public void mo9520c1(int i, int i2) {
        this.f9597g0 = i;
        int i3 = i2 - i;
        this.f9589c0 = i3;
        int i4 = this.f9611n0;
        if (i3 < i4) {
            this.f9589c0 = i4;
        }
    }

    /* renamed from: d1 */
    public void mo9521d1(C2478b bVar) {
        this.f9583Z[1] = bVar;
    }

    /* renamed from: e */
    public void mo9522e(C2479f fVar, C1858d dVar, HashSet<C2476e> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C2484j.m10634a(fVar, dVar, this);
                hashSet.remove(this);
                mo9430g(dVar, fVar.mo9582P1(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<C2473d> c = this.f9572O.mo9447c();
            if (c != null) {
                Iterator<C2473d> it = c.iterator();
                while (it.hasNext()) {
                    it.next().f9530d.mo9522e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<C2473d> c2 = this.f9574Q.mo9447c();
            if (c2 != null) {
                Iterator<C2473d> it2 = c2.iterator();
                while (it2.hasNext()) {
                    it2.next().f9530d.mo9522e(fVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<C2473d> c3 = this.f9573P.mo9447c();
        if (c3 != null) {
            Iterator<C2473d> it3 = c3.iterator();
            while (it3.hasNext()) {
                it3.next().f9530d.mo9522e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<C2473d> c4 = this.f9575R.mo9447c();
        if (c4 != null) {
            Iterator<C2473d> it4 = c4.iterator();
            while (it4.hasNext()) {
                it4.next().f9530d.mo9522e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<C2473d> c5 = this.f9576S.mo9447c();
        if (c5 != null) {
            Iterator<C2473d> it5 = c5.iterator();
            while (it5.hasNext()) {
                it5.next().f9530d.mo9522e(fVar, dVar, hashSet, i, true);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo9523e0() {
        return this.f9618r;
    }

    /* renamed from: e1 */
    public void mo9524e1(int i, int i2, int i3, float f) {
        this.f9630x = i;
        this.f9552C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f9554D = i3;
        this.f9556E = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f9630x = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9525f() {
        return (this instanceof C2485k) || (this instanceof C2480g);
    }

    /* renamed from: f0 */
    public boolean mo9526f0(int i) {
        return this.f9582Y[i];
    }

    /* renamed from: f1 */
    public void mo9527f1(float f) {
        this.f9555D0[1] = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05b1  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9430g(p069l.C1858d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            o.d r0 = r15.f9572O
            l.i r13 = r14.mo6406q(r0)
            o.d r0 = r15.f9574Q
            l.i r12 = r14.mo6406q(r0)
            o.d r0 = r15.f9573P
            l.i r11 = r14.mo6406q(r0)
            o.d r0 = r15.f9575R
            l.i r10 = r14.mo6406q(r0)
            o.d r0 = r15.f9576S
            l.i r9 = r14.mo6406q(r0)
            o.e r0 = r15.f9585a0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0036
            o.e$b[] r2 = r0.f9583Z
            r2 = r2[r6]
            o.e$b r3 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            o.e$b[] r0 = r0.f9583Z
            r0 = r0[r7]
            o.e$b r3 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.f9626v
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0055
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r5 = r0
            r4 = r6
            goto L_0x0057
        L_0x0052:
            r4 = r2
            r5 = r6
            goto L_0x0057
        L_0x0055:
            r4 = r6
            r5 = r4
        L_0x0057:
            int r0 = r15.f9621s0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f9623t0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.mo9513Z()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.f9582Y
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f9614p
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f9616q
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f9595f0
            r14.mo6397f(r13, r0)
            int r0 = r15.f9595f0
            int r8 = r15.f9587b0
            int r0 = r0 + r8
            r14.mo6397f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f9604k
            if (r8 == 0) goto L_0x00a1
            o.f r0 = (p087o.C2479f) r0
            o.d r8 = r15.f9572O
            r0.mo9593w1(r8)
            o.d r8 = r15.f9574Q
            r0.mo9592v1(r8)
            goto L_0x00aa
        L_0x00a1:
            o.d r0 = r0.f9574Q
            l.i r0 = r14.mo6406q(r0)
            r14.mo6399h(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f9616q
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f9597g0
            r14.mo6397f(r11, r0)
            int r0 = r15.f9597g0
            int r8 = r15.f9589c0
            int r0 = r0 + r8
            r14.mo6397f(r10, r0)
            o.d r0 = r15.f9576S
            boolean r0 = r0.mo9456l()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f9597g0
            int r8 = r15.f9607l0
            int r0 = r0 + r8
            r14.mo6397f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f9604k
            if (r8 == 0) goto L_0x00e2
            o.f r0 = (p087o.C2479f) r0
            o.d r8 = r15.f9573P
            r0.mo9569B1(r8)
            o.d r8 = r15.f9575R
            r0.mo9568A1(r8)
            goto L_0x00eb
        L_0x00e2:
            o.d r0 = r0.f9575R
            l.i r0 = r14.mo6406q(r0)
            r14.mo6399h(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f9614p
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f9616q
            if (r0 == 0) goto L_0x00f8
            r15.f9614p = r6
            r15.f9616q = r6
            return
        L_0x00f8:
            boolean r0 = p069l.C1858d.f7167r
            if (r55 == 0) goto L_0x0180
            p.l r0 = r15.f9592e
            if (r0 == 0) goto L_0x0180
            p.n r8 = r15.f9594f
            if (r8 == 0) goto L_0x0180
            p.f r2 = r0.f9998h
            boolean r1 = r2.f9947j
            if (r1 == 0) goto L_0x0180
            p.f r0 = r0.f9999i
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x0180
            p.f r0 = r8.f9998h
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x0180
            p.f r0 = r8.f9999i
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x0180
            int r0 = r2.f9944g
            r14.mo6397f(r13, r0)
            p.l r0 = r15.f9592e
            p.f r0 = r0.f9999i
            int r0 = r0.f9944g
            r14.mo6397f(r12, r0)
            p.n r0 = r15.f9594f
            p.f r0 = r0.f9998h
            int r0 = r0.f9944g
            r14.mo6397f(r11, r0)
            p.n r0 = r15.f9594f
            p.f r0 = r0.f9999i
            int r0 = r0.f9944g
            r14.mo6397f(r10, r0)
            p.n r0 = r15.f9594f
            p.f r0 = r0.f9973k
            int r0 = r0.f9944g
            r14.mo6397f(r9, r0)
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x017b
            if (r4 == 0) goto L_0x0162
            boolean[] r0 = r15.f9596g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0162
            boolean r0 = r53.mo9528g0()
            if (r0 != 0) goto L_0x0162
            o.e r0 = r15.f9585a0
            o.d r0 = r0.f9574Q
            l.i r0 = r14.mo6406q(r0)
            r14.mo6399h(r0, r12, r6, r3)
        L_0x0162:
            if (r5 == 0) goto L_0x017b
            boolean[] r0 = r15.f9596g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017b
            boolean r0 = r53.mo9532i0()
            if (r0 != 0) goto L_0x017b
            o.e r0 = r15.f9585a0
            o.d r0 = r0.f9575R
            l.i r0 = r14.mo6406q(r0)
            r14.mo6399h(r0, r10, r6, r3)
        L_0x017b:
            r15.f9614p = r6
            r15.f9616q = r6
            return
        L_0x0180:
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r15.m10463d0(r6)
            if (r0 == 0) goto L_0x0193
            o.e r0 = r15.f9585a0
            o.f r0 = (p087o.C2479f) r0
            r0.mo9590s1(r15, r6)
            r0 = r7
            goto L_0x0197
        L_0x0193:
            boolean r0 = r53.mo9528g0()
        L_0x0197:
            boolean r1 = r15.m10463d0(r7)
            if (r1 == 0) goto L_0x01a6
            o.e r1 = r15.f9585a0
            o.f r1 = (p087o.C2479f) r1
            r1.mo9590s1(r15, r7)
            r1 = r7
            goto L_0x01aa
        L_0x01a6:
            boolean r1 = r53.mo9532i0()
        L_0x01aa:
            if (r0 != 0) goto L_0x01c9
            if (r4 == 0) goto L_0x01c9
            int r2 = r15.f9621s0
            if (r2 == r3) goto L_0x01c9
            o.d r2 = r15.f9572O
            o.d r2 = r2.f9532f
            if (r2 != 0) goto L_0x01c9
            o.d r2 = r15.f9574Q
            o.d r2 = r2.f9532f
            if (r2 != 0) goto L_0x01c9
            o.e r2 = r15.f9585a0
            o.d r2 = r2.f9574Q
            l.i r2 = r14.mo6406q(r2)
            r14.mo6399h(r2, r12, r6, r7)
        L_0x01c9:
            if (r1 != 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            int r2 = r15.f9621s0
            if (r2 == r3) goto L_0x01ec
            o.d r2 = r15.f9573P
            o.d r2 = r2.f9532f
            if (r2 != 0) goto L_0x01ec
            o.d r2 = r15.f9575R
            o.d r2 = r2.f9532f
            if (r2 != 0) goto L_0x01ec
            o.d r2 = r15.f9576S
            if (r2 != 0) goto L_0x01ec
            o.e r2 = r15.f9585a0
            o.d r2 = r2.f9575R
            l.i r2 = r14.mo6406q(r2)
            r14.mo6399h(r2, r10, r6, r7)
        L_0x01ec:
            r29 = r0
            r28 = r1
            goto L_0x01f5
        L_0x01f1:
            r28 = r6
            r29 = r28
        L_0x01f5:
            int r0 = r15.f9587b0
            int r1 = r15.f9609m0
            if (r0 >= r1) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            int r2 = r15.f9589c0
            int r8 = r15.f9611n0
            if (r2 >= r8) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            o.e$b[] r3 = r15.f9583Z
            r7 = r3[r6]
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0211
            r1 = 1
            goto L_0x0212
        L_0x0211:
            r1 = 0
        L_0x0212:
            r20 = 1
            r3 = r3[r20]
            r23 = r8
            r27 = r9
            if (r3 == r6) goto L_0x021e
            r8 = 1
            goto L_0x021f
        L_0x021e:
            r8 = 0
        L_0x021f:
            int r9 = r15.f9593e0
            r15.f9558F = r9
            r30 = r10
            float r10 = r15.f9591d0
            r15.f9560G = r10
            r31 = r11
            int r11 = r15.f9628w
            r32 = r12
            int r12 = r15.f9630x
            r24 = 0
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            r25 = 4
            r33 = r13
            if (r24 <= 0) goto L_0x029f
            int r13 = r15.f9621s0
            r14 = 8
            if (r13 == r14) goto L_0x029f
            if (r7 != r6) goto L_0x0246
            if (r11 != 0) goto L_0x0246
            r11 = 3
        L_0x0246:
            if (r3 != r6) goto L_0x024b
            if (r12 != 0) goto L_0x024b
            r12 = 3
        L_0x024b:
            if (r7 != r6) goto L_0x0258
            if (r3 != r6) goto L_0x0258
            r13 = 3
            if (r11 != r13) goto L_0x0259
            if (r12 != r13) goto L_0x0259
            r15.mo9541l1(r4, r5, r1, r8)
            goto L_0x0295
        L_0x0258:
            r13 = 3
        L_0x0259:
            if (r7 != r6) goto L_0x0271
            if (r11 != r13) goto L_0x0271
            r1 = 0
            r15.f9558F = r1
            float r0 = (float) r2
            float r10 = r10 * r0
            int r1 = (int) r10
            if (r3 == r6) goto L_0x026c
            r35 = r12
            r34 = r23
            r36 = r25
            goto L_0x02a7
        L_0x026c:
            r36 = r11
            r35 = r12
            goto L_0x029b
        L_0x0271:
            if (r3 != r6) goto L_0x0295
            if (r12 != r13) goto L_0x0295
            r1 = 1
            r15.f9558F = r1
            r1 = -1
            if (r9 != r1) goto L_0x0280
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r10
            r15.f9560G = r1
        L_0x0280:
            float r1 = r15.f9560G
            float r0 = (float) r0
            float r1 = r1 * r0
            int r8 = (int) r1
            r34 = r8
            r36 = r11
            if (r7 == r6) goto L_0x0290
            r1 = r22
            r35 = r25
            goto L_0x02a7
        L_0x0290:
            r35 = r12
            r1 = r22
            goto L_0x029d
        L_0x0295:
            r36 = r11
            r35 = r12
            r1 = r22
        L_0x029b:
            r34 = r23
        L_0x029d:
            r14 = 1
            goto L_0x02a8
        L_0x029f:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
        L_0x02a7:
            r14 = 0
        L_0x02a8:
            int[] r0 = r15.f9632y
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f9598h = r14
            if (r14 == 0) goto L_0x02be
            int r0 = r15.f9558F
            r2 = -1
            if (r0 == 0) goto L_0x02bb
            if (r0 != r2) goto L_0x02bf
        L_0x02bb:
            r18 = 1
            goto L_0x02c1
        L_0x02be:
            r2 = -1
        L_0x02bf:
            r18 = 0
        L_0x02c1:
            if (r14 == 0) goto L_0x02cd
            int r0 = r15.f9558F
            r3 = 1
            if (r0 == r3) goto L_0x02ca
            if (r0 != r2) goto L_0x02cd
        L_0x02ca:
            r37 = 1
            goto L_0x02cf
        L_0x02cd:
            r37 = 0
        L_0x02cf:
            o.e$b[] r0 = r15.f9583Z
            r2 = 0
            r0 = r0[r2]
            o.e$b r13 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02de
            boolean r0 = r15 instanceof p087o.C2479f
            if (r0 == 0) goto L_0x02de
            r9 = 1
            goto L_0x02df
        L_0x02de:
            r9 = 0
        L_0x02df:
            if (r9 == 0) goto L_0x02e4
            r22 = 0
            goto L_0x02e6
        L_0x02e4:
            r22 = r1
        L_0x02e6:
            o.d r0 = r15.f9579V
            boolean r0 = r0.mo9458n()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f9582Y
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f9622t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x040d
            boolean r0 = r15.f9614p
            if (r0 != 0) goto L_0x040d
            if (r55 == 0) goto L_0x0364
            p.l r0 = r15.f9592e
            if (r0 == 0) goto L_0x0364
            p.f r1 = r0.f9998h
            boolean r2 = r1.f9947j
            if (r2 == 0) goto L_0x0364
            p.f r0 = r0.f9999i
            boolean r0 = r0.f9947j
            if (r0 != 0) goto L_0x0314
            goto L_0x0364
        L_0x0314:
            if (r55 == 0) goto L_0x0360
            int r0 = r1.f9944g
            r12 = r54
            r11 = r33
            r12.mo6397f(r11, r0)
            p.l r0 = r15.f9592e
            p.f r0 = r0.f9999i
            int r0 = r0.f9944g
            r10 = r32
            r12.mo6397f(r10, r0)
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x034a
            if (r4 == 0) goto L_0x034a
            boolean[] r0 = r15.f9596g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x034a
            boolean r0 = r53.mo9528g0()
            if (r0 != 0) goto L_0x034a
            o.e r0 = r15.f9585a0
            o.d r0 = r0.f9574Q
            l.i r0 = r12.mo6406q(r0)
            r3 = 8
            r12.mo6399h(r0, r10, r1, r3)
        L_0x034a:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0421
        L_0x0360:
            r12 = r54
            goto L_0x040d
        L_0x0364:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x0378
            o.d r0 = r0.f9574Q
            l.i r0 = r12.mo6406q(r0)
            r7 = r0
            goto L_0x037a
        L_0x0378:
            r7 = r40
        L_0x037a:
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x0387
            o.d r0 = r0.f9572O
            l.i r0 = r12.mo6406q(r0)
            r16 = r0
            goto L_0x0389
        L_0x0387:
            r16 = r40
        L_0x0389:
            boolean[] r0 = r15.f9596g
            r19 = 0
            boolean r21 = r0[r19]
            o.e$b[] r0 = r15.f9583Z
            r32 = r0[r19]
            o.d r1 = r15.f9572O
            o.d r2 = r15.f9574Q
            r41 = r2
            int r2 = r15.f9595f0
            r42 = r2
            int r2 = r15.f9609m0
            int[] r3 = r15.f9562H
            r44 = r3[r19]
            float r3 = r15.f9613o0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03ae
            r45 = r20
            goto L_0x03b0
        L_0x03ae:
            r45 = r19
        L_0x03b0:
            int r0 = r15.f9634z
            r24 = r0
            int r0 = r15.f9548A
            r25 = r0
            float r0 = r15.f9550B
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r17 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r18
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.m10464i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0421
        L_0x040d:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0421:
            if (r55 == 0) goto L_0x0487
            r15 = r53
            p.n r0 = r15.f9594f
            if (r0 == 0) goto L_0x047a
            p.f r1 = r0.f9998h
            boolean r2 = r1.f9947j
            if (r2 == 0) goto L_0x047a
            p.f r0 = r0.f9999i
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x047a
            int r0 = r1.f9944g
            r14 = r54
            r13 = r51
            r14.mo6397f(r13, r0)
            p.n r0 = r15.f9594f
            p.f r0 = r0.f9999i
            int r0 = r0.f9944g
            r12 = r50
            r14.mo6397f(r12, r0)
            p.n r0 = r15.f9594f
            p.f r0 = r0.f9973k
            int r0 = r0.f9944g
            r1 = r49
            r14.mo6397f(r1, r0)
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x0474
            if (r28 != 0) goto L_0x0474
            if (r47 == 0) goto L_0x0474
            boolean[] r2 = r15.f9596g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0470
            o.d r0 = r0.f9575R
            l.i r0 = r14.mo6406q(r0)
            r2 = 8
            r10 = 0
            r14.mo6399h(r0, r12, r10, r2)
            goto L_0x0478
        L_0x0470:
            r2 = 8
            r10 = 0
            goto L_0x0478
        L_0x0474:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0478:
            r7 = r10
            goto L_0x0496
        L_0x047a:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0495
        L_0x0487:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x0495:
            r7 = r11
        L_0x0496:
            int r0 = r15.f9624u
            r3 = 2
            if (r0 != r3) goto L_0x049d
            r6 = r10
            goto L_0x049e
        L_0x049d:
            r6 = r7
        L_0x049e:
            if (r6 == 0) goto L_0x057b
            boolean r0 = r15.f9616q
            if (r0 != 0) goto L_0x057b
            o.e$b[] r0 = r15.f9583Z
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04b2
            boolean r0 = r15 instanceof p087o.C2479f
            if (r0 == 0) goto L_0x04b2
            r9 = r11
            goto L_0x04b3
        L_0x04b2:
            r9 = r10
        L_0x04b3:
            if (r9 == 0) goto L_0x04b7
            r34 = r10
        L_0x04b7:
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x04c3
            o.d r0 = r0.f9575R
            l.i r0 = r14.mo6406q(r0)
            r7 = r0
            goto L_0x04c5
        L_0x04c3:
            r7 = r40
        L_0x04c5:
            o.e r0 = r15.f9585a0
            if (r0 == 0) goto L_0x04d1
            o.d r0 = r0.f9573P
            l.i r0 = r14.mo6406q(r0)
            r6 = r0
            goto L_0x04d3
        L_0x04d1:
            r6 = r40
        L_0x04d3:
            int r0 = r15.f9607l0
            if (r0 > 0) goto L_0x04db
            int r0 = r15.f9621s0
            if (r0 != r2) goto L_0x0518
        L_0x04db:
            o.d r0 = r15.f9576S
            o.d r3 = r0.f9532f
            if (r3 == 0) goto L_0x0508
            int r0 = r53.mo9544n()
            r14.mo6396e(r1, r13, r0, r2)
            o.d r0 = r15.f9576S
            o.d r0 = r0.f9532f
            l.i r0 = r14.mo6406q(r0)
            o.d r3 = r15.f9576S
            int r3 = r3.mo9449e()
            r14.mo6396e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x0505
            o.d r0 = r15.f9575R
            l.i r0 = r14.mo6406q(r0)
            r1 = 5
            r14.mo6399h(r7, r0, r10, r1)
        L_0x0505:
            r27 = r10
            goto L_0x051a
        L_0x0508:
            int r3 = r15.f9621s0
            if (r3 != r2) goto L_0x0511
            int r0 = r0.mo9449e()
            goto L_0x0515
        L_0x0511:
            int r0 = r53.mo9544n()
        L_0x0515:
            r14.mo6396e(r1, r13, r0, r2)
        L_0x0518:
            r27 = r38
        L_0x051a:
            boolean[] r0 = r15.f9596g
            boolean r5 = r0[r11]
            o.e$b[] r0 = r15.f9583Z
            r8 = r0[r11]
            o.d r4 = r15.f9573P
            o.d r3 = r15.f9575R
            int r1 = r15.f9597g0
            int r2 = r15.f9611n0
            int[] r10 = r15.f9562H
            r16 = r10[r11]
            float r10 = r15.f9615p0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x053b
            r18 = 1
            goto L_0x053d
        L_0x053b:
            r18 = r17
        L_0x053d:
            int r0 = r15.f9552C
            r24 = r0
            int r0 = r15.f9554D
            r25 = r0
            float r0 = r15.f9556E
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.m10464i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x057f
        L_0x057b:
            r33 = r12
            r38 = r13
        L_0x057f:
            if (r32 == 0) goto L_0x05a7
            r6 = 8
            r7 = r53
            int r0 = r7.f9558F
            r1 = 1
            float r5 = r7.f9560G
            if (r0 != r1) goto L_0x0597
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            goto L_0x05a3
        L_0x0597:
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
        L_0x05a3:
            r0.mo6402k(r1, r2, r3, r4, r5, r6)
            goto L_0x05a9
        L_0x05a7:
            r7 = r53
        L_0x05a9:
            o.d r0 = r7.f9579V
            boolean r0 = r0.mo9458n()
            if (r0 == 0) goto L_0x05d1
            o.d r0 = r7.f9579V
            o.d r0 = r0.mo9453i()
            o.e r0 = r0.mo9451g()
            float r1 = r7.f9564I
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            o.d r2 = r7.f9579V
            int r2 = r2.mo9449e()
            r3 = r54
            r3.mo6393b(r7, r0, r1, r2)
        L_0x05d1:
            r0 = 0
            r7.f9614p = r0
            r7.f9616q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2476e.mo9430g(l.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean mo9528g0() {
        C2473d dVar = this.f9572O;
        C2473d dVar2 = dVar.f9532f;
        if (dVar2 != null && dVar2.f9532f == dVar) {
            return true;
        }
        C2473d dVar3 = this.f9574Q;
        C2473d dVar4 = dVar3.f9532f;
        return dVar4 != null && dVar4.f9532f == dVar3;
    }

    /* renamed from: g1 */
    public void mo9529g1(int i) {
        this.f9621s0 = i;
    }

    /* renamed from: h */
    public boolean mo9431h() {
        return this.f9621s0 != 8;
    }

    /* renamed from: h0 */
    public boolean mo9530h0() {
        return this.f9568K;
    }

    /* renamed from: h1 */
    public void mo9531h1(int i) {
        this.f9587b0 = i;
        int i2 = this.f9609m0;
        if (i < i2) {
            this.f9587b0 = i2;
        }
    }

    /* renamed from: i0 */
    public boolean mo9532i0() {
        C2473d dVar = this.f9573P;
        C2473d dVar2 = dVar.f9532f;
        if (dVar2 != null && dVar2.f9532f == dVar) {
            return true;
        }
        C2473d dVar3 = this.f9575R;
        C2473d dVar4 = dVar3.f9532f;
        return dVar4 != null && dVar4.f9532f == dVar3;
    }

    /* renamed from: i1 */
    public void mo9533i1(int i) {
        if (i >= 0 && i <= 3) {
            this.f9626v = i;
        }
    }

    /* renamed from: j */
    public void mo9534j(C2476e eVar, float f, int i) {
        C2473d.C2475b bVar = C2473d.C2475b.CENTER;
        mo9519c0(bVar, eVar, bVar, i, 0);
        this.f9564I = f;
    }

    /* renamed from: j0 */
    public boolean mo9535j0() {
        return this.f9569L;
    }

    /* renamed from: j1 */
    public void mo9536j1(int i) {
        this.f9595f0 = i;
    }

    /* renamed from: k */
    public void mo9537k(C1858d dVar) {
        dVar.mo6406q(this.f9572O);
        dVar.mo6406q(this.f9573P);
        dVar.mo6406q(this.f9574Q);
        dVar.mo6406q(this.f9575R);
        if (this.f9607l0 > 0) {
            dVar.mo6406q(this.f9576S);
        }
    }

    /* renamed from: k0 */
    public boolean mo9538k0() {
        return this.f9600i && this.f9621s0 != 8;
    }

    /* renamed from: k1 */
    public void mo9539k1(int i) {
        this.f9597g0 = i;
    }

    /* renamed from: l */
    public void mo9540l() {
        if (this.f9592e == null) {
            this.f9592e = new C2525l(this);
        }
        if (this.f9594f == null) {
            this.f9594f = new C2528n(this);
        }
    }

    /* renamed from: l0 */
    public boolean mo9432l0() {
        return this.f9614p || (this.f9572O.mo9457m() && this.f9574Q.mo9457m());
    }

    /* renamed from: l1 */
    public void mo9541l1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f9558F == -1) {
            if (z3 && !z4) {
                this.f9558F = 0;
            } else if (!z3 && z4) {
                this.f9558F = 1;
                if (this.f9593e0 == -1) {
                    this.f9560G = 1.0f / this.f9560G;
                }
            }
        }
        if (this.f9558F == 0 && (!this.f9573P.mo9458n() || !this.f9575R.mo9458n())) {
            this.f9558F = 1;
        } else if (this.f9558F == 1 && (!this.f9572O.mo9458n() || !this.f9574Q.mo9458n())) {
            this.f9558F = 0;
        }
        if (this.f9558F == -1 && (!this.f9573P.mo9458n() || !this.f9575R.mo9458n() || !this.f9572O.mo9458n() || !this.f9574Q.mo9458n())) {
            if (this.f9573P.mo9458n() && this.f9575R.mo9458n()) {
                this.f9558F = 0;
            } else if (this.f9572O.mo9458n() && this.f9574Q.mo9458n()) {
                this.f9560G = 1.0f / this.f9560G;
                this.f9558F = 1;
            }
        }
        if (this.f9558F == -1) {
            int i = this.f9634z;
            if (i > 0 && this.f9552C == 0) {
                this.f9558F = 0;
            } else if (i == 0 && this.f9552C > 0) {
                this.f9560G = 1.0f / this.f9560G;
                this.f9558F = 1;
            }
        }
    }

    /* renamed from: m */
    public C2473d mo9542m(C2473d.C2475b bVar) {
        switch (C2477a.f9636a[bVar.ordinal()]) {
            case 1:
                return this.f9572O;
            case 2:
                return this.f9573P;
            case 3:
                return this.f9574Q;
            case 4:
                return this.f9575R;
            case 5:
                return this.f9576S;
            case 6:
                return this.f9579V;
            case 7:
                return this.f9577T;
            case 8:
                return this.f9578U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: m0 */
    public boolean mo9433m0() {
        return this.f9616q || (this.f9573P.mo9457m() && this.f9575R.mo9457m());
    }

    /* renamed from: m1 */
    public void mo9543m1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.f9592e.mo9715k();
        boolean k2 = z2 & this.f9594f.mo9715k();
        C2525l lVar = this.f9592e;
        int i3 = lVar.f9998h.f9944g;
        C2528n nVar = this.f9594f;
        int i4 = nVar.f9998h.f9944g;
        int i5 = lVar.f9999i.f9944g;
        int i6 = nVar.f9999i.f9944g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.f9595f0 = i3;
        }
        if (k2) {
            this.f9597g0 = i4;
        }
        if (this.f9621s0 == 8) {
            this.f9587b0 = 0;
            this.f9589c0 = 0;
            return;
        }
        if (k) {
            if (this.f9583Z[0] == C2478b.FIXED && i8 < (i2 = this.f9587b0)) {
                i8 = i2;
            }
            this.f9587b0 = i8;
            int i10 = this.f9609m0;
            if (i8 < i10) {
                this.f9587b0 = i10;
            }
        }
        if (k2) {
            if (this.f9583Z[1] == C2478b.FIXED && i9 < (i = this.f9589c0)) {
                i9 = i;
            }
            this.f9589c0 = i9;
            int i11 = this.f9611n0;
            if (i9 < i11) {
                this.f9589c0 = i11;
            }
        }
    }

    /* renamed from: n */
    public int mo9544n() {
        return this.f9607l0;
    }

    /* renamed from: n0 */
    public boolean mo9545n0() {
        return this.f9620s;
    }

    /* renamed from: n1 */
    public void mo9546n1(C1858d dVar, boolean z) {
        C2528n nVar;
        C2525l lVar;
        int x = dVar.mo6410x(this.f9572O);
        int x2 = dVar.mo6410x(this.f9573P);
        int x3 = dVar.mo6410x(this.f9574Q);
        int x4 = dVar.mo6410x(this.f9575R);
        if (z && (lVar = this.f9592e) != null) {
            C2518f fVar = lVar.f9998h;
            if (fVar.f9947j) {
                C2518f fVar2 = lVar.f9999i;
                if (fVar2.f9947j) {
                    x = fVar.f9944g;
                    x3 = fVar2.f9944g;
                }
            }
        }
        if (z && (nVar = this.f9594f) != null) {
            C2518f fVar3 = nVar.f9998h;
            if (fVar3.f9947j) {
                C2518f fVar4 = nVar.f9999i;
                if (fVar4.f9947j) {
                    x2 = fVar3.f9944g;
                    x4 = fVar4.f9944g;
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        mo9478G0(x, x2, x3, x4);
    }

    /* renamed from: o */
    public float mo9547o(int i) {
        if (i == 0) {
            return this.f9613o0;
        }
        if (i == 1) {
            return this.f9615p0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void mo9548o0() {
        this.f9618r = true;
    }

    /* renamed from: p */
    public int mo9549p() {
        return mo9507W() + this.f9589c0;
    }

    /* renamed from: p0 */
    public void mo9550p0() {
        this.f9620s = true;
    }

    /* renamed from: q */
    public Object mo9551q() {
        return this.f9617q0;
    }

    /* renamed from: q0 */
    public boolean mo9552q0() {
        C2478b[] bVarArr = this.f9583Z;
        C2478b bVar = bVarArr[0];
        C2478b bVar2 = C2478b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* renamed from: r */
    public String mo9553r() {
        return this.f9625u0;
    }

    /* renamed from: r0 */
    public void mo9554r0() {
        this.f9572O.mo9460p();
        this.f9573P.mo9460p();
        this.f9574Q.mo9460p();
        this.f9575R.mo9460p();
        this.f9576S.mo9460p();
        this.f9577T.mo9460p();
        this.f9578U.mo9460p();
        this.f9579V.mo9460p();
        this.f9585a0 = null;
        this.f9564I = 0.0f;
        this.f9587b0 = 0;
        this.f9589c0 = 0;
        this.f9591d0 = 0.0f;
        this.f9593e0 = -1;
        this.f9595f0 = 0;
        this.f9597g0 = 0;
        this.f9603j0 = 0;
        this.f9605k0 = 0;
        this.f9607l0 = 0;
        this.f9609m0 = 0;
        this.f9611n0 = 0;
        float f = f9547K0;
        this.f9613o0 = f;
        this.f9615p0 = f;
        C2478b[] bVarArr = this.f9583Z;
        C2478b bVar = C2478b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f9617q0 = null;
        this.f9619r0 = 0;
        this.f9621s0 = 0;
        this.f9627v0 = null;
        this.f9629w0 = false;
        this.f9631x0 = false;
        this.f9635z0 = 0;
        this.f9549A0 = 0;
        this.f9551B0 = false;
        this.f9553C0 = false;
        float[] fArr = this.f9555D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f9622t = -1;
        this.f9624u = -1;
        int[] iArr = this.f9562H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f9628w = 0;
        this.f9630x = 0;
        this.f9550B = 1.0f;
        this.f9556E = 1.0f;
        this.f9548A = Integer.MAX_VALUE;
        this.f9554D = Integer.MAX_VALUE;
        this.f9634z = 0;
        this.f9552C = 0;
        this.f9598h = false;
        this.f9558F = -1;
        this.f9560G = 1.0f;
        this.f9633y0 = false;
        boolean[] zArr = this.f9596g;
        zArr[0] = true;
        zArr[1] = true;
        this.f9569L = false;
        boolean[] zArr2 = this.f9582Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f9600i = true;
        int[] iArr2 = this.f9632y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f9606l = -1;
        this.f9608m = -1;
    }

    /* renamed from: s */
    public C2478b mo9555s(int i) {
        if (i == 0) {
            return mo9564y();
        }
        if (i == 1) {
            return mo9497R();
        }
        return null;
    }

    /* renamed from: s0 */
    public void mo9556s0() {
        this.f9614p = false;
        this.f9616q = false;
        this.f9618r = false;
        this.f9620s = false;
        int size = this.f9581X.size();
        for (int i = 0; i < size; i++) {
            this.f9581X.get(i).mo9461q();
        }
    }

    /* renamed from: t */
    public float mo9557t() {
        return this.f9591d0;
    }

    /* renamed from: t0 */
    public void mo9558t0(C1857c cVar) {
        this.f9572O.mo9462r(cVar);
        this.f9573P.mo9462r(cVar);
        this.f9574Q.mo9462r(cVar);
        this.f9575R.mo9462r(cVar);
        this.f9576S.mo9462r(cVar);
        this.f9579V.mo9462r(cVar);
        this.f9577T.mo9462r(cVar);
        this.f9578U.mo9462r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f9627v0 != null) {
            str = "type: " + this.f9627v0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f9625u0 != null) {
            str2 = "id: " + this.f9625u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f9595f0);
        sb.append(", ");
        sb.append(this.f9597g0);
        sb.append(") - (");
        sb.append(this.f9587b0);
        sb.append(" x ");
        sb.append(this.f9589c0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo9559u() {
        return this.f9593e0;
    }

    /* renamed from: v */
    public int mo9560v() {
        if (this.f9621s0 == 8) {
            return 0;
        }
        return this.f9589c0;
    }

    /* renamed from: w */
    public float mo9561w() {
        return this.f9613o0;
    }

    /* renamed from: x */
    public int mo9562x() {
        return this.f9635z0;
    }

    /* renamed from: x0 */
    public void mo9563x0(int i) {
        this.f9607l0 = i;
        this.f9566J = i > 0;
    }

    /* renamed from: y */
    public C2478b mo9564y() {
        return this.f9583Z[0];
    }

    /* renamed from: y0 */
    public void mo9565y0(Object obj) {
        this.f9617q0 = obj;
    }

    /* renamed from: z */
    public int mo9566z() {
        C2473d dVar = this.f9572O;
        int i = 0;
        if (dVar != null) {
            i = 0 + dVar.f9533g;
        }
        C2473d dVar2 = this.f9574Q;
        return dVar2 != null ? i + dVar2.f9533g : i;
    }

    /* renamed from: z0 */
    public void mo9567z0(String str) {
        this.f9625u0 = str;
    }
}
