package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.C0540j;
import androidx.preference.Preference;

public class ListPreference extends DialogPreference {

    /* renamed from: Y */
    private CharSequence[] f3554Y;

    /* renamed from: Z */
    private CharSequence[] f3555Z;

    /* renamed from: a0 */
    private String f3556a0;

    /* renamed from: b0 */
    private String f3557b0;

    /* renamed from: c0 */
    private boolean f3558c0;

    /* renamed from: androidx.preference.ListPreference$a */
    private static class C1086a extends Preference.C1092b {
        public static final Parcelable.Creator<C1086a> CREATOR = new C1087a();

        /* renamed from: d */
        String f3559d;

        /* renamed from: androidx.preference.ListPreference$a$a */
        class C1087a implements Parcelable.Creator<C1086a> {
            C1087a() {
            }

            /* renamed from: a */
            public C1086a createFromParcel(Parcel parcel) {
                return new C1086a(parcel);
            }

            /* renamed from: b */
            public C1086a[] newArray(int i) {
                return new C1086a[i];
            }
        }

        C1086a(Parcel parcel) {
            super(parcel);
            this.f3559d = parcel.readString();
        }

        C1086a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3559d);
        }
    }

    /* renamed from: androidx.preference.ListPreference$b */
    public static final class C1088b implements Preference.C1098g<ListPreference> {

        /* renamed from: a */
        private static C1088b f3560a;

        private C1088b() {
        }

        /* renamed from: b */
        public static C1088b m4369b() {
            if (f3560a == null) {
                f3560a = new C1088b();
            }
            return f3560a;
        }

        /* renamed from: c */
        public CharSequence mo3890a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.mo3895O0()) ? listPreference.mo3949i().getString(C1146r.f3755c) : listPreference.mo3895O0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3731b, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3869y, i, i2);
        this.f3554Y = C0540j.m2233h(obtainStyledAttributes, C1148t.f3761B, C1148t.f3871z);
        this.f3555Z = C0540j.m2233h(obtainStyledAttributes, C1148t.f3763C, C1148t.f3759A);
        int i3 = C1148t.f3765D;
        if (C0540j.m2227b(obtainStyledAttributes, i3, i3, false)) {
            mo3978x0(C1088b.m4369b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1148t.f3777J, i, i2);
        this.f3557b0 = C0540j.m2231f(obtainStyledAttributes2, C1148t.f3856r0, C1148t.f3793R);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: R0 */
    private int m4355R0() {
        return mo3893M0(this.f3556a0);
    }

    /* renamed from: C */
    public CharSequence mo3892C() {
        if (mo3918D() != null) {
            return mo3918D().mo3890a(this);
        }
        Object O0 = mo3895O0();
        CharSequence C = super.mo3892C();
        String str = this.f3557b0;
        if (str == null) {
            return C;
        }
        Object[] objArr = new Object[1];
        if (O0 == null) {
            O0 = "";
        }
        objArr[0] = O0;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, C)) {
            return C;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* renamed from: M0 */
    public int mo3893M0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3555Z) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f3555Z[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: N0 */
    public CharSequence[] mo3894N0() {
        return this.f3554Y;
    }

    /* renamed from: O0 */
    public CharSequence mo3895O0() {
        CharSequence[] charSequenceArr;
        int R0 = m4355R0();
        if (R0 < 0 || (charSequenceArr = this.f3554Y) == null) {
            return null;
        }
        return charSequenceArr[R0];
    }

    /* renamed from: P0 */
    public CharSequence[] mo3896P0() {
        return this.f3555Z;
    }

    /* renamed from: Q0 */
    public String mo3897Q0() {
        return this.f3556a0;
    }

    /* renamed from: S0 */
    public void mo3898S0(String str) {
        boolean z = !TextUtils.equals(this.f3556a0, str);
        if (z || !this.f3558c0) {
            this.f3556a0 = str;
            this.f3558c0 = true;
            mo3950i0(str);
            if (z) {
                mo3872M();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1086a.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1086a aVar = (C1086a) parcelable;
        super.mo3881a0(aVar.getSuperState());
        mo3898S0(aVar.f3559d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C1086a aVar = new C1086a(b0);
        aVar.f3559d = mo3897Q0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        mo3898S0(mo3977x((String) obj));
    }
}
