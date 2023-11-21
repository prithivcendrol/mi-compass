package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1047l;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1056t;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0040b;
import p020c4.C1361a;
import p020c4.C1362b;
import p026d4.C1506a;
import p026d4.C1507b;
import p026d4.C1509c;
import p026d4.C1510d;
import p026d4.C1511e;
import p032e4.C1545a;
import p032e4.C1546b;
import p032e4.C1547c;
import p112s2.C2657a;

public abstract class BaseResponseStateManager extends C2380a {

    /* renamed from: d */
    protected C1361a f9183d;

    /* renamed from: e */
    protected ArrayMap<View, C2379c> f9184e;

    /* renamed from: f */
    protected ArrayMap<View, List<C1510d>> f9185f;

    /* renamed from: g */
    protected ArrayMap<Integer, C1510d> f9186g;

    /* renamed from: h */
    protected View f9187h;

    /* renamed from: i */
    protected ArrayMap<Integer, C1362b> f9188i;

    class ResponseLifecycleObserver implements C1047l {

        /* renamed from: d */
        private BaseResponseStateManager f9189d;

        public ResponseLifecycleObserver(BaseResponseStateManager baseResponseStateManager) {
            this.f9189d = baseResponseStateManager;
        }

        @C1056t(C1035g.C1037b.ON_CREATE)
        public void onCreate() {
        }

        @C1056t(C1035g.C1037b.ON_DESTROY)
        public void onDestroy() {
            this.f9189d.mo9056l();
            this.f9189d = null;
        }
    }

    /* renamed from: miuix.responsive.page.manager.BaseResponseStateManager$a */
    class C2377a extends C1545a {
        C2377a() {
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            BaseResponseStateManager.this.m10066p(context, view, attributeSet, str);
            return super.onCreateView(view, str, context, attributeSet);
        }
    }

