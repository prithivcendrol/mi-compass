package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.Locale;
import miuix.pickerwidget.widget.NumberPicker;
import p091o3.C2500b;
import p091o3.C2503e;
import p091o3.C2504f;
import p091o3.C2506h;
import p091o3.C2508j;
import p097p3.C2546a;
import p097p3.C2549c;

public class DateTimePicker extends LinearLayout {

    /* renamed from: r */
    private static C2319b f8877r;

    /* renamed from: s */
    private static final ThreadLocal<C2546a> f8878s = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static ThreadLocal<C2546a> f8879t = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public NumberPicker f8880d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public NumberPicker f8881e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public NumberPicker f8882f;

    /* renamed from: g */
    private String[] f8883g;

    /* renamed from: h */
    private C2319b f8884h;

    /* renamed from: i */
    private C2319b f8885i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2321d f8886j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2546a f8887k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f8888l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f8889m;

    /* renamed from: n */
    private C2546a f8890n;

    /* renamed from: o */
    private C2546a f8891o;

    /* renamed from: p */
    String[] f8892p;

    /* renamed from: q */
    private boolean f8893q;

    /* renamed from: miuix.pickerwidget.widget.DateTimePicker$b */
    public static class C2319b {

        /* renamed from: a */
        protected Context f8894a;

        public C2319b(Context context) {
            this.f8894a = context.getApplicationContext();
        }

        /* renamed from: a */
        public String mo8848a(int i, int i2, int i3) {
            C2546a aVar = (C2546a) DateTimePicker.f8879t.get();
            if (aVar == null) {
                aVar = new C2546a();
                DateTimePicker.f8879t.set(aVar);
            }
            aVar.mo9749O(1, i);
            aVar.mo9749O(5, i2);
            aVar.mo9749O(9, i3);
            if (!Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
                return C2549c.m10885a(this.f8894a, aVar.mo9745E(), 13696);
            }
            String a = C2549c.m10885a(this.f8894a, aVar.mo9745E(), 4480);
            String a2 = C2549c.m10885a(this.f8894a, aVar.mo9745E(), 9216);
            return a.replace(" ", "") + " " + a2;
        }
    }

    /* renamed from: miuix.pickerwidget.widget.DateTimePicker$c */
    public static class C2320c extends C2319b {
        public C2320c(Context context) {
            super(context);
        }

        /* renamed from: a */
        public String mo8848a(int i, int i2, int i3) {
            C2546a aVar = (C2546a) DateTimePicker.f8879t.get();
            if (aVar == null) {
                aVar = new C2546a();
                DateTimePicker.f8879t.set(aVar);
            }
            aVar.mo9749O(1, i);
            aVar.mo9749O(5, i2);
            aVar.mo9749O(9, i3);
            Context context = this.f8894a;
            return aVar.mo9764v(context, context.getString(C2506h.f9803f));
        }
    }

    /* renamed from: miuix.pickerwidget.widget.DateTimePicker$d */
    public interface C2321d {
        /* renamed from: a */
        void mo8849a(DateTimePicker dateTimePicker, long j);
    }

    /* renamed from: miuix.pickerwidget.widget.DateTimePicker$e */
    private class C2322e implements NumberPicker.C2334j {
        private C2322e() {
        }

        /* renamed from: b */
        private void m9822b(DateTimePicker dateTimePicker) {
            DateTimePicker.this.sendAccessibilityEvent(4);
            if (DateTimePicker.this.f8886j != null) {
                DateTimePicker.this.f8886j.mo8849a(dateTimePicker, DateTimePicker.this.getTimeInMillis());
            }
        }

        /* renamed from: a */
        public void mo8826a(NumberPicker numberPicker, int i, int i2) {
            C2546a h;
            int i3;
            int k;
            if (numberPicker == DateTimePicker.this.f8880d) {
                int i4 = 1;
                if (((numberPicker.getValue() - DateTimePicker.this.f8889m) + 5) % 5 != 1) {
                    i4 = -1;
                }
                DateTimePicker.this.f8887k.mo9755a(12, i4);
                int unused = DateTimePicker.this.f8889m = numberPicker.getValue();
            } else {
                if (numberPicker == DateTimePicker.this.f8881e) {
                    h = DateTimePicker.this.f8887k;
                    i3 = 18;
                    k = DateTimePicker.this.f8881e.getValue();
                } else if (numberPicker == DateTimePicker.this.f8882f) {
                    h = DateTimePicker.this.f8887k;
                    i3 = 20;
                    k = DateTimePicker.this.f8888l * DateTimePicker.this.f8882f.getValue();
                }
                h.mo9749O(i3, k);
            }
            DateTimePicker.this.m9810o();
            DateTimePicker.this.m9815u(false);
            DateTimePicker.this.m9816v();
            DateTimePicker.this.m9817w();
            m9822b(DateTimePicker.this);
        }
    }

