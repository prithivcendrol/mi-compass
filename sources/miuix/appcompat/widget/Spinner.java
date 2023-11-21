package miuix.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.widget.C0308c1;
import java.lang.reflect.Field;
import miuix.animation.Folme;
import miuix.animation.IFolme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.app.C2112p;
import miuix.appcompat.app.C2130v;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p024d2.C1497a;
import p027e.C1512a;
import p054i2.C1643a;
import p055i3.C1648b;
import p055i3.C1654h;
import p061j3.C1750f;
import p102q2.C2585c;
import p117t2.C2698f;
import p117t2.C2715o;

public class Spinner extends android.widget.Spinner {

    /* renamed from: q */
    private static Field f8635q;

    /* renamed from: d */
    private final Context f8636d;

    /* renamed from: e */
    private SpinnerAdapter f8637e;

    /* renamed from: f */
    private final boolean f8638f;

    /* renamed from: g */
    private boolean f8639g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2271j f8640h;

    /* renamed from: i */
    private IFolme f8641i;

    /* renamed from: j */
    int f8642j;

    /* renamed from: k */
    int f8643k;

    /* renamed from: l */
    int f8644l;

    /* renamed from: m */
    private float f8645m;

    /* renamed from: n */
    private float f8646n;

    /* renamed from: o */
    final Rect f8647o;

    /* renamed from: p */
    private C2267g f8648p;

    /* renamed from: miuix.appcompat.widget.Spinner$a */
    class C2258a implements ViewTreeObserver.OnGlobalLayoutListener {
        C2258a() {
        }

