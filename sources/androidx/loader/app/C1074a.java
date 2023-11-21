package androidx.loader.app;

import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1048m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
public abstract class C1074a {
    /* renamed from: b */
    public static <T extends C1048m & C1039g0> C1074a m4300b(T t) {
        return new C1075b(t, ((C1039g0) t).mo243H());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo3839a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo3840c();
}
