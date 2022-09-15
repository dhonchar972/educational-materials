package com.patterns.behavioral.iterator.social_networks;

import com.patterns.behavioral.iterator.iterators.ProfileIterator;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
