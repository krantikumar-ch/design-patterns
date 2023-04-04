package structural.adapter.videoconference;

import structural.adapter.videoconference.adapters.VideoConferenceAdapter;

/**
 * Design a Video Conference to connect with user by given id.

 * The video conference api's  would be Google meet, webex and zoom
 * Consider these  are third party api's and would return different output formats
 *
 * once user is connected, use will notify a message
 * "connected on conference api"
 */
public class VideoConferenceClient {
    private VideoConferenceAdapter videoConferenceAdapter;

    public VideoConferenceClient(String type){
        videoConferenceAdapter = VideoConferenceAdapterFactory.getVideoConferenceAdapter(type);
    }

    public String connect(String userId){
        String message = videoConferenceAdapter.connect(userId);
        return message;
    }
}
