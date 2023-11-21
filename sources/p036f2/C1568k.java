package p036f2;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.C2118q;
import miuix.view.C2400e;
import p018c2.C1347c;
import p018c2.C1349e;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p030e2.C1531b;
import p030e2.C1532c;
import p030e2.C1537f;
import p030e2.C1538g;
import p055i3.C1649c;
import p055i3.C1656j;
import p061j3.C1758h;
import p107r2.C2619a;
import p117t2.C2695c;

/* renamed from: f2.k */
public abstract class C1568k extends C1558a {

    /* renamed from: d */
    protected C2118q f6241d;

    /* renamed from: e */
    private View f6242e;

    /* renamed from: f */
    private View f6243f;

    /* renamed from: g */
    private View f6244g;

    /* renamed from: h */
    private View f6245h;

    /* renamed from: i */
    private View f6246i;

    /* renamed from: j */
    private C1758h f6247j;

    /* renamed from: k */
    private GestureDetector f6248k;

    /* renamed from: l */
    private ViewGroup.LayoutParams f6249l;

    /* renamed from: m */
    private C1537f f6250m;

    /* renamed from: n */
    private C1538g f6251n;

    /* renamed from: o */
    private float f6252o;

    /* renamed from: p */
    private float f6253p;

    /* renamed from: q */
    private float f6254q;

    /* renamed from: r */
    private float f6255r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f6256s = true;

    /* renamed from: t */
    private float f6257t;

    /* renamed from: u */
    private final Handler f6258u = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private boolean f6259v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f6260w = true;

    /* renamed from: x */
    private boolean f6261x = true;

    /* renamed from: y */
    private final Drawable f6262y;

    /* renamed from: z */
    private int f6263z = 0;

