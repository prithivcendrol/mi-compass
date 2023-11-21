package miuix.animation.utils;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.styles.PropertyStyle;
import p086n4.C2449a;
import p086n4.C2450b;
import p086n4.C2451c;
import p086n4.C2452d;
import p086n4.C2453e;
import p086n4.C2454f;
import p086n4.C2455g;
import p086n4.C2456h;
import p086n4.C2457i;
import p086n4.C2458j;
import p086n4.C2459k;
import p086n4.C2460l;
import p086n4.C2461m;
import p086n4.C2462n;
import p086n4.C2463o;
import p086n4.C2464p;
import p086n4.C2465q;
import p086n4.C2466r;
import p086n4.C2467s;
import p086n4.C2468t;
import p086n4.C2469u;

public class EaseManager {
    public static final long DEFAULT_DURATION = 300;
    static final ConcurrentHashMap<Integer, TimeInterpolator> sInterpolatorCache = new ConcurrentHashMap<>();

    public static class EaseStyle {
        public volatile float[] factors;
        public final double[] parameters;
        public boolean stopAtTarget;
        public final int style;

        public EaseStyle(int i, float... fArr) {
            double[] dArr = {0.0d, 0.0d};
            this.parameters = dArr;
            this.style = i;
            this.factors = fArr;
            setParameters(this, dArr);
        }

        private static void setParameters(EaseStyle easeStyle, double[] dArr) {
            PhysicsOperator phyOperator = easeStyle == null ? null : PropertyStyle.getPhyOperator(easeStyle.style);
            if (phyOperator != null) {
                phyOperator.getParameters(easeStyle.factors, dArr);
            } else {
                Arrays.fill(dArr, 0.0d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EaseStyle)) {
                return false;
            }
            EaseStyle easeStyle = (EaseStyle) obj;
            return this.style == easeStyle.style && Arrays.equals(this.factors, easeStyle.factors);
        }

        public int hashCode() {
            return (Objects.hash(new Object[]{Integer.valueOf(this.style)}) * 31) + Arrays.hashCode(this.factors);
        }

        public void setFactors(float... fArr) {
            this.factors = fArr;
            setParameters(this, this.parameters);
        }

        public String toString() {
            return "EaseStyle{style=" + this.style + ", factors=" + Arrays.toString(this.factors) + ", parameters = " + Arrays.toString(this.parameters) + '}';
        }
    }

    public interface EaseStyleDef {
        public static final int ACCELERATE = -3;
        public static final int ACCELERATE_DECELERATE = 21;
        public static final int ACCELERATE_INTERPOLATOR = 22;
        public static final int BOUNCE = 23;
        public static final int BOUNCE_EASE_IN = 24;
        public static final int BOUNCE_EASE_INOUT = 26;
        public static final int BOUNCE_EASE_OUT = 25;
        public static final int CUBIC_IN = 5;
        public static final int CUBIC_INOUT = 7;
        public static final int CUBIC_OUT = 6;
        public static final int DECELERATE = 20;
        public static final int DURATION = -1;
        public static final int EXPO_IN = 17;
        public static final int EXPO_INOUT = 19;
        public static final int EXPO_OUT = 18;
        public static final int FRICTION = -4;
        public static final int LINEAR = 1;
        public static final int QUAD_IN = 2;
        public static final int QUAD_INOUT = 4;
        public static final int QUAD_OUT = 3;
        public static final int QUART_IN = 8;
        public static final int QUART_INOUT = 10;
        public static final int QUART_OUT = 9;
        public static final int QUINT_IN = 11;
        public static final int QUINT_INOUT = 13;
        public static final int QUINT_OUT = 12;
        public static final int REBOUND = -6;
        public static final int SIN_IN = 14;
        public static final int SIN_INOUT = 16;
        public static final int SIN_OUT = 15;
        public static final int SPRING = 0;
        public static final int SPRING_PHY = -2;
        public static final int STOP = -5;
    }

    public static class InterpolateEaseStyle extends EaseStyle {
        public long duration = 300;

        public InterpolateEaseStyle(int i, float... fArr) {
            super(i, fArr);
        }

        public InterpolateEaseStyle setDuration(long j) {
            this.duration = j;
            return this;
        }

        public String toString() {
            return "InterpolateEaseStyle{style=" + this.style + ", duration=" + this.duration + ", factors=" + Arrays.toString(this.factors) + '}';
        }
    }

    public static class SpringInterpolator implements TimeInterpolator {

        /* renamed from: c */
        private float f7499c;

        /* renamed from: c1 */
        private float f7500c1 = -1.0f;

        /* renamed from: c2 */
        private float f7501c2;
        private float damping = 0.95f;
        private float initial = -1.0f;

