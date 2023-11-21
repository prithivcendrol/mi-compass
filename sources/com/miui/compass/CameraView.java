package com.miui.compass;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miuix.appcompat.app.C2112p;

public class CameraView extends SurfaceView implements SurfaceHolder.Callback {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Camera f5038d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SurfaceHolder f5039e;

    /* renamed from: f */
    private C2112p f5040f;

    /* renamed from: g */
    private Executor f5041g;

    /* renamed from: com.miui.compass.CameraView$a */
    class C1363a extends AsyncTask<Void, Void, Boolean> {
        C1363a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            boolean z = false;
            if (CameraView.this.f5038d == null) {
                try {
                    Camera unused = CameraView.this.f5038d = Camera.open();
                    CameraView.this.setCameraDisplayOrientation(((Activity) CameraView.this.getContext()).getWindowManager().getDefaultDisplay().getRotation());
                    CameraView.this.f5039e.addCallback(CameraView.this);
                    Log.i("Compass:CameraView", "open camera success");
                    try {
                        CameraView.this.f5038d.setPreviewDisplay(CameraView.this.f5039e);
                        CameraView cameraView = CameraView.this;
                        cameraView.m6018n(cameraView.getWidth(), CameraView.this.getHeight());
                    } catch (IOException e) {
                        Log.e("Compass:CameraView", "set preview display failed.", e);
                    }
                } catch (Exception e2) {
                    Log.e("Compass:CameraView", "Could not open camera", e2);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            CameraView.this.requestLayout();
            if (!bool.booleanValue()) {
                CameraView.this.mo5210m(true);
            }
        }
    }

    /* renamed from: com.miui.compass.CameraView$b */
    class C1364b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ int f5043a;

        /* renamed from: b */
        final /* synthetic */ int f5044b;

        C1364b(int i, int i2) {
            this.f5043a = i;
            this.f5044b = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (CameraView.this.f5038d == null) {
                return null;
            }
            CameraView.this.f5038d.stopPreview();
            CameraView.this.m6017k(this.f5043a, this.f5044b);
            try {
                CameraView.this.f5038d.startPreview();
                Log.i("Compass:CameraView", "startPreview");
                return null;
            } catch (Exception e) {
                Log.e("Compass:CameraView", "fail to start preview", e);
                return null;
            }
        }
    }

