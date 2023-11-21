package miuix.animation.physics;

import java.util.LinkedList;
import java.util.List;

public class SpringAnimationSet {
    private List<SpringAnimation> mAnimationContainer = new LinkedList();

    public void cancel() {
        if (!this.mAnimationContainer.isEmpty()) {
            for (SpringAnimation next : this.mAnimationContainer) {
                if (next != null) {
                    next.cancel();
                }
            }
            this.mAnimationContainer.clear();
        }
    }

    public void endAnimation() {
        if (!this.mAnimationContainer.isEmpty()) {
            for (SpringAnimation next : this.mAnimationContainer) {
                if (next != null) {
                    next.skipToEnd();
                }
            }
            this.mAnimationContainer.clear();
        }
    }

    public void play(SpringAnimation springAnimation) {
        if (springAnimation != null) {
            this.mAnimationContainer.add(springAnimation);
        }
    }

    public void playTogether(SpringAnimation... springAnimationArr) {
        for (SpringAnimation springAnimation : springAnimationArr) {
            if (springAnimation != null) {
                this.mAnimationContainer.add(springAnimation);
            }
        }
    }

    public void start() {
        if (!this.mAnimationContainer.isEmpty()) {
            for (SpringAnimation next : this.mAnimationContainer) {
                if (next != null) {
                    next.start();
                }
            }
        }
    }
}
