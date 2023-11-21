package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1265a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1265a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3531a = (AudioAttributes) aVar.mo5028r(audioAttributesImplApi21.f3531a, 1);
        audioAttributesImplApi21.f3532b = aVar.mo5026p(audioAttributesImplApi21.f3532b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1265a aVar) {
        aVar.mo5034x(false, false);
        aVar.mo5008H(audioAttributesImplApi21.f3531a, 1);
        aVar.mo5006F(audioAttributesImplApi21.f3532b, 2);
    }
}
