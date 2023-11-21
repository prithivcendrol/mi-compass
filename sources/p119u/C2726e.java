package p119u;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: u.e */
public final class C2726e {

    /* renamed from: a */
    private final C2729c f10517a;

    /* renamed from: u.e$a */
    private static final class C2727a implements C2729c {

        /* renamed from: a */
        final InputContentInfo f10518a;

        C2727a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10518a = new InputContentInfo(uri, clipDescription, uri2);
        }

        C2727a(Object obj) {
            this.f10518a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public ClipDescription mo9967a() {
            return this.f10518a.getDescription();
        }

        /* renamed from: b */
        public Object mo9968b() {
            return this.f10518a;
        }

        /* renamed from: c */
        public Uri mo9969c() {
            return this.f10518a.getContentUri();
        }

        /* renamed from: d */
        public void mo9970d() {
            this.f10518a.requestPermission();
        }

        /* renamed from: e */
        public Uri mo9971e() {
            return this.f10518a.getLinkUri();
        }
    }

    /* renamed from: u.e$b */
    private static final class C2728b implements C2729c {

        /* renamed from: a */
        private final Uri f10519a;

        /* renamed from: b */
        private final ClipDescription f10520b;

        /* renamed from: c */
        private final Uri f10521c;

        C2728b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10519a = uri;
            this.f10520b = clipDescription;
            this.f10521c = uri2;
        }

        /* renamed from: a */
        public ClipDescription mo9967a() {
            return this.f10520b;
        }

        /* renamed from: b */
        public Object mo9968b() {
            return null;
        }

        /* renamed from: c */
        public Uri mo9969c() {
            return this.f10519a;
        }

        /* renamed from: d */
        public void mo9970d() {
        }

        /* renamed from: e */
        public Uri mo9971e() {
            return this.f10521c;
        }
    }

    /* renamed from: u.e$c */
    private interface C2729c {
        /* renamed from: a */
        ClipDescription mo9967a();

        /* renamed from: b */
        Object mo9968b();

        /* renamed from: c */
        Uri mo9969c();

        /* renamed from: d */
        void mo9970d();

        /* renamed from: e */
        Uri mo9971e();
    }

    public C2726e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f10517a = Build.VERSION.SDK_INT >= 25 ? new C2727a(uri, clipDescription, uri2) : new C2728b(uri, clipDescription, uri2);
    }

    private C2726e(C2729c cVar) {
        this.f10517a = cVar;
    }

    /* renamed from: f */
    public static C2726e m11357f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C2726e(new C2727a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo9962a() {
        return this.f10517a.mo9969c();
    }

    /* renamed from: b */
    public ClipDescription mo9963b() {
        return this.f10517a.mo9967a();
    }

    /* renamed from: c */
    public Uri mo9964c() {
        return this.f10517a.mo9971e();
    }

    /* renamed from: d */
    public void mo9965d() {
        this.f10517a.mo9970d();
    }

    /* renamed from: e */
    public Object mo9966e() {
        return this.f10517a.mo9968b();
    }
}
