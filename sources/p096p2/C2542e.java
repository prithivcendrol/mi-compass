package p096p2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import miuix.appcompat.internal.view.menu.C2242c;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1354j;
import p055i3.C1648b;
import p055i3.C1649c;
import p061j3.C1750f;

/* renamed from: p2.e */
public class C2542e extends C1750f implements C2540c {

    /* renamed from: B */
    private LinearLayout f10017B;

    /* renamed from: C */
    private View f10018C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C2538a f10019D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public View f10020E;

    /* renamed from: F */
    private ViewGroup f10021F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public float f10022G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public float f10023H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C2242c f10024I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public MenuItem f10025J;

    /* renamed from: K */
    private int f10026K;

    /* renamed from: p2.e$a */
    class C2543a implements AdapterView.OnItemClickListener {

        /* renamed from: p2.e$a$a */
        class C2544a implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            final /* synthetic */ SubMenu f10028d;

            C2544a(SubMenu subMenu) {
                this.f10028d = subMenu;
            }

            public void onDismiss() {
                C2542e.this.setOnDismissListener((PopupWindow.OnDismissListener) null);
                C2542e.this.mo9738m(this.f10028d);
                C2542e eVar = C2542e.this;
                eVar.m10803d0(eVar.f10020E, C2542e.this.f10022G, C2542e.this.f10023H);
            }
        }

        C2543a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MenuItem c = C2542e.this.f10019D.getItem(i);
            C2542e.this.f10024I.mo8346I(c, 0);
            if (c.hasSubMenu()) {
                C2542e.this.setOnDismissListener(new C2544a(c.getSubMenu()));
            }
            C2542e.this.dismiss();
        }
    }

    /* renamed from: p2.e$b */
    class C2545b implements View.OnClickListener {
        C2545b() {
        }

        public void onClick(View view) {
            C2542e.this.f10024I.mo8346I(C2542e.this.f10025J, 0);
            C2542e.this.dismiss();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    public C2542e(Context context, C2242c cVar, PopupWindow.OnDismissListener onDismissListener) {
        super(context);
        this.f10024I = cVar;
        C2538a aVar = new C2538a(context, this.f10024I);
        this.f10019D = aVar;
        this.f10025J = aVar.mo9719e();
        m10806g0(context);
        mo6024i(this.f10019D);
        mo6016R(new C2543a());
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        this.f10026K = context.getResources().getDimensionPixelSize(C1350f.f4608D);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m10803d0(View view, float f, float f2) {
        setWidth(mo6004A());
        setHeight(-2);
        this.f10018C.setVisibility(8);
        m10807h0(view, f, f2);
        this.f6741k.forceLayout();
    }

    /* renamed from: e0 */
    private int m10804e0() {
        ListView listView = (ListView) this.f6741k.findViewById(16908298);
        if (listView != null) {
            ListAdapter adapter = listView.getAdapter();
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                i += view.getMeasuredHeight();
            }
            return i;
        }
        this.f6741k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f6741k.getMeasuredHeight() + 0;
    }

    /* renamed from: f0 */
    private int m10805f0() {
        if (this.f10018C.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = this.f10018C.getLayoutParams();
        int i = (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) this.f10018C.getLayoutParams()).topMargin + 0;
        this.f10018C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f10018C.getMeasuredHeight() + i;
    }

    /* renamed from: g0 */
    private void m10806g0(Context context) {
        if (this.f10025J == null) {
            this.f10018C.setVisibility(8);
            return;
        }
        ((TextView) this.f10018C.findViewById(16908308)).setText(this.f10025J.getTitle());
        this.f10018C.setOnClickListener(new C2545b());
        C1648b.m6952a(this.f10018C);
    }

    /* renamed from: h0 */
    private void m10807h0(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0] + ((int) f);
        boolean z = true;
        int i2 = iArr[1] + ((int) f2);
        View rootView = view.getRootView();
        boolean z2 = i <= getWidth();
        if (i < rootView.getWidth() - getWidth()) {
            z = false;
        }
        int e0 = m10804e0();
        float e02 = (float) (i2 - (m10804e0() / 2));
        if (e02 < ((float) rootView.getHeight()) * 0.1f) {
            e02 = ((float) rootView.getHeight()) * 0.1f;
        }
        float f0 = (float) (e0 + m10805f0());
        if (e02 + f0 > ((float) rootView.getHeight()) * 0.9f) {
            e02 = (((float) rootView.getHeight()) * 0.9f) - f0;
        }
        if (e02 < ((float) rootView.getHeight()) * 0.1f) {
            e02 = ((float) rootView.getHeight()) * 0.1f;
            setHeight((int) (((float) rootView.getHeight()) * 0.79999995f));
        }
        if (z2) {
            i = this.f10026K;
        } else if (z) {
            i = (rootView.getWidth() - this.f10026K) - getWidth();
        }
        showAtLocation(view, 0, i, (int) e02);
        C1750f.m7293y(this.f6740j.getRootView());
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6010L(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10017B = linearLayout;
        linearLayout.setOrientation(1);
        this.f10018C = LayoutInflater.from(context).inflate(C1354j.f4744C, (ViewGroup) null, false);
        Drawable h = C1649c.m6963h(context, C1347c.f4534B);
        if (h != null) {
            h.getPadding(this.f6738h);
            this.f6740j.setBackground(h);
            this.f10018C.setBackground(h.getConstantState().newDrawable());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(C1350f.f4607C), 0, 0);
        this.f10017B.addView(this.f6740j, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f10017B.addView(this.f10018C, layoutParams);
        setBackgroundDrawable((Drawable) null);
        super.mo6018T(this.f10017B);
    }

    /* renamed from: j */
    public void mo9730j(View view, ViewGroup viewGroup, float f, float f2) {
        if (view == null && (view = this.f10020E) == null) {
            view = null;
        }
        if (viewGroup == null && (viewGroup = this.f10021F) == null) {
            viewGroup = null;
        }
        mo9731k(view, viewGroup, f, f2);
    }

    /* renamed from: k */
    public void mo9731k(View view, ViewGroup viewGroup, float f, float f2) {
        this.f10020E = view;
        this.f10021F = viewGroup;
        this.f10022G = f;
        this.f10023H = f2;
        if (mo6011M(view, viewGroup)) {
            this.f10018C.setElevation((float) this.f6752v);
            mo6017S(this.f10018C);
            m10807h0(view, f, f2);
        }
    }

    /* renamed from: m */
    public void mo9738m(Menu menu) {
        this.f10019D.mo6036d(menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo6029z() {
        return this.f6748r;
    }
}
