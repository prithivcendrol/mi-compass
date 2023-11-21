package p075m;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.d */
public abstract class C1887d {

    /* renamed from: a */
    private C1888a f7267a;

    /* renamed from: b */
    private String f7268b;

    /* renamed from: c */
    private int f7269c = 0;

    /* renamed from: d */
    private String f7270d = null;

    /* renamed from: e */
    public int f7271e = 0;

    /* renamed from: f */
    ArrayList<C1889b> f7272f = new ArrayList<>();

    /* renamed from: m.d$a */
    static class C1888a {
        /* renamed from: a */
        public double mo6445a(float f) {
            throw null;
        }
    }

    /* renamed from: m.d$b */
    static class C1889b {

        /* renamed from: a */
        int f7273a;

        /* renamed from: b */
        float f7274b;
    }

    /* renamed from: a */
    public float mo6443a(float f) {
        return (float) this.f7267a.mo6445a(f);
    }

    public String toString() {
        String str = this.f7268b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C1889b> it = this.f7272f.iterator();
        while (it.hasNext()) {
            C1889b next = it.next();
            str = str + "[" + next.f7273a + " , " + decimalFormat.format((double) next.f7274b) + "] ";
        }
        return str;
    }
}
