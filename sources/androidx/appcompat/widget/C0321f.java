package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.widget.C0809b;

/* renamed from: androidx.appcompat.widget.f */
class C0321f {

    /* renamed from: a */
    private final CheckedTextView f1272a;

    /* renamed from: b */
    private ColorStateList f1273b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1274c = null;

    /* renamed from: d */
    private boolean f1275d = false;

    /* renamed from: e */
    private boolean f1276e = false;

    /* renamed from: f */
    private boolean f1277f;

    C0321f(CheckedTextView checkedTextView) {
        this.f1272a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1832a() {
        Drawable a = C0809b.m3255a(this.f1272a);
        if (a == null) {
            return;
        }
        if (this.f1275d || this.f1276e) {
            Drawable mutate = C0553a.m2297j(a).mutate();
            if (this.f1275d) {
                C0553a.m2294g(mutate, this.f1273b);
            }
            if (this.f1276e) {
                C0553a.m2295h(mutate, this.f1274c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1272a.getDrawableState());
            }
            this.f1272a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1833b() {
        return this.f1273b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1834c() {
        return this.f1274c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1835d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1272a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p021d.C1456j.f5926P0
            r8 = 0
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.C0326g1.m1455u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1272a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1880q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0727l0.m2873W(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p021d.C1456j.f5936R0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1876m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f1272a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p027e.C1512a.m6567b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p021d.C1456j.f5931Q0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1876m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f1272a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p027e.C1512a.m6567b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p021d.C1456j.f5941S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f1272a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1866c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0809b.m3256b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p021d.C1456j.f5945T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f1272a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1873j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0336j0.m1542e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0809b.m3257c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1882v()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1882v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0321f.mo1835d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1836e() {
        if (this.f1277f) {
            this.f1277f = false;
            return;
        }
        this.f1277f = true;
        mo1832a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1837f(ColorStateList colorStateList) {
        this.f1273b = colorStateList;
        this.f1275d = true;
        mo1832a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1838g(PorterDuff.Mode mode) {
        this.f1274c = mode;
        this.f1276e = true;
        mo1832a();
    }
}
