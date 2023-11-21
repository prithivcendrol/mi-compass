package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.C0623f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p063k.C1768b;

/* renamed from: androidx.emoji2.text.e */
public class C0854e {

    /* renamed from: n */
    private static final Object f2904n = new Object();

    /* renamed from: o */
    private static final Object f2905o = new Object();

    /* renamed from: p */
    private static volatile C0854e f2906p;

    /* renamed from: a */
    private final ReadWriteLock f2907a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C0860e> f2908b;

    /* renamed from: c */
    private volatile int f2909c = 3;

    /* renamed from: d */
    private final Handler f2910d;

    /* renamed from: e */
    private final C0857b f2911e;

    /* renamed from: f */
    final C0862g f2912f;

    /* renamed from: g */
    final boolean f2913g;

    /* renamed from: h */
    final boolean f2914h;

    /* renamed from: i */
    final int[] f2915i;

    /* renamed from: j */
    private final boolean f2916j;

    /* renamed from: k */
    private final int f2917k;

    /* renamed from: l */
    private final int f2918l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C0859d f2919m;

    /* renamed from: androidx.emoji2.text.e$a */
    private static final class C0855a extends C0857b {

        /* renamed from: b */
        private volatile C0867h f2920b;

        /* renamed from: c */
        private volatile C0879m f2921c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        class C0856a extends C0863h {
            C0856a() {
            }

            /* renamed from: a */
            public void mo3080a(Throwable th) {
                C0855a.this.f2923a.mo3094m(th);
            }

            /* renamed from: b */
            public void mo3081b(C0879m mVar) {
                C0855a.this.mo3106d(mVar);
            }
        }

