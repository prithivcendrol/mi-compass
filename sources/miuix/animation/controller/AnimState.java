package miuix.animation.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ISpecificProperty;
import miuix.animation.property.IntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.ObjectPool;

public class AnimState {
    public static final long FLAG_IN_TOUCH = 4;
    public static final long FLAG_PARALLEL = 2;
    public static final long FLAG_QUEUE = 1;
    private static final int STEP = 100;
    private static final String TAG = "TAG_";
    public static final int VIEW_POS = 1000100;
    public static final int VIEW_SIZE = 1000000;
    private static final AtomicInteger sId = new AtomicInteger();
    public long flags;
    public final boolean isTemporary;
    private final AnimConfig mConfig;
    private final Map<Object, Double> mMap;
    private volatile Object mTag;
    IntValueProperty tempIntValueProperty;
    ValueProperty tempValueProperty;

    public AnimState() {
        this((Object) null, false);
    }

    public AnimState(Object obj) {
        this(obj, false);
    }

    public AnimState(Object obj, boolean z) {
        this.tempValueProperty = new ValueProperty("");
        this.tempIntValueProperty = new IntValueProperty("");
        this.mConfig = new AnimConfig();
        this.mMap = new ConcurrentHashMap();
        setTag(obj);
        this.isTemporary = z;
    }

    public static void alignState(AnimState animState, Collection<UpdateInfo> collection) {
        FloatProperty floatProperty;
        float f;
        for (UpdateInfo next : collection) {
            if (!animState.contains(next.property)) {
                if (next.useInt) {
                    floatProperty = next.property;
                    f = (int) next.animInfo.startValue;
                } else {
                    floatProperty = next.property;
                    f = (float) next.animInfo.startValue;
                }
                animState.add(floatProperty, (double) f);
            }
        }
        List<Object> list = (List) ObjectPool.acquire(ArrayList.class, new Object[0]);
        for (Object next2 : animState.keySet()) {
            if ((next2 instanceof FloatProperty ? UpdateInfo.findBy(collection, (FloatProperty) next2) : UpdateInfo.findByName(collection, (String) next2)) == null) {
                list.add(next2);
            }
        }
        for (Object remove : list) {
            animState.remove(remove);
        }
        ObjectPool.release(list);
    }

    private void append(AnimState animState) {
        this.mConfig.copy(animState.mConfig);
        this.mMap.clear();
        this.mMap.putAll(animState.mMap);
    }

    private Double getMapValue(Object obj) {
        Double d = this.mMap.get(obj);
        return (d != null || !(obj instanceof FloatProperty)) ? d : this.mMap.get(((FloatProperty) obj).getName());
    }

    private double getProperValue(IAnimTarget iAnimTarget, FloatProperty floatProperty, double d) {
        long configFlags = getConfigFlags(floatProperty);
        boolean hasFlags = CommonUtils.hasFlags(configFlags, 1);
        if (!hasFlags && d != 1000000.0d && d != 1000100.0d && !(floatProperty instanceof ISpecificProperty)) {
            return d;
        }
        double value = AnimValueUtils.getValue(iAnimTarget, floatProperty, d);
        if (!hasFlags || AnimValueUtils.isInvalid(d)) {
            return value;
        }
        setConfigFlag(floatProperty, configFlags & -2);
        double d2 = value + d;
        setMapValue(floatProperty, d2);
        return d2;
    }

    private void setMapValue(Object obj, double d) {
        if (obj instanceof FloatProperty) {
            FloatProperty floatProperty = (FloatProperty) obj;
            if (this.mMap.containsKey(floatProperty.getName())) {
                this.mMap.put(floatProperty.getName(), Double.valueOf(d));
                return;
            }
        }
        this.mMap.put(obj, Double.valueOf(d));
    }

    public AnimState add(Object obj, double d) {
        setMapValue(obj, d);
        return this;
    }

