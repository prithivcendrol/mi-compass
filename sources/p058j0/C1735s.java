package p058j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j0.s */
public class C1735s {

    /* renamed from: a */
    public final Map<String, Object> f6713a = new HashMap();

    /* renamed from: b */
    public View f6714b;

    /* renamed from: c */
    final ArrayList<C1710l> f6715c = new ArrayList<>();

    @Deprecated
    public C1735s() {
    }

    public C1735s(View view) {
        this.f6714b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1735s)) {
            return false;
        }
        C1735s sVar = (C1735s) obj;
        return this.f6714b == sVar.f6714b && this.f6713a.equals(sVar.f6713a);
    }

    public int hashCode() {
        return (this.f6714b.hashCode() * 31) + this.f6713a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6714b + "\n") + "    values:";
        for (String next : this.f6713a.keySet()) {
            str = str + "    " + next + ": " + this.f6713a.get(next) + "\n";
        }
        return str;
    }
}
