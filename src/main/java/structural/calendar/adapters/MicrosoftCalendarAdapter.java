package structural.calendar.adapters;

import structural.calendar.apis.MicrosoftCalendarApi;

import java.util.Date;
import java.util.HashMap;

public class MicrosoftCalendarAdapter implements CalendarAdapter {

    private MicrosoftCalendarApi microsoftCalendarApi;

    public MicrosoftCalendarAdapter(){
        microsoftCalendarApi = new MicrosoftCalendarApi();
    }


    @Override
    public String scheduleMeeting(Date dateTime) {
        microsoftCalendarApi.scheduleCalendar(new HashMap<>());
        return "Your meeting "+dateTime+" scheduled in microsoft calendar";
    }
}
