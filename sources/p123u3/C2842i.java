package p123u3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0385r1;
import androidx.fragment.app.C0941e;
import androidx.fragment.app.C0964j;
import androidx.fragment.app.Fragment;
import androidx.preference.C1122h;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.C2071a;
import miuix.appcompat.app.C2118q;
import miuix.appcompat.app.C2132x;
import miuix.appcompat.internal.app.widget.C2191h;
import miuix.preference.RadioSetPreferenceCategory;
import miuix.smooth.C2385c;
import miuix.springback.view.SpringBackLayout;
import p055i3.C1649c;
import p073l3.C1878b;
import p078m2.C1925e;
import p117t2.C2693a;
import p117t2.C2711k;

/* renamed from: u3.i */
public abstract class C2842i extends C1122h implements C2132x {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f10639A0 = 0;

    /* renamed from: B0 */
    private boolean f10640B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public int f10641C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public int f10642D0;

    /* renamed from: o0 */
    private boolean f10643o0 = false;

    /* renamed from: p0 */
    protected Rect f10644p0;

    /* renamed from: q0 */
    private View f10645q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public RecyclerView.C1177m f10646r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C2847j f10647s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C2845c f10648t0;

    /* renamed from: u0 */
    private int f10649u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public boolean f10650v0 = true;

    /* renamed from: w0 */
    private boolean f10651w0 = false;

    /* renamed from: x0 */
    private int f10652x0 = -1;

    /* renamed from: y0 */
    private boolean f10653y0 = true;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public C1925e f10654z0;

    /* renamed from: u3.i$a */
    class C2843a implements View.OnLayoutChangeListener {
        C2843a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11793b(RecyclerView recyclerView) {
            recyclerView.setItemAnimator(C2842i.this.f10646r0);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Resources a0 = C2842i.this.mo3262a0();
            C2711k h = C2693a.m11239h(C2842i.this.mo3199B(), a0.getConfiguration());
            float f = a0.getDisplayMetrics().density;
            int unused = C2842i.this.f10641C0 = h.f10510d.x;
            int unused2 = C2842i.this.f10642D0 = h.f10510d.y;
            if (C2842i.this.f10648t0 != null) {
                C2842i.this.f10648t0.mo10116w(h.f10509c.y);
            }
            if (C2842i.this.f10654z0 != null) {
                boolean G = C2842i.this.mo10110G();
                C2842i.this.f10654z0.mo6504j(C2842i.this.f10641C0, C2842i.this.f10642D0, i3 - i, i4 - i2, f, G);
                if (C2842i.this.f10654z0.mo6503i()) {
                    C2842i iVar = C2842i.this;
                    int unused3 = iVar.f10639A0 = (int) (((float) iVar.f10654z0.mo6500f()) * f);
                } else {
                    int unused4 = C2842i.this.f10639A0 = 0;
                }
                if (C2842i.this.f10647s0 != null && C2842i.this.f10647s0.mo10127a0(C2842i.this.f10639A0)) {
                    RecyclerView X1 = C2842i.this.mo4064X1();
                    if (X1 != null) {
                        X1.setItemAnimator((RecyclerView.C1177m) null);
                    }
                    C2842i.this.f10647s0.mo4497l();
                    if (X1 != null) {
                        X1.post(new C2841h(this, X1));
                    }
                }
            }
        }
    }

    /* renamed from: u3.i$b */
    class C2844b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1183p f10656d;

        /* renamed from: e */
        final /* synthetic */ int f10657e;

        /* renamed from: f */
        final /* synthetic */ int f10658f;

        C2844b(RecyclerView.C1183p pVar, int i, int i2) {
            this.f10656d = pVar;
            this.f10657e = i;
            this.f10658f = i2;
        }

