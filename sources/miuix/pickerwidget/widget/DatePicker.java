package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import miuix.pickerwidget.widget.NumberPicker;
import p091o3.C2500b;
import p091o3.C2503e;
import p091o3.C2506h;
import p097p3.C2546a;
import p097p3.C2547b;
import p097p3.C2549c;

public class DatePicker extends FrameLayout {

    /* renamed from: t */
    private static final String f8851t = DatePicker.class.getSimpleName();

    /* renamed from: u */
    private static String[] f8852u;

    /* renamed from: v */
    private static String[] f8853v;

    /* renamed from: w */
    private static String[] f8854w;

    /* renamed from: x */
    private static String f8855x;

    /* renamed from: d */
    private final LinearLayout f8856d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final NumberPicker f8857e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final NumberPicker f8858f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final NumberPicker f8859g;

    /* renamed from: h */
    private Locale f8860h;

    /* renamed from: i */
    private C2315b f8861i;

    /* renamed from: j */
    private String[] f8862j;

    /* renamed from: k */
    private char[] f8863k;

    /* renamed from: l */
    private final DateFormat f8864l;

    /* renamed from: m */
    private int f8865m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2546a f8866n;

    /* renamed from: o */
    private C2546a f8867o;

    /* renamed from: p */
    private C2546a f8868p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2546a f8869q;

    /* renamed from: r */
    private boolean f8870r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f8871s;

