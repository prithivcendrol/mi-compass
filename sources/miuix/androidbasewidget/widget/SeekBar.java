package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewDebug;
import android.widget.SeekBar;
import androidx.appcompat.widget.C0390t;
import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.view.C2400e;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p080m4.C1963a;
import p146z1.C2965a;
import p146z1.C2966b;
import p146z1.C2970f;
import p146z1.C2971g;

public class SeekBar extends C0390t {

    /* renamed from: e */
    private float f7443e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f7444f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f7445g;

    /* renamed from: h */
    private boolean f7446h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7447i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7448j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f7449k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f7450l;

    /* renamed from: m */
    private int f7451m;

    /* renamed from: n */
    private int f7452n;

    /* renamed from: o */
    private int f7453o;

    /* renamed from: p */
    private int f7454p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f7455q;

    /* renamed from: r */
    private int f7456r;

    /* renamed from: s */
    private int f7457s;

    /* renamed from: t */
    private int f7458t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public IStateStyle f7459u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public SeekBar.OnSeekBarChangeListener f7460v;

    /* renamed from: w */
    private ColorStateList f7461w;

    /* renamed from: x */
    private final SeekBar.OnSeekBarChangeListener f7462x;

    /* renamed from: miuix.androidbasewidget.widget.SeekBar$a */
    class C1979a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        private C1963a f7463a;

        /* renamed from: miuix.androidbasewidget.widget.SeekBar$a$a */
        class C1980a extends TransitionListener {
            C1980a() {
            }

