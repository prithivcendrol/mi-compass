package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p087o.C2470a;
import p087o.C2476e;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0458a extends C0462c {

    /* renamed from: m */
    private int f1808m;

    /* renamed from: n */
    private int f1809n;

    /* renamed from: o */
    private C2470a f1810o;

    public C0458a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 6) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1967t(p087o.C2476e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1809n = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L_0x0012
            int r6 = r3.f1808m
            if (r6 != r2) goto L_0x000f
        L_0x000c:
            r3.f1809n = r5
            goto L_0x001c
        L_0x000f:
            if (r6 != r1) goto L_0x001c
            goto L_0x0016
        L_0x0012:
            int r6 = r3.f1808m
            if (r6 != r2) goto L_0x0019
        L_0x0016:
            r3.f1809n = r0
            goto L_0x001c
        L_0x0019:
            if (r6 != r1) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            boolean r5 = r4 instanceof p087o.C2470a
            if (r5 == 0) goto L_0x0027
            o.a r4 = (p087o.C2470a) r4
            int r5 = r3.f1809n
            r4.mo9442x1(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0458a.m1967t(o.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f1810o.mo9435r1();
    }

    public int getMargin() {
        return this.f1810o.mo9437t1();
    }

    public int getType() {
        return this.f1808m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2345m(AttributeSet attributeSet) {
        super.mo2345m(attributeSet);
        this.f1810o = new C2470a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0478j.f2334n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2415w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0478j.f2406v1) {
                    this.f1810o.mo9441w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0478j.f2424x1) {
                    this.f1810o.mo9443y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1832g = this.f1810o;
        mo2486s();
    }

    /* renamed from: n */
    public void mo2466n(C2476e eVar, boolean z) {
        m1967t(eVar, this.f1808m, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1810o.mo9441w1(z);
    }

    public void setDpMargin(int i) {
        C2470a aVar = this.f1810o;
        aVar.mo9443y1((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1810o.mo9443y1(i);
    }

    public void setType(int i) {
        this.f1808m = i;
    }
}
