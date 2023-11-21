package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0463d {

    /* renamed from: a */
    private final ConstraintLayout f1838a;

    /* renamed from: b */
    C0466e f1839b;

    /* renamed from: c */
    int f1840c = -1;

    /* renamed from: d */
    int f1841d = -1;

    /* renamed from: e */
    private SparseArray<C0464a> f1842e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0466e> f1843f = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    static class C0464a {

        /* renamed from: a */
        int f1844a;

        /* renamed from: b */
        ArrayList<C0465b> f1845b = new ArrayList<>();

        /* renamed from: c */
        int f1846c = -1;

        /* renamed from: d */
        C0466e f1847d;

        public C0464a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0478j.f2174U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2182V6) {
                    this.f1844a = obtainStyledAttributes.getResourceId(index, this.f1844a);
                } else if (index == C0478j.f2190W6) {
                    this.f1846c = obtainStyledAttributes.getResourceId(index, this.f1846c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1846c);
                    context.getResources().getResourceName(this.f1846c);
                    if ("layout".equals(resourceTypeName)) {
                        C0466e eVar = new C0466e();
                        this.f1847d = eVar;
                        eVar.mo2501h(context, this.f1846c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2493a(C0465b bVar) {
            this.f1845b.add(bVar);
        }

        /* renamed from: b */
        public int mo2494b(float f, float f2) {
            for (int i = 0; i < this.f1845b.size(); i++) {
                if (this.f1845b.get(i).mo2495a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    static class C0465b {

        /* renamed from: a */
        float f1848a = Float.NaN;

        /* renamed from: b */
        float f1849b = Float.NaN;

        /* renamed from: c */
        float f1850c = Float.NaN;

        /* renamed from: d */
        float f1851d = Float.NaN;

        /* renamed from: e */
        int f1852e = -1;

        /* renamed from: f */
        C0466e f1853f;

        public C0465b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0478j.f2385s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2394t7) {
                    this.f1852e = obtainStyledAttributes.getResourceId(index, this.f1852e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1852e);
                    context.getResources().getResourceName(this.f1852e);
                    if ("layout".equals(resourceTypeName)) {
                        C0466e eVar = new C0466e();
                        this.f1853f = eVar;
                        eVar.mo2501h(context, this.f1852e);
                    }
                } else if (index == C0478j.f2403u7) {
                    this.f1851d = obtainStyledAttributes.getDimension(index, this.f1851d);
                } else if (index == C0478j.f2412v7) {
                    this.f1849b = obtainStyledAttributes.getDimension(index, this.f1849b);
                } else if (index == C0478j.f2421w7) {
                    this.f1850c = obtainStyledAttributes.getDimension(index, this.f1850c);
                } else if (index == C0478j.f2430x7) {
                    this.f1848a = obtainStyledAttributes.getDimension(index, this.f1848a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2495a(float f, float f2) {
            if (!Float.isNaN(this.f1848a) && f < this.f1848a) {
                return false;
            }
            if (!Float.isNaN(this.f1849b) && f2 < this.f1849b) {
                return false;
            }
            if (Float.isNaN(this.f1850c) || f <= this.f1850c) {
                return Float.isNaN(this.f1851d) || f2 <= this.f1851d;
            }
            return false;
        }
    }

    C0463d(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1838a = constraintLayout;
        m1993a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1993a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r7
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r3
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r6
            goto L_0x0058
        L_0x0057:
            r2 = r4
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.m1994b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.d$b r1 = new androidx.constraintlayout.widget.d$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.mo2493a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.d$a> r1 = r8.f1842e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f1844a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0463d.m1993a(android.content.Context, int):void");
    }

    /* renamed from: b */
    private void m1994b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0466e eVar = new C0466e();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.mo2509s(context, xmlPullParser);
                this.f1843f.put(i, eVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2491c(C0475g gVar) {
    }

    /* renamed from: d */
    public void mo2492d(int i, float f, float f2) {
        int b;
        int i2 = this.f1840c;
        if (i2 == i) {
            C0464a aVar = (C0464a) (i == -1 ? this.f1842e.valueAt(0) : this.f1842e.get(i2));
            int i3 = this.f1841d;
            if ((i3 == -1 || !aVar.f1845b.get(i3).mo2495a(f, f2)) && this.f1841d != (b = aVar.mo2494b(f, f2))) {
                C0466e eVar = b == -1 ? this.f1839b : aVar.f1845b.get(b).f1853f;
                if (b != -1) {
                    int i4 = aVar.f1845b.get(b).f1852e;
                }
                if (eVar != null) {
                    this.f1841d = b;
                    eVar.mo2496c(this.f1838a);
                    return;
                }
                return;
            }
            return;
        }
        this.f1840c = i;
        C0464a aVar2 = this.f1842e.get(i);
        int b2 = aVar2.mo2494b(f, f2);
        C0466e eVar2 = b2 == -1 ? aVar2.f1847d : aVar2.f1845b.get(b2).f1853f;
        if (b2 != -1) {
            int i5 = aVar2.f1845b.get(b2).f1852e;
        }
        if (eVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f1841d = b2;
        eVar2.mo2496c(this.f1838a);
    }
}
