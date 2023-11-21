package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.p008os.C0574a;
import androidx.core.view.C0662b2;
import androidx.core.widget.C0822h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p021d.C1447a;
import p033f.C1548a;

/* renamed from: androidx.appcompat.widget.l0 */
class C0346l0 extends ListView {

    /* renamed from: d */
    private final Rect f1344d = new Rect();

    /* renamed from: e */
    private int f1345e = 0;

    /* renamed from: f */
    private int f1346f = 0;

    /* renamed from: g */
    private int f1347g = 0;

    /* renamed from: h */
    private int f1348h = 0;

    /* renamed from: i */
    private int f1349i;

    /* renamed from: j */
    private C0350d f1350j;

    /* renamed from: k */
    private boolean f1351k;

    /* renamed from: l */
    private boolean f1352l;

    /* renamed from: m */
    private boolean f1353m;

    /* renamed from: n */
    private C0662b2 f1354n;

    /* renamed from: o */
    private C0822h f1355o;

    /* renamed from: p */
    C0352f f1356p;

    /* renamed from: androidx.appcompat.widget.l0$a */
    static class C0347a {
        /* renamed from: a */
        static void m1604a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    static class C0348b {

        /* renamed from: a */
        private static Method f1357a;

        /* renamed from: b */
        private static Method f1358b;

        /* renamed from: c */
        private static Method f1359c;

        /* renamed from: d */
        private static boolean f1360d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1357a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1358b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1359c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m1605a() {
            return f1360d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static void m1606b(C0346l0 l0Var, int i, View view) {
            try {
                f1357a.invoke(l0Var, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f1358b.invoke(l0Var, new Object[]{Integer.valueOf(i)});
                f1359c.invoke(l0Var, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$c */
    static class C0349c {
        /* renamed from: a */
        static boolean m1607a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        static void m1608b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$d */
    private static class C0350d extends C1548a {

        /* renamed from: e */
        private boolean f1361e = true;

        C0350d(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1982b(boolean z) {
            this.f1361e = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1361e) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1361e) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1361e) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1361e) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1361e) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$e */
    static class C0351e {

        /* renamed from: a */
        private static final Field f1362a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f1362a = field;
        }

        /* renamed from: a */
        static boolean m1610a(AbsListView absListView) {
            Field field = f1362a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        static void m1611b(AbsListView absListView, boolean z) {
            Field field = f1362a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$f */
    private class C0352f implements Runnable {
        C0352f() {
        }

        /* renamed from: a */
        public void mo1988a() {
            C0346l0 l0Var = C0346l0.this;
            l0Var.f1356p = null;
            l0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1989b() {
            C0346l0.this.post(this);
        }

        public void run() {
            C0346l0 l0Var = C0346l0.this;
            l0Var.f1356p = null;
            l0Var.drawableStateChanged();
        }
    }

    C0346l0(Context context, boolean z) {
        super(context, (AttributeSet) null, C1447a.f5661A);
        this.f1352l = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m1591a() {
        this.f1353m = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1349i - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0662b2 b2Var = this.f1354n;
        if (b2Var != null) {
            b2Var.mo2819c();
            this.f1354n = null;
        }
    }

    /* renamed from: b */
    private void m1592b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1593c(Canvas canvas) {
        Drawable selector;
        if (!this.f1344d.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1344d);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1594f(int i, View view) {
        Rect rect = this.f1344d;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1345e;
        rect.top -= this.f1346f;
        rect.right += this.f1347g;
        rect.bottom += this.f1348h;
        boolean j = m1598j();
        if (view.isEnabled() != j) {
            m1599k(!j);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    private void m1595g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1594f(i, view);
        if (z2) {
            Rect rect = this.f1344d;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0553a.m2290c(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1596h(int i, View view, float f, float f2) {
        m1595g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0553a.m2290c(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1597i(View view, int i, float f, float f2) {
        View childAt;
        this.f1353m = true;
        C0347a.m1604a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1349i;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1349i = i;
        C0347a.m1604a(view, f - ((float) view.getLeft()), f2 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1596h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1598j() {
        return C0574a.m2384c() ? C0349c.m1607a(this) : C0351e.m1610a(this);
    }

    /* renamed from: k */
    private void m1599k(boolean z) {
        if (C0574a.m2384c()) {
            C0349c.m1608b(this, z);
        } else {
            C0351e.m1611b(this, z);
        }
    }

    /* renamed from: l */
    private boolean m1600l() {
        return this.f1353m;
    }

    /* renamed from: m */
    private void m1601m() {
        Drawable selector = getSelector();
        if (selector != null && m1600l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0350d dVar = this.f1350j;
        if (dVar != null) {
            dVar.mo1982b(z);
        }
    }

    /* renamed from: d */
    public int mo1969d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1593c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1356p == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1601m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1972e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = r1
            r3 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r1
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r2
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1597i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1592b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1591a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.h r9 = r7.f1355o
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1355o = r9
        L_0x005a:
            androidx.core.widget.h r9 = r7.f1355o
            r9.mo3045m(r2)
            androidx.core.widget.h r9 = r7.f1355o
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.h r8 = r7.f1355o
            if (r8 == 0) goto L_0x006c
            r8.mo3045m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0346l0.mo1972e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1352l || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1352l || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1352l || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1352l && this.f1351k) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1356p = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1356p == null) {
            C0352f fVar = new C0352f();
            this.f1356p = fVar;
            fVar.mo1989b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0348b.m1605a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0348b.m1606b(this, pointToPosition, childAt);
                    }
                }
                m1601m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1349i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0352f fVar = this.f1356p;
        if (fVar != null) {
            fVar.mo1988a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1351k = z;
    }

    public void setSelector(Drawable drawable) {
        C0350d dVar = drawable != null ? new C0350d(drawable) : null;
        this.f1350j = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1345e = rect.left;
        this.f1346f = rect.top;
        this.f1347g = rect.right;
        this.f1348h = rect.bottom;
    }
}
