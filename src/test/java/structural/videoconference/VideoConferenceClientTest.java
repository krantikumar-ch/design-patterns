package structural.videoconference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoConferenceClientTest {

    @Test
    public void connectOnZoom(){
        String userId = "1234";
        VideoConferenceClient videoConferenceClient = new VideoConferenceClient("zoom");
        String actual = videoConferenceClient.connect(userId);
        String expected = "connected on zoom";
        assertTrue(expected.equals(actual));
    }

    @Test
    public void connectOnGoogleMeeting(){
        String userId = "1234";
        VideoConferenceClient videoConferenceClient = new VideoConferenceClient("google");
        String actual = videoConferenceClient.connect(userId);
        String expected = "connected on google meeting";
        assertTrue(expected.equals(actual));
    }

    @Test
    public void connectOnWebEx(){
        String userId = "1234";
        VideoConferenceClient videoConferenceClient = new VideoConferenceClient("webex");
        String actual = videoConferenceClient.connect(userId);
        String expected = "connected on webex";
        assertTrue(expected.equals(actual));
    }
}