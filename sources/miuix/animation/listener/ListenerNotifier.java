package miuix.animation.listener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.ObjectPool;

public class ListenerNotifier {
    static final BeginNotifier sBegin = new BeginNotifier();
    static final CancelNotifier sCancelAll = new CancelNotifier();
    static final EndNotifier sEndAll = new EndNotifier();
    static final MassUpdateNotifier sMassUpdate = new MassUpdateNotifier();
    static final PropertyBeginNotifier sPropertyBegin = new PropertyBeginNotifier();
    static final PropertyEndNotifier sPropertyEnd = new PropertyEndNotifier();
    static final UpdateNotifier sUpdate = new UpdateNotifier();
    final Map<Object, List<TransitionListener>> mListenerMap = new ConcurrentHashMap();
    final IAnimTarget mTarget;

    static class BeginNotifier implements INotifier {
        BeginNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            transitionListener.onBegin(obj);
        }
    }

    static class CancelNotifier implements INotifier {
        CancelNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            transitionListener.onCancel(obj);
        }
    }

    static class EndNotifier implements INotifier {
        EndNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            transitionListener.onComplete(obj);
        }
    }

    interface INotifier {
        void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo);
    }

    static class MassUpdateNotifier implements INotifier {
        static final List<UpdateInfo> sEmptyList = new ArrayList();

        MassUpdateNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            transitionListener.onUpdate(obj, sEmptyList);
        }
    }

    static class PropertyBeginNotifier implements INotifier {
        PropertyBeginNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            transitionListener.onBegin(obj, collection);
        }
    }

    static class PropertyEndNotifier implements INotifier {
        PropertyEndNotifier() {
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            for (UpdateInfo next : collection) {
                if (next.isCompleted && next.animInfo.justEnd) {
                    next.animInfo.justEnd = false;
                    if (next.animInfo.f7488op == 3) {
                        transitionListener.onComplete(obj, next);
                    } else {
                        transitionListener.onCancel(obj, next);
                    }
                }
            }
        }
    }

    static class UpdateNotifier implements INotifier {
        UpdateNotifier() {
        }

        private void notifySingleProperty(Object obj, TransitionListener transitionListener, UpdateInfo updateInfo) {
            transitionListener.onUpdate(obj, updateInfo.property, updateInfo.getFloatValue(), updateInfo.isCompleted);
            if (updateInfo.useInt) {
                transitionListener.onUpdate(obj, (IIntValueProperty) updateInfo.property, updateInfo.getIntValue(), (float) updateInfo.velocity, updateInfo.isCompleted);
                return;
            }
            transitionListener.onUpdate(obj, updateInfo.property, updateInfo.getFloatValue(), (float) updateInfo.velocity, updateInfo.isCompleted);
        }

        public void doNotify(Object obj, TransitionListener transitionListener, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
            if (collection != null && collection.size() <= 4000) {
                for (UpdateInfo notifySingleProperty : collection) {
                    notifySingleProperty(obj, transitionListener, notifySingleProperty);
                }
            }
            transitionListener.onUpdate(obj, collection);
        }
    }

    public ListenerNotifier(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
    }

    private List<TransitionListener> getListenerSet(Object obj) {
        List<TransitionListener> list = this.mListenerMap.get(obj);
        if (list != null) {
            return list;
        }
        List<TransitionListener> list2 = (List) ObjectPool.acquire(ArrayList.class, new Object[0]);
        this.mListenerMap.put(obj, list2);
        return list2;
    }

    private void notify(Object obj, Object obj2, INotifier iNotifier, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
        List list = this.mListenerMap.get(obj);
        if (list != null && !list.isEmpty()) {
            notifyListenerSet(obj2, list, iNotifier, collection, updateInfo);
        }
    }

    private static void notifyListenerSet(Object obj, List<TransitionListener> list, INotifier iNotifier, Collection<UpdateInfo> collection, UpdateInfo updateInfo) {
        Set<TransitionListener> set = (Set) ObjectPool.acquire(HashSet.class, new Object[0]);
        set.addAll(list);
        for (TransitionListener doNotify : set) {
            iNotifier.doNotify(obj, doNotify, collection, updateInfo);
        }
        ObjectPool.release(set);
    }

    public boolean addListeners(Object obj, AnimConfig animConfig) {
        if (animConfig.listeners.isEmpty()) {
            return false;
        }
        CommonUtils.addTo(animConfig.listeners, getListenerSet(obj));
        return true;
    }

    public void notifyBegin(Object obj, Object obj2) {
        notify(obj, obj2, sBegin, (Collection<UpdateInfo>) null, (UpdateInfo) null);
    }

    public void notifyCancelAll(Object obj, Object obj2) {
        notify(obj, obj2, sCancelAll, (Collection<UpdateInfo>) null, (UpdateInfo) null);
    }

    public void notifyEndAll(Object obj, Object obj2) {
        notify(obj, obj2, sEndAll, (Collection<UpdateInfo>) null, (UpdateInfo) null);
    }

    public void notifyMassUpdate(Object obj, Object obj2) {
        notify(obj, obj2, sMassUpdate, (Collection<UpdateInfo>) null, (UpdateInfo) null);
    }

    public void notifyPropertyBegin(Object obj, Object obj2, Collection<UpdateInfo> collection) {
        notify(obj, obj2, sPropertyBegin, collection, (UpdateInfo) null);
    }

    public void notifyPropertyEnd(Object obj, Object obj2, Collection<UpdateInfo> collection) {
        notify(obj, obj2, sPropertyEnd, collection, (UpdateInfo) null);
    }

    public void notifyUpdate(Object obj, Object obj2, Collection<UpdateInfo> collection) {
        notify(obj, obj2, sUpdate, collection, (UpdateInfo) null);
    }

    public void removeListeners() {
        ObjectPool.release(this.mListenerMap.values());
        this.mListenerMap.clear();
    }

    public void removeListeners(Object obj) {
        ObjectPool.release(this.mListenerMap.remove(obj));
    }
}
