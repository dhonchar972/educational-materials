package com.patterns.structural.proxy.media_library;

import java.util.HashMap;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
