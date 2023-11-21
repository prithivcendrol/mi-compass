package p025d3;

import android.util.Log;
import p019c3.C1358a;
import p043g3.C1609b;

/* renamed from: d3.d */
public class C1503d implements C1500a {

    /* renamed from: a */
    private ThreadLocal<StringBuilder> f6132a = new C1504a();

    /* renamed from: d3.d$a */
    class C1504a extends ThreadLocal<StringBuilder> {
        C1504a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: d3.d$b */
    static /* synthetic */ class C1505b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c3.a[] r0 = p019c3.C1358a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6134a = r0
                c3.a r1 = p019c3.C1358a.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6134a     // Catch:{ NoSuchFieldError -> 0x001d }
                c3.a r1 = p019c3.C1358a.DEBUG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c3.a r1 = p019c3.C1358a.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c3.a r1 = p019c3.C1358a.WARNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6134a     // Catch:{ NoSuchFieldError -> 0x003e }
                c3.a r1 = p019c3.C1358a.ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6134a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c3.a r1 = p019c3.C1358a.FATAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p025d3.C1503d.C1505b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo5578a(String str, String str2, long j, C1358a aVar, C1609b bVar) {
        StringBuilder sb = this.f6132a.get();
        sb.setLength(0);
        bVar.mo5763a(sb);
        mo5579b(str, str2, j, aVar, sb.toString(), bVar.mo5764c());
        if (sb.length() > 8192) {
            sb.setLength(8192);
            sb.trimToSize();
        }
    }

    /* renamed from: b */
    public void mo5579b(String str, String str2, long j, C1358a aVar, String str3, Throwable th) {
        switch (C1505b.f6134a[aVar.ordinal()]) {
            case 1:
                if (th == null) {
                    Log.v(str2, str3);
                    return;
                } else {
                    Log.v(str2, str3, th);
                    return;
                }
            case 2:
                if (th == null) {
                    Log.d(str2, str3);
                    return;
                } else {
                    Log.d(str2, str3, th);
                    return;
                }
            case 3:
                if (th == null) {
                    Log.i(str2, str3);
                    return;
                } else {
                    Log.i(str2, str3, th);
                    return;
                }
            case 4:
                if (th == null) {
                    Log.w(str2, str3);
                    return;
                } else {
                    Log.w(str2, str3, th);
                    return;
                }
            case 5:
                if (th == null) {
                    Log.e(str2, str3);
                    return;
                } else {
                    Log.e(str2, str3, th);
                    return;
                }
            case 6:
                if (th == null) {
                    Log.wtf(str2, str3);
                    return;
                } else {
                    Log.wtf(str2, str3, th);
                    return;
                }
            default:
                return;
        }
    }
}
