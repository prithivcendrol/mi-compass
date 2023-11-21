package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.C1823o;
import p083n1.C2420e;
import p121u1.C2776k1;
import p126v1.C2866a;
import p126v1.C2868c;

public final class AndroidDispatcherFactory implements C1823o {
    public C2776k1 createDispatcher(List<? extends C1823o> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C2866a(C2868c.m11865a(mainLooper, true), (String) null, 2, (C2420e) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
