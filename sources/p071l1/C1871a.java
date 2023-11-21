package p071l1;

import p083n1.C2416b;
import p083n1.C2422g;
import p106r1.C2615b;

/* renamed from: l1.a */
public final class C1871a {
    /* renamed from: a */
    public static final <T> Class<T> m7787a(C2615b<T> bVar) {
        C2422g.m10285e(bVar, "<this>");
        Class<?> a = ((C2416b) bVar).mo9320a();
        C2422g.m10283c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a;
    }

    /* renamed from: b */
    public static final <T> Class<T> m7788b(C2615b<T> bVar) {
        C2422g.m10285e(bVar, "<this>");
        Class a = ((C2416b) bVar).mo9320a();
        if (!a.isPrimitive()) {
            C2422g.m10283c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    a = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    a = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    a = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    a = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    a = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    a = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    a = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    a = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    a = Short.class;
                    break;
                }
                break;
        }
        C2422g.m10283c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a;
    }
}
