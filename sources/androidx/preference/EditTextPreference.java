package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.core.content.res.C0540j;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {

    /* renamed from: Y */
    private String f3550Y;

    /* renamed from: Z */
    private C1082a f3551Z;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface C1082a {
        /* renamed from: a */
        void mo3884a(EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    private static class C1083b extends Preference.C1092b {
        public static final Parcelable.Creator<C1083b> CREATOR = new C1084a();

        /* renamed from: d */
        String f3552d;

        /* renamed from: androidx.preference.EditTextPreference$b$a */
        class C1084a implements Parcelable.Creator<C1083b> {
            C1084a() {
            }

            /* renamed from: a */
            public C1083b createFromParcel(Parcel parcel) {
                return new C1083b(parcel);
            }

            /* renamed from: b */
            public C1083b[] newArray(int i) {
                return new C1083b[i];
            }
        }

        C1083b(Parcel parcel) {
            super(parcel);
            this.f3552d = parcel.readString();
        }

        C1083b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3552d);
        }
    }

    /* renamed from: androidx.preference.EditTextPreference$c */
    public static final class C1085c implements Preference.C1098g<EditTextPreference> {

        /* renamed from: a */
        private static C1085c f3553a;

        private C1085c() {
        }

        /* renamed from: b */
        public static C1085c m4352b() {
            if (f3553a == null) {
                f3553a = new C1085c();
            }
            return f3553a;
        }

        /* renamed from: c */
        public CharSequence mo3890a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.mo3878N0()) ? editTextPreference.mo3949i().getString(C1146r.f3755c) : editTextPreference.mo3878N0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3733d, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3865w, i, i2);
        int i3 = C1148t.f3867x;
        if (C0540j.m2227b(obtainStyledAttributes, i3, i3, false)) {
            mo3978x0(C1085c.m4352b());
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B0 */
    public boolean mo3876B0() {
        return TextUtils.isEmpty(this.f3550Y) || super.mo3876B0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public C1082a mo3877M0() {
        return this.f3551Z;
    }

    /* renamed from: N0 */
    public String mo3878N0() {
        return this.f3550Y;
    }

    /* renamed from: O0 */
    public void mo3879O0(String str) {
        boolean B0 = mo3876B0();
        this.f3550Y = str;
        mo3950i0(str);
        boolean B02 = mo3876B0();
        if (B02 != B0) {
            mo3927N(B02);
        }
        mo3872M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1083b.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1083b bVar = (C1083b) parcelable;
        super.mo3881a0(bVar.getSuperState());
        mo3879O0(bVar.f3552d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C1083b bVar = new C1083b(b0);
        bVar.f3552d = mo3878N0();
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        mo3879O0(mo3977x((String) obj));
    }
}
