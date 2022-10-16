package org.java.collections.collection.map;

import java.util.AbstractMap;
import java.util.Set;
// import java.util.EnumMap;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomEnumMap<K extends Enum<K>, V> extends AbstractMap<K, V>
        implements java.io.Serializable, Cloneable {

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

//    @Override
//    public CustomEnumMap<K extends Enum<K>, V> clone() {
//        try {
//            return (CustomEnumMap) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}
