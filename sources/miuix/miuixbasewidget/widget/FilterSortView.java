package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0466e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p067k3.C1790d;
import p067k3.C1791e;
import p067k3.C1792f;
import p067k3.C1794h;
import p067k3.C1795i;
import p080m4.C1963a;

public class FilterSortView extends ConstraintLayout {

    /* renamed from: B */
    private List<Integer> f8773B;

    /* renamed from: C */
    private int f8774C;

    /* renamed from: D */
    private TabView f8775D;

    /* renamed from: E */
    private boolean f8776E;

    /* renamed from: F */
    private final int f8777F;

    /* renamed from: G */
    private boolean f8778G;

    /* renamed from: H */
    private boolean f8779H;

    /* renamed from: I */
    private boolean f8780I;

    /* renamed from: J */
    private int f8781J;

    /* renamed from: K */
    private TabView.C2305d f8782K;

    /* renamed from: L */
    private TabView.C2304c f8783L;

    public static class TabView extends LinearLayout {

        /* renamed from: d */
        private TextView f8784d;

        /* renamed from: e */
        private ImageView f8785e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f8786f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f8787g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f8788h;

        /* renamed from: i */
        private int f8789i;

        /* renamed from: j */
        private FilterSortView f8790j;

        /* renamed from: k */
        private Drawable f8791k;

        /* renamed from: l */
        private ColorStateList f8792l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C2305d f8793m;

        /* renamed from: n */
        private C2304c f8794n;

        /* renamed from: o */
        private C1963a f8795o;

        /* renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$a */
        class C2302a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ boolean f8796d;

            C2302a(boolean z) {
                this.f8796d = z;
            }

            public void run() {
                if (TabView.this.f8793m != null && this.f8796d) {
                    TabView.this.f8793m.mo8742a(TabView.this, this.f8796d);
                }
            }
        }

        /* renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$b */
        class C2303b implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ View.OnClickListener f8798d;

            C2303b(View.OnClickListener onClickListener) {
                this.f8798d = onClickListener;
            }

