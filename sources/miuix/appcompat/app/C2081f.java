package miuix.appcompat.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: miuix.appcompat.app.f */
interface C2081f {
    /* renamed from: a */
    void mo7435a();

    /* renamed from: b */
    void mo7436b();

    /* renamed from: c */
    void mo7437c(Bundle bundle);

    /* renamed from: d */
    void mo7438d(Bundle bundle);

    /* renamed from: e */
    void mo7439e(Bundle bundle);

    void onConfigurationChanged(Configuration configuration);

    boolean onCreatePanelMenu(int i, Menu menu);

    View onCreatePanelView(int i);

    boolean onMenuItemSelected(int i, MenuItem menuItem);

    void onPanelClosed(int i, Menu menu);

    boolean onPreparePanel(int i, View view, Menu menu);
}
