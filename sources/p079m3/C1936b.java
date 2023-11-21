package p079m3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import p079m3.C1930a;
import p079m3.C1936b;

/* renamed from: m3.b */
public abstract class C1936b<T extends C1936b<T>> implements C1930a.C1932b {

    /* renamed from: A */
    public static final C1955s f7337A = new C1941e("scrollY");

    /* renamed from: n */
    public static final C1955s f7338n = new C1943g("translationX");

    /* renamed from: o */
    public static final C1955s f7339o = new C1944h("translationY");

    /* renamed from: p */
    public static final C1955s f7340p = new C1945i("translationZ");

    /* renamed from: q */
    public static final C1955s f7341q = new C1946j("scaleX");

    /* renamed from: r */
    public static final C1955s f7342r = new C1947k("scaleY");

    /* renamed from: s */
    public static final C1955s f7343s = new C1948l("rotation");

    /* renamed from: t */
    public static final C1955s f7344t = new C1949m("rotationX");

    /* renamed from: u */
    public static final C1955s f7345u = new C1950n("rotationY");

    /* renamed from: v */
    public static final C1955s f7346v = new C1951o("x");

    /* renamed from: w */
    public static final C1955s f7347w = new C1937a("y");

    /* renamed from: x */
    public static final C1955s f7348x = new C1938b("z");

    /* renamed from: y */
    public static final C1955s f7349y = new C1939c("alpha");

    /* renamed from: z */
    public static final C1955s f7350z = new C1940d("scrollX");

    /* renamed from: a */
    float f7351a = 0.0f;

    /* renamed from: b */
    float f7352b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f7353c = false;

    /* renamed from: d */
    final Object f7354d = null;

    /* renamed from: e */
    final C1959d f7355e;

    /* renamed from: f */
    boolean f7356f = false;

    /* renamed from: g */
    float f7357g = Float.MAX_VALUE;

    /* renamed from: h */
    float f7358h = (-Float.MAX_VALUE);

    /* renamed from: i */
    private long f7359i = 0;

    /* renamed from: j */
    private float f7360j;

    /* renamed from: k */
    private final ArrayList<C1953q> f7361k = new ArrayList<>();

    /* renamed from: l */
    private final ArrayList<C1954r> f7362l = new ArrayList<>();

    /* renamed from: m */
    private boolean f7363m;

