package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C1832x;

/* renamed from: kotlinx.coroutines.scheduling.l */
public final class C1850l {

    /* renamed from: a */
    public static final long f7132a = C1834z.m7592e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f7133b = C1834z.m7591d("kotlinx.coroutines.scheduler.core.pool.size", C2581f.m10984a(C1832x.m7579a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f7134c = C1834z.m7591d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f7135d = TimeUnit.SECONDS.toNanos(C1834z.m7592e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C1845g f7136e = C1843e.f7122a;

    /* renamed from: f */
    public static final C1847i f7137f = new C1848j(0);

    /* renamed from: g */
    public static final C1847i f7138g = new C1848j(1);
}
