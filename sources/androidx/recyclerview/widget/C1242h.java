package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1214a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
class C1242h {

    /* renamed from: a */
    final C1243a f4335a;

    /* renamed from: androidx.recyclerview.widget.h$a */
    interface C1243a {
        /* renamed from: a */
        void mo4815a(C1214a.C1216b bVar);

        /* renamed from: b */
        C1214a.C1216b mo4816b(int i, int i2, int i3, Object obj);
    }

    C1242h(C1243a aVar) {
        this.f4335a = aVar;
    }

    /* renamed from: a */
    private int m5650a(List<C1214a.C1216b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4209a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m5651c(List<C1214a.C1216b> list, int i, C1214a.C1216b bVar, int i2, C1214a.C1216b bVar2) {
        int i3 = bVar.f4212d;
        int i4 = bVar2.f4210b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f4210b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f4210b = i6 + bVar2.f4212d;
        }
        int i7 = bVar2.f4210b;
        if (i7 <= i3) {
            bVar.f4212d = i3 + bVar2.f4212d;
        }
        bVar2.f4210b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m5652d(List<C1214a.C1216b> list, int i, int i2) {
        C1214a.C1216b bVar = list.get(i);
        C1214a.C1216b bVar2 = list.get(i2);
        int i3 = bVar2.f4209a;
        if (i3 == 1) {
            m5651c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo4922e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo4923f(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4921b(List<C1214a.C1216b> list) {
        while (true) {
            int a = m5650a(list);
            if (a != -1) {
                m5652d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r0 > r14.f4210b) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r0 >= r14.f4210b) goto L_0x00ca;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4922e(java.util.List<androidx.recyclerview.widget.C1214a.C1216b> r10, int r11, androidx.recyclerview.widget.C1214a.C1216b r12, int r13, androidx.recyclerview.widget.C1214a.C1216b r14) {
        /*
            r9 = this;
            int r0 = r12.f4210b
            int r1 = r12.f4212d
            r2 = 0
            r3 = 1
            int r4 = r14.f4210b
            if (r0 >= r1) goto L_0x0017
            if (r4 != r0) goto L_0x0015
            int r4 = r14.f4212d
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0015
            r0 = r2
            r2 = r3
            goto L_0x0024
        L_0x0015:
            r0 = r2
            goto L_0x0024
        L_0x0017:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0023
            int r4 = r14.f4212d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0023
            r0 = r3
            r2 = r0
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            int r4 = r14.f4210b
            r5 = 2
            if (r1 >= r4) goto L_0x002d
            int r4 = r4 - r3
            r14.f4210b = r4
            goto L_0x0046
        L_0x002d:
            int r6 = r14.f4212d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0046
            int r6 = r6 - r3
            r14.f4212d = r6
            r12.f4209a = r5
            r12.f4212d = r3
            int r11 = r14.f4212d
            if (r11 != 0) goto L_0x0045
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f4335a
            r10.mo4815a(r14)
        L_0x0045:
            return
        L_0x0046:
            int r1 = r12.f4210b
            int r4 = r14.f4210b
            r6 = 0
            if (r1 > r4) goto L_0x0051
            int r4 = r4 + r3
            r14.f4210b = r4
            goto L_0x0067
        L_0x0051:
            int r7 = r14.f4212d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0067
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.h$a r7 = r9.f4335a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo4816b(r5, r1, r4, r6)
            int r1 = r12.f4210b
            int r3 = r14.f4210b
            int r1 = r1 - r3
            r14.f4212d = r1
        L_0x0067:
            if (r2 == 0) goto L_0x0075
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.h$a r10 = r9.f4335a
            r10.mo4815a(r12)
            return
        L_0x0075:
            if (r0 == 0) goto L_0x00a1
            if (r6 == 0) goto L_0x008f
            int r0 = r12.f4210b
            int r1 = r6.f4210b
            if (r0 <= r1) goto L_0x0084
            int r1 = r6.f4212d
            int r0 = r0 - r1
            r12.f4210b = r0
        L_0x0084:
            int r0 = r12.f4212d
            int r1 = r6.f4210b
            if (r0 <= r1) goto L_0x008f
            int r1 = r6.f4212d
            int r0 = r0 - r1
            r12.f4212d = r0
        L_0x008f:
            int r0 = r12.f4210b
            int r1 = r14.f4210b
            if (r0 <= r1) goto L_0x009a
            int r1 = r14.f4212d
            int r0 = r0 - r1
            r12.f4210b = r0
        L_0x009a:
            int r0 = r12.f4212d
            int r1 = r14.f4210b
            if (r0 <= r1) goto L_0x00cf
            goto L_0x00ca
        L_0x00a1:
            if (r6 == 0) goto L_0x00b9
            int r0 = r12.f4210b
            int r1 = r6.f4210b
            if (r0 < r1) goto L_0x00ae
            int r1 = r6.f4212d
            int r0 = r0 - r1
            r12.f4210b = r0
        L_0x00ae:
            int r0 = r12.f4212d
            int r1 = r6.f4210b
            if (r0 < r1) goto L_0x00b9
            int r1 = r6.f4212d
            int r0 = r0 - r1
            r12.f4212d = r0
        L_0x00b9:
            int r0 = r12.f4210b
            int r1 = r14.f4210b
            if (r0 < r1) goto L_0x00c4
            int r1 = r14.f4212d
            int r0 = r0 - r1
            r12.f4210b = r0
        L_0x00c4:
            int r0 = r12.f4212d
            int r1 = r14.f4210b
            if (r0 < r1) goto L_0x00cf
        L_0x00ca:
            int r1 = r14.f4212d
            int r0 = r0 - r1
            r12.f4212d = r0
        L_0x00cf:
            r10.set(r11, r14)
            int r14 = r12.f4210b
            int r0 = r12.f4212d
            if (r14 == r0) goto L_0x00dc
            r10.set(r13, r12)
            goto L_0x00df
        L_0x00dc:
            r10.remove(r13)
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r10.add(r11, r6)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1242h.mo4922e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4923f(java.util.List<androidx.recyclerview.widget.C1214a.C1216b> r9, int r10, androidx.recyclerview.widget.C1214a.C1216b r11, int r12, androidx.recyclerview.widget.C1214a.C1216b r13) {
        /*
            r8 = this;
            int r0 = r11.f4212d
            int r1 = r13.f4210b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f4210b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f4212d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f4212d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4335a
            int r1 = r11.f4210b
            java.lang.Object r5 = r13.f4211c
            androidx.recyclerview.widget.a$b r0 = r0.mo4816b(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f4210b
            int r5 = r13.f4210b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f4210b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f4212d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.f4335a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4211c
            androidx.recyclerview.widget.a$b r3 = r3.mo4816b(r2, r1, r5, r4)
            int r1 = r13.f4212d
            int r1 = r1 - r5
            r13.f4212d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f4212d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4335a
            r11.mo4815a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1242h.mo4923f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
