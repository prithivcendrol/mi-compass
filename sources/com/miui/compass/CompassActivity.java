package com.miui.compass;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0116a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.C0949f0;
import com.miui.compass.C1407g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import miuix.appcompat.app.C2071a;
import miuix.appcompat.app.C2073a0;
import miuix.appcompat.app.C2112p;
import miuix.appcompat.app.C2118q;
import miuix.miuixbasewidget.widget.MessageView;
import p018c2.C1352h;
import p080m4.C1964b;
import p094p0.C2536b;
import p147z2.C2972a;

public class CompassActivity extends C2118q implements Handler.Callback, C0116a.C0121e {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public ImageView f5047A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public Animation f5048B0;

    /* renamed from: C */
    private final String f5049C = "android.permission.ACCESS_FINE_LOCATION";
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public Animation f5050C0;

    /* renamed from: D */
    private final String f5051D = "android.permission.CAMERA";
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public boolean f5052D0;

    /* renamed from: E */
    private final int f5053E = 3000;

    /* renamed from: E0 */
    private C2112p f5054E0;

    /* renamed from: F */
    private boolean f5055F = false;

    /* renamed from: F0 */
    private C2112p f5056F0;

    /* renamed from: G */
    private boolean f5057G = false;

    /* renamed from: G0 */
    private C2112p f5058G0;

    /* renamed from: H */
    private boolean f5059H = false;

    /* renamed from: H0 */
    private C2112p f5060H0;

    /* renamed from: I */
    private long f5061I;

    /* renamed from: I0 */
    private C2112p f5062I0;

    /* renamed from: J */
    private final int f5063J = 0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public C2073a0 f5064J0;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public SensorManager f5065K;

    /* renamed from: K0 */
    private final int f5066K0 = 5400;

    /* renamed from: L */
    private Sensor f5067L;

    /* renamed from: L0 */
    private final int f5068L0 = 50;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Sensor f5069M;

    /* renamed from: M0 */
    private boolean f5070M0 = false;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public float f5071N;

    /* renamed from: N0 */
    private boolean f5072N0 = true;

    /* renamed from: O */
    private long f5073O;

    /* renamed from: O0 */
    private boolean f5074O0 = true;

    /* renamed from: P */
    boolean f5075P = true;

    /* renamed from: P0 */
    private boolean f5076P0 = false;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C2071a f5077Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public boolean f5078Q0 = false;

    /* renamed from: R */
    private ConstraintLayout f5079R;

    /* renamed from: R0 */
    private boolean f5080R0 = false;

    /* renamed from: S */
    private Guideline f5081S;

    /* renamed from: S0 */
    private ConnectivityManager f5082S0;

    /* renamed from: T */
    private TextView f5083T;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public C1407g f5084T0;

    /* renamed from: U */
    private TextView f5085U;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public boolean f5086U0;

    /* renamed from: V */
    private TextView f5087V;

    /* renamed from: V0 */
    private long f5088V0;

    /* renamed from: W */
    private TextView f5089W;

    /* renamed from: W0 */
    private long f5090W0;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public TextView f5091X;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public long f5092X0;

    /* renamed from: Y */
    private TextView f5093Y;

    /* renamed from: Y0 */
    private long f5094Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public TextView f5095Z;

    /* renamed from: Z0 */
    private boolean f5096Z0;

    /* renamed from: a0 */
    private TextView f5097a0;

    /* renamed from: a1 */
    private C1384s f5098a1;

    /* renamed from: b0 */
    private ImageView f5099b0;

    /* renamed from: b1 */
    private C1383r f5100b1;

    /* renamed from: c0 */
    private ConstraintLayout f5101c0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public boolean f5102c1;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public LinearLayout f5103d0;

    /* renamed from: d1 */
    private C1397a0 f5104d1;

    /* renamed from: e0 */
    private Rotation3DLayout f5105e0;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public ImageView f5106e1;

    /* renamed from: f0 */
    private ImageView f5107f0;

    /* renamed from: f1 */
    private Handler f5108f1;

    /* renamed from: g0 */
    private LinearLayout f5109g0;

    /* renamed from: g1 */
    private Handler f5110g1;

    /* renamed from: h0 */
    private LinearLayout f5111h0;

    /* renamed from: h1 */
    private C1382q f5112h1;

    /* renamed from: i0 */
    private LinearLayout f5113i0;

    /* renamed from: i1 */
    private boolean f5114i1 = false;

    /* renamed from: j0 */
    private LinearLayout f5115j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public Animation f5116j1;

    /* renamed from: k0 */
    private Space f5117k0;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public C1435v f5118k1;

    /* renamed from: l0 */
    private Space f5119l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public boolean f5120l1 = false;

    /* renamed from: m0 */
    private Space f5121m0;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public Button f5122m1;

    /* renamed from: n0 */
    private Space f5123n0;

    /* renamed from: n1 */
    private MessageView f5124n1;

    /* renamed from: o0 */
    private Space f5125o0;

    /* renamed from: o1 */
    private GradienterView f5126o1;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public RotateView f5127p0;

    /* renamed from: p1 */
    private SensorEventListener f5128p1 = new C1377l();

    /* renamed from: q0 */
    private View f5129q0;

    /* renamed from: q1 */
    private SensorEventListener f5130q1 = new C1378m();

    /* renamed from: r0 */
    private TextView f5131r0;

    /* renamed from: r1 */
    private C1407g.C1413f f5132r1 = new C1372g();

    /* renamed from: s0 */
    private TextView f5133s0;

    /* renamed from: t0 */
    private ViewStub f5134t0;

    /* renamed from: u0 */
    private ViewStub f5135u0;

    /* renamed from: v0 */
    private ViewStub f5136v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public CompassScreenView f5137w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public CompassScreen f5138x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public GradienterScreen f5139y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public CameraView f5140z0;

    /* renamed from: com.miui.compass.CompassActivity$a */
    class C1366a implements DialogInterface.OnClickListener {
        C1366a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CompassActivity.this.f5084T0.mo5360y();
            Toast.makeText(CompassActivity.this, 2131820794, 1).show();
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$b */
    class C1367b implements DialogInterface.OnClickListener {
        C1367b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1421i.m6358j(CompassActivity.this, true);
            C1445z.m6432c(true);
            C1421i.m6359k(CompassActivity.this, true);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$c */
    class C1368c implements DialogInterface.OnClickListener {
        C1368c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CompassActivity.this.finish();
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$d */
    class C1369d implements DialogInterface.OnClickListener {
        C1369d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C2536b.m10778b(CompassActivity.this)) {
                C1396a.m6231k(CompassActivity.this);
            } else {
                C1396a.m6230j(CompassActivity.this);
            }
            boolean unused = CompassActivity.this.f5078Q0 = false;
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$e */
    class C1370e implements DialogInterface.OnClickListener {
        C1370e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean unused = CompassActivity.this.f5078Q0 = false;
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$f */
    class C1371f implements DialogInterface.OnDismissListener {
        C1371f() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            boolean unused = CompassActivity.this.f5078Q0 = false;
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$g */
    class C1372g implements C1407g.C1413f {
        C1372g() {
        }

