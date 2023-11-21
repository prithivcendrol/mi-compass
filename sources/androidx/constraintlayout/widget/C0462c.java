package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p087o.C2476e;
import p087o.C2482h;

/* renamed from: androidx.constraintlayout.widget.c */
public abstract class C0462c extends View {

    /* renamed from: d */
    protected int[] f1829d = new int[32];

    /* renamed from: e */
    protected int f1830e;

    /* renamed from: f */
    protected Context f1831f;

    /* renamed from: g */
    protected C2482h f1832g;

    /* renamed from: h */
    protected boolean f1833h = false;

    /* renamed from: i */
    protected String f1834i;

    /* renamed from: j */
    protected String f1835j;

    /* renamed from: k */
    private View[] f1836k = null;

    /* renamed from: l */
    protected HashMap<Integer, String> f1837l = new HashMap<>();

    public C0462c(Context context) {
        super(context);
        this.f1831f = context;
        mo2345m((AttributeSet) null);
    }

    /* renamed from: d */
    private void m1977d(String str) {
        if (str != null && str.length() != 0 && this.f1831f != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int k = m1981k(trim);
            if (k != 0) {
                this.f1837l.put(Integer.valueOf(k), trim);
                m1978e(k);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: e */
    private void m1978e(int i) {
        if (i != getId()) {
            int i2 = this.f1830e + 1;
            int[] iArr = this.f1829d;
            if (i2 > iArr.length) {
                this.f1829d = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1829d;
            int i3 = this.f1830e;
            iArr2[i3] = i;
            this.f1830e = i3 + 1;
        }
    }

    /* renamed from: f */
    private void m1979f(String str) {
        if (str != null && str.length() != 0 && this.f1831f != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.C0455b) && trim.equals(((ConstraintLayout.C0455b) layoutParams).f1754c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        m1978e(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private int m1980j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1831f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    private int m1981k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g = constraintLayout.mo2425g(0, str);
            if (g instanceof Integer) {
                i = ((Integer) g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m1980j(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0477i.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f1831f.getResources().getIdentifier(str, "id", this.f1831f.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2474g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2476h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1829d, this.f1830e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2476h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1830e; i++) {
            View k = constraintLayout.mo2435k(this.f1829d[i]);
            if (k != null) {
                k.setVisibility(visibility);
                if (elevation > 0.0f) {
                    k.setTranslationZ(k.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2477i(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public View[] mo2478l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1836k;
        if (viewArr == null || viewArr.length != this.f1830e) {
            this.f1836k = new View[this.f1830e];
        }
        for (int i = 0; i < this.f1830e; i++) {
            this.f1836k[i] = constraintLayout.mo2435k(this.f1829d[i]);
        }
        return this.f1836k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2345m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0478j.f2334n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2442z1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1834i = string;
                    setIds(string);
                } else if (index == C0478j.f2006A1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1835j = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    public void mo2466n(C2476e eVar, boolean z) {
    }

    /* renamed from: o */
    public void mo2479o(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1834i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1835j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1833h) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo2483p(ConstraintLayout constraintLayout) {
    }

    /* renamed from: q */
    public void mo2484q(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f1837l.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2485r(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f1834i
            r5.setIds(r0)
        L_0x000b:
            o.h r0 = r5.f1832g
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo9606c()
            r0 = 0
        L_0x0014:
            int r1 = r5.f1830e
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f1829d
            r1 = r1[r0]
            android.view.View r2 = r6.mo2435k(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f1837l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m1980j(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f1829d
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f1837l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo2435k(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            o.h r1 = r5.f1832g
            o.e r2 = r6.mo2436l(r2)
            r1.mo9605b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            o.h r0 = r5.f1832g
            o.f r6 = r6.f1701f
            r0.mo9604a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0462c.mo2485r(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: s */
    public void mo2486s() {
        if (this.f1832g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0455b) {
                ((ConstraintLayout.C0455b) layoutParams).f1792v0 = (C2476e) this.f1832g;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1834i = str;
        if (str != null) {
            int i = 0;
            this.f1830e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1977d(str.substring(i));
                    return;
                } else {
                    m1977d(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f1835j = str;
        if (str != null) {
            int i = 0;
            this.f1830e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1979f(str.substring(i));
                    return;
                } else {
                    m1979f(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1834i = null;
        this.f1830e = 0;
        for (int e : iArr) {
            m1978e(e);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1834i == null) {
            m1978e(i);
        }
    }
}