            public void onClick(View view) {
                if (!TabView.this.f8786f) {
                    TabView.this.setFiltered(true);
                } else if (TabView.this.f8788h) {
                    TabView tabView = TabView.this;
                    tabView.setDescending(true ^ tabView.f8787g);
                }
                this.f8798d.onClick(view);
                if (HapticCompat.m10231c("2.0")) {
                    TabView.this.getHapticFeedbackCompat().mo6600a(204);
                } else {
                    HapticCompat.performHapticFeedback(view, C2403h.f9372k);
                }
            }
        }

        /* renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$c */
        private interface C2304c {
            /* renamed from: a */
            void mo8738a();

            /* renamed from: b */
            void mo8739b();

            /* renamed from: c */
            void mo8740c(float f, float f2);

            /* renamed from: d */
            void mo8741d();
        }

        /* renamed from: miuix.miuixbasewidget.widget.FilterSortView$TabView$d */
        public interface C2305d {
            /* renamed from: a */
            void mo8742a(TabView tabView, boolean z);
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public TabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f8788h = true;
            int tabLayoutResource = getTabLayoutResource();
            LayoutInflater.from(context).inflate(tabLayoutResource, this, true);
            this.f8784d = (TextView) findViewById(16908308);
            this.f8785e = (ImageView) findViewById(C1791e.f6888a);
            if (attributeSet != null && tabLayoutResource == C1792f.f6891a) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1795i.f6911F, i, C1794h.f6895b);
                String string = obtainStyledAttributes.getString(C1795i.f6913G);
                boolean z = obtainStyledAttributes.getBoolean(C1795i.f6917I, true);
                this.f8789i = obtainStyledAttributes.getInt(C1795i.f6921K, 0);
                this.f8791k = obtainStyledAttributes.getDrawable(C1795i.f6915H);
                this.f8792l = obtainStyledAttributes.getColorStateList(C1795i.f6919J);
                obtainStyledAttributes.recycle();
                mo8727i(string, z);
            }
            this.f8785e.setVisibility(this.f8789i);
            if (getId() == -1) {
                setId(View.generateViewId());
            }
        }

        /* access modifiers changed from: private */
        public C1963a getHapticFeedbackCompat() {
            if (this.f8795o == null) {
                this.f8795o = new C1963a(getContext());
            }
            return this.f8795o;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ boolean m9736j(View view, MotionEvent motionEvent) {
            if (this.f8794n == null || motionEvent.getSource() == 4098) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 9) {
                if (this.f8786f) {
                    this.f8794n.mo8739b();
                }
                this.f8794n.mo8741d();
                return true;
            } else if (actionMasked != 10) {
                return true;
            } else {
                if (this.f8786f) {
                    this.f8794n.mo8738a();
                }
                this.f8794n.mo8740c(motionEvent.getX() + ((float) getLeft()), motionEvent.getY());
                return true;
            }
        }

        /* renamed from: k */
        private Drawable m9737k() {
            return getResources().getDrawable(C1790d.f6886a);
        }

        /* access modifiers changed from: private */
        public void setDescending(boolean z) {
            ImageView imageView;
            float f;
            this.f8787g = z;
            if (z) {
                imageView = this.f8785e;
                f = 0.0f;
            } else {
                imageView = this.f8785e;
                f = 180.0f;
            }
            imageView.setRotationX(f);
        }

        /* access modifiers changed from: private */
        public void setFiltered(boolean z) {
            TabView tabView;
            FilterSortView filterSortView = (FilterSortView) getParent();
            this.f8790j = filterSortView;
            if (z && filterSortView != null) {
                int childCount = filterSortView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f8790j.getChildAt(i);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.f8786f) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.f8786f = z;
            this.f8784d.setSelected(z);
            this.f8785e.setSelected(z);
            setSelected(z);
            this.f8790j.setNeedAnim(true);
            this.f8790j.post(new C2302a(z));
        }

        public View getArrowView() {
            return this.f8785e;
        }

        public boolean getDescendingEnabled() {
            return this.f8788h;
        }

        public ImageView getIconView() {
            return this.f8785e;
        }

        /* access modifiers changed from: protected */
        public int getTabLayoutResource() {
            return C1792f.f6891a;
        }

        public TextView getTextView() {
            return this.f8784d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo8727i(CharSequence charSequence, boolean z) {
            setGravity(17);
            if (getBackground() == null) {
                setBackground(m9737k());
            }
            this.f8785e.setBackground(this.f8791k);
            ColorStateList colorStateList = this.f8792l;
            if (colorStateList != null) {
                this.f8784d.setTextColor(colorStateList);
            }
            this.f8784d.setText(charSequence);
            setDescending(z);
            setOnHoverListener(new C2310b(this));
        }

        public void setDescendingEnabled(boolean z) {
            this.f8788h = z;
        }

        public void setEnabled(boolean z) {
            super.setEnabled(z);
            this.f8784d.setEnabled(z);
        }

        public void setFilterHoverListener(C2304c cVar) {
            this.f8794n = cVar;
        }

        public void setIconView(ImageView imageView) {
            this.f8785e = imageView;
        }

        public void setIndicatorVisibility(int i) {
            this.f8785e.setVisibility(i);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(new C2303b(onClickListener));
        }

        public void setOnFilteredListener(C2305d dVar) {
            this.f8793m = dVar;
        }

        public void setTextView(TextView textView) {
            this.f8784d = textView;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m9722C(ConstraintLayout.C0455b bVar) {
        this.f8775D.setLayoutParams(bVar);
    }

    /* renamed from: D */
    private void m9723D() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.f8776E);
            }
        }
    }

    /* renamed from: F */
    private void m9724F(TabView tabView) {
        if (this.f8775D.getVisibility() != 0) {
            this.f8775D.setVisibility(0);
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) this.f8775D.getLayoutParams();
        bVar.width = tabView.getWidth();
        bVar.height = getHeight() - (this.f8777F * 2);
        this.f8775D.setX(tabView.getX());
        this.f8775D.setY((float) this.f8777F);
        post(new C2309a(this, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public TabView mo8708B(int i) {
        if (i <= -1) {
            return null;
        }
        View childAt = getChildAt((getChildCount() - this.f8781J) + i);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo8709E() {
        if (this.f8773B.size() == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    if (tabView.getId() != this.f8775D.getId()) {
                        tabView.setOnFilteredListener(this.f8782K);
                        this.f8773B.add(Integer.valueOf(tabView.getId()));
                        tabView.setFilterHoverListener(this.f8783L);
                    }
                }
            }
            C0466e eVar = new C0466e();
            eVar.mo2502i(this);
            mo8710G(eVar);
            eVar.mo2496c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo8710G(C0466e eVar) {
        int i = 0;
        while (i < this.f8773B.size()) {
            int intValue = this.f8773B.get(i).intValue();
            eVar.mo2507n(intValue, 0);
            eVar.mo2506m(intValue, -2);
            eVar.mo2510z(intValue, 1.0f);
            int intValue2 = i == 0 ? 0 : this.f8773B.get(i - 1).intValue();
            int intValue3 = i == this.f8773B.size() + -1 ? 0 : this.f8773B.get(i + 1).intValue();
            eVar.mo2499f(intValue, 0);
            eVar.mo2505l(intValue, 6, intValue2, intValue2 == 0 ? 6 : 7, intValue2 == 0 ? this.f8777F : 0);
            C0466e eVar2 = eVar;
            int i2 = intValue;
            eVar2.mo2505l(i2, 7, intValue3, intValue3 == 0 ? 7 : 6, intValue3 == 0 ? this.f8777F : 0);
            eVar2.mo2505l(i2, 3, 0, 3, this.f8777F);
            eVar2.mo2505l(i2, 4, 0, 4, this.f8777F);
            i++;
        }
    }

    public boolean getEnabled() {
        return this.f8776E;
    }

    public TabView.C2304c getFilterHoverListener() {
        return this.f8783L;
    }

    public TabView.C2305d getOnFilteredListener() {
        return this.f8782K;
    }

    /* access modifiers changed from: protected */
    public int getTabCount() {
        return this.f8781J;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8778G = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabView tabView;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f8774C;
        if (i5 != -1 && !this.f8778G && (tabView = (TabView) findViewById(i5)) != null) {
            m9724F(tabView);
            if (tabView.getWidth() > 0) {
                this.f8778G = true;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f8776E != z) {
            this.f8776E = z;
            m9723D();
        }
    }

    public void setFilteredTab(int i) {
        TabView B = mo8708B(i);
        if (B != null) {
            if (this.f8774C != B.getId()) {
                this.f8779H = this.f8774C != -1;
                this.f8780I = false;
                this.f8774C = B.getId();
            } else if (this.f8780I) {
                this.f8779H = false;
            }
            B.setFiltered(true);
        }
        mo8709E();
    }

    public void setFilteredTab(TabView tabView) {
        if (this.f8774C != tabView.getId()) {
            this.f8779H = this.f8774C != -1;
            this.f8780I = false;
            this.f8774C = tabView.getId();
        } else if (this.f8780I) {
            this.f8779H = false;
        }
        tabView.setFiltered(true);
        mo8709E();
    }

    /* access modifiers changed from: protected */
    public void setFilteredUpdated(boolean z) {
        this.f8778G = z;
    }

    /* access modifiers changed from: protected */
    public void setNeedAnim(boolean z) {
        this.f8779H = z;
        this.f8780I = false;
    }

    public void setTabIncatorVisibility(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i);
            }
        }
    }
}
