package androidx.appcompat.widget;

import android.content.Context;
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
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.q1 */
public class C0382q1 extends C0419w0 {

    /* renamed from: c */
    private static boolean f1469c = false;

    /* renamed from: b */
    private final WeakReference<Context> f1470b;

    public C0382q1(Context context, Resources resources) {
        super(resources);
        this.f1470b = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m1718b() {
        return f1469c;
    }

    /* renamed from: c */
    public static boolean m1719c() {
        boolean b = m1718b();
        return false;
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) {
        return super.getAnimation(i);
    }

    public /* bridge */ /* synthetic */ boolean getBoolean(int i) {
        return super.getBoolean(i);
    }

    public /* bridge */ /* synthetic */ int getColor(int i) {
        return super.getColor(i);
    }

    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) {
        return super.getColorStateList(i);
    }

    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    public /* bridge */ /* synthetic */ float getDimension(int i) {
        return super.getDimension(i);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) {
        return super.getDimensionPixelOffset(i);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) {
        return super.getDimensionPixelSize(i);
    }

    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        Context context = this.f1470b.get();
        return context != null ? C0413v0.m1797g().mo2270s(context, this, i) : mo2278a(i);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) {
        return super.getDrawable(i, theme);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) {
        return super.getDrawableForDensity(i, i2);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ int[] getIntArray(int i) {
        return super.getIntArray(i);
    }

    public /* bridge */ /* synthetic */ int getInteger(int i) {
        return super.getInteger(i);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) {
        return super.getLayout(i);
    }

    public /* bridge */ /* synthetic */ Movie getMovie(int i) {
        return super.getMovie(i);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) {
        return super.getQuantityString(i, i2);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) {
        return super.getQuantityString(i, i2, objArr);
    }

    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) {
        return super.getQuantityText(i, i2);
    }

    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) {
        return super.getResourceEntryName(i);
    }

    public /* bridge */ /* synthetic */ String getResourceName(int i) {
        return super.getResourceName(i);
    }

    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) {
        return super.getResourcePackageName(i);
    }

    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) {
        return super.getResourceTypeName(i);
    }

    public /* bridge */ /* synthetic */ String getString(int i) {
        return super.getString(i);
    }

    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) {
        return super.getString(i, objArr);
    }

    public /* bridge */ /* synthetic */ String[] getStringArray(int i) {
        return super.getStringArray(i);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i) {
        return super.getText(i);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) {
        return super.getTextArray(i);
    }

    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) {
        super.getValue(i, typedValue, z);
    }

    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) {
        super.getValue(str, typedValue, z);
    }

    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) {
        return super.getXml(i);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) {
        return super.obtainTypedArray(i);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) {
        return super.openRawResource(i);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) {
        return super.openRawResource(i, typedValue);
    }

    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) {
        return super.openRawResourceFd(i);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }
}
