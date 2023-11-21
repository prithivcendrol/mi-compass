package com.miui.compass;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0466e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import p147z2.C2972a;

public class CompassScreen extends C1429p {

    /* renamed from: A */
    private long f5167A = -1;

    /* renamed from: B */
    private float f5168B;

    /* renamed from: C */
    private float f5169C;

    /* renamed from: D */
    private int f5170D = 0;

    /* renamed from: i */
    private WeakReference<CompassScreenView> f5171i;

    /* renamed from: j */
    private Rotation3DLayout f5172j;

    /* renamed from: k */
    private CompassView f5173k;

    /* renamed from: l */
    private TextView f5174l;

    /* renamed from: m */
    private TextView f5175m;

    /* renamed from: n */
    private TextView f5176n;

    /* renamed from: o */
    private TextView f5177o;

    /* renamed from: p */
    private ImageView f5178p;

    /* renamed from: q */
    private ImageView f5179q;

    /* renamed from: r */
    private ConstraintLayout f5180r;

    /* renamed from: s */
    private ConstraintLayout f5181s;

    /* renamed from: t */
    private boolean f5182t = true;

    /* renamed from: u */
    private StringBuilder f5183u = new StringBuilder();

    /* renamed from: v */
    private StringBuilder f5184v = new StringBuilder();

    /* renamed from: w */
    private float f5185w;

    /* renamed from: x */
    private ImageView f5186x;

    /* renamed from: y */
    private ImageView f5187y;

    /* renamed from: z */
    private boolean f5188z = false;

