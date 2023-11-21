package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: S */
    int f3620S;

    /* renamed from: T */
    int f3621T;

    /* renamed from: U */
    private int f3622U;

    /* renamed from: V */
    private int f3623V;

    /* renamed from: W */
    boolean f3624W;

    /* renamed from: X */
    SeekBar f3625X;

    /* renamed from: Y */
    private TextView f3626Y;

    /* renamed from: Z */
    boolean f3627Z;

    /* renamed from: a0 */
    private boolean f3628a0;

    /* renamed from: b0 */
    boolean f3629b0;

    /* renamed from: c0 */
    private final SeekBar.OnSeekBarChangeListener f3630c0;

    /* renamed from: d0 */
    private final View.OnKeyListener f3631d0;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C1103a implements SeekBar.OnSeekBarChangeListener {
        C1103a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f3629b0 || !seekBarPreference.f3624W) {
                    seekBarPreference.mo4019K0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo4020L0(i + seekBarPreference2.f3621T);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3624W = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3624W = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3621T != seekBarPreference.f3620S) {
                seekBarPreference.mo4019K0(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C1104b implements View.OnKeyListener {
        C1104b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f3627Z && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f3625X;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$c */
    private static class C1105c extends Preference.C1092b {
        public static final Parcelable.Creator<C1105c> CREATOR = new C1106a();

        /* renamed from: d */
        int f3634d;

        /* renamed from: e */
        int f3635e;

        /* renamed from: f */
        int f3636f;

        /* renamed from: androidx.preference.SeekBarPreference$c$a */
        class C1106a implements Parcelable.Creator<C1105c> {
            C1106a() {
            }

            /* renamed from: a */
            public C1105c createFromParcel(Parcel parcel) {
                return new C1105c(parcel);
            }

            /* renamed from: b */
            public C1105c[] newArray(int i) {
                return new C1105c[i];
            }
        }

        C1105c(Parcel parcel) {
            super(parcel);
            this.f3634d = parcel.readInt();
            this.f3635e = parcel.readInt();
            this.f3636f = parcel.readInt();
        }

        C1105c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3634d);
            parcel.writeInt(this.f3635e);
            parcel.writeInt(this.f3636f);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1142n.f3739j);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3630c0 = new C1103a();
        this.f3631d0 = new C1104b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3774H0, i, i2);
        this.f3621T = obtainStyledAttributes.getInt(C1148t.f3780K0, 0);
        mo4016G0(obtainStyledAttributes.getInt(C1148t.f3776I0, 100));
        mo4017H0(obtainStyledAttributes.getInt(C1148t.f3782L0, 0));
        this.f3627Z = obtainStyledAttributes.getBoolean(C1148t.f3778J0, true);
        this.f3628a0 = obtainStyledAttributes.getBoolean(C1148t.f3784M0, false);
        this.f3629b0 = obtainStyledAttributes.getBoolean(C1148t.f3786N0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J0 */
    private void m4504J0(int i, boolean z) {
        int i2 = this.f3621T;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f3622U;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f3620S) {
            this.f3620S = i;
            mo4020L0(i);
            mo3948h0(i);
            if (z) {
                mo3872M();
            }
        }
    }

    /* renamed from: G0 */
    public final void mo4016G0(int i) {
        int i2 = this.f3621T;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f3622U) {
            this.f3622U = i;
            mo3872M();
        }
    }

    /* renamed from: H0 */
    public final void mo4017H0(int i) {
        if (i != this.f3623V) {
            this.f3623V = Math.min(this.f3622U - this.f3621T, Math.abs(i));
            mo3872M();
        }
    }

    /* renamed from: I0 */
    public void mo4018I0(int i) {
        m4504J0(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo4019K0(SeekBar seekBar) {
        int progress = this.f3621T + seekBar.getProgress();
        if (progress == this.f3620S) {
            return;
        }
        if (mo3938b(Integer.valueOf(progress))) {
            m4504J0(progress, false);
            return;
        }
        seekBar.setProgress(this.f3620S - this.f3621T);
        mo4020L0(this.f3620S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo4020L0(int i) {
        TextView textView = this.f3626Y;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        mVar.f4049a.setOnKeyListener(this.f3631d0);
        this.f3625X = (SeekBar) mVar.mo4130M(C1144p.f3745c);
        TextView textView = (TextView) mVar.mo4130M(C1144p.f3746d);
        this.f3626Y = textView;
        if (this.f3628a0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f3626Y = null;
        }
        SeekBar seekBar = this.f3625X;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f3630c0);
        this.f3625X.setMax(this.f3622U - this.f3621T);
        int i = this.f3623V;
        if (i != 0) {
            this.f3625X.setKeyProgressIncrement(i);
        } else {
            this.f3623V = this.f3625X.getKeyProgressIncrement();
        }
        this.f3625X.setProgress(this.f3620S - this.f3621T);
        mo4020L0(this.f3620S);
        this.f3625X.setEnabled(mo3923I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C1105c.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C1105c cVar = (C1105c) parcelable;
        super.mo3881a0(cVar.getSuperState());
        this.f3620S = cVar.f3634d;
        this.f3621T = cVar.f3635e;
        this.f3622U = cVar.f3636f;
        mo3872M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C1105c cVar = new C1105c(b0);
        cVar.f3634d = this.f3620S;
        cVar.f3635e = this.f3621T;
        cVar.f3636f = this.f3622U;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo4018I0(mo3975w(((Integer) obj).intValue()));
    }
}
