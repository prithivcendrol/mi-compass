package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: miuix.androidbasewidget.internal.view.a */
public class C1975a extends GradientDrawable {

    /* renamed from: a */
    protected C1976a f7423a;

    /* renamed from: b */
    private int f7424b = -1;

    /* renamed from: c */
    private int f7425c = -1;

    /* renamed from: miuix.androidbasewidget.internal.view.a$a */
    protected static class C1976a extends Drawable.ConstantState {

        /* renamed from: a */
        Drawable.ConstantState f7426a;

        protected C1976a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable mo6615a(Resources resources, Resources.Theme theme, C1976a aVar) {
            return new C1975a(resources, theme, aVar);
        }

        /* renamed from: b */
        public void mo6621b(Drawable.ConstantState constantState) {
            this.f7426a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f7426a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f7426a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            if (this.f7426a == null) {
                return null;
            }
            return mo6615a((Resources) null, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            if (this.f7426a == null) {
                return null;
            }
            return mo6615a(resources, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f7426a == null) {
                return null;
            }
            return mo6615a(resources, theme, this);
        }
    }

    public C1975a() {
        C1976a a = mo6607a();
        this.f7423a = a;
        a.mo6621b(super.getConstantState());
    }

    public C1975a(Resources resources, Resources.Theme theme, C1976a aVar) {
        Drawable newDrawable = resources == null ? aVar.f7426a.newDrawable() : theme == null ? aVar.f7426a.newDrawable(resources) : aVar.f7426a.newDrawable(resources, theme);
        aVar.f7426a = newDrawable.getConstantState();
        C1976a a = mo6607a();
        this.f7423a = a;
        a.mo6621b(aVar.f7426a);
        this.f7424b = newDrawable.getIntrinsicWidth();
        this.f7425c = newDrawable.getIntrinsicHeight();
        if (newDrawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) newDrawable;
            setCornerRadius(gradientDrawable.getCornerRadius());
            setShape(gradientDrawable.getShape());
            setColor(gradientDrawable.getColor());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1976a mo6607a() {
        return new C1976a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6608b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6609c() {
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7423a;
    }

    public int getIntrinsicHeight() {
        return this.f7425c;
    }

    public int getIntrinsicWidth() {
        return this.f7424b;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919) {
                z = true;
            }
        }
        if (z) {
            mo6608b();
        }
        if (!z) {
            mo6609c();
        }
        return onStateChange;
    }
}
