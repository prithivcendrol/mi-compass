package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0665c;
import androidx.core.view.C0727l0;

/* renamed from: androidx.appcompat.widget.s */
final class C0386s {

    /* renamed from: androidx.appcompat.widget.s$a */
    private static final class C0387a {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        static boolean m1727a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0727l0.m2868R(textView, new C0665c.C0666a(dragEvent.getClipData(), 3).mo2836a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m1728b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0727l0.m2868R(view, new C0665c.C0666a(dragEvent.getClipData(), 3).mo2836a());
            return true;
        }
    }

    /* renamed from: a */
    static boolean m1724a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C0727l0.m2919x(view) != null) {
            Activity c = m1726c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? C0387a.m1727a(dragEvent, (TextView) view, c) : C0387a.m1728b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    static boolean m1725b(TextView textView, int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C0727l0.m2919x(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0665c.C0666a aVar = new C0665c.C0666a(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C0727l0.m2868R(textView, aVar.mo2838c(i2).mo2836a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m1726c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
