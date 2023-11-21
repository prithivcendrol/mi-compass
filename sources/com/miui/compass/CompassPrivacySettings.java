package com.miui.compass;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import java.util.Locale;
import miuix.appcompat.app.C2118q;
import p123u3.C2842i;

public class CompassPrivacySettings extends C2118q {

    /* renamed from: com.miui.compass.CompassPrivacySettings$a */
    public static class C1387a extends C2842i implements Preference.C1095d, Preference.C1096e {
        /* renamed from: E2 */
        private void m6142E2() {
            mo3243R1(new Intent(mo3306t(), CompassPermDesc.class));
        }

        /* renamed from: F2 */
        private void m6143F2() {
            String language = Locale.getDefault().getLanguage();
            String country = Locale.getDefault().getCountry();
            mo3243R1(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://privacy.mi.com/all/%1$s", new Object[]{language + "_" + country}))));
        }

        /* renamed from: B0 */
        public void mo3200B0(Bundle bundle) {
            super.mo3200B0(bundle);
        }

        /* renamed from: P0 */
        public boolean mo3237P0(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.mo3237P0(menuItem);
            }
            mo3306t().finish();
            return true;
        }

        /* renamed from: W0 */
        public void mo3255W0() {
            super.mo3255W0();
        }

        /* renamed from: a */
        public boolean mo3991a(Preference preference, Object obj) {
            return true;
        }

        /* renamed from: a1 */
        public void mo3263a1(View view, Bundle bundle) {
            super.mo3263a1(view, bundle);
            try {
                ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0).setPadding(0, (int) mo3262a0().getDimension(2131165973), 0, 0);
            } catch (Exception e) {
                Log.d("CompassPrivacySettingsFragment", "settings setPadding error : " + e.getMessage());
            }
        }

        /* renamed from: c2 */
        public void mo4069c2(Bundle bundle, String str) {
            mo4061U1(2132017153);
            mo3226L1(true);
            mo3871h("key_privacy_policy").mo3972u0(this);
            mo3871h("key_permission_description").mo3972u0(this);
            if (!C1396a.m6226f(mo3199B())) {
                mo4065Y1().mo4004P0(mo3871h("key_permission_description"));
            }
        }

        /* renamed from: d */
        public boolean mo3992d(Preference preference) {
            if ("key_privacy_policy".equals(preference.mo3960p())) {
                m6143F2();
                return true;
            } else if (!"key_permission_description".equals(preference.mo3960p())) {
                return false;
            } else {
                m6142E2();
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo3605g0().mo3378h0(16908290) == null) {
            mo3605g0().mo3392o().mo3563o(16908290, new C1387a()).mo3429g();
        }
    }
}
