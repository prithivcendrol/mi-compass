package p124v;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: v.c */
public abstract class C2863c extends C2858a {

    /* renamed from: l */
    private int f10940l;

    /* renamed from: m */
    private int f10941m;

    /* renamed from: n */
    private LayoutInflater f10942n;

    @Deprecated
    public C2863c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f10941m = i;
        this.f10940l = i;
        this.f10942n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: f */
    public View mo10132f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10942n.inflate(this.f10941m, viewGroup, false);
    }

    /* renamed from: g */
    public View mo1749g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10942n.inflate(this.f10940l, viewGroup, false);
    }
}
