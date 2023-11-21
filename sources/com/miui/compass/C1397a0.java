package com.miui.compass;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.miui.compass.a0 */
public class C1397a0 {

    /* renamed from: a */
    private final int f5325a = 1;

    /* renamed from: b */
    private final String f5326b = "http://schemas.android.com/apk/res/android";

    /* renamed from: c */
    private final String f5327c = "drawable";

    /* renamed from: d */
    private final String f5328d = "duration";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5329e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C1399b> f5330f = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f5331g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f5332h = new C1398a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f5333i;

    /* renamed from: j */
    private Context f5334j;

    /* renamed from: com.miui.compass.a0$a */
    class C1398a extends Handler {
        C1398a() {
        }

        public void handleMessage(Message message) {
            if (C1397a0.this.f5329e) {
                C1397a0 a0Var = C1397a0.this;
                int unused = a0Var.f5331g = (a0Var.f5331g + 1) % C1397a0.this.f5330f.size();
                C1399b bVar = (C1399b) C1397a0.this.f5330f.get(C1397a0.this.f5331g);
                C1397a0.this.f5333i.setImageResource(bVar.f5336a);
                C1397a0.this.f5332h.sendEmptyMessageDelayed(1, (long) bVar.f5337b);
            }
        }
    }

    /* renamed from: com.miui.compass.a0$b */
    class C1399b {

        /* renamed from: a */
        int f5336a;

        /* renamed from: b */
        int f5337b;

        C1399b(int i, int i2) {
            this.f5336a = i;
            this.f5337b = i2;
        }
    }

    public C1397a0(Context context) {
        this.f5334j = context;
    }

    /* renamed from: g */
    private void m6239g(int i) {
        String str;
        Resources resources = this.f5334j.getResources();
        XmlResourceParser xml = resources.getXml(i);
        while (true) {
            try {
                int next = xml.next();
                if (next == 1) {
                    xml.close();
                    resources.finishPreloading();
                    return;
                } else if (next == 2) {
                    if (xml.getName().equals("item")) {
                        int attributeIntValue = xml.getAttributeIntValue("http://schemas.android.com/apk/res/android", "duration", 100);
                        this.f5330f.add(new C1399b(xml.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawable", -1), attributeIntValue));
                    }
                }
            } catch (XmlPullParserException e) {
                e = e;
                str = "loadAnimationFrame XmlPullParserException";
                Log.e("Compass:TutorialAnimation", str, e);
                return;
            } catch (IOException e2) {
                e = e2;
                str = "loadAnimationFrame IOException";
                Log.e("Compass:TutorialAnimation", str, e);
                return;
            }
        }
    }

    /* renamed from: h */
    public void mo5344h(ImageView imageView, int i) {
        this.f5333i = imageView;
        this.f5329e = true;
        this.f5330f.clear();
        this.f5331g = 0;
        m6239g(i);
        this.f5332h.sendEmptyMessage(1);
    }

    /* renamed from: i */
    public void mo5345i() {
        this.f5329e = false;
        this.f5330f.clear();
        this.f5332h.removeMessages(1);
    }
}
