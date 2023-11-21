package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p058j0.C1710l;

/* renamed from: j0.n0 */
public abstract class C1723n0 extends C1710l {

    /* renamed from: M */
    private static final String[] f6683M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L */
    private int f6684L = 3;

    /* renamed from: j0.n0$a */
    class C1724a extends C1718m {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f6685d;

        /* renamed from: e */
        final /* synthetic */ View f6686e;

        /* renamed from: f */
        final /* synthetic */ View f6687f;

        C1724a(ViewGroup viewGroup, View view, View view2) {
            this.f6685d = viewGroup;
            this.f6686e = view;
            this.f6687f = view2;
        }

        /* renamed from: b */
        public void mo5898b(C1710l lVar) {
            if (this.f6686e.getParent() == null) {
                C1740x.m7265a(this.f6685d).mo5994a(this.f6686e);
            } else {
                C1723n0.this.mo5946f();
            }
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            this.f6687f.setTag(C1704i.f6625a, (Object) null);
            C1740x.m7265a(this.f6685d).mo5996c(this.f6686e);
            lVar.mo5930P(this);
        }

        /* renamed from: e */
        public void mo5901e(C1710l lVar) {
            C1740x.m7265a(this.f6685d).mo5996c(this.f6686e);
        }
    }

    /* renamed from: j0.n0$b */
    private static class C1725b extends AnimatorListenerAdapter implements C1710l.C1716f {

        /* renamed from: d */
        private final View f6689d;

        /* renamed from: e */
        private final int f6690e;

        /* renamed from: f */
        private final ViewGroup f6691f;

        /* renamed from: g */
        private final boolean f6692g;

        /* renamed from: h */
        private boolean f6693h;

        /* renamed from: i */
        boolean f6694i = false;

        C1725b(View view, int i, boolean z) {
            this.f6689d = view;
            this.f6690e = i;
            this.f6691f = (ViewGroup) view.getParent();
            this.f6692g = z;
            m7212g(true);
        }

