package miuix.animation.controller;

import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.IVarFontStyle;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.font.FontWeightProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;

public class FolmeFont extends FolmeBase implements IVarFontStyle {
    private AnimConfig mDefaultTo;
    private int mInitValue;
    private boolean mIsInitSet;
    private FontWeightProperty mProperty;

    public enum FontType {
        INIT,
        TARGET
    }

    public FolmeFont() {
        super(new IAnimTarget[0]);
        AnimConfig animConfig = new AnimConfig();
        this.mDefaultTo = animConfig;
        animConfig.setEase(EaseManager.getStyle(0, 350.0f, 0.9f, 0.86f));
    }

    public void clean() {
        super.clean();
        this.mState = null;
        this.mProperty = null;
        this.mInitValue = 0;
    }

    public IVarFontStyle fromTo(int i, int i2, AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            FontType fontType = FontType.INIT;
            iFolmeStateStyle.getState(fontType).add(this.mProperty, (double) i);
            IFolmeStateStyle iFolmeStateStyle2 = this.mState;
            FontType fontType2 = FontType.TARGET;
            iFolmeStateStyle2.getState(fontType2).add(this.mProperty, (double) i2);
            this.mState.fromTo(fontType, fontType2, animConfigArr);
        }
        return this;
    }

    public IVarFontStyle setTo(int i) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            FontType fontType = FontType.TARGET;
            iFolmeStateStyle.getState(fontType).add(this.mProperty, (double) i);
            this.mState.setTo((Object) fontType);
        }
        return this;
    }

    /* renamed from: to */
    public IVarFontStyle mo6846to(int i, AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            if (!this.mIsInitSet) {
                this.mIsInitSet = true;
                iFolmeStateStyle.setTo((Object) FontType.INIT);
            }
            AnimConfig[] animConfigArr2 = (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDefaultTo);
            if (this.mInitValue == i) {
                this.mState.mo6815to(FontType.INIT, animConfigArr2);
            } else {
                IFolmeStateStyle iFolmeStateStyle2 = this.mState;
                FontType fontType = FontType.TARGET;
                iFolmeStateStyle2.getState(fontType).add(this.mProperty, (double) i);
                this.mState.mo6815to(fontType, animConfigArr2);
            }
        }
        return this;
    }

    public IVarFontStyle useAt(TextView textView, int i, int i2) {
        this.mState = new FolmeState(Folme.getTarget(textView, ViewTarget.sCreator));
        this.mProperty = new FontWeightProperty(textView, i);
        this.mInitValue = i2;
        this.mState.getState(FontType.INIT).add(this.mProperty, (double) i2);
        this.mIsInitSet = false;
        return this;
    }
}