    public AnimState add(String str, float f, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(str, jArr[0]);
        }
        return add(str, (double) f);
    }

    public AnimState add(String str, int i, long... jArr) {
        setConfigFlag(str, (jArr.length > 0 ? jArr[0] : getConfigFlags(str)) | 4);
        return add(str, (double) i);
    }

    public AnimState add(FloatProperty floatProperty, float f, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(floatProperty, jArr[0]);
        }
        return add(floatProperty, (double) f);
    }

    public AnimState add(FloatProperty floatProperty, int i, long... jArr) {
        setConfigFlag(floatProperty, (jArr.length > 0 ? jArr[0] : getConfigFlags(floatProperty)) | 4);
        return add(floatProperty, (double) i);
    }

    public AnimState add(ViewProperty viewProperty, float f, long... jArr) {
        return add((FloatProperty) viewProperty, f, jArr);
    }

    public AnimState add(ViewProperty viewProperty, int i, long... jArr) {
        return add((FloatProperty) viewProperty, i, jArr);
    }

    public void clear() {
        this.mConfig.clear();
        this.mMap.clear();
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.mMap.containsKey(obj)) {
            return true;
        }
        if (obj instanceof FloatProperty) {
            return this.mMap.containsKey(((FloatProperty) obj).getName());
        }
        return false;
    }

    public double get(IAnimTarget iAnimTarget, FloatProperty floatProperty) {
        Double mapValue = getMapValue(floatProperty);
        if (mapValue != null) {
            return getProperValue(iAnimTarget, floatProperty, mapValue.doubleValue());
        }
        return Double.MAX_VALUE;
    }

    public AnimConfig getConfig() {
        return this.mConfig;
    }

    public long getConfigFlags(Object obj) {
        AnimSpecialConfig specialConfig = this.mConfig.getSpecialConfig(obj instanceof FloatProperty ? ((FloatProperty) obj).getName() : (String) obj);
        if (specialConfig != null) {
            return specialConfig.flags;
        }
        return 0;
    }

    public float getFloat(String str) {
        Double mapValue = getMapValue(str);
        if (mapValue != null) {
            return mapValue.floatValue();
        }
        return Float.MAX_VALUE;
    }

    public float getFloat(FloatProperty floatProperty) {
        Double mapValue = getMapValue(floatProperty);
        if (mapValue != null) {
            return mapValue.floatValue();
        }
        return Float.MAX_VALUE;
    }

    public int getInt(String str) {
        return getInt((IIntValueProperty) new IntValueProperty(str));
    }

    public int getInt(IIntValueProperty iIntValueProperty) {
        Double mapValue = getMapValue(iIntValueProperty);
        if (mapValue != null) {
            return mapValue.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public FloatProperty getProperty(Object obj) {
        if (obj instanceof FloatProperty) {
            return (FloatProperty) obj;
        }
        String str = (String) obj;
        return CommonUtils.hasFlags(getConfigFlags(str), 4) ? new IntValueProperty(str) : new ValueProperty(str);
    }

    public Object getTag() {
        return this.mTag;
    }

    public FloatProperty getTempProperty(Object obj) {
        if (obj instanceof FloatProperty) {
            return (FloatProperty) obj;
        }
        String str = (String) obj;
        ValueProperty valueProperty = CommonUtils.hasFlags(getConfigFlags(str), 4) ? this.tempIntValueProperty : this.tempValueProperty;
        valueProperty.setName(str);
        return valueProperty;
    }

    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    public Set<Object> keySet() {
        return this.mMap.keySet();
    }

    public AnimState remove(Object obj) {
        this.mMap.remove(obj);
        if (obj instanceof FloatProperty) {
            this.mMap.remove(((FloatProperty) obj).getName());
        }
        return this;
    }

    public void set(AnimState animState) {
        if (animState != null) {
            setTag(animState.mTag);
            append(animState);
        }
    }

    public void setConfigFlag(Object obj, long j) {
        this.mConfig.queryAndCreateSpecial(obj instanceof FloatProperty ? ((FloatProperty) obj).getName() : (String) obj).flags = j;
    }

    public final void setTag(Object obj) {
        if (obj == null) {
            obj = TAG + sId.incrementAndGet();
        }
        this.mTag = obj;
    }

    public String toString() {
        return "\nAnimState{mTag='" + this.mTag + '\'' + ", flags:" + this.flags + ", mConfig:" + this.mConfig + ", mMaps=" + CommonUtils.mapToString(this.mMap, "    ") + '}';
    }
}