            public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                UpdateInfo findByName = UpdateInfo.findByName(collection, "progress");
                if (findByName != null) {
                    SeekBar.this.setProgress(findByName.getIntValue());
                }
            }
        }

        C1979a() {
        }

        /* renamed from: a */
        private C1963a m8083a() {
            if (this.f7463a == null) {
                this.f7463a = new C1963a(SeekBar.this.getContext());
            }
            return this.f7463a;
        }

        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            int i2;
            int i3;
            C1963a aVar;
            boolean z2 = true;
            if (SeekBar.this.f7447i && z) {
                int max = SeekBar.this.getMax() - SeekBar.this.getMinWrapper();
                float f = (float) max;
                int round = Math.round(0.5f * f);
                float b = max > 0 ? ((float) (i - SeekBar.this.getMinWrapper())) / f : 0.0f;
                if (b <= SeekBar.this.f7444f || b >= SeekBar.this.f7445g) {
                    int unused = SeekBar.this.f7455q = Math.round((float) i);
                    SeekBar.this.f7459u.setTo("progress", Integer.valueOf(SeekBar.this.f7455q));
                } else {
                    int unused2 = SeekBar.this.f7455q = round;
                }
                if (SeekBar.this.getProgress() != SeekBar.this.f7455q) {
                    SeekBar.this.f7459u.mo6816to("progress", Integer.valueOf(SeekBar.this.f7455q), new AnimConfig().setEase(0, 350.0f, 0.9f, 0.15f).addListeners(new C1980a()));
                }
            }
            SeekBar seekBar2 = SeekBar.this;
            int k = seekBar2.m8079o(seekBar2.f7449k);
            SeekBar seekBar3 = SeekBar.this;
            int k2 = seekBar3.m8079o(seekBar3.f7450l);
            if (i < k) {
                SeekBar.this.setProgress(k);
                i = k;
            } else if (i > k2) {
                SeekBar.this.setProgress(k2);
                i = k2;
            }
            if (!(SeekBar.this.getProgress() == SeekBar.this.getMax() || SeekBar.this.getProgress() == SeekBar.this.getMinWrapper())) {
                z2 = false;
            }
            if (z) {
                if (!z2 || SeekBar.this.f7448j) {
                    if (HapticCompat.m10231c("2.0")) {
                        i2 = C2403h.f9357B;
                    }
                } else if (HapticCompat.m10231c("2.0")) {
                    if (SeekBar.this.getProgress() == SeekBar.this.getMax()) {
                        aVar = m8083a();
                        i3 = 203;
                    } else {
                        aVar = m8083a();
                        i3 = 202;
                    }
                    aVar.mo6600a(i3);
                } else {
                    i2 = C2403h.f9372k;
                }
                HapticCompat.performHapticFeedback(seekBar, i2);
            }
            boolean unused3 = SeekBar.this.f7448j = z2;
            if (SeekBar.this.f7460v != null) {
                SeekBar.this.f7460v.onProgressChanged(seekBar, i, z);
            }
        }

        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.f7460v != null) {
                SeekBar.this.f7460v.onStartTrackingTouch(seekBar);
            }
        }

        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.f7460v != null) {
                SeekBar.this.f7460v.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* renamed from: miuix.androidbasewidget.widget.SeekBar$b */
    private static class C1981b implements Runnable {

        /* renamed from: d */
        private WeakReference<SeekBar> f7466d;

        public C1981b(SeekBar seekBar) {
            this.f7466d = new WeakReference<>(seekBar);
        }

        public void run() {
            WeakReference<SeekBar> weakReference = this.f7466d;
            SeekBar seekBar = weakReference == null ? null : weakReference.get();
            if (seekBar != null) {
                seekBar.m8082r();
            }
        }
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2965a.f11204d);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1979a aVar = new C1979a();
        this.f7462x = aVar;
        C2400e.m10241b(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2971g.f11252e0, i, C2970f.f11216c);
        this.f7456r = context.getResources().getColor(C2966b.f11208d);
        this.f7457s = context.getResources().getColor(C2966b.f11207c);
        this.f7458t = context.getResources().getColor(C2966b.f11206b);
        this.f7447i = obtainStyledAttributes.getBoolean(C2971g.f11268m0, false);
        this.f7451m = obtainStyledAttributes.getColor(C2971g.f11260i0, this.f7456r);
        this.f7452n = obtainStyledAttributes.getColor(C2971g.f11262j0, this.f7457s);
        this.f7454p = obtainStyledAttributes.getColor(C2971g.f11264k0, this.f7458t);
        this.f7443e = obtainStyledAttributes.getFloat(C2971g.f11254f0, 0.5f);
        this.f7444f = obtainStyledAttributes.getFloat(C2971g.f11270n0, 0.46f);
        this.f7445g = obtainStyledAttributes.getFloat(C2971g.f11266l0, 0.54f);
        this.f7449k = m8080p(obtainStyledAttributes, C2971g.f11258h0, 0.0f);
        this.f7450l = m8080p(obtainStyledAttributes, C2971g.f11256g0, 1.0f);
        setDraggableMinPercentProgress(this.f7449k);
        setDraggableMaxPercentProcess(this.f7450l);
        obtainStyledAttributes.recycle();
        this.f7453o = context.getResources().getColor(C2966b.f11209e);
        float f = this.f7444f;
        if (f > 0.5f || f < 0.0f) {
            this.f7444f = 0.46f;
        }
        float f2 = this.f7445g;
        if (f2 < 0.5f || f2 > 1.0f) {
            this.f7445g = 0.54f;
        }
        int max = getMax() - getMinWrapper();
        this.f7446h = m8081q(max, getProgress());
        this.f7455q = getProgress();
        if (this.f7446h) {
            int round = Math.round(((float) max) * 0.5f);
            this.f7455q = round;
            setProgress(round);
        }
        IStateStyle useValue = Folme.useValue(Integer.valueOf(this.f7455q));
        this.f7459u = useValue;
        useValue.setTo("progress", Integer.valueOf(this.f7455q));
        setOnSeekBarChangeListener(aVar);
        post(new C1981b(this));
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }

    /* access modifiers changed from: private */
    public int getMinWrapper() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getMin();
        }
        return 0;
    }

    private synchronized int getRange() {
        return getMax() - getMinWrapper();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public synchronized int m8079o(float f) {
        return ((int) (f * ((float) getRange()))) + getMinWrapper();
    }

    /* renamed from: p */
    private float m8080p(TypedArray typedArray, int i, float f) {
        TypedValue peekValue = typedArray.peekValue(i);
        return (peekValue == null || peekValue.type != 6) ? f : peekValue.getFraction(1.0f, 1.0f);
    }

    /* renamed from: q */
    private boolean m8081q(int i, int i2) {
        float minWrapper = i > 0 ? ((float) (i2 - getMinWrapper())) / ((float) i) : 0.0f;
        return minWrapper > this.f7444f && minWrapper < this.f7445g;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m8082r() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            if (findDrawableByLayerId instanceof ClipDrawable) {
                Drawable drawable = ((ClipDrawable) findDrawableByLayerId).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    ColorStateList color = gradientDrawable.getColor();
                    if (this.f7461w == null && color != null) {
                        this.f7461w = color;
                    }
                    ColorStateList colorStateList = this.f7461w;
                    if (colorStateList != null) {
                        if (!(colorStateList.getColorForState(new int[]{-16842910}, this.f7457s) == this.f7452n && this.f7461w.getColorForState(android.widget.SeekBar.ENABLED_STATE_SET, this.f7456r) == this.f7451m)) {
                            ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{this.f7452n, this.f7451m});
                            this.f7461w = colorStateList2;
                            ((GradientDrawable) gradientDrawable.mutate()).setColor(colorStateList2);
                        }
                    }
                }
            }
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908294);
            if (findDrawableByLayerId2 instanceof GradientDrawable) {
                findDrawableByLayerId2.setColorFilter(this.f7447i ? this.f7454p : this.f7453o, PorterDuff.Mode.SRC);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m8082r();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : (int) (this.f7443e * 255.0f));
        }
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMaxPercentProgress() {
        return this.f7450l;
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMinPercentProgress() {
        return this.f7449k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[Catch:{ all -> 0x0013 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setDraggableMaxPercentProcess(float r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            double r0 = (double) r5
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x0015
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be higher than the max value, reset to 1.0"
        L_0x000e:
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x0013 }
            r5 = r1
            goto L_0x001f
        L_0x0013:
            r5 = move-exception
            goto L_0x003f
        L_0x0015:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be lower than the min value, reset to 1.0"
            goto L_0x000e
        L_0x001f:
            float r0 = r4.f7449k     // Catch:{ all -> 0x0013 }
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be lower than draggableMinPercentProcess value, reset to 1.0"
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x0013 }
            goto L_0x002e
        L_0x002d:
            r1 = r5
        L_0x002e:
            r4.f7450l = r1     // Catch:{ all -> 0x0013 }
            int r5 = r4.m8079o(r1)     // Catch:{ all -> 0x0013 }
            int r0 = r4.getProgress()     // Catch:{ all -> 0x0013 }
            if (r0 <= r5) goto L_0x003d
            r4.setProgress(r5)     // Catch:{ all -> 0x0013 }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.androidbasewidget.widget.SeekBar.setDraggableMaxPercentProcess(float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[Catch:{ all -> 0x0012 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setDraggableMinPercentProgress(float r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            double r0 = (double) r7
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 <= 0) goto L_0x0014
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be higher than 1.0, reset to 0.0"
        L_0x000d:
            android.util.Log.e(r7, r0)     // Catch:{ all -> 0x0012 }
            r7 = r3
            goto L_0x001f
        L_0x0012:
            r7 = move-exception
            goto L_0x003f
        L_0x0014:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be lower than 0.0, reset to 0.0"
            goto L_0x000d
        L_0x001f:
            float r0 = r6.f7450l     // Catch:{ all -> 0x0012 }
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be higher than draggableMaxPercentProcess value, reset to 0.0"
            android.util.Log.e(r7, r0)     // Catch:{ all -> 0x0012 }
            goto L_0x002e
        L_0x002d:
            r3 = r7
        L_0x002e:
            r6.f7449k = r3     // Catch:{ all -> 0x0012 }
            int r7 = r6.m8079o(r3)     // Catch:{ all -> 0x0012 }
            int r0 = r6.getProgress()     // Catch:{ all -> 0x0012 }
            if (r0 >= r7) goto L_0x003d
            r6.setProgress(r7)     // Catch:{ all -> 0x0012 }
        L_0x003d:
            monitor-exit(r6)
            return
        L_0x003f:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.androidbasewidget.widget.SeekBar.setDraggableMinPercentProgress(float):void");
    }

    public void setIconPrimaryColor(int i) {
        this.f7454p = i;
        m8082r();
    }

    public void setMiddleEnabled(boolean z) {
        if (z != this.f7447i) {
            this.f7447i = z;
            m8082r();
        }
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.f7462x;
        if (onSeekBarChangeListener == onSeekBarChangeListener2) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        } else {
            this.f7460v = onSeekBarChangeListener;
        }
    }
}