    /* renamed from: f2.k$a */
    class C1569a extends GestureDetector.SimpleOnGestureListener {
        C1569a() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (C1568k.this.f6256s) {
                C1568k.this.m6726Q();
                C1568k.this.m6736b0();
                C1568k.this.m6741g0();
                C1568k.this.m6748n0(true, 2);
            }
            return true;
        }
    }

    /* renamed from: f2.k$b */
    private static class C1570b implements Runnable {

        /* renamed from: d */
        private WeakReference<C1568k> f6265d;

        /* renamed from: e */
        private WeakReference<C2118q> f6266e;

        public C1570b(C1568k kVar, C2118q qVar) {
            this.f6265d = new WeakReference<>(kVar);
            this.f6266e = new WeakReference<>(qVar);
        }

        /* renamed from: b */
        private void m6780b(C2118q qVar, C1568k kVar, boolean z, int i, boolean z2) {
            if (kVar.m6730U()) {
                kVar.m6746l0(z, i);
            } else if (qVar != null) {
                qVar.mo7573P0();
                m6782d(qVar, kVar, z2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m6781c(boolean z) {
            C1568k kVar = this.f6265d.get();
            if (kVar != null) {
                kVar.m6749o0(3);
            }
            C2118q qVar = this.f6266e.get();
            if (kVar != null) {
                m6780b(qVar, kVar, true, 3, z);
            }
        }

        /* renamed from: d */
        private void m6782d(C2118q qVar, C1568k kVar, boolean z) {
            if (z) {
                C1531b.m6618i(qVar, kVar.f6260w);
            }
        }

        public void run() {
            m6781c(false);
        }
    }

    /* renamed from: f2.k$c */
    private static class C1571c extends TransitionListener {

        /* renamed from: a */
        private WeakReference<C1568k> f6267a;

        /* renamed from: b */
        private int f6268b;

        /* renamed from: c */
        private boolean f6269c;

        /* renamed from: d */
        private int f6270d;

        /* renamed from: e */
        private boolean f6271e;

        private C1571c(C1568k kVar, boolean z, int i, int i2) {
            this.f6271e = false;
            this.f6267a = new WeakReference<>(kVar);
            this.f6268b = i2;
            this.f6269c = z;
            this.f6270d = i;
        }

        /* synthetic */ C1571c(C1568k kVar, boolean z, int i, int i2, C1569a aVar) {
            this(kVar, z, i, i2);
        }

        public void onCancel(Object obj) {
            super.onCancel(obj);
            WeakReference<C1568k> weakReference = this.f6267a;
            C1568k kVar = weakReference == null ? null : weakReference.get();
            if (kVar != null) {
                kVar.m6742h0(obj);
            }
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            WeakReference<C1568k> weakReference = this.f6267a;
            C1568k kVar = weakReference == null ? null : weakReference.get();
            if (kVar != null) {
                kVar.m6742h0(obj);
            }
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo findBy = UpdateInfo.findBy(collection, ViewProperty.TRANSLATION_Y);
            if (this.f6269c && findBy != null) {
                C1568k kVar = this.f6267a.get();
                if (!this.f6271e && findBy.getFloatValue() > ((float) this.f6270d) * 0.6f && kVar != null) {
                    this.f6271e = true;
                    kVar.mo5719M();
                }
            }
        }
    }

    public C1568k(C2118q qVar) {
        this.f6241d = qVar;
        this.f6262y = C1649c.m6963h(qVar, 16842836);
    }

    /* renamed from: G */
    private void m6719G(int i) {
        m6749o0(i);
        if (!m6730U()) {
            this.f6241d.mo7573P0();
            C1531b.m6620k(this.f6241d);
        } else if (!this.f6259v) {
            m6747m0(i);
        }
        mo5713K();
    }

    /* renamed from: H */
    private boolean m6720H() {
        new C1570b(this, this.f6241d).m6781c(true);
        return true;
    }

    /* renamed from: J */
    private void m6721J(float f) {
        this.f6243f.setAlpha((1.0f - Math.max(0.0f, Math.min(f, 1.0f))) * 0.3f);
    }

    /* renamed from: L */
    private void m6722L(boolean z, int i) {
        Object obj;
        float f;
        int i2;
        if (!this.f6259v || !z) {
            this.f6259v = true;
            if (z) {
                i2 = (int) this.f6257t;
                f = 0.0f;
                obj = "dismiss";
            } else {
                f = 0.3f;
                obj = "init";
                i2 = 0;
            }
            AnimConfig l = C1532c.m6632l(z ? 2 : 1, (Runnable) null);
            l.addListeners(new C1571c(this, z, i2, i, (C1569a) null));
            AnimState add = new AnimState(obj).add(ViewProperty.TRANSLATION_Y, (double) i2);
            AnimState add2 = new AnimState(obj).add(ViewProperty.ALPHA, (double) f);
            Folme.useAt(m6725P()).state().mo6815to(add, l);
            Folme.useAt(this.f6243f).state().mo6815to(add2, new AnimConfig[0]);
        }
    }

    /* renamed from: N */
    private void m6723N() {
        this.f6244g.post(new C1567j(this));
    }

    /* renamed from: O */
    private void m6724O() {
        View P = m6725P();
        IStateStyle state = Folme.useAt(P).state();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
        state.setTo(viewProperty, Integer.valueOf(P.getHeight() + ((this.f6246i.getHeight() - P.getHeight()) / 2))).mo6816to(viewProperty, 0, C1532c.m6632l(1, (Runnable) null));
        C2619a.m11079b(this.f6243f);
    }

    /* renamed from: P */
    private View m6725P() {
        View view = this.f6245h;
        return view == null ? this.f6244g : view;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m6726Q() {
        C1538g gVar;
        if (!C1531b.m6615f() && (gVar = this.f6251n) != null && this.f6256s) {
            gVar.mo5655e(this.f6241d);
        }
    }

    /* renamed from: R */
    private void m6727R(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m6740f0();
            float rawY = motionEvent.getRawY();
            this.f6252o = rawY;
            this.f6253p = rawY;
            this.f6254q = 0.0f;
            m6736b0();
        } else if (action == 1) {
            boolean z = false;
            boolean z2 = motionEvent.getRawY() - this.f6252o > ((float) this.f6244g.getHeight()) * 0.5f;
            m6749o0(1);
            if (z2) {
                m6726Q();
                C1538g gVar = this.f6251n;
                if (gVar == null || !gVar.mo5650h(1)) {
                    z = true;
                }
            }
            m6722L(z, 1);
        } else if (action == 2) {
            float rawY2 = motionEvent.getRawY();
            float f = this.f6254q + (rawY2 - this.f6253p);
            this.f6254q = f;
            if (f >= 0.0f) {
                m6738d0(f);
                m6721J(this.f6254q / this.f6257t);
            }
            this.f6253p = rawY2;
        }
    }

    /* renamed from: S */
    private boolean m6728S() {
        return this.f6260w && m6729T();
    }

    /* renamed from: T */
    private boolean m6729T() {
        C1538g gVar = this.f6251n;
        if (gVar == null) {
            return true;
        }
        return gVar.mo5654d();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6251n;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m6730U() {
        /*
            r1 = this;
            boolean r0 = r1.f6260w
            if (r0 == 0) goto L_0x0011
            e2.g r0 = r1.f6251n
            if (r0 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            boolean r0 = r0.mo5653c()
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036f2.C1568k.m6730U():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m6731W() {
        if (m6728S()) {
            m6737c0();
            m6724O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ boolean m6732X(View view, MotionEvent motionEvent) {
        this.f6248k.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m6733Y() {
        this.f6246i.setOnTouchListener(new C1566i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ boolean m6734Z(View view, MotionEvent motionEvent) {
        if (!this.f6256s) {
            return true;
        }
        m6727R(motionEvent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m6735a0(float f) {
        this.f6247j.setAlpha(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m6736b0() {
        View P = m6725P();
        this.f6257t = (float) (P.getHeight() + ((this.f6246i.getHeight() - P.getHeight()) / 2));
    }

    /* renamed from: c0 */
    private void m6737c0() {
        C1538g gVar = this.f6251n;
        if (gVar != null) {
            gVar.mo5658i(this.f6241d);
        }
    }

    /* renamed from: d0 */
    private void m6738d0(float f) {
        m6725P().setTranslationY(f);
    }

    /* renamed from: e0 */
    private void m6739e0() {
        C1538g gVar = this.f6251n;
        if (gVar != null) {
            gVar.mo5656f();
        }
    }

    /* renamed from: f0 */
    private void m6740f0() {
        C1538g gVar = this.f6251n;
        if (gVar != null) {
            gVar.mo5657g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m6741g0() {
        C1538g gVar = this.f6251n;
        if (gVar != null) {
            gVar.mo5652b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m6742h0(Object obj) {
        if (TextUtils.equals("dismiss", obj.toString())) {
            this.f6241d.mo7573P0();
        } else if (TextUtils.equals("init", obj.toString())) {
            m6739e0();
        }
        this.f6259v = false;
    }

    /* renamed from: i0 */
    private void m6743i0() {
        if (this.f6260w) {
            float alpha = this.f6247j.getAlpha();
            this.f6247j.setAlpha(0.0f);
            this.f6247j.postDelayed(new C1565h(this, alpha), 90);
        }
    }

    /* renamed from: j0 */
    private void m6744j0(View view) {
        this.f6245h = view;
    }

    /* renamed from: k0 */
    private void m6745k0(C1758h hVar) {
        float f;
        int i = 0;
        if (!this.f6260w || !this.f6261x) {
            f = 0.0f;
        } else {
            f = (float) this.f6241d.getResources().getDimensionPixelSize(C1350f.f4626V);
            i = C1649c.m6961f(this.f6241d, C1347c.f4539G, 0);
        }
        hVar.mo6043e(f, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m6746l0(boolean z, int i) {
        if (z && !this.f6259v) {
            m6736b0();
            m6741g0();
            m6722L(true, i);
        }
    }

    /* renamed from: m0 */
    private void m6747m0(int i) {
        m6736b0();
        m6741g0();
        m6722L(true, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m6748n0(boolean z, int i) {
        C1537f fVar;
        C1538g gVar;
        m6749o0(i);
        boolean z2 = false;
        if (z && (((fVar = this.f6250m) == null || !fVar.mo5650h(i)) && ((gVar = this.f6251n) == null || !gVar.mo5650h(i)))) {
            z2 = true;
        }
        m6722L(z2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m6749o0(int i) {
        this.f6263z = i;
    }

    /* renamed from: F */
    public void mo5647F() {
        if (this.f6260w) {
            C1532c.m6627g(this.f6244g);
        }
    }

    /* renamed from: I */
    public void mo5648I() {
        if (this.f6260w) {
            C1532c.m6625e(this.f6244g);
        }
    }

    /* renamed from: K */
    public void mo5713K() {
    }

    /* renamed from: M */
    public void mo5719M() {
        C1538g gVar = this.f6251n;
        if (gVar != null) {
            gVar.mo5651a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo5720V() {
        return this.f6260w;
    }

    /* renamed from: a */
    public boolean mo5699a() {
        if (C1531b.m6615f()) {
            return m6720H();
        }
        if (this.f6260w) {
            m6726Q();
            this.f6258u.postDelayed(new C1570b(this, this.f6241d), 110);
            return true;
        }
        this.f6241d.mo7573P0();
        mo5713K();
        return true;
    }

    /* renamed from: b */
    public View mo5700b() {
        return this.f6244g;
    }

    /* renamed from: c */
    public ViewGroup.LayoutParams mo5701c() {
        return this.f6249l;
    }

    /* renamed from: d */
    public void mo5702d() {
        this.f6244g.setVisibility(8);
    }

    /* renamed from: e */
    public void mo5703e() {
        this.f6243f.setVisibility(8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: f */
    public void mo5704f(View view, boolean z) {
        Drawable drawable;
        View view2;
        int i;
        View view3;
        this.f6242e = view.findViewById(C1352h.f4702X);
        View findViewById = view.findViewById(C1352h.f4719h);
        this.f6243f = findViewById;
        findViewById.setAlpha(0.3f);
        this.f6244g = view.findViewById(C1352h.f4723j);
        this.f6246i = view.findViewById(C1352h.f4721i);
        this.f6260w = z;
        this.f6248k = new GestureDetector(view.getContext(), new C1569a());
        this.f6246i.postDelayed(new C1563f(this), 500);
        this.f6242e.setOnTouchListener(new C1564g(this));
        m6723N();
        this.f6241d.getWindow().setBackgroundDrawableResource(C1349e.f4604h);
        if (this.f6260w || !C1656j.m6984c(this.f6241d)) {
            view2 = this.f6244g;
            drawable = this.f6262y;
        } else {
            view2 = this.f6244g;
            drawable = new ColorDrawable(-16777216);
        }
        view2.setBackground(drawable);
        if (!this.f6256s || !this.f6260w) {
            view3 = this.f6242e;
            i = 8;
        } else {
            view3 = this.f6242e;
            i = 0;
        }
        view3.setVisibility(i);
    }

    /* renamed from: i */
    public void mo5706i() {
        if (this.f6260w && !C1531b.m6615f()) {
            m6726Q();
        }
        m6719G(4);
    }

    /* renamed from: j */
    public ViewGroup mo5707j(View view, boolean z) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f6241d, C1354j.f4750I, (ViewGroup) null);
        View findViewById = viewGroup.findViewById(C1352h.f4723j);
        View findViewById2 = viewGroup.findViewById(C1352h.f4702X);
        if (findViewById2 != null && (findViewById2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) findViewById2.getParent()).removeView(findViewById2);
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(findViewById2);
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, 17);
        this.f6249l = layoutParams2;
        if (!z) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        } else {
            layoutParams2.height = -2;
            layoutParams2.width = -2;
        }
        viewGroup.removeView(findViewById);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.f6255r = (float) this.f6241d.getResources().getDimensionPixelSize(C1350f.f4627W);
        C1758h hVar = new C1758h(this.f6241d);
        this.f6247j = hVar;
        hVar.setLayoutParams(this.f6249l);
        this.f6247j.addView(view);
        this.f6247j.setRadius(z ? this.f6255r : 0.0f);
        m6745k0(this.f6247j);
        m6743i0();
        viewGroup.addView(this.f6247j);
        m6744j0(this.f6247j);
        return viewGroup;
    }

    /* renamed from: k */
    public void mo5708k(boolean z) {
        View view;
        int i;
        this.f6256s = z;
        if (!z || !this.f6260w) {
            view = this.f6242e;
            i = 8;
        } else {
            view = this.f6242e;
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: l */
    public void mo5709l(boolean z) {
        View view;
        Drawable drawable;
        this.f6260w = z;
        if (!C2695c.m11259b(this.f6241d.getIntent())) {
            C2400e.m10240a(this.f6241d, true);
        }
        if (this.f6247j != null) {
            float dimensionPixelSize = (float) this.f6241d.getResources().getDimensionPixelSize(C1350f.f4627W);
            this.f6255r = dimensionPixelSize;
            C1758h hVar = this.f6247j;
            if (!z) {
                dimensionPixelSize = 0.0f;
            }
            hVar.setRadius(dimensionPixelSize);
            m6745k0(this.f6247j);
        }
        if (this.f6244g != null) {
            if (z || !C1656j.m6984c(this.f6241d)) {
                view = this.f6244g;
                drawable = this.f6262y;
            } else {
                view = this.f6244g;
                drawable = new ColorDrawable(-16777216);
            }
            view.setBackground(drawable);
        }
        View view2 = this.f6242e;
        if (view2 != null) {
            view2.setVisibility((!this.f6256s || !this.f6260w) ? 8 : 0);
        }
    }

    /* renamed from: m */
    public void mo5710m(C1538g gVar) {
        this.f6251n = gVar;
    }

    /* renamed from: n */
    public boolean mo5711n() {
        return true;
    }

    /* renamed from: o */
    public void mo5712o() {
        this.f6244g.setVisibility(0);
    }

    /* renamed from: p */
    public void mo5649p() {
        if (this.f6260w) {
            C1532c.m6622b(this.f6244g);
        }
    }
}
