package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.C0540j;
import p123u3.C2850k;
import p123u3.C2856q;

public class PreferenceCategory extends androidx.preference.PreferenceCategory {

    /* renamed from: b0 */
    private final boolean f9130b0;

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C2850k.f10724g, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10863f1, i, i2);
        this.f9130b0 = obtainStyledAttributes.getBoolean(C2856q.f10867g1, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: U0 */
    public boolean mo9021U0() {
        return !TextUtils.isEmpty(mo3919E());
    }

    /* renamed from: V0 */
    public boolean mo9022V0() {
        return this.f9130b0;
    }
}
