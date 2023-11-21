package p031e3;

import android.util.Log;
import java.io.File;

/* renamed from: e3.a */
public class C1542a implements C1544c {

    /* renamed from: a */
    private int f6194a = 1;

    /* renamed from: b */
    private long f6195b = 1048576;

    /* renamed from: a */
    public String mo5662a(C1543b bVar) {
        if (bVar.mo5585e() < this.f6195b) {
            return null;
        }
        File d = bVar.mo5584d();
        Log.d("FileRolloverStrategy", "Start to rollover");
        String str = d.getPath() + '.';
        for (int i = this.f6194a - 1; i > 0; i--) {
            File file = new File(str + i);
            if (file.exists()) {
                file.renameTo(new File(str + (i + 1)));
            }
        }
        d.renameTo(new File(str + 1));
        Log.d("FileRolloverStrategy", "Rollover done");
        return d.getPath();
    }

    /* renamed from: b */
    public void mo5663b(int i) {
        if (i >= 1) {
            this.f6194a = i;
            return;
        }
        throw new IllegalArgumentException("index can't be less than 1: " + i);
    }

    /* renamed from: c */
    public void mo5664c(int i) {
        if (i >= 1) {
            this.f6195b = (long) i;
            return;
        }
        throw new IllegalArgumentException("size can't be less than 1: " + i);
    }
}
