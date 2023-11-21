package miuix.animation.property;

import java.util.Objects;

public class ValueProperty extends FloatProperty {
    private volatile String mName;

    public ValueProperty(String str) {
        super(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ValueProperty.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return Objects.equals(getName(), ((ValueProperty) obj).getName());
    }

    public String getName() {
        return this.mName != null ? this.mName : super.getName();
    }

    public float getValue(Object obj) {
        Float f;
        if (!(obj instanceof ValueTargetObject) || (f = (Float) ((ValueTargetObject) obj).getPropertyValue(getName(), Float.TYPE)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{getName()});
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setValue(Object obj, float f) {
        if (obj instanceof ValueTargetObject) {
            ((ValueTargetObject) obj).setPropertyValue(getName(), Float.TYPE, Float.valueOf(f));
        }
    }

    public String toString() {
        return "ValueProperty{name=" + getName() + '}';
    }
}
