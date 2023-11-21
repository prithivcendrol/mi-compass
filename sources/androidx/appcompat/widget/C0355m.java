package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p021d.C1447a;

/* renamed from: androidx.appcompat.widget.m */
public class C0355m extends ImageButton {

    /* renamed from: d */
    private final C0318e f1364d;

    /* renamed from: e */
    private final C0358n f1365e;

    /* renamed from: f */
    private boolean f1366f;

    public C0355m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5663C);
    }

    public C0355m(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        this.f1366f = false;
        C0298b1.m1339a(this, getContext());
        C0318e eVar = new C0318e(this);
        this.f1364d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0358n nVar = new C0358n(this);
        this.f1365e = nVar;
        nVar.mo2015g(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            nVar.mo2011c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            return nVar.mo2012d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            return nVar.mo2013e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1365e.mo2014f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            nVar.mo2011c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0358n nVar = this.f1365e;
        if (!(nVar == null || drawable == null || this.f1366f)) {
            nVar.mo2016h(drawable);
        }
        super.setImageDrawable(drawable);
        C0358n nVar2 = this.f1365e;
        if (nVar2 != null) {
            nVar2.mo2011c();
            if (!this.f1366f) {
                this.f1365e.mo2010b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1366f = true;
    }

    public void setImageResource(int i) {
        this.f1365e.mo2017i(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            nVar.mo2011c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f1364d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            nVar.mo2018j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0358n nVar = this.f1365e;
        if (nVar != null) {
            nVar.mo2019k(mode);
        }
    }
}
