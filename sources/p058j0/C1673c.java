package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0727l0;
import java.util.Map;

/* renamed from: j0.c */
public class C1673c extends C1710l {

    /* renamed from: O */
    private static final String[] f6563O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: P */
    private static final Property<Drawable, PointF> f6564P = new C1675b(PointF.class, "boundsOrigin");

    /* renamed from: Q */
    private static final Property<C1684k, PointF> f6565Q = new C1676c(PointF.class, "topLeft");

    /* renamed from: R */
    private static final Property<C1684k, PointF> f6566R = new C1677d(PointF.class, "bottomRight");

    /* renamed from: S */
    private static final Property<View, PointF> f6567S = new C1678e(PointF.class, "bottomRight");

    /* renamed from: T */
    private static final Property<View, PointF> f6568T = new C1679f(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<View, PointF> f6569U = new C1680g(PointF.class, "position");

    /* renamed from: V */
    private static C1706j f6570V = new C1706j();

    /* renamed from: L */
    private int[] f6571L = new int[2];

    /* renamed from: M */
    private boolean f6572M = false;

    /* renamed from: N */
    private boolean f6573N = false;

    /* renamed from: j0.c$a */
    class C1674a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f6574d;

        /* renamed from: e */
        final /* synthetic */ BitmapDrawable f6575e;

        /* renamed from: f */
        final /* synthetic */ View f6576f;

        /* renamed from: g */
        final /* synthetic */ float f6577g;

        C1674a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f6574d = viewGroup;
            this.f6575e = bitmapDrawable;
            this.f6576f = view;
            this.f6577g = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1668a0.m7017b(this.f6574d).mo5997d(this.f6575e);
            C1668a0.m7022g(this.f6576f, this.f6577g);
        }
    }

    /* renamed from: j0.c$b */
    class C1675b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f6579a = new Rect();

        C1675b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6579a);
            Rect rect = this.f6579a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6579a);
            this.f6579a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6579a);
        }
    }

    /* renamed from: j0.c$c */
    class C1676c extends Property<C1684k, PointF> {
        C1676c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1684k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1684k kVar, PointF pointF) {
            kVar.mo5903c(pointF);
        }
    }

    /* renamed from: j0.c$d */
    class C1677d extends Property<C1684k, PointF> {
        C1677d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1684k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1684k kVar, PointF pointF) {
            kVar.mo5902a(pointF);
        }
    }

    /* renamed from: j0.c$e */
    class C1678e extends Property<View, PointF> {
        C1678e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1668a0.m7021f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: j0.c$f */
    class C1679f extends Property<View, PointF> {
        C1679f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1668a0.m7021f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j0.c$g */
    class C1680g extends Property<View, PointF> {
        C1680g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1668a0.m7021f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: j0.c$h */
    class C1681h extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1684k f6580d;
        private C1684k mViewBounds;

        C1681h(C1684k kVar) {
            this.f6580d = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: j0.c$i */
    class C1682i extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f6582d;

        /* renamed from: e */
        final /* synthetic */ View f6583e;

        /* renamed from: f */
        final /* synthetic */ Rect f6584f;

        /* renamed from: g */
        final /* synthetic */ int f6585g;

        /* renamed from: h */
        final /* synthetic */ int f6586h;

        /* renamed from: i */
        final /* synthetic */ int f6587i;

        /* renamed from: j */
        final /* synthetic */ int f6588j;

        C1682i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f6583e = view;
            this.f6584f = rect;
            this.f6585g = i;
            this.f6586h = i2;
            this.f6587i = i3;
            this.f6588j = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6582d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6582d) {
                C0727l0.m2886e0(this.f6583e, this.f6584f);
                C1668a0.m7021f(this.f6583e, this.f6585g, this.f6586h, this.f6587i, this.f6588j);
            }
        }
    }

    /* renamed from: j0.c$j */
    class C1683j extends C1718m {

        /* renamed from: d */
        boolean f6590d = false;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f6591e;

        C1683j(ViewGroup viewGroup) {
            this.f6591e = viewGroup;
        }

        /* renamed from: b */
        public void mo5898b(C1710l lVar) {
            C1740x.m7267c(this.f6591e, true);
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            if (!this.f6590d) {
                C1740x.m7267c(this.f6591e, false);
            }
            lVar.mo5930P(this);
        }

        /* renamed from: d */
        public void mo5900d(C1710l lVar) {
            C1740x.m7267c(this.f6591e, false);
            this.f6590d = true;
        }

        /* renamed from: e */
        public void mo5901e(C1710l lVar) {
            C1740x.m7267c(this.f6591e, false);
        }
    }

    /* renamed from: j0.c$k */
    private static class C1684k {

        /* renamed from: a */
        private int f6593a;

        /* renamed from: b */
        private int f6594b;

        /* renamed from: c */
        private int f6595c;

        /* renamed from: d */
        private int f6596d;

        /* renamed from: e */
        private View f6597e;

        /* renamed from: f */
        private int f6598f;

        /* renamed from: g */
        private int f6599g;

        C1684k(View view) {
            this.f6597e = view;
        }

        /* renamed from: b */
        private void m7054b() {
            C1668a0.m7021f(this.f6597e, this.f6593a, this.f6594b, this.f6595c, this.f6596d);
            this.f6598f = 0;
            this.f6599g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5902a(PointF pointF) {
            this.f6595c = Math.round(pointF.x);
            this.f6596d = Math.round(pointF.y);
            int i = this.f6599g + 1;
            this.f6599g = i;
            if (this.f6598f == i) {
                m7054b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5903c(PointF pointF) {
            this.f6593a = Math.round(pointF.x);
            this.f6594b = Math.round(pointF.y);
            int i = this.f6598f + 1;
            this.f6598f = i;
            if (i == this.f6599g) {
                m7054b();
            }
        }
    }

    /* renamed from: c0 */
    private void m7032c0(C1735s sVar) {
        View view = sVar.f6714b;
        if (C0727l0.m2860J(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f6713a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f6713a.put("android:changeBounds:parent", sVar.f6714b.getParent());
            if (this.f6573N) {
                sVar.f6714b.getLocationInWindow(this.f6571L);
                sVar.f6713a.put("android:changeBounds:windowX", Integer.valueOf(this.f6571L[0]));
                sVar.f6713a.put("android:changeBounds:windowY", Integer.valueOf(this.f6571L[1]));
            }
            if (this.f6572M) {
                sVar.f6713a.put("android:changeBounds:clip", C0727l0.m2907p(view));
            }
        }
    }

    /* renamed from: d0 */
    private boolean m7033d0(View view, View view2) {
        if (!this.f6573N) {
            return true;
        }
        C1735s t = mo5956t(view, true);
        if (t == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == t.f6714b) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public String[] mo5867D() {
        return f6563O;
    }

    /* renamed from: g */
    public void mo5868g(C1735s sVar) {
        m7032c0(sVar);
    }

    /* renamed from: j */
    public void mo5869j(C1735s sVar) {
        m7032c0(sVar);
    }

    /* renamed from: n */
    public Animator mo5870n(ViewGroup viewGroup, C1735s sVar, C1735s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C1735s sVar3 = sVar;
        C1735s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f6713a;
        Map<String, Object> map2 = sVar4.f6713a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f6714b;
        if (m7033d0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f6713a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f6713a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f6713a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f6713a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f6572M) {
                view = view3;
                C1668a0.m7021f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo5959v().mo5914a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f6569U;
                    } else {
                        C1684k kVar = new C1684k(view);
                        ObjectAnimator a = C1698f.m7098a(kVar, f6565Q, mo5959v().mo5914a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1698f.m7098a(kVar, f6566R, mo5959v().mo5914a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C1681h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo5959v().mo5914a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f6567S;
                } else {
                    path = mo5959v().mo5914a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f6568T;
                }
                animator = C1698f.m7098a(view, property, path);
            } else {
                view = view3;
                C1668a0.m7021f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C1698f.m7098a(view, f6569U, mo5959v().mo5914a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0727l0.m2886e0(view, rect);
                    C1706j jVar = f6570V;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                    ofObject.addListener(new C1682i(view, rect6, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C1734r.m7257c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1740x.m7267c(viewGroup4, true);
                mo5940a(new C1683j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f6713a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f6713a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f6713a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f6713a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f6571L);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C1668a0.m7018c(view2);
        C1668a0.m7022g(view2, 0.0f);
        C1668a0.m7017b(viewGroup).mo5995b(bitmapDrawable);
        C1700g v = mo5959v();
        int[] iArr = this.f6571L;
        int i15 = iArr[0];
        int i16 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1702h.m7103a(f6564P, v.mo5914a((float) (intValue - i15), (float) (intValue2 - i16), (float) (intValue3 - i15), (float) (intValue4 - i16)))});
        ofPropertyValuesHolder.addListener(new C1674a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
