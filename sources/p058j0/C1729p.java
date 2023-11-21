package p058j0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p058j0.C1710l;

/* renamed from: j0.p */
public class C1729p extends C1710l {

    /* renamed from: L */
    private ArrayList<C1710l> f6702L = new ArrayList<>();

    /* renamed from: M */
    private boolean f6703M = true;

    /* renamed from: N */
    int f6704N;

    /* renamed from: O */
    boolean f6705O = false;

    /* renamed from: P */
    private int f6706P = 0;

    /* renamed from: j0.p$a */
    class C1730a extends C1718m {

        /* renamed from: d */
        final /* synthetic */ C1710l f6707d;

        C1730a(C1710l lVar) {
            this.f6707d = lVar;
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            this.f6707d.mo5933T();
            lVar.mo5930P(this);
        }
    }

    /* renamed from: j0.p$b */
    static class C1731b extends C1718m {

        /* renamed from: d */
        C1729p f6709d;

        C1731b(C1729p pVar) {
            this.f6709d = pVar;
        }

        /* renamed from: a */
        public void mo5913a(C1710l lVar) {
            C1729p pVar = this.f6709d;
            if (!pVar.f6705O) {
                pVar.mo5941a0();
                this.f6709d.f6705O = true;
            }
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            C1729p pVar = this.f6709d;
            int i = pVar.f6704N - 1;
            pVar.f6704N = i;
            if (i == 0) {
                pVar.f6705O = false;
                pVar.mo5952p();
            }
            lVar.mo5930P(this);
        }
    }

    /* renamed from: f0 */
    private void m7218f0(C1710l lVar) {
        this.f6702L.add(lVar);
        lVar.f6660u = this;
    }

    /* renamed from: o0 */
    private void m7219o0() {
        C1731b bVar = new C1731b(this);
        Iterator<C1710l> it = this.f6702L.iterator();
        while (it.hasNext()) {
            it.next().mo5940a(bVar);
        }
        this.f6704N = this.f6702L.size();
    }

