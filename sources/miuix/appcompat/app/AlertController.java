package miuix.appcompat.app;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.C0160k;
import androidx.core.view.C0727l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.Folme;
import miuix.appcompat.app.C2112p;
import miuix.appcompat.internal.widget.DialogButtonPanel;
import miuix.appcompat.internal.widget.DialogParentPanel2;
import miuix.appcompat.internal.widget.DialogRootView;
import miuix.appcompat.internal.widget.NestedScrollViewExpander;
import miuix.core.util.SystemProperties;
import miuix.internal.widget.GroupButton;
import miuix.view.C2400e;
import miuix.view.C2401f;
import p018c2.C1347c;
import p018c2.C1348d;
import p018c2.C1349e;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1356l;
import p018c2.C1357m;
import p055i3.C1648b;
import p055i3.C1649c;
import p055i3.C1652f;
import p055i3.C1653g;
import p073l3.C1877a;
import p073l3.C1878b;
import p086n4.C2453e;
import p102q2.C2583b;
import p117t2.C2693a;
import p117t2.C2698f;
import p117t2.C2711k;
import p117t2.C2715o;
import p137x2.C2901a;

class AlertController {

    /* renamed from: A */
    Button f7508A;

    /* renamed from: A0 */
    private C2112p.C2117e f7509A0;

    /* renamed from: B */
    private CharSequence f7510B;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public C2112p.C2116d f7511B0;

    /* renamed from: C */
    Message f7512C;

    /* renamed from: C0 */
    private C2112p.C2116d f7513C0 = new C2112p.C2116d() {
        public void onShowAnimComplete() {
            boolean unused = AlertController.this.f7564j0 = false;
            if (AlertController.this.f7511B0 != null) {
                AlertController.this.f7511B0.onShowAnimComplete();
            }
        }

        public void onShowAnimStart() {
            boolean unused = AlertController.this.f7564j0 = true;
            if (AlertController.this.f7511B0 != null) {
                AlertController.this.f7511B0.onShowAnimStart();
            }
        }
    };

    /* renamed from: D */
    Button f7514D;

    /* renamed from: D0 */
    private boolean f7515D0;

    /* renamed from: E */
    private CharSequence f7516E;

    /* renamed from: E0 */
    private int f7517E0;

    /* renamed from: F */
    Message f7518F;

    /* renamed from: F0 */
    private final Thread f7519F0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public List<ButtonInfo> f7520G;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public boolean f7521G0;

    /* renamed from: H */
    private int f7522H = 0;

