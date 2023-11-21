package miuix.animation;

import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.IntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.property.ValueTargetObject;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;

public class ValueTarget extends IAnimTarget {
    private static final float DEFAULT_MIN_VALUE = 0.002f;
    static ITargetCreator sCreator = new ITargetCreator() {
        public IAnimTarget createTarget(Object obj) {
            return new ValueTarget(obj);
        }
    };
    private AtomicInteger mMaxType;
    private ValueTargetObject mTargetObj;

    public ValueTarget() {
        this((Object) null);
    }

    private ValueTarget(Object obj) {
        this.mMaxType = new AtomicInteger(CommonUtils.UNIT_SECOND);
        this.mTargetObj = new ValueTargetObject(obj == null ? Integer.valueOf(getId()) : obj);
    }

    private boolean isPredefinedProperty(Object obj) {
        return (obj instanceof ValueProperty) || (obj instanceof ViewProperty) || (obj instanceof ColorProperty);
    }

    public void clean() {
    }

    public FloatProperty createProperty(String str, Class<?> cls) {
        return (cls == Integer.TYPE || cls == Integer.class) ? new IntValueProperty(str) : new ValueProperty(str);
    }

    public float getDefaultMinVisible() {
        return 0.002f;
    }

    public FloatProperty getFloatProperty(String str) {
        return createProperty(str, Float.TYPE);
    }

    public int getIntValue(String str) {
        return getIntValue(getIntValueProperty(str));
    }

    public int getIntValue(IIntValueProperty iIntValueProperty) {
        if (!isPredefinedProperty(iIntValueProperty)) {
            return iIntValueProperty.getIntValue(this.mTargetObj.getRealObject());
        }
        Integer num = (Integer) this.mTargetObj.getPropertyValue(iIntValueProperty.getName(), Integer.TYPE);
        if (num == null) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    public IIntValueProperty getIntValueProperty(String str) {
        return (IIntValueProperty) createProperty(str, Integer.TYPE);
    }

    public float getMinVisibleChange(Object obj) {
        if (!(obj instanceof IIntValueProperty) || (obj instanceof ColorProperty)) {
            return super.getMinVisibleChange(obj);
        }
        return 1.0f;
    }

    public Object getTargetObject() {
        return this.mTargetObj;
    }

    public float getValue(String str) {
        return getValue(getFloatProperty(str));
    }

    public float getValue(FloatProperty floatProperty) {
        if (!isPredefinedProperty(floatProperty)) {
            return floatProperty.getValue(this.mTargetObj.getRealObject());
        }
        Float f = (Float) this.mTargetObj.getPropertyValue(floatProperty.getName(), Float.TYPE);
        if (f == null) {
            return Float.MAX_VALUE;
        }
        return f.floatValue();
    }

    public double getVelocity(String str) {
        return getVelocity(getFloatProperty(str));
    }

    public boolean isValid() {
        return this.mTargetObj.isValid();
    }

    public void setIntValue(String str, int i) {
        setIntValue(getIntValueProperty(str), i);
    }

    public void setIntValue(IIntValueProperty iIntValueProperty, int i) {
        if (isPredefinedProperty(iIntValueProperty)) {
            this.mTargetObj.setPropertyValue(iIntValueProperty.getName(), Integer.TYPE, Integer.valueOf(i));
        } else {
            iIntValueProperty.setIntValue(this.mTargetObj.getRealObject(), i);
        }
    }

    public void setValue(String str, float f) {
        setValue(getFloatProperty(str), f);
    }

    public void setValue(FloatProperty floatProperty, float f) {
        if (isPredefinedProperty(floatProperty)) {
            this.mTargetObj.setPropertyValue(floatProperty.getName(), Float.TYPE, Float.valueOf(f));
        } else {
            floatProperty.setValue(this.mTargetObj.getRealObject(), f);
        }
    }

    public void setVelocity(String str, double d) {
        setVelocity(getFloatProperty(str), d);
    }
}
