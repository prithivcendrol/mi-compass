package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0623f;

/* renamed from: androidx.appcompat.widget.w */
final class C0417w {

    /* renamed from: a */
    private TextView f1526a;

    /* renamed from: b */
    private TextClassifier f1527b;

    /* renamed from: androidx.appcompat.widget.w$a */
    private static final class C0418a {
        /* renamed from: a */
        static TextClassifier m1825a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C0417w(TextView textView) {
        this.f1526a = (TextView) C0623f.m2495f(textView);
    }

    /* renamed from: a */
    public TextClassifier mo2276a() {
        TextClassifier textClassifier = this.f1527b;
        return textClassifier == null ? C0418a.m1825a(this.f1526a) : textClassifier;
    }

    /* renamed from: b */
    public void mo2277b(TextClassifier textClassifier) {
        this.f1527b = textClassifier;
    }
}
