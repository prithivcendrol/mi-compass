package miuix.springback.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.core.view.C0627a0;
import androidx.core.view.C0660b0;
import androidx.core.view.C0678d0;
import androidx.core.view.C0682e0;
import androidx.core.widget.C0823i;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.List;
import p056i4.C1658a;
import p062j4.C1760b;
import p073l3.C1877a;
import p117t2.C2693a;
import p132w2.C2887c;
import p132w2.C2888d;
import p132w2.C2889e;

public class SpringBackLayout extends ViewGroup implements C0678d0, C0627a0, C2887c {

    /* renamed from: A */
    private int f9297A;

    /* renamed from: B */
    private int f9298B;

    /* renamed from: C */
    private C1760b f9299C;

    /* renamed from: D */
    private C2393a f9300D;

    /* renamed from: E */
    protected int f9301E;

    /* renamed from: F */
    protected int f9302F;

    /* renamed from: G */
    private float f9303G;

    /* renamed from: H */
    private float f9304H;

    /* renamed from: I */
    private boolean f9305I;

    /* renamed from: J */
    private boolean f9306J = true;

    /* renamed from: K */
    private List<C2889e> f9307K = new ArrayList();

    /* renamed from: L */
    private C2392a f9308L;

    /* renamed from: M */
    private int f9309M = 0;

    /* renamed from: d */
    private View f9310d;

    /* renamed from: e */
    private int f9311e;

    /* renamed from: f */
    private int f9312f;

    /* renamed from: g */
    private float f9313g;

    /* renamed from: h */
    private float f9314h;

    /* renamed from: i */
    private float f9315i;

    /* renamed from: j */
    private float f9316j;

    /* renamed from: k */
    private boolean f9317k;

    /* renamed from: l */
    private int f9318l = -1;

    /* renamed from: m */
    private int f9319m = 0;

    /* renamed from: n */
    private final C0682e0 f9320n = new C0682e0(this);

    /* renamed from: o */
    private final C0660b0 f9321o = C2888d.m11911s(this);

    /* renamed from: p */
    private final int[] f9322p = new int[2];

    /* renamed from: q */
    private final int[] f9323q = new int[2];

    /* renamed from: r */
    private final int[] f9324r = new int[2];

    /* renamed from: s */
    private int f9325s;

    /* renamed from: t */
    private boolean f9326t;

    /* renamed from: u */
    private boolean f9327u;

    /* renamed from: v */
    private float f9328v;

    /* renamed from: w */
    private float f9329w;

    /* renamed from: x */
    private float f9330x;

    /* renamed from: y */
    private int f9331y;

    /* renamed from: z */
    private int f9332z;

    /* renamed from: miuix.springback.view.SpringBackLayout$a */
    public interface C2392a {
        /* renamed from: a */
        boolean mo9284a();
    }

