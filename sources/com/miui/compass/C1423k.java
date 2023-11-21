package com.miui.compass;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0941e;
import miuix.appcompat.app.C2112p;

/* renamed from: com.miui.compass.k */
public class C1423k extends C0941e {

    /* renamed from: A0 */
    public int f5397A0;

    /* renamed from: B0 */
    DialogInterface.OnClickListener f5398B0;

    /* renamed from: C0 */
    DialogInterface.OnClickListener f5399C0;

    /* renamed from: v0 */
    public Context f5400v0;

    /* renamed from: w0 */
    public String f5401w0;

    /* renamed from: x0 */
    public String f5402x0;

    /* renamed from: y0 */
    public boolean f5403y0;

    /* renamed from: z0 */
    public int f5404z0;

    public C1423k(Context context, String str, String str2, boolean z, int i, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.f5400v0 = context;
        this.f5401w0 = str;
        this.f5402x0 = str2;
        this.f5403y0 = z;
        this.f5404z0 = i;
        this.f5397A0 = i2;
        this.f5398B0 = onClickListener;
        this.f5399C0 = onClickListener2;
        Log.d("compass:GenericDialogFragment:", "GenericDialogFragment: title : " + this.f5401w0);
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        C2112p.C2114b bVar = new C2112p.C2114b(this.f5400v0);
        bVar.mo7553r(this.f5401w0);
        bVar.mo7542g(this.f5402x0);
        bVar.mo7548m(this.f5404z0, this.f5398B0);
        bVar.mo7544i(this.f5397A0, this.f5399C0);
        mo3519d2(this.f5403y0);
        return bVar.mo7536a();
    }
}
