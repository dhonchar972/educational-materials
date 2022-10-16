package org.java.concurrent.set;

// import java.util.concurrent.CopyOnWriteArraySet;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomCopyOnWriteArraySet<E> extends AbstractSet<E>
        implements java.io.Serializable {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
