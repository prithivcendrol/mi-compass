package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.d1 */
public class C0317d1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1258c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0317d1>> f1259d;

    /* renamed from: a */
    private final Resources f1260a;

    /* renamed from: b */
    private final Resources.Theme f1261b;

    private C0317d1(Context context) {
        super(context);
        if (C0382q1.m1719c()) {
            C0382q1 q1Var = new C0382q1(this, context.getResources());
            this.f1260a = q1Var;
            Resources.Theme newTheme = q1Var.newTheme();
            this.f1261b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1260a = new C0323f1(this, context.getResources());
        this.f1261b = null;
    }

    /* renamed from: a */
    private static boolean m1422a(Context context) {
        return !(context instanceof C0317d1) && !(context.getResources() instanceof C0323f1) && !(context.getResources() instanceof C0382q1) && C0382q1.m1719c();
    }

    /* renamed from: b */
    public static Context m1423b(Context context) {
        if (!m1422a(context)) {
            return context;
        }
        synchronized (f1258c) {
            ArrayList<WeakReference<C0317d1>> arrayList = f1259d;
            if (arrayList == null) {
                f1259d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1259d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1259d.remove(size);
                    }
                }
                for (int size2 = f1259d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1259d.get(size2);
                    C0317d1 d1Var = weakReference2 != null ? (C0317d1) weakReference2.get() : null;
                    if (d1Var != null && d1Var.getBaseContext() == context) {
                        return d1Var;
                    }
                }
            }
            C0317d1 d1Var2 = new C0317d1(context);
            f1259d.add(new WeakReference(d1Var2));
            return d1Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1260a.getAssets();
    }

    public Resources getResources() {
        return this.f1260a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1261b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1261b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
