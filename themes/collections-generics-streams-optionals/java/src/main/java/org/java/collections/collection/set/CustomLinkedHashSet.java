package org.java.collections.collection.set;

import java.util.HashSet;
import java.util.Set;
// import java.util.LinkedHashSet;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomLinkedHashSet<E>
        extends HashSet<E>
        implements Set<E>, Cloneable, java.io.Serializable {

    @Override
    public CustomLinkedHashSet<E> clone() {
        return (CustomLinkedHashSet) super.clone();
    }
}
