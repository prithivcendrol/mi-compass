package p055i3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: i3.a */
public class C1647a {
    /* renamed from: a */
    public static boolean m6951a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
