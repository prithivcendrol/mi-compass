package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0232n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0203b implements C0230m {

    /* renamed from: d */
    protected Context f685d;

    /* renamed from: e */
    protected Context f686e;

    /* renamed from: f */
    protected C0214g f687f;

    /* renamed from: g */
    protected LayoutInflater f688g;

    /* renamed from: h */
    protected LayoutInflater f689h;

    /* renamed from: i */
    private C0230m.C0231a f690i;

    /* renamed from: j */
    private int f691j;

    /* renamed from: k */
    private int f692k;

    /* renamed from: l */
    protected C0232n f693l;

    /* renamed from: m */
    private int f694m;

    public C0203b(Context context, int i, int i2) {
        this.f685d = context;
        this.f688g = LayoutInflater.from(context);
        this.f691j = i;
        this.f692k = i2;
    }

    /* renamed from: a */
    public void mo797a(C0214g gVar, boolean z) {
        C0230m.C0231a aVar = this.f690i;
        if (aVar != null) {
            aVar.mo527a(gVar, z);
        }
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f693l;
        if (viewGroup != null) {
            C0214g gVar = this.f687f;
            int i = 0;
            if (gVar != null) {
                gVar.mo917r();
                ArrayList<C0218i> E = this.f687f.mo863E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0218i iVar = E.get(i3);
                    if (mo812q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0218i itemData = childAt instanceof C0232n.C0233a ? ((C0232n.C0233a) childAt).getItemData() : null;
                        View n = mo809n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            mo804i(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo807l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo799d(Context context, C0214g gVar) {
        this.f686e = context;
        this.f689h = LayoutInflater.from(context);
        this.f687f = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo800e(androidx.appcompat.view.menu.C0239r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f690i
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f687f
        L_0x0009:
            boolean r2 = r0.mo528b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0203b.mo800e(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: f */
    public boolean mo801f(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo802g(C0214g gVar, C0218i iVar) {
        return false;
    }

    /* renamed from: h */
    public void mo803h(C0230m.C0231a aVar) {
        this.f690i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo804i(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f693l).addView(view, i);
    }

    /* renamed from: j */
    public abstract void mo805j(C0218i iVar, C0232n.C0233a aVar);

    /* renamed from: k */
    public C0232n.C0233a mo806k(ViewGroup viewGroup) {
        return (C0232n.C0233a) this.f688g.inflate(this.f692k, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo807l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public C0230m.C0231a mo808m() {
        return this.f690i;
    }

    /* renamed from: n */
    public View mo809n(C0218i iVar, View view, ViewGroup viewGroup) {
        C0232n.C0233a k = view instanceof C0232n.C0233a ? (C0232n.C0233a) view : mo806k(viewGroup);
        mo805j(iVar, k);
        return (View) k;
    }

    /* renamed from: o */
    public C0232n mo810o(ViewGroup viewGroup) {
        if (this.f693l == null) {
            C0232n nVar = (C0232n) this.f688g.inflate(this.f691j, viewGroup, false);
            this.f693l = nVar;
            nVar.mo724b(this.f687f);
            mo798b(true);
        }
        return this.f693l;
    }

    /* renamed from: p */
    public void mo811p(int i) {
        this.f694m = i;
    }

    /* renamed from: q */
    public abstract boolean mo812q(int i, C0218i iVar);
}
