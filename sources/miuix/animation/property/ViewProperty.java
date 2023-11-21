package miuix.animation.property;

import android.view.View;
import miuix.animation.C1991R;

public abstract class ViewProperty extends FloatProperty<View> {
    public static final ViewProperty ALPHA = new ViewProperty("alpha") {
        public float getValue(View view) {
            return view.getAlpha();
        }

        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    };
    public static final ViewProperty AUTO_ALPHA = new ViewProperty("autoAlpha") {
        public float getValue(View view) {
            return view.getAlpha();
        }

        public void setValue(View view, float f) {
            view.setAlpha(f);
            boolean z = Math.abs(f) <= 0.00390625f;
            if (view.getVisibility() != 0 && f > 0.0f && !z) {
                view.setVisibility(0);
            } else if (z) {
                view.setVisibility(8);
            }
        }
    };
    public static final ViewProperty BACKGROUND = new ViewProperty("deprecated_background") {
        public float getValue(View view) {
            return 0.0f;
        }

        public void setValue(View view, float f) {
        }
    };
    public static final ViewProperty ELEVATION = new ViewProperty("elevation") {
        public float getValue(View view) {
            return view.getElevation();
        }

        public void setValue(View view, float f) {
            view.setElevation(f);
        }
    };
    public static final ViewProperty FOREGROUND = new ViewProperty("deprecated_foreground") {
        public float getValue(View view) {
            return 0.0f;
        }

        public void setValue(View view, float f) {
        }
    };
    public static final ViewProperty HEIGHT = new ViewProperty("height") {
        public float getValue(View view) {
            int height = view.getHeight();
            Float f = (Float) view.getTag(C1991R.C1992id.miuix_animation_tag_set_height);
            if (f != null) {
                return f.floatValue();
            }
            if (height == 0 && ViewProperty.isInInitLayout(view)) {
                height = view.getMeasuredHeight();
            }
            return (float) height;
        }

        public void setValue(View view, float f) {
            view.getLayoutParams().height = (int) f;
            view.setTag(C1991R.C1992id.miuix_animation_tag_set_height, Float.valueOf(f));
            view.requestLayout();
        }
    };
    public static final ViewProperty ROTATION = new ViewProperty("rotation") {
        public float getValue(View view) {
            return view.getRotation();
        }

        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    };
    public static final ViewProperty ROTATION_X = new ViewProperty("rotationX") {
        public float getValue(View view) {
            return view.getRotationX();
        }

        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    };
    public static final ViewProperty ROTATION_Y = new ViewProperty("rotationY") {
        public float getValue(View view) {
            return view.getRotationY();
        }

        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    };
    public static final ViewProperty SCALE_X = new ViewProperty("scaleX") {
        public float getValue(View view) {
            return view.getScaleX();
        }

        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    };
    public static final ViewProperty SCALE_Y = new ViewProperty("scaleY") {
        public float getValue(View view) {
            return view.getScaleY();
        }

        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    };
    public static final ViewProperty SCROLL_X = new ViewProperty("scrollX") {
        public float getValue(View view) {
            return (float) view.getScrollX();
        }

        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    };
    public static final ViewProperty SCROLL_Y = new ViewProperty("scrollY") {
        public float getValue(View view) {
            return (float) view.getScrollY();
        }

        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    };
    public static final ViewProperty TRANSLATION_X = new ViewProperty("translationX") {
        public float getValue(View view) {
            return view.getTranslationX();
        }

        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    };
    public static final ViewProperty TRANSLATION_Y = new ViewProperty("translationY") {
        public float getValue(View view) {
            return view.getTranslationY();
        }

        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    };
    public static final ViewProperty TRANSLATION_Z = new ViewProperty("translationZ") {
        public float getValue(View view) {
            return view.getTranslationZ();
        }

        public void setValue(View view, float f) {
            view.setTranslationZ(f);
        }
    };
    public static final ViewProperty WIDTH = new ViewProperty("width") {
        public float getValue(View view) {
            int width = view.getWidth();
            Float f = (Float) view.getTag(C1991R.C1992id.miuix_animation_tag_set_width);
            if (f != null) {
                return f.floatValue();
            }
            if (width == 0 && ViewProperty.isInInitLayout(view)) {
                width = view.getMeasuredWidth();
            }
            return (float) width;
        }

        public void setValue(View view, float f) {
            view.getLayoutParams().width = (int) f;
            view.setTag(C1991R.C1992id.miuix_animation_tag_set_width, Float.valueOf(f));
            view.requestLayout();
        }
    };

    /* renamed from: X */
    public static final ViewProperty f7495X = new ViewProperty("x") {
        public float getValue(View view) {
            return view.getX();
        }

        public void setValue(View view, float f) {
            view.setX(f);
        }
    };

    /* renamed from: Y */
    public static final ViewProperty f7496Y = new ViewProperty("y") {
        public float getValue(View view) {
            return view.getY();
        }

        public void setValue(View view, float f) {
            view.setY(f);
        }
    };

    /* renamed from: Z */
    public static final ViewProperty f7497Z = new ViewProperty("z") {
        public float getValue(View view) {
            return view.getZ();
        }

        public void setValue(View view, float f) {
            view.setZ(f);
        }
    };

    public ViewProperty(String str) {
        super(str);
    }

    /* access modifiers changed from: private */
    public static boolean isInInitLayout(View view) {
        return view.getTag(C1991R.C1992id.miuix_animation_tag_init_layout) != null;
    }

    public String toString() {
        return "ViewProperty{mPropertyName='" + this.mPropertyName + '\'' + '}';
    }
}
