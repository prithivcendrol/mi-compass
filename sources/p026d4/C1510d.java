package p026d4;

import android.view.View;

/* renamed from: d4.d */
public class C1510d {

    /* renamed from: a */
    private int f6151a;

    /* renamed from: b */
    private int f6152b;

    /* renamed from: c */
    private View f6153c;

    /* renamed from: d */
    private int f6154d;

    public C1510d(int i) {
        this.f6151a = i;
    }

    public C1510d(int i, int i2) {
        this.f6151a = i;
        this.f6152b = i2;
    }

    /* renamed from: a */
    public int mo5612a() {
        return this.f6154d;
    }

    /* renamed from: b */
    public View mo5613b() {
        return this.f6153c;
    }

    /* renamed from: c */
    public int mo5614c() {
        return this.f6151a;
    }

    /* renamed from: d */
    public void mo5615d(C1511e eVar) {
        int i = eVar.f6157c & 7;
        View view = this.f6153c;
        if (view != null) {
            view.setVisibility(this.f6152b < i ? 0 : 8);
        }
    }

    /* renamed from: e */
    public void mo5616e(int i) {
        this.f6154d = i;
    }

    /* renamed from: f */
    public void mo5617f(View view) {
        this.f6153c = view;
    }
}
