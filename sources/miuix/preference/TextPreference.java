package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.C1141m;
import androidx.preference.Preference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p123u3.C2850k;
import p123u3.C2853n;
import p123u3.C2855p;
import p123u3.C2856q;

public class TextPreference extends Preference {

    /* renamed from: S */
    private CharSequence f9179S;

    /* renamed from: T */
    private int f9180T;

    /* renamed from: U */
    private C2375a f9181U;

    /* renamed from: miuix.preference.TextPreference$a */
    public interface C2375a<T extends TextPreference> {
        /* renamed from: a */
        CharSequence mo9051a(T t);
    }

    public TextPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10736s);
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C2855p.f10762a);
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10825U1, i, i2);
        CharSequence text = obtainStyledAttributes.getText(C2856q.f10828V1);
        String string = obtainStyledAttributes.getString(C2856q.f10831W1);
        obtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(text)) {
            mo9049K0(text.toString());
        }
        mo9050L0(m10050G0(context, string));
    }

    /* renamed from: G0 */
    private C2375a m10050G0(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Constructor<? extends U> constructor = context.getClassLoader().loadClass(str).asSubclass(C2375a.class).getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return (C2375a) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Can't find provider: " + str, e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Error creating TextProvider " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e5);
        }
    }

    /* renamed from: H0 */
    public CharSequence mo9046H0() {
        return mo9047I0() != null ? mo9047I0().mo9051a(this) : this.f9179S;
    }

    /* renamed from: I0 */
    public final C2375a mo9047I0() {
        return this.f9181U;
    }

    /* renamed from: J0 */
    public void mo9048J0(int i) {
        mo9049K0(mo3949i().getString(i));
        this.f9180T = i;
    }

    /* renamed from: K0 */
    public void mo9049K0(String str) {
        if (mo9047I0() != null) {
            throw new IllegalStateException("Preference already has a TextProvider set.");
        } else if (!TextUtils.equals(str, this.f9179S)) {
            this.f9180T = 0;
            this.f9179S = str;
            mo3872M();
        }
    }

    /* renamed from: L0 */
    public final void mo9050L0(C2375a aVar) {
        this.f9181U = aVar;
        mo3872M();
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        int i;
        super.mo3861S(mVar);
        TextView textView = (TextView) mVar.f4049a.findViewById(C2853n.f10755l);
        if (textView != null) {
            CharSequence H0 = mo9046H0();
            if (!TextUtils.isEmpty(H0)) {
                textView.setText(H0);
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }
}
