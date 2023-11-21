package p055i3;

import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;

/* renamed from: i3.b */
public class C1648b {

    /* renamed from: a */
    private static volatile boolean f6505a = false;

    /* renamed from: a */
    public static void m6952a(View view) {
        m6953b(view, IHoverStyle.HoverEffect.NORMAL);
    }

    /* renamed from: b */
    public static void m6953b(View view, IHoverStyle.HoverEffect hoverEffect) {
        Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
        Folme.useAt(view).hover().setEffect(hoverEffect).handleHoverOf(view, new AnimConfig[0]);
    }

    /* renamed from: c */
    public static void m6954c(View view) {
        ITouchStyle scale = Folme.useAt(view).touch().setTint(0.0f, 0.0f, 0.0f, 0.0f).setScale(1.0f, new ITouchStyle.TouchType[0]);
        IHoverStyle effect = Folme.useAt(view).hover().setTint(0.0f, 0.0f, 0.0f, 0.0f).setEffect(IHoverStyle.HoverEffect.NORMAL);
        if (C1656j.m6984c(view.getContext())) {
            scale.setBackgroundColor(0.15f, 1.0f, 1.0f, 1.0f);
            effect.setBackgroundColor(0.15f, 1.0f, 1.0f, 1.0f);
        } else {
            scale.setBackgroundColor(0.08f, 0.0f, 0.0f, 0.0f);
            effect.setBackgroundColor(0.08f, 0.0f, 0.0f, 0.0f);
        }
        scale.handleTouchOf(view, new AnimConfig[0]);
        effect.handleHoverOf(view, new AnimConfig[0]);
    }

    /* renamed from: d */
    public static boolean m6955d() {
        return f6505a;
    }
}
