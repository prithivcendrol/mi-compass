package androidx.media;

import androidx.versionedparcelable.C1265a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1265a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3533a = aVar.mo5026p(audioAttributesImplBase.f3533a, 1);
        audioAttributesImplBase.f3534b = aVar.mo5026p(audioAttributesImplBase.f3534b, 2);
        audioAttributesImplBase.f3535c = aVar.mo5026p(audioAttributesImplBase.f3535c, 3);
        audioAttributesImplBase.f3536d = aVar.mo5026p(audioAttributesImplBase.f3536d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1265a aVar) {
        aVar.mo5034x(false, false);
        aVar.mo5006F(audioAttributesImplBase.f3533a, 1);
        aVar.mo5006F(audioAttributesImplBase.f3534b, 2);
        aVar.mo5006F(audioAttributesImplBase.f3535c, 3);
        aVar.mo5006F(audioAttributesImplBase.f3536d, 4);
    }
}
