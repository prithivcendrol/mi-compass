package p144z;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0854e;

/* renamed from: z.h */
class C2963h implements TransformationMethod {

    /* renamed from: d */
    private final TransformationMethod f11196d;

    C2963h(TransformationMethod transformationMethod) {
        this.f11196d = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo10276a() {
        return this.f11196d;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f11196d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0854e.m3389b().mo3091d() != 1) ? charSequence : C0854e.m3389b().mo3096o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f11196d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
