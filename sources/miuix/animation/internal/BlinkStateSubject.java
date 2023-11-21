package miuix.animation.internal;

public interface BlinkStateSubject {
    void attach(BlinkStateObserver blinkStateObserver);

    void detach(BlinkStateObserver blinkStateObserver);

    void notifyState(boolean z);
}
