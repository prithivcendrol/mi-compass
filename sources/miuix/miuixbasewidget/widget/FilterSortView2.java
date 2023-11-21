package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.C0828k;
import java.util.ArrayList;
import miuix.miuixbasewidget.widget.internal.C2313a;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p067k3.C1787a;
import p067k3.C1789c;
import p067k3.C1791e;
import p067k3.C1792f;
import p067k3.C1794h;
import p067k3.C1795i;
import p073l3.C1878b;
import p080m4.C1963a;

public class FilterSortView2 extends HorizontalScrollView {

    /* renamed from: d */
    private final ArrayList<Integer> f8800d;

    /* renamed from: e */
    private int f8801e;

    /* renamed from: f */
    private boolean f8802f;

    /* renamed from: g */
    private C2313a f8803g;

    /* renamed from: h */
    protected boolean f8804h;

    /* renamed from: i */
    private int f8805i;

    /* renamed from: j */
    private int f8806j;

    /* renamed from: k */
    private final int f8807k;

    public static class TabView extends FrameLayout {

        /* renamed from: d */
        private TextView f8808d;

        /* renamed from: e */
        private ImageView f8809e;

        /* renamed from: f */
        private boolean f8810f;

        /* renamed from: g */
        private boolean f8811g;

        /* renamed from: h */
        private boolean f8812h;

        /* renamed from: i */
        private int f8813i;

        /* renamed from: j */
        private Drawable f8814j;

        /* renamed from: k */
        private C2306a f8815k;

        /* renamed from: l */
        private C1963a f8816l;

        /* renamed from: m */
        private int f8817m;

        /* renamed from: n */
        private int f8818n;

        /* renamed from: miuix.miuixbasewidget.widget.FilterSortView2$TabView$a */
        public interface C2306a {
            /* renamed from: a */
            void mo8775a(TabView tabView, boolean z);
        }

