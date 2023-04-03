package structural.calendar.adapters;

import structural.calendar.apis.AppleCalendarApi;

import java.util.Date;

public class AppleCalendarAdapter implements CalendarAdapter {

    private AppleCalendarApi appleCalendarApi;

    public AppleCalendarAdapter(){
        appleCalendarApi = new AppleCalendarApi();
    }

    @Override
    public String scheduleMeeting(Date dateTime) {
        appleCalendarApi.scheduleCalendar(dateTime.toString());
        return "Your meeting "+dateTime+" scheduled in apple calendar";
    }
}