        /* renamed from: k */
        private float f7502k;

        /* renamed from: m */
        private float f7503m = 1.0f;

        /* renamed from: r */
        private float f7504r;
        private float response = 0.6f;

        /* renamed from: w */
        private float f7505w;

        public SpringInterpolator() {
            updateParameters();
        }

        private void updateParameters() {
            double pow = Math.pow(6.283185307179586d / ((double) this.response), 2.0d);
            float f = this.f7503m;
            float f2 = (float) (pow * ((double) f));
            this.f7502k = f2;
            float f3 = (float) (((((double) this.damping) * 12.566370614359172d) * ((double) f)) / ((double) this.response));
            this.f7499c = f3;
            float f4 = this.f7503m;
            float sqrt = ((float) Math.sqrt((double) (((f * 4.0f) * f2) - (f3 * f3)))) / (f4 * 2.0f);
            this.f7505w = sqrt;
            float f5 = -((this.f7499c / 2.0f) * f4);
            this.f7504r = f5;
            this.f7501c2 = (0.0f - (f5 * this.initial)) / sqrt;
        }

        public float getDamping() {
            return this.damping;
        }

        public float getInterpolation(float f) {
            return (float) ((Math.pow(2.718281828459045d, (double) (this.f7504r * f)) * ((((double) this.f7500c1) * Math.cos((double) (this.f7505w * f))) + (((double) this.f7501c2) * Math.sin((double) (this.f7505w * f))))) + 1.0d);
        }

        public float getResponse() {
            return this.response;
        }

        public SpringInterpolator setDamping(float f) {
            this.damping = f;
            updateParameters();
            return this;
        }

        public SpringInterpolator setResponse(float f) {
            this.response = f;
            updateParameters();
            return this;
        }
    }

    static TimeInterpolator createTimeInterpolator(int i, float... fArr) {
        switch (i) {
            case -1:
            case 1:
                return new LinearInterpolator();
            case 0:
                return new SpringInterpolator().setDamping(fArr[0]).setResponse(fArr[1]);
            case 2:
                return new C2458j();
            case 3:
                return new C2460l();
            case 4:
                return new C2459k();
            case 5:
                return new C2452d();
            case 6:
                return new C2454f();
            case 7:
                return new C2453e();
            case 8:
                return new C2461m();
            case 9:
                return new C2463o();
            case 10:
                return new C2462n();
            case 11:
                return new C2464p();
            case 12:
                return new C2466r();
            case 13:
                return new C2465q();
            case 14:
                return new C2467s();
            case 15:
                return new C2469u();
            case 16:
                return new C2468t();
            case 17:
                return new C2455g();
            case 18:
                return new C2457i();
            case 19:
                return new C2456h();
            case 20:
                return new DecelerateInterpolator();
            case 21:
                return new AccelerateDecelerateInterpolator();
            case 22:
                return new AccelerateInterpolator();
            case 23:
                return new BounceInterpolator();
            case 24:
                return new C2449a();
            case 25:
                return new C2451c();
            case 26:
                return new C2450b();
            default:
                return null;
        }
    }

    public static TimeInterpolator getInterpolator(int i, float... fArr) {
        return getInterpolator(getInterpolatorStyle(i, fArr));
    }

    public static TimeInterpolator getInterpolator(InterpolateEaseStyle interpolateEaseStyle) {
        if (interpolateEaseStyle == null) {
            return null;
        }
        ConcurrentHashMap<Integer, TimeInterpolator> concurrentHashMap = sInterpolatorCache;
        TimeInterpolator timeInterpolator = concurrentHashMap.get(Integer.valueOf(interpolateEaseStyle.style));
        if (timeInterpolator == null && (timeInterpolator = createTimeInterpolator(interpolateEaseStyle.style, interpolateEaseStyle.factors)) != null) {
            concurrentHashMap.put(Integer.valueOf(interpolateEaseStyle.style), timeInterpolator);
        }
        return timeInterpolator;
    }

    private static InterpolateEaseStyle getInterpolatorStyle(int i, float... fArr) {
        return new InterpolateEaseStyle(i, fArr);
    }

    public static EaseStyle getStyle(int i, float... fArr) {
        if (i < -1) {
            return new EaseStyle(i, fArr);
        }
        InterpolateEaseStyle interpolatorStyle = getInterpolatorStyle(i, fArr.length > 1 ? Arrays.copyOfRange(fArr, 1, fArr.length) : new float[0]);
        if (fArr.length > 0) {
            interpolatorStyle.setDuration((long) ((int) fArr[0]));
        }
        return interpolatorStyle;
    }

    public static boolean isPhysicsStyle(int i) {
        return i < -1;
    }
}
