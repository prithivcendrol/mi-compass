package miuix.animation.utils;

import android.util.ArrayMap;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class FieldManager {
    static final String GET = "get";
    static final String SET = "set";
    Map<String, FieldInfo> mFieldMap = new ArrayMap();
    Map<String, MethodInfo> mMethodMap = new ArrayMap();

    static class FieldInfo {
        Field field;

        FieldInfo() {
        }
    }

    static class MethodInfo {
        Method method;

        MethodInfo() {
        }
    }

    static FieldInfo getField(Object obj, String str, Class<?> cls, Map<String, FieldInfo> map) {
        FieldInfo fieldInfo = map.get(str);
        if (fieldInfo != null) {
            return fieldInfo;
        }
        FieldInfo fieldInfo2 = new FieldInfo();
        fieldInfo2.field = getFieldByType(obj, str, cls);
        map.put(str, fieldInfo2);
        return fieldInfo2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Field getFieldByType(java.lang.Object r3, java.lang.String r4, java.lang.Class<?> r5) {
        /*
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch:{ NoSuchFieldException -> 0x000e }
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x000e }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x000f }
            goto L_0x0017
        L_0x000e:
            r1 = r0
        L_0x000f:
            java.lang.Class r3 = r3.getClass()     // Catch:{ NoSuchFieldException -> 0x0017 }
            java.lang.reflect.Field r1 = r3.getField(r4)     // Catch:{ NoSuchFieldException -> 0x0017 }
        L_0x0017:
            if (r1 == 0) goto L_0x0020
            java.lang.Class r3 = r1.getType()
            if (r3 == r5) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.FieldManager.getFieldByType(java.lang.Object, java.lang.String, java.lang.Class):java.lang.reflect.Field");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Method getMethod(java.lang.Object r2, java.lang.String r3, java.lang.Class<?>... r4) {
        /*
            r0 = 0
            java.lang.Class r1 = r2.getClass()     // Catch:{ NoSuchMethodException -> 0x000e }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x000e }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x000e }
            goto L_0x0016
        L_0x000e:
            java.lang.Class r2 = r2.getClass()     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.FieldManager.getMethod(java.lang.Object, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    static MethodInfo getMethod(Object obj, String str, Map<String, MethodInfo> map, Class<?>... clsArr) {
        MethodInfo methodInfo = map.get(str);
        if (methodInfo != null) {
            return methodInfo;
        }
        MethodInfo methodInfo2 = new MethodInfo();
        methodInfo2.method = getMethod(obj, str, clsArr);
        map.put(str, methodInfo2);
        return methodInfo2;
    }

    static String getMethodName(String str, String str2) {
        return str2 + Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    static <T> T getValueByField(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    static <T> T invokeMethod(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            Log.d(CommonUtils.TAG, "ValueProperty.invokeMethod failed, " + method.getName(), e);
            return null;
        }
    }

    static <T> T retToClz(Object obj, Class<T> cls) {
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(number.floatValue());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(number.intValue());
        }
        throw new IllegalArgumentException("getPropertyValue, clz must be float or int instead of " + cls);
    }

    static <T> void setValueByField(Object obj, Field field, T t) {
        try {
            field.set(obj, t);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T getField(java.lang.Object r6, java.lang.String r7, java.lang.Class<T> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0055
            if (r7 == 0) goto L_0x0055
            int r1 = r7.length()     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x000d
            goto L_0x0055
        L_0x000d:
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$MethodInfo> r1 = r5.mMethodMap     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0052 }
            miuix.animation.utils.FieldManager$MethodInfo r1 = (miuix.animation.utils.FieldManager.MethodInfo) r1     // Catch:{ all -> 0x0052 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = "get"
            java.lang.String r1 = getMethodName(r7, r1)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$MethodInfo> r3 = r5.mMethodMap     // Catch:{ all -> 0x0052 }
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0052 }
            miuix.animation.utils.FieldManager$MethodInfo r1 = getMethod(r6, r1, r3, r4)     // Catch:{ all -> 0x0052 }
        L_0x0026:
            java.lang.reflect.Method r1 = r1.method     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            java.lang.Object r6 = invokeMethod(r6, r1, r7)     // Catch:{ all -> 0x0052 }
            java.lang.Object r6 = retToClz(r6, r8)     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r6
        L_0x0036:
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$FieldInfo> r1 = r5.mFieldMap     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0052 }
            miuix.animation.utils.FieldManager$FieldInfo r1 = (miuix.animation.utils.FieldManager.FieldInfo) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0046
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$FieldInfo> r1 = r5.mFieldMap     // Catch:{ all -> 0x0052 }
            miuix.animation.utils.FieldManager$FieldInfo r1 = getField(r6, r7, r8, r1)     // Catch:{ all -> 0x0052 }
        L_0x0046:
            java.lang.reflect.Field r7 = r1.field     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x0050
            java.lang.Object r6 = getValueByField(r6, r7)     // Catch:{ all -> 0x0052 }
            monitor-exit(r5)
            return r6
        L_0x0050:
            monitor-exit(r5)
            return r0
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0055:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.FieldManager.getField(java.lang.Object, java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> boolean setField(java.lang.Object r6, java.lang.String r7, java.lang.Class<T> r8, T r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0053
            if (r7 == 0) goto L_0x0053
            int r1 = r7.length()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x000d
            goto L_0x0053
        L_0x000d:
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$MethodInfo> r1 = r5.mMethodMap     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0050 }
            miuix.animation.utils.FieldManager$MethodInfo r1 = (miuix.animation.utils.FieldManager.MethodInfo) r1     // Catch:{ all -> 0x0050 }
            r2 = 1
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "set"
            java.lang.String r1 = getMethodName(r7, r1)     // Catch:{ all -> 0x0050 }
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$MethodInfo> r3 = r5.mMethodMap     // Catch:{ all -> 0x0050 }
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0050 }
            r4[r0] = r8     // Catch:{ all -> 0x0050 }
            miuix.animation.utils.FieldManager$MethodInfo r1 = getMethod(r6, r1, r3, r4)     // Catch:{ all -> 0x0050 }
        L_0x0028:
            java.lang.reflect.Method r1 = r1.method     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r7[r0] = r9     // Catch:{ all -> 0x0050 }
            invokeMethod(r6, r1, r7)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            return r2
        L_0x0035:
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$FieldInfo> r1 = r5.mFieldMap     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0050 }
            miuix.animation.utils.FieldManager$FieldInfo r1 = (miuix.animation.utils.FieldManager.FieldInfo) r1     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0045
            java.util.Map<java.lang.String, miuix.animation.utils.FieldManager$FieldInfo> r1 = r5.mFieldMap     // Catch:{ all -> 0x0050 }
            miuix.animation.utils.FieldManager$FieldInfo r1 = getField(r6, r7, r8, r1)     // Catch:{ all -> 0x0050 }
        L_0x0045:
            java.lang.reflect.Field r7 = r1.field     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x004e
            setValueByField(r6, r7, r9)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            return r2
        L_0x004e:
            monitor-exit(r5)
            return r0
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0053:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.FieldManager.setField(java.lang.Object, java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }
}
