package p143y3;

import android.app.Activity;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import miuix.recyclerview.widget.RecyclerView;

/* renamed from: y3.a */
public class C2946a {

    /* renamed from: l */
    private static boolean f11153l = false;

    /* renamed from: m */
    private static int[] f11154m;

    /* renamed from: n */
    private static int[] f11155n;

    /* renamed from: o */
    private static int f11156o;

    /* renamed from: a */
    private final boolean f11157a;

    /* renamed from: b */
    private volatile boolean f11158b = false;

    /* renamed from: c */
    private final Display f11159c;

    /* renamed from: d */
    private final Window f11160d;

    /* renamed from: e */
    private boolean f11161e = false;

    /* renamed from: f */
    private int f11162f = 0;

    /* renamed from: g */
    private long f11163g = -1;

    /* renamed from: h */
    private int f11164h;

    /* renamed from: i */
    private long f11165i = 0;

    /* renamed from: j */
    private boolean f11166j = false;

    /* renamed from: k */
    private int f11167k = 0;

    public C2946a(RecyclerView recyclerView) {
        Window window = null;
        Display a = recyclerView.getContext() instanceof Activity ? recyclerView.getContext().getDisplay() : null;
        this.f11159c = a;
        window = recyclerView.getContext() instanceof Activity ? ((Activity) recyclerView.getContext()).getWindow() : window;
        this.f11160d = window;
        boolean z = (!m12202c() || a == null || window == null) ? false : true;
        this.f11157a = z;
        if (!z) {
            Log.e("DynamicRefreshRate recy", "dynamic is not enable");
        } else {
            this.f11164h = f11154m[0];
        }
    }

