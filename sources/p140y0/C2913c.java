package p140y0;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: y0.c */
public class C2913c {
    /* renamed from: a */
    public static long m12059a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static long m12060b() {
        Calendar calendar;
        try {
            calendar = Calendar.getInstance(TimeZone.getTimeZone(C2934t.m12162n()));
        } catch (Exception unused) {
            calendar = Calendar.getInstance();
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: c */
    public static boolean m12061c(long j) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.add(10, 8);
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.setTimeInMillis(j);
        instance2.add(10, 8);
        return instance2.get(1) == instance.get(1) && instance2.get(2) == instance.get(2) && instance2.get(5) == instance.get(5);
    }
}
