package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0547d;
import androidx.core.text.C0614c;
import androidx.core.widget.C0828k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p027e.C1512a;

public class AppCompatTextView extends TextView {

    /* renamed from: d */
    private final C0318e f964d;

    /* renamed from: e */
    private final C0420x f965e;

    /* renamed from: f */
    private final C0417w f966f;

    /* renamed from: g */
    private C0342k f967g;

    /* renamed from: h */
    private boolean f968h;

    /* renamed from: i */
    private C0253a f969i;

    /* renamed from: j */
    private Future<C0614c> f970j;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    private interface C0253a {
        /* renamed from: a */
        void mo1436a(int[] iArr, int i);

        /* renamed from: b */
        void mo1437b(TextClassifier textClassifier);

        /* renamed from: c */
        int[] mo1438c();

        /* renamed from: d */
        void mo1439d(int i);

        /* renamed from: e */
        TextClassifier mo1440e();

        /* renamed from: f */
        int mo1441f();

        /* renamed from: g */
        void mo1442g(int i, int i2, int i3, int i4);

        /* renamed from: h */
        int mo1443h();

        /* renamed from: i */
        int mo1444i();

        /* renamed from: j */
        void mo1445j(int i);

        /* renamed from: k */
        int mo1446k();

        /* renamed from: l */
        void mo1447l(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    class C0254b implements C0253a {
        C0254b() {
        }

        /* renamed from: a */
        public void mo1436a(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: b */
        public void mo1437b(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        /* renamed from: c */
        public int[] mo1438c() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        /* renamed from: d */
        public void mo1439d(int i) {
        }

        /* renamed from: e */
        public TextClassifier mo1440e() {
            return AppCompatTextView.super.getTextClassifier();
        }

        /* renamed from: f */
        public int mo1441f() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        /* renamed from: g */
        public void mo1442g(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: h */
        public int mo1443h() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        /* renamed from: i */
        public int mo1444i() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        /* renamed from: j */
        public void mo1445j(int i) {
        }

        /* renamed from: k */
        public int mo1446k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        /* renamed from: l */
        public void mo1447l(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    class C0255c extends C0254b {
        C0255c() {
            super();
        }

        /* renamed from: d */
        public void mo1439d(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        /* renamed from: j */
        public void mo1445j(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        this.f968h = false;
        this.f969i = null;
        C0298b1.m1339a(this, getContext());
        C0318e eVar = new C0318e(this);
        this.f964d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f965e = xVar;
        xVar.mo2290m(attributeSet, i);
        xVar.mo2280b();
        this.f966f = new C0417w(this);
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f967g == null) {
            this.f967g = new C0342k(this);
        }
        return this.f967g;
    }

    /* renamed from: q */
    private void m1132q() {
        Future<C0614c> future = this.f970j;
        if (future != null) {
            try {
                this.f970j = null;
                C0828k.m3312k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f964d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0385r1.f1473b) {
            return getSuperCaller().mo1441f();
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            return xVar.mo2282e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0385r1.f1473b) {
            return getSuperCaller().mo1444i();
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            return xVar.mo2283f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0385r1.f1473b) {
            return getSuperCaller().mo1446k();
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            return xVar.mo2284g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0385r1.f1473b) {
            return getSuperCaller().mo1438c();
        }
        C0420x xVar = this.f965e;
        return xVar != null ? xVar.mo2285h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0385r1.f1473b) {
            return getSuperCaller().mo1443h() == 1 ? 1 : 0;
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            return xVar.mo2286i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return C0828k.m3302a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0828k.m3303b(this);
    }

    /* access modifiers changed from: package-private */
    public C0253a getSuperCaller() {
        C0253a bVar;
        if (this.f969i == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                bVar = new C0255c();
            } else if (i >= 26) {
                bVar = new C0254b();
            }
            this.f969i = bVar;
        }
        return this.f969i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f964d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f964d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f965e.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f965e.mo2288k();
    }

    public CharSequence getText() {
        m1132q();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f966f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.w r0 = r2.f966f
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo2276a()
            return r0
        L_0x0010:
            androidx.appcompat.widget.AppCompatTextView$a r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.mo1440e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C0614c.C0615a getTextMetricsParamsCompat() {
        return C0828k.m3306e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f965e.mo2295r(this, onCreateInputConnection, editorInfo);
        return C0345l.m1590a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2292o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1132q();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0420x xVar = this.f965e;
        if (xVar != null && !C0385r1.f1473b && xVar.mo2289l()) {
            this.f965e.mo2281c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0385r1.f1473b) {
            getSuperCaller().mo1442g(i, i2, i3, i4);
            return;
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2297t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0385r1.f1473b) {
            getSuperCaller().mo1436a(iArr, i);
            return;
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2298u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0385r1.f1473b) {
            getSuperCaller().mo1447l(i);
            return;
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2299v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f964d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f964d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C1512a.m6567b(context, i) : null;
        Drawable b2 = i2 != 0 ? C1512a.m6567b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C1512a.m6567b(context, i3) : null;
        if (i4 != 0) {
            drawable = C1512a.m6567b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C1512a.m6567b(context, i) : null;
        Drawable b2 = i2 != 0 ? C1512a.m6567b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C1512a.m6567b(context, i3) : null;
        if (i4 != 0) {
            drawable = C1512a.m6567b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo1967e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo1963a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1445j(i);
        } else {
            C0828k.m3309h(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1439d(i);
        } else {
            C0828k.m3310i(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0828k.m3311j(this, i);
    }

    public void setPrecomputedText(C0614c cVar) {
        C0828k.m3312k(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f964d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f964d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f965e.mo2300w(colorStateList);
        this.f965e.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f965e.mo2301x(mode);
        this.f965e.mo2280b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2294q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0417w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f966f) == null) {
            getSuperCaller().mo1437b(textClassifier);
        } else {
            wVar.mo2277b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0614c> future) {
        this.f970j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0614c.C0615a aVar) {
        C0828k.m3314m(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0385r1.f1473b) {
            super.setTextSize(i, f);
            return;
        }
        C0420x xVar = this.f965e;
        if (xVar != null) {
            xVar.mo2279A(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f968h) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = C0547d.m2259a(getContext(), typeface, i);
            }
            this.f968h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f968h = false;
            }
        }
    }
}
