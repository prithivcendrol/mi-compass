package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.res.C0540j;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: Y */
    private CharSequence[] f3561Y;

    /* renamed from: Z */
    private CharSequence[] f3562Z;

    /* renamed from: a0 */
    private Set<String> f3563a0;

    /* renamed from: androidx.preference.MultiSelectListPreference$a */
    private static class C1089a extends Preference.C1092b {
        public static final Parcelable.Creator<C1089a> CREATOR = new C1090a();

        /* renamed from: d */
        Set<String> f3564d;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a */
        class C1090a implements Parcelable.Creator<C1089a> {
            C1090a() {
            }

            /* renamed from: a */
            public C1089a createFromParcel(Parcel parcel) {
                return new C1089a(parcel);
            }

            /* renamed from: b */
            public C1089a[] newArray(int i) {
                return new C1089a[i];
            }
        }

        C1089a(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f3564d = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f3564d, strArr);
        }

        C1089a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3564d.size());
            Set<String> set = this.f3564d;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3731b, 16842897));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3563a0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3767E, i, i2);
        this.f3561Y = C0540j.m2233h(obtainStyledAttributes, C1148t.f3773H, C1148t.f3769F);
        this.f3562Z = C0540j.m2233h(obtainStyledAttributes, C1148t.f3775I, C1148t.f3771G);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: M0 */
    public CharSequence[] mo3905M0() {
        return this.f3561Y;
    }

    /* renamed from: N0 */
    public CharSequence[] mo3906N0() {
        return this.f3562Z;
    }

    /* renamed from: O0 */
    public Set<String> mo3907O0() {
        return this.f3563a0;
    }

    /* renamed from: P0 */
    public void mo3908P0(Set<String> set) {
        this.f3563a0.clear();
        this.f3563a0.addAll(set);
        mo3952j0(set);
        mo3872M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1089a.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1089a aVar = (C1089a) parcelable;
        super.mo3881a0(aVar.getSuperState());
        mo3908P0(aVar.f3564d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C1089a aVar = new C1089a(b0);
        aVar.f3564d = mo3907O0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        mo3908P0(mo3979y((Set) obj));
    }
}