    /* renamed from: miuix.responsive.page.manager.BaseResponseStateManager$b */
    class C2378b extends C1546b {
        C2378b() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (((ViewGroup) view).getChildCount() == 1) {
                BaseResponseStateManager.this.f9186g.get(Integer.valueOf(view.getId())).mo5617f(view);
            }
            List<C1510d> list = BaseResponseStateManager.this.f9185f.get(view);
            if (list != null && !list.isEmpty()) {
                for (C1510d dVar : list) {
                    if (dVar.mo5614c() == view2.getId()) {
                        dVar.mo5617f(view2);
                    }
                }
            }
            super.onChildViewAdded(view, view2);
        }
    }

    /* renamed from: miuix.responsive.page.manager.BaseResponseStateManager$c */
    class C2379c implements C1361a<View> {

        /* renamed from: d */
        private View f9193d;

        /* renamed from: e */
        private C1362b f9194e;

        public C2379c(View view) {
            this.f9193d = view;
        }

        /* renamed from: b */
        private void m10073b(Configuration configuration, C1511e eVar, boolean z) {
            List<C1510d> list = BaseResponseStateManager.this.f9185f.get(this.f9193d);
            C1362b bVar = this.f9194e;
            if (bVar == null || !bVar.mo5207b(configuration, eVar, z, list)) {
                int a = BaseResponseStateManager.this.f9186g.get(Integer.valueOf(this.f9193d.getId())).mo5612a();
                if (configuration == null) {
                    configuration = BaseResponseStateManager.this.mo7636c().getResources().getConfiguration();
                }
                int i = configuration.orientation;
                if (list != null && !list.isEmpty()) {
                    if (C1506a.m6539a(i, a)) {
                        for (C1510d d : list) {
                            d.mo5615d(eVar);
                        }
                        return;
                    }
                    for (C1510d b : list) {
                        View b2 = b.mo5613b();
                        if (b2 != null) {
                            b2.setVisibility(0);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5205a(Configuration configuration, C1511e eVar, boolean z) {
            m10073b(configuration, eVar, z);
        }

        /* renamed from: c */
        public View mo5204L() {
            return null;
        }
    }

    public BaseResponseStateManager(C1361a aVar) {
        this.f9183d = aVar;
        if (aVar.mo5204L() instanceof C1048m) {
            m10067q((C1048m) this.f9183d.mo5204L());
        }
        this.f9184e = new ArrayMap<>();
        this.f9185f = new ArrayMap<>();
        this.f9186g = new ArrayMap<>();
        this.f9188i = new ArrayMap<>();
        C1547c.m6666a(LayoutInflater.from(mo7636c()), new C2377a());
        this.f9198b = mo9062a();
    }

    /* renamed from: k */
    private void m10064k(View view) {
        this.f9184e.remove(view);
        this.f9184e.put(view, new C2379c(view));
        if (!this.f9186g.containsKey(Integer.valueOf(view.getId()))) {
            C1510d dVar = new C1510d(view.getId());
            dVar.mo5616e(3);
            this.f9186g.put(Integer.valueOf(view.getId()), dVar);
        }
    }

    /* renamed from: m */
    private void m10065m(ViewGroup viewGroup) {
        viewGroup.setOnHierarchyChangeListener(new C2378b());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m10066p(Context context, View view, AttributeSet attributeSet, String str) {
        int resourceId;
        if (this.f9187h == null) {
            this.f9187h = view;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2657a.f10336l);
        if (str.split("\\.").length > 1) {
            if (C1362b.class.isAssignableFrom(C0040b.m59a(str)) && (resourceId = obtainStyledAttributes.getResourceId(C2657a.f10337m, -1)) != -1) {
                this.f9188i.put(Integer.valueOf(resourceId), (Object) null);
            }
        }
        int integer = obtainStyledAttributes.getInteger(C2657a.f10338n, 0);
        if (integer != 0) {
            int resourceId2 = obtainStyledAttributes.getResourceId(C2657a.f10337m, -1);
            if (resourceId2 != -1) {
                C1510d dVar = new C1510d(resourceId2);
                dVar.mo5616e(integer);
                this.f9186g.put(Integer.valueOf(resourceId2), dVar);
            }
        } else {
            int integer2 = obtainStyledAttributes.getInteger(C2657a.f10339o, 0);
            if (integer2 != 0) {
                List list = this.f9185f.get(view);
                if (list == null) {
                    list = new ArrayList();
                    this.f9185f.put(view, list);
                    m10064k(view);
                    m10065m((ViewGroup) view);
                }
                int resourceId3 = obtainStyledAttributes.getResourceId(C2657a.f10337m, -1);
                if (resourceId3 != -1) {
                    list.add(new C1510d(resourceId3, integer2));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: q */
    private void m10067q(C1048m mVar) {
        mVar.mo252c().mo3790a(new ResponseLifecycleObserver(this));
    }

    /* renamed from: i */
    public void mo9054i(Configuration configuration) {
        if (C2380a.m10077e()) {
            this.f9198b = mo9063b(configuration);
            mo9065f(configuration);
            mo9057n(configuration, this.f9198b, !mo9064d(this.f9198b, this.f9197a));
        }
    }

    /* renamed from: j */
    public void mo9055j(Configuration configuration) {
        if (C2380a.m10077e()) {
            this.f9197a.mo5603l(this.f9198b);
            mo9066g(configuration);
        }
    }

    /* renamed from: l */
    public void mo9056l() {
        mo9058o();
        this.f9183d = null;
        this.f9184e.clear();
        this.f9185f.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo9057n(Configuration configuration, C1507b bVar, boolean z) {
        C1511e eVar = new C1511e();
        if (bVar != null) {
            bVar.mo5607p(eVar);
        }
        this.f9183d.mo5203D(configuration, eVar, z);
        for (View view : this.f9184e.keySet()) {
            C1361a aVar = this.f9184e.get(view);
            if (aVar != null) {
                aVar.mo5203D(configuration, eVar, z);
            }
        }
        for (Integer next : this.f9188i.keySet()) {
            C1362b bVar2 = this.f9188i.get(next);
            if (bVar2 == null) {
                bVar2 = (C1362b) this.f9187h.findViewById(next.intValue());
                this.f9188i.put(next, bVar2);
            }
            bVar2.mo5206a(configuration, eVar, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo9058o() {
        C1509c.m6557a().mo5611c(mo7636c());
    }
}
