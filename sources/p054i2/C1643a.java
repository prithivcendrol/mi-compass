package p054i2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import p018c2.C1352h;
import p018c2.C1354j;

/* renamed from: i2.a */
public class C1643a extends ArrayAdapter {

    /* renamed from: g */
    public static final int f6499g = C1352h.f4710c0;

    /* renamed from: d */
    private ArrayAdapter f6500d;

    /* renamed from: e */
    private C1645b f6501e;

    /* renamed from: f */
    private LayoutInflater f6502f;

    /* renamed from: i2.a$b */
    public interface C1645b {
        /* renamed from: a */
        boolean mo5823a(int i);
    }

    /* renamed from: i2.a$c */
    private static class C1646c {

        /* renamed from: a */
        FrameLayout f6503a;

        /* renamed from: b */
        RadioButton f6504b;

        private C1646c() {
        }
    }

    public C1643a(Context context, int i, ArrayAdapter arrayAdapter, C1645b bVar) {
        super(context, i, 16908308);
        this.f6502f = LayoutInflater.from(context);
        this.f6500d = arrayAdapter;
        this.f6501e = bVar;
    }

    public C1643a(Context context, ArrayAdapter arrayAdapter, C1645b bVar) {
        this(context, C1354j.f4755N, arrayAdapter, bVar);
    }

    public int getCount() {
        return this.f6500d.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null || view.getTag(f6499g) == null) {
            view = this.f6502f.inflate(C1354j.f4757P, viewGroup, false);
            C1646c cVar = new C1646c();
            cVar.f6503a = (FrameLayout) view.findViewById(C1352h.f4703Y);
            cVar.f6504b = (RadioButton) view.findViewById(16908289);
            view.setTag(f6499g, cVar);
        }
        Object tag = view.getTag(f6499g);
        if (tag != null) {
            C1646c cVar2 = (C1646c) tag;
            View dropDownView = this.f6500d.getDropDownView(i, cVar2.f6503a.getChildAt(0), viewGroup);
            cVar2.f6503a.removeAllViews();
            cVar2.f6503a.addView(dropDownView);
            C1645b bVar = this.f6501e;
            if (bVar != null && bVar.mo5823a(i)) {
                z = true;
            }
            cVar2.f6504b.setChecked(z);
            view.setActivated(z);
        }
        return view;
    }

    public Object getItem(int i) {
        return this.f6500d.getItem(i);
    }

    public long getItemId(int i) {
        return this.f6500d.getItemId(i);
    }

    public boolean hasStableIds() {
        return this.f6500d.hasStableIds();
    }
}
