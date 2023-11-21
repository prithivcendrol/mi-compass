package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0184c;
import androidx.core.view.C0727l0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p021d.C1447a;
import p021d.C1450d;
import p021d.C1452f;
import p021d.C1453g;
import p021d.C1454h;
import p021d.C1456j;
import p124v.C2858a;
import p129w.C2871a;

public class SearchView extends C0364o0 implements C0184c {

    /* renamed from: t0 */
    static final C0272o f986t0 = (Build.VERSION.SDK_INT < 29 ? new C0272o() : null);

    /* renamed from: A */
    private final View f987A;

    /* renamed from: B */
    private C0275q f988B;

    /* renamed from: C */
    private Rect f989C;

    /* renamed from: D */
    private Rect f990D;

    /* renamed from: E */
    private int[] f991E;

    /* renamed from: F */
    private int[] f992F;

    /* renamed from: G */
    private final ImageView f993G;

    /* renamed from: H */
    private final Drawable f994H;

    /* renamed from: I */
    private final int f995I;

    /* renamed from: J */
    private final int f996J;

    /* renamed from: K */
    private final Intent f997K;

    /* renamed from: L */
    private final Intent f998L;

    /* renamed from: M */
    private final CharSequence f999M;

    /* renamed from: N */
    private C0270m f1000N;

    /* renamed from: O */
    private C0269l f1001O;

    /* renamed from: P */
    View.OnFocusChangeListener f1002P;

    /* renamed from: Q */
    private C0271n f1003Q;

    /* renamed from: R */
    private View.OnClickListener f1004R;

    /* renamed from: S */
    private boolean f1005S;

    /* renamed from: T */
    private boolean f1006T;

    /* renamed from: U */
    C2858a f1007U;

    /* renamed from: V */
    private boolean f1008V;

    /* renamed from: W */
    private CharSequence f1009W;

    /* renamed from: a0 */
    private boolean f1010a0;

    /* renamed from: b0 */
    private boolean f1011b0;

    /* renamed from: c0 */
    private int f1012c0;

    /* renamed from: d0 */
    private boolean f1013d0;

    /* renamed from: e0 */
    private CharSequence f1014e0;

    /* renamed from: f0 */
    private CharSequence f1015f0;

    /* renamed from: g0 */
    private boolean f1016g0;

    /* renamed from: h0 */
    private int f1017h0;

    /* renamed from: i0 */
    SearchableInfo f1018i0;

    /* renamed from: j0 */
    private Bundle f1019j0;

    /* renamed from: k0 */
    private final Runnable f1020k0;

    /* renamed from: l0 */
    private Runnable f1021l0;

    /* renamed from: m0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1022m0;

    /* renamed from: n0 */
    private final View.OnClickListener f1023n0;

    /* renamed from: o0 */
    View.OnKeyListener f1024o0;

    /* renamed from: p0 */
    private final TextView.OnEditorActionListener f1025p0;

    /* renamed from: q0 */
    private final AdapterView.OnItemClickListener f1026q0;

    /* renamed from: r0 */
    private final AdapterView.OnItemSelectedListener f1027r0;

    /* renamed from: s */
    final SearchAutoComplete f1028s;

    /* renamed from: s0 */
    private TextWatcher f1029s0;

    /* renamed from: t */
    private final View f1030t;

    /* renamed from: u */
    private final View f1031u;

    /* renamed from: v */
    private final View f1032v;

    /* renamed from: w */
    final ImageView f1033w;

    /* renamed from: x */
    final ImageView f1034x;

    /* renamed from: y */
    final ImageView f1035y;

    /* renamed from: z */
    final ImageView f1036z;

    public static class SearchAutoComplete extends C0309d {

        /* renamed from: h */
        private int f1037h;

        /* renamed from: i */
        private SearchView f1038i;

        /* renamed from: j */
        private boolean f1039j;