    /* renamed from: a */
    private int m12201a(int i) {
        int[] iArr = f11154m;
        int i2 = iArr[iArr.length - 1];
        if (!this.f11161e || this.f11166j) {
            return -1;
        }
        if (i == 0) {
            return i2;
        }
        if (this.f11162f == 0) {
            this.f11165i = 0;
            this.f11163g = System.currentTimeMillis();
        }
        int i3 = this.f11162f + 1;
        this.f11162f = i3;
        this.f11165i += (long) i;
        if (i3 < 3) {
            return -1;
        }
        int abs = Math.abs(Math.round(((float) this.f11165i) / (((float) (System.currentTimeMillis() - this.f11163g)) / 1000.0f)));
        this.f11162f = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = f11155n;
            if (i4 >= iArr2.length) {
                break;
            } else if (abs > iArr2[i4]) {
                i2 = f11154m[i4];
                break;
            } else {
                i4++;
            }
        }
        int i5 = this.f11164h;
        if (i2 >= i5) {
            int[] iArr3 = f11154m;
            if (!(i5 == iArr3[iArr3.length - 1] && i2 == iArr3[0])) {
                return -1;
            }
        }
        this.f11164h = i2;
        return i2;
    }

    /* renamed from: c */
    private static boolean m12202c() {
        boolean z = false;
        if (f11153l) {
            return (f11154m == null || f11155n == null) ? false : true;
        }
        try {
            String str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.vendor.display.dynamic_refresh_rate"});
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("dynamic params is ");
                sb.append((f11154m == null || f11155n == null) ? false : true);
                Log.e("DynamicRefreshRate recy", sb.toString());
                f11153l = true;
                return false;
            }
            String[] split = str.split(":");
            if (split.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dynamic params is ");
                sb2.append((f11154m == null || f11155n == null) ? false : true);
                Log.e("DynamicRefreshRate recy", sb2.toString());
                f11153l = true;
                return false;
            }
            String[] split2 = split[0].split(",");
            String[] split3 = split[1].split(",");
            if (split3.length != split2.length - 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("dynamic params is ");
                sb3.append((f11154m == null || f11155n == null) ? false : true);
                Log.e("DynamicRefreshRate recy", sb3.toString());
                f11153l = true;
                return false;
            }
            f11154m = new int[split2.length];
            for (int i = 0; i < split2.length; i++) {
                f11154m[i] = Integer.parseInt(split2[i]);
            }
            f11155n = new int[split3.length];
            for (int i2 = 0; i2 < split3.length; i2++) {
                f11155n[i2] = Integer.parseInt(split3[i2]);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("dynamic params is ");
            if (!(f11154m == null || f11155n == null)) {
                z = true;
            }
            sb4.append(z);
            Log.e("DynamicRefreshRate recy", sb4.toString());
            f11153l = true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("dynamic params is ");
            sb5.append((f11154m == null || f11155n == null) ? false : true);
            Log.e("DynamicRefreshRate recy", sb5.toString());
            f11153l = true;
            f11154m = null;
            f11155n = null;
            return false;
        } catch (Throwable th) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("dynamic params is ");
            if (!(f11154m == null || f11155n == null)) {
                z = true;
            }
            sb6.append(z);
            Log.e("DynamicRefreshRate recy", sb6.toString());
            f11153l = true;
            throw th;
        }
    }

    /* renamed from: f */
    private void m12203f(int i, boolean z) {
        Display.Mode[] supportedModes = this.f11159c.getSupportedModes();
        WindowManager.LayoutParams attributes = this.f11160d.getAttributes();
        int i2 = attributes.preferredDisplayModeId;
        try {
            if (i2 > supportedModes.length) {
                return;
            }
            if (i2 >= 0) {
                if (z || i2 == 0 || Math.abs(supportedModes[i2 - 1].getRefreshRate() - ((float) i)) >= 1.0f) {
                    int length = supportedModes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        Display.Mode mode = supportedModes[i3];
                        if (Math.abs(mode.getRefreshRate() - ((float) i)) > 1.0f) {
                            i3++;
                        } else if (z || i2 == 0 || hashCode() == f11156o || mode.getRefreshRate() > supportedModes[i2 - 1].getRefreshRate()) {
                            f11156o = hashCode();
                            Log.e("DynamicRefreshRate recy", f11156o + " set Refresh rate to: " + i + ", mode is: " + mode.getModeId());
                            attributes.preferredDisplayModeId = mode.getModeId();
                            this.f11160d.setAttributes(attributes);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            Log.e("DynamicRefreshRate recy", "out of bound exception! mode length " + supportedModes.length + ", mode id " + i2);
        }
    }

    /* renamed from: b */
    public void mo10238b(int i, int i2) {
        int a;
        if (!this.f11157a) {
            return;
        }
        if ((i != 0 || i2 != 0) && !this.f11158b && (a = m12201a(Math.max(Math.abs(i), Math.abs(i2)))) != -1) {
            m12203f(a, false);
        }
    }

    /* renamed from: d */
    public void mo10239d(boolean z) {
        if (this.f11157a) {
            this.f11161e = z;
            this.f11166j = true;
            m12203f(f11154m[0], false);
        }
    }

    /* renamed from: e */
    public void mo10240e(RecyclerView recyclerView, int i) {
        if (this.f11157a) {
            if (this.f11166j || this.f11158b || this.f11167k != 2) {
                this.f11167k = i;
                return;
            }
            this.f11167k = i;
            if ((recyclerView.canScrollVertically(-1) && recyclerView.canScrollVertically(1)) || (recyclerView.canScrollHorizontally(-1) && recyclerView.canScrollVertically(1))) {
                int[] iArr = f11154m;
                m12203f(iArr[iArr.length - 1], false);
            }
        }
    }

    /* renamed from: g */
    public void mo10241g(MotionEvent motionEvent) {
        if (this.f11157a) {
            if (motionEvent.getActionMasked() == 0) {
                this.f11158b = true;
                int i = f11154m[0];
                this.f11164h = i;
                this.f11162f = 0;
                m12203f(i, true);
                this.f11161e = true;
                this.f11166j = false;
            } else if (motionEvent.getActionMasked() == 1) {
                this.f11158b = false;
            }
        }
    }
}
