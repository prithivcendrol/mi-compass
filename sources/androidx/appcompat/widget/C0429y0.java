package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0116a;
import androidx.appcompat.view.C0181a;
import androidx.appcompat.widget.C0364o0;
import p021d.C1447a;

/* renamed from: androidx.appcompat.widget.y0 */
public class C0429y0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: m */
    private static final Interpolator f1558m = new DecelerateInterpolator();

    /* renamed from: d */
    Runnable f1559d;

    /* renamed from: e */
    private C0432c f1560e;

    /* renamed from: f */
    C0364o0 f1561f;

    /* renamed from: g */
    private Spinner f1562g;

    /* renamed from: h */
    private boolean f1563h;

    /* renamed from: i */
    int f1564i;

    /* renamed from: j */
    int f1565j;

    /* renamed from: k */
    private int f1566k;

    /* renamed from: l */
    private int f1567l;

    /* renamed from: androidx.appcompat.widget.y0$a */
    class C0430a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f1568d;

        C0430a(View view) {
            this.f1568d = view;
        }

        public void run() {
            C0429y0.this.smoothScrollTo(this.f1568d.getLeft() - ((C0429y0.this.getWidth() - this.f1568d.getWidth()) / 2), 0);
            C0429y0.this.f1559d = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$b */
    private class C0431b extends BaseAdapter {
        C0431b() {
        }

        public int getCount() {
            return C0429y0.this.f1561f.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0433d) C0429y0.this.f1561f.getChildAt(i)).mo2330b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0429y0.this.mo2313c((C0116a.C0120d) getItem(i), true);
            }
            ((C0433d) view).mo2329a((C0116a.C0120d) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$c */
    private class C0432c implements View.OnClickListener {
        C0432c() {
        }

        public void onClick(View view) {
            ((C0433d) view).mo2330b().mo394f();
            int childCount = C0429y0.this.f1561f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0429y0.this.f1561f.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$d */
    private class C0433d extends LinearLayout {

        /* renamed from: d */
        private final int[] f1572d;

        /* renamed from: e */
        private C0116a.C0120d f1573e;

        /* renamed from: f */
        private TextView f1574f;

        /* renamed from: g */
        private ImageView f1575g;

        /* renamed from: h */
        private View f1576h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0433d(android.content.Context r6, androidx.appcompat.app.C0116a.C0120d r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0429y0.this = r5
                int r5 = p021d.C1447a.f5678d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1572d = r1
                r4.f1573e = r7
                androidx.appcompat.widget.g1 r5 = androidx.appcompat.widget.C0326g1.m1455u(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo1881r(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo1869f(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo1882v()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2331c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0429y0.C0433d.<init>(androidx.appcompat.widget.y0, android.content.Context, androidx.appcompat.app.a$d, boolean):void");
        }

        /* renamed from: a */
        public void mo2329a(C0116a.C0120d dVar) {
            this.f1573e = dVar;
            mo2331c();
        }

        /* renamed from: b */
        public C0116a.C0120d mo2330b() {
            return this.f1573e;
        }

        /* renamed from: c */
        public void mo2331c() {
            C0116a.C0120d dVar = this.f1573e;
            View b = dVar.mo390b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1576h = b;
                TextView textView = this.f1574f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1575g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1575g.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1576h;
            if (view != null) {
                removeView(view);
                this.f1576h = null;
            }
            Drawable c = dVar.mo391c();
            CharSequence e = dVar.mo393e();
            if (c != null) {
                if (this.f1575g == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1575g = appCompatImageView;
                }
                this.f1575g.setImageDrawable(c);
                this.f1575g.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1575g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1575g.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(e);
            if (z) {
                if (this.f1574f == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C1447a.f5679e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1574f = appCompatTextView;
                }
                this.f1574f.setText(e);
                this.f1574f.setVisibility(0);
            } else {
                TextView textView2 = this.f1574f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1574f.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1575g;
            if (imageView3 != null) {
                imageView3.setContentDescription(dVar.mo389a());
            }
            if (!z) {
                charSequence = dVar.mo389a();
            }
            C0353l1.m1614a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0429y0.this.f1564i > 0 && getMeasuredWidth() > (i3 = C0429y0.this.f1564i)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1876b() {
        C0398v vVar = new C0398v(getContext(), (AttributeSet) null, C1447a.f5682h);
        vVar.setLayoutParams(new C0364o0.C0365a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    /* renamed from: d */
    private boolean m1877d() {
        Spinner spinner = this.f1562g;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1878e() {
        if (!m1877d()) {
            if (this.f1562g == null) {
                this.f1562g = m1876b();
            }
            removeView(this.f1561f);
            addView(this.f1562g, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1562g.getAdapter() == null) {
                this.f1562g.setAdapter(new C0431b());
            }
            Runnable runnable = this.f1559d;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1559d = null;
            }
            this.f1562g.setSelection(this.f1567l);
        }
    }

    /* renamed from: f */
    private boolean m1879f() {
        if (!m1877d()) {
            return false;
        }
        removeView(this.f1562g);
        addView(this.f1561f, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1562g.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2312a(int i) {
        View childAt = this.f1561f.getChildAt(i);
        Runnable runnable = this.f1559d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0430a aVar = new C0430a(childAt);
        this.f1559d = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0433d mo2313c(C0116a.C0120d dVar, boolean z) {
        C0433d dVar2 = new C0433d(getContext(), dVar, z);
        if (z) {
            dVar2.setBackgroundDrawable((Drawable) null);
            dVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1566k));
        } else {
            dVar2.setFocusable(true);
            if (this.f1560e == null) {
                this.f1560e = new C0432c();
            }
            dVar2.setOnClickListener(this.f1560e);
        }
        return dVar2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1559d;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0181a b = C0181a.m696b(getContext());
        setContentHeight(b.mo632f());
        this.f1565j = b.mo631e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1559d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0433d) view).mo2330b().mo394f();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1561f.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1564i = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1564i = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1564i, this.f1565j);
        }
        this.f1564i = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1566k, 1073741824);
        if (z2 || !this.f1563h) {
            z = false;
        }
        if (z) {
            this.f1561f.measure(0, makeMeasureSpec);
            if (this.f1561f.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1878e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1567l);
                    return;
                }
            }
        }
        m1879f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1563h = z;
    }

    public void setContentHeight(int i) {
        this.f1566k = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1567l = i;
        int childCount = this.f1561f.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1561f.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2312a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1562g;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
