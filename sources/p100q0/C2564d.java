package p100q0;

import java.io.File;
import java.util.Comparator;

/* renamed from: q0.d */
class C2564d implements Comparator<File> {

    /* renamed from: a */
    final /* synthetic */ C2565e f10082a;

    C2564d(C2565e eVar) {
        this.f10082a = eVar;
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }
}
