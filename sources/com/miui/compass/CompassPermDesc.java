package com.miui.compass;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0510a;
import androidx.fragment.app.C0964j;
import androidx.preference.Preference;
import miuix.appcompat.app.C2118q;
import miuix.preference.TextPreference;
import p123u3.C2842i;

public class CompassPermDesc extends C2118q {

    /* renamed from: C */
    private C1386a f5163C;

    /* renamed from: com.miui.compass.CompassPermDesc$a */
    public static class C1386a extends C2842i implements Preference.C1095d, Preference.C1096e {

        /* renamed from: E0 */
        private Handler f5164E0 = new Handler();

        /* renamed from: F0 */
        private TextPreference f5165F0;

        /* renamed from: G0 */
        private TextPreference f5166G0;

        /* access modifiers changed from: private */
        /* renamed from: F2 */
        public void m6129F2(String str) {
            String str2;
            if (!C1396a.m6223c(mo3199B())) {
                str2 = "permissionStatusController: getMeta return false，skip getPermissionStatus";
            } else {
                int d = C1396a.m6224d(mo3199B(), str);
                if (!(d == -1 || d == 0)) {
                    if (d == 1) {
                        Log.d("CompassPermDesc", "permissionStatusController: controller to request permission");
                        mo5262I2(str);
                        return;
                    } else if (d != 2) {
                        str2 = "permissionStatusController: get permission status occurred error!";
                    }
                }
                C1396a.m6231k(mo3306t());
                Log.d("CompassPermDesc", "permissionStatusController: controller to permission manager");
                return;
            }
            Log.d("CompassPermDesc", str2);
            C1396a.m6231k(mo3306t());
        }

        /* renamed from: J2 */
        private void m6130J2(TextPreference textPreference, String str) {
            textPreference.mo9048J0(C0510a.m2120a(mo3199B(), str) != 0 ? 2131820887 : 2131820574);
        }

        /* renamed from: B0 */
        public void mo3200B0(Bundle bundle) {
            super.mo3200B0(bundle);
            Log.d("CompassPermDesc", "onCreate");
        }

        /* renamed from: G2 */
        public void mo5260G2(String str) {
            m6129F2(str);
        }

        /* renamed from: H2 */
        public void mo5261H2() {
            if (C1396a.m6223c(mo3199B())) {
                mo5263K2(this.f5165F0, "android.permission.ACCESS_FINE_LOCATION");
                mo5263K2(this.f5166G0, "android.permission.CAMERA");
                return;
            }
            m6130J2(this.f5165F0, "android.permission.ACCESS_FINE_LOCATION");
            m6130J2(this.f5166G0, "android.permission.CAMERA");
        }

        /* renamed from: I2 */
        public void mo5262I2(String str) {
            C0964j t = mo3306t();
            str.hashCode();
            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                C1396a.m6227g(t);
            } else if (!str.equals("android.permission.CAMERA")) {
                Log.d("CompassPermDesc", "requestPermission: no permission need to request");
            } else {
                C1396a.m6228h(t, false);
            }
        }

        /* renamed from: K2 */
        public void mo5263K2(TextPreference textPreference, String str) {
            int i;
            int d = C1396a.m6224d(mo3199B(), str);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d != 2) {
                            Log.d("CompassPermDesc", "setPermTextView： get permission status occurred error!");
                            m6130J2(textPreference, str);
                            return;
                        }
                    }
                }
                i = 2131820574;
                textPreference.mo9048J0(i);
            }
            i = 2131820887;
            textPreference.mo9048J0(i);
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
            mo5261H2();
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
                Log.d("CompassPermDesc", "onViewCreated： settings setPadding error : " + e.getMessage());
            }
        }

        /* renamed from: c2 */
        public void mo4069c2(Bundle bundle, String str) {
            mo4076k2(2132017152, str);
            mo3226L1(true);
            this.f5165F0 = (TextPreference) mo3871h("key_location");
            this.f5166G0 = (TextPreference) mo3871h("key_camera");
            this.f5165F0.mo3972u0(this);
            this.f5166G0.mo3972u0(this);
            Log.d("CompassPermDesc", "onCreatePreferences");
        }

        /* renamed from: d */
        public boolean mo3992d(Preference preference) {
            String str;
            String p = preference.mo3960p();
            p.hashCode();
            if (p.equals("key_location")) {
                str = "android.permission.ACCESS_FINE_LOCATION";
            } else if (!p.equals("key_camera")) {
                return false;
            } else {
                str = "android.permission.CAMERA";
            }
            mo5260G2(str);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        C1386a aVar;
        super.onActivityResult(i, i2, intent);
        if (i == 2 || i == 3 || i == 4) {
            Log.i("Compass:CompassPermDesc", " resultCode = " + i2);
            if (i2 == -3) {
                C1396a.m6229i(this, 2);
            } else if (i2 == 666 || i2 == 0) {
                C1445z.m6432c(false);
                C1421i.m6359k(this, false);
                C1421i.m6358j(this, true);
            } else if (i2 != 1) {
                Log.d("Compass:CompassPermDesc", "onActivityResult: unknown resultCode");
            } else {
                C1445z.m6432c(true);
                C1421i.m6359k(this, true);
                C1421i.m6358j(this, true);
                if (i == 3) {
                    aVar = this.f5163C;
                    str = "android.permission.ACCESS_FINE_LOCATION";
                } else if (i == 4) {
                    aVar = this.f5163C;
                    str = "android.permission.CAMERA";
                } else {
                    return;
                }
                aVar.m6129F2(str);
            }
        } else if (C1428o.m6371a(i, i2)) {
            Log.i("Compass:CompassPermDesc", "korean activity resultCode = " + i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1386a aVar = (C1386a) mo3605g0().mo3378h0(16908290);
        this.f5163C = aVar;
        if (aVar == null) {
            this.f5163C = new C1386a();
            mo3605g0().mo3392o().mo3563o(16908290, this.f5163C).mo3429g();
        }
        Log.d("Compass:CompassPermDesc", "onCreate: " + bundle);
    }
}
