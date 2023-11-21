package miuix.animation.internal;

public class AnimInfo {
    public volatile long delay;
    public volatile long initTime;
    public volatile boolean justEnd;

    /* renamed from: op */
    public volatile byte f7488op;
    public volatile double progress;
    public volatile double setToValue = Double.MAX_VALUE;
    public volatile long startTime;
    public volatile double startValue = Double.MAX_VALUE;
    public volatile double targetValue = Double.MAX_VALUE;
    public volatile int tintMode = -1;
    public volatile double value = Double.MAX_VALUE;

    public void clear() {
        this.f7488op = 0;
        this.delay = 0;
        this.initTime = 0;
        this.startTime = 0;
        this.progress = 0.0d;
        this.tintMode = -1;
        this.startValue = Double.MAX_VALUE;
        this.targetValue = Double.MAX_VALUE;
        this.value = Double.MAX_VALUE;
        this.justEnd = false;
    }

    public String toString() {
        return "AnimInfo{op=" + this.f7488op + ", delay = " + this.delay + ", initTime=" + this.initTime + ", startTime=" + this.startTime + ", progress=" + this.progress + ", config=" + this.tintMode + ", startValue=" + this.startValue + ", targetValue=" + this.targetValue + ", value=" + this.value + ", setToValue=" + this.setToValue + '}';
    }
}
