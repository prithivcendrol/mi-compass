package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.preference.C1141m;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.slidingwidget.widget.SlidingButton;
import p097p3.C2546a;
import p097p3.C2549c;
import p123u3.C2850k;
import p123u3.C2853n;
import p123u3.C2856q;

public class StretchablePickerPreference extends StretchableWidgetPreference {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C2546a f9155d0;

    /* renamed from: e0 */
    private DateTimePicker.C2320c f9156e0;

    /* renamed from: f0 */
    private Context f9157f0;

    /* renamed from: g0 */
    private boolean f9158g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public boolean f9159h0;

    /* renamed from: i0 */
    private CharSequence f9160i0;

    /* renamed from: j0 */
    private int f9161j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public long f9162k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C2373c f9163l0;

    /* renamed from: miuix.preference.StretchablePickerPreference$a */
    class C2371a implements DateTimePicker.C2321d {
        C2371a() {
        }

        /* renamed from: a */
        public void mo8849a(DateTimePicker dateTimePicker, long j) {
            StretchablePickerPreference.this.f9155d0.mo9753S(j);
            StretchablePickerPreference stretchablePickerPreference = StretchablePickerPreference.this;
            stretchablePickerPreference.m10038a1(stretchablePickerPreference.f9159h0, j);
            long unused = StretchablePickerPreference.this.f9162k0 = j;
            if (StretchablePickerPreference.this.f9163l0 != null) {
                StretchablePickerPreference.this.f9163l0.mo9042a(StretchablePickerPreference.this.f9162k0);
            }
            StretchablePickerPreference.this.mo3872M();
        }
    }

    /* renamed from: miuix.preference.StretchablePickerPreference$b */
    class C2372b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DateTimePicker f9165a;

        C2372b(DateTimePicker dateTimePicker) {
            this.f9165a = dateTimePicker;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9165a.setLunarMode(z);
            StretchablePickerPreference.this.m10038a1(z, this.f9165a.getTimeInMillis());
            boolean unused = StretchablePickerPreference.this.f9159h0 = z;
        }
    }

    /* renamed from: miuix.preference.StretchablePickerPreference$c */
    public interface C2373c {
        /* renamed from: a */
        long mo9042a(long j);
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10734q);
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C2546a aVar = new C2546a();
        this.f9155d0 = aVar;
        this.f9162k0 = aVar.mo9745E();
        this.f9157f0 = context;
        this.f9156e0 = new DateTimePicker.C2320c(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10792J1, i, 0);
        this.f9158g0 = obtainStyledAttributes.getBoolean(C2856q.f10795K1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: T0 */
    private void m10032T0(SlidingButton slidingButton, DateTimePicker dateTimePicker) {
        slidingButton.setOnPerformCheckedChangeListener(new C2372b(dateTimePicker));
    }

    /* renamed from: U0 */
    private String m10033U0(long j, Context context) {
        String a = this.f9156e0.mo8848a(this.f9155d0.mo9768z(1), this.f9155d0.mo9768z(5), this.f9155d0.mo9768z(9));
        String a2 = C2549c.m10885a(context, j, 12);
        return a + " " + a2;
    }

    /* renamed from: V0 */
    private String m10034V0(long j) {
        return C2549c.m10885a(this.f9157f0, j, 908);
    }

    /* renamed from: W0 */
    private CharSequence m10035W0() {
        return this.f9160i0;
    }

    /* renamed from: X0 */
    private int m10036X0() {
        return this.f9161j0;
    }

    /* renamed from: Z0 */
    private void m10037Z0(long j) {
        mo9043I0(m10034V0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public void m10038a1(boolean z, long j) {
        if (z) {
            mo9040Y0(j);
        } else {
            m10037Z0(j);
        }
    }

    /* renamed from: b1 */
    private void m10039b1(DateTimePicker dateTimePicker) {
        dateTimePicker.setOnTimeChangedListener(new C2371a());
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        View view = mVar.f4049a;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2853n.f10749f);
        DateTimePicker dateTimePicker = (DateTimePicker) view.findViewById(C2853n.f10746c);
        SlidingButton slidingButton = (SlidingButton) view.findViewById(C2853n.f10748e);
        TextView textView = (TextView) view.findViewById(C2853n.f10750g);
        if (!this.f9158g0) {
            relativeLayout.setVisibility(8);
        } else if (textView != null) {
            CharSequence W0 = m10035W0();
            if (!TextUtils.isEmpty(W0)) {
                textView.setText(W0);
            }
        }
        dateTimePicker.setMinuteInterval(m10036X0());
        this.f9162k0 = dateTimePicker.getTimeInMillis();
        super.mo3861S(mVar);
        m10032T0(slidingButton, dateTimePicker);
        m10038a1(this.f9159h0, dateTimePicker.getTimeInMillis());
        m10039b1(dateTimePicker);
    }

    /* renamed from: Y0 */
    public void mo9040Y0(long j) {
        mo9043I0(m10033U0(j, this.f9157f0));
    }
}
