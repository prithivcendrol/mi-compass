package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0364o0;
import androidx.core.view.C0727l0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p021d.C1447a;
import p021d.C1452f;
import p021d.C1456j;

class AlertController {

    /* renamed from: A */
    NestedScrollView f255A;

    /* renamed from: B */
    private int f256B = 0;

    /* renamed from: C */
    private Drawable f257C;

    /* renamed from: D */
    private ImageView f258D;

    /* renamed from: E */
    private TextView f259E;

    /* renamed from: F */
    private TextView f260F;

    /* renamed from: G */
    private View f261G;

    /* renamed from: H */
    ListAdapter f262H;

    /* renamed from: I */
    int f263I = -1;

    /* renamed from: J */
    private int f264J;

    /* renamed from: K */
    private int f265K;

    /* renamed from: L */
    int f266L;

    /* renamed from: M */
    int f267M;

    /* renamed from: N */
    int f268N;

    /* renamed from: O */
    int f269O;

    /* renamed from: P */
    private boolean f270P;

    /* renamed from: Q */
    private int f271Q = 0;

    /* renamed from: R */
    Handler f272R;

    /* renamed from: S */
    private final View.OnClickListener f273S = new C0107a();

    /* renamed from: a */
    private final Context f274a;

    /* renamed from: b */
    final C0160k f275b;

    /* renamed from: c */
    private final Window f276c;

    /* renamed from: d */
    private final int f277d;

    /* renamed from: e */
    private CharSequence f278e;

    /* renamed from: f */
    private CharSequence f279f;

    /* renamed from: g */
    ListView f280g;

    /* renamed from: h */
    private View f281h;

    /* renamed from: i */
    private int f282i;

    /* renamed from: j */
    private int f283j;

    /* renamed from: k */
    private int f284k;

    /* renamed from: l */
    private int f285l;

    /* renamed from: m */
    private int f286m;

    /* renamed from: n */
    private boolean f287n = false;

    /* renamed from: o */
    Button f288o;

    /* renamed from: p */
    private CharSequence f289p;

    /* renamed from: q */
    Message f290q;

    /* renamed from: r */
    private Drawable f291r;

    /* renamed from: s */
    Button f292s;

    /* renamed from: t */
    private CharSequence f293t;

    /* renamed from: u */
    Message f294u;

    /* renamed from: v */
    private Drawable f295v;

    /* renamed from: w */
    Button f296w;

    /* renamed from: x */
    private CharSequence f297x;

    /* renamed from: y */
    Message f298y;

    /* renamed from: z */
    private Drawable f299z;

    public static class RecycleListView extends ListView {

        /* renamed from: d */
        private final int f300d;

