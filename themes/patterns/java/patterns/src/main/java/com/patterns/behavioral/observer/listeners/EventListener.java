package com.patterns.behavioral.observer.listeners;

import java.io.File;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface EventListener {
    void update(String eventType, File file);
}
