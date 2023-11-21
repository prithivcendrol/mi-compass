package miuix.androidbasewidget.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import androidx.appcompat.widget.C0385r1;
import androidx.core.view.C0727l0;
import androidx.core.view.accessibility.C0637g;
import java.lang.ref.WeakReference;
import java.util.List;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p134x.C2891a;
import p146z1.C2965a;
import p146z1.C2969e;

public class ClearableEditText extends C1983b {

    /* renamed from: v */
    private static final int[] f7432v = {16842921};
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Drawable f7433q;

    /* renamed from: r */
    private boolean f7434r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7435s;

    /* renamed from: t */
    private C1978b f7436t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C1977a f7437u;

    /* renamed from: miuix.androidbasewidget.widget.ClearableEditText$a */
    private class C1977a extends C2891a {

        /* renamed from: q */
        private final Rect f7438q = new Rect();

        /* renamed from: r */
        private final View f7439r;

        public C1977a(View view) {
            super(view);
            this.f7439r = view;
        }

        /* renamed from: O */
        private void m8054O(Rect rect) {
            this.f7439r.getLocalVisibleRect(this.f7438q);
            int intrinsicWidth = ClearableEditText.this.f7433q == null ? 0 : ClearableEditText.this.f7433q.getIntrinsicWidth();
            if (C0385r1.m1722b(ClearableEditText.this)) {
                rect.right -= (ClearableEditText.this.getWidth() - intrinsicWidth) - (ClearableEditText.this.getPaddingLeft() * 2);
            } else {
                rect.left += (ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth;
            }
        }

        /* renamed from: P */
        private CharSequence m8055P() {
            return ClearableEditText.this.getResources().getString(C2969e.f11213a);
        }

        /* renamed from: Q */
        private boolean m8056Q(float f, float f2) {
            int intrinsicWidth = ClearableEditText.this.f7433q == null ? 0 : ClearableEditText.this.f7433q.getIntrinsicWidth();
            return C0385r1.m1722b(ClearableEditText.this) ? f < ((float) (intrinsicWidth + (ClearableEditText.this.getPaddingLeft() * 2))) : f > ((float) ((ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth));
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public boolean mo6643B(int i, int i2, Bundle bundle) {
            if (i == Integer.MIN_VALUE || i2 != 16) {
                return false;
            }
            ClearableEditText.this.m8053q();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo6644C(AccessibilityEvent accessibilityEvent) {
            super.mo6644C(accessibilityEvent);
            if (accessibilityEvent.getEventType() == 2048 && !ClearableEditText.this.f7435s && this.f7439r.isFocused()) {
                this.f7439r.sendAccessibilityEvent(32768);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo6645D(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(m8055P());
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo6646E(C0637g gVar) {
            super.mo6646E(gVar);
            if (ClearableEditText.this.f7435s) {
                gVar.mo2745T(ClearableEditText.class.getName());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void mo6647F(int i, C0637g gVar) {
            gVar.mo2749X(m8055P());
            gVar.mo2752a(16);
            gVar.mo2745T(Button.class.getName());
            m8054O(this.f7438q);
            gVar.mo2743R(this.f7438q);
            gVar.mo2746U(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public int mo6648v(float f, float f2) {
            return (!ClearableEditText.this.f7435s || !m8056Q(f, f2)) ? Integer.MIN_VALUE : 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo6649w(List list) {
            if (ClearableEditText.this.f7435s) {
                list.add(0);
            }
        }
    }

    /* renamed from: miuix.androidbasewidget.widget.ClearableEditText$b */
    static class C1978b implements TextWatcher {

        /* renamed from: d */
        WeakReference<ClearableEditText> f7441d;

        C1978b(ClearableEditText clearableEditText) {
            this.f7441d = new WeakReference<>(clearableEditText);
        }

        public void afterTextChanged(Editable editable) {
            ClearableEditText clearableEditText = this.f7441d.get();
            if (clearableEditText != null) {
                if (clearableEditText.f7435s != (editable.length() > 0)) {
                    boolean unused = clearableEditText.f7435s = !clearableEditText.f7435s;
                    clearableEditText.refreshDrawableState();
                    if (clearableEditText.f7437u != null) {
                        clearableEditText.f7437u.mo10191x();
                    }
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2965a.f11201a);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7436t = new C1978b(this);
        this.f7433q = getCompoundDrawablesRelative()[2];
        int i2 = Build.VERSION.SDK_INT;
        C1977a aVar = new C1977a(this);
        this.f7437u = aVar;
        C0727l0.m2875Y(this, aVar);
        boolean z = false;
        if (i2 >= 29) {
            setForceDarkAllowed(false);
        }
        Editable text = getText();
        if (text != null) {
            if (this.f7435s != (text.length() > 0 ? true : z)) {
                this.f7435s = !this.f7435s;
                refreshDrawableState();
            }
        }
    }

    /* renamed from: o */
    private boolean m8051o(MotionEvent motionEvent) {
        if (this.f7435s) {
            Drawable drawable = this.f7433q;
            int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth();
            if (C0385r1.m1722b(this)) {
                if (motionEvent.getX() < ((float) (intrinsicWidth + getPaddingLeft()))) {
                    return m8052p(motionEvent);
                }
            } else if (motionEvent.getX() > ((float) ((getWidth() - getPaddingRight()) - intrinsicWidth))) {
                return m8052p(motionEvent);
            }
        }
        this.f7434r = false;
        return false;
    }

    /* renamed from: p */
    private boolean m8052p(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.f7434r) {
                    this.f7434r = false;
                }
            } else if (isEnabled() && this.f7434r) {
                m8053q();
                this.f7434r = false;
                return true;
            }
        } else if (isEnabled() && this.f7435s) {
            this.f7434r = true;
        }
        return this.f7434r;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m8053q() {
        setText("");
        HapticCompat.m10233e(this, C2403h.f9356A, C2403h.f9368g);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C1977a aVar = this.f7437u;
        if (aVar == null || !this.f7435s || !aVar.mo10190u(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m8051o(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f7433q != null) {
            this.f7433q.setState(getDrawableState());
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7433q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f7436t);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (!this.f7435s) {
            View.mergeDrawableStates(onCreateDrawableState, f7432v);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f7436t);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Editable text = getText();
        if (text != null) {
            if (this.f7435s != (text.length() > 0)) {
                this.f7435s = !this.f7435s;
                refreshDrawableState();
            }
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new IllegalStateException("ClearableEditText can only set drawables by setCompoundDrawablesRelative()");
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f7433q = drawable3;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7433q;
    }
}
