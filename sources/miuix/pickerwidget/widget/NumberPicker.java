package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.C0331i;
import androidx.appcompat.widget.C0385r1;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p055i3.C1653g;
import p063k.C1768b;
import p091o3.C2500b;
import p091o3.C2501c;
import p091o3.C2502d;
import p091o3.C2503e;
import p091o3.C2504f;
import p091o3.C2505g;
import p091o3.C2506h;
import p091o3.C2507i;
import p091o3.C2508j;
import p103q3.C2586a;
import p108r3.C2633a;

public class NumberPicker extends LinearLayout {

    /* renamed from: E0 */
    private static final int f8897E0 = C2504f.f9764c;

    /* renamed from: F0 */
    private static final AtomicInteger f8898F0 = new AtomicInteger(0);

    /* renamed from: G0 */
    static final C2330f f8899G0 = new C2332h(2);

    /* renamed from: H0 */
    private static final int[] f8900H0 = {16842919};
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public static final char[] f8901I0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: A */
    private final Paint f8902A;

    /* renamed from: A0 */
    private String f8903A0;

    /* renamed from: B */
    private int f8904B;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public final IHoverStyle f8905B0;

    /* renamed from: C */
    private int f8906C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public boolean f8907C0;

    /* renamed from: D */
    private int f8908D;

    /* renamed from: D0 */
    private boolean f8909D0;

    /* renamed from: E */
    private final Scroller f8910E;

    /* renamed from: F */
    private final Scroller f8911F;

    /* renamed from: G */
    private int f8912G;

    /* renamed from: H */
    private C2336l f8913H;

    /* renamed from: I */
    private C2329e f8914I;

    /* renamed from: J */
    private C2328d f8915J;

    /* renamed from: K */
    private float f8916K;

    /* renamed from: L */
    private long f8917L;

    /* renamed from: M */
    private float f8918M;

    /* renamed from: N */
    private VelocityTracker f8919N;

    /* renamed from: O */
    private int f8920O;

    /* renamed from: P */
    private int f8921P;

    /* renamed from: Q */
    private int f8922Q;

    /* renamed from: R */
    private boolean f8923R;

    /* renamed from: S */
    private final boolean f8924S;

    /* renamed from: T */
    private final int f8925T;

    /* renamed from: U */
    private int f8926U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f8927V;

    /* renamed from: W */
    private boolean f8928W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public int f8929a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f8930b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f8931c0;

    /* renamed from: d */
    private final int f8932d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f8933d0;

    /* renamed from: e */
    private int f8934e;

    /* renamed from: e0 */
    private final C2335k f8935e0;

    /* renamed from: f */
    private int f8936f;

    /* renamed from: f0 */
    private int f8937f0;

    /* renamed from: g */
    private C2337m f8938g;

    /* renamed from: g0 */
    private Paint f8939g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final EditText f8940h;

    /* renamed from: h0 */
    private int f8941h0;

    /* renamed from: i */
    private final int f8942i;

    /* renamed from: i0 */
    private String f8943i0;

    /* renamed from: j */
    private final int f8944j;

    /* renamed from: j0 */
    private float f8945j0;

    /* renamed from: k */
    private final int f8946k;

    /* renamed from: k0 */
    private int f8947k0;

    /* renamed from: l */
    private final int f8948l;

    /* renamed from: l0 */
    private int f8949l0;

    /* renamed from: m */
    private int f8950m;

    /* renamed from: m0 */
    private float f8951m0;

    /* renamed from: n */
    private final boolean f8952n;

    /* renamed from: n0 */
    private float f8953n0;

    /* renamed from: o */
    private final int f8954o;

    /* renamed from: o0 */
    private int f8955o0;

    /* renamed from: p */
    private int f8956p;

    /* renamed from: p0 */
    private int f8957p0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String[] f8958q;

    /* renamed from: q0 */
    private float f8959q0;

    /* renamed from: r */
    private int f8960r;

    /* renamed from: r0 */
    private float f8961r0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f8962s;

    /* renamed from: s0 */
    private int f8963s0;

    /* renamed from: t */
    private int f8964t;

    /* renamed from: t0 */
    private int f8965t0;

    /* renamed from: u */
    private C2334j f8966u;

    /* renamed from: u0 */
    private int f8967u0;

    /* renamed from: v */
    private C2333i f8968v;

    /* renamed from: v0 */
    private int f8969v0;

    /* renamed from: w */
    private C2330f f8970w;

    /* renamed from: w0 */
    private int f8971w0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public long f8972x;

    /* renamed from: x0 */
    private CharSequence f8973x0;

    /* renamed from: y */
    private final SparseArray<String> f8974y;

    /* renamed from: y0 */
    private float f8975y0;

    /* renamed from: z */
    private final int[] f8976z;

    /* renamed from: z0 */
    private String f8977z0;

    public static class CustomEditText extends C0331i {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onEditorAction(int i) {
            super.onEditorAction(i);
            if (i == 6) {
                clearFocus();
            }
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$a */
    class C2325a implements View.OnHoverListener {
        C2325a() {
        }

        public boolean onHover(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 9) {
                boolean unused = NumberPicker.this.f8907C0 = true;
                NumberPicker.this.f8905B0.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverEnter(new AnimConfig[0]);
            } else if (actionMasked == 10) {
                boolean unused2 = NumberPicker.this.f8907C0 = false;
                NumberPicker.this.f8905B0.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverExit(new AnimConfig[0]);
            }
            return false;
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$b */
    class C2326b implements View.OnTouchListener {
        C2326b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            NumberPicker.this.m9828B();
            return false;
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$c */
    class C2327c implements View.OnFocusChangeListener {
        C2327c() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                NumberPicker.this.f8940h.selectAll();
                return;
            }
            NumberPicker.this.f8940h.setSelection(0, 0);
            NumberPicker.this.m9880n0(view);
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$d */
    class C2328d implements Runnable {
        C2328d() {
        }

