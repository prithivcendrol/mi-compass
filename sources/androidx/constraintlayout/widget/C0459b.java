package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0459b {

    /* renamed from: a */
    private boolean f1811a;

    /* renamed from: b */
    String f1812b;

    /* renamed from: c */
    private C0461b f1813c;

    /* renamed from: d */
    private int f1814d;

    /* renamed from: e */
    private float f1815e;

    /* renamed from: f */
    private String f1816f;

    /* renamed from: g */
    boolean f1817g;

    /* renamed from: h */
    private int f1818h;

    /* renamed from: androidx.constraintlayout.widget.b$a */
    static /* synthetic */ class C0460a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1819a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.b$b[] r0 = androidx.constraintlayout.widget.C0459b.C0461b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1819a = r0
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1819a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0459b.C0461b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0459b.C0460a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public enum C0461b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0459b(C0459b bVar, Object obj) {
        this.f1811a = false;
        this.f1812b = bVar.f1812b;
        this.f1813c = bVar.f1813c;
        mo2473f(obj);
    }

    public C0459b(String str, C0461b bVar, Object obj, boolean z) {
        this.f1812b = str;
        this.f1813c = bVar;
        this.f1811a = z;
        mo2473f(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0459b> m1970a(HashMap<String, C0459b> hashMap, View view) {
        C0459b bVar;
        HashMap<String, C0459b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0459b bVar2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    bVar = new C0459b(bVar2, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    bVar = new C0459b(bVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, bVar);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: d */
    public static void m1971d(Context context, XmlPullParser xmlPullParser, HashMap<String, C0459b> hashMap) {
        C0461b bVar;
        int resourceId;
        Object string;
        C0461b bVar2;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0478j.f2436y4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0461b bVar3 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0478j.f2445z4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0478j.f2084J4) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == C0478j.f2009A4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = C0461b.BOOLEAN_TYPE;
            } else {
                if (index == C0478j.f2027C4) {
                    bVar = C0461b.COLOR_TYPE;
                } else if (index == C0478j.f2018B4) {
                    bVar = C0461b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0478j.f2060G4) {
                        bVar2 = C0461b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0478j.f2036D4) {
                        bVar2 = C0461b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0478j.f2044E4) {
                        bVar2 = C0461b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == C0478j.f2052F4) {
                            bVar = C0461b.INT_TYPE;
                            resourceId = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == C0478j.f2076I4) {
                            bVar = C0461b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            Object obj2 = string;
                            bVar3 = bVar;
                            obj = obj2;
                        } else if (index == C0478j.f2068H4) {
                            bVar = C0461b.REFERENCE_TYPE;
                            resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj22 = string;
                        bVar3 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    bVar3 = bVar;
                    obj = obj222;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj2222 = string;
                bVar3 = bVar;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0459b(str, bVar3, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public static void m1972e(View view, HashMap<String, C0459b> hashMap) {
        String str;
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0459b bVar = hashMap.get(next);
            if (!bVar.f1811a) {
                str = "set" + next;
            } else {
                str = next;
            }
            try {
                switch (C0460a.f1819a[bVar.f1813c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f1814d)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(bVar.f1817g)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{bVar.f1816f});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f1818h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f1818h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f1814d)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f1815e)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f1815e)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public String mo2471b() {
        return this.f1812b;
    }

    /* renamed from: c */
    public C0461b mo2472c() {
        return this.f1813c;
    }

    /* renamed from: f */
    public void mo2473f(Object obj) {
        switch (C0460a.f1819a[this.f1813c.ordinal()]) {
            case 1:
            case 6:
                this.f1814d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f1817g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f1816f = (String) obj;
                return;
            case 4:
            case 5:
                this.f1818h = ((Integer) obj).intValue();
                return;
            case 7:
            case 8:
                this.f1815e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
