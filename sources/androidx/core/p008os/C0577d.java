package androidx.core.p008os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import p017c1.C1335j;
import p083n1.C2422g;

/* renamed from: androidx.core.os.d */
public final class C0577d {
    /* renamed from: a */
    public static final Bundle m2388a(C1335j<String, ? extends Object>... jVarArr) {
        C2422g.m10285e(jVarArr, "pairs");
        Bundle bundle = new Bundle(jVarArr.length);
        for (C1335j<String, ? extends Object> jVar : jVarArr) {
            String a = jVar.mo5186a();
            Object b = jVar.mo5187b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else {
                if (b instanceof Object[]) {
                    Class<?> componentType = b.getClass().getComponentType();
                    C2422g.m10282b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        C2422g.m10283c(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                        bundle.putParcelableArray(a, (Parcelable[]) b);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        C2422g.m10283c(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                        bundle.putStringArray(a, (String[]) b);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        C2422g.m10283c(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                        bundle.putCharSequenceArray(a, (CharSequence[]) b);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                    }
                } else if (!(b instanceof Serializable)) {
                    if (b instanceof IBinder) {
                        C0575b.m2385a(bundle, a, (IBinder) b);
                    } else if (b instanceof Size) {
                        C0576c.m2386a(bundle, a, (Size) b);
                    } else if (b instanceof SizeF) {
                        C0576c.m2387b(bundle, a, (SizeF) b);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
                    }
                }
                bundle.putSerializable(a, (Serializable) b);
            }
        }
        return bundle;
    }
}
