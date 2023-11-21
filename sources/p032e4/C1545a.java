package p032e4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: e4.a */
public abstract class C1545a implements LayoutInflater.Factory2 {

    /* renamed from: d */
    private LayoutInflater.Factory2 f6198d;

    /* renamed from: a */
    public void mo5666a(LayoutInflater.Factory2 factory2) {
        this.f6198d = factory2;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f6198d;
        if (factory2 != null) {
            return factory2.onCreateView(view, str, context, attributeSet);
        }
        return null;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f6198d;
        if (factory2 != null) {
            return factory2.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
