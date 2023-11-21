package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0052a();

        /* renamed from: d */
        private final MediaDescriptionCompat f141d;

        /* renamed from: e */
        private final long f142e;

        /* renamed from: f */
        private Object f143f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0052a implements Parcelable.Creator<QueueItem> {
            C0052a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f141d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f142e = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f141d = mediaDescriptionCompat;
                this.f142e = j;
                this.f143f = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m119a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.m72a(C0071f.m190a(obj)), C0071f.m191b(obj));
            }
            return null;
        }

        /* renamed from: b */
        public static List<QueueItem> m120b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m119a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f141d + ", Id=" + this.f142e + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f141d.writeToParcel(parcel, i);
            parcel.writeLong(this.f142e);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0053a();

        /* renamed from: d */
        ResultReceiver f144d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0053a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0053a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f144d = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f144d.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0054a();

        /* renamed from: d */
        private final Object f145d;

        /* renamed from: e */
        private C0060b f146e;

        /* renamed from: f */
        private Bundle f147f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0054a implements Parcelable.Creator<Token> {
            C0054a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0060b) null, (Bundle) null);
        }

        Token(Object obj, C0060b bVar, Bundle bundle) {
            this.f145d = obj;
            this.f146e = bVar;
            this.f147f = bundle;
        }

        /* renamed from: a */
        public C0060b mo134a() {
            return this.f146e;
        }

        /* renamed from: b */
        public void mo135b(C0060b bVar) {
            this.f146e = bVar;
        }

        /* renamed from: c */
        public void mo136c(Bundle bundle) {
            this.f147f = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f145d;
            Object obj3 = ((Token) obj).f145d;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f145d;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f145d, i);
        }
    }

    /* renamed from: a */
    public static void m118a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
