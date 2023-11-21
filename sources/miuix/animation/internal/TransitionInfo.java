package miuix.animation.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.LinkNode;
import miuix.animation.utils.LogUtils;

class TransitionInfo extends LinkNode<TransitionInfo> {
    private static final AtomicInteger sIdGenerator = new AtomicInteger();
    public static final Map<Integer, TransitionInfo> sMap = new ConcurrentHashMap();
    public List<AnimTask> animTasks = new ArrayList();
    public volatile AnimConfig config = new AnimConfig();
    public volatile AnimState from;

    /* renamed from: id */
    public final int f7490id;
    public volatile Object key;
    private final AnimStats mAnimStats = new AnimStats();
    public volatile long startTime;
    public final Object tag;
    public final IAnimTarget target;

    /* renamed from: to */
    public volatile AnimState f7491to;
    public volatile List<UpdateInfo> updateList;

    public interface IUpdateInfoCreator {
        UpdateInfo getUpdateInfo(FloatProperty floatProperty);
    }

    public TransitionInfo(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        int incrementAndGet = sIdGenerator.incrementAndGet();
        this.f7490id = incrementAndGet;
        this.target = iAnimTarget;
        this.from = getState(animState);
        this.f7491to = getState(animState2);
        Object tag2 = this.f7491to.getTag();
        this.tag = tag2;
        if (animState2.isTemporary) {
            tag2 = tag2 + String.valueOf(incrementAndGet);
        }
        this.key = tag2;
        this.updateList = null;
        initValueForColorProperty();
        this.config.copy(animState2.getConfig());
        if (animConfigLink != null) {
            animConfigLink.addTo(this.config);
        }
        iAnimTarget.getNotifier().addListeners(this.key, this.config);
    }

    static void decreaseStartCountForDelayAnim(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo, byte b) {
        AnimStats animStats2;
        int i;
        if (animTask != null && b == 1 && updateInfo.animInfo.delay > 0 && (i = animStats2.startCount) > 0) {
            (animStats2 = animTask.animStats).startCount = i - 1;
            animStats.startCount--;
        }
    }

    private AnimState getState(AnimState animState) {
        if (animState == null || !animState.isTemporary) {
            return animState;
        }
        AnimState animState2 = new AnimState();
        animState2.set(animState);
        return animState2;
    }

    private void initValueForColorProperty() {
        if (this.from != null) {
            for (Object tempProperty : this.f7491to.keySet()) {
                FloatProperty tempProperty2 = this.f7491to.getTempProperty(tempProperty);
                if ((tempProperty2 instanceof ColorProperty) && AnimValueUtils.isInvalid(AnimValueUtils.getValueOfTarget(this.target, tempProperty2, Double.MAX_VALUE))) {
                    double d = this.from.get(this.target, tempProperty2);
                    if (!AnimValueUtils.isInvalid(d)) {
                        this.target.setIntValue((ColorProperty) tempProperty2, (int) d);
                    }
                }
            }
        }
    }

    public boolean containsProperty(FloatProperty floatProperty) {
        return this.f7491to.contains(floatProperty);
    }

    public int getAnimCount() {
        return this.f7491to.keySet().size();
    }

    public AnimStats getAnimStats() {
        this.mAnimStats.clear();
        for (AnimTask animTask : this.animTasks) {
            this.mAnimStats.add(animTask.animStats);
        }
        return this.mAnimStats;
    }

    public void initUpdateList(IUpdateInfoCreator iUpdateInfoCreator) {
        this.startTime = System.nanoTime();
        AnimState animState = this.from;
        AnimState animState2 = this.f7491to;
        boolean isLogEnabled = LogUtils.isLogEnabled();
        if (isLogEnabled) {
            LogUtils.debug("-- doSetup, id = " + this.f7490id + ", key = " + this.key + " " + this.key.hashCode() + ", startTime = " + this.startTime + ", target = " + this.target + ", f = " + animState + ", t = " + animState2 + "\nconfig = " + this.config, new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Object property : animState2.keySet()) {
            FloatProperty property2 = animState2.getProperty(property);
            UpdateInfo updateInfo = iUpdateInfoCreator.getUpdateInfo(property2);
            if (updateInfo != null) {
                arrayList.add(updateInfo);
                updateInfo.animInfo.targetValue = animState2.get(this.target, property2);
                AnimInfo animInfo = updateInfo.animInfo;
                if (animState != null) {
                    animInfo.startValue = animState.get(this.target, property2);
                } else {
                    double valueOfTarget = AnimValueUtils.getValueOfTarget(this.target, property2, animInfo.startValue);
                    if (!AnimValueUtils.isInvalid(valueOfTarget)) {
                        updateInfo.animInfo.startValue = valueOfTarget;
                    }
                }
                AnimValueUtils.handleSetToValue(updateInfo);
                if (isLogEnabled) {
                    LogUtils.debug("-- doSetup, target = " + this.target + ", property = " + property2.getName() + ", startValue = " + updateInfo.animInfo.startValue + ", targetValue = " + updateInfo.animInfo.targetValue + ", value = " + updateInfo.animInfo.value, new Object[0]);
                }
            }
        }
        this.updateList = arrayList;
    }

    public void setupTasks(boolean z) {
        int size = this.updateList.size();
        int max = Math.max(1, size / AnimTask.MAX_SINGLE_TASK_SIZE);
        int ceil = (int) Math.ceil((double) (((float) size) / ((float) max)));
        if (this.animTasks.size() > max) {
            List<AnimTask> list = this.animTasks;
            list.subList(max, list.size()).clear();
        } else {
            for (int size2 = this.animTasks.size(); size2 < max; size2++) {
                this.animTasks.add(new AnimTask());
            }
        }
        int i = 0;
        for (AnimTask next : this.animTasks) {
            next.info = this;
            int i2 = i + ceil > size ? size - i : ceil;
            next.setup(i, i2);
            if (z) {
                next.animStats.startCount = i2;
            } else {
                next.updateAnimStats();
            }
            i += i2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionInfo{id = ");
        sb.append(this.f7490id);
        sb.append(", key = ");
        sb.append(this.key);
        sb.append(" ");
        sb.append(this.key.hashCode());
        sb.append(", startTime = ");
        sb.append(this.startTime);
        sb.append(", target = ");
        IAnimTarget iAnimTarget = this.target;
        sb.append(iAnimTarget != null ? iAnimTarget.getTargetObject() : null);
        sb.append(", propSize = ");
        sb.append(this.f7491to.keySet().size());
        sb.append(", next = ");
        sb.append(this.next);
        sb.append('}');
        return sb.toString();
    }
}
