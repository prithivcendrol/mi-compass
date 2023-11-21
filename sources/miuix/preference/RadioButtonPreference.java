package miuix.preference;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.C1141m;
import androidx.preference.CheckBoxPreference;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p123u3.C2850k;
import p123u3.C2854o;

public class RadioButtonPreference extends CheckBoxPreference implements Checkable, MessageQueue.IdleHandler {

    /* renamed from: Y */
    private boolean f9131Y;

    /* renamed from: Z */
    private View f9132Z;

    /* renamed from: a0 */
    private View f9133a0;

    /* renamed from: b0 */
    private boolean f9134b0;

    /* renamed from: c0 */
    private C2376a f9135c0;

    /* renamed from: d0 */
    private View f9136d0;

    /* renamed from: miuix.preference.RadioButtonPreference$a */
    class C2365a extends View.AccessibilityDelegate {
        C2365a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(false);
        }
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10731n);
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9134b0 = true;
        Looper.myQueue().addIdleHandler(this);
    }

    /* renamed from: N0 */
    private void m9989N0(CompoundButton compoundButton, boolean z) {
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable instanceof StateListDrawable) {
            Drawable current = buttonDrawable.getCurrent();
            if (current instanceof AnimatedVectorDrawable) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) current;
                if (z) {
                    if (animatedVectorDrawable.isRunning()) {
                        animatedVectorDrawable.stop();
                        animatedVectorDrawable.reset();
                    }
                    animatedVectorDrawable.start();
                } else if (!animatedVectorDrawable.isRunning()) {
                    animatedVectorDrawable.start();
                    animatedVectorDrawable.stop();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo3872M() {
        super.mo3872M();
        C2376a aVar = this.f9135c0;
        if (aVar != null) {
            aVar.mo9028a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo9023O0(C2376a aVar) {
        this.f9135c0 = aVar;
    }

    /* renamed from: P */
    public void mo3929P() {
        super.mo3929P();
        mo3967s0(mo3971u() instanceof RadioSetPreferenceCategory ? C2854o.f10759a : C2854o.f10760b);
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        View view = mVar.f4049a;
        this.f9136d0 = view;
        View findViewById = view.findViewById(16908310);
        this.f9133a0 = findViewById;
        if ((findViewById instanceof TextView) && Build.VERSION.SDK_INT >= 28) {
            ((TextView) findViewById).setFallbackLineSpacing(this.f9134b0);
        }
        View view2 = this.f9133a0;
        if (view2 instanceof Checkable) {
            ((Checkable) view2).setChecked(isChecked());
        }
        View findViewById2 = view.findViewById(16908304);
        if (findViewById2 instanceof Checkable) {
            ((Checkable) findViewById2).setChecked(isChecked());
        }
        View view3 = this.f9133a0;
        if (view3 != null && findViewById2 != null && view3.getVisibility() == 0 && findViewById2.getVisibility() == 0) {
            findViewById2.setAccessibilityDelegate(new C2365a());
        }
        View findViewById3 = view.findViewById(16908289);
        this.f9132Z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setImportantForAccessibility(2);
            if ((this.f9132Z instanceof CompoundButton) && isChecked()) {
                m9989N0((CompoundButton) this.f9132Z, this.f9131Y);
                this.f9131Y = false;
            }
        }
        Folme.useAt(view).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(view, new AnimConfig[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        View view;
        this.f9131Y = true;
        super.mo3870T();
        if (this.f9131Y && (view = this.f9136d0) != null) {
            HapticCompat.performHapticFeedbackAsync(view, C2403h.f9356A, C2403h.f9367f);
        }
    }

    /* renamed from: V */
    public void mo3933V() {
        super.mo3933V();
        Looper.myQueue().removeIdleHandler(this);
        mo3916B().edit().remove(mo3960p()).apply();
    }

    /* renamed from: b */
    public boolean mo3938b(Object obj) {
        C2376a aVar = this.f9135c0;
        boolean z = true;
        if (!(aVar != null ? aVar.mo9029b(this, obj) : true) || !super.mo3938b(obj)) {
            z = false;
        }
        if (!z && this.f9131Y) {
            this.f9131Y = false;
        }
        return z;
    }

    public boolean queueIdle() {
        return false;
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}
