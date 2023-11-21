package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.C2252h;

/* renamed from: miuix.appcompat.internal.view.menu.a */
public abstract class C2217a implements C2250g {

    /* renamed from: d */
    protected Context f8366d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public Context f8367e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public C2242c f8368f;

    /* renamed from: g */
    protected LayoutInflater f8369g;

    /* renamed from: h */
    protected LayoutInflater f8370h;

    /* renamed from: i */
    private C2250g.C2251a f8371i;

    /* renamed from: j */
    private int f8372j;

    /* renamed from: k */
    private int f8373k;
    /* access modifiers changed from: protected */

    /* renamed from: l */
    public C2252h f8374l;

    /* renamed from: m */
    private int f8375m;

    public C2217a(Context context, int i, int i2) {
        this.f8366d = context;
        this.f8369g = LayoutInflater.from(context);
        this.f8372j = i;
        this.f8373k = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public static void m9241j(C2242c cVar, boolean z) {
        cVar.mo8379e(z);
    }

    /* renamed from: l */
    protected static C2247e m9242l(C2242c cVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C2247e(cVar, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: m */
    protected static boolean m9243m(C2242c cVar, C2242c cVar2, MenuItem menuItem) {
        return cVar.mo8382g(cVar2, menuItem);
    }

    /* renamed from: p */
    protected static void m9244p(C2242c cVar, boolean z) {
        cVar.mo8345H(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8212a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f8374l).addView(view, i);
    }

    /* renamed from: b */
    public void mo8003b(boolean z) {
        C2252h hVar = this.f8374l;
        ViewGroup viewGroup = (ViewGroup) hVar;
        if (viewGroup != null) {
            int a = hVar.mo8193a();
            C2242c cVar = this.f8368f;
            if (cVar != null) {
                cVar.mo8394q();
                Iterator<C2247e> it = this.f8368f.mo8340C().iterator();
                while (it.hasNext()) {
                    C2247e next = it.next();
                    if (mo8219s(a, next)) {
                        View childAt = viewGroup.getChildAt(a);
                        C2247e itemData = childAt instanceof C2252h.C2253a ? ((C2252h.C2253a) childAt).getItemData() : null;
                        View n = mo8215n(next, childAt, viewGroup);
                        if (next != itemData) {
                            n.setPressed(false);
                        }
                        if (n != childAt) {
                            mo8212a(n, a);
                        }
                        if (next != null) {
                            next.mo8483x(n);
                        }
                        a++;
                    }
                }
            }
            while (a < viewGroup.getChildCount()) {
                if (!this.f8374l.mo8195d(a)) {
                    a++;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo8005d(C2242c cVar, boolean z) {
        C2250g.C2251a aVar = this.f8371i;
        if (aVar != null) {
            aVar.mo7408d(cVar, z);
        }
    }

    /* renamed from: e */
    public boolean mo8006e(C2254i iVar) {
        C2250g.C2251a aVar = this.f8371i;
        return aVar != null && aVar.mo7409e(iVar);
    }

    /* renamed from: f */
    public abstract void mo8213f(C2247e eVar, C2252h.C2253a aVar);

    /* renamed from: g */
    public boolean mo8007g(C2242c cVar, C2247e eVar) {
        return false;
    }

    /* renamed from: h */
    public void mo8008h(Context context, C2242c cVar) {
        this.f8367e = context;
        this.f8370h = LayoutInflater.from(context);
        this.f8368f = cVar;
    }

    /* renamed from: i */
    public boolean mo8009i(C2242c cVar, C2247e eVar) {
        return false;
    }

    /* renamed from: k */
    public C2252h.C2253a mo8214k(ViewGroup viewGroup) {
        return (C2252h.C2253a) this.f8369g.inflate(this.f8373k, viewGroup, false);
    }

    /* renamed from: n */
    public View mo8215n(C2247e eVar, View view, ViewGroup viewGroup) {
        C2252h.C2253a k = view instanceof C2252h.C2253a ? (C2252h.C2253a) view : mo8214k(viewGroup);
        mo8213f(eVar, k);
        return (View) k;
    }

    /* renamed from: o */
    public C2252h mo8216o(ViewGroup viewGroup) {
        if (this.f8374l == null) {
            C2252h hVar = (C2252h) this.f8369g.inflate(this.f8372j, viewGroup, false);
            this.f8374l = hVar;
            hVar.mo8194c(this.f8368f);
            mo8003b(true);
        }
        return this.f8374l;
    }

    /* renamed from: q */
    public void mo8217q(C2250g.C2251a aVar) {
        this.f8371i = aVar;
    }

    /* renamed from: r */
    public void mo8218r(int i) {
        this.f8375m = i;
    }

    /* renamed from: s */
    public abstract boolean mo8219s(int i, C2247e eVar);
}
