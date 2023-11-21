package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C0595e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import miuix.animation.internal.AnimTask;
import org.xmlpull.v1.XmlPullParser;
import p104r.C2589c;

/* renamed from: androidx.core.content.res.d */
public class C0521d {

    /* renamed from: androidx.core.content.res.d$a */
    static class C0522a {
        /* renamed from: a */
        static int m2183a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.d$b */
    public interface C0523b {
    }

    /* renamed from: androidx.core.content.res.d$c */
    public static final class C0524c implements C0523b {

        /* renamed from: a */
        private final C0525d[] f2509a;

        public C0524c(C0525d[] dVarArr) {
            this.f2509a = dVarArr;
        }

        /* renamed from: a */
        public C0525d[] mo2577a() {
            return this.f2509a;
        }
    }

    /* renamed from: androidx.core.content.res.d$d */
    public static final class C0525d {

        /* renamed from: a */
        private final String f2510a;

        /* renamed from: b */
        private final int f2511b;

        /* renamed from: c */
        private final boolean f2512c;

        /* renamed from: d */
        private final String f2513d;

        /* renamed from: e */
        private final int f2514e;

        /* renamed from: f */
        private final int f2515f;

        public C0525d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2510a = str;
            this.f2511b = i;
            this.f2512c = z;
            this.f2513d = str2;
            this.f2514e = i2;
            this.f2515f = i3;
        }

        /* renamed from: a */
        public String mo2578a() {
            return this.f2510a;
        }

        /* renamed from: b */
        public int mo2579b() {
            return this.f2515f;
        }

        /* renamed from: c */
        public int mo2580c() {
            return this.f2514e;
        }

        /* renamed from: d */
        public String mo2581d() {
            return this.f2513d;
        }

        /* renamed from: e */
        public int mo2582e() {
            return this.f2511b;
        }

        /* renamed from: f */
        public boolean mo2583f() {
            return this.f2512c;
        }
    }

    /* renamed from: androidx.core.content.res.d$e */
    public static final class C0526e implements C0523b {

        /* renamed from: a */
        private final C0595e f2516a;

        /* renamed from: b */
        private final int f2517b;

        /* renamed from: c */
        private final int f2518c;

        /* renamed from: d */
        private final String f2519d;

        public C0526e(C0595e eVar, int i, int i2, String str) {
            this.f2516a = eVar;
            this.f2518c = i;
            this.f2517b = i2;
            this.f2519d = str;
        }

        /* renamed from: a */
        public int mo2584a() {
            return this.f2518c;
        }

        /* renamed from: b */
        public C0595e mo2585b() {
            return this.f2516a;
        }

        /* renamed from: c */
        public String mo2586c() {
            return this.f2519d;
        }

        /* renamed from: d */
        public int mo2587d() {
            return this.f2517b;
        }
    }

    /* renamed from: a */
    private static int m2175a(TypedArray typedArray, int i) {
        return C0522a.m2183a(typedArray, i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.res.C0521d.C0523b m2176b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.d$b r3 = m2178d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0521d.m2176b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.d$b");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m2177c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2175a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2182h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2182h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0523b m2178d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2179e(xmlPullParser, resources);
        }
        m2181g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0523b m2179e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2589c.f10186h);
        String string = obtainAttributes.getString(C2589c.f10187i);
        String string2 = obtainAttributes.getString(C2589c.f10191m);
        String string3 = obtainAttributes.getString(C2589c.f10192n);
        int resourceId = obtainAttributes.getResourceId(C2589c.f10188j, 0);
        int integer = obtainAttributes.getInteger(C2589c.f10189k, 1);
        int integer2 = obtainAttributes.getInteger(C2589c.f10190l, AnimTask.MAX_TO_PAGE_SIZE);
        String string4 = obtainAttributes.getString(C2589c.f10193o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2180f(xmlPullParser, resources));
                    } else {
                        m2181g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0524c((C0525d[]) arrayList.toArray(new C0525d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m2181g(xmlPullParser);
        }
        return new C0526e(new C0595e(string, string2, string3, m2177c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0525d m2180f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2589c.f10194p);
        int i = C2589c.f10203y;
        if (!obtainAttributes.hasValue(i)) {
            i = C2589c.f10196r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C2589c.f10201w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C2589c.f10197s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C2589c.f10204z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C2589c.f10198t;
        }
        int i5 = C2589c.f10202x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C2589c.f10199u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C2589c.f10200v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C2589c.f10195q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2181g(xmlPullParser);
        }
        return new C0525d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m2181g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m2182h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
