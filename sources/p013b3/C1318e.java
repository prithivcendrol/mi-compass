package p013b3;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;

/* renamed from: b3.e */
public class C1318e extends C1314a {

    /* renamed from: e */
    private int[] f4504e;

    /* renamed from: f */
    private int[] f4505f;

    public C1318e(Drawable drawable) {
        this(drawable, drawable.getState());
    }

    public C1318e(Drawable drawable, int[] iArr) {
        super(drawable);
        this.f4504e = new int[0];
        this.f4505f = new int[0];
        mo5182d(iArr);
    }

    /* renamed from: b */
    public static boolean m5962b(StateListDrawable stateListDrawable, int[] iArr) {
        int a = C1317d.m5960a(stateListDrawable);
        for (int i = 0; i < a; i++) {
            for (int binarySearch : C1317d.m5961b(stateListDrawable, i)) {
                if (Arrays.binarySearch(iArr, binarySearch) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static int[] m5963c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[(iArr2.length + iArr.length)];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* renamed from: d */
    public boolean mo5182d(int[] iArr) {
        if (Arrays.equals(iArr, this.f4504e)) {
            return false;
        }
        this.f4504e = iArr;
        return super.setState(m5963c(iArr, this.f4505f));
    }

    public boolean setState(int[] iArr) {
        if (Arrays.equals(iArr, this.f4505f)) {
            return false;
        }
        this.f4505f = iArr;
        return super.setState(m5963c(this.f4504e, iArr));
    }
}
