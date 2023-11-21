package com.miui.compass;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.miui.compass.C1437x;
import miuix.appcompat.app.C2071a;
import miuix.appcompat.app.C2118q;

public class CompassScreenView extends C1437x implements C1437x.C1443f {

    /* renamed from: a0 */
    private final String f5189a0;

    /* renamed from: b0 */
    private C2118q f5190b0;

    /* renamed from: c0 */
    private boolean f5191c0;

    public CompassScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompassScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5189a0 = "Compass:CompassScreenView";
        this.f5191c0 = false;
        this.f5190b0 = (C2118q) context;
    }

    /* renamed from: A */
    public void mo5273A(int i) {
        mo5416D(i, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo5274B(int i, int i2, boolean z) {
        mo5415C(i, i2, z, this);
    }

    /* renamed from: a */
    public void mo5275a(C1437x xVar) {
        C2071a F0 = this.f5190b0.mo7561F0();
        int currentScreenIndex = xVar.getCurrentScreenIndex();
        if (F0 == null) {
            Log.d("Compass:CompassScreenView", "onSnapEnd: actionBar is null return");
            return;
        }
        F0.mo386z(xVar.getCurrentScreenIndex());
        if ((currentScreenIndex == 0 || currentScreenIndex == 1) && getIsCalibrating() && !F0.mo374n()) {
            F0.mo365C();
        }
    }

    /* renamed from: b */
    public void mo5276b(C1437x xVar) {
    }

    public boolean getIsCalibrating() {
        return this.f5191c0;
    }

    public void setIsCalibrating(boolean z) {
        this.f5191c0 = z;
    }
}
