package structural.videoconference.adapters;

import structural.videoconference.apis.ZoomApi;

public class ZoomAdapter implements VideoConferenceAdapter{
    private ZoomApi zoomApi;

    public ZoomAdapter(){
        zoomApi = new ZoomApi();
    }

    @Override
    public String connect(String userId) {
        zoomApi.participate(userId);
        return "connected on zoom";
    }
}
