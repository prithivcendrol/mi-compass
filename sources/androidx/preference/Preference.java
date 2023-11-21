package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.res.C0540j;
import androidx.core.view.accessibility.C0637g;
import androidx.preference.C1134k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p027e.C1512a;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private boolean f3565A;

    /* renamed from: B */
    private boolean f3566B;

    /* renamed from: C */
    private boolean f3567C;

    /* renamed from: D */
    private boolean f3568D;

    /* renamed from: E */
    private boolean f3569E;

    /* renamed from: F */
    private boolean f3570F;

    /* renamed from: G */
    private boolean f3571G;

    /* renamed from: H */
    private boolean f3572H;

    /* renamed from: I */
    private int f3573I;

    /* renamed from: J */
    private int f3574J;

    /* renamed from: K */
    private C1094c f3575K;

    /* renamed from: L */
    private List<Preference> f3576L;

    /* renamed from: M */
    private PreferenceGroup f3577M;

    /* renamed from: N */
    private boolean f3578N;

    /* renamed from: O */
    private boolean f3579O;

    /* renamed from: P */
    private C1097f f3580P;

    /* renamed from: Q */
    private C1098g f3581Q;

    /* renamed from: R */
    private final View.OnClickListener f3582R;

    /* renamed from: d */
    private final Context f3583d;

    /* renamed from: e */
    private C1134k f3584e;

    /* renamed from: f */
    private long f3585f;

    /* renamed from: g */
    private boolean f3586g;

    /* renamed from: h */
    private C1095d f3587h;

    /* renamed from: i */
    private C1096e f3588i;

    /* renamed from: j */
    private int f3589j;

    /* renamed from: k */
    private int f3590k;

    /* renamed from: l */
    private CharSequence f3591l;

    /* renamed from: m */
    private CharSequence f3592m;

    /* renamed from: n */
    private int f3593n;

    /* renamed from: o */
    private Drawable f3594o;

    /* renamed from: p */
    private String f3595p;

    /* renamed from: q */
    private Intent f3596q;

    /* renamed from: r */
    private String f3597r;

    /* renamed from: s */
    private Bundle f3598s;

    /* renamed from: t */
    private boolean f3599t;

    /* renamed from: u */
    private boolean f3600u;

    /* renamed from: v */
    private boolean f3601v;

    /* renamed from: w */
    private String f3602w;

    /* renamed from: x */
    private Object f3603x;

    /* renamed from: y */
    private boolean f3604y;

    /* renamed from: z */
    private boolean f3605z;

    /* renamed from: androidx.preference.Preference$a */
    class C1091a implements View.OnClickListener {
        C1091a() {
        }

        public void onClick(View view) {
            Preference.this.mo3862f0(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public static class C1092b extends AbsSavedState {
        public static final Parcelable.Creator<C1092b> CREATOR = new C1093a();

        /* renamed from: androidx.preference.Preference$b$a */
        class C1093a implements Parcelable.Creator<C1092b> {
            C1093a() {
            }

            /* renamed from: a */
            public C1092b createFromParcel(Parcel parcel) {
                return new C1092b(parcel);
            }

            /* renamed from: b */
            public C1092b[] newArray(int i) {
                return new C1092b[i];
            }
        }

        public C1092b(Parcel parcel) {
            super(parcel);
        }

        public C1092b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$c */
    interface C1094c {
        /* renamed from: a */
        void mo3988a(Preference preference);

        /* renamed from: b */
        void mo3989b(Preference preference);

        /* renamed from: c */
        void mo3990c(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C1095d {
        /* renamed from: a */
        boolean mo3991a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$e */
    public interface C1096e {
        /* renamed from: d */
        boolean mo3992d(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$f */
    private static class C1097f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        private final Preference f3607d;

        C1097f(Preference preference) {
            this.f3607d = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence C = this.f3607d.mo3892C();
            if (this.f3607d.mo3922H() && !TextUtils.isEmpty(C)) {
                contextMenu.setHeaderTitle(C);
                contextMenu.add(0, 0, 0, C1146r.f3753a).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence C = this.f3607d.mo3892C();
            ((ClipboardManager) this.f3607d.mo3949i().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", C));
            Toast.makeText(this.f3607d.mo3949i(), this.f3607d.mo3949i().getString(C1146r.f3756d, new Object[]{C}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$g */
    public interface C1098g<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3890a(T t);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3737h, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00d4, code lost:
        if (r6.hasValue(r7) != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.f3589j = r0
            r1 = 0
            r5.f3590k = r1
            r2 = 1
            r5.f3599t = r2
            r5.f3600u = r2
            r5.f3601v = r2
            r5.f3604y = r2
            r5.f3605z = r2
            r5.f3565A = r2
            r5.f3566B = r2
            r5.f3567C = r2
            r5.f3569E = r2
            r5.f3572H = r2
            int r3 = androidx.preference.C1145q.f3750b
            r5.f3573I = r3
            androidx.preference.Preference$a r4 = new androidx.preference.Preference$a
            r4.<init>()
            r5.f3582R = r4
            r5.f3583d = r6
            int[] r4 = androidx.preference.C1148t.f3777J
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r4, r8, r9)
            int r7 = androidx.preference.C1148t.f3833h0
            int r8 = androidx.preference.C1148t.f3779K
            int r7 = androidx.core.content.res.C0540j.m2230e(r6, r7, r8, r1)
            r5.f3593n = r7
            int r7 = androidx.preference.C1148t.f3842k0
            int r8 = androidx.preference.C1148t.f3791Q
            java.lang.String r7 = androidx.core.content.res.C0540j.m2231f(r6, r7, r8)
            r5.f3595p = r7
            int r7 = androidx.preference.C1148t.f3858s0
            int r8 = androidx.preference.C1148t.f3787O
            java.lang.CharSequence r7 = androidx.core.content.res.C0540j.m2232g(r6, r7, r8)
            r5.f3591l = r7
            int r7 = androidx.preference.C1148t.f3856r0
            int r8 = androidx.preference.C1148t.f3793R
            java.lang.CharSequence r7 = androidx.core.content.res.C0540j.m2232g(r6, r7, r8)
            r5.f3592m = r7
            int r7 = androidx.preference.C1148t.f3846m0
            int r8 = androidx.preference.C1148t.f3795S
            int r7 = androidx.core.content.res.C0540j.m2229d(r6, r7, r8, r0)
            r5.f3589j = r7
            int r7 = androidx.preference.C1148t.f3830g0
            int r8 = androidx.preference.C1148t.f3805X
            java.lang.String r7 = androidx.core.content.res.C0540j.m2231f(r6, r7, r8)
            r5.f3597r = r7
            int r7 = androidx.preference.C1148t.f3844l0
            int r8 = androidx.preference.C1148t.f3785N
            int r7 = androidx.core.content.res.C0540j.m2230e(r6, r7, r8, r3)
            r5.f3573I = r7
            int r7 = androidx.preference.C1148t.f3860t0
            int r8 = androidx.preference.C1148t.f3797T
            int r7 = androidx.core.content.res.C0540j.m2230e(r6, r7, r8, r1)
            r5.f3574J = r7
            int r7 = androidx.preference.C1148t.f3827f0
            int r8 = androidx.preference.C1148t.f3783M
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r2)
            r5.f3599t = r7
            int r7 = androidx.preference.C1148t.f3850o0
            int r8 = androidx.preference.C1148t.f3789P
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r2)
            r5.f3600u = r7
            int r7 = androidx.preference.C1148t.f3848n0
            int r8 = androidx.preference.C1148t.f3781L
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r2)
            r5.f3601v = r7
            int r7 = androidx.preference.C1148t.f3821d0
            int r8 = androidx.preference.C1148t.f3799U
            java.lang.String r7 = androidx.core.content.res.C0540j.m2231f(r6, r7, r8)
            r5.f3602w = r7
            int r7 = androidx.preference.C1148t.f3812a0
            boolean r8 = r5.f3600u
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r7, r8)
            r5.f3566B = r7
            int r7 = androidx.preference.C1148t.f3815b0
            boolean r8 = r5.f3600u
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r7, r8)
            r5.f3567C = r7
            int r7 = androidx.preference.C1148t.f3818c0
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x00ce
        L_0x00c7:
            java.lang.Object r7 = r5.mo3880W(r6, r7)
            r5.f3603x = r7
            goto L_0x00d7
        L_0x00ce:
            int r7 = androidx.preference.C1148t.f3801V
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x00d7
            goto L_0x00c7
        L_0x00d7:
            int r7 = androidx.preference.C1148t.f3852p0
            int r8 = androidx.preference.C1148t.f3803W
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r2)
            r5.f3572H = r7
            int r7 = androidx.preference.C1148t.f3854q0
            boolean r8 = r6.hasValue(r7)
            r5.f3568D = r8
            if (r8 == 0) goto L_0x00f3
            int r8 = androidx.preference.C1148t.f3807Y
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r2)
            r5.f3569E = r7
        L_0x00f3:
            int r7 = androidx.preference.C1148t.f3836i0
            int r8 = androidx.preference.C1148t.f3809Z
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r8, r1)
            r5.f3570F = r7
            int r7 = androidx.preference.C1148t.f3839j0
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r7, r2)
            r5.f3565A = r7
            int r7 = androidx.preference.C1148t.f3824e0
            boolean r7 = androidx.core.content.res.C0540j.m2227b(r6, r7, r7, r1)
            r5.f3571G = r7
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: D0 */
    private void m4382D0(SharedPreferences.Editor editor) {
        if (this.f3584e.mo4127r()) {
            editor.apply();
        }
    }

    /* renamed from: E0 */
    private void m4383E0() {
        Preference h;
        String str = this.f3602w;
        if (str != null && (h = mo3947h(str)) != null) {
            h.m4384F0(this);
        }
    }

    /* renamed from: F0 */
    private void m4384F0(Preference preference) {
        List<Preference> list = this.f3576L;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* renamed from: g */
    private void m4385g() {
        mo3981z();
        if (!mo3917C0() || !mo3916B().contains(this.f3595p)) {
            Object obj = this.f3603x;
            if (obj != null) {
                mo3942d0(false, obj);
                return;
            }
            return;
        }
        mo3942d0(true, (Object) null);
    }

    /* renamed from: k0 */
    private void m4386k0() {
        if (!TextUtils.isEmpty(this.f3602w)) {
            Preference h = mo3947h(this.f3602w);
            if (h != null) {
                h.m4387l0(this);
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f3602w + "\" not found for preference \"" + this.f3595p + "\" (title: \"" + this.f3591l + "\"");
        }
    }

    /* renamed from: l0 */
    private void m4387l0(Preference preference) {
        if (this.f3576L == null) {
            this.f3576L = new ArrayList();
        }
        this.f3576L.add(preference);
        preference.mo3932U(this, mo3876B0());
    }

    /* renamed from: o0 */
    private void m4388o0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m4388o0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: A */
    public C1134k mo3914A() {
        return this.f3584e;
    }

    /* renamed from: A0 */
    public final void mo3915A0(boolean z) {
        if (this.f3565A != z) {
            this.f3565A = z;
            C1094c cVar = this.f3575K;
            if (cVar != null) {
                cVar.mo3990c(this);
            }
        }
    }

    /* renamed from: B */
    public SharedPreferences mo3916B() {
        if (this.f3584e == null) {
            return null;
        }
        mo3981z();
        return this.f3584e.mo4120j();
    }

    /* renamed from: B0 */
    public boolean mo3876B0() {
        return !mo3923I();
    }

    /* renamed from: C */
    public CharSequence mo3892C() {
        return mo3918D() != null ? mo3918D().mo3890a(this) : this.f3592m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public boolean mo3917C0() {
        return this.f3584e != null && mo3924J() && mo3921G();
    }

    /* renamed from: D */
    public final C1098g mo3918D() {
        return this.f3581Q;
    }

    /* renamed from: E */
    public CharSequence mo3919E() {
        return this.f3591l;
    }

    /* renamed from: F */
    public final int mo3920F() {
        return this.f3574J;
    }

    /* renamed from: G */
    public boolean mo3921G() {
        return !TextUtils.isEmpty(this.f3595p);
    }

    /* renamed from: H */
    public boolean mo3922H() {
        return this.f3571G;
    }

    /* renamed from: I */
    public boolean mo3923I() {
        return this.f3599t && this.f3604y && this.f3605z;
    }

    /* renamed from: J */
    public boolean mo3924J() {
        return this.f3601v;
    }

    /* renamed from: K */
    public boolean mo3925K() {
        return this.f3600u;
    }

    /* renamed from: L */
    public final boolean mo3926L() {
        return this.f3565A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo3872M() {
        C1094c cVar = this.f3575K;
        if (cVar != null) {
            cVar.mo3989b(this);
        }
    }

    /* renamed from: N */
    public void mo3927N(boolean z) {
        List<Preference> list = this.f3576L;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo3932U(this, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo3928O() {
        C1094c cVar = this.f3575K;
        if (cVar != null) {
            cVar.mo3988a(this);
        }
    }

    /* renamed from: P */
    public void mo3929P() {
        m4386k0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3930Q(C1134k kVar) {
        this.f3584e = kVar;
        if (!this.f3586g) {
            this.f3585f = kVar.mo4114d();
        }
        m4385g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo3931R(C1134k kVar, long j) {
        this.f3585f = j;
        this.f3586g = true;
        try {
            mo3930Q(kVar);
        } finally {
            this.f3586g = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3861S(androidx.preference.C1141m r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.f4049a
            android.view.View$OnClickListener r1 = r8.f3582R
            r0.setOnClickListener(r1)
            int r1 = r8.f3590k
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.mo4130M(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.mo3892C()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0034
            r1.setText(r5)
            r1.setVisibility(r3)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0034:
            r1.setVisibility(r4)
        L_0x0037:
            r1 = r2
        L_0x0038:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo4130M(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0075
            java.lang.CharSequence r6 = r8.mo3919E()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0072
            r5.setText(r6)
            r5.setVisibility(r3)
            boolean r6 = r8.f3568D
            if (r6 == 0) goto L_0x005c
            boolean r6 = r8.f3569E
            r5.setSingleLine(r6)
        L_0x005c:
            boolean r6 = r8.mo3925K()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.mo3923I()
            if (r6 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L_0x0075
        L_0x0072:
            r5.setVisibility(r4)
        L_0x0075:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.mo4130M(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto L_0x00ae
            int r6 = r8.f3593n
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r7 = r8.f3594o
            if (r7 == 0) goto L_0x009c
        L_0x0089:
            android.graphics.drawable.Drawable r7 = r8.f3594o
            if (r7 != 0) goto L_0x0095
            android.content.Context r7 = r8.f3583d
            android.graphics.drawable.Drawable r6 = p027e.C1512a.m6567b(r7, r6)
            r8.f3594o = r6
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r8.f3594o
            if (r6 == 0) goto L_0x009c
            r1.setImageDrawable(r6)
        L_0x009c:
            android.graphics.drawable.Drawable r6 = r8.f3594o
            if (r6 == 0) goto L_0x00a4
            r1.setVisibility(r3)
            goto L_0x00ae
        L_0x00a4:
            boolean r6 = r8.f3570F
            if (r6 == 0) goto L_0x00aa
            r6 = r5
            goto L_0x00ab
        L_0x00aa:
            r6 = r4
        L_0x00ab:
            r1.setVisibility(r6)
        L_0x00ae:
            int r1 = androidx.preference.C1144p.f3743a
            android.view.View r1 = r9.mo4130M(r1)
            if (r1 != 0) goto L_0x00bd
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.mo4130M(r1)
        L_0x00bd:
            if (r1 == 0) goto L_0x00cf
            android.graphics.drawable.Drawable r6 = r8.f3594o
            if (r6 == 0) goto L_0x00c7
            r1.setVisibility(r3)
            goto L_0x00cf
        L_0x00c7:
            boolean r3 = r8.f3570F
            if (r3 == 0) goto L_0x00cc
            r4 = r5
        L_0x00cc:
            r1.setVisibility(r4)
        L_0x00cf:
            boolean r1 = r8.f3572H
            if (r1 == 0) goto L_0x00d8
            boolean r1 = r8.mo3923I()
            goto L_0x00d9
        L_0x00d8:
            r1 = 1
        L_0x00d9:
            r8.m4388o0(r0, r1)
            boolean r1 = r8.mo3925K()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r3 = r8.f3566B
            r9.mo4134Q(r3)
            boolean r3 = r8.f3567C
            r9.mo4135R(r3)
            boolean r9 = r8.mo3922H()
            if (r9 == 0) goto L_0x0101
            androidx.preference.Preference$f r3 = r8.f3580P
            if (r3 != 0) goto L_0x0101
            androidx.preference.Preference$f r3 = new androidx.preference.Preference$f
            r3.<init>(r8)
            r8.f3580P = r3
        L_0x0101:
            if (r9 == 0) goto L_0x0106
            androidx.preference.Preference$f r3 = r8.f3580P
            goto L_0x0107
        L_0x0106:
            r3 = r2
        L_0x0107:
            r0.setOnCreateContextMenuListener(r3)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0114
            if (r1 != 0) goto L_0x0114
            androidx.core.view.C0727l0.m2880b0(r0, r2)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo3861S(androidx.preference.m):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
    }

    /* renamed from: U */
    public void mo3932U(Preference preference, boolean z) {
        if (this.f3604y == z) {
            this.f3604y = !z;
            mo3927N(mo3876B0());
            mo3872M();
        }
    }

    /* renamed from: V */
    public void mo3933V() {
        m4383E0();
        this.f3578N = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    /* renamed from: X */
    public void mo3934X(C0637g gVar) {
    }

    /* renamed from: Y */
    public void mo3935Y(Preference preference, boolean z) {
        if (this.f3605z == z) {
            this.f3605z = !z;
            mo3927N(mo3876B0());
            mo3872M();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo3936Z() {
        m4383E0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3937a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f3577M == null) {
            this.f3577M = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        this.f3579O = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: b */
    public boolean mo3938b(Object obj) {
        C1095d dVar = this.f3587h;
        return dVar == null || dVar.mo3991a(this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        this.f3579O = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3939c() {
        this.f3578N = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
    }

    /* renamed from: d */
    public int compareTo(Preference preference) {
        int i = this.f3589j;
        int i2 = preference.f3589j;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f3591l;
        CharSequence charSequence2 = preference.f3591l;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3591l.toString());
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: d0 */
    public void mo3942d0(boolean z, Object obj) {
        mo3883c0(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3943e(Bundle bundle) {
        Parcelable parcelable;
        if (mo3921G() && (parcelable = bundle.getParcelable(this.f3595p)) != null) {
            this.f3579O = false;
            mo3881a0(parcelable);
            if (!this.f3579O) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: e0 */
    public void mo3944e0() {
        C1134k.C1137c f;
        if (mo3923I() && mo3925K()) {
            mo3870T();
            C1096e eVar = this.f3588i;
            if (eVar == null || !eVar.mo3992d(this)) {
                C1134k A = mo3914A();
                if ((A == null || (f = A.mo4116f()) == null || !f.mo4078n(this)) && this.f3596q != null) {
                    mo3949i().startActivity(this.f3596q);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3945f(Bundle bundle) {
        if (mo3921G()) {
            this.f3579O = false;
            Parcelable b0 = mo3882b0();
            if (!this.f3579O) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (b0 != null) {
                bundle.putParcelable(this.f3595p, b0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3862f0(View view) {
        mo3944e0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public boolean mo3946g0(boolean z) {
        if (!mo3917C0()) {
            return false;
        }
        if (z == mo3973v(!z)) {
            return true;
        }
        mo3981z();
        SharedPreferences.Editor c = this.f3584e.mo4113c();
        c.putBoolean(this.f3595p, z);
        m4382D0(c);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends Preference> T mo3947h(String str) {
        C1134k kVar = this.f3584e;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4112a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public boolean mo3948h0(int i) {
        if (!mo3917C0()) {
            return false;
        }
        if (i == mo3975w(~i)) {
            return true;
        }
        mo3981z();
        SharedPreferences.Editor c = this.f3584e.mo4113c();
        c.putInt(this.f3595p, i);
        m4382D0(c);
        return true;
    }

    /* renamed from: i */
    public Context mo3949i() {
        return this.f3583d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public boolean mo3950i0(String str) {
        if (!mo3917C0()) {
            return false;
        }
        if (TextUtils.equals(str, mo3977x((String) null))) {
            return true;
        }
        mo3981z();
        SharedPreferences.Editor c = this.f3584e.mo4113c();
        c.putString(this.f3595p, str);
        m4382D0(c);
        return true;
    }

    /* renamed from: j */
    public String mo3951j() {
        return this.f3602w;
    }

    /* renamed from: j0 */
    public boolean mo3952j0(Set<String> set) {
        if (!mo3917C0()) {
            return false;
        }
        if (set.equals(mo3979y((Set<String>) null))) {
            return true;
        }
        mo3981z();
        SharedPreferences.Editor c = this.f3584e.mo4113c();
        c.putStringSet(this.f3595p, set);
        m4382D0(c);
        return true;
    }

    /* renamed from: k */
    public Bundle mo3953k() {
        if (this.f3598s == null) {
            this.f3598s = new Bundle();
        }
        return this.f3598s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public StringBuilder mo3954l() {
        StringBuilder sb = new StringBuilder();
        CharSequence E = mo3919E();
        if (!TextUtils.isEmpty(E)) {
            sb.append(E);
            sb.append(' ');
        }
        CharSequence C = mo3892C();
        if (!TextUtils.isEmpty(C)) {
            sb.append(C);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: m */
    public String mo3955m() {
        return this.f3597r;
    }

    /* renamed from: m0 */
    public void mo3956m0(Bundle bundle) {
        mo3943e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public long mo3957n() {
        return this.f3585f;
    }

    /* renamed from: n0 */
    public void mo3958n0(Bundle bundle) {
        mo3945f(bundle);
    }

    /* renamed from: o */
    public Intent mo3959o() {
        return this.f3596q;
    }

    /* renamed from: p */
    public String mo3960p() {
        return this.f3595p;
    }

    /* renamed from: p0 */
    public void mo3961p0(int i) {
        mo3963q0(C1512a.m6567b(this.f3583d, i));
        this.f3593n = i;
    }

    /* renamed from: q */
    public final int mo3962q() {
        return this.f3573I;
    }

    /* renamed from: q0 */
    public void mo3963q0(Drawable drawable) {
        if (this.f3594o != drawable) {
            this.f3594o = drawable;
            this.f3593n = 0;
            mo3872M();
        }
    }

    /* renamed from: r */
    public C1095d mo3964r() {
        return this.f3587h;
    }

    /* renamed from: r0 */
    public void mo3965r0(Intent intent) {
        this.f3596q = intent;
    }

    /* renamed from: s */
    public C1096e mo3966s() {
        return this.f3588i;
    }

    /* renamed from: s0 */
    public void mo3967s0(int i) {
        this.f3573I = i;
    }

    /* renamed from: t */
    public int mo3968t() {
        return this.f3589j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final void mo3969t0(C1094c cVar) {
        this.f3575K = cVar;
    }

    public String toString() {
        return mo3954l().toString();
    }

    /* renamed from: u */
    public PreferenceGroup mo3971u() {
        return this.f3577M;
    }

    /* renamed from: u0 */
    public void mo3972u0(C1096e eVar) {
        this.f3588i = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo3973v(boolean z) {
        if (!mo3917C0()) {
            return z;
        }
        mo3981z();
        return this.f3584e.mo4120j().getBoolean(this.f3595p, z);
    }

    /* renamed from: v0 */
    public void mo3974v0(int i) {
        if (i != this.f3589j) {
            this.f3589j = i;
            mo3928O();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo3975w(int i) {
        if (!mo3917C0()) {
            return i;
        }
        mo3981z();
        return this.f3584e.mo4120j().getInt(this.f3595p, i);
    }

    /* renamed from: w0 */
    public void mo3976w0(CharSequence charSequence) {
        if (mo3918D() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f3592m, charSequence)) {
            this.f3592m = charSequence;
            mo3872M();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo3977x(String str) {
        if (!mo3917C0()) {
            return str;
        }
        mo3981z();
        return this.f3584e.mo4120j().getString(this.f3595p, str);
    }

    /* renamed from: x0 */
    public final void mo3978x0(C1098g gVar) {
        this.f3581Q = gVar;
        mo3872M();
    }

    /* renamed from: y */
    public Set<String> mo3979y(Set<String> set) {
        if (!mo3917C0()) {
            return set;
        }
        mo3981z();
        return this.f3584e.mo4120j().getStringSet(this.f3595p, set);
    }

    /* renamed from: y0 */
    public void mo3980y0(int i) {
        mo3982z0(this.f3583d.getString(i));
    }

    /* renamed from: z */
    public C1118e mo3981z() {
        C1134k kVar = this.f3584e;
        if (kVar != null) {
            kVar.mo4118h();
        }
        return null;
    }

    /* renamed from: z0 */
    public void mo3982z0(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f3591l)) {
            this.f3591l = charSequence;
            mo3872M();
        }
    }
}
