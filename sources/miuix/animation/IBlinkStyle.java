package miuix.animation;

import miuix.animation.base.AnimConfig;

public interface IBlinkStyle extends IStateContainer {

    public enum BlinkType {
        HIGHLIGHT,
        NORMAL
    }

    IBlinkStyle resetConfig();

    IBlinkStyle setInterval(long j);

    IBlinkStyle setLimitCount(int i);

    IBlinkStyle setToHighlightConfig(AnimConfig animConfig);

    IBlinkStyle setToNormalConfig(AnimConfig animConfig);

    void startBlink(int i, AnimConfig... animConfigArr);

    void startBlink(AnimConfig... animConfigArr);

    void stopBlink();
}
