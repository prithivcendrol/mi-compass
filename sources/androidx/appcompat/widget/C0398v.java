package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
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
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0122b;
import androidx.appcompat.view.menu.C0235p;
import androidx.core.util.C0619c;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p027e.C1512a;

/* renamed from: androidx.appcompat.widget.v */
public class C0398v extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: l */
    private static final int[] f1487l = {16843505};

    /* renamed from: d */
    private final C0318e f1488d;

    /* renamed from: e */
    private final Context f1489e;

    /* renamed from: f */
    private C0359n0 f1490f;

    /* renamed from: g */
    private SpinnerAdapter f1491g;

    /* renamed from: h */
    private final boolean f1492h;

    /* renamed from: i */
    private C0412j f1493i;

    /* renamed from: j */
    int f1494j;

    /* renamed from: k */
    final Rect f1495k;

    /* renamed from: androidx.appcompat.widget.v$a */
    class C0399a extends C0359n0 {

        /* renamed from: m */
        final /* synthetic */ C0406h f1496m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0399a(View view, C0406h hVar) {
            super(view);
            this.f1496m = hVar;
        }

        /* renamed from: b */
        public C0235p mo720b() {
            return this.f1496m;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo721c() {
            if (C0398v.this.getInternalPopup().isShowing()) {
                return true;
            }
            C0398v.this.mo2197b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    class C0400b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0400b() {
        }

        public void onGlobalLayout() {
            if (!C0398v.this.getInternalPopup().isShowing()) {
                C0398v.this.mo2197b();
            }
            ViewTreeObserver viewTreeObserver = C0398v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0401c.m1756a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    private static final class C0401c {
        /* renamed from: a */
        static void m1756a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.v$d */
    private static final class C0402d {
        /* renamed from: a */
        static int m1757a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m1758b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m1759c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        static void m1760d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.v$e */
    private static final class C0403e {
        /* renamed from: a */
        static void m1761a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!C0619c.m2480a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$f */
    class C0404f implements C0412j, DialogInterface.OnClickListener {

        /* renamed from: d */
        C0122b f1499d;

        /* renamed from: e */
        private ListAdapter f1500e;

        /* renamed from: f */
        private CharSequence f1501f;

        C0404f() {
        }

        /* renamed from: b */
        public int mo2227b() {
            return 0;
        }

        /* renamed from: c */
        public void mo2228c(CharSequence charSequence) {
            this.f1501f = charSequence;
        }

        /* renamed from: d */
        public void mo2229d(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void dismiss() {
            C0122b bVar = this.f1499d;
            if (bVar != null) {
                bVar.dismiss();
                this.f1499d = null;
            }
        }

        /* renamed from: e */
        public void mo2231e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: f */
        public void mo2232f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: g */
        public int mo2233g() {
            return 0;
        }

        public Drawable getBackground() {
            return null;
        }

        /* renamed from: h */
        public CharSequence mo2235h() {
            return this.f1501f;
        }

        /* renamed from: i */
        public void mo2236i(ListAdapter listAdapter) {
            this.f1500e = listAdapter;
        }

        public boolean isShowing() {
            C0122b bVar = this.f1499d;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: m */
        public void mo2238m(int i, int i2) {
            if (this.f1500e != null) {
                C0122b.C0123a aVar = new C0122b.C0123a(C0398v.this.getPopupContext());
                CharSequence charSequence = this.f1501f;
                if (charSequence != null) {
                    aVar.mo416m(charSequence);
                }
                C0122b a = aVar.mo414k(this.f1500e, C0398v.this.getSelectedItemPosition(), this).mo404a();
                this.f1499d = a;
                ListView l = a.mo400l();
                C0402d.m1760d(l, i);
                C0402d.m1759c(l, i2);
                this.f1499d.show();
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0398v.this.setSelection(i);
            if (C0398v.this.getOnItemClickListener() != null) {
                C0398v.this.performItemClick((View) null, i, this.f1500e.getItemId(i));
            }
            dismiss();
        }

        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.v$g */
    private static class C0405g implements ListAdapter, SpinnerAdapter {

        /* renamed from: d */
        private SpinnerAdapter f1503d;

        /* renamed from: e */
        private ListAdapter f1504e;

        public C0405g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1503d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1504e = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                C0403e.m1761a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof C0308c1) {
                C0308c1 c1Var = (C0308c1) spinnerAdapter;
                if (c1Var.getDropDownViewTheme() == null) {
                    c1Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1504e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1504e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1503d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$h */
    class C0406h extends C0368p0 implements C0412j {

        /* renamed from: L */
        private CharSequence f1505L;

        /* renamed from: M */
        ListAdapter f1506M;

        /* renamed from: N */
        private final Rect f1507N = new Rect();

        /* renamed from: O */
        private int f1508O;

        /* renamed from: androidx.appcompat.widget.v$h$a */
        class C0407a implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ C0398v f1510d;

            C0407a(C0398v vVar) {
                this.f1510d = vVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0398v.this.setSelection(i);
                if (C0398v.this.getOnItemClickListener() != null) {
                    C0406h hVar = C0406h.this;
                    C0398v.this.performItemClick(view, i, hVar.f1506M.getItemId(i));
                }
                C0406h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$h$b */
        class C0408b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0408b() {
            }

            public void onGlobalLayout() {
                C0406h hVar = C0406h.this;
                if (!hVar.mo2256N(C0398v.this)) {
                    C0406h.this.dismiss();
                    return;
                }
                C0406h.this.mo2254L();
                C0406h.super.mo822j();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$h$c */
        class C0409c implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1513d;

            C0409c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1513d = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0398v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1513d);
                }
            }
        }

        public C0406h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2117w(C0398v.this);
            mo2097C(true);
            mo2101H(0);
            mo2099E(new C0407a(C0398v.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2254L() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.v r1 = androidx.appcompat.widget.C0398v.this
                android.graphics.Rect r1 = r1.f1495k
                r0.getPadding(r1)
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0398v.this
                boolean r0 = androidx.appcompat.widget.C0385r1.m1722b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0398v.this
                android.graphics.Rect r0 = r0.f1495k
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0398v.this
                android.graphics.Rect r0 = r0.f1495k
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0398v.this
                android.graphics.Rect r0 = r0.f1495k
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0398v.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.v r2 = androidx.appcompat.widget.C0398v.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.v r3 = androidx.appcompat.widget.C0398v.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0398v.this
                int r5 = r4.f1494j
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1506M
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.mo2196a(r5, r6)
                androidx.appcompat.widget.v r5 = androidx.appcompat.widget.C0398v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.v r6 = androidx.appcompat.widget.C0398v.this
                android.graphics.Rect r6 = r6.f1495k
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo2119y(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo2119y(r5)
            L_0x0085:
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0398v.this
                boolean r4 = androidx.appcompat.widget.C0385r1.m1722b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo2113s()
                int r3 = r3 - r0
                int r0 = r8.mo2255M()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo2255M()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo2106f(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0398v.C0406h.mo2254L():void");
        }

        /* renamed from: M */
        public int mo2255M() {
            return this.f1508O;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N */
        public boolean mo2256N(View view) {
            return C0727l0.m2859I(view) && view.getGlobalVisibleRect(this.f1507N);
        }

        /* renamed from: c */
        public void mo2228c(CharSequence charSequence) {
            this.f1505L = charSequence;
        }

        /* renamed from: e */
        public void mo2231e(int i) {
            this.f1508O = i;
        }

        /* renamed from: h */
        public CharSequence mo2235h() {
            return this.f1505L;
        }

        /* renamed from: i */
        public void mo2109i(ListAdapter listAdapter) {
            super.mo2109i(listAdapter);
            this.f1506M = listAdapter;
        }

        /* renamed from: m */
        public void mo2238m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            mo2254L();
            mo2096B(2);
            super.mo822j();
            ListView l = mo824l();
            l.setChoiceMode(1);
            C0402d.m1760d(l, i);
            C0402d.m1759c(l, i2);
            mo2102I(C0398v.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = C0398v.this.getViewTreeObserver()) != null) {
                C0408b bVar = new C0408b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2098D(new C0409c(bVar));
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$i */
    static class C0410i extends View.BaseSavedState {
        public static final Parcelable.Creator<C0410i> CREATOR = new C0411a();

        /* renamed from: d */
        boolean f1515d;

        /* renamed from: androidx.appcompat.widget.v$i$a */
        class C0411a implements Parcelable.Creator<C0410i> {
            C0411a() {
            }

            /* renamed from: a */
            public C0410i createFromParcel(Parcel parcel) {
                return new C0410i(parcel);
            }

            /* renamed from: b */
            public C0410i[] newArray(int i) {
                return new C0410i[i];
            }
        }

        C0410i(Parcel parcel) {
            super(parcel);
            this.f1515d = parcel.readByte() != 0;
        }

        C0410i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1515d ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.v$j */
    interface C0412j {
        /* renamed from: b */
        int mo2227b();

        /* renamed from: c */
        void mo2228c(CharSequence charSequence);

        /* renamed from: d */
        void mo2229d(int i);

        void dismiss();

        /* renamed from: e */
        void mo2231e(int i);

        /* renamed from: f */
        void mo2232f(int i);

        /* renamed from: g */
        int mo2233g();

        Drawable getBackground();

        /* renamed from: h */
        CharSequence mo2235h();

        /* renamed from: i */
        void mo2236i(ListAdapter listAdapter);

        boolean isShowing();

        /* renamed from: m */
        void mo2238m(int i, int i2);

        void setBackgroundDrawable(Drawable drawable);
    }

    public C0398v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5670J);
    }

    public C0398v(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0398v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0398v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1495k = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0298b1.m1339a(r6, r0)
            int[] r0 = p021d.C1456j.f6090x2
            r1 = 0
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.C0326g1.m1455u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1488d = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1489e = r2
            goto L_0x0039
        L_0x0029:
            int r11 = p021d.C1456j.f5863C2
            int r11 = r0.mo1876m(r11, r1)
            if (r11 == 0) goto L_0x0037
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1489e = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0069
            int[] r11 = f1487l     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004d:
            r11.recycle()
            goto L_0x0069
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            goto L_0x0063
        L_0x0055:
            r3 = move-exception
            r11 = r2
        L_0x0057:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0061:
            r7 = move-exception
            r2 = r11
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.recycle()
        L_0x0068:
            throw r7
        L_0x0069:
            r11 = 1
            if (r10 == 0) goto L_0x00a6
            if (r10 == r11) goto L_0x006f
            goto L_0x00b6
        L_0x006f:
            androidx.appcompat.widget.v$h r10 = new androidx.appcompat.widget.v$h
            android.content.Context r3 = r6.f1489e
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1489e
            int[] r4 = p021d.C1456j.f6090x2
            androidx.appcompat.widget.g1 r1 = androidx.appcompat.widget.C0326g1.m1455u(r3, r8, r4, r9, r1)
            int r3 = p021d.C1456j.f5858B2
            r4 = -2
            int r3 = r1.mo1875l(r3, r4)
            r6.f1494j = r3
            int r3 = p021d.C1456j.f6100z2
            android.graphics.drawable.Drawable r3 = r1.mo1869f(r3)
            r10.setBackgroundDrawable(r3)
            int r3 = p021d.C1456j.f5853A2
            java.lang.String r3 = r0.mo1877n(r3)
            r10.mo2228c(r3)
            r1.mo1882v()
            r6.f1493i = r10
            androidx.appcompat.widget.v$a r1 = new androidx.appcompat.widget.v$a
            r1.<init>(r6, r10)
            r6.f1490f = r1
            goto L_0x00b6
        L_0x00a6:
            androidx.appcompat.widget.v$f r10 = new androidx.appcompat.widget.v$f
            r10.<init>()
            r6.f1493i = r10
            int r1 = p021d.C1456j.f5853A2
            java.lang.String r1 = r0.mo1877n(r1)
            r10.mo2228c(r1)
        L_0x00b6:
            int r10 = p021d.C1456j.f6095y2
            java.lang.CharSequence[] r10 = r0.mo1879p(r10)
            if (r10 == 0) goto L_0x00ce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p021d.C1453g.f5831t
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ce:
            r0.mo1882v()
            r6.f1492h = r11
            android.widget.SpinnerAdapter r7 = r6.f1491g
            if (r7 == 0) goto L_0x00dc
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1491g = r2
        L_0x00dc:
            androidx.appcompat.widget.e r7 = r6.f1488d
            r7.mo1825e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0398v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2196a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.f1495k);
        Rect rect = this.f1495k;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2197b() {
        this.f1493i.mo2238m(C0402d.m1758b(this), C0402d.m1757a(this));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            eVar.mo1822b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0412j jVar = this.f1493i;
        return jVar != null ? jVar.mo2227b() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0412j jVar = this.f1493i;
        return jVar != null ? jVar.mo2233g() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f1493i != null ? this.f1494j : super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final C0412j getInternalPopup() {
        return this.f1493i;
    }

    public Drawable getPopupBackground() {
        C0412j jVar = this.f1493i;
        return jVar != null ? jVar.getBackground() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1489e;
    }

    public CharSequence getPrompt() {
        C0412j jVar = this.f1493i;
        return jVar != null ? jVar.mo2235h() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0412j jVar = this.f1493i;
        if (jVar != null && jVar.isShowing()) {
            this.f1493i.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1493i != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2196a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0410i iVar = (C0410i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1515d && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0400b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0410i iVar = new C0410i(super.onSaveInstanceState());
        C0412j jVar = this.f1493i;
        iVar.f1515d = jVar != null && jVar.isShowing();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0359n0 n0Var = this.f1490f;
        if (n0Var == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0412j jVar = this.f1493i;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.isShowing()) {
            return true;
        }
        mo2197b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1492h) {
            this.f1491g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1493i != null) {
            Context context = this.f1489e;
            if (context == null) {
                context = getContext();
            }
            this.f1493i.mo2236i(new C0405g(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0412j jVar = this.f1493i;
        if (jVar != null) {
            jVar.mo2231e(i);
            this.f1493i.mo2232f(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0412j jVar = this.f1493i;
        if (jVar != null) {
            jVar.mo2229d(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1493i != null) {
            this.f1494j = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0412j jVar = this.f1493i;
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
        C0412j jVar = this.f1493i;
        if (jVar != null) {
            jVar.mo2228c(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f1488d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }
}