        /* renamed from: f */
        private void m7211f() {
            if (!this.f6694i) {
                C1668a0.m7023h(this.f6689d, this.f6690e);
                ViewGroup viewGroup = this.f6691f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m7212g(false);
        }

        /* renamed from: g */
        private void m7212g(boolean z) {
            ViewGroup viewGroup;
            if (this.f6692g && this.f6693h != z && (viewGroup = this.f6691f) != null) {
                this.f6693h = z;
                C1740x.m7267c(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo5913a(C1710l lVar) {
        }

        /* renamed from: b */
        public void mo5898b(C1710l lVar) {
            m7212g(true);
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            m7211f();
            lVar.mo5930P(this);
        }

        /* renamed from: d */
        public void mo5900d(C1710l lVar) {
        }

        /* renamed from: e */
        public void mo5901e(C1710l lVar) {
            m7212g(false);
        }

        public void onAnimationCancel(Animator animator) {
            this.f6694i = true;
        }

        public void onAnimationEnd(Animator animator) {
            m7211f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f6694i) {
                C1668a0.m7023h(this.f6689d, this.f6690e);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f6694i) {
                C1668a0.m7023h(this.f6689d, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: j0.n0$c */
    private static class C1726c {

        /* renamed from: a */
        boolean f6695a;

        /* renamed from: b */
        boolean f6696b;

        /* renamed from: c */
        int f6697c;

        /* renamed from: d */
        int f6698d;

        /* renamed from: e */
        ViewGroup f6699e;

        /* renamed from: f */
        ViewGroup f6700f;

        C1726c() {
        }
    }

    /* renamed from: c0 */
    private void m7196c0(C1735s sVar) {
        sVar.f6713a.put("android:visibility:visibility", Integer.valueOf(sVar.f6714b.getVisibility()));
        sVar.f6713a.put("android:visibility:parent", sVar.f6714b.getParent());
        int[] iArr = new int[2];
        sVar.f6714b.getLocationOnScreen(iArr);
        sVar.f6713a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f6699e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f6697c == 0) goto L_0x0093;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p058j0.C1723n0.C1726c m7197d0(p058j0.C1735s r8, p058j0.C1735s r9) {
        /*
            r7 = this;
            j0.n0$c r0 = new j0.n0$c
            r0.<init>()
            r1 = 0
            r0.f6695a = r1
            r0.f6696b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6713a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6713a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f6697c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6713a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f6699e = r6
            goto L_0x0037
        L_0x0033:
            r0.f6697c = r4
            r0.f6699e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f6713a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6713a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f6698d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6713a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f6700f = r2
            goto L_0x005e
        L_0x005a:
            r0.f6698d = r4
            r0.f6700f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f6697c
            int r9 = r0.f6698d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f6699e
            android.view.ViewGroup r4 = r0.f6700f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f6700f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f6699e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f6698d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f6696b = r2
        L_0x008a:
            r0.f6695a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f6697c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f6696b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p058j0.C1723n0.m7197d0(j0.s, j0.s):j0.n0$c");
    }

    /* renamed from: D */
    public String[] mo5867D() {
        return f6683M;
    }

    /* renamed from: F */
    public boolean mo5926F(C1735s sVar, C1735s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f6713a.containsKey("android:visibility:visibility") != sVar.f6713a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1726c d0 = m7197d0(sVar, sVar2);
        if (d0.f6695a) {
            return d0.f6697c == 0 || d0.f6698d == 0;
        }
        return false;
    }

    /* renamed from: e0 */
    public abstract Animator mo5904e0(ViewGroup viewGroup, View view, C1735s sVar, C1735s sVar2);

    /* renamed from: f0 */
    public Animator mo5969f0(ViewGroup viewGroup, C1735s sVar, int i, C1735s sVar2, int i2) {
        if ((this.f6684L & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f6714b.getParent();
            if (m7197d0(mo5956t(view, false), mo5925E(view, false)).f6695a) {
                return null;
            }
        }
        return mo5904e0(viewGroup, sVar2.f6714b, sVar, sVar2);
    }

    /* renamed from: g */
    public void mo5868g(C1735s sVar) {
        m7196c0(sVar);
    }

    /* renamed from: g0 */
    public abstract Animator mo5905g0(ViewGroup viewGroup, View view, C1735s sVar, C1735s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f6664y != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo5970h0(android.view.ViewGroup r18, p058j0.C1735s r19, int r20, p058j0.C1735s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f6684L
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f6714b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f6714b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p058j0.C1704i.f6625a
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = r11
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = r12
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            j0.s r14 = r0.mo5925E(r13, r12)
            j0.s r15 = r0.mo5956t(r13, r12)
            j0.n0$c r14 = r0.m7197d0(r14, r15)
            boolean r14 = r14.f6695a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p058j0.C1734r.m7255a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f6664y
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = r11
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f6713a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            j0.v r4 = p058j0.C1740x.m7265a(r18)
            r4.mo5994a(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo5905g0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            j0.v r1 = p058j0.C1740x.m7265a(r18)
            r1.mo5996c(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            j0.n0$a r3 = new j0.n0$a
            r3.<init>(r1, r10, r5)
            r0.mo5940a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p058j0.C1668a0.m7023h(r8, r11)
            android.animation.Animator r1 = r0.mo5905g0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            j0.n0$b r2 = new j0.n0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p058j0.C1667a.m7013a(r1, r2)
            r0.mo5940a(r2)
            goto L_0x0106
        L_0x0103:
            p058j0.C1668a0.m7023h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p058j0.C1723n0.mo5970h0(android.view.ViewGroup, j0.s, int, j0.s, int):android.animation.Animator");
    }

    /* renamed from: i0 */
    public void mo5971i0(int i) {
        if ((i & -4) == 0) {
            this.f6684L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: j */
    public void mo5869j(C1735s sVar) {
        m7196c0(sVar);
    }

    /* renamed from: n */
    public Animator mo5870n(ViewGroup viewGroup, C1735s sVar, C1735s sVar2) {
        C1726c d0 = m7197d0(sVar, sVar2);
        if (!d0.f6695a) {
            return null;
        }
        if (d0.f6699e == null && d0.f6700f == null) {
            return null;
        }
        if (d0.f6696b) {
            return mo5969f0(viewGroup, sVar, d0.f6697c, sVar2, d0.f6698d);
        }
        return mo5970h0(viewGroup, sVar, d0.f6697c, sVar2, d0.f6698d);
    }
}