    /* renamed from: H0 */
    private final View.OnClickListener f7523H0 = new View.OnClickListener() {
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            if (r1 != null) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
            if (((miuix.internal.widget.GroupButton) r6).mo8706b() != false) goto L_0x0011;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            if (r1 != null) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r6) {
            /*
                r5 = this;
                int r0 = miuix.view.C2403h.f9368g
                miuix.appcompat.app.AlertController r1 = miuix.appcompat.app.AlertController.this
                android.widget.Button r2 = r1.f7591x
                r3 = 0
                if (r6 != r2) goto L_0x0014
                android.os.Message r0 = r1.f7595z
                if (r0 == 0) goto L_0x0011
                android.os.Message r3 = android.os.Message.obtain(r0)
            L_0x0011:
                int r0 = miuix.view.C2403h.f9367f
                goto L_0x0071
            L_0x0014:
                android.widget.Button r2 = r1.f7508A
                if (r6 != r2) goto L_0x0021
                android.os.Message r1 = r1.f7512C
                if (r1 == 0) goto L_0x0071
            L_0x001c:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0071
            L_0x0021:
                android.widget.Button r2 = r1.f7514D
                if (r6 != r2) goto L_0x002a
                android.os.Message r1 = r1.f7518F
                if (r1 == 0) goto L_0x0071
                goto L_0x001c
            L_0x002a:
                java.util.List r1 = r1.f7520G
                if (r1 == 0) goto L_0x0063
                miuix.appcompat.app.AlertController r1 = miuix.appcompat.app.AlertController.this
                java.util.List r1 = r1.f7520G
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x0063
                miuix.appcompat.app.AlertController r1 = miuix.appcompat.app.AlertController.this
                java.util.List r1 = r1.f7520G
                java.util.Iterator r1 = r1.iterator()
            L_0x0046:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r1.next()
                miuix.appcompat.app.AlertController$ButtonInfo r2 = (miuix.appcompat.app.AlertController.ButtonInfo) r2
                miuix.internal.widget.GroupButton r4 = r2.mButton
                if (r6 != r4) goto L_0x0046
                android.os.Message r1 = r2.mMsg
                if (r1 == 0) goto L_0x0062
                android.os.Message r1 = android.os.Message.obtain(r1)
            L_0x0062:
                r3 = r1
            L_0x0063:
                boolean r1 = r6 instanceof miuix.internal.widget.GroupButton
                if (r1 == 0) goto L_0x0071
                r1 = r6
                miuix.internal.widget.GroupButton r1 = (miuix.internal.widget.GroupButton) r1
                boolean r1 = r1.mo8706b()
                if (r1 == 0) goto L_0x0071
                goto L_0x0011
            L_0x0071:
                int r1 = miuix.view.C2403h.f9387z
                miuix.view.HapticCompat.performHapticFeedbackAsync(r6, r1, r0)
                if (r3 == 0) goto L_0x007b
                r3.sendToTarget()
            L_0x007b:
                miuix.appcompat.app.AlertController r6 = miuix.appcompat.app.AlertController.this
                android.os.Handler r6 = r6.f7542X
                r0 = -1651327837(0xffffffff9d92bca3, float:-3.8840924E-21)
                r6.sendEmptyMessage(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.AlertController.C20593.onClick(android.view.View):void");
        }
    };

    /* renamed from: I */
    private Drawable f7524I;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public int f7525I0;

    /* renamed from: J */
    private boolean f7526J;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public boolean f7527J0 = false;

    /* renamed from: K */
    private TextView f7528K;

    /* renamed from: K0 */
    private boolean f7529K0;

    /* renamed from: L */
    private TextView f7530L;

    /* renamed from: M */
    private TextView f7531M;

    /* renamed from: N */
    private View f7532N;

    /* renamed from: O */
    private TextView f7533O = null;

    /* renamed from: P */
    ListAdapter f7534P;

    /* renamed from: Q */
    int f7535Q = -1;

    /* renamed from: R */
    private final int f7536R;

    /* renamed from: S */
    int f7537S;

    /* renamed from: T */
    int f7538T;

    /* renamed from: U */
    int f7539U;

    /* renamed from: V */
    int f7540V;

    /* renamed from: W */
    private final boolean f7541W;

    /* renamed from: X */
    Handler f7542X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public DialogRootView f7543Y;

    /* renamed from: Z */
    private View f7544Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f7545a = false;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public DialogParentPanel2 f7546a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f7547b;

    /* renamed from: b0 */
    private boolean f7548b0;

    /* renamed from: c */
    final C0160k f7549c;

    /* renamed from: c0 */
    private final LayoutChangeListener f7550c0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Window f7551d;

    /* renamed from: d0 */
    private boolean f7552d0 = true;

    /* renamed from: e */
    private boolean f7553e;

    /* renamed from: e0 */
    private boolean f7554e0 = true;

    /* renamed from: f */
    boolean f7555f;

    /* renamed from: f0 */
    boolean f7556f0;

    /* renamed from: g */
    private CharSequence f7557g;

    /* renamed from: g0 */
    private int f7558g0 = 0;

    /* renamed from: h */
    private CharSequence f7559h;

    /* renamed from: h0 */
    private boolean f7560h0;

    /* renamed from: i */
    private CharSequence f7561i;

    /* renamed from: i0 */
    private boolean f7562i0;

    /* renamed from: j */
    ListView f7563j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public boolean f7564j0;

    /* renamed from: k */
    private View f7565k;

    /* renamed from: k0 */
    private int f7566k0;

    /* renamed from: l */
    private int f7567l;

    /* renamed from: l0 */
    private int f7568l0;

    /* renamed from: m */
    private View f7569m;

    /* renamed from: m0 */
    private WindowManager f7570m0;

    /* renamed from: n */
    private int f7571n;

    /* renamed from: n0 */
    private int f7572n0;

    /* renamed from: o */
    private int f7573o;

    /* renamed from: o0 */
    private float f7574o0 = 18.0f;

    /* renamed from: p */
    private int f7575p;

    /* renamed from: p0 */
    private float f7576p0 = 17.0f;

    /* renamed from: q */
    private int f7577q;

    /* renamed from: q0 */
    private float f7578q0 = 14.0f;

    /* renamed from: r */
    private int f7579r;

    /* renamed from: r0 */
    private float f7580r0 = 18.0f;

    /* renamed from: s */
    private int f7581s = -1;

    /* renamed from: s0 */
    private Point f7582s0 = new Point();

    /* renamed from: t */
    private boolean f7583t = false;

    /* renamed from: t0 */
    private Point f7584t0 = new Point();

    /* renamed from: u */
    private boolean f7585u = false;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public Point f7586u0 = new Point();

    /* renamed from: v */
    private int f7587v = -2;

    /* renamed from: v0 */
    private Rect f7588v0 = new Rect();

    /* renamed from: w */
    private TextWatcher f7589w = new TextWatcher() {
        public void afterTextChanged(Editable editable) {
            if (AlertController.this.f7546a0 != null) {
                DialogParentPanel2 c = AlertController.this.f7546a0;
                int i = C1352h.f4735v;
                if (c.findViewById(i) != null) {
                    AlertController.this.f7546a0.findViewById(i).requestLayout();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: w0 */
    private Configuration f7590w0;

    /* renamed from: x */
    Button f7591x;

    /* renamed from: x0 */
    private boolean f7592x0;

    /* renamed from: y */
    private CharSequence f7593y;

    /* renamed from: y0 */
    private CharSequence f7594y0;

    /* renamed from: z */
    Message f7595z;

    /* renamed from: z0 */
    private C2112p.C2115c f7596z0;

    static class AlertParams {
        ListAdapter mAdapter;
        boolean mCancelable;
        CharSequence mCheckBoxMessage;
        int mCheckedItem = -1;
        boolean[] mCheckedItems;
        CharSequence mComment;
        final Context mContext;
        Cursor mCursor;
        View mCustomTitleView;
        boolean mEnableDialogImmersive;
        boolean mEnableEnterAnim;
        List<ButtonInfo> mExtraButtonList;
        boolean mHapticFeedbackEnabled;
        Drawable mIcon;
        int mIconAttrId = 0;
        int mIconId = 0;
        final LayoutInflater mInflater;
        boolean mIsChecked;
        String mIsCheckedColumn;
        boolean mIsMultiChoice;
        boolean mIsSingleChoice;
        CharSequence[] mItems;
        String mLabelColumn;
        int mLiteVersion;
        CharSequence mMessage;
        DialogInterface.OnClickListener mNegativeButtonListener;
        CharSequence mNegativeButtonText;
        DialogInterface.OnClickListener mNeutralButtonListener;
        CharSequence mNeutralButtonText;
        int mNonImmersiveDialogHeight;
        DialogInterface.OnCancelListener mOnCancelListener;
        DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        DialogInterface.OnClickListener mOnClickListener;
        C2112p.C2116d mOnDialogShowAnimListener;
        DialogInterface.OnDismissListener mOnDismissListener;
        AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        DialogInterface.OnKeyListener mOnKeyListener;
        OnPrepareListViewListener mOnPrepareListViewListener;
        DialogInterface.OnShowListener mOnShowListener;
        C2112p.C2117e mPanelSizeChangedListener;
        DialogInterface.OnClickListener mPositiveButtonListener;
        CharSequence mPositiveButtonText;
        boolean mPreferLandscape;
        boolean mSmallIcon;
        CharSequence mTitle;
        View mView;
        int mViewLayoutResId;

        interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        AlertParams(Context context) {
            this.mContext = context;
            this.mCancelable = true;
            this.mEnableDialogImmersive = !C1652f.m6973a();
            this.mNonImmersiveDialogHeight = -2;
            int s = C2901a.m11988s();
            this.mLiteVersion = s;
            if (s < 0) {
                this.mLiteVersion = 0;
            }
            this.mEnableEnterAnim = true;
            this.mExtraButtonList = new ArrayList();
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r0v25, types: [miuix.appcompat.app.AlertController$AlertParams$3] */
        /* JADX WARNING: type inference failed for: r0v26, types: [miuix.appcompat.app.AlertController$AlertParams$2] */
        /* JADX WARNING: type inference failed for: r0v27, types: [miuix.appcompat.app.AlertController$AlertParams$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createListView(final miuix.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.mInflater
                int r1 = r12.f7537S
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                r7 = r0
                android.widget.ListView r7 = (android.widget.ListView) r7
                boolean r0 = r11.mIsMultiChoice
                r8 = 1
                if (r0 == 0) goto L_0x0036
                android.database.Cursor r0 = r11.mCursor
                if (r0 != 0) goto L_0x0027
                miuix.appcompat.app.AlertController$AlertParams$1 r9 = new miuix.appcompat.app.AlertController$AlertParams$1
                android.content.Context r2 = r11.mContext
                int r3 = r12.f7538T
                r4 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r5 = r11.mItems
                r0 = r9
                r1 = r11
                r6 = r7
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x006d
            L_0x0027:
                miuix.appcompat.app.AlertController$AlertParams$2 r9 = new miuix.appcompat.app.AlertController$AlertParams$2
                android.content.Context r2 = r11.mContext
                android.database.Cursor r3 = r11.mCursor
                r4 = 0
                r0 = r9
                r1 = r11
                r5 = r7
                r6 = r12
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x006d
            L_0x0036:
                boolean r0 = r11.mIsSingleChoice
                if (r0 == 0) goto L_0x003d
                int r0 = r12.f7539U
                goto L_0x003f
            L_0x003d:
                int r0 = r12.f7540V
            L_0x003f:
                r3 = r0
                android.database.Cursor r0 = r11.mCursor
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r0 == 0) goto L_0x005f
                miuix.appcompat.app.AlertController$AlertParams$3 r9 = new miuix.appcompat.app.AlertController$AlertParams$3
                android.content.Context r2 = r11.mContext
                android.database.Cursor r4 = r11.mCursor
                java.lang.String[] r5 = new java.lang.String[r8]
                java.lang.String r0 = r11.mLabelColumn
                r6 = 0
                r5[r6] = r0
                int[] r10 = new int[r8]
                r10[r6] = r1
                r0 = r9
                r1 = r11
                r6 = r10
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x006d
            L_0x005f:
                android.widget.ListAdapter r9 = r11.mAdapter
                if (r9 == 0) goto L_0x0064
                goto L_0x006d
            L_0x0064:
                miuix.appcompat.app.AlertController$CheckedItemAdapter r9 = new miuix.appcompat.app.AlertController$CheckedItemAdapter
                android.content.Context r0 = r11.mContext
                java.lang.CharSequence[] r2 = r11.mItems
                r9.<init>(r0, r3, r1, r2)
            L_0x006d:
                miuix.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r0 = r11.mOnPrepareListViewListener
                if (r0 == 0) goto L_0x0074
                r0.onPrepareListView(r7)
            L_0x0074:
                r12.f7534P = r9
                int r0 = r11.mCheckedItem
                r12.f7535Q = r0
                android.content.DialogInterface$OnClickListener r0 = r11.mOnClickListener
                if (r0 == 0) goto L_0x0087
                miuix.appcompat.app.AlertController$AlertParams$4 r0 = new miuix.appcompat.app.AlertController$AlertParams$4
                r0.<init>(r12)
            L_0x0083:
                r7.setOnItemClickListener(r0)
                goto L_0x0091
            L_0x0087:
                android.content.DialogInterface$OnMultiChoiceClickListener r0 = r11.mOnCheckboxClickListener
                if (r0 == 0) goto L_0x0091
                miuix.appcompat.app.AlertController$AlertParams$5 r0 = new miuix.appcompat.app.AlertController$AlertParams$5
                r0.<init>(r7, r12)
                goto L_0x0083
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r0 = r11.mOnItemSelectedListener
                if (r0 == 0) goto L_0x0098
                r7.setOnItemSelectedListener(r0)
            L_0x0098:
                boolean r0 = r11.mIsSingleChoice
                if (r0 == 0) goto L_0x00a0
                r7.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r0 = r11.mIsMultiChoice
                if (r0 == 0) goto L_0x00a8
                r0 = 2
                r7.setChoiceMode(r0)
            L_0x00a8:
                r12.f7563j = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.AlertController.AlertParams.createListView(miuix.appcompat.app.AlertController):void");
        }

        /* access modifiers changed from: package-private */
        public void apply(AlertController alertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.mo7288E0(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.mo7301P0(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.mo7292I0(drawable);
                }
                int i = this.mIconId;
                if (i != 0) {
                    alertController.mo7291H0(i);
                }
                int i2 = this.mIconAttrId;
                if (i2 != 0) {
                    alertController.mo7291H0(alertController.mo7303R(i2));
                }
                if (this.mSmallIcon) {
                    alertController.mo7302Q0(true);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.mo7295K0(charSequence2);
            }
            CharSequence charSequence3 = this.mComment;
            if (charSequence3 != null) {
                alertController.mo7287D0(charSequence3);
            }
            CharSequence charSequence4 = this.mPositiveButtonText;
            if (charSequence4 != null) {
                alertController.mo7315z0(-1, charSequence4, this.mPositiveButtonListener, (Message) null);
            }
            CharSequence charSequence5 = this.mNegativeButtonText;
            if (charSequence5 != null) {
                alertController.mo7315z0(-2, charSequence5, this.mNegativeButtonListener, (Message) null);
            }
            CharSequence charSequence6 = this.mNeutralButtonText;
            if (charSequence6 != null) {
                alertController.mo7315z0(-3, charSequence6, this.mNeutralButtonListener, (Message) null);
            }
            if (this.mExtraButtonList != null) {
                List unused = alertController.f7520G = new ArrayList(this.mExtraButtonList);
            }
            if (!(this.mItems == null && this.mCursor == null && this.mAdapter == null)) {
                createListView(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                alertController.mo7306S0(view2);
            } else {
                int i3 = this.mViewLayoutResId;
                if (i3 != 0) {
                    alertController.mo7304R0(i3);
                }
            }
            CharSequence charSequence7 = this.mCheckBoxMessage;
            if (charSequence7 != null) {
                alertController.mo7286C0(this.mIsChecked, charSequence7);
            }
            alertController.f7556f0 = this.mHapticFeedbackEnabled;
            alertController.mo7290G0(this.mEnableDialogImmersive);
            alertController.mo7297L0(this.mNonImmersiveDialogHeight);
            alertController.mo7293J0(this.mLiteVersion);
            alertController.mo7299N0(this.mPreferLandscape);
            alertController.mo7298M0(this.mPanelSizeChangedListener);
            alertController.mo7289F0(this.mEnableEnterAnim);
        }
    }

    private static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = -1651327837;
        private final WeakReference<DialogInterface> mDialog;

        ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            DialogInterface dialogInterface = this.mDialog.get();
            int i = message.what;
            if (i != MSG_DISMISS_DIALOG) {
                ((DialogInterface.OnClickListener) message.obj).onClick(dialogInterface, i);
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    static class ButtonInfo {
        /* access modifiers changed from: private */
        public GroupButton mButton;
        /* access modifiers changed from: private */
        public Message mMsg;
        /* access modifiers changed from: private */
        public final DialogInterface.OnClickListener mOnClickListener;
        /* access modifiers changed from: private */
        public final int mStyle;
        /* access modifiers changed from: private */
        public final CharSequence mText;
        /* access modifiers changed from: private */
        public final int mWhich;

        ButtonInfo(CharSequence charSequence, int i, DialogInterface.OnClickListener onClickListener, int i2) {
            this.mText = charSequence;
            this.mStyle = i;
            this.mMsg = null;
            this.mOnClickListener = onClickListener;
            this.mWhich = i2;
        }

        ButtonInfo(CharSequence charSequence, int i, Message message) {
            this.mText = charSequence;
            this.mStyle = i;
            this.mMsg = message;
            this.mOnClickListener = null;
            this.mWhich = 0;
        }
    }

    private static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public CheckedItemAdapter(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view == null) {
                C1648b.m6952a(view2);
            }
            return view2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    private static class LayoutChangeListener implements View.OnLayoutChangeListener {
        private final WeakReference<AlertController> mHost;
        private final Rect mWindowVisibleFrame = new Rect();

        LayoutChangeListener(AlertController alertController) {
            this.mHost = new WeakReference<>(alertController);
        }

        private void changeViewPadding(View view, int i, int i2) {
            view.setPadding(i, 0, i2, 0);
        }

        private void handleImeChange(View view, Rect rect, AlertController alertController) {
            int height = (view.getHeight() - alertController.m8117N()) - rect.bottom;
            int i = 0;
            if (height > 0) {
                int i2 = -height;
                int i3 = Build.VERSION.SDK_INT;
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    i = i3 >= 30 ? rootWindowInsets.getInsets(WindowInsets$Type.systemBars()).bottom : rootWindowInsets.getSystemWindowInsetBottom();
                }
                i += i2;
                C2583b.m10995a();
            }
            alertController.m8158i1(i);
        }

        private void handleMultiWindowLandscapeChange(AlertController alertController, int i) {
            DialogRootView dialogRootView;
            if (C2698f.m11283k(alertController.f7547b)) {
                Rect rect = this.mWindowVisibleFrame;
                if (rect.left > 0) {
                    int width = i - rect.width();
                    int i2 = this.mWindowVisibleFrame.right;
                    DialogRootView A = alertController.f7543Y;
                    if (i2 == i) {
                        changeViewPadding(A, width, 0);
                        return;
                    } else {
                        changeViewPadding(A, 0, width);
                        return;
                    }
                } else {
                    dialogRootView = alertController.f7543Y;
                }
            } else {
                dialogRootView = alertController.f7543Y;
                if (dialogRootView.getPaddingLeft() <= 0 && dialogRootView.getPaddingRight() <= 0) {
                    return;
                }
            }
            changeViewPadding(dialogRootView, 0, 0);
        }

        public boolean hasNavigationBarHeightInMultiWindowMode() {
            C2715o.m11331b(this.mHost.get().f7547b, this.mHost.get().f7586u0);
            Rect rect = this.mWindowVisibleFrame;
            return (rect.left == 0 && rect.right == this.mHost.get().f7586u0.x && this.mWindowVisibleFrame.top <= C2693a.m11237f(this.mHost.get().f7547b, false)) ? false : true;
        }

        public boolean isInMultiScreenTop() {
            AlertController alertController = this.mHost.get();
            if (alertController == null) {
                return false;
            }
            C2715o.m11331b(alertController.f7547b, alertController.f7586u0);
            Rect rect = this.mWindowVisibleFrame;
            if (rect.left != 0 || rect.right != alertController.f7586u0.x) {
                return false;
            }
            int i = (int) (((float) alertController.f7586u0.y) * 0.75f);
            Rect rect2 = this.mWindowVisibleFrame;
            return rect2.top >= 0 && rect2.bottom <= i;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AlertController alertController = this.mHost.get();
            if (alertController != null) {
                view.getWindowVisibleDisplayFrame(this.mWindowVisibleFrame);
                handleMultiWindowLandscapeChange(alertController, i3);
                if (Build.VERSION.SDK_INT >= 30) {
                    return;
                }
                if (view.findFocus() != null) {
                    if (!alertController.m8145e0()) {
                        handleImeChange(view, this.mWindowVisibleFrame, alertController);
                    }
                } else if (alertController.f7546a0.getTranslationY() < 0.0f) {
                    alertController.m8158i1(0);
                }
            }
        }
    }

    public AlertController(Context context, C0160k kVar, Window window) {
        this.f7547b = context;
        this.f7572n0 = context.getResources().getConfiguration().densityDpi;
        this.f7549c = kVar;
        this.f7551d = window;
        this.f7555f = true;
        this.f7542X = new ButtonHandler(kVar);
        this.f7550c0 = new LayoutChangeListener(this);
        this.f7515D0 = !C1652f.m6973a();
        m8128X(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1357m.f4884W, 16842845, 0);
        this.f7536R = obtainStyledAttributes.getResourceId(C1357m.f4892Y, 0);
        this.f7537S = obtainStyledAttributes.getResourceId(C1357m.f4901a0, 0);
        this.f7538T = obtainStyledAttributes.getResourceId(C1357m.f4906b0, 0);
        this.f7539U = obtainStyledAttributes.getResourceId(C1357m.f4921e0, 0);
        this.f7540V = obtainStyledAttributes.getResourceId(C1357m.f4896Z, 0);
        this.f7541W = obtainStyledAttributes.getBoolean(C1357m.f4916d0, true);
        obtainStyledAttributes.recycle();
        kVar.mo569k(1);
        if (Build.VERSION.SDK_INT < 28 && m8157i0()) {
            C1653g.m6974a(window, "addExtraFlags", new Class[]{Integer.TYPE}, 768);
        }
        this.f7560h0 = context.getResources().getBoolean(C1348d.f4596d);
        this.f7573o = context.getResources().getDimensionPixelSize(C1350f.f4617M);
        this.f7575p = context.getResources().getDimensionPixelSize(C1350f.f4618N);
        this.f7519F0 = Thread.currentThread();
        m8140c0();
        if (this.f7545a) {
            Log.d("AlertController", "create Dialog mCurrentDensityDpi " + this.f7572n0);
        }
    }

    /* renamed from: C */
    private void m8108C() {
        ViewGroup.LayoutParams layoutParams = this.f7563j.getLayoutParams();
        layoutParams.height = -2;
        this.f7563j.setLayoutParams(layoutParams);
    }

    /* renamed from: D */
    static boolean m8109D(View view) {
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
            if (m8109D(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private void m8110E(TextView textView) {
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), 0);
    }

    /* renamed from: F */
    private void m8111F() {
        View currentFocus = this.f7551d.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
            m8126W();
        }
    }

    /* renamed from: G */
    private boolean m8112G() {
        return this.f7519F0 == Thread.currentThread();
    }

    /* renamed from: H */
    private void m8113H() {
        if (this.f7529K0) {
            this.f7551d.getDecorView().setWindowInsetsAnimationCallback((WindowInsetsAnimation$Callback) null);
            this.f7551d.getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
            this.f7529K0 = false;
        }
    }

    /* renamed from: I */
    private void m8114I(View view) {
        if (!(view instanceof DialogParentPanel2) && view != null) {
            int i = 0;
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        m8114I(viewGroup.getChildAt(i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: J */
    private void m8115J(View view) {
        C2400e.m10241b(view, false);
    }

    /* renamed from: M */
    private int m8116M(int i, int i2) {
        return i2 == 0 ? i == 2 ? 2 : 1 : i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public int m8117N() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public int m8118O() {
        int[] iArr = new int[2];
        this.f7546a0.getLocationInWindow(iArr);
        if (this.f7581s == -1) {
            this.f7581s = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4616L);
        }
        return (this.f7551d.getDecorView().getHeight() - (iArr[1] + this.f7546a0.getHeight())) - this.f7581s;
    }

    /* renamed from: P */
    private int m8119P() {
        int i;
        Resources resources;
        if (this.f7584t0.x < 360) {
            resources = this.f7547b.getResources();
            i = C1350f.f4621Q;
        } else {
            resources = this.f7547b.getResources();
            i = C1350f.f4620P;
        }
        return resources.getDimensionPixelSize(i);
    }

    /* renamed from: Q */
    private int m8120Q() {
        return m8166l0() ? 17 : 81;
    }

    /* renamed from: T */
    private int m8121T(boolean z, boolean z2) {
        int i;
        int i2 = C1354j.f4774q;
        this.f7548b0 = false;
        if (!this.f7521G0 || !m8152g1()) {
            i = z2 ? this.f7573o : z ? this.f7560h0 ? this.f7568l0 : this.f7566k0 : -1;
        } else {
            i2 = C1354j.f4775r;
            this.f7548b0 = true;
            i = this.f7575p;
        }
        if (this.f7571n != i2) {
            this.f7571n = i2;
            DialogParentPanel2 dialogParentPanel2 = this.f7546a0;
            if (dialogParentPanel2 != null) {
                this.f7543Y.removeView(dialogParentPanel2);
            }
            DialogParentPanel2 dialogParentPanel22 = (DialogParentPanel2) LayoutInflater.from(this.f7547b).inflate(this.f7571n, this.f7543Y, false);
            this.f7546a0 = dialogParentPanel22;
            this.f7543Y.addView(dialogParentPanel22);
        }
        return i;
    }

    /* renamed from: T0 */
    private void m8122T0(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f7591x = button;
        button.setOnClickListener(this.f7523H0);
        this.f7591x.removeTextChangedListener(this.f7589w);
        this.f7591x.addTextChangedListener(this.f7589w);
        boolean z = true;
        if (TextUtils.isEmpty(this.f7593y)) {
            this.f7591x.setVisibility(8);
            i = 0;
        } else {
            this.f7591x.setText(this.f7593y);
            this.f7591x.setVisibility(0);
            m8115J(this.f7591x);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f7508A = button2;
        button2.setOnClickListener(this.f7523H0);
        this.f7508A.removeTextChangedListener(this.f7589w);
        this.f7508A.addTextChangedListener(this.f7589w);
        if (TextUtils.isEmpty(this.f7510B)) {
            this.f7508A.setVisibility(8);
        } else {
            this.f7508A.setText(this.f7510B);
            this.f7508A.setVisibility(0);
            i++;
            m8115J(this.f7508A);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f7514D = button3;
        button3.setOnClickListener(this.f7523H0);
        this.f7514D.removeTextChangedListener(this.f7589w);
        this.f7514D.addTextChangedListener(this.f7589w);
        if (TextUtils.isEmpty(this.f7516E)) {
            this.f7514D.setVisibility(8);
        } else {
            this.f7514D.setText(this.f7516E);
            this.f7514D.setVisibility(0);
            i++;
            m8115J(this.f7514D);
        }
        List<ButtonInfo> list = this.f7520G;
        if (list != null && !list.isEmpty()) {
            for (ButtonInfo next : this.f7520G) {
                if (next.mButton != null) {
                    m8197y0(next.mButton);
                }
            }
            for (ButtonInfo next2 : this.f7520G) {
                if (next2.mButton == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    GroupButton unused = next2.mButton = new GroupButton(this.f7547b, (AttributeSet) null, next2.mStyle);
                    next2.mButton.setText(next2.mText);
                    next2.mButton.setOnClickListener(this.f7523H0);
                    next2.mButton.setLayoutParams(layoutParams);
                    next2.mButton.setMaxLines(2);
                    next2.mButton.setGravity(17);
                }
                if (next2.mMsg == null) {
                    Message unused2 = next2.mMsg = this.f7542X.obtainMessage(next2.mWhich, next2.mOnClickListener);
                }
                if (next2.mButton.getVisibility() != 8) {
                    i++;
                    m8115J(next2.mButton);
                }
                viewGroup.addView(next2.mButton);
            }
        }
        if (i == 0) {
            viewGroup.setVisibility(8);
        } else {
            ((DialogButtonPanel) viewGroup).setForceVertical(this.f7548b0);
            viewGroup.invalidate();
        }
        Point point = new Point();
        C2715o.m11331b(this.f7547b, point);
        int max = Math.max(point.x, point.y);
        ViewGroup viewGroup2 = (ViewGroup) this.f7546a0.findViewById(C1352h.f4738y);
        if (((float) this.f7582s0.y) > ((float) max) * 0.3f) {
            z = false;
        }
        if (this.f7548b0) {
            return;
        }
        if (!z) {
            m8195x0(viewGroup, this.f7546a0);
            return;
        }
        m8195x0(viewGroup, viewGroup2);
        ((NestedScrollViewExpander) viewGroup2).setExpandView((View) null);
    }

    /* renamed from: U */
    private int m8123U() {
        WindowManager windowManager = this.f7570m0;
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        return (rotation == 1 || rotation == 3) ? 2 : 1;
    }

    /* renamed from: U0 */
    private void m8124U0(ViewGroup viewGroup, ViewStub viewStub) {
        if (this.f7594y0 != null) {
            viewStub.inflate();
            CheckBox checkBox = (CheckBox) viewGroup.findViewById(16908289);
            checkBox.setVisibility(0);
            checkBox.setChecked(this.f7562i0);
            checkBox.setText(this.f7594y0);
            TextView textView = this.f7530L;
            if (textView != null) {
                textView.setTextAlignment(2);
            }
            TextView textView2 = this.f7531M;
            if (textView2 != null) {
                textView2.setTextAlignment(2);
            }
        }
    }

    /* renamed from: V0 */
    private void m8125V0(ViewGroup viewGroup, boolean z) {
        View childAt;
        LinearLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(16908331);
        LinearLayout linearLayout = null;
        boolean z2 = false;
        if (frameLayout != null) {
            if (z) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(0, 200);
                layoutTransition.setInterpolator(0, new C2453e());
                frameLayout.setLayoutTransition(layoutTransition);
            } else {
                frameLayout.setLayoutTransition((LayoutTransition) null);
            }
        }
        if (this.f7563j != null) {
            if (frameLayout != null ? m8129X0(frameLayout) : false) {
                int i = C1352h.f4739z;
                viewGroup.removeView(viewGroup.findViewById(i));
                m8197y0(frameLayout);
                LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
                linearLayout2.setOrientation(1);
                m8197y0(this.f7563j);
                C0727l0.m2896j0(this.f7563j, true);
                linearLayout2.addView(this.f7563j, 0, new ViewGroup.MarginLayoutParams(-1, -2));
                boolean o0 = m8175o0();
                if (!o0) {
                    m8108C();
                    layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                } else {
                    m8193w0();
                    layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
                }
                linearLayout2.addView(frameLayout, layoutParams);
                viewGroup.addView(linearLayout2, 0, new ViewGroup.MarginLayoutParams(-1, -2));
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(i);
                if (viewGroup2 != null) {
                    m8127W0(viewGroup2);
                }
                NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
                if (!o0) {
                    linearLayout = linearLayout2;
                }
                nestedScrollViewExpander.setExpandView(linearLayout);
                return;
            }
            viewGroup.removeView(viewGroup.findViewById(C1352h.f4739z));
            m8197y0(frameLayout);
            m8197y0(this.f7563j);
            this.f7563j.setMinimumHeight(mo7307V());
            C0727l0.m2896j0(this.f7563j, true);
            viewGroup.addView(this.f7563j, 0, new ViewGroup.MarginLayoutParams(-1, -2));
            ((NestedScrollViewExpander) viewGroup).setExpandView(this.f7563j);
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C1352h.f4739z);
        if (viewGroup3 != null) {
            m8127W0(viewGroup3);
        }
        if (frameLayout != null) {
            boolean X0 = m8129X0(frameLayout);
            if (X0 && (childAt = frameLayout.getChildAt(0)) != null) {
                C0727l0.m2896j0(childAt, true);
            }
            z2 = X0;
        }
        NestedScrollViewExpander nestedScrollViewExpander2 = (NestedScrollViewExpander) viewGroup;
        if (!z2) {
            frameLayout = null;
        }
        nestedScrollViewExpander2.setExpandView(frameLayout);
    }

    /* renamed from: W */
    private void m8126W() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f7547b.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f7546a0.getWindowToken(), 0);
        }
    }

    /* renamed from: W0 */
    private void m8127W0(ViewGroup viewGroup) {
        CharSequence charSequence;
        this.f7530L = (TextView) viewGroup.findViewById(C1352h.f4686H);
        this.f7531M = (TextView) viewGroup.findViewById(C1352h.f4737x);
        TextView textView = this.f7530L;
        if (textView == null || (charSequence = this.f7559h) == null) {
            m8197y0(viewGroup);
            return;
        }
        textView.setText(charSequence);
        TextView textView2 = this.f7531M;
        if (textView2 != null) {
            CharSequence charSequence2 = this.f7561i;
            if (charSequence2 != null) {
                textView2.setText(charSequence2);
            } else {
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: X */
    private void m8128X(Context context) {
        this.f7570m0 = (WindowManager) context.getSystemService("window");
        m8178p1();
        this.f7568l0 = context.getResources().getDimensionPixelSize(C1350f.f4635c);
    }

    /* renamed from: X0 */
    private boolean m8129X0(ViewGroup viewGroup) {
        View view = this.f7569m;
        View view2 = null;
        if (!(view == null || view.getParent() == null)) {
            m8197y0(this.f7569m);
            this.f7569m = null;
        }
        View view3 = this.f7565k;
        boolean z = false;
        if (view3 != null) {
            view2 = view3;
        } else if (this.f7567l != 0) {
            view2 = LayoutInflater.from(this.f7547b).inflate(this.f7567l, viewGroup, false);
            this.f7569m = view2;
        }
        if (view2 != null) {
            z = true;
        }
        if (!z || !m8109D(view2)) {
            this.f7551d.setFlags(131072, 131072);
        }
        if (z) {
            m8195x0(view2, viewGroup);
        } else {
            m8197y0(viewGroup);
        }
        return z;
    }

    /* renamed from: Y0 */
    private void m8130Y0() {
        this.f7551d.setLayout(-1, -1);
        this.f7551d.setBackgroundDrawableResource(C1349e.f4604h);
        this.f7551d.setDimAmount(0.0f);
        this.f7551d.setWindowAnimations(C1356l.f4790b);
        this.f7551d.addFlags(-2147481344);
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            Activity t = ((C2112p) this.f7549c).mo7533t();
            if (t != null) {
                this.f7551d.getAttributes().layoutInDisplayCutoutMode = m8116M(m8123U(), t.getWindow().getAttributes().layoutInDisplayCutoutMode);
            } else {
                int i2 = 2;
                if (m8123U() != 2) {
                    i2 = 1;
                }
                this.f7551d.getAttributes().layoutInDisplayCutoutMode = i2;
            }
        }
        m8114I(this.f7551d.getDecorView());
        if (i >= 30) {
            this.f7551d.getAttributes().setFitInsetsSides(0);
            Activity t2 = ((C2112p) this.f7549c).mo7533t();
            if (t2 != null && (t2.getWindow().getAttributes().flags & 1024) == 0) {
                this.f7551d.clearFlags(1024);
            }
        }
    }

    /* renamed from: Z */
    private boolean m8131Z() {
        return this.f7552d0;
    }

    /* renamed from: Z0 */
    private void m8132Z0() {
        int i;
        Window window;
        boolean g0 = m8151g0();
        boolean f1 = m8149f1();
        int T = m8121T(g0, f1);
        int i2 = -1;
        if (!f1 && T == -1) {
            T = this.f7582s0.x - (m8119P() * 2);
        }
        int i3 = this.f7587v;
        if (i3 <= 0 || i3 < this.f7582s0.y) {
            i2 = i3;
        }
        int Q = m8120Q();
        this.f7551d.setGravity(Q);
        if ((Q & 80) > 0) {
            int dimensionPixelSize = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4616L);
            if ((this.f7551d.getAttributes().flags & 134217728) != 0) {
                this.f7551d.clearFlags(134217728);
            }
            this.f7551d.getAttributes().verticalMargin = (((float) dimensionPixelSize) * 1.0f) / ((float) this.f7582s0.y);
        }
        this.f7551d.addFlags(2);
        this.f7551d.addFlags(262144);
        this.f7551d.setDimAmount(0.3f);
        this.f7551d.setLayout(T, i2);
        this.f7551d.setBackgroundDrawableResource(C1349e.f4604h);
        DialogParentPanel2 dialogParentPanel2 = this.f7546a0;
        if (dialogParentPanel2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dialogParentPanel2.getLayoutParams();
            layoutParams.width = T;
            layoutParams.height = -2;
            this.f7546a0.setLayoutParams(layoutParams);
            this.f7546a0.setTag((Object) null);
        }
        if (!this.f7555f) {
            window = this.f7551d;
            i = 0;
        } else if (m8166l0()) {
            window = this.f7551d;
            i = C1356l.f4789a;
        } else {
            return;
        }
        window.setWindowAnimations(i);
    }

    /* renamed from: a0 */
    private boolean m8134a0() {
        return this.f7554e0;
    }

    /* renamed from: a1 */
    private void m8135a1(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) this.f7551d.findViewById(16908294);
        View view = this.f7532N;
        if (view != null) {
            m8197y0(view);
            viewGroup.addView(this.f7532N, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f7551d.findViewById(C1352h.f4733t).setVisibility(8);
            imageView.setVisibility(8);
        } else if (!(!TextUtils.isEmpty(this.f7557g)) || !this.f7541W) {
            this.f7551d.findViewById(C1352h.f4733t).setVisibility(8);
            imageView.setVisibility(8);
            viewGroup.setVisibility(8);
        } else {
            TextView textView = (TextView) this.f7551d.findViewById(C1352h.f4733t);
            this.f7528K = textView;
            textView.setText(this.f7557g);
            int i = this.f7522H;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.f7524I;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    this.f7528K.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom());
                    imageView.setVisibility(8);
                }
            }
            if (this.f7526J) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4615K);
                layoutParams.height = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4614J);
            }
            if (this.f7559h != null && viewGroup.getVisibility() != 8) {
                m8110E(this.f7528K);
            }
        }
    }

    /* renamed from: b0 */
    private boolean m8137b0(Configuration configuration) {
        Configuration configuration2 = this.f7590w0;
        return (configuration2.uiMode != configuration.uiMode) || (configuration2.screenLayout != configuration.screenLayout) || (configuration2.orientation != configuration.orientation) || (configuration2.screenWidthDp != configuration.screenWidthDp) || (configuration2.screenHeightDp != configuration.screenHeightDp) || ((configuration2.fontScale > configuration.fontScale ? 1 : (configuration2.fontScale == configuration.fontScale ? 0 : -1)) != 0) || (configuration2.smallestScreenWidthDp != configuration.smallestScreenWidthDp) || (configuration2.keyboard != configuration.keyboard);
    }

    /* renamed from: b1 */
    private void m8138b1() {
        m8141c1(true, false, false, 1.0f);
        m8155h1();
    }

    /* renamed from: c0 */
    private boolean m8140c0() {
        String str = "";
        try {
            String str2 = SystemProperties.get("log.tag.alertdialog.ime.debug.enable");
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception e) {
            Log.i("AlertController", "can not access property log.tag.alertdialog.ime.enable, undebugable", e);
        }
        Log.d("AlertController", "Alert dialog ime debugEnable = " + str);
        boolean equals = TextUtils.equals("true", str);
        this.f7545a = equals;
        return equals;
    }

    /* renamed from: c1 */
    private void m8141c1(boolean z, boolean z2, boolean z3, final float f) {
        ListAdapter listAdapter;
        if (mo7309d0() || m8163k0()) {
            this.f7544Z.setOnClickListener(new C2106j(this));
            m8167l1();
        } else {
            this.f7544Z.setVisibility(8);
        }
        if (z || z2 || this.f7521G0) {
            ViewGroup viewGroup = (ViewGroup) this.f7546a0.findViewById(C1352h.f4718g0);
            ViewGroup viewGroup2 = (ViewGroup) this.f7546a0.findViewById(C1352h.f4738y);
            ViewGroup viewGroup3 = (ViewGroup) this.f7546a0.findViewById(C1352h.f4735v);
            if (viewGroup2 != null) {
                m8125V0(viewGroup2, z3);
            }
            if (viewGroup3 != null) {
                m8122T0(viewGroup3);
            }
            if (viewGroup != null) {
                m8135a1(viewGroup);
            }
            if ((viewGroup == null || viewGroup.getVisibility() == 8) ? false : true) {
                View view = null;
                if (!(this.f7559h == null && this.f7563j == null)) {
                    view = viewGroup.findViewById(C1352h.f4716f0);
                }
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            ListView listView = this.f7563j;
            if (!(listView == null || (listAdapter = this.f7534P) == null)) {
                listView.setAdapter(listAdapter);
                int i = this.f7535Q;
                if (i > -1) {
                    listView.setItemChecked(i, true);
                    listView.setSelection(i);
                }
            }
            ViewStub viewStub = (ViewStub) this.f7546a0.findViewById(C1352h.f4736w);
            if (viewStub != null) {
                m8124U0(this.f7546a0, viewStub);
            }
            if (!z) {
                m8184s0();
            }
        } else {
            this.f7546a0.post(new Runnable() {
                public void run() {
                    ViewGroup viewGroup = (ViewGroup) AlertController.this.f7546a0.findViewById(C1352h.f4738y);
                    ViewGroup viewGroup2 = (ViewGroup) AlertController.this.f7546a0.findViewById(C1352h.f4735v);
                    if (viewGroup != null) {
                        AlertController.this.m8164k1(viewGroup);
                        if (viewGroup2 != null && !AlertController.this.f7521G0) {
                            AlertController.this.m8161j1(viewGroup2, viewGroup);
                        }
                    }
                    float f = f;
                    if (f != 1.0f) {
                        AlertController.this.m8187t1(f);
                    }
                }
            });
        }
        this.f7546a0.post(new C2107k(this));
    }

    /* renamed from: d1 */
    private void m8143d1() {
        if (mo7309d0()) {
            m8130Y0();
        } else {
            m8132Z0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m8145e0() {
        return C2693a.m11243l(this.f7547b);
    }

    /* renamed from: e1 */
    private void m8146e1() {
        if (mo7309d0()) {
            this.f7551d.setSoftInputMode((this.f7551d.getAttributes().softInputMode & 15) | 48);
            this.f7551d.getDecorView().setWindowInsetsAnimationCallback(new WindowInsetsAnimation$Callback(1) {
                boolean isTablet = false;

                public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                    super.onEnd(windowInsetsAnimation);
                    boolean unused = AlertController.this.f7527J0 = true;
                    WindowInsets rootWindowInsets = AlertController.this.f7551d.getDecorView().getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        Insets a = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                        if (a.bottom <= 0 && AlertController.this.f7546a0.getTranslationY() < 0.0f) {
                            AlertController.this.m8158i1(0);
                        }
                        AlertController.this.m8180q1(rootWindowInsets);
                        if (!this.isTablet) {
                            AlertController.this.m8176o1(a.bottom);
                        }
                    }
                }

                public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                    super.onPrepare(windowInsetsAnimation);
                    C2583b.m10995a();
                    boolean unused = AlertController.this.f7527J0 = false;
                    this.isTablet = AlertController.this.m8166l0();
                }

                public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                    Insets a = windowInsets.getInsets(WindowInsets$Type.ime());
                    Insets a2 = windowInsets.getInsets(WindowInsets$Type.navigationBars());
                    int max = a.bottom - Math.max(AlertController.this.f7525I0, a2.bottom);
                    if (windowInsets.isVisible(WindowInsets$Type.ime())) {
                        if (AlertController.this.f7545a) {
                            Log.d("AlertController", "WindowInsetsAnimation onProgress mPanelAndImeMargin : " + AlertController.this.f7525I0);
                            Log.d("AlertController", "WindowInsetsAnimation onProgress ime : " + a.bottom);
                            Log.d("AlertController", "WindowInsetsAnimation onProgress navigationBar : " + a2.bottom);
                        }
                        AlertController.this.m8158i1(-(max < 0 ? 0 : max));
                    }
                    if (!this.isTablet) {
                        AlertController.this.m8176o1(max);
                    }
                    return windowInsets;
                }

                public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                    AlertController alertController = AlertController.this;
                    int unused = alertController.f7525I0 = (int) (((float) alertController.m8118O()) + AlertController.this.f7546a0.getTranslationY());
                    if (AlertController.this.f7545a) {
                        Log.d("AlertController", "WindowInsetsAnimation onStart mPanelAndImeMargin : " + AlertController.this.f7525I0);
                    }
                    if (AlertController.this.f7525I0 <= 0) {
                        int unused2 = AlertController.this.f7525I0 = 0;
                    }
                    return super.onStart(windowInsetsAnimation, bounds);
                }
            });
            this.f7551d.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                /* access modifiers changed from: private */
                public /* synthetic */ void lambda$onApplyWindowInsets$0(WindowInsets windowInsets) {
                    AlertController.this.m8170m1(windowInsets);
                }

                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    AlertController alertController = AlertController.this;
                    int unused = alertController.f7525I0 = (int) (((float) alertController.m8118O()) + AlertController.this.f7546a0.getTranslationY());
                    if (!(view == null || windowInsets == null)) {
                        view.post(new C2109m(this, windowInsets));
                    }
                    return WindowInsets.CONSUMED;
                }
            });
            this.f7529K0 = true;
        }
    }

