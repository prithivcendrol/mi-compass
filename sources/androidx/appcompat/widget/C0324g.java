package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.widget.C0812c;

/* renamed from: androidx.appcompat.widget.g */
class C0324g {

    /* renamed from: a */
    private final CompoundButton f1279a;

    /* renamed from: b */
    private ColorStateList f1280b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1281c = null;

    /* renamed from: d */
    private boolean f1282d = false;

    /* renamed from: e */
    private boolean f1283e = false;

    /* renamed from: f */
    private boolean f1284f;

    C0324g(CompoundButton compoundButton) {
        this.f1279a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1840a() {
        Drawable a = C0812c.m3261a(this.f1279a);
        if (a == null) {
            return;
        }
        if (this.f1282d || this.f1283e) {
            Drawable mutate = C0553a.m2297j(a).mutate();
            if (this.f1282d) {
                C0553a.m2294g(mutate, this.f1280b);
            }
            if (this.f1283e) {
                C0553a.m2295h(mutate, this.f1281c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1279a.getDrawableState());
            }
            this.f1279a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1841b(int i) {
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1842c() {
        return this.f1280b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1843d() {
        return this.f1281c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1844e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1279a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p021d.C1456j.f5949U0
            r8 = 0
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.C0326g1.m1455u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1279a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1880q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0727l0.m2873W(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p021d.C1456j.f5957W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1876m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1279a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p027e.C1512a.m6567b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p021d.C1456j.f5953V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1876m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1279a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p027e.C1512a.m6567b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p021d.C1456j.f5961X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1279a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1866c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0812c.m3262b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p021d.C1456j.f5965Y0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1881r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1279a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1873j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0336j0.m1542e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0812c.m3263c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1882v()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1882v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0324g.mo1844e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1845f() {
        if (this.f1284f) {
            this.f1284f = false;
            return;
        }
        this.f1284f = true;
        mo1840a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1846g(ColorStateList colorStateList) {
        this.f1280b = colorStateList;
        this.f1282d = true;
        mo1840a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1847h(PorterDuff.Mode mode) {
        this.f1281c = mode;
        this.f1283e = true;
        mo1840a();
    }
}
