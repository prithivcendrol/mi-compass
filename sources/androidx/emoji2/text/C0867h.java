package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0854e;
import androidx.emoji2.text.C0879m;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.h */
final class C0867h {

    /* renamed from: a */
    private final C0854e.C0864i f2943a;

    /* renamed from: b */
    private final C0879m f2944b;

    /* renamed from: c */
    private C0854e.C0859d f2945c;

    /* renamed from: d */
    private final boolean f2946d;

    /* renamed from: e */
    private final int[] f2947e;

    /* renamed from: androidx.emoji2.text.h$a */
    private static final class C0868a {
        /* renamed from: a */
        static int m3446a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m3447b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.h$b */
    static final class C0869b {

        /* renamed from: a */
        private int f2948a = 1;

        /* renamed from: b */
        private final C0879m.C0880a f2949b;

        /* renamed from: c */
        private C0879m.C0880a f2950c;

        /* renamed from: d */
        private C0879m.C0880a f2951d;

        /* renamed from: e */
        private int f2952e;

        /* renamed from: f */
        private int f2953f;

        /* renamed from: g */
        private final boolean f2954g;

        /* renamed from: h */
        private final int[] f2955h;

        C0869b(C0879m.C0880a aVar, boolean z, int[] iArr) {
            this.f2949b = aVar;
            this.f2950c = aVar;
            this.f2954g = z;
            this.f2955h = iArr;
        }

        /* renamed from: d */
        private static boolean m3448d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        private static boolean m3449f(int i) {
            return i == 65038;
        }