        /* renamed from: e */
        private final int f301e;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f5985c2);
            this.f301e = obtainStyledAttributes.getDimensionPixelOffset(C1456j.f5990d2, -1);
            this.f300d = obtainStyledAttributes.getDimensionPixelOffset(C1456j.f5995e2, -1);
        }

        /* renamed from: a */
        public void mo351a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f300d, getPaddingRight(), z2 ? getPaddingBottom() : this.f301e);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0107a implements View.OnClickListener {
        C0107a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f298y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f288o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f290q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f292s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f294u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f296w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f298y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f272R
                r1 = 1
                androidx.appcompat.app.k r3 = r3.f275b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0107a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0108b {

        /* renamed from: A */
        public int f303A;

        /* renamed from: B */
        public int f304B;

        /* renamed from: C */
        public int f305C;

        /* renamed from: D */
        public int f306D;

        /* renamed from: E */
        public boolean f307E = false;

        /* renamed from: F */
        public boolean[] f308F;

        /* renamed from: G */
        public boolean f309G;

        /* renamed from: H */
        public boolean f310H;

        /* renamed from: I */
        public int f311I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f312J;

        /* renamed from: K */
        public Cursor f313K;

        /* renamed from: L */
        public String f314L;

        /* renamed from: M */
        public String f315M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f316N;

        /* renamed from: O */
        public C0113e f317O;

        /* renamed from: P */
        public boolean f318P = true;

        /* renamed from: a */
        public final Context f319a;

        /* renamed from: b */
        public final LayoutInflater f320b;

        /* renamed from: c */
        public int f321c = 0;

        /* renamed from: d */
        public Drawable f322d;

        /* renamed from: e */
        public int f323e = 0;

        /* renamed from: f */
        public CharSequence f324f;

        /* renamed from: g */
        public View f325g;

        /* renamed from: h */
        public CharSequence f326h;

        /* renamed from: i */
        public CharSequence f327i;

        /* renamed from: j */
        public Drawable f328j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f329k;

        /* renamed from: l */
        public CharSequence f330l;

        /* renamed from: m */
        public Drawable f331m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f332n;

        /* renamed from: o */
        public CharSequence f333o;

        /* renamed from: p */
        public Drawable f334p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f335q;

        /* renamed from: r */
        public boolean f336r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f337s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f338t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f339u;

        /* renamed from: v */
        public CharSequence[] f340v;

        /* renamed from: w */
        public ListAdapter f341w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f342x;

        /* renamed from: y */
        public int f343y;

        /* renamed from: z */
        public View f344z;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        class C0109a extends ArrayAdapter<CharSequence> {

            /* renamed from: d */
            final /* synthetic */ RecycleListView f345d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0109a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f345d = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0108b.this.f308F;
                if (zArr != null && zArr[i]) {
                    this.f345d.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        class C0110b extends CursorAdapter {

            /* renamed from: d */
            private final int f347d;

            /* renamed from: e */
            private final int f348e;

            /* renamed from: f */
            final /* synthetic */ RecycleListView f349f;

            /* renamed from: g */
            final /* synthetic */ AlertController f350g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0110b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f349f = recycleListView;
                this.f350g = alertController;
                Cursor cursor2 = getCursor();
                this.f347d = cursor2.getColumnIndexOrThrow(C0108b.this.f314L);
                this.f348e = cursor2.getColumnIndexOrThrow(C0108b.this.f315M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f347d));
                RecycleListView recycleListView = this.f349f;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f348e) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0108b.this.f320b.inflate(this.f350g.f267M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        class C0111c implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ AlertController f352d;

            C0111c(AlertController alertController) {
                this.f352d = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0108b.this.f342x.onClick(this.f352d.f275b, i);
                if (!C0108b.this.f310H) {
                    this.f352d.f275b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        class C0112d implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ RecycleListView f354d;

            /* renamed from: e */
            final /* synthetic */ AlertController f355e;

            C0112d(RecycleListView recycleListView, AlertController alertController) {
                this.f354d = recycleListView;
                this.f355e = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0108b.this.f308F;
                if (zArr != null) {
                    zArr[i] = this.f354d.isItemChecked(i);
                }
                C0108b.this.f312J.onClick(this.f355e.f275b, i, this.f354d.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$e */
        public interface C0113e {
            void onPrepareListView(ListView listView);
        }

        public C0108b(Context context) {
            this.f319a = context;
            this.f336r = true;
            this.f320b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m315b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f320b
                int r1 = r11.f266L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f309G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f313K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f319a
                int r4 = r11.f267M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f340v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f319a
                android.database.Cursor r4 = r10.f313K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f310H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f268N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f269O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f313K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f319a
                android.database.Cursor r5 = r10.f313K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f314L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f341w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f319a
                java.lang.CharSequence[] r3 = r10.f340v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$b$e r1 = r10.f317O
                if (r1 == 0) goto L_0x0072
                r1.onPrepareListView(r0)
            L_0x0072:
                r11.f262H = r9
                int r1 = r10.f311I
                r11.f263I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f342x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f312J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f316N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f310H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f309G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f280g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0108b.m315b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo353a(AlertController alertController) {
            View view = this.f325g;
            if (view != null) {
                alertController.mo343k(view);
            } else {
                CharSequence charSequence = this.f324f;
                if (charSequence != null) {
                    alertController.mo347p(charSequence);
                }
                Drawable drawable = this.f322d;
                if (drawable != null) {
                    alertController.mo345m(drawable);
                }
                int i = this.f321c;
                if (i != 0) {
                    alertController.mo344l(i);
                }
                int i2 = this.f323e;
                if (i2 != 0) {
                    alertController.mo344l(alertController.mo337c(i2));
                }
            }
            CharSequence charSequence2 = this.f326h;
            if (charSequence2 != null) {
                alertController.mo346n(charSequence2);
            }
            CharSequence charSequence3 = this.f327i;
            if (!(charSequence3 == null && this.f328j == null)) {
                alertController.mo342j(-1, charSequence3, this.f329k, (Message) null, this.f328j);
            }
            CharSequence charSequence4 = this.f330l;
            if (!(charSequence4 == null && this.f331m == null)) {
                alertController.mo342j(-2, charSequence4, this.f332n, (Message) null, this.f331m);
            }
            CharSequence charSequence5 = this.f333o;
            if (!(charSequence5 == null && this.f334p == null)) {
                alertController.mo342j(-3, charSequence5, this.f335q, (Message) null, this.f334p);
            }
            if (!(this.f340v == null && this.f313K == null && this.f341w == null)) {
                m315b(alertController);
            }
            View view2 = this.f344z;
            if (view2 == null) {
                int i3 = this.f343y;
                if (i3 != 0) {
                    alertController.mo348q(i3);
                }
            } else if (this.f307E) {
                alertController.mo350s(view2, this.f303A, this.f304B, this.f305C, this.f306D);
            } else {
                alertController.mo349r(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    private static final class C0114c extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f357a;

        public C0114c(DialogInterface dialogInterface) {
            this.f357a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f357a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    private static class C0115d extends ArrayAdapter<CharSequence> {
        public C0115d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0160k kVar, Window window) {
        this.f274a = context;
        this.f275b = kVar;
        this.f276c = window;
        this.f272R = new C0114c(kVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1456j.f5875F, C1447a.f5688n, 0);
        this.f264J = obtainStyledAttributes.getResourceId(C1456j.f5880G, 0);
        this.f265K = obtainStyledAttributes.getResourceId(C1456j.f5890I, 0);
        this.f266L = obtainStyledAttributes.getResourceId(C1456j.f5900K, 0);
        this.f267M = obtainStyledAttributes.getResourceId(C1456j.f5905L, 0);
        this.f268N = obtainStyledAttributes.getResourceId(C1456j.f5915N, 0);
        this.f269O = obtainStyledAttributes.getResourceId(C1456j.f5895J, 0);
        this.f270P = obtainStyledAttributes.getBoolean(C1456j.f5910M, true);
        this.f277d = obtainStyledAttributes.getDimensionPixelSize(C1456j.f5885H, 0);
        obtainStyledAttributes.recycle();
        kVar.mo569k(1);
    }

    /* renamed from: a */
    static boolean m289a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m289a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m290b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    private ViewGroup m291h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: i */
    private int m292i() {
        int i = this.f265K;
        return i == 0 ? this.f264J : this.f271Q == 1 ? i : this.f264J;
    }

    /* renamed from: o */
    private void m293o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f276c.findViewById(C1452f.f5807v);
        View findViewById2 = this.f276c.findViewById(C1452f.f5806u);
        C0727l0.m2904n0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: t */
    private void m294t(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f288o = button2;
        button2.setOnClickListener(this.f273S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f289p) || this.f291r != null) {
            this.f288o.setText(this.f289p);
            Drawable drawable = this.f291r;
            if (drawable != null) {
                int i = this.f277d;
                drawable.setBounds(0, 0, i, i);
                this.f288o.setCompoundDrawables(this.f291r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f288o.setVisibility(0);
            z = true;
        } else {
            this.f288o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f292s = button3;
        button3.setOnClickListener(this.f273S);
        if (!TextUtils.isEmpty(this.f293t) || this.f295v != null) {
            this.f292s.setText(this.f293t);
            Drawable drawable2 = this.f295v;
            if (drawable2 != null) {
                int i2 = this.f277d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f292s.setCompoundDrawables(this.f295v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f292s.setVisibility(0);
            z |= true;
        } else {
            this.f292s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f296w = button4;
        button4.setOnClickListener(this.f273S);
        if (!TextUtils.isEmpty(this.f297x) || this.f299z != null) {
            this.f296w.setText(this.f297x);
            Drawable drawable3 = this.f299z;
            if (drawable3 != null) {
                int i3 = this.f277d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f296w.setCompoundDrawables(this.f299z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f296w.setVisibility(0);
            z |= true;
        } else {
            this.f296w.setVisibility(8);
        }
        if (m299y(this.f274a)) {
            if (z) {
                button = this.f288o;
            } else if (z) {
                button = this.f292s;
            } else if (z) {
                button = this.f296w;
            }
            m290b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: u */
    private void m295u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f276c.findViewById(C1452f.f5808w);
        this.f255A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f255A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f260F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f279f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f255A.removeView(this.f260F);
            if (this.f280g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f255A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f255A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f280g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m296v(ViewGroup viewGroup) {
        View view = this.f281h;
        boolean z = false;
        if (view == null) {
            view = this.f282i != 0 ? LayoutInflater.from(this.f274a).inflate(this.f282i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m289a(view)) {
            this.f276c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f276c.findViewById(C1452f.f5799n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f287n) {
                frameLayout.setPadding(this.f283j, this.f284k, this.f285l, this.f286m);
            }
            if (this.f280g != null) {
                ((C0364o0.C0365a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m297w(ViewGroup viewGroup) {
        View view;
        if (this.f261G != null) {
            viewGroup.addView(this.f261G, 0, new ViewGroup.LayoutParams(-1, -2));
            view = this.f276c.findViewById(C1452f.f5784O);
        } else {
            this.f258D = (ImageView) this.f276c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(this.f278e)) || !this.f270P) {
                this.f276c.findViewById(C1452f.f5784O).setVisibility(8);
                this.f258D.setVisibility(8);
                view = viewGroup;
            } else {
                TextView textView = (TextView) this.f276c.findViewById(C1452f.f5795j);
                this.f259E = textView;
                textView.setText(this.f278e);
                int i = this.f256B;
                if (i != 0) {
                    this.f258D.setImageResource(i);
                    return;
                }
                Drawable drawable = this.f257C;
                if (drawable != null) {
                    this.f258D.setImageDrawable(drawable);
                    return;
                }
                this.f259E.setPadding(this.f258D.getPaddingLeft(), this.f258D.getPaddingTop(), this.f258D.getPaddingRight(), this.f258D.getPaddingBottom());
                this.f258D.setVisibility(8);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* renamed from: x */
    private void m298x() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f276c.findViewById(C1452f.f5805t);
        int i = C1452f.f5785P;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C1452f.f5798m;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C1452f.f5796k;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C1452f.f5800o);
        m296v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup h = m291h(findViewById7, findViewById4);
        ViewGroup h2 = m291h(findViewById8, findViewById5);
        ViewGroup h3 = m291h(findViewById9, findViewById6);
        m295u(h2);
        m294t(h3);
        m297w(h);
        char c = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (h == null || h.getVisibility() == 8) ? false : true;
        boolean z3 = (h3 == null || h3.getVisibility() == 8) ? false : true;
        if (!(z3 || h2 == null || (findViewById2 = h2.findViewById(C1452f.f5780K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f255A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f279f == null && this.f280g == null)) {
                view = h.findViewById(C1452f.f5783N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(h2 == null || (findViewById = h2.findViewById(C1452f.f5781L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f280g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo351a(z2, z3);
        }
        if (!z) {
            View view2 = this.f280g;
            if (view2 == null) {
                view2 = this.f255A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m293o(h2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f280g;
        if (listView2 != null && (listAdapter = this.f262H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f263I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    /* renamed from: y */
    private static boolean m299y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1447a.f5687m, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int mo337c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f274a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView mo338d() {
        return this.f280g;
    }

    /* renamed from: e */
    public void mo339e() {
        this.f275b.setContentView(m292i());
        m298x();
    }

    /* renamed from: f */
    public boolean mo340f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f255A;
        return nestedScrollView != null && nestedScrollView.mo3020s(keyEvent);
    }

    /* renamed from: g */
    public boolean mo341g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f255A;
        return nestedScrollView != null && nestedScrollView.mo3020s(keyEvent);
    }

    /* renamed from: j */
    public void mo342j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f272R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f297x = charSequence;
            this.f298y = message;
            this.f299z = drawable;
        } else if (i == -2) {
            this.f293t = charSequence;
            this.f294u = message;
            this.f295v = drawable;
        } else if (i == -1) {
            this.f289p = charSequence;
            this.f290q = message;
            this.f291r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: k */
    public void mo343k(View view) {
        this.f261G = view;
    }

    /* renamed from: l */
    public void mo344l(int i) {
        this.f257C = null;
        this.f256B = i;
        ImageView imageView = this.f258D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f258D.setImageResource(this.f256B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: m */
    public void mo345m(Drawable drawable) {
        this.f257C = drawable;
        this.f256B = 0;
        ImageView imageView = this.f258D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f258D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo346n(CharSequence charSequence) {
        this.f279f = charSequence;
        TextView textView = this.f260F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public void mo347p(CharSequence charSequence) {
        this.f278e = charSequence;
        TextView textView = this.f259E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void mo348q(int i) {
        this.f281h = null;
        this.f282i = i;
        this.f287n = false;
    }

    /* renamed from: r */
    public void mo349r(View view) {
        this.f281h = view;
        this.f282i = 0;
        this.f287n = false;
    }

    /* renamed from: s */
    public void mo350s(View view, int i, int i2, int i3, int i4) {
        this.f281h = view;
        this.f282i = 0;
        this.f287n = true;
        this.f283j = i;
        this.f284k = i2;
        this.f285l = i3;
        this.f286m = i4;
    }
}
