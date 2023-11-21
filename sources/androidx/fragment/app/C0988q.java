package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.q */
class C0988q implements LayoutInflater.Factory2 {

    /* renamed from: d */
    final FragmentManager f3363d;

    /* renamed from: androidx.fragment.app.q$a */
    class C0989a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ C0938d0 f3364d;

        C0989a(C0938d0 d0Var) {
            this.f3364d = d0Var;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f3364d.mo3503k();
            this.f3364d.mo3504m();
            C0972l0.m4042n((ViewGroup) k.f3001L.getParent(), C0988q.this.f3363d).mo3638j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    C0988q(FragmentManager fragmentManager) {
        this.f3363d = fragmentManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            java.lang.Class<androidx.fragment.app.m> r0 = androidx.fragment.app.C0981m.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.m r9 = new androidx.fragment.app.m
            androidx.fragment.app.FragmentManager r10 = r8.f3363d
            r9.<init>(r11, r12, r10)
            return r9
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r10 = r0.equals(r10)
            r0 = 0
            if (r10 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r0, r10)
            int[] r1 = p001a0.C0010c.f17a
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1)
            if (r10 != 0) goto L_0x0032
            int r10 = p001a0.C0010c.f18b
            java.lang.String r10 = r1.getString(r10)
        L_0x0032:
            int r2 = p001a0.C0010c.f19c
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = p001a0.C0010c.f20d
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r10 == 0) goto L_0x01c5
            java.lang.ClassLoader r1 = r11.getClassLoader()
            boolean r1 = androidx.fragment.app.C0986o.m4091b(r1, r10)
            if (r1 != 0) goto L_0x0050
            goto L_0x01c5
        L_0x0050:
            if (r9 == 0) goto L_0x0057
            int r1 = r9.getId()
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 != r3) goto L_0x007d
            if (r2 != r3) goto L_0x007d
            if (r4 == 0) goto L_0x005f
            goto L_0x007d
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x007d:
            if (r2 == r3) goto L_0x0085
            androidx.fragment.app.FragmentManager r0 = r8.f3363d
            androidx.fragment.app.Fragment r0 = r0.mo3378h0(r2)
        L_0x0085:
            if (r0 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            androidx.fragment.app.FragmentManager r0 = r8.f3363d
            androidx.fragment.app.Fragment r0 = r0.mo3380i0(r4)
        L_0x008f:
            if (r0 != 0) goto L_0x0099
            if (r1 == r3) goto L_0x0099
            androidx.fragment.app.FragmentManager r0 = r8.f3363d
            androidx.fragment.app.Fragment r0 = r0.mo3378h0(r1)
        L_0x0099:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L_0x0102
            androidx.fragment.app.FragmentManager r0 = r8.f3363d
            androidx.fragment.app.o r0 = r0.mo3397s0()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.mo3412a(r11, r10)
            r0.f3034r = r7
            if (r2 == 0) goto L_0x00b5
            r11 = r2
            goto L_0x00b6
        L_0x00b5:
            r11 = r1
        L_0x00b6:
            r0.f2990A = r11
            r0.f2991B = r1
            r0.f2992C = r4
            r0.f3035s = r7
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            r0.f3039w = r11
            androidx.fragment.app.p r11 = r11.mo3401u0()
            r0.f3040x = r11
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            androidx.fragment.app.p r11 = r11.mo3401u0()
            android.content.Context r11 = r11.mo3692j()
            android.os.Bundle r1 = r0.f3021e
            r0.mo3231N0(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            androidx.fragment.app.d0 r11 = r11.mo3382j(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m3651H0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
        L_0x00f0:
            r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
            goto L_0x013d
        L_0x0102:
            boolean r11 = r0.f3035s
            if (r11 != 0) goto L_0x0187
            r0.f3035s = r7
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            r0.f3039w = r11
            androidx.fragment.app.p r11 = r11.mo3401u0()
            r0.f3040x = r11
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            androidx.fragment.app.p r11 = r11.mo3401u0()
            android.content.Context r11 = r11.mo3692j()
            android.os.Bundle r1 = r0.f3021e
            r0.mo3231N0(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.f3363d
            androidx.fragment.app.d0 r11 = r11.mo3403w(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m3651H0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Retained Fragment "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x00f0
        L_0x013d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            p010b0.C1285d.m5926i(r0, r9)
            r0.f3000K = r9
            r11.mo3504m()
            r11.mo3502j()
            android.view.View r9 = r0.f3001L
            if (r9 == 0) goto L_0x016d
            if (r2 == 0) goto L_0x0153
            r9.setId(r2)
        L_0x0153:
            android.view.View r9 = r0.f3001L
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L_0x0160
            android.view.View r9 = r0.f3001L
            r9.setTag(r4)
        L_0x0160:
            android.view.View r9 = r0.f3001L
            androidx.fragment.app.q$a r10 = new androidx.fragment.app.q$a
            r10.<init>(r11)
            r9.addOnAttachStateChangeListener(r10)
            android.view.View r9 = r0.f3001L
            return r9
        L_0x016d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r10 = " did not create a view."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0187:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r2)
            r11.append(r12)
            java.lang.String r12 = ", tag "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = ", or parent id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r1)
            r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x01c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0988q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