        public void run() {
            boolean unused = NumberPicker.this.f8927V = true;
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$e */
    class C2329e implements Runnable {

        /* renamed from: d */
        private boolean f8982d;

        C2329e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m9894b(boolean z) {
            this.f8982d = z;
        }

        public void run() {
            NumberPicker.this.m9888v(this.f8982d);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f8972x);
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$f */
    public interface C2330f {
        /* renamed from: a */
        String mo8912a(int i);
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$g */
    class C2331g extends NumberKeyListener {
        C2331g() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (NumberPicker.this.f8958q == null) {
                CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (filter == null) {
                    filter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + filter + spanned.subSequence(i4, spanned.length());
                return "".equals(str) ? str : (NumberPicker.this.m9832F(str) > NumberPicker.this.f8962s || str.length() > String.valueOf(NumberPicker.this.f8962s).length()) ? "" : filter;
            }
            String valueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(valueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + valueOf + spanned.subSequence(i4, spanned.length());
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.f8958q) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.m9856b0(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        /* access modifiers changed from: protected */
        public char[] getAcceptedChars() {
            return NumberPicker.f8901I0;
        }

        public int getInputType() {
            return 1;
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$h */
    static class C2332h implements C2330f {

        /* renamed from: a */
        private final int f8985a;

        public C2332h() {
            this.f8985a = -1;
        }

        public C2332h(int i) {
            this.f8985a = i;
        }

        /* renamed from: a */
        public String mo8912a(int i) {
            return C2586a.m11000c(this.f8985a, i);
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$i */
    public interface C2333i {
        /* renamed from: a */
        void mo8916a(NumberPicker numberPicker, int i);
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$j */
    public interface C2334j {
        /* renamed from: a */
        void mo8826a(NumberPicker numberPicker, int i, int i2);
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$k */
    class C2335k implements Runnable {

        /* renamed from: d */
        private final int f8986d = 1;

        /* renamed from: e */
        private final int f8987e = 2;

        /* renamed from: f */
        private int f8988f;

        /* renamed from: g */
        private int f8989g;

        C2335k() {
        }

        /* renamed from: a */
        public void mo8917a(int i) {
            mo8919c();
            this.f8989g = 1;
            this.f8988f = i;
            NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getTapTimeout());
        }

        /* renamed from: b */
        public void mo8918b(int i) {
            mo8919c();
            this.f8989g = 2;
            this.f8988f = i;
            NumberPicker.this.post(this);
        }

        /* renamed from: c */
        public void mo8919c() {
            this.f8989g = 0;
            this.f8988f = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.f8931c0) {
                boolean unused = NumberPicker.this.f8931c0 = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.f8930b0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.f8933d0) {
                boolean unused2 = NumberPicker.this.f8933d0 = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.f8929a0);
            }
        }

        public void run() {
            int i = this.f8989g;
            if (i == 1) {
                int i2 = this.f8988f;
                if (i2 == 1) {
                    boolean unused = NumberPicker.this.f8931c0 = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.f8930b0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i2 == 2) {
                    boolean unused2 = NumberPicker.this.f8933d0 = true;
                } else {
                    return;
                }
            } else if (i == 2) {
                int i3 = this.f8988f;
                if (i3 == 1) {
                    if (!NumberPicker.this.f8931c0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.m9867h(NumberPicker.this, 1);
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, numberPicker2.f8930b0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i3 == 2) {
                    if (!NumberPicker.this.f8933d0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.m9875l(NumberPicker.this, 1);
                } else {
                    return;
                }
            } else {
                return;
            }
            NumberPicker numberPicker3 = NumberPicker.this;
            numberPicker3.invalidate(0, 0, numberPicker3.getRight(), NumberPicker.this.f8929a0);
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$l */
    class C2336l implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f8991d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f8992e;

        C2336l() {
        }

        public void run() {
            if (this.f8992e < NumberPicker.this.f8940h.length()) {
                NumberPicker.this.f8940h.setSelection(this.f8991d, this.f8992e);
            }
        }
    }

    /* renamed from: miuix.pickerwidget.widget.NumberPicker$m */
    private static class C2337m extends Handler {

        /* renamed from: a */
        private static final C2338a f8994a = new C2338a((C2325a) null);

        /* renamed from: miuix.pickerwidget.widget.NumberPicker$m$a */
        private static class C2338a {

            /* renamed from: a */
            private Set<Integer> f8995a;

            /* renamed from: b */
            private SoundPool f8996b;

            /* renamed from: c */
            private int f8997c;

            /* renamed from: d */
            private long f8998d;

            private C2338a() {
                this.f8995a = new C1768b();
            }

            /* synthetic */ C2338a(C2325a aVar) {
                this();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo8927a(Context context, int i) {
                if (this.f8996b == null) {
                    SoundPool soundPool = new SoundPool(1, 1, 0);
                    this.f8996b = soundPool;
                    this.f8997c = soundPool.load(context, C2505g.f9766a, 1);
                }
                this.f8995a.add(Integer.valueOf(i));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo8928b() {
                long currentTimeMillis = System.currentTimeMillis();
                SoundPool soundPool = this.f8996b;
                if (soundPool != null && currentTimeMillis - this.f8998d > 50) {
                    soundPool.play(this.f8997c, 1.0f, 1.0f, 0, 0, 1.0f);
                    this.f8998d = currentTimeMillis;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo8929c(int i) {
                SoundPool soundPool;
                if (this.f8995a.remove(Integer.valueOf(i)) && this.f8995a.isEmpty() && (soundPool = this.f8996b) != null) {
                    soundPool.release();
                    this.f8996b = null;
                }
            }
        }

        C2337m(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8922a(Context context, int i) {
            Message obtainMessage = obtainMessage(0, i, 0);
            obtainMessage.obj = context;
            sendMessage(obtainMessage);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8923b() {
            sendMessage(obtainMessage(1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8924c(int i) {
            sendMessage(obtainMessage(2, i, 0));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8925d() {
            removeMessages(1);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                f8994a.mo8927a((Context) message.obj, message.arg1);
            } else if (i == 1) {
                f8994a.mo8928b();
            } else if (i == 2) {
                f8994a.mo8929c(message.arg1);
            }
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2500b.f9740c);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8932d = f8898F0.incrementAndGet();
        this.f8934e = 1;
        this.f8936f = 2;
        this.f8950m = 400;
        this.f8972x = 300;
        this.f8974y = new SparseArray<>();
        this.f8976z = new int[3];
        this.f8906C = Integer.MIN_VALUE;
        this.f8926U = 0;
        this.f8937f0 = -1;
        this.f8953n0 = 0.95f;
        this.f8961r0 = 0.8f;
        this.f8975y0 = 1.0f;
        this.f8907C0 = false;
        this.f8909D0 = true;
        float f = getResources().getDisplayMetrics().density;
        this.f8934e = getResources().getDimensionPixelOffset(C2502d.f9744a);
        this.f8936f = getResources().getDimensionPixelOffset(C2502d.f9745b);
        m9850X(attributeSet, i);
        m9839M();
        this.f8924S = true;
        this.f8925T = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f8942i = (int) (45.0f * f);
        this.f8944j = -1;
        this.f8946k = (int) (f * 202.0f);
        this.f8948l = -1;
        this.f8950m = -1;
        this.f8952n = true;
        this.f8935e0 = new C2335k();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C2504f.f9764c, this, true);
        EditText editText = (EditText) findViewById(C2503e.f9757f);
        this.f8940h = editText;
        m9836J();
        m9840N();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8920O = viewConfiguration.getScaledTouchSlop();
        this.f8921P = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8922Q = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f8954o = (int) editText.getTextSize();
        this.f8902A = m9838L();
        m9837K();
        this.f8910E = new Scroller(getContext(), (Interpolator) null, true);
        this.f8911F = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        m9878m0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f8905B0 = Folme.useAt(this).hover();
        setOnHoverListener(new C2325a());
        setOnTouchListener(new C2326b());
    }

    /* renamed from: A */
    private boolean m9827A() {
        int i = this.f8906C - this.f8908D;
        if (i == 0) {
            return false;
        }
        this.f8912G = 0;
        int abs = Math.abs(i);
        int i2 = this.f8904B;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.f8911F.startScroll(0, 0, 0, i, 800);
        invalidate();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m9828B() {
        if (this.f8907C0) {
            this.f8907C0 = false;
            this.f8905B0.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverExit(new AnimConfig[0]);
        }
    }

    /* renamed from: C */
    private void m9829C(int i) {
        this.f8912G = 0;
        this.f8910E.fling(0, i > 0 ? 0 : Integer.MAX_VALUE, 0, i, 0, 0, 0, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: D */
    private String m9830D(int i) {
        C2330f fVar = this.f8970w;
        return fVar != null ? fVar.mo8912a(i) : C2586a.m10999b(i);
    }

    /* renamed from: E */
    private int m9831E(float f, int i, boolean z) {
        if (f >= 1.0f) {
            return i;
        }
        return (((int) (z ? ((-f) * ((float) Color.alpha(i))) + ((float) Color.alpha(i)) : f * ((float) Color.alpha(i)))) << 24) | (i & 16777215);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public int m9832F(String str) {
        if (this.f8958q == null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return this.f8960r;
            }
        } else {
            for (int i = 0; i < this.f8958q.length; i++) {
                str = str.toLowerCase();
                if (this.f8958q[i].toLowerCase().startsWith(str)) {
                    return this.f8960r + i;
                }
            }
            return Integer.parseInt(str);
        }
    }

    /* renamed from: G */
    private float m9833G(float f, int i, int i2) {
        return f >= 1.0f ? (float) i2 : (f * ((float) (i2 - i))) + ((float) i);
    }

    /* renamed from: H */
    private int m9834H(int i) {
        int i2 = this.f8962s;
        int i3 = this.f8960r;
        return i > i2 ? (i3 + ((i - i2) % (i2 - i3))) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    /* renamed from: I */
    private void m9835I(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        }
        int i = iArr[iArr.length - 2] + 1;
        if (this.f8923R && i > this.f8962s) {
            i = this.f8960r;
        }
        iArr[iArr.length - 1] = i;
        m9892z(i);
    }

    /* renamed from: J */
    private void m9836J() {
        this.f8940h.setOnFocusChangeListener(new C2327c());
        this.f8940h.setFilters(new InputFilter[]{new C2331g()});
        this.f8940h.setRawInputType(2);
        this.f8940h.setImeOptions(6);
        this.f8940h.setVisibility(4);
        this.f8940h.setGravity(8388611);
        this.f8940h.setScaleX(0.0f);
        this.f8940h.setSaveEnabled(false);
        EditText editText = this.f8940h;
        editText.setPadding(this.f8941h0, editText.getPaddingTop(), this.f8941h0, this.f8940h.getPaddingRight());
    }

    /* renamed from: K */
    private void m9837K() {
        Paint paint = new Paint();
        this.f8939g0 = paint;
        paint.setAntiAlias(true);
        this.f8939g0.setFakeBoldText(true);
        this.f8939g0.setColor(this.f8971w0);
        this.f8939g0.setTextSize((float) this.f8955o0);
    }

    /* renamed from: L */
    private Paint m9838L() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize((float) this.f8947k0);
        paint.setTypeface(this.f8940h.getTypeface());
        paint.setColor(this.f8940h.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        return paint;
    }

    /* renamed from: M */
    private void m9839M() {
        if (this.f8938g == null) {
            C2337m mVar = new C2337m(C2633a.m11106a("NumberPicker_sound_play"));
            this.f8938g = mVar;
            mVar.mo8922a(getContext().getApplicationContext(), this.f8932d);
        }
    }

    /* renamed from: N */
    private void m9840N() {
        this.f8959q0 = (float) getContext().getResources().getDimensionPixelSize(C2502d.f9750g);
        this.f8951m0 = (float) getContext().getResources().getDimensionPixelSize(C2502d.f9751h);
    }

    /* renamed from: O */
    private void m9841O() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.f8954o) / 2);
    }

    /* renamed from: P */
    private void m9842P() {
        m9843Q();
        int[] iArr = this.f8976z;
        float bottom = (float) ((getBottom() - getTop()) - (iArr.length * this.f8954o));
        if (bottom < 0.0f) {
            bottom = 0.0f;
        }
        int length = (int) ((bottom / ((float) iArr.length)) + 0.5f);
        this.f8956p = length;
        this.f8904B = this.f8954o + length;
        int baseline = (this.f8940h.getBaseline() + this.f8940h.getTop()) - (this.f8904B * 1);
        this.f8906C = baseline;
        this.f8908D = baseline;
        m9878m0();
    }

    /* renamed from: Q */
    private void m9843Q() {
        this.f8974y.clear();
        int[] iArr = this.f8976z;
        int value = getValue();
        for (int i = 0; i < this.f8976z.length; i++) {
            int i2 = (i - 1) + value;
            if (this.f8923R) {
                i2 = m9834H(i2);
            }
            iArr[i] = i2;
            m9892z(i2);
        }
    }

    /* renamed from: R */
    private boolean m9844R() {
        Class cls = String.class;
        if (this.f8903A0 == null) {
            this.f8903A0 = (String) C1653g.m6975b(C1653g.m6976c("android.os.SystemProperties"), cls, "get", new Class[]{cls, cls}, "ro.product.mod_device", "");
        }
        return this.f8903A0.endsWith("_global");
    }

    /* renamed from: S */
    private int m9845S(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (mode == 1073741824) {
            return i;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    /* renamed from: T */
    private boolean m9846T(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.f8906C - ((this.f8908D + finalY) % this.f8904B);
        if (i == 0) {
            return false;
        }
        int abs = Math.abs(i);
        int i2 = this.f8904B;
        if (abs > i2 / 2) {
            i = i > 0 ? i - i2 : i + i2;
        }
        scrollBy(0, finalY + i);
        return true;
    }

    /* renamed from: U */
    private void m9847U(int i) {
        sendAccessibilityEvent(4);
        m9851Y();
        HapticCompat.m10233e(this, C2403h.f9358C, C2403h.f9372k);
        C2334j jVar = this.f8966u;
        if (jVar != null) {
            jVar.mo8826a(this, i, this.f8964t);
        }
    }

    /* renamed from: V */
    private void m9848V(int i) {
        if (this.f8926U != i) {
            if (i == 0) {
                String str = this.f8977z0;
                if (str != null && !str.equals(this.f8940h.getText().toString())) {
                    this.f8940h.setText(this.f8977z0);
                }
                this.f8977z0 = null;
                m9872j0();
            }
            this.f8926U = i;
            C2333i iVar = this.f8968v;
            if (iVar != null) {
                iVar.mo8916a(this, i);
            }
        }
    }

    /* renamed from: W */
    private void m9849W(Scroller scroller) {
        if (scroller == this.f8910E) {
            if (!m9827A()) {
                m9878m0();
            }
            m9848V(0);
        } else if (this.f8926U != 1) {
            m9878m0();
        }
    }

    /* renamed from: X */
    private void m9850X(AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2508j.f9858a0, i, C2507i.f9826b);
        this.f8973x0 = obtainStyledAttributes.getText(C2508j.f9864d0);
        this.f8947k0 = obtainStyledAttributes.getDimensionPixelSize(C2508j.f9872h0, resources.getDimensionPixelOffset(C2502d.f9748e));
        this.f8949l0 = obtainStyledAttributes.getDimensionPixelSize(C2508j.f9874i0, resources.getDimensionPixelOffset(C2502d.f9749f));
        this.f8955o0 = obtainStyledAttributes.getDimensionPixelSize(C2508j.f9866e0, resources.getDimensionPixelOffset(C2502d.f9747d));
        this.f8967u0 = obtainStyledAttributes.getColor(C2508j.f9860b0, resources.getColor(C2501c.f9741a));
        this.f8969v0 = obtainStyledAttributes.getColor(C2508j.f9862c0, resources.getColor(C2501c.f9742b));
        this.f8971w0 = obtainStyledAttributes.getColor(C2508j.f9870g0, resources.getColor(C2501c.f9743c));
        this.f8941h0 = obtainStyledAttributes.getDimensionPixelSize(C2508j.f9868f0, resources.getDimensionPixelOffset(C2502d.f9746c));
        obtainStyledAttributes.recycle();
        this.f8957p0 = this.f8955o0;
        this.f8963s0 = this.f8947k0;
        this.f8965t0 = this.f8949l0;
    }

    /* renamed from: Y */
    private void m9851Y() {
        C2337m mVar = this.f8938g;
        if (mVar != null) {
            mVar.mo8923b();
        }
    }

    /* renamed from: Z */
    private void m9852Z() {
        C2328d dVar = this.f8915J;
        if (dVar == null) {
            this.f8915J = new C2328d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.f8915J, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: a0 */
    private void m9854a0(boolean z, long j) {
        C2329e eVar = this.f8914I;
        if (eVar == null) {
            this.f8914I = new C2329e();
        } else {
            removeCallbacks(eVar);
        }
        this.f8914I.m9894b(z);
        postDelayed(this.f8914I, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m9856b0(int i, int i2) {
        C2336l lVar = this.f8913H;
        if (lVar == null) {
            this.f8913H = new C2336l();
        } else {
            removeCallbacks(lVar);
        }
        int unused = this.f8913H.f8991d = i;
        int unused2 = this.f8913H.f8992e = i2;
        post(this.f8913H);
    }

    /* renamed from: c0 */
    private void m9858c0() {
        m9843Q();
        invalidate();
    }

    /* renamed from: d0 */
    private void m9860d0() {
        C2337m mVar = this.f8938g;
        if (mVar != null) {
            mVar.mo8924c(this.f8932d);
            this.f8938g = null;
        }
    }

    /* renamed from: e0 */
    private void m9862e0() {
        C2329e eVar = this.f8914I;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        C2336l lVar = this.f8913H;
        if (lVar != null) {
            removeCallbacks(lVar);
        }
        C2328d dVar = this.f8915J;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f8935e0.mo8919c();
    }

    /* renamed from: f0 */
    private void m9864f0() {
        C2328d dVar = this.f8915J;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    /* renamed from: g0 */
    private void m9866g0() {
        C2329e eVar = this.f8914I;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [boolean, byte] */
    /* renamed from: h */
    static /* synthetic */ boolean m9867h(NumberPicker numberPicker, int i) {
        ? r2 = (byte) (i ^ numberPicker.f8931c0);
        numberPicker.f8931c0 = r2;
        return r2;
    }

    /* renamed from: h0 */
    private int m9868h0(int i, int i2, int i3) {
        return i != -1 ? View.resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    /* renamed from: i0 */
    private void m9870i0(int i, boolean z) {
        int H = this.f8923R ? m9834H(i) : Math.min(Math.max(i, this.f8960r), this.f8962s);
        int i2 = this.f8964t;
        if (i2 != H) {
            this.f8964t = H;
            m9878m0();
            if (z) {
                m9847U(i2);
            }
            m9843Q();
            invalidate();
        }
    }

    /* renamed from: j0 */
    private void m9872j0() {
        C2337m mVar = this.f8938g;
        if (mVar != null) {
            mVar.mo8925d();
        }
    }

    /* renamed from: k0 */
    private void m9874k0(float f) {
        if (getLabelWidth() > 0.0f) {
            int i = this.f8957p0;
            while (true) {
                this.f8955o0 = i;
                this.f8939g0.setTextSize((float) i);
                if ((this.f8945j0 / 2.0f) + f + ((float) this.f8934e) + getLabelWidth() > ((float) getWidth())) {
                    int i2 = this.f8955o0;
                    if (((float) i2) > this.f8959q0) {
                        i = (int) (((float) i2) * this.f8961r0);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [boolean, byte] */
    /* renamed from: l */
    static /* synthetic */ boolean m9875l(NumberPicker numberPicker, int i) {
        ? r2 = (byte) (i ^ numberPicker.f8933d0);
        numberPicker.f8933d0 = r2;
        return r2;
    }

    /* renamed from: l0 */
    private void m9876l0() {
        String str;
        float f;
        if (this.f8952n) {
            String str2 = null;
            float f2 = -1.0f;
            this.f8902A.setTextSize((float) this.f8947k0);
            String[] strArr = this.f8958q;
            int i = 0;
            if (strArr == null) {
                float f3 = 0.0f;
                int i2 = 0;
                while (i < 9) {
                    float measureText = this.f8902A.measureText(String.valueOf(i));
                    if (measureText > f3) {
                        f3 = measureText;
                        i2 = i;
                    }
                    i++;
                }
                int length = m9830D(this.f8962s).length();
                f = (float) ((int) (((float) length) * f3));
                char[] cArr = new char[length];
                Arrays.fill(cArr, (char) (i2 + 48));
                str = new String(cArr);
            } else {
                int length2 = strArr.length;
                while (i < length2) {
                    String str3 = this.f8958q[i];
                    float measureText2 = this.f8902A.measureText(str3);
                    if (measureText2 > f2) {
                        str2 = str3;
                        f2 = measureText2;
                    }
                    i++;
                }
                float f4 = f2;
                str = str2;
                f = f4;
            }
            this.f8945j0 = f;
            this.f8943i0 = str;
            float paddingLeft = f + ((float) (this.f8940h.getPaddingLeft() + this.f8940h.getPaddingRight())) + ((float) getPaddingLeft()) + ((float) getPaddingRight());
            if (((float) this.f8950m) != paddingLeft) {
                int i3 = this.f8948l;
                if (paddingLeft > ((float) i3)) {
                    this.f8950m = (int) paddingLeft;
                } else {
                    this.f8950m = i3;
                }
            }
        }
    }

    /* renamed from: m0 */
    private boolean m9878m0() {
        String displayedMaxText = getDisplayedMaxText();
        if (TextUtils.isEmpty(displayedMaxText)) {
            return false;
        }
        if (this.f8926U != 0) {
            this.f8977z0 = displayedMaxText;
            return true;
        } else if (displayedMaxText.equals(this.f8940h.getText().toString())) {
            return true;
        } else {
            this.f8940h.setText(displayedMaxText);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m9880n0(View view) {
        String valueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(valueOf)) {
            m9878m0();
        } else {
            m9870i0(m9832F(valueOf), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m9888v(boolean z) {
        if (this.f8924S) {
            this.f8940h.setVisibility(4);
            if (!m9846T(this.f8910E)) {
                m9846T(this.f8911F);
            }
            this.f8912G = 0;
            if (z) {
                this.f8910E.startScroll(0, 0, 0, -this.f8904B, 300);
            } else {
                this.f8910E.startScroll(0, 0, 0, this.f8904B, 300);
            }
            invalidate();
            return;
        }
        m9870i0(z ? this.f8964t + 1 : this.f8964t - 1, true);
    }

    /* renamed from: w */
    private void m9889w(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        }
        int i = iArr[1] - 1;
        if (this.f8923R && i < this.f8960r) {
            i = this.f8962s;
        }
        iArr[0] = i;
        m9892z(i);
    }

    /* renamed from: x */
    private void m9890x(Canvas canvas, float f, float f2, float f3) {
        if (!TextUtils.isEmpty(this.f8973x0) && !m9844R()) {
            float measureText = this.f8939g0.measureText(this.f8973x0.toString());
            canvas.drawText(this.f8973x0.toString(), C0385r1.m1722b(this) ? Math.max(((f - (this.f8945j0 / 2.0f)) - ((float) this.f8934e)) - measureText, 0.0f) : Math.min(f + (this.f8945j0 / 2.0f) + ((float) this.f8934e), ((float) getWidth()) - measureText), (f2 - (((float) this.f8947k0) / 2.0f)) + (((float) this.f8955o0) / 2.0f) + ((float) this.f8936f), this.f8939g0);
        }
    }

    /* renamed from: y */
    private float m9891y(Canvas canvas, float f, float f2) {
        Canvas canvas2 = canvas;
        float f3 = f;
        float f4 = (float) this.f8908D;
        SparseArray<String> sparseArray = this.f8974y;
        for (int i : this.f8976z) {
            String str = sparseArray.get(i);
            float abs = Math.abs(f2 - f4) / ((float) this.f8904B);
            int i2 = this.f8947k0;
            float f5 = this.f8951m0;
            if (((float) i2) > f5) {
                i2 = (int) f5;
            } else {
                float width = ((float) getWidth()) / this.f8902A.measureText(str);
                if (width < 1.0f) {
                    i2 = (int) (((float) this.f8947k0) * width);
                }
            }
            float G = m9833G(abs, i2, this.f8949l0);
            this.f8902A.setTextSize(G);
            this.f8902A.setColor(m9831E(abs, this.f8969v0, false));
            canvas2.drawText(str, f3, ((G - ((float) this.f8949l0)) / 2.0f) + f4, this.f8902A);
            if (abs < 1.0f) {
                this.f8902A.setColor(m9831E(abs, this.f8967u0, true));
                canvas2.drawText(str, f3, ((G - ((float) this.f8949l0)) / 2.0f) + f4, this.f8902A);
            }
            f4 += (float) this.f8904B;
        }
        return f4;
    }

    /* renamed from: z */
    private void m9892z(int i) {
        String str;
        SparseArray<String> sparseArray = this.f8974y;
        if (sparseArray.get(i) == null) {
            int i2 = this.f8960r;
            if (i < i2 || i > this.f8962s) {
                str = "";
            } else {
                String[] strArr = this.f8958q;
                str = strArr != null ? strArr[i - i2] : m9830D(i);
            }
            sparseArray.put(i, str);
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f8910E;
        if (scroller.isFinished()) {
            scroller = this.f8911F;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f8912G == 0) {
            this.f8912G = scroller.getStartY();
        }
        scrollBy(0, currY - this.f8912G);
        this.f8912G = currY;
        if (scroller.isFinished()) {
            m9849W(scroller);
        } else {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        requestFocus();
        r5.f8937f0 = r0;
        m9862e0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r5.f8910E.isFinished() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 != 20) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        m9888v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L_0x0019
            if (r0 == r2) goto L_0x0019
            r1 = 23
            if (r0 == r1) goto L_0x0015
            r1 = 66
            if (r0 == r1) goto L_0x0015
            goto L_0x0065
        L_0x0015:
            r5.m9862e0()
            goto L_0x0065
        L_0x0019:
            boolean r1 = r5.f8924S
            if (r1 != 0) goto L_0x001e
            goto L_0x0065
        L_0x001e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            goto L_0x0065
        L_0x0028:
            int r1 = r5.f8937f0
            if (r1 != r0) goto L_0x0065
            r6 = -1
            r5.f8937f0 = r6
            return r3
        L_0x0030:
            boolean r1 = r5.f8923R
            if (r1 != 0) goto L_0x0042
            if (r0 != r2) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            int r1 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r1 <= r4) goto L_0x0065
            goto L_0x004c
        L_0x0042:
            int r1 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r1 >= r4) goto L_0x0065
        L_0x004c:
            r5.requestFocus()
            r5.f8937f0 = r0
            r5.m9862e0()
            android.widget.Scroller r6 = r5.f8910E
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0064
            if (r0 != r2) goto L_0x0060
            r6 = r3
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            r5.m9888v(r6)
        L_0x0064:
            return r3
        L_0x0065:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m9862e0();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m9862e0();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m9876l0();
    }

    public CharSequence getAccessibilityClassName() {
        return NumberPicker.class.getName();
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    /* access modifiers changed from: protected */
    public String getDisplayedMaxText() {
        String str = this.f8943i0;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: protected */
    public float getDisplayedMaxTextWidth() {
        float textSize = this.f8902A.getTextSize();
        this.f8902A.setTextSize((float) this.f8963s0);
        float measureText = this.f8902A.measureText(getDisplayedMaxText());
        this.f8902A.setTextSize(textSize);
        return measureText;
    }

    public String[] getDisplayedValues() {
        return this.f8958q;
    }

    /* access modifiers changed from: protected */
    public float getLabelWidth() {
        if (TextUtils.isEmpty(this.f8973x0) || m9844R()) {
            return 0.0f;
        }
        return this.f8939g0.measureText(this.f8973x0.toString());
    }

    public int getMarginLabelLeft() {
        return this.f8934e;
    }

    public int getMaxValue() {
        return this.f8962s;
    }

    public int getMinValue() {
        return this.f8960r;
    }

    public int getOriginTextSizeHighlight() {
        return this.f8963s0;
    }

    public int getOriginTextSizeHint() {
        return this.f8965t0;
    }

    public float getOriginalLabelWidth() {
        if (TextUtils.isEmpty(this.f8973x0) || m9844R()) {
            return 0.0f;
        }
        float textSize = this.f8939g0.getTextSize();
        this.f8939g0.setTextSize((float) this.f8957p0);
        float measureText = this.f8939g0.measureText(this.f8973x0.toString());
        this.f8939g0.setTextSize(textSize);
        return measureText;
    }

    public int getTextSizeHighlight() {
        return this.f8947k0;
    }

    public int getTextSizeHint() {
        return this.f8949l0;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.f8964t;
    }

    public boolean getWrapSelectorWheel() {
        return this.f8923R;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9839M();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9840N();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9860d0();
        m9862e0();
        C2633a.m11107b("NumberPicker_sound_play");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f8924S) {
            super.onDraw(canvas);
            return;
        }
        int paddingLeft = getPaddingLeft();
        float right = (float) ((((getRight() - getLeft()) + paddingLeft) - getPaddingRight()) / 2);
        float f = (float) (this.f8906C + (this.f8904B * 1));
        m9890x(canvas, right, f, m9891y(canvas, right, f));
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.setScrollable(true);
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
            int i = Build.VERSION.SDK_INT;
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, (float) (this.f8960r - 1), (float) (this.f8962s + 1), (float) this.f8964t));
            StringBuilder sb = new StringBuilder();
            String[] strArr = this.f8958q;
            sb.append(strArr == null ? m9830D(this.f8964t) : strArr[this.f8964t - this.f8960r]);
            sb.append(TextUtils.isEmpty(this.f8973x0) ? "" : this.f8973x0);
            accessibilityNodeInfo.setContentDescription(sb.toString());
            if (i >= 30) {
                accessibilityNodeInfo.setStateDescription(getContext().getString(C2506h.f9804f0));
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f8924S || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m9862e0();
        this.f8940h.setVisibility(4);
        float y = motionEvent.getY();
        this.f8916K = y;
        this.f8918M = y;
        this.f8917L = motionEvent.getEventTime();
        this.f8927V = false;
        this.f8928W = false;
        float f = this.f8916K;
        if (f < ((float) this.f8929a0)) {
            if (this.f8926U == 0) {
                this.f8935e0.mo8917a(2);
            }
        } else if (f > ((float) this.f8930b0) && this.f8926U == 0) {
            this.f8935e0.mo8917a(1);
        }
        if (!this.f8910E.isFinished()) {
            this.f8910E.forceFinished(true);
            this.f8911F.forceFinished(true);
            m9848V(0);
        } else if (!this.f8911F.isFinished()) {
            this.f8910E.forceFinished(true);
            this.f8911F.forceFinished(true);
        } else {
            float f2 = this.f8916K;
            if (f2 < ((float) this.f8929a0)) {
                m9854a0(false, (long) ViewConfiguration.getLongPressTimeout());
            } else if (f2 > ((float) this.f8930b0)) {
                m9854a0(true, (long) ViewConfiguration.getLongPressTimeout());
            } else {
                this.f8928W = true;
                m9852Z();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f8924S) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f8940h.getMeasuredWidth();
        int measuredHeight2 = this.f8940h.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.f8940h.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            m9842P();
            m9841O();
            int height = getHeight();
            int i7 = this.f8942i;
            int i8 = this.f8925T;
            int i9 = ((height - i7) / 2) - i8;
            this.f8929a0 = i9;
            this.f8930b0 = i9 + (i8 * 2) + i7;
        }
        m9874k0(((float) (((getRight() - getLeft()) + getPaddingLeft()) - getPaddingRight())) / 2.0f);
        Drawable background = getBackground();
        int i10 = this.f8950m + 20;
        if (this.f8909D0 && (background instanceof StateListDrawable)) {
            StateListDrawable stateListDrawable = (StateListDrawable) background;
            if (Build.VERSION.SDK_INT >= 29) {
                int a = stateListDrawable.getStateCount();
                for (int i11 = 0; i11 < a; i11++) {
                    Drawable a2 = stateListDrawable.getStateDrawable(i11);
                    if (a2 instanceof LayerDrawable) {
                        LayerDrawable layerDrawable = (LayerDrawable) a2;
                        int numberOfLayers = layerDrawable.getNumberOfLayers();
                        for (int i12 = 0; i12 < numberOfLayers; i12++) {
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(layerDrawable.getId(i12));
                            if (findDrawableByLayerId instanceof GradientDrawable) {
                                ((GradientDrawable) findDrawableByLayerId).setSize(getWidth() > i10 ? i10 : getWidth(), getHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f8924S) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(m9845S(i, this.f8950m), m9845S(i2, this.f8946k));
        setMeasuredDimension(m9868h0(this.f8948l, getMeasuredWidth(), i), m9868h0(this.f8944j, getMeasuredHeight(), i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r9.f8924S
            if (r0 != 0) goto L_0x000d
            goto L_0x00e8
        L_0x000d:
            android.view.VelocityTracker r0 = r9.f8919N
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f8919N = r0
        L_0x0017:
            android.view.VelocityTracker r0 = r9.f8919N
            r0.addMovement(r10)
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x005c
            if (r0 == r2) goto L_0x002b
            r4 = 3
            if (r0 == r4) goto L_0x005c
            goto L_0x00e7
        L_0x002b:
            boolean r0 = r9.f8927V
            if (r0 == 0) goto L_0x0031
            goto L_0x00e7
        L_0x0031:
            float r10 = r10.getY()
            int r0 = r9.f8926U
            if (r0 == r3) goto L_0x004d
            float r0 = r9.f8916K
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            int r1 = r9.f8920O
            if (r0 <= r1) goto L_0x0058
            r9.m9862e0()
            r9.m9848V(r3)
            goto L_0x0058
        L_0x004d:
            float r0 = r9.f8918M
            float r0 = r10 - r0
            int r0 = (int) r0
            r9.scrollBy(r1, r0)
            r9.invalidate()
        L_0x0058:
            r9.f8918M = r10
            goto L_0x00e7
        L_0x005c:
            r9.m9864f0()
            r9.m9866g0()
            miuix.pickerwidget.widget.NumberPicker$k r0 = r9.f8935e0
            r0.mo8919c()
            android.view.VelocityTracker r0 = r9.f8919N
            r4 = 1000(0x3e8, float:1.401E-42)
            int r5 = r9.f8922Q
            float r5 = (float) r5
            r0.computeCurrentVelocity(r4, r5)
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            int r4 = java.lang.Math.abs(r0)
            int r5 = r9.f8922Q
            int r5 = java.lang.Math.abs(r5)
            if (r4 < r5) goto L_0x0087
            float r0 = (float) r0
            float r4 = r9.f8975y0
            float r0 = r0 * r4
            int r0 = (int) r0
        L_0x0087:
            int r4 = java.lang.Math.abs(r0)
            int r5 = r9.f8921P
            if (r4 <= r5) goto L_0x0096
            r9.m9829C(r0)
            r9.m9848V(r2)
            goto L_0x00df
        L_0x0096:
            float r0 = r10.getY()
            int r0 = (int) r0
            float r4 = (float) r0
            float r5 = r9.f8916K
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r4 = (int) r4
            long r5 = r10.getEventTime()
            long r7 = r9.f8917L
            long r5 = r5 - r7
            int r10 = r9.f8920O
            if (r4 > r10) goto L_0x00d9
            int r10 = android.view.ViewConfiguration.getLongPressTimeout()
            long r7 = (long) r10
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d9
            boolean r10 = r9.f8928W
            if (r10 == 0) goto L_0x00bf
            r9.f8928W = r1
            goto L_0x00dc
        L_0x00bf:
            int r10 = r9.f8904B
            int r0 = r0 / r10
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x00ce
            r9.m9888v(r3)
            miuix.pickerwidget.widget.NumberPicker$k r10 = r9.f8935e0
            r10.mo8918b(r3)
            goto L_0x00dc
        L_0x00ce:
            if (r0 >= 0) goto L_0x00d9
            r9.m9888v(r1)
            miuix.pickerwidget.widget.NumberPicker$k r10 = r9.f8935e0
            r10.mo8918b(r2)
            goto L_0x00dc
        L_0x00d9:
            r9.m9827A()
        L_0x00dc:
            r9.m9848V(r1)
        L_0x00df:
            android.view.VelocityTracker r10 = r9.f8919N
            r10.recycle()
            r10 = 0
            r9.f8919N = r10
        L_0x00e7:
            return r3
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.NumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            return false;
        }
        if (i == 4096) {
            z = true;
        }
        m9888v(z);
        return true;
    }

    public void scrollBy(int i, int i2) {
        int[] iArr = this.f8976z;
        boolean z = this.f8923R;
        if ((z || i2 <= 0 || iArr[1] > this.f8960r) && (z || i2 >= 0 || iArr[1] < this.f8962s)) {
            this.f8908D += i2;
            while (true) {
                int i3 = this.f8908D;
                if (i3 - this.f8906C <= this.f8956p) {
                    break;
                }
                this.f8908D = i3 - this.f8904B;
                m9889w(iArr);
                m9870i0(iArr[1], true);
                if (!this.f8923R && iArr[1] <= this.f8960r) {
                    this.f8908D = this.f8906C;
                }
            }
            while (true) {
                int i4 = this.f8908D;
                if (i4 - this.f8906C < (-this.f8956p)) {
                    this.f8908D = i4 + this.f8904B;
                    m9835I(iArr);
                    m9870i0(iArr[1], true);
                    if (!this.f8923R && iArr[1] >= this.f8962s) {
                        this.f8908D = this.f8906C;
                    }
                } else {
                    return;
                }
            }
        } else {
            this.f8908D = this.f8906C;
        }
    }

    public void setDisplayedValues(String[] strArr) {
        EditText editText;
        int i;
        if (this.f8958q != strArr) {
            this.f8958q = strArr;
            if (strArr != null) {
                editText = this.f8940h;
                i = 524289;
            } else {
                editText = this.f8940h;
                i = 2;
            }
            editText.setRawInputType(i);
            m9878m0();
            m9843Q();
            m9876l0();
        }
    }

    public void setFormatter(C2330f fVar) {
        if (fVar != this.f8970w) {
            this.f8970w = fVar;
            m9843Q();
            m9878m0();
        }
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.f8973x0;
        if ((charSequence == null && str != null) || (charSequence != null && !charSequence.equals(str))) {
            this.f8973x0 = str;
            invalidate();
        }
    }

    public void setLabelTextSizeThreshold(float f) {
        this.f8959q0 = Math.max(f, 0.0f);
    }

    public void setLabelTextSizeTrimFactor(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f8961r0 = f;
        }
    }

    public void setMaxFlingSpeedFactor(float f) {
        if (f >= 0.0f) {
            this.f8975y0 = f;
        }
    }

    public void setMaxValue(int i) {
        if (this.f8962s != i) {
            if (i >= 0) {
                this.f8962s = i;
                if (i < this.f8964t) {
                    this.f8964t = i;
                }
                setWrapSelectorWheel(i - this.f8960r > this.f8976z.length);
                m9843Q();
                m9878m0();
                m9876l0();
                invalidate();
                return;
            }
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
    }

    public void setMeasureBackgroundEnabled(boolean z) {
        this.f8909D0 = z;
    }

    public void setMinValue(int i) {
        if (this.f8960r != i) {
            if (i >= 0) {
                this.f8960r = i;
                if (i > this.f8964t) {
                    this.f8964t = i;
                }
                setWrapSelectorWheel(this.f8962s - i > this.f8976z.length);
                m9843Q();
                m9878m0();
                m9876l0();
                invalidate();
                return;
            }
            throw new IllegalArgumentException("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f8972x = j;
    }

    public void setOnScrollListener(C2333i iVar) {
        this.f8968v = iVar;
    }

    public void setOnValueChangedListener(C2334j jVar) {
        this.f8966u = jVar;
    }

    public void setTextSizeHighlight(int i) {
        this.f8947k0 = i;
        this.f8902A.setTextSize((float) i);
        this.f8945j0 = this.f8902A.measureText(this.f8943i0);
        m9842P();
        invalidate();
    }

    public void setTextSizeHint(int i) {
        this.f8949l0 = i;
        invalidate();
    }

    public void setTextSizeTrimFactor(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f8953n0 = f;
        }
    }

    public void setValue(int i) {
        m9870i0(i, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.f8962s - this.f8960r >= this.f8976z.length;
        if ((!z || z2) && z != this.f8923R) {
            this.f8923R = z;
        }
        m9858c0();
    }
}
