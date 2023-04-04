package structural.adapter.calendar.apis;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GoogleCalendarApi {

    public Map<String, String> scheduleCalendar(Date scheduleDate){
        Map<String, String> output = new HashMap<>();
        output.put("SUCCESS", "scheduled");
        return output;
    }
}
