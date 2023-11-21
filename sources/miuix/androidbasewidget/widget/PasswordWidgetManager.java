package miuix.androidbasewidget.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import androidx.core.content.C0510a;
import miuix.androidbasewidget.widget.C1986c;
import p055i3.C1649c;
import p146z1.C2965a;
import p146z1.C2968d;

public class PasswordWidgetManager extends C1986c.C1987a {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private boolean mIsChecked = false;
    private C1986c mMaster;
    private Drawable mWidgetDrawable;

    public PasswordWidgetManager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable h = C1649c.m6963h(context, C2965a.f11202b);
        this.mWidgetDrawable = h;
        if (h == null) {
            this.mWidgetDrawable = C0510a.m2124e(context, C1649c.m6959d(context, 16844176, true) ? C2968d.f11212b : C2968d.f11211a);
        }
    }

    public Drawable[] getWidgetDrawables() {
        return new Drawable[]{this.mWidgetDrawable};
    }

    public void onAttached(C1986c cVar) {
        this.mMaster = cVar;
        if (cVar != null) {
            cVar.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetached() {
        super.onDetached();
        C1986c cVar = this.mMaster;
        if (cVar != null) {
            cVar.setTransformationMethod((TransformationMethod) null);
        }
    }

    public void onWidgetClick(int i) {
        this.mIsChecked = !this.mIsChecked;
        C1986c cVar = this.mMaster;
        if (cVar != null) {
            int selectionStart = cVar.getSelectionStart();
            int selectionEnd = this.mMaster.getSelectionEnd();
            this.mMaster.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
            this.mMaster.setTextDirection(2);
            this.mMaster.setSelection(selectionStart, selectionEnd);
        }
        this.mWidgetDrawable.setState(this.mIsChecked ? CHECKED_STATE_SET : new int[0]);
    }
}
