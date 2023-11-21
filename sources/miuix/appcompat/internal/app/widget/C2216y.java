package miuix.appcompat.internal.app.widget;

import android.content.Context;
import p018c2.C1347c;

/* renamed from: miuix.appcompat.internal.app.widget.y */
public class C2216y extends SecondaryTabContainerView {
    public C2216y(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    /* access modifiers changed from: protected */
    public int getDefaultTabTextStyle() {
        return C1347c.f4578l;
    }

    /* access modifiers changed from: protected */
    public int getTabActivatedTextStyle() {
        return C1347c.f4573h;
    }

    /* access modifiers changed from: package-private */
    public int getTabContainerHeight() {
        return -2;
    }
}
