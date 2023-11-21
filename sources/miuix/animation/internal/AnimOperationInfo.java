package miuix.animation.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.IAnimTarget;
import miuix.animation.ValueTarget;
import miuix.animation.property.FloatProperty;

class AnimOperationInfo {

    /* renamed from: op */
    public final byte f7489op;
    public final List<FloatProperty> propList;
    public volatile long sendTime;
    public final IAnimTarget target;
    public int usedCount = 0;

    AnimOperationInfo(IAnimTarget iAnimTarget, byte b, String[] strArr, FloatProperty[] floatPropertyArr) {
        this.f7489op = b;
        this.target = iAnimTarget;
        if (strArr == null || !(iAnimTarget instanceof ValueTarget)) {
            this.propList = floatPropertyArr != null ? Arrays.asList(floatPropertyArr) : null;
            return;
        }
        ValueTarget valueTarget = (ValueTarget) iAnimTarget;
        this.propList = new ArrayList();
        for (String floatProperty : strArr) {
            this.propList.add(valueTarget.getFloatProperty(floatProperty));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isUsed() {
        List<FloatProperty> list = this.propList;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            if (this.usedCount <= 0) {
                return false;
            }
        } else if (this.usedCount != size) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimOperationInfo{target=");
        sb.append(this.target);
        sb.append(", op=");
        sb.append(this.f7489op);
        sb.append(", propList=");
        List<FloatProperty> list = this.propList;
        sb.append(list != null ? Arrays.toString(list.toArray()) : null);
        sb.append('}');
        return sb.toString();
    }
}
