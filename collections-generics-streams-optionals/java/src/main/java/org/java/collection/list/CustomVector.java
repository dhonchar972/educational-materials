package org.java.collection.list;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
// import java.util.Vector;


/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomVector<E>
        extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public CustomVector<E> clone() {
        try {
            return (CustomVector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