        /* renamed from: k */
        final Runnable f1040k;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0257a implements Runnable {
            C0257a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1513d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1447a.f5690p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1040k = new C0257a();
            this.f1037h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1511b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0268k.m1204b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f986t0.mo1546c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1512c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1513d() {
            if (this.f1039j) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1039j = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1037h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1039j) {
                removeCallbacks(this.f1040k);
                post(this.f1040k);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1038i.mo1476V();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1038i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1038i.hasFocus() && getVisibility() == 0) {
                this.f1039j = true;
                if (SearchView.m1169I(getContext())) {
                    mo1511b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1039j = false;
                removeCallbacks(this.f1040k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1039j = false;
                removeCallbacks(this.f1040k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1039j = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1038i = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1037h = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0258a implements TextWatcher {
        C0258a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1475U(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0259b implements Runnable {
        C0259b() {
        }

        public void run() {
            SearchView.this.mo1479b0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0260c implements Runnable {
        C0260c() {
        }

        public void run() {
            C2858a aVar = SearchView.this.f1007U;
            if (aVar instanceof C0293a1) {
                aVar.mo1745a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0261d implements View.OnFocusChangeListener {
        C0261d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1002P;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0262e implements View.OnLayoutChangeListener {
        C0262e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1510x();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0263f implements View.OnClickListener {
        C0263f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1033w) {
                searchView.mo1472R();
            } else if (view == searchView.f1035y) {
                searchView.mo1468N();
            } else if (view == searchView.f1034x) {
                searchView.mo1473S();
            } else if (view == searchView.f1036z) {
                searchView.mo1477W();
            } else if (view == searchView.f1028s) {
                searchView.mo1465D();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0264g implements View.OnKeyListener {
        C0264g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1018i0 == null) {
                return false;
            }
            if (searchView.f1028s.isPopupShowing() && SearchView.this.f1028s.getListSelection() != -1) {
                return SearchView.this.mo1474T(view, i, keyEvent);
            }
            if (SearchView.this.f1028s.mo1512c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1467L(0, (String) null, searchView2.f1028s.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0265h implements TextView.OnEditorActionListener {
        C0265h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1473S();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0266i implements AdapterView.OnItemClickListener {
        C0266i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1469O(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0267j implements AdapterView.OnItemSelectedListener {
        C0267j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1470P(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    static class C0268k {
        /* renamed from: a */
        static void m1203a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        static void m1204b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0269l {
        /* renamed from: a */
        boolean mo1539a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0270m {
        /* renamed from: a */
        boolean mo1540a(String str);

        /* renamed from: b */
        boolean mo1541b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0271n {
        /* renamed from: a */
        boolean mo1542a(int i);

        /* renamed from: b */
        boolean mo1543b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0272o {

        /* renamed from: a */
        private Method f1052a = null;

        /* renamed from: b */
        private Method f1053b = null;

        /* renamed from: c */
        private Method f1054c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0272o() {
            m1210d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1052a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1053b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1054c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1210d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1544a(AutoCompleteTextView autoCompleteTextView) {
            m1210d();
            Method method = this.f1053b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1545b(AutoCompleteTextView autoCompleteTextView) {
            m1210d();
            Method method = this.f1052a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1546c(AutoCompleteTextView autoCompleteTextView) {
            m1210d();
            Method method = this.f1054c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    static class C0273p extends C2871a {
        public static final Parcelable.Creator<C0273p> CREATOR = new C0274a();

        /* renamed from: f */
        boolean f1055f;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        class C0274a implements Parcelable.ClassLoaderCreator<C0273p> {
            C0274a() {
            }

            /* renamed from: a */
            public C0273p createFromParcel(Parcel parcel) {
                return new C0273p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0273p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0273p(parcel, classLoader);
            }

            /* renamed from: c */
            public C0273p[] newArray(int i) {
                return new C0273p[i];
            }
        }

        public C0273p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1055f = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0273p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1055f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1055f));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    private static class C0275q extends TouchDelegate {

        /* renamed from: a */
        private final View f1056a;

        /* renamed from: b */
        private final Rect f1057b = new Rect();

        /* renamed from: c */
        private final Rect f1058c = new Rect();

        /* renamed from: d */
        private final Rect f1059d = new Rect();

        /* renamed from: e */
        private final int f1060e;

        /* renamed from: f */
        private boolean f1061f;

        public C0275q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1060e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1555a(rect, rect2);
            this.f1056a = view;
        }

        /* renamed from: a */
        public void mo1555a(Rect rect, Rect rect2) {
            this.f1057b.set(rect);
            this.f1059d.set(rect);
            Rect rect3 = this.f1059d;
            int i = this.f1060e;
            rect3.inset(-i, -i);
            this.f1058c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f1061f
                r8.f1061f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f1061f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f1059d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f1057b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f1061f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f1058c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f1056a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1056a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f1058c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f1056a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0275q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5668H);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f989C = new Rect();
        this.f990D = new Rect();
        this.f991E = new int[2];
        this.f992F = new int[2];
        this.f1020k0 = new C0259b();
        this.f1021l0 = new C0260c();
        this.f1022m0 = new WeakHashMap<>();
        C0263f fVar = new C0263f();
        this.f1023n0 = fVar;
        this.f1024o0 = new C0264g();
        C0265h hVar = new C0265h();
        this.f1025p0 = hVar;
        C0266i iVar = new C0266i();
        this.f1026q0 = iVar;
        C0267j jVar = new C0267j();
        this.f1027r0 = jVar;
        this.f1029s0 = new C0258a();
        int[] iArr = C1456j.f6000f2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0326g1 u = C0326g1.m1455u(context, attributeSet2, iArr, i2, 0);
        C0727l0.m2873W(this, context, iArr, attributeSet2, u.mo1880q(), i2, 0);
        LayoutInflater.from(context).inflate(u.mo1876m(C1456j.f6050p2, C1453g.f5829r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1452f.f5773D);
        this.f1028s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1030t = findViewById(C1452f.f5811z);
        View findViewById = findViewById(C1452f.f5772C);
        this.f1031u = findViewById;
        View findViewById2 = findViewById(C1452f.f5779J);
        this.f1032v = findViewById2;
        ImageView imageView = (ImageView) findViewById(C1452f.f5809x);
        this.f1033w = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1452f.f5770A);
        this.f1034x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1452f.f5810y);
        this.f1035y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1452f.f5774E);
        this.f1036z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1452f.f5771B);
        this.f993G = imageView5;
        C0727l0.m2880b0(findViewById, u.mo1869f(C1456j.f6055q2));
        C0727l0.m2880b0(findViewById2, u.mo1869f(C1456j.f6075u2));
        int i3 = C1456j.f6070t2;
        imageView.setImageDrawable(u.mo1869f(i3));
        imageView2.setImageDrawable(u.mo1869f(C1456j.f6040n2));
        imageView3.setImageDrawable(u.mo1869f(C1456j.f6025k2));
        imageView4.setImageDrawable(u.mo1869f(C1456j.f6085w2));
        imageView5.setImageDrawable(u.mo1869f(i3));
        this.f994H = u.mo1869f(C1456j.f6065s2);
        C0353l1.m1614a(imageView, getResources().getString(C1454h.f5845n));
        this.f995I = u.mo1876m(C1456j.f6080v2, C1453g.f5828q);
        this.f996J = u.mo1876m(C1456j.f6030l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1029s0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1024o0);
        searchAutoComplete.setOnFocusChangeListener(new C0261d());
        setIconifiedByDefault(u.mo1864a(C1456j.f6045o2, true));
        int e = u.mo1868e(C1456j.f6010h2, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f999M = u.mo1878o(C1456j.f6035m2);
        this.f1009W = u.mo1878o(C1456j.f6060r2);
        int j = u.mo1873j(C1456j.f6020j2, -1);
        if (j != -1) {
            setImeOptions(j);
        }
        int j2 = u.mo1873j(C1456j.f6015i2, -1);
        if (j2 != -1) {
            setInputType(j2);
        }
        setFocusable(u.mo1864a(C1456j.f6005g2, true));
        u.mo1882v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f997K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f998L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f987A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0262e());
        }
        m1180g0(this.f1005S);
        m1176c0();
    }

    /* renamed from: A */
    private Intent m1163A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1019j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: B */
    private Intent m1164B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: C */
    private void m1165C() {
        this.f1028s.dismissDropDown();
    }

    /* renamed from: E */
    private void m1166E(View view, Rect rect) {
        view.getLocationInWindow(this.f991E);
        getLocationInWindow(this.f992F);
        int[] iArr = this.f991E;
        int i = iArr[1];
        int[] iArr2 = this.f992F;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: F */
    private CharSequence m1167F(CharSequence charSequence) {
        if (!this.f1005S || this.f994H == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1028s.getTextSize()) * 1.25d);
        this.f994H.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f994H), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: G */
    private boolean m1168G() {
        SearchableInfo searchableInfo = this.f1018i0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1018i0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f997K;
        } else if (this.f1018i0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f998L;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: I */
    static boolean m1169I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: J */
    private boolean m1170J() {
        return (this.f1008V || this.f1013d0) && !mo1466H();
    }

    /* renamed from: K */
    private void m1171K(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: M */
    private boolean m1172M(int i, int i2, String str) {
        Cursor b = this.f1007U.mo10130b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m1171K(m1183z(b, i2, str));
        return true;
    }

    /* renamed from: X */
    private void m1173X() {
        post(this.f1020k0);
    }

    /* renamed from: Y */
    private void m1174Y(int i) {
        CharSequence convertToString;
        Editable text = this.f1028s.getText();
        Cursor b = this.f1007U.mo10130b();
        if (b != null) {
            if (!b.moveToPosition(i) || (convertToString = this.f1007U.convertToString(b)) == null) {
                setQuery(text);
            } else {
                setQuery(convertToString);
            }
        }
    }

    /* renamed from: a0 */
    private void m1175a0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1028s.getText());
        int i = 0;
        if (!z2 && (!this.f1005S || this.f1016g0)) {
            z = false;
        }
        ImageView imageView = this.f1035y;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1035y.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: c0 */
    private void m1176c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1028s;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1167F(queryHint));
    }

    /* renamed from: d0 */
    private void m1177d0() {
        this.f1028s.setThreshold(this.f1018i0.getSuggestThreshold());
        this.f1028s.setImeOptions(this.f1018i0.getImeOptions());
        int inputType = this.f1018i0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1018i0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1028s.setInputType(inputType);
        C2858a aVar = this.f1007U;
        if (aVar != null) {
            aVar.mo1745a((Cursor) null);
        }
        if (this.f1018i0.getSuggestAuthority() != null) {
            C0293a1 a1Var = new C0293a1(getContext(), this, this.f1018i0, this.f1022m0);
            this.f1007U = a1Var;
            this.f1028s.setAdapter(a1Var);
            C0293a1 a1Var2 = (C0293a1) this.f1007U;
            if (this.f1010a0) {
                i = 2;
            }
            a1Var2.mo1758w(i);
        }
    }

    /* renamed from: e0 */
    private void m1178e0() {
        this.f1032v.setVisibility((!m1170J() || !(this.f1034x.getVisibility() == 0 || this.f1036z.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: f0 */
    private void m1179f0(boolean z) {
        this.f1034x.setVisibility((!this.f1008V || !m1170J() || !hasFocus() || (!z && this.f1013d0)) ? 8 : 0);
    }

    /* renamed from: g0 */
    private void m1180g0(boolean z) {
        this.f1006T = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1028s.getText());
        this.f1033w.setVisibility(i2);
        m1179f0(z2);
        this.f1030t.setVisibility(z ? 8 : 0);
        if (this.f993G.getDrawable() == null || this.f1005S) {
            i = 8;
        }
        this.f993G.setVisibility(i);
        m1175a0();
        m1181h0(!z2);
        m1178e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1450d.f5716g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1450d.f5717h);
    }

    /* renamed from: h0 */
    private void m1181h0(boolean z) {
        int i = 8;
        if (this.f1013d0 && !mo1466H() && z) {
            this.f1034x.setVisibility(8);
            i = 0;
        }
        this.f1036z.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1028s.setText(charSequence);
        this.f1028s.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: y */
    private Intent m1182y(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1015f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1019j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1018i0.getSearchActivity());
        return intent;
    }

    /* renamed from: z */
    private Intent m1183z(Cursor cursor, int i, String str) {
        int i2;
        String n;
        try {
            String n2 = C0293a1.m1320n(cursor, "suggest_intent_action");
            if (n2 == null) {
                n2 = this.f1018i0.getSuggestIntentAction();
            }
            if (n2 == null) {
                n2 = "android.intent.action.SEARCH";
            }
            String str2 = n2;
            String n3 = C0293a1.m1320n(cursor, "suggest_intent_data");
            if (n3 == null) {
                n3 = this.f1018i0.getSuggestIntentData();
            }
            if (!(n3 == null || (n = C0293a1.m1320n(cursor, "suggest_intent_data_id")) == null)) {
                n3 = n3 + "/" + Uri.encode(n);
            }
            return m1182y(str2, n3 == null ? null : Uri.parse(n3), C0293a1.m1320n(cursor, "suggest_intent_extra_data"), C0293a1.m1320n(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo1465D() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0268k.m1203a(this.f1028s);
            return;
        }
        C0272o oVar = f986t0;
        oVar.mo1545b(this.f1028s);
        oVar.mo1544a(this.f1028s);
    }

    /* renamed from: H */
    public boolean mo1466H() {
        return this.f1006T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo1467L(int i, String str, String str2) {
        getContext().startActivity(m1182y("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo1468N() {
        if (!TextUtils.isEmpty(this.f1028s.getText())) {
            this.f1028s.setText("");
            this.f1028s.requestFocus();
            this.f1028s.setImeVisibility(true);
        } else if (this.f1005S) {
            C0269l lVar = this.f1001O;
            if (lVar == null || !lVar.mo1539a()) {
                clearFocus();
                m1180g0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo1469O(int i, int i2, String str) {
        C0271n nVar = this.f1003Q;
        if (nVar != null && nVar.mo1543b(i)) {
            return false;
        }
        m1172M(i, 0, (String) null);
        this.f1028s.setImeVisibility(false);
        m1165C();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo1470P(int i) {
        C0271n nVar = this.f1003Q;
        if (nVar != null && nVar.mo1542a(i)) {
            return false;
        }
        m1174Y(i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo1471Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1472R() {
        m1180g0(false);
        this.f1028s.requestFocus();
        this.f1028s.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1004R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo1473S() {
        Editable text = this.f1028s.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0270m mVar = this.f1000N;
            if (mVar == null || !mVar.mo1541b(text.toString())) {
                if (this.f1018i0 != null) {
                    mo1467L(0, (String) null, text.toString());
                }
                this.f1028s.setImeVisibility(false);
                m1165C();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1474T(View view, int i, KeyEvent keyEvent) {
        if (this.f1018i0 != null && this.f1007U != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1469O(this.f1028s.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1028s.setSelection(i == 21 ? 0 : this.f1028s.length());
                this.f1028s.setListSelection(0);
                this.f1028s.clearListSelection();
                this.f1028s.mo1511b();
                return true;
            } else if (i == 19) {
                this.f1028s.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1475U(CharSequence charSequence) {
        Editable text = this.f1028s.getText();
        this.f1015f0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1179f0(z);
        m1181h0(!z);
        m1175a0();
        m1178e0();
        if (this.f1000N != null && !TextUtils.equals(charSequence, this.f1014e0)) {
            this.f1000N.mo1540a(charSequence.toString());
        }
        this.f1014e0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1476V() {
        m1180g0(mo1466H());
        m1173X();
        if (this.f1028s.hasFocus()) {
            mo1465D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1477W() {
        Intent A;
        SearchableInfo searchableInfo = this.f1018i0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    A = m1164B(this.f997K, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    A = m1163A(this.f998L, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(A);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: Z */
    public void mo1478Z(CharSequence charSequence, boolean z) {
        this.f1028s.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1028s;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1015f0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1473S();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo1479b0() {
        int[] iArr = this.f1028s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1031u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1032v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void clearFocus() {
        this.f1011b0 = true;
        super.clearFocus();
        this.f1028s.clearFocus();
        this.f1028s.setImeVisibility(false);
        this.f1011b0 = false;
    }

    public int getImeOptions() {
        return this.f1028s.getImeOptions();
    }

    public int getInputType() {
        return this.f1028s.getInputType();
    }

    public int getMaxWidth() {
        return this.f1012c0;
    }

    public CharSequence getQuery() {
        return this.f1028s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1009W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1018i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f999M : getContext().getText(this.f1018i0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f996J;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f995I;
    }

    public C2858a getSuggestionsAdapter() {
        return this.f1007U;
    }

    public void onActionViewCollapsed() {
        mo1478Z("", false);
        clearFocus();
        m1180g0(true);
        this.f1028s.setImeOptions(this.f1017h0);
        this.f1016g0 = false;
    }

    public void onActionViewExpanded() {
        if (!this.f1016g0) {
            this.f1016g0 = true;
            int imeOptions = this.f1028s.getImeOptions();
            this.f1017h0 = imeOptions;
            this.f1028s.setImeOptions(imeOptions | 33554432);
            this.f1028s.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1020k0);
        post(this.f1021l0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1166E(this.f1028s, this.f989C);
            Rect rect = this.f990D;
            Rect rect2 = this.f989C;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0275q qVar = this.f988B;
            if (qVar == null) {
                C0275q qVar2 = new C0275q(this.f990D, this.f989C, this.f1028s);
                this.f988B = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.mo1555a(this.f990D, this.f989C);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1466H()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1012c0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1012c0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1012c0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0273p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0273p pVar = (C0273p) parcelable;
        super.onRestoreInstanceState(pVar.mo10153a());
        m1180g0(pVar.f1055f);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0273p pVar = new C0273p(super.onSaveInstanceState());
        pVar.f1055f = mo1466H();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1173X();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1011b0 || !isFocusable()) {
            return false;
        }
        if (mo1466H()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1028s.requestFocus(i, rect);
        if (requestFocus) {
            m1180g0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1019j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1468N();
        } else {
            mo1472R();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1005S != z) {
            this.f1005S = z;
            m1180g0(z);
            m1176c0();
        }
    }

    public void setImeOptions(int i) {
        this.f1028s.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1028s.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1012c0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0269l lVar) {
        this.f1001O = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1002P = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0270m mVar) {
        this.f1000N = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1004R = onClickListener;
    }

    public void setOnSuggestionListener(C0271n nVar) {
        this.f1003Q = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1009W = charSequence;
        m1176c0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1010a0 = z;
        C2858a aVar = this.f1007U;
        if (aVar instanceof C0293a1) {
            ((C0293a1) aVar).mo1758w(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1018i0 = searchableInfo;
        if (searchableInfo != null) {
            m1177d0();
            m1176c0();
        }
        boolean G = m1168G();
        this.f1013d0 = G;
        if (G) {
            this.f1028s.setPrivateImeOptions("nm");
        }
        m1180g0(mo1466H());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1008V = z;
        m1180g0(mo1466H());
    }

    public void setSuggestionsAdapter(C2858a aVar) {
        this.f1007U = aVar;
        this.f1028s.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo1510x() {
        if (this.f987A.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1031u.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0385r1.m1722b(this);
            int dimensionPixelSize = this.f1005S ? resources.getDimensionPixelSize(C1450d.f5714e) + resources.getDimensionPixelSize(C1450d.f5715f) : 0;
            this.f1028s.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1028s.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1028s.setDropDownWidth((((this.f987A.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