    /* renamed from: m3.b$a */
    class C1937a extends C1955s {
        C1937a(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: m3.b$b */
    class C1938b extends C1955s {
        C1938b(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getZ();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setZ(f);
        }
    }

    /* renamed from: m3.b$c */
    class C1939c extends C1955s {
        C1939c(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: m3.b$d */
    class C1940d extends C1955s {
        C1940d(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: m3.b$e */
    class C1941e extends C1955s {
        C1941e(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: m3.b$f */
    class C1942f extends C1959d {

        /* renamed from: b */
        final /* synthetic */ C1960e f7364b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1942f(String str, C1960e eVar) {
            super(str);
            this.f7364b = eVar;
        }

        /* renamed from: a */
        public float mo6542a(Object obj) {
            return this.f7364b.mo6587a();
        }

        /* renamed from: b */
        public void mo6543b(Object obj, float f) {
            this.f7364b.mo6588b(f);
        }
    }

    /* renamed from: m3.b$g */
    class C1943g extends C1955s {
        C1943g(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: m3.b$h */
    class C1944h extends C1955s {
        C1944h(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: m3.b$i */
    class C1945i extends C1955s {
        C1945i(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: m3.b$j */
    class C1946j extends C1955s {
        C1946j(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: m3.b$k */
    class C1947k extends C1955s {
        C1947k(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: m3.b$l */
    class C1948l extends C1955s {
        C1948l(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: m3.b$m */
    class C1949m extends C1955s {
        C1949m(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: m3.b$n */
    class C1950n extends C1955s {
        C1950n(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: m3.b$o */
    class C1951o extends C1955s {
        C1951o(String str) {
            super(str, (C1943g) null);
        }

        /* renamed from: c */
        public float mo6542a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void mo6543b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: m3.b$p */
    static class C1952p {

        /* renamed from: a */
        float f7366a;

        /* renamed from: b */
        float f7367b;

        C1952p() {
        }
    }

    /* renamed from: m3.b$q */
    public interface C1953q {
        /* renamed from: a */
        void mo6572a(C1936b bVar, boolean z, float f, float f2);
    }

    /* renamed from: m3.b$r */
    public interface C1954r {
        /* renamed from: a */
        void mo6573a(C1936b bVar, float f, float f2);
    }

    /* renamed from: m3.b$s */
    public static abstract class C1955s extends C1959d<View> {
        private C1955s(String str) {
            super(str);
        }

        /* synthetic */ C1955s(String str, C1943g gVar) {
            this(str);
        }
    }

    C1936b(C1960e eVar) {
        this.f7355e = new C1942f("FloatValueHolder", eVar);
        this.f7360j = 1.0f;
    }

    /* renamed from: c */
    private void m7890c(boolean z) {
        this.f7356f = false;
        if (!this.f7363m) {
            C1930a.m7881d().mo6523g(this);
        }
        this.f7363m = false;
        this.f7359i = 0;
        this.f7353c = false;
        for (int i = 0; i < this.f7361k.size(); i++) {
            if (this.f7361k.get(i) != null) {
                this.f7361k.get(i).mo6572a(this, z, this.f7352b, this.f7351a);
            }
        }
        m7893h(this.f7361k);
    }

    /* renamed from: d */
    private float m7891d() {
        return this.f7355e.mo6542a(this.f7354d);
    }

    /* renamed from: g */
    private static <T> void m7892g(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
    }

    /* renamed from: h */
    private static <T> void m7893h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: r */
    private void m7894r(boolean z) {
        if (!this.f7356f) {
            this.f7363m = z;
            this.f7356f = true;
            if (!this.f7353c) {
                this.f7352b = m7891d();
            }
            float f = this.f7352b;
            if (f > this.f7357g || f < this.f7358h) {
                throw new IllegalArgumentException("Starting value(" + this.f7352b + ") need to be in between min value(" + this.f7358h + ") and max value(" + this.f7357g + ")");
            } else if (!z) {
                C1930a.m7881d().mo6520a(this, 0);
            }
        }
    }

    /* renamed from: a */
    public T mo6528a(C1954r rVar) {
        if (!mo6531f()) {
            if (!this.f7362l.contains(rVar)) {
                this.f7362l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: b */
    public void mo6529b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f7356f) {
            m7890c(true);
        }
    }

    public boolean doAnimationFrame(long j) {
        long j2 = this.f7359i;
        if (j2 == 0) {
            this.f7359i = j;
            mo6536m(this.f7352b);
            return false;
        }
        this.f7359i = j;
        boolean s = mo6541s(j - j2);
        float min = Math.min(this.f7352b, this.f7357g);
        this.f7352b = min;
        float max = Math.max(min, this.f7358h);
        this.f7352b = max;
        mo6536m(max);
        if (s) {
            m7890c(false);
        }
        return s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo6530e() {
        return this.f7360j * 0.75f;
    }

    /* renamed from: f */
    public boolean mo6531f() {
        return this.f7356f;
    }

    /* renamed from: i */
    public void mo6532i(C1954r rVar) {
        m7892g(this.f7362l, rVar);
    }

    /* renamed from: j */
    public T mo6533j(float f) {
        this.f7357g = f;
        return this;
    }

    /* renamed from: k */
    public T mo6534k(float f) {
        this.f7358h = f;
        return this;
    }

    /* renamed from: l */
    public T mo6535l(float f) {
        if (f > 0.0f) {
            this.f7360j = f;
            mo6539p(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6536m(float f) {
        this.f7355e.mo6543b(this.f7354d, f);
        for (int i = 0; i < this.f7362l.size(); i++) {
            if (this.f7362l.get(i) != null) {
                this.f7362l.get(i).mo6573a(this, this.f7352b, this.f7351a);
            }
        }
        m7893h(this.f7362l);
    }

    /* renamed from: n */
    public T mo6537n(float f) {
        this.f7352b = f;
        this.f7353c = true;
        return this;
    }

    /* renamed from: o */
    public T mo6538o(float f) {
        this.f7351a = f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo6539p(float f);

    /* renamed from: q */
    public void mo6540q(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f7356f) {
            m7894r(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract boolean mo6541s(long j);
}
