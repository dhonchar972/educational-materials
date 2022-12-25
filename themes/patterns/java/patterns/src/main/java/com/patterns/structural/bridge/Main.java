package com.patterns.structural.bridge;

import com.patterns.structural.bridge.devices.Device;
import com.patterns.structural.bridge.devices.Radio;
import com.patterns.structural.bridge.devices.Tv;
import com.patterns.structural.bridge.remotes.AdvancedRemote;
import com.patterns.structural.bridge.remotes.BasicRemote;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
