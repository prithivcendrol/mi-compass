package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.appcompat.widget.C0331i;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import p146z1.C2966b;
import p146z1.C2970f;
import p146z1.C2971g;

/* renamed from: miuix.androidbasewidget.widget.b */
public class C1983b extends C0331i {

    /* renamed from: j */
    private int f7467j;

    /* renamed from: k */
    private boolean f7468k;

    /* renamed from: l */
    private boolean f7469l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextWatcher f7470m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f7471n;

    /* renamed from: o */
    private int f7472o;

    /* renamed from: p */
    private int f7473p;

    /* renamed from: miuix.androidbasewidget.widget.b$b */
    private class C1985b implements TextWatcher {
        private C1985b() {
        }

        public void afterTextChanged(Editable editable) {
            C1983b.this.setMiuiStyleError((CharSequence) null);
            if (C1983b.this.f7471n) {
                boolean unused = C1983b.this.f7471n = false;
                C1983b bVar = C1983b.this;
                bVar.removeTextChangedListener(bVar.f7470m);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C1983b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public C1983b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7468k = false;
        this.f7473p = -1;
        this.f7470m = new C1985b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2971g.f11291y, i, C2970f.f11214a);
        this.f7472o = obtainStyledAttributes.getColor(C2971g.f11292z, getResources().getColor(C2966b.f11205a));
        obtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background != null && background.getOpacity() != -2) {
            Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
        }
    }

    /* renamed from: h */
    private boolean m8087h() {
        int scrollY = getScrollY();
        int height = getLayout().getHeight() - ((getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom());
        this.f7467j = height;
        if (height == 0) {
            return false;
        }
        return scrollY > 0 || scrollY < height - 1;
    }

    /* renamed from: i */
    private int m8088i() {
        return Color.argb(38, Color.red(this.f7472o), Color.green(this.f7472o), Color.blue(this.f7472o));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7468k = false;
        }
        if (this.f7468k) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f7469l = m8087h();
    }

    public boolean onPreDraw() {
        boolean onPreDraw = super.onPreDraw();
        if (Build.VERSION.SDK_INT >= 29) {
            if (getHighlightColor() != m8088i()) {
                setHighlightColor(m8088i());
            }
            int i = this.f7473p;
            if (i == -1 || i != this.f7472o) {
                Drawable textSelectHandleLeft = getTextSelectHandleLeft();
                Drawable textSelectHandleRight = getTextSelectHandleRight();
                Drawable textSelectHandle = getTextSelectHandle();
                Drawable textCursorDrawable = getTextCursorDrawable();
                Drawable[] drawableArr = {textSelectHandleLeft, textSelectHandleRight, textSelectHandle, textCursorDrawable};
                for (int i2 = 0; i2 < 4; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        drawable.setColorFilter(this.f7472o, PorterDuff.Mode.SRC_IN);
                        this.f7473p = this.f7472o;
                    }
                }
                setTextSelectHandleLeft(textSelectHandleLeft);
                setTextSelectHandleRight(textSelectHandleRight);
                setTextSelectHandle(textSelectHandle);
                setTextCursorDrawable(textCursorDrawable);
            }
        }
        return onPreDraw;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f7469l = m8087h();
        if (i2 == this.f7467j || i2 == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f7468k = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (this.f7469l) {
            if (!this.f7468k && parent != null) {
                z = true;
            }
            return onTouchEvent;
        }
        if (parent != null) {
            z = false;
        }
        return onTouchEvent;
        parent.requestDisallowInterceptTouchEvent(z);
        return onTouchEvent;
    }

    public void setMiuiStyleError(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getBackground().setLevel(0);
            return;
        }
        getBackground().setLevel(404);
        if (!this.f7471n) {
            this.f7471n = true;
            addTextChangedListener(this.f7470m);
        }
    }
}
