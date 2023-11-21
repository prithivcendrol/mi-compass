package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.widget.TextView;
import androidx.appcompat.app.C0122b;
import androidx.fragment.app.C0941e;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;

/* renamed from: androidx.preference.g */
public abstract class C1120g extends C0941e implements DialogInterface.OnClickListener {

    /* renamed from: A0 */
    private int f3666A0;

    /* renamed from: B0 */
    private BitmapDrawable f3667B0;

    /* renamed from: C0 */
    private int f3668C0;

    /* renamed from: v0 */
    private DialogPreference f3669v0;

    /* renamed from: w0 */
    private CharSequence f3670w0;

    /* renamed from: x0 */
    private CharSequence f3671x0;

    /* renamed from: y0 */
    private CharSequence f3672y0;

    /* renamed from: z0 */
    private CharSequence f3673z0;

    /* renamed from: androidx.preference.g$a */
    private static class C1121a {
        /* renamed from: a */
        static void m4581a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
        }
    }

    /* renamed from: m2 */
    private void m4570m2(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C1121a.m4581a(window);
        } else {
            mo4052n2();
        }
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.mo3200B0(bundle);
        Fragment g0 = mo3275g0();
        if (g0 instanceof DialogPreference.C1080a) {
            DialogPreference.C1080a aVar = (DialogPreference.C1080a) g0;
            String string = mo3204C1().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.mo3871h(string);
                this.f3669v0 = dialogPreference;
                this.f3670w0 = dialogPreference.mo3867J0();
                this.f3671x0 = this.f3669v0.mo3869L0();
                this.f3672y0 = this.f3669v0.mo3868K0();
                this.f3673z0 = this.f3669v0.mo3866I0();
                this.f3666A0 = this.f3669v0.mo3865H0();
                Drawable G0 = this.f3669v0.mo3864G0();
                if (G0 == null || (G0 instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) G0;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(G0.getIntrinsicWidth(), G0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    G0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    G0.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(mo3262a0(), createBitmap);
                }
                this.f3667B0 = bitmapDrawable;
                return;
            }
            this.f3670w0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3671x0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3672y0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3673z0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3666A0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3667B0 = new BitmapDrawable(mo3262a0(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3670w0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3671x0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3672y0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3673z0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3666A0);
        BitmapDrawable bitmapDrawable = this.f3667B0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* renamed from: Z1 */
    public Dialog mo3516Z1(Bundle bundle) {
        this.f3668C0 = -2;
        C0122b.C0123a h = new C0122b.C0123a(mo3207D1()).mo416m(this.f3670w0).mo408e(this.f3667B0).mo413j(this.f3671x0, this).mo411h(this.f3672y0, this);
        View j2 = mo4059j2(mo3207D1());
        if (j2 != null) {
            mo4050i2(j2);
            h.mo417n(j2);
        } else {
            h.mo409f(this.f3673z0);
        }
        mo4055l2(h);
        C0122b a = h.mo404a();
        if (mo4049h2()) {
            m4570m2(a);
        }
        return a;
    }

    /* renamed from: g2 */
    public DialogPreference mo4058g2() {
        if (this.f3669v0 == null) {
            this.f3669v0 = (DialogPreference) ((DialogPreference.C1080a) mo3275g0()).mo3871h(mo3204C1().getString("key"));
        }
        return this.f3669v0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public boolean mo4049h2() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public void mo4050i2(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f3673z0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public View mo4059j2(Context context) {
        int i = this.f3666A0;
        if (i == 0) {
            return null;
        }
        return mo3236P().inflate(i, (ViewGroup) null);
    }

    /* renamed from: k2 */
    public abstract void mo4051k2(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public void mo4055l2(C0122b.C0123a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo4052n2() {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3668C0 = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo4051k2(this.f3668C0 == -1);
    }
}
