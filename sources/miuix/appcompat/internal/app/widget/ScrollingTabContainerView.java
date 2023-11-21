package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0116a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import p018c2.C1347c;
import p018c2.C1357m;
import p055i3.C1649c;
import p078m2.C1918a;

public abstract class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    private final LayoutInflater f8118d;

    /* renamed from: e */
    Runnable f8119e;

    /* renamed from: f */
    int f8120f;

    /* renamed from: g */
    int f8121g;

    /* renamed from: h */
    private C2173b f8122h;

    /* renamed from: i */
    protected LinearLayout f8123i;

    /* renamed from: j */
    private Spinner f8124j;

    /* renamed from: k */
    private boolean f8125k;

    /* renamed from: l */
    private int f8126l;

    /* renamed from: m */
    private int f8127m;

    /* renamed from: n */
    private Bitmap f8128n;

    /* renamed from: o */
    private boolean f8129o;

    /* renamed from: p */
    private float f8130p;

    /* renamed from: q */
    private Paint f8131q = new Paint();

    /* renamed from: r */
    private int f8132r = -1;

    /* renamed from: s */
    private WeakHashMap<TextView, Integer> f8133s;

    public static class TabView extends LinearLayout {

        /* renamed from: d */
        private C0116a.C0120d f8134d;

        /* renamed from: e */
        private TextView f8135e;

        /* renamed from: f */
        private ImageView f8136f;

        /* renamed from: g */
        private View f8137g;

        /* renamed from: h */
        private ImageView f8138h;

        /* renamed from: i */
        private ScrollingTabContainerView f8139i;

        public TabView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8045a(ScrollingTabContainerView scrollingTabContainerView, C0116a.C0120d dVar, boolean z) {
            this.f8139i = scrollingTabContainerView;
            this.f8134d = dVar;
            if (z) {
                setGravity(8388627);
            }
            mo8047c();
        }

        /* renamed from: b */
        public void mo8046b(C0116a.C0120d dVar) {
            this.f8134d = dVar;
            mo8047c();
        }

        /* renamed from: c */
        public void mo8047c() {
            Drawable h;
            int intrinsicHeight;
            int lineHeight;
            C0116a.C0120d dVar = this.f8134d;
            View b = dVar.mo390b();
            if (b != null) {
                this.f8137g = this.f8139i.mo8031j(this, b, this.f8135e, this.f8136f);
            } else {
                View view = this.f8137g;
                if (view != null) {
                    removeView(view);
                    this.f8137g = null;
                }
                Context context = getContext();
                Drawable c = dVar.mo391c();
                CharSequence e = dVar.mo393e();
                if (c != null) {
                    if (this.f8136f == null) {
                        ImageView imageView = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        imageView.setLayoutParams(layoutParams);
                        addView(imageView, 0);
                        this.f8136f = imageView;
                    }
                    this.f8136f.setImageDrawable(c);
                    this.f8136f.setVisibility(0);
                } else {
                    ImageView imageView2 = this.f8136f;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                        this.f8136f.setImageDrawable((Drawable) null);
                    }
                }
                if (e != null) {
                    if (this.f8135e == null) {
                        C2214w wVar = new C2214w(context, (AttributeSet) null, this.f8139i.getDefaultTabTextStyle());
                        wVar.setEllipsize(TextUtils.TruncateAt.END);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 16;
                        wVar.setLayoutParams(layoutParams2);
                        addView(wVar);
                        this.f8135e = wVar;
                    }
                    this.f8135e.setText(e);
                    this.f8135e.setVisibility(0);
                    if (this.f8138h == null && (h = C1649c.m6963h(context, C1347c.f4576j)) != null) {
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setImageDrawable(h);
                        imageView3.setVisibility(8);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.gravity = 48;
                        Drawable background = getBackground();
                        if (background != null && (intrinsicHeight = background.getIntrinsicHeight()) > (lineHeight = this.f8135e.getLineHeight())) {
                            layoutParams3.topMargin = (intrinsicHeight - lineHeight) / 2;
                        }
                        imageView3.setLayoutParams(layoutParams3);
                        addView(imageView3);
                        this.f8138h = imageView3;
                    }
                } else {
                    TextView textView = this.f8135e;
                    if (textView != null) {
                        textView.setVisibility(8);
                        this.f8135e.setText((CharSequence) null);
                    }
                }
                ImageView imageView4 = this.f8136f;
                if (imageView4 != null) {
                    imageView4.setContentDescription(dVar.mo389a());
                }
            }
            this.f8139i.mo8033l(this.f8135e);
        }

        public C0116a.C0120d getTab() {
            return this.f8134d;
        }

        public TextView getTextView() {
            return this.f8135e;
        }

        /* access modifiers changed from: protected */
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            TextView textView = this.f8135e;
            if (textView != null) {
                this.f8135e.setTextAppearance(this.f8139i.mo8021f(textView));
            }
            ImageView imageView = this.f8136f;
            if (imageView != null) {
                imageView.setImageDrawable(this.f8134d.mo391c());
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ScrollingTabContainerView$a */
    private class C2172a extends BaseAdapter {

        /* renamed from: d */
        final /* synthetic */ ScrollingTabContainerView f8140d;

        public int getCount() {
            return this.f8140d.f8123i.getChildCount();
        }

        public Object getItem(int i) {
            return ((TabView) this.f8140d.f8123i.getChildAt(i)).getTab();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f8140d.m8996d((C0116a.C0120d) getItem(i), true);
            }
            ((TabView) view).mo8046b((C0116a.C0120d) getItem(i));
            return view;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ScrollingTabContainerView$b */
    private static class C2173b implements View.OnClickListener {

        /* renamed from: d */
        private WeakReference<ScrollingTabContainerView> f8141d;

        C2173b(ScrollingTabContainerView scrollingTabContainerView) {
            this.f8141d = new WeakReference<>(scrollingTabContainerView);
        }

        public void onClick(View view) {
            WeakReference<ScrollingTabContainerView> weakReference = this.f8141d;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView != null) {
                ((TabView) view).getTab().mo394f();
                int childCount = scrollingTabContainerView.f8123i.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = scrollingTabContainerView.f8123i.getChildAt(i);
                    childAt.setSelected(childAt == view);
                }
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ScrollingTabContainerView$c */
    private static class C2174c implements Runnable {

        /* renamed from: d */
        private WeakReference<ScrollingTabContainerView> f8142d;

        /* renamed from: e */
        private int f8143e;

        C2174c(ScrollingTabContainerView scrollingTabContainerView, int i) {
            this.f8142d = new WeakReference<>(scrollingTabContainerView);
            this.f8143e = i;
        }

        public void run() {
            View childAt;
            WeakReference<ScrollingTabContainerView> weakReference = this.f8142d;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView != null && (childAt = scrollingTabContainerView.f8123i.getChildAt(this.f8143e)) != null) {
                scrollingTabContainerView.smoothScrollTo(childAt.getLeft() - ((scrollingTabContainerView.getWidth() - childAt.getWidth()) / 2), 0);
                scrollingTabContainerView.f8119e = null;
            }
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        LayoutInflater from = LayoutInflater.from(context);
        this.f8118d = from;
        C1918a b = C1918a.m7836b(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1357m.f4900a, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1357m.f5024z);
        this.f8129o = obtainStyledAttributes.getBoolean(C1357m.f4804C, true);
        this.f8128n = m8997e(drawable);
        obtainStyledAttributes.recycle();
        if (this.f8129o) {
            this.f8131q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        setHorizontalScrollBarEnabled(false);
        this.f8121g = b.mo6467d();
        LinearLayout linearLayout = (LinearLayout) from.inflate(getTabBarLayoutRes(), this, false);
        this.f8123i = linearLayout;
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public TabView m8996d(C0116a.C0120d dVar, boolean z) {
        TabView tabView = (TabView) this.f8118d.inflate(getTabViewLayoutRes(), this.f8123i, false);
        tabView.mo8045a(this, dVar, z);
        if (z) {
            tabView.setBackground((Drawable) null);
            tabView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f8126l));
        } else {
            tabView.setFocusable(true);
            if (this.f8122h == null) {
                this.f8122h = new C2173b(this);
            }
            tabView.setOnClickListener(this.f8122h);
        }
        if (this.f8123i.getChildCount() != 0) {
            ((LinearLayout.LayoutParams) tabView.getLayoutParams()).setMarginStart(getTabViewMarginHorizontal());
        }
        return tabView;
    }

    /* renamed from: e */
    private Bitmap m8997e(Drawable drawable) {
        Bitmap.Config config;
        int i;
        int i2;
        if (drawable == null) {
            return null;
        }
        if (this.f8129o) {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
            config = Bitmap.Config.ALPHA_8;
        } else {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: b */
    public void mo8018b(C0116a.C0120d dVar, boolean z) {
        TabView d = m8996d(dVar, false);
        this.f8123i.addView(d);
        Spinner spinner = this.f8124j;
        if (spinner != null) {
            ((C2172a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            d.setSelected(true);
            this.f8132r = this.f8123i.getChildCount() - 1;
        }
        if (this.f8125k) {
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo8019c(int i) {
        Runnable runnable = this.f8119e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C2174c cVar = new C2174c(this, i);
        this.f8119e = cVar;
        post(cVar);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Bitmap bitmap = this.f8128n;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f8130p, (float) (getHeight() - this.f8128n.getHeight()), this.f8131q);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.f8133s;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8021f(android.widget.TextView r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0019
            java.util.WeakHashMap<android.widget.TextView, java.lang.Integer> r0 = r1.f8133s
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0019
            java.util.WeakHashMap<android.widget.TextView, java.lang.Integer> r0 = r1.f8133s
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L_0x0019:
            android.content.Context r2 = r1.getContext()
            int r0 = r1.getDefaultTabTextStyle()
            int r2 = p055i3.C1649c.m6958c(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ScrollingTabContainerView.mo8021f(android.widget.TextView):int");
    }

    /* renamed from: g */
    public void mo8022g(int i) {
        View childAt = this.f8123i.getChildAt(i);
        scrollTo(childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2), 0);
    }

    /* access modifiers changed from: package-private */
    public abstract int getDefaultTabTextStyle();

    /* access modifiers changed from: package-private */
    public abstract int getTabBarLayoutRes();

    /* access modifiers changed from: package-private */
    public abstract int getTabContainerHeight();

    public float getTabIndicatorPosition() {
        return this.f8130p;
    }

    /* access modifiers changed from: package-private */
    public abstract int getTabViewLayoutRes();

    /* access modifiers changed from: package-private */
    public abstract int getTabViewMarginHorizontal();

    /* renamed from: h */
    public void mo8029h(int i, float f) {
        if (this.f8128n != null) {
            View childAt = this.f8123i.getChildAt(i);
            View childAt2 = this.f8123i.getChildAt(i + 1);
            this.f8130p = ((float) (childAt.getLeft() + ((childAt.getWidth() - this.f8128n.getWidth()) / 2))) + ((childAt2 == null ? (float) childAt.getWidth() : ((float) (childAt.getWidth() + childAt2.getWidth())) / 2.0f) * f);
            invalidate();
        }
    }

    /* renamed from: i */
    public void mo8030i(int i, boolean z) {
        this.f8127m = i;
        int childCount = this.f8123i.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f8123i.getChildAt(i2);
            boolean z2 = i2 == i;
            childAt.setSelected(z2);
            if (z2) {
                if (z) {
                    mo8019c(i);
                } else {
                    mo8022g(i);
                }
            }
            i2++;
        }
    }

    /* renamed from: j */
    public View mo8031j(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    /* renamed from: k */
    public void mo8032k(int i) {
        ((TabView) this.f8123i.getChildAt(i)).mo8047c();
        Spinner spinner = this.f8124j;
        if (spinner != null) {
            ((C2172a) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f8125k) {
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8033l(TextView textView) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f8119e;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        C1918a b = C1918a.m7836b(getContext());
        setContentHeight(getTabContainerHeight());
        this.f8121g = b.mo6467d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f8119e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).getTab().mo394f();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f8123i.getChildAt(this.f8127m) != null) {
            setTabIndicatorPosition(this.f8127m);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f8123i.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                f2 = (float) View.MeasureSpec.getSize(i);
                f = 0.4f;
            } else {
                f2 = (float) View.MeasureSpec.getSize(i);
                f = 0.6f;
            }
            this.f8120f = (int) (f2 * f);
            i3 = Math.min(this.f8120f, this.f8121g);
        }
        this.f8120f = i3;
        int i4 = this.f8126l;
        if (i4 != -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f8127m);
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f8125k = z;
    }

    public void setContentHeight(int i) {
        if (this.f8126l != i) {
            this.f8126l = i;
            requestLayout();
        }
    }

    public void setEmbeded(boolean z) {
        setHorizontalFadingEdgeEnabled(true);
    }

    public void setTabIndicatorPosition(int i) {
        mo8029h(i, 0.0f);
    }

    public void setTabSelected(int i) {
        mo8030i(i, true);
    }
}
