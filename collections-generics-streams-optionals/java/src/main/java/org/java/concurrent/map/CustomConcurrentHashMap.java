package org.java.concurrent.map;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
// import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CustomConcurrentHashMap<K,V> extends AbstractMap<K,V>
        implements ConcurrentMap<K,V>, Serializable {

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public V replace(K key, V value) {
        return null;
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return false;
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return null;
    }
}
