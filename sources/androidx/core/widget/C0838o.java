package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0665c;
import androidx.core.view.C0705g0;

/* renamed from: androidx.core.widget.o */
public final class C0838o implements C0705g0 {

    /* renamed from: androidx.core.widget.o$a */
    private static final class C0839a {
        /* renamed from: a */
        static CharSequence m3353a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: b */
    private static CharSequence m3350b(Context context, ClipData.Item item, int i) {
        return C0839a.m3353a(context, item, i);
    }

    /* renamed from: c */
    private static void m3351c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public C0665c mo2914a(View view, C0665c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        if (cVar.mo2833d() == 2) {
            return cVar;
        }
        ClipData b = cVar.mo2831b();
        int c = cVar.mo2832c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = m3350b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    m3351c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
