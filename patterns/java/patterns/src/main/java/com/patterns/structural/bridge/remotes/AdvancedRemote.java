package com.patterns.structural.bridge.remotes;

import com.patterns.structural.bridge.devices.Device;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
