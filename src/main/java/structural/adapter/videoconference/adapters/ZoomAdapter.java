package structural.adapter.videoconference.adapters;

import structural.adapter.videoconference.apis.ZoomApi;

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
