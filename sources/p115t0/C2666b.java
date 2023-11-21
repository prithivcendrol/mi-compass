package p115t0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p120u0.C2730a;
import p120u0.C2732c;
import p120u0.C2733d;
import p130w0.C2874a;
import p130w0.C2875b;
import p140y0.C2933s;

/* renamed from: t0.b */
public class C2666b {

    /* renamed from: b */
    private static C2666b f10444b;

    /* renamed from: c */
    private static BroadcastReceiver f10445c = new C2668c();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2667a f10446a = new C2667a(C2874a.m11876a());

    /* renamed from: t0.b$a */
    private static class C2667a extends SQLiteOpenHelper {
        public C2667a(Context context) {
            super(context, "onetrack", (SQLiteDatabase.CursorFactory) null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT,appid TEXT,package TEXT,event_name TEXT,priority INTEGER,data BLOB,timestamp INTEGER)");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private C2666b() {
        mo9926j();
    }

    /* renamed from: b */
    public static String m11158b(byte[] bArr) {
        return new String(C2730a.m11381d(bArr, C2733d.m11391a(C2732c.m11388b(), true).getBytes()));
    }

    /* renamed from: d */
    public static C2666b m11160d() {
        if (f10444b == null) {
            m11161f(C2874a.m11876a());
        }
        return f10444b;
    }

    /* renamed from: f */
    public static void m11161f(Context context) {
        if (f10444b == null) {
            synchronized (C2666b.class) {
                if (f10444b == null) {
                    f10444b = new C2666b();
                }
            }
        }
        m11164k(context);
        C2677l.m11189g();
    }

    /* renamed from: i */
    public static byte[] m11163i(String str) {
        return C2730a.m11380c(str.getBytes(), C2733d.m11391a(C2732c.m11388b(), true).getBytes());
    }

