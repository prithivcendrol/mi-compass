package miuix.animation.utils;

import miuix.animation.utils.LinkNode;

public class LinkNode<T extends LinkNode> {
    public T next;

    public void addToTail(T t) {
        T t2 = this;
        while (t2 != t) {
            T t3 = t2.next;
            if (t3 == null) {
                t2.next = t;
                return;
            }
            t2 = t3;
        }
    }

    public T destroy() {
        do {
        } while (remove() != null);
        return null;
    }

    public T remove() {
        T t = this.next;
        this.next = null;
        return t;
    }

    public int size() {
        int i = 0;
        LinkNode linkNode = this;
        while (true) {
            linkNode = linkNode.next;
            if (linkNode == null) {
                return i;
            }
            i++;
        }
    }
}