        public void onGlobalLayout() {
            if (!Spinner.this.f8640h.isShowing()) {
                Spinner.this.mo8539o();
            }
            ViewTreeObserver viewTreeObserver = Spinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$b */
    private class C2259b implements C2271j, DialogInterface.OnClickListener {

        /* renamed from: d */
        C2112p f8650d;

        /* renamed from: e */
        private ListAdapter f8651e;

        /* renamed from: f */
        private CharSequence f8652f;

        /* renamed from: miuix.appcompat.widget.Spinner$b$a */
        class C2260a implements DialogInterface.OnDismissListener {
            C2260a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                Spinner.this.m9575m();
            }
        }

        private C2259b() {
        }

        /* synthetic */ C2259b(Spinner spinner, C2258a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo8563a(int i, int i2) {
            if (this.f8651e != null) {
                C2112p.C2114b bVar = new C2112p.C2114b(Spinner.this.getPopupContext());
                CharSequence charSequence = this.f8652f;
                if (charSequence != null) {
                    bVar.mo7553r(charSequence);
                }
                C2112p a = bVar.mo7550o(this.f8651e, Spinner.this.getSelectedItemPosition(), this).mo7546k(new C2260a()).mo7536a();
                this.f8650d = a;
                ListView u = a.mo7534u();
                u.setTextDirection(i);
                u.setTextAlignment(i2);
                this.f8650d.show();
            }
        }

        /* renamed from: b */
        public int mo8564b() {
            return 0;
        }

        /* renamed from: c */
        public void mo8565c(CharSequence charSequence) {
            this.f8652f = charSequence;
        }

        /* renamed from: d */
        public void mo8566d(int i) {
            Log.e("Spinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void dismiss() {
            C2112p pVar = this.f8650d;
            if (pVar != null) {
                pVar.dismiss();
                this.f8650d = null;
            }
        }

        /* renamed from: e */
        public void mo8568e(int i) {
            Log.e("Spinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: f */
        public void mo8569f(int i) {
            Log.e("Spinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: g */
        public int mo8570g() {
            return 0;
        }

        public Drawable getBackground() {
            return null;
        }

        /* renamed from: h */
        public CharSequence mo8572h() {
            return this.f8652f;
        }

        /* renamed from: i */
        public void mo8573i(ListAdapter listAdapter) {
            this.f8651e = listAdapter;
        }

        public boolean isShowing() {
            C2112p pVar = this.f8650d;
            return pVar != null && pVar.isShowing();
        }

        /* renamed from: n */
        public void mo8575n(int i, int i2, float f, float f2) {
            mo8563a(i, i2);
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Spinner.this.setSelection(i);
            HapticCompat.performHapticFeedback(Spinner.this, C2403h.f9376o);
            if (Spinner.this.getOnItemClickListener() != null) {
                Spinner.this.performItemClick((View) null, i, this.f8651e.getItemId(i));
            }
            dismiss();
        }

        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("Spinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$c */
    private static class C2261c extends C2262d {
        C2261c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$d */
    private static class C2262d implements ListAdapter, SpinnerAdapter {

        /* renamed from: d */
        private SpinnerAdapter f8655d;

        /* renamed from: e */
        private ListAdapter f8656e;

        public C2262d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f8655d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f8656e = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0308c1) {
                C0308c1 c1Var = (C0308c1) spinnerAdapter;
                if (c1Var.getDropDownViewTheme() == null) {
                    c1Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f8656e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View dropDownView = getDropDownView(i, view, viewGroup);
            if (view == null) {
                C1648b.m6952a(dropDownView);
                Folme.useAt(dropDownView).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(dropDownView, new AnimConfig[0]);
            }
            return dropDownView;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f8656e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8655d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$e */
    private static class C2263e extends C2262d {
        C2263e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            C1654h.m6979c(view2, i, getCount());
            return view2;
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$f */
    private class C2264f extends C1750f implements C2271j {

        /* renamed from: B */
        private CharSequence f8657B;

        /* renamed from: C */
        ListAdapter f8658C;

        /* renamed from: D */
        private final Rect f8659D = new Rect();

        /* renamed from: E */
        private int f8660E;

        /* renamed from: F */
        private int f8661F;

        /* renamed from: G */
        private int f8662G;

        /* renamed from: H */
        private int f8663H = -1;

        /* renamed from: I */
        private View f8664I;

        /* renamed from: J */
        private int f8665J;

        /* renamed from: K */
        private int f8666K;

        /* renamed from: miuix.appcompat.widget.Spinner$f$a */
        class C2265a implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ Spinner f8668d;

            C2265a(Spinner spinner) {
                this.f8668d = spinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Spinner.this.setSelection(i);
                Spinner.this.m9577r();
                if (Spinner.this.getOnItemClickListener() != null) {
                    C2264f fVar = C2264f.this;
                    Spinner.this.performItemClick(view, i, fVar.f8658C.getItemId(i));
                }
                C2264f.this.dismiss();
            }
        }

        /* renamed from: miuix.appcompat.widget.Spinner$f$b */
        class C2266b implements PopupWindow.OnDismissListener {
            C2266b() {
            }

            public void onDismiss() {
                Spinner.this.m9575m();
            }
        }

        public C2264f(Context context, AttributeSet attributeSet, int i) {
            super(context);
            this.f8661F = context.getResources().getDimensionPixelSize(C1350f.f4654l0);
            this.f8666K = context.getResources().getDimensionPixelSize(C1350f.f4658n0);
            this.f8662G = context.getResources().getDimensionPixelSize(C1350f.f4656m0);
            mo6013O(8388659);
            mo6016R(new C2265a(Spinner.this));
        }

        /* renamed from: V */
        private void m9593V(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            view.getLocationInWindow(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            View view2 = this.f8664I;
            if (view2 == null) {
                view2 = view.getRootView();
            }
            View view3 = view2;
            view3.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            Point point = new Point();
            C2715o.m11331b(Spinner.this.getContext(), point);
            int i7 = point.x;
            int i8 = point.y;
            C2715o.m11336g(Spinner.this.getContext(), point);
            int i9 = point.x;
            int i10 = point.y;
            if (!(i7 == i9 && i8 == i10)) {
                if (m9600e0(i, i3, i7, i9)) {
                    i -= i7 - i9;
                }
                if (m9599d0(i2, i4, i8, view3.getHeight())) {
                    i2 -= i8 - i10;
                }
            }
            int a0 = m9596a0(i3, view.getWidth(), i5, view3.getWidth(), i9, i);
            float b0 = m9597b0(i4, view.getHeight(), i6, view3.getHeight(), i10, i2);
            if (!isShowing()) {
                showAtLocation(view, 0, a0, (int) b0);
                C1750f.m7293y(this.f6740j.getRootView());
                return;
            }
            update(a0, (int) b0, getWidth(), getHeight());
        }

        /* renamed from: W */
        private void m9594W() {
            if (this.f8664I == null) {
                Spinner spinner = Spinner.this;
                if ((spinner.getContext() instanceof C2130v) && ((C2130v) spinner.getContext()).mo7562G()) {
                    mo8594f0(spinner.getRootView().findViewById(C1352h.f4723j));
                }
            }
        }

        /* renamed from: Z */
        private int m9595Z() {
            ListView D = mo6006D();
            int width = getWidth();
            if (D != null) {
                ListAdapter adapter = D.getAdapter();
                int count = adapter.getCount();
                int i = 8;
                if (count < 8) {
                    i = count;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < count; i3++) {
                    View view = adapter.getView(i3, (View) null, D);
                    view.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i2 += view.getMeasuredHeight();
                    if (i3 == i - 1) {
                        this.f8665J = i2;
                    }
                }
                return i2;
            }
            this.f6741k.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = this.f6741k.getMeasuredHeight() + 0;
            this.f8665J = measuredHeight;
            return measuredHeight;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            if ((r13 - r2) >= ((r13 - r10) / 2)) goto L_0x0029;
         */
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int m9596a0(int r9, int r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                int r0 = r8.getWidth()
                int r1 = r8.f8666K
                if (r0 <= r1) goto L_0x000d
                r8.setWidth(r1)
                int r0 = r8.f8666K
            L_0x000d:
                int r1 = r9 + r10
                int r12 = r12 + r11
                int r2 = r14 + r10
                int r3 = r14 + r0
                int r4 = r8.f8661F
                int r3 = r3 + r4
                r5 = 1
                r6 = 0
                if (r3 > r13) goto L_0x001d
                r3 = r5
                goto L_0x001e
            L_0x001d:
                r3 = r6
            L_0x001e:
                int r7 = r2 - r0
                int r7 = r7 - r4
                if (r7 < 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r5 = r6
            L_0x0025:
                if (r3 == 0) goto L_0x002c
                if (r14 >= r4) goto L_0x0040
            L_0x0029:
                int r9 = r11 + r4
                goto L_0x0040
            L_0x002c:
                if (r5 == 0) goto L_0x0035
                int r13 = r13 - r4
                if (r2 <= r13) goto L_0x0032
                goto L_0x003d
            L_0x0032:
                int r9 = r1 - r0
                goto L_0x0040
            L_0x0035:
                int r9 = r13 - r2
                int r13 = r13 - r10
                int r13 = r13 / 2
                if (r9 < r13) goto L_0x003d
                goto L_0x0029
            L_0x003d:
                int r12 = r12 - r4
                int r9 = r12 - r0
            L_0x0040:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.widget.Spinner.C2264f.m9596a0(int, int, int, int, int, int):int");
        }

        /* renamed from: b0 */
        private float m9597b0(int i, int i2, int i3, int i4, int i5, int i6) {
            float f;
            int i7;
            int Z = m9595Z();
            int i8 = this.f8665J;
            if (Z > i8) {
                Z = i8;
            }
            setHeight(Z);
            int i9 = i4 + i3;
            int i10 = i + i2;
            int i11 = i2 + i6;
            int i12 = i11 + Z;
            int i13 = this.f8662G;
            if (i12 < i5 - i13) {
                return i11 < i13 ? (float) (i3 + i13) : (float) i10;
            } else if (i6 - Z > i13) {
                return i6 > i5 - i13 ? (float) ((i9 - i13) - Z) : (float) (i - Z);
            } else {
                if (i11 < i13) {
                    f = (float) (i3 + i13);
                } else if (i6 > i5 - i13) {
                    f = (float) ((i9 - i13) - Z);
                } else if (i6 < i5 / 2) {
                    f = (float) i10;
                    i7 = (i5 - i13) - i11;
                    setHeight((int) ((float) i7));
                    return f;
                } else {
                    float f2 = (float) (i6 - i13);
                    setHeight((int) f2);
                    return ((float) i) - f2;
                }
                i7 = i5 - (i13 * 2);
                setHeight((int) ((float) i7));
                return f;
            }
        }

        /* renamed from: c0 */
        private void m9598c0(int i, int i2) {
            ListView D = mo6006D();
            D.setChoiceMode(1);
            D.setTextDirection(i);
            D.setTextAlignment(i2);
            int selectedItemPosition = Spinner.this.getSelectedItemPosition();
            D.setSelection(selectedItemPosition);
            D.setItemChecked(selectedItemPosition, true);
        }

        /* renamed from: d0 */
        private boolean m9599d0(int i, int i2, int i3, int i4) {
            return i2 != i && (i - i2) + i4 > (i3 * 3) / 4;
        }

        /* renamed from: e0 */
        private boolean m9600e0(int i, int i2, int i3, int i4) {
            if (i == i2) {
                return false;
            }
            int i5 = i - i2;
            int i6 = i3 - i4;
            return i5 == i6 || i5 > i6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public boolean mo6009G() {
            ListView D = mo6006D();
            if (D.getFirstVisiblePosition() != 0 || D.getLastVisiblePosition() != D.getAdapter().getCount() - 1) {
                return true;
            }
            int i = 0;
            for (int i2 = 0; i2 <= D.getLastVisiblePosition(); i2++) {
                i += D.getChildAt(i2).getMeasuredHeight();
            }
            return D.getMeasuredHeight() < i;
        }

        /* renamed from: N */
        public void mo6012N(int i) {
            super.mo6012N(Math.max(Math.min(i, Spinner.this.f8644l), Spinner.this.f8643k));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
        /* renamed from: X */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8592X() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                miuix.appcompat.widget.Spinner r1 = miuix.appcompat.widget.Spinner.this
                android.graphics.Rect r1 = r1.f8647o
                r0.getPadding(r1)
                miuix.appcompat.widget.Spinner r0 = miuix.appcompat.widget.Spinner.this
                boolean r0 = androidx.appcompat.widget.C0385r1.m1722b(r0)
                if (r0 == 0) goto L_0x001d
                miuix.appcompat.widget.Spinner r0 = miuix.appcompat.widget.Spinner.this
                android.graphics.Rect r0 = r0.f8647o
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                miuix.appcompat.widget.Spinner r0 = miuix.appcompat.widget.Spinner.this
                android.graphics.Rect r0 = r0.f8647o
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                miuix.appcompat.widget.Spinner r0 = miuix.appcompat.widget.Spinner.this
                android.graphics.Rect r0 = r0.f8647o
                r0.right = r1
                r0.left = r1
            L_0x002e:
                miuix.appcompat.widget.Spinner r0 = miuix.appcompat.widget.Spinner.this
                int r0 = r0.getPaddingLeft()
                miuix.appcompat.widget.Spinner r2 = miuix.appcompat.widget.Spinner.this
                int r2 = r2.getPaddingRight()
                miuix.appcompat.widget.Spinner r3 = miuix.appcompat.widget.Spinner.this
                int r3 = r3.getWidth()
                miuix.appcompat.widget.Spinner r4 = miuix.appcompat.widget.Spinner.this
                int r5 = r4.f8642j
                r6 = -2
                if (r5 != r6) goto L_0x0080
                android.widget.ListAdapter r5 = r8.f8658C
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.mo8530g(r5, r6)
                miuix.appcompat.widget.Spinner r5 = miuix.appcompat.widget.Spinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                miuix.appcompat.widget.Spinner r6 = miuix.appcompat.widget.Spinner.this
                android.graphics.Rect r6 = r6.f8647o
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                int r6 = r8.f8661F
                int r7 = r6 * 2
                int r5 = r5 - r7
                if (r4 <= r5) goto L_0x0075
                r4 = r5
            L_0x0075:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r6 = r6 * 2
                int r5 = r5 - r6
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x008b
            L_0x0080:
                r4 = -1
                if (r5 != r4) goto L_0x008f
                int r4 = r3 - r0
                int r4 = r4 - r2
                int r5 = r8.f8661F
                int r5 = r5 * 2
                int r4 = r4 - r5
            L_0x008b:
                r8.mo6012N(r4)
                goto L_0x0092
            L_0x008f:
                r8.mo6012N(r5)
            L_0x0092:
                miuix.appcompat.widget.Spinner r4 = miuix.appcompat.widget.Spinner.this
                boolean r4 = androidx.appcompat.widget.C0385r1.m1722b(r4)
                if (r4 == 0) goto L_0x00a7
                int r3 = r3 - r2
                int r0 = r8.getWidth()
                int r3 = r3 - r0
                int r0 = r8.mo8593Y()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00ad
            L_0x00a7:
                int r2 = r8.mo8593Y()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00ad:
                r8.mo6022f(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.widget.Spinner.C2264f.mo8592X():void");
        }

        /* renamed from: Y */
        public int mo8593Y() {
            return this.f8660E;
        }

        /* renamed from: c */
        public void mo8565c(CharSequence charSequence) {
            this.f8657B = charSequence;
        }

        /* renamed from: e */
        public void mo8568e(int i) {
            this.f8660E = i;
        }

        /* renamed from: f0 */
        public void mo8594f0(View view) {
            this.f8664I = view;
        }

        /* renamed from: g0 */
        public void mo8595g0(int i) {
            this.f8663H = i;
        }

        /* renamed from: h */
        public CharSequence mo8572h() {
            return this.f8657B;
        }

        /* renamed from: i */
        public void mo6024i(ListAdapter listAdapter) {
            super.mo6024i(listAdapter);
            this.f8658C = listAdapter;
        }

        /* renamed from: n */
        public void mo8575n(int i, int i2, float f, float f2) {
            m9594W();
            boolean isShowing = isShowing();
            mo8592X();
            setInputMethodMode(2);
            if (mo6011M(Spinner.this, (ViewGroup) null)) {
                m9593V(Spinner.this);
            }
            m9598c0(i, i2);
            if (!isShowing) {
                setOnDismissListener(new C2266b());
            }
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$g */
    public interface C2267g {
        /* renamed from: a */
        void mo8598a();
    }

    /* renamed from: miuix.appcompat.widget.Spinner$h */
    static class C2268h extends View.BaseSavedState {
        public static final Parcelable.Creator<C2268h> CREATOR = new C2269a();

        /* renamed from: d */
        boolean f8671d;

        /* renamed from: miuix.appcompat.widget.Spinner$h$a */
        class C2269a implements Parcelable.Creator<C2268h> {
            C2269a() {
            }

            /* renamed from: a */
            public C2268h createFromParcel(Parcel parcel) {
                return new C2268h(parcel);
            }

            /* renamed from: b */
            public C2268h[] newArray(int i) {
                return new C2268h[i];
            }
        }

        C2268h(Parcel parcel) {
            super(parcel);
            this.f8671d = parcel.readByte() != 0;
        }

        C2268h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f8671d ? (byte) 1 : 0);
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$i */
    private static class C2270i implements C1643a.C1645b {

        /* renamed from: a */
        private Spinner f8672a;

        public C2270i(Spinner spinner) {
            this.f8672a = spinner;
        }

        /* renamed from: a */
        public boolean mo5823a(int i) {
            return this.f8672a.getSelectedItemPosition() == i;
        }
    }

    /* renamed from: miuix.appcompat.widget.Spinner$j */
    private interface C2271j {
        /* renamed from: b */
        int mo8564b();

        /* renamed from: c */
        void mo8565c(CharSequence charSequence);

        /* renamed from: d */
        void mo8566d(int i);

        void dismiss();

        /* renamed from: e */
        void mo8568e(int i);

        /* renamed from: f */
        void mo8569f(int i);

        /* renamed from: g */
        int mo8570g();

        Drawable getBackground();

        /* renamed from: h */
        CharSequence mo8572h();

        /* renamed from: i */
        void mo8573i(ListAdapter listAdapter);

        boolean isShowing();

        /* renamed from: n */
        void mo8575n(int i, int i2, float f, float f2);

        void setBackgroundDrawable(Drawable drawable);
    }

    static {
        try {
            Field declaredField = android.widget.Spinner.class.getDeclaredField("mForwardingListener");
            f8635q = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("Spinner", "static initializer: ", e);
        }
    }

    public Spinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1347c.f4538F);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Spinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            r0 = 0
            r5.f8639g = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.f8647o = r1
            int[] r1 = p018c2.C1357m.f4973o2
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r1, r8, r0)
            if (r10 == 0) goto L_0x001d
            androidx.appcompat.view.d r3 = new androidx.appcompat.view.d
            r3.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
        L_0x001a:
            r5.f8636d = r3
            goto L_0x002d
        L_0x001d:
            int r10 = p018c2.C1357m.f5008v2
            int r10 = r2.getResourceId(r10, r0)
            if (r10 == 0) goto L_0x002b
            androidx.appcompat.view.d r3 = new androidx.appcompat.view.d
            r3.<init>((android.content.Context) r6, (int) r10)
            goto L_0x001a
        L_0x002b:
            r5.f8636d = r6
        L_0x002d:
            r10 = -1
            if (r9 != r10) goto L_0x0036
            int r9 = p018c2.C1357m.f5013w2
            int r9 = r2.getInt(r9, r0)
        L_0x0036:
            r10 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0085
            if (r9 == r3) goto L_0x003d
            goto L_0x0095
        L_0x003d:
            miuix.appcompat.widget.Spinner$f r9 = new miuix.appcompat.widget.Spinner$f
            android.content.Context r4 = r5.f8636d
            r9.<init>(r4, r7, r8)
            android.content.Context r4 = r5.f8636d
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r7, r1, r8, r0)
            int r8 = p018c2.C1357m.f4993s2
            r1 = -2
            int r8 = r7.getLayoutDimension(r8, r1)
            r5.f8642j = r8
            int r8 = p018c2.C1357m.f5003u2
            int r8 = r7.getLayoutDimension(r8, r1)
            r5.f8643k = r8
            int r8 = p018c2.C1357m.f4998t2
            int r8 = r7.getLayoutDimension(r8, r1)
            r5.f8644l = r8
            int r8 = p018c2.C1357m.f4983q2
            int r1 = r7.getResourceId(r8, r0)
            if (r1 == 0) goto L_0x006f
            r5.setPopupBackgroundResource(r1)
            goto L_0x0076
        L_0x006f:
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r8)
            r9.setBackgroundDrawable(r8)
        L_0x0076:
            int r8 = p018c2.C1357m.f4988r2
            java.lang.String r8 = r2.getString(r8)
            r9.mo8565c(r8)
            r7.recycle()
            r5.f8640h = r9
            goto L_0x0095
        L_0x0085:
            miuix.appcompat.widget.Spinner$b r7 = new miuix.appcompat.widget.Spinner$b
            r7.<init>(r5, r10)
            r5.f8640h = r7
            int r8 = p018c2.C1357m.f4988r2
            java.lang.String r8 = r2.getString(r8)
            r7.mo8565c(r8)
        L_0x0095:
            r5.m9573k()
            int r7 = p018c2.C1357m.f4978p2
            java.lang.CharSequence[] r7 = r2.getTextArray(r7)
            if (r7 == 0) goto L_0x00b2
            android.widget.ArrayAdapter r8 = new android.widget.ArrayAdapter
            int r9 = p018c2.C1354j.f4754M
            r1 = 16908308(0x1020014, float:2.3877285E-38)
            r8.<init>(r6, r9, r1, r7)
            int r6 = p018c2.C1354j.f4753L
            r8.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r8)
        L_0x00b2:
            r2.recycle()
            r5.f8638f = r3
            android.widget.SpinnerAdapter r6 = r5.f8637e
            if (r6 == 0) goto L_0x00c0
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.f8637e = r10
        L_0x00c0:
            miuix.view.C2400e.m10241b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.widget.Spinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: e */
    private void m9569e() {
        if (getBackground() != null) {
            getFolmeAnimTarget().touch().setTintMode(1).setScale(1.0f, new ITouchStyle.TouchType[0]).touchDown(new AnimConfig[0]);
            this.f8639g = true;
        }
    }

    /* renamed from: f */
    private void m9570f() {
        C2271j jVar = this.f8640h;
        if ((jVar instanceof C2264f) && ((C2264f) jVar).getHeight() > 0) {
            ((C2264f) this.f8640h).setHeight(-2);
            ((C2264f) this.f8640h).setWidth(-2);
        }
    }

    private IFolme getFolmeAnimTarget() {
        if (this.f8641i == null) {
            this.f8641i = Folme.useAt(this);
        }
        return this.f8641i;
    }

    /* renamed from: h */
    private int m9571h(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null || spinnerAdapter.getCount() == 0) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        View view = spinnerAdapter.getView(Math.max(0, getSelectedItemPosition()), (View) null, this);
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        int max = Math.max(0, view.getMeasuredWidth());
        if (drawable == null) {
            return max;
        }
        drawable.getPadding(this.f8647o);
        Rect rect = this.f8647o;
        return max + rect.left + rect.right;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m9572j() {
        C2271j jVar = this.f8640h;
        if (jVar != null && jVar.isShowing() && (this.f8640h instanceof C2264f)) {
            if (C2698f.m11281i(this.f8636d)) {
                mo8537i();
                return;
            }
            Point f = C2715o.m11335f(getPopupContext());
            mo8546p(((float) f.x) * this.f8645m, ((float) f.y) * this.f8646n);
        }
    }

    /* renamed from: k */
    private void m9573k() {
        Field field = f8635q;
        if (field != null) {
            try {
                field.set(this, (Object) null);
            } catch (IllegalAccessException e) {
                Log.e("Spinner", "makeSupperForwardingListenerInvalid: ", e);
            }
        }
    }

    /* renamed from: l */
    private void m9574l() {
        C2267g gVar = this.f8648p;
        if (gVar != null) {
            gVar.mo8598a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9575m() {
        getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
        m9574l();
    }

    /* renamed from: q */
    private boolean m9576q() {
        sendAccessibilityEvent(1);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m9577r() {
        HapticCompat.m10233e(this, C2403h.f9356A, C2403h.f9372k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8530g(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f8647o);
        Rect rect = this.f8647o;
        return i2 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        C2271j jVar = this.f8640h;
        return jVar != null ? jVar.mo8564b() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C2271j jVar = this.f8640h;
        return jVar != null ? jVar.mo8570g() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f8640h != null ? this.f8642j : super.getDropDownWidth();
    }

    public Drawable getPopupBackground() {
        C2271j jVar = this.f8640h;
        return jVar != null ? jVar.getBackground() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f8636d;
    }

    public CharSequence getPrompt() {
        C2271j jVar = this.f8640h;
        return jVar != null ? jVar.mo8572h() : super.getPrompt();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8537i() {
        this.f8640h.dismiss();
    }

    /* renamed from: n */
    public boolean mo8538n(float f, float f2) {
        Point f3 = C2715o.m11335f(getPopupContext());
        this.f8645m = f / ((float) f3.x);
        this.f8646n = f2 / ((float) f3.y);
        if (m9576q()) {
            return true;
        }
        if (this.f8640h == null) {
            return super.performClick();
        }
        m9570f();
        if (!this.f8640h.isShowing()) {
            mo8546p(f, f2);
            HapticCompat.m10233e(this, C2403h.f9356A, C2403h.f9376o);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8539o() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        mo8546p((float) iArr[0], (float) iArr[1]);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new C2585c(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2271j jVar = this.f8640h;
        if (jVar != null && jVar.isShowing()) {
            this.f8640h.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f8640h != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.min(getMeasuredWidth(), m9571h(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2268h hVar = (C2268h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f8671d && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C2258a());
        }
    }

    public Parcelable onSaveInstanceState() {
        C2268h hVar = new C2268h(super.onSaveInstanceState());
        C2271j jVar = this.f8640h;
        hVar.f8671d = jVar != null && jVar.isShowing();
        return hVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m9569e();
        }
        if (this.f8639g && ((motionEvent.getAction() == 1 && !isPressed()) || motionEvent.getAction() == 3)) {
            getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
            this.f8639g = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8546p(float f, float f2) {
        this.f8640h.mo8575n(getTextDirection(), getTextAlignment(), f, f2);
    }

    public boolean performClick() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return mo8538n((float) iArr[0], (float) iArr[1]);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        ListAdapter eVar;
        if (!this.f8638f) {
            this.f8637e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C2271j jVar = this.f8640h;
        if (jVar instanceof C2259b) {
            eVar = new C2261c(spinnerAdapter, getPopupContext().getTheme());
        } else if (jVar instanceof C2264f) {
            eVar = new C2263e(spinnerAdapter, getPopupContext().getTheme());
        } else {
            return;
        }
        jVar.mo8573i(eVar);
    }

    public void setDoubleLineContentAdapter(C1497a aVar) {
        setAdapter((SpinnerAdapter) new C1643a(getContext(), C1354j.f4754M, aVar, new C2270i(this)));
    }

    public void setDropDownHorizontalOffset(int i) {
        C2271j jVar = this.f8640h;
        if (jVar != null) {
            jVar.mo8568e(i);
            this.f8640h.mo8569f(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C2271j jVar = this.f8640h;
        if (jVar != null) {
            jVar.mo8566d(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f8640h != null) {
            this.f8642j = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setFenceView(View view) {
        C2271j jVar = this.f8640h;
        if (jVar instanceof C2264f) {
            ((C2264f) jVar).mo8594f0(view);
        }
    }

    public void setFenceX(int i) {
        C2271j jVar = this.f8640h;
        if (jVar instanceof C2264f) {
            ((C2264f) jVar).mo8595g0(i);
        }
    }

    public void setFenceXFromView(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setFenceX(iArr[0]);
    }

    public void setOnSpinnerDismissListener(C2267g gVar) {
        this.f8648p = gVar;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C2271j jVar = this.f8640h;
        if (jVar != null) {
            jVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1512a.m6567b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C2271j jVar = this.f8640h;
        if (jVar != null) {
            jVar.mo8565c(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSelection(int i) {
        super.setSelection(i);
        getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
    }
}
