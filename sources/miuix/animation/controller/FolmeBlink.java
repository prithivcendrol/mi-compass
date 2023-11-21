package miuix.animation.controller;

import android.graphics.Color;
import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.animation.IAnimTarget;
import miuix.animation.IBlinkStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.internal.BlinkStateObserver;
import miuix.animation.internal.BlinkStateSubject;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewPropertyExt;
import p142y2.C2944a;

public class FolmeBlink extends FolmeBase implements IBlinkStyle, BlinkStateSubject {
    int flashcount = 0;
    private List<BlinkStateObserver> mBlinkStateObserverList = new CopyOnWriteArrayList();
    private Runnable mBlinkTask = new Runnable() {
        public void run() {
            IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
            iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.HIGHLIGHT), FolmeBlink.this.mToHighlightConfig);
        }
    };
    private long mInterval = 0;
    /* access modifiers changed from: private */
    public int mLimitCount = 1;
    private AnimConfig mStopConfig = new AnimConfig().setEase(6, 100.0f);
    /* access modifiers changed from: private */
    public AnimConfig mToHighlightConfig = new AnimConfig().setEase(6, 600.0f);
    /* access modifiers changed from: private */
    public AnimConfig mToNormalConfig = new AnimConfig().setEase(16, 400.0f);

    public FolmeBlink(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        setTintColor();
        this.mToNormalConfig.addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        this.mToHighlightConfig.addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        this.mStopConfig.addListeners(new TransitionListener() {
            public void onCancel(Object obj) {
                super.onCancel(obj);
                FolmeBlink.this.mState.cancel(ViewPropertyExt.FOREGROUND);
                FolmeBlink.this.mState.clean();
            }

            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink.this.mState.cancel(ViewPropertyExt.FOREGROUND);
                FolmeBlink.this.mState.clean();
            }
        });
    }

    private void setTintColor() {
        int argb = Color.argb(20, 0, 0, 0);
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            argb = ((View) targetObject).getResources().getColor(C2944a.f11148a);
        }
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(IBlinkStyle.BlinkType.HIGHLIGHT).add(foregroundProperty, (double) argb);
        this.mState.getState(IBlinkStyle.BlinkType.NORMAL).add(foregroundProperty, 0.0d);
    }

    public void attach(BlinkStateObserver blinkStateObserver) {
        this.mBlinkStateObserverList.add(blinkStateObserver);
    }

    public void detach(BlinkStateObserver blinkStateObserver) {
        this.mBlinkStateObserverList.remove(blinkStateObserver);
    }

    public void notifyState(boolean z) {
        for (BlinkStateObserver updateBlinkState : this.mBlinkStateObserverList) {
            updateBlinkState.updateBlinkState(z);
        }
    }

    public IBlinkStyle resetConfig() {
        this.mToHighlightConfig.setEase(6, 600.0f).addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        this.mToNormalConfig.setEase(16, 400.0f).addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        this.mInterval = 0;
        this.mLimitCount = 1;
        return this;
    }

    public IBlinkStyle setInterval(long j) {
        this.mInterval = j;
        return this;
    }

    public IBlinkStyle setLimitCount(int i) {
        this.mLimitCount = i;
        return this;
    }

    public IBlinkStyle setToHighlightConfig(AnimConfig animConfig) {
        this.mToHighlightConfig = animConfig;
        animConfig.addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        return this;
    }

    public IBlinkStyle setToNormalConfig(AnimConfig animConfig) {
        this.mToNormalConfig = animConfig;
        animConfig.addListeners(new TransitionListener() {
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        return this;
    }

    public void startBlink(int i, AnimConfig... animConfigArr) {
        this.mLimitCount = i;
        if (animConfigArr.length > 0) {
            setToHighlightConfig(animConfigArr[0]);
            if (animConfigArr.length > 1) {
                setToNormalConfig(animConfigArr[1]);
            }
        }
        startBlink(new AnimConfig[0]);
    }

    public void startBlink(AnimConfig... animConfigArr) {
        if (animConfigArr.length > 0) {
            setToHighlightConfig(animConfigArr[0]);
            if (animConfigArr.length > 1) {
                setToNormalConfig(animConfigArr[1]);
            }
        }
        if (this.mBlinkTask != null) {
            this.mState.getTarget().handler.postDelayed(this.mBlinkTask, this.flashcount == 0 ? 0 : this.mInterval);
        }
    }

    public void stopBlink() {
        this.mState.getTarget().handler.removeCallbacks(this.mBlinkTask);
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), this.mStopConfig);
    }
}
