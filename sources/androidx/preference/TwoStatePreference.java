package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: S */
    protected boolean f3645S;

    /* renamed from: T */
    private CharSequence f3646T;

    /* renamed from: U */
    private CharSequence f3647U;

    /* renamed from: V */
    private boolean f3648V;

    /* renamed from: W */
    private boolean f3649W;

    /* renamed from: androidx.preference.TwoStatePreference$a */
    static class C1109a extends Preference.C1092b {
        public static final Parcelable.Creator<C1109a> CREATOR = new C1110a();

        /* renamed from: d */
        boolean f3650d;

        /* renamed from: androidx.preference.TwoStatePreference$a$a */
        class C1110a implements Parcelable.Creator<C1109a> {
            C1110a() {
            }

            /* renamed from: a */
            public C1109a createFromParcel(Parcel parcel) {
                return new C1109a(parcel);
            }

            /* renamed from: b */
            public C1109a[] newArray(int i) {
                return new C1109a[i];
            }
        }

        C1109a(Parcel parcel) {
            super(parcel);
            this.f3650d = parcel.readInt() != 1 ? false : true;
        }

        C1109a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3650d ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: B0 */
    public boolean mo3876B0() {
        return (this.f3649W ? this.f3645S : !this.f3645S) || super.mo3876B0();
    }

    /* renamed from: G0 */
    public void mo4036G0(boolean z) {
        this.f3649W = z;
    }

    /* renamed from: H0 */
    public void mo4037H0(CharSequence charSequence) {
        this.f3647U = charSequence;
        if (!isChecked()) {
            mo3872M();
        }
    }

    /* renamed from: I0 */
    public void mo4038I0(CharSequence charSequence) {
        this.f3646T = charSequence;
        if (isChecked()) {
            mo3872M();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4039J0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3645S
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f3646T
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f3646T
        L_0x0017:
            r5.setText(r0)
            r0 = r2
            goto L_0x002b
        L_0x001c:
            boolean r1 = r4.f3645S
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r1 = r4.f3647U
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r0 = r4.f3647U
            goto L_0x0017
        L_0x002b:
            if (r0 == 0) goto L_0x003b
            java.lang.CharSequence r1 = r4.mo3892C()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r5.setText(r1)
            r0 = r2
        L_0x003b:
            r1 = 8
            if (r0 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004a
            r5.setVisibility(r2)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo4039J0(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo4040K0(C1141m mVar) {
        mo4039J0(mVar.mo4130M(16908304));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        super.mo3870T();
        boolean z = !isChecked();
        if (mo3938b(Boolean.valueOf(z))) {
            setChecked(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1109a.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1109a aVar = (C1109a) parcelable;
        super.mo3881a0(aVar.getSuperState());
        setChecked(aVar.f3650d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C1109a aVar = new C1109a(b0);
        aVar.f3650d = isChecked();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        setChecked(mo3973v(((Boolean) obj).booleanValue()));
    }

    public boolean isChecked() {
        return this.f3645S;
    }

    public void setChecked(boolean z) {
        boolean z2 = this.f3645S != z;
        if (z2 || !this.f3648V) {
            this.f3645S = z;
            this.f3648V = true;
            mo3946g0(z);
            if (z2) {
                mo3927N(mo3876B0());
                mo3872M();
            }
        }
    }
}
