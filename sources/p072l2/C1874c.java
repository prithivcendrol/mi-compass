package p072l2;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0116a;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.C2212u;
import miuix.appcompat.internal.app.widget.C2213v;
import miuix.appcompat.internal.app.widget.C2215x;
import miuix.appcompat.internal.app.widget.C2216y;
import miuix.springback.view.SpringBackLayout;
import p066k2.C1784f;
import p066k2.C1786h;

/* renamed from: l2.c */
public class C1874c {

    /* renamed from: a */
    public static boolean f7245a = false;

    /* renamed from: l2.c$a */
    class C1875a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Context f7246d;

        C1875a(Context context) {
            this.f7246d = context;
        }

        public void run() {
            C1874c.m7796c(this.f7246d);
            C1874c.m7794a(this.f7246d);
        }
    }

    /* renamed from: a */
    public static void m7794a(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(ActionBarOverlayLayout.class.getName(), true, classLoader);
            Class.forName(ActionBarContainer.class.getName(), true, classLoader);
            Class.forName(C0116a.C0120d.class.getName(), true, classLoader);
            Class.forName(AnimState.class.getName(), true, classLoader);
            Class.forName(AnimConfig.class.getName(), true, classLoader);
            Class.forName(C1784f.class.getName(), true, classLoader);
            Class.forName(C1786h.class.getName(), true, classLoader);
            Class.forName(C2212u.class.getName(), true, classLoader);
            Class.forName(C2213v.class.getName(), true, classLoader);
            Class.forName(C2215x.class.getName(), true, classLoader);
            Class.forName(C2216y.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m7795b(Context context) {
        new Thread(new C1875a(context)).start();
    }

    /* renamed from: c */
    public static void m7796c(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(FrameLayout.class.getName(), true, classLoader);
            Class.forName(LinearLayout.class.getName(), true, classLoader);
            Class.forName(ImageView.class.getName(), true, classLoader);
            Class.forName(TextView.class.getName(), true, classLoader);
            Class.forName(Button.class.getName(), true, classLoader);
            Class.forName(SpringBackLayout.class.getName(), true, classLoader);
            Class.forName(TypedArray.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