    /* renamed from: f0 */
    private boolean m8148f0() {
        return Settings.Secure.getInt(this.f7547b.getContentResolver(), "synergy_mode", 0) == 1;
    }

    /* renamed from: f1 */
    private boolean m8149f1() {
        return this.f7584t0.x >= 394;
    }

    /* renamed from: g0 */
    private boolean m8151g0() {
        return m8154h0(m8123U());
    }

    /* renamed from: g1 */
    private boolean m8152g1() {
        int i = !TextUtils.isEmpty(this.f7510B);
        if (!TextUtils.isEmpty(this.f7516E)) {
            i++;
        }
        if (!TextUtils.isEmpty(this.f7593y)) {
            i++;
        }
        List<ButtonInfo> list = this.f7520G;
        if (list != null) {
            i += list.size();
        }
        if (i == 0) {
            return false;
        }
        Point point = this.f7582s0;
        int i2 = point.x;
        return i2 >= this.f7575p && i2 * 2 > point.y && this.f7521G0;
    }

    /* renamed from: h0 */
    private boolean m8154h0(int i) {
        if (this.f7560h0) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (!m8148f0()) {
            return true;
        }
        C2715o.m11331b(this.f7547b, this.f7586u0);
        Point point = this.f7586u0;
        return point.x > point.y;
    }

