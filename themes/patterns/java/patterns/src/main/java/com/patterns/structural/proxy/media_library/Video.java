package com.patterns.structural.proxy.media_library;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