    /* renamed from: miuix.pickerwidget.widget.DateTimePicker$f */
    private static class C2323f extends View.BaseSavedState {
        public static final Parcelable.Creator<C2323f> CREATOR = new C2324a();

        /* renamed from: d */
        private long f8896d;

        /* renamed from: miuix.pickerwidget.widget.DateTimePicker$f$a */
        class C2324a implements Parcelable.Creator<C2323f> {
            C2324a() {
            }

            /* renamed from: a */
            public C2323f createFromParcel(Parcel parcel) {
                return new C2323f(parcel);
            }

            /* renamed from: b */
            public C2323f[] newArray(int i) {
                return new C2323f[i];
            }
        }

        public C2323f(Parcel parcel) {
            super(parcel);
            this.f8896d = parcel.readLong();
        }

        public C2323f(Parcelable parcelable, long j) {
            super(parcelable);
            this.f8896d = j;
        }

        /* renamed from: a */
        public long mo8850a() {
            return this.f8896d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f8896d);
        }
    }

    public DateTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2500b.f9739b);
    }

    public DateTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8888l = 1;
        this.f8890n = null;
        this.f8891o = null;
        this.f8892p = null;
        this.f8893q = false;
        f8877r = new C2319b(getContext());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C2504f.f9763b, this, true);
        C2322e eVar = new C2322e();
        C2546a aVar = new C2546a();
        this.f8887k = aVar;
        m9809n(aVar, true);
        ThreadLocal<C2546a> threadLocal = f8878s;
        C2546a aVar2 = threadLocal.get();
        if (aVar2 == null) {
            aVar2 = new C2546a();
            threadLocal.set(aVar2);
        }
        aVar2.mo9752R(0, this.f8893q);
        this.f8880d = (NumberPicker) findViewById(C2503e.f9753b);
        this.f8881e = (NumberPicker) findViewById(C2503e.f9754c);
        this.f8882f = (NumberPicker) findViewById(C2503e.f9755d);
        this.f8880d.setOnValueChangedListener(eVar);
        this.f8880d.setMaxFlingSpeedFactor(3.0f);
        this.f8881e.setOnValueChangedListener(eVar);
        this.f8882f.setOnValueChangedListener(eVar);
        this.f8882f.setMinValue(0);
        this.f8882f.setMaxValue(59);
        this.f8881e.setFormatter(NumberPicker.f8899G0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2508j.f9837G, i, 0);
        this.f8893q = obtainStyledAttributes.getBoolean(C2508j.f9838H, false);
        obtainStyledAttributes.recycle();
        m9814s();
        m9810o();
        m9815u(true);
        m9816v();
        m9817w();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: n */
    private void m9809n(C2546a aVar, boolean z) {
        aVar.mo9749O(22, 0);
        aVar.mo9749O(21, 0);
        int z2 = aVar.mo9768z(20) % this.f8888l;
        if (z2 == 0) {
            return;
        }
        if (z) {
            int z3 = aVar.mo9768z(20);
            int i = this.f8888l;
            if ((z3 + i) - z2 >= 60) {
                aVar.mo9755a(18, 1);
                aVar.mo9749O(20, 0);
                return;
            }
            aVar.mo9755a(20, i - z2);
            return;
        }
        aVar.mo9755a(20, -z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m9810o() {
        C2546a aVar = this.f8890n;
        if (aVar != null && aVar.mo9745E() > this.f8887k.mo9745E()) {
            this.f8887k.mo9752R(this.f8890n.mo9745E(), this.f8893q);
        }
        C2546a aVar2 = this.f8891o;
        if (aVar2 != null && aVar2.mo9745E() < this.f8887k.mo9745E()) {
            this.f8887k.mo9752R(this.f8891o.mo9745E(), this.f8893q);
        }
    }

    /* renamed from: p */
    private void m9811p(NumberPicker numberPicker, int i, int i2) {
        String[] displayedValues = numberPicker.getDisplayedValues();
        if (displayedValues != null && displayedValues.length < (i2 - i) + 1) {
            numberPicker.setDisplayedValues((String[]) null);
        }
    }

    /* renamed from: q */
    private int m9812q(C2546a aVar, C2546a aVar2) {
        C2546a aVar3 = (C2546a) aVar.clone();
        C2546a aVar4 = (C2546a) aVar2.clone();
        aVar3.mo9749O(18, 0);
        aVar3.mo9749O(20, 0);
        aVar3.mo9749O(21, 0);
        aVar3.mo9749O(22, 0);
        aVar4.mo9749O(18, 0);
        aVar4.mo9749O(20, 0);
        aVar4.mo9749O(21, 0);
        aVar4.mo9749O(22, 0);
        return (int) (((((aVar3.mo9745E() / 1000) / 60) / 60) / 24) - ((((aVar4.mo9745E() / 1000) / 60) / 60) / 24));
    }

    /* renamed from: r */
    private String m9813r(int i, int i2, int i3) {
        C2319b bVar = f8877r;
        if (this.f8893q) {
            if (this.f8885i == null) {
                this.f8885i = new C2320c(getContext());
            }
            bVar = this.f8885i;
        }
        C2319b bVar2 = this.f8884h;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        return bVar.mo8848a(i, i2, i3);
    }

    /* renamed from: s */
    private void m9814s() {
        Resources resources = getResources();
        boolean z = false;
        boolean z2 = resources.getConfiguration().getLayoutDirection() == 1;
        boolean startsWith = resources.getString(C2506h.f9769C).startsWith("h");
        if ((startsWith && z2) || (!startsWith && !z2)) {
            z = true;
        }
        if (z) {
            ViewGroup viewGroup = (ViewGroup) this.f8881e.getParent();
            viewGroup.removeView(this.f8881e);
            viewGroup.addView(this.f8881e, viewGroup.getChildCount());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m9815u(boolean z) {
        String[] strArr;
        C2546a aVar = this.f8890n;
        int i = Integer.MAX_VALUE;
        int q = aVar == null ? Integer.MAX_VALUE : m9812q(this.f8887k, aVar);
        C2546a aVar2 = this.f8891o;
        if (aVar2 != null) {
            i = m9812q(aVar2, this.f8887k);
        }
        if (q > 1 || i > 1) {
            m9811p(this.f8880d, 0, 4);
            this.f8880d.setMinValue(0);
            this.f8880d.setMaxValue(4);
            if (q <= 1) {
                this.f8880d.setValue(q);
                this.f8889m = q;
                this.f8880d.setWrapSelectorWheel(false);
            }
            if (i <= 1) {
                int i2 = 4 - i;
                this.f8889m = i2;
                this.f8880d.setValue(i2);
                this.f8880d.setWrapSelectorWheel(false);
            }
            if (q > 1 && i > 1) {
                this.f8880d.setWrapSelectorWheel(true);
            }
        } else {
            int q2 = m9812q(this.f8891o, this.f8890n);
            m9811p(this.f8880d, 0, q2);
            this.f8880d.setMinValue(0);
            this.f8880d.setMaxValue(q2);
            this.f8880d.setValue(q);
            this.f8889m = q;
            this.f8880d.setWrapSelectorWheel(false);
        }
        int maxValue = (this.f8880d.getMaxValue() - this.f8880d.getMinValue()) + 1;
        if (z || (strArr = this.f8892p) == null || strArr.length != maxValue) {
            this.f8892p = new String[maxValue];
        }
        int value = this.f8880d.getValue();
        ThreadLocal<C2546a> threadLocal = f8878s;
        C2546a aVar3 = threadLocal.get();
        if (aVar3 == null) {
            aVar3 = new C2546a();
            threadLocal.set(aVar3);
        }
        aVar3.mo9752R(this.f8887k.mo9745E(), this.f8893q);
        this.f8892p[value] = m9813r(aVar3.mo9768z(1), aVar3.mo9768z(5), aVar3.mo9768z(9));
        for (int i3 = 1; i3 <= 2; i3++) {
            aVar3.mo9755a(12, 1);
            int i4 = (value + i3) % 5;
            String[] strArr2 = this.f8892p;
            if (i4 >= strArr2.length) {
                break;
            }
            strArr2[i4] = m9813r(aVar3.mo9768z(1), aVar3.mo9768z(5), aVar3.mo9768z(9));
        }
        aVar3.mo9752R(this.f8887k.mo9745E(), this.f8893q);
        for (int i5 = 1; i5 <= 2; i5++) {
            aVar3.mo9755a(12, -1);
            int i6 = ((value - i5) + 5) % 5;
            String[] strArr3 = this.f8892p;
            if (i6 >= strArr3.length) {
                break;
            }
            strArr3[i6] = m9813r(aVar3.mo9768z(1), aVar3.mo9768z(5), aVar3.mo9768z(9));
        }
        this.f8880d.setDisplayedValues(this.f8892p);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m9816v() {
        boolean z;
        C2546a aVar = this.f8891o;
        if (aVar == null || m9812q(this.f8887k, aVar) != 0) {
            z = false;
        } else {
            this.f8881e.setMaxValue(this.f8891o.mo9768z(18));
            this.f8881e.setWrapSelectorWheel(false);
            z = true;
        }
        C2546a aVar2 = this.f8890n;
        if (aVar2 != null && m9812q(this.f8887k, aVar2) == 0) {
            this.f8881e.setMinValue(this.f8890n.mo9768z(18));
            this.f8881e.setWrapSelectorWheel(false);
            z = true;
        }
        if (!z) {
            this.f8881e.setMinValue(0);
            this.f8881e.setMaxValue(23);
            this.f8881e.setWrapSelectorWheel(true);
        }
        this.f8881e.setValue(this.f8887k.mo9768z(18));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m9817w() {
        boolean z;
        C2546a aVar = this.f8891o;
        if (aVar != null && m9812q(this.f8887k, aVar) == 0 && this.f8887k.mo9768z(18) == this.f8891o.mo9768z(18)) {
            int z2 = this.f8891o.mo9768z(20);
            this.f8882f.setMinValue(0);
            this.f8882f.setMaxValue(z2 / this.f8888l);
            this.f8882f.setWrapSelectorWheel(false);
            z = true;
        } else {
            z = false;
        }
        C2546a aVar2 = this.f8890n;
        if (aVar2 != null && m9812q(this.f8887k, aVar2) == 0 && this.f8887k.mo9768z(18) == this.f8890n.mo9768z(18)) {
            this.f8882f.setMinValue(this.f8890n.mo9768z(20) / this.f8888l);
            this.f8882f.setWrapSelectorWheel(false);
            z = true;
        }
        if (!z) {
            int i = this.f8888l;
            int i2 = 60 / i;
            if (60 % i == 0) {
                i2--;
            }
            m9811p(this.f8882f, 0, i2);
            this.f8882f.setMinValue(0);
            this.f8882f.setMaxValue(i2);
            this.f8882f.setWrapSelectorWheel(true);
        }
        int maxValue = (this.f8882f.getMaxValue() - this.f8882f.getMinValue()) + 1;
        String[] strArr = this.f8883g;
        if (strArr == null || strArr.length != maxValue) {
            this.f8883g = new String[maxValue];
            for (int i3 = 0; i3 < maxValue; i3++) {
                this.f8883g[i3] = NumberPicker.f8899G0.mo8912a((this.f8882f.getMinValue() + i3) * this.f8888l);
            }
            this.f8882f.setDisplayedValues(this.f8883g);
        }
        this.f8882f.setValue(this.f8887k.mo9768z(20) / this.f8888l);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public long getTimeInMillis() {
        return this.f8887k.mo9745E();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DateTimePicker.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DateTimePicker.class.getName());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(C2549c.m10885a(getContext(), this.f8887k.mo9745E(), 1420));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C2323f fVar = (C2323f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        mo8847t(fVar.mo8850a());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new C2323f(super.onSaveInstanceState(), getTimeInMillis());
    }

    public void setDayFormatter(C2319b bVar) {
        this.f8884h = bVar;
        m9815u(true);
    }

    public void setLunarMode(boolean z) {
        boolean z2 = this.f8893q;
        this.f8893q = z;
        m9815u(true);
        if (z2 != this.f8893q) {
            this.f8880d.requestLayout();
        }
    }

    public void setMaxDateTime(long j) {
        if (j <= 0) {
            this.f8891o = null;
        } else {
            C2546a aVar = new C2546a();
            this.f8891o = aVar;
            aVar.mo9752R(j, this.f8893q);
            m9809n(this.f8891o, false);
            C2546a aVar2 = this.f8890n;
            if (aVar2 != null && aVar2.mo9745E() > this.f8891o.mo9745E()) {
                this.f8891o.mo9752R(this.f8890n.mo9745E(), this.f8893q);
            }
        }
        m9810o();
        m9815u(true);
        m9816v();
        m9817w();
    }

    public void setMinDateTime(long j) {
        if (j <= 0) {
            this.f8890n = null;
        } else {
            C2546a aVar = new C2546a();
            this.f8890n = aVar;
            aVar.mo9752R(j, this.f8893q);
            if (!(this.f8890n.mo9768z(21) == 0 && this.f8890n.mo9768z(22) == 0)) {
                this.f8890n.mo9755a(20, 1);
            }
            m9809n(this.f8890n, true);
            C2546a aVar2 = this.f8891o;
            if (aVar2 != null && aVar2.mo9745E() < this.f8890n.mo9745E()) {
                this.f8890n.mo9752R(this.f8891o.mo9745E(), this.f8893q);
            }
        }
        m9810o();
        m9815u(true);
        m9816v();
        m9817w();
    }

    public void setMinuteInterval(int i) {
        if (this.f8888l != i) {
            this.f8888l = i;
            m9809n(this.f8887k, true);
            m9810o();
            m9816v();
            m9817w();
        }
    }

    public void setOnTimeChangedListener(C2321d dVar) {
        this.f8886j = dVar;
    }

    /* renamed from: t */
    public void mo8847t(long j) {
        this.f8887k.mo9752R(j, this.f8893q);
        m9809n(this.f8887k, true);
        m9810o();
        m9815u(true);
        m9816v();
        m9817w();
    }
}
