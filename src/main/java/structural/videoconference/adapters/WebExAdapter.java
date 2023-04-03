package structural.videoconference.adapters;

import structural.videoconference.apis.WebExMeetingApi;

public class WebExAdapter implements VideoConferenceAdapter{

    private WebExMeetingApi webExMeetingApi;

    public WebExAdapter() {
        this.webExMeetingApi = new WebExMeetingApi();
    }

    @Override
    public String connect(String userId) {
        webExMeetingApi.join(userId);
        return "connected on webex";
    }
}
