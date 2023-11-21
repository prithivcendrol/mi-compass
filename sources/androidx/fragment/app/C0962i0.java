package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p008os.C0578e;
import androidx.core.view.C0714i0;
import androidx.core.view.C0727l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.i0 */
public abstract class C0962i0 {

    /* renamed from: androidx.fragment.app.i0$a */
    class C0963a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f3297d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3298e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3299f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3300g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3301h;

        C0963a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3297d = i;
            this.f3298e = arrayList;
            this.f3299f = arrayList2;
            this.f3300g = arrayList3;
            this.f3301h = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3297d; i++) {
                C0727l0.m2908p0((View) this.f3298e.get(i), (String) this.f3299f.get(i));
                C0727l0.m2908p0((View) this.f3300g.get(i), (String) this.f3301h.get(i));
            }
        }
    }

    /* renamed from: d */
    protected static void m3960d(List<View> list, View view) {
        int size = list.size();
        if (!m3961g(list, view, size)) {
            if (C0727l0.m2853C(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3961g(list, childAt, size) && C0727l0.m2853C(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m3961g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    protected static boolean m3962i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo3566a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3567b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3568c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3569e(Object obj);

    /* renamed from: f */
    public abstract Object mo3570f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3599h(View view, Rect rect) {
        if (C0727l0.m2859I(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo3571j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo3572k(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ArrayList<String> mo3600l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0727l0.m2853C(view));
            C0727l0.m2908p0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo3573m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo3574n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo3575o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo3576p(Object obj, View view);

    /* renamed from: q */
    public void mo3577q(Fragment fragment, Object obj, C0578e eVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3601r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String C = C0727l0.m2853C(view2);
            arrayList4.add(C);
            if (C != null) {
                C0727l0.m2908p0(view2, (String) null);
                String str = map.get(C);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0727l0.m2908p0(arrayList2.get(i2), C);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0714i0.m2834a(view, new C0963a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo3578s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo3579t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo3580u(Object obj);
}
