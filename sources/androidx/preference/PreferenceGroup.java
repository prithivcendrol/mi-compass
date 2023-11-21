package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.C0540j;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p063k.C1774g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: S */
    final C1774g<String, Long> f3608S;

    /* renamed from: T */
    private final Handler f3609T;

    /* renamed from: U */
    private final List<Preference> f3610U;

    /* renamed from: V */
    private boolean f3611V;

    /* renamed from: W */
    private int f3612W;

    /* renamed from: X */
    private boolean f3613X;

    /* renamed from: Y */
    private int f3614Y;

    /* renamed from: Z */
    private C1100b f3615Z;

    /* renamed from: a0 */
    private final Runnable f3616a0;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class C1099a implements Runnable {
        C1099a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f3608S.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C1100b {
        /* renamed from: a */
        void mo4009a();
    }

    /* renamed from: androidx.preference.PreferenceGroup$c */
    static class C1101c extends Preference.C1092b {
        public static final Parcelable.Creator<C1101c> CREATOR = new C1102a();

        /* renamed from: d */
        int f3618d;

        /* renamed from: androidx.preference.PreferenceGroup$c$a */
        class C1102a implements Parcelable.Creator<C1101c> {
            C1102a() {
            }

            /* renamed from: a */
            public C1101c createFromParcel(Parcel parcel) {
                return new C1101c(parcel);
            }

            /* renamed from: b */
            public C1101c[] newArray(int i) {
                return new C1101c[i];
            }
        }

        C1101c(Parcel parcel) {
            super(parcel);
            this.f3618d = parcel.readInt();
        }

        C1101c(Parcelable parcelable, int i) {
            super(parcelable);
            this.f3618d = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3618d);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3608S = new C1774g<>();
        this.f3609T = new Handler(Looper.getMainLooper());
        this.f3611V = true;
        this.f3612W = 0;
        this.f3613X = false;
        this.f3614Y = Integer.MAX_VALUE;
        this.f3615Z = null;
        this.f3616a0 = new C1099a();
        this.f3610U = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3760A0, i, i2);
        int i3 = C1148t.f3764C0;
        this.f3611V = C0540j.m2227b(obtainStyledAttributes, i3, i3, true);
        int i4 = C1148t.f3762B0;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo4005R0(C0540j.m2229d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Q0 */
    private boolean m4477Q0(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.mo3936Z();
            if (preference.mo3971u() == this) {
                preference.mo3937a((PreferenceGroup) null);
            }
            remove = this.f3610U.remove(preference);
            if (remove) {
                String p = preference.mo3960p();
                if (p != null) {
                    this.f3608S.put(p, Long.valueOf(preference.mo3957n()));
                    this.f3609T.removeCallbacks(this.f3616a0);
                    this.f3609T.post(this.f3616a0);
                }
                if (this.f3613X) {
                    preference.mo3933V();
                }
            }
        }
        return remove;
    }

    /* renamed from: G0 */
    public void mo3995G0(Preference preference) {
        mo3996H0(preference);
    }

    /* renamed from: H0 */
    public boolean mo3996H0(Preference preference) {
        long j;
        if (this.f3610U.contains(preference)) {
            return true;
        }
        if (preference.mo3960p() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.mo3971u() != null) {
                preferenceGroup = preferenceGroup.mo3971u();
            }
            String p = preference.mo3960p();
            if (preferenceGroup.mo3997I0(p) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + p + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.mo3968t() == Integer.MAX_VALUE) {
            if (this.f3611V) {
                int i = this.f3612W;
                this.f3612W = i + 1;
                preference.mo3974v0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).mo4006S0(this.f3611V);
            }
        }
        int binarySearch = Collections.binarySearch(this.f3610U, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!mo4003O0(preference)) {
            return false;
        }
        synchronized (this) {
            this.f3610U.add(binarySearch, preference);
        }
        C1134k A = mo3914A();
        String p2 = preference.mo3960p();
        if (p2 == null || !this.f3608S.containsKey(p2)) {
            j = A.mo4114d();
        } else {
            j = this.f3608S.get(p2).longValue();
            this.f3608S.remove(p2);
        }
        preference.mo3931R(A, j);
        preference.mo3937a(this);
        if (this.f3613X) {
            preference.mo3929P();
        }
        mo3928O();
        return true;
    }

    /* renamed from: I0 */
    public <T extends Preference> T mo3997I0(CharSequence charSequence) {
        T I0;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(mo3960p(), charSequence)) {
            return this;
        } else {
            int M0 = mo4001M0();
            for (int i = 0; i < M0; i++) {
                T L0 = mo4000L0(i);
                if (TextUtils.equals(L0.mo3960p(), charSequence)) {
                    return L0;
                }
                if ((L0 instanceof PreferenceGroup) && (I0 = ((PreferenceGroup) L0).mo3997I0(charSequence)) != null) {
                    return I0;
                }
            }
            return null;
        }
    }

    /* renamed from: J0 */
    public int mo3998J0() {
        return this.f3614Y;
    }

    /* renamed from: K0 */
    public C1100b mo3999K0() {
        return this.f3615Z;
    }

    /* renamed from: L0 */
    public Preference mo4000L0(int i) {
        return this.f3610U.get(i);
    }

    /* renamed from: M0 */
    public int mo4001M0() {
        return this.f3610U.size();
    }

    /* renamed from: N */
    public void mo3927N(boolean z) {
        super.mo3927N(z);
        int M0 = mo4001M0();
        for (int i = 0; i < M0; i++) {
            mo4000L0(i).mo3935Y(this, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public boolean mo4002N0() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public boolean mo4003O0(Preference preference) {
        preference.mo3935Y(this, mo3876B0());
        return true;
    }

    /* renamed from: P */
    public void mo3929P() {
        super.mo3929P();
        this.f3613X = true;
        int M0 = mo4001M0();
        for (int i = 0; i < M0; i++) {
            mo4000L0(i).mo3929P();
        }
    }

    /* renamed from: P0 */
    public boolean mo4004P0(Preference preference) {
        boolean Q0 = m4477Q0(preference);
        mo3928O();
        return Q0;
    }

    /* renamed from: R0 */
    public void mo4005R0(int i) {
        if (i != Integer.MAX_VALUE && !mo3921G()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f3614Y = i;
    }

    /* renamed from: S0 */
    public void mo4006S0(boolean z) {
        this.f3611V = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo4007T0() {
        synchronized (this) {
            Collections.sort(this.f3610U);
        }
    }

    /* renamed from: V */
    public void mo3933V() {
        super.mo3933V();
        this.f3613X = false;
        int M0 = mo4001M0();
        for (int i = 0; i < M0; i++) {
            mo4000L0(i).mo3933V();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1101c.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1101c cVar = (C1101c) parcelable;
        this.f3614Y = cVar.f3618d;
        super.mo3881a0(cVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        return new C1101c(super.mo3882b0(), this.f3614Y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3943e(Bundle bundle) {
        super.mo3943e(bundle);
        int M0 = mo4001M0();
        for (int i = 0; i < M0; i++) {
            mo4000L0(i).mo3943e(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3945f(Bundle bundle) {
        super.mo3945f(bundle);
        int M0 = mo4001M0();
        for (int i = 0; i < M0; i++) {
            mo4000L0(i).mo3945f(bundle);
        }
    }
}
