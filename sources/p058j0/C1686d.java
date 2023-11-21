package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0727l0;

/* renamed from: j0.d */
public class C1686d extends C1723n0 {

    /* renamed from: j0.d$a */
    class C1687a extends C1718m {

        /* renamed from: d */
        final /* synthetic */ View f6600d;

        C1687a(View view) {
            this.f6600d = view;
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            C1668a0.m7022g(this.f6600d, 1.0f);
            C1668a0.m7016a(this.f6600d);
            lVar.mo5930P(this);
        }
    }

    /* renamed from: j0.d$b */
    private static class C1688b extends AnimatorListenerAdapter {

        /* renamed from: d */
        private final View f6602d;

        /* renamed from: e */
        private boolean f6603e = false;

        C1688b(View view) {
            this.f6602d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1668a0.m7022g(this.f6602d, 1.0f);
            if (this.f6603e) {
                this.f6602d.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0727l0.m2856F(this.f6602d) && this.f6602d.getLayerType() == 0) {
                this.f6603e = true;
                this.f6602d.setLayerType(2, (Paint) null);
            }
        }
    }

    public C1686d(int i) {
        mo5971i0(i);
    }

    /* renamed from: j0 */
    private Animator m7058j0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1668a0.m7022g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1668a0.f6561b, new float[]{f2});
        ofFloat.addListener(new C1688b(view));
        mo5940a(new C1687a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f6713a.get("android:fade:transitionAlpha");
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m7059k0(p058j0.C1735s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f6713a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p058j0.C1686d.m7059k0(j0.s, float):float");
    }

    /* renamed from: e0 */
    public Animator mo5904e0(ViewGroup viewGroup, View view, C1735s sVar, C1735s sVar2) {
        float f = 0.0f;
        float k0 = m7059k0(sVar, 0.0f);
        if (k0 != 1.0f) {
            f = k0;
        }
        return m7058j0(view, f, 1.0f);
    }

    /* renamed from: g0 */
    public Animator mo5905g0(ViewGroup viewGroup, View view, C1735s sVar, C1735s sVar2) {
        C1668a0.m7020e(view);
        return m7058j0(view, m7059k0(sVar, 1.0f), 0.0f);
    }

    /* renamed from: j */
    public void mo5869j(C1735s sVar) {
        super.mo5869j(sVar);
        sVar.f6713a.put("android:fade:transitionAlpha", Float.valueOf(C1668a0.m7018c(sVar.f6714b)));
    }
}
