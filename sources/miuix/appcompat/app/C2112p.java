package miuix.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.C0160k;
import java.lang.reflect.InvocationTargetException;
import miuix.appcompat.app.AlertController;
import miuix.appcompat.internal.widget.DialogParentPanel2;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p005a4.C0039a;
import p018c2.C1347c;
import p051i.C1632a;
import p051i.C1636c;
import p051i.C1638d;
import p102q2.C2583b;

/* renamed from: miuix.appcompat.app.p */
public class C2112p extends C0160k {

    /* renamed from: h */
    final AlertController f7737h;

    /* renamed from: i */
    private Object f7738i;

    /* renamed from: j */
    private C1638d f7739j;

    /* renamed from: k */
    private C2583b.C2584a f7740k;

    /* renamed from: miuix.appcompat.app.p$a */
    class C2113a extends C1636c {

        /* renamed from: d */
        private volatile Handler f7741d;

        /* renamed from: e */
        private final Object f7742e = new Object();

        C2113a() {
        }

        /* renamed from: d */
        private Handler m8522d(Looper looper) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Handler.createAsync(looper);
            }
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                return new Handler(looper);
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }

        /* renamed from: b */
        public boolean mo5812b() {
            return true;
        }

        /* renamed from: c */
        public void mo5813c(Runnable runnable) {
            if (this.f7741d == null) {
                synchronized (this.f7742e) {
                    if (this.f7741d == null) {
                        this.f7741d = m8522d(Looper.myLooper());
                    }
                }
            }
            this.f7741d.post(runnable);
        }
    }

    /* renamed from: miuix.appcompat.app.p$b */
    public static class C2114b {

        /* renamed from: a */
        private final AlertController.AlertParams f7744a;

        /* renamed from: b */
        private final int f7745b;

        public C2114b(Context context) {
            this(context, C2112p.m8502E(context, 0));
        }

        public C2114b(Context context, int i) {
            this.f7744a = new AlertController.AlertParams(new ContextThemeWrapper(context, C2112p.m8502E(context, i)));
            this.f7745b = i;
        }

        /* renamed from: a */
        public C2112p mo7536a() {
            C2112p pVar = new C2112p(this.f7744a.mContext, this.f7745b);
            this.f7744a.apply(pVar.f7737h);
            pVar.setCancelable(this.f7744a.mCancelable);
            if (this.f7744a.mCancelable) {
                pVar.setCanceledOnTouchOutside(true);
            }
            pVar.setOnCancelListener(this.f7744a.mOnCancelListener);
            pVar.setOnDismissListener(this.f7744a.mOnDismissListener);
            pVar.setOnShowListener(this.f7744a.mOnShowListener);
            pVar.mo7524I(this.f7744a.mOnDialogShowAnimListener);
            DialogInterface.OnKeyListener onKeyListener = this.f7744a.mOnKeyListener;
            if (onKeyListener != null) {
                pVar.setOnKeyListener(onKeyListener);
            }
            return pVar;
        }

        /* renamed from: b */
        public C2114b mo7537b(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C2114b mo7538c(boolean z) {
            this.f7744a.mCancelable = z;
            return this;
        }

        /* renamed from: d */
        public C2114b mo7539d(View view) {
            this.f7744a.mCustomTitleView = view;
            return this;
        }

        /* renamed from: e */
        public C2114b mo7540e(Drawable drawable) {
            this.f7744a.mIcon = drawable;
            return this;
        }

        /* renamed from: f */
        public C2114b mo7541f(int i) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        /* renamed from: g */
        public C2114b mo7542g(CharSequence charSequence) {
            this.f7744a.mMessage = charSequence;
            return this;
        }

        /* renamed from: h */
        public C2114b mo7543h(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        /* renamed from: i */
        public C2114b mo7544i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.f7744a.mNegativeButtonListener = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C2114b mo7545j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C2114b mo7546k(DialogInterface.OnDismissListener onDismissListener) {
            this.f7744a.mOnDismissListener = onDismissListener;
            return this;
        }

        /* renamed from: l */
        public C2114b mo7547l(DialogInterface.OnKeyListener onKeyListener) {
            this.f7744a.mOnKeyListener = onKeyListener;
            return this;
        }

        /* renamed from: m */
        public C2114b mo7548m(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.f7744a.mPositiveButtonListener = onClickListener;
            return this;
        }

        /* renamed from: n */
        public C2114b mo7549n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        /* renamed from: o */
        public C2114b mo7550o(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        /* renamed from: p */
        public C2114b mo7551p(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        /* renamed from: q */
        public C2114b mo7552q(int i) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mTitle = alertParams.mContext.getText(i);
            return this;
        }

        /* renamed from: r */
        public C2114b mo7553r(CharSequence charSequence) {
            this.f7744a.mTitle = charSequence;
            return this;
        }

        /* renamed from: s */
        public C2114b mo7554s(View view) {
            AlertController.AlertParams alertParams = this.f7744a;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            return this;
        }
    }

    /* renamed from: miuix.appcompat.app.p$c */
    public interface C2115c {
        /* renamed from: a */
        void mo7555a();
    }

    /* renamed from: miuix.appcompat.app.p$d */
    public interface C2116d {
        void onShowAnimComplete();

        void onShowAnimStart();
    }

    /* renamed from: miuix.appcompat.app.p$e */
    public interface C2117e {
        /* renamed from: a */
        void mo7556a(C2112p pVar, DialogParentPanel2 dialogParentPanel2);
    }

    protected C2112p(Context context) {
        this(context, 0);
    }

    protected C2112p(Context context, int i) {
        super(context, m8502E(context, i));
        this.f7740k = new C2111o(this);
        this.f7737h = new AlertController(m8509z(context), this, getWindow());
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: A */
    private void m8499A() {
        String str;
        try {
            Object j = C0039a.m49j(C1632a.class, C1632a.m6928d(), "mDelegate");
            if (j != null) {
                this.f7738i = j;
            }
        } catch (IllegalAccessException e) {
            str = "onCreate() taskExecutor get failed IllegalAccessException " + e;
        } catch (NoSuchMethodException e2) {
            str = "onCreate() taskExecutor get failed NoSuchMethodException " + e2;
        } catch (InvocationTargetException e3) {
            str = "onCreate() taskExecutor get failed InvocationTargetException " + e3;
        } catch (Throwable th) {
            this.f7739j = m8505o();
            C1632a.m6928d().mo5814e(this.f7739j);
            throw th;
        }
        this.f7739j = m8505o();
        C1632a.m6928d().mo5814e(this.f7739j);
        Log.d("MiuixDialog", str);
        this.f7739j = m8505o();
        C1632a.m6928d().mo5814e(this.f7739j);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: B */
    private void m8500B() {
        if (this.f7738i instanceof C1638d) {
            C1632a.m6928d().mo5814e((C1638d) this.f7738i);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: C */
    private void m8501C() {
        try {
            Object j = C0039a.m49j(C1632a.class, C1632a.m6928d(), "mDelegate");
            if (!(j == null || j == this.f7738i)) {
                this.f7738i = j;
            }
            if (j == this.f7739j && C1632a.m6928d().mo5812b()) {
                return;
            }
        } catch (IllegalAccessException e) {
            Log.d("MiuixDialog", "onStop() taskExecutor get failed IllegalAccessException " + e);
            if (this.f7739j == null && C1632a.m6928d().mo5812b()) {
                return;
            }
        } catch (NoSuchMethodException e2) {
            Log.d("MiuixDialog", "onStop() taskExecutor get failed NoSuchMethodException " + e2);
            if (this.f7739j == null && C1632a.m6928d().mo5812b()) {
                return;
            }
        } catch (InvocationTargetException e3) {
            Log.d("MiuixDialog", "onStop() taskExecutor get failed InvocationTargetException " + e3);
            if (this.f7739j == null && C1632a.m6928d().mo5812b()) {
                return;
            }
        } catch (Throwable th) {
            if (this.f7739j != null || !C1632a.m6928d().mo5812b()) {
                C1632a.m6928d().mo5814e(this.f7739j);
            }
            throw th;
        }
        C1632a.m6928d().mo5814e(this.f7739j);
    }

    /* renamed from: E */
    static int m8502E(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1347c.f4537E, typedValue, true);
        return typedValue.resourceId;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: o */
    private C1638d m8505o() {
        return new C2113a();
    }

    /* renamed from: v */
    private boolean m8506v() {
        return TextUtils.equals("android.ui", Thread.currentThread().getName()) || TextUtils.equals("android.imms", Thread.currentThread().getName()) || TextUtils.equals("system_server", Thread.currentThread().getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m8507w() {
        this.f7737h.mo7294K(this.f7740k);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m8508x() {
        View decorView;
        if (getWindow() != null && (decorView = getWindow().getDecorView()) != null && decorView.isAttachedToWindow()) {
            mo7521D();
        }
    }

    /* renamed from: z */
    private Context m8509z(Context context) {
        return context == null ? getContext() : context.getClass() == ContextThemeWrapper.class ? context : getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo7521D() {
        super.dismiss();
    }

    /* renamed from: F */
    public void mo7522F(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f7737h.mo7315z0(i, charSequence, onClickListener, (Message) null);
    }

    /* renamed from: G */
    public void mo7523G(boolean z) {
        this.f7737h.mo7290G0(z);
    }

    /* renamed from: H */
    public void mo7367H(CharSequence charSequence) {
        this.f7737h.mo7295K0(charSequence);
    }

    /* renamed from: I */
    public void mo7524I(C2116d dVar) {
        this.f7737h.mo7300O0(dVar);
    }

    /* renamed from: J */
    public void mo7525J(View view) {
        this.f7737h.mo7306S0(view);
    }

    public void dismiss() {
        Activity t;
        View decorView = getWindow().getDecorView();
        if (!this.f7737h.mo7309d0() || ((t = mo7533t()) != null && t.isFinishing())) {
            mo7528p(decorView);
        } else {
            mo7530s(decorView);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f7737h.mo7296L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        if (decorView != null && this.f7737h.f7556f0) {
            HapticCompat.performHapticFeedbackAsync(decorView, C2403h.f9360E, C2403h.f9375n);
        }
        this.f7737h.mo7310p0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (m8506v()) {
            m8499A();
        }
        if (this.f7737h.mo7309d0() || !this.f7737h.f7555f) {
            getWindow().setWindowAnimations(0);
        }
        super.onCreate(bundle);
        this.f7737h.mo7308Y(bundle);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7737h.mo7312r0();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f7737h.mo7313t0();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (m8506v()) {
            m8501C();
        }
        super.onStop();
        this.f7737h.mo7314u0();
        if (m8506v()) {
            m8500B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7528p(View view) {
        if (view == null || view.isAttachedToWindow()) {
            super.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7529r(View view) {
        if (Thread.currentThread() == view.getHandler().getLooper().getThread()) {
            this.f7737h.mo7294K(this.f7740k);
        } else {
            view.post(new C2110n(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7530s(View view) {
        if (view == null) {
            super.dismiss();
        } else if (view.getHandler() != null) {
            mo7529r(view);
        } else {
            mo7528p(view);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.f7737h.mo7284A0(z);
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f7737h.mo7285B0(z);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f7737h.mo7301P0(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Activity mo7533t() {
        Activity ownerActivity = getOwnerActivity();
        Context context = getContext();
        while (ownerActivity == null && context != null) {
            if (context instanceof Activity) {
                ownerActivity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return ownerActivity;
    }

    /* renamed from: u */
    public ListView mo7534u() {
        return this.f7737h.mo7305S();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7535y() {
    }
}
