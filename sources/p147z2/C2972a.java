package p147z2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.regex.Pattern;

/* renamed from: z2.a */
public class C2972a extends BitmapFactory {

    /* renamed from: a */
    static RenderScript f11293a;

    /* renamed from: b */
    static Object f11294b = new Object();

    /* renamed from: c */
    private static byte[] f11295c = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: d */
    private static final ThreadLocal<Canvas> f11296d = new ThreadLocal<>();

    /* renamed from: e */
    private static final Paint f11297e;

    /* renamed from: f */
    private static final Pattern f11298f = Pattern.compile("[㄀-ㄭㆠ-ㆺ一-鿌㐀-䶵豈-龎⼀-⿕⺀-⻳㇀-㇣ᄀ-ᇿꥠ-ꥼힰ-ퟻㄱ-ㆎ가-힣぀-ゟ゠-ヿㇰ-ㇿ㆐-㆟ꀀ-ꒌ꒐-꓆]");

    /* renamed from: g */
    private static final String[] f11299g = {"老师", "先生", "老板", "仔", "手机", "叔", "阿姨", "宅", "伯", "伯母", "伯父", "哥", "姐", "弟", "妹", "舅", "姑", "父", "主任", "经理", "工作", "同事", "律师", "司机", "师傅", "师父", "爷", "奶", "中介", "董", "总", "太太", "保姆", "某", "秘书", "处长", "局长", "班长", "兄", "助理"};

    /* renamed from: z2.a$a */
    class C2973a extends ContextWrapper {
        C2973a(Context context) {
            super(context);
        }

        public Context getApplicationContext() {
            return this;
        }
    }

    static {
        Paint paint = new Paint(1);
        f11297e = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static Bitmap m12262a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        return Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
    }

    /* renamed from: b */
    public static Bitmap m12263b(Context context, Bitmap bitmap, int i) {
        Bitmap a = m12262a(bitmap);
        m12264c(context, bitmap, a, i);
        return a;
    }

    /* renamed from: c */
    public static Bitmap m12264c(Context context, Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap == null) {
            return null;
        }
        if (!(bitmap2 != null && bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight())) {
            bitmap2 = m12262a(bitmap);
        }
        m12265d(context, bitmap, bitmap2, i);
        return bitmap2;
    }

    /* renamed from: d */
    private static Bitmap m12265d(Context context, Bitmap bitmap, Bitmap bitmap2, int i) {
        int i2 = 1;
        while (i > 25) {
            i2 *= 2;
            i /= 2;
        }
        Bitmap g = i2 == 1 ? bitmap : m12268g(bitmap, Math.max(bitmap.getWidth() / i2, 1), Math.max(bitmap.getHeight() / i2, 1));
        if (context.getApplicationContext() == null) {
            context = new C2973a(context);
        }
        try {
            Object[] enumConstants = context.getClassLoader().loadClass("android.graphics.Bitmap$Config").getEnumConstants();
            int length = enumConstants.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Enum enumR = (Enum) enumConstants[i3];
                if ("RGBA_F16".equals(enumR.name()) && g.getConfig() == enumR) {
                    g = m12270i(g);
                    break;
                }
                i3++;
            }
        } catch (Exception unused) {
        }
        synchronized (f11294b) {
            if (f11293a == null) {
                f11293a = RenderScript.create(context);
            }
            Bitmap bitmap3 = i2 == 1 ? bitmap2 : g;
            if (g.getRowBytes() != bitmap3.getRowBytes()) {
                g = g.copy(Bitmap.Config.ARGB_8888, true);
            }
            Allocation createFromBitmap = Allocation.createFromBitmap(f11293a, g);
            Allocation createTyped = Allocation.createTyped(f11293a, createFromBitmap.getType());
            RenderScript renderScript = f11293a;
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setRadius((float) i);
            create.setInput(createFromBitmap);
            create.forEach(createTyped);
            createTyped.copyTo(bitmap3);
            if (bitmap3 != bitmap2) {
                m12269h(bitmap3, bitmap2);
            }
            if (g != bitmap) {
                g.recycle();
            }
            if (bitmap3 != bitmap2) {
                bitmap3.recycle();
            }
            createFromBitmap.destroy();
            createTyped.destroy();
            create.destroy();
        }
        return bitmap2;
    }

    /* renamed from: e */
    public static Bitmap m12266e(Bitmap bitmap, float f) {
        return m12267f(bitmap, f, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: f */
    public static Bitmap m12267f(Bitmap bitmap, float f, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return createBitmap;
    }

    /* renamed from: g */
    public static Bitmap m12268g(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        m12269h(bitmap, createBitmap);
        return createBitmap;
    }

    /* renamed from: h */
    public static Bitmap m12269h(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        if (bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight()) {
            return bitmap;
        }
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
        return bitmap2;
    }

    /* renamed from: i */
    private static Bitmap m12270i(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFlags(3);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
