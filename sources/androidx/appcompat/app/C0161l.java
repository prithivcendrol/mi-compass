package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0185d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0309d;
import androidx.appcompat.widget.C0317d1;
import androidx.appcompat.widget.C0325g0;
import androidx.appcompat.widget.C0331i;
import androidx.appcompat.widget.C0355m;
import androidx.appcompat.widget.C0363o;
import androidx.appcompat.widget.C0383r;
import androidx.appcompat.widget.C0390t;
import androidx.appcompat.widget.C0398v;
import androidx.core.view.C0727l0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p021d.C1456j;
import p063k.C1774g;

/* renamed from: androidx.appcompat.app.l */
public class C0161l {

    /* renamed from: b */
    private static final Class<?>[] f483b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f484c = {16843375};

    /* renamed from: d */
    private static final int[] f485d = {16844160};

    /* renamed from: e */
    private static final int[] f486e = {16844156};

    /* renamed from: f */
    private static final int[] f487f = {16844148};

    /* renamed from: g */
    private static final String[] f488g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final C1774g<String, Constructor<? extends View>> f489h = new C1774g<>();

    /* renamed from: a */
    private final Object[] f490a = new Object[2];

    /* renamed from: androidx.appcompat.app.l$a */
    private static class C0162a implements View.OnClickListener {

        /* renamed from: d */
        private final View f491d;

        /* renamed from: e */
        private final String f492e;

        /* renamed from: f */
        private Method f493f;

        /* renamed from: g */
        private Context f494g;

        public C0162a(View view, String str) {
            this.f491d = view;
            this.f492e = str;
        }

        /* renamed from: a */
        private void m615a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f492e, new Class[]{View.class})) != null) {
                        this.f493f = method;
                        this.f494g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f491d.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f491d.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f492e + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f491d.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f493f == null) {
                m615a(this.f491d.getContext());
            }
            try {
                this.f493f.invoke(this.f494g, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m593a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f485d);
            if (obtainStyledAttributes.hasValue(0)) {
                C0727l0.m2876Z(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f486e);
            if (obtainStyledAttributes2.hasValue(0)) {
                C0727l0.m2878a0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f487f);
            if (obtainStyledAttributes3.hasValue(0)) {
                C0727l0.m2902m0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    private void m594b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0727l0.m2855E(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f484c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0162a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m595s(Context context, String str, String str2) {
        String str3;
        C1774g<String, Constructor<? extends View>> gVar = f489h;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f483b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f490a);
    }

    /* renamed from: t */
    private View m596t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f490a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f488g;
                    if (i < strArr.length) {
                        View s = m595s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f490a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = m595s(context, str, (String) null);
                Object[] objArr3 = this.f490a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f490a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m597u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f5889H3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C1456j.f5894I3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C1456j.f5899J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0185d) || ((C0185d) context).mo642c() != resourceId) ? new C0185d(context, resourceId) : context : context;
    }

    /* renamed from: v */
    private void m598v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0309d mo571c(Context context, AttributeSet attributeSet) {
        return new C0309d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatButton mo572d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatCheckBox mo573e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatCheckedTextView mo574f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0331i mo575g(Context context, AttributeSet attributeSet) {
        return new C0331i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0355m mo576h(Context context, AttributeSet attributeSet) {
        return new C0355m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatImageView mo577i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0363o mo578j(Context context, AttributeSet attributeSet) {
        return new C0363o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatRadioButton mo579k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0383r mo580l(Context context, AttributeSet attributeSet) {
        return new C0383r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0390t mo581m(Context context, AttributeSet attributeSet) {
        return new C0390t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0398v mo582n(Context context, AttributeSet attributeSet) {
        return new C0398v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatTextView mo583o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0325g0 mo584p(Context context, AttributeSet attributeSet) {
        return new C0325g0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public View mo585q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View mo586r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m597u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0317d1.m1423b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo580l(context2, attributeSet);
                break;
            case 1:
                view2 = mo574f(context2, attributeSet);
                break;
            case 2:
                view2 = mo578j(context2, attributeSet);
                break;
            case 3:
                view2 = mo583o(context2, attributeSet);
                break;
            case 4:
                view2 = mo576h(context2, attributeSet);
                break;
            case 5:
                view2 = mo581m(context2, attributeSet);
                break;
            case 6:
                view2 = mo582n(context2, attributeSet);
                break;
            case 7:
                view2 = mo579k(context2, attributeSet);
                break;
            case 8:
                view2 = mo584p(context2, attributeSet);
                break;
            case 9:
                view2 = mo577i(context2, attributeSet);
                break;
            case 10:
                view2 = mo571c(context2, attributeSet);
                break;
            case 11:
                view2 = mo573e(context2, attributeSet);
                break;
            case 12:
                view2 = mo575g(context2, attributeSet);
                break;
            case 13:
                view2 = mo572d(context2, attributeSet);
                break;
            default:
                view2 = mo585q(context2, str, attributeSet);
                break;
        }
        m598v(view2, str);
        if (view2 == null && context != context2) {
            view2 = m596t(context2, str, attributeSet);
        }
        if (view2 != null) {
            m594b(view2, attributeSet);
            m593a(context2, view2, attributeSet);
        }
        return view2;
    }
}
