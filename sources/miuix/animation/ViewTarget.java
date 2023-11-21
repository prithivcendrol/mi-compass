package miuix.animation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1047l;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1056t;
import java.lang.ref.WeakReference;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;

public class ViewTarget extends IAnimTarget<View> {
    public static final ITargetCreator<View> sCreator = new ITargetCreator<View>() {
        public IAnimTarget createTarget(View view) {
            return new ViewTarget(view);
        }
    };
    private WeakReference<Context> mContextRef;
    private LifecycleCallbacks mLifecycleCallbacks;
    private ViewLifecyclerObserver mViewLifecyclerObserver;
    private WeakReference<View> mViewRef;

    protected class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        protected LifecycleCallbacks() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            ViewTarget.this.cleanViewTarget();
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    protected class ViewLifecyclerObserver implements C1047l {
        protected ViewLifecyclerObserver() {
        }

        /* access modifiers changed from: package-private */
        @C1056t(C1035g.C1037b.ON_DESTROY)
        public void onDestroy() {
            ViewTarget.this.cleanViewTarget();
        }
    }

    private ViewTarget(View view) {
        this.mViewRef = new WeakReference<>(view);
        registerLifecycle(view.getContext());
    }

    /* access modifiers changed from: private */
    public void cleanViewTarget() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            unRegisterLifecycle(weakReference.get());
        }
        setCorner(0.0f);
        Folme.clean(this);
    }

    private void executeTask(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            Log.w(CommonUtils.TAG, "ViewTarget.executeTask failed, " + getTargetObject(), e);
        }
    }

    /* access modifiers changed from: private */
    public void initLayout(View view, Runnable runnable) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            int i = C1991R.C1992id.miuix_animation_tag_init_layout;
            view.setTag(i, Boolean.TRUE);
            ViewGroup viewGroup = (ViewGroup) parent;
            int left = viewGroup.getLeft();
            int top = viewGroup.getTop();
            int visibility = view.getVisibility();
            if (visibility == 8) {
                view.setVisibility(4);
            }
            viewGroup.measure(viewGroup.getWidth(), viewGroup.getHeight());
            viewGroup.layout(left, top, viewGroup.getWidth() + left, viewGroup.getHeight() + top);
            view.setVisibility(visibility);
            runnable.run();
            view.setTag(i, (Object) null);
        }
    }

    private boolean registerLifecycle(Context context) {
        while (context != null) {
            if (context instanceof C1048m) {
                this.mContextRef = new WeakReference<>(context);
                if (this.mViewLifecyclerObserver == null) {
                    this.mViewLifecyclerObserver = new ViewLifecyclerObserver();
                }
                ((C1048m) context).mo252c().mo3790a(this.mViewLifecyclerObserver);
                return true;
            } else if (!(context instanceof Activity)) {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            } else if (Build.VERSION.SDK_INT < 29) {
                return false;
            } else {
                this.mContextRef = new WeakReference<>(context);
                if (this.mLifecycleCallbacks == null) {
                    this.mLifecycleCallbacks = new LifecycleCallbacks();
                }
                ((Activity) context).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
                return true;
            }
        }
        return false;
    }

    private void setCorner(float f) {
        View view = this.mViewRef.get();
        if (view != null) {
            view.setTag(C1991R.C1992id.miuix_animation_tag_view_hover_corners, Float.valueOf(f));
        }
    }

    private boolean unRegisterLifecycle(Context context) {
        LifecycleCallbacks lifecycleCallbacks;
        if (context == null) {
            return false;
        }
        if (context instanceof C1048m) {
            if (this.mViewLifecyclerObserver != null) {
                ((C1048m) context).mo252c().mo3792c(this.mViewLifecyclerObserver);
            }
            this.mViewLifecyclerObserver = null;
            return true;
        } else if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity) || (lifecycleCallbacks = this.mLifecycleCallbacks) == null) {
            return false;
        } else {
            ((Activity) context).unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            this.mLifecycleCallbacks = null;
            return true;
        }
    }

    public boolean allowAnimRun() {
        View targetObject = getTargetObject();
        return targetObject != null && !Folme.isInDraggingState(targetObject);
    }

    public void clean() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            unRegisterLifecycle(weakReference.get());
        }
    }

    public void executeOnInitialized(final Runnable runnable) {
        final View view = this.mViewRef.get();
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 8 && !view.isLaidOut() && (view.getWidth() == 0 || view.getHeight() == 0)) {
            post(new Runnable() {
                public void run() {
                    ViewTarget.this.initLayout(view, runnable);
                }
            });
        } else {
            post(runnable);
        }
    }

    public void getLocationOnScreen(int[] iArr) {
        View view = this.mViewRef.get();
        if (view == null) {
            iArr[1] = Integer.MAX_VALUE;
            iArr[0] = Integer.MAX_VALUE;
            return;
        }
        view.getLocationOnScreen(iArr);
    }

    public View getTargetObject() {
        return this.mViewRef.get();
    }

    public boolean isValid() {
        return this.mViewRef.get() != null;
    }

    public void onFrameEnd(boolean z) {
        View view = this.mViewRef.get();
        if (z && view != null) {
            view.setTag(C1991R.C1992id.miuix_animation_tag_set_height, (Object) null);
            view.setTag(C1991R.C1992id.miuix_animation_tag_set_width, (Object) null);
            view.setTag(C1991R.C1992id.miuix_animation_tag_view_hover_corners, Float.valueOf(0.0f));
        }
    }

    public void post(Runnable runnable) {
        View targetObject = getTargetObject();
        if (targetObject != null) {
            if (this.handler.isInTargetThread() || !targetObject.isAttachedToWindow()) {
                executeTask(runnable);
            } else {
                targetObject.post(runnable);
            }
        }
    }

    public boolean shouldUseIntValue(FloatProperty floatProperty) {
        if (floatProperty == ViewProperty.WIDTH || floatProperty == ViewProperty.HEIGHT || floatProperty == ViewProperty.SCROLL_X || floatProperty == ViewProperty.SCROLL_Y) {
            return true;
        }
        return super.shouldUseIntValue(floatProperty);
    }
}
