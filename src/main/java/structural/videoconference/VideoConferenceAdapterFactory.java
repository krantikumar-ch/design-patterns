package structural.videoconference;

import structural.videoconference.adapters.GoogleMeetingAdapter;
import structural.videoconference.adapters.VideoConferenceAdapter;
import structural.videoconference.adapters.WebExAdapter;
import structural.videoconference.adapters.ZoomAdapter;

public class VideoConferenceAdapterFactory {

    public static VideoConferenceAdapter getVideoConferenceAdapter(String type){
        if("google".equalsIgnoreCase(type))
            return new GoogleMeetingAdapter();

        if("webex".equalsIgnoreCase(type))
            return new WebExAdapter();

        return new ZoomAdapter();
    }
}
