package org.java.collections.collection.set;

import java.util.*;
// import java.util.HashSet;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomHashSet<E>
        extends AbstractSet<E> // extends AbstractCollection<E> implements Set<E>, both implements Collection<E>
        implements Set<E>, Cloneable, java.io.Serializable {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public CustomHashSet<E> clone() {
        try {
            return (CustomHashSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