    /* renamed from: h1 */
    private void m8155h1() {
        DisplayMetrics displayMetrics = this.f7547b.getResources().getDisplayMetrics();
        float f = displayMetrics.scaledDensity;
        float f2 = displayMetrics.density;
        View view = this.f7532N;
        if (view != null) {
            this.f7533O = (TextView) view.findViewById(16908310);
        }
        TextView textView = this.f7533O;
        if (textView != null) {
            this.f7580r0 = textView.getTextSize();
            int a = Build.VERSION.SDK_INT >= 30 ? this.f7533O.getTextSizeUnit() : 2;
            if (a == 1) {
                this.f7580r0 /= f2;
            } else if (a == 2) {
                this.f7580r0 /= f;
            }
        }
    }

    @Deprecated
    /* renamed from: i0 */
    private boolean m8157i0() {
        Class<?> c = C1653g.m6976c("android.os.SystemProperties");
        Class cls = Integer.TYPE;
        return ((Integer) C1653g.m6975b(c, cls, "getInt", new Class[]{String.class, cls}, "ro.miui.notch", 0)).intValue() == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public void m8158i1(int i) {
        if (this.f7545a) {
            Log.d("AlertController", "The DialogPanel transitionY for : " + i);
        }
        this.f7546a0.animate().cancel();
        this.f7546a0.setTranslationY((float) i);
    }

    /* renamed from: j0 */
    private boolean m8160j0() {
        boolean k = C2698f.m11283k(this.f7547b);
        int i = this.f7547b.getResources().getConfiguration().keyboard;
        boolean z = i == 2 || i == 3;
        boolean z2 = C1877a.f7249b;
        char c = (!k || m8145e0()) ? 65535 : C1878b.m7805b(this.f7547b) ? (char) 0 : 1;
        if (this.f7564j0) {
            if ((z2 && z) || c != 0) {
                return false;
            }
        } else if ((z2 && z) || !this.f7529K0) {
            return false;
        } else {
            if (!this.f7527J0 && !k) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public void m8161j1(ViewGroup viewGroup, ViewGroup viewGroup2) {
        Point point = new Point();
        C2715o.m11331b(this.f7547b, point);
        if (!(((float) this.f7582s0.y) <= ((float) Math.max(point.x, point.y)) * 0.3f)) {
            m8195x0(viewGroup, this.f7546a0);
            return;
        }
        m8195x0(viewGroup, viewGroup2);
        ((NestedScrollViewExpander) viewGroup2).setExpandView((View) null);
    }

    /* renamed from: k0 */
    private boolean m8163k0() {
        return !mo7309d0() && this.f7587v != -2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public void m8164k1(ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(16908331);
        boolean z = frameLayout != null && frameLayout.getChildCount() > 0;
        ListView listView = this.f7563j;
        if (listView == null) {
            if (z) {
                C0727l0.m2896j0(frameLayout.getChildAt(0), true);
            }
            NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
            if (!z) {
                frameLayout = null;
            }
            nestedScrollViewExpander.setExpandView(frameLayout);
        } else if (z) {
            if (!m8175o0()) {
                m8108C();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.height = 0;
                layoutParams.weight = 1.0f;
                frameLayout.setLayoutParams(layoutParams);
                ((NestedScrollViewExpander) viewGroup).setExpandView((View) frameLayout.getParent());
            } else {
                m8193w0();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.weight = 0.0f;
                frameLayout.setLayoutParams(layoutParams2);
                ((NestedScrollViewExpander) viewGroup).setExpandView((View) null);
            }
            viewGroup.requestLayout();
        } else {
            ((NestedScrollViewExpander) viewGroup).setExpandView(listView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public boolean m8166l0() {
        return C1877a.f7249b;
    }

    /* renamed from: l1 */
    private void m8167l1() {
        boolean g0 = m8151g0();
        boolean f1 = m8149f1();
        if (this.f7545a) {
            Log.d("AlertController", "updateDialogPanel isLandScape " + g0);
            Log.d("AlertController", "updateDialogPanel shouldLimitWidth " + f1);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m8121T(g0, f1), -2);
        layoutParams.gravity = m8120Q();
        int P = f1 ? 0 : m8119P();
        layoutParams.rightMargin = P;
        layoutParams.leftMargin = P;
        this.f7577q = P;
        this.f7579r = P;
        this.f7546a0.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m8169m0(View view) {
        if (m8131Z() && m8134a0()) {
            m8126W();
            this.f7549c.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public void m8170m1(WindowInsets windowInsets) {
        m8180q1(windowInsets);
        if (m8160j0()) {
            boolean k = C2698f.m11283k(this.f7547b);
            Insets a = windowInsets.getInsets(WindowInsets$Type.ime());
            Insets a2 = windowInsets.getInsets(WindowInsets$Type.navigationBars());
            if (this.f7545a) {
                Log.d("AlertController", "======================Debug for checkTranslateDialogPanel======================");
                Log.d("AlertController", "The mPanelAndImeMargin: " + this.f7525I0);
                Log.d("AlertController", "The imeInsets info: " + a.toString());
                Log.d("AlertController", "The navigationBarInsets info: " + a2.toString());
                Log.d("AlertController", "The insets info: " + windowInsets);
            }
            boolean l0 = m8166l0();
            if (!l0) {
                m8176o1(a.bottom);
            }
            int i = a.bottom;
            if (k && !l0) {
                i -= a2.bottom;
            }
            m8173n1(i, k, l0);
            if (this.f7545a) {
                Log.d("AlertController", "===================End of Debug for checkTranslateDialogPanel===================");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m8172n0() {
        C2112p.C2117e eVar = this.f7509A0;
        if (eVar != null) {
            eVar.mo7556a((C2112p) this.f7549c, this.f7546a0);
        }
    }

    /* renamed from: n1 */
    private void m8173n1(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (i > 0) {
            int O = (int) (((float) m8118O()) + this.f7546a0.getTranslationY());
            this.f7525I0 = O;
            if (O <= 0) {
                this.f7525I0 = 0;
            }
            if (this.f7545a) {
                Log.d("AlertController", "updateDialogPanelTranslationYByIme mPanelAndImeMargin " + this.f7525I0 + " isMultiWindowMode " + z + " imeBottom " + i);
            }
            int i3 = (!z || z2) ? (-i) + this.f7525I0 : -i;
            if (!z2 || i >= this.f7525I0) {
                i2 = i3;
            }
            if (this.f7564j0) {
                if (this.f7545a) {
                    Log.d("AlertController", "updateDialogPanelTranslationYByIme anim translateDialogPanel Y=" + i2);
                }
                this.f7546a0.animate().cancel();
                this.f7546a0.animate().setDuration(200).translationY((float) i2).start();
                return;
            } else if (this.f7545a) {
                Log.d("AlertController", "updateDialogPanelTranslationYByIme translateDialogPanel Y=" + i2);
            }
        } else {
            if (this.f7545a) {
                Log.d("AlertController", "updateDialogPanelTranslationYByIme imeBottom <= 0");
            }
            if (this.f7546a0.getTranslationY() >= 0.0f) {
                return;
            }
        }
        m8158i1(i2);
    }

    /* renamed from: o0 */
    private boolean m8175o0() {
        return mo7307V() * this.f7534P.getCount() > ((int) (((float) this.f7582s0.y) * 0.35f));
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public void m8176o1(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7544Z.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            this.f7544Z.requestLayout();
        }
    }

    /* renamed from: p1 */
    private void m8178p1() {
        Configuration configuration = this.f7547b.getResources().getConfiguration();
        int min = (int) (((float) Math.min(configuration.screenWidthDp, configuration.screenHeightDp)) * (((float) configuration.densityDpi) / 160.0f));
        if (min <= 0) {
            Point point = new Point();
            this.f7570m0.getDefaultDisplay().getSize(point);
            min = Math.min(point.x, point.y);
        }
        this.f7566k0 = min;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public void m8180q1(WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        if (!m8166l0() && windowInsets != null) {
            Insets a = windowInsets.getInsets(WindowInsets$Type.navigationBars());
            Insets a2 = windowInsets.getInsets(WindowInsets$Type.statusBars());
            this.f7588v0.setEmpty();
            DisplayCutout a3 = windowInsets.getDisplayCutout();
            if (a3 != null && !this.f7583t) {
                this.f7588v0.set(a3.getSafeInsetLeft(), a3.getSafeInsetTop(), a3.getSafeInsetRight(), a3.getSafeInsetBottom());
            }
            if (this.f7545a) {
                Log.d("AlertController", "updateParentPanel navigationBar " + a);
                Log.d("AlertController", "updateParentPanel mDisplayCutoutSafeInsets " + this.f7588v0);
            }
            int paddingRight = this.f7543Y.getPaddingRight();
            int paddingLeft = this.f7543Y.getPaddingLeft();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7546a0.getLayoutParams();
            int i4 = a2.top;
            int dimensionPixelSize = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4616L);
            int max = Math.max(Math.max(i4, dimensionPixelSize), this.f7588v0.top);
            int x = (int) this.f7546a0.getX();
            boolean z = false;
            if (x < 0) {
                x = 0;
            }
            int x2 = (int) ((((float) this.f7582s0.x) - this.f7546a0.getX()) - ((float) this.f7546a0.getWidth()));
            if (x2 < 0) {
                x2 = 0;
            }
            int max2 = Math.max(this.f7588v0.left, a.left - paddingLeft);
            if (max2 != 0) {
                if (x >= max2) {
                    i3 = x - marginLayoutParams.leftMargin;
                } else {
                    max2 -= x;
                    i3 = this.f7577q;
                }
                i = Math.max(0, max2 - i3);
            } else {
                i = this.f7577q;
            }
            int max3 = Math.max(this.f7588v0.right, a.right - paddingRight);
            if (max3 != 0) {
                i2 = Math.max(0, x2 >= max3 ? max3 - (x2 - marginLayoutParams.rightMargin) : (max3 - x2) - this.f7579r);
            } else {
                i2 = this.f7579r;
            }
            int i5 = dimensionPixelSize + a.bottom;
            boolean z2 = true;
            if (marginLayoutParams.topMargin != max) {
                marginLayoutParams.topMargin = max;
                z = true;
            }
            if (marginLayoutParams.bottomMargin != i5) {
                marginLayoutParams.bottomMargin = i5;
                z = true;
            }
            if (marginLayoutParams.leftMargin != i) {
                marginLayoutParams.leftMargin = i;
                z = true;
            }
            if (marginLayoutParams.rightMargin != i2) {
                marginLayoutParams.rightMargin = i2;
            } else {
                z2 = z;
            }
            if (z2) {
                this.f7546a0.requestLayout();
            }
        }
    }

    /* renamed from: r1 */
    private void m8182r1(Configuration configuration) {
        C2711k h = C2693a.m11239h(this.f7547b, configuration);
        Point point = this.f7584t0;
        Point point2 = h.f10510d;
        point.x = point2.x;
        point.y = point2.y;
        Point point3 = this.f7582s0;
        Point point4 = h.f10509c;
        point3.x = point4.x;
        point3.y = point4.y;
        if (this.f7545a) {
            Log.d("AlertController", "updateRootViewSize mRootViewSizeDp " + this.f7584t0 + " mRootViewSize " + this.f7582s0 + " configuration.density " + (((float) configuration.densityDpi) / 160.0f));
        }
    }

    /* renamed from: s0 */
    private void m8184s0() {
        ((C2112p) this.f7549c).mo7535y();
        C2112p.C2115c cVar = this.f7596z0;
        if (cVar != null) {
            cVar.mo7555a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public void m8185s1(View view) {
        this.f7582s0.x = view.getWidth();
        this.f7582s0.y = view.getHeight();
        float f = this.f7547b.getResources().getDisplayMetrics().density;
        Point point = this.f7584t0;
        Point point2 = this.f7582s0;
        point.x = (int) (((float) point2.x) / f);
        point.y = (int) (((float) point2.y) / f);
        if (this.f7545a) {
            Log.d("AlertController", "updateRootViewSize by view mRootViewSizeDp " + this.f7584t0 + " mRootViewSize " + this.f7582s0 + " configuration.density " + f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public void m8187t1(float f) {
        TextView textView;
        DialogParentPanel2 dialogParentPanel2 = this.f7546a0;
        if (dialogParentPanel2 != null) {
            C2401f.m10245d(dialogParentPanel2, f);
        }
        TextView textView2 = this.f7528K;
        if (textView2 != null) {
            C2401f.m10243b(textView2, this.f7574o0);
        }
        TextView textView3 = this.f7530L;
        if (textView3 != null) {
            C2401f.m10243b(textView3, this.f7576p0);
        }
        TextView textView4 = this.f7531M;
        if (textView4 != null) {
            C2401f.m10243b(textView4, this.f7578q0);
            C2401f.m10245d(this.f7531M, f);
        }
        if (!(this.f7532N == null || (textView = this.f7533O) == null)) {
            C2401f.m10242a(textView, this.f7580r0);
        }
        View findViewById = this.f7551d.findViewById(C1352h.f4735v);
        if (findViewById != null) {
            C2401f.m10244c(findViewById, f);
        }
        ViewGroup viewGroup = (ViewGroup) this.f7551d.findViewById(C1352h.f4718g0);
        if (viewGroup != null) {
            C2401f.m10245d(viewGroup, f);
        }
        View findViewById2 = this.f7551d.findViewById(C1352h.f4739z);
        if (findViewById2 != null) {
            C2401f.m10244c(findViewById2, f);
        }
        CheckBox checkBox = (CheckBox) this.f7551d.findViewById(16908289);
        if (checkBox != null) {
            C2401f.m10244c(checkBox, f);
        }
        ImageView imageView = (ImageView) this.f7551d.findViewById(16908294);
        if (imageView != null) {
            C2401f.m10246e(imageView, f);
            C2401f.m10244c(imageView, f);
        }
    }

    /* renamed from: u1 */
    private void m8189u1() {
        int U = m8123U();
        if (Build.VERSION.SDK_INT > 28 && this.f7558g0 != U) {
            this.f7558g0 = U;
            Activity t = ((C2112p) this.f7549c).mo7533t();
            if (t != null) {
                int M = m8116M(U, t.getWindow().getAttributes().layoutInDisplayCutoutMode);
                if (this.f7551d.getAttributes().layoutInDisplayCutoutMode != M) {
                    this.f7551d.getAttributes().layoutInDisplayCutoutMode = M;
                    if (!this.f7549c.isShowing()) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int i = 2;
                if (m8123U() != 2) {
                    i = 1;
                }
                if (this.f7551d.getAttributes().layoutInDisplayCutoutMode != i) {
                    this.f7551d.getAttributes().layoutInDisplayCutoutMode = i;
                    if (!this.f7549c.isShowing()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f7570m0.updateViewLayout(this.f7551d.getDecorView(), this.f7551d.getAttributes());
        }
    }

    /* renamed from: v0 */
    private void m8191v0() {
        this.f7560h0 = this.f7547b.getResources().getBoolean(C1348d.f4596d);
        this.f7568l0 = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4635c);
        m8178p1();
    }

    /* renamed from: w0 */
    private void m8193w0() {
        int V = mo7307V();
        int i = V * (((int) (((float) this.f7582s0.y) * 0.35f)) / V);
        this.f7563j.setMinimumHeight(i);
        ViewGroup.LayoutParams layoutParams = this.f7563j.getLayoutParams();
        layoutParams.height = i;
        this.f7563j.setLayoutParams(layoutParams);
    }

    /* renamed from: x0 */
    private void m8195x0(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 != viewGroup) {
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            }
            viewGroup.addView(view);
        }
    }

    /* renamed from: y0 */
    private void m8197y0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: A0 */
    public void mo7284A0(boolean z) {
        this.f7552d0 = z;
    }

    /* renamed from: B0 */
    public void mo7285B0(boolean z) {
        this.f7554e0 = z;
    }

    /* renamed from: C0 */
    public void mo7286C0(boolean z, CharSequence charSequence) {
        this.f7562i0 = z;
        this.f7594y0 = charSequence;
    }

    /* renamed from: D0 */
    public void mo7287D0(CharSequence charSequence) {
        this.f7561i = charSequence;
        TextView textView = this.f7531M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: E0 */
    public void mo7288E0(View view) {
        this.f7532N = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo7289F0(boolean z) {
        this.f7555f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo7290G0(boolean z) {
        this.f7515D0 = z;
    }

    /* renamed from: H0 */
    public void mo7291H0(int i) {
        this.f7524I = null;
        this.f7522H = i;
    }

    /* renamed from: I0 */
    public void mo7292I0(Drawable drawable) {
        this.f7524I = drawable;
        this.f7522H = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo7293J0(int i) {
        this.f7517E0 = i;
    }

    /* renamed from: K */
    public void mo7294K(C2583b.C2584a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            m8113H();
        }
        DialogParentPanel2 dialogParentPanel2 = this.f7546a0;
        if (dialogParentPanel2 == null) {
            if (aVar != null) {
                aVar.end();
            }
        } else if (dialogParentPanel2.isAttachedToWindow()) {
            m8111F();
            C2583b.m10996b(this.f7546a0, this.f7544Z, aVar);
        } else {
            Log.d("AlertController", "dialog is not attached to window when dismiss is invoked");
            try {
                ((C2112p) this.f7549c).mo7521D();
            } catch (IllegalArgumentException e) {
                Log.wtf("AlertController", "Not catch the dialog will throw the illegalArgumentException (In Case cause the crash , we expect it should be caught)", e);
            }
        }
    }

    /* renamed from: K0 */
    public void mo7295K0(CharSequence charSequence) {
        this.f7559h = charSequence;
        TextView textView = this.f7530L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: L */
    public boolean mo7296L(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 82;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo7297L0(int i) {
        this.f7587v = i;
    }

    /* renamed from: M0 */
    public void mo7298M0(C2112p.C2117e eVar) {
        this.f7509A0 = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo7299N0(boolean z) {
        this.f7521G0 = z;
    }

    /* renamed from: O0 */
    public void mo7300O0(C2112p.C2116d dVar) {
        this.f7511B0 = dVar;
    }

    /* renamed from: P0 */
    public void mo7301P0(CharSequence charSequence) {
        this.f7557g = charSequence;
        TextView textView = this.f7528K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: Q0 */
    public void mo7302Q0(boolean z) {
        this.f7526J = z;
    }

    /* renamed from: R */
    public int mo7303R(int i) {
        TypedValue typedValue = new TypedValue();
        this.f7547b.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: R0 */
    public void mo7304R0(int i) {
        this.f7565k = null;
        this.f7567l = i;
    }

    /* renamed from: S */
    public ListView mo7305S() {
        return this.f7563j;
    }

    /* renamed from: S0 */
    public void mo7306S0(View view) {
        this.f7565k = view;
        this.f7567l = 0;
    }

    /* renamed from: V */
    public int mo7307V() {
        return C1649c.m6962g(this.f7547b, C1347c.f4588v);
    }

    /* renamed from: Y */
    public void mo7308Y(Bundle bundle) {
        this.f7553e = bundle != null;
        this.f7583t = C2698f.m11281i(this.f7547b);
        this.f7549c.setContentView(this.f7536R);
        this.f7543Y = (DialogRootView) this.f7551d.findViewById(C1352h.f4683E);
        this.f7544Z = this.f7551d.findViewById(C1352h.f4682D);
        this.f7543Y.setConfigurationChangedCallback(new DialogRootView.C2257b() {
            public void onConfigurationChanged(Configuration configuration, int i, int i2, int i3, int i4) {
                AlertController.this.mo7311q0(configuration, false, false);
            }
        });
        Configuration configuration = this.f7547b.getResources().getConfiguration();
        m8182r1(configuration);
        m8143d1();
        m8138b1();
        this.f7590w0 = configuration;
        this.f7592x0 = true;
        this.f7543Y.post(new Runnable() {
            public void run() {
                AlertController alertController = AlertController.this;
                alertController.m8185s1(alertController.f7543Y);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean mo7309d0() {
        return this.f7515D0 && Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: p0 */
    public void mo7310p0() {
        m8191v0();
        if (Build.VERSION.SDK_INT >= 30) {
            m8146e1();
        }
    }

    /* renamed from: q0 */
    public void mo7311q0(Configuration configuration, boolean z, boolean z2) {
        this.f7583t = C2698f.m11281i(this.f7547b);
        int i = configuration.densityDpi;
        float f = (((float) i) * 1.0f) / ((float) this.f7572n0);
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i2 != 0) {
            this.f7572n0 = i;
        }
        if (this.f7545a) {
            Log.d("AlertController", "onConfigurationChangednewDensityDpi " + this.f7572n0 + " densityScale " + f);
        }
        if (!this.f7592x0 || m8137b0(configuration) || z) {
            this.f7592x0 = false;
            this.f7581s = -1;
            m8182r1(configuration);
            if (this.f7545a) {
                Log.d("AlertController", "onConfigurationChanged mRootViewSize " + this.f7582s0);
            }
            if (!m8112G()) {
                Log.w("AlertController", "dialog is created in thread:" + this.f7519F0 + ", but onConfigurationChanged is called from different thread:" + Thread.currentThread() + ", so this onConfigurationChanged call should be ignore");
                return;
            }
            if (mo7309d0()) {
                this.f7551d.getDecorView().removeOnLayoutChangeListener(this.f7550c0);
            }
            if (this.f7551d.getDecorView().isAttachedToWindow()) {
                if (i2 != 0) {
                    this.f7573o = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4617M);
                    this.f7575p = this.f7547b.getResources().getDimensionPixelSize(C1350f.f4618N);
                }
                m8191v0();
                if (mo7309d0()) {
                    m8189u1();
                } else {
                    m8132Z0();
                }
                m8141c1(false, z, z2, f);
            }
            if (mo7309d0()) {
                this.f7551d.getDecorView().addOnLayoutChangeListener(this.f7550c0);
                WindowInsets rootWindowInsets = this.f7551d.getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    m8170m1(rootWindowInsets);
                }
            }
            this.f7543Y.post(new Runnable() {
                public void run() {
                    AlertController alertController = AlertController.this;
                    alertController.m8185s1(alertController.f7543Y);
                }
            });
        }
    }

    /* renamed from: r0 */
    public void mo7312r0() {
        if (!C1648b.m6955d()) {
            Folme.clean(this.f7546a0, this.f7544Z);
            m8158i1(0);
        }
    }

    /* renamed from: t0 */
    public void mo7313t0() {
        if (mo7309d0()) {
            if (this.f7544Z != null) {
                m8176o1(0);
            }
            m8191v0();
            m8189u1();
            if (this.f7553e || !this.f7555f) {
                this.f7546a0.setTag((Object) null);
                this.f7544Z.setAlpha(0.3f);
            } else {
                C2583b.m10997c(this.f7546a0, this.f7544Z, m8151g0(), this.f7513C0);
            }
            this.f7551d.getDecorView().addOnLayoutChangeListener(this.f7550c0);
        }
    }

    /* renamed from: u0 */
    public void mo7314u0() {
        if (mo7309d0()) {
            this.f7551d.getDecorView().removeOnLayoutChangeListener(this.f7550c0);
        }
    }

    /* renamed from: z0 */
    public void mo7315z0(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f7542X.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f7516E = charSequence;
            this.f7518F = message;
        } else if (i == -2) {
            this.f7510B = charSequence;
            this.f7512C = message;
        } else if (i == -1) {
            this.f7593y = charSequence;
            this.f7595z = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
