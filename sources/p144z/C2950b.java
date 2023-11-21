package p144z;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0881n;

/* renamed from: z.b */
final class C2950b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f11173a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f11174b;

    /* renamed from: c */
    private static Class<?> f11175c;

    @SuppressLint({"PrivateApi"})
    private C2950b() {
        try {
            f11175c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2950b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f11174b == null) {
            synchronized (f11173a) {
                if (f11174b == null) {
                    f11174b = new C2950b();
                }
            }
        }
        return f11174b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f11175c;
        return cls != null ? C0881n.m3491c(cls, charSequence) : super.newEditable(charSequence);
    }
}
