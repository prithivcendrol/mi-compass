package miuix.animation.utils;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public class DeviceUtils {
    static final String ARCHITECTURE = "CPU architecture";
    static final int ARM_V8 = 8;
    static final int BIG_CORE_FREQ = 2000000;
    static final int CORE_COUNT = 8;
    static final String CpuMaxInfoFormat = "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq";
    static final int D800 = 73;
    public static final int DEVICE_HIGHEND = 2;
    public static final int DEVICE_MIDDLE = 1;
    public static final int DEVICE_PRIMARY = 0;
    public static final int DEVICE_UNKNOWN = -1;
    public static int DEV_STANDARD_VERSION = 1;
    static final String HEX = "0x";
    private static int HIGH = 0;
    static final int HIGH_FREQ = 2700000;
    static final String IMPLEMENTOR = "CPU implementer";
    private static int LOW = 0;
    private static int MIDDLE = 0;
    static final int MIDDLE_FREQ = 2300000;
    static final int MTK_DIMENSITY = 68;
    static final Pattern MT_PATTERN = Pattern.compile("MT([\\d]{2})([\\d]+)");
    static final String PART = "CPU part";
    private static final String PERFORMANCE_CLASS = "com.miui.performance.DeviceLevelUtils";
    private static final String PERFORMANCE_JAR = "/system/framework/MiuiBooster.jar";
    static final String PROCESSOR = "processor";
    static final String QUALCOMM = "Qualcomm";
    static final String SEPARATOR = ": ";
    static final Pattern SM_PATTERN = Pattern.compile("Inc ([A-Z]+)([\\d]+)");
    static final String SNAPDRAGON1 = "msm";
    static final String SNAPDRAGON2 = "sdm";
    static final String SNAPDRAGON3 = "sm";
    private static final String[] STOCK_DEVICE = {"cactus", "cereus", "pine", "olive", "ginkgo", "olivelite", "olivewood", "willow", "wayne", "dandelion", "angelica", "angelicain", "whyred", "tulip", "onc", "onclite", "lavender", "lotus", "laurus", "merlinnfc", "merlin", "lancelot", "citrus", "pomelo", "lemon", "shiva", "lime", "cannon", "curtana", "durandal", "excalibur", "joyeuse", "gram", "sunny", "mojito", "rainbow", "cattail", "angelican", "camellia"};
    static final String TAG = "DeviceUtils";
    public static int TYPE_CPU;
    public static int TYPE_GPU;
    public static int TYPE_RAM;
    private static int UNKNOWN;
    private static Application application;
    private static Context applicationContext;
    private static Constructor<Class> mConstructor;
    static int mCpuLevel = -1;
    private static Method mGetDeviceLevel;
    private static Method mGetDeviceLevelForWhole;
    static int mGpuLevel = -1;
    private static Method mIsSupportPrune;
    private static int mLastVersion = 1;
    static int mLevel = -1;
    private static Object mPerf;
    static int mRamLevel = -1;
    static int mTotalRam = Integer.MAX_VALUE;
    private static Class perfClass;
    private static PathClassLoader perfClassLoader;

    public static class CpuInfo {
        int architecture;

        /* renamed from: id */
        int f7498id;
        int implementor;
        int maxFreq;
        int part;

        public String toString() {
            return "CpuInfo{id=" + this.f7498id + ", implementor=" + Integer.toHexString(this.implementor) + ", architecture=" + this.architecture + ", part=" + Integer.toHexString(this.part) + ", maxFreq=" + this.maxFreq + '}';
        }
    }

    public static class CpuStats {
        int bigCoreCount;
        int level = -1;
        int maxFreq;
        int smallCoreCount;

        public String toString() {
            return "CpuStats{level=" + this.level + ", maxFreq=" + this.maxFreq + ", bigCoreCount=" + this.bigCoreCount + ", smallCoreCount=" + this.smallCoreCount + '}';
        }
    }

    static {
        mConstructor = null;
        mPerf = null;
        mGetDeviceLevel = null;
        mGetDeviceLevelForWhole = null;
        mIsSupportPrune = null;
        TYPE_RAM = 1;
        TYPE_CPU = 2;
        TYPE_GPU = 3;
        try {
            PathClassLoader pathClassLoader = new PathClassLoader(PERFORMANCE_JAR, ClassLoader.getSystemClassLoader());
            perfClassLoader = pathClassLoader;
            Class<?> loadClass = pathClassLoader.loadClass(PERFORMANCE_CLASS);
            perfClass = loadClass;
            mConstructor = loadClass.getConstructor(new Class[]{Context.class});
            Class cls = Integer.TYPE;
            mGetDeviceLevel = perfClass.getDeclaredMethod("getDeviceLevel", new Class[]{cls, cls});
            mGetDeviceLevelForWhole = perfClass.getDeclaredMethod("getDeviceLevel", new Class[]{cls});
            mIsSupportPrune = perfClass.getDeclaredMethod("isSupportPrune", new Class[0]);
            TYPE_RAM = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_RAM", cls)).intValue();
            TYPE_CPU = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_CPU", cls)).intValue();
            TYPE_GPU = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_GPU", cls)).intValue();
            LOW = ((Integer) getStaticObjectField(perfClass, "LOW_DEVICE", cls)).intValue();
            MIDDLE = ((Integer) getStaticObjectField(perfClass, "MIDDLE_DEVICE", cls)).intValue();
            HIGH = ((Integer) getStaticObjectField(perfClass, "HIGH_DEVICE", cls)).intValue();
            UNKNOWN = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_UNKNOWN", cls)).intValue();
        } catch (Exception e) {
            Log.e(TAG, "DeviceLevel(): Load Class Exception:" + e);
        }
        if (applicationContext == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
                application = application2;
                if (application2 != null) {
                    applicationContext = application2.getApplicationContext();
                }
            } catch (Exception e2) {
                Log.e(TAG, "android.app.ActivityThread Exception:" + e2);
            }
        }
        if (applicationContext == null) {
            try {
                Application application3 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke((Object) null, (Object[]) null);
                application = application3;
                if (application3 != null) {
                    applicationContext = application3.getApplicationContext();
                }
            } catch (Exception e3) {
                Log.e(TAG, "android.app.AppGlobals Exception:" + e3);
            }
        }
        try {
            Constructor<Class> constructor = mConstructor;
            if (constructor != null) {
                mPerf = constructor.newInstance(new Object[]{applicationContext});
            }
        } catch (Exception e4) {
            Log.e(TAG, "DeviceLevelUtils(): newInstance Exception:" + e4);
            e4.printStackTrace();
        }
    }

    private static CpuInfo createCpuInfo(String str) {
        CpuInfo cpuInfo = new CpuInfo();
        int parseInt = Integer.parseInt(str);
        cpuInfo.f7498id = parseInt;
        String contentFromFileInfo = getContentFromFileInfo(String.format(Locale.ENGLISH, CpuMaxInfoFormat, new Object[]{Integer.valueOf(parseInt)}));
        if (contentFromFileInfo != null) {
            cpuInfo.maxFreq = Integer.parseInt(contentFromFileInfo);
        }
        return cpuInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r5.maxFreq > MIDDLE_FREQ) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r5.level = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 > MIDDLE_FREQ) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void decideLevel(miuix.animation.utils.DeviceUtils.CpuStats r5) {
        /*
            int r0 = r5.level
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return
        L_0x0006:
            int r0 = r5.bigCoreCount
            r1 = 4
            r2 = 1
            r3 = 0
            r4 = 2300000(0x231860, float:3.222986E-39)
            if (r0 < r1) goto L_0x001e
            int r0 = r5.maxFreq
            r1 = 2700000(0x2932e0, float:3.783506E-39)
            if (r0 <= r1) goto L_0x001b
            r0 = 2
            r5.level = r0
            goto L_0x0027
        L_0x001b:
            if (r0 <= r4) goto L_0x0025
            goto L_0x0022
        L_0x001e:
            int r0 = r5.maxFreq
            if (r0 <= r4) goto L_0x0025
        L_0x0022:
            r5.level = r2
            goto L_0x0027
        L_0x0025:
            r5.level = r3
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.DeviceUtils.decideLevel(miuix.animation.utils.DeviceUtils$CpuStats):void");
    }

    private static void doCpuStats(CpuStats cpuStats, List<CpuInfo> list) {
        for (CpuInfo next : list) {
            if (next.architecture < 8) {
                cpuStats.level = 0;
            }
            int i = next.maxFreq;
            if (i > cpuStats.maxFreq) {
                cpuStats.maxFreq = i;
            }
            if (i >= BIG_CORE_FREQ) {
                cpuStats.bigCoreCount++;
            } else {
                cpuStats.smallCoreCount++;
            }
        }
        decideLevel(cpuStats);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[SYNTHETIC, Splitter:B:13:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0028 A[SYNTHETIC, Splitter:B:21:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getContentFromFileInfo(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025, all -> 0x001e }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0025, all -> 0x001e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r3.close()     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            return r2
        L_0x001b:
            r3 = move-exception
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r3 = move-exception
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r3
        L_0x0025:
            r1 = r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.utils.DeviceUtils.getContentFromFileInfo(java.lang.String):java.lang.String");
    }

    private static void getCpuInfo(String str, String str2, CpuInfo cpuInfo) {
        if (str.contains(IMPLEMENTOR)) {
            cpuInfo.implementor = toInt(str2);
        } else if (str.contains(ARCHITECTURE)) {
            cpuInfo.architecture = toInt(str2);
        } else if (str.contains(PART)) {
            cpuInfo.part = toInt(str2);
        }
    }

    public static List<CpuInfo> getCpuInfoList() {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            CpuInfo cpuInfo = null;
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(SEPARATOR);
                if (split.length > 1) {
                    cpuInfo = parseLine(split, arrayList, cpuInfo);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "getChipSetFromCpuInfo failed", e);
        }
        return arrayList;
    }

    private static int getCpuLevel() {
        String hardwareInfo = getHardwareInfo();
        int qualcommCpuLevel = hardwareInfo.length() > 0 ? hardwareInfo.contains(QUALCOMM) ? getQualcommCpuLevel(hardwareInfo) : getMtkCpuLevel(hardwareInfo) : -1;
        return qualcommCpuLevel == -1 ? getCpuStats().level : qualcommCpuLevel;
    }

    public static CpuStats getCpuStats() {
        List<CpuInfo> cpuInfoList = getCpuInfoList();
        CpuStats cpuStats = new CpuStats();
        if (cpuInfoList.size() < 8) {
            cpuStats.level = 0;
        }
        doCpuStats(cpuStats, cpuInfoList);
        return cpuStats;
    }

    public static int getDeviceLevel() {
        return getDeviceLevel(DEV_STANDARD_VERSION);
    }

    public static int getDeviceLevel(int i) {
        int i2;
        if (mLastVersion == i && (i2 = mLevel) != -1) {
            return i2;
        }
        mLastVersion = i;
        int deviceLevel2 = getDeviceLevel2(i);
        mLevel = deviceLevel2;
        return deviceLevel2 != -1 ? deviceLevel2 : getDeviceLevel1();
    }

    public static int getDeviceLevel(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 == TYPE_CPU) {
            if (mLastVersion == i && (i5 = mCpuLevel) != -1) {
                return i5;
            }
        } else if (i2 == TYPE_GPU) {
            if (mLastVersion == i && (i4 = mGpuLevel) != -1) {
                return i4;
            }
        } else if (i2 == TYPE_RAM && mLastVersion == i && (i3 = mRamLevel) != -1) {
            return i3;
        }
        int deviceLevel2 = getDeviceLevel2(i, i2);
        return deviceLevel2 != -1 ? setDeviceLevel(i, deviceLevel2, i2) : setDeviceLevel(i, getDeviceLevel1(i2), i2);
    }

    private static int getDeviceLevel1() {
        int i = mLevel;
        if (i != -1) {
            return i;
        }
        if (isMiuiLite()) {
            mLevel = 0;
        } else {
            mLevel = getMinLevel(getDeviceLevel1(TYPE_CPU), getDeviceLevel1(TYPE_RAM), getDeviceLevel(DEV_STANDARD_VERSION, TYPE_GPU));
        }
        return mLevel;
    }

    private static int getDeviceLevel1(int i) {
        if (i == TYPE_RAM) {
            int totalRam = getTotalRam();
            if (totalRam > 6) {
                return 2;
            }
            if (totalRam > 4) {
                return 1;
            }
            return totalRam > 0 ? 0 : -1;
        } else if (i == TYPE_CPU) {
            return getCpuLevel();
        } else {
            return -1;
        }
    }

    private static int getDeviceLevel2(int i) {
        int i2;
        try {
            i2 = ((Integer) mGetDeviceLevelForWhole.invoke(mPerf, new Object[]{Integer.valueOf(i)})).intValue();
        } catch (Exception e) {
            Log.e(TAG, "getDeviceLevel failed , e:" + e.toString());
            i2 = -1;
        }
        return transDeviceLevel(i2);
    }

    private static int getDeviceLevel2(int i, int i2) {
        int i3;
        try {
            i3 = ((Integer) mGetDeviceLevel.invoke(mPerf, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
        } catch (Exception e) {
            Log.e(TAG, "getDeviceLevel failed , e:" + e.toString());
            i3 = -1;
        }
        return transDeviceLevel(i3);
    }

    private static String getHardwareInfo() {
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (!scanner.hasNextLine()) {
                    String[] split = nextLine.split(SEPARATOR);
                    if (split.length > 1) {
                        return split[1];
                    }
                }
            }
            return "";
        } catch (Exception e) {
            Log.e(TAG, "getChipSetFromCpuInfo failed", e);
            return "";
        }
    }

    private static int getMinLevel(int... iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > -1 && i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    private static int getMtkCpuLevel(String str) {
        String group;
        String group2;
        Matcher matcher = MT_PATTERN.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null || (group2 = matcher.group(2)) == null) {
            return -1;
        }
        return (Integer.parseInt(group) != 68 || Integer.parseInt(group2) < 73) ? 0 : 1;
    }

    public static String getProductDevice() {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{"ro.product.device", ""});
        } catch (Exception e) {
            Log.e(TAG, "getProductDevice failed , e:" + e.toString());
            return "";
        }
    }

    public static int getQualcommCpuLevel(String str) {
        String group;
        String group2;
        Matcher matcher = SM_PATTERN.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null || (group2 = matcher.group(2)) == null) {
            return -1;
        }
        String lowerCase = group.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.equals(SNAPDRAGON3)) {
            return lowerCase.equals(SNAPDRAGON2) ? Integer.parseInt(group2.substring(0, 1)) >= 7 ? 1 : 0 : lowerCase.equals(SNAPDRAGON1) ? 0 : -1;
        }
        int parseInt = Integer.parseInt(group2.substring(0, 1));
        if (parseInt >= 8) {
            return 2;
        }
        return parseInt >= 7 ? 1 : 0;
    }

    private static <T> T getStaticObjectField(Class<?> cls, String str, Class<T> cls2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get((Object) null);
    }

    public static int getTotalRam() {
        if (mTotalRam == Integer.MAX_VALUE) {
            try {
                mTotalRam = (int) (((((Long) Class.forName("miui.util.HardwareInfo").getMethod("getTotalPhysicalMemory", new Class[0]).invoke((Object) null, new Object[0])).longValue() / 1024) / 1024) / 1024);
            } catch (Throwable th) {
                Log.e(TAG, th.getMessage());
                mTotalRam = 0;
            }
        }
        return mTotalRam;
    }

    private static boolean isMiuiLite() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getDeclaredField("IS_MIUI_LITE_VERSION").get((Object) null)).booleanValue();
        } catch (Throwable th) {
            Log.i(TAG, "getDeviceLevel failed", th);
            return false;
        }
    }

    public static boolean isStockDevice() {
        String productDevice = getProductDevice();
        if (!(productDevice == null || productDevice.length() == 0)) {
            for (String equalsIgnoreCase : STOCK_DEVICE) {
                if (equalsIgnoreCase.equalsIgnoreCase(productDevice)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSupportPrune() {
        try {
            return ((Boolean) mIsSupportPrune.invoke(mPerf, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.e(TAG, "isSupportPrune failed , e:" + e.toString());
            return false;
        }
    }

    private static CpuInfo parseLine(String[] strArr, List<CpuInfo> list, CpuInfo cpuInfo) {
        String trim = strArr[1].trim();
        if (strArr[0].contains(PROCESSOR) && TextUtils.isDigitsOnly(trim)) {
            CpuInfo createCpuInfo = createCpuInfo(trim);
            list.add(createCpuInfo);
            return createCpuInfo;
        } else if (cpuInfo == null) {
            return cpuInfo;
        } else {
            getCpuInfo(strArr[0], trim, cpuInfo);
            return cpuInfo;
        }
    }

    private static int setDeviceLevel(int i, int i2, int i3) {
        mLastVersion = i;
        if (i3 == TYPE_CPU) {
            mCpuLevel = i2;
            return i2;
        } else if (i3 == TYPE_GPU) {
            mGpuLevel = i2;
            return i2;
        } else if (i3 != TYPE_RAM) {
            return -1;
        } else {
            mRamLevel = i2;
            return i2;
        }
    }

    private static int toInt(String str) {
        return str.startsWith(HEX) ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
    }

    private static int transDeviceLevel(int i) {
        if (i == LOW) {
            return 0;
        }
        if (i == MIDDLE) {
            return 1;
        }
        return i == HIGH ? 2 : -1;
    }
}
