package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0510a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p021d.C1447a;
import p021d.C1452f;
import p124v.C2863c;

/* renamed from: androidx.appcompat.widget.a1 */
class C0293a1 extends C2863c implements View.OnClickListener {

    /* renamed from: A */
    private int f1181A = -1;

    /* renamed from: B */
    private int f1182B = -1;

    /* renamed from: o */
    private final SearchView f1183o;

    /* renamed from: p */
    private final SearchableInfo f1184p;

    /* renamed from: q */
    private final Context f1185q;

    /* renamed from: r */
    private final WeakHashMap<String, Drawable.ConstantState> f1186r;

    /* renamed from: s */
    private final int f1187s;

    /* renamed from: t */
    private boolean f1188t = false;

    /* renamed from: u */
    private int f1189u = 1;

    /* renamed from: v */
    private ColorStateList f1190v;

    /* renamed from: w */
    private int f1191w = -1;

    /* renamed from: x */
    private int f1192x = -1;

    /* renamed from: y */
    private int f1193y = -1;

    /* renamed from: z */
    private int f1194z = -1;

    /* renamed from: androidx.appcompat.widget.a1$a */
    private static final class C0294a {

        /* renamed from: a */
        public final TextView f1195a;

        /* renamed from: b */
        public final TextView f1196b;

        /* renamed from: c */
        public final ImageView f1197c;

        /* renamed from: d */
        public final ImageView f1198d;

        /* renamed from: e */
        public final ImageView f1199e;

        public C0294a(View view) {
            this.f1195a = (TextView) view.findViewById(16908308);
            this.f1196b = (TextView) view.findViewById(16908309);
            this.f1197c = (ImageView) view.findViewById(16908295);
            this.f1198d = (ImageView) view.findViewById(16908296);
            this.f1199e = (ImageView) view.findViewById(C1452f.f5802q);
        }
    }

    public C0293a1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1183o = searchView;
        this.f1184p = searchableInfo;
        this.f1187s = searchView.getSuggestionCommitIconResId();
        this.f1185q = context;
        this.f1186r = weakHashMap;
    }

    /* renamed from: A */
    private void m1315A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: j */
    private Drawable m1316j(String str) {
        Drawable.ConstantState constantState = this.f1186r.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    private CharSequence m1317k(CharSequence charSequence) {
        if (this.f1190v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1185q.getTheme().resolveAttribute(C1447a.f5672L, typedValue, true);
            this.f1190v = this.f1185q.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1190v, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    private Drawable m1318l(ComponentName componentName) {
        String obj;
        PackageManager packageManager = this.f1185q.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", obj);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            obj = e.toString();
        }
    }

    /* renamed from: m */
    private Drawable m1319m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1186r.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1186r.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1185q.getResources());
        }
        Drawable l = m1318l(componentName);
        if (l != null) {
            constantState = l.getConstantState();
        }
        this.f1186r.put(flattenToShortString, constantState);
        return l;
    }

    /* renamed from: n */
    public static String m1320n(Cursor cursor, String str) {
        return m1326v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: o */
    private Drawable m1321o() {
        Drawable m = m1319m(this.f1184p.getSearchActivity());
        return m != null ? m : this.f1185q.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1322p(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1756q(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1185q     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0293a1.m1322p(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: r */
    private Drawable m1323r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1185q.getPackageName() + "/" + parseInt;
            Drawable j = m1316j(str2);
            if (j != null) {
                return j;
            }
            Drawable e = C0510a.m2124e(this.f1185q, parseInt);
            m1329z(str2, e);
            return e;
        } catch (NumberFormatException unused) {
            Drawable j2 = m1316j(str);
            if (j2 != null) {
                return j2;
            }
            Drawable p = m1322p(Uri.parse(str));
            m1329z(str, p);
            return p;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: s */
    private Drawable m1324s(Cursor cursor) {
        int i = this.f1194z;
        if (i == -1) {
            return null;
        }
        Drawable r = m1323r(cursor.getString(i));
        return r != null ? r : m1321o();
    }

    /* renamed from: t */
    private Drawable m1325t(Cursor cursor) {
        int i = this.f1181A;
        if (i == -1) {
            return null;
        }
        return m1323r(cursor.getString(i));
    }

    /* renamed from: v */
    private static String m1326v(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: x */
    private void m1327x(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    private void m1328y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: z */
    private void m1329z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1186r.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    public void mo1745a(Cursor cursor) {
        if (this.f1188t) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1745a(cursor);
            if (cursor != null) {
                this.f1191w = cursor.getColumnIndex("suggest_text_1");
                this.f1192x = cursor.getColumnIndex("suggest_text_2");
                this.f1193y = cursor.getColumnIndex("suggest_text_2_url");
                this.f1194z = cursor.getColumnIndex("suggest_icon_1");
                this.f1181A = cursor.getColumnIndex("suggest_icon_2");
                this.f1182B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public Cursor mo1746c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1183o.getVisibility() == 0 && this.f1183o.getWindowVisibility() == 0) {
            try {
                Cursor u = mo1757u(this.f1184p, charSequence2, 50);
                if (u != null) {
                    u.getCount();
                    return u;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public CharSequence convertToString(Cursor cursor) {
        String n;
        String n2;
        if (cursor == null) {
            return null;
        }
        String n3 = m1320n(cursor, "suggest_intent_query");
        if (n3 != null) {
            return n3;
        }
        if (this.f1184p.shouldRewriteQueryFromData() && (n2 = m1320n(cursor, "suggest_intent_data")) != null) {
            return n2;
        }
        if (!this.f1184p.shouldRewriteQueryFromText() || (n = m1320n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n;
    }

    /* renamed from: d */
    public void mo1748d(View view, Context context, Cursor cursor) {
        C0294a aVar = (C0294a) view.getTag();
        int i = this.f1182B;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1195a != null) {
            m1328y(aVar.f1195a, m1326v(cursor, this.f1191w));
        }
        if (aVar.f1196b != null) {
            String v = m1326v(cursor, this.f1193y);
            CharSequence k = v != null ? m1317k(v) : m1326v(cursor, this.f1192x);
            if (TextUtils.isEmpty(k)) {
                TextView textView = aVar.f1195a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1195a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1195a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1195a.setMaxLines(1);
                }
            }
            m1328y(aVar.f1196b, k);
        }
        ImageView imageView = aVar.f1197c;
        if (imageView != null) {
            m1327x(imageView, m1324s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1198d;
        if (imageView2 != null) {
            m1327x(imageView2, m1325t(cursor), 8);
        }
        int i3 = this.f1189u;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1199e.setVisibility(0);
            aVar.f1199e.setTag(aVar.f1195a.getText());
            aVar.f1199e.setOnClickListener(this);
            return;
        }
        aVar.f1199e.setVisibility(8);
    }

    /* renamed from: g */
    public View mo1749g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g = super.mo1749g(context, cursor, viewGroup);
        g.setTag(new C0294a(g));
        ((ImageView) g.findViewById(C1452f.f5802q)).setImageResource(this.f1187s);
        return g;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View f = mo10132f(this.f1185q, mo10130b(), viewGroup);
            if (f != null) {
                ((C0294a) f.getTag()).f1195a.setText(e.toString());
            }
            return f;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo1749g(this.f1185q, mo10130b(), viewGroup);
            if (g != null) {
                ((C0294a) g.getTag()).f1195a.setText(e.toString());
            }
            return g;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1315A(mo10130b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1315A(mo10130b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1183o.mo1471Q((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Drawable mo1756q(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1185q.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Cursor mo1757u(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1185q.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: w */
    public void mo1758w(int i) {
        this.f1189u = i;
    }
}
