package miuix.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.NumberFormat;
import miuix.androidbasewidget.widget.ProgressBar;
import p018c2.C1347c;
import p018c2.C1349e;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1357m;

/* renamed from: miuix.appcompat.app.a0 */
public class C2073a0 extends C2112p {

    /* renamed from: A */
    private boolean f7631A;

    /* renamed from: B */
    private Handler f7632B;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ProgressBar f7633l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f7634m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TextView f7635n;

    /* renamed from: o */
    private int f7636o = 0;

    /* renamed from: p */
    private String f7637p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public NumberFormat f7638q;

    /* renamed from: r */
    private int f7639r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f7640s;

    /* renamed from: t */
    private int f7641t;

    /* renamed from: u */
    private int f7642u;

    /* renamed from: v */
    private int f7643v;

    /* renamed from: w */
    private Drawable f7644w;

    /* renamed from: x */
    private Drawable f7645x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public CharSequence f7646y;

    /* renamed from: z */
    private boolean f7647z;

    /* renamed from: miuix.appcompat.app.a0$a */
    class C2074a extends Handler {

        /* renamed from: a */
        final /* synthetic */ int f7648a;

        C2074a(int i) {
            this.f7648a = i;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C2073a0.this.f7634m.setText(C2073a0.this.f7646y);
            if (C2073a0.this.f7638q != null && C2073a0.this.f7635n != null) {
                int P = C2073a0.this.f7640s;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String format = C2073a0.this.f7638q.format(((double) P) / ((double) C2073a0.this.f7633l.getMax()));
                spannableStringBuilder.append(format);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7648a), 0, format.length(), 34);
                C2073a0.this.f7633l.setProgress(C2073a0.this.f7640s);
                C2073a0.this.f7635n.setText(spannableStringBuilder);
            }
        }
    }

    public C2073a0(Context context) {
        super(context);
        m8258T();
    }

    /* renamed from: T */
    private void m8258T() {
        this.f7637p = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f7638q = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    /* renamed from: U */
    private void m8259U() {
        Handler handler;
        if (this.f7636o == 1 && (handler = this.f7632B) != null && !handler.hasMessages(0)) {
            this.f7632B.sendEmptyMessage(0);
        }
    }

    /* renamed from: H */
    public void mo7367H(CharSequence charSequence) {
        if (this.f7633l != null) {
            if (this.f7636o == 1) {
                this.f7646y = charSequence;
            }
            this.f7634m.setText(charSequence);
            return;
        }
        this.f7646y = charSequence;
    }

    /* renamed from: R */
    public void mo7368R(int i) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.incrementProgressBy(i);
            m8259U();
            return;
        }
        this.f7642u += i;
    }

    /* renamed from: S */
    public void mo7369S(int i) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.incrementSecondaryProgressBy(i);
            m8259U();
            return;
        }
        this.f7643v += i;
    }

    /* renamed from: V */
    public void mo7370V(boolean z) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.f7647z = z;
        }
    }

    /* renamed from: W */
    public void mo7371W(Drawable drawable) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(drawable);
        } else {
            this.f7645x = drawable;
        }
    }

    /* renamed from: X */
    public void mo7372X(int i) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.setMax(i);
            m8259U();
            return;
        }
        this.f7639r = i;
    }

    /* renamed from: Y */
    public void mo7373Y(int i) {
        this.f7640s = i;
        if (this.f7631A) {
            m8259U();
        }
    }

    /* renamed from: Z */
    public void mo7374Z(Drawable drawable) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        } else {
            this.f7644w = drawable;
        }
    }

    /* renamed from: a0 */
    public void mo7375a0(int i) {
        ProgressBar progressBar = this.f7633l;
        if (progressBar != null) {
            progressBar.setSecondaryProgress(i);
            m8259U();
            return;
        }
        this.f7641t = i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View view;
        LayoutInflater from = LayoutInflater.from(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1357m.f4884W, 16842845, 0);
        TypedArray obtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(new int[]{C1347c.f4589w});
        int color = obtainStyledAttributes2.getColor(0, getContext().getResources().getColor(C1349e.f4600d));
        obtainStyledAttributes2.recycle();
        if (this.f7636o == 1) {
            this.f7632B = new C2074a(color);
            view = from.inflate(obtainStyledAttributes.getResourceId(C1357m.f4888X, C1354j.f4776s), (ViewGroup) null);
            this.f7635n = (TextView) view.findViewById(C1352h.f4694P);
        } else {
            view = from.inflate(obtainStyledAttributes.getResourceId(C1357m.f4911c0, C1354j.f4746E), (ViewGroup) null);
        }
        this.f7633l = (ProgressBar) view.findViewById(16908301);
        TextView textView = (TextView) view.findViewById(C1352h.f4686H);
        this.f7634m = textView;
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(getContext().getResources().getDimensionPixelSize(C1350f.f4619O));
        }
        mo7525J(view);
        obtainStyledAttributes.recycle();
        int i = this.f7639r;
        if (i > 0) {
            mo7372X(i);
        }
        int i2 = this.f7640s;
        if (i2 > 0) {
            mo7373Y(i2);
        }
        int i3 = this.f7641t;
        if (i3 > 0) {
            mo7375a0(i3);
        }
        int i4 = this.f7642u;
        if (i4 > 0) {
            mo7368R(i4);
        }
        int i5 = this.f7643v;
        if (i5 > 0) {
            mo7369S(i5);
        }
        Drawable drawable = this.f7644w;
        if (drawable != null) {
            mo7374Z(drawable);
        }
        Drawable drawable2 = this.f7645x;
        if (drawable2 != null) {
            mo7371W(drawable2);
        }
        CharSequence charSequence = this.f7646y;
        if (charSequence != null) {
            mo7367H(charSequence);
        }
        mo7370V(this.f7647z);
        m8259U();
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f7631A = true;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f7631A = false;
    }
}
