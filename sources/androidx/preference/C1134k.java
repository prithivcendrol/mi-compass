package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.C0510a;

/* renamed from: androidx.preference.k */
public class C1134k {

    /* renamed from: a */
    private final Context f3709a;

    /* renamed from: b */
    private long f3710b = 0;

    /* renamed from: c */
    private SharedPreferences f3711c;

    /* renamed from: d */
    private SharedPreferences.Editor f3712d;

    /* renamed from: e */
    private boolean f3713e;

    /* renamed from: f */
    private String f3714f;

    /* renamed from: g */
    private int f3715g;

    /* renamed from: h */
    private int f3716h = 0;

    /* renamed from: i */
    private PreferenceScreen f3717i;

    /* renamed from: j */
    private C1137c f3718j;

    /* renamed from: k */
    private C1135a f3719k;

    /* renamed from: l */
    private C1136b f3720l;

    /* renamed from: androidx.preference.k$a */
    public interface C1135a {
        /* renamed from: j */
        void mo4074j(Preference preference);
    }

    /* renamed from: androidx.preference.k$b */
    public interface C1136b {
        /* renamed from: l */
        void mo4077l(PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.k$c */
    public interface C1137c {
        /* renamed from: n */
        boolean mo4078n(Preference preference);
    }

    /* renamed from: androidx.preference.k$d */
    public static abstract class C1138d {
    }

    public C1134k(Context context) {
        this.f3709a = context;
        mo4126q(m4649b(context));
    }

    /* renamed from: b */
    private static String m4649b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* renamed from: l */
    private void m4650l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f3712d) != null) {
            editor.apply();
        }
        this.f3713e = z;
    }

    /* renamed from: a */
    public <T extends Preference> T mo4112a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f3717i;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.mo3997I0(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SharedPreferences.Editor mo4113c() {
        if (!this.f3713e) {
            return mo4120j().edit();
        }
        if (this.f3712d == null) {
            this.f3712d = mo4120j().edit();
        }
        return this.f3712d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo4114d() {
        long j;
        synchronized (this) {
            j = this.f3710b;
            this.f3710b = 1 + j;
        }
        return j;
    }

    /* renamed from: e */
    public C1136b mo4115e() {
        return this.f3720l;
    }

    /* renamed from: f */
    public C1137c mo4116f() {
        return this.f3718j;
    }

    /* renamed from: g */
    public C1138d mo4117g() {
        return null;
    }

    /* renamed from: h */
    public C1118e mo4118h() {
        return null;
    }

    /* renamed from: i */
    public PreferenceScreen mo4119i() {
        return this.f3717i;
    }

    /* renamed from: j */
    public SharedPreferences mo4120j() {
        mo4118h();
        if (this.f3711c == null) {
            this.f3711c = (this.f3716h != 1 ? this.f3709a : C0510a.m2121b(this.f3709a)).getSharedPreferences(this.f3714f, this.f3715g);
        }
        return this.f3711c;
    }

    /* renamed from: k */
    public PreferenceScreen mo4121k(Context context, int i, PreferenceScreen preferenceScreen) {
        m4650l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new C1133j(context, this).mo4108d(i, preferenceScreen);
        preferenceScreen2.mo3930Q(this);
        m4650l(false);
        return preferenceScreen2;
    }

    /* renamed from: m */
    public void mo4122m(C1135a aVar) {
        this.f3719k = aVar;
    }

    /* renamed from: n */
    public void mo4123n(C1136b bVar) {
        this.f3720l = bVar;
    }

    /* renamed from: o */
    public void mo4124o(C1137c cVar) {
        this.f3718j = cVar;
    }

    /* renamed from: p */
    public boolean mo4125p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f3717i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.mo3933V();
        }
        this.f3717i = preferenceScreen;
        return true;
    }

    /* renamed from: q */
    public void mo4126q(String str) {
        this.f3714f = str;
        this.f3711c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4127r() {
        return !this.f3713e;
    }

    /* renamed from: s */
    public void mo4128s(Preference preference) {
        C1135a aVar = this.f3719k;
        if (aVar != null) {
            aVar.mo4074j(preference);
        }
    }
}
