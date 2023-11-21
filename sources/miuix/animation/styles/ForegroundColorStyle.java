package miuix.animation.styles;

import android.graphics.Color;
import android.view.View;
import miuix.animation.C1991R;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.listener.UpdateInfo;
import p137x2.C2901a;

public class ForegroundColorStyle extends PropertyStyle {
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_ABSOLUTE = 2;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_CLEAR = 0;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_DEFAULT = 1;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_PADDING = 4;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_RELATIVE = 4104;

    public static void end(IAnimTarget iAnimTarget, UpdateInfo updateInfo) {
        View view = getView(iAnimTarget);
        if (!isInvalid(view)) {
            TintDrawable tintDrawable = TintDrawable.get(view);
            int i = (int) updateInfo.animInfo.value;
            if (tintDrawable != null && Color.alpha(i) == 0) {
                tintDrawable.restoreOriginalDrawable();
            }
        }
    }

    private static View getView(IAnimTarget iAnimTarget) {
        if (iAnimTarget instanceof ViewTarget) {
            return ((ViewTarget) iAnimTarget).getTargetObject();
        }
        return null;
    }

    private static boolean isInvalid(View view) {
        return view == null;
    }

    public static void start(IAnimTarget iAnimTarget, UpdateInfo updateInfo) {
        View view = getView(iAnimTarget);
        if (!isInvalid(view)) {
            int i = updateInfo.animInfo.tintMode;
            TintDrawable andGet = TintDrawable.setAndGet(view);
            Object tag = view.getTag(C1991R.C1992id.miuix_animation_tag_view_hover_corners);
            if ((tag instanceof Float) || (tag instanceof Integer)) {
                andGet.setHoverCorner(((Float) tag).floatValue());
            }
            if (C2901a.m11979j() == 0 && i == -1) {
                i = 1;
            } else if (i == -1) {
                i = 0;
            }
            andGet.initTintBuffer(i & 3);
        }
    }
}
