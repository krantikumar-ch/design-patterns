package structural.adapter.calendar.adapters;

import structural.adapter.calendar.apis.GoogleCalendarApi;

import java.util.Date;

public class GoogleCalendarAdapter implements CalendarAdapter {
    private GoogleCalendarApi googleCalendarApi;
    public GoogleCalendarAdapter(){
        googleCalendarApi = new GoogleCalendarApi();
    }

    @Override
    public String scheduleMeeting(Date dateTime) {
        googleCalendarApi.scheduleCalendar(dateTime);
        return "Your meeting "+dateTime+" scheduled in google calendar";
    }
}
