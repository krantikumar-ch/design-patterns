package structural.videoconference.adapters;

import structural.videoconference.apis.GoogleMeetingApi;

public class GoogleMeetingAdapter implements VideoConferenceAdapter{
    private GoogleMeetingApi googleMeetingApi;

    public GoogleMeetingAdapter() {
        this.googleMeetingApi = new GoogleMeetingApi();
    }

    @Override
    public String connect(String userId) {
        googleMeetingApi.connect(Long.parseLong(userId));
        return "connected on google meeting";
    }
}
