package structural.adapter.videoconference.apis;

import java.util.Collections;
import java.util.List;

public class ZoomApi {

    public List<String> participate(String userId){
        return Collections.singletonList("ADDED");
    }
}
