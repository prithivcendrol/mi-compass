package miuix.animation.internal;

import miuix.animation.IAnimTarget;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ISpecificProperty;
import miuix.animation.utils.CommonUtils;

public class AnimValueUtils {
    private AnimValueUtils() {
    }

    private static double getCurTargetValue(IAnimTarget iAnimTarget, FloatProperty floatProperty, double d) {
        double signum = Math.signum(d);
        double abs = Math.abs(d);
        if (abs == 1000000.0d) {
            return signum * ((double) CommonUtils.getSize(iAnimTarget, floatProperty));
        }
        double intValue = floatProperty instanceof IIntValueProperty ? (double) iAnimTarget.getIntValue((IIntValueProperty) floatProperty) : (double) iAnimTarget.getValue(floatProperty);
        return abs == 1000100.0d ? intValue * signum : intValue;
    }

    public static double getValue(IAnimTarget iAnimTarget, FloatProperty floatProperty, double d) {
        return floatProperty instanceof ISpecificProperty ? (double) ((ISpecificProperty) floatProperty).getSpecificValue((float) d) : getCurTargetValue(iAnimTarget, floatProperty, d);
    }

    public static double getValueOfTarget(IAnimTarget iAnimTarget, FloatProperty floatProperty, double d) {
        return d == 2.147483647E9d ? (double) iAnimTarget.getIntValue((IIntValueProperty) floatProperty) : d == 3.4028234663852886E38d ? (double) iAnimTarget.getValue(floatProperty) : getValue(iAnimTarget, floatProperty, d);
    }

    public static boolean handleSetToValue(UpdateInfo updateInfo) {
        if (isInvalid(updateInfo.animInfo.setToValue)) {
            return false;
        }
        AnimInfo animInfo = updateInfo.animInfo;
        animInfo.value = animInfo.setToValue;
        updateInfo.animInfo.setToValue = Double.MAX_VALUE;
        return true;
    }

    public static boolean isInvalid(double d) {
        return d == Double.MAX_VALUE || d == 3.4028234663852886E38d || d == 2.147483647E9d;
    }
}
