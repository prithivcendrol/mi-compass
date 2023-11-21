package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.C0072g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0057a();

    /* renamed from: d */
    final int f153d;

    /* renamed from: e */
    final long f154e;

    /* renamed from: f */
    final long f155f;

    /* renamed from: g */
    final float f156g;

    /* renamed from: h */
    final long f157h;

    /* renamed from: i */
    final int f158i;

    /* renamed from: j */
    final CharSequence f159j;

    /* renamed from: k */
    final long f160k;

    /* renamed from: l */
    List<CustomAction> f161l;

    /* renamed from: m */
    final long f162m;

    /* renamed from: n */
    final Bundle f163n;

    /* renamed from: o */
    private Object f164o;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0056a();

        /* renamed from: d */
        private final String f165d;

        /* renamed from: e */
        private final CharSequence f166e;

        /* renamed from: f */
        private final int f167f;

        /* renamed from: g */
        private final Bundle f168g;

        /* renamed from: h */
        private Object f169h;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0056a implements Parcelable.Creator<CustomAction> {
            C0056a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f165d = parcel.readString();
            this.f166e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f167f = parcel.readInt();
            this.f168g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f165d = str;
            this.f166e = charSequence;
            this.f167f = i;
            this.f168g = bundle;
        }

        /* renamed from: a */
        public static CustomAction m133a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0072g.C0073a.m201a(obj), C0072g.C0073a.m204d(obj), C0072g.C0073a.m203c(obj), C0072g.C0073a.m202b(obj));
            customAction.f169h = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f166e + ", mIcon=" + this.f167f + ", mExtras=" + this.f168g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f165d);
            TextUtils.writeToParcel(this.f166e, parcel, i);
            parcel.writeInt(this.f167f);
            parcel.writeBundle(this.f168g);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0057a implements Parcelable.Creator<PlaybackStateCompat> {
        C0057a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f153d = i;
        this.f154e = j;
        this.f155f = j2;
        this.f156g = f;
        this.f157h = j3;
        this.f158i = i2;
        this.f159j = charSequence;
        this.f160k = j4;
        this.f161l = new ArrayList(list);
        this.f162m = j5;
        this.f163n = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f153d = parcel.readInt();
        this.f154e = parcel.readLong();
        this.f156g = parcel.readFloat();
        this.f160k = parcel.readLong();
        this.f155f = parcel.readLong();
        this.f157h = parcel.readLong();
        this.f159j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f161l = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f162m = parcel.readLong();
        this.f163n = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f158i = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m132a(Object obj) {
        Object obj2 = obj;
        ArrayList arrayList = null;
        if (obj2 == null) {
            return null;
        }
        List<Object> d = C0072g.m195d(obj);
        if (d != null) {
            arrayList = new ArrayList(d.size());
            for (Object a : d) {
                arrayList.add(CustomAction.m133a(a));
            }
        }
        Bundle a2 = C0074h.m205a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0072g.m200i(obj), C0072g.m199h(obj), C0072g.m194c(obj), C0072g.m198g(obj), C0072g.m192a(obj), 0, C0072g.m196e(obj), C0072g.m197f(obj), arrayList, C0072g.m193b(obj), a2);
        playbackStateCompat.f164o = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f153d + ", position=" + this.f154e + ", buffered position=" + this.f155f + ", speed=" + this.f156g + ", updated=" + this.f160k + ", actions=" + this.f157h + ", error code=" + this.f158i + ", error message=" + this.f159j + ", custom actions=" + this.f161l + ", active item id=" + this.f162m + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f153d);
        parcel.writeLong(this.f154e);
        parcel.writeFloat(this.f156g);
        parcel.writeLong(this.f160k);
        parcel.writeLong(this.f155f);
        parcel.writeLong(this.f157h);
        TextUtils.writeToParcel(this.f159j, parcel, i);
        parcel.writeTypedList(this.f161l);
        parcel.writeLong(this.f162m);
        parcel.writeBundle(this.f163n);
        parcel.writeInt(this.f158i);
    }
}
