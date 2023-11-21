package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.h */
public class C0641h {

    /* renamed from: a */
    private final Object f2724a;

    /* renamed from: androidx.core.view.accessibility.h$a */
    static class C0642a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0641h f2725a;

        C0642a(C0641h hVar) {
            this.f2725a = hVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0637g b = this.f2725a.mo2790b(i);
            if (b == null) {
                return null;
            }
            return b.mo2773l0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0637g> c = this.f2725a.mo2791c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo2773l0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2725a.mo2794f(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.h$b */
    static class C0643b extends C0642a {
        C0643b(C0641h hVar) {
            super(hVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0637g d = this.f2725a.mo2792d(i);
            if (d == null) {
                return null;
            }
            return d.mo2773l0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.h$c */
    static class C0644c extends C0643b {
        C0644c(C0641h hVar) {
            super(hVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2725a.mo2789a(i, C0637g.m2531m0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C0641h() {
        this.f2724a = Build.VERSION.SDK_INT >= 26 ? new C0644c(this) : new C0643b(this);
    }

    public C0641h(Object obj) {
        this.f2724a = obj;
    }

    /* renamed from: a */
    public void mo2789a(int i, C0637g gVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C0637g mo2790b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C0637g> mo2791c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C0637g mo2792d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo2793e() {
        return this.f2724a;
    }

    /* renamed from: f */
    public boolean mo2794f(int i, int i2, Bundle bundle) {
        return false;
    }
}
