package com.patterns.behavioral.iterator.iterators;

import com.patterns.behavioral.iterator.profile.Profile;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
