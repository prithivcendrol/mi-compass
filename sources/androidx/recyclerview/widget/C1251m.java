package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.core.view.C0727l0;
import androidx.recyclerview.widget.RecyclerView;
import miuix.animation.utils.VelocityMonitor;
import p080m4.C1963a;
import p085n3.C2446c;
import p138x3.C2905a;

/* renamed from: androidx.recyclerview.widget.m */
abstract class C1251m extends RecyclerView {

    /* renamed from: N0 */
    private int f4343N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public VelocityMonitor f4344O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public boolean f4345P0;

    /* renamed from: androidx.recyclerview.widget.m$a */
    class C1252a extends RecyclerView.C1166d0 {

        /* renamed from: k */
        private int f4346k;

        /* renamed from: l */
        private int f4347l;

        /* renamed from: m */
        C2446c f4348m;

        /* renamed from: n */
        Interpolator f4349n;

        /* renamed from: o */
        private boolean f4350o = false;

        /* renamed from: p */
        private boolean f4351p = false;

        /* renamed from: q */
        private boolean f4352q;

        /* renamed from: r */
        int f4353r = 0;

        /* renamed from: s */
        int f4354s = 0;

        /* renamed from: t */
        boolean f4355t = false;

        /* renamed from: u */
        private C1963a f4356u;

        C1252a() {
            super();
            Interpolator interpolator = RecyclerView.f3937M0;
            this.f4349n = interpolator;
            this.f4348m = new C2446c(C1251m.this.getContext(), interpolator);
        }

        /* renamed from: c */
        private void m5729c() {
            C1251m.this.removeCallbacks(this);
            C0727l0.m2870T(C1251m.this, this);
        }