        public TabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1787a.f6876a);
        }

        public TabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f8812h = true;
            LayoutInflater.from(context).inflate(getTabLayoutResource(), this, true);
            TextView textView = (TextView) findViewById(16908308);
            this.f8808d = textView;
            textView.setMaxLines(1);
            this.f8808d.setEllipsize(TextUtils.TruncateAt.END);
            this.f8809e = (ImageView) findViewById(C1791e.f6888a);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1795i.f6923L, i, C1794h.f6894a);
                String string = obtainStyledAttributes.getString(C1795i.f6925M);
                boolean z = obtainStyledAttributes.getBoolean(C1795i.f6929O, true);
                this.f8813i = obtainStyledAttributes.getInt(C1795i.f6943V, 0);
                this.f8814j = obtainStyledAttributes.getDrawable(C1795i.f6927N);
                setBackground(obtainStyledAttributes.getDrawable(C1795i.f6931P));
                setForeground(obtainStyledAttributes.getDrawable(C1795i.f6933Q));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1795i.f6935R, C1789c.f6879a);
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C1795i.f6941U, C1789c.f6880b);
                findViewById(C1791e.f6890c).setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                this.f8817m = obtainStyledAttributes.getResourceId(C1795i.f6939T, 0);
                this.f8818n = obtainStyledAttributes.getResourceId(C1795i.f6937S, 0);
                obtainStyledAttributes.recycle();
                mo8759d(string, z);
            }
            if (getId() == -1) {
                setId(View.generateViewId());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m9755f() {
            C2306a aVar = this.f8815k;
            if (aVar != null) {
                aVar.mo8775a(this, true);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m9756g(View.OnClickListener onClickListener, View view) {
            if (!this.f8810f) {
                setFiltered(true);
            } else if (this.f8812h) {
                setDescending(!this.f8811g);
            }
            onClickListener.onClick(view);
            if (HapticCompat.m10231c("2.0")) {
                getHapticFeedbackCompat().mo6600a(204);
            } else {
                HapticCompat.performHapticFeedback(view, C2403h.f9372k);
            }
        }

        private C1963a getHapticFeedbackCompat() {
            if (this.f8816l == null) {
                this.f8816l = new C1963a(getContext());
            }
            return this.f8816l;
        }

        /* renamed from: h */
        private void m9757h() {
            int i;
            TextView textView;
            if (this.f8808d != null) {
                if (mo8760e()) {
                    textView = this.f8808d;
                    i = this.f8818n;
                } else {
                    textView = this.f8808d;
                    i = this.f8817m;
                }
                C0828k.m3313l(textView, i);
            }
        }

        private void setDescending(boolean z) {
            ImageView imageView;
            float f;
            this.f8811g = z;
            if (z) {
                imageView = this.f8809e;
                f = 0.0f;
            } else {
                imageView = this.f8809e;
                f = 180.0f;
            }
            imageView.setRotationX(f);
        }

        /* access modifiers changed from: private */
        public void setFiltered(boolean z) {
            TabView tabView;
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (z && viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof TabView) && (tabView = (TabView) childAt) != this && tabView.f8810f) {
                        tabView.setFiltered(false);
                    }
                }
            }
            this.f8810f = z;
            m9757h();
            this.f8808d.setActivated(z);
            this.f8809e.setActivated(z);
            setActivated(z);
            if (viewGroup != null && z) {
                viewGroup.post(new C2312d(this));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo8759d(CharSequence charSequence, boolean z) {
            this.f8809e.setBackground(this.f8814j);
            this.f8808d.setText(charSequence);
            this.f8809e.setVisibility(this.f8813i);
            setDescending(z);
            m9757h();
        }

        /* renamed from: e */
        public boolean mo8760e() {
            return this.f8810f;
        }

        public View getArrowView() {
            return this.f8809e;
        }

        public boolean getDescendingEnabled() {
            return this.f8812h;
        }

        public ImageView getIconView() {
            return this.f8809e;
        }

        /* access modifiers changed from: protected */
        public int getTabLayoutResource() {
            return C1792f.f6892b;
        }

        public TextView getTextView() {
            return this.f8808d;
        }

        public void setActivatedTextAppearance(int i) {
            this.f8818n = i;
            m9757h();
        }

        public void setDescendingEnabled(boolean z) {
            this.f8812h = z;
        }

        public void setEnabled(boolean z) {
            super.setEnabled(z);
            this.f8808d.setEnabled(z);
        }

        public void setIconView(ImageView imageView) {
            this.f8809e = imageView;
        }

        public void setIndicatorVisibility(int i) {
            this.f8809e.setVisibility(i);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(new C2311c(this, onClickListener));
        }

        public void setOnFilteredListener(C2306a aVar) {
            this.f8815k = aVar;
        }

        public void setTextAppearance(int i) {
            this.f8817m = i;
            m9757h();
        }

        public void setTextView(TextView textView) {
            this.f8808d = textView;
        }
    }

    public FilterSortView2(Context context) {
        this(context, (AttributeSet) null);
    }

    public FilterSortView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1787a.f6877b);
    }

    public FilterSortView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8800d = new ArrayList<>();
        this.f8801e = -1;
        this.f8804h = false;
        this.f8805i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1795i.f6947X, i, C1794h.f6896c);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1795i.f6951Z);
        this.f8802f = obtainStyledAttributes.getBoolean(C1795i.f6949Y, true);
        this.f8806j = obtainStyledAttributes.getInt(C1795i.f6954a0, 0);
        obtainStyledAttributes.recycle();
        m9746f();
        setBackground(drawable);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f8807k = C1878b.m7804a(context);
        setOverScrollMode(2);
    }

    /* renamed from: a */
    private void m9744a(TabView tabView, int i) {
        tabView.setEnabled(this.f8802f);
        tabView.setSelected(this.f8804h);
        mo8747b(tabView, i);
        this.f8800d.add(Integer.valueOf(tabView.getId()));
    }

    /* renamed from: d */
    private void m9745d(View view) {
        if (!(view instanceof TabView)) {
            throw new IllegalArgumentException("Illegal View! Only support TabView!");
        }
    }

    /* renamed from: f */
    private void m9746f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C2313a aVar = new C2313a(getContext());
        this.f8803g = aVar;
        aVar.setLayoutParams(layoutParams);
        this.f8803g.setHorizontalScrollBarEnabled(false);
        addView(this.f8803g);
    }

    /* renamed from: g */
    private void m9747g() {
        for (int i = 0; i < this.f8803g.getChildCount(); i++) {
            View childAt = this.f8803g.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setEnabled(this.f8802f);
            }
        }
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void addView(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
            }
            addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f8803g == view) {
            super.addView(view, i, layoutParams);
            return;
        }
        m9745d(view);
        m9744a((TabView) view, i);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, (ViewGroup.LayoutParams) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8747b(TabView tabView, int i) {
        if (tabView != null) {
            if (i > this.f8805i || i < 0) {
                this.f8803g.addView(tabView, -1, new FrameLayout.LayoutParams(-2, -2));
            } else {
                this.f8803g.addView(tabView, i, new FrameLayout.LayoutParams(-2, -2));
            }
            this.f8805i++;
        }
    }

    /* renamed from: c */
    public void mo8748c(int i) {
        this.f8800d.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public TabView mo8749e(int i) {
        if (i <= -1) {
            return null;
        }
        View childAt = this.f8803g.getChildAt((this.f8803g.getChildCount() - this.f8805i) + i);
        if (childAt instanceof TabView) {
            return (TabView) childAt;
        }
        return null;
    }

    public boolean getEnabled() {
        return this.f8802f;
    }

    /* access modifiers changed from: protected */
    public int getTabCount() {
        return this.f8805i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8752h() {
        if (this.f8800d.isEmpty()) {
            int childCount = this.f8803g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f8803g.getChildAt(i);
                if (childAt instanceof TabView) {
                    this.f8800d.add(Integer.valueOf(((TabView) childAt).getId()));
                }
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r0 > 670) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r2 == 3) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (r1 > 670) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r8.f8806j
            r3 = 670(0x29e, float:9.39E-43)
            r4 = 2
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L_0x003a
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r1
            int r0 = (int) r0
            android.content.Context r2 = r8.getContext()
            android.graphics.Point r2 = p117t2.C2693a.m11241j(r2)
            int r2 = r2.x
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = r2 / r1
            int r1 = (int) r2
            int r2 = r8.f8807k
            if (r2 != r4) goto L_0x0055
            r2 = 410(0x19a, float:5.75E-43)
            if (r0 <= r2) goto L_0x0055
            if (r1 <= r3) goto L_0x0055
            goto L_0x0056
        L_0x003a:
            if (r2 != r6) goto L_0x0051
            android.content.Context r0 = r8.getContext()
            android.graphics.Point r0 = p117t2.C2693a.m11241j(r0)
            int r0 = r0.x
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r1
            int r0 = (int) r0
            int r1 = r8.f8807k
            if (r1 != r4) goto L_0x0055
            if (r0 <= r3) goto L_0x0055
            goto L_0x0056
        L_0x0051:
            r0 = 3
            if (r2 != r0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r6 = r7
        L_0x0056:
            miuix.miuixbasewidget.widget.internal.a r0 = r8.f8803g
            r0.setTabViewLayoutMode(r6)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.miuixbasewidget.widget.FilterSortView2.onMeasure(int, int):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f8802f != z) {
            this.f8802f = z;
            m9747g();
        }
    }

    public void setFilteredTab(int i) {
        TabView e = mo8749e(i);
        if (e != null) {
            if (this.f8801e != e.getId()) {
                this.f8801e = e.getId();
            }
            e.setFiltered(true);
        }
        mo8752h();
    }

    public void setFilteredTab(TabView tabView) {
        if (this.f8801e != tabView.getId()) {
            this.f8801e = tabView.getId();
        }
        tabView.setFiltered(true);
        mo8752h();
    }

    public void setLayoutConfig(int i) {
        if (this.f8806j != i) {
            this.f8806j = i;
            requestLayout();
        }
    }

    public void setParentApplyBlur(boolean z) {
        if (this.f8804h != z) {
            this.f8804h = z;
        }
        C2313a aVar = this.f8803g;
        if (aVar != null) {
            int childCount = aVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = aVar.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).setSelected(z);
                }
            }
        }
    }

    public void setTabIndicatorVisibility(int i) {
        for (int i2 = 0; i2 < this.f8803g.getChildCount(); i2++) {
            View childAt = this.f8803g.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).setIndicatorVisibility(i);
            }
        }
    }
}
