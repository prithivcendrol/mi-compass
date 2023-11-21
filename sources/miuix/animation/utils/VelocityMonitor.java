package miuix.animation.utils;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.LinkedList;

public class VelocityMonitor {
    private static final long MAX_DELTA = 100;
    private static final int MAX_RECORD_COUNT = 10;
    private static final long MIN_DELTA = 30;
    private static final long TIME_THRESHOLD = 50;
    private LinkedList<MoveRecord> mHistory = new LinkedList<>();
    private Long mMaxDeltaTime = Long.valueOf(MAX_DELTA);
    private Long mMinDeltaTime = Long.valueOf(MIN_DELTA);
    private float[] mVelocity;

    private static class MoveRecord {
        long timeStamp;
        double[] values;

        private MoveRecord() {
        }
    }

    private void addAndUpdate(MoveRecord moveRecord) {
        this.mHistory.add(moveRecord);
        if (this.mHistory.size() > 10) {
            this.mHistory.remove(0);
        }
        updateVelocity();
    }

    private float calVelocity(int i, MoveRecord moveRecord, MoveRecord moveRecord2) {
        float f;
        MoveRecord moveRecord3 = moveRecord;
        MoveRecord moveRecord4 = moveRecord2;
        double d = moveRecord3.values[i];
        long j = moveRecord3.timeStamp;
        double velocity = (double) getVelocity(d, moveRecord4.values[i], j - moveRecord4.timeStamp);
        int size = this.mHistory.size() - 2;
        MoveRecord moveRecord5 = null;
        while (true) {
            if (size < 0) {
                f = Float.MAX_VALUE;
                break;
            }
            MoveRecord moveRecord6 = this.mHistory.get(size);
            long j2 = j - moveRecord6.timeStamp;
            if (j2 <= this.mMinDeltaTime.longValue() || j2 >= this.mMaxDeltaTime.longValue()) {
                size--;
                moveRecord5 = moveRecord6;
            } else {
                MoveRecord moveRecord7 = moveRecord6;
                f = getVelocity(d, moveRecord6.values[i], j2);
                double d2 = (double) f;
                if (velocity * d2 > 0.0d) {
                    f = (float) (f > 0.0f ? Math.max(velocity, d2) : Math.min(velocity, d2));
                }
                moveRecord5 = moveRecord7;
            }
        }
        if (f == Float.MAX_VALUE && moveRecord5 != null) {
            long j3 = j - moveRecord5.timeStamp;
            if (j3 > this.mMinDeltaTime.longValue() && j3 < this.mMaxDeltaTime.longValue()) {
                f = getVelocity(d, moveRecord5.values[i], j3);
            }
        }
        if (f == Float.MAX_VALUE) {
            return 0.0f;
        }
        return f;
    }

    private void clearVelocity() {
        float[] fArr = this.mVelocity;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
        }
    }

    private MoveRecord getMoveRecord() {
        MoveRecord moveRecord = new MoveRecord();
        moveRecord.timeStamp = SystemClock.uptimeMillis();
        return moveRecord;
    }

    private float getVelocity(double d, double d2, long j) {
        return (float) (j == 0 ? 0.0d : (d - d2) / ((double) (((float) j) / 1000.0f)));
    }

    private void updateVelocity() {
        int size = this.mHistory.size();
        if (size >= 2) {
            MoveRecord last = this.mHistory.getLast();
            MoveRecord moveRecord = this.mHistory.get(size - 2);
            float[] fArr = this.mVelocity;
            if (fArr == null || fArr.length < last.values.length) {
                this.mVelocity = new float[last.values.length];
            }
            for (int i = 0; i < last.values.length; i++) {
                this.mVelocity[i] = calVelocity(i, last, moveRecord);
            }
            return;
        }
        clearVelocity();
    }

    public void clear() {
        this.mHistory.clear();
        clearVelocity();
    }

    public float getVelocity(int i) {
        float[] fArr;
        long uptimeMillis = SystemClock.uptimeMillis();
        if ((this.mHistory.size() <= 0 || Math.abs(uptimeMillis - this.mHistory.getLast().timeStamp) <= TIME_THRESHOLD) && (fArr = this.mVelocity) != null && fArr.length > i) {
            return fArr[i];
        }
        return 0.0f;
    }

    public void setMaxFeedbackTime(long j) {
        this.mMaxDeltaTime = Long.valueOf(j);
    }

    public void setMinFeedbackTime(long j) {
        this.mMinDeltaTime = Long.valueOf(j);
    }

    public void update(double... dArr) {
        if (dArr != null && dArr.length != 0) {
            MoveRecord moveRecord = getMoveRecord();
            moveRecord.values = dArr;
            addAndUpdate(moveRecord);
        }
    }

    public void update(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            MoveRecord moveRecord = getMoveRecord();
            moveRecord.values = new double[fArr.length];
            for (int i = 0; i < fArr.length; i++) {
                moveRecord.values[i] = (double) fArr[i];
            }
            addAndUpdate(moveRecord);
        }
    }
}
