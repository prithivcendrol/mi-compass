package android.view;

import android.annotation.NonNull;
import android.view.WindowInsetsAnimation;

public /* synthetic */ class WindowInsetsAnimation$Callback {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsetsAnimation$Callback(int i) {
    }

    public native /* synthetic */ void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation);

    public native /* synthetic */ void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation);

    @NonNull
    public native /* synthetic */ WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds);
}
