package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.res.C0540j;
import androidx.preference.C1141m;
import androidx.preference.Preference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import miuix.appcompat.widget.Spinner;
import p024d2.C1497a;
import p054i2.C1643a;
import p123u3.C2850k;
import p123u3.C2853n;
import p123u3.C2856q;

public class DropDownPreference extends Preference {

    /* renamed from: c0 */
    private static final Class<?>[] f9105c0 = {Context.class, AttributeSet.class};

    /* renamed from: d0 */
    private static final CharSequence[] f9106d0 = new CharSequence[0];
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ArrayAdapter f9107S;

    /* renamed from: T */
    private ArrayAdapter f9108T;

    /* renamed from: U */
    private String f9109U;

    /* renamed from: V */
    private boolean f9110V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public Spinner f9111W;

    /* renamed from: X */
    private CharSequence[] f9112X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public CharSequence[] f9113Y;

    /* renamed from: Z */
    private Drawable[] f9114Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Handler f9115a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final AdapterView.OnItemSelectedListener f9116b0;

    /* renamed from: miuix.preference.DropDownPreference$a */
    class C2355a implements AdapterView.OnItemSelectedListener {

        /* renamed from: miuix.preference.DropDownPreference$a$a */
        class C2356a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ String f9118d;

            C2356a(String str) {
                this.f9118d = str;
            }

            public void run() {
                if (!this.f9118d.equals(DropDownPreference.this.mo9007P0()) && DropDownPreference.this.mo3938b(this.f9118d)) {
                    DropDownPreference.this.mo9008R0(this.f9118d);
                }
            }
        }

