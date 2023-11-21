package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0413v0;
import androidx.core.graphics.C0542a;
import p021d.C1447a;
import p021d.C1449c;
import p021d.C1450d;
import p021d.C1451e;
import p027e.C1512a;

/* renamed from: androidx.appcompat.widget.h */
public final class C0327h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1291b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0327h f1292c;

    /* renamed from: a */
    private C0413v0 f1293a;

    /* renamed from: androidx.appcompat.widget.h$a */
    class C0328a implements C0413v0.C0416c {

        /* renamed from: a */
        private final int[] f1294a = {C1451e.f5742R, C1451e.f5740P, C1451e.f5744a};

        /* renamed from: b */
        private final int[] f1295b = {C1451e.f5758o, C1451e.f5726B, C1451e.f5763t, C1451e.f5759p, C1451e.f5760q, C1451e.f5762s, C1451e.f5761r};

        /* renamed from: c */
        private final int[] f1296c = {C1451e.f5739O, C1451e.f5741Q, C1451e.f5754k, C1451e.f5735K, C1451e.f5736L, C1451e.f5737M, C1451e.f5738N};

        /* renamed from: d */
        private final int[] f1297d = {C1451e.f5766w, C1451e.f5752i, C1451e.f5765v};

        /* renamed from: e */
        private final int[] f1298e = {C1451e.f5734J, C1451e.f5743S};

        /* renamed from: f */
        private final int[] f1299f = {C1451e.f5746c, C1451e.f5750g, C1451e.f5747d, C1451e.f5751h};

        C0328a() {
        }

        /* renamed from: f */
        private boolean m1484f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1485g(Context context) {
            return m1486h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1486h(Context context, int i) {
            int c = C0298b1.m1341c(context, C1447a.f5697w);
            int b = C0298b1.m1340b(context, C1447a.f5695u);
            return new ColorStateList(new int[][]{C0298b1.f1202b, C0298b1.f1205e, C0298b1.f1203c, C0298b1.f1209i}, new int[]{b, C0542a.m2247c(c, i), C0542a.m2247c(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1487i(Context context) {
            return m1486h(context, C0298b1.m1341c(context, C1447a.f5694t));
        }

        /* renamed from: j */
        private ColorStateList m1488j(Context context) {
            return m1486h(context, C0298b1.m1341c(context, C1447a.f5695u));
        }

        /* renamed from: k */
        private ColorStateList m1489k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C1447a.f5699y;
            ColorStateList e = C0298b1.m1343e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0298b1.f1202b;
                iArr2[0] = C0298b1.m1340b(context, i);
                iArr[1] = C0298b1.f1206f;
                iArr2[1] = C0298b1.m1341c(context, C1447a.f5696v);
                iArr[2] = C0298b1.f1209i;
                iArr2[2] = C0298b1.m1341c(context, i);
            } else {
                int[] iArr3 = C0298b1.f1202b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = C0298b1.f1206f;
                iArr2[1] = C0298b1.m1341c(context, C1447a.f5696v);
                iArr[2] = C0298b1.f1209i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1490l(C0413v0 v0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable i2 = v0Var.mo2265i(context, C1451e.f5730F);
            Drawable i3 = v0Var.mo2265i(context, C1451e.f5731G);
            if ((i2 instanceof BitmapDrawable) && i2.getIntrinsicWidth() == dimensionPixelSize && i2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) i2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((i3 instanceof BitmapDrawable) && i3.getIntrinsicWidth() == dimensionPixelSize && i3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1491m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0336j0.m1538a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0327h.f1291b;
            }
            drawable.setColorFilter(C0327h.m1477e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1887a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0327h.f1291b
                int[] r1 = r6.f1294a
                boolean r1 = r6.m1484f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p021d.C1447a.f5698x
            L_0x0014:
                r8 = r3
            L_0x0015:
                r1 = r5
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1296c
                boolean r1 = r6.m1484f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p021d.C1447a.f5696v
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1297d
                boolean r1 = r6.m1484f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p021d.C1451e.f5764u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p021d.C1451e.f5755l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = r3
                r1 = r4
                r2 = r1
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0336j0.m1538a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0298b1.m1341c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0327h.m1477e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0327h.C0328a.mo1887a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo1888b(int i) {
            if (i == C1451e.f5732H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo1889c(C0413v0 v0Var, Context context, int i) {
            int i2;
            if (i == C1451e.f5753j) {
                return new LayerDrawable(new Drawable[]{v0Var.mo2265i(context, C1451e.f5752i), v0Var.mo2265i(context, C1451e.f5754k)});
            }
            if (i == C1451e.f5768y) {
                i2 = C1450d.f5718i;
            } else if (i == C1451e.f5767x) {
                i2 = C1450d.f5719j;
            } else if (i != C1451e.f5769z) {
                return null;
            } else {
                i2 = C1450d.f5720k;
            }
            return m1490l(v0Var, context, i2);
        }

        /* renamed from: d */
        public ColorStateList mo1890d(Context context, int i) {
            if (i == C1451e.f5756m) {
                return C1512a.m6566a(context, C1449c.f5706e);
            }
            if (i == C1451e.f5733I) {
                return C1512a.m6566a(context, C1449c.f5709h);
            }
            if (i == C1451e.f5732H) {
                return m1489k(context);
            }
            if (i == C1451e.f5749f) {
                return m1488j(context);
            }
            if (i == C1451e.f5745b) {
                return m1485g(context);
            }
            if (i == C1451e.f5748e) {
                return m1487i(context);
            }
            if (i == C1451e.f5728D || i == C1451e.f5729E) {
                return C1512a.m6566a(context, C1449c.f5708g);
            }
            if (m1484f(this.f1295b, i)) {
                return C0298b1.m1343e(context, C1447a.f5698x);
            }
            if (m1484f(this.f1298e, i)) {
                return C1512a.m6566a(context, C1449c.f5705d);
            }
            if (m1484f(this.f1299f, i)) {
                return C1512a.m6566a(context, C1449c.f5704c);
            }
            if (i == C1451e.f5725A) {
                return C1512a.m6566a(context, C1449c.f5707f);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo1891e(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i == C1451e.f5727C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C1447a.f5698x;
                m1491m(findDrawableByLayerId2, C0298b1.m1341c(context, i2), C0327h.f1291b);
                m1491m(layerDrawable.findDrawableByLayerId(16908303), C0298b1.m1341c(context, i2), C0327h.f1291b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = C0298b1.m1341c(context, C1447a.f5696v);
            } else if (i != C1451e.f5768y && i != C1451e.f5767x && i != C1451e.f5769z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1491m(layerDrawable2.findDrawableByLayerId(16908288), C0298b1.m1340b(context, C1447a.f5698x), C0327h.f1291b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C1447a.f5696v;
                m1491m(findDrawableByLayerId3, C0298b1.m1341c(context, i3), C0327h.f1291b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = C0298b1.m1341c(context, i3);
            }
            m1491m(findDrawableByLayerId, c, C0327h.f1291b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0327h m1476b() {
        C0327h hVar;
        synchronized (C0327h.class) {
            if (f1292c == null) {
                m1478h();
            }
            hVar = f1292c;
        }
        return hVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1477e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (C0327h.class) {
            k = C0413v0.m1799k(i, mode);
        }
        return k;
    }

    /* renamed from: h */
    public static synchronized void m1478h() {
        synchronized (C0327h.class) {
            if (f1292c == null) {
                C0327h hVar = new C0327h();
                f1292c = hVar;
                hVar.f1293a = C0413v0.m1797g();
                f1292c.f1293a.mo2271t(new C0328a());
            }
        }
    }

    /* renamed from: i */
    static void m1479i(Drawable drawable, C0320e1 e1Var, int[] iArr) {
        C0413v0.m1805v(drawable, e1Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo1883c(Context context, int i) {
        return this.f1293a.mo2265i(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo1884d(Context context, int i, boolean z) {
        return this.f1293a.mo2266j(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo1885f(Context context, int i) {
        return this.f1293a.mo2267l(context, i);
    }

    /* renamed from: g */
    public synchronized void mo1886g(Context context) {
        this.f1293a.mo2269r(context);
    }
}
