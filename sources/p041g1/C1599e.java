package p041g1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g1.e */
public @interface C1599e {
    /* renamed from: c */
    String mo5751c() default "";

    /* renamed from: f */
    String mo5752f() default "";

    /* renamed from: l */
    int[] mo5753l() default {};

    /* renamed from: m */
    String mo5754m() default "";

    /* renamed from: v */
    int mo5755v() default 1;
}
