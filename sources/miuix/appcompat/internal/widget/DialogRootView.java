package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class DialogRootView extends FrameLayout {

    /* renamed from: d */
    private boolean f8624d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2257b f8625e;

    /* renamed from: miuix.appcompat.internal.widget.DialogRootView$a */
    class C2256a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f8626d;

        /* renamed from: e */
        final /* synthetic */ int f8627e;

        /* renamed from: f */
        final /* synthetic */ int f8628f;

        /* renamed from: g */
        final /* synthetic */ int f8629g;

        /* renamed from: h */
        final /* synthetic */ int f8630h;

        /* renamed from: i */
        final /* synthetic */ int f8631i;

        C2256a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f8626d = i;
            this.f8627e = i2;
            this.f8628f = i3;
            this.f8629g = i4;
            this.f8630h = i5;
            this.f8631i = i6;
        }

        public void run() {
            Configuration configuration = DialogRootView.this.getResources().getConfiguration();
            if ((configuration.screenWidthDp != this.f8626d || configuration.screenHeightDp != this.f8627e) && DialogRootView.this.f8625e != null) {
                DialogRootView.this.f8625e.onConfigurationChanged(DialogRootView.this.getResources().getConfiguration(), this.f8628f, this.f8629g, this.f8630h, this.f8631i);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.widget.DialogRootView$b */
    public interface C2257b {
        void onConfigurationChanged(Configuration configuration, int i, int i2, int i3, int i4);
    }

    public DialogRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8624d = true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f8624d) {
            this.f8624d = false;
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            C2257b bVar = this.f8625e;
            if (bVar != null) {
                bVar.onConfigurationChanged(getResources().getConfiguration(), i, i2, i3, i4);
            }
            post(new C2256a(i5, i6, i, i2, i3, i4));
        }
    }

    public void setConfigurationChangedCallback(C2257b bVar) {
        this.f8625e = bVar;
    }
}
