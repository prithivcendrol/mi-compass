package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.preference.C1141m;
import androidx.preference.Preference;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.stretchablewidget.WidgetContainer;
import p068k4.C1796a;
import p068k4.C1797b;
import p123u3.C2850k;
import p123u3.C2852m;
import p123u3.C2853n;
import p123u3.C2856q;

public class StretchableWidgetPreference extends Preference {

    /* renamed from: S */
    private ImageView f9167S;

    /* renamed from: T */
    private RelativeLayout f9168T;

    /* renamed from: U */
    private WidgetContainer f9169U;

    /* renamed from: V */
    private TextView f9170V;

    /* renamed from: W */
    private TextView f9171W;

    /* renamed from: X */
    private View f9172X;

    /* renamed from: Y */
    private View f9173Y;

    /* renamed from: Z */
    private boolean f9174Z;

    /* renamed from: a0 */
    private String f9175a0;

    /* renamed from: b0 */
    private int f9176b0;

    /* renamed from: c0 */
    private C1797b f9177c0;

    /* renamed from: miuix.preference.StretchableWidgetPreference$a */
    class C2374a implements View.OnClickListener {
        C2374a() {
        }

        public void onClick(View view) {
            StretchableWidgetPreference.this.m10046K0();
        }
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10735r);
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9176b0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10801M1, i, 0);
        this.f9175a0 = obtainStyledAttributes.getString(C2856q.f10804N1);
        this.f9174Z = obtainStyledAttributes.getBoolean(C2856q.f10807O1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H0 */
    private void m10045H0(boolean z) {
        String str = "start";
        IStateStyle add = Folme.useValue(this.f9169U).setup(str).add("widgetHeight", this.f9176b0);
        ViewProperty viewProperty = ViewProperty.ALPHA;
        add.add((FloatProperty) viewProperty, 1.0f).setup("end").add("widgetHeight", 0).add((FloatProperty) viewProperty, 0.0f);
        IStateStyle useValue = Folme.useValue(this.f9169U);
        if (!z) {
            str = "end";
        }
        useValue.setTo((Object) str);
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m10046K0() {
        boolean z = !this.f9174Z;
        this.f9174Z = z;
        if (z) {
            Folme.useValue(this.f9169U).mo6815to("start", new AnimConfig().setFromSpeed(0.0f).setSpecial((FloatProperty) ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.f9167S.setBackgroundResource(C1796a.f7032b);
            this.f9172X.setVisibility(0);
            this.f9173Y.setVisibility(0);
        } else {
            Folme.useValue(this.f9169U).mo6815to("end", new AnimConfig().setFromSpeed(0.0f).setSpecial((FloatProperty) ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.f9167S.setBackgroundResource(C1796a.f7031a);
            this.f9172X.setVisibility(8);
            this.f9173Y.setVisibility(8);
        }
        C1797b bVar = this.f9177c0;
        if (bVar != null) {
            bVar.mo6230a(this.f9174Z);
        }
    }

    /* renamed from: I0 */
    public void mo9043I0(String str) {
        this.f9170V.setText(str);
    }

    /* renamed from: J0 */
    public void mo9044J0(boolean z) {
        int i;
        View view;
        ImageView imageView = this.f9167S;
        if (z) {
            imageView.setBackgroundResource(C2852m.f10743b);
            view = this.f9172X;
            i = 0;
        } else {
            imageView.setBackgroundResource(C2852m.f10742a);
            view = this.f9172X;
            i = 8;
        }
        view.setVisibility(i);
        this.f9173Y.setVisibility(i);
        m10045H0(z);
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        View view = mVar.f4049a;
        this.f9168T = (RelativeLayout) view.findViewById(C2853n.f10758o);
        WidgetContainer widgetContainer = (WidgetContainer) view.findViewById(16908312);
        this.f9169U = widgetContainer;
        widgetContainer.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f9176b0 = this.f9169U.getMeasuredHeight();
        this.f9171W = (TextView) view.findViewById(C2853n.f10756m);
        this.f9170V = (TextView) view.findViewById(C2853n.f10747d);
        ImageView imageView = (ImageView) view.findViewById(C2853n.f10754k);
        this.f9167S = imageView;
        imageView.setBackgroundResource(C2852m.f10742a);
        this.f9172X = view.findViewById(C2853n.f10745b);
        this.f9173Y = view.findViewById(C2853n.f10757n);
        mo9043I0(this.f9175a0);
        mo9044J0(this.f9174Z);
        this.f9168T.setOnClickListener(new C2374a());
    }
}
