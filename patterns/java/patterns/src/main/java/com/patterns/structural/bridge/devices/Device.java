package com.patterns.structural.bridge.devices;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
