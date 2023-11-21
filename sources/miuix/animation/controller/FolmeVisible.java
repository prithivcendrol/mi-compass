package miuix.animation.controller;

import java.util.Collection;
import miuix.animation.IAnimTarget;
import miuix.animation.IVisibleStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;

public class FolmeVisible extends FolmeBase implements IVisibleStyle {
    private final AnimConfig mDefConfig = new AnimConfig().addListeners(new TransitionListener() {
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            if (obj.equals(IVisibleStyle.VisibleType.SHOW) && FolmeVisible.this.mSetBound) {
                AnimState.alignState(FolmeVisible.this.mState.getState(IVisibleStyle.VisibleType.HIDE), collection);
            }
        }
    });
    private boolean mHasMove;
    private boolean mHasScale;
    /* access modifiers changed from: private */
    public boolean mSetBound;

    public FolmeVisible(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        useAutoAlpha(true);
    }

    private AnimConfig[] getConfig(IVisibleStyle.VisibleType visibleType, AnimConfig... animConfigArr) {
        AnimConfig animConfig;
        EaseManager.EaseStyle style;
        boolean z = this.mHasScale;
        if (!z && !this.mHasMove) {
            animConfig = this.mDefConfig;
            style = visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(16, 300.0f) : EaseManager.getStyle(-2, 1.0f, 0.15f);
        } else if (z && !this.mHasMove) {
            animConfig = this.mDefConfig;
            style = visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.6f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.2f);
        } else if (!z) {
            animConfig = this.mDefConfig;
            style = visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.75f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.25f);
        } else {
            animConfig = this.mDefConfig;
            style = visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.65f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.25f);
        }
        animConfig.setEase(style);
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDefConfig);
    }

    private IVisibleStyle.VisibleType getType(IVisibleStyle.VisibleType... visibleTypeArr) {
        return visibleTypeArr.length > 0 ? visibleTypeArr[0] : IVisibleStyle.VisibleType.HIDE;
    }

    public void clean() {
        super.clean();
        this.mHasScale = false;
        this.mHasMove = false;
    }

    public void hide(AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        IVisibleStyle.VisibleType visibleType = IVisibleStyle.VisibleType.HIDE;
        iFolmeStateStyle.mo6815to(visibleType, getConfig(visibleType, animConfigArr));
    }

    public IVisibleStyle setAlpha(float f, IVisibleStyle.VisibleType... visibleTypeArr) {
        this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.AUTO_ALPHA, (double) f);
        return this;
    }

    public IVisibleStyle setBound(int i, int i2, int i3, int i4) {
        this.mSetBound = true;
        this.mState.getState(IVisibleStyle.VisibleType.SHOW).add(ViewProperty.f7495X, (double) i).add(ViewProperty.f7496Y, (double) i2).add(ViewProperty.WIDTH, (double) i3).add(ViewProperty.HEIGHT, (double) i4);
        return this;
    }

    public IVisibleStyle setFlags(long j) {
        this.mState.setFlags(j);
        return this;
    }

    public IVisibleStyle setHide() {
        this.mState.setTo((Object) IVisibleStyle.VisibleType.HIDE);
        return this;
    }

    public IVisibleStyle setMove(int i, int i2) {
        return setMove(i, i2, IVisibleStyle.VisibleType.HIDE);
    }

    public IVisibleStyle setMove(int i, int i2, IVisibleStyle.VisibleType... visibleTypeArr) {
        boolean z = Math.abs(i) > 0 || Math.abs(i2) > 0;
        this.mHasMove = z;
        if (z) {
            this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.f7495X, i, 1).add(ViewProperty.f7496Y, i2, 1);
        }
        return this;
    }

    public IVisibleStyle setScale(float f, IVisibleStyle.VisibleType... visibleTypeArr) {
        this.mHasScale = true;
        double d = (double) f;
        this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.SCALE_Y, d).add(ViewProperty.SCALE_X, d);
        return this;
    }

    public IVisibleStyle setShow() {
        this.mState.setTo((Object) IVisibleStyle.VisibleType.SHOW);
        return this;
    }

    public IVisibleStyle setShowDelay(long j) {
        this.mState.getState(IVisibleStyle.VisibleType.SHOW).getConfig().delay = j;
        return this;
    }

    public void show(AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        IVisibleStyle.VisibleType visibleType = IVisibleStyle.VisibleType.SHOW;
        iFolmeStateStyle.mo6815to(visibleType, getConfig(visibleType, animConfigArr));
    }

    public IVisibleStyle useAutoAlpha(boolean z) {
        ViewProperty viewProperty = ViewProperty.AUTO_ALPHA;
        ViewProperty viewProperty2 = ViewProperty.ALPHA;
        if (z) {
            this.mState.getState(IVisibleStyle.VisibleType.SHOW).remove(viewProperty2).add(viewProperty, 1.0d);
            this.mState.getState(IVisibleStyle.VisibleType.HIDE).remove(viewProperty2).add(viewProperty, 0.0d);
        } else {
            this.mState.getState(IVisibleStyle.VisibleType.SHOW).remove(viewProperty).add(viewProperty2, 1.0d);
            this.mState.getState(IVisibleStyle.VisibleType.HIDE).remove(viewProperty).add(viewProperty2, 0.0d);
        }
        return this;
    }
}
