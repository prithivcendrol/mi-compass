package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0595e;
import androidx.core.util.C0623f;
import androidx.emoji2.text.C0854e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
public final class C0848c {

    /* renamed from: androidx.emoji2.text.c$a */
    public static class C0849a {

        /* renamed from: a */
        private final C0850b f2901a;

        public C0849a(C0850b bVar) {
            this.f2901a = bVar == null ? m3375e() : bVar;
        }

        /* renamed from: a */
        private C0854e.C0858c m3372a(Context context, C0595e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C0871j(context, eVar);
        }

        /* renamed from: b */
        private List<List<byte[]>> m3373b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0595e m3374d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0595e(str, str2, "emojicompat-emoji-font", m3373b(this.f2901a.mo3087b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C0850b m3375e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0852d() : new C0851c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m3376f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0848c.C0849a.m3376f(android.content.pm.ProviderInfo):boolean");
        }

        /* renamed from: g */
        private ProviderInfo m3377g(PackageManager packageManager) {
            for (ResolveInfo a : this.f2901a.mo3088c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f2901a.mo3086a(a);
                if (m3376f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C0854e.C0858c mo3084c(Context context) {
            return m3372a(context, mo3085h(context));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0595e mo3085h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C0623f.m2496g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m3377g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m3374d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class C0850b {
        /* renamed from: a */
        public ProviderInfo mo3086a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo3087b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3088c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C0851c extends C0850b {
        /* renamed from: a */
        public ProviderInfo mo3086a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3088c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static class C0852d extends C0851c {
        /* renamed from: b */
        public Signature[] mo3087b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0871j m3371a(Context context) {
        return (C0871j) new C0849a((C0850b) null).mo3084c(context);
    }
}
