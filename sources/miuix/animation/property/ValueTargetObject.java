package miuix.animation.property;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.FieldManager;

public class ValueTargetObject {
    private FieldManager mFieldManager = new FieldManager();
    private WeakReference<Object> mRef;
    private Object mTempObj;
    private Map<String, Object> mValueMap = new ConcurrentHashMap();

    public ValueTargetObject(Object obj) {
        if (CommonUtils.isBuiltInClass(obj.getClass())) {
            this.mTempObj = obj;
        } else {
            this.mRef = new WeakReference<>(obj);
        }
    }

    public boolean equals(Object obj) {
        Object realObject;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            Object obj2 = this.mTempObj;
            if (obj2 != null) {
                return Objects.equals(obj2, obj);
            }
            Object realObject2 = getRealObject();
            if (realObject2 != null) {
                return realObject2.equals(obj);
            }
            return false;
        }
        ValueTargetObject valueTargetObject = (ValueTargetObject) obj;
        Object obj3 = this.mTempObj;
        if (obj3 != null) {
            realObject = valueTargetObject.mTempObj;
        } else {
            obj3 = getRealObject();
            realObject = valueTargetObject.getRealObject();
        }
        return Objects.equals(obj3, realObject);
    }

    public <T> T getPropertyValue(String str, Class<T> cls) {
        Object realObject = getRealObject();
        if (realObject == null || this.mTempObj == realObject) {
            return this.mValueMap.get(str);
        }
        T t = this.mValueMap.get(str);
        return t != null ? t : this.mFieldManager.getField(realObject, str, cls);
    }

    public Object getRealObject() {
        WeakReference<Object> weakReference = this.mRef;
        return weakReference != null ? weakReference.get() : this.mTempObj;
    }

    public int hashCode() {
        Object obj = this.mTempObj;
        if (obj != null) {
            return obj.hashCode();
        }
        Object realObject = getRealObject();
        if (realObject != null) {
            return realObject.hashCode();
        }
        return 0;
    }

    public boolean isValid() {
        return getRealObject() != null;
    }

    public <T> void setPropertyValue(String str, Class<T> cls, T t) {
        Object realObject = getRealObject();
        if (realObject == null || this.mTempObj == realObject) {
            this.mValueMap.put(str, t);
        } else if (this.mValueMap.containsKey(str) || !this.mFieldManager.setField(realObject, str, cls, t)) {
            this.mValueMap.put(str, t);
        }
    }

    public String toString() {
        return "ValueTargetObject{" + getRealObject() + "}";
    }
}
