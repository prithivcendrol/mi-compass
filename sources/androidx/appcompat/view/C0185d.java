package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p021d.C1455i;

/* renamed from: androidx.appcompat.view.d */
public class C0185d extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f563f;

    /* renamed from: a */
    private int f564a;

    /* renamed from: b */
    private Resources.Theme f565b;

    /* renamed from: c */
    private LayoutInflater f566c;

    /* renamed from: d */
    private Configuration f567d;

    /* renamed from: e */
    private Resources f568e;

    /* renamed from: androidx.appcompat.view.d$a */
    static class C0186a {
        /* renamed from: a */
        static Context m731a(C0185d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public C0185d() {
        super((Context) null);
    }

    public C0185d(Context context, int i) {
        super(context);
        this.f564a = i;
    }

    public C0185d(Context context, Resources.Theme theme) {
        super(context);
        this.f565b = theme;
    }

    /* renamed from: b */
    private Resources m725b() {
        if (this.f568e == null) {
            Configuration configuration = this.f567d;
            this.f568e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && m727e(configuration))) ? super.getResources() : C0186a.m731a(this, this.f567d).getResources();
        }
        return this.f568e;
    }

    /* renamed from: d */
    private void m726d() {
        boolean z = this.f565b == null;
        if (z) {
            this.f565b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f565b.setTo(theme);
            }
        }
        mo643f(this.f565b, this.f564a, z);
    }

    /* renamed from: e */
    private static boolean m727e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f563f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f563f = configuration2;
        }
        return configuration.equals(f563f);
    }

    /* renamed from: a */
    public void mo640a(Configuration configuration) {
        if (this.f568e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f567d == null) {
            this.f567d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo642c() {
        return this.f564a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo643f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m725b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f566c == null) {
            this.f566c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f566c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f565b;
        if (theme != null) {
            return theme;
        }
        if (this.f564a == 0) {
            this.f564a = C1455i.f5849d;
        }
        m726d();
        return this.f565b;
    }

    public void setTheme(int i) {
        if (this.f564a != i) {
            this.f564a = i;
            m726d();
        }
    }
}
