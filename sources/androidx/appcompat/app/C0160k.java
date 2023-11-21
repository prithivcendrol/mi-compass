package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0090f;
import androidx.appcompat.view.C0182b;
import androidx.core.view.C0685f;
import p021d.C1447a;

/* renamed from: androidx.appcompat.app.k */
public class C0160k extends C0090f implements C0127d {

    /* renamed from: f */
    private C0130g f481f;

    /* renamed from: g */
    private final C0685f.C0686a f482g = new C0159j(this);

    public C0160k(Context context, int i) {
        super(context, m586i(context, i));
        C0130g h = mo566h();
        h.mo465T(m586i(context, i));
        h.mo453D((Bundle) null);
    }

    /* renamed from: i */
    private static int m586i(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1447a.f5700z, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: M */
    public C0182b mo421M(C0182b.C0183a aVar) {
        return null;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo566h().mo467f(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        mo566h().mo454E();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0685f.m2715e(this.f482g, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo566h().mo472n(i);
    }

    /* renamed from: h */
    public C0130g mo566h() {
        if (this.f481f == null) {
            this.f481f = C0130g.m402m(this, this);
        }
        return this.f481f;
    }

    public void invalidateOptionsMenu() {
        mo566h().mo478y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo568j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: k */
    public boolean mo569k(int i) {
        return mo566h().mo460M(i);
    }

    /* renamed from: n */
    public void mo429n(C0182b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo566h().mo477x();
        super.onCreate(bundle);
        mo566h().mo453D(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo566h().mo459J();
    }

    /* renamed from: q */
    public void mo440q(C0182b bVar) {
    }

    public void setContentView(int i) {
        mo566h().mo461P(i);
    }

    public void setContentView(View view) {
        mo566h().mo462Q(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo566h().mo463R(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo566h().mo466U(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo566h().mo466U(charSequence);
    }
}
