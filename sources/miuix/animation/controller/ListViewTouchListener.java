package miuix.animation.controller;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import java.util.Map;
import java.util.WeakHashMap;

public class ListViewTouchListener implements View.OnTouchListener {
    private float mDownX = Float.MAX_VALUE;
    private float mDownY = Float.MAX_VALUE;
    private WeakHashMap<View, View.OnTouchListener> mListeners = new WeakHashMap<>();
    private Rect mRect = new Rect();
    private int mTouchSlop;

    ListViewTouchListener(AbsListView absListView) {
        this.mTouchSlop = ViewConfiguration.get(absListView.getContext()).getScaledTouchSlop();
    }

    private View getTouchedItemView(AbsListView absListView, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int childCount = absListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = absListView.getChildAt(i);
            childAt.getLocalVisibleRect(this.mRect);
            this.mRect.offset(childAt.getLeft(), childAt.getTop());
            if (this.mRect.contains(x, y)) {
                return childAt;
            }
        }
        return null;
    }

    private void notifyItemListeners(AbsListView absListView, MotionEvent motionEvent, boolean z) {
        View touchedItemView = getTouchedItemView(absListView, motionEvent);
        for (Map.Entry next : this.mListeners.entrySet()) {
            View view = (View) next.getKey();
            ((View.OnTouchListener) next.getValue()).onTouch(view, !z && view == touchedItemView ? motionEvent : null);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
        } else if (actionMasked != 2) {
            this.mDownY = Float.MAX_VALUE;
            this.mDownX = Float.MAX_VALUE;
        } else if (motionEvent.getRawY() - this.mDownY > ((float) this.mTouchSlop) || motionEvent.getRawX() - this.mDownX > ((float) this.mTouchSlop)) {
            z = true;
            notifyItemListeners((AbsListView) view, motionEvent, z);
            return false;
        }
        z = false;
        notifyItemListeners((AbsListView) view, motionEvent, z);
        return false;
    }

    public void putListener(View view, View.OnTouchListener onTouchListener) {
        this.mListeners.put(view, onTouchListener);
    }
}
