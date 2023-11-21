package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C0727l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p063k.C1761a;
import p063k.C1772e;

/* renamed from: j0.l */
public abstract class C1710l implements Cloneable {

    /* renamed from: I */
    private static final int[] f6632I = {2, 1, 3, 4};

    /* renamed from: J */
    private static final C1700g f6633J = new C1711a();

    /* renamed from: K */
    private static ThreadLocal<C1761a<Animator, C1714d>> f6634K = new ThreadLocal<>();

    /* renamed from: A */
    private int f6635A = 0;

    /* renamed from: B */
    private boolean f6636B = false;

    /* renamed from: C */
    private boolean f6637C = false;

    /* renamed from: D */
    private ArrayList<C1716f> f6638D = null;

    /* renamed from: E */
    private ArrayList<Animator> f6639E = new ArrayList<>();

    /* renamed from: F */
    private C1715e f6640F;

    /* renamed from: G */
    private C1761a<String, String> f6641G;

    /* renamed from: H */
    private C1700g f6642H = f6633J;

    /* renamed from: d */
    private String f6643d = getClass().getName();

    /* renamed from: e */
    private long f6644e = -1;

    /* renamed from: f */
    long f6645f = -1;

    /* renamed from: g */
    private TimeInterpolator f6646g = null;

    /* renamed from: h */
    ArrayList<Integer> f6647h = new ArrayList<>();

    /* renamed from: i */
    ArrayList<View> f6648i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<String> f6649j = null;

    /* renamed from: k */
    private ArrayList<Class<?>> f6650k = null;

    /* renamed from: l */
    private ArrayList<Integer> f6651l = null;

    /* renamed from: m */
    private ArrayList<View> f6652m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f6653n = null;

    /* renamed from: o */
    private ArrayList<String> f6654o = null;

    /* renamed from: p */
    private ArrayList<Integer> f6655p = null;

    /* renamed from: q */
    private ArrayList<View> f6656q = null;

    /* renamed from: r */
    private ArrayList<Class<?>> f6657r = null;

    /* renamed from: s */
    private C1736t f6658s = new C1736t();

    /* renamed from: t */
    private C1736t f6659t = new C1736t();

    /* renamed from: u */
    C1729p f6660u = null;

    /* renamed from: v */
    private int[] f6661v = f6632I;

    /* renamed from: w */
    private ArrayList<C1735s> f6662w;

    /* renamed from: x */
    private ArrayList<C1735s> f6663x;

    /* renamed from: y */
    boolean f6664y = false;

    /* renamed from: z */
    ArrayList<Animator> f6665z = new ArrayList<>();

    /* renamed from: j0.l$a */
    class C1711a extends C1700g {
        C1711a() {
        }

        /* renamed from: a */
        public Path mo5914a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: j0.l$b */
    class C1712b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1761a f6666d;

        C1712b(C1761a aVar) {
            this.f6666d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6666d.remove(animator);
            C1710l.this.f6665z.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C1710l.this.f6665z.add(animator);
        }
    }

    /* renamed from: j0.l$c */
    class C1713c extends AnimatorListenerAdapter {
        C1713c() {
        }

        public void onAnimationEnd(Animator animator) {
            C1710l.this.mo5952p();
            animator.removeListener(this);
        }
    }

    /* renamed from: j0.l$d */
    private static class C1714d {

        /* renamed from: a */
        View f6669a;

        /* renamed from: b */
        String f6670b;

        /* renamed from: c */
        C1735s f6671c;

        /* renamed from: d */
        C1732p0 f6672d;

        /* renamed from: e */
        C1710l f6673e;

        C1714d(View view, String str, C1710l lVar, C1732p0 p0Var, C1735s sVar) {
            this.f6669a = view;
            this.f6670b = str;
            this.f6671c = sVar;
            this.f6672d = p0Var;
            this.f6673e = lVar;
        }
    }

    /* renamed from: j0.l$e */
    public static abstract class C1715e {
    }

    /* renamed from: j0.l$f */
    public interface C1716f {
        /* renamed from: a */
        void mo5913a(C1710l lVar);

        /* renamed from: b */
        void mo5898b(C1710l lVar);

        /* renamed from: c */
        void mo5899c(C1710l lVar);

        /* renamed from: d */
        void mo5900d(C1710l lVar);

        /* renamed from: e */
        void mo5901e(C1710l lVar);
    }