    /* renamed from: com.miui.compass.CameraView$c */
    class C1365c extends AsyncTask<Void, Void, Void> {
        C1365c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (CameraView.this.f5038d != null) {
                CameraView.this.f5039e.removeCallback(CameraView.this);
                CameraView.this.f5038d.stopPreview();
                CameraView.this.f5038d.release();
                Camera unused = CameraView.this.f5038d = null;
                Log.i("Compass:CameraView", "stopPreview");
            }
            return null;
        }
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5041g = Executors.newSingleThreadExecutor();
        SurfaceHolder holder = getHolder();
        this.f5039e = holder;
        holder.addCallback(this);
        this.f5039e.setType(3);
    }

    /* renamed from: g */
    private boolean m6014g(int i, int i2) {
        return i <= 30000 && i2 >= 30000;
    }

    /* renamed from: i */
    private int[] m6015i(List<int[]> list) {
        String str;
        if (list == null || list.isEmpty()) {
            str = "No supported frame rates returned!";
        } else {
            int i = 400000;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            for (int[] next : list) {
                int i5 = next[0];
                int i6 = next[1];
                if (m6014g(i5, i6) && (i5 < i || (i5 == i && i6 > i3))) {
                    i2 = i4;
                    i3 = i6;
                    i = i5;
                }
                i4++;
            }
            if (i2 >= 0) {
                return list.get(i2);
            }
            str = "Can't find an appropriate frame rate range!";
        }
        Log.e("Compass:CameraView", str);
        return null;
    }

    /* renamed from: j */
    private Camera.Size m6016j(List<Camera.Size> list, int i, int i2) {
        int i3;
        double d;
        int i4 = i;
        int i5 = i2;
        Camera.Size size = null;
        if (!(i5 == 0 || list == null)) {
            double d2 = ((double) i4) / ((double) i5);
            double d3 = Double.MAX_VALUE;
            for (Camera.Size next : list) {
                if ((i4 <= i5 || next.width <= next.height) && (i4 >= i5 || next.width >= next.height)) {
                    d = (double) next.height;
                    i3 = next.width;
                } else {
                    d = (double) next.width;
                    i3 = next.height;
                }
                double d4 = d2 - (d / ((double) i3));
                double abs = Math.abs(d4);
                if (size != null) {
                    double d5 = d3 - abs;
                    if (d5 <= 1.0E-6d) {
                        if (abs - d3 < 1.0E-6d && d5 < 1.0E-6d) {
                            if (size.width >= next.width && size.height >= next.height) {
                            }
                            size = next;
                        }
                    }
                }
                d3 = Math.abs(d4);
                size = next;
            }
        }
        return size;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m6017k(int i, int i2) {
        int[] i3;
        try {
            Camera.Parameters parameters = this.f5038d.getParameters();
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() > 1 && (i3 = m6015i(supportedPreviewFpsRange)) != null && i3.length > 1) {
                parameters.setPreviewFpsRange(i3[0], i3[1]);
                Log.v("Compass:CameraView", "minFpsRange:" + i3[0] + ", maxFpsRange:" + i3[1]);
            }
            Camera.Size j = m6016j(this.f5038d.getParameters().getSupportedPreviewSizes(), i, i2);
            if (j != null) {
                parameters.setPreviewSize(j.width, j.height);
                Log.i("Compass:CameraView", "set parameter preview size width:" + j.width + ",height:" + j.height);
            }
            parameters.setFocusMode("continuous-picture");
            parameters.setAntibanding("50hz");
            this.f5038d.setParameters(parameters);
        } catch (Exception e) {
            Log.e("Compass:CameraView", "init parameters of camera failed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m6018n(int i, int i2) {
        new C1364b(i, i2).executeOnExecutor(this.f5041g, new Void[0]);
    }

    /* renamed from: o */
    private void m6019o() {
        mo5210m(false);
        new C1365c().executeOnExecutor(this.f5041g, new Void[0]);
    }

    /* access modifiers changed from: private */
    public void setCameraDisplayOrientation(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        if (i != 0) {
            if (i == 1) {
                i2 = 90;
            } else if (i == 2) {
                i2 = 180;
            } else if (i == 3) {
                i2 = 270;
            }
        }
        int i3 = ((cameraInfo.orientation - i2) + 360) % 360;
        Log.i("Compass:CameraView", "set camera display orientation:" + i3);
        this.f5038d.setDisplayOrientation(i3);
    }

    /* renamed from: h */
    public void mo5208h() {
        m6019o();
    }

    /* renamed from: l */
    public void mo5209l() {
        new C1363a().executeOnExecutor(this.f5041g, new Void[0]);
    }

    /* renamed from: m */
    public void mo5210m(boolean z) {
        if (!z) {
            C2112p pVar = this.f5040f;
            if (pVar != null && pVar.isShowing()) {
                this.f5040f.dismiss();
            }
            this.f5040f = null;
        } else if (isAttachedToWindow()) {
            C2112p pVar2 = this.f5040f;
            if (pVar2 == null || !pVar2.isShowing()) {
                C2112p.C2114b bVar = new C2112p.C2114b(getContext());
                bVar.mo7552q(2131820710);
                bVar.mo7541f(2131820709);
                bVar.mo7548m(17039370, (DialogInterface.OnClickListener) null);
                C2112p a = bVar.mo7536a();
                this.f5040f = a;
                a.show();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.i("Compass:CameraView", "surfaceChanged width:" + i2 + ",height:" + i3);
        if (this.f5038d != null) {
            m6018n(i2, i3);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.i("Compass:CameraView", "surfaceCreated");
        try {
            Camera camera = this.f5038d;
            if (camera != null) {
                camera.setPreviewDisplay(surfaceHolder);
            }
        } catch (IOException e) {
            Log.e("Compass:CameraView", "IOException caused by setPreviewDisplay()", e);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.i("Compass:CameraView", "surfaceDestroyed");
        if (this.f5038d != null) {
            m6019o();
        }
    }
}
