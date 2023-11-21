package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.Locale;
import miuix.pickerwidget.internal.widget.ProperPaddingViewGroup;
import miuix.pickerwidget.widget.NumberPicker;
import p091o3.C2503e;
import p091o3.C2504f;
import p091o3.C2506h;
import p097p3.C2546a;
import p097p3.C2547b;
import p097p3.C2549c;

public class TimePicker extends FrameLayout {

    /* renamed from: o */
    private static final C2344f f9000o = new C2339a();

    /* renamed from: d */
    private boolean f9001d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f9002e;

    /* renamed from: f */
    private final NumberPicker f9003f;

    /* renamed from: g */
    private final NumberPicker f9004g;

    /* renamed from: h */
    private final NumberPicker f9005h;

    /* renamed from: i */
    private final Button f9006i;

    /* renamed from: j */
    private boolean f9007j;

    /* renamed from: k */
    private C2344f f9008k;

    /* renamed from: l */
    private C2546a f9009l;

    /* renamed from: m */
    private Locale f9010m;

    /* renamed from: n */
    private ProperPaddingViewGroup f9011n;

    /* renamed from: miuix.pickerwidget.widget.TimePicker$a */
    class C2339a implements C2344f {
        C2339a() {
        }

        /* renamed from: a */
        public void mo8948a(TimePicker timePicker, int i, int i2) {
        }
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$b */
    class C2340b implements NumberPicker.C2334j {
        C2340b() {
        }

        /* renamed from: a */
        public void mo8826a(NumberPicker numberPicker, int i, int i2) {
            if (!TimePicker.this.mo8932e() && ((i == 11 && i2 == 12) || (i == 12 && i2 == 11))) {
                TimePicker timePicker = TimePicker.this;
                boolean unused = timePicker.f9002e = !timePicker.f9002e;
                TimePicker.this.m9918h();
            }
            TimePicker.this.m9917g();
        }
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$c */
    class C2341c implements NumberPicker.C2334j {
        C2341c() {
        }

        /* renamed from: a */
        public void mo8826a(NumberPicker numberPicker, int i, int i2) {
            TimePicker.this.m9917g();
        }
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$d */
    class C2342d implements View.OnClickListener {
        C2342d() {
        }

        public void onClick(View view) {
            view.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f9002e = !timePicker.f9002e;
            TimePicker.this.m9918h();
            TimePicker.this.m9917g();
        }
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$e */
    class C2343e implements NumberPicker.C2334j {
        C2343e() {
        }

        /* renamed from: a */
        public void mo8826a(NumberPicker numberPicker, int i, int i2) {
            numberPicker.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f9002e = !timePicker.f9002e;
            TimePicker.this.m9918h();
            TimePicker.this.m9917g();
        }
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$f */
    public interface C2344f {
        /* renamed from: a */
        void mo8948a(TimePicker timePicker, int i, int i2);
    }

    /* renamed from: miuix.pickerwidget.widget.TimePicker$g */
    private static class C2345g extends View.BaseSavedState {
        public static final Parcelable.Creator<C2345g> CREATOR = new C2346a();

        /* renamed from: d */
        private final int f9016d;

        /* renamed from: e */
        private final int f9017e;

        /* renamed from: miuix.pickerwidget.widget.TimePicker$g$a */
        class C2346a implements Parcelable.Creator<C2345g> {
            C2346a() {
            }

            /* renamed from: a */
            public C2345g createFromParcel(Parcel parcel) {
                return new C2345g(parcel, (C2339a) null);
            }

            /* renamed from: b */
            public C2345g[] newArray(int i) {
                return new C2345g[i];
            }
        }

        private C2345g(Parcel parcel) {
            super(parcel);
            this.f9016d = parcel.readInt();
            this.f9017e = parcel.readInt();
        }

        /* synthetic */ C2345g(Parcel parcel, C2339a aVar) {
            this(parcel);
        }

        private C2345g(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f9016d = i;
            this.f9017e = i2;
        }

        /* synthetic */ C2345g(Parcelable parcelable, int i, int i2, C2339a aVar) {
            this(parcelable, i, i2);
        }

        /* renamed from: a */
        public int mo8950a() {
            return this.f9016d;
        }