    public SpringBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9312f = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1658a.f6542n);
        this.f9311e = obtainStyledAttributes.getResourceId(C1658a.f6544p, -1);
        this.f9297A = obtainStyledAttributes.getInt(C1658a.f6543o, 2);
        this.f9298B = obtainStyledAttributes.getInt(C1658a.f6545q, 3);
        obtainStyledAttributes.recycle();
        this.f9299C = new C1760b();
        this.f9300D = new C2393a(this, this.f9297A);
        setNestedScrollingEnabled(true);
        Point d = C2693a.m11235d(context);
        this.f9301E = d.x;
        this.f9302F = d.y;
        if (C1877a.f7248a) {
            this.f9306J = false;
        }
    }

    /* renamed from: B */
    private boolean m10183B(MotionEvent motionEvent) {
        float f;
        String str;
        boolean z = false;
        if (!m10207v(1) && !m10206u(1)) {
            return false;
        }
        if (m10207v(1) && !m10196Q()) {
            return false;
        }
        if (m10206u(1) && !m10195P()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f9318l;
                    if (i == -1) {
                        str = "Got ACTION_MOVE event but don't have an active pointer id.";
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            str = "Got ACTION_MOVE event but have an invalid active pointer id.";
                        } else {
                            f = motionEvent.getX(findPointerIndex);
                            if (m10206u(1) && m10207v(1)) {
                                z = true;
                            }
                            if ((z || !m10207v(1)) && (!z || f <= this.f9315i) ? !(this.f9315i - f <= ((float) this.f9312f) || this.f9317k) : !(f - this.f9315i <= ((float) this.f9312f) || this.f9317k)) {
                                this.f9317k = true;
                                m10203p(1);
                            }
                        }
                    }
                    Log.e("SpringBackLayout", str);
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m10189H(motionEvent);
                    }
                }
                return this.f9317k;
            }
            this.f9317k = false;
            this.f9318l = -1;
            return this.f9317k;
        }
        int pointerId = motionEvent.getPointerId(0);
        this.f9318l = pointerId;
        int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
        if (findPointerIndex2 < 0) {
            return false;
        }
        this.f9315i = motionEvent.getX(findPointerIndex2);
        if (getScrollX() != 0) {
            this.f9317k = true;
            f = this.f9315i;
        } else {
            this.f9317k = false;
            return this.f9317k;
        }
        this.f9316j = f;
        return this.f9317k;
    }

    /* renamed from: C */
    private boolean m10184C(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (m10207v(1) || m10206u(1)) ? m10206u(1) ? m10188G(motionEvent, actionMasked, 1) : m10186E(motionEvent, actionMasked, 1) : m10187F(motionEvent, actionMasked, 1);
    }

    /* renamed from: D */
    private void m10185D(int i, int[] iArr, int i2) {
        float f;
        boolean z = this.f9331y == 2;
        int i3 = z ? 2 : 1;
        int abs = Math.abs(z ? getScrollY() : getScrollX());
        float f2 = 0.0f;
        if (i2 == 0) {
            if (i > 0) {
                float f3 = this.f9329w;
                if (f3 > 0.0f) {
                    float f4 = (float) i;
                    if (f4 > f3) {
                        m10201g((int) f3, iArr, i3);
                        this.f9329w = 0.0f;
                    } else {
                        this.f9329w = f3 - f4;
                        m10201g(i, iArr, i3);
                    }
                    m10203p(1);
                    f = mo9283z(this.f9329w, i3);
                }
            }
            if (i < 0) {
                float f5 = this.f9330x;
                if ((-f5) < 0.0f) {
                    float f6 = (float) i;
                    if (f6 < (-f5)) {
                        m10201g((int) f5, iArr, i3);
                        this.f9330x = 0.0f;
                    } else {
                        this.f9330x = f5 + f6;
                        m10201g(i, iArr, i3);
                    }
                    m10203p(1);
                    f = -mo9283z(this.f9330x, i3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            float f7 = i3 == 2 ? this.f9304H : this.f9303G;
            if (i > 0) {
                float f8 = this.f9329w;
                if (f8 > 0.0f) {
                    if (f7 > 2000.0f) {
                        float z2 = mo9283z(f8, i3);
                        float f9 = (float) i;
                        if (f9 > z2) {
                            m10201g((int) z2, iArr, i3);
                            this.f9329w = 0.0f;
                        } else {
                            m10201g(i, iArr, i3);
                            f2 = z2 - f9;
                            this.f9329w = mo9243A(f2, Math.signum(f2) * Math.abs(mo9282y(i3)), i3);
                        }
                        m10208w(f2, i3);
                        m10203p(1);
                        return;
                    }
                    if (!this.f9305I) {
                        this.f9305I = true;
                        m10192L(f7, i3, false);
                    }
                    if (this.f9299C.mo6048a()) {
                        scrollTo(this.f9299C.mo6050c(), this.f9299C.mo6051d());
                        this.f9329w = mo9243A((float) abs, Math.abs(mo9282y(i3)), i3);
                    } else {
                        this.f9329w = 0.0f;
                    }
                    m10201g(i, iArr, i3);
                    return;
                }
            }
            if (i < 0) {
                float f10 = this.f9330x;
                if ((-f10) < 0.0f) {
                    if (f7 < -2000.0f) {
                        float z3 = mo9283z(f10, i3);
                        float f11 = (float) i;
                        if (f11 < (-z3)) {
                            m10201g((int) z3, iArr, i3);
                            this.f9330x = 0.0f;
                        } else {
                            m10201g(i, iArr, i3);
                            f2 = z3 + f11;
                            this.f9330x = mo9243A(f2, Math.signum(f2) * Math.abs(mo9282y(i3)), i3);
                        }
                        m10203p(1);
                        f = -f2;
                    } else {
                        if (!this.f9305I) {
                            this.f9305I = true;
                            m10192L(f7, i3, false);
                        }
                        if (this.f9299C.mo6048a()) {
                            scrollTo(this.f9299C.mo6050c(), this.f9299C.mo6051d());
                            this.f9330x = mo9243A((float) abs, Math.abs(mo9282y(i3)), i3);
                        } else {
                            this.f9330x = 0.0f;
                        }
                        m10201g(i, iArr, i3);
                        return;
                    }
                }
            }
            if (i != 0) {
                if (!((this.f9330x == 0.0f || this.f9329w == 0.0f) && this.f9305I && getScrollY() == 0)) {
                    return;
                }
                m10201g(i, iArr, i3);
                return;
            }
            return;
        }
        m10208w(f, i3);
    }

    /* renamed from: E */
    private boolean m10186E(MotionEvent motionEvent, int i, int i2) {
        float f;
        float f2;
        float f3;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f9318l);
                    if (findPointerIndex < 0) {
                        Log.e("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else if (this.f9317k) {
                        if (i2 == 2) {
                            f2 = motionEvent.getY(findPointerIndex);
                            f = Math.signum(f2 - this.f9314h);
                            f3 = this.f9314h;
                        } else {
                            f2 = motionEvent.getX(findPointerIndex);
                            f = Math.signum(f2 - this.f9316j);
                            f3 = this.f9316j;
                        }
                        float z = f * mo9283z(f2 - f3, i2);
                        if (z > 0.0f) {
                            mo9244K(true);
                            m10208w(z, i2);
                        } else {
                            m10208w(0.0f, i2);
                            return false;
                        }
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f9318l);
                        if (findPointerIndex2 < 0) {
                            Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i2 == 2) {
                            float y = motionEvent.getY(findPointerIndex2) - this.f9313g;
                            i3 = motionEvent.getActionIndex();
                            if (i3 < 0) {
                                Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y2 = motionEvent.getY(i3) - y;
                            this.f9313g = y2;
                            this.f9314h = y2;
                        } else {
                            float x = motionEvent.getX(findPointerIndex2) - this.f9315i;
                            i3 = motionEvent.getActionIndex();
                            if (i3 < 0) {
                                Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x2 = motionEvent.getX(i3) - x;
                            this.f9315i = x2;
                            this.f9316j = x2;
                        }
                        this.f9318l = motionEvent.getPointerId(i3);
                    } else if (i == 6) {
                        m10189H(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f9318l) < 0) {
                Log.e("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f9317k) {
                this.f9317k = false;
                m10193M(i2);
            }
            this.f9318l = -1;
            return false;
        }
        this.f9318l = motionEvent.getPointerId(0);
        m10199e(i2);
        return true;
    }

    /* renamed from: F */
    private boolean m10187F(MotionEvent motionEvent, int i, int i2) {
        float f;
        float f2;
        float f3;
        int i3;
        if (i == 0) {
            this.f9318l = motionEvent.getPointerId(0);
            m10199e(i2);
        } else if (i != 1) {
            if (i == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f9318l);
                if (findPointerIndex < 0) {
                    Log.e("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                } else if (this.f9317k) {
                    if (i2 == 2) {
                        f2 = motionEvent.getY(findPointerIndex);
                        f = Math.signum(f2 - this.f9314h);
                        f3 = this.f9314h;
                    } else {
                        f2 = motionEvent.getX(findPointerIndex);
                        f = Math.signum(f2 - this.f9316j);
                        f3 = this.f9316j;
                    }
                    mo9244K(true);
                    m10208w(f * mo9283z(f2 - f3, i2), i2);
                }
            } else if (i == 3) {
                return false;
            } else {
                if (i == 5) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f9318l);
                    if (findPointerIndex2 < 0) {
                        Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                        return false;
                    }
                    if (i2 == 2) {
                        float y = motionEvent.getY(findPointerIndex2) - this.f9313g;
                        i3 = motionEvent.getActionIndex();
                        if (i3 < 0) {
                            Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float y2 = motionEvent.getY(i3) - y;
                        this.f9313g = y2;
                        this.f9314h = y2;
                    } else {
                        float x = motionEvent.getX(findPointerIndex2) - this.f9315i;
                        i3 = motionEvent.getActionIndex();
                        if (i3 < 0) {
                            Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float x2 = motionEvent.getX(i3) - x;
                        this.f9315i = x2;
                        this.f9316j = x2;
                    }
                    this.f9318l = motionEvent.getPointerId(i3);
                } else if (i == 6) {
                    m10189H(motionEvent);
                }
            }
        } else if (motionEvent.findPointerIndex(this.f9318l) < 0) {
            Log.e("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
            return false;
        } else {
            if (this.f9317k) {
                this.f9317k = false;
                m10193M(i2);
            }
            this.f9318l = -1;
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private boolean m10188G(MotionEvent motionEvent, int i, int i2) {
        float f;
        float f2;
        float f3;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f9318l);
                    if (findPointerIndex < 0) {
                        Log.e("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else if (this.f9317k) {
                        if (i2 == 2) {
                            f2 = motionEvent.getY(findPointerIndex);
                            f = Math.signum(this.f9314h - f2);
                            f3 = this.f9314h;
                        } else {
                            f2 = motionEvent.getX(findPointerIndex);
                            f = Math.signum(this.f9316j - f2);
                            f3 = this.f9316j;
                        }
                        float z = f * mo9283z(f3 - f2, i2);
                        if (z > 0.0f) {
                            mo9244K(true);
                            m10208w(-z, i2);
                        } else {
                            m10208w(0.0f, i2);
                            return false;
                        }
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f9318l);
                        if (findPointerIndex2 < 0) {
                            Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i2 == 2) {
                            float y = motionEvent.getY(findPointerIndex2) - this.f9313g;
                            i3 = motionEvent.getActionIndex();
                            if (i3 < 0) {
                                Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y2 = motionEvent.getY(i3) - y;
                            this.f9313g = y2;
                            this.f9314h = y2;
                        } else {
                            float x = motionEvent.getX(findPointerIndex2) - this.f9315i;
                            i3 = motionEvent.getActionIndex();
                            if (i3 < 0) {
                                Log.e("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x2 = motionEvent.getX(i3) - x;
                            this.f9315i = x2;
                            this.f9316j = x2;
                        }
                        this.f9318l = motionEvent.getPointerId(i3);
                    } else if (i == 6) {
                        m10189H(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f9318l) < 0) {
                Log.e("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f9317k) {
                this.f9317k = false;
                m10193M(i2);
            }
            this.f9318l = -1;
            return false;
        }
        this.f9318l = motionEvent.getPointerId(0);
        m10199e(i2);
        return true;
    }

    /* renamed from: H */
    private void m10189H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9318l) {
            this.f9318l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: I */
    private boolean m10190I(MotionEvent motionEvent) {
        float f;
        String str;
        boolean z = false;
        if (!m10207v(2) && !m10206u(2)) {
            return false;
        }
        if (m10207v(2) && !m10196Q()) {
            return false;
        }
        if (m10206u(2) && !m10195P()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f9318l;
                    if (i == -1) {
                        str = "Got ACTION_MOVE event but don't have an active pointer id.";
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            str = "Got ACTION_MOVE event but have an invalid active pointer id.";
                        } else {
                            f = motionEvent.getY(findPointerIndex);
                            if (m10206u(2) && m10207v(2)) {
                                z = true;
                            }
                            if ((z || !m10207v(2)) && (!z || f <= this.f9313g) ? !(this.f9313g - f <= ((float) this.f9312f) || this.f9317k) : !(f - this.f9313g <= ((float) this.f9312f) || this.f9317k)) {
                                this.f9317k = true;
                                m10203p(1);
                            }
                        }
                    }
                    Log.e("SpringBackLayout", str);
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m10189H(motionEvent);
                    }
                }
                return this.f9317k;
            }
            this.f9317k = false;
            this.f9318l = -1;
            return this.f9317k;
        }
        int pointerId = motionEvent.getPointerId(0);
        this.f9318l = pointerId;
        int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
        if (findPointerIndex2 < 0) {
            return false;
        }
        this.f9313g = motionEvent.getY(findPointerIndex2);
        if (getScrollY() != 0) {
            this.f9317k = true;
            f = this.f9313g;
        } else {
            this.f9317k = false;
            return this.f9317k;
        }
        this.f9314h = f;
        return this.f9317k;
    }

    /* renamed from: J */
    private boolean m10191J(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (m10207v(2) || m10206u(2)) ? m10206u(2) ? m10188G(motionEvent, actionMasked, 2) : m10186E(motionEvent, actionMasked, 2) : m10187F(motionEvent, actionMasked, 2);
    }

    /* renamed from: L */
    private void m10192L(float f, int i, boolean z) {
        C2392a aVar = this.f9308L;
        if (aVar == null || !aVar.mo9284a()) {
            this.f9299C.mo6049b();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            this.f9299C.mo6054g((float) scrollX, 0.0f, (float) scrollY, 0.0f, f, i, false);
            m10203p((scrollX == 0 && scrollY == 0 && f == 0.0f) ? 0 : 2);
            if (z) {
                postInvalidateOnAnimation();
            }
        }
    }

    /* renamed from: M */
    private void m10193M(int i) {
        m10192L(0.0f, i, true);
    }

    /* renamed from: N */
    private void m10194N(int i) {
        this.f9326t = false;
        if (this.f9305I) {
            if (this.f9299C.mo6053f()) {
                m10192L(i == 2 ? this.f9304H : this.f9303G, i, false);
            }
            postInvalidateOnAnimation();
            return;
        }
        m10193M(i);
    }

    /* renamed from: P */
    private boolean m10195P() {
        return (this.f9298B & 2) != 0;
    }

    /* renamed from: Q */
    private boolean m10196Q() {
        return (this.f9298B & 1) != 0;
    }

    /* renamed from: b */
    private void m10197b(int i) {
        if (getScrollX() != 0) {
            this.f9317k = true;
            float A = mo9243A((float) Math.abs(getScrollX()), Math.abs(mo9282y(i)), 2);
            this.f9315i = getScrollX() < 0 ? this.f9315i - A : this.f9315i + A;
            this.f9316j = this.f9315i;
            return;
        }
        this.f9317k = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10198d(android.view.MotionEvent r6) {
        /*
            r5 = this;
            miuix.springback.view.a r0 = r5.f9300D
            r0.mo9285a(r6)
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r3) goto L_0x002a
            if (r0 == r2) goto L_0x001d
            r4 = 3
            if (r0 == r4) goto L_0x002a
            r1 = 6
            if (r0 == r1) goto L_0x0019
            goto L_0x006b
        L_0x0019:
            r5.m10189H(r6)
            goto L_0x006b
        L_0x001d:
            int r6 = r5.f9332z
            if (r6 != 0) goto L_0x006b
            miuix.springback.view.a r6 = r5.f9300D
            int r6 = r6.f9337e
            if (r6 == 0) goto L_0x006b
            r5.f9332z = r6
            goto L_0x006b
        L_0x002a:
            r5.m10202h(r1)
            int r6 = r5.f9297A
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0036
            r5.m10193M(r2)
            goto L_0x006b
        L_0x0036:
            r5.m10193M(r3)
            goto L_0x006b
        L_0x003a:
            miuix.springback.view.a r6 = r5.f9300D
            float r0 = r6.f9334b
            r5.f9313g = r0
            float r0 = r6.f9335c
            r5.f9315i = r0
            int r6 = r6.f9336d
            r5.f9318l = r6
            int r6 = r5.getScrollY()
            if (r6 == 0) goto L_0x0054
            r5.f9332z = r2
        L_0x0050:
            r5.mo9244K(r3)
            goto L_0x005f
        L_0x0054:
            int r6 = r5.getScrollX()
            if (r6 == 0) goto L_0x005d
            r5.f9332z = r3
            goto L_0x0050
        L_0x005d:
            r5.f9332z = r1
        L_0x005f:
            int r6 = r5.f9297A
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0068
            r5.m10199e(r2)
            goto L_0x006b
        L_0x0068:
            r5.m10199e(r3)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.springback.view.SpringBackLayout.m10198d(android.view.MotionEvent):void");
    }

    /* renamed from: e */
    private void m10199e(int i) {
        if (i == 2) {
            m10200f(i);
        } else {
            m10197b(i);
        }
    }

    /* renamed from: f */
    private void m10200f(int i) {
        if (getScrollY() != 0) {
            this.f9317k = true;
            float A = mo9243A((float) Math.abs(getScrollY()), Math.abs(mo9282y(i)), 2);
            this.f9313g = getScrollY() < 0 ? this.f9313g - A : this.f9313g + A;
            this.f9314h = this.f9313g;
            return;
        }
        this.f9317k = false;
    }

    /* renamed from: g */
    private void m10201g(int i, int[] iArr, int i2) {
        if (i2 == 2) {
            iArr[1] = i;
        } else {
            iArr[0] = i;
        }
    }

    /* renamed from: h */
    private void m10202h(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: p */
    private void m10203p(int i) {
        int i2 = this.f9309M;
        if (i2 != i) {
            this.f9309M = i;
            for (C2889e a : this.f9307K) {
                a.mo10182a(i2, i, this.f9299C.mo6053f());
            }
        }
    }

    /* renamed from: q */
    private void m10204q() {
        if (this.f9310d == null) {
            int i = this.f9311e;
            if (i != -1) {
                this.f9310d = findViewById(i);
            } else {
                throw new IllegalArgumentException("invalid target Id");
            }
        }
        if (this.f9310d != null) {
            if (isEnabled()) {
                View view = this.f9310d;
                if ((view instanceof C0627a0) && !view.isNestedScrollingEnabled()) {
                    this.f9310d.setNestedScrollingEnabled(true);
                }
            }
            if (this.f9310d.getOverScrollMode() != 2) {
                this.f9310d.setOverScrollMode(2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("fail to get target");
    }

    /* renamed from: t */
    private boolean m10205t(int i) {
        return this.f9332z == i;
    }

    /* renamed from: u */
    private boolean m10206u(int i) {
        if (i != 2) {
            return !this.f9310d.canScrollHorizontally(1);
        }
        View view = this.f9310d;
        return view instanceof ListView ? !C0823i.m3290a((ListView) view, 1) : !view.canScrollVertically(1);
    }

    /* renamed from: v */
    private boolean m10207v(int i) {
        if (i != 2) {
            return !this.f9310d.canScrollHorizontally(-1);
        }
        View view = this.f9310d;
        return view instanceof ListView ? !C0823i.m3290a((ListView) view, -1) : !view.canScrollVertically(-1);
    }

    /* renamed from: w */
    private void m10208w(float f, int i) {
        int i2 = (int) (-f);
        if (i == 2) {
            scrollTo(0, i2);
        } else {
            scrollTo(i2, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public float mo9243A(float f, float f2, int i) {
        int r = mo9269r(i);
        if (Math.abs(f) >= Math.abs(f2)) {
            f = f2;
        }
        double d = (double) r;
        return (float) (d - (Math.pow(d, 0.6666666666666666d) * Math.pow((double) (((float) r) - (f * 3.0f)), 0.3333333333333333d)));
    }

    /* renamed from: K */
    public void mo9244K(boolean z) {
        ViewParent parent = getParent();
        parent.requestDisallowInterceptTouchEvent(z);
        while (parent != null) {
            if (parent instanceof SpringBackLayout) {
                ((SpringBackLayout) parent).mo9271s(z);
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: O */
    public void mo9245O(int i) {
        this.f9321o.mo2817r(i);
    }

    /* renamed from: a */
    public boolean mo9246a(float f, float f2) {
        this.f9303G = f;
        this.f9304H = f2;
        return true;
    }

    /* renamed from: c */
    public void mo1174c(View view, View view2, int i, int i2) {
        if (this.f9306J) {
            int i3 = 2;
            boolean z = this.f9331y == 2;
            if (!z) {
                i3 = 1;
            }
            float scrollY = (float) (z ? getScrollY() : getScrollX());
            if (i2 != 0) {
                if (scrollY == 0.0f) {
                    this.f9328v = 0.0f;
                } else {
                    this.f9328v = mo9243A(Math.abs(scrollY), Math.abs(mo9282y(i3)), i3);
                }
                this.f9326t = true;
                this.f9319m = 0;
            } else {
                if (scrollY == 0.0f) {
                    this.f9329w = 0.0f;
                } else if (scrollY < 0.0f) {
                    this.f9329w = mo9243A(Math.abs(scrollY), Math.abs(mo9282y(i3)), i3);
                } else {
                    this.f9329w = 0.0f;
                    this.f9330x = mo9243A(Math.abs(scrollY), Math.abs(mo9282y(i3)), i3);
                    this.f9327u = true;
                }
                this.f9330x = 0.0f;
                this.f9327u = true;
            }
            this.f9304H = 0.0f;
            this.f9303G = 0.0f;
            this.f9305I = false;
            this.f9299C.mo6049b();
        }
        onNestedScrollAccepted(view, view2, i);
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f9299C.mo6048a()) {
            scrollTo(this.f9299C.mo6050c(), this.f9299C.mo6051d());
            if (!this.f9299C.mo6053f()) {
                postInvalidateOnAnimation();
                return;
            }
            boolean z = false;
            if (!(getScrollX() == 0 && getScrollY() == 0)) {
                int i = 2;
                if (this.f9309M != 2) {
                    Log.d("SpringBackLayout", "Scroll stop but state is not correct.");
                    if (this.f9331y == 2) {
                        z = true;
                    }
                    if (!z) {
                        i = 1;
                    }
                    m10193M(i);
                    return;
                }
            }
            m10203p(0);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f9321o.mo2804a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f9321o.mo2805b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f9321o.mo2806c(i, i2, iArr, iArr2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.f9309M == 2 && this.f9300D.mo9286b(motionEvent)) {
            m10203p(1);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.f9309M != 2) {
            m10203p(0);
        }
        return dispatchTouchEvent;
    }

    public int getSpringBackMode() {
        return this.f9298B;
    }

    public View getTarget() {
        return this.f9310d;
    }

    /* renamed from: i */
    public void mo1189i(View view, int i) {
        this.f9320n.mo2860d(view, i);
        mo9245O(i);
        if (this.f9306J) {
            int i2 = 1;
            boolean z = this.f9331y == 2;
            if (z) {
                i2 = 2;
            }
            if (this.f9327u) {
                this.f9327u = false;
                float scrollY = (float) (z ? getScrollY() : getScrollX());
                if (!this.f9326t && scrollY != 0.0f) {
                    m10193M(i2);
                    return;
                } else if (scrollY == 0.0f) {
                    return;
                }
            } else if (!this.f9326t) {
                return;
            }
            m10194N(i2);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f9321o.mo2812l();
    }

    /* renamed from: j */
    public void mo1190j(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f9306J) {
            if (this.f9331y == 2) {
                m10185D(i2, iArr, i3);
            } else {
                m10185D(i, iArr, i3);
            }
        }
        int[] iArr2 = this.f9322p;
        if (mo9255k(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null, i3)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    /* renamed from: k */
    public boolean mo9255k(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f9321o.mo2807d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: l */
    public void mo9256l(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f9321o.mo2808e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        if (((float) (-r9)) <= r4) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        r8.f9299C.mo6055h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (((float) r9) <= r4) goto L_0x00bb;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1193m(android.view.View r16, int r17, int r18, int r19, int r20, int r21, int[] r22) {
        /*
            r15 = this;
            r8 = r15
            int r0 = r8.f9331y
            r9 = 0
            r10 = 2
            r11 = 1
            if (r0 != r10) goto L_0x000a
            r12 = r11
            goto L_0x000b
        L_0x000a:
            r12 = r9
        L_0x000b:
            if (r12 == 0) goto L_0x0010
            r13 = r18
            goto L_0x0012
        L_0x0010:
            r13 = r17
        L_0x0012:
            if (r12 == 0) goto L_0x0017
            r0 = r22[r11]
            goto L_0x0019
        L_0x0017:
            r0 = r22[r9]
        L_0x0019:
            r14 = r0
            int[] r5 = r8.f9323q
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r21
            r7 = r22
            r0.mo9256l(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r8.f9306J
            if (r0 != 0) goto L_0x0031
            return
        L_0x0031:
            if (r12 == 0) goto L_0x0036
            r0 = r22[r11]
            goto L_0x0038
        L_0x0036:
            r0 = r22[r9]
        L_0x0038:
            int r0 = r0 - r14
            if (r12 == 0) goto L_0x003e
            int r0 = r20 - r0
            goto L_0x0040
        L_0x003e:
            int r0 = r19 - r0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            r9 = r0
        L_0x0043:
            if (r12 == 0) goto L_0x0047
            r1 = r10
            goto L_0x0048
        L_0x0047:
            r1 = r11
        L_0x0048:
            r2 = 4
            r3 = 0
            if (r9 >= 0) goto L_0x00ea
            boolean r4 = r15.m10207v(r1)
            if (r4 == 0) goto L_0x00ea
            boolean r4 = r15.m10196Q()
            if (r4 == 0) goto L_0x00ea
            if (r21 == 0) goto L_0x00c5
            float r4 = r15.mo9282y(r1)
            float r5 = r8.f9304H
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00b1
            float r5 = r8.f9303G
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x006b
            goto L_0x00b1
        L_0x006b:
            float r5 = r8.f9329w
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0072
            return
        L_0x0072:
            float r3 = r8.f9328v
            float r4 = r4 - r3
            int r3 = r8.f9319m
            if (r3 >= r2) goto L_0x0179
            int r2 = java.lang.Math.abs(r9)
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x008f
            float r0 = r8.f9328v
            float r0 = r0 + r4
            r8.f9328v = r0
            r0 = r22[r11]
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (int) r0
            r22[r11] = r0
            goto L_0x009e
        L_0x008f:
            float r2 = r8.f9328v
            int r3 = java.lang.Math.abs(r9)
            float r3 = (float) r3
            float r2 = r2 + r3
            r8.f9328v = r2
            r2 = r22[r11]
            int r2 = r2 + r0
            r22[r11] = r2
        L_0x009e:
            r15.m10203p(r10)
            float r0 = r8.f9328v
            float r0 = r15.mo9283z(r0, r1)
        L_0x00a7:
            r15.m10208w(r0, r1)
            int r0 = r8.f9319m
            int r0 = r0 + r11
            r8.f9319m = r0
            goto L_0x0179
        L_0x00b1:
            r8.f9305I = r11
            if (r13 == 0) goto L_0x00c0
            int r0 = -r9
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00c0
        L_0x00bb:
            j4.b r0 = r8.f9299C
            r0.mo6055h(r9)
        L_0x00c0:
            r15.m10203p(r10)
            goto L_0x0179
        L_0x00c5:
            j4.b r2 = r8.f9299C
            boolean r2 = r2.mo6053f()
            if (r2 == 0) goto L_0x0179
            float r2 = r8.f9329w
            int r3 = java.lang.Math.abs(r9)
            float r3 = (float) r3
            float r2 = r2 + r3
            r8.f9329w = r2
            r15.m10203p(r11)
            float r2 = r8.f9329w
            float r2 = r15.mo9283z(r2, r1)
            r15.m10208w(r2, r1)
            r1 = r22[r11]
            int r1 = r1 + r0
            r22[r11] = r1
            goto L_0x0179
        L_0x00ea:
            if (r9 <= 0) goto L_0x0179
            boolean r4 = r15.m10206u(r1)
            if (r4 == 0) goto L_0x0179
            boolean r4 = r15.m10195P()
            if (r4 == 0) goto L_0x0179
            if (r21 == 0) goto L_0x0155
            float r4 = r15.mo9282y(r1)
            float r5 = r8.f9304H
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x014a
            float r5 = r8.f9303G
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x010b
            goto L_0x014a
        L_0x010b:
            float r5 = r8.f9330x
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0112
            return
        L_0x0112:
            float r3 = r8.f9328v
            float r4 = r4 - r3
            int r3 = r8.f9319m
            if (r3 >= r2) goto L_0x0179
            int r2 = java.lang.Math.abs(r9)
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x012f
            float r0 = r8.f9328v
            float r0 = r0 + r4
            r8.f9328v = r0
            r0 = r22[r11]
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (int) r0
            r22[r11] = r0
            goto L_0x013e
        L_0x012f:
            float r2 = r8.f9328v
            int r3 = java.lang.Math.abs(r9)
            float r3 = (float) r3
            float r2 = r2 + r3
            r8.f9328v = r2
            r2 = r22[r11]
            int r2 = r2 + r0
            r22[r11] = r2
        L_0x013e:
            r15.m10203p(r10)
            float r0 = r8.f9328v
            float r0 = r15.mo9283z(r0, r1)
            float r0 = -r0
            goto L_0x00a7
        L_0x014a:
            r8.f9305I = r11
            if (r13 == 0) goto L_0x00c0
            float r0 = (float) r9
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00c0
            goto L_0x00bb
        L_0x0155:
            j4.b r2 = r8.f9299C
            boolean r2 = r2.mo6053f()
            if (r2 == 0) goto L_0x0179
            float r2 = r8.f9330x
            int r3 = java.lang.Math.abs(r9)
            float r3 = (float) r3
            float r2 = r2 + r3
            r8.f9330x = r2
            r15.m10203p(r11)
            float r2 = r8.f9330x
            float r2 = r15.mo9283z(r2, r1)
            float r2 = -r2
            r15.m10208w(r2, r1)
            r1 = r22[r11]
            int r1 = r1 + r0
            r22[r11] = r1
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.springback.view.SpringBackLayout.mo1193m(android.view.View, int, int, int, int, int, int[]):void");
    }

    /* renamed from: n */
    public void mo1194n(View view, int i, int i2, int i3, int i4, int i5) {
        mo1193m(view, i, i2, i3, i4, i5, this.f9324r);
    }

    /* renamed from: o */
    public boolean mo1195o(View view, View view2, int i, int i2) {
        this.f9331y = i;
        int i3 = 2;
        boolean z = i == 2;
        if (!z) {
            i3 = 1;
        }
        if ((i3 & this.f9297A) == 0) {
            return false;
        }
        if (this.f9306J) {
            if (!onStartNestedScroll(view, view, i)) {
                return false;
            }
            float scrollY = (float) (z ? getScrollY() : getScrollX());
            if (!(i2 == 0 || scrollY == 0.0f || !(this.f9310d instanceof NestedScrollView))) {
                return false;
            }
        }
        this.f9321o.mo2815p(i, i2);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Point d = C2693a.m11235d(getContext());
        this.f9301E = d.x;
        this.f9302F = d.y;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9325s = getPaddingTop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f9306J || !isEnabled() || this.f9326t || this.f9327u || this.f9310d.isNestedScrollingEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f9299C.mo6053f() && actionMasked == 0) {
            this.f9299C.mo6049b();
        }
        if (!m10196Q() && !m10195P()) {
            return false;
        }
        int i = this.f9297A;
        if ((i & 4) != 0) {
            m10198d(motionEvent);
            if (m10205t(2) && (this.f9297A & 1) != 0 && ((float) getScrollX()) == 0.0f) {
                return false;
            }
            if (m10205t(1) && (this.f9297A & 2) != 0 && ((float) getScrollY()) == 0.0f) {
                return false;
            }
            if (m10205t(2) || m10205t(1)) {
                m10202h(true);
            }
        } else {
            this.f9332z = i;
        }
        if (m10205t(2)) {
            return m10190I(motionEvent);
        }
        if (m10205t(1)) {
            return m10183B(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9310d.getVisibility() != 8) {
            int measuredWidth = this.f9310d.getMeasuredWidth();
            int measuredHeight = this.f9310d.getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f9310d.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        m10204q();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChild(this.f9310d, i, i2);
        if (mode == 0) {
            i3 = this.f9310d.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
        } else {
            i3 = View.MeasureSpec.getSize(i);
            if (mode != 1073741824) {
                i3 = Math.min(i3, this.f9310d.getMeasuredWidth() + getPaddingLeft() + getPaddingRight());
            }
        }
        if (mode2 == 0) {
            i4 = this.f9310d.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        } else {
            i4 = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                i4 = Math.min(i4, this.f9310d.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
            }
        }
        setMeasuredDimension(i3, i4);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1193m(view, i, i2, i3, i4, 0, this.f9324r);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9320n.mo2858b(view, view2, i);
        startNestedScroll(i & 2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (C2889e onScrollChange : this.f9307K) {
            onScrollChange.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || this.f9326t || this.f9327u || this.f9310d.isNestedScrollingEnabled()) {
            return false;
        }
        if (!this.f9299C.mo6053f() && actionMasked == 0) {
            this.f9299C.mo6049b();
        }
        if (m10205t(2)) {
            return m10191J(motionEvent);
        }
        if (m10205t(1)) {
            return m10184C(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo9269r(int i) {
        return i == 2 ? this.f9302F : this.f9301E;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (!isEnabled() || !this.f9306J) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public void mo9271s(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        View view = this.f9310d;
        if (view != null && (view instanceof C0627a0) && z != view.isNestedScrollingEnabled()) {
            this.f9310d.setNestedScrollingEnabled(z);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f9321o.mo2813m(z);
    }

    public void setOnSpringListener(C2392a aVar) {
        this.f9308L = aVar;
    }

    public void setScrollOrientation(int i) {
        this.f9297A = i;
        this.f9300D.f9338f = i;
    }

    public void setSpringBackEnable(boolean z) {
        this.f9306J = z;
    }

    public void setSpringBackMode(int i) {
        this.f9298B = i;
    }

    public void setTarget(View view) {
        this.f9310d = view;
        if ((view instanceof C0627a0) && !view.isNestedScrollingEnabled()) {
            this.f9310d.setNestedScrollingEnabled(true);
        }
    }

    public boolean startNestedScroll(int i) {
        return this.f9321o.mo2814o(i);
    }

    public void stopNestedScroll() {
        this.f9321o.mo2816q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public float mo9281x(float f, int i) {
        double min = (double) Math.min(f, 1.0f);
        return ((float) (((Math.pow(min, 3.0d) / 3.0d) - Math.pow(min, 2.0d)) + min)) * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public float mo9282y(int i) {
        return mo9281x(1.0f, mo9269r(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public float mo9283z(float f, int i) {
        int r = mo9269r(i);
        return mo9281x(Math.min(Math.abs(f) / ((float) r), 1.0f), r);
    }
}
