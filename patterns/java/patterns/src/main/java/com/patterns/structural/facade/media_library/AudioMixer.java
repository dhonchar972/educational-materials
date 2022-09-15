package com.patterns.structural.facade.media_library;

import java.io.File;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
