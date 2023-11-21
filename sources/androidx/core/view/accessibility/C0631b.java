package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
public final class C0631b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    static class C0632a {
        /* renamed from: a */
        static int m2516a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m2517b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m2514a(AccessibilityEvent accessibilityEvent) {
        return C0632a.m2516a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m2515b(AccessibilityEvent accessibilityEvent, int i) {
        C0632a.m2517b(accessibilityEvent, i);
    }
}