        C0855a(C0854e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3103a() {
            try {
                this.f2923a.f2912f.mo3078a(new C0856a());
            } catch (Throwable th) {
                this.f2923a.mo3094m(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3104b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2920b.mo3123h(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3105c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2921c.mo3147e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2923a.f2913g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3106d(C0879m mVar) {
            if (mVar == null) {
                this.f2923a.mo3094m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2921c = mVar;
            C0879m mVar2 = this.f2921c;
            C0864i iVar = new C0864i();
            C0859d a = this.f2923a.f2919m;
            C0854e eVar = this.f2923a;
            this.f2920b = new C0867h(mVar2, iVar, a, eVar.f2914h, eVar.f2915i);
            this.f2923a.mo3095n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    private static class C0857b {

        /* renamed from: a */
        final C0854e f2923a;

        C0857b(C0854e eVar) {
            this.f2923a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3103a() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3104b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3105c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static abstract class C0858c {

        /* renamed from: a */
        final C0862g f2924a;

        /* renamed from: b */
        boolean f2925b;

        /* renamed from: c */
        boolean f2926c;

        /* renamed from: d */
        int[] f2927d;

        /* renamed from: e */
        Set<C0860e> f2928e;

        /* renamed from: f */
        boolean f2929f;

        /* renamed from: g */
        int f2930g = -16711936;

        /* renamed from: h */
        int f2931h = 0;

        /* renamed from: i */
        C0859d f2932i = new C0853d();

        protected C0858c(C0862g gVar) {
            C0623f.m2496g(gVar, "metadataLoader cannot be null.");
            this.f2924a = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C0862g mo3107a() {
            return this.f2924a;
        }

        /* renamed from: b */
        public C0858c mo3108b(int i) {
            this.f2931h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public interface C0859d {
        /* renamed from: a */
        boolean mo3089a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    public static abstract class C0860e {
        /* renamed from: a */
        public void mo1618a(Throwable th) {
        }

        /* renamed from: b */
        public void mo1619b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    private static class C0861f implements Runnable {

        /* renamed from: d */
        private final List<C0860e> f2933d;

        /* renamed from: e */
        private final Throwable f2934e;

        /* renamed from: f */
        private final int f2935f;

        C0861f(C0860e eVar, int i) {
            this(Arrays.asList(new C0860e[]{(C0860e) C0623f.m2496g(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        C0861f(Collection<C0860e> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        C0861f(Collection<C0860e> collection, int i, Throwable th) {
            C0623f.m2496g(collection, "initCallbacks cannot be null");
            this.f2933d = new ArrayList(collection);
            this.f2935f = i;
            this.f2934e = th;
        }

        public void run() {
            int size = this.f2933d.size();
            int i = 0;
            if (this.f2935f != 1) {
                while (i < size) {
                    this.f2933d.get(i).mo1618a(this.f2934e);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f2933d.get(i).mo1619b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    public interface C0862g {
        /* renamed from: a */
        void mo3078a(C0863h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    public static abstract class C0863h {
        /* renamed from: a */
        public abstract void mo3080a(Throwable th);

        /* renamed from: b */
        public abstract void mo3081b(C0879m mVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    static class C0864i {
        C0864i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0870i mo3110a(C0866g gVar) {
            return new C0883o(gVar);
        }
    }

    private C0854e(C0858c cVar) {
        this.f2913g = cVar.f2925b;
        this.f2914h = cVar.f2926c;
        this.f2915i = cVar.f2927d;
        this.f2916j = cVar.f2929f;
        this.f2917k = cVar.f2930g;
        this.f2912f = cVar.f2924a;
        this.f2918l = cVar.f2931h;
        this.f2919m = cVar.f2932i;
        this.f2910d = new Handler(Looper.getMainLooper());
        C1768b bVar = new C1768b();
        this.f2908b = bVar;
        Set<C0860e> set = cVar.f2928e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2928e);
        }
        this.f2911e = new C0855a(this);
        m3395l();
    }

    /* renamed from: b */
    public static C0854e m3389b() {
        C0854e eVar;
        synchronized (f2904n) {
            eVar = f2906p;
            C0623f.m2497h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: e */
    public static boolean m3390e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C0867h.m3440c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m3391f(Editable editable, int i, KeyEvent keyEvent) {
        return C0867h.m3441d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C0854e m3392g(C0858c cVar) {
        C0854e eVar = f2906p;
        if (eVar == null) {
            synchronized (f2904n) {
                eVar = f2906p;
                if (eVar == null) {
                    eVar = new C0854e(cVar);
                    f2906p = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public static boolean m3393h() {
        return f2906p != null;
    }

    /* renamed from: j */
    private boolean m3394j() {
        return mo3091d() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m3395l() {
        this.f2907a.writeLock().lock();
        try {
            if (this.f2918l == 0) {
                this.f2909c = 0;
            }
            this.f2907a.writeLock().unlock();
            if (mo3091d() == 0) {
                this.f2911e.mo3103a();
            }
        } catch (Throwable th) {
            this.f2907a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public int mo3090c() {
        return this.f2917k;
    }

    /* renamed from: d */
    public int mo3091d() {
        this.f2907a.readLock().lock();
        try {
            return this.f2909c;
        } finally {
            this.f2907a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo3092i() {
        return this.f2916j;
    }

    /* renamed from: k */
    public void mo3093k() {
        boolean z = true;
        if (this.f2918l != 1) {
            z = false;
        }
        C0623f.m2497h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m3394j()) {
            this.f2907a.writeLock().lock();
            try {
                if (this.f2909c != 0) {
                    this.f2909c = 0;
                    this.f2907a.writeLock().unlock();
                    this.f2911e.mo3103a();
                }
            } finally {
                this.f2907a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3094m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2907a.writeLock().lock();
        try {
            this.f2909c = 2;
            arrayList.addAll(this.f2908b);
            this.f2908b.clear();
            this.f2907a.writeLock().unlock();
            this.f2910d.post(new C0861f(arrayList, this.f2909c, th));
        } catch (Throwable th2) {
            this.f2907a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3095n() {
        ArrayList arrayList = new ArrayList();
        this.f2907a.writeLock().lock();
        try {
            this.f2909c = 1;
            arrayList.addAll(this.f2908b);
            this.f2908b.clear();
            this.f2907a.writeLock().unlock();
            this.f2910d.post(new C0861f((Collection<C0860e>) arrayList, this.f2909c));
        } catch (Throwable th) {
            this.f2907a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo3096o(CharSequence charSequence) {
        return mo3097p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence mo3097p(CharSequence charSequence, int i, int i2) {
        return mo3098q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo3098q(CharSequence charSequence, int i, int i2, int i3) {
        return mo3099r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo3099r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        C0623f.m2497h(m3394j(), "Not initialized yet");
        C0623f.m2493d(i, "start cannot be negative");
        C0623f.m2493d(i2, "end cannot be negative");
        C0623f.m2493d(i3, "maxEmojiCount cannot be negative");
        boolean z2 = false;
        C0623f.m2490a(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C0623f.m2490a(i <= charSequence.length(), "start should be < than charSequence length");
        C0623f.m2490a(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z2 = this.f2913g;
            }
            z = z2;
        } else {
            z = true;
        }
        return this.f2911e.mo3104b(charSequence, i, i2, i3, z);
    }

    /* renamed from: s */
    public void mo3100s(C0860e eVar) {
        C0623f.m2496g(eVar, "initCallback cannot be null");
        this.f2907a.writeLock().lock();
        try {
            if (this.f2909c != 1) {
                if (this.f2909c != 2) {
                    this.f2908b.add(eVar);
                }
            }
            this.f2910d.post(new C0861f(eVar, this.f2909c));
        } finally {
            this.f2907a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo3101t(C0860e eVar) {
        C0623f.m2496g(eVar, "initCallback cannot be null");
        this.f2907a.writeLock().lock();
        try {
            this.f2908b.remove(eVar);
        } finally {
            this.f2907a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo3102u(EditorInfo editorInfo) {
        if (m3394j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2911e.mo3105c(editorInfo);
        }
    }
}
