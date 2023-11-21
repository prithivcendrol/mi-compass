package p148z3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import p148z3.C2974a;

/* renamed from: z3.b */
public class C2979b extends C2974a {

    /* renamed from: v */
    public static View.OnAttachStateChangeListener f11328v = new C2980a();

    /* renamed from: w */
    public static AnimConfig f11329w = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.3f)).setFromSpeed(0.0f);

    /* renamed from: z3.b$a */
    class C2980a implements View.OnAttachStateChangeListener {
        C2980a() {
        }

        public void onViewAttachedToWindow(View view) {
            C2974a.m12279n0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: z3.b$b */
    class C2981b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f11330d;

        C2981b(RecyclerView.C1168e0 e0Var) {
            this.f11330d = e0Var;
        }

        public void run() {
            Folme.useAt(this.f11330d.f4049a).state().setTo(ViewProperty.ALPHA, Float.valueOf(1.0f));
            C2979b.this.mo10291i0(this.f11330d);
        }
    }

    /* renamed from: z3.b$c */
    class C2982c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f11332d;

        C2982c(RecyclerView.C1168e0 e0Var) {
            this.f11332d = e0Var;
        }

        public void run() {
            C2979b.this.mo10289g0(this.f11332d);
        }
    }

    /* renamed from: z3.b$d */
    class C2983d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f11334d;

        C2983d(RecyclerView.C1168e0 e0Var) {
            this.f11334d = e0Var;
        }

        public void run() {
            C2979b.this.mo10285c0(this.f11334d);
        }
    }

    /* renamed from: z3.b$e */
    class C2984e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f11336d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1168e0 f11337e;

        C2984e(View view, RecyclerView.C1168e0 e0Var) {
            this.f11336d = view;
            this.f11337e = e0Var;
        }

        public void run() {
            Folme.useAt(this.f11336d).state().setTo(ViewProperty.TRANSLATION_X, 0, ViewProperty.TRANSLATION_Y, 0, ViewProperty.ALPHA, Float.valueOf(1.0f));
            C2979b.this.mo10287e0(this.f11337e, true);
        }
    }

    /* renamed from: z3.b$f */
    class C2985f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f11339d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView.C1168e0 f11340e;

        C2985f(View view, RecyclerView.C1168e0 e0Var) {
            this.f11339d = view;
            this.f11340e = e0Var;
        }

        public void run() {
            Folme.useAt(this.f11339d).state().setTo(ViewProperty.TRANSLATION_X, 0, ViewProperty.TRANSLATION_Y, 0);
            C2979b.this.mo10287e0(this.f11340e, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo10281R(RecyclerView.C1168e0 e0Var) {
        mo10286d0(e0Var);
        IStateStyle state = Folme.useAt(e0Var.f4049a).state();
        ViewProperty viewProperty = ViewProperty.ALPHA;
        Float valueOf = Float.valueOf(1.0f);
        state.mo6816to(viewProperty, valueOf, f11329w);
        e0Var.f4049a.postDelayed(new C2983d(e0Var), Folme.useAt(e0Var.f4049a).state().predictDuration(viewProperty, valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo10282S(C2974a.C2977c cVar) {
        C2974a.C2977c cVar2 = cVar;
        RecyclerView.C1168e0 e0Var = cVar2.f11317a;
        View view = null;
        View view2 = e0Var == null ? null : e0Var.f4049a;
        RecyclerView.C1168e0 e0Var2 = cVar2.f11318b;
        if (e0Var2 != null) {
            view = e0Var2.f4049a;
        }
        if (view2 != null) {
            mo10288f0(e0Var, true);
            view2.addOnAttachStateChangeListener(f11328v);
            IStateStyle state = Folme.useAt(view2).state();
            ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
            ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
            state.mo6816to(viewProperty, Integer.valueOf(cVar2.f11321e - cVar2.f11319c), viewProperty2, Integer.valueOf(cVar2.f11322f - cVar2.f11320d), f11329w);
            view2.postDelayed(new C2984e(view2, e0Var), Folme.useAt(view2).state().predictDuration(viewProperty, Integer.valueOf(cVar2.f11321e - cVar2.f11319c), viewProperty2, Integer.valueOf(cVar2.f11322f - cVar2.f11320d)));
        }
        if (view != null) {
            mo10288f0(e0Var2, false);
            IStateStyle state2 = Folme.useAt(view).state();
            ViewProperty viewProperty3 = ViewProperty.TRANSLATION_X;
            ViewProperty viewProperty4 = ViewProperty.TRANSLATION_Y;
            state2.mo6816to(viewProperty3, 0, viewProperty4, 0, f11329w);
            view.postDelayed(new C2985f(view2, e0Var2), Folme.useAt(view).state().predictDuration(viewProperty3, 0, viewProperty4, 0));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo10283T(C2974a.C2978d dVar) {
        mo10290h0(dVar.f11323a);
        RecyclerView.C1168e0 e0Var = dVar.f11323a;
        IStateStyle state = Folme.useAt(e0Var.f4049a).state();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
        state.mo6816to(viewProperty, 0, viewProperty2, 0, f11329w);
        dVar.f11323a.f4049a.postDelayed(new C2982c(e0Var), Folme.useAt(dVar.f11323a.f4049a).state().predictDuration(viewProperty, 0, viewProperty2, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo10284U(RecyclerView.C1168e0 e0Var) {
        mo10292j0(e0Var);
        e0Var.f4049a.addOnAttachStateChangeListener(f11328v);
        IStateStyle state = Folme.useAt(e0Var.f4049a).state();
        ViewProperty viewProperty = ViewProperty.ALPHA;
        Float valueOf = Float.valueOf(0.0f);
        state.mo6816to(viewProperty, valueOf, f11329w);
        e0Var.f4049a.postDelayed(new C2981b(e0Var), Folme.useAt(e0Var.f4049a).state().predictDuration(viewProperty, valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo10293k0(RecyclerView.C1168e0 e0Var) {
        mo10296o0(e0Var);
        e0Var.f4049a.setAlpha(0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo10294l0(C2974a.C2977c cVar) {
        float translationX = cVar.f11317a.f4049a.getTranslationX();
        float translationY = cVar.f11317a.f4049a.getTranslationY();
        mo10296o0(cVar.f11317a);
        int i = (int) (((float) (cVar.f11321e - cVar.f11319c)) - translationX);
        int i2 = (int) (((float) (cVar.f11322f - cVar.f11320d)) - translationY);
        cVar.f11317a.f4049a.setTranslationX(translationX);
        cVar.f11317a.f4049a.setTranslationY(translationY);
        RecyclerView.C1168e0 e0Var = cVar.f11318b;
        if (e0Var != null) {
            mo10296o0(e0Var);
            cVar.f11318b.f4049a.setTranslationX((float) (-i));
            cVar.f11318b.f4049a.setTranslationY((float) (-i2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo10295m0(C2974a.C2978d dVar) {
        dVar.f11323a.f4049a.setTranslationX((float) (dVar.f11324b - dVar.f11326d));
        dVar.f11323a.f4049a.setTranslationY((float) (dVar.f11325c - dVar.f11327e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo10296o0(RecyclerView.C1168e0 e0Var) {
        if (e0Var != null) {
            Folme.useAt(e0Var.f4049a).state().end(ViewProperty.TRANSLATION_X, ViewProperty.TRANSLATION_Y, ViewProperty.ALPHA);
            C2974a.m12279n0(e0Var.f4049a);
        }
    }
}
