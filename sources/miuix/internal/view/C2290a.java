package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;

/* renamed from: miuix.internal.view.a */
public class C2290a extends AnimatedStateListDrawable {

    /* renamed from: e */
    private static final String f8702e = C2290a.class.getName();

    /* renamed from: d */
    protected C2291a f8703d;

    /* renamed from: miuix.internal.view.a$a */
    public static class C2291a extends Drawable.ConstantState {

        /* renamed from: a */
        Drawable.ConstantState f8704a;

        /* renamed from: b */
        int f8705b;

        /* renamed from: c */
        int f8706c;

        /* renamed from: d */
        int f8707d;

        /* renamed from: e */
        int f8708e;

        /* renamed from: f */
        int f8709f;

        /* renamed from: g */
        int f8710g;

        /* renamed from: h */
        int f8711h;

        /* renamed from: i */
        int f8712i;

        /* renamed from: j */
        boolean f8713j;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable mo8669a(Resources resources, Resources.Theme theme, C2291a aVar) {
            return new C2290a(resources, theme, aVar);
        }

        public boolean canApplyTheme() {
            Drawable.ConstantState constantState = this.f8704a;
            if (constantState == null) {
                return false;
            }
            return constantState.canApplyTheme();
        }

        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f8704a;
            if (constantState == null) {
                return -1;
            }
            return constantState.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            if (this.f8704a == null) {
                return null;
            }
            return mo8669a((Resources) null, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            if (this.f8704a == null) {
                return null;
            }
            return mo8669a(resources, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f8704a == null) {
                return null;
            }
            return mo8669a(resources, theme, this);
        }
    }

    public C2290a() {
        this.f8703d = mo8652a();
    }

    protected C2290a(Resources resources, Resources.Theme theme, C2291a aVar) {
        if (aVar != null) {
            Drawable newDrawable = resources == null ? aVar.f8704a.newDrawable() : theme == null ? aVar.f8704a.newDrawable(resources) : aVar.f8704a.newDrawable(resources, theme);
            if (newDrawable != null) {
                aVar.f8704a = newDrawable.getConstantState();
            }
            setConstantState((DrawableContainer.DrawableContainerState) aVar.f8704a);
            onStateChange(getState());
            jumpToCurrentState();
            C2291a aVar2 = this.f8703d;
            aVar2.f8705b = aVar.f8705b;
            aVar2.f8706c = aVar.f8706c;
            aVar2.f8707d = aVar.f8707d;
            aVar2.f8713j = aVar.f8713j;
            return;
        }
        Log.e(f8702e, "checkWidgetConstantState is null ,but it can't be null", (Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2291a mo8652a() {
        return new C2291a();
    }

    public boolean canApplyTheme() {
        return true;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f8703d;
    }

    /* access modifiers changed from: protected */
    public void setConstantState(DrawableContainer.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (this.f8703d == null) {
            this.f8703d = mo8652a();
        }
        this.f8703d.f8704a = drawableContainerState;
    }
}
