package miuix.animation.base;

import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;

public class AnimSpecialConfig extends AnimConfig {
    public double maxValue;
    public double minValue;

    public AnimSpecialConfig() {
        super(true);
    }

    @Deprecated
    public AnimSpecialConfig getSpecialConfig(String str) {
        return this;
    }

    @Deprecated
    public AnimSpecialConfig getSpecialConfig(FloatProperty floatProperty) {
        return this;
    }

    @Deprecated
    public AnimSpecialConfig queryAndCreateSpecial(String str) {
        return this;
    }

    @Deprecated
    public AnimSpecialConfig queryAndCreateSpecial(FloatProperty floatProperty) {
        return this;
    }

    public AnimSpecialConfig setMinAndMax(double d, double d2) {
        this.minValue = d;
        this.maxValue = d2;
        return this;
    }

    public AnimConfig setSpecial(String str, long j, float... fArr) {
        super.setSpecial(this, (EaseManager.EaseStyle) null, j, fArr);
        return this;
    }

    @Deprecated
    public AnimConfig setSpecial(String str, AnimSpecialConfig animSpecialConfig) {
        return this;
    }

    public AnimConfig setSpecial(String str, EaseManager.EaseStyle easeStyle, long j, float... fArr) {
        super.setSpecial(this, easeStyle, j, fArr);
        return this;
    }

    public AnimConfig setSpecial(String str, EaseManager.EaseStyle easeStyle, float... fArr) {
        super.setSpecial(this, easeStyle, -1, fArr);
        return this;
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, long j, float... fArr) {
        super.setSpecial(this, (EaseManager.EaseStyle) null, j, fArr);
        return this;
    }

    @Deprecated
    public AnimConfig setSpecial(FloatProperty floatProperty, AnimSpecialConfig animSpecialConfig) {
        return this;
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, EaseManager.EaseStyle easeStyle, long j, float... fArr) {
        super.setSpecial(this, easeStyle, j, fArr);
        return this;
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, EaseManager.EaseStyle easeStyle, float... fArr) {
        super.setSpecial(this, easeStyle, -1, fArr);
        return this;
    }
}
