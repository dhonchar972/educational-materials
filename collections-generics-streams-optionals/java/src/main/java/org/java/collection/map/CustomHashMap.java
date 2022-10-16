package org.java.collection.map;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
// import java.util.HashMap;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 *
 * HashMap implements the Map interface, which stores data as key-value pairs.
 * HashMap is not synchronized and thread safe.
 * HashMap allows storing null keys and values, but does not allow duplicate keys.
 * In a single threaded environment, much faster than Hashtable.
 * Better use ConcurrentHashMap to work in multithreaded environment.
 */
public class CustomHashMap<K,V>
        extends AbstractMap<K,V> // implements Map<K,V>
        implements Map<K,V>, Cloneable, Serializable {

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
