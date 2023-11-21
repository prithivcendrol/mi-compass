package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0510a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.o */
public final class C0508o implements Iterable<Intent> {

    /* renamed from: d */
    private final ArrayList<Intent> f2491d = new ArrayList<>();

    /* renamed from: e */
    private final Context f2492e;

    /* renamed from: androidx.core.app.o$a */
    public interface C0509a {
        /* renamed from: C */
        Intent mo420C();
    }

    private C0508o(Context context) {
        this.f2492e = context;
    }

    /* renamed from: d */
    public static C0508o m2113d(Context context) {
        return new C0508o(context);
    }

    /* renamed from: a */
    public C0508o mo2562a(Intent intent) {
        this.f2491d.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0508o mo2563b(Activity activity) {
        Intent C = activity instanceof C0509a ? ((C0509a) activity).mo420C() : null;
        if (C == null) {
            C = C0501i.m2097a(activity);
        }
        if (C != null) {
            ComponentName component = C.getComponent();
            if (component == null) {
                component = C.resolveActivity(this.f2492e.getPackageManager());
            }
            mo2564c(component);
            mo2562a(C);
        }
        return this;
    }

    /* renamed from: c */
    public C0508o mo2564c(ComponentName componentName) {
        int size = this.f2491d.size();
        try {
            Context context = this.f2492e;
            while (true) {
                Intent b = C0501i.m2098b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f2491d.add(size, b);
                context = this.f2492e;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public void mo2565e() {
        mo2566f((Bundle) null);
    }

    /* renamed from: f */
    public void mo2566f(Bundle bundle) {
        if (!this.f2491d.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2491d.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0510a.m2125f(this.f2492e, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2492e.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2491d.iterator();
    }
}