    /* renamed from: H */
    private static boolean m7112H(C1735s sVar, C1735s sVar2, String str) {
        Object obj = sVar.f6713a.get(str);
        Object obj2 = sVar2.f6713a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: I */
    private void m7113I(C1761a<View, C1735s> aVar, C1761a<View, C1735s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo5927G(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo5927G(view)) {
                C1735s sVar = aVar.get(valueAt);
                C1735s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f6662w.add(sVar);
                    this.f6663x.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: J */
    private void m7114J(C1761a<View, C1735s> aVar, C1761a<View, C1735s> aVar2) {
        C1735s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo6161i(size);
            if (i != null && mo5927G(i) && (remove = aVar2.remove(i)) != null && mo5927G(remove.f6714b)) {
                this.f6662w.add(aVar.mo6164k(size));
                this.f6663x.add(remove);
            }
        }
    }

    /* renamed from: K */
    private void m7115K(C1761a<View, C1735s> aVar, C1761a<View, C1735s> aVar2, C1772e<View> eVar, C1772e<View> eVar2) {
        View d;
        int k = eVar.mo6139k();
        for (int i = 0; i < k; i++) {
            View l = eVar.mo6140l(i);
            if (l != null && mo5927G(l) && (d = eVar2.mo6132d(eVar.mo6135g(i))) != null && mo5927G(d)) {
                C1735s sVar = aVar.get(l);
                C1735s sVar2 = aVar2.get(d);
                if (!(sVar == null || sVar2 == null)) {
                    this.f6662w.add(sVar);
                    this.f6663x.add(sVar2);
                    aVar.remove(l);
                    aVar2.remove(d);
                }
            }
        }
    }

    /* renamed from: L */
    private void m7116L(C1761a<View, C1735s> aVar, C1761a<View, C1735s> aVar2, C1761a<String, View> aVar3, C1761a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo6166m(i);
            if (m != null && mo5927G(m) && (view = aVar4.get(aVar3.mo6161i(i))) != null && mo5927G(view)) {
                C1735s sVar = aVar.get(m);
                C1735s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f6662w.add(sVar);
                    this.f6663x.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m7117M(C1736t tVar, C1736t tVar2) {
        C1761a aVar = new C1761a(tVar.f6716a);
        C1761a aVar2 = new C1761a(tVar2.f6716a);
        int i = 0;
        while (true) {
            int[] iArr = this.f6661v;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m7114J(aVar, aVar2);
                } else if (i2 == 2) {
                    m7116L(aVar, aVar2, tVar.f6719d, tVar2.f6719d);
                } else if (i2 == 3) {
                    m7113I(aVar, aVar2, tVar.f6717b, tVar2.f6717b);
                } else if (i2 == 4) {
                    m7115K(aVar, aVar2, tVar.f6718c, tVar2.f6718c);
                }
                i++;
            } else {
                m7119c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: S */
    private void m7118S(Animator animator, C1761a<Animator, C1714d> aVar) {
        if (animator != null) {
            animator.addListener(new C1712b(aVar));
            mo5945e(animator);
        }
    }

    /* renamed from: c */
    private void m7119c(C1761a<View, C1735s> aVar, C1761a<View, C1735s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1735s m = aVar.mo6166m(i);
            if (mo5927G(m.f6714b)) {
                this.f6662w.add(m);
                this.f6663x.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1735s m2 = aVar2.mo6166m(i2);
            if (mo5927G(m2.f6714b)) {
                this.f6663x.add(m2);
                this.f6662w.add((Object) null);
            }
        }
    }

    /* renamed from: d */
    private static void m7120d(C1736t tVar, View view, C1735s sVar) {
        tVar.f6716a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f6717b.indexOfKey(id) >= 0) {
                tVar.f6717b.put(id, (Object) null);
            } else {
                tVar.f6717b.put(id, view);
            }
        }
        String C = C0727l0.m2853C(view);
        if (C != null) {
            if (tVar.f6719d.containsKey(C)) {
                tVar.f6719d.put(C, null);
            } else {
                tVar.f6719d.put(C, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f6718c.mo6134f(itemIdAtPosition) >= 0) {
                    View d = tVar.f6718c.mo6132d(itemIdAtPosition);
                    if (d != null) {
                        C0727l0.m2890g0(d, false);
                        tVar.f6718c.mo6136h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0727l0.m2890g0(view, true);
                tVar.f6718c.mo6136h(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    private void m7121h(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f6651l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f6652m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f6653n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f6653n.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1735s sVar = new C1735s(view);
                        if (z) {
                            mo5869j(sVar);
                        } else {
                            mo5868g(sVar);
                        }
                        sVar.f6715c.add(this);
                        mo5947i(sVar);
                        m7120d(z ? this.f6658s : this.f6659t, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f6655p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f6656q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f6657r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f6657r.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m7121h(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    private static C1761a<Animator, C1714d> m7122x() {
        C1761a<Animator, C1714d> aVar = f6634K.get();
        if (aVar != null) {
            return aVar;
        }
        C1761a<Animator, C1714d> aVar2 = new C1761a<>();
        f6634K.set(aVar2);
        return aVar2;
    }

    /* renamed from: A */
    public List<String> mo5922A() {
        return this.f6649j;
    }

    /* renamed from: B */
    public List<Class<?>> mo5923B() {
        return this.f6650k;
    }

    /* renamed from: C */
    public List<View> mo5924C() {
        return this.f6648i;
    }

    /* renamed from: D */
    public String[] mo5867D() {
        return null;
    }

    /* renamed from: E */
    public C1735s mo5925E(View view, boolean z) {
        C1729p pVar = this.f6660u;
        if (pVar != null) {
            return pVar.mo5925E(view, z);
        }
        return (z ? this.f6658s : this.f6659t).f6716a.get(view);
    }

    /* renamed from: F */
    public boolean mo5926F(C1735s sVar, C1735s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] D = mo5867D();
        if (D != null) {
            int length = D.length;
            int i = 0;
            while (i < length) {
                if (!m7112H(sVar, sVar2, D[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String H : sVar.f6713a.keySet()) {
            if (m7112H(sVar, sVar2, H)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo5927G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f6651l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6652m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6653n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f6653n.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6654o != null && C0727l0.m2853C(view) != null && this.f6654o.contains(C0727l0.m2853C(view))) {
            return false;
        }
        if ((this.f6647h.size() == 0 && this.f6648i.size() == 0 && (((arrayList = this.f6650k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6649j) == null || arrayList2.isEmpty()))) || this.f6647h.contains(Integer.valueOf(id)) || this.f6648i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6649j;
        if (arrayList6 != null && arrayList6.contains(C0727l0.m2853C(view))) {
            return true;
        }
        if (this.f6650k != null) {
            for (int i2 = 0; i2 < this.f6650k.size(); i2++) {
                if (this.f6650k.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: N */
    public void mo5928N(View view) {
        if (!this.f6637C) {
            for (int size = this.f6665z.size() - 1; size >= 0; size--) {
                C1667a.m7014b(this.f6665z.get(size));
            }
            ArrayList<C1716f> arrayList = this.f6638D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6638D.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((C1716f) arrayList2.get(i)).mo5901e(this);
                }
            }
            this.f6636B = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo5929O(ViewGroup viewGroup) {
        C1714d dVar;
        this.f6662w = new ArrayList<>();
        this.f6663x = new ArrayList<>();
        m7117M(this.f6658s, this.f6659t);
        C1761a<Animator, C1714d> x = m7122x();
        int size = x.size();
        C1732p0 d = C1668a0.m7019d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = x.mo6161i(i);
            if (!(i2 == null || (dVar = x.get(i2)) == null || dVar.f6669a == null || !d.equals(dVar.f6672d))) {
                C1735s sVar = dVar.f6671c;
                View view = dVar.f6669a;
                C1735s E = mo5925E(view, true);
                C1735s t = mo5956t(view, true);
                if (E == null && t == null) {
                    t = this.f6659t.f6716a.get(view);
                }
                if (!(E == null && t == null) && dVar.f6673e.mo5926F(sVar, t)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        x.remove(i2);
                    }
                }
            }
        }
        mo5951o(viewGroup, this.f6658s, this.f6659t, this.f6662w, this.f6663x);
        mo5933T();
    }

    /* renamed from: P */
    public C1710l mo5930P(C1716f fVar) {
        ArrayList<C1716f> arrayList = this.f6638D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f6638D.size() == 0) {
            this.f6638D = null;
        }
        return this;
    }

    /* renamed from: Q */
    public C1710l mo5931Q(View view) {
        this.f6648i.remove(view);
        return this;
    }

    /* renamed from: R */
    public void mo5932R(View view) {
        if (this.f6636B) {
            if (!this.f6637C) {
                for (int size = this.f6665z.size() - 1; size >= 0; size--) {
                    C1667a.m7015c(this.f6665z.get(size));
                }
                ArrayList<C1716f> arrayList = this.f6638D;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6638D.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((C1716f) arrayList2.get(i)).mo5898b(this);
                    }
                }
            }
            this.f6636B = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo5933T() {
        mo5941a0();
        C1761a<Animator, C1714d> x = m7122x();
        Iterator<Animator> it = this.f6639E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (x.containsKey(next)) {
                mo5941a0();
                m7118S(next, x);
            }
        }
        this.f6639E.clear();
        mo5952p();
    }

    /* renamed from: U */
    public C1710l mo5934U(long j) {
        this.f6645f = j;
        return this;
    }

    /* renamed from: V */
    public void mo5935V(C1715e eVar) {
        this.f6640F = eVar;
    }

    /* renamed from: W */
    public C1710l mo5936W(TimeInterpolator timeInterpolator) {
        this.f6646g = timeInterpolator;
        return this;
    }

    /* renamed from: X */
    public void mo5937X(C1700g gVar) {
        if (gVar == null) {
            gVar = f6633J;
        }
        this.f6642H = gVar;
    }

    /* renamed from: Y */
    public void mo5938Y(C1727o oVar) {
    }

    /* renamed from: Z */
    public C1710l mo5939Z(long j) {
        this.f6644e = j;
        return this;
    }

    /* renamed from: a */
    public C1710l mo5940a(C1716f fVar) {
        if (this.f6638D == null) {
            this.f6638D = new ArrayList<>();
        }
        this.f6638D.add(fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo5941a0() {
        if (this.f6635A == 0) {
            ArrayList<C1716f> arrayList = this.f6638D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6638D.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1716f) arrayList2.get(i)).mo5913a(this);
                }
            }
            this.f6637C = false;
        }
        this.f6635A++;
    }

    /* renamed from: b */
    public C1710l mo5942b(View view) {
        this.f6648i.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public String mo5943b0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6645f != -1) {
            str2 = str2 + "dur(" + this.f6645f + ") ";
        }
        if (this.f6644e != -1) {
            str2 = str2 + "dly(" + this.f6644e + ") ";
        }
        if (this.f6646g != null) {
            str2 = str2 + "interp(" + this.f6646g + ") ";
        }
        if (this.f6647h.size() <= 0 && this.f6648i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6647h.size() > 0) {
            for (int i = 0; i < this.f6647h.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6647h.get(i);
            }
        }
        if (this.f6648i.size() > 0) {
            for (int i2 = 0; i2 < this.f6648i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6648i.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo5945e(Animator animator) {
        if (animator == null) {
            mo5952p();
            return;
        }
        if (mo5953q() >= 0) {
            animator.setDuration(mo5953q());
        }
        if (mo5961y() >= 0) {
            animator.setStartDelay(mo5961y() + animator.getStartDelay());
        }
        if (mo5955s() != null) {
            animator.setInterpolator(mo5955s());
        }
        animator.addListener(new C1713c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo5946f() {
        for (int size = this.f6665z.size() - 1; size >= 0; size--) {
            this.f6665z.get(size).cancel();
        }
        ArrayList<C1716f> arrayList = this.f6638D;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6638D.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1716f) arrayList2.get(i)).mo5900d(this);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo5868g(C1735s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5947i(C1735s sVar) {
    }

    /* renamed from: j */
    public abstract void mo5869j(C1735s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5948k(ViewGroup viewGroup, boolean z) {
        C1761a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo5949l(z);
        if ((this.f6647h.size() > 0 || this.f6648i.size() > 0) && (((arrayList = this.f6649j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6650k) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f6647h.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f6647h.get(i).intValue());
                if (findViewById != null) {
                    C1735s sVar = new C1735s(findViewById);
                    if (z) {
                        mo5869j(sVar);
                    } else {
                        mo5868g(sVar);
                    }
                    sVar.f6715c.add(this);
                    mo5947i(sVar);
                    m7120d(z ? this.f6658s : this.f6659t, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f6648i.size(); i2++) {
                View view = this.f6648i.get(i2);
                C1735s sVar2 = new C1735s(view);
                if (z) {
                    mo5869j(sVar2);
                } else {
                    mo5868g(sVar2);
                }
                sVar2.f6715c.add(this);
                mo5947i(sVar2);
                m7120d(z ? this.f6658s : this.f6659t, view, sVar2);
            }
        } else {
            m7121h(viewGroup, z);
        }
        if (!z && (aVar = this.f6641G) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f6658s.f6719d.remove(this.f6641G.mo6161i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f6658s.f6719d.put(this.f6641G.mo6166m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5949l(boolean z) {
        C1736t tVar;
        if (z) {
            this.f6658s.f6716a.clear();
            this.f6658s.f6717b.clear();
            tVar = this.f6658s;
        } else {
            this.f6659t.f6716a.clear();
            this.f6659t.f6717b.clear();
            tVar = this.f6659t;
        }
        tVar.f6718c.mo6129a();
    }

    /* renamed from: m */
    public C1710l clone() {
        try {
            C1710l lVar = (C1710l) super.clone();
            lVar.f6639E = new ArrayList<>();
            lVar.f6658s = new C1736t();
            lVar.f6659t = new C1736t();
            lVar.f6662w = null;
            lVar.f6663x = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo5870n(ViewGroup viewGroup, C1735s sVar, C1735s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5951o(ViewGroup viewGroup, C1736t tVar, C1736t tVar2, ArrayList<C1735s> arrayList, ArrayList<C1735s> arrayList2) {
        int i;
        Animator animator;
        C1735s sVar;
        View view;
        C1735s sVar2;
        Animator animator2;
        C1761a<Animator, C1714d> x = m7122x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1735s sVar3 = arrayList.get(i2);
            C1735s sVar4 = arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f6715c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f6715c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo5926F(sVar3, sVar4)) {
                    Animator n = mo5870n(viewGroup, sVar3, sVar4);
                    if (n != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f6714b;
                            String[] D = mo5867D();
                            if (D != null && D.length > 0) {
                                sVar2 = new C1735s(view2);
                                C1735s sVar5 = tVar2.f6716a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < D.length) {
                                        Map<String, Object> map = sVar2.f6713a;
                                        Animator animator3 = n;
                                        String str = D[i3];
                                        map.put(str, sVar5.f6713a.get(str));
                                        i3++;
                                        n = animator3;
                                        D = D;
                                    }
                                }
                                Animator animator4 = n;
                                int size2 = x.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    C1714d dVar = x.get(x.mo6161i(i4));
                                    if (dVar.f6671c != null && dVar.f6669a == view2 && dVar.f6670b.equals(mo5958u()) && dVar.f6671c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                C1736t tVar3 = tVar2;
                                animator2 = n;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            C1736t tVar4 = tVar2;
                            view = sVar3.f6714b;
                            animator = n;
                            sVar = null;
                        }
                        if (animator != null) {
                            i = size;
                            C1714d dVar2 = r0;
                            C1714d dVar3 = new C1714d(view, mo5958u(), this, C1668a0.m7019d(viewGroup), sVar);
                            x.put(animator, dVar2);
                            this.f6639E.add(animator);
                            i2++;
                            size = i;
                        }
                        i = size;
                        i2++;
                        size = i;
                    }
                    C1736t tVar5 = tVar2;
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            C1736t tVar52 = tVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.f6639E.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo5952p() {
        int i = this.f6635A - 1;
        this.f6635A = i;
        if (i == 0) {
            ArrayList<C1716f> arrayList = this.f6638D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6638D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1716f) arrayList2.get(i2)).mo5899c(this);
                }
            }
            for (int i3 = 0; i3 < this.f6658s.f6718c.mo6139k(); i3++) {
                View l = this.f6658s.f6718c.mo6140l(i3);
                if (l != null) {
                    C0727l0.m2890g0(l, false);
                }
            }
            for (int i4 = 0; i4 < this.f6659t.f6718c.mo6139k(); i4++) {
                View l2 = this.f6659t.f6718c.mo6140l(i4);
                if (l2 != null) {
                    C0727l0.m2890g0(l2, false);
                }
            }
            this.f6637C = true;
        }
    }

    /* renamed from: q */
    public long mo5953q() {
        return this.f6645f;
    }

    /* renamed from: r */
    public C1715e mo5954r() {
        return this.f6640F;
    }

    /* renamed from: s */
    public TimeInterpolator mo5955s() {
        return this.f6646g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1735s mo5956t(View view, boolean z) {
        C1729p pVar = this.f6660u;
        if (pVar != null) {
            return pVar.mo5956t(view, z);
        }
        ArrayList<C1735s> arrayList = z ? this.f6662w : this.f6663x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1735s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f6714b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f6663x : this.f6662w).get(i);
    }

    public String toString() {
        return mo5943b0("");
    }

    /* renamed from: u */
    public String mo5958u() {
        return this.f6643d;
    }

    /* renamed from: v */
    public C1700g mo5959v() {
        return this.f6642H;
    }

    /* renamed from: w */
    public C1727o mo5960w() {
        return null;
    }

    /* renamed from: y */
    public long mo5961y() {
        return this.f6644e;
    }

    /* renamed from: z */
    public List<Integer> mo5962z() {
        return this.f6647h;
    }
}