    /* renamed from: miuix.pickerwidget.widget.DatePicker$a */
    class C2314a implements NumberPicker.C2334j {
        C2314a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8826a(miuix.pickerwidget.widget.NumberPicker r6, int r7, int r8) {
            /*
                r5 = this;
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r0 = r0.f8866n
                miuix.pickerwidget.widget.DatePicker r1 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r1 = r1.f8869q
                long r1 = r1.mo9745E()
                miuix.pickerwidget.widget.DatePicker r3 = miuix.pickerwidget.widget.DatePicker.this
                boolean r3 = r3.f8871s
                r0.mo9752R(r1, r3)
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                miuix.pickerwidget.widget.NumberPicker r0 = r0.f8857e
                r1 = 1
                r2 = 5
                r3 = 9
                if (r6 != r0) goto L_0x003c
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r0 = r0.f8866n
                miuix.pickerwidget.widget.DatePicker r4 = miuix.pickerwidget.widget.DatePicker.this
                boolean r4 = r4.f8871s
                if (r4 == 0) goto L_0x0036
                r4 = 10
                goto L_0x0037
            L_0x0036:
                r4 = r3
            L_0x0037:
                int r8 = r8 - r7
                r0.mo9755a(r4, r8)
                goto L_0x0072
            L_0x003c:
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                miuix.pickerwidget.widget.NumberPicker r0 = r0.f8858f
                if (r6 != r0) goto L_0x0056
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r0 = r0.f8866n
                miuix.pickerwidget.widget.DatePicker r4 = miuix.pickerwidget.widget.DatePicker.this
                boolean r4 = r4.f8871s
                if (r4 == 0) goto L_0x0054
                r4 = 6
                goto L_0x0037
            L_0x0054:
                r4 = r2
                goto L_0x0037
            L_0x0056:
                miuix.pickerwidget.widget.DatePicker r7 = miuix.pickerwidget.widget.DatePicker.this
                miuix.pickerwidget.widget.NumberPicker r7 = r7.f8859g
                if (r6 != r7) goto L_0x00ab
                miuix.pickerwidget.widget.DatePicker r7 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r7 = r7.f8866n
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                boolean r0 = r0.f8871s
                if (r0 == 0) goto L_0x006e
                r0 = 2
                goto L_0x006f
            L_0x006e:
                r0 = r1
            L_0x006f:
                r7.mo9749O(r0, r8)
            L_0x0072:
                miuix.pickerwidget.widget.DatePicker r7 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r8 = r7.f8866n
                int r8 = r8.mo9768z(r1)
                miuix.pickerwidget.widget.DatePicker r0 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r0 = r0.f8866n
                int r0 = r0.mo9768z(r2)
                miuix.pickerwidget.widget.DatePicker r1 = miuix.pickerwidget.widget.DatePicker.this
                p3.a r1 = r1.f8866n
                int r1 = r1.mo9768z(r3)
                r7.m9782r(r8, r0, r1)
                miuix.pickerwidget.widget.DatePicker r7 = miuix.pickerwidget.widget.DatePicker.this
                miuix.pickerwidget.widget.NumberPicker r7 = r7.f8859g
                if (r6 != r7) goto L_0x00a0
                miuix.pickerwidget.widget.DatePicker r6 = miuix.pickerwidget.widget.DatePicker.this
                r6.m9781q()
            L_0x00a0:
                miuix.pickerwidget.widget.DatePicker r6 = miuix.pickerwidget.widget.DatePicker.this
                r6.m9785u()
                miuix.pickerwidget.widget.DatePicker r6 = miuix.pickerwidget.widget.DatePicker.this
                r6.m9778n()
                return
            L_0x00ab:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.DatePicker.C2314a.mo8826a(miuix.pickerwidget.widget.NumberPicker, int, int):void");
        }
    }

    /* renamed from: miuix.pickerwidget.widget.DatePicker$b */
    public interface C2315b {
        /* renamed from: a */
        void mo8827a(DatePicker datePicker, int i, int i2, int i3, boolean z);
    }

    /* renamed from: miuix.pickerwidget.widget.DatePicker$c */
    private static class C2316c extends View.BaseSavedState {
        public static final Parcelable.Creator<C2316c> CREATOR = new C2317a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f8873d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f8874e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f8875f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final boolean f8876g;

        /* renamed from: miuix.pickerwidget.widget.DatePicker$c$a */
        class C2317a implements Parcelable.Creator<C2316c> {
            C2317a() {
            }

            /* renamed from: a */
            public C2316c createFromParcel(Parcel parcel) {
                return new C2316c(parcel, (C2314a) null);
            }

            /* renamed from: b */
            public C2316c[] newArray(int i) {
                return new C2316c[i];
            }
        }

        private C2316c(Parcel parcel) {
            super(parcel);
            this.f8873d = parcel.readInt();
            this.f8874e = parcel.readInt();
            this.f8875f = parcel.readInt();
            this.f8876g = parcel.readInt() != 1 ? false : true;
        }

        /* synthetic */ C2316c(Parcel parcel, C2314a aVar) {
            this(parcel);
        }

        private C2316c(Parcelable parcelable, int i, int i2, int i3, boolean z) {
            super(parcelable);
            this.f8873d = i;
            this.f8874e = i2;
            this.f8875f = i3;
            this.f8876g = z;
        }

        /* synthetic */ C2316c(Parcelable parcelable, int i, int i2, int i3, boolean z, C2314a aVar) {
            this(parcelable, i, i2, i3, z);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8873d);
            parcel.writeInt(this.f8874e);
            parcel.writeInt(this.f8875f);
            parcel.writeInt(this.f8876g ? 1 : 0);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2500b.f9738a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DatePicker(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r18.<init>(r19, r20, r21)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "MM/dd/yyyy"
            r2.<init>(r3)
            r0.f8864l = r2
            r2 = 1
            r0.f8870r = r2
            r3 = 0
            r0.f8871s = r3
            r18.m9777l()
            p3.a r4 = new p3.a
            r4.<init>()
            r0.f8866n = r4
            p3.a r4 = new p3.a
            r4.<init>()
            r0.f8867o = r4
            p3.a r4 = new p3.a
            r4.<init>()
            r0.f8868p = r4
            p3.a r4 = new p3.a
            r4.<init>()
            r0.f8869q = r4
            int[] r4 = p091o3.C2508j.f9901w
            int r5 = p091o3.C2507i.f9825a
            r6 = r20
            r7 = r21
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r6, r4, r7, r5)
            int r5 = p091o3.C2508j.f9835E
            boolean r5 = r4.getBoolean(r5, r2)
            int r6 = p091o3.C2508j.f9836F
            r7 = 1900(0x76c, float:2.662E-42)
            int r9 = r4.getInt(r6, r7)
            int r6 = p091o3.C2508j.f9903x
            r7 = 2100(0x834, float:2.943E-42)
            int r6 = r4.getInt(r6, r7)
            int r7 = p091o3.C2508j.f9827A
            java.lang.String r7 = r4.getString(r7)
            int r8 = p091o3.C2508j.f9907z
            java.lang.String r15 = r4.getString(r8)
            int r8 = p091o3.C2504f.f9762a
            int r10 = p091o3.C2508j.f9905y
            boolean r10 = r4.getBoolean(r10, r3)
            r0.f8871s = r10
            int r10 = p091o3.C2508j.f9833D
            boolean r10 = r4.getBoolean(r10, r2)
            int r11 = p091o3.C2508j.f9831C
            boolean r11 = r4.getBoolean(r11, r2)
            int r12 = p091o3.C2508j.f9829B
            boolean r12 = r4.getBoolean(r12, r2)
            r4.recycle()
            java.util.Locale r4 = java.util.Locale.getDefault()
            r0.setCurrentLocale(r4)
            java.lang.String r4 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r4)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r1.inflate(r8, r0, r2)
            miuix.pickerwidget.widget.DatePicker$a r1 = new miuix.pickerwidget.widget.DatePicker$a
            r1.<init>()
            int r4 = p091o3.C2503e.f9758g
            android.view.View r4 = r0.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f8856d = r4
            int r4 = p091o3.C2503e.f9753b
            android.view.View r4 = r0.findViewById(r4)
            miuix.pickerwidget.widget.NumberPicker r4 = (miuix.pickerwidget.widget.NumberPicker) r4
            r0.f8857e = r4
            r13 = 100
            r4.setOnLongPressUpdateInterval(r13)
            r4.setOnValueChangedListener(r1)
            r8 = 8
            if (r12 != 0) goto L_0x00bc
            r4.setVisibility(r8)
        L_0x00bc:
            int r4 = p091o3.C2503e.f9756e
            android.view.View r4 = r0.findViewById(r4)
            miuix.pickerwidget.widget.NumberPicker r4 = (miuix.pickerwidget.widget.NumberPicker) r4
            r0.f8858f = r4
            r4.setMinValue(r3)
            int r3 = r0.f8865m
            int r3 = r3 - r2
            r4.setMaxValue(r3)
            java.lang.String[] r3 = r0.f8862j
            r4.setDisplayedValues(r3)
            r2 = 200(0xc8, double:9.9E-322)
            r4.setOnLongPressUpdateInterval(r2)
            r4.setOnValueChangedListener(r1)
            if (r11 != 0) goto L_0x00e1
            r4.setVisibility(r8)
        L_0x00e1:
            int r2 = p091o3.C2503e.f9761j
            android.view.View r2 = r0.findViewById(r2)
            miuix.pickerwidget.widget.NumberPicker r2 = (miuix.pickerwidget.widget.NumberPicker) r2
            r0.f8859g = r2
            r2.setOnLongPressUpdateInterval(r13)
            r2.setOnValueChangedListener(r1)
            if (r10 != 0) goto L_0x00f6
            r2.setVisibility(r8)
        L_0x00f6:
            r18.m9784t()
            r1 = 1
            if (r5 != 0) goto L_0x0100
            r0.setSpinnersShown(r1)
            goto L_0x0103
        L_0x0100:
            r0.setSpinnersShown(r5)
        L_0x0103:
            p3.a r2 = r0.f8869q
            long r3 = java.lang.System.currentTimeMillis()
            boolean r5 = r0.f8871s
            r2.mo9752R(r3, r5)
            p3.a r2 = r0.f8869q
            int r2 = r2.mo9768z(r1)
            p3.a r1 = r0.f8869q
            r3 = 5
            int r1 = r1.mo9768z(r3)
            p3.a r3 = r0.f8869q
            r4 = 9
            int r3 = r3.mo9768z(r4)
            r4 = 0
            r0.mo8812k(r2, r1, r3, r4)
            p3.a r1 = r0.f8866n
            boolean r2 = r0.f8871s
            r3 = 0
            r1.mo9752R(r3, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x014c
            p3.a r1 = r0.f8866n
            boolean r1 = r0.m9779o(r7, r1)
            if (r1 != 0) goto L_0x014a
            p3.a r8 = r0.f8866n
            r10 = 0
            r11 = 1
            r12 = 12
            r13 = 0
            r14 = 0
            r1 = 0
            r2 = r15
            r15 = r1
            goto L_0x0160
        L_0x014a:
            r2 = r15
            goto L_0x0163
        L_0x014c:
            r2 = r15
            p3.a r1 = r0.f8866n
            java.lang.String r5 = "1/31/1900"
            boolean r1 = r0.m9779o(r5, r1)
            if (r1 != 0) goto L_0x0163
            p3.a r8 = r0.f8866n
            r10 = 0
            r11 = 1
            r12 = 12
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0160:
            r8.mo9750P(r9, r10, r11, r12, r13, r14, r15)
        L_0x0163:
            p3.a r1 = r0.f8866n
            long r7 = r1.mo9745E()
            r0.setMinDate(r7)
            p3.a r1 = r0.f8866n
            boolean r5 = r0.f8871s
            r1.mo9752R(r3, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0181
            p3.a r1 = r0.f8866n
            boolean r1 = r0.m9779o(r2, r1)
            if (r1 != 0) goto L_0x0192
        L_0x0181:
            p3.a r10 = r0.f8866n
            r12 = 11
            r13 = 31
            r14 = 12
            r15 = 0
            r16 = 0
            r17 = 0
            r11 = r6
            r10.mo9750P(r11, r12, r13, r14, r15, r16, r17)
        L_0x0192:
            p3.a r1 = r0.f8866n
            long r1 = r1.mo9745E()
            r0.setMaxDate(r1)
            r18.m9780p()
            int r1 = r18.getImportantForAccessibility()
            if (r1 != 0) goto L_0x01a8
            r1 = 1
            r0.setImportantForAccessibility(r1)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.DatePicker.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: l */
    private void m9777l() {
        String[] strArr;
        if (f8852u == null) {
            f8852u = C2547b.m10861n(getContext()).mo9770c();
        }
        if (f8853v == null) {
            f8853v = C2547b.m10861n(getContext()).mo9773f();
            Resources resources = getContext().getResources();
            int i = 0;
            while (true) {
                strArr = f8853v;
                if (i >= strArr.length) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr2 = f8853v;
                sb.append(strArr2[i]);
                sb.append(resources.getString(C2506h.f9793a));
                strArr2[i] = sb.toString();
                i++;
            }
            f8854w = new String[(strArr.length + 1)];
        }
        if (f8855x == null) {
            f8855x = C2547b.m10861n(getContext()).mo9772e()[1];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m9778n() {
        sendAccessibilityEvent(4);
        C2315b bVar = this.f8861i;
        if (bVar != null) {
            bVar.mo8827a(this, getYear(), getMonth(), getDayOfMonth(), this.f8871s);
        }
    }

    /* renamed from: o */
    private boolean m9779o(String str, C2546a aVar) {
        try {
            aVar.mo9752R(this.f8864l.parse(str).getTime(), this.f8871s);
            return true;
        } catch (ParseException unused) {
            String str2 = f8851t;
            Log.w(str2, "Date: " + str + " not in format: " + "MM/dd/yyyy");
            return false;
        }
    }

    /* renamed from: p */
    private void m9780p() {
        NumberPicker numberPicker;
        this.f8856d.removeAllViews();
        char[] cArr = this.f8863k;
        if (cArr == null) {
            cArr = android.text.format.DateFormat.getDateFormatOrder(getContext());
        }
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            char c = cArr[i];
            if (c == 'M') {
                this.f8856d.addView(this.f8858f);
                numberPicker = this.f8858f;
            } else if (c == 'd') {
                this.f8856d.addView(this.f8857e);
                numberPicker = this.f8857e;
            } else if (c == 'y') {
                this.f8856d.addView(this.f8859g);
                numberPicker = this.f8859g;
            } else {
                throw new IllegalArgumentException();
            }
            m9783s(numberPicker, length, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m9781q() {
        int i = 0;
        if (this.f8871s) {
            int C = this.f8869q.mo9744C();
            if (C < 0) {
                this.f8862j = f8853v;
                return;
            }
            String[] strArr = f8854w;
            this.f8862j = strArr;
            int i2 = C + 1;
            System.arraycopy(f8853v, 0, strArr, 0, i2);
            String[] strArr2 = f8853v;
            System.arraycopy(strArr2, C, this.f8862j, i2, strArr2.length - C);
            String[] strArr3 = this.f8862j;
            strArr3[i2] = f8855x + this.f8862j[i2];
        } else if ("en".equals(this.f8860h.getLanguage().toLowerCase())) {
            this.f8862j = C2547b.m10861n(getContext()).mo9781o();
        } else {
            this.f8862j = new String[12];
            while (true) {
                String[] strArr4 = this.f8862j;
                if (i < strArr4.length) {
                    int i3 = i + 1;
                    strArr4[i] = NumberPicker.f8899G0.mo8912a(i3);
                    i = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m9782r(int i, int i2, int i3) {
        C2546a aVar;
        C2546a aVar2;
        this.f8869q.mo9750P(i, i2, i3, 12, 0, 0, 0);
        if (this.f8869q.mo9760g(this.f8867o)) {
            aVar = this.f8869q;
            aVar2 = this.f8867o;
        } else if (this.f8869q.mo9756b(this.f8868p)) {
            aVar = this.f8869q;
            aVar2 = this.f8868p;
        } else {
            return;
        }
        aVar.mo9752R(aVar2.mo9745E(), this.f8871s);
    }

    /* renamed from: s */
    private void m9783s(NumberPicker numberPicker, int i, int i2) {
        ((TextView) numberPicker.findViewById(C2503e.f9757f)).setImeOptions(i2 < i + -1 ? 5 : 6);
    }

    private void setCurrentLocale(Locale locale) {
        if (!locale.equals(this.f8860h)) {
            this.f8860h = locale;
            this.f8865m = this.f8866n.mo9742A(5) + 1;
            m9781q();
            m9784t();
        }
    }

    /* renamed from: t */
    private void m9784t() {
        NumberPicker numberPicker = this.f8857e;
        if (numberPicker != null && this.f8859g != null) {
            numberPicker.setFormatter(NumberPicker.f8899G0);
            this.f8859g.setFormatter(new NumberPicker.C2332h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m9785u() {
        int i;
        NumberPicker numberPicker;
        if (this.f8871s) {
            this.f8857e.setLabel((String) null);
            this.f8858f.setLabel((String) null);
            this.f8859g.setLabel((String) null);
        } else {
            this.f8857e.setLabel(getContext().getString(C2506h.f9795b));
            this.f8858f.setLabel(getContext().getString(C2506h.f9797c));
            this.f8859g.setLabel(getContext().getString(C2506h.f9799d));
        }
        this.f8857e.setDisplayedValues((String[]) null);
        this.f8857e.setMinValue(1);
        this.f8857e.setMaxValue(this.f8871s ? this.f8869q.mo9742A(10) : this.f8869q.mo9742A(9));
        this.f8857e.setWrapSelectorWheel(true);
        this.f8858f.setDisplayedValues((String[]) null);
        boolean z = false;
        this.f8858f.setMinValue(0);
        NumberPicker numberPicker2 = this.f8858f;
        int i2 = 11;
        if (this.f8871s && this.f8869q.mo9744C() >= 0) {
            i2 = 12;
        }
        numberPicker2.setMaxValue(i2);
        this.f8858f.setWrapSelectorWheel(true);
        int i3 = this.f8871s ? 2 : 1;
        if (this.f8869q.mo9768z(i3) == this.f8867o.mo9768z(i3)) {
            this.f8858f.setMinValue(this.f8871s ? this.f8867o.mo9768z(6) : this.f8867o.mo9768z(5));
            this.f8858f.setWrapSelectorWheel(false);
            int i4 = this.f8871s ? 6 : 5;
            if (this.f8869q.mo9768z(i4) == this.f8867o.mo9768z(i4)) {
                this.f8857e.setMinValue(this.f8871s ? this.f8867o.mo9768z(10) : this.f8867o.mo9768z(9));
                this.f8857e.setWrapSelectorWheel(false);
            }
        }
        if (this.f8869q.mo9768z(i3) == this.f8868p.mo9768z(i3)) {
            this.f8858f.setMaxValue(this.f8871s ? this.f8867o.mo9768z(6) : this.f8868p.mo9768z(5));
            this.f8858f.setWrapSelectorWheel(false);
            this.f8858f.setDisplayedValues((String[]) null);
            int i5 = this.f8871s ? 6 : 5;
            if (this.f8869q.mo9768z(i5) == this.f8868p.mo9768z(i5)) {
                this.f8857e.setMaxValue(this.f8871s ? this.f8868p.mo9768z(10) : this.f8868p.mo9768z(9));
                this.f8857e.setWrapSelectorWheel(false);
            }
        }
        this.f8858f.setDisplayedValues((String[]) Arrays.copyOfRange(this.f8862j, this.f8858f.getMinValue(), this.f8862j.length));
        if (this.f8871s) {
            this.f8857e.setDisplayedValues((String[]) Arrays.copyOfRange(f8852u, this.f8857e.getMinValue() - 1, f8852u.length));
        }
        int i6 = mo8813m() ? 2 : 1;
        this.f8859g.setMinValue(this.f8867o.mo9768z(i6));
        this.f8859g.setMaxValue(this.f8868p.mo9768z(i6));
        this.f8859g.setWrapSelectorWheel(false);
        if (this.f8871s) {
            int C = this.f8869q.mo9744C();
            if (C >= 0 && (this.f8869q.mo9746F() || this.f8869q.mo9768z(6) > C)) {
                z = true;
            }
            this.f8859g.setValue(this.f8869q.mo9768z(2));
            NumberPicker numberPicker3 = this.f8858f;
            int z2 = this.f8869q.mo9768z(6);
            if (z) {
                z2++;
            }
            numberPicker3.setValue(z2);
            numberPicker = this.f8857e;
            i = this.f8869q.mo9768z(10);
        } else {
            this.f8859g.setValue(this.f8869q.mo9768z(1));
            this.f8858f.setValue(this.f8869q.mo9768z(5));
            numberPicker = this.f8857e;
            i = this.f8869q.mo9768z(9);
        }
        numberPicker.setValue(i);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public int getDayOfMonth() {
        return this.f8869q.mo9768z(this.f8871s ? 10 : 9);
    }

    public long getMaxDate() {
        return this.f8868p.mo9745E();
    }

    public long getMinDate() {
        return this.f8867o.mo9745E();
    }

    public int getMonth() {
        int i;
        C2546a aVar;
        if (this.f8871s) {
            i = 6;
            if (this.f8869q.mo9746F()) {
                return this.f8869q.mo9768z(6) + 12;
            }
            aVar = this.f8869q;
        } else {
            aVar = this.f8869q;
            i = 5;
        }
        return aVar.mo9768z(i);
    }

    public boolean getSpinnersShown() {
        return this.f8856d.isShown();
    }

    public int getYear() {
        return this.f8869q.mo9768z(this.f8871s ? 2 : 1);
    }

    public boolean isEnabled() {
        return this.f8870r;
    }

    /* renamed from: k */
    public void mo8812k(int i, int i2, int i3, C2315b bVar) {
        m9782r(i, i2, i3);
        m9785u();
        this.f8861i = bVar;
    }

    /* renamed from: m */
    public boolean mo8813m() {
        return this.f8871s;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DatePicker.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DatePicker.class.getName());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(C2549c.m10885a(getContext(), this.f8869q.mo9745E(), 896));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C2316c cVar = (C2316c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        m9782r(cVar.f8873d, cVar.f8874e, cVar.f8875f);
        this.f8871s = cVar.f8876g;
        m9785u();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new C2316c(super.onSaveInstanceState(), this.f8869q.mo9768z(1), this.f8869q.mo9768z(5), this.f8869q.mo9768z(9), this.f8871s, (C2314a) null);
    }

    public void setDateFormatOrder(char[] cArr) {
        this.f8863k = cArr;
        m9780p();
    }

    public void setEnabled(boolean z) {
        if (this.f8870r != z) {
            super.setEnabled(z);
            this.f8857e.setEnabled(z);
            this.f8858f.setEnabled(z);
            this.f8859g.setEnabled(z);
            this.f8870r = z;
        }
    }

    public void setLunarMode(boolean z) {
        if (z != this.f8871s) {
            this.f8871s = z;
            m9781q();
            m9785u();
        }
    }

    public void setMaxDate(long j) {
        this.f8866n.mo9752R(j, this.f8871s);
        if (this.f8866n.mo9768z(1) != this.f8868p.mo9768z(1) || this.f8866n.mo9768z(12) == this.f8868p.mo9768z(12)) {
            this.f8868p.mo9752R(j, this.f8871s);
            if (this.f8869q.mo9756b(this.f8868p)) {
                this.f8869q.mo9752R(this.f8868p.mo9745E(), this.f8871s);
            }
            m9785u();
        }
    }

    public void setMinDate(long j) {
        this.f8866n.mo9752R(j, this.f8871s);
        if (this.f8866n.mo9768z(1) != this.f8867o.mo9768z(1) || this.f8866n.mo9768z(12) == this.f8867o.mo9768z(12)) {
            this.f8867o.mo9752R(j, this.f8871s);
            if (this.f8869q.mo9760g(this.f8867o)) {
                this.f8869q.mo9752R(this.f8867o.mo9745E(), this.f8871s);
            }
            m9785u();
        }
    }

    public void setSpinnersShown(boolean z) {
        this.f8856d.setVisibility(z ? 0 : 8);
    }
}