        public void onGlobalLayout() {
            if (this.f10656d.mo4562I(0) != null) {
                ((LinearLayoutManager) this.f10656d).mo4207u2(this.f10657e, this.f10658f);
                C2842i.this.mo4064X1().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: u3.i$c */
    private class C2845c extends RecyclerView.C1182o {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Paint f10660a;

        /* renamed from: b */
        private Paint f10661b;

        /* renamed from: c */
        private int f10662c;

        /* renamed from: d */
        private boolean f10663d;

        /* renamed from: e */
        private Pair<Integer, Integer> f10664e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f10665f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f10666g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f10667h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f10668i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f10669j;

        /* renamed from: k */
        private C2846d f10670k;

        /* renamed from: l */
        private Map<Integer, C2846d> f10671l;

        /* renamed from: m */
        private int f10672m;

        private C2845c(Context context) {
            this.f10663d = false;
            mo10114t(context);
            this.f10660a = new Paint();
            mo10115u();
            this.f10660a.setAntiAlias(true);
            Paint paint = new Paint();
            this.f10661b = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            int e = C1649c.m6960e(context, C2850k.f10719b);
            this.f10662c = e;
            this.f10661b.setColor(e);
            this.f10661b.setAntiAlias(true);
            this.f10671l = new HashMap();
        }

        /* synthetic */ C2845c(C2842i iVar, Context context, C2843a aVar) {
            this(context);
        }

        /* renamed from: p */
        private boolean m11800p(RecyclerView recyclerView, int i, int i2) {
            int i3 = i + 1;
            if (i3 >= i2) {
                return false;
            }
            return !(C2842i.this.f10647s0.mo4089C(recyclerView.mo4272c0(recyclerView.getChildAt(i3))) instanceof RadioSetPreferenceCategory);
        }

        /* renamed from: q */
        private void m11801q(Canvas canvas, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            if (!C2842i.this.f10650v0) {
                float f = (float) i2;
                float f2 = (float) i4;
                RectF rectF = new RectF((float) i, f, (float) i3, f2);
                RectF rectF2 = new RectF((float) (i + (z3 ? this.f10668i : this.f10667h) + C2842i.this.f10639A0), f, (float) (i3 - ((z3 ? this.f10667h : this.f10668i) + C2842i.this.f10639A0)), f2);
                Path path = new Path();
                float f3 = 0.0f;
                float f4 = z ? (float) this.f10669j : 0.0f;
                if (z2) {
                    f3 = (float) this.f10669j;
                }
                path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f3, f3, f3, f3}, Path.Direction.CW);
                int saveLayer = canvas.saveLayer(rectF, this.f10660a, 31);
                canvas.drawRect(rectF, this.f10660a);
                canvas.drawPath(path, this.f10661b);
                canvas.restoreToCount(saveLayer);
            }
        }

        /* renamed from: r */
        private void m11802r(Canvas canvas, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
            PorterDuffXfermode porterDuffXfermode;
            if (!C2842i.this.f10650v0) {
                float f = (float) i2;
                float f2 = (float) i4;
                RectF rectF = new RectF((float) i, f, (float) i3, f2);
                RectF rectF2 = new RectF((float) (i + (z4 ? this.f10668i : this.f10667h) + C2842i.this.f10639A0), f, (float) (i3 - ((z4 ? this.f10667h : this.f10668i) + C2842i.this.f10639A0)), f2);
                Path path = new Path();
                float f3 = 0.0f;
                float f4 = z ? (float) this.f10669j : 0.0f;
                if (z2) {
                    f3 = (float) this.f10669j;
                }
                path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f3, f3, f3, f3}, Path.Direction.CW);
                int saveLayer = canvas.saveLayer(rectF, this.f10660a, 31);
                canvas.drawRect(rectF, this.f10660a);
                Paint paint = this.f10660a;
                if (z3) {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC;
                } else {
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
                }
                paint.setXfermode(porterDuffXfermode);
                canvas.drawPath(path, this.f10660a);
                this.f10660a.setXfermode((Xfermode) null);
                canvas.restoreToCount(saveLayer);
            }
        }

        /* renamed from: s */
        private int m11803s(RecyclerView recyclerView, View view, int i, int i2, boolean z) {
            View childAt;
            if (!z) {
                for (int i3 = i - 1; i3 > i2; i3--) {
                    View childAt2 = recyclerView.getChildAt(i3);
                    if (childAt2 != null) {
                        return ((int) childAt2.getY()) + childAt2.getHeight();
                    }
                }
            } else if (view == null || view.getBottom() + view.getHeight() >= this.f10672m) {
                return -1;
            } else {
                do {
                    i++;
                    if (i < i2) {
                        childAt = recyclerView.getChildAt(i);
                    }
                } while (childAt == null);
                return (int) childAt.getY();
            }
            return -1;
        }

        /* renamed from: v */
        private void m11804v(RecyclerView recyclerView, C2846d dVar) {
            C2846d dVar2 = dVar;
            int size = dVar2.f10674a.size();
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                int intValue = dVar2.f10674a.get(i5).intValue();
                View childAt = recyclerView.getChildAt(intValue);
                if (childAt != null) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int y = (int) childAt.getY();
                    int height = y + childAt.getHeight();
                    if (i5 == 0) {
                        i4 = bottom;
                        i2 = height;
                        i = y;
                        i3 = top;
                    }
                    if (i3 > top) {
                        i3 = top;
                    }
                    if (i4 < bottom) {
                        i4 = bottom;
                    }
                    if (i > y) {
                        i = y;
                    }
                    if (i2 < height) {
                        i2 = height;
                    }
                    if (dVar2.f10679f == intValue) {
                        int y2 = (int) childAt.getY();
                        dVar2.f10677d = new int[]{y2, childAt.getHeight() + y2};
                    }
                }
            }
            if (dVar2.f10677d == null) {
                dVar2.f10677d = new int[]{i, i2};
            }
            int i6 = dVar2.f10681h;
            if (i6 != -1 && i6 > dVar2.f10680g) {
                i2 = i6 - this.f10666g;
            }
            int i7 = dVar2.f10680g;
            if (i7 != -1 && i7 < i6) {
                i = i7 + this.f10665f;
            }
            dVar2.f10676c = new int[]{i3, i4};
            dVar2.f10675b = new int[]{i, i2};
        }

        /* renamed from: e */
        public void mo4081e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
            int c0;
            Preference C;
            if (!C2842i.this.f10650v0 && (C = C2842i.this.f10647s0.mo4089C(c0)) != null && (C.mo3971u() instanceof RadioSetPreferenceCategory)) {
                boolean b = C0385r1.m1722b(recyclerView);
                int scrollBarSize = recyclerView.getScrollBarSize();
                if (b) {
                    rect.left = scrollBarSize;
                } else {
                    rect.right = scrollBarSize;
                }
                int S = C2842i.this.f10647s0.mo10121S((c0 = recyclerView.mo4272c0(view)));
                if (S == 1) {
                    rect.top += this.f10665f;
                } else if (S == 2) {
                    rect.top += this.f10665f;
                    return;
                } else if (S != 4) {
                    return;
                }
                rect.bottom += this.f10666g;
            }
        }

        /* renamed from: g */
        public void mo4544g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
            Preference preference;
            int i;
            C2846d dVar;
            RecyclerView recyclerView2 = recyclerView;
            super.mo4544g(canvas, recyclerView, b0Var);
            if (!C2842i.this.f10650v0) {
                this.f10671l.clear();
                int childCount = recyclerView.getChildCount();
                this.f10663d = C0385r1.m1722b(recyclerView);
                Pair<Integer, Integer> R = C2842i.this.f10647s0.mo10120R(recyclerView2, this.f10663d);
                this.f10664e = R;
                int intValue = ((Integer) R.first).intValue();
                int intValue2 = ((Integer) this.f10664e.second).intValue();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView2.getChildAt(i2);
                    int c0 = recyclerView2.mo4272c0(childAt);
                    Preference C = C2842i.this.f10647s0.mo4089C(c0);
                    if (C != null && (C.mo3971u() instanceof RadioSetPreferenceCategory)) {
                        RadioSetPreferenceCategory radioSetPreferenceCategory = (RadioSetPreferenceCategory) C.mo3971u();
                        int S = C2842i.this.f10647s0.mo10121S(c0);
                        if (S == 1 || S == 2) {
                            C2846d dVar2 = new C2846d(C2842i.this, (C2843a) null);
                            this.f10670k = dVar2;
                            dVar2.f10684k |= 1;
                            dVar2.f10683j = true;
                            i = S;
                            preference = C;
                            dVar2.f10680g = m11803s(recyclerView, childAt, i2, 0, false);
                            this.f10670k.mo10117a(i2);
                        } else {
                            i = S;
                            preference = C;
                        }
                        if (i == 4 || i == 3) {
                            C2846d dVar3 = this.f10670k;
                            if (dVar3 == null) {
                                dVar3 = new C2846d(C2842i.this, (C2843a) null);
                                this.f10670k = dVar3;
                            }
                            dVar3.mo10117a(i2);
                            this.f10670k.f10684k |= 2;
                        }
                        if (radioSetPreferenceCategory.mo9035V0() == preference && (dVar = this.f10670k) != null) {
                            dVar.f10679f = i2;
                        }
                        C2846d dVar4 = this.f10670k;
                        if (dVar4 != null && (i == 1 || i == 4)) {
                            dVar4.f10681h = m11803s(recyclerView, childAt, i2, childCount, true);
                            this.f10670k.f10678e = this.f10671l.size();
                            this.f10670k.f10682i = m11800p(recyclerView2, i2, childCount);
                            C2846d dVar5 = this.f10670k;
                            dVar5.f10684k |= 4;
                            this.f10671l.put(Integer.valueOf(dVar5.f10678e), this.f10670k);
                            this.f10670k = null;
                        }
                    }
                }
                C2846d dVar6 = this.f10670k;
                if (dVar6 != null && dVar6.f10674a.size() > 0) {
                    C2846d dVar7 = this.f10670k;
                    dVar7.f10681h = -1;
                    dVar7.f10678e = this.f10671l.size();
                    C2846d dVar8 = this.f10670k;
                    dVar8.f10682i = false;
                    this.f10671l.put(Integer.valueOf(dVar8.f10678e), this.f10670k);
                    this.f10670k = null;
                }
                Map<Integer, C2846d> map = this.f10671l;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<Integer, C2846d> value : this.f10671l.entrySet()) {
                        m11804v(recyclerView2, (C2846d) value.getValue());
                    }
                    for (Map.Entry<Integer, C2846d> value2 : this.f10671l.entrySet()) {
                        C2846d dVar9 = (C2846d) value2.getValue();
                        int[] iArr = dVar9.f10675b;
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int i5 = dVar9.f10684k;
                        m11801q(canvas, intValue, i3, intValue2, i4, (i5 & 1) != 0, (i5 & 4) != 0, this.f10663d);
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo4082i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
            if (!C2842i.this.f10650v0) {
                int intValue = ((Integer) this.f10664e.first).intValue();
                int intValue2 = ((Integer) this.f10664e.second).intValue();
                Map<Integer, C2846d> map = this.f10671l;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<Integer, C2846d> value : this.f10671l.entrySet()) {
                        C2846d dVar = (C2846d) value.getValue();
                        int[] iArr = dVar.f10675b;
                        int i = iArr[0];
                        int i2 = iArr[1];
                        Canvas canvas2 = canvas;
                        int i3 = intValue;
                        int i4 = intValue2;
                        m11802r(canvas2, i3, i - this.f10665f, i4, i, false, false, true, this.f10663d);
                        m11802r(canvas2, i3, i2, i4, i2 + this.f10666g, false, false, true, this.f10663d);
                        int i5 = dVar.f10684k;
                        m11802r(canvas, intValue, i, intValue2, i2, (i5 & 1) != 0, (i5 & 4) != 0, false, this.f10663d);
                    }
                }
            }
        }

        /* renamed from: t */
        public void mo10114t(Context context) {
            this.f10665f = context.getResources().getDimensionPixelSize(C2851l.f10739b);
            this.f10666g = context.getResources().getDimensionPixelSize(C2851l.f10738a);
            this.f10667h = C1649c.m6962g(context, C2850k.f10725h);
            this.f10668i = C1649c.m6962g(context, C2850k.f10726i);
            this.f10669j = context.getResources().getDimensionPixelSize(C2851l.f10740c);
        }

        /* renamed from: u */
        public void mo10115u() {
            int i;
            Context context;
            Paint paint;
            if (!(C2842i.this.mo3306t() instanceof C2118q) || ((C2118q) C2842i.this.mo3306t()).mo7562G()) {
                paint = this.f10660a;
                context = C2842i.this.mo3199B();
                i = C2850k.f10727j;
            } else {
                paint = this.f10660a;
                context = C2842i.this.mo3199B();
                i = C2850k.f10729l;
            }
            paint.setColor(C1649c.m6960e(context, i));
        }

        /* renamed from: w */
        public void mo10116w(int i) {
            this.f10672m = i;
        }
    }

    /* renamed from: u3.i$d */
    private class C2846d {

        /* renamed from: a */
        public List<Integer> f10674a;

        /* renamed from: b */
        public int[] f10675b;

        /* renamed from: c */
        public int[] f10676c;

        /* renamed from: d */
        public int[] f10677d;

        /* renamed from: e */
        public int f10678e;

        /* renamed from: f */
        public int f10679f;

        /* renamed from: g */
        public int f10680g;

        /* renamed from: h */
        public int f10681h;

        /* renamed from: i */
        public boolean f10682i;

        /* renamed from: j */
        public boolean f10683j;

        /* renamed from: k */
        public int f10684k;

        private C2846d() {
            this.f10674a = new ArrayList();
            this.f10675b = null;
            this.f10676c = null;
            this.f10677d = null;
            this.f10678e = 0;
            this.f10679f = -1;
            this.f10680g = -1;
            this.f10681h = -1;
            this.f10682i = false;
            this.f10683j = false;
            this.f10684k = 0;
        }

        /* synthetic */ C2846d(C2842i iVar, C2843a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo10117a(int i) {
            this.f10674a.add(Integer.valueOf(i));
        }

        public String toString() {
            return "PreferenceGroupRect{preferenceList=" + this.f10674a + ", currentMovetb=" + Arrays.toString(this.f10675b) + ", currentEndtb=" + Arrays.toString(this.f10676c) + ", currentPrimetb=" + Arrays.toString(this.f10677d) + ", index=" + this.f10678e + ", primeIndex=" + this.f10679f + ", preViewHY=" + this.f10680g + ", nextViewY=" + this.f10681h + ", end=" + this.f10682i + '}';
        }
    }

    /* renamed from: D2 */
    private void m11757D2() {
        C2132x xVar;
        Fragment T = mo3247T();
        while (true) {
            if (T == null) {
                xVar = null;
                break;
            }
            if (T instanceof C2132x) {
                xVar = (C2132x) T;
                if (xVar.mo7639E()) {
                    break;
                }
            }
            T = T.mo3247T();
        }
        Context k = xVar != null ? xVar.mo7641k() : mo3306t();
        if (k != null) {
            this.f10643o0 = C1649c.m6959d(k, C2850k.f10737t, false);
        }
    }

    /* renamed from: x2 */
    private void m11769x2() {
        C1925e b = new C1925e.C1926a().mo6507b(this.f10649u0);
        this.f10654z0 = b;
        if (b != null) {
            b.mo6505k(this.f10653y0);
            this.f10639A0 = this.f10654z0.mo6503i() ? (int) (((float) this.f10654z0.mo6500f()) * mo3262a0().getDisplayMetrics().density) : 0;
        }
    }

    /* renamed from: z2 */
    private boolean m11770z2() {
        int i = this.f10649u0;
        return i == 2 || i == 3;
    }

    /* renamed from: A2 */
    public void mo10107A2(View view) {
        C2071a g = mo7640g();
        if (g != null) {
            g.mo7357E(view);
        }
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        this.f10640B0 = mo10111y2();
        Point point = C2693a.m11239h(mo3199B(), mo3262a0().getConfiguration()).f10510d;
        this.f10641C0 = point.x;
        this.f10642D0 = point.y;
    }

    /* renamed from: B2 */
    public void mo10108B2() {
        C2847j jVar = this.f10647s0;
        if (jVar != null) {
            jVar.mo10128d0();
        }
    }

    /* renamed from: C2 */
    public void mo10109C2(View view) {
        C2071a g = mo7640g();
        if (g != null) {
            g.mo7361I(view);
        }
    }

    /* renamed from: E */
    public boolean mo7639E() {
        return false;
    }

    /* renamed from: F0 */
    public View mo3211F0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m11757D2();
        this.f10649u0 = C1878b.m7804a(mo3306t());
        m11769x2();
        return super.mo3211F0(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo10110G() {
        C0964j t = mo3306t();
        if (t instanceof C2118q) {
            return ((C2118q) t).mo7562G();
        }
        return false;
    }

    /* renamed from: I0 */
    public void mo3217I0() {
        super.mo3217I0();
        mo10109C2(this.f10645q0);
    }

    /* renamed from: J */
    public Rect mo7566J() {
        Rect rect;
        if (this.f10643o0 && this.f10644p0 == null) {
            Fragment T = mo3247T();
            if (T == null && (mo3306t() instanceof C2118q)) {
                rect = ((C2118q) mo3306t()).mo7566J();
            } else if (T instanceof C2132x) {
                rect = ((C2132x) T).mo7566J();
            }
            this.f10644p0 = rect;
        }
        return this.f10644p0;
    }

    /* renamed from: Z0 */
    public void mo3261Z0() {
        super.mo3261Z0();
        mo10108B2();
    }

    /* renamed from: a1 */
    public void mo3263a1(View view, Bundle bundle) {
        super.mo3263a1(view, bundle);
        if (this.f10643o0) {
            mo10107A2(this.f10645q0);
            mo4064X1().setClipToPadding(false);
            Rect J = mo7566J();
            if (J != null && !J.isEmpty()) {
                mo7407b(J);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public final RecyclerView.C1171h mo4067a2(PreferenceScreen preferenceScreen) {
        C2847j jVar = new C2847j(preferenceScreen);
        this.f10647s0 = jVar;
        jVar.mo10127a0(this.f10639A0);
        boolean z = true;
        if (this.f10647s0.mo4094g() >= 1) {
            z = false;
        }
        this.f10650v0 = z;
        C2845c cVar = this.f10648t0;
        if (cVar != null) {
            this.f10647s0.mo10126Z(cVar.f10660a, this.f10648t0.f10665f, this.f10648t0.f10666g, this.f10648t0.f10667h, this.f10648t0.f10668i, this.f10648t0.f10669j);
        }
        return this.f10647s0;
    }

    /* renamed from: b */
    public void mo7407b(Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        View i0 = mo3279i0();
        RecyclerView X1 = mo4064X1();
        if (i0 != null && X1 != null) {
            C2071a g = mo7640g();
            if (g != null) {
                C2191h hVar = (C2191h) g;
                if (hVar.mo8162o0() != null) {
                    Rect rect2 = new Rect();
                    Rect rect3 = new Rect();
                    hVar.mo8162o0().getGlobalVisibleRect(rect2);
                    i0.getGlobalVisibleRect(rect3);
                    i = Math.max(0, rect.bottom - Math.max(0, rect2.bottom - rect3.bottom));
                    i4 = X1.getPaddingLeft();
                    i3 = X1.getPaddingTop();
                    i2 = X1.getPaddingRight();
                    X1.setPadding(i4, i3, i2, i);
                }
            }
            i4 = X1.getPaddingLeft();
            i3 = X1.getPaddingTop();
            i2 = X1.getPaddingRight();
            i = rect.bottom;
            X1.setPadding(i4, i3, i2, i);
        }
    }

    /* renamed from: d2 */
    public RecyclerView mo4070d2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(C2854o.f10761c, viewGroup, false);
        this.f10646r0 = recyclerView.getItemAnimator();
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(false);
        }
        recyclerView.setLayoutManager(mo4068b2());
        C2385c.m10112c(recyclerView, true);
        this.f10648t0 = new C2845c(this, recyclerView.getContext(), (C2843a) null);
        this.f10648t0.mo10116w(C2693a.m11239h(mo3199B(), mo3262a0().getConfiguration()).f10509c.y);
        recyclerView.mo4294g(this.f10648t0);
        this.f10645q0 = viewGroup;
        viewGroup.addOnLayoutChangeListener(new C2843a());
        if (viewGroup instanceof SpringBackLayout) {
            ((SpringBackLayout) viewGroup).setTarget(recyclerView);
        }
        return recyclerView;
    }

    /* renamed from: g */
    public C2071a mo7640g() {
        Fragment T = mo3247T();
        C0964j t = mo3306t();
        if (T == null && (t instanceof C2118q)) {
            return ((C2118q) t).mo7561F0();
        }
        if (T instanceof C2132x) {
            return ((C2132x) T).mo7640g();
        }
        return null;
    }

    /* renamed from: i */
    public void mo7413i(int[] iArr) {
    }

    /* renamed from: j */
    public void mo4074j(Preference preference) {
        C0941e eVar;
        boolean a = mo4063W1() instanceof C1122h.C1126d ? ((C1122h.C1126d) mo4063W1()).mo4086a(this, preference) : false;
        if (!a && (mo3306t() instanceof C1122h.C1126d)) {
            a = ((C1122h.C1126d) mo3306t()).mo4086a(this, preference);
        }
        if (!a && mo3230N().mo3380i0("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                eVar = C2832b.m11722v2(preference.mo3960p());
            } else if (preference instanceof ListPreference) {
                eVar = C2836e.m11737s2(preference.mo3960p());
            } else if (preference instanceof MultiSelectListPreference) {
                eVar = C2838f.m11747s2(preference.mo3960p());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            eVar.mo3241Q1(this, 0);
            eVar.mo3521f2(mo3230N(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: k */
    public Context mo7641k() {
        return mo3199B();
    }

    /* renamed from: m */
    public void mo7584m(int i) {
    }

    /* renamed from: n */
    public boolean mo4078n(Preference preference) {
        int t;
        int i;
        View childAt;
        if (this.f10651w0 && (t = preference.mo3968t()) != (i = this.f10652x0)) {
            if (i >= 0 && (childAt = mo4064X1().getChildAt(this.f10652x0)) != null) {
                childAt.setActivated(false);
            }
            View childAt2 = mo4064X1().getChildAt(t);
            if (childAt2 != null) {
                childAt2.setActivated(true);
                this.f10652x0 = t;
            }
        }
        return super.mo4078n(preference);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r0 = ((androidx.recyclerview.widget.LinearLayoutManager) r9).mo4186U1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r9) {
        /*
            r8 = this;
            super.onConfigurationChanged(r9)
            android.content.Context r9 = r8.mo3199B()
            int r9 = p073l3.C1878b.m7804a(r9)
            int r0 = r8.f10649u0
            if (r0 == r9) goto L_0x001d
            r8.f10649u0 = r9
            r8.m11769x2()
            u3.j r9 = r8.f10647s0
            if (r9 == 0) goto L_0x001d
            int r0 = r8.f10639A0
            r9.mo10127a0(r0)
        L_0x001d:
            androidx.fragment.app.j r9 = r8.mo3306t()
            if (r9 == 0) goto L_0x00a7
            boolean r9 = r8.m11770z2()
            if (r9 == 0) goto L_0x00a7
            boolean r9 = r8.f10640B0
            if (r9 != 0) goto L_0x002f
            goto L_0x00a7
        L_0x002f:
            androidx.preference.PreferenceScreen r9 = r8.mo4065Y1()
            if (r9 != 0) goto L_0x0036
            return
        L_0x0036:
            u3.i$c r0 = r8.f10648t0
            if (r0 == 0) goto L_0x007a
            android.content.Context r1 = r9.mo3949i()
            r0.mo10114t(r1)
            u3.i$c r0 = r8.f10648t0
            r0.mo10115u()
            u3.j r0 = r8.f10647s0
            if (r0 == 0) goto L_0x007a
            android.content.Context r9 = r9.mo3949i()
            r0.mo10122U(r9)
            u3.j r1 = r8.f10647s0
            u3.i$c r9 = r8.f10648t0
            android.graphics.Paint r2 = r9.f10660a
            u3.i$c r9 = r8.f10648t0
            int r3 = r9.f10665f
            u3.i$c r9 = r8.f10648t0
            int r4 = r9.f10666g
            u3.i$c r9 = r8.f10648t0
            int r5 = r9.f10667h
            u3.i$c r9 = r8.f10648t0
            int r6 = r9.f10668i
            u3.i$c r9 = r8.f10648t0
            int r7 = r9.f10669j
            r1.mo10126Z(r2, r3, r4, r5, r6, r7)
        L_0x007a:
            androidx.recyclerview.widget.RecyclerView r9 = r8.mo4064X1()
            androidx.recyclerview.widget.RecyclerView$p r9 = r9.getLayoutManager()
            boolean r0 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00a7
            r0 = r9
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.mo4186U1()
            android.view.View r1 = r9.mo4175C(r0)
            if (r1 == 0) goto L_0x00a7
            int r1 = r1.getTop()
            androidx.recyclerview.widget.RecyclerView r2 = r8.mo4064X1()
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            u3.i$b r3 = new u3.i$b
            r3.<init>(r9, r0, r1)
            r2.addOnGlobalLayoutListener(r3)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123u3.C2842i.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* renamed from: y2 */
    public boolean mo10111y2() {
        return true;
    }
}
