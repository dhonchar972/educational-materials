package org.java.collection.queue;

import java.util.AbstractQueue;
import java.util.Iterator;
// import java.util.PriorityQueue;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomPriorityQueue<E> extends AbstractQueue<E> implements java.io.Serializable {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
