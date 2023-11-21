package com.miui.compass;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import miuix.appcompat.app.C2112p;

/* renamed from: com.miui.compass.q */
public class C1430q extends C2112p {
    protected C1430q(Context context) {
        super(context);
    }

    /* renamed from: K */
    public boolean mo5408K() {
        return ((CheckBox) findViewById(2131361955)).isChecked();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View inflate = getLayoutInflater().inflate(2131558556, (ViewGroup) null);
        setTitle(2131820833);
        mo7367H(getContext().getString(2131820832));
        mo7525J(inflate);
        super.onCreate(bundle);
    }
}
