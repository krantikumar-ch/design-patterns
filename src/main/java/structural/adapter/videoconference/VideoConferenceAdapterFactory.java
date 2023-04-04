package structural.adapter.videoconference;

import structural.adapter.videoconference.adapters.GoogleMeetingAdapter;
import structural.adapter.videoconference.adapters.VideoConferenceAdapter;
import structural.adapter.videoconference.adapters.WebExAdapter;
import structural.adapter.videoconference.adapters.ZoomAdapter;

public class VideoConferenceAdapterFactory {

    public static VideoConferenceAdapter getVideoConferenceAdapter(String type){
        if("google".equalsIgnoreCase(type))
            return new GoogleMeetingAdapter();

        if("webex".equalsIgnoreCase(type))
            return new WebExAdapter();

        return new ZoomAdapter();
    }
}
