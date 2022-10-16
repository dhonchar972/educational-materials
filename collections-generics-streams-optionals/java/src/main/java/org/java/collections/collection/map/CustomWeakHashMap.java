package org.java.collections.collection.map;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
// import java.util.WeakHashMap;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomWeakHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V> {

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
