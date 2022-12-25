package com.patterns.structural.facade;

import com.patterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