    public CompassScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) getContext().getApplicationContext().getSystemService("layout_inflater")).inflate(2131558431, this, true);
        Rotation3DLayout rotation3DLayout = (Rotation3DLayout) findViewById(2131361966);
        this.f5172j = rotation3DLayout;
        this.f5173k = (CompassView) rotation3DLayout.findViewById(2131361972);
        this.f5180r = (ConstraintLayout) findViewById(2131361885);
        this.f5181s = (ConstraintLayout) findViewById(2131361886);
        this.f5174l = (TextView) findViewById(2131362369);
        this.f5175m = (TextView) findViewById(2131362370);
        this.f5176n = (TextView) findViewById(2131362102);
        this.f5177o = (TextView) findViewById(2131362103);
        this.f5178p = (ImageView) findViewById(2131362011);
        this.f5179q = (ImageView) findViewById(2131362012);
        this.f5186x = (ImageView) findViewById(2131361967);
        this.f5187y = (ImageView) findViewById(2131361968);
        mo5271l(context);
        this.f5172j.setOnClickListener(new C1422j(this));
        Typeface g = C1403c0.m6260g(getContext().getAssets(), "MitypeMono-DemiBold.otf");
        this.f5174l.setTypeface(g);
        this.f5175m.setTypeface(g);
        C1403c0.m6275v(this.f5176n);
        C1403c0.m6275v(this.f5177o);
        mo5270h();
    }

    /* renamed from: d */
    private void m6152d(TextView textView, String str, String str2, float f) {
        WeakReference<CompassScreenView> weakReference;
        if (!this.f5188z) {
            float abs = Math.abs(this.f5168B - f);
            float f2 = this.f5169C + abs;
            this.f5169C = f2;
            if (f2 > 10.0f || abs > 4.0f) {
                this.f5188z = true;
                this.f5169C = 0.0f;
            }
        }
        if (this.f5188z && Math.abs(this.f5168B - f) <= 4.0f) {
            this.f5170D++;
        }
        if (this.f5170D >= 15) {
            if (System.currentTimeMillis() - this.f5167A > 2000 && (weakReference = this.f5171i) != null && weakReference.get() != null && this.f5171i.get().getCurrentScreenIndex() == 0 && this.f5182t) {
                textView.announceForAccessibility(str + " " + str2 + "°");
                this.f5167A = System.currentTimeMillis();
            }
            this.f5188z = false;
            this.f5170D = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m6153g(View view) {
        int i = 1;
        if (this.f5173k.getMode() == 1) {
            i = 0;
        }
        this.f5173k.mo5284g(i, this.f5185w);
    }

    /* renamed from: i */
    private float m6154i(float f) {
        return (f + 720.0f) % 360.0f;
    }

    /* renamed from: j */
    private void m6155j(TextView textView, String str) {
        if (str == null || !str.equals(textView.getText().toString())) {
            textView.setText(str);
        }
    }

    /* renamed from: k */
    private void m6156k(TextView textView, String str, String str2, float f) {
        if (str == null || !str.equals(textView.getText().toString())) {
            textView.setText(str);
            if (((float) (Math.round(f) % 30)) == 0.0f) {
                C1424l.m6361a().mo5400d(textView);
            }
            ((View) textView.getParent()).setContentDescription(str2 + " " + str + "°");
        }
    }

    /* renamed from: m */
    private void m6157m(float f) {
        StringBuilder sb;
        int i;
        Context context = getContext();
        float i2 = m6154i(f * -1.0f);
        StringBuilder sb2 = this.f5183u;
        sb2.delete(0, sb2.length());
        if (i2 > 22.5f && i2 <= 67.5f) {
            sb = this.f5183u;
            i = 2131820686;
        } else if (i2 > 67.5f && i2 <= 112.5f) {
            sb = this.f5183u;
            i = 2131820684;
        } else if (i2 > 112.5f && i2 <= 157.5f) {
            sb = this.f5183u;
            i = 2131820689;
        } else if (i2 > 157.5f && i2 <= 202.5f) {
            sb = this.f5183u;
            i = 2131820688;
        } else if (i2 > 202.5f && i2 <= 247.5f) {
            sb = this.f5183u;
            i = 2131820690;
        } else if (i2 > 247.5f && i2 <= 292.5f) {
            sb = this.f5183u;
            i = 2131820691;
        } else if (i2 <= 292.5f || i2 > 337.5f) {
            sb = this.f5183u;
            i = 2131820685;
        } else {
            sb = this.f5183u;
            i = 2131820687;
        }
        sb.append(context.getString(i));
        if (i2 < 22.5f || i2 > 337.5f) {
            this.f5178p.setVisibility(4);
        } else if (i2 < 180.0f) {
            this.f5178p.setVisibility(0);
        } else {
            if (i2 > 180.0f) {
                this.f5178p.setVisibility(4);
                this.f5179q.setVisibility(0);
            }
            StringBuilder sb3 = this.f5184v;
            sb3.delete(0, sb3.length());
            this.f5184v.append(C1403c0.m6255b(getContext(), 2131820586, i2));
            m6152d(this.f5176n, this.f5183u.toString(), this.f5184v.toString(), i2);
            this.f5168B = i2;
            m6155j(this.f5176n, this.f5183u.toString());
            m6155j(this.f5177o, this.f5183u.toString());
            m6156k(this.f5174l, this.f5184v.toString(), this.f5183u.toString(), i2);
            m6156k(this.f5175m, this.f5184v.toString(), this.f5183u.toString(), i2);
        }
        this.f5179q.setVisibility(4);
        StringBuilder sb32 = this.f5184v;
        sb32.delete(0, sb32.length());
        this.f5184v.append(C1403c0.m6255b(getContext(), 2131820586, i2));
        m6152d(this.f5176n, this.f5183u.toString(), this.f5184v.toString(), i2);
        this.f5168B = i2;
        m6155j(this.f5176n, this.f5183u.toString());
        m6155j(this.f5177o, this.f5183u.toString());
        m6156k(this.f5174l, this.f5184v.toString(), this.f5183u.toString(), i2);
        m6156k(this.f5175m, this.f5184v.toString(), this.f5183u.toString(), i2);
    }

    /* renamed from: e */
    public void mo5264e(CompassScreenView compassScreenView) {
        this.f5171i = new WeakReference<>(compassScreenView);
    }

    /* renamed from: f */
    public void mo5265f(boolean z) {
        ConstraintLayout constraintLayout;
        int i;
        this.f5182t = z;
        if (z) {
            constraintLayout = this.f5180r;
            i = 1;
        } else {
            constraintLayout = this.f5180r;
            i = 2;
        }
        constraintLayout.setImportantForAccessibility(i);
        this.f5181s.setImportantForAccessibility(i);
    }

    /* access modifiers changed from: protected */
    public int getLyingViewId() {
        return 2131361970;
    }

    /* access modifiers changed from: protected */
    public int getPortraitViewId() {
        return 2131361971;
    }

    /* access modifiers changed from: protected */
    public float getRotationCenterY() {
        return ((float) getHeight()) / 2.0f;
    }

    public Bitmap getViewShot() {
        if (getWidth() == 0 || getHeight() == 0) {
            Log.d("Compass:CompassScreen", "width:" + getWidth() + ",height:" + getHeight());
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        ((ViewGroup) findViewById(2131361970)).draw(new Canvas(createBitmap));
        Bitmap g = C2972a.m12268g(createBitmap, createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        if (g != createBitmap) {
            createBitmap.recycle();
        }
        return g;
    }

    /* renamed from: h */
    public void mo5270h() {
        if (C1403c0.m6264k() || C1403c0.m6265l()) {
            C0466e eVar = new C0466e();
            eVar.mo2502i(this.f5180r);
            eVar.mo2500g(this.f5176n.getId(), 7);
            eVar.mo2500g(this.f5174l.getId(), 6);
            eVar.mo2500g(this.f5174l.getId(), 7);
            eVar.mo2500g(this.f5186x.getId(), 6);
            eVar.mo2500g(this.f5186x.getId(), 7);
            eVar.mo2504k(this.f5176n.getId(), 7, this.f5186x.getId(), 6);
            eVar.mo2504k(this.f5186x.getId(), 6, this.f5176n.getId(), 7);
            eVar.mo2504k(this.f5186x.getId(), 7, this.f5174l.getId(), 6);
            eVar.mo2504k(this.f5174l.getId(), 6, this.f5186x.getId(), 7);
            eVar.mo2504k(this.f5174l.getId(), 7, 0, 7);
            eVar.mo2496c(this.f5180r);
            C0466e eVar2 = new C0466e();
            eVar2.mo2502i(this.f5181s);
            eVar2.mo2500g(this.f5177o.getId(), 7);
            eVar2.mo2500g(this.f5175m.getId(), 6);
            eVar2.mo2500g(this.f5175m.getId(), 7);
            eVar2.mo2500g(this.f5187y.getId(), 6);
            eVar2.mo2500g(this.f5187y.getId(), 7);
            eVar2.mo2504k(this.f5177o.getId(), 7, this.f5187y.getId(), 6);
            eVar2.mo2504k(this.f5187y.getId(), 6, this.f5177o.getId(), 7);
            eVar2.mo2504k(this.f5187y.getId(), 7, this.f5175m.getId(), 6);
            eVar2.mo2504k(this.f5175m.getId(), 6, this.f5187y.getId(), 7);
            eVar2.mo2504k(this.f5175m.getId(), 7, 0, 7);
            eVar2.mo2496c(this.f5181s);
        }
    }

    /* renamed from: l */
    public void mo5271l(Context context) {
        ImageView imageView;
        int i;
        Resources resources;
        this.f5173k.mo5288i(context);
        if (C1403c0.m6266m()) {
            this.f5178p.setBackground(getResources().getDrawable(2131230853));
            imageView = this.f5179q;
            resources = getResources();
            i = 2131230857;
        } else {
            this.f5178p.setBackground(getResources().getDrawable(2131230852));
            imageView = this.f5179q;
            resources = getResources();
            i = 2131230856;
        }
        imageView.setBackground(resources.getDrawable(i));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165960);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165961);
        this.f5176n.setMaxWidth(dimensionPixelSize);
        this.f5177o.setMaxWidth(dimensionPixelSize2);
    }

    public void setCompassDirection(float f) {
        this.f5173k.setTargetDirection(f);
        this.f5185w = f;
        m6157m(f);
    }
}
