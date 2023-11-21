package p123u3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0122b;
import miuix.appcompat.app.C2112p;

/* renamed from: u3.a */
class C2831a extends C0122b.C0123a {

    /* renamed from: c */
    private C2112p.C2114b f10625c;

    public C2831a(Context context, int i, C2112p.C2114b bVar) {
        super(context, i);
        this.f10625c = bVar;
    }

    public C2831a(Context context, C2112p.C2114b bVar) {
        this(context, 0, bVar);
    }

    /* renamed from: c */
    public C0122b.C0123a mo406c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.f10625c.mo7537b(listAdapter, onClickListener);
        return this;
    }

    /* renamed from: d */
    public C0122b.C0123a mo407d(View view) {
        this.f10625c.mo7539d(view);
        return this;
    }

    /* renamed from: e */
    public C0122b.C0123a mo408e(Drawable drawable) {
        this.f10625c.mo7540e(drawable);
        return this;
    }

    /* renamed from: f */
    public C0122b.C0123a mo409f(CharSequence charSequence) {
        this.f10625c.mo7542g(charSequence);
        return this;
    }

    /* renamed from: g */
    public C0122b.C0123a mo410g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f10625c.mo7543h(charSequenceArr, zArr, onMultiChoiceClickListener);
        return this;
    }

    /* renamed from: h */
    public C0122b.C0123a mo411h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f10625c.mo7545j(charSequence, onClickListener);
        return this;
    }

    /* renamed from: i */
    public C0122b.C0123a mo412i(DialogInterface.OnKeyListener onKeyListener) {
        this.f10625c.mo7547l(onKeyListener);
        return this;
    }

    /* renamed from: j */
    public C0122b.C0123a mo413j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f10625c.mo7549n(charSequence, onClickListener);
        return this;
    }

    /* renamed from: k */
    public C0122b.C0123a mo414k(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.f10625c.mo7550o(listAdapter, i, onClickListener);
        return this;
    }

    /* renamed from: l */
    public C0122b.C0123a mo415l(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.f10625c.mo7551p(charSequenceArr, i, onClickListener);
        return this;
    }

    /* renamed from: m */
    public C0122b.C0123a mo416m(CharSequence charSequence) {
        this.f10625c.mo7553r(charSequence);
        return this;
    }

    /* renamed from: n */
    public C0122b.C0123a mo417n(View view) {
        this.f10625c.mo7554s(view);
        return this;
    }
}
