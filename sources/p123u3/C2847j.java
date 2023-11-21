package p123u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0385r1;
import androidx.preference.C1129i;
import androidx.preference.C1141m;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.FolmeBlink;
import miuix.animation.internal.BlinkStateObserver;
import miuix.appcompat.app.AlphaBlendingDrawable;
import miuix.preference.RadioButtonPreference;
import miuix.preference.RadioButtonPreferenceCategory;
import miuix.preference.RadioSetPreferenceCategory;
import miuix.view.C2400e;
import p013b3.C1318e;
import p055i3.C1649c;
import p128v3.C2870a;

@SuppressLint({"RestrictedApi"})
/* renamed from: u3.j */
class C2847j extends C1129i implements BlinkStateObserver {

    /* renamed from: E */
    private static final int[] f10686E;

    /* renamed from: F */
    private static final int[] f10687F = {16842915};

    /* renamed from: G */
    private static final int[] f10688G = {16842916};

    /* renamed from: H */
    private static final int[] f10689H = {16842917};

    /* renamed from: I */
    private static final int[] f10690I = {16842918};

    /* renamed from: J */
    private static final int[] f10691J;

    /* renamed from: K */
    private static final int[] f10692K;

    /* renamed from: A */
    private int f10693A;

    /* renamed from: B */
    private int f10694B;

    /* renamed from: C */
    private int f10695C;

    /* renamed from: D */
    private int f10696D;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2849b[] f10697j = new C2849b[mo4094g()];

    /* renamed from: k */
    private final RecyclerView.C1174j f10698k = new C2848a();

    /* renamed from: l */
    private int f10699l;

    /* renamed from: m */
    private int f10700m = 0;

    /* renamed from: n */
    private int f10701n;

    /* renamed from: o */
    private int f10702o;

    /* renamed from: p */
    private int f10703p;

    /* renamed from: q */
    private RecyclerView f10704q;

    /* renamed from: r */
    private FolmeBlink f10705r;

    /* renamed from: s */
    private int f10706s = 0;

    /* renamed from: t */
    private int f10707t = -1;

    /* renamed from: u */
    private View f10708u = null;

    /* renamed from: v */
    private boolean f10709v = false;

    /* renamed from: w */
    private View.OnTouchListener f10710w = null;

    /* renamed from: x */
    private RecyclerView.C1191t f10711x = null;

    /* renamed from: y */
    private Paint f10712y;

    /* renamed from: z */
    private int f10713z;

    /* renamed from: u3.j$a */
    class C2848a extends RecyclerView.C1174j {
        C2848a() {
        }

        /* renamed from: a */
        public void mo4512a() {
            super.mo4512a();
            C2847j jVar = C2847j.this;
            C2849b[] unused = jVar.f10697j = new C2849b[jVar.mo4094g()];
        }
    }

    /* renamed from: u3.j$b */
    class C2849b {

        /* renamed from: a */
        int[] f10715a;

        /* renamed from: b */
        int f10716b;

        C2849b() {
        }
    }

    static {
        int i = C2850k.f10733p;
        int i2 = C2850k.f10732o;
        int[] iArr = {16842915, 16842916, 16842917, 16842918, i, i2};
        f10686E = iArr;
        Arrays.sort(iArr);
        f10691J = new int[]{i};
        f10692K = new int[]{i2};
    }

    public C2847j(PreferenceGroup preferenceGroup) {
        super(preferenceGroup);
        mo10122U(preferenceGroup.mo3949i());
    }

    /* renamed from: I */
    private boolean m11812I(Preference preference) {
        return !(preference instanceof PreferenceCategory) && (!(preference instanceof RadioButtonPreference) || (preference.mo3971u() instanceof RadioSetPreferenceCategory)) && (!(preference instanceof C2834c) || ((C2834c) preference).mo10102a());
    }

    /* renamed from: L */
    private void m11814L(Drawable drawable, boolean z, boolean z2) {
        if (drawable instanceof C2870a) {
            C2870a aVar = (C2870a) drawable;
            aVar.mo10151h(true);
            Paint paint = this.f10712y;
            int i = this.f10713z;
            int i2 = this.f10693A;
            int i3 = this.f10694B;
            int i4 = this.f10706s;
            aVar.mo10149f(paint, i, i2, i3 + i4, this.f10695C + i4, this.f10696D);
            boolean b = C0385r1.m1722b(this.f10704q);
            Pair R = mo10120R(this.f10704q, b);
            aVar.mo10150g(((Integer) R.first).intValue(), ((Integer) R.second).intValue(), b);
            aVar.mo10152i(z, z2);
        }
    }

