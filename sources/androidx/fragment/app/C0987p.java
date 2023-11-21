package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0510a;
import androidx.core.util.C0623f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.p */
public abstract class C0987p<E> extends C0971l {

    /* renamed from: d */
    private final Activity f3358d;

    /* renamed from: e */
    private final Context f3359e;

    /* renamed from: f */
    private final Handler f3360f;

    /* renamed from: g */
    private final int f3361g;

    /* renamed from: h */
    final FragmentManager f3362h;

    C0987p(Activity activity, Context context, Handler handler, int i) {
        this.f3362h = new C0997x();
        this.f3358d = activity;
        this.f3359e = (Context) C0623f.m2496g(context, "context == null");
        this.f3360f = (Handler) C0623f.m2496g(handler, "handler == null");
        this.f3361g = i;
    }

    C0987p(C0964j jVar) {
        this(jVar, jVar, new Handler(), 0);
    }

    /* renamed from: d */
    public View mo3330d(int i) {
        return null;
    }

    /* renamed from: g */
    public boolean mo3331g() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Activity mo3691i() {
        return this.f3358d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Context mo3692j() {
        return this.f3359e;
    }

    /* renamed from: k */
    public Handler mo3693k() {
        return this.f3360f;
    }

    /* renamed from: m */
    public void mo3614m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: n */
    public abstract E mo3615n();

    /* renamed from: o */
    public LayoutInflater mo3616o() {
        return LayoutInflater.from(this.f3359e);
    }

    /* renamed from: p */
    public void mo3694p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0510a.m2126g(this.f3359e, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: q */
    public void mo3617q() {
    }
}
