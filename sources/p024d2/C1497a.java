package p024d2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import p018c2.C1352h;
import p018c2.C1354j;

/* renamed from: d2.a */
public class C1497a extends ArrayAdapter {

    /* renamed from: h */
    private static final int f6113h = C1352h.f4712d0;

    /* renamed from: d */
    protected CharSequence[] f6114d;

    /* renamed from: e */
    protected CharSequence[] f6115e;

    /* renamed from: f */
    protected Drawable[] f6116f;

    /* renamed from: g */
    private LayoutInflater f6117g;

    /* renamed from: d2.a$b */
    private static class C1499b {

        /* renamed from: a */
        ImageView f6118a;

        /* renamed from: b */
        TextView f6119b;

        /* renamed from: c */
        TextView f6120c;

        private C1499b() {
        }
    }

    protected C1497a(Context context, int i) {
        super(context, i);
        this.f6117g = LayoutInflater.from(context);
    }

    /* renamed from: b */
    private CharSequence m6511b(int i) {
        CharSequence[] charSequenceArr = this.f6114d;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    /* renamed from: d */
    private Drawable m6512d(int i) {
        Drawable[] drawableArr = this.f6116f;
        if (drawableArr == null || i >= drawableArr.length) {
            return null;
        }
        return drawableArr[i];
    }

    /* renamed from: e */
    private CharSequence m6513e(int i) {
        CharSequence[] charSequenceArr = this.f6115e;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    /* renamed from: a */
    public CharSequence[] mo5569a() {
        return this.f6114d;
    }

    /* renamed from: c */
    public Drawable[] mo5570c() {
        return this.f6116f;
    }

    /* renamed from: f */
    public void mo5571f(int[] iArr) {
        if (iArr == null) {
            mo5572g((Drawable[]) null);
            return;
        }
        Drawable[] drawableArr = new Drawable[iArr.length];
        Resources resources = getContext().getResources();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 > 0) {
                drawableArr[i] = resources.getDrawable(i2);
            } else {
                drawableArr[i] = null;
            }
        }
        mo5572g(drawableArr);
    }

    /* renamed from: g */
    public void mo5572g(Drawable[] drawableArr) {
        this.f6116f = drawableArr;
    }

    public int getCount() {
        CharSequence[] charSequenceArr = this.f6114d;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null || view.getTag(f6113h) == null) {
            view = this.f6117g.inflate(C1354j.f4756O, viewGroup, false);
            C1499b bVar = new C1499b();
            bVar.f6118a = (ImageView) view.findViewById(16908294);
            bVar.f6119b = (TextView) view.findViewById(16908310);
            bVar.f6120c = (TextView) view.findViewById(16908304);
            view.setTag(f6113h, bVar);
        }
        CharSequence b = m6511b(i);
        CharSequence e = m6513e(i);
        Drawable d = m6512d(i);
        Object tag = view.getTag(f6113h);
        if (tag != null) {
            C1499b bVar2 = (C1499b) tag;
            if (!TextUtils.isEmpty(b)) {
                bVar2.f6119b.setText(b);
                bVar2.f6119b.setVisibility(0);
            } else {
                bVar2.f6119b.setVisibility(8);
            }
            if (!TextUtils.isEmpty(e)) {
                bVar2.f6120c.setText(e);
                bVar2.f6120c.setVisibility(0);
            } else {
                bVar2.f6120c.setVisibility(8);
            }
            if (d != null) {
                bVar2.f6118a.setImageDrawable(d);
                bVar2.f6118a.setVisibility(0);
            } else {
                bVar2.f6118a.setVisibility(8);
            }
        }
        return view;
    }

    public Object getItem(int i) {
        CharSequence[] charSequenceArr = this.f6114d;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean hasStableIds() {
        return true;
    }
}