    /* renamed from: M */
    private void m11815M(RadioButtonPreferenceCategory radioButtonPreferenceCategory) {
        int M0 = radioButtonPreferenceCategory.mo4001M0();
        for (int i = 0; i < M0; i++) {
            Preference L0 = radioButtonPreferenceCategory.mo4000L0(i);
            if (L0 instanceof RadioSetPreferenceCategory) {
                m11816N((RadioSetPreferenceCategory) L0);
            }
        }
    }

    /* renamed from: N */
    private void m11816N(RadioSetPreferenceCategory radioSetPreferenceCategory) {
        int D;
        View childAt;
        int M0 = radioSetPreferenceCategory.mo4001M0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < M0; i++) {
            Preference L0 = radioSetPreferenceCategory.mo4000L0(i);
            if (!(L0 == null || (D = mo4090D(L0)) == -1 || (childAt = this.f10704q.getChildAt(D)) == null)) {
                arrayList.add(childAt);
            }
        }
        m11818P(arrayList);
    }

    /* renamed from: O */
    private void m11817O(View view, boolean z, boolean z2) {
        if (view != null) {
            m11814L(view.getBackground(), z, z2);
        }
    }

    /* renamed from: P */
    private void m11818P(List<View> list) {
        int i = 0;
        while (i < list.size()) {
            boolean z = true;
            boolean z2 = i == 0;
            if (i != list.size() - 1) {
                z = false;
            }
            m11817O(list.get(i), z2, z);
            i++;
        }
    }

    /* renamed from: Q */
    private List<Preference> m11819Q(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < preferenceGroup.mo4001M0(); i++) {
            Preference L0 = preferenceGroup.mo4000L0(i);
            if (L0.mo3926L()) {
                arrayList.add(L0);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11820T(androidx.preference.Preference r8, int r9) {
        /*
            r7 = this;
            if (r9 < 0) goto L_0x0019
            u3.j$b[] r0 = r7.f10697j
            int r1 = r0.length
            if (r9 >= r1) goto L_0x0019
            r1 = r0[r9]
            if (r1 != 0) goto L_0x0012
            u3.j$b r1 = new u3.j$b
            r1.<init>()
            r0[r9] = r1
        L_0x0012:
            u3.j$b[] r0 = r7.f10697j
            r0 = r0[r9]
            int[] r0 = r0.f10715a
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x00c4
            androidx.preference.PreferenceGroup r0 = r8.mo3971u()
            if (r0 == 0) goto L_0x00c4
            java.util.List r0 = r7.m11819Q(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            return
        L_0x002d:
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x0039
            int[] r0 = f10687F
            r1 = r2
            goto L_0x0061
        L_0x0039:
            java.lang.Object r1 = r0.get(r3)
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            int r1 = r8.compareTo(r1)
            if (r1 != 0) goto L_0x0049
            int[] r0 = f10688G
            r1 = 2
            goto L_0x0061
        L_0x0049:
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            int r0 = r8.compareTo(r0)
            if (r0 != 0) goto L_0x005e
            int[] r0 = f10690I
            r1 = 4
            goto L_0x0061
        L_0x005e:
            int[] r0 = f10689H
            r1 = 3
        L_0x0061:
            boolean r4 = r8 instanceof androidx.preference.PreferenceCategory
            if (r4 == 0) goto L_0x00bc
            androidx.preference.PreferenceCategory r8 = (androidx.preference.PreferenceCategory) r8
            boolean r4 = r8 instanceof miuix.preference.PreferenceCategory
            if (r4 == 0) goto L_0x007b
            miuix.preference.PreferenceCategory r8 = (miuix.preference.PreferenceCategory) r8
            boolean r4 = r8.mo9022V0()
            r4 = r4 ^ r2
            boolean r8 = r8.mo9021U0()
            if (r8 != 0) goto L_0x0079
            goto L_0x0084
        L_0x0079:
            r2 = r3
            goto L_0x0084
        L_0x007b:
            java.lang.CharSequence r8 = r8.mo3919E()
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r4 = r3
        L_0x0084:
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x00bc
        L_0x0088:
            if (r4 == 0) goto L_0x0094
            int[] r8 = f10692K
            int r4 = r8.length
            int[] r4 = new int[r4]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r3, r4, r3, r5)
            goto L_0x0096
        L_0x0094:
            int[] r4 = new int[r3]
        L_0x0096:
            if (r2 == 0) goto L_0x00a2
            int[] r8 = f10691J
            int r2 = r8.length
            int[] r2 = new int[r2]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r3, r2, r3, r5)
            goto L_0x00a4
        L_0x00a2:
            int[] r2 = new int[r3]
        L_0x00a4:
            int r8 = r4.length
            int r5 = r2.length
            int r8 = r8 + r5
            int r5 = r0.length
            int r8 = r8 + r5
            int[] r8 = new int[r8]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r3, r8, r3, r5)
            int r5 = r4.length
            int r6 = r2.length
            java.lang.System.arraycopy(r2, r3, r8, r5, r6)
            int r4 = r4.length
            int r2 = r2.length
            int r4 = r4 + r2
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r8, r4, r2)
            r0 = r8
        L_0x00bc:
            u3.j$b[] r8 = r7.f10697j
            r8 = r8[r9]
            r8.f10715a = r0
            r8.f10716b = r1
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123u3.C2847j.m11820T(androidx.preference.Preference, int):void");
    }

    /* renamed from: V */
    private boolean m11821V(Preference preference) {
        return (preference.mo3959o() == null && preference.mo3955m() == null && (preference.mo3966s() == null || (preference instanceof TwoStatePreference)) && !(preference instanceof DialogPreference)) ? false : true;
    }

    /* renamed from: b0 */
    private void m11822b0(View view, AlphaBlendingDrawable alphaBlendingDrawable) {
        View childAt;
        if ((view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null && "CardView".contains(childAt.getClass().getSimpleName())) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            int paddingBottom = view.getPaddingBottom();
            if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                paddingLeft += marginLayoutParams.leftMargin;
                paddingTop += marginLayoutParams.topMargin;
                paddingRight += marginLayoutParams.rightMargin;
                paddingBottom += marginLayoutParams.bottomMargin;
            }
            alphaBlendingDrawable.mo7344c(this.f10703p);
            alphaBlendingDrawable.mo7343b(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* renamed from: c0 */
    private void m11823c0(View view) {
        view.setTag(C2853n.f10752i, Boolean.TRUE);
        if (this.f10705r == null) {
            this.f10705r = (FolmeBlink) Folme.useAt(view).blink();
        }
        this.f10705r.attach(this);
        this.f10705r.startBlink(3, new AnimConfig[0]);
        this.f10708u = view;
    }

    /* renamed from: f0 */
    private void m11824f0(Preference preference) {
        if (preference != null && this.f10704q != null) {
            if (preference instanceof RadioButtonPreferenceCategory) {
                m11815M((RadioButtonPreferenceCategory) preference);
            } else if (preference instanceof RadioSetPreferenceCategory) {
                m11816N((RadioSetPreferenceCategory) preference);
            } else {
                boolean z = preference instanceof RadioButtonPreference;
            }
        }
    }

    /* renamed from: F */
    public void mo4097o(C1141m mVar, int i) {
        int i2;
        int i3;
        C1141m mVar2 = mVar;
        int i4 = i;
        super.mo4097o(mVar, i);
        C2400e.m10241b(mVar2.f4049a, false);
        Preference C = mo4089C(i4);
        if (!(C instanceof PreferenceCategory)) {
            Folme.useAt(mVar2.f4049a).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(mVar2.f4049a, new AnimConfig[0]);
        }
        m11820T(C, i4);
        int[] iArr = this.f10697j[i4].f10715a;
        C2870a background = mVar2.f4049a.getBackground();
        int i5 = this.f10706s;
        if ((background instanceof LayerDrawable) && C != null) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            if ((C instanceof RadioButtonPreference) || (C instanceof PreferenceCategory) || (C.mo3971u() instanceof RadioSetPreferenceCategory) || mVar2.f4049a.findViewById(C2853n.f10751h) != null) {
                layerDrawable.setLayerInset(0, i5, 0, i5, 0);
                C2870a aVar = new C2870a(background);
                mVar2.f4049a.setBackground(aVar);
                aVar.setColorFilter((ColorFilter) null);
                background = aVar;
            } else {
                background.setColorFilter((ColorFilter) null);
                Rect rect = new Rect();
                if (((LayerDrawable) background).getDrawable(0).getPadding(rect)) {
                    mVar2.f4049a.setPadding(rect.left + i5, rect.top, rect.right + i5, rect.bottom);
                }
            }
        }
        if ((background instanceof StateListDrawable) && C1318e.m5962b((StateListDrawable) background, f10686E)) {
            C2870a aVar2 = new C2870a(background);
            mVar2.f4049a.setBackground(aVar2);
            background = aVar2;
        }
        if (background instanceof C2870a) {
            C2870a aVar3 = (C2870a) background;
            if (iArr != null) {
                aVar3.mo5182d(iArr);
            }
            Rect rect2 = new Rect();
            if (aVar3.getPadding(rect2)) {
                int i6 = rect2.left;
                int i7 = rect2.right;
                if (C.mo3971u() instanceof RadioSetPreferenceCategory) {
                    i7 += this.f10700m;
                }
                rect2.right = C0385r1.m1722b(this.f10704q) ? i6 : i7;
                if (C0385r1.m1722b(this.f10704q)) {
                    i6 = i7;
                }
                rect2.left = i6;
                if (C.mo3971u() instanceof RadioSetPreferenceCategory) {
                    ViewGroup.LayoutParams layoutParams = mVar2.f4049a.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
                    marginLayoutParams.setMarginEnd(this.f10704q.getScrollBarSize() * 2);
                    mVar2.f4049a.setLayoutParams(marginLayoutParams);
                    aVar3.mo10151h(false);
                    aVar3.setColorFilter(((RadioSetPreferenceCategory) C.mo3971u()).isChecked() ? this.f10701n : this.f10702o, PorterDuff.Mode.SRC_OVER);
                    RecyclerView recyclerView = this.f10704q;
                    if (recyclerView != null) {
                        boolean z = C instanceof RadioButtonPreference;
                        int scrollBarSize = recyclerView.getScrollBarSize();
                        if (C0385r1.m1722b(this.f10704q)) {
                            rect2.right += z ? 0 : this.f10699l;
                            rect2.left -= scrollBarSize * 3;
                        } else {
                            rect2.left += z ? 0 : this.f10699l;
                            rect2.right -= scrollBarSize * 3;
                        }
                    }
                } else {
                    aVar3.setColorFilter((ColorFilter) null);
                }
                i3 = rect2.left + i5;
                i2 = rect2.right + i5;
            } else {
                i3 = 0;
                i2 = 0;
            }
            mVar2.f4049a.setPadding(i3, rect2.top, i2, rect2.bottom);
            if ((C instanceof RadioButtonPreference) && ((RadioButtonPreference) C).isChecked()) {
                aVar3.mo5182d(new int[]{16842912});
            }
        }
        View findViewById = mVar2.f4049a.findViewById(C2853n.f10744a);
        if (findViewById != null) {
            findViewById.setVisibility(m11821V(C) ? 0 : 8);
        }
        if (m11812I(C)) {
            if (mVar2.f4049a.findViewById(C2853n.f10751h) == null) {
                Drawable h = C1649c.m6963h(C.mo3949i(), C2850k.f10728k);
                if (h instanceof AlphaBlendingDrawable) {
                    AlphaBlendingDrawable alphaBlendingDrawable = (AlphaBlendingDrawable) h;
                    alphaBlendingDrawable.mo7344c(0);
                    alphaBlendingDrawable.mo7343b(0, 0, 0, 0);
                    m11822b0(mVar2.f4049a, alphaBlendingDrawable);
                }
                mVar2.f4049a.setForeground(h);
            } else {
                mVar2.f4049a.setForeground(C1649c.m6963h(C.mo3949i(), C2850k.f10721d));
                Drawable foreground = mVar2.f4049a.getForeground();
                if (foreground instanceof LayerDrawable) {
                    ((LayerDrawable) foreground).setLayerInset(0, i5, 0, i5, 0);
                }
            }
        }
        mo10119K(mVar, i);
    }

    /* renamed from: K */
    public void mo10119K(C1141m mVar, int i) {
        View view = mVar.f4049a;
        if (i == this.f10707t) {
            if (this.f10709v) {
                this.f10709v = false;
            } else if (!Boolean.TRUE.equals(view.getTag(C2853n.f10752i))) {
                m11823c0(view);
            }
        } else if (Boolean.TRUE.equals(view.getTag(C2853n.f10752i))) {
            mo10129e0(view);
        }
    }

    /* renamed from: R */
    public Pair mo10120R(RecyclerView recyclerView, boolean z) {
        int i;
        int i2;
        int scrollBarSize = recyclerView.getScrollBarSize();
        if (z) {
            i2 = scrollBarSize * 3;
            i = recyclerView.getWidth();
        } else {
            i = recyclerView.getWidth() - (scrollBarSize * 3);
            i2 = 0;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo10121S(int i) {
        return this.f10697j[i].f10716b;
    }

    /* renamed from: U */
    public void mo10122U(Context context) {
        this.f10699l = C1649c.m6962g(context, C2850k.f10730m);
        this.f10701n = C1649c.m6960e(context, C2850k.f10718a);
        this.f10702o = C1649c.m6960e(context, C2850k.f10719b);
        this.f10703p = context.getResources().getDimensionPixelSize(C2851l.f10741d);
    }

    /* renamed from: W */
    public boolean mo10123W() {
        return this.f10707t != -1;
    }

    /* renamed from: X */
    public void mo4504u(C1141m mVar) {
        super.mo4504u(mVar);
        mo10129e0(mVar.f4049a);
    }

    /* renamed from: Y */
    public void mo4505v(C1141m mVar) {
        super.mo4505v(mVar);
        mo10129e0(mVar.f4049a);
    }

    /* renamed from: Z */
    public void mo10126Z(Paint paint, int i, int i2, int i3, int i4, int i5) {
        this.f10712y = paint;
        this.f10713z = i;
        this.f10693A = i2;
        this.f10694B = i3;
        this.f10695C = i4;
        this.f10696D = i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public boolean mo10127a0(int i) {
        if (this.f10706s == i) {
            return false;
        }
        this.f10706s = i;
        return true;
    }

    /* renamed from: b */
    public void mo3989b(Preference preference) {
        Preference a;
        super.mo3989b(preference);
        String j = preference.mo3951j();
        if (!TextUtils.isEmpty(j) && (a = preference.mo3914A().mo4112a(j)) != null) {
            preference.mo3915A0(preference instanceof PreferenceCategory ? a instanceof TwoStatePreference ? ((TwoStatePreference) a).isChecked() : a.mo3923I() : preference.mo3923I());
        }
    }

    /* renamed from: c */
    public void mo3990c(Preference preference) {
        if (preference != null && !preference.mo3926L()) {
            m11824f0(preference);
        }
        super.mo3990c(preference);
    }

    /* renamed from: d0 */
    public void mo10128d0() {
        View view = this.f10708u;
        if (view != null) {
            mo10129e0(view);
            FolmeBlink folmeBlink = this.f10705r;
            if (folmeBlink != null) {
                folmeBlink.detach(this);
            }
            this.f10705r = null;
            this.f10709v = false;
        }
    }

    /* renamed from: e0 */
    public void mo10129e0(View view) {
        if (mo10123W() && view != null) {
            Boolean bool = Boolean.TRUE;
            int i = C2853n.f10752i;
            if (bool.equals(view.getTag(i))) {
                Folme.useAt(view).blink().stopBlink();
                view.setTag(i, Boolean.FALSE);
                if (this.f10708u == view) {
                    this.f10708u = null;
                }
                this.f10707t = -1;
                RecyclerView recyclerView = this.f10704q;
                if (recyclerView != null) {
                    recyclerView.mo4263X0(this.f10711x);
                    this.f10704q.setOnTouchListener((View.OnTouchListener) null);
                    this.f10711x = null;
                    this.f10710w = null;
                }
            }
        }
    }

    /* renamed from: n */
    public void mo4499n(RecyclerView recyclerView) {
        super.mo4499n(recyclerView);
        mo4506w(this.f10698k);
        this.f10704q = recyclerView;
    }

    /* renamed from: r */
    public void mo4501r(RecyclerView recyclerView) {
        super.mo4501r(recyclerView);
        mo4508y(this.f10698k);
        this.f10704q = null;
    }

    public void updateBlinkState(boolean z) {
        RecyclerView recyclerView;
        if (z && (recyclerView = this.f10704q) != null) {
            recyclerView.mo4263X0(this.f10711x);
            this.f10704q.setOnTouchListener((View.OnTouchListener) null);
            this.f10711x = null;
            this.f10710w = null;
            FolmeBlink folmeBlink = this.f10705r;
            if (folmeBlink != null) {
                folmeBlink.detach(this);
            }
        }
    }
}
