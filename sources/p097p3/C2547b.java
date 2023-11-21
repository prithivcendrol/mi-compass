package p097p3;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import p091o3.C2499a;
import p117t2.C2710j;

/* renamed from: p3.b */
public class C2547b {

    /* renamed from: b */
    private static C2710j<C2547b> f10049b;

    /* renamed from: a */
    private Resources f10050a;

    /* renamed from: p3.b$a */
    class C2548a extends C2710j<C2547b> {
        C2548a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C2547b mo9671a(Object obj) {
            return new C2547b((Context) obj, (C2548a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo9787c(C2547b bVar, Object obj) {
            super.mo9787c(bVar, obj);
            bVar.m10862u((Context) obj);
        }
    }

    private C2547b(Context context) {
        this.f10050a = context.getResources();
    }

    /* synthetic */ C2547b(Context context, C2548a aVar) {
        this(context);
    }

    /* renamed from: n */
    public static C2547b m10861n(Context context) {
        if (f10049b == null) {
            f10049b = new C2548a();
        }
        return f10049b.mo9957b(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m10862u(Context context) {
        this.f10050a = context.getResources();
    }

    /* renamed from: b */
    public String[] mo9769b() {
        return this.f10050a.getStringArray(C2499a.f9721a);
    }

    /* renamed from: c */
    public String[] mo9770c() {
        return this.f10050a.getStringArray(C2499a.f9722b);
    }

    /* renamed from: d */
    public String[] mo9771d() {
        return this.f10050a.getStringArray(C2499a.f9723c);
    }

    /* renamed from: e */
    public String[] mo9772e() {
        return this.f10050a.getStringArray(C2499a.f9724d);
    }

    /* renamed from: f */
    public String[] mo9773f() {
        return this.f10050a.getStringArray(C2499a.f9725e);
    }

    /* renamed from: g */
    public String[] mo9774g() {
        return this.f10050a.getStringArray(C2499a.f9726f);
    }

    /* renamed from: h */
    public String[] mo9775h() {
        return this.f10050a.getStringArray(C2499a.f9727g);
    }

    /* renamed from: i */
    public String[] mo9776i() {
        return this.f10050a.getStringArray(C2499a.f9728h);
    }

    /* renamed from: j */
    public String[] mo9777j() {
        return this.f10050a.getStringArray(C2499a.f9729i);
    }

    /* renamed from: k */
    public String[] mo9778k() {
        return this.f10050a.getStringArray(C2499a.f9730j);
    }

    /* renamed from: l */
    public Locale mo9779l() {
        return Locale.getDefault();
    }

    /* renamed from: m */
    public String[] mo9780m() {
        return this.f10050a.getStringArray(C2499a.f9731k);
    }

    /* renamed from: o */
    public String[] mo9781o() {
        return this.f10050a.getStringArray(C2499a.f9732l);
    }

    /* renamed from: p */
    public String[] mo9782p() {
        return this.f10050a.getStringArray(C2499a.f9736p);
    }

    /* renamed from: q */
    public String[] mo9783q() {
        return this.f10050a.getStringArray(C2499a.f9733m);
    }

    /* renamed from: r */
    public String[] mo9784r() {
        return this.f10050a.getStringArray(C2499a.f9737q);
    }

    /* renamed from: s */
    public String[] mo9785s() {
        return this.f10050a.getStringArray(C2499a.f9734n);
    }

    /* renamed from: t */
    public String[] mo9786t() {
        return this.f10050a.getStringArray(C2499a.f9735o);
    }
}
