package p107r2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.C2112p;
import p102q2.C2583b;
import p117t2.C2698f;

/* renamed from: r2.d */
public class C2625d implements C2620b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<ValueAnimator> f10274b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f10275a = 0;

    /* renamed from: r2.d$a */
    class C2626a extends C2629d {

        /* renamed from: f */
        final /* synthetic */ int f10276f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2626a(View view, View view2, int i) {
            super(view, view2);
            this.f10276f = i;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Insets insets;
            super.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                boolean a = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                Insets a2 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                if (a) {
                    int unused = C2625d.this.f10275a = insets.bottom - a2.bottom;
                }
            } else {
                insets = null;
            }
            Context context = view.getContext();
            if (mo9898b(context) && mo9897a(context)) {
                mo9899c(this.f10276f + (insets != null ? insets.bottom : 0));
            }
        }
    }

    /* renamed from: r2.d$b */
    class C2627b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f10278a;

        /* renamed from: b */
        final /* synthetic */ boolean f10279b;

        /* renamed from: c */
        final /* synthetic */ C2112p.C2116d f10280c;

        /* renamed from: d */
        final /* synthetic */ View.OnLayoutChangeListener f10281d;

        C2627b(View view, boolean z, C2112p.C2116d dVar, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f10278a = view;
            this.f10279b = z;
            this.f10280c = dVar;
            this.f10281d = onLayoutChangeListener;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int height = this.f10278a.getHeight();
            C2625d.m11098l(view, height, false);
            C2625d.m11097k(view, height, 0, this.f10279b, new C2631f(this.f10280c, this.f10281d, view, 0), new C2632g(view, this.f10279b));
            view.setVisibility(0);
        }
    }

    /* renamed from: r2.d$c */
    class C2628c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ boolean f10283a;

        /* renamed from: b */
        final /* synthetic */ C2112p.C2116d f10284b;

        /* renamed from: c */
        final /* synthetic */ View.OnLayoutChangeListener f10285c;

        C2628c(boolean z, C2112p.C2116d dVar, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f10283a = z;
            this.f10284b = dVar;
            this.f10285c = onLayoutChangeListener;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = i4 - i2;
            C2625d.m11098l(view, i9, false);
            C2625d.m11097k(view, i9, 0, this.f10283a, new C2631f(this.f10284b, this.f10285c, view, 0), new C2632g(view, this.f10283a));
        }
    }

    /* renamed from: r2.d$d */
    class C2629d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final WeakReference<View> f10287a;

        /* renamed from: b */
        final WeakReference<View> f10288b;

        /* renamed from: c */
        final Rect f10289c = new Rect();

        /* renamed from: d */
        final Point f10290d = new Point();

        public C2629d(View view, View view2) {
            this.f10287a = new WeakReference<>(view.getRootView());
            this.f10288b = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
            r0 = (int) (((float) r2.y) * 0.2f);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo9897a(android.content.Context r5) {
            /*
                r4 = this;
                android.view.Display r5 = p117t2.C2715o.m11330a(r5)
                android.graphics.Point r0 = r4.f10290d
                r5.getRealSize(r0)
                android.graphics.Rect r5 = r4.f10289c
                int r0 = r5.left
                r1 = 0
                if (r0 != 0) goto L_0x0026
                int r0 = r5.right
                android.graphics.Point r2 = r4.f10290d
                int r3 = r2.x
                if (r0 != r3) goto L_0x0026
                int r0 = r2.y
                float r0 = (float) r0
                r2 = 1045220557(0x3e4ccccd, float:0.2)
                float r0 = r0 * r2
                int r0 = (int) r0
                int r5 = r5.top
                if (r5 < r0) goto L_0x0026
                r5 = 1
                r1 = r5
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p107r2.C2625d.C2629d.mo9897a(android.content.Context):boolean");
        }

        /* renamed from: b */
        public boolean mo9898b(Context context) {
            return C2698f.m11283k(context) && !C2698f.m11281i(context);
        }

        /* renamed from: c */
        public void mo9899c(int i) {
            View view = this.f10288b.get();
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (marginLayoutParams.bottomMargin != i) {
                    marginLayoutParams.bottomMargin = i;
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2 = this.f10287a.get();
            if (view2 != null) {
                view2.getWindowVisibleDisplayFrame(this.f10289c);
            }
        }
    }

    /* renamed from: r2.d$e */
    class C2630e implements Animator.AnimatorListener {

        /* renamed from: d */
        WeakReference<C2583b.C2584a> f10292d;

        /* renamed from: e */
        WeakReference<View> f10293e;

        C2630e(View view, C2583b.C2584a aVar) {
            this.f10292d = new WeakReference<>(aVar);
            this.f10293e = new WeakReference<>(view);
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f10293e.get();
            if (view != null) {
                view.setTag((Object) null);
            }
            C2583b.C2584a aVar = this.f10292d.get();
            if (aVar != null) {
                aVar.end();
            } else {
                Log.d("PhoneDialogAnim", "onCancel mOnDismiss get null");
            }
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f10293e.get();
            if (view != null) {
                view.setTag((Object) null);
            }
            C2583b.C2584a aVar = this.f10292d.get();
            if (aVar != null) {
                aVar.end();
            } else {
                Log.d("PhoneDialogAnim", "onComplete mOnDismiss get null");
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f10293e.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    /* renamed from: r2.d$f */
    class C2631f extends AnimatorListenerAdapter {

        /* renamed from: d */
        WeakReference<C2112p.C2116d> f10295d;

        /* renamed from: e */
        View.OnLayoutChangeListener f10296e;

        /* renamed from: f */
        WeakReference<View> f10297f;

        /* renamed from: g */
        int f10298g;

        C2631f(C2112p.C2116d dVar, View.OnLayoutChangeListener onLayoutChangeListener, View view, int i) {
            this.f10295d = new WeakReference<>(dVar);
            this.f10296e = onLayoutChangeListener;
            this.f10297f = new WeakReference<>(view);
            this.f10298g = i;
        }

        /* renamed from: a */
        private void m11105a() {
            View view = this.f10297f.get();
            if (view != null) {
                view.setTag((Object) null);
                View.OnLayoutChangeListener onLayoutChangeListener = this.f10296e;
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    this.f10296e = null;
                }
            }
            C2112p.C2116d dVar = this.f10295d.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            }
            if (C2625d.f10274b != null) {
                C2625d.f10274b.clear();
                WeakReference unused = C2625d.f10274b = null;
            }
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            m11105a();
            View view = this.f10297f.get();
            if (view != null) {
                C2625d.m11098l(view, this.f10298g, true);
            }
            this.f10295d.clear();
            this.f10297f.clear();
        }

        public void onAnimationEnd(Animator animator) {
            WindowInsets rootWindowInsets;
            super.onAnimationEnd(animator);
            m11105a();
            View view = this.f10297f.get();
            if (!(view == null || Build.VERSION.SDK_INT < 30 || (rootWindowInsets = view.getRootWindowInsets()) == null)) {
                boolean a = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                Insets a2 = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                Insets a3 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                if (a) {
                    int unused = C2625d.this.f10275a = a2.bottom - a3.bottom;
                } else {
                    int unused2 = C2625d.this.f10275a = 0;
                }
                C2625d.m11098l(view, this.f10298g - C2625d.this.f10275a, true);
            }
            this.f10295d.clear();
            this.f10297f.clear();
        }

        public void onAnimationStart(Animator animator, boolean z) {
            View view = this.f10297f.get();
            if (view != null) {
                view.setTag("show");
                View.OnLayoutChangeListener onLayoutChangeListener = this.f10296e;
                if (onLayoutChangeListener != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
            }
            C2112p.C2116d dVar = this.f10295d.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            }
        }
    }

    /* renamed from: r2.d$g */
    class C2632g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        WeakReference<View> f10300a;

        /* renamed from: b */
        boolean f10301b;

        C2632g(View view, boolean z) {
            this.f10300a = new WeakReference<>(view);
            this.f10301b = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowInsets rootWindowInsets;
            View view = this.f10300a.get();
            if (view != null) {
                if ("hide".equals(view.getTag())) {
                    valueAnimator.cancel();
                    return;
                }
                if (Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                    boolean a = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                    Insets a2 = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                    Insets a3 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                    if (a) {
                        int unused = C2625d.this.f10275a = a2.bottom - a3.bottom;
                    } else {
                        int unused2 = C2625d.this.f10275a = 0;
                    }
                }
                C2625d.m11098l(view, ((Integer) valueAnimator.getAnimatedValue()).intValue() - C2625d.this.f10275a, false);
            }
        }
    }

    /* renamed from: j */
    private void m11096j(View view, C2630e eVar) {
        if (view != null) {
            int height = view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewProperty.TRANSLATION_Y, new float[]{view.getTranslationY(), (float) height})});
            ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
            ofPropertyValuesHolder.addListener(eVar);
            ofPropertyValuesHolder.setDuration(200);
            ofPropertyValuesHolder.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m11097k(View view, int i, int i2, boolean z, C2631f fVar, C2632g gVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(350);
        ofInt.setInterpolator(EaseManager.getInterpolator(0, 0.88f, 0.7f));
        ofInt.addUpdateListener(gVar);
        ofInt.addListener(fVar);
        ofInt.start();
        f10274b = new WeakReference<>(ofInt);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m11098l(View view, int i, boolean z) {
        if (z) {
            view.animate().cancel();
            view.animate().setDuration(100).translationY((float) i).start();
            return;
        }
        view.animate().cancel();
        view.setTranslationY((float) i);
    }

    /* renamed from: a */
    public void mo9885a() {
        ValueAnimator valueAnimator;
        WeakReference<ValueAnimator> weakReference = f10274b;
        if (weakReference != null && (valueAnimator = weakReference.get()) != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: b */
    public void mo9886b(View view, View view2, boolean z, C2112p.C2116d dVar) {
        if (!"show".equals(view.getTag())) {
            this.f10275a = 0;
            int i = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            if (view.getScaleX() != 1.0f) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
            C2626a aVar = Build.VERSION.SDK_INT >= 30 ? new C2626a(view, view2, i) : null;
            if (view.getHeight() > 0) {
                view.addOnLayoutChangeListener(new C2627b(view, z, dVar, aVar));
                view.setVisibility(4);
                view.setAlpha(1.0f);
            } else {
                view.addOnLayoutChangeListener(new C2628c(z, dVar, aVar));
            }
            C2619a.m11079b(view2);
        }
    }

    /* renamed from: c */
    public void mo9887c(View view, View view2, C2583b.C2584a aVar) {
        if (!"hide".equals(view.getTag())) {
            m11096j(view, new C2630e(view, aVar));
            C2619a.m11078a(view2);
        }
    }
}
