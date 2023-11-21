package miuix.androidbasewidget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p055i3.C1656j;

/* renamed from: miuix.androidbasewidget.widget.c */
public class C1986c extends C1983b {

    /* renamed from: y */
    private static final Class<?>[] f7475y = {Context.class, AttributeSet.class};

    /* renamed from: q */
    private C1987a f7476q;

    /* renamed from: r */
    private String f7477r;

    /* renamed from: s */
    private int f7478s;

    /* renamed from: t */
    private int f7479t;

    /* renamed from: u */
    private Drawable[] f7480u;

    /* renamed from: v */
    private boolean f7481v;

    /* renamed from: w */
    private int f7482w;

    /* renamed from: x */
    private StaticLayout f7483x;

    /* renamed from: miuix.androidbasewidget.widget.c$a */
    public static abstract class C1987a {
        public C1987a(Context context, AttributeSet attributeSet) {
        }

        /* access modifiers changed from: protected */
        public abstract Drawable[] getWidgetDrawables();

        /* access modifiers changed from: protected */
        public void onAttached(C1986c cVar) {
        }

        /* access modifiers changed from: protected */
        public void onDetached() {
        }

        /* access modifiers changed from: protected */
        public abstract void onWidgetClick(int i);
    }

    private int getLabelLength() {
        int i = this.f7479t;
        return i + (i == 0 ? 0 : this.f7482w);
    }

    private int getWidgetLength() {
        Drawable[] drawableArr = this.f7480u;
        if (drawableArr == null) {
            return 0;
        }
        int i = 0;
        for (Drawable intrinsicWidth : drawableArr) {
            i = i + intrinsicWidth.getIntrinsicWidth() + this.f7482w;
        }
        return i;
    }

    /* renamed from: j */
    private void m8089j() {
        String str = this.f7477r;
        this.f7483x = StaticLayout.Builder.obtain(str, 0, str.length(), getPaint(), this.f7479t).build();
    }

    /* renamed from: k */
    private boolean m8090k(MotionEvent motionEvent) {
        if (this.f7476q != null) {
            return m8093n(motionEvent);
        }
        return false;
    }

    /* renamed from: l */
    private void m8091l(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Drawable drawable;
        int i4;
        if (this.f7480u != null) {
            int width = getWidth();
            int height = getHeight();
            int scrollX = getScrollX();
            int paddingEnd = getPaddingEnd();
            Drawable drawable2 = getCompoundDrawablesRelative()[2];
            int i5 = 0;
            int intrinsicWidth = drawable2 == null ? 0 : drawable2.getIntrinsicWidth() + this.f7482w;
            int i6 = height / 2;
            int i7 = 0;
            while (true) {
                Drawable[] drawableArr = this.f7480u;
                if (i5 < drawableArr.length) {
                    int intrinsicWidth2 = drawableArr[i5].getIntrinsicWidth();
                    int intrinsicHeight = this.f7480u[i5].getIntrinsicHeight();
                    if (C1656j.m6983b(this)) {
                        drawable = this.f7480u[i5];
                        int i8 = scrollX + paddingEnd + intrinsicWidth;
                        i2 = i8 + i7;
                        i4 = intrinsicHeight / 2;
                        i = i6 - i4;
                        i3 = i8 + intrinsicWidth2 + i7;
                    } else {
                        drawable = this.f7480u[i5];
                        int i9 = ((scrollX + width) - paddingEnd) - intrinsicWidth;
                        i2 = (i9 - intrinsicWidth2) - i7;
                        i4 = intrinsicHeight / 2;
                        i = i6 - i4;
                        i3 = i9 - i7;
                    }
                    drawable.setBounds(i2, i, i3, i4 + i6);
                    i7 = this.f7482w + intrinsicWidth2;
                    this.f7480u[i5].draw(canvas);
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private void m8092m(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f7477r) && this.f7483x != null) {
            int color = getPaint().getColor();
            getPaint().setColor(getCurrentTextColor());
            int paddingStart = getPaddingStart();
            int i = 0;
            Drawable drawable = getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                i = this.f7482w + drawable.getIntrinsicWidth();
            }
            float max = Math.max(0.0f, ((float) (getMeasuredHeight() - this.f7483x.getHeight())) / 2.0f);
            canvas.save();
            canvas.translate(C1656j.m6983b(this) ? (float) ((((getScrollX() + getWidth()) - i) - this.f7479t) - paddingStart) : (float) (paddingStart + getScrollX() + i), max);
            this.f7483x.draw(canvas);
            canvas.restore();
            getPaint().setColor(color);
        }
    }

    /* renamed from: n */
    private boolean m8093n(MotionEvent motionEvent) {
        if (this.f7480u != null) {
            int scrollX = getScrollX();
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f7480u;
                if (i >= drawableArr.length) {
                    break;
                }
                Rect bounds = drawableArr[i].getBounds();
                if (motionEvent.getX() < ((float) (bounds.right - scrollX)) && motionEvent.getX() > ((float) (bounds.left - scrollX))) {
                    return m8094o(motionEvent, i);
                }
                i++;
            }
        }
        this.f7481v = false;
        return false;
    }

    /* renamed from: o */
    private boolean m8094o(MotionEvent motionEvent, int i) {
        C1987a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7481v = true;
        } else if (action != 1) {
            if (action == 3 && this.f7481v) {
                this.f7481v = false;
            }
        } else if (this.f7481v && (aVar = this.f7476q) != null) {
            aVar.onWidgetClick(i);
            this.f7481v = false;
            return true;
        }
        return this.f7481v;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m8090k(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + (C1656j.m6983b(this) ? getWidgetLength() : getLabelLength());
    }

    public int getCompoundPaddingRight() {
        return super.getCompoundPaddingRight() + (C1656j.m6983b(this) ? getLabelLength() : getWidgetLength());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m8091l(canvas);
        m8092m(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!TextUtils.isEmpty(this.f7477r) && this.f7483x != null) {
            if (this.f7478s == 0 && this.f7479t > getMeasuredWidth() / 2) {
                this.f7479t = getMeasuredWidth() / 2;
                m8089j();
            }
            int height = this.f7483x.getHeight() + getPaddingTop() + getPaddingBottom();
            if (height > getMeasuredHeight()) {
                setMeasuredDimension(getMeasuredWidth(), height);
            }
        }
    }

    public void setInputType(int i) {
        Typeface typeface = getTypeface();
        super.setInputType(i);
        setTypeface(typeface);
    }

    public void setLabel(String str) {
        this.f7477r = str;
        int i = this.f7478s;
        int i2 = 0;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i > 0) {
            if (!isEmpty) {
                i2 = Math.min((int) getPaint().measureText(this.f7477r), this.f7478s);
            }
        } else if (!isEmpty) {
            i2 = (int) getPaint().measureText(this.f7477r);
        }
        this.f7479t = i2;
        if (!TextUtils.isEmpty(this.f7477r)) {
            m8089j();
        }
        invalidate();
    }

    public void setWidgetManager(C1987a aVar) {
        C1987a aVar2 = this.f7476q;
        if (aVar2 != null) {
            aVar2.onDetached();
            this.f7480u = null;
        }
        this.f7476q = aVar;
        if (aVar != null) {
            this.f7480u = aVar.getWidgetDrawables();
            this.f7476q.onAttached(this);
        }
    }
}