        /* renamed from: b */
        public int mo8951b() {
            return this.f9017e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9016d);
            parcel.writeInt(this.f9017e);
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9007j = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C2504f.f9765d, this, true);
        this.f9011n = (ProperPaddingViewGroup) findViewById(C2503e.f9759h);
        NumberPicker numberPicker = (NumberPicker) findViewById(C2503e.f9754c);
        this.f9003f = numberPicker;
        numberPicker.setOnValueChangedListener(new C2340b());
        int i2 = C2503e.f9757f;
        ((EditText) numberPicker.findViewById(i2)).setImeOptions(5);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(C2503e.f9755d);
        this.f9004g = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setOnLongPressUpdateInterval(100);
        numberPicker2.setFormatter(NumberPicker.f8899G0);
        numberPicker2.setOnValueChangedListener(new C2341c());
        ((EditText) numberPicker2.findViewById(i2)).setImeOptions(5);
        View findViewById = findViewById(C2503e.f9752a);
        if (findViewById instanceof Button) {
            this.f9005h = null;
            Button button = (Button) findViewById;
            this.f9006i = button;
            button.setOnClickListener(new C2342d());
        } else {
            this.f9006i = null;
            NumberPicker numberPicker3 = (NumberPicker) findViewById;
            this.f9005h = numberPicker3;
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(1);
            numberPicker3.setDisplayedValues(C2547b.m10861n(getContext()).mo9769b());
            numberPicker3.setOnValueChangedListener(new C2343e());
            ((EditText) numberPicker3.findViewById(i2)).setImeOptions(6);
        }
        if (m9916f()) {
            ViewGroup viewGroup = (ViewGroup) findViewById(C2503e.f9760i);
            viewGroup.removeView(findViewById);
            viewGroup.addView(findViewById, 0);
        }
        m9919i();
        m9918h();
        setOnTimeChangedListener(f9000o);
        setCurrentHour(Integer.valueOf(this.f9009l.mo9768z(18)));
        setCurrentMinute(Integer.valueOf(this.f9009l.mo9768z(20)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: f */
    private boolean m9916f() {
        return getContext().getString(C2506h.f9775I).startsWith("a");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9917g() {
        sendAccessibilityEvent(4);
        C2344f fVar = this.f9008k;
        if (fVar != null) {
            fVar.mo8948a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m9918h() {
        View view;
        if (mo8932e()) {
            View view2 = this.f9005h;
            if (view2 == null) {
                view2 = this.f9006i;
            }
            view2.setVisibility(8);
        } else {
            int i = !this.f9002e;
            NumberPicker numberPicker = this.f9005h;
            if (numberPicker != null) {
                numberPicker.setValue(i);
                view = this.f9005h;
            } else {
                this.f9006i.setText(C2547b.m10861n(getContext()).mo9769b()[i]);
                view = this.f9006i;
            }
            view.setVisibility(0);
        }
        sendAccessibilityEvent(4);
    }

    /* renamed from: i */
    private void m9919i() {
        NumberPicker.C2330f fVar;
        NumberPicker numberPicker;
        if (mo8932e()) {
            this.f9003f.setMinValue(0);
            this.f9003f.setMaxValue(23);
            numberPicker = this.f9003f;
            fVar = NumberPicker.f8899G0;
        } else {
            this.f9003f.setMinValue(1);
            this.f9003f.setMaxValue(12);
            numberPicker = this.f9003f;
            fVar = null;
        }
        numberPicker.setFormatter(fVar);
    }

    private void setCurrentLocale(Locale locale) {
        if (!locale.equals(this.f9010m)) {
            this.f9010m = locale;
            if (this.f9009l == null) {
                this.f9009l = new C2546a();
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* renamed from: e */
    public boolean mo8932e() {
        return this.f9001d;
    }

    public int getBaseline() {
        return this.f9003f.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.f9003f.getValue();
        if (mo8932e()) {
            return Integer.valueOf(value);
        }
        int i = value % 12;
        return this.f9002e ? Integer.valueOf(i) : Integer.valueOf(i + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f9004g.getValue());
    }

    public boolean isEnabled() {
        return this.f9007j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TimePicker.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TimePicker.class.getName());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        int i = this.f9001d ? 44 : 28;
        this.f9009l.mo9749O(18, getCurrentHour().intValue());
        this.f9009l.mo9749O(20, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(C2549c.m10885a(getContext(), this.f9009l.mo9745E(), i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C2345g gVar = (C2345g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setCurrentHour(Integer.valueOf(gVar.mo8950a()));
        setCurrentMinute(Integer.valueOf(gVar.mo8951b()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new C2345g(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), (C2339a) null);
    }

    public void set24HourView(Boolean bool) {
        if (this.f9001d != bool.booleanValue()) {
            this.f9001d = bool.booleanValue();
            int intValue = getCurrentHour().intValue();
            m9919i();
            setCurrentHour(Integer.valueOf(intValue));
            m9918h();
        }
    }

    public void setCurrentHour(Integer num) {
        if (num != null && !num.equals(getCurrentHour())) {
            if (!mo8932e()) {
                if (num.intValue() >= 12) {
                    this.f9002e = false;
                    if (num.intValue() > 12) {
                        num = Integer.valueOf(num.intValue() - 12);
                    }
                } else {
                    this.f9002e = true;
                    if (num.intValue() == 0) {
                        num = 12;
                    }
                }
                m9918h();
            }
            this.f9003f.setValue(num.intValue());
            m9917g();
        }
    }

    public void setCurrentMinute(Integer num) {
        if (!num.equals(getCurrentMinute())) {
            this.f9004g.setValue(num.intValue());
            m9917g();
        }
    }

    public void setEnabled(boolean z) {
        if (this.f9007j != z) {
            super.setEnabled(z);
            this.f9004g.setEnabled(z);
            this.f9003f.setEnabled(z);
            View view = this.f9005h;
            if (view == null) {
                view = this.f9006i;
            }
            view.setEnabled(z);
            this.f9007j = z;
        }
    }

    public void setOnTimeChangedListener(C2344f fVar) {
        this.f9008k = fVar;
    }
}
