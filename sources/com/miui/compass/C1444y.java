package com.miui.compass;

/* renamed from: com.miui.compass.y */
public class C1444y {

    /* renamed from: a */
    private static float f5654a = 1.0E-4f;

    /* renamed from: a */
    public static void m6428a(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = f * f;
        float f6 = f * f2;
        float f7 = f * f3;
        float f8 = f * f4;
        float f9 = f2 * f2;
        float f10 = f2 * f3;
        float f11 = f2 * f4;
        float f12 = f3 * f3;
        float f13 = f3 * f4;
        fArr[0] = 1.0f - ((f9 + f12) * 2.0f);
        fArr[1] = (f6 - f13) * 2.0f;
        fArr[2] = (f7 + f11) * 2.0f;
        fArr[3] = (f6 + f13) * 2.0f;
        fArr[4] = 1.0f - ((f12 + f5) * 2.0f);
        fArr[5] = (f10 - f8) * 2.0f;
        fArr[6] = (f7 - f11) * 2.0f;
        fArr[7] = (f10 + f8) * 2.0f;
        fArr[8] = 1.0f - ((f5 + f9) * 2.0f);
    }

    /* renamed from: b */
    public static void m6429b(float[] fArr, float[] fArr2) {
        float[] fArr3 = {fArr2[0], fArr2[3], fArr2[6]};
        float[] fArr4 = {fArr2[1], fArr2[4], fArr2[7]};
        float[] fArr5 = {fArr2[2], fArr2[5], fArr2[8]};
        float f = fArr3[0];
        float f2 = fArr3[1];
        float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        float abs = Math.abs(fArr5[2]);
        float f3 = f5654a;
        int i = -1;
        if (abs < f3) {
            fArr5[2] = f3 * ((float) (fArr5[2] < 0.0f ? -1 : 1));
        }
        float abs2 = Math.abs(fArr3[0]);
        float f4 = f5654a;
        if (abs2 < f4) {
            fArr3[0] = f4 * ((float) (fArr3[0] < 0.0f ? -1 : 1));
        }
        float abs3 = Math.abs(sqrt);
        float f5 = f5654a;
        if (abs3 < f5) {
            if (sqrt >= 0.0f) {
                i = 1;
            }
            sqrt = ((float) i) * f5;
        }
        float atan2 = (float) (Math.atan2((double) fArr3[1], (double) fArr3[0]) * 57.295780181884766d);
        fArr[0] = atan2;
        fArr[0] = 360.0f - (atan2 % 360.0f);
        fArr[1] = (float) (Math.atan2((double) fArr4[2], (double) fArr5[2]) * -57.295780181884766d);
        fArr[2] = (float) (Math.atan2((double) fArr3[2], (double) sqrt) * 57.295780181884766d);
    }
}
