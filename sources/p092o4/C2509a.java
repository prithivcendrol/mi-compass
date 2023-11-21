package p092o4;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p117t2.C2710j;

/* renamed from: o4.a */
public class C2509a {

    /* renamed from: b */
    private static final C2710j<C2509a> f9909b = new C2510a();

    /* renamed from: a */
    private InputMethodManager f9910a;

    /* renamed from: o4.a$a */
    class C2510a extends C2710j<C2509a> {
        C2510a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C2509a mo9671a(Object obj) {
            return new C2509a((Context) obj, (C2510a) null);
        }
    }

    private C2509a(Context context) {
        this.f9910a = (InputMethodManager) context.getApplicationContext().getSystemService("input_method");
    }

    /* synthetic */ C2509a(Context context, C2510a aVar) {
        this(context);
    }

    /* renamed from: a */
    public static C2509a m10663a(Context context) {
        return f9909b.mo9957b(context);
    }

    /* renamed from: b */
    public void mo9669b(EditText editText) {
        this.f9910a.hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
    }

    /* renamed from: c */
    public void mo9670c(EditText editText) {
        editText.requestFocus();
        this.f9910a.viewClicked(editText);
        this.f9910a.showSoftInput(editText, 0);
    }
}
