package com.miui.compass;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0941e;
import androidx.fragment.app.C0964j;
import miuix.appcompat.app.C2112p;

/* renamed from: com.miui.compass.n */
public class C1426n extends C0941e {

    /* renamed from: v0 */
    private final String f5411v0 = "Compass: InvisibleModeDialogFragment";

    /* renamed from: com.miui.compass.n$a */
    class C1427a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ Activity f5412d;

        C1427a(Activity activity) {
            this.f5412d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.d("Compass: InvisibleModeDialogFragment", "click invisible mode dialog: positive");
            this.f5412d.startActivity(new Intent("com.miui.securitycenter.action.INVISIBLE_SETTING"));
        }
    }

    /* renamed from: g2 */
    public static C1426n m6369g2() {
        return new C1426n();
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        C0964j t = mo3306t();
        C2112p.C2114b bVar = new C2112p.C2114b(t);
        bVar.mo7552q(2131820787);
        bVar.mo7541f(2131820784);
        bVar.mo7548m(2131820786, new C1427a(t));
        bVar.mo7544i(2131820785, (DialogInterface.OnClickListener) null);
        mo3519d2(false);
        return bVar.mo7536a();
    }
}
