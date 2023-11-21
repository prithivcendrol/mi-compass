package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0116a;
import java.lang.ref.WeakReference;
import miuix.miuixbasewidget.widget.FilterSortView2;
import p018c2.C1347c;
import p018c2.C1354j;
import p055i3.C1649c;
import p102q2.C2582a;

public class SecondaryTabContainerView extends FilterSortView2 {

    /* renamed from: l */
    private C2180a f8211l;

    /* renamed from: m */
    private int f8212m;

    /* renamed from: n */
    private boolean f8213n;

    /* renamed from: o */
    private int f8214o;

    /* renamed from: p */
    private int f8215p;

    public static class SecondaryTabView extends FilterSortView2.TabView {

        /* renamed from: o */
        private C0116a.C0120d f8216o;

        /* renamed from: p */
        private SecondaryTabContainerView f8217p;

        /* renamed from: q */
        private View f8218q;

        /* renamed from: r */
        private final C2582a f8219r;

        /* renamed from: s */
        private boolean f8220s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public boolean f8221t;

        public SecondaryTabView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public SecondaryTabView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f8220s = false;
            this.f8221t = true;
            this.f8219r = new C2582a(context, 2);
        }

        /* renamed from: m */
        private void m9082m() {
            C2582a aVar = this.f8219r;
            if (aVar != null) {
                aVar.mo9845a(this);
            }
        }

        /* renamed from: n */
        private void m9083n() {
            C2582a aVar = this.f8219r;
            if (aVar != null) {
                aVar.mo9847c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m9084o(CharSequence charSequence) {
            super.mo8759d(charSequence, true);
        }

        /* renamed from: q */
        private void m9085q() {
            if (this.f8220s) {
                m9082m();
            } else {
                m9083n();
            }
        }

        /* renamed from: r */
        private void m9086r() {
            ImageView iconView = getIconView();
            if (iconView != null) {
                iconView.setImageDrawable(this.f8216o.mo391c());
            }
        }

        private void setBadgeDisappearOnClick(boolean z) {
            this.f8221t = z;
        }

        /* access modifiers changed from: private */
        public void setBadgeNeeded(boolean z) {
            this.f8220s = z;
            m9085q();
        }

        public C0116a.C0120d getTab() {
            return this.f8216o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo8113l(SecondaryTabContainerView secondaryTabContainerView, C0116a.C0120d dVar) {
            this.f8217p = secondaryTabContainerView;
            this.f8216o = dVar;
            mo8116p();
        }

        /* access modifiers changed from: protected */
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            m9086r();
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            m9085q();
        }

        /* renamed from: p */
        public void mo8116p() {
            C0116a.C0120d dVar = this.f8216o;
            View b = dVar.mo390b();
            ImageView iconView = getIconView();
            TextView textView = getTextView();
            if (b != null) {
                this.f8218q = this.f8217p.mo8106o(this, b, textView, iconView);
                return;
            }
            View view = this.f8218q;
            if (view != null) {
                removeView(view);
                this.f8218q = null;
            }
            Context context = getContext();
            Drawable c = dVar.mo391c();
            CharSequence e = dVar.mo393e();
            if (c != null) {
                if (iconView == null) {
                    ImageView imageView = new ImageView(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    setIconView(imageView);
                } else {
                    iconView.setImageDrawable(c);
                    iconView.setVisibility(0);
                }
            } else if (iconView != null) {
                iconView.setVisibility(8);
                iconView.setImageDrawable((Drawable) null);
            }
            if (e != null) {
                if (textView == null) {
                    TextView textView2 = new TextView(context);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    textView2.setLayoutParams(layoutParams2);
                    addView(textView2);
                    setTextView(textView2);
                } else {
                    textView.setText(e);
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
            if (iconView != null) {
                iconView.setContentDescription(dVar.mo389a());
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.SecondaryTabContainerView$a */
    private static class C2180a implements View.OnClickListener {

        /* renamed from: d */
        private WeakReference<SecondaryTabContainerView> f8222d;

        C2180a(SecondaryTabContainerView secondaryTabContainerView) {
            this.f8222d = new WeakReference<>(secondaryTabContainerView);
        }

        public void onClick(View view) {
            WeakReference<SecondaryTabContainerView> weakReference = this.f8222d;
            SecondaryTabContainerView secondaryTabContainerView = weakReference != null ? weakReference.get() : null;
            if (secondaryTabContainerView != null) {
                SecondaryTabView secondaryTabView = (SecondaryTabView) view;
                secondaryTabView.getTab().mo394f();
                int i = secondaryTabContainerView.getTabCount();
                for (int i2 = 0; i2 < i; i2++) {
                    FilterSortView2.TabView j = secondaryTabContainerView.mo8749e(i2);
                    j.setActivated(j == view);
                }
                if (secondaryTabView.f8221t) {
                    secondaryTabView.setBadgeNeeded(false);
                }
            }
        }
    }

    public SecondaryTabContainerView(Context context) {
        super(context);
        m9073n(context);
    }

    /* renamed from: n */
    private void m9073n(Context context) {
        this.f8214o = C1649c.m6958c(context, getDefaultTabTextStyle());
        this.f8215p = C1649c.m6958c(context, getTabActivatedTextStyle());
    }

    /* access modifiers changed from: protected */
    public int getDefaultTabTextStyle() {
        return C1347c.f4579m;
    }

    /* access modifiers changed from: protected */
    public int getTabActivatedTextStyle() {
        return C1347c.f4575i;
    }

    /* access modifiers changed from: package-private */
    public int getTabContainerHeight() {
        return -2;
    }

    /* renamed from: k */
    public SecondaryTabView mo8103k(C0116a.C0120d dVar, boolean z) {
        SecondaryTabView m = mo8105m(dVar);
        mo8747b(m, -1);
        mo8748c(m.getId());
        m.m9084o(dVar.mo393e());
        m.setSelected(this.f8804h);
        if (z) {
            setFilteredTab((FilterSortView2.TabView) m);
            m.setActivated(true);
        }
        requestLayout();
        return m;
    }

    /* renamed from: l */
    public void mo8104l(int i) {
        setFilteredTab(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public SecondaryTabView mo8105m(C0116a.C0120d dVar) {
        SecondaryTabView secondaryTabView = (SecondaryTabView) LayoutInflater.from(getContext()).inflate(C1354j.f4759b, (ViewGroup) null);
        secondaryTabView.mo8113l(this, dVar);
        secondaryTabView.setFocusable(true);
        if (this.f8211l == null) {
            this.f8211l = new C2180a(this);
        }
        secondaryTabView.setOnClickListener(this.f8211l);
        secondaryTabView.setEnabled(getEnabled());
        secondaryTabView.setTextAppearance(this.f8214o);
        secondaryTabView.setActivatedTextAppearance(this.f8215p);
        return secondaryTabView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public View mo8106o(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f8212m;
        if (i3 != -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public void mo8108p(int i) {
        FilterSortView2.TabView e = mo8749e(i);
        if (e instanceof SecondaryTabView) {
            ((SecondaryTabView) e).mo8116p();
        }
        if (this.f8213n) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f8213n = z;
    }

    /* access modifiers changed from: protected */
    public void setContentHeight(int i) {
        if (this.f8212m != i) {
            this.f8212m = i;
            requestLayout();
        }
    }

    public void setTabSelected(int i) {
        setFilteredTab(i);
    }
}
