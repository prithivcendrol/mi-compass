package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.i */
public class C0645i {

    /* renamed from: androidx.core.view.accessibility.i$a */
    static class C0646a {
        /* renamed from: a */
        static int m2601a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m2602b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m2603c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m2604d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.i$b */
    static class C0647b {
        /* renamed from: a */
        static void m2605a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m2598a(AccessibilityRecord accessibilityRecord, int i) {
        C0646a.m2603c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m2599b(AccessibilityRecord accessibilityRecord, int i) {
        C0646a.m2604d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m2600c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C0647b.m2605a(accessibilityRecord, view, i);
    }
}
