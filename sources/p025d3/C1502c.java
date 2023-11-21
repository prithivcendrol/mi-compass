package p025d3;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* renamed from: d3.c */
public class C1502c {

    /* renamed from: a */
    protected String f6123a;

    /* renamed from: b */
    protected String f6124b;

    /* renamed from: c */
    protected File f6125c;

    /* renamed from: d */
    private FileOutputStream f6126d;

    /* renamed from: e */
    private OutputStreamWriter f6127e;

    /* renamed from: f */
    private long f6128f;

    /* renamed from: g */
    private long f6129g;

    /* renamed from: h */
    private int f6130h;

    /* renamed from: i */
    private long f6131i;

    public C1502c(String str, String str2) {
        this.f6123a = str;
        this.f6124b = str2;
    }

    /* renamed from: b */
    public static void m6526b(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private void m6527c(String str) {
        this.f6127e.write(str);
        this.f6127e.flush();
        this.f6131i += (long) str.length();
    }

    /* renamed from: h */
    private void m6528h() {
        if (this.f6130h >= 10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f6129g > 30000) {
                this.f6129g = elapsedRealtime;
            } else {
                return;
            }
        }
        this.f6130h++;
        File g = mo5587g();
        this.f6125c = g;
        if (g != null) {
            try {
                this.f6126d = new FileOutputStream(this.f6125c, true);
                this.f6127e = new OutputStreamWriter(this.f6126d);
                this.f6130h = 0;
                this.f6131i = this.f6125c.length();
            } catch (FileNotFoundException e) {
                Log.e("FileManager", "Fail to create writer: " + this.f6125c.getPath(), e);
            }
        }
    }

    /* renamed from: i */
    private void m6529i() {
        mo5583a();
        m6528h();
    }

    /* renamed from: a */
    public synchronized void mo5583a() {
        this.f6125c = null;
        this.f6130h = 0;
        this.f6126d = null;
        m6526b(this.f6127e);
        this.f6127e = null;
        this.f6131i = 0;
    }

    /* renamed from: d */
    public File mo5584d() {
        return this.f6125c;
    }

    /* renamed from: e */
    public long mo5585e() {
        return this.f6131i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo5586f() {
        return this.f6123a + "/" + this.f6124b + ".log";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public File mo5587g() {
        String f = mo5586f();
        if (f == null) {
            Log.e("FileManager", "Fail to build log path");
            return null;
        }
        File file = new File(f);
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            if (!parentFile.isDirectory()) {
                Log.e("FileManager", "LogDir is not a directory: " + parentFile.getPath());
                return null;
            }
        } else if (!parentFile.mkdirs() && !parentFile.exists()) {
            Log.e("FileManager", "Fail to create directory: " + parentFile.getPath());
            return null;
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile() && !file.exists()) {
                    Log.e("FileManager", "Fail to create LogFile: " + f);
                    return null;
                }
            } catch (IOException e) {
                Log.e("FileManager", "Fail to create LogFile: " + f, e);
                return null;
            }
        } else if (!file.isFile()) {
            Log.e("FileManager", "LogFile is not a file: " + f);
            return null;
        }
        return file;
    }

    /* renamed from: j */
    public synchronized void mo5588j(String str) {
        String str2;
        String str3;
        OutputStreamWriter outputStreamWriter = this.f6127e;
        if (outputStreamWriter == null) {
            m6528h();
        } else if (outputStreamWriter != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f6128f > 1000) {
                this.f6128f = elapsedRealtime;
                if (!this.f6125c.exists()) {
                    Log.d("FileManager", "Repair writer for log file is missing");
                    m6529i();
                }
            }
        }
        if (this.f6127e == null) {
            str2 = "FileManager";
            str3 = "Fail to append log for writer is null";
        } else {
            try {
                m6527c(str);
            } catch (IOException e) {
                Log.w("FileManager", "Retry to write log", e);
                m6529i();
                if (this.f6127e == null) {
                    str2 = "FileManager";
                    str3 = "Fail to append log for writer is null when retry";
                } else {
                    try {
                        m6527c(str);
                    } catch (IOException e2) {
                        Log.e("FileManager", "Fail to append log for writer is null when retry", e2);
                    }
                }
            }
        }
        Log.e(str2, str3);
        return;
    }
}
