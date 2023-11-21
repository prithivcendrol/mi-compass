package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1041h0;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1049n;
import p083n1.C2422g;

/* renamed from: androidx.activity.f */
public class C0090f extends Dialog implements C1048m, C0095k {

    /* renamed from: d */
    private C1049n f225d;

    /* renamed from: e */
    private final OnBackPressedDispatcher f226e = new OnBackPressedDispatcher(new C0089e(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0090f(Context context, int i) {
        super(context, i);
        C2422g.m10285e(context, "context");
    }

    /* renamed from: b */
    private final C1049n m255b() {
        C1049n nVar = this.f225d;
        if (nVar != null) {
            return nVar;
        }
        C1049n nVar2 = new C1049n(this);
        this.f225d = nVar2;
        return nVar2;
    }

    /* renamed from: d */
    private final void m256d() {
        Window window = getWindow();
        C2422g.m10282b(window);
        C1041h0.m4232a(window.getDecorView(), this);
        Window window2 = getWindow();
        C2422g.m10282b(window2);
        View decorView = window2.getDecorView();
        C2422g.m10284d(decorView, "window!!.decorView");
        C0097m.m268a(decorView, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m257g(C0090f fVar) {
        C2422g.m10285e(fVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C2422g.m10285e(view, "view");
        m256d();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: c */
    public final C1035g mo252c() {
        return m255b();
    }

    /* renamed from: e */
    public final OnBackPressedDispatcher mo253e() {
        return this.f226e;
    }

    public void onBackPressed() {
        this.f226e.mo294f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f226e.mo295g(getOnBackInvokedDispatcher());
        }
        m255b().mo3795h(C1035g.C1037b.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m255b().mo3795h(C1035g.C1037b.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m255b().mo3795h(C1035g.C1037b.ON_DESTROY);
        this.f225d = null;
        super.onStop();
    }

    public void setContentView(int i) {
        m256d();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C2422g.m10285e(view, "view");
        m256d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C2422g.m10285e(view, "view");
        m256d();
        super.setContentView(view, layoutParams);
    }
}
