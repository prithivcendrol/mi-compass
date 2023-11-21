package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0182b;
import androidx.fragment.app.C0949f0;
import p021d.C1456j;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0116a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0117a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f358a;

        public C0117a(int i) {
            this(-2, -1, i);
        }

        public C0117a(int i, int i2) {
            super(i, i2);
            this.f358a = 8388627;
        }

        public C0117a(int i, int i2, int i3) {
            super(i, i2);
            this.f358a = i3;
        }

        public C0117a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f358a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f6067t);
            this.f358a = obtainStyledAttributes.getInt(C1456j.f6072u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0117a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f358a = 0;
        }

        public C0117a(C0117a aVar) {
            super(aVar);
            this.f358a = 0;
            this.f358a = aVar.f358a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0118b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public interface C0119c {
        boolean onNavigationItemSelected(int i, long j);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$d */
    public static abstract class C0120d {
        /* renamed from: a */
        public abstract CharSequence mo389a();

        /* renamed from: b */
        public abstract View mo390b();

        /* renamed from: c */
        public abstract Drawable mo391c();

        /* renamed from: d */
        public abstract int mo392d();

        /* renamed from: e */
        public abstract CharSequence mo393e();

        /* renamed from: f */
        public abstract void mo394f();

        /* renamed from: g */
        public abstract C0120d mo395g(C0121e eVar);

        /* renamed from: h */
        public abstract C0120d mo396h(int i);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$e */
    public interface C0121e {
        /* renamed from: A */
        void mo397A(C0120d dVar, C0949f0 f0Var);

        /* renamed from: o */
        void mo398o(C0120d dVar, C0949f0 f0Var);

        /* renamed from: y */
        void mo399y(C0120d dVar, C0949f0 f0Var);
    }

    /* renamed from: A */
    public abstract void mo363A(boolean z);

    /* renamed from: B */
    public void mo364B(CharSequence charSequence) {
    }

    /* renamed from: C */
    public abstract void mo365C();

    /* renamed from: D */
    public C0182b mo366D(C0182b.C0183a aVar) {
        return null;
    }

    @Deprecated
    /* renamed from: g */
    public abstract void mo367g(C0120d dVar);

    /* renamed from: h */
    public boolean mo368h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo369i() {
        return false;
    }

    /* renamed from: j */
    public void mo370j(boolean z) {
    }

    /* renamed from: k */
    public abstract int mo371k();

    /* renamed from: l */
    public abstract Context mo372l();

    /* renamed from: m */
    public boolean mo373m() {
        return false;
    }

    /* renamed from: n */
    public abstract boolean mo374n();

    @Deprecated
    /* renamed from: o */
    public abstract C0120d mo375o();

    /* renamed from: p */
    public abstract void mo376p(Configuration configuration);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo377q() {
    }

    /* renamed from: r */
    public boolean mo378r(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: s */
    public boolean mo379s(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: t */
    public boolean mo380t() {
        return false;
    }

    /* renamed from: u */
    public abstract void mo381u(Drawable drawable);

    /* renamed from: v */
    public void mo382v(boolean z) {
    }

    /* renamed from: w */
    public abstract void mo383w(boolean z);

    /* renamed from: x */
    public abstract void mo384x(boolean z);

    @Deprecated
    /* renamed from: y */
    public abstract void mo385y(int i);

    @Deprecated
    /* renamed from: z */
    public abstract void mo386z(int i);
}
