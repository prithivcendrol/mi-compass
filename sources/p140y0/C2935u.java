package p140y0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: y0.u */
public class C2935u {

    /* renamed from: y0.u$a */
    public interface C2936a {
        /* renamed from: a */
        boolean mo10229a(Object obj);
    }

    /* renamed from: a */
    private static JSONArray m12169a(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (m12176h(next)) {
                jSONArray.put(next);
            } else if (next instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                boolean z = false;
                for (Map.Entry entry : ((Map) next).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && m12176h(value)) {
                        jSONObject.put((String) key, value);
                        z = true;
                    }
                }
                if (z) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m12170b(Map<String, Object> map, C2936a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        try {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (!aVar.mo10229a(value)) {
                    if (C2933s.f11129a) {
                        m12173e("ParamUtil", (String) next.getKey());
                    }
                } else if (m12176h(value)) {
                    jSONObject.put(str, value);
                } else if (value instanceof List) {
                    jSONObject.put(str, m12169a((List) value));
                }
            }
        } catch (Exception e) {
            C2933s.m12144f("ParamUtil", "checkParam error:" + e.toString());
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m12171c(Map<String, Object> map, boolean z) {
        return m12170b(map, new C2937v(z));
    }

    /* renamed from: d */
    public static JSONObject m12172d(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null && jSONObject2 != null) {
            return jSONObject2;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return jSONObject;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
            return jSONObject2;
        } catch (Exception e) {
            C2933s.m12144f("ParamUtil", "merge error：" + e.toString());
            return jSONObject;
        }
    }

    /* renamed from: e */
    public static void m12173e(String str, String str2) {
        C2933s.m12144f(str, "key is " + str2 + ", the param value is invalid，please change the parameter type to string ,numeric, boolean！");
    }

    /* renamed from: f */
    public static boolean m12174f(Object obj) {
        return m12176h(obj) || (obj instanceof List);
    }

    /* renamed from: g */
    public static boolean m12175g(String str) {
        if (!m12177i(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return !lowerCase.startsWith("onetrack_") && !lowerCase.startsWith("ot_");
    }

    /* renamed from: h */
    public static boolean m12176h(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String);
    }

    /* renamed from: i */
    private static boolean m12177i(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (i == 0 && Character.isDigit(c)) {
                return false;
            }
            if (c != '_' && !Character.isDigit(c) && ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))) {
                return false;
            }
        }
        return true;
    }
}
