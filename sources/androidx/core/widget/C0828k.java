package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C0614c;
import androidx.core.util.C0623f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.k */
public final class C0828k {

    /* renamed from: androidx.core.widget.k$a */
    static class C0829a {
        /* renamed from: a */
        static boolean m3317a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m3318b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m3319c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    static class C0830b {
        /* renamed from: a */
        static Drawable[] m3320a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m3321b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m3322c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m3323d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m3324e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m3325f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m3326g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m3327h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.k$c */
    static class C0831c {
        /* renamed from: a */
        static int m3328a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m3329b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m3330c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m3331d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m3332e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m3333f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m3334g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m3335h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.k$d */
    static class C0832d {
        /* renamed from: a */
        static DecimalFormatSymbols m3336a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.k$e */
    static class C0833e {
        /* renamed from: a */
        static String[] m3337a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m3338b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m3339c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.k$f */
    private static class C0834f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2888a;

        /* renamed from: b */
        private final TextView f2889b;

        /* renamed from: c */
        private Class<?> f2890c;

        /* renamed from: d */
        private Method f2891d;

        /* renamed from: e */
        private boolean f2892e;

        /* renamed from: f */
        private boolean f2893f = false;

        C0834f(ActionMode.Callback callback, TextView textView) {
            this.f2888a = callback;
            this.f2889b = textView;
        }

        /* renamed from: a */
        private Intent m3340a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m3341b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m3340a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3343e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m3342c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m3340a(), 0)) {
                if (m3344f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m3343e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        private boolean m3344f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        private void m3345g(Menu menu) {
            Method method;
            Context context = this.f2889b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2893f) {
                this.f2893f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2890c = cls;
                    this.f2891d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2892e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2890c = null;
                    this.f2891d = null;
                    this.f2892e = false;
                }
            }
            try {
                if (!this.f2892e || !this.f2890c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2891d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = m3342c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3341b(resolveInfo, this.f2889b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public ActionMode.Callback mo3067d() {
            return this.f2888a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2888a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2888a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2888a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3345g(menu);
            return this.f2888a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m3302a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m3303b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    private static int m3304c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m3305d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C0830b.m3321b(textView) == 1) {
                z = true;
            }
            switch (C0830b.m3322c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C0833e.m3337a(C0832d.m3336a(C0830b.m3323d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: e */
    public static C0614c.C0615a m3306e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0614c.C0615a(C0833e.m3338b(textView));
        }
        C0614c.C0615a.C0616a aVar = new C0614c.C0615a.C0616a(new TextPaint(textView.getPaint()));
        aVar.mo2705b(C0831c.m3328a(textView));
        aVar.mo2706c(C0831c.m3331d(textView));
        aVar.mo2707d(m3305d(textView));
        return aVar.mo2704a();
    }

    /* renamed from: f */
    public static void m3307f(TextView textView, ColorStateList colorStateList) {
        C0623f.m2495f(textView);
        C0831c.m3333f(textView, colorStateList);
    }

    /* renamed from: g */
    public static void m3308g(TextView textView, PorterDuff.Mode mode) {
        C0623f.m2495f(textView);
        C0831c.m3334g(textView, mode);
    }

    /* renamed from: h */
    public static void m3309h(TextView textView, int i) {
        C0623f.m2492c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C0833e.m3339c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C0829a.m3317a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m3310i(TextView textView, int i) {
        C0623f.m2492c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C0829a.m3317a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: j */
    public static void m3311j(TextView textView, int i) {
        C0623f.m2492c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: k */
    public static void m3312k(TextView textView, C0614c cVar) {
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= 29) {
            spanned = cVar.mo2684b();
        } else {
            boolean a = m3306e(textView).mo2696a(cVar.mo2683a());
            spanned = cVar;
            if (!a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(spanned);
    }

    /* renamed from: l */
    public static void m3313l(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: m */
    public static void m3314m(TextView textView, C0614c.C0615a aVar) {
        C0830b.m3327h(textView, m3304c(aVar.mo2699d()));
        textView.getPaint().set(aVar.mo2700e());
        C0831c.m3332e(textView, aVar.mo2697b());
        C0831c.m3335h(textView, aVar.mo2698c());
    }

    /* renamed from: n */
    public static ActionMode.Callback m3315n(ActionMode.Callback callback) {
        return (!(callback instanceof C0834f) || Build.VERSION.SDK_INT < 26) ? callback : ((C0834f) callback).mo3067d();
    }

    /* renamed from: o */
    public static ActionMode.Callback m3316o(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0834f) || callback == null) ? callback : new C0834f(callback, textView);
    }
}
