package androidx.media;

import androidx.versionedparcelable.C1265a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1265a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3530a = (AudioAttributesImpl) aVar.mo5032v(audioAttributesCompat.f3530a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1265a aVar) {
        aVar.mo5034x(false, false);
        aVar.mo5013M(audioAttributesCompat.f3530a, 1);
    }
}