    /* renamed from: k */
    private static void m11164k(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(f10445c, intentFilter);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11165l(p130w0.C2875b r7) {
        /*
            r6 = this;
            t0.b$a r0 = r6.f10446a
            monitor-enter(r0)
            boolean r1 = r7.mo10172p()     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "EventManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "addEventToDatabase event is inValid, event:"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = r7.mo10169m()     // Catch:{ all -> 0x00df }
            r2.append(r7)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x00df }
            p140y0.C2933s.m12146h(r1, r7)     // Catch:{ all -> 0x00df }
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            return
        L_0x0025:
            t0.b$a r1 = r6.f10446a     // Catch:{ all -> 0x00df }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x00df }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "appid"
            java.lang.String r4 = r7.mo10164h()     // Catch:{ all -> 0x00df }
            r2.put(r3, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "package"
            java.lang.String r4 = r7.mo10167k()     // Catch:{ all -> 0x00df }
            r2.put(r3, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "event_name"
            java.lang.String r4 = r7.mo10169m()     // Catch:{ all -> 0x00df }
            r2.put(r3, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "priority"
            int r4 = r7.mo10170n()     // Catch:{ all -> 0x00df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00df }
            r2.put(r3, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "timestamp"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00df }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00df }
            r2.put(r3, r4)     // Catch:{ all -> 0x00df }
            org.json.JSONObject r3 = r7.mo10171o()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00df }
            byte[] r3 = m11163i(r3)     // Catch:{ all -> 0x00df }
            int r4 = r3.length     // Catch:{ all -> 0x00df }
            r5 = 204800(0x32000, float:2.86986E-40)
            if (r4 <= r5) goto L_0x0080
            java.lang.String r7 = "EventManager"
            java.lang.String r1 = "Too large data, discard ***"
            p140y0.C2933s.m12144f(r7, r1)     // Catch:{ all -> 0x00df }
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            return
        L_0x0080:
            java.lang.String r4 = "data"
            r2.put(r4, r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "events"
            r4 = 0
            long r1 = r1.insert(r3, r4, r2)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "EventManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r4.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r5 = "DB-Thread: EventManager.addEventToDatabase , row="
            r4.append(r5)     // Catch:{ all -> 0x00df }
            r4.append(r1)     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00df }
            p140y0.C2933s.m12141c(r3, r4)     // Catch:{ all -> 0x00df }
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00dd
            boolean r1 = p140y0.C2933s.f11129a     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = "EventManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "添加后，DB 中事件个数为 "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            long r3 = r6.mo9927m()     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            p140y0.C2933s.m12141c(r1, r2)     // Catch:{ all -> 0x00df }
        L_0x00c6:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "onetrack_active"
            java.lang.String r7 = r7.mo10169m()     // Catch:{ all -> 0x00df }
            boolean r7 = r3.equals(r7)     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00d9
            p140y0.C2911a.m12037g(r1)     // Catch:{ all -> 0x00df }
        L_0x00d9:
            r7 = 0
            p110s0.C2647i.m11144b(r7)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            return
        L_0x00df:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2666b.m11165l(w0.b):void");
    }

    /* renamed from: n */
    private void m11166n() {
        try {
            this.f10446a.getWritableDatabase().delete("events", (String) null, (String[]) null);
            C2933s.m12141c("EventManager", "delete table events");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9923a(java.util.ArrayList<java.lang.Long> r9) {
        /*
            r8 = this;
            t0.b$a r0 = r8.f10446a
            monitor-enter(r0)
            r1 = 0
            if (r9 == 0) goto L_0x00c5
            int r2 = r9.size()     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x000e
            goto L_0x00c5
        L_0x000e:
            t0.b$a r2 = r8.f10446a     // Catch:{ Exception -> 0x00ac }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r3 = r9.get(r1)     // Catch:{ Exception -> 0x00ac }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x00ac }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x00ac }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ Exception -> 0x00ac }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00ac }
            r4 = 1
            int r3 = r3 + r4
            int r5 = r9.size()     // Catch:{ Exception -> 0x00ac }
            int r3 = r3 * r5
            int r3 = r3 + 16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r3 = "_id"
            r5.append(r3)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r3 = " in ("
            r5.append(r3)     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r3 = r9.get(r1)     // Catch:{ Exception -> 0x00ac }
            r5.append(r3)     // Catch:{ Exception -> 0x00ac }
            int r3 = r9.size()     // Catch:{ Exception -> 0x00ac }
            r6 = r4
        L_0x004a:
            if (r6 >= r3) goto L_0x005b
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x00ac }
            r5.append(r7)     // Catch:{ Exception -> 0x00ac }
            int r6 = r6 + 1
            goto L_0x004a
        L_0x005b:
            java.lang.String r9 = ")"
            r5.append(r9)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r9 = "events"
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00ac }
            r5 = 0
            int r9 = r2.delete(r9, r3, r5)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r2 = "EventManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
            r3.<init>()     // Catch:{ Exception -> 0x00ac }
            java.lang.String r5 = "deleted events count "
            r3.append(r5)     // Catch:{ Exception -> 0x00ac }
            r3.append(r9)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ac }
            p140y0.C2933s.m12141c(r2, r3)     // Catch:{ Exception -> 0x00ac }
            t0.b r2 = m11160d()     // Catch:{ Exception -> 0x00ac }
            long r2 = r2.mo9927m()     // Catch:{ Exception -> 0x00ac }
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r4 = r1
        L_0x0091:
            p110s0.C2647i.m11144b(r4)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r4 = "EventManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
            r5.<init>()     // Catch:{ Exception -> 0x00ac }
            java.lang.String r6 = "after delete DB record remains="
            r5.append(r6)     // Catch:{ Exception -> 0x00ac }
            r5.append(r2)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00ac }
            p140y0.C2933s.m12141c(r4, r2)     // Catch:{ Exception -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r9
        L_0x00ac:
            r9 = move-exception
            java.lang.String r2 = "EventManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "e="
            r3.append(r4)     // Catch:{ all -> 0x00c7 }
            r3.append(r9)     // Catch:{ all -> 0x00c7 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x00c7 }
            p140y0.C2933s.m12144f(r2, r9)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r1
        L_0x00c5:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r1
        L_0x00c7:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2666b.mo9923a(java.util.ArrayList):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        if (r3 != null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        if (r3 != null) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p115t0.C2671f mo9924e(int r22) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r2 = "EventManager"
            r6 = 0
            r11 = 0
            r12 = r21
            t0.b$a r0 = r12.f10446a     // Catch:{ SQLiteBlobTooBigException -> 0x0110, Exception -> 0x0103, all -> 0x0101 }
            android.database.sqlite.SQLiteDatabase r3 = r0.getReadableDatabase()     // Catch:{ SQLiteBlobTooBigException -> 0x0110, Exception -> 0x0103, all -> 0x0101 }
            java.lang.String r4 = "events"
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "priority ASC, _id ASC"
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteBlobTooBigException -> 0x0110, Exception -> 0x0103, all -> 0x0101 }
            java.lang.String r0 = "_id"
            int r4 = r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "appid"
            int r5 = r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "package"
            r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "event_name"
            r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "priority"
            int r6 = r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "data"
            int r7 = r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = "timestamp"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r9.<init>()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r10.<init>()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r0 = 1
            r15 = 0
            r16 = 0
        L_0x0050:
            boolean r17 = r3.moveToNext()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r17 == 0) goto L_0x00d9
            long r17 = r3.getLong(r4)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r3.getLong(r8)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r3.getString(r5)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            byte[] r19 = r3.getBlob(r7)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r19 == 0) goto L_0x006d
            java.lang.String r19 = m11158b(r19)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r13 = r19
            goto L_0x006e
        L_0x006d:
            r13 = r11
        L_0x006e:
            if (r0 == 0) goto L_0x0099
            int r0 = r3.getInt(r6)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r0 <= r1) goto L_0x0096
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r4.<init>()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r5 = "No records of priority["
            r4.append(r5)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r4.append(r1)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r1 = "], first record priority="
            r4.append(r1)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r4.append(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = r4.toString()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            p140y0.C2933s.m12141c(r2, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r3.close()
            return r11
        L_0x0096:
            r20 = 0
            goto L_0x009b
        L_0x0099:
            r20 = r0
        L_0x009b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r0.<init>(r13)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r9.put(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x00ad }
            r10.add(r0)     // Catch:{ Exception -> 0x00ad }
            int r15 = r15 + 1
            goto L_0x00b3
        L_0x00ad:
            r0 = move-exception
            java.lang.String r14 = "*** error ***"
            p140y0.C2933s.m12145g(r2, r14, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
        L_0x00b3:
            int r0 = r13.length()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            int r0 = r16 + r0
            r13 = 307200(0x4b000, float:4.30479E-40)
            if (r0 < r13) goto L_0x00d3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r4.<init>()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r5 = "reached max len: "
            r4.append(r5)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r4.append(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r0 = r4.toString()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            p140y0.C2933s.m12141c(r2, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            goto L_0x00d9
        L_0x00d3:
            r16 = r0
            r0 = r20
            goto L_0x0050
        L_0x00d9:
            int r0 = r10.size()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r0 <= 0) goto L_0x010c
            boolean r0 = r3.isAfterLast()     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "cursor isAfterLast"
            p140y0.C2933s.m12141c(r2, r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
        L_0x00ea:
            r13 = 1
            goto L_0x00f4
        L_0x00ec:
            int r0 = r3.getInt(r6)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            if (r0 <= r1) goto L_0x00f3
            goto L_0x00ea
        L_0x00f3:
            r13 = 0
        L_0x00f4:
            t0.f r0 = new t0.f     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r0.<init>(r9, r15, r10, r13)     // Catch:{ SQLiteBlobTooBigException -> 0x00ff, Exception -> 0x00fd }
            r3.close()
            return r0
        L_0x00fd:
            r0 = move-exception
            goto L_0x0105
        L_0x00ff:
            r0 = move-exception
            goto L_0x0112
        L_0x0101:
            r0 = move-exception
            goto L_0x0120
        L_0x0103:
            r0 = move-exception
            r3 = r11
        L_0x0105:
            java.lang.String r1 = ""
            p140y0.C2933s.m12143e(r2, r1, r0)     // Catch:{ all -> 0x011e }
            if (r3 == 0) goto L_0x011d
        L_0x010c:
            r3.close()
            goto L_0x011d
        L_0x0110:
            r0 = move-exception
            r3 = r11
        L_0x0112:
            java.lang.String r1 = "blob too big ***"
            p140y0.C2933s.m12145g(r2, r1, r0)     // Catch:{ all -> 0x011e }
            r21.m11166n()     // Catch:{ all -> 0x011e }
            if (r3 == 0) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            return r11
        L_0x011e:
            r0 = move-exception
            r11 = r3
        L_0x0120:
            if (r11 == 0) goto L_0x0125
            r11.close()
        L_0x0125:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2666b.mo9924e(int):t0.f");
    }

    /* renamed from: h */
    public synchronized void mo9925h(C2875b bVar) {
        C2665a.m11157b(new C2669d(this, bVar));
    }

    /* renamed from: j */
    public void mo9926j() {
        C2665a.m11157b(new C2670e(this));
    }

    /* renamed from: m */
    public long mo9927m() {
        return DatabaseUtils.queryNumEntries(this.f10446a.getReadableDatabase(), "events");
    }
}
