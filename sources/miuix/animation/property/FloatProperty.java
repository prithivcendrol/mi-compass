package miuix.animation.property;

import android.util.Property;

public abstract class FloatProperty<T> extends Property<T, Float> {
    final String mPropertyName;

    public FloatProperty(String str) {
        super(Float.class, str);
        this.mPropertyName = str;
    }

    public Float get(T t) {
        return Float.valueOf(t == null ? 0.0f : getValue(t));
    }

    public abstract float getValue(T t);

    public final void set(T t, Float f) {
        if (t != null) {
            setValue(t, f.floatValue());
        }
    }

    public abstract void setValue(T t, float f);

    public String toString() {
        return getClass().getSimpleName() + "{mPropertyName='" + this.mPropertyName + '\'' + '}';
    }
}
