package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: androidx.preference.a */
public class C1111a extends C1120g {

    /* renamed from: D0 */
    private EditText f3651D0;

    /* renamed from: E0 */
    private CharSequence f3652E0;

    /* renamed from: F0 */
    private final Runnable f3653F0 = new C1112a();

    /* renamed from: G0 */
    private long f3654G0 = -1;

    /* renamed from: androidx.preference.a$a */
    class C1112a implements Runnable {
        C1112a() {
        }

        public void run() {
            C1111a.this.mo4053r2();
        }
    }

    /* renamed from: o2 */
    private EditTextPreference m4542o2() {
        return (EditTextPreference) mo4058g2();
    }

    /* renamed from: p2 */
    private boolean m4543p2() {
        long j = this.f3654G0;
        return j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: q2 */
    public static C1111a m4544q2(String str) {
        C1111a aVar = new C1111a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.mo3220J1(bundle);
        return aVar;
    }

    /* renamed from: s2 */
    private void m4545s2(boolean z) {
        this.f3654G0 = z ? SystemClock.currentThreadTimeMillis() : -1;
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        this.f3652E0 = bundle == null ? m4542o2().mo3878N0() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3652E0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public boolean mo4049h2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public void mo4050i2(View view) {
        super.mo4050i2(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f3651D0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f3651D0.setText(this.f3652E0);
            EditText editText2 = this.f3651D0;
            editText2.setSelection(editText2.getText().length());
            if (m4542o2().mo3877M0() != null) {
                m4542o2().mo3877M0().mo3884a(this.f3651D0);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* renamed from: k2 */
    public void mo4051k2(boolean z) {
        if (z) {
            String obj = this.f3651D0.getText().toString();
            EditTextPreference o2 = m4542o2();
            if (o2.mo3938b(obj)) {
                o2.mo3879O0(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo4052n2() {
        m4545s2(true);
        mo4053r2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public void mo4053r2() {
        if (m4543p2()) {
            EditText editText = this.f3651D0;
            if (editText == null || !editText.isFocused()) {
                m4545s2(false);
            } else if (((InputMethodManager) this.f3651D0.getContext().getSystemService("input_method")).showSoftInput(this.f3651D0, 0)) {
                m4545s2(false);
            } else {
                this.f3651D0.removeCallbacks(this.f3653F0);
                this.f3651D0.postDelayed(this.f3653F0, 50);
            }
        }
    }
}
