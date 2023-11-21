package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p021d.C1447a;

/* renamed from: androidx.appcompat.app.b */
public class C0122b extends C0160k {

    /* renamed from: h */
    final AlertController f359h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0123a {

        /* renamed from: a */
        private final AlertController.C0108b f360a;

        /* renamed from: b */
        private final int f361b;

        public C0123a(Context context) {
            this(context, C0122b.m352m(context, 0));
        }

        public C0123a(Context context, int i) {
            this.f360a = new AlertController.C0108b(new ContextThemeWrapper(context, C0122b.m352m(context, i)));
            this.f361b = i;
        }

        /* renamed from: a */
        public C0122b mo404a() {
            C0122b bVar = new C0122b(this.f360a.f319a, this.f361b);
            this.f360a.mo353a(bVar.f359h);
            bVar.setCancelable(this.f360a.f336r);
            if (this.f360a.f336r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f360a.f337s);
            bVar.setOnDismissListener(this.f360a.f338t);
            DialogInterface.OnKeyListener onKeyListener = this.f360a.f339u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: b */
        public Context mo405b() {
            return this.f360a.f319a;
        }

        /* renamed from: c */
        public C0123a mo406c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f341w = listAdapter;
            bVar.f342x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0123a mo407d(View view) {
            this.f360a.f325g = view;
            return this;
        }

        /* renamed from: e */
        public C0123a mo408e(Drawable drawable) {
            this.f360a.f322d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0123a mo409f(CharSequence charSequence) {
            this.f360a.f326h = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0123a mo410g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f340v = charSequenceArr;
            bVar.f312J = onMultiChoiceClickListener;
            bVar.f308F = zArr;
            bVar.f309G = true;
            return this;
        }

        /* renamed from: h */
        public C0123a mo411h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f330l = charSequence;
            bVar.f332n = onClickListener;
            return this;
        }

        /* renamed from: i */
        public C0123a mo412i(DialogInterface.OnKeyListener onKeyListener) {
            this.f360a.f339u = onKeyListener;
            return this;
        }

        /* renamed from: j */
        public C0123a mo413j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f327i = charSequence;
            bVar.f329k = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C0123a mo414k(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f341w = listAdapter;
            bVar.f342x = onClickListener;
            bVar.f311I = i;
            bVar.f310H = true;
            return this;
        }

        /* renamed from: l */
        public C0123a mo415l(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f340v = charSequenceArr;
            bVar.f342x = onClickListener;
            bVar.f311I = i;
            bVar.f310H = true;
            return this;
        }

        /* renamed from: m */
        public C0123a mo416m(CharSequence charSequence) {
            this.f360a.f324f = charSequence;
            return this;
        }

        /* renamed from: n */
        public C0123a mo417n(View view) {
            AlertController.C0108b bVar = this.f360a;
            bVar.f344z = view;
            bVar.f343y = 0;
            bVar.f307E = false;
            return this;
        }
    }

    protected C0122b(Context context, int i) {
        super(context, m352m(context, i));
    }

    /* renamed from: m */
    static int m352m(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1447a.f5689o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: l */
    public ListView mo400l() {
        return this.f359h.mo338d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f359h.mo339e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f359h.mo340f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f359h.mo341g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f359h.mo347p(charSequence);
    }
}
