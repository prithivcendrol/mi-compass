package miuix.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C0458a;
import androidx.constraintlayout.widget.ConstraintLayout;
import p018c2.C1352h;
import p030e2.C1530a;

public class DialogParentPanel extends ConstraintLayout {

    /* renamed from: B */
    private C1530a f8754B;

    /* renamed from: C */
    private boolean f8755C;

    /* renamed from: D */
    private C0458a f8756D;

    /* renamed from: E */
    private View f8757E;

    /* renamed from: F */
    private View f8758F;

    /* renamed from: G */
    private View f8759G;

    /* renamed from: H */
    private View f8760H;

    /* renamed from: I */
    private LinearLayout f8761I;

    /* renamed from: J */
    private final int[] f8762J = new int[0];

    /* renamed from: K */
    private int[] f8763K;

    public DialogParentPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1530a aVar = new C1530a(context, attributeSet);
        this.f8754B = aVar;
        aVar.mo5642t(true);
    }

    /* renamed from: B */
    private void m9713B(ConstraintLayout.C0455b bVar, int i) {
        bVar.f1787t = i;
        bVar.f1791v = i;
    }

    /* renamed from: C */
    private void m9714C(ConstraintLayout.C0455b bVar, int i) {
        bVar.f1765i = i;
        bVar.f1771l = i;
    }

    /* renamed from: D */
    private ConstraintLayout.C0455b m9715D(View view) {
        if (view != null) {
            return (ConstraintLayout.C0455b) view.getLayoutParams();
        }
        Log.d("DialogParentPanel", "Child View is null!");
        return new ConstraintLayout.C0455b(0, 0);
    }

    /* renamed from: E */
    private void m9716E() {
        this.f8760H = findViewById(C1352h.f4735v);
        int i = C1352h.f4718g0;
        this.f8757E = findViewById(i);
        int i2 = C1352h.f4738y;
        this.f8758F = findViewById(i2);
        int i3 = C1352h.f4681C;
        this.f8759G = findViewById(i3);
        this.f8761I = (LinearLayout) findViewById(C1352h.f4734u);
        this.f8763K = new int[]{i, i2, i3};
    }

    /* renamed from: A */
    public void mo8701A() {
        ConstraintLayout.C0455b D = m9715D(this.f8760H);
        ConstraintLayout.C0455b D2 = m9715D(this.f8757E);
        ConstraintLayout.C0455b D3 = m9715D(this.f8758F);
        ConstraintLayout.C0455b D4 = m9715D(this.f8759G);
        if (mo8702F()) {
            this.f8756D.setType(6);
            this.f8756D.setReferencedIds(this.f8763K);
            this.f8761I.setOrientation(1);
            D2.f1744V = 0.5f;
            D2.f1787t = 0;
            D2.f1765i = 0;
            D2.f1791v = -1;
            D3.f1744V = 0.5f;
            D3.f1787t = 0;
            D3.f1791v = -1;
            D3.f1767j = C1352h.f4718g0;
            D3.height = 0;
            D3.f1752b0 = false;
            D3.f1739Q = 0;
            D4.f1744V = 0.5f;
            D4.f1787t = 0;
            D4.f1767j = C1352h.f4738y;
            D4.f1791v = -1;
            D4.f1769k = -1;
            D4.f1771l = 0;
            D4.height = 0;
            D4.f1752b0 = false;
            D4.f1739Q = 0;
            D.f1744V = 0.5f;
            D.f1787t = -1;
            D.f1767j = -1;
            D.f1791v = 0;
            m9714C(D, 0);
        } else {
            this.f8756D.setReferencedIds(this.f8762J);
            this.f8761I.setOrientation(0);
            D2.f1744V = 1.0f;
            m9713B(D2, 0);
            D2.f1765i = 0;
            D3.f1744V = 1.0f;
            D3.f1752b0 = true;
            D3.height = -2;
            m9713B(D3, 0);
            D4.f1744V = 1.0f;
            D4.f1752b0 = true;
            D4.height = -2;
            m9713B(D4, 0);
            D4.f1769k = C1352h.f4735v;
            D.f1744V = 1.0f;
            m9713B(D, 0);
            D.f1785s = -1;
            D.f1765i = -1;
            D.f1767j = C1352h.f4681C;
            D.f1771l = 0;
        }
        this.f8760H.setLayoutParams(D);
        this.f8757E.setLayoutParams(D2);
        this.f8758F.setLayoutParams(D3);
        this.f8759G.setLayoutParams(D4);
    }

    /* renamed from: F */
    public boolean mo8702F() {
        return this.f8755C;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8754B.mo5640p();
        mo8701A();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m9716E();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int f = this.f8754B.mo5637f(i2);
        if (mo8702F()) {
            f = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(f), 1073741824);
        }
        super.onMeasure(this.f8754B.mo5639n(i), f);
    }

    public void setShouldAdjustLayout(boolean z) {
        this.f8755C = z;
    }
}