        /* renamed from: g */
        private int m5730g(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            C1251m mVar = C1251m.this;
            int width = z ? mVar.getWidth() : mVar.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float h = f2 + (m5731h(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(h / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: h */
        private float m5731h(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: i */
        private C1963a m5732i() {
            if (this.f4356u == null) {
                this.f4356u = new C1963a(C1251m.this.getContext());
            }
            return this.f4356u;
        }

        /* renamed from: b */
        public void mo4429b(int i, int i2) {
            boolean canScrollHorizontally;
            C1251m.this.setScrollState(2);
            this.f4347l = 0;
            this.f4346k = 0;
            Interpolator interpolator = this.f4349n;
            Interpolator interpolator2 = RecyclerView.f3937M0;
            if (interpolator != interpolator2) {
                this.f4349n = interpolator2;
                this.f4348m = new C2446c(C1251m.this.getContext(), interpolator2);
            }
            if (i != 0) {
                i = -((int) C1251m.this.f4344O0.getVelocity(0));
            }
            int i3 = i;
            if (i2 != 0) {
                i2 = -((int) C1251m.this.f4344O0.getVelocity(1));
            }
            int i4 = i2;
            boolean k = C1251m.this.f3992p.mo4198k();
            if (C1251m.this.f3992p.mo4199l()) {
                k |= true;
            }
            int i5 = -1;
            if (k) {
                if (i4 > 0) {
                    i5 = 1;
                }
                canScrollHorizontally = C1251m.this.canScrollVertically(i5);
            } else {
                if (k) {
                    if (i3 > 0) {
                        i5 = 1;
                    }
                    canScrollHorizontally = C1251m.this.canScrollHorizontally(i5);
                }
                this.f4348m.mo9372c(0, 0, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                mo4430d();
            }
            this.f4352q = true ^ canScrollHorizontally;
            this.f4348m.mo9372c(0, 0, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4430d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4430d() {
            if (this.f4350o) {
                this.f4351p = true;
            } else {
                m5729c();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4431e(int r9, int r10, int r11, android.view.animation.Interpolator r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.m r0 = androidx.recyclerview.widget.C1251m.this
                boolean r0 = r0.mo4712y1()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = 0
                if (r11 != r0) goto L_0x0011
                r8.m5730g(r9, r10, r1, r1)
            L_0x0011:
                if (r12 != 0) goto L_0x0015
                android.view.animation.Interpolator r12 = androidx.recyclerview.widget.RecyclerView.f3937M0
            L_0x0015:
                n3.c r11 = r8.f4348m
                int r11 = r11.mo9381l()
                r0 = 2
                if (r11 != r0) goto L_0x0034
                boolean r11 = r8.f4355t
                if (r11 != 0) goto L_0x0034
                n3.c r11 = r8.f4348m
                float r11 = r11.mo9376g()
                int r11 = (int) r11
                r8.f4354s = r11
                n3.c r11 = r8.f4348m
                float r11 = r11.mo9375f()
                int r11 = (int) r11
                r8.f4353r = r11
            L_0x0034:
                androidx.recyclerview.widget.m r11 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r11 = r11.f3992p
                androidx.recyclerview.widget.RecyclerView$a0 r11 = r11.f4094g
                boolean r2 = r11 instanceof androidx.recyclerview.widget.C1241g
                if (r2 == 0) goto L_0x005a
                r2 = 1067030938(0x3f99999a, float:1.2)
                r3 = r11
                androidx.recyclerview.widget.g r3 = (androidx.recyclerview.widget.C1241g) r3
                int r3 = r3.f4333k
                float r3 = (float) r3
                float r3 = r3 * r2
                androidx.recyclerview.widget.g r11 = (androidx.recyclerview.widget.C1241g) r11
                int r11 = r11.f4334l
                float r11 = (float) r11
                float r11 = r11 * r2
                float r2 = (float) r9
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x005a
                float r2 = (float) r10
                int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r11 != 0) goto L_0x005a
                r11 = 1
                goto L_0x005b
            L_0x005a:
                r11 = r1
            L_0x005b:
                r8.f4355t = r11
                android.view.animation.Interpolator r11 = r8.f4349n
                if (r11 == r12) goto L_0x0070
                r8.f4349n = r12
                n3.c r11 = new n3.c
                androidx.recyclerview.widget.m r2 = androidx.recyclerview.widget.C1251m.this
                android.content.Context r2 = r2.getContext()
                r11.<init>(r2, r12)
                r8.f4348m = r11
            L_0x0070:
                r8.f4347l = r1
                r8.f4346k = r1
                androidx.recyclerview.widget.m r11 = androidx.recyclerview.widget.C1251m.this
                r11.setScrollState(r0)
                n3.c r1 = r8.f4348m
                r2 = 0
                r3 = 0
                int r6 = r8.f4353r
                int r7 = r8.f4354s
                r4 = r9
                r5 = r10
                r1.mo9389u(r2, r3, r4, r5, r6, r7)
                r8.mo4430d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1251m.C1252a.mo4431e(int, int, int, android.view.animation.Interpolator):void");
        }

        /* renamed from: f */
        public void mo4432f() {
            C1251m.this.removeCallbacks(this);
            this.f4348m.mo9370a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4943j() {
            this.f4347l = 0;
            this.f4346k = 0;
            this.f4348m.mo9387r();
        }

        /* JADX WARNING: Removed duplicated region for block: B:113:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0220  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r2 = r1.f3992p
                if (r2 != 0) goto L_0x000c
                r22.mo4432f()
                return
            L_0x000c:
                r2 = 0
                r0.f4351p = r2
                r3 = 1
                r0.f4350o = r3
                r1.mo4389t()
                n3.c r1 = r0.f4348m
                boolean r4 = r1.mo9371b()
                if (r4 == 0) goto L_0x0234
                int r4 = r1.mo9377h()
                int r5 = r1.mo9378i()
                n3.c r6 = r0.f4348m
                int r6 = r6.mo9381l()
                if (r6 != r3) goto L_0x003b
                float r6 = r1.mo9375f()
                int r6 = (int) r6
                r0.f4353r = r6
                float r6 = r1.mo9376g()
                int r6 = (int) r6
                r0.f4354s = r6
            L_0x003b:
                int r6 = r0.f4346k
                int r6 = r4 - r6
                int r7 = r0.f4347l
                int r13 = r5 - r7
                r0.f4346k = r4
                r0.f4347l = r5
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int[] r4 = r4.f4009x0
                r4[r2] = r2
                r4[r3] = r2
                n3.c r4 = r0.f4348m
                int r4 = r4.mo9381l()
                if (r4 != r3) goto L_0x0092
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                android.view.ViewParent r4 = r4.getParent()
                androidx.recyclerview.widget.m r5 = androidx.recyclerview.widget.C1251m.this
                android.view.View r5 = r5.getRootView()
                r7 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r5 = r5.findViewById(r7)
            L_0x006a:
                if (r4 == 0) goto L_0x0092
                boolean r7 = r4 instanceof p132w2.C2887c
                if (r7 == 0) goto L_0x0086
                r7 = r4
                w2.c r7 = (p132w2.C2887c) r7
                n3.c r8 = r0.f4348m
                float r8 = r8.mo9375f()
                n3.c r9 = r0.f4348m
                float r9 = r9.mo9376g()
                boolean r7 = r7.mo9246a(r8, r9)
                if (r7 == 0) goto L_0x0086
                goto L_0x0092
            L_0x0086:
                boolean r7 = r4 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x008d
                if (r4 != r5) goto L_0x008d
                goto L_0x0092
            L_0x008d:
                android.view.ViewParent r4 = r4.getParent()
                goto L_0x006a
            L_0x0092:
                androidx.recyclerview.widget.m r7 = androidx.recyclerview.widget.C1251m.this
                int[] r10 = r7.f4009x0
                r11 = 0
                r12 = 1
                r8 = r6
                r9 = r13
                boolean r4 = r7.mo4235E(r8, r9, r10, r11, r12)
                if (r4 == 0) goto L_0x00aa
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int[] r4 = r4.f4009x0
                r5 = r4[r2]
                int r6 = r6 - r5
                r4 = r4[r3]
                int r13 = r13 - r4
            L_0x00aa:
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int r4 = r4.getOverScrollMode()
                r5 = 2
                if (r4 == r5) goto L_0x00b8
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                r4.mo4360s(r6, r13)
            L_0x00b8:
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$h r7 = r4.f3990o
                if (r7 == 0) goto L_0x00ff
                int[] r7 = r4.f4009x0
                r7[r2] = r2
                r7[r3] = r2
                r4.mo4295g1(r6, r13, r7)
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int[] r7 = r4.f4009x0
                r8 = r7[r2]
                r7 = r7[r3]
                int r6 = r6 - r8
                int r13 = r13 - r7
                androidx.recyclerview.widget.RecyclerView$p r4 = r4.f3992p
                androidx.recyclerview.widget.RecyclerView$a0 r4 = r4.f4094g
                if (r4 == 0) goto L_0x0101
                boolean r9 = r4.mo4405f()
                if (r9 != 0) goto L_0x0101
                boolean r9 = r4.mo4406g()
                if (r9 == 0) goto L_0x0101
                androidx.recyclerview.widget.m r9 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$b0 r9 = r9.f3983k0
                int r9 = r9.mo4417b()
                if (r9 != 0) goto L_0x00f1
                r4.mo4414o()
                goto L_0x0101
            L_0x00f1:
                int r10 = r4.mo4404e()
                if (r10 < r9) goto L_0x00fb
                int r9 = r9 - r3
                r4.mo4413n(r9)
            L_0x00fb:
                r4.mo4408i(r8, r7)
                goto L_0x0101
            L_0x00ff:
                r7 = r2
                r8 = r7
            L_0x0101:
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r4 = r4.f3998s
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x0110
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                r4.invalidate()
            L_0x0110:
                androidx.recyclerview.widget.m r14 = androidx.recyclerview.widget.C1251m.this
                int[] r4 = r14.f4009x0
                r4[r2] = r2
                r4[r3] = r2
                r19 = 0
                r20 = 1
                r15 = r8
                r16 = r7
                r17 = r6
                r18 = r13
                r21 = r4
                r14.mo4237F(r15, r16, r17, r18, r19, r20, r21)
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int[] r9 = r4.f4009x0
                r10 = r9[r2]
                int r6 = r6 - r10
                r9 = r9[r3]
                int r13 = r13 - r9
                if (r8 != 0) goto L_0x0136
                if (r7 == 0) goto L_0x0139
            L_0x0136:
                r4.mo4241H(r8, r7)
            L_0x0139:
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x0146
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                r4.invalidate()
            L_0x0146:
                int r4 = r1.mo9377h()
                int r9 = r1.mo9379j()
                if (r4 != r9) goto L_0x0152
                r4 = r3
                goto L_0x0153
            L_0x0152:
                r4 = r2
            L_0x0153:
                int r9 = r1.mo9378i()
                int r10 = r1.mo9380k()
                if (r9 != r10) goto L_0x015f
                r9 = r3
                goto L_0x0160
            L_0x015f:
                r9 = r2
            L_0x0160:
                boolean r10 = r1.mo9384o()
                if (r10 != 0) goto L_0x0171
                if (r4 != 0) goto L_0x016a
                if (r6 == 0) goto L_0x016f
            L_0x016a:
                if (r9 != 0) goto L_0x0171
                if (r13 == 0) goto L_0x016f
                goto L_0x0171
            L_0x016f:
                r4 = r2
                goto L_0x0172
            L_0x0171:
                r4 = r3
            L_0x0172:
                androidx.recyclerview.widget.m r9 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r9 = r9.f3992p
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r9.f4094g
                if (r9 == 0) goto L_0x0182
                boolean r9 = r9.mo4405f()
                if (r9 == 0) goto L_0x0182
                r9 = r3
                goto L_0x0183
            L_0x0182:
                r9 = r2
            L_0x0183:
                if (r9 != 0) goto L_0x0228
                if (r4 == 0) goto L_0x0228
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r5) goto L_0x01aa
                float r1 = r1.mo9374e()
                int r1 = (int) r1
                if (r6 >= 0) goto L_0x0198
                int r4 = -r1
                goto L_0x019d
            L_0x0198:
                if (r6 <= 0) goto L_0x019c
                r4 = r1
                goto L_0x019d
            L_0x019c:
                r4 = r2
            L_0x019d:
                if (r13 >= 0) goto L_0x01a1
                int r1 = -r1
                goto L_0x01a5
            L_0x01a1:
                if (r13 <= 0) goto L_0x01a4
                goto L_0x01a5
            L_0x01a4:
                r1 = r2
            L_0x01a5:
                androidx.recyclerview.widget.m r5 = androidx.recyclerview.widget.C1251m.this
                r5.mo4268a(r4, r1)
            L_0x01aa:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r1 = r1.f3992p
                boolean r1 = r1.mo4199l()
                r4 = -1
                if (r1 == 0) goto L_0x01cc
                n3.c r1 = r0.f4348m
                int r1 = r1.mo9380k()
                n3.c r5 = r0.f4348m
                int r5 = r5.mo9383n()
                if (r1 <= r5) goto L_0x01c4
                r4 = r3
            L_0x01c4:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                boolean r1 = r1.canScrollVertically(r4)
            L_0x01ca:
                r1 = r1 ^ r3
                goto L_0x01ed
            L_0x01cc:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r1 = r1.f3992p
                boolean r1 = r1.mo4198k()
                if (r1 == 0) goto L_0x01ec
                n3.c r1 = r0.f4348m
                int r1 = r1.mo9379j()
                n3.c r5 = r0.f4348m
                int r5 = r5.mo9382m()
                if (r1 <= r5) goto L_0x01e5
                r4 = r3
            L_0x01e5:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                boolean r1 = r1.canScrollHorizontally(r4)
                goto L_0x01ca
            L_0x01ec:
                r1 = r2
            L_0x01ed:
                androidx.recyclerview.widget.m r4 = androidx.recyclerview.widget.C1251m.this
                boolean r4 = r4.f4345P0
                if (r4 != 0) goto L_0x021c
                n3.c r4 = r0.f4348m
                int r4 = r4.mo9381l()
                if (r4 != r3) goto L_0x021c
                boolean r4 = r0.f4352q
                if (r4 != 0) goto L_0x021c
                if (r1 == 0) goto L_0x021c
                java.lang.String r1 = "2.0"
                boolean r1 = miuix.view.HapticCompat.m10231c(r1)
                if (r1 == 0) goto L_0x0215
                m4.a r1 = r22.m5732i()
                r4 = 201(0xc9, float:2.82E-43)
                r1.mo6600a(r4)
                goto L_0x021c
            L_0x0215:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                int r4 = miuix.view.C2403h.f9378q
                miuix.view.HapticCompat.performHapticFeedbackAsync(r1, r4)
            L_0x021c:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3933I0
                if (r1 == 0) goto L_0x0234
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.e$b r1 = r1.f3981j0
                r1.mo4904b()
                goto L_0x0234
            L_0x0228:
                r22.mo4430d()
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.e r4 = r1.f3979i0
                if (r4 == 0) goto L_0x0234
                r4.mo4898f(r1, r8, r7)
            L_0x0234:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                androidx.recyclerview.widget.RecyclerView$p r1 = r1.f3992p
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f4094g
                if (r1 == 0) goto L_0x0245
                boolean r4 = r1.mo4405f()
                if (r4 == 0) goto L_0x0245
                r1.mo4408i(r2, r2)
            L_0x0245:
                r0.f4350o = r2
                boolean r1 = r0.f4351p
                if (r1 == 0) goto L_0x024f
                r22.m5729c()
                goto L_0x025d
            L_0x024f:
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                r1.setScrollState(r2)
                androidx.recyclerview.widget.m r1 = androidx.recyclerview.widget.C1251m.this
                r1.mo4354r1(r3)
                r0.f4354s = r2
                r0.f4353r = r2
            L_0x025d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1251m.C1252a.run():void");
        }
    }

    public C1251m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2905a.f11079a);
    }

    public C1251m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4343N0 = -1;
        this.f4345P0 = true;
    }

    /* renamed from: A1 */
    private void m5723A1(MotionEvent motionEvent, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4344O0.update((double) motionEvent.getRawX(i), (double) motionEvent.getRawY(i));
            return;
        }
        this.f4344O0.update((double) motionEvent.getRawX(), (double) motionEvent.getRawY());
    }

    /* renamed from: z1 */
    private void m5727z1(MotionEvent motionEvent) {
        int i;
        if (this.f4344O0 == null) {
            this.f4344O0 = new VelocityMonitor();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f4344O0.clear();
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4343N0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4343N0 + " not found. Did any MotionEvents get skipped?");
                return;
            }
            m5723A1(motionEvent, findPointerIndex);
            return;
        } else if (actionMasked != 5) {
            if (actionMasked == 6 && motionEvent.getPointerId(actionIndex) == this.f4343N0) {
                i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                this.f4343N0 = i;
                m5723A1(motionEvent, actionIndex);
            }
            return;
        }
        i = motionEvent.getPointerId(actionIndex);
        this.f4343N0 = i;
        m5723A1(motionEvent, actionIndex);
    }

    public boolean getSpringEnabled() {
        return this.f4345P0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m5727z1(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m5727z1(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        if (i == 2) {
            this.f4345P0 = false;
        }
    }

    public void setSpringEnabled(boolean z) {
        this.f4345P0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y1 */
    public boolean mo4712y1() {
        return false;
    }
}