        /* renamed from: a */
        public void mo5237a(C1407g.C1412e eVar) {
            if (CompassActivity.this.f5084T0.mo5354E()) {
                if (eVar.mo5377k() != -404.0f) {
                    CompassActivity.this.f5095Z.setText(String.format(CompassActivity.this.getResources().getString(2131820904), new Object[]{Float.valueOf(eVar.mo5377k())}));
                    CompassActivity.this.m6040G2(eVar.mo5374h());
                    CompassActivity.this.f5091X.setText(String.format(CompassActivity.this.getResources().getString(2131820576), new Object[]{Float.valueOf(eVar.mo5373g())}));
                } else {
                    CompassActivity.this.f5091X.setText(2131820600);
                    CompassActivity.this.f5095Z.setText(2131820600);
                    CompassActivity.this.f5103d0.setEnabled(false);
                }
            }
            CompassActivity.this.m6045J2(eVar.mo5376j(), eVar.mo5375i());
        }

        /* renamed from: b */
        public void mo5238b(boolean z) {
            if (z) {
                CompassActivity.this.m6109v2();
            }
        }

        /* renamed from: c */
        public void mo5239c(int i, boolean z) {
            C1403c0.m6256c(CompassActivity.this.f5064J0);
            if (z) {
                int i2 = 0;
                if (i == 1) {
                    i2 = 2131820591;
                } else if (i == 2) {
                    i2 = 2131820592;
                } else if (i != 3) {
                    i2 = i != 4 ? 2131820595 : 2131820590;
                }
                if (i2 != 0) {
                    Toast.makeText(CompassActivity.this, i2, 1).show();
                }
            }
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$h */
    class C1373h implements View.OnClickListener {
        C1373h() {
        }

        public void onClick(View view) {
            CompassActivity compassActivity = CompassActivity.this;
            compassActivity.mo7578U0(compassActivity.f5106e1, (ViewGroup) null);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$i */
    class C1374i implements Animation.AnimationListener {
        C1374i() {
        }

        public void onAnimationEnd(Animation animation) {
            CompassActivity.this.f5047A0.setVisibility(0);
            CompassActivity.this.f5047A0.clearAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$j */
    class C1375j implements Animation.AnimationListener {
        C1375j() {
        }

        public void onAnimationEnd(Animation animation) {
            CompassActivity.this.f5047A0.setVisibility(4);
            CompassActivity.this.f5047A0.clearAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$k */
    class C1376k implements View.OnClickListener {
        C1376k() {
        }

        public void onClick(View view) {
            if (CompassActivity.this.f5086U0) {
                CompassActivity.this.m6107u2();
            } else {
                CompassActivity.this.mo5230t2();
            }
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$l */
    class C1377l implements SensorEventListener {
        C1377l() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            if (CompassActivity.this.m6080g2() && CompassActivity.this.f5069M == null) {
                CompassActivity.this.m6053R1(i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0175, code lost:
            if (r0 == 4) goto L_0x01cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ca, code lost:
            if (com.miui.compass.CompassActivity.m6087k1(r9.f5152a).hasEnded() != false) goto L_0x01cc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r10) {
            /*
                r9 = this;
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                r0.m6051P1(r10)
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                boolean r0 = r0.m6080g2()
                if (r0 != 0) goto L_0x000e
                return
            L_0x000e:
                float[] r0 = r10.values
                com.miui.compass.CompassActivity r1 = com.miui.compass.CompassActivity.this
                android.hardware.SensorManager r2 = r1.f5065K
                boolean r1 = r1.m6094n2(r2)
                if (r1 == 0) goto L_0x002e
                float[] r1 = r10.values
                java.lang.Object r1 = r1.clone()
                float[] r1 = (float[]) r1
                r2 = 9
                float[] r2 = new float[r2]
                com.miui.compass.C1444y.m6428a(r2, r1)
                com.miui.compass.C1444y.m6429b(r0, r2)
            L_0x002e:
                r1 = 0
                r2 = r0[r1]
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                float r2 = r2 * r3
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                float r4 = com.miui.compass.C1403c0.m6274u(r2)
                float unused = r3.f5071N = r4
                r3 = 1
                r4 = r0[r3]
                r5 = 2
                r0 = r0[r5]
                com.miui.compass.CompassActivity r5 = com.miui.compass.CompassActivity.this
                android.hardware.Sensor r5 = r5.f5069M
                if (r5 != 0) goto L_0x0052
                com.miui.compass.CompassActivity r5 = com.miui.compass.CompassActivity.this
                int r10 = r10.accuracy
                r5.m6053R1(r10)
            L_0x0052:
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                r10.m6066Z1()
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreen r10 = r10.f5138x0
                if (r10 == 0) goto L_0x006e
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreen r10 = r10.f5138x0
                com.miui.compass.CompassActivity r5 = com.miui.compass.CompassActivity.this
                float r5 = r5.f5071N
                r10.setCompassDirection(r5)
            L_0x006e:
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                com.miui.compass.GradienterScreen r10 = r10.f5139y0
                r10.mo5296h(r4, r0)
                boolean r10 = com.miui.compass.C1420h.m6348c()
                if (r10 == 0) goto L_0x008e
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                boolean r10 = r10.f5052D0
                if (r10 == 0) goto L_0x008e
                com.miui.compass.CompassActivity r10 = com.miui.compass.CompassActivity.this
                com.miui.compass.RotateView r10 = r10.f5127p0
                r10.mo5315k(r4, r0)
            L_0x008e:
                float r10 = java.lang.Math.abs(r4)
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                boolean r0 = r0.f5052D0
                if (r0 != 0) goto L_0x00ab
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreen r0 = r0.f5138x0
                if (r0 == 0) goto L_0x00ab
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreen r0 = r0.f5138x0
                r0.setFaceDirection(r10)
            L_0x00ab:
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                com.miui.compass.GradienterScreen r0 = r0.f5139y0
                r0.setFaceDirection(r10)
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.widget.ImageView r0 = r0.f5047A0
                int r0 = r0.getVisibility()
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                android.widget.ImageView r5 = r4.f5047A0
                android.view.animation.Animation r5 = r5.getAnimation()
                android.view.animation.Animation unused = r4.f5116j1 = r5
                boolean r4 = com.miui.compass.C1403c0.m6271r()
                if (r4 != 0) goto L_0x01ec
                r4 = 1112014848(0x42480000, float:50.0)
                int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                java.lang.String r5 = "show camera mask view "
                r6 = 4
                java.lang.String r7 = "Compass:CompassActivity"
                if (r4 < 0) goto L_0x0178
                r4 = 1124204544(0x43020000, float:130.0)
                int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0178
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                com.miui.compass.CameraView r4 = r4.f5140z0
                r8 = 2131231678(0x7f0803be, float:1.8079444E38)
                r4.setBackgroundResource(r8)
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                boolean r4 = r4.f5052D0
                if (r4 == 0) goto L_0x0102
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreenView r4 = r4.f5137w0
                int r4 = r4.getCurrentScreenIndex()
                if (r4 != r3) goto L_0x0107
            L_0x0102:
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                r4.m6100q2()
            L_0x0107:
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r4 = r4.f5116j1
                if (r4 == 0) goto L_0x0127
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r4 = r4.f5116j1
                boolean r4 = r4.hasStarted()
                if (r4 == 0) goto L_0x0127
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r4 = r4.f5116j1
                boolean r4 = r4.hasEnded()
                if (r4 == 0) goto L_0x01ec
            L_0x0127:
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                boolean r4 = r4.f5052D0
                if (r4 == 0) goto L_0x013b
                com.miui.compass.CompassActivity r4 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreenView r4 = r4.f5137w0
                int r4 = r4.getCurrentScreenIndex()
                if (r4 != r3) goto L_0x0161
            L_0x013b:
                if (r0 != 0) goto L_0x0161
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                miuix.appcompat.app.a r0 = r0.f5077Q
                r0.mo365C()
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.widget.ImageView r0 = r0.f5047A0
                com.miui.compass.CompassActivity r1 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r1 = r1.f5050C0
                r0.startAnimation(r1)
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                boolean unused = r0.f5120l1 = r3
                java.lang.String r0 = "invisible camera mask view "
                android.util.Log.i(r7, r0)
                goto L_0x01ec
            L_0x0161:
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                com.miui.compass.CompassScreenView r3 = r3.f5137w0
                int r3 = r3.getCurrentScreenIndex()
                if (r3 != 0) goto L_0x01ec
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                boolean r3 = r3.f5052D0
                if (r3 == 0) goto L_0x01ec
                if (r0 != r6) goto L_0x01ec
                goto L_0x01cc
            L_0x0178:
                r3 = 1109393408(0x42200000, float:40.0)
                int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0193
                r3 = 1124859904(0x430c0000, float:140.0)
                int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r3 < 0) goto L_0x0185
                goto L_0x0193
            L_0x0185:
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                boolean r0 = r0.f5120l1
                if (r0 == 0) goto L_0x01ec
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                r0.m6100q2()
                goto L_0x01ec
            L_0x0193:
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                android.widget.Button r3 = r3.f5122m1
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L_0x01aa
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                android.widget.Button r3 = r3.f5122m1
                r4 = 8
                r3.setVisibility(r4)
            L_0x01aa:
                if (r0 != r6) goto L_0x01ec
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r0 = r0.f5116j1
                if (r0 == 0) goto L_0x01cc
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r0 = r0.f5116j1
                boolean r0 = r0.hasStarted()
                if (r0 == 0) goto L_0x01cc
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r0 = r0.f5116j1
                boolean r0 = r0.hasEnded()
                if (r0 == 0) goto L_0x01ec
            L_0x01cc:
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                miuix.appcompat.app.a r0 = r0.f5077Q
                r0.mo365C()
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                android.widget.ImageView r0 = r0.f5047A0
                com.miui.compass.CompassActivity r3 = com.miui.compass.CompassActivity.this
                android.view.animation.Animation r3 = r3.f5048B0
                r0.startAnimation(r3)
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                boolean unused = r0.f5120l1 = r1
                android.util.Log.i(r7, r5)
            L_0x01ec:
                com.miui.compass.CompassActivity r0 = com.miui.compass.CompassActivity.this
                com.miui.compass.v r0 = r0.f5118k1
                com.miui.compass.CompassActivity r1 = com.miui.compass.CompassActivity.this
                boolean r1 = r1.f5052D0
                r0.mo5414c(r2, r10, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.CompassActivity.C1377l.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$m */
    class C1378m implements SensorEventListener {
        C1378m() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.i("Compass:CompassActivity", "mMagneticSensorEventListener accuracy = " + i + " sensor:" + sensor.toString());
            if (CompassActivity.this.m6080g2()) {
                CompassActivity.this.m6053R1(i);
            }
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (System.currentTimeMillis() - CompassActivity.this.f5092X0 > 10000) {
                C1964b.C1966b a = C1964b.m8013a(CompassApplication.m6126d());
                a.mo6604b("Compass:CompassActivity", "MagneticSensor accuracy: " + sensorEvent.accuracy);
                long unused = CompassActivity.this.f5092X0 = System.currentTimeMillis();
            }
            CompassActivity.this.m6053R1(sensorEvent.accuracy);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$n */
    class C1379n implements DialogInterface.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C1430q f5154d;

        C1379n(C1430q qVar) {
            this.f5154d = qVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f5154d.mo5408K()) {
                C1421i.m6357i(CompassActivity.this, false);
            }
            Log.d("Compass:CompassActivity", "showMobiledataDialog startCalibrateAltitude");
            CompassActivity.this.m6034D2(true, false);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$o */
    class C1380o implements DialogInterface.OnClickListener {
        C1380o() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CompassActivity.this.f5084T0.mo5359w();
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$p */
    class C1381p implements DialogInterface.OnClickListener {
        C1381p() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.d("Compass:CompassActivity", "showAltitudeTipDialog startCalibrateAltitude");
            CompassActivity.this.m6034D2(true, false);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$q */
    private static class C1382q implements Runnable {
        private C1382q() {
        }

        /* synthetic */ C1382q(C1373h hVar) {
            this();
        }

        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Boolean.FALSE);
            hashMap.put("device_name", Build.DEVICE);
            hashMap.put("sensor", C1420h.f5393b);
            C1445z.m6433d("calibration_times", "core_experiences", hashMap);
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$r */
    private class C1383r extends BroadcastReceiver {
        private C1383r() {
        }

        /* synthetic */ C1383r(CompassActivity compassActivity, C1373h hVar) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            Log.d("Compass:CompassActivity", "GPS Provider Changed!!!");
            if (CompassActivity.this.f5102c1 && C1396a.m6221a(CompassActivity.this) && CompassActivity.this.f5084T0 != null) {
                CompassActivity.this.f5084T0.mo5357J();
            }
        }
    }

    /* renamed from: com.miui.compass.CompassActivity$s */
    private class C1384s extends BroadcastReceiver {

        /* renamed from: a */
        private long f5159a;

        private C1384s() {
        }

        /* synthetic */ C1384s(CompassActivity compassActivity, C1373h hVar) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            Log.d("Compass:CompassActivity", "Network Changed!!!");
            this.f5159a = System.currentTimeMillis();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (CompassActivity.this.f5102c1 && C1396a.m6221a(CompassActivity.this) && C1421i.m6349a(context) && C1403c0.m6269p(connectivityManager) && CompassActivity.this.f5084T0 != null) {
                CompassActivity.this.f5084T0.mo5357J();
            }
            Log.i("Compass:CompassActivity", " onReceive() full time = " + (System.currentTimeMillis() - this.f5159a));
        }
    }

    /* renamed from: A2 */
    private void m6028A2() {
        new C2112p.C2114b(this).mo7552q(2131820683).mo7541f(!C2536b.m10777a(this) ? 2131820680 : 2131820681).mo7548m(17039370, (DialogInterface.OnClickListener) null).mo7536a().show();
    }

    /* renamed from: B2 */
    private void m6030B2() {
        if (this.f5060H0 == null) {
            C2112p.C2114b bVar = new C2112p.C2114b(this);
            bVar.mo7552q(2131820892);
            bVar.mo7541f(C1403c0.m6271r() ? 2131820891 : 2131820890);
            bVar.mo7538c(false);
            bVar.mo7548m(2131820573, new C1369d());
            bVar.mo7544i(2131820599, new C1370e());
            this.f5060H0 = bVar.mo7536a();
            bVar.mo7546k(new C1371f());
        }
        if (!this.f5078Q0) {
            if (C1403c0.m6272s()) {
                this.f5060H0.mo7523G(true);
            }
            this.f5060H0.show();
            this.f5078Q0 = true;
        }
    }

    /* renamed from: C2 */
    private boolean m6032C2() {
        return C1428o.m6372b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m6034D2(boolean z, boolean z2) {
        Log.i("Compass:CompassActivity", "startCalibrateAltitude");
        NetworkInfo activeNetworkInfo = this.f5082S0.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            m6028A2();
        } else if (!z2 || activeNetworkInfo.getType() == 1 || !C1421i.m6354f(this) || !C1421i.m6349a(this)) {
            this.f5084T0.mo5356I(z);
        } else {
            m6117z2();
        }
    }

    /* renamed from: E2 */
    private void m6036E2() {
        this.f5108f1.sendMessageDelayed(this.f5108f1.obtainMessage(1), 500);
    }

    /* renamed from: F2 */
    private void m6038F2() {
        if (!this.f5070M0 && !this.f5084T0.mo5352C()) {
            m6115y2();
        }
        this.f5084T0.mo5357J();
        if (this.f5084T0.mo5354E() && C1421i.m6349a(this) && C1403c0.m6269p(this.f5082S0)) {
            Log.d("Compass:CompassActivity", "startCompass startCalibrateAltitude");
            m6034D2(false, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public void m6040G2(C1407g.C1410c cVar) {
        if (cVar != C1407g.C1410c.RELIABLE) {
            if (cVar == C1407g.C1410c.AUTOMATIC_CALIBRATION) {
                m6034D2(false, false);
            } else {
                if (cVar == C1407g.C1410c.GRANT) {
                    this.f5107f0.setVisibility(0);
                    this.f5107f0.setImageResource(2131230877);
                    this.f5086U0 = false;
                } else if (cVar == C1407g.C1410c.REFERENTIAL) {
                    this.f5107f0.setVisibility(0);
                    this.f5107f0.setImageResource(2131230875);
                    this.f5086U0 = true;
                } else {
                    return;
                }
                this.f5103d0.setEnabled(true);
                return;
            }
        }
        this.f5103d0.setEnabled(false);
        this.f5107f0.setVisibility(8);
    }

    /* renamed from: I2 */
    private void m6043I2() {
        this.f5081S.setGuidelinePercent(getResources().getFloat(2131165309));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public void m6045J2(double d, double d2) {
        TextView textView;
        TextView textView2;
        if (d == -404.0d || d2 == -404.0d) {
            this.f5085U.setText(2131820600);
            this.f5089W.setText(2131820600);
            if (System.currentTimeMillis() - this.f5088V0 > 60000) {
                Log.w("Compass:CompassActivity", "updateLongitudeLatitude longitude or latitude is invalid");
                this.f5088V0 = System.currentTimeMillis();
                return;
            }
            return;
        }
        this.f5083T.setVisibility(0);
        this.f5087V.setVisibility(0);
        if (d2 >= 0.0d) {
            this.f5083T.setText(2131820795);
            textView = this.f5085U;
        } else {
            this.f5083T.setText(2131820801);
            textView = this.f5085U;
            d2 *= -1.0d;
        }
        textView.setText(C1403c0.m6259f(d2));
        if (d >= 0.0d) {
            this.f5087V.setText(2131820791);
            textView2 = this.f5089W;
        } else {
            this.f5087V.setText(2131820802);
            textView2 = this.f5089W;
            d *= -1.0d;
        }
        textView2.setText(C1403c0.m6259f(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public void m6051P1(SensorEvent sensorEvent) {
        if (System.currentTimeMillis() - this.f5090W0 > 10000) {
            C1964b.C1966b a = C1964b.m8013a(CompassApplication.m6126d());
            StringBuilder sb = new StringBuilder();
            sb.append("SensorEvent, values[");
            sb.append(sensorEvent.values[0]);
            sb.append(",");
            sb.append(sensorEvent.values[1]);
            sb.append(",");
            sb.append(sensorEvent.values[2]);
            sb.append("], accuracy:");
            sb.append(sensorEvent.accuracy);
            sb.append(",mViewAttached:");
            sb.append(!m6080g2());
            a.mo6604b("Compass:CompassActivity", sb.toString());
            this.f5090W0 = System.currentTimeMillis();
        }
    }

    /* renamed from: Q1 */
    private boolean m6052Q1() {
        if (!C1396a.m6225e("android.permission.CAMERA") || this.f5076P0) {
            if (System.currentTimeMillis() - this.f5094Y0 > 10000) {
                Log.d("Compass:CompassActivity", "startCamera failed, permissionGranted: " + C1396a.m6225e("android.permission.CAMERA") + ", camera start flag: " + this.f5076P0);
                this.f5094Y0 = System.currentTimeMillis();
            }
            return true;
        }
        if (C1403c0.m6267n() && this.f5075P) {
            C1426n.m6369g2().mo3521f2(mo3605g0(), (String) null);
            this.f5075P = false;
        } else if (!C1403c0.m6267n()) {
            if (this.f5122m1.getVisibility() == 0) {
                this.f5122m1.setVisibility(8);
                GradienterView gradienterView = this.f5126o1;
                if (gradienterView != null) {
                    gradienterView.setVisibility(0);
                } else {
                    Log.w("Compass:CompassActivity", "checkCameraPermAndStartCamera mGradienterPortrait is null");
                }
            }
            Log.d("Compass:CompassActivity", "startCamera");
            m6036E2();
        }
        this.f5076P0 = true;
        this.f5074O0 = false;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public void m6053R1(int i) {
        if (this.f5137w0.getCurrentScreenIndex() != 1) {
            if (i < 3 && this.f5137w0.getCurrentScreenIndex() == 0 && this.f5122m1.getVisibility() == 0) {
                this.f5122m1.setVisibility(4);
            }
            if (i < 3 && System.currentTimeMillis() - this.f5061I > 3000) {
                if (this.f5076P0 && this.f5052D0 && this.f5137w0.getCurrentScreenIndex() == 0) {
                    m6055T1();
                }
                if (!this.f5052D0) {
                    m6058V1();
                    (C1420h.m6348c() ? this.f5129q0 : this.f5101c0).announceForAccessibility(getString(2131820598));
                    m6104s2();
                }
            } else if (this.f5069M != null || (this.f5052D0 && System.currentTimeMillis() - this.f5073O > 3000)) {
                m6056U1();
            }
        }
    }

    /* renamed from: S1 */
    private boolean m6054S1() {
        if (C1396a.m6221a(this)) {
            if (this.f5124n1.getVisibility() == 0) {
                this.f5124n1.setVisibility(8);
            }
            Log.d("Compass:CompassActivity", "start compass");
            m6038F2();
            this.f5072N0 = false;
            return false;
        }
        Log.d("Compass:CompassActivity", "startCompass failed, permissionGranted: " + C1396a.m6225e("android.permission.ACCESS_FINE_LOCATION"));
        return true;
    }

    /* renamed from: T1 */
    private void m6055T1() {
        Log.d("Compass:CompassActivity", "close camera");
        if (this.f5108f1.hasMessages(1)) {
            this.f5108f1.removeMessages(1);
        } else {
            this.f5108f1.sendMessage(this.f5108f1.obtainMessage(2));
        }
        this.f5076P0 = false;
    }

    /* renamed from: U1 */
    private void m6056U1() {
        this.f5077Q.mo365C();
        m6060W1();
        m6096o2();
        HashMap hashMap = new HashMap();
        hashMap.put("result", Boolean.TRUE);
        hashMap.put("sensor", C1420h.f5393b);
        C1445z.m6433d("calibration_times", "core_experiences", hashMap);
    }

    /* renamed from: V1 */
    private void m6058V1() {
        View view;
        if (!this.f5052D0) {
            Log.d("Compass:CompassActivity", "enter in calibration");
            this.f5118k1.mo5413b();
            this.f5073O = System.currentTimeMillis();
            int i = 0;
            this.f5138x0.mo5265f(false);
            this.f5138x0.setVisibility(8);
            if (C1420h.m6348c()) {
                m6074d2();
                View view2 = this.f5129q0;
                view2.announceForAccessibility(getString(2131820597) + " " + getString(2131820593));
                view = this.f5129q0;
            } else {
                m6076e2();
                this.f5099b0.setBackgroundResource(2131231690);
                this.f5104d1.mo5344h(this.f5099b0, 2131231689);
                CompassScreen compassScreen = this.f5138x0;
                if (compassScreen != null) {
                    Bitmap viewShot = compassScreen.getViewShot();
                    if (viewShot != null) {
                        this.f5101c0.setBackground(new BitmapDrawable(getResources(), C2972a.m12263b(CompassApplication.m6126d(), viewShot, getResources().getDimensionPixelSize(2131166002))));
                        viewShot.recycle();
                    }
                    this.f5138x0.startAnimation(AnimationUtils.loadAnimation(this, 2130771999));
                }
                this.f5101c0.startAnimation(AnimationUtils.loadAnimation(this, 2130772000));
                this.f5101c0.announceForAccessibility(getString(2131820773));
                this.f5101c0.setVisibility(0);
                view = this.f5138x0;
                if (view != null) {
                    i = 4;
                }
                m6078f2(true);
            }
            view.setVisibility(i);
            m6078f2(true);
        }
    }

    /* renamed from: W1 */
    private void m6060W1() {
        if (this.f5052D0) {
            Log.d("Compass:CompassActivity", "complete calibration");
            if (C1420h.m6348c()) {
                this.f5129q0.setVisibility(8);
                this.f5127p0.mo5314i();
            } else {
                this.f5104d1.mo5345i();
                CompassScreen compassScreen = this.f5138x0;
                if (compassScreen != null) {
                    compassScreen.startAnimation(AnimationUtils.loadAnimation(this, 2130771998));
                }
                this.f5101c0.startAnimation(AnimationUtils.loadAnimation(this, 2130772001));
                CompassScreen compassScreen2 = this.f5138x0;
                if (compassScreen2 != null) {
                    compassScreen2.setVisibility(0);
                }
                this.f5101c0.setVisibility(8);
            }
            this.f5138x0.announceForAccessibility(getString(2131820595));
            this.f5138x0.setVisibility(0);
            m6078f2(false);
            C1424l.m6361a().mo5399c();
            Toast.makeText(this, 2131820595, 1).show();
            this.f5061I = System.currentTimeMillis();
            this.f5118k1.mo5412a();
            this.f5138x0.mo5265f(true);
        }
    }

    /* renamed from: X1 */
    private void m6062X1() {
        C2071a F0 = mo7561F0();
        this.f5077Q = F0;
        if (F0 == null) {
            Log.e("Compass:CompassActivity", "initActionBar mActionBar is null, return");
            return;
        }
        F0.mo381u(new ColorDrawable(0));
        this.f5077Q.mo383w(false);
        this.f5077Q.mo384x(false);
        this.f5077Q.mo385y(2);
        C2071a aVar = this.f5077Q;
        aVar.mo367g(aVar.mo375o().mo396h(2131820589).mo395g(this));
        C2071a aVar2 = this.f5077Q;
        aVar2.mo367g(aVar2.mo375o().mo396h(2131820772).mo395g(this));
        ImageView imageView = new ImageView(this);
        this.f5106e1 = imageView;
        imageView.setImageResource(2131230918);
        this.f5106e1.setContentDescription(getResources().getString(2131820671));
        this.f5106e1.setId(C1352h.f4691M);
        this.f5077Q.mo7358F(this.f5106e1);
        this.f5077Q.mo7359G(0);
        this.f5077Q.mo7360H(false);
        this.f5106e1.setOnClickListener(new C1373h());
        mo7575R0(true);
    }

    /* renamed from: Y1 */
    private void m6064Y1() {
        this.f5115j0.setVisibility(0);
        this.f5103d0 = (LinearLayout) findViewById(2131361920);
        this.f5091X = (TextView) findViewById(2131362329);
        this.f5093Y = (TextView) findViewById(2131362308);
        this.f5107f0 = (ImageView) findViewById(2131362339);
        this.f5103d0.setEnabled(false);
        this.f5103d0.setOnClickListener(new C1376k());
        C1403c0.m6276w(this.f5091X);
        C1403c0.m6276w(this.f5093Y);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m6066Z1() {
        if (this.f5139y0 == null) {
            this.f5136v0.inflate();
            GradienterScreen gradienterScreen = (GradienterScreen) findViewById(2131362054);
            this.f5139y0 = gradienterScreen;
            gradienterScreen.mo5292d(this.f5137w0);
            this.f5139y0.mo5293e(true);
            this.f5126o1 = this.f5139y0.getGradienterPortraitView();
        }
    }

    /* renamed from: a2 */
    private void m6068a2() {
        this.f5113i0.setVisibility(0);
        this.f5095Z = (TextView) findViewById(2131362334);
        this.f5097a0 = (TextView) findViewById(2131362313);
        C1403c0.m6276w(this.f5095Z);
        C1403c0.m6276w(this.f5097a0);
    }

    /* renamed from: b2 */
    private void m6070b2() {
        this.f5096Z0 = C1403c0.m6270q();
        this.f5071N = 0.0f;
        this.f5073O = 0;
        this.f5083T = (TextView) findViewById(2131362330);
        this.f5085U = (TextView) findViewById(2131362331);
        this.f5087V = (TextView) findViewById(2131362332);
        this.f5089W = (TextView) findViewById(2131362333);
        this.f5140z0 = (CameraView) findViewById(2131361937);
        this.f5047A0 = (ImageView) findViewById(2131361936);
        this.f5138x0 = (CompassScreen) findViewById(2131361969);
        CompassScreenView compassScreenView = (CompassScreenView) findViewById(2131362348);
        this.f5137w0 = compassScreenView;
        this.f5138x0.mo5264e(compassScreenView);
        this.f5135u0 = (ViewStub) findViewById(2131362379);
        this.f5134t0 = (ViewStub) findViewById(2131362380);
        this.f5136v0 = (ViewStub) findViewById(2131362378);
        this.f5105e0 = (Rotation3DLayout) findViewById(2131361966);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(2131361919);
        this.f5079R = constraintLayout;
        this.f5109g0 = (LinearLayout) constraintLayout.findViewById(2131361921);
        this.f5111h0 = (LinearLayout) this.f5079R.findViewById(2131361922);
        this.f5113i0 = (LinearLayout) this.f5079R.findViewById(2131361923);
        this.f5115j0 = (LinearLayout) this.f5079R.findViewById(2131361920);
        this.f5117k0 = (Space) this.f5079R.findViewById(2131362263);
        this.f5119l0 = (Space) this.f5079R.findViewById(2131362266);
        this.f5121m0 = (Space) this.f5079R.findViewById(2131362264);
        this.f5123n0 = (Space) this.f5079R.findViewById(2131362267);
        this.f5125o0 = (Space) this.f5079R.findViewById(2131362265);
        this.f5081S = (Guideline) findViewById(2131362062);
        this.f5122m1 = (Button) findViewById(2131362112);
        this.f5124n1 = (MessageView) findViewById(2131362116);
        if (this.f5096Z0 && !C1403c0.m6262i() && !C1403c0.m6263j()) {
            this.f5085U.setTextDirection(3);
            this.f5089W.setTextDirection(3);
        }
        new FrameLayout.LayoutParams(-2, -2, 81).bottomMargin = getResources().getDimensionPixelSize(2131165336);
        C1424l.m6361a().mo5403g(this.f5137w0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, 2130772002);
        this.f5048B0 = loadAnimation;
        loadAnimation.setAnimationListener(new C1374i());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, 2130772003);
        this.f5050C0 = loadAnimation2;
        loadAnimation2.setAnimationListener(new C1375j());
        C1403c0.m6276w(this.f5089W);
        C1403c0.m6276w(this.f5085U);
        C1403c0.m6276w(this.f5083T);
        C1403c0.m6276w(this.f5087V);
        if (this.f5084T0.mo5354E()) {
            m6068a2();
            m6064Y1();
        } else {
            this.f5113i0.setVisibility(8);
            this.f5123n0.setVisibility(8);
            this.f5115j0.setVisibility(8);
        }
        mo5222H2(getApplicationContext());
        C1401b0.m6253k(this.f5124n1, C1403c0.m6258e(this) + getResources().getDimensionPixelSize(2131165333));
    }

    /* renamed from: c2 */
    private void m6072c2() {
        this.f5082S0 = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
        SensorManager sensorManager = (SensorManager) getApplicationContext().getSystemService("sensor");
        this.f5065K = sensorManager;
        if (m6094n2(sensorManager)) {
            this.f5067L = this.f5065K.getDefaultSensor(11);
            C1420h.f5393b = "ROTATION_VECTOR";
            this.f5069M = this.f5065K.getDefaultSensor(2);
        } else {
            this.f5067L = this.f5065K.getDefaultSensor(3);
            C1420h.f5393b = "ORIENTATION";
        }
        Log.d("Compass:CompassActivity", "The sensorName is " + C1420h.f5393b);
        C1407g gVar = new C1407g(this);
        this.f5084T0 = gVar;
        gVar.mo5355H(this.f5132r1);
        this.f5104d1 = new C1397a0(this);
        this.f5098a1 = new C1384s(this, (C1373h) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f5098a1, intentFilter);
        this.f5100b1 = new C1383r(this, (C1373h) null);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.location.PROVIDERS_CHANGED");
        registerReceiver(this.f5100b1, intentFilter2);
    }

    /* renamed from: d2 */
    private void m6074d2() {
        if (this.f5129q0 == null) {
            this.f5135u0.inflate();
            View findViewById = findViewById(2131362335);
            this.f5129q0 = findViewById;
            this.f5131r0 = (TextView) findViewById.findViewById(2131362367);
            this.f5127p0 = (RotateView) this.f5129q0.findViewById(2131362081);
            TextView textView = (TextView) this.f5129q0.findViewById(2131362366);
            this.f5133s0 = textView;
            C1403c0.m6275v(textView);
            C1403c0.m6275v(this.f5131r0);
        }
    }

    /* renamed from: e2 */
    private void m6076e2() {
        if (this.f5101c0 == null) {
            this.f5134t0.inflate();
            this.f5099b0 = (ImageView) findViewById(2131362082);
            this.f5101c0 = (ConstraintLayout) findViewById(2131362123);
        }
    }

    /* renamed from: f2 */
    private void m6078f2(boolean z) {
        Log.d("Compass:CompassActivity", "set isCalibrating: " + z);
        this.f5052D0 = z;
        this.f5137w0.setIsCalibrating(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public boolean m6080g2() {
        CompassScreen compassScreen = this.f5138x0;
        if (compassScreen != null) {
            return compassScreen.isAttachedToWindow();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m6082h2(View view) {
        Log.d("Compass:CompassActivity", "request camera permission");
        C1396a.m6228h(this, this.f5080R0);
        this.f5080R0 = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m6084i2(View view) {
        C1396a.m6227g(this);
        this.f5080R0 = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m6086j2() {
        C1396a.m6227g(this);
        this.f5080R0 = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m6088k2(DialogInterface dialogInterface, int i) {
        C1421i.m6359k(this, true);
        if (C1403c0.m6269p(this.f5082S0)) {
            this.f5084T0.mo5357J();
        }
    }

    /* renamed from: l2 */
    private void m6090l2() {
        startActivity(new Intent(this, CompassPermDesc.class));
    }

    /* renamed from: m2 */
    private void m6092m2() {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://privacy.mi.com/Compass/" + language + "_" + country)));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public boolean m6094n2(SensorManager sensorManager) {
        return sensorManager.getDefaultSensor(3) == null;
    }

    /* renamed from: o2 */
    private void m6096o2() {
        Handler handler = this.f5110g1;
        if (handler != null) {
            handler.removeCallbacks(this.f5112h1);
        }
        this.f5110g1 = null;
        this.f5112h1 = null;
    }

    /* renamed from: p2 */
    private void m6098p2() {
        Log.d("Compass:CompassActivity", "request CTA");
        if (!C2536b.m10779c(this)) {
            Log.d("Compass:CompassActivity", "global not show cta");
            C1421i.m6358j(this, true);
            C1421i.m6359k(this, true);
            this.f5057G = !m6032C2();
            this.f5059H = true;
        } else if (!C1421i.m6349a(this) && !this.f5055F) {
            if (C1396a.m6232l()) {
                Log.d("Compass:CompassActivity", "first show old cta");
                this.f5055F = C1396a.m6229i(this, 2);
                return;
            }
            Log.d("Compass:CompassActivity", "first show old cta dialog");
            m6113x2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public void m6100q2() {
        if (m6052Q1() && !this.f5055F && !this.f5078Q0 && this.f5074O0) {
            this.f5122m1.setVisibility(0);
            if (this.f5137w0.getCurrentScreenIndex() == 1) {
                this.f5126o1.setVisibility(4);
            }
            this.f5122m1.setOnClickListener(new C1406f(this));
        }
    }

    /* renamed from: r2 */
    private void m6102r2() {
        if (m6054S1() && !this.f5055F && this.f5072N0 && !this.f5057G) {
            Log.d("Compass:CompassActivity", "requestPermissionBeforeStartCompass: not grant location permission");
            this.f5124n1.setVisibility(0);
            this.f5124n1.setMessage(getString(this.f5084T0.mo5354E() ? 2131820799 : 2131820800));
            this.f5124n1.setOnClickListener(new C1402c(this));
            this.f5124n1.setOnMessageViewCloseListener(new C1404d(this));
        }
    }

    /* renamed from: s2 */
    private void m6104s2() {
        if (this.f5110g1 == null) {
            this.f5110g1 = new Handler();
        }
        if (this.f5112h1 == null) {
            this.f5112h1 = new C1382q((C1373h) null);
        }
        this.f5110g1.postDelayed(this.f5112h1, 60000);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m6107u2() {
        if (this.f5058G0 == null) {
            C2112p.C2114b bVar = new C2112p.C2114b(this);
            bVar.mo7552q(2131820582);
            bVar.mo7541f(2131820580);
            bVar.mo7544i(2131820581, new C1381p());
            bVar.mo7548m(2131820579, (DialogInterface.OnClickListener) null);
            this.f5058G0 = bVar.mo7536a();
        }
        this.f5058G0.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public void m6109v2() {
        C2073a0 a0Var = new C2073a0(this);
        this.f5064J0 = a0Var;
        a0Var.mo7367H(getString(2131820682));
        this.f5064J0.setCancelable(false);
        this.f5064J0.mo7370V(true);
        this.f5064J0.mo7522F(-1, getString(17039360), new C1380o());
        this.f5064J0.show();
    }

    /* renamed from: w2 */
    private void m6111w2() {
        View view;
        this.f5118k1 = new C1435v(getWindow());
        Sensor sensor = this.f5067L;
        if (sensor != null) {
            boolean registerListener = this.f5065K.registerListener(this.f5128p1, sensor, 1);
            Log.i("Compass:CompassActivity", "register OrientationSensor :" + registerListener);
        } else {
            Log.e("Compass:CompassActivity", "OrientationSensor is null");
        }
        Sensor sensor2 = this.f5069M;
        if (sensor2 != null) {
            boolean registerListener2 = this.f5065K.registerListener(this.f5130q1, sensor2, 1);
            Log.i("Compass:CompassActivity", "register mMagneticSensor :" + registerListener2);
        }
        this.f5105e0.mo5325n();
        if (this.f5052D0) {
            if (C1420h.m6348c()) {
                this.f5129q0.setVisibility(0);
                view = this.f5129q0;
            } else {
                m6076e2();
                this.f5104d1.mo5344h(this.f5099b0, 2131231689);
                view = this.f5101c0;
            }
            view.announceForAccessibility(getString(2131820598));
        }
    }

    /* renamed from: x2 */
    private void m6113x2() {
        C2112p pVar = this.f5056F0;
        if (pVar == null || !pVar.isShowing()) {
            C2112p.C2114b bVar = new C2112p.C2114b(this);
            bVar.mo7538c(false);
            bVar.mo7552q(2131820715);
            bVar.mo7541f(C1403c0.m6271r() ? 2131820714 : 2131820713);
            bVar.mo7548m(2131820997, new C1367b());
            bVar.mo7544i(2131820996, new C1368c());
            C2112p a = bVar.mo7536a();
            this.f5056F0 = a;
            a.show();
        }
    }

    /* renamed from: y2 */
    private void m6115y2() {
        if (this.f5054E0 == null) {
            C2112p.C2114b bVar = new C2112p.C2114b(this);
            bVar.mo7552q(2131820798);
            bVar.mo7541f(this.f5084T0.mo5354E() ? 2131820796 : 2131820797);
            bVar.mo7548m(2131820792, new C1366a());
            bVar.mo7544i(2131820793, (DialogInterface.OnClickListener) null);
            this.f5054E0 = bVar.mo7536a();
        }
        this.f5054E0.show();
        this.f5070M0 = true;
    }

    /* renamed from: z2 */
    private void m6117z2() {
        C1430q qVar = new C1430q(this);
        qVar.mo7522F(-1, getString(17039370), new C1379n(qVar));
        qVar.mo7522F(-2, getString(17039360), (DialogInterface.OnClickListener) null);
        this.f5062I0 = qVar;
        qVar.show();
    }

    /* renamed from: A */
    public void mo397A(C0116a.C0120d dVar, C0949f0 f0Var) {
        if (this.f5137w0 == null) {
            Log.e("Compass:CompassActivity", "onTabSelected: mScreen is null, return");
            return;
        }
        this.f5137w0.mo5273A(dVar.mo392d());
    }

    /* renamed from: H2 */
    public void mo5222H2(Context context) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165343);
        int integer = getResources().getInteger(2131427355);
        int integer2 = getResources().getInteger(2131427356);
        C1401b0.m6243a(this.f5109g0, dimensionPixelSize);
        if (!C1403c0.m6268o(context)) {
            Log.d("Compass:CompassActivity", "updateBottomUnitLayout: FoldNarrow/Phone screen!");
            C1401b0.m6248f(this.f5113i0, -1);
            C1401b0.m6247e(this.f5113i0, -1);
            C1401b0.m6251i(this.f5113i0, -1);
            C1401b0.m6244b(this.f5113i0, 0);
            C1401b0.m6249g(this.f5113i0, 2131361921);
            C1401b0.m6246d(this.f5113i0, 2131361921);
            C1401b0.m6250h(this.f5113i0, 2131361921);
            C1401b0.m6244b(this.f5109g0, -1);
            C1401b0.m6245c(this.f5109g0, 2131361923);
            C1401b0.m6248f(this.f5123n0, -1);
            C1401b0.m6247e(this.f5123n0, -1);
            C1401b0.m6251i(this.f5123n0, -1);
            C1401b0.m6244b(this.f5123n0, -1);
            C1401b0.m6248f(this.f5115j0, -1);
            C1401b0.m6247e(this.f5115j0, -1);
            C1401b0.m6249g(this.f5115j0, 2131361922);
            C1401b0.m6246d(this.f5115j0, 2131361922);
            C1401b0.m6248f(this.f5125o0, -1);
            C1401b0.m6246d(this.f5125o0, -1);
            C1401b0.m6251i(this.f5125o0, -1);
            C1401b0.m6244b(this.f5125o0, -1);
            C1401b0.m6247e(this.f5121m0, -1);
            C1401b0.m6246d(this.f5121m0, 0);
            C1401b0.m6252j(this.f5117k0, integer);
            C1401b0.m6252j(this.f5119l0, integer2);
            C1401b0.m6252j(this.f5121m0, integer);
            C1401b0.m6252j(this.f5123n0, 0);
            C1401b0.m6252j(this.f5125o0, 0);
            return;
        }
        Log.d("Compass:CompassActivity", "updateBottomUnitLayout: Fold broad screen");
        C1401b0.m6249g(this.f5113i0, -1);
        C1401b0.m6246d(this.f5113i0, -1);
        C1401b0.m6250h(this.f5113i0, -1);
        C1401b0.m6244b(this.f5113i0, 2131361921);
        C1401b0.m6248f(this.f5113i0, 2131362264);
        C1401b0.m6247e(this.f5113i0, 2131362267);
        C1401b0.m6251i(this.f5113i0, 2131361921);
        C1401b0.m6244b(this.f5109g0, 0);
        C1401b0.m6245c(this.f5109g0, -1);
        C1401b0.m6248f(this.f5123n0, 2131361923);
        C1401b0.m6247e(this.f5123n0, 2131361920);
        C1401b0.m6251i(this.f5123n0, 2131361921);
        C1401b0.m6244b(this.f5123n0, 2131361921);
        C1401b0.m6249g(this.f5115j0, -1);
        C1401b0.m6246d(this.f5115j0, -1);
        C1401b0.m6248f(this.f5115j0, 2131362267);
        C1401b0.m6247e(this.f5115j0, 2131362265);
        C1401b0.m6248f(this.f5125o0, 2131361920);
        C1401b0.m6246d(this.f5125o0, 0);
        C1401b0.m6251i(this.f5125o0, 2131361921);
        C1401b0.m6244b(this.f5125o0, 2131361921);
        C1401b0.m6247e(this.f5121m0, 2131361923);
        C1401b0.m6246d(this.f5121m0, -1);
        C1401b0.m6252j(this.f5117k0, integer);
        C1401b0.m6252j(this.f5119l0, integer2);
        C1401b0.m6252j(this.f5123n0, integer2);
        C1401b0.m6252j(this.f5125o0, integer);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f5140z0.mo5209l();
            return false;
        } else if (i != 2) {
            return false;
        } else {
            this.f5140z0.mo5208h();
            return false;
        }
    }

    /* renamed from: o */
    public void mo398o(C0116a.C0120d dVar, C0949f0 f0Var) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.i("Compass:CompassActivity", "onActivityResult, requestCode = " + i + ", resultCode = " + i2);
        if (i == 2) {
            if (i2 != -3) {
                if (i2 == 666 || i2 == 0) {
                    this.f5055F = false;
                    C1445z.m6432c(false);
                    C1421i.m6359k(this, false);
                } else if (i2 != 1) {
                    Log.d("Compass:CompassActivity", "onActivityResult: unknown resultCode");
                    return;
                } else {
                    this.f5055F = false;
                    C1445z.m6432c(true);
                    C1421i.m6359k(this, true);
                }
                C1421i.m6358j(this, true);
                this.f5059H = true;
                return;
            }
            Log.i("Compass:CompassActivity", "cta local change!!!");
            this.f5055F = C1396a.m6229i(this, 2);
        } else if (C1428o.m6371a(i, i2)) {
            Log.i("Compass:CompassActivity", "korean activity resultCode = " + i2);
            this.f5057G = false;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.d("Compass:CompassActivity", "act onConfigurationChanged");
        Context applicationContext = getApplicationContext();
        super.onConfigurationChanged(configuration);
        C1401b0.m6253k(this.f5124n1, C1403c0.m6258e(applicationContext) + getResources().getDimensionPixelSize(2131165333));
        m6043I2();
        mo5222H2(applicationContext);
        CompassScreen compassScreen = this.f5138x0;
        if (compassScreen != null) {
            compassScreen.mo5271l(applicationContext);
        }
        GradienterScreen gradienterScreen = this.f5139y0;
        if (gradienterScreen != null) {
            gradienterScreen.mo5297i(applicationContext);
        }
        RotateView rotateView = this.f5127p0;
        if (rotateView != null) {
            rotateView.mo5316l(applicationContext);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getResources().getConfiguration().smallestScreenWidthDp;
        Log.d("Compass:CompassActivity", "act onCreate, the small width is " + i + "dp");
        this.f5108f1 = new Handler(getMainLooper(), this);
        getWindow().getDecorView().setSystemUiVisibility(0);
        getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
        setContentView(2131558428);
        m6062X1();
        m6072c2();
        m6070b2();
        if (bundle == null) {
            m6098p2();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131623936, menu);
        menu.findItem(2131362200).setVisible(true);
        menu.findItem(2131362185).setVisible(true);
        if (!C1396a.m6226f(getApplicationContext())) {
            menu.removeItem(2131362185);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Log.d("Compass:CompassActivity", "act onDestory");
        C1403c0.m6256c(this.f5062I0);
        C1403c0.m6256c(this.f5054E0);
        C1403c0.m6256c(this.f5056F0);
        C1403c0.m6256c(this.f5064J0);
        C1403c0.m6256c(this.f5060H0);
        this.f5105e0.mo5326o();
        this.f5138x0 = null;
        this.f5084T0.mo5355H((C1407g.C1413f) null);
        C1424l.m6361a().mo5402f();
        unregisterReceiver(this.f5098a1);
        unregisterReceiver(this.f5100b1);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        m6111w2();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("Compass:CompassActivity", "act onNewIntent");
        m6098p2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        super.onOptionsItemSelected(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 2131362185) {
            m6090l2();
            return true;
        } else if (itemId != 2131362200) {
            return true;
        } else {
            m6092m2();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Log.d("Compass:CompassActivity", "act onPause, isCalibrating: " + this.f5052D0 + ", cameraFlag: " + this.f5076P0);
        m6055T1();
        if (this.f5067L != null) {
            this.f5065K.unregisterListener(this.f5128p1);
        }
        if (this.f5069M != null) {
            this.f5065K.unregisterListener(this.f5130q1);
        }
        this.f5084T0.mo5358K();
        this.f5105e0.mo5326o();
        if (this.f5052D0) {
            if (C1420h.m6348c()) {
                this.f5129q0.setVisibility(8);
            } else {
                this.f5104d1.mo5345i();
            }
        }
        this.f5118k1 = null;
        this.f5102c1 = false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.d("Compass:CompassActivity", "act onRequestPermissionsResult");
        if (i == 0) {
            this.f5124n1.setVisibility(8);
            Log.d("Compass:CompassActivity", "permissions: " + Arrays.toString(strArr) + ", grantResults: " + Arrays.toString(iArr));
            if (!C1396a.m6221a(this)) {
                m6030B2();
            }
            this.f5072N0 = false;
        } else if (i == 1) {
            Log.d("Compass:CompassActivity", "permissions: " + Arrays.toString(strArr) + ", grantResults: " + Arrays.toString(iArr));
            this.f5122m1.setVisibility(8);
            GradienterView gradienterView = this.f5126o1;
            if (gradienterView != null) {
                gradienterView.setVisibility(0);
            } else {
                Log.w("Compass:CompassActivity", "onRequestPermissionsResult mGradienterPortrait is null");
            }
            if (!C1396a.m6225e("android.permission.CAMERA")) {
                m6030B2();
            }
            this.f5074O0 = false;
        } else {
            return;
        }
        this.f5080R0 = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f5114i1 = bundle.getBoolean("processing_cta", false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Log.d("Compass:CompassActivity", "act onResume, isCalibrating: " + this.f5052D0 + ", cameraFlag: " + this.f5076P0);
        m6111w2();
        if (!this.f5055F && !this.f5059H && !C1421i.m6349a(this)) {
            this.f5055F = C1396a.m6229i(this, 2);
        }
        m6102r2();
        this.f5102c1 = true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("processing_cta", this.f5114i1);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Log.d("Compass:CompassActivity", "onStop: ");
    }

    /* renamed from: t2 */
    public void mo5230t2() {
        new C1423k(this, getString(2131820878), getString(2131820875), true, 2131820877, 2131820876, new C1405e(this), (DialogInterface.OnClickListener) null).mo3521f2(mo3605g0(), (String) null);
    }

    /* renamed from: y */
    public void mo399y(C0116a.C0120d dVar, C0949f0 f0Var) {
    }
}
