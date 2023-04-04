package structural.adapter.calendar.apis;

import java.util.Collections;

import java.util.List;

public class AppleCalendarApi {

    public List<String> scheduleCalendar(String scheduleDate){
        return Collections.singletonList("ADDED");
    }
}
