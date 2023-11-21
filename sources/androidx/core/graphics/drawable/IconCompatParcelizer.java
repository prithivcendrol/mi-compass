package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1265a;

public class IconCompatParcelizer {
    public static IconCompat read(C1265a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2557a = aVar.mo5026p(iconCompat.f2557a, 1);
        iconCompat.f2559c = aVar.mo5020j(iconCompat.f2559c, 2);
        iconCompat.f2560d = aVar.mo5028r(iconCompat.f2560d, 3);
        iconCompat.f2561e = aVar.mo5026p(iconCompat.f2561e, 4);
        iconCompat.f2562f = aVar.mo5026p(iconCompat.f2562f, 5);
        iconCompat.f2563g = (ColorStateList) aVar.mo5028r(iconCompat.f2563g, 6);
        iconCompat.f2565i = aVar.mo5030t(iconCompat.f2565i, 7);
        iconCompat.f2566j = aVar.mo5030t(iconCompat.f2566j, 8);
        iconCompat.mo2614f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1265a aVar) {
        aVar.mo5034x(true, true);
        iconCompat.mo2615g(aVar.mo5016f());
        int i = iconCompat.f2557a;
        if (-1 != i) {
            aVar.mo5006F(i, 1);
        }
        byte[] bArr = iconCompat.f2559c;
        if (bArr != null) {
            aVar.mo5002B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2560d;
        if (parcelable != null) {
            aVar.mo5008H(parcelable, 3);
        }
        int i2 = iconCompat.f2561e;
        if (i2 != 0) {
            aVar.mo5006F(i2, 4);
        }
        int i3 = iconCompat.f2562f;
        if (i3 != 0) {
            aVar.mo5006F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2563g;
        if (colorStateList != null) {
            aVar.mo5008H(colorStateList, 6);
        }
        String str = iconCompat.f2565i;
        if (str != null) {
            aVar.mo5010J(str, 7);
        }
        String str2 = iconCompat.f2566j;
        if (str2 != null) {
            aVar.mo5010J(str2, 8);
        }
    }
}
