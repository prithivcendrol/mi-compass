package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.res.C0528f;
import java.io.InputStream;
import p039g.C1583a;

/* renamed from: androidx.appcompat.widget.w0 */
class C0419w0 extends Resources {

    /* renamed from: a */
    private final Resources f1528a;

    public C0419w0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1528a = resources;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo2278a(int i) {
        return super.getDrawable(i);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f1528a.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.f1528a.getBoolean(i);
    }

    public int getColor(int i) {
        return this.f1528a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f1528a.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.f1528a.getConfiguration();
    }

    public float getDimension(int i) {
        return this.f1528a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f1528a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f1528a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1528a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return C0528f.m2201d(this.f1528a, i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return C0528f.m2202e(this.f1528a, i, i2, (Resources.Theme) null);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return C0528f.m2202e(this.f1528a, i, i2, theme);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f1528a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1528a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.f1528a.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.f1528a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f1528a.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.f1528a.getMovie(i);
    }

    public String getQuantityString(int i, int i2) {
        return this.f1528a.getQuantityString(i, i2);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f1528a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f1528a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) {
        return this.f1528a.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.f1528a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f1528a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f1528a.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.f1528a.getString(i);
    }

    public String getString(int i, Object... objArr) {
        return this.f1528a.getString(i, objArr);
    }

    public String[] getStringArray(int i) {
        return this.f1528a.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.f1528a.getText(i);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f1528a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f1528a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f1528a.getValue(i, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f1528a.getValue(str, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        C1583a.m6793a(this.f1528a, i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.f1528a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1528a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f1528a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.f1528a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f1528a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f1528a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1528a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1528a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1528a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
