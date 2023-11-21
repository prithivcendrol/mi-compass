package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0232n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0353l1;
import androidx.appcompat.widget.C0359n0;
import p021d.C1456j;

public class ActionMenuItemView extends AppCompatTextView implements C0232n.C0233a, View.OnClickListener, ActionMenuView.C0248a {

    /* renamed from: k */
    C0218i f633k;

    /* renamed from: l */
    private CharSequence f634l;

    /* renamed from: m */
    private Drawable f635m;

    /* renamed from: n */
    C0214g.C0216b f636n;

    /* renamed from: o */
    private C0359n0 f637o;

    /* renamed from: p */
    C0201b f638p;

    /* renamed from: q */
    private boolean f639q;

    /* renamed from: r */
    private boolean f640r;

    /* renamed from: s */
    private int f641s;

    /* renamed from: t */
    private int f642t;

    /* renamed from: u */
    private int f643u;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0200a extends C0359n0 {
        public C0200a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0235p mo720b() {
            C0201b bVar = ActionMenuItemView.this.f638p;
            if (bVar != null) {
                return bVar.mo722a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo720b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo721c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f636n
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f633k
                boolean r0 = r1.mo723a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.mo720b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0200a.mo721c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0201b {
        /* renamed from: a */
        public abstract C0235p mo722a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f639q = m783s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f6077v, i, 0);
        this.f641s = obtainStyledAttributes.getDimensionPixelSize(C1456j.f6082w, 0);
        obtainStyledAttributes.recycle();
        this.f643u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f642t = -1;
        setSaveEnabled(false);
    }

    /* renamed from: s */
    private boolean m783s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: t */
    private void m784t() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f634l);
        if (this.f635m != null && (!this.f633k.mo940B() || (!this.f639q && !this.f640r))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f634l : null);
        CharSequence contentDescription = this.f633k.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f633k.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f633k.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f633k.getTitle();
            }
            C0353l1.m1614a(this, charSequence);
            return;
        }
        C0353l1.m1614a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo700a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo701b() {
        return mo711r();
    }

    /* renamed from: c */
    public boolean mo702c() {
        return mo711r() && this.f633k.getIcon() == null;
    }

    /* renamed from: d */
    public void mo703d(C0218i iVar, int i) {
        this.f633k = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo958i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f637o == null) {
            this.f637o = new C0200a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0218i getItemData() {
        return this.f633k;
    }

    public void onClick(View view) {
        C0214g.C0216b bVar = this.f636n;
        if (bVar != null) {
            bVar.mo723a(this.f633k);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f639q = m783s();
        m784t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean r = mo711r();
        if (r && (i3 = this.f642t) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f641s) : this.f641s;
        if (mode != 1073741824 && this.f641s > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!r && this.f635m != null) {
            super.setPadding((getMeasuredWidth() - this.f635m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0359n0 n0Var;
        if (!this.f633k.hasSubMenu() || (n0Var = this.f637o) == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo711r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f640r != z) {
            this.f640r = z;
            C0218i iVar = this.f633k;
            if (iVar != null) {
                iVar.mo941c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f635m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f643u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m784t();
    }

    public void setItemInvoker(C0214g.C0216b bVar) {
        this.f636n = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f642t = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0201b bVar) {
        this.f638p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f634l = charSequence;
        m784t();
    }
}
