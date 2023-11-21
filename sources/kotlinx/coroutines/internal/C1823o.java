package kotlinx.coroutines.internal;

import java.util.List;
import p121u1.C2776k1;

/* renamed from: kotlinx.coroutines.internal.o */
public interface C1823o {
    C2776k1 createDispatcher(List<? extends C1823o> list);

    int getLoadPriority();

    String hintOnError();
}