    /* renamed from: N */
    public void mo5928N(View view) {
        super.mo5928N(view);
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5928N(view);
        }
    }

    /* renamed from: R */
    public void mo5932R(View view) {
        super.mo5932R(view);
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5932R(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo5933T() {
        if (this.f6702L.isEmpty()) {
            mo5941a0();
            mo5952p();
            return;
        }
        m7219o0();
        if (!this.f6703M) {
            for (int i = 1; i < this.f6702L.size(); i++) {
                this.f6702L.get(i - 1).mo5940a(new C1730a(this.f6702L.get(i)));
            }
            C1710l lVar = this.f6702L.get(0);
            if (lVar != null) {
                lVar.mo5933T();
                return;
            }
            return;
        }
        Iterator<C1710l> it = this.f6702L.iterator();
        while (it.hasNext()) {
            it.next().mo5933T();
        }
    }

    /* renamed from: V */
    public void mo5935V(C1710l.C1715e eVar) {
        super.mo5935V(eVar);
        this.f6706P |= 8;
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5935V(eVar);
        }
    }

    /* renamed from: X */
    public void mo5937X(C1700g gVar) {
        super.mo5937X(gVar);
        this.f6706P |= 4;
        if (this.f6702L != null) {
            for (int i = 0; i < this.f6702L.size(); i++) {
                this.f6702L.get(i).mo5937X(gVar);
            }
        }
    }

    /* renamed from: Y */
    public void mo5938Y(C1727o oVar) {
        super.mo5938Y(oVar);
        this.f6706P |= 2;
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5938Y(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public String mo5943b0(String str) {
        String b0 = super.mo5943b0(str);
        for (int i = 0; i < this.f6702L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(b0);
            sb.append("\n");
            sb.append(this.f6702L.get(i).mo5943b0(str + "  "));
            b0 = sb.toString();
        }
        return b0;
    }

    /* renamed from: c0 */
    public C1729p mo5940a(C1710l.C1716f fVar) {
        return (C1729p) super.mo5940a(fVar);
    }

    /* renamed from: d0 */
    public C1729p mo5942b(View view) {
        for (int i = 0; i < this.f6702L.size(); i++) {
            this.f6702L.get(i).mo5942b(view);
        }
        return (C1729p) super.mo5942b(view);
    }

    /* renamed from: e0 */
    public C1729p mo5982e0(C1710l lVar) {
        m7218f0(lVar);
        long j = this.f6645f;
        if (j >= 0) {
            lVar.mo5934U(j);
        }
        if ((this.f6706P & 1) != 0) {
            lVar.mo5936W(mo5955s());
        }
        if ((this.f6706P & 2) != 0) {
            mo5960w();
            lVar.mo5938Y((C1727o) null);
        }
        if ((this.f6706P & 4) != 0) {
            lVar.mo5937X(mo5959v());
        }
        if ((this.f6706P & 8) != 0) {
            lVar.mo5935V(mo5954r());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo5946f() {
        super.mo5946f();
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5946f();
        }
    }

    /* renamed from: g */
    public void mo5868g(C1735s sVar) {
        if (mo5927G(sVar.f6714b)) {
            Iterator<C1710l> it = this.f6702L.iterator();
            while (it.hasNext()) {
                C1710l next = it.next();
                if (next.mo5927G(sVar.f6714b)) {
                    next.mo5868g(sVar);
                    sVar.f6715c.add(next);
                }
            }
        }
    }

    /* renamed from: g0 */
    public C1710l mo5983g0(int i) {
        if (i < 0 || i >= this.f6702L.size()) {
            return null;
        }
        return this.f6702L.get(i);
    }

    /* renamed from: h0 */
    public int mo5984h0() {
        return this.f6702L.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5947i(C1735s sVar) {
        super.mo5947i(sVar);
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            this.f6702L.get(i).mo5947i(sVar);
        }
    }

    /* renamed from: i0 */
    public C1729p mo5930P(C1710l.C1716f fVar) {
        return (C1729p) super.mo5930P(fVar);
    }

    /* renamed from: j */
    public void mo5869j(C1735s sVar) {
        if (mo5927G(sVar.f6714b)) {
            Iterator<C1710l> it = this.f6702L.iterator();
            while (it.hasNext()) {
                C1710l next = it.next();
                if (next.mo5927G(sVar.f6714b)) {
                    next.mo5869j(sVar);
                    sVar.f6715c.add(next);
                }
            }
        }
    }

    /* renamed from: j0 */
    public C1729p mo5931Q(View view) {
        for (int i = 0; i < this.f6702L.size(); i++) {
            this.f6702L.get(i).mo5931Q(view);
        }
        return (C1729p) super.mo5931Q(view);
    }

    /* renamed from: k0 */
    public C1729p mo5934U(long j) {
        ArrayList<C1710l> arrayList;
        super.mo5934U(j);
        if (this.f6645f >= 0 && (arrayList = this.f6702L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6702L.get(i).mo5934U(j);
            }
        }
        return this;
    }

    /* renamed from: l0 */
    public C1729p mo5936W(TimeInterpolator timeInterpolator) {
        this.f6706P |= 1;
        ArrayList<C1710l> arrayList = this.f6702L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6702L.get(i).mo5936W(timeInterpolator);
            }
        }
        return (C1729p) super.mo5936W(timeInterpolator);
    }

    /* renamed from: m */
    public C1710l clone() {
        C1729p pVar = (C1729p) super.clone();
        pVar.f6702L = new ArrayList<>();
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            pVar.m7218f0(this.f6702L.get(i).clone());
        }
        return pVar;
    }

    /* renamed from: m0 */
    public C1729p mo5989m0(int i) {
        if (i == 0) {
            this.f6703M = true;
        } else if (i == 1) {
            this.f6703M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: n0 */
    public C1729p mo5939Z(long j) {
        return (C1729p) super.mo5939Z(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5951o(ViewGroup viewGroup, C1736t tVar, C1736t tVar2, ArrayList<C1735s> arrayList, ArrayList<C1735s> arrayList2) {
        long y = mo5961y();
        int size = this.f6702L.size();
        for (int i = 0; i < size; i++) {
            C1710l lVar = this.f6702L.get(i);
            if (y > 0 && (this.f6703M || i == 0)) {
                long y2 = lVar.mo5961y();
                if (y2 > 0) {
                    lVar.mo5939Z(y2 + y);
                } else {
                    lVar.mo5939Z(y);
                }
            }
            lVar.mo5951o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