        C2355a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= DropDownPreference.this.f9113Y.length) {
                Log.d("DropDownPreference", "Illegal Position In Entry Values' Array. ");
            } else {
                DropDownPreference.this.f9115a0.post(new C2356a((String) DropDownPreference.this.f9113Y[i]));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$b */
    class C2357b implements Runnable {
        C2357b() {
        }

        public void run() {
            DropDownPreference.this.f9107S.notifyDataSetChanged();
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$c */
    class C2358c implements Runnable {
        C2358c() {
        }

        public void run() {
            DropDownPreference.this.f9111W.setOnItemSelectedListener(DropDownPreference.this.f9116b0);
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$d */
    class C2359d implements Spinner.C2267g {

        /* renamed from: a */
        final /* synthetic */ C1141m f9122a;

        C2359d(C1141m mVar) {
            this.f9122a = mVar;
        }

        /* renamed from: a */
        public void mo8598a() {
            this.f9122a.f4049a.setSelected(false);
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$e */
    class C2360e implements View.OnTouchListener {

        /* renamed from: d */
        final /* synthetic */ C1141m f9124d;

        C2360e(C1141m mVar) {
            this.f9124d = mVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                DropDownPreference.this.f9111W.setFenceXFromView(view);
                DropDownPreference.this.f9111W.mo8538n(rawX, rawY);
                this.f9124d.f4049a.setSelected(true);
                TextView textView = (TextView) this.f9124d.f4049a.findViewById(16908310);
                if (textView != null) {
                    textView.setSelected(false);
                }
                TextView textView2 = (TextView) this.f9124d.f4049a.findViewById(16908304);
                if (textView2 != null) {
                    textView2.setSelected(false);
                }
            }
            return false;
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$f */
    private static class C2361f extends C1497a {

        /* renamed from: i */
        private CharSequence[] f9126i;

        C2361f(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, 0);
            int[] iArr;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10808P, i, i2);
            this.f6114d = C0540j.m2233h(obtainStyledAttributes, C2856q.f10814R, 0);
            this.f9126i = C0540j.m2233h(obtainStyledAttributes, C2856q.f10823U, 0);
            this.f6115e = C0540j.m2233h(obtainStyledAttributes, C2856q.f10820T, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C2856q.f10817S, -1);
            obtainStyledAttributes.recycle();
            if (resourceId > 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                iArr = new int[obtainTypedArray.length()];
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    iArr[i3] = obtainTypedArray.getResourceId(i3, 0);
                }
                obtainTypedArray.recycle();
            } else {
                iArr = null;
            }
            mo5571f(iArr);
        }

        /* renamed from: h */
        public CharSequence[] mo9015h() {
            return this.f9126i;
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$g */
    private static class C2362g implements C1643a.C1645b {

        /* renamed from: a */
        private DropDownPreference f9127a;

        /* renamed from: b */
        private ArrayAdapter f9128b;

        public C2362g(DropDownPreference dropDownPreference, ArrayAdapter arrayAdapter) {
            this.f9127a = dropDownPreference;
            this.f9128b = arrayAdapter;
        }

        /* renamed from: a */
        public boolean mo5823a(int i) {
            if (i < this.f9127a.f9113Y.length && i >= 0) {
                return TextUtils.equals(this.f9127a.mo9007P0(), this.f9127a.f9113Y[i]);
            }
            Log.e("DropDownPreference", "pos out of entries' length.");
            return false;
        }
    }

    /* renamed from: miuix.preference.DropDownPreference$h */
    private static class C2363h extends Preference.C1092b {
        public static final Parcelable.Creator<C2363h> CREATOR = new C2364a();

        /* renamed from: d */
        String f9129d;

        /* renamed from: miuix.preference.DropDownPreference$h$a */
        class C2364a implements Parcelable.Creator<C2363h> {
            C2364a() {
            }

            /* renamed from: a */
            public C2363h createFromParcel(Parcel parcel) {
                return new C2363h(parcel);
            }

            /* renamed from: b */
            public C2363h[] newArray(int i) {
                return new C2363h[i];
            }
        }

        C2363h(Parcel parcel) {
            super(parcel);
            this.f9129d = parcel.readString();
        }

        C2363h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f9129d);
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10720c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9115a0 = new Handler();
        this.f9116b0 = new C2355a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10808P, i, i2);
        String string = obtainStyledAttributes.getString(C2856q.f10811Q);
        obtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f9108T = m9971Q0(context, attributeSet, string);
        } else {
            this.f9108T = new C2361f(context, attributeSet, i, i2);
        }
        this.f9107S = mo9006M0();
        m9968L0();
    }

    /* renamed from: L0 */
    private void m9968L0() {
        ArrayAdapter arrayAdapter = this.f9108T;
        if (arrayAdapter instanceof C2361f) {
            this.f9112X = ((C2361f) arrayAdapter).mo5569a();
            this.f9113Y = ((C2361f) this.f9108T).mo9015h();
            this.f9114Z = ((C2361f) this.f9108T).mo5570c();
            return;
        }
        int count = arrayAdapter.getCount();
        this.f9112X = new CharSequence[this.f9108T.getCount()];
        for (int i = 0; i < count; i++) {
            this.f9112X[i] = this.f9108T.getItem(i).toString();
        }
        this.f9113Y = this.f9112X;
        this.f9114Z = null;
    }

    /* renamed from: N0 */
    private void m9969N0(Spinner spinner) {
        spinner.setClickable(false);
        spinner.setLongClickable(false);
        spinner.setContextClickable(false);
    }

    /* renamed from: O0 */
    private int m9970O0(String str) {
        if (this.f9113Y == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f9113Y;
            if (i >= charSequenceArr.length) {
                return -1;
            }
            if (TextUtils.equals(charSequenceArr[i], str)) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: Q0 */
    private ArrayAdapter m9971Q0(Context context, AttributeSet attributeSet, String str) {
        try {
            Constructor<? extends U> constructor = context.getClassLoader().loadClass(str).asSubclass(ArrayAdapter.class).getConstructor(f9105c0);
            Object[] objArr = {context, attributeSet};
            constructor.setAccessible(true);
            return (ArrayAdapter) constructor.newInstance(objArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Error creating Adapter " + str, e);
        } catch (InstantiationException | InvocationTargetException e2) {
            throw new IllegalStateException("Could not instantiate the Adapter: " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Can't find Adapter: " + str, e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo3872M() {
        super.mo3872M();
        if (this.f9107S != null) {
            this.f9115a0.post(new C2357b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public ArrayAdapter mo9006M0() {
        Context i = mo3949i();
        ArrayAdapter arrayAdapter = this.f9108T;
        return new C1643a(i, arrayAdapter, new C2362g(this, arrayAdapter));
    }

    /* renamed from: P0 */
    public String mo9007P0() {
        return this.f9109U;
    }

    /* renamed from: R0 */
    public void mo9008R0(String str) {
        boolean z = !TextUtils.equals(this.f9109U, str);
        if (z || !this.f9110V) {
            this.f9109U = str;
            this.f9110V = true;
            mo3950i0(str);
            if (z) {
                mo3872M();
            }
        }
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        if (this.f9107S.getCount() > 0) {
            Spinner spinner = (Spinner) mVar.f4049a.findViewById(C2853n.f10753j);
            this.f9111W = spinner;
            spinner.setImportantForAccessibility(2);
            m9969N0(this.f9111W);
            this.f9111W.setAdapter((SpinnerAdapter) this.f9107S);
            this.f9111W.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            this.f9111W.setSelection(m9970O0(mo9007P0()));
            this.f9111W.post(new C2358c());
            this.f9111W.setOnSpinnerDismissListener(new C2359d(mVar));
            mVar.f4049a.setOnTouchListener(new C2360e(mVar));
        }
        super.mo3861S(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public Object mo3880W(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo3881a0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C2363h.class)) {
            super.mo3881a0(parcelable);
            return;
        }
        C2363h hVar = (C2363h) parcelable;
        super.mo3881a0(hVar.getSuperState());
        mo9008R0(hVar.f9129d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Parcelable mo3882b0() {
        Parcelable b0 = super.mo3882b0();
        if (mo3924J()) {
            return b0;
        }
        C2363h hVar = new C2363h(b0);
        hVar.f9129d = mo9007P0();
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo3883c0(Object obj) {
        mo9008R0(mo3977x((String) obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3862f0(View view) {
        Spinner spinner = this.f9111W;
        if (spinner != null) {
            spinner.performClick();
            Log.d("DropDownPreference", "trigger from perform click");
        }
    }
}