        /* renamed from: g */
        private int m3450g() {
            this.f2948a = 1;
            this.f2950c = this.f2949b;
            this.f2953f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m3451h() {
            if (this.f2950c.mo3152b().mo3120j() || m3448d(this.f2952e)) {
                return true;
            }
            if (this.f2954g) {
                if (this.f2955h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2955h, this.f2950c.mo3152b().mo3113b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3124a(int i) {
            C0879m.C0880a a = this.f2950c.mo3151a(i);
            int i2 = 3;
            if (this.f2948a == 2) {
                if (a != null) {
                    this.f2950c = a;
                    this.f2953f++;
                } else if (!m3449f(i)) {
                    if (!m3448d(i)) {
                        if (this.f2950c.mo3152b() != null && (this.f2953f != 1 || m3451h())) {
                            this.f2951d = this.f2950c;
                            m3450g();
                            this.f2952e = i;
                            return i2;
                        }
                    }
                }
                i2 = 2;
                this.f2952e = i;
                return i2;
            } else if (a != null) {
                this.f2948a = 2;
                this.f2950c = a;
                this.f2953f = 1;
                i2 = 2;
                this.f2952e = i;
                return i2;
            }
            i2 = m3450g();
            this.f2952e = i;
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0866g mo3125b() {
            return this.f2950c.mo3152b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0866g mo3126c() {
            return this.f2951d.mo3152b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3127e() {
            return this.f2948a == 2 && this.f2950c.mo3152b() != null && (this.f2953f > 1 || m3451h());
        }
    }

    C0867h(C0879m mVar, C0854e.C0864i iVar, C0854e.C0859d dVar, boolean z, int[] iArr) {
        this.f2943a = iVar;
        this.f2944b = mVar;
        this.f2945c = dVar;
        this.f2946d = z;
        this.f2947e = iArr;
    }

    /* renamed from: a */
    private void m3438a(Spannable spannable, C0866g gVar, int i, int i2) {
        spannable.setSpan(this.f2943a.mo3110a(gVar), i, i2, 33);
    }

    /* renamed from: b */
    private static boolean m3439b(Editable editable, KeyEvent keyEvent, boolean z) {
        C0870i[] iVarArr;
        if (m3444g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m3443f(selectionStart, selectionEnd) && (iVarArr = (C0870i[]) editable.getSpans(selectionStart, selectionEnd, C0870i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i = 0;
            while (i < length) {
                C0870i iVar = iVarArr[i];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m3440c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m3443f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C0868a.m3446a(editable, selectionStart, Math.max(i, 0));
                i3 = C0868a.m3447b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C0870i[] iVarArr = (C0870i[]) editable.getSpans(i4, i3, C0870i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (C0870i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    static boolean m3441d(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : m3439b(editable, keyEvent, true) : m3439b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m3442e(CharSequence charSequence, int i, int i2, C0866g gVar) {
        if (gVar.mo3115d() == 0) {
            gVar.mo3121k(this.f2945c.mo3089a(charSequence, i, i2, gVar.mo3118h()));
        }
        return gVar.mo3115d() == 2;
    }

    /* renamed from: f */
    private static boolean m3443f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    private static boolean m3444g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo3123h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.C0881n
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji2.text.n r1 = (androidx.emoji2.text.C0881n) r1
            r1.mo3154a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x012c }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.i> r5 = androidx.emoji2.text.C0870i.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x012c }
            if (r2 > r12) goto L_0x0033
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r1.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            goto L_0x0033
        L_0x002b:
            androidx.emoji2.text.p r1 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch:{ all -> 0x012c }
            r1.<init>((android.text.Spannable) r2)     // Catch:{ all -> 0x012c }
        L_0x0033:
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.lang.Class<androidx.emoji2.text.i> r3 = androidx.emoji2.text.C0870i.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.C0870i[]) r3     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            if (r4 <= 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            r5 = r2
        L_0x0045:
            if (r5 >= r4) goto L_0x0061
            r6 = r3[r5]     // Catch:{ all -> 0x012c }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x012c }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x012c }
            if (r7 == r12) goto L_0x0056
            r1.removeSpan(r6)     // Catch:{ all -> 0x012c }
        L_0x0056:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x012c }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            if (r11 == r12) goto L_0x0123
            int r3 = r10.length()     // Catch:{ all -> 0x012c }
            if (r11 < r3) goto L_0x006b
            goto L_0x0123
        L_0x006b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            int r3 = r1.length()     // Catch:{ all -> 0x012c }
            java.lang.Class<androidx.emoji2.text.i> r4 = androidx.emoji2.text.C0870i.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.i[] r3 = (androidx.emoji2.text.C0870i[]) r3     // Catch:{ all -> 0x012c }
            int r3 = r3.length     // Catch:{ all -> 0x012c }
            int r13 = r13 - r3
        L_0x0080:
            androidx.emoji2.text.h$b r3 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m r4 = r9.f2944b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.m$a r4 = r4.mo3148f()     // Catch:{ all -> 0x012c }
            boolean r5 = r9.f2946d     // Catch:{ all -> 0x012c }
            int[] r6 = r9.f2947e     // Catch:{ all -> 0x012c }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x012c }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            r5 = r4
            r4 = r2
            r2 = r1
        L_0x0096:
            r1 = r11
        L_0x0097:
            if (r11 >= r12) goto L_0x00e9
            if (r4 >= r13) goto L_0x00e9
            int r6 = r3.mo3124a(r5)     // Catch:{ all -> 0x012c }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r14 != 0) goto L_0x00b5
            androidx.emoji2.text.g r6 = r3.mo3126c()     // Catch:{ all -> 0x012c }
            boolean r6 = r9.m3442e(r10, r1, r11, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r2 != 0) goto L_0x00c1
            androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x012c }
            r6.<init>(r10)     // Catch:{ all -> 0x012c }
            r2.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x012c }
        L_0x00c1:
            androidx.emoji2.text.g r6 = r3.mo3126c()     // Catch:{ all -> 0x012c }
            r9.m3438a(r2, r6, r1, r11)     // Catch:{ all -> 0x012c }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x012c }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            goto L_0x0097
        L_0x00d7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x012c }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00e7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            r5 = r11
        L_0x00e7:
            r11 = r1
            goto L_0x0097
        L_0x00e9:
            boolean r12 = r3.mo3127e()     // Catch:{ all -> 0x012c }
            if (r12 == 0) goto L_0x010c
            if (r4 >= r13) goto L_0x010c
            if (r14 != 0) goto L_0x00fd
            androidx.emoji2.text.g r12 = r3.mo3125b()     // Catch:{ all -> 0x012c }
            boolean r12 = r9.m3442e(r10, r1, r11, r12)     // Catch:{ all -> 0x012c }
            if (r12 != 0) goto L_0x010c
        L_0x00fd:
            if (r2 != 0) goto L_0x0105
            androidx.emoji2.text.p r12 = new androidx.emoji2.text.p     // Catch:{ all -> 0x012c }
            r12.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            r2 = r12
        L_0x0105:
            androidx.emoji2.text.g r12 = r3.mo3125b()     // Catch:{ all -> 0x012c }
            r9.m3438a(r2, r12, r1, r11)     // Catch:{ all -> 0x012c }
        L_0x010c:
            if (r2 == 0) goto L_0x011a
            android.text.Spannable r11 = r2.mo3182b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0119
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.C0881n) r10
            r10.mo3159d()
        L_0x0119:
            return r11
        L_0x011a:
            if (r0 == 0) goto L_0x0122
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C0881n) r11
            r11.mo3159d()
        L_0x0122:
            return r10
        L_0x0123:
            if (r0 == 0) goto L_0x012b
            r11 = r10
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C0881n) r11
            r11.mo3159d()
        L_0x012b:
            return r10
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0134
            androidx.emoji2.text.n r10 = (androidx.emoji2.text.C0881n) r10
            r10.mo3159d()
        L_0x0134:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0867h.mo3123h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
